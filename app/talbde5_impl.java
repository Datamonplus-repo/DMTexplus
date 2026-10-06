package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class talbde5_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action32") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A45AlbRef = httpContext.GetPar( "AlbRef") ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_32_T17( Gx_mode, A396EmprCod, A44AlbRecCod, A45AlbRef) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action33") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A45AlbRef = httpContext.GetPar( "AlbRef") ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_33_T17( A396EmprCod, A252CliCod, A45AlbRef) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action50") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A2154AlbRecAnh = (short)(GXutil.lval( httpContext.GetPar( "AlbRecAnh"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_50_T1299( A396EmprCod, A44AlbRecCod, A2154AlbRecAnh) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action51") == 0 )
      {
         A56AlbRUni = httpContext.GetPar( "AlbRUni") ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A2157AlbRecMtr = CommonUtil.decimalVal( httpContext.GetPar( "AlbRecMtr"), ".") ;
         A2155AlbRecKgm = CommonUtil.decimalVal( httpContext.GetPar( "AlbRecKgm"), ".") ;
         AV55FlagArt = (byte)(GXutil.lval( httpContext.GetPar( "FlagArt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55FlagArt", GXutil.str( AV55FlagArt, 1, 0));
         A2159AlbRecPie = httpContext.GetPar( "AlbRecPie") ;
         AV56CalMKT = (byte)(GXutil.lval( httpContext.GetPar( "CalMKT"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56CalMKT", GXutil.str( AV56CalMKT, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_51_T1299( A56AlbRUni, A2157AlbRecMtr, A2155AlbRecKgm, AV55FlagArt, A2159AlbRecPie, AV56CalMKT) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action52") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A2159AlbRecPie = httpContext.GetPar( "AlbRecPie") ;
         AV59SumPza = (byte)(GXutil.lval( httpContext.GetPar( "SumPza"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59SumPza", GXutil.str( AV59SumPza, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_52_T1299( A396EmprCod, A44AlbRecCod, A2159AlbRecPie, AV59SumPza) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel30"+"_"+"ALBDETPIEU") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A56AlbRUni = httpContext.GetPar( "AlbRUni") ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx30asaalbdetpieuT17( A396EmprCod, A44AlbRecCod, A56AlbRUni) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel35"+"_"+"ALBDETPIEU") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A56AlbRUni = httpContext.GetPar( "AlbRUni") ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx35asaalbdetpieuT1299( A396EmprCod, A44AlbRecCod, A56AlbRUni) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_56") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A840TrnCod = (short)(GXutil.lval( httpContext.GetPar( "TrnCod"))) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_56( A396EmprCod, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_57") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A970ProceCod = (short)(GXutil.lval( httpContext.GetPar( "ProceCod"))) ;
         n970ProceCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_57( A396EmprCod, A970ProceCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_58") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1211TipEntCod = (short)(GXutil.lval( httpContext.GetPar( "TipEntCod"))) ;
         n1211TipEntCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_58( A396EmprCod, A1211TipEntCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
      {
         gxnrgrid1_newrow_invoke( ) ;
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
         A396EmprCod = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
            n44AlbRecCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            AV57AlbRef = httpContext.GetPar( "AlbRef") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57AlbRef", AV57AlbRef);
            AV46Unidades = httpContext.GetPar( "Unidades") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46Unidades", AV46Unidades);
            AV47vDisLoc = httpContext.GetPar( "vDisLoc") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47vDisLoc", AV47vDisLoc);
            AV65DisCliNum = httpContext.GetPar( "DisCliNum") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65DisCliNum", AV65DisCliNum);
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ALTA ALBARANES PIEZA (Mts./Kg)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtAlbRef_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgrid1_newrow_invoke( )
   {
      nRC_GXsfl_205 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_205"))) ;
      nGXsfl_205_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_205_idx"))) ;
      sGXsfl_205_idx = httpContext.GetPar( "sGXsfl_205_idx") ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      A2147AlbDetKgmD = CommonUtil.decimalVal( httpContext.GetPar( "AlbDetKgmD"), ".") ;
      A2150AlbDetMtrD = CommonUtil.decimalVal( httpContext.GetPar( "AlbDetMtrD"), ".") ;
      A47AlbREst = (byte)(GXutil.lval( httpContext.GetPar( "AlbREst"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      A2146AlbDetKgm = CommonUtil.decimalVal( httpContext.GetPar( "AlbDetKgm"), ".") ;
      A2148AlbDetKgmU = CommonUtil.decimalVal( httpContext.GetPar( "AlbDetKgmU"), ".") ;
      A2149AlbDetMtr = CommonUtil.decimalVal( httpContext.GetPar( "AlbDetMtr"), ".") ;
      A2151AlbDetMtrU = CommonUtil.decimalVal( httpContext.GetPar( "AlbDetMtrU"), ".") ;
      A2152AlbDetPie = (short)(GXutil.lval( httpContext.GetPar( "AlbDetPie"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
      n44AlbRecCod = false ;
      A56AlbRUni = httpContext.GetPar( "AlbRUni") ;
      A2153AlbDetPieU = (short)(GXutil.lval( httpContext.GetPar( "AlbDetPieU"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public talbde5_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public talbde5_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( talbde5_impl.class ));
   }

   public talbde5_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbRUni = new HTMLChoice();
      cmbAlbRReo = new HTMLChoice();
      cmbAlbREst = new HTMLChoice();
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
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      }
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
      }
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDE5.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDE5.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDE5.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDE5.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TALBDE5.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "N Recepcion ID", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRecCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecCod_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRecCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDE5.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Referencia", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRef_Internalname, GXutil.rtrim( A45AlbRef), GXutil.rtrim( localUtil.format( A45AlbRef, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRef_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRef_Enabled, 1, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTrnCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "", "", "", "", "", 1, edtTrnCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre Transportista", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnNom_Internalname, GXutil.rtrim( A841TrnNom), GXutil.rtrim( localUtil.format( A841TrnNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTrnNom_Jsonclick, 0, "", "", "", "", "", 1, edtTrnNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Albaran Entrega", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbREnt_Internalname, GXutil.rtrim( A46AlbREnt), GXutil.rtrim( localUtil.format( A46AlbREnt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbREnt_Jsonclick, 0, "", "", "", "", "", 1, edtAlbREnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Piezas Entregadas", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieEnt_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRPieEnt_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Unidad Medida", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRUni, cmbAlbRUni.getInternalname(), GXutil.rtrim( A56AlbRUni), 1, cmbAlbRUni.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRUni.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "", true, (byte)(0), "HLP_TALBDE5.htm");
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Localizacion", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRLoc_Internalname, GXutil.rtrim( A50AlbRLoc), GXutil.rtrim( localUtil.format( A50AlbRLoc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRLoc_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRLoc_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Fecha Entrada", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtAlbRFen_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRFen_Internalname, localUtil.format(A49AlbRFen, "99/99/99"), localUtil.format( A49AlbRFen, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRFen_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRFen_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDE5.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbRFen_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbRFen_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALBDE5.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Unidades Entrada", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniEnt_Enabled!=0) ? localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99") : localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniEnt_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRUniEnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Reoperado", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRReo, cmbAlbRReo.getInternalname(), GXutil.rtrim( A55AlbRReo), 1, cmbAlbRReo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRReo.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,91);\"", "", true, (byte)(0), "HLP_TALBDE5.htm");
      cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Piezas Utilizadas", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieUti_Internalname, GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieUti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieUti_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRPieUti_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Piezas Rebajadas", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieReb_Internalname, GXutil.ltrim( localUtil.ntoc( A53AlbRPieReb, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieReb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A53AlbRPieReb), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A53AlbRPieReb), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieReb_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRPieReb_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Unidades Utilizadas", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniUti_Internalname, GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniUti_Enabled!=0) ? localUtil.format( A60AlbRUniUti, "ZZZZZ9.99") : localUtil.format( A60AlbRUniUti, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniUti_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRUniUti_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Unidades Rebajadas", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniReb_Internalname, GXutil.ltrim( localUtil.ntoc( A59AlbRUniReb, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniReb_Enabled!=0) ? localUtil.format( A59AlbRUniReb, "ZZZZZ9.99") : localUtil.format( A59AlbRUniReb, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniReb_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRUniReb_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Piezas Disponibles", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieDis_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRPieDis_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Unidades Disponibles", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniDis_Enabled!=0) ? localUtil.format( A57AlbRUniDis, "ZZZZZ9.99") : localUtil.format( A57AlbRUniDis, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniDis_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRUniDis_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "Fecha Ultima Utilizacion", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtAlbRFecUlt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRFecUlt_Internalname, localUtil.format(A48AlbRFecUlt, "99/99/99"), localUtil.format( A48AlbRFecUlt, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRFecUlt_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRFecUlt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDE5.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtAlbRFecUlt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtAlbRFecUlt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TALBDE5.htm");
      httpContext.writeTextNL( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Estado (0=No Cumpl. 1=Cumpl.)", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbREst, cmbAlbREst.getInternalname(), GXutil.trim( GXutil.str( A47AlbREst, 1, 0)), 1, cmbAlbREst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbAlbREst.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,131);\"", "", true, (byte)(0), "HLP_TALBDE5.htm");
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Codigo Tipo Entrada", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipEntCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1211TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipEntCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1211TipEntCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1211TipEntCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipEntCod_Jsonclick, 0, "", "", "", "", "", 1, edtTipEntCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Nombre Tipo Entrada", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipEntNom_Internalname, GXutil.rtrim( A1212TipEntNom), GXutil.rtrim( localUtil.format( A1212TipEntNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipEntNom_Jsonclick, 0, "", "", "", "", "", 1, edtTipEntNom_Enabled, 0, "text", "", 25, "chr", 1, "row", 25, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Numero de Etiquetas", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbNumEti_Internalname, GXutil.ltrim( localUtil.ntoc( A1222AlbNumEti, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbNumEti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1222AlbNumEti), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1222AlbNumEti), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbNumEti_Jsonclick, 0, "", "", "", "", "", 1, edtAlbNumEti_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock27_Internalname, httpContext.getMessage( "Destino Empesa", ""), "", "", lblTextblock27_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 151,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRDes_Internalname, GXutil.rtrim( A1291AlbRDes), GXutil.rtrim( localUtil.format( A1291AlbRDes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,151);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRDes_Jsonclick, 0, "", "", "", "", "", 1, edtAlbRDes_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock28_Internalname, httpContext.getMessage( "Código de Procedencia", ""), "", "", lblTextblock28_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 156,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProceCod_Internalname, GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProceCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A970ProceCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,156);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProceCod_Jsonclick, 0, "", "", "", "", "", 1, edtProceCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock29_Internalname, httpContext.getMessage( "Nombre Procedencia", ""), "", "", lblTextblock29_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProceNom_Internalname, GXutil.rtrim( A971ProceNom), GXutil.rtrim( localUtil.format( A971ProceNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProceNom_Jsonclick, 0, "", "", "", "", "", 1, edtProceNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock30_Internalname, httpContext.getMessage( "Total Piezas", ""), "", "", lblTextblock30_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetPie_Internalname, GXutil.ltrim( localUtil.ntoc( A2152AlbDetPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDetPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2152AlbDetPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2152AlbDetPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetPie_Jsonclick, 0, "", "", "", "", "", 1, edtAlbDetPie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock31_Internalname, httpContext.getMessage( "Total Metros Entrados", ""), "", "", lblTextblock31_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A2149AlbDetMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDetMtr_Enabled!=0) ? localUtil.format( A2149AlbDetMtr, "ZZZZZ9.99") : localUtil.format( A2149AlbDetMtr, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetMtr_Jsonclick, 0, "", "", "", "", "", 1, edtAlbDetMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock32_Internalname, httpContext.getMessage( "Kilos Entrados", ""), "", "", lblTextblock32_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A2146AlbDetKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDetKgm_Enabled!=0) ? localUtil.format( A2146AlbDetKgm, "ZZZZZ9.99") : localUtil.format( A2146AlbDetKgm, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetKgm_Jsonclick, 0, "", "", "", "", "", 1, edtAlbDetKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock33_Internalname, httpContext.getMessage( "Metros Utilizados", ""), "", "", lblTextblock33_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetMtrU_Internalname, GXutil.ltrim( localUtil.ntoc( A2151AlbDetMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDetMtrU_Enabled!=0) ? localUtil.format( A2151AlbDetMtrU, "ZZZZZ9.99") : localUtil.format( A2151AlbDetMtrU, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetMtrU_Jsonclick, 0, "", "", "", "", "", 1, edtAlbDetMtrU_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock34_Internalname, httpContext.getMessage( "Kilos Utilizados", ""), "", "", lblTextblock34_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetKgmU_Internalname, GXutil.ltrim( localUtil.ntoc( A2148AlbDetKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDetKgmU_Enabled!=0) ? localUtil.format( A2148AlbDetKgmU, "ZZZZZ9.99") : localUtil.format( A2148AlbDetKgmU, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetKgmU_Jsonclick, 0, "", "", "", "", "", 1, edtAlbDetKgmU_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock35_Internalname, httpContext.getMessage( "Metros Disponibles", ""), "", "", lblTextblock35_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetMtrD_Internalname, GXutil.ltrim( localUtil.ntoc( A2150AlbDetMtrD, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDetMtrD_Enabled!=0) ? localUtil.format( A2150AlbDetMtrD, "ZZZZZ9.99") : localUtil.format( A2150AlbDetMtrD, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetMtrD_Jsonclick, 0, "", "", "", "", "", 1, edtAlbDetMtrD_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock36_Internalname, httpContext.getMessage( "Kilos Disponibles", ""), "", "", lblTextblock36_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetKgmD_Internalname, GXutil.ltrim( localUtil.ntoc( A2147AlbDetKgmD, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDetKgmD_Enabled!=0) ? localUtil.format( A2147AlbDetKgmD, "ZZZZZ9.99") : localUtil.format( A2147AlbDetKgmD, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetKgmD_Jsonclick, 0, "", "", "", "", "", 1, edtAlbDetKgmD_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock37_Internalname, httpContext.getMessage( "Piezas Utilizadas", ""), "", "", lblTextblock37_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDetPieU_Internalname, GXutil.ltrim( localUtil.ntoc( A2153AlbDetPieU, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDetPieU_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2153AlbDetPieU), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2153AlbDetPieU), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDetPieU_Jsonclick, 0, "", "", "", "", "", 1, edtAlbDetPieU_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TALBDE5.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol205( ) ;
      nGXsfl_205_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount299 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_299 = (short)(1) ;
            scanStartT1299( ) ;
            while ( RcdFound299 != 0 )
            {
               init_level_properties299( ) ;
               getByPrimaryKeyT1299( ) ;
               addRowT1299( ) ;
               scanNextT1299( ) ;
            }
            scanEndT1299( ) ;
            nBlankRcdCount299 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalT1299( ) ;
         standaloneModalT1299( ) ;
         sMode299 = Gx_mode ;
         while ( nGXsfl_205_idx < nRC_GXsfl_205 )
         {
            bGXsfl_205_Refreshing = true ;
            readRowT1299( ) ;
            edtavnRcdDeleted_299_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_299_"+sGXsfl_205_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_299_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_299_Enabled), 5, 0), !bGXsfl_205_Refreshing);
            edtAlbRecPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECPIE_"+sGXsfl_205_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_205_Refreshing);
            edtAlbRecAnh_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECANH_"+sGXsfl_205_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecAnh_Enabled), 5, 0), !bGXsfl_205_Refreshing);
            edtAlbRecMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECMTR_"+sGXsfl_205_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecMtr_Enabled), 5, 0), !bGXsfl_205_Refreshing);
            edtAlbRecKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECKGM_"+sGXsfl_205_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecKgm_Enabled), 5, 0), !bGXsfl_205_Refreshing);
            edtAlbRecMtrU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECMTRU_"+sGXsfl_205_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecMtrU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecMtrU_Enabled), 5, 0), !bGXsfl_205_Refreshing);
            edtAlbRecKgmU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECKGMU_"+sGXsfl_205_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecKgmU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecKgmU_Enabled), 5, 0), !bGXsfl_205_Refreshing);
            if ( ( nRcdExists_299 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalT1299( ) ;
            }
            sendRowT1299( ) ;
            bGXsfl_205_Refreshing = false ;
         }
         Gx_mode = sMode299 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount299 = (short)(5) ;
         nRcdExists_299 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartT1299( ) ;
            while ( RcdFound299 != 0 )
            {
               sGXsfl_205_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_205_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_205299( ) ;
               init_level_properties299( ) ;
               standaloneNotModalT1299( ) ;
               getByPrimaryKeyT1299( ) ;
               standaloneModalT1299( ) ;
               addRowT1299( ) ;
               scanNextT1299( ) ;
            }
            scanEndT1299( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode299 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_205_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_205_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_205299( ) ;
      initAllT1299( ) ;
      init_level_properties299( ) ;
      nRcdExists_299 = (short)(0) ;
      nIsMod_299 = (short)(0) ;
      nRcdDeleted_299 = (short)(0) ;
      nBlankRcdCount299 = (short)(nBlankRcdUsr299+nBlankRcdCount299) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount299 > 0 )
      {
         standaloneNotModalT1299( ) ;
         standaloneModalT1299( ) ;
         addRowT1299( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtAlbRecPie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount299 = (short)(nBlankRcdCount299-1) ;
      }
      Gx_mode = sMode299 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container, subGrid1_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
      }
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 215,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDE5.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDE5.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 217,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDE5.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 218,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TALBDE5.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 219,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TALBDE5.htm");
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
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
         Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "Z58AlbRUniEnt")) ;
         Z60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "Z60AlbRUniUti")) ;
         Z52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "Z52AlbRPieEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( "Z54AlbRPieUti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z47AlbREst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z56AlbRUni = httpContext.cgiGet( "Z56AlbRUni") ;
         Z45AlbRef = httpContext.cgiGet( "Z45AlbRef") ;
         Z46AlbREnt = httpContext.cgiGet( "Z46AlbREnt") ;
         Z50AlbRLoc = httpContext.cgiGet( "Z50AlbRLoc") ;
         Z49AlbRFen = localUtil.ctod( httpContext.cgiGet( "Z49AlbRFen"), 0) ;
         Z55AlbRReo = httpContext.cgiGet( "Z55AlbRReo") ;
         Z53AlbRPieReb = (int)(localUtil.ctol( httpContext.cgiGet( "Z53AlbRPieReb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z59AlbRUniReb = localUtil.ctond( httpContext.cgiGet( "Z59AlbRUniReb")) ;
         Z48AlbRFecUlt = localUtil.ctod( httpContext.cgiGet( "Z48AlbRFecUlt"), 0) ;
         Z1222AlbNumEti = (short)(localUtil.ctol( httpContext.cgiGet( "Z1222AlbNumEti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1291AlbRDes = httpContext.cgiGet( "Z1291AlbRDes") ;
         Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z970ProceCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1211TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z1211TipEntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_205 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_205"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV51Modo2 = httpContext.cgiGet( "MODO2") ;
         AV17UsurCod = httpContext.cgiGet( "vUSURCOD") ;
         AV51Modo2 = httpContext.cgiGet( "vMODO2") ;
         Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV18AlbCum = httpContext.cgiGet( "vALBCUM") ;
         AV46Unidades = httpContext.cgiGet( "vUNIDADES") ;
         AV57AlbRef = httpContext.cgiGet( "vALBREF") ;
         AV47vDisLoc = httpContext.cgiGet( "vVDISLOC") ;
         AV65DisCliNum = httpContext.cgiGet( "vDISCLINUM") ;
         AV55FlagArt = (byte)(localUtil.ctol( httpContext.cgiGet( "vFLAGART"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV54Rdto = localUtil.ctond( httpContext.cgiGet( "vRDTO")) ;
         AV53Pesoml = (short)(localUtil.ctol( httpContext.cgiGet( "vPESOML"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV67anc = (short)(localUtil.ctol( httpContext.cgiGet( "vANC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV68grm2 = (short)(localUtil.ctol( httpContext.cgiGet( "vGRM2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A4795AlRPieCal = httpContext.cgiGet( "ALRPIECAL") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A840TrnCod = (short)(0) ;
            n840TrnCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         else
         {
            A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n840TrnCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         A841TrnNom = httpContext.cgiGet( edtTrnNom_Internalname) ;
         n841TrnNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         A46AlbREnt = httpContext.cgiGet( edtAlbREnt_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
         A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
         cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
         A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A50AlbRLoc = httpContext.cgiGet( edtAlbRLoc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
         if ( localUtil.vcdate( httpContext.cgiGet( edtAlbRFen_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "ALBRFEN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRFen_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A49AlbRFen = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
         }
         else
         {
            A49AlbRFen = localUtil.ctod( httpContext.cgiGet( edtAlbRFen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
         }
         A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         cmbAlbRReo.setName( cmbAlbRReo.getInternalname() );
         cmbAlbRReo.setValue( httpContext.cgiGet( cmbAlbRReo.getInternalname()) );
         A55AlbRReo = httpContext.cgiGet( cmbAlbRReo.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieReb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRPieReb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRPIEREB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRPieReb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A53AlbRPieReb = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
         }
         else
         {
            A53AlbRPieReb = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieReb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
         }
         A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRUniReb_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRUniReb_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRUNIREB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbRUniReb_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A59AlbRUniReb = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrimstr( A59AlbRUniReb, 9, 2));
         }
         else
         {
            A59AlbRUniReb = localUtil.ctond( httpContext.cgiGet( edtAlbRUniReb_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrimstr( A59AlbRUniReb, 9, 2));
         }
         A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
         A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         A48AlbRFecUlt = localUtil.ctod( httpContext.cgiGet( edtAlbRFecUlt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         cmbAlbREst.setName( cmbAlbREst.getInternalname() );
         cmbAlbREst.setValue( httpContext.cgiGet( cmbAlbREst.getInternalname()) );
         A47AlbREst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbREst.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipEntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipEntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPENTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipEntCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1211TipEntCod = (short)(0) ;
            n1211TipEntCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         }
         else
         {
            A1211TipEntCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipEntCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1211TipEntCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         }
         A1212TipEntNom = httpContext.cgiGet( edtTipEntNom_Internalname) ;
         n1212TipEntNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbNumEti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbNumEti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBNUMETI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbNumEti_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1222AlbNumEti = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
         }
         else
         {
            A1222AlbNumEti = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbNumEti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
         }
         A1291AlbRDes = httpContext.cgiGet( edtAlbRDes_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtProceCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A970ProceCod = (short)(0) ;
            n970ProceCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         }
         else
         {
            A970ProceCod = (short)(localUtil.ctol( httpContext.cgiGet( edtProceCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n970ProceCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         }
         A971ProceNom = httpContext.cgiGet( edtProceNom_Internalname) ;
         n971ProceNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
         A2152AlbDetPie = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbDetPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = localUtil.ctond( httpContext.cgiGet( edtAlbDetMtr_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = localUtil.ctond( httpContext.cgiGet( edtAlbDetKgm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = localUtil.ctond( httpContext.cgiGet( edtAlbDetMtrU_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = localUtil.ctond( httpContext.cgiGet( edtAlbDetKgmU_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
         A2150AlbDetMtrD = localUtil.ctond( httpContext.cgiGet( edtAlbDetMtrD_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
         A2147AlbDetKgmD = localUtil.ctond( httpContext.cgiGet( edtAlbDetKgmD_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
         A2153AlbDetPieU = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbDetPieU_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TALBDE5");
         A48AlbRFecUlt = localUtil.ctod( httpContext.cgiGet( edtAlbRFecUlt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         forbiddenHiddens.add("AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         forbiddenHiddens.add("Modo2", GXutil.rtrim( localUtil.format( AV51Modo2, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("talbde5:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
            A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
            n44AlbRecCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
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
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAllT17( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_299_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_299_Enabled), 5, 0), !bGXsfl_205_Refreshing);
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
      disableAttributesT17( ) ;
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

   public void confirm_T10( )
   {
      beforeValidateT17( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsT17( ) ;
         }
         else
         {
            checkExtendedTableT17( ) ;
            if ( AnyError == 0 )
            {
               zmT17( 54) ;
               zmT17( 55) ;
               zmT17( 56) ;
               zmT17( 57) ;
               zmT17( 58) ;
               zmT17( 59) ;
            }
            closeExtendedTableCursorsT17( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode7 = Gx_mode ;
         confirm_T1299( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode7 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValuesT10( ) ;
      }
   }

   public void confirm_T1299( )
   {
      s2147AlbDetKgmD = O2147AlbDetKgmD ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      s2150AlbDetMtrD = O2150AlbDetMtrD ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      s2153AlbDetPieU = O2153AlbDetPieU ;
      httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      s58AlbRUniEnt = O58AlbRUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      s60AlbRUniUti = O60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      s52AlbRPieEnt = O52AlbRPieEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      s54AlbRPieUti = O54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      sV18AlbCum = OV18AlbCum ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
      nGXsfl_205_idx = 0 ;
      while ( nGXsfl_205_idx < nRC_GXsfl_205 )
      {
         readRowT1299( ) ;
         if ( ( nRcdExists_299 != 0 ) || ( nIsMod_299 != 0 ) )
         {
            getKeyT1299( ) ;
            if ( ( nRcdExists_299 == 0 ) && ( nRcdDeleted_299 == 0 ) )
            {
               if ( RcdFound299 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateT1299( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableT1299( ) ;
                     if ( AnyError == 0 )
                     {
                        zmT1299( 62) ;
                     }
                     closeExtendedTableCursorsT1299( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O2147AlbDetKgmD = A2147AlbDetKgmD ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
                     O2150AlbDetMtrD = A2150AlbDetMtrD ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
                     O2153AlbDetPieU = A2153AlbDetPieU ;
                     httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
                     O58AlbRUniEnt = A58AlbRUniEnt ;
                     httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
                     O60AlbRUniUti = A60AlbRUniUti ;
                     httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                     O52AlbRPieEnt = A52AlbRPieEnt ;
                     httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
                     O54AlbRPieUti = A54AlbRPieUti ;
                     httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
                     OV18AlbCum = AV18AlbCum ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
                  }
               }
               else
               {
                  GXCCtl = "ALBRECPIE_" + sGXsfl_205_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbRecPie_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound299 != 0 )
               {
                  if ( nRcdDeleted_299 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyT1299( ) ;
                     loadT1299( ) ;
                     beforeValidateT1299( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsT1299( ) ;
                        O2147AlbDetKgmD = A2147AlbDetKgmD ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
                        O2150AlbDetMtrD = A2150AlbDetMtrD ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
                        O2153AlbDetPieU = A2153AlbDetPieU ;
                        httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
                        O58AlbRUniEnt = A58AlbRUniEnt ;
                        httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
                        O60AlbRUniUti = A60AlbRUniUti ;
                        httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                        O52AlbRPieEnt = A52AlbRPieEnt ;
                        httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
                        O54AlbRPieUti = A54AlbRPieUti ;
                        httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
                        OV18AlbCum = AV18AlbCum ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
                     }
                  }
                  else
                  {
                     if ( nIsMod_299 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateT1299( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableT1299( ) ;
                           if ( AnyError == 0 )
                           {
                              zmT1299( 62) ;
                           }
                           closeExtendedTableCursorsT1299( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O2147AlbDetKgmD = A2147AlbDetKgmD ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
                           O2150AlbDetMtrD = A2150AlbDetMtrD ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
                           O2153AlbDetPieU = A2153AlbDetPieU ;
                           httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
                           O58AlbRUniEnt = A58AlbRUniEnt ;
                           httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
                           O60AlbRUniUti = A60AlbRUniUti ;
                           httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                           O52AlbRPieEnt = A52AlbRPieEnt ;
                           httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
                           O54AlbRPieUti = A54AlbRPieUti ;
                           httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
                           OV18AlbCum = AV18AlbCum ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_299 == 0 )
                  {
                     GXCCtl = "ALBRECPIE_" + sGXsfl_205_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbRecPie_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_299_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecPie_Internalname, GXutil.rtrim( A2159AlbRecPie)) ;
         httpContext.changePostValue( edtAlbRecAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A2154AlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecMtrU_Internalname, GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecKgmU_Internalname, GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2159AlbRecPie_"+sGXsfl_205_idx, GXutil.rtrim( Z2159AlbRecPie)) ;
         httpContext.changePostValue( "ZT_"+"Z4795AlRPieCal_"+sGXsfl_205_idx, GXutil.rtrim( Z4795AlRPieCal)) ;
         httpContext.changePostValue( "ZT_"+"Z2154AlbRecAnh_"+sGXsfl_205_idx, GXutil.ltrim( localUtil.ntoc( Z2154AlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2157AlbRecMtr_"+sGXsfl_205_idx, GXutil.ltrim( localUtil.ntoc( Z2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2155AlbRecKgm_"+sGXsfl_205_idx, GXutil.ltrim( localUtil.ntoc( Z2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2158AlbRecMtrU_"+sGXsfl_205_idx, GXutil.ltrim( localUtil.ntoc( Z2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2156AlbRecKgmU_"+sGXsfl_205_idx, GXutil.ltrim( localUtil.ntoc( Z2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_299_"+sGXsfl_205_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_299_"+sGXsfl_205_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_299_"+sGXsfl_205_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_299 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_299_"+sGXsfl_205_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_299_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECPIE_"+sGXsfl_205_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECANH_"+sGXsfl_205_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecAnh_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECMTR_"+sGXsfl_205_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECKGM_"+sGXsfl_205_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECMTRU_"+sGXsfl_205_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtrU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECKGMU_"+sGXsfl_205_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgmU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O2147AlbDetKgmD = s2147AlbDetKgmD ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      O2150AlbDetMtrD = s2150AlbDetMtrD ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      O2153AlbDetPieU = s2153AlbDetPieU ;
      httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      O58AlbRUniEnt = s58AlbRUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      O60AlbRUniUti = s60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      O52AlbRPieEnt = s52AlbRPieEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      O54AlbRPieUti = s54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      OV18AlbCum = sV18AlbCum ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
      /* Start of After( level) rules */
      /* Using cursor T00T15 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A2152AlbDetPie = T00T15_A2152AlbDetPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = T00T15_A2149AlbDetMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = T00T15_A2146AlbDetKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = T00T15_A2151AlbDetMtrU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = T00T15_A2148AlbDetKgmU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
      }
      else
      {
         A2152AlbDetPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
      }
      if ( true /* After */ )
      {
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A44AlbRecCod ;
         new app.pprueba5(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
         talbde5_impl.this.A396EmprCod = GXv_char1[0] ;
         talbde5_impl.this.A44AlbRecCod = GXv_int2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 )
      {
         A58AlbRUniEnt = A2149AlbDetMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
         {
            A58AlbRUniEnt = A2146AlbDetKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         }
      }
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 )
      {
         A60AlbRUniUti = A2151AlbDetMtrU ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
         {
            A60AlbRUniUti = A2148AlbDetKgmU ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
      }
      A52AlbRPieEnt = A2152AlbDetPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      /* End of After( level) rules */
   }

   public void resetCaptionT10( )
   {
   }

   public void zmT17( int GX_JID )
   {
      if ( ( GX_JID == 53 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z58AlbRUniEnt = T00T17_A58AlbRUniEnt[0] ;
            Z60AlbRUniUti = T00T17_A60AlbRUniUti[0] ;
            Z52AlbRPieEnt = T00T17_A52AlbRPieEnt[0] ;
            Z54AlbRPieUti = T00T17_A54AlbRPieUti[0] ;
            Z47AlbREst = T00T17_A47AlbREst[0] ;
            Z56AlbRUni = T00T17_A56AlbRUni[0] ;
            Z45AlbRef = T00T17_A45AlbRef[0] ;
            Z46AlbREnt = T00T17_A46AlbREnt[0] ;
            Z50AlbRLoc = T00T17_A50AlbRLoc[0] ;
            Z49AlbRFen = T00T17_A49AlbRFen[0] ;
            Z55AlbRReo = T00T17_A55AlbRReo[0] ;
            Z53AlbRPieReb = T00T17_A53AlbRPieReb[0] ;
            Z59AlbRUniReb = T00T17_A59AlbRUniReb[0] ;
            Z48AlbRFecUlt = T00T17_A48AlbRFecUlt[0] ;
            Z1222AlbNumEti = T00T17_A1222AlbNumEti[0] ;
            Z1291AlbRDes = T00T17_A1291AlbRDes[0] ;
            Z840TrnCod = T00T17_A840TrnCod[0] ;
            Z970ProceCod = T00T17_A970ProceCod[0] ;
            Z1211TipEntCod = T00T17_A1211TipEntCod[0] ;
         }
         else
         {
            Z58AlbRUniEnt = A58AlbRUniEnt ;
            Z60AlbRUniUti = A60AlbRUniUti ;
            Z52AlbRPieEnt = A52AlbRPieEnt ;
            Z54AlbRPieUti = A54AlbRPieUti ;
            Z47AlbREst = A47AlbREst ;
            Z56AlbRUni = A56AlbRUni ;
            Z45AlbRef = A45AlbRef ;
            Z46AlbREnt = A46AlbREnt ;
            Z50AlbRLoc = A50AlbRLoc ;
            Z49AlbRFen = A49AlbRFen ;
            Z55AlbRReo = A55AlbRReo ;
            Z53AlbRPieReb = A53AlbRPieReb ;
            Z59AlbRUniReb = A59AlbRUniReb ;
            Z48AlbRFecUlt = A48AlbRFecUlt ;
            Z1222AlbNumEti = A1222AlbNumEti ;
            Z1291AlbRDes = A1291AlbRDes ;
            Z840TrnCod = A840TrnCod ;
            Z970ProceCod = A970ProceCod ;
            Z1211TipEntCod = A1211TipEntCod ;
         }
      }
      if ( GX_JID == -53 )
      {
         Z44AlbRecCod = A44AlbRecCod ;
         Z252CliCod = A252CliCod ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z47AlbREst = A47AlbREst ;
         Z56AlbRUni = A56AlbRUni ;
         Z45AlbRef = A45AlbRef ;
         Z46AlbREnt = A46AlbREnt ;
         Z50AlbRLoc = A50AlbRLoc ;
         Z49AlbRFen = A49AlbRFen ;
         Z55AlbRReo = A55AlbRReo ;
         Z53AlbRPieReb = A53AlbRPieReb ;
         Z59AlbRUniReb = A59AlbRUniReb ;
         Z48AlbRFecUlt = A48AlbRFecUlt ;
         Z1222AlbNumEti = A1222AlbNumEti ;
         Z1291AlbRDes = A1291AlbRDes ;
         Z396EmprCod = A396EmprCod ;
         Z840TrnCod = A840TrnCod ;
         Z970ProceCod = A970ProceCod ;
         Z1211TipEntCod = A1211TipEntCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z2152AlbDetPie = A2152AlbDetPie ;
         Z2149AlbDetMtr = A2149AlbDetMtr ;
         Z2146AlbDetKgm = A2146AlbDetKgm ;
         Z2151AlbDetMtrU = A2151AlbDetMtrU ;
         Z2148AlbDetKgmU = A2148AlbDetKgmU ;
         Z841TrnNom = A841TrnNom ;
         Z1212TipEntNom = A1212TipEntNom ;
         Z971ProceNom = A971ProceNom ;
      }
   }

   public void standaloneNotModal( )
   {
      if ( 1 < 0 )
      {
         AV17UsurCod = "1" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      }
      edtAlbRef_Enabled = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      edtAlbRFecUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFecUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFecUlt_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), true);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtAlbRFecUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFecUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFecUlt_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), true);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), true);
      /* Using cursor T00T18 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00T18_A407EmprNom[0] ;
      n407EmprNom = T00T18_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T00T15 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A2152AlbDetPie = T00T15_A2152AlbDetPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = T00T15_A2149AlbDetMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = T00T15_A2146AlbDetKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = T00T15_A2151AlbDetMtrU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = T00T15_A2148AlbDetKgmU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
      }
      else
      {
         A2152AlbDetPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
      }
      pr_default.close(2);
      A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      /* Using cursor T00T19 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T00T19_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(6);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  && true /* Level */ )
      {
         AV51Modo2 = httpContext.getMessage( httpContext.getMessage( "INS", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51Modo2", AV51Modo2);
      }
      else
      {
         if ( isUpd( )  && true /* Level */ )
         {
            AV51Modo2 = httpContext.getMessage( httpContext.getMessage( "UPD", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51Modo2", AV51Modo2);
         }
         else
         {
            if ( isDlt( )  && true /* Level */ )
            {
               AV51Modo2 = httpContext.getMessage( httpContext.getMessage( "DEL", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV51Modo2", AV51Modo2);
            }
         }
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
      A56AlbRUni = AV46Unidades ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      if ( isIns( )  && ( ! (0==A44AlbRecCod) ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Albaran inexistente", ""), 1, "");
         AnyError = (short)(1) ;
      }
      A52AlbRPieEnt = A2152AlbDetPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      if ( isIns( )  && (0==A44AlbRecCod) && true /* Level */ )
      {
         GXv_int2[0] = A44AlbRecCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "020100", GXv_int2) ;
         talbde5_impl.this.A44AlbRecCod = GXv_int2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A49AlbRFen)) && ( Gx_BScreen == 0 ) )
      {
         A49AlbRFen = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
      }
      if ( isIns( )  && (GXutil.strcmp("", A45AlbRef)==0) && ( Gx_BScreen == 0 ) )
      {
         A45AlbRef = AV57AlbRef ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      }
      if ( isIns( )  && (GXutil.strcmp("", A55AlbRReo)==0) && ( Gx_BScreen == 0 ) )
      {
         A55AlbRReo = httpContext.getMessage( httpContext.getMessage( "NO", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A48AlbRFecUlt)) && ( Gx_BScreen == 0 ) )
      {
         A48AlbRFecUlt = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      }
      if ( isIns( )  && (GXutil.strcmp("", A50AlbRLoc)==0) && ( Gx_BScreen == 0 ) )
      {
         A50AlbRLoc = AV47vDisLoc ;
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
      }
      if ( isIns( )  && (GXutil.strcmp("", A46AlbREnt)==0) && ( Gx_BScreen == 0 ) )
      {
         A46AlbREnt = AV65DisCliNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
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
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
         {
            A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
         else
         {
            if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
            {
               A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
            }
            else
            {
               A2153AlbDetPieU = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
            }
         }
         A54AlbRPieUti = A2153AlbDetPieU ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      }
   }

   public void loadT17( )
   {
      /* Using cursor T00T114 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound7 = (short)(1) ;
         A58AlbRUniEnt = T00T114_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A60AlbRUniUti = T00T114_A60AlbRUniUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A52AlbRPieEnt = T00T114_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A54AlbRPieUti = T00T114_A54AlbRPieUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A47AlbREst = T00T114_A47AlbREst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         A56AlbRUni = T00T114_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A407EmprNom = T00T114_A407EmprNom[0] ;
         n407EmprNom = T00T114_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T00T114_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A45AlbRef = T00T114_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A841TrnNom = T00T114_A841TrnNom[0] ;
         n841TrnNom = T00T114_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         A46AlbREnt = T00T114_A46AlbREnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
         A50AlbRLoc = T00T114_A50AlbRLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
         A49AlbRFen = T00T114_A49AlbRFen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
         A55AlbRReo = T00T114_A55AlbRReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         A53AlbRPieReb = T00T114_A53AlbRPieReb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
         A59AlbRUniReb = T00T114_A59AlbRUniReb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrimstr( A59AlbRUniReb, 9, 2));
         A48AlbRFecUlt = T00T114_A48AlbRFecUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         A1212TipEntNom = T00T114_A1212TipEntNom[0] ;
         n1212TipEntNom = T00T114_n1212TipEntNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
         A1222AlbNumEti = T00T114_A1222AlbNumEti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
         A1291AlbRDes = T00T114_A1291AlbRDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
         A971ProceNom = T00T114_A971ProceNom[0] ;
         n971ProceNom = T00T114_n971ProceNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
         A840TrnCod = T00T114_A840TrnCod[0] ;
         n840TrnCod = T00T114_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A970ProceCod = T00T114_A970ProceCod[0] ;
         n970ProceCod = T00T114_n970ProceCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         A1211TipEntCod = T00T114_A1211TipEntCod[0] ;
         n1211TipEntCod = T00T114_n1211TipEntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         A2152AlbDetPie = T00T114_A2152AlbDetPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = T00T114_A2149AlbDetMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = T00T114_A2146AlbDetKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = T00T114_A2151AlbDetMtrU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = T00T114_A2148AlbDetKgmU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
         zmT17( -53) ;
      }
      pr_default.close(10);
      onLoadActionsT17( ) ;
   }

   public void onLoadActionsT17( )
   {
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
      {
         A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
         else
         {
            A2153AlbDetPieU = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
      }
      A54AlbRPieUti = A2153AlbDetPieU ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 )
      {
         A58AlbRUniEnt = A2149AlbDetMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
         {
            A58AlbRUniEnt = A2146AlbDetKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         }
      }
      if ( isIns( )  && (0==A47AlbREst) && ( Gx_BScreen == 0 ) )
      {
         A47AlbREst = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      else
      {
         if ( ( A2147AlbDetKgmD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
         {
            A47AlbREst = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
         else
         {
            if ( ( A2150AlbDetMtrD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
            {
               A47AlbREst = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            }
            else
            {
               if ( ( A2147AlbDetKgmD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
               {
                  A47AlbREst = (byte)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
               }
               else
               {
                  if ( ( A2150AlbDetMtrD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
                  {
                     A47AlbREst = (byte)(0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
                  }
               }
            }
         }
      }
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 )
      {
         A60AlbRUniUti = A2151AlbDetMtrU ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
         {
            A60AlbRUniUti = A2148AlbDetKgmU ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
      }
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
      if ( A47AlbREst == 1 )
      {
         AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
      }
      else
      {
         if ( A47AlbREst == 0 )
         {
            AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
         }
      }
   }

   public void checkExtendedTableT17( )
   {
      nIsDirty_7 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T00T110 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T00T110_A841TrnNom[0] ;
      n841TrnNom = T00T110_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      pr_default.close(7);
      /* Using cursor T00T111 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A970ProceCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtProceCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A971ProceNom = T00T111_A971ProceNom[0] ;
      n971ProceNom = T00T111_n971ProceNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
      pr_default.close(8);
      /* Using cursor T00T112 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1211TipEntCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENTRAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPENTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipEntCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A1212TipEntNom = T00T112_A1212TipEntNom[0] ;
      n1212TipEntNom = T00T112_n1212TipEntNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
      pr_default.close(9);
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
      {
         nIsDirty_7 = (short)(1) ;
         A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            nIsDirty_7 = (short)(1) ;
            A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
         else
         {
            nIsDirty_7 = (short)(1) ;
            A2153AlbDetPieU = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
      }
      nIsDirty_7 = (short)(1) ;
      A54AlbRPieUti = A2153AlbDetPieU ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char1[0] = A396EmprCod ;
         GXv_int2[0] = A252CliCod ;
         GXv_char3[0] = A45AlbRef ;
         GXv_int4[0] = AV55FlagArt ;
         GXv_decimal5[0] = AV54Rdto ;
         GXv_int6[0] = AV53Pesoml ;
         GXv_int7[0] = AV67anc ;
         GXv_int8[0] = AV68grm2 ;
         new app.pbusarp(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_char3, GXv_int4, GXv_decimal5, GXv_int6, GXv_int7, GXv_int8) ;
         talbde5_impl.this.A396EmprCod = GXv_char1[0] ;
         talbde5_impl.this.A252CliCod = GXv_int2[0] ;
         talbde5_impl.this.A45AlbRef = GXv_char3[0] ;
         talbde5_impl.this.AV55FlagArt = GXv_int4[0] ;
         talbde5_impl.this.AV54Rdto = GXv_decimal5[0] ;
         talbde5_impl.this.AV53Pesoml = GXv_int6[0] ;
         talbde5_impl.this.AV67anc = GXv_int7[0] ;
         talbde5_impl.this.AV68grm2 = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.ajax_rsp_assign_attri("", false, "AV55FlagArt", GXutil.str( AV55FlagArt, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV54Rdto", GXutil.ltrimstr( AV54Rdto, 6, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV53Pesoml", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Pesoml), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV67anc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67anc), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV68grm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68grm2), 4, 0));
      }
      if ( ! ( ( GXutil.strcmp(A56AlbRUni, "K") == 0 ) || ( GXutil.strcmp(A56AlbRUni, "M") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBRUNI");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbRUni.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A55AlbRReo, "SI") == 0 ) || ( GXutil.strcmp(A55AlbRReo, "NO") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Reclamacion?", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBRREO");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbRReo.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      nIsDirty_7 = (short)(1) ;
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 )
      {
         nIsDirty_7 = (short)(1) ;
         A58AlbRUniEnt = A2149AlbDetMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
         {
            nIsDirty_7 = (short)(1) ;
            A58AlbRUniEnt = A2146AlbDetKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         }
      }
      if ( isIns( )  && (0==A47AlbREst) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_7 = (short)(1) ;
         A47AlbREst = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      else
      {
         if ( ( A2147AlbDetKgmD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
         {
            nIsDirty_7 = (short)(1) ;
            A47AlbREst = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
         else
         {
            if ( ( A2150AlbDetMtrD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
            {
               nIsDirty_7 = (short)(1) ;
               A47AlbREst = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            }
            else
            {
               if ( ( A2147AlbDetKgmD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
               {
                  nIsDirty_7 = (short)(1) ;
                  A47AlbREst = (byte)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
               }
               else
               {
                  if ( ( A2150AlbDetMtrD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
                  {
                     nIsDirty_7 = (short)(1) ;
                     A47AlbREst = (byte)(0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
                  }
               }
            }
         }
      }
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 )
      {
         nIsDirty_7 = (short)(1) ;
         A60AlbRUniUti = A2151AlbDetMtrU ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
         {
            nIsDirty_7 = (short)(1) ;
            A60AlbRUniUti = A2148AlbDetKgmU ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
      }
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         nIsDirty_7 = (short)(1) ;
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            nIsDirty_7 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            nIsDirty_7 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
      if ( ! ( ( A47AlbREst == 0 ) || ( A47AlbREst == 1 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Estado", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBREST");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbREst.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( A47AlbREst == 1 )
      {
         AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
      }
      else
      {
         if ( A47AlbREst == 0 )
         {
            AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
         }
      }
   }

   public void closeExtendedTableCursorsT17( )
   {
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
   }

   public void enableDisable( )
   {
   }

   public void gxload_56( String A396EmprCod ,
                          short A840TrnCod )
   {
      /* Using cursor T00T115 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T00T115_A841TrnNom[0] ;
      n841TrnNom = T00T115_n841TrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_57( String A396EmprCod ,
                          short A970ProceCod )
   {
      /* Using cursor T00T116 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A970ProceCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtProceCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A971ProceNom = T00T116_A971ProceNom[0] ;
      n971ProceNom = T00T116_n971ProceNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A971ProceNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_58( String A396EmprCod ,
                          short A1211TipEntCod )
   {
      /* Using cursor T00T117 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1211TipEntCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENTRAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPENTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipEntCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A1212TipEntNom = T00T117_A1212TipEntNom[0] ;
      n1212TipEntNom = T00T117_n1212TipEntNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1212TipEntNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void getKeyT17( )
   {
      /* Using cursor T00T118 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound7 = (short)(1) ;
      }
      else
      {
         RcdFound7 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00T17 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(4) != 101) && ( T00T17_A44AlbRecCod[0] == A44AlbRecCod ) && ( T00T17_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T00T17_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmT17( 53) ;
         RcdFound7 = (short)(1) ;
         A58AlbRUniEnt = T00T17_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A60AlbRUniUti = T00T17_A60AlbRUniUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A52AlbRPieEnt = T00T17_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A54AlbRPieUti = T00T17_A54AlbRPieUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A47AlbREst = T00T17_A47AlbREst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         A56AlbRUni = T00T17_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A45AlbRef = T00T17_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A46AlbREnt = T00T17_A46AlbREnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
         A50AlbRLoc = T00T17_A50AlbRLoc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
         A49AlbRFen = T00T17_A49AlbRFen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
         A55AlbRReo = T00T17_A55AlbRReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         A53AlbRPieReb = T00T17_A53AlbRPieReb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
         A59AlbRUniReb = T00T17_A59AlbRUniReb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrimstr( A59AlbRUniReb, 9, 2));
         A48AlbRFecUlt = T00T17_A48AlbRFecUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
         A1222AlbNumEti = T00T17_A1222AlbNumEti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
         A1291AlbRDes = T00T17_A1291AlbRDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
         A840TrnCod = T00T17_A840TrnCod[0] ;
         n840TrnCod = T00T17_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A970ProceCod = T00T17_A970ProceCod[0] ;
         n970ProceCod = T00T17_n970ProceCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
         A1211TipEntCod = T00T17_A1211TipEntCod[0] ;
         n1211TipEntCod = T00T17_n1211TipEntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadT17( ) ;
         if ( AnyError == 1 )
         {
            RcdFound7 = (short)(0) ;
            initializeNonKeyT17( ) ;
         }
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound7 = (short)(0) ;
         initializeNonKeyT17( ) ;
         sMode7 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode7 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKeyT17( ) ;
      if ( RcdFound7 == 0 )
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
      RcdFound7 = (short)(0) ;
      /* Using cursor T00T119 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         while ( (pr_default.getStatus(15) != 101) && ( GXutil.strcmp(T00T119_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00T119_A44AlbRecCod[0] == A44AlbRecCod ) && ( T00T119_A252CliCod[0] == A252CliCod ) )
         {
            pr_default.readNext(15);
         }
         if ( (pr_default.getStatus(15) != 101) && ( GXutil.strcmp(T00T119_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00T119_A44AlbRecCod[0] == A44AlbRecCod ) && ( T00T119_A252CliCod[0] == A252CliCod ) )
         {
            RcdFound7 = (short)(1) ;
         }
      }
      pr_default.close(15);
   }

   public void move_previous( )
   {
      RcdFound7 = (short)(0) ;
      /* Using cursor T00T120 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( GXutil.strcmp(T00T120_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00T120_A44AlbRecCod[0] == A44AlbRecCod ) && ( T00T120_A252CliCod[0] == A252CliCod ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( GXutil.strcmp(T00T120_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00T120_A44AlbRecCod[0] == A44AlbRecCod ) && ( T00T120_A252CliCod[0] == A252CliCod ) )
         {
            RcdFound7 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyT17( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A2147AlbDetKgmD = O2147AlbDetKgmD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
         A2150AlbDetMtrD = O2150AlbDetMtrD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
         A2153AlbDetPieU = O2153AlbDetPieU ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         A58AlbRUniEnt = O58AlbRUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A60AlbRUniUti = O60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A52AlbRPieEnt = O52AlbRPieEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A54AlbRPieUti = O54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         AV18AlbCum = OV18AlbCum ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
         GX_FocusControl = edtAlbRef_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertT17( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound7 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A2147AlbDetKgmD = O2147AlbDetKgmD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
               A2150AlbDetMtrD = O2150AlbDetMtrD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
               A2153AlbDetPieU = O2153AlbDetPieU ;
               httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
               A58AlbRUniEnt = O58AlbRUniEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
               A60AlbRUniUti = O60AlbRUniUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
               A52AlbRPieEnt = O52AlbRPieEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
               A54AlbRPieUti = O54AlbRPieUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
               AV18AlbCum = OV18AlbCum ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtAlbRef_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A2147AlbDetKgmD = O2147AlbDetKgmD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
               A2150AlbDetMtrD = O2150AlbDetMtrD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
               A2153AlbDetPieU = O2153AlbDetPieU ;
               httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
               A58AlbRUniEnt = O58AlbRUniEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
               A60AlbRUniUti = O60AlbRUniUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
               A52AlbRPieEnt = O52AlbRPieEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
               A54AlbRPieUti = O54AlbRPieUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
               AV18AlbCum = OV18AlbCum ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
               updateT17( ) ;
               GX_FocusControl = edtAlbRef_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A2147AlbDetKgmD = O2147AlbDetKgmD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
               A2150AlbDetMtrD = O2150AlbDetMtrD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
               A2153AlbDetPieU = O2153AlbDetPieU ;
               httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
               A58AlbRUniEnt = O58AlbRUniEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
               A60AlbRUniUti = O60AlbRUniUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
               A52AlbRPieEnt = O52AlbRPieEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
               A54AlbRPieUti = O54AlbRPieUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
               AV18AlbCum = OV18AlbCum ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
               GX_FocusControl = edtAlbRef_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertT17( ) ;
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
                  A2147AlbDetKgmD = O2147AlbDetKgmD ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
                  A2150AlbDetMtrD = O2150AlbDetMtrD ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
                  A2153AlbDetPieU = O2153AlbDetPieU ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
                  A58AlbRUniEnt = O58AlbRUniEnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
                  A60AlbRUniUti = O60AlbRUniUti ;
                  httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                  A52AlbRPieEnt = O52AlbRPieEnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
                  A54AlbRPieUti = O54AlbRPieUti ;
                  httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
                  AV18AlbCum = OV18AlbCum ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
                  GX_FocusControl = edtAlbRef_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertT17( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A2147AlbDetKgmD = O2147AlbDetKgmD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
         A2150AlbDetMtrD = O2150AlbDetMtrD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
         A2153AlbDetPieU = O2153AlbDetPieU ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         A58AlbRUniEnt = O58AlbRUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A60AlbRUniUti = O60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A52AlbRPieEnt = O52AlbRPieEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A54AlbRPieUti = O54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         AV18AlbCum = OV18AlbCum ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtAlbRef_Internalname ;
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
      getKeyT17( ) ;
      if ( RcdFound7 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A44AlbRecCod != Z44AlbRecCod ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "talbde5");
      GX_FocusControl = edtAlbRef_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_T10( ) ;
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
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtAlbRef_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartT17( ) ;
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbRef_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndT17( ) ;
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
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbRef_Internalname ;
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
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbRef_Internalname ;
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
      scanStartT17( ) ;
      if ( RcdFound7 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound7 != 0 )
         {
            scanNextT17( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbRef_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndT17( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyT17( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00T16 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || ( DecimalUtil.compareTo(Z58AlbRUniEnt, T00T16_A58AlbRUniEnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z60AlbRUniUti, T00T16_A60AlbRUniUti[0]) != 0 ) || ( Z52AlbRPieEnt != T00T16_A52AlbRPieEnt[0] ) || ( Z54AlbRPieUti != T00T16_A54AlbRPieUti[0] ) || ( Z47AlbREst != T00T16_A47AlbREst[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z56AlbRUni, T00T16_A56AlbRUni[0]) != 0 ) || ( GXutil.strcmp(Z45AlbRef, T00T16_A45AlbRef[0]) != 0 ) || ( GXutil.strcmp(Z46AlbREnt, T00T16_A46AlbREnt[0]) != 0 ) || ( GXutil.strcmp(Z50AlbRLoc, T00T16_A50AlbRLoc[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z49AlbRFen), GXutil.resetTime(T00T16_A49AlbRFen[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z55AlbRReo, T00T16_A55AlbRReo[0]) != 0 ) || ( Z53AlbRPieReb != T00T16_A53AlbRPieReb[0] ) || ( DecimalUtil.compareTo(Z59AlbRUniReb, T00T16_A59AlbRUniReb[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z48AlbRFecUlt), GXutil.resetTime(T00T16_A48AlbRFecUlt[0])) ) || ( Z1222AlbNumEti != T00T16_A1222AlbNumEti[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z1291AlbRDes, T00T16_A1291AlbRDes[0]) != 0 ) || ( Z840TrnCod != T00T16_A840TrnCod[0] ) || ( Z970ProceCod != T00T16_A970ProceCod[0] ) || ( Z1211TipEntCod != T00T16_A1211TipEntCod[0] ) )
         {
            if ( DecimalUtil.compareTo(Z58AlbRUniEnt, T00T16_A58AlbRUniEnt[0]) != 0 )
            {
               GXutil.writeLogln("talbde5:[seudo value changed for attri]"+"AlbRUniEnt");
               GXutil.writeLogRaw("Old: ",Z58AlbRUniEnt);
               GXutil.writeLogRaw("Current: ",T00T16_A58AlbRUniEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z60AlbRUniUti, T00T16_A60AlbRUniUti[0]) != 0 )
            {
               GXutil.writeLogln("talbde5:[seudo value changed for attri]"+"AlbRUniUti");
               GXutil.writeLogRaw("Old: ",Z60AlbRUniUti);
               GXutil.writeLogRaw("Current: ",T00T16_A60AlbRUniUti[0]);
            }
            if ( Z52AlbRPieEnt != T00T16_A52AlbRPieEnt[0] )
            {
               GXutil.writeLogln("talbde5:[seudo value changed for attri]"+"AlbRPieEnt");
               GXutil.writeLogRaw("Old: ",Z52AlbRPieEnt);
               GXutil.writeLogRaw("Current: ",T00T16_A52AlbRPieEnt[0]);
            }
            if ( Z54AlbRPieUti != T00T16_A54AlbRPieUti[0] )
            {
               GXutil.writeLogln("talbde5:[seudo value changed for attri]"+"AlbRPieUti");
               GXutil.writeLogRaw("Old: ",Z54AlbRPieUti);
               GXutil.writeLogRaw("Current: ",T00T16_A54AlbRPieUti[0]);
            }
            if ( Z47AlbREst != T00T16_A47AlbREst[0] )
            {
               GXutil.writeLogln("talbde5:[seudo value changed for attri]"+"AlbREst");
               GXutil.writeLogRaw("Old: ",Z47AlbREst);
               GXutil.writeLogRaw("Current: ",T00T16_A47AlbREst[0]);
            }
            if ( GXutil.strcmp(Z56AlbRUni, T00T16_A56AlbRUni[0]) != 0 )
            {
               GXutil.writeLogln("talbde5:[seudo value changed for attri]"+"AlbRUni");
               GXutil.writeLogRaw("Old: ",Z56AlbRUni);
               GXutil.writeLogRaw("Current: ",T00T16_A56AlbRUni[0]);
            }
            if ( GXutil.strcmp(Z45AlbRef, T00T16_A45AlbRef[0]) != 0 )
            {
               GXutil.writeLogln("talbde5:[seudo value changed for attri]"+"AlbRef");
               GXutil.writeLogRaw("Old: ",Z45AlbRef);
               GXutil.writeLogRaw("Current: ",T00T16_A45AlbRef[0]);
            }
            if ( GXutil.strcmp(Z46AlbREnt, T00T16_A46AlbREnt[0]) != 0 )
            {
               GXutil.writeLogln("talbde5:[seudo value changed for attri]"+"AlbREnt");
               GXutil.writeLogRaw("Old: ",Z46AlbREnt);
               GXutil.writeLogRaw("Current: ",T00T16_A46AlbREnt[0]);
            }
            if ( GXutil.strcmp(Z50AlbRLoc, T00T16_A50AlbRLoc[0]) != 0 )
            {
               GXutil.writeLogln("talbde5:[seudo value changed for attri]"+"AlbRLoc");
               GXutil.writeLogRaw("Old: ",Z50AlbRLoc);
               GXutil.writeLogRaw("Current: ",T00T16_A50AlbRLoc[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z49AlbRFen), GXutil.resetTime(T00T16_A49AlbRFen[0])) ) )
            {
               GXutil.writeLogln("talbde5:[seudo value changed for attri]"+"AlbRFen");
               GXutil.writeLogRaw("Old: ",Z49AlbRFen);
               GXutil.writeLogRaw("Current: ",T00T16_A49AlbRFen[0]);
            }
            if ( GXutil.strcmp(Z55AlbRReo, T00T16_A55AlbRReo[0]) != 0 )
            {
               GXutil.writeLogln("talbde5:[seudo value changed for attri]"+"AlbRReo");
               GXutil.writeLogRaw("Old: ",Z55AlbRReo);
               GXutil.writeLogRaw("Current: ",T00T16_A55AlbRReo[0]);
            }
            if ( Z53AlbRPieReb != T00T16_A53AlbRPieReb[0] )
            {
               GXutil.writeLogln("talbde5:[seudo value changed for attri]"+"AlbRPieReb");
               GXutil.writeLogRaw("Old: ",Z53AlbRPieReb);
               GXutil.writeLogRaw("Current: ",T00T16_A53AlbRPieReb[0]);
            }
            if ( DecimalUtil.compareTo(Z59AlbRUniReb, T00T16_A59AlbRUniReb[0]) != 0 )
            {
               GXutil.writeLogln("talbde5:[seudo value changed for attri]"+"AlbRUniReb");
               GXutil.writeLogRaw("Old: ",Z59AlbRUniReb);
               GXutil.writeLogRaw("Current: ",T00T16_A59AlbRUniReb[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z48AlbRFecUlt), GXutil.resetTime(T00T16_A48AlbRFecUlt[0])) ) )
            {
               GXutil.writeLogln("talbde5:[seudo value changed for attri]"+"AlbRFecUlt");
               GXutil.writeLogRaw("Old: ",Z48AlbRFecUlt);
               GXutil.writeLogRaw("Current: ",T00T16_A48AlbRFecUlt[0]);
            }
            if ( Z1222AlbNumEti != T00T16_A1222AlbNumEti[0] )
            {
               GXutil.writeLogln("talbde5:[seudo value changed for attri]"+"AlbNumEti");
               GXutil.writeLogRaw("Old: ",Z1222AlbNumEti);
               GXutil.writeLogRaw("Current: ",T00T16_A1222AlbNumEti[0]);
            }
            if ( GXutil.strcmp(Z1291AlbRDes, T00T16_A1291AlbRDes[0]) != 0 )
            {
               GXutil.writeLogln("talbde5:[seudo value changed for attri]"+"AlbRDes");
               GXutil.writeLogRaw("Old: ",Z1291AlbRDes);
               GXutil.writeLogRaw("Current: ",T00T16_A1291AlbRDes[0]);
            }
            if ( Z840TrnCod != T00T16_A840TrnCod[0] )
            {
               GXutil.writeLogln("talbde5:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T00T16_A840TrnCod[0]);
            }
            if ( Z970ProceCod != T00T16_A970ProceCod[0] )
            {
               GXutil.writeLogln("talbde5:[seudo value changed for attri]"+"ProceCod");
               GXutil.writeLogRaw("Old: ",Z970ProceCod);
               GXutil.writeLogRaw("Current: ",T00T16_A970ProceCod[0]);
            }
            if ( Z1211TipEntCod != T00T16_A1211TipEntCod[0] )
            {
               GXutil.writeLogln("talbde5:[seudo value changed for attri]"+"TipEntCod");
               GXutil.writeLogRaw("Old: ",Z1211TipEntCod);
               GXutil.writeLogRaw("Current: ",T00T16_A1211TipEntCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertT17( )
   {
      beforeValidateT17( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableT17( ) ;
      }
      if ( AnyError == 0 )
      {
         zmT17( 0) ;
         checkOptimisticConcurrencyT17( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmT17( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertT17( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00T121 */
                  pr_default.execute(17, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A252CliCod), A58AlbRUniEnt, A60AlbRUniUti, Integer.valueOf(A52AlbRPieEnt), Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A56AlbRUni, A45AlbRef, A46AlbREnt, A50AlbRLoc, A49AlbRFen, A55AlbRReo, Integer.valueOf(A53AlbRPieReb), A59AlbRUniReb, A48AlbRFecUlt, Short.valueOf(A1222AlbNumEti), A1291AlbRDes, A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
                  if ( (pr_default.getStatus(17) == 1) )
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
                        processLevelT17( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionT10( ) ;
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
            loadT17( ) ;
         }
         endLevelT17( ) ;
      }
      closeExtendedTableCursorsT17( ) ;
   }

   public void updateT17( )
   {
      beforeValidateT17( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableT17( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyT17( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmT17( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateT17( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00T122 */
                  pr_default.execute(18, new Object[] {Integer.valueOf(A252CliCod), A58AlbRUniEnt, A60AlbRUniUti, Integer.valueOf(A52AlbRPieEnt), Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A56AlbRUni, A45AlbRef, A46AlbREnt, A50AlbRLoc, A49AlbRFen, A55AlbRReo, Integer.valueOf(A53AlbRPieReb), A59AlbRUniReb, A48AlbRFecUlt, Short.valueOf(A1222AlbNumEti), A1291AlbRDes, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
                  if ( (pr_default.getStatus(18) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateT17( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char3[0] = A396EmprCod ;
                     GXv_int2[0] = A44AlbRecCod ;
                     new app.txpalbrecupdateredundancy(remoteHandle, context).execute( GXv_char3, GXv_int2) ;
                     talbde5_impl.this.A396EmprCod = GXv_char3[0] ;
                     talbde5_impl.this.A44AlbRecCod = GXv_int2[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelT17( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionT10( ) ;
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
         endLevelT17( ) ;
      }
      closeExtendedTableCursorsT17( ) ;
   }

   public void deferredUpdateT17( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateT17( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyT17( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsT17( ) ;
         afterConfirmT17( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteT17( ) ;
            if ( AnyError == 0 )
            {
               A2147AlbDetKgmD = O2147AlbDetKgmD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
               A2150AlbDetMtrD = O2150AlbDetMtrD ;
               httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
               A2153AlbDetPieU = O2153AlbDetPieU ;
               httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
               A58AlbRUniEnt = O58AlbRUniEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
               A60AlbRUniUti = O60AlbRUniUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
               A52AlbRPieEnt = O52AlbRPieEnt ;
               httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
               A54AlbRPieUti = O54AlbRPieUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
               AV18AlbCum = OV18AlbCum ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
               scanStartT1299( ) ;
               while ( RcdFound299 != 0 )
               {
                  getByPrimaryKeyT1299( ) ;
                  deleteT1299( ) ;
                  scanNextT1299( ) ;
                  O2147AlbDetKgmD = A2147AlbDetKgmD ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
                  O2150AlbDetMtrD = A2150AlbDetMtrD ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
                  O2153AlbDetPieU = A2153AlbDetPieU ;
                  httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
                  O58AlbRUniEnt = A58AlbRUniEnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
                  O60AlbRUniUti = A60AlbRUniUti ;
                  httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                  O52AlbRPieEnt = A52AlbRPieEnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
                  O54AlbRPieUti = A54AlbRPieUti ;
                  httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
                  OV18AlbCum = AV18AlbCum ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
               }
               scanEndT1299( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00T123 */
                  pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound7 == 0 )
                        {
                           initAllT17( ) ;
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
                        resetCaptionT10( ) ;
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
      sMode7 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelT17( ) ;
      Gx_mode = sMode7 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsT17( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00T124 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T00T124_A841TrnNom[0] ;
         n841TrnNom = T00T124_n841TrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
         pr_default.close(20);
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
         {
            A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
         else
         {
            if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
            {
               A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
            }
            else
            {
               A2153AlbDetPieU = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
            }
         }
         if ( A47AlbREst == 1 )
         {
            AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
         }
         else
         {
            if ( A47AlbREst == 0 )
            {
               AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
            }
         }
         /* Using cursor T00T125 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
         A1212TipEntNom = T00T125_A1212TipEntNom[0] ;
         n1212TipEntNom = T00T125_n1212TipEntNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
         pr_default.close(21);
         /* Using cursor T00T126 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
         A971ProceNom = T00T126_A971ProceNom[0] ;
         n971ProceNom = T00T126_n971ProceNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
         pr_default.close(22);
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00T127 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Entradas Almacen Crudo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T00T128 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T00T129 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "UBIIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T00T130 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPPZS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T00T131 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPTAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T00T132 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REPMAT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T00T133 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREPg", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T00T134 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVEM1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T00T135 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBRDF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T00T136 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AlRPieDef", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T00T137 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISEMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T00T138 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBROB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T00T139 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T00T140 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVGEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T00T141 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPIE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
      }
   }

   public void processNestedLevelT1299( )
   {
      s2147AlbDetKgmD = O2147AlbDetKgmD ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      s2150AlbDetMtrD = O2150AlbDetMtrD ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      s2153AlbDetPieU = O2153AlbDetPieU ;
      httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      s58AlbRUniEnt = O58AlbRUniEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      s60AlbRUniUti = O60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      s52AlbRPieEnt = O52AlbRPieEnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      s54AlbRPieUti = O54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      sV18AlbCum = OV18AlbCum ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
      nGXsfl_205_idx = 0 ;
      while ( nGXsfl_205_idx < nRC_GXsfl_205 )
      {
         readRowT1299( ) ;
         if ( ( nRcdExists_299 != 0 ) || ( nIsMod_299 != 0 ) )
         {
            standaloneNotModalT1299( ) ;
            getKeyT1299( ) ;
            if ( ( nRcdExists_299 == 0 ) && ( nRcdDeleted_299 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertT1299( ) ;
            }
            else
            {
               if ( RcdFound299 != 0 )
               {
                  if ( ( nRcdDeleted_299 != 0 ) && ( nRcdExists_299 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteT1299( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_299 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateT1299( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_299 == 0 )
                  {
                     GXCCtl = "ALBRECPIE_" + sGXsfl_205_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbRecPie_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O2147AlbDetKgmD = A2147AlbDetKgmD ;
            httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
            O2150AlbDetMtrD = A2150AlbDetMtrD ;
            httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
            O2153AlbDetPieU = A2153AlbDetPieU ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
            O58AlbRUniEnt = A58AlbRUniEnt ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
            O60AlbRUniUti = A60AlbRUniUti ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
            O52AlbRPieEnt = A52AlbRPieEnt ;
            httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
            O54AlbRPieUti = A54AlbRPieUti ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
            OV18AlbCum = AV18AlbCum ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
         }
         httpContext.changePostValue( edtavnRcdDeleted_299_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecPie_Internalname, GXutil.rtrim( A2159AlbRecPie)) ;
         httpContext.changePostValue( edtAlbRecAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A2154AlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecMtrU_Internalname, GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecKgmU_Internalname, GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2159AlbRecPie_"+sGXsfl_205_idx, GXutil.rtrim( Z2159AlbRecPie)) ;
         httpContext.changePostValue( "ZT_"+"Z4795AlRPieCal_"+sGXsfl_205_idx, GXutil.rtrim( Z4795AlRPieCal)) ;
         httpContext.changePostValue( "ZT_"+"Z2154AlbRecAnh_"+sGXsfl_205_idx, GXutil.ltrim( localUtil.ntoc( Z2154AlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2157AlbRecMtr_"+sGXsfl_205_idx, GXutil.ltrim( localUtil.ntoc( Z2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2155AlbRecKgm_"+sGXsfl_205_idx, GXutil.ltrim( localUtil.ntoc( Z2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2158AlbRecMtrU_"+sGXsfl_205_idx, GXutil.ltrim( localUtil.ntoc( Z2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2156AlbRecKgmU_"+sGXsfl_205_idx, GXutil.ltrim( localUtil.ntoc( Z2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_299_"+sGXsfl_205_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_299_"+sGXsfl_205_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_299_"+sGXsfl_205_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_299 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_299_"+sGXsfl_205_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_299_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECPIE_"+sGXsfl_205_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECANH_"+sGXsfl_205_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecAnh_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECMTR_"+sGXsfl_205_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECKGM_"+sGXsfl_205_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECMTRU_"+sGXsfl_205_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtrU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECKGMU_"+sGXsfl_205_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgmU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* Using cursor T00T143 */
      pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(38) != 101) )
      {
         A2152AlbDetPie = T00T143_A2152AlbDetPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = T00T143_A2149AlbDetMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = T00T143_A2146AlbDetKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = T00T143_A2151AlbDetMtrU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = T00T143_A2148AlbDetKgmU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
      }
      else
      {
         A2152AlbDetPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
      }
      if ( true /* After */ )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int2[0] = A44AlbRecCod ;
         new app.pprueba5(remoteHandle, context).execute( GXv_char3, GXv_int2) ;
         talbde5_impl.this.A396EmprCod = GXv_char3[0] ;
         talbde5_impl.this.A44AlbRecCod = GXv_int2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 )
      {
         A58AlbRUniEnt = A2149AlbDetMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
         {
            A58AlbRUniEnt = A2146AlbDetKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         }
      }
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 )
      {
         A60AlbRUniUti = A2151AlbDetMtrU ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
         {
            A60AlbRUniUti = A2148AlbDetKgmU ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
      }
      A52AlbRPieEnt = A2152AlbDetPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      /* End of After( level) rules */
      initAllT1299( ) ;
      if ( AnyError != 0 )
      {
         O2147AlbDetKgmD = s2147AlbDetKgmD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
         O2150AlbDetMtrD = s2150AlbDetMtrD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
         O2153AlbDetPieU = s2153AlbDetPieU ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         O58AlbRUniEnt = s58AlbRUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         O60AlbRUniUti = s60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         O52AlbRPieEnt = s52AlbRPieEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         O54AlbRPieUti = s54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         OV18AlbCum = sV18AlbCum ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
      }
      nRcdExists_299 = (short)(0) ;
      nIsMod_299 = (short)(0) ;
      nRcdDeleted_299 = (short)(0) ;
   }

   public void processLevelT17( )
   {
      /* Save parent mode. */
      sMode7 = Gx_mode ;
      processNestedLevelT1299( ) ;
      if ( AnyError != 0 )
      {
         O2147AlbDetKgmD = s2147AlbDetKgmD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
         O2150AlbDetMtrD = s2150AlbDetMtrD ;
         httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
         O2153AlbDetPieU = s2153AlbDetPieU ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         O58AlbRUniEnt = s58AlbRUniEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         O60AlbRUniUti = s60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         O52AlbRPieEnt = s52AlbRPieEnt ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         O54AlbRPieUti = s54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         OV18AlbCum = sV18AlbCum ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
      }
      /* Restore parent mode. */
      Gx_mode = sMode7 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T00T144 */
      pr_default.execute(39, new Object[] {A58AlbRUniEnt, A60AlbRUniUti, Integer.valueOf(A52AlbRPieEnt), Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
   }

   public void endLevelT17( )
   {
      pr_default.close(3);
      if ( AnyError == 0 )
      {
         beforeCompleteT17( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "talbde5");
         if ( AnyError == 0 )
         {
            confirmValuesT10( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "talbde5");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartT17( )
   {
      this.A396EmprCod = A396EmprCod ;
      this.A44AlbRecCod = A44AlbRecCod ;
      this.A252CliCod = A252CliCod ;
      /* Scan By routine */
      /* Using cursor T00T145 */
      pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A252CliCod)});
      RcdFound7 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound7 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextT17( )
   {
      /* Scan next routine */
      pr_default.readNext(40);
      RcdFound7 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound7 = (short)(1) ;
      }
   }

   public void scanEndT17( )
   {
      pr_default.close(40);
   }

   public void afterConfirmT17( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertT17( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateT17( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteT17( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteT17( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateT17( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesT17( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtAlbRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      edtTrnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      edtTrnNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnNom_Enabled), 5, 0), true);
      edtAlbREnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbREnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Enabled), 5, 0), true);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), true);
      cmbAlbRUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      edtAlbRLoc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRLoc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRLoc_Enabled), 5, 0), true);
      edtAlbRFen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFen_Enabled), 5, 0), true);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), true);
      cmbAlbRReo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRReo.getEnabled(), 5, 0), true);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      edtAlbRPieReb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieReb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieReb_Enabled), 5, 0), true);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      edtAlbRUniReb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniReb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniReb_Enabled), 5, 0), true);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), true);
      edtAlbRUniDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), true);
      edtAlbRFecUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRFecUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRFecUlt_Enabled), 5, 0), true);
      cmbAlbREst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbREst.getEnabled(), 5, 0), true);
      edtTipEntCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipEntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntCod_Enabled), 5, 0), true);
      edtTipEntNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipEntNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipEntNom_Enabled), 5, 0), true);
      edtAlbNumEti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNumEti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNumEti_Enabled), 5, 0), true);
      edtAlbRDes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRDes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRDes_Enabled), 5, 0), true);
      edtProceCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceCod_Enabled), 5, 0), true);
      edtProceNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProceNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProceNom_Enabled), 5, 0), true);
      edtAlbDetPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetPie_Enabled), 5, 0), true);
      edtAlbDetMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetMtr_Enabled), 5, 0), true);
      edtAlbDetKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetKgm_Enabled), 5, 0), true);
      edtAlbDetMtrU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetMtrU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetMtrU_Enabled), 5, 0), true);
      edtAlbDetKgmU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetKgmU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetKgmU_Enabled), 5, 0), true);
      edtAlbDetMtrD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetMtrD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetMtrD_Enabled), 5, 0), true);
      edtAlbDetKgmD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetKgmD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetKgmD_Enabled), 5, 0), true);
      edtAlbDetPieU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDetPieU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDetPieU_Enabled), 5, 0), true);
   }

   public void zmT1299( int GX_JID )
   {
      if ( ( GX_JID == 60 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4795AlRPieCal = T00T13_A4795AlRPieCal[0] ;
            Z2154AlbRecAnh = T00T13_A2154AlbRecAnh[0] ;
            Z2157AlbRecMtr = T00T13_A2157AlbRecMtr[0] ;
            Z2155AlbRecKgm = T00T13_A2155AlbRecKgm[0] ;
            Z2158AlbRecMtrU = T00T13_A2158AlbRecMtrU[0] ;
            Z2156AlbRecKgmU = T00T13_A2156AlbRecKgmU[0] ;
         }
         else
         {
            Z4795AlRPieCal = A4795AlRPieCal ;
            Z2154AlbRecAnh = A2154AlbRecAnh ;
            Z2157AlbRecMtr = A2157AlbRecMtr ;
            Z2155AlbRecKgm = A2155AlbRecKgm ;
            Z2158AlbRecMtrU = A2158AlbRecMtrU ;
            Z2156AlbRecKgmU = A2156AlbRecKgmU ;
         }
      }
      if ( GX_JID == -60 )
      {
         Z4795AlRPieCal = A4795AlRPieCal ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z2159AlbRecPie = A2159AlbRecPie ;
         Z2154AlbRecAnh = A2154AlbRecAnh ;
         Z2157AlbRecMtr = A2157AlbRecMtr ;
         Z2155AlbRecKgm = A2155AlbRecKgm ;
         Z2158AlbRecMtrU = A2158AlbRecMtrU ;
         Z2156AlbRecKgmU = A2156AlbRecKgmU ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModalT1299( )
   {
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), true);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), true);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), true);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), true);
      A2147AlbDetKgmD = A2146AlbDetKgm.subtract(A2148AlbDetKgmU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrimstr( A2147AlbDetKgmD, 9, 2));
      A2150AlbDetMtrD = A2149AlbDetMtr.subtract(A2151AlbDetMtrU) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrimstr( A2150AlbDetMtrD, 9, 2));
      A52AlbRPieEnt = A2152AlbDetPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
      {
         A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
         else
         {
            A2153AlbDetPieU = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
      }
      O2153AlbDetPieU = A2153AlbDetPieU ;
      httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      A54AlbRPieUti = A2153AlbDetPieU ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 )
      {
         A58AlbRUniEnt = A2149AlbDetMtr ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
         {
            A58AlbRUniEnt = A2146AlbDetKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         }
      }
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 )
      {
         A60AlbRUniUti = A2151AlbDetMtrU ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
         {
            A60AlbRUniUti = A2148AlbDetKgmU ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
      }
   }

   public void standaloneModalT1299( )
   {
      if ( isIns( )  && (0==A47AlbREst) && ( Gx_BScreen == 0 ) )
      {
         A47AlbREst = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      else
      {
         if ( ( A2147AlbDetKgmD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
         {
            A47AlbREst = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
         else
         {
            if ( ( A2150AlbDetMtrD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
            {
               A47AlbREst = (byte)(1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            }
            else
            {
               if ( ( A2147AlbDetKgmD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
               {
                  A47AlbREst = (byte)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
               }
               else
               {
                  if ( ( A2150AlbDetMtrD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
                  {
                     A47AlbREst = (byte)(0) ;
                     httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
                  }
               }
            }
         }
      }
      if ( A47AlbREst == 1 )
      {
         AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
      }
      else
      {
         if ( A47AlbREst == 0 )
         {
            AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
         }
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlbRecPie_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_205_Refreshing);
      }
      else
      {
         edtAlbRecPie_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_205_Refreshing);
      }
   }

   public void loadT1299( )
   {
      /* Using cursor T00T146 */
      pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound299 = (short)(1) ;
         A4795AlRPieCal = T00T146_A4795AlRPieCal[0] ;
         A2154AlbRecAnh = T00T146_A2154AlbRecAnh[0] ;
         A2157AlbRecMtr = T00T146_A2157AlbRecMtr[0] ;
         A2155AlbRecKgm = T00T146_A2155AlbRecKgm[0] ;
         A2158AlbRecMtrU = T00T146_A2158AlbRecMtrU[0] ;
         A2156AlbRecKgmU = T00T146_A2156AlbRecKgmU[0] ;
         zmT1299( -60) ;
      }
      pr_default.close(41);
      onLoadActionsT1299( ) ;
   }

   public void onLoadActionsT1299( )
   {
      GXt_char9 = A4795AlRPieCal ;
      GXv_char3[0] = A396EmprCod ;
      GXv_int2[0] = A44AlbRecCod ;
      GXv_char1[0] = A2159AlbRecPie ;
      GXv_char10[0] = GXt_char9 ;
      new app.ppiecalact(remoteHandle, context).execute( GXv_char3, GXv_int2, GXv_char1, GXv_char10) ;
      talbde5_impl.this.A396EmprCod = GXv_char3[0] ;
      talbde5_impl.this.A44AlbRecCod = GXv_int2[0] ;
      talbde5_impl.this.A2159AlbRecPie = GXv_char1[0] ;
      talbde5_impl.this.GXt_char9 = GXv_char10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      A4795AlRPieCal = GXt_char9 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", A4795AlRPieCal);
   }

   public void checkExtendedTableT1299( )
   {
      nIsDirty_299 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalT1299( ) ;
      nIsDirty_299 = (short)(1) ;
      GXt_char9 = A4795AlRPieCal ;
      GXv_char10[0] = A396EmprCod ;
      GXv_int2[0] = A44AlbRecCod ;
      GXv_char3[0] = A2159AlbRecPie ;
      GXv_char1[0] = GXt_char9 ;
      new app.ppiecalact(remoteHandle, context).execute( GXv_char10, GXv_int2, GXv_char3, GXv_char1) ;
      talbde5_impl.this.A396EmprCod = GXv_char10[0] ;
      talbde5_impl.this.A44AlbRecCod = GXv_int2[0] ;
      talbde5_impl.this.A2159AlbRecPie = GXv_char3[0] ;
      talbde5_impl.this.GXt_char9 = GXv_char1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      A4795AlRPieCal = GXt_char9 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", A4795AlRPieCal);
      if ( true /* Level */ && true /* After */ && (GXutil.strcmp("", A2159AlbRecPie)==0) && ( AV59SumPza == 1 ) )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_int2[0] = A44AlbRecCod ;
         GXv_char3[0] = A2159AlbRecPie ;
         new app.pultpza(remoteHandle, context).execute( GXv_char10, GXv_int2, GXv_char3) ;
         talbde5_impl.this.A396EmprCod = GXv_char10[0] ;
         talbde5_impl.this.A44AlbRecCod = GXv_int2[0] ;
         talbde5_impl.this.A2159AlbRecPie = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      if ( DecimalUtil.compareTo(A2158AlbRecMtrU, A2157AlbRecMtr) > 0 )
      {
         GXCCtl = "ALBRECMTR_" + sGXsfl_205_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Metros Insuficientes", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecMtr_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AV55FlagArt == 1 ) && true /* Level */ && true /* After */ && ( AV56CalMKT == 1 ) )
      {
         GXv_char10[0] = A56AlbRUni ;
         GXv_decimal5[0] = A2157AlbRecMtr ;
         GXv_decimal11[0] = A2155AlbRecKgm ;
         GXv_decimal12[0] = AV54Rdto ;
         GXv_int8[0] = AV53Pesoml ;
         GXv_int7[0] = AV67anc ;
         GXv_int6[0] = AV68grm2 ;
         new app.pcalkmt(remoteHandle, context).execute( GXv_char10, GXv_decimal5, GXv_decimal11, GXv_decimal12, GXv_int8, GXv_int7, GXv_int6) ;
         talbde5_impl.this.A56AlbRUni = GXv_char10[0] ;
         talbde5_impl.this.A2157AlbRecMtr = GXv_decimal5[0] ;
         talbde5_impl.this.A2155AlbRecKgm = GXv_decimal11[0] ;
         talbde5_impl.this.AV54Rdto = GXv_decimal12[0] ;
         talbde5_impl.this.AV53Pesoml = GXv_int8[0] ;
         talbde5_impl.this.AV67anc = GXv_int7[0] ;
         talbde5_impl.this.AV68grm2 = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         httpContext.ajax_rsp_assign_attri("", false, "AV54Rdto", GXutil.ltrimstr( AV54Rdto, 6, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV53Pesoml", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Pesoml), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV67anc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67anc), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV68grm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68grm2), 4, 0));
      }
      if ( DecimalUtil.compareTo(A2156AlbRecKgmU, A2155AlbRecKgm) > 0 )
      {
         GXCCtl = "ALBRECKGM_" + sGXsfl_205_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Kilos Insuficientes", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecKgm_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsT1299( )
   {
   }

   public void enableDisableT1299( )
   {
   }

   public void getKeyT1299( )
   {
      /* Using cursor T00T147 */
      pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(42) != 101) )
      {
         RcdFound299 = (short)(1) ;
      }
      else
      {
         RcdFound299 = (short)(0) ;
      }
      pr_default.close(42);
   }

   public void getByPrimaryKeyT1299( )
   {
      /* Using cursor T00T13 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(1) != 101) && ( T00T13_A44AlbRecCod[0] == A44AlbRecCod ) && ( GXutil.strcmp(T00T13_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmT1299( 60) ;
         RcdFound299 = (short)(1) ;
         initializeNonKeyT1299( ) ;
         A4795AlRPieCal = T00T13_A4795AlRPieCal[0] ;
         A2159AlbRecPie = T00T13_A2159AlbRecPie[0] ;
         A2154AlbRecAnh = T00T13_A2154AlbRecAnh[0] ;
         A2157AlbRecMtr = T00T13_A2157AlbRecMtr[0] ;
         A2155AlbRecKgm = T00T13_A2155AlbRecKgm[0] ;
         A2158AlbRecMtrU = T00T13_A2158AlbRecMtrU[0] ;
         A2156AlbRecKgmU = T00T13_A2156AlbRecKgmU[0] ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z2159AlbRecPie = A2159AlbRecPie ;
         sMode299 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalT1299( ) ;
         loadT1299( ) ;
         Gx_mode = sMode299 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound299 = (short)(0) ;
         initializeNonKeyT1299( ) ;
         sMode299 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalT1299( ) ;
         Gx_mode = sMode299 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesT1299( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyT1299( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00T12 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBDET"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4795AlRPieCal, T00T12_A4795AlRPieCal[0]) != 0 ) || ( Z2154AlbRecAnh != T00T12_A2154AlbRecAnh[0] ) || ( DecimalUtil.compareTo(Z2157AlbRecMtr, T00T12_A2157AlbRecMtr[0]) != 0 ) || ( DecimalUtil.compareTo(Z2155AlbRecKgm, T00T12_A2155AlbRecKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z2158AlbRecMtrU, T00T12_A2158AlbRecMtrU[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z2156AlbRecKgmU, T00T12_A2156AlbRecKgmU[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4795AlRPieCal, T00T12_A4795AlRPieCal[0]) != 0 )
            {
               GXutil.writeLogln("talbde5:[seudo value changed for attri]"+"AlRPieCal");
               GXutil.writeLogRaw("Old: ",Z4795AlRPieCal);
               GXutil.writeLogRaw("Current: ",T00T12_A4795AlRPieCal[0]);
            }
            if ( Z2154AlbRecAnh != T00T12_A2154AlbRecAnh[0] )
            {
               GXutil.writeLogln("talbde5:[seudo value changed for attri]"+"AlbRecAnh");
               GXutil.writeLogRaw("Old: ",Z2154AlbRecAnh);
               GXutil.writeLogRaw("Current: ",T00T12_A2154AlbRecAnh[0]);
            }
            if ( DecimalUtil.compareTo(Z2157AlbRecMtr, T00T12_A2157AlbRecMtr[0]) != 0 )
            {
               GXutil.writeLogln("talbde5:[seudo value changed for attri]"+"AlbRecMtr");
               GXutil.writeLogRaw("Old: ",Z2157AlbRecMtr);
               GXutil.writeLogRaw("Current: ",T00T12_A2157AlbRecMtr[0]);
            }
            if ( DecimalUtil.compareTo(Z2155AlbRecKgm, T00T12_A2155AlbRecKgm[0]) != 0 )
            {
               GXutil.writeLogln("talbde5:[seudo value changed for attri]"+"AlbRecKgm");
               GXutil.writeLogRaw("Old: ",Z2155AlbRecKgm);
               GXutil.writeLogRaw("Current: ",T00T12_A2155AlbRecKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z2158AlbRecMtrU, T00T12_A2158AlbRecMtrU[0]) != 0 )
            {
               GXutil.writeLogln("talbde5:[seudo value changed for attri]"+"AlbRecMtrU");
               GXutil.writeLogRaw("Old: ",Z2158AlbRecMtrU);
               GXutil.writeLogRaw("Current: ",T00T12_A2158AlbRecMtrU[0]);
            }
            if ( DecimalUtil.compareTo(Z2156AlbRecKgmU, T00T12_A2156AlbRecKgmU[0]) != 0 )
            {
               GXutil.writeLogln("talbde5:[seudo value changed for attri]"+"AlbRecKgmU");
               GXutil.writeLogRaw("Old: ",Z2156AlbRecKgmU);
               GXutil.writeLogRaw("Current: ",T00T12_A2156AlbRecKgmU[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBDET"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertT1299( )
   {
      beforeValidateT1299( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableT1299( ) ;
      }
      if ( AnyError == 0 )
      {
         zmT1299( 0) ;
         checkOptimisticConcurrencyT1299( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmT1299( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertT1299( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00T148 */
                  pr_default.execute(43, new Object[] {A4795AlRPieCal, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie, Short.valueOf(A2154AlbRecAnh), A2157AlbRecMtr, A2155AlbRecKgm, A2158AlbRecMtrU, A2156AlbRecKgmU, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
                  if ( (pr_default.getStatus(43) == 1) )
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
            loadT1299( ) ;
         }
         endLevelT1299( ) ;
      }
      closeExtendedTableCursorsT1299( ) ;
   }

   public void updateT1299( )
   {
      beforeValidateT1299( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableT1299( ) ;
      }
      if ( ( nIsMod_299 != 0 ) || ( nIsDirty_299 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyT1299( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmT1299( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateT1299( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00T149 */
                     pr_default.execute(44, new Object[] {A4795AlRPieCal, Short.valueOf(A2154AlbRecAnh), A2157AlbRecMtr, A2155AlbRecKgm, A2158AlbRecMtrU, A2156AlbRecKgmU, A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
                     if ( (pr_default.getStatus(44) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBDET"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateT1299( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char10[0] = A396EmprCod ;
                        GXv_int2[0] = A44AlbRecCod ;
                        new app.txpalbrecupdateredundancy(remoteHandle, context).execute( GXv_char10, GXv_int2) ;
                        talbde5_impl.this.A396EmprCod = GXv_char10[0] ;
                        talbde5_impl.this.A44AlbRecCod = GXv_int2[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyT1299( ) ;
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
            endLevelT1299( ) ;
         }
      }
      closeExtendedTableCursorsT1299( ) ;
   }

   public void deferredUpdateT1299( )
   {
   }

   public void deleteT1299( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateT1299( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyT1299( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsT1299( ) ;
         afterConfirmT1299( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteT1299( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00T150 */
               pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
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
      sMode299 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelT1299( ) ;
      Gx_mode = sMode299 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsT1299( )
   {
      standaloneModalT1299( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00T151 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AlrPiF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T00T152 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HILZPZ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T00T153 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AlRPi1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T00T154 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Historia de las Piezas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T00T155 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AlRPieDef", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
      }
   }

   public void endLevelT1299( )
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

   public void scanStartT1299( )
   {
      /* Scan By routine */
      /* Using cursor T00T156 */
      pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      RcdFound299 = (short)(0) ;
      if ( (pr_default.getStatus(51) != 101) )
      {
         RcdFound299 = (short)(1) ;
         A2159AlbRecPie = T00T156_A2159AlbRecPie[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextT1299( )
   {
      /* Scan next routine */
      pr_default.readNext(51);
      RcdFound299 = (short)(0) ;
      if ( (pr_default.getStatus(51) != 101) )
      {
         RcdFound299 = (short)(1) ;
         A2159AlbRecPie = T00T156_A2159AlbRecPie[0] ;
      }
   }

   public void scanEndT1299( )
   {
      pr_default.close(51);
   }

   public void afterConfirmT1299( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertT1299( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateT1299( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteT1299( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteT1299( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateT1299( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesT1299( )
   {
      edtAlbRecPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_205_Refreshing);
      edtAlbRecAnh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecAnh_Enabled), 5, 0), !bGXsfl_205_Refreshing);
      edtAlbRecMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecMtr_Enabled), 5, 0), !bGXsfl_205_Refreshing);
      edtAlbRecKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecKgm_Enabled), 5, 0), !bGXsfl_205_Refreshing);
      edtAlbRecMtrU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecMtrU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecMtrU_Enabled), 5, 0), !bGXsfl_205_Refreshing);
      edtAlbRecKgmU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecKgmU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecKgmU_Enabled), 5, 0), !bGXsfl_205_Refreshing);
   }

   public void send_integrity_lvl_hashesT1299( )
   {
   }

   public void send_integrity_lvl_hashesT17( )
   {
   }

   public void subsflControlProps_205299( )
   {
      edtavnRcdDeleted_299_Internalname = "vNRCDDELETED_299_"+sGXsfl_205_idx ;
      edtAlbRecPie_Internalname = "ALBRECPIE_"+sGXsfl_205_idx ;
      edtAlbRecAnh_Internalname = "ALBRECANH_"+sGXsfl_205_idx ;
      edtAlbRecMtr_Internalname = "ALBRECMTR_"+sGXsfl_205_idx ;
      edtAlbRecKgm_Internalname = "ALBRECKGM_"+sGXsfl_205_idx ;
      edtAlbRecMtrU_Internalname = "ALBRECMTRU_"+sGXsfl_205_idx ;
      edtAlbRecKgmU_Internalname = "ALBRECKGMU_"+sGXsfl_205_idx ;
   }

   public void subsflControlProps_fel_205299( )
   {
      edtavnRcdDeleted_299_Internalname = "vNRCDDELETED_299_"+sGXsfl_205_fel_idx ;
      edtAlbRecPie_Internalname = "ALBRECPIE_"+sGXsfl_205_fel_idx ;
      edtAlbRecAnh_Internalname = "ALBRECANH_"+sGXsfl_205_fel_idx ;
      edtAlbRecMtr_Internalname = "ALBRECMTR_"+sGXsfl_205_fel_idx ;
      edtAlbRecKgm_Internalname = "ALBRECKGM_"+sGXsfl_205_fel_idx ;
      edtAlbRecMtrU_Internalname = "ALBRECMTRU_"+sGXsfl_205_fel_idx ;
      edtAlbRecKgmU_Internalname = "ALBRECKGMU_"+sGXsfl_205_fel_idx ;
   }

   public void addRowT1299( )
   {
      nGXsfl_205_idx = (int)(nGXsfl_205_idx+1) ;
      sGXsfl_205_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_205_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_205299( ) ;
      sendRowT1299( ) ;
   }

   public void sendRowT1299( )
   {
      Grid1Row = GXWebRow.GetNew(context) ;
      if ( subGrid1_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid1_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Odd" ;
         }
      }
      else if ( subGrid1_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid1_Backstyle = (byte)(0) ;
         subGrid1_Backcolor = subGrid1_Allbackcolor ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Uniform" ;
         }
      }
      else if ( subGrid1_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid1_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
         {
            subGrid1_Linesclass = subGrid1_Class+"Odd" ;
         }
         subGrid1_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid1_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid1_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_205_idx) % (2))) == 0 )
         {
            subGrid1_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Even" ;
            }
         }
         else
         {
            subGrid1_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_205_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 206,'',false,'" + sGXsfl_205_idx + "',205)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_299_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_299_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_299), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_299), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,206);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_299_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_299_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(205),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_205_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 207,'',false,'" + sGXsfl_205_idx + "',205)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecPie_Internalname,GXutil.rtrim( A2159AlbRecPie),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,207);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecPie_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(205),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_205_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 208,'',false,'" + sGXsfl_205_idx + "',205)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecAnh_Internalname,GXutil.ltrim( localUtil.ntoc( A2154AlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecAnh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2154AlbRecAnh), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2154AlbRecAnh), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,208);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecAnh_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecAnh_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(205),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_205_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 209,'',false,'" + sGXsfl_205_idx + "',205)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecMtr_Enabled!=0) ? localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99") : localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,209);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(205),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_205_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 210,'',false,'" + sGXsfl_205_idx + "',205)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecKgm_Enabled!=0) ? localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99") : localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,210);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(205),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_205_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 211,'',false,'" + sGXsfl_205_idx + "',205)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecMtrU_Internalname,GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecMtrU_Enabled!=0) ? localUtil.format( A2158AlbRecMtrU, "ZZZZZ9.99") : localUtil.format( A2158AlbRecMtrU, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,211);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecMtrU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecMtrU_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(205),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_299_" + sGXsfl_205_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 212,'',false,'" + sGXsfl_205_idx + "',205)\"" ;
      ROClassString = "Attribute" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecKgmU_Internalname,GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecKgmU_Enabled!=0) ? localUtil.format( A2156AlbRecKgmU, "ZZZZZ9.99") : localUtil.format( A2156AlbRecKgmU, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,212);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecKgmU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecKgmU_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(205),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashesT1299( ) ;
      GXCCtl = "Z2159AlbRecPie_" + sGXsfl_205_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2159AlbRecPie));
      GXCCtl = "Z4795AlRPieCal_" + sGXsfl_205_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4795AlRPieCal));
      GXCCtl = "Z2154AlbRecAnh_" + sGXsfl_205_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2154AlbRecAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2157AlbRecMtr_" + sGXsfl_205_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2155AlbRecKgm_" + sGXsfl_205_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2158AlbRecMtrU_" + sGXsfl_205_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2156AlbRecKgmU_" + sGXsfl_205_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_299_" + sGXsfl_205_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_299_" + sGXsfl_205_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_299_" + sGXsfl_205_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_299, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vALBREF_" + sGXsfl_205_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV57AlbRef));
      GXCCtl = "vUNIDADES_" + sGXsfl_205_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV46Unidades));
      GXCCtl = "vVDISLOC_" + sGXsfl_205_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV47vDisLoc));
      GXCCtl = "vDISCLINUM_" + sGXsfl_205_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV65DisCliNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_299_"+sGXsfl_205_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_299_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECPIE_"+sGXsfl_205_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECANH_"+sGXsfl_205_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecAnh_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECMTR_"+sGXsfl_205_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECKGM_"+sGXsfl_205_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECMTRU_"+sGXsfl_205_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtrU_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECKGMU_"+sGXsfl_205_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgmU_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRowT1299( )
   {
      nGXsfl_205_idx = (int)(nGXsfl_205_idx+1) ;
      sGXsfl_205_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_205_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_205299( ) ;
      edtavnRcdDeleted_299_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_299_"+sGXsfl_205_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECPIE_"+sGXsfl_205_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecAnh_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECANH_"+sGXsfl_205_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECMTR_"+sGXsfl_205_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECKGM_"+sGXsfl_205_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecMtrU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECMTRU_"+sGXsfl_205_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecKgmU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECKGMU_"+sGXsfl_205_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_299_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_299_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_299");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_299_Internalname ;
         wbErr = true ;
         nRcdDeleted_299 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_299 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_299_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A2159AlbRecPie = httpContext.cgiGet( edtAlbRecPie_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "ALBRECANH_" + sGXsfl_205_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecAnh_Internalname ;
         wbErr = true ;
         A2154AlbRecAnh = (short)(0) ;
      }
      else
      {
         A2154AlbRecAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbRecAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRecMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRecMtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBRECMTR_" + sGXsfl_205_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecMtr_Internalname ;
         wbErr = true ;
         A2157AlbRecMtr = DecimalUtil.ZERO ;
      }
      else
      {
         A2157AlbRecMtr = localUtil.ctond( httpContext.cgiGet( edtAlbRecMtr_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRecKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRecKgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBRECKGM_" + sGXsfl_205_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecKgm_Internalname ;
         wbErr = true ;
         A2155AlbRecKgm = DecimalUtil.ZERO ;
      }
      else
      {
         A2155AlbRecKgm = localUtil.ctond( httpContext.cgiGet( edtAlbRecKgm_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRecMtrU_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRecMtrU_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBRECMTRU_" + sGXsfl_205_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecMtrU_Internalname ;
         wbErr = true ;
         A2158AlbRecMtrU = DecimalUtil.ZERO ;
      }
      else
      {
         A2158AlbRecMtrU = localUtil.ctond( httpContext.cgiGet( edtAlbRecMtrU_Internalname)) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbRecKgmU_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbRecKgmU_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "ALBRECKGMU_" + sGXsfl_205_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecKgmU_Internalname ;
         wbErr = true ;
         A2156AlbRecKgmU = DecimalUtil.ZERO ;
      }
      else
      {
         A2156AlbRecKgmU = localUtil.ctond( httpContext.cgiGet( edtAlbRecKgmU_Internalname)) ;
      }
      GXCCtl = "Z2159AlbRecPie_" + sGXsfl_205_idx ;
      Z2159AlbRecPie = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4795AlRPieCal_" + sGXsfl_205_idx ;
      Z4795AlRPieCal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2154AlbRecAnh_" + sGXsfl_205_idx ;
      Z2154AlbRecAnh = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2157AlbRecMtr_" + sGXsfl_205_idx ;
      Z2157AlbRecMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2155AlbRecKgm_" + sGXsfl_205_idx ;
      Z2155AlbRecKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2158AlbRecMtrU_" + sGXsfl_205_idx ;
      Z2158AlbRecMtrU = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2156AlbRecKgmU_" + sGXsfl_205_idx ;
      Z2156AlbRecKgmU = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4795AlRPieCal_" + sGXsfl_205_idx ;
      A4795AlRPieCal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_299_" + sGXsfl_205_idx ;
      nRcdDeleted_299 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_299_" + sGXsfl_205_idx ;
      nRcdExists_299 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_299_" + sGXsfl_205_idx ;
      nIsMod_299 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtAlbRecPie_Enabled = edtAlbRecPie_Enabled ;
   }

   public void confirmValuesT10( )
   {
      nGXsfl_205_idx = 0 ;
      sGXsfl_205_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_205_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_205299( ) ;
      while ( nGXsfl_205_idx < nRC_GXsfl_205 )
      {
         nGXsfl_205_idx = (int)(nGXsfl_205_idx+1) ;
         sGXsfl_205_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_205_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_205299( ) ;
         httpContext.changePostValue( "Z2159AlbRecPie_"+sGXsfl_205_idx, httpContext.cgiGet( "ZT_"+"Z2159AlbRecPie_"+sGXsfl_205_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2159AlbRecPie_"+sGXsfl_205_idx) ;
         httpContext.changePostValue( "Z4795AlRPieCal_"+sGXsfl_205_idx, httpContext.cgiGet( "ZT_"+"Z4795AlRPieCal_"+sGXsfl_205_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4795AlRPieCal_"+sGXsfl_205_idx) ;
         httpContext.changePostValue( "Z2154AlbRecAnh_"+sGXsfl_205_idx, httpContext.cgiGet( "ZT_"+"Z2154AlbRecAnh_"+sGXsfl_205_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2154AlbRecAnh_"+sGXsfl_205_idx) ;
         httpContext.changePostValue( "Z2157AlbRecMtr_"+sGXsfl_205_idx, httpContext.cgiGet( "ZT_"+"Z2157AlbRecMtr_"+sGXsfl_205_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2157AlbRecMtr_"+sGXsfl_205_idx) ;
         httpContext.changePostValue( "Z2155AlbRecKgm_"+sGXsfl_205_idx, httpContext.cgiGet( "ZT_"+"Z2155AlbRecKgm_"+sGXsfl_205_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2155AlbRecKgm_"+sGXsfl_205_idx) ;
         httpContext.changePostValue( "Z2158AlbRecMtrU_"+sGXsfl_205_idx, httpContext.cgiGet( "ZT_"+"Z2158AlbRecMtrU_"+sGXsfl_205_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2158AlbRecMtrU_"+sGXsfl_205_idx) ;
         httpContext.changePostValue( "Z2156AlbRecKgmU_"+sGXsfl_205_idx, httpContext.cgiGet( "ZT_"+"Z2156AlbRecKgmU_"+sGXsfl_205_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2156AlbRecKgmU_"+sGXsfl_205_idx) ;
      }
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.talbde5", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV57AlbRef)),GXutil.URLEncode(GXutil.rtrim(AV46Unidades)),GXutil.URLEncode(GXutil.rtrim(AV47vDisLoc)),GXutil.URLEncode(GXutil.rtrim(AV65DisCliNum))}, new String[] {"EmprCod","AlbRecCod","CliCod","AlbRef","Unidades","vDisLoc","DisCliNum"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TALBDE5");
      forbiddenHiddens.add("AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      forbiddenHiddens.add("Modo2", GXutil.rtrim( localUtil.format( AV51Modo2, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("talbde5:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( Z60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( Z54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z47AlbREst", GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z56AlbRUni", GXutil.rtrim( Z56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z45AlbRef", GXutil.rtrim( Z45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z46AlbREnt", GXutil.rtrim( Z46AlbREnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z50AlbRLoc", GXutil.rtrim( Z50AlbRLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z49AlbRFen", localUtil.dtoc( Z49AlbRFen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z55AlbRReo", GXutil.rtrim( Z55AlbRReo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z53AlbRPieReb", GXutil.ltrim( localUtil.ntoc( Z53AlbRPieReb, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z59AlbRUniReb", GXutil.ltrim( localUtil.ntoc( Z59AlbRUniReb, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z48AlbRFecUlt", localUtil.dtoc( Z48AlbRFecUlt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1222AlbNumEti", GXutil.ltrim( localUtil.ntoc( Z1222AlbNumEti, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1291AlbRDes", GXutil.rtrim( Z1291AlbRDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z970ProceCod", GXutil.ltrim( localUtil.ntoc( Z970ProceCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1211TipEntCod", GXutil.ltrim( localUtil.ntoc( Z1211TipEntCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_205", GXutil.ltrim( localUtil.ntoc( nGXsfl_205_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MODO2", GXutil.rtrim( AV51Modo2));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODO2", GXutil.rtrim( AV51Modo2));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBCUM", GXutil.rtrim( AV18AlbCum));
      app.GxWebStd.gx_hidden_field( httpContext, "vUNIDADES", GXutil.rtrim( AV46Unidades));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBREF", GXutil.rtrim( AV57AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "vVDISLOC", GXutil.rtrim( AV47vDisLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCLINUM", GXutil.rtrim( AV65DisCliNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGART", GXutil.ltrim( localUtil.ntoc( AV55FlagArt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRDTO", GXutil.ltrim( localUtil.ntoc( AV54Rdto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPESOML", GXutil.ltrim( localUtil.ntoc( AV53Pesoml, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vANC", GXutil.ltrim( localUtil.ntoc( AV67anc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRM2", GXutil.ltrim( localUtil.ntoc( AV68grm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRPIECAL", GXutil.rtrim( A4795AlRPieCal));
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
      return formatLink("app.talbde5", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV57AlbRef)),GXutil.URLEncode(GXutil.rtrim(AV46Unidades)),GXutil.URLEncode(GXutil.rtrim(AV47vDisLoc)),GXutil.URLEncode(GXutil.rtrim(AV65DisCliNum))}, new String[] {"EmprCod","AlbRecCod","CliCod","AlbRef","Unidades","vDisLoc","DisCliNum"})  ;
   }

   public String getPgmname( )
   {
      return "TALBDE5" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ALTA ALBARANES PIEZA (Mts./Kg)", "") ;
   }

   public void initializeNonKeyT17( )
   {
      AV51Modo2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51Modo2", AV51Modo2);
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A60AlbRUniUti = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A52AlbRPieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A54AlbRPieUti = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      AV18AlbCum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", AV18AlbCum);
      A56AlbRUni = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      AV55FlagArt = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55FlagArt", GXutil.str( AV55FlagArt, 1, 0));
      AV54Rdto = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54Rdto", GXutil.ltrimstr( AV54Rdto, 6, 2));
      AV53Pesoml = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53Pesoml", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Pesoml), 4, 0));
      AV67anc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67anc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67anc), 4, 0));
      AV68grm2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68grm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68grm2), 4, 0));
      A57AlbRUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      A2153AlbDetPieU = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      A51AlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      A840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      A841TrnNom = "" ;
      n841TrnNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A53AlbRPieReb = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A53AlbRPieReb), 6, 0));
      A59AlbRUniReb = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrimstr( A59AlbRUniReb, 9, 2));
      A1211TipEntCod = (short)(0) ;
      n1211TipEntCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1211TipEntCod), 4, 0));
      A1212TipEntNom = "" ;
      n1212TipEntNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", A1212TipEntNom);
      A1222AlbNumEti = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1222AlbNumEti), 4, 0));
      A1291AlbRDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", A1291AlbRDes);
      A970ProceCod = (short)(0) ;
      n970ProceCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A970ProceCod), 4, 0));
      A971ProceNom = "" ;
      n971ProceNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", A971ProceNom);
      A47AlbREst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      A45AlbRef = AV57AlbRef ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A46AlbREnt = AV65DisCliNum ;
      httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
      A50AlbRLoc = AV47vDisLoc ;
      httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
      A49AlbRFen = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
      A55AlbRReo = httpContext.getMessage( "NO", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      A48AlbRFecUlt = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z52AlbRPieEnt = 0 ;
      Z54AlbRPieUti = 0 ;
      Z47AlbREst = (byte)(0) ;
      Z56AlbRUni = "" ;
      Z45AlbRef = "" ;
      Z46AlbREnt = "" ;
      Z50AlbRLoc = "" ;
      Z49AlbRFen = GXutil.nullDate() ;
      Z55AlbRReo = "" ;
      Z53AlbRPieReb = 0 ;
      Z59AlbRUniReb = DecimalUtil.ZERO ;
      Z48AlbRFecUlt = GXutil.nullDate() ;
      Z1222AlbNumEti = (short)(0) ;
      Z1291AlbRDes = "" ;
      Z840TrnCod = (short)(0) ;
      Z970ProceCod = (short)(0) ;
      Z1211TipEntCod = (short)(0) ;
   }

   public void initAllT17( )
   {
      initializeNonKeyT17( ) ;
   }

   public void standaloneModalInsert( )
   {
      AV51Modo2 = iV51Modo2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51Modo2", AV51Modo2);
      A49AlbRFen = i49AlbRFen ;
      httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
      A45AlbRef = i45AlbRef ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A55AlbRReo = i55AlbRReo ;
      httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
      A48AlbRFecUlt = i48AlbRFecUlt ;
      httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      A50AlbRLoc = i50AlbRLoc ;
      httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", A50AlbRLoc);
      A46AlbREnt = i46AlbREnt ;
      httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", A46AlbREnt);
   }

   public void initializeNonKeyT1299( )
   {
      A4795AlRPieCal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", A4795AlRPieCal);
      AV56CalMKT = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56CalMKT", GXutil.str( AV56CalMKT, 1, 0));
      AV59SumPza = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59SumPza", GXutil.str( AV59SumPza, 1, 0));
      A2154AlbRecAnh = (short)(0) ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      Z4795AlRPieCal = "" ;
      Z2154AlbRecAnh = (short)(0) ;
      Z2157AlbRecMtr = DecimalUtil.ZERO ;
      Z2155AlbRecKgm = DecimalUtil.ZERO ;
      Z2158AlbRecMtrU = DecimalUtil.ZERO ;
      Z2156AlbRecKgmU = DecimalUtil.ZERO ;
   }

   public void initAllT1299( )
   {
      A2159AlbRecPie = "" ;
      initializeNonKeyT1299( ) ;
   }

   public void standaloneModalInsertT1299( )
   {
      A47AlbREst = i47AlbREst ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241531711", true, true);
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
      httpContext.AddJavascriptSource("talbde5.js", "?20268241531712", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties299( )
   {
      edtAlbRecPie_Enabled = defedtAlbRecPie_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_205_Refreshing);
   }

   public void startgridcontrol205( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("Header", subGrid1_Header);
      Grid1Container.AddObjectProperty("Class", "");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_299, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_299_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2159AlbRecPie));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2154AlbRecAnh, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecAnh_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtrU_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgmU_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtAlbRef_Internalname = "ALBREF" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtTrnNom_Internalname = "TRNNOM" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtAlbREnt_Internalname = "ALBRENT" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT" ;
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      cmbAlbRUni.setInternalname( "ALBRUNI" );
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtAlbRLoc_Internalname = "ALBRLOC" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtAlbRFen_Internalname = "ALBRFEN" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      cmbAlbRReo.setInternalname( "ALBRREO" );
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtAlbRPieReb_Internalname = "ALBRPIEREB" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtAlbRUniReb_Internalname = "ALBRUNIREB" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtAlbRFecUlt_Internalname = "ALBRFECULT" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      cmbAlbREst.setInternalname( "ALBREST" );
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtTipEntCod_Internalname = "TIPENTCOD" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtTipEntNom_Internalname = "TIPENTNOM" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtAlbNumEti_Internalname = "ALBNUMETI" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtAlbRDes_Internalname = "ALBRDES" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtProceCod_Internalname = "PROCECOD" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtProceNom_Internalname = "PROCENOM" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtAlbDetPie_Internalname = "ALBDETPIE" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtAlbDetMtr_Internalname = "ALBDETMTR" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtAlbDetKgm_Internalname = "ALBDETKGM" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtAlbDetMtrU_Internalname = "ALBDETMTRU" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtAlbDetKgmU_Internalname = "ALBDETKGMU" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtAlbDetMtrD_Internalname = "ALBDETMTRD" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtAlbDetKgmD_Internalname = "ALBDETKGMD" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtAlbDetPieU_Internalname = "ALBDETPIEU" ;
      edtavnRcdDeleted_299_Internalname = "vNRCDDELETED_299" ;
      edtAlbRecPie_Internalname = "ALBRECPIE" ;
      edtAlbRecAnh_Internalname = "ALBRECANH" ;
      edtAlbRecMtr_Internalname = "ALBRECMTR" ;
      edtAlbRecKgm_Internalname = "ALBRECKGM" ;
      edtAlbRecMtrU_Internalname = "ALBRECMTRU" ;
      edtAlbRecKgmU_Internalname = "ALBRECKGMU" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
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
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      subGrid1_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "ALTA ALBARANES PIEZA (Mts./Kg)", "") );
      edtAlbRecKgmU_Jsonclick = "" ;
      edtAlbRecMtrU_Jsonclick = "" ;
      edtAlbRecKgm_Jsonclick = "" ;
      edtAlbRecMtr_Jsonclick = "" ;
      edtAlbRecAnh_Jsonclick = "" ;
      edtAlbRecPie_Jsonclick = "" ;
      edtavnRcdDeleted_299_Jsonclick = "" ;
      subGrid1_Class = "" ;
      subGrid1_Backcolorstyle = (byte)(2) ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtAlbRecKgmU_Enabled = 1 ;
      edtAlbRecMtrU_Enabled = 1 ;
      edtAlbRecKgm_Enabled = 1 ;
      edtAlbRecMtr_Enabled = 1 ;
      edtAlbRecAnh_Enabled = 1 ;
      edtAlbRecPie_Enabled = 1 ;
      edtavnRcdDeleted_299_Enabled = 1 ;
      edtAlbDetPieU_Jsonclick = "" ;
      edtAlbDetPieU_Backcolor = (int)(0xFFFFFF) ;
      edtAlbDetPieU_Enabled = 0 ;
      edtAlbDetKgmD_Jsonclick = "" ;
      edtAlbDetKgmD_Backcolor = (int)(0xFFFFFF) ;
      edtAlbDetKgmD_Enabled = 0 ;
      edtAlbDetMtrD_Jsonclick = "" ;
      edtAlbDetMtrD_Backcolor = (int)(0xFFFFFF) ;
      edtAlbDetMtrD_Enabled = 0 ;
      edtAlbDetKgmU_Jsonclick = "" ;
      edtAlbDetKgmU_Backcolor = (int)(0xFFFFFF) ;
      edtAlbDetKgmU_Enabled = 0 ;
      edtAlbDetMtrU_Jsonclick = "" ;
      edtAlbDetMtrU_Backcolor = (int)(0xFFFFFF) ;
      edtAlbDetMtrU_Enabled = 0 ;
      edtAlbDetKgm_Jsonclick = "" ;
      edtAlbDetKgm_Backcolor = (int)(0xFFFFFF) ;
      edtAlbDetKgm_Enabled = 0 ;
      edtAlbDetMtr_Jsonclick = "" ;
      edtAlbDetMtr_Backcolor = (int)(0xFFFFFF) ;
      edtAlbDetMtr_Enabled = 0 ;
      edtAlbDetPie_Jsonclick = "" ;
      edtAlbDetPie_Backcolor = (int)(0xFFFFFF) ;
      edtAlbDetPie_Enabled = 0 ;
      edtProceNom_Jsonclick = "" ;
      edtProceNom_Backcolor = (int)(0xFFFFFF) ;
      edtProceNom_Enabled = 0 ;
      edtProceCod_Jsonclick = "" ;
      edtProceCod_Backcolor = (int)(0xFFFFFF) ;
      edtProceCod_Enabled = 1 ;
      edtAlbRDes_Jsonclick = "" ;
      edtAlbRDes_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRDes_Enabled = 1 ;
      edtAlbNumEti_Jsonclick = "" ;
      edtAlbNumEti_Backcolor = (int)(0xFFFFFF) ;
      edtAlbNumEti_Enabled = 1 ;
      edtTipEntNom_Jsonclick = "" ;
      edtTipEntNom_Backcolor = (int)(0xFFFFFF) ;
      edtTipEntNom_Enabled = 0 ;
      edtTipEntCod_Jsonclick = "" ;
      edtTipEntCod_Backcolor = (int)(0xFFFFFF) ;
      edtTipEntCod_Enabled = 1 ;
      cmbAlbREst.setJsonclick( "" );
      cmbAlbREst.setEnabled( 1 );
      cmbAlbREst.setIBackground( (int)(0xFFFFFF) );
      edtAlbRFecUlt_Jsonclick = "" ;
      edtAlbRFecUlt_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRFecUlt_Enabled = 0 ;
      edtAlbRUniDis_Jsonclick = "" ;
      edtAlbRUniDis_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRUniDis_Enabled = 0 ;
      edtAlbRPieDis_Jsonclick = "" ;
      edtAlbRPieDis_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRPieDis_Enabled = 0 ;
      edtAlbRUniReb_Jsonclick = "" ;
      edtAlbRUniReb_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRUniReb_Enabled = 1 ;
      edtAlbRUniUti_Jsonclick = "" ;
      edtAlbRUniUti_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRUniUti_Enabled = 0 ;
      edtAlbRPieReb_Jsonclick = "" ;
      edtAlbRPieReb_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRPieReb_Enabled = 1 ;
      edtAlbRPieUti_Jsonclick = "" ;
      edtAlbRPieUti_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRPieUti_Enabled = 0 ;
      cmbAlbRReo.setJsonclick( "" );
      cmbAlbRReo.setEnabled( 1 );
      cmbAlbRReo.setIBackground( (int)(0xFFFFFF) );
      edtAlbRUniEnt_Jsonclick = "" ;
      edtAlbRUniEnt_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRUniEnt_Enabled = 0 ;
      edtAlbRFen_Jsonclick = "" ;
      edtAlbRFen_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRFen_Enabled = 1 ;
      edtAlbRLoc_Jsonclick = "" ;
      edtAlbRLoc_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRLoc_Enabled = 1 ;
      cmbAlbRUni.setJsonclick( "" );
      cmbAlbRUni.setEnabled( 1 );
      cmbAlbRUni.setIBackground( (int)(0xFFFFFF) );
      edtAlbRPieEnt_Jsonclick = "" ;
      edtAlbRPieEnt_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRPieEnt_Enabled = 0 ;
      edtAlbREnt_Jsonclick = "" ;
      edtAlbREnt_Backcolor = (int)(0xFFFFFF) ;
      edtAlbREnt_Enabled = 1 ;
      edtTrnNom_Jsonclick = "" ;
      edtTrnNom_Backcolor = (int)(0xFFFFFF) ;
      edtTrnNom_Enabled = 0 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Backcolor = (int)(0xFFFFFF) ;
      edtTrnCod_Enabled = 1 ;
      edtAlbRef_Jsonclick = "" ;
      edtAlbRef_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRef_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbRecCod_Backcolor = (int)(0xFFFFFF) ;
      edtAlbRecCod_Enabled = 0 ;
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

   public void gx30asaalbdetpieuT17( String A396EmprCod ,
                                     int A44AlbRecCod ,
                                     String A56AlbRUni )
   {
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
      {
         A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
         else
         {
            A2153AlbDetPieU = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2153AlbDetPieU, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx35asaalbdetpieuT1299( String A396EmprCod ,
                                       int A44AlbRecCod ,
                                       String A56AlbRUni )
   {
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
      {
         A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
         else
         {
            A2153AlbDetPieU = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2153AlbDetPieU), 4, 0));
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2153AlbDetPieU, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_32_T17( String Gx_mode ,
                          String A396EmprCod ,
                          int A44AlbRecCod ,
                          String A45AlbRef )
   {
      if ( isIns( )  && (0==A44AlbRecCod) && true /* Level */ )
      {
         GXv_int2[0] = A44AlbRecCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "020100", GXv_int2) ;
         A44AlbRecCod = GXv_int2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_33_T17( String A396EmprCod ,
                          int A252CliCod ,
                          String A45AlbRef )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_int2[0] = A252CliCod ;
         GXv_char3[0] = A45AlbRef ;
         GXv_int4[0] = AV55FlagArt ;
         GXv_decimal12[0] = AV54Rdto ;
         GXv_int8[0] = AV53Pesoml ;
         GXv_int7[0] = AV67anc ;
         GXv_int6[0] = AV68grm2 ;
         new app.pbusarp(remoteHandle, context).execute( GXv_char10, GXv_int2, GXv_char3, GXv_int4, GXv_decimal12, GXv_int8, GXv_int7, GXv_int6) ;
         A396EmprCod = GXv_char10[0] ;
         A252CliCod = GXv_int2[0] ;
         A45AlbRef = GXv_char3[0] ;
         AV55FlagArt = GXv_int4[0] ;
         AV54Rdto = GXv_decimal12[0] ;
         AV53Pesoml = GXv_int8[0] ;
         AV67anc = GXv_int7[0] ;
         AV68grm2 = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         httpContext.ajax_rsp_assign_attri("", false, "AV55FlagArt", GXutil.str( AV55FlagArt, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV54Rdto", GXutil.ltrimstr( AV54Rdto, 6, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV53Pesoml", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Pesoml), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV67anc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67anc), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV68grm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68grm2), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A45AlbRef))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV55FlagArt, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV54Rdto, (byte)(6), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV53Pesoml, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV67anc, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV68grm2, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_50_T1299( String A396EmprCod ,
                            int A44AlbRecCod ,
                            short A2154AlbRecAnh )
   {
      if ( true /* After */ )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_int2[0] = A44AlbRecCod ;
         new app.pprueba5(remoteHandle, context).execute( GXv_char10, GXv_int2) ;
         A396EmprCod = GXv_char10[0] ;
         A44AlbRecCod = GXv_int2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_51_T1299( String A56AlbRUni ,
                            java.math.BigDecimal A2157AlbRecMtr ,
                            java.math.BigDecimal A2155AlbRecKgm ,
                            byte AV55FlagArt ,
                            String A2159AlbRecPie ,
                            byte AV56CalMKT )
   {
      if ( ( AV55FlagArt == 1 ) && true /* Level */ && true /* After */ && ( AV56CalMKT == 1 ) )
      {
         GXv_char10[0] = A56AlbRUni ;
         GXv_decimal12[0] = A2157AlbRecMtr ;
         GXv_decimal11[0] = A2155AlbRecKgm ;
         GXv_decimal5[0] = AV54Rdto ;
         GXv_int8[0] = AV53Pesoml ;
         GXv_int7[0] = AV67anc ;
         GXv_int6[0] = AV68grm2 ;
         new app.pcalkmt(remoteHandle, context).execute( GXv_char10, GXv_decimal12, GXv_decimal11, GXv_decimal5, GXv_int8, GXv_int7, GXv_int6) ;
         A56AlbRUni = GXv_char10[0] ;
         A2157AlbRecMtr = GXv_decimal12[0] ;
         A2155AlbRecKgm = GXv_decimal11[0] ;
         AV54Rdto = GXv_decimal5[0] ;
         AV53Pesoml = GXv_int8[0] ;
         AV67anc = GXv_int7[0] ;
         AV68grm2 = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         httpContext.ajax_rsp_assign_attri("", false, "AV54Rdto", GXutil.ltrimstr( AV54Rdto, 6, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV53Pesoml", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53Pesoml), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV67anc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67anc), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV68grm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68grm2), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A56AlbRUni))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV54Rdto, (byte)(6), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV53Pesoml, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV67anc, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV68grm2, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_52_T1299( String A396EmprCod ,
                            int A44AlbRecCod ,
                            String A2159AlbRecPie ,
                            byte AV59SumPza )
   {
      if ( true /* Level */ && true /* After */ && (GXutil.strcmp("", A2159AlbRecPie)==0) && ( AV59SumPza == 1 ) )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_int2[0] = A44AlbRecCod ;
         GXv_char3[0] = A2159AlbRecPie ;
         new app.pultpza(remoteHandle, context).execute( GXv_char10, GXv_int2, GXv_char3) ;
         A396EmprCod = GXv_char10[0] ;
         A44AlbRecCod = GXv_int2[0] ;
         A2159AlbRecPie = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2159AlbRecPie))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_205299( ) ;
      while ( nGXsfl_205_idx <= nRC_GXsfl_205 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalT1299( ) ;
         standaloneModalT1299( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowT1299( ) ;
         nGXsfl_205_idx = (int)(nGXsfl_205_idx+1) ;
         sGXsfl_205_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_205_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_205299( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void init_web_controls( )
   {
      cmbAlbRUni.setName( "ALBRUNI" );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      cmbAlbRReo.setName( "ALBRREO" );
      cmbAlbRReo.setWebtags( "" );
      cmbAlbRReo.addItem("NO", httpContext.getMessage( "NO", ""), (short)(0));
      cmbAlbRReo.addItem("SI", httpContext.getMessage( "SI", ""), (short)(0));
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A55AlbRReo)==0) )
         {
            A55AlbRReo = httpContext.getMessage( "NO", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", A55AlbRReo);
         }
      }
      cmbAlbREst.setName( "ALBREST" );
      cmbAlbREst.setWebtags( "" );
      cmbAlbREst.addItem("0", httpContext.getMessage( "Abierta", ""), (short)(0));
      cmbAlbREst.addItem("1", httpContext.getMessage( "Cerrada", ""), (short)(0));
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         if ( isIns( ) && (0==A47AlbREst) )
         {
            A47AlbREst = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T00T157 */
      pr_default.execute(52, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(52) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00T157_A407EmprNom[0] ;
      n407EmprNom = T00T157_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(52);
      /* Using cursor T00T143 */
      pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(38) != 101) )
      {
         A2152AlbDetPie = T00T143_A2152AlbDetPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = T00T143_A2149AlbDetMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = T00T143_A2146AlbDetKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = T00T143_A2151AlbDetMtrU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = T00T143_A2148AlbDetKgmU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
      }
      else
      {
         A2152AlbDetPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2152AlbDetPie), 4, 0));
         A2149AlbDetMtr = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrimstr( A2149AlbDetMtr, 9, 2));
         A2146AlbDetKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrimstr( A2146AlbDetKgm, 9, 2));
         A2151AlbDetMtrU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrimstr( A2151AlbDetMtrU, 9, 2));
         A2148AlbDetKgmU = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrimstr( A2148AlbDetKgmU, 9, 2));
      }
      pr_default.close(38);
      GX_FocusControl = edtAlbRef_Internalname ;
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

   public void valid_Albreccod( )
   {
      A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValue())) ;
      cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      n44AlbRecCod = false ;
      A56AlbRUni = cmbAlbRUni.getValue() ;
      cmbAlbRUni.setValue( A56AlbRUni );
      A55AlbRReo = cmbAlbRReo.getValue() ;
      cmbAlbRReo.setValue( A55AlbRReo );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         cmbAlbRUni.setValue( A56AlbRUni );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      }
      if ( cmbAlbRReo.getItemCount() > 0 )
      {
         A55AlbRReo = cmbAlbRReo.getValidValue(A55AlbRReo) ;
         cmbAlbRReo.setValue( A55AlbRReo );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
      }
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
         cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", GXutil.rtrim( A56AlbRUni));
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A2147AlbDetKgmD", GXutil.ltrim( localUtil.ntoc( A2147AlbDetKgmD, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2150AlbDetMtrD", GXutil.ltrim( localUtil.ntoc( A2150AlbDetMtrD, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", GXutil.rtrim( A45AlbRef));
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A46AlbREnt", GXutil.rtrim( A46AlbREnt));
      httpContext.ajax_rsp_assign_attri("", false, "A50AlbRLoc", GXutil.rtrim( A50AlbRLoc));
      httpContext.ajax_rsp_assign_attri("", false, "A49AlbRFen", localUtil.format(A49AlbRFen, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A55AlbRReo", GXutil.rtrim( A55AlbRReo));
      cmbAlbRReo.setValue( GXutil.rtrim( A55AlbRReo) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRReo.getInternalname(), "Values", cmbAlbRReo.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A53AlbRPieReb", GXutil.ltrim( localUtil.ntoc( A53AlbRPieReb, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A59AlbRUniReb", GXutil.ltrim( localUtil.ntoc( A59AlbRUniReb, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A48AlbRFecUlt", localUtil.format(A48AlbRFecUlt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A1211TipEntCod", GXutil.ltrim( localUtil.ntoc( A1211TipEntCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1222AlbNumEti", GXutil.ltrim( localUtil.ntoc( A1222AlbNumEti, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1291AlbRDes", GXutil.rtrim( A1291AlbRDes));
      httpContext.ajax_rsp_assign_attri("", false, "A970ProceCod", GXutil.ltrim( localUtil.ntoc( A970ProceCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2152AlbDetPie", GXutil.ltrim( localUtil.ntoc( A2152AlbDetPie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2149AlbDetMtr", GXutil.ltrim( localUtil.ntoc( A2149AlbDetMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2146AlbDetKgm", GXutil.ltrim( localUtil.ntoc( A2146AlbDetKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2151AlbDetMtrU", GXutil.ltrim( localUtil.ntoc( A2151AlbDetMtrU, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2148AlbDetKgmU", GXutil.ltrim( localUtil.ntoc( A2148AlbDetKgmU, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", GXutil.rtrim( A971ProceNom));
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", GXutil.rtrim( A1212TipEntNom));
      httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrim( localUtil.ntoc( A2153AlbDetPieU, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV55FlagArt", GXutil.ltrim( localUtil.ntoc( AV55FlagArt, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV54Rdto", GXutil.ltrim( localUtil.ntoc( AV54Rdto, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV53Pesoml", GXutil.ltrim( localUtil.ntoc( AV53Pesoml, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV67anc", GXutil.ltrim( localUtil.ntoc( AV67anc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV68grm2", GXutil.ltrim( localUtil.ntoc( AV68grm2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", GXutil.rtrim( AV18AlbCum));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z56AlbRUni", GXutil.rtrim( Z56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2147AlbDetKgmD", GXutil.ltrim( localUtil.ntoc( Z2147AlbDetKgmD, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2150AlbDetMtrD", GXutil.ltrim( localUtil.ntoc( Z2150AlbDetMtrD, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z45AlbRef", GXutil.rtrim( Z45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z46AlbREnt", GXutil.rtrim( Z46AlbREnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z50AlbRLoc", GXutil.rtrim( Z50AlbRLoc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z49AlbRFen", localUtil.format(Z49AlbRFen, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z55AlbRReo", GXutil.rtrim( Z55AlbRReo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z53AlbRPieReb", GXutil.ltrim( localUtil.ntoc( Z53AlbRPieReb, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z59AlbRUniReb", GXutil.ltrim( localUtil.ntoc( Z59AlbRUniReb, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z48AlbRFecUlt", localUtil.format(Z48AlbRFecUlt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1211TipEntCod", GXutil.ltrim( localUtil.ntoc( Z1211TipEntCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1222AlbNumEti", GXutil.ltrim( localUtil.ntoc( Z1222AlbNumEti, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1291AlbRDes", GXutil.rtrim( Z1291AlbRDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z970ProceCod", GXutil.ltrim( localUtil.ntoc( Z970ProceCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2152AlbDetPie", GXutil.ltrim( localUtil.ntoc( Z2152AlbDetPie, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2149AlbDetMtr", GXutil.ltrim( localUtil.ntoc( Z2149AlbDetMtr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2146AlbDetKgm", GXutil.ltrim( localUtil.ntoc( Z2146AlbDetKgm, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2151AlbDetMtrU", GXutil.ltrim( localUtil.ntoc( Z2151AlbDetMtrU, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2148AlbDetKgmU", GXutil.ltrim( localUtil.ntoc( Z2148AlbDetKgmU, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z841TrnNom", GXutil.rtrim( Z841TrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z971ProceNom", GXutil.rtrim( Z971ProceNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1212TipEntNom", GXutil.rtrim( Z1212TipEntNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2153AlbDetPieU", GXutil.ltrim( localUtil.ntoc( Z2153AlbDetPieU, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( Z54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV55FlagArt", GXutil.ltrim( localUtil.ntoc( ZV55FlagArt, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV54Rdto", GXutil.ltrim( localUtil.ntoc( ZV54Rdto, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV53Pesoml", GXutil.ltrim( localUtil.ntoc( ZV53Pesoml, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV67anc", GXutil.ltrim( localUtil.ntoc( ZV67anc, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV68grm2", GXutil.ltrim( localUtil.ntoc( ZV68grm2, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( Z51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z47AlbREst", GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( Z60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( Z57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV18AlbCum", GXutil.rtrim( ZV18AlbCum));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Albref( )
   {
      if ( true /* Level */ && true /* After */ )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_int2[0] = A252CliCod ;
         GXv_char3[0] = A45AlbRef ;
         GXv_int4[0] = AV55FlagArt ;
         GXv_decimal12[0] = AV54Rdto ;
         GXv_int8[0] = AV53Pesoml ;
         GXv_int7[0] = AV67anc ;
         GXv_int6[0] = AV68grm2 ;
         new app.pbusarp(remoteHandle, context).execute( GXv_char10, GXv_int2, GXv_char3, GXv_int4, GXv_decimal12, GXv_int8, GXv_int7, GXv_int6) ;
         talbde5_impl.this.A396EmprCod = GXv_char10[0] ;
         A396EmprCod = this.A396EmprCod ;
         talbde5_impl.this.A252CliCod = GXv_int2[0] ;
         A252CliCod = this.A252CliCod ;
         talbde5_impl.this.A45AlbRef = GXv_char3[0] ;
         A45AlbRef = this.A45AlbRef ;
         talbde5_impl.this.AV55FlagArt = GXv_int4[0] ;
         AV55FlagArt = this.AV55FlagArt ;
         talbde5_impl.this.AV54Rdto = GXv_decimal12[0] ;
         AV54Rdto = this.AV54Rdto ;
         talbde5_impl.this.AV53Pesoml = GXv_int8[0] ;
         AV53Pesoml = this.AV53Pesoml ;
         talbde5_impl.this.AV67anc = GXv_int7[0] ;
         AV67anc = this.AV67anc ;
         talbde5_impl.this.AV68grm2 = GXv_int6[0] ;
         AV68grm2 = this.AV68grm2 ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", GXutil.rtrim( A45AlbRef));
      httpContext.ajax_rsp_assign_attri("", false, "AV55FlagArt", GXutil.ltrim( localUtil.ntoc( AV55FlagArt, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV54Rdto", GXutil.ltrim( localUtil.ntoc( AV54Rdto, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV53Pesoml", GXutil.ltrim( localUtil.ntoc( AV53Pesoml, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV67anc", GXutil.ltrim( localUtil.ntoc( AV67anc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV68grm2", GXutil.ltrim( localUtil.ntoc( AV68grm2, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Trncod( )
   {
      n840TrnCod = false ;
      n841TrnNom = false ;
      /* Using cursor T00T124 */
      pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
         }
      }
      A841TrnNom = T00T124_A841TrnNom[0] ;
      n841TrnNom = T00T124_n841TrnNom[0] ;
      pr_default.close(20);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
   }

   public void valid_Albruni( )
   {
      A56AlbRUni = cmbAlbRUni.getValue() ;
      n44AlbRecCod = false ;
      A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValue())) ;
      cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      if ( ! ( ( GXutil.strcmp(A56AlbRUni, "K") == 0 ) || ( GXutil.strcmp(A56AlbRUni, "M") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBRUNI");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbRUni.getInternalname() ;
      }
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 )
      {
         A58AlbRUniEnt = A2149AlbDetMtr ;
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
         {
            A58AlbRUniEnt = A2146AlbDetKgm ;
         }
      }
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 )
      {
         A60AlbRUniUti = A2151AlbDetMtrU ;
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 )
         {
            A60AlbRUniUti = A2148AlbDetKgmU ;
         }
      }
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
      }
      if ( isIns( )  && (0==A47AlbREst) && ( Gx_BScreen == 0 ) )
      {
         A47AlbREst = (byte)(0) ;
         cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      }
      else
      {
         if ( ( A2147AlbDetKgmD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
         {
            A47AlbREst = (byte)(1) ;
            cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
         }
         else
         {
            if ( ( A2150AlbDetMtrD.doubleValue() == 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
            {
               A47AlbREst = (byte)(1) ;
               cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
            }
            else
            {
               if ( ( A2147AlbDetKgmD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) )
               {
                  A47AlbREst = (byte)(0) ;
                  cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
               }
               else
               {
                  if ( ( A2150AlbDetMtrD.doubleValue() != 0 ) && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) )
                  {
                     A47AlbREst = (byte)(0) ;
                     cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
                  }
               }
            }
         }
      }
      if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "M", "")) == 0 )
      {
         A2153AlbDetPieU = (short)(getAlbDetPieU0( A396EmprCod, A44AlbRecCod)) ;
      }
      else
      {
         if ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( "K", "")) == 0 )
         {
            A2153AlbDetPieU = (short)(getAlbDetPieU1( A396EmprCod, A44AlbRecCod)) ;
         }
         else
         {
            A2153AlbDetPieU = (short)(0) ;
         }
      }
      A54AlbRPieUti = A2153AlbDetPieU ;
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      dynload_actions( ) ;
      if ( cmbAlbREst.getItemCount() > 0 )
      {
         A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValidValue(GXutil.trim( GXutil.str( A47AlbREst, 1, 0))))) ;
         cmbAlbREst.setValue( GXutil.str( A47AlbREst, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      cmbAlbREst.setValue( GXutil.trim( GXutil.str( A47AlbREst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbREst.getInternalname(), "Values", cmbAlbREst.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A2153AlbDetPieU", GXutil.ltrim( localUtil.ntoc( A2153AlbDetPieU, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
   }

   public void valid_Albrest( )
   {
      A47AlbREst = (byte)(GXutil.lval( cmbAlbREst.getValue())) ;
      if ( ! ( ( A47AlbREst == 0 ) || ( A47AlbREst == 1 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Estado", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "ALBREST");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbAlbREst.getInternalname() ;
      }
      if ( A47AlbREst == 1 )
      {
         AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "S", ""), "") ;
      }
      else
      {
         if ( A47AlbREst == 0 )
         {
            AV18AlbCum = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbCum", GXutil.rtrim( AV18AlbCum));
   }

   public void valid_Tipentcod( )
   {
      n1211TipEntCod = false ;
      n1212TipEntNom = false ;
      /* Using cursor T00T125 */
      pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n1211TipEntCod), Short.valueOf(A1211TipEntCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1211TipEntCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ENTRAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPENTCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipEntCod_Internalname ;
         }
      }
      A1212TipEntNom = T00T125_A1212TipEntNom[0] ;
      n1212TipEntNom = T00T125_n1212TipEntNom[0] ;
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1212TipEntNom", GXutil.rtrim( A1212TipEntNom));
   }

   public void valid_Procecod( )
   {
      n970ProceCod = false ;
      n971ProceNom = false ;
      /* Using cursor T00T126 */
      pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
      if ( (pr_default.getStatus(22) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A970ProceCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCECOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtProceCod_Internalname ;
         }
      }
      A971ProceNom = T00T126_A971ProceNom[0] ;
      n971ProceNom = T00T126_n971ProceNom[0] ;
      pr_default.close(22);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A971ProceNom", GXutil.rtrim( A971ProceNom));
   }

   public void valid_Albrecpie( )
   {
      n44AlbRecCod = false ;
      GXt_char9 = A4795AlRPieCal ;
      GXv_char10[0] = A396EmprCod ;
      GXv_int2[0] = A44AlbRecCod ;
      GXv_char3[0] = A2159AlbRecPie ;
      GXv_char1[0] = GXt_char9 ;
      new app.ppiecalact(remoteHandle, context).execute( GXv_char10, GXv_int2, GXv_char3, GXv_char1) ;
      talbde5_impl.this.A396EmprCod = GXv_char10[0] ;
      A396EmprCod = this.A396EmprCod ;
      talbde5_impl.this.A44AlbRecCod = GXv_int2[0] ;
      A44AlbRecCod = this.A44AlbRecCod ;
      talbde5_impl.this.A2159AlbRecPie = GXv_char3[0] ;
      A2159AlbRecPie = this.A2159AlbRecPie ;
      talbde5_impl.this.GXt_char9 = GXv_char1[0] ;
      A4795AlRPieCal = GXt_char9 ;
      if ( true /* Level */ && true /* After */ && (GXutil.strcmp("", A2159AlbRecPie)==0) && ( AV59SumPza == 1 ) )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_int2[0] = A44AlbRecCod ;
         GXv_char3[0] = A2159AlbRecPie ;
         new app.pultpza(remoteHandle, context).execute( GXv_char10, GXv_int2, GXv_char3) ;
         talbde5_impl.this.A396EmprCod = GXv_char10[0] ;
         A396EmprCod = this.A396EmprCod ;
         talbde5_impl.this.A44AlbRecCod = GXv_int2[0] ;
         A44AlbRecCod = this.A44AlbRecCod ;
         talbde5_impl.this.A2159AlbRecPie = GXv_char3[0] ;
         A2159AlbRecPie = this.A2159AlbRecPie ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", GXutil.rtrim( A4795AlRPieCal));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2159AlbRecPie", GXutil.rtrim( A2159AlbRecPie));
   }

   public void valid_Albrecmtr( )
   {
      A56AlbRUni = cmbAlbRUni.getValue() ;
      cmbAlbRUni.setValue( A56AlbRUni );
      if ( ( AV55FlagArt == 1 ) && true /* Level */ && true /* After */ && ( AV56CalMKT == 1 ) )
      {
         GXv_char10[0] = A56AlbRUni ;
         GXv_decimal12[0] = A2157AlbRecMtr ;
         GXv_decimal11[0] = A2155AlbRecKgm ;
         GXv_decimal5[0] = AV54Rdto ;
         GXv_int8[0] = AV53Pesoml ;
         GXv_int7[0] = AV67anc ;
         GXv_int6[0] = AV68grm2 ;
         new app.pcalkmt(remoteHandle, context).execute( GXv_char10, GXv_decimal12, GXv_decimal11, GXv_decimal5, GXv_int8, GXv_int7, GXv_int6) ;
         talbde5_impl.this.A56AlbRUni = GXv_char10[0] ;
         A56AlbRUni = this.A56AlbRUni ;
         talbde5_impl.this.A2157AlbRecMtr = GXv_decimal12[0] ;
         A2157AlbRecMtr = this.A2157AlbRecMtr ;
         talbde5_impl.this.A2155AlbRecKgm = GXv_decimal11[0] ;
         A2155AlbRecKgm = this.A2155AlbRecKgm ;
         talbde5_impl.this.AV54Rdto = GXv_decimal5[0] ;
         AV54Rdto = this.AV54Rdto ;
         talbde5_impl.this.AV53Pesoml = GXv_int8[0] ;
         AV53Pesoml = this.AV53Pesoml ;
         talbde5_impl.this.AV67anc = GXv_int7[0] ;
         AV67anc = this.AV67anc ;
         talbde5_impl.this.AV68grm2 = GXv_int6[0] ;
         AV68grm2 = this.AV68grm2 ;
         cmbAlbRUni.setValue( A56AlbRUni );
      }
      dynload_actions( ) ;
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         cmbAlbRUni.setValue( A56AlbRUni );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", GXutil.rtrim( A56AlbRUni));
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A2157AlbRecMtr", GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2155AlbRecKgm", GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV54Rdto", GXutil.ltrim( localUtil.ntoc( AV54Rdto, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV53Pesoml", GXutil.ltrim( localUtil.ntoc( AV53Pesoml, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV67anc", GXutil.ltrim( localUtil.ntoc( AV67anc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV68grm2", GXutil.ltrim( localUtil.ntoc( AV68grm2, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV57AlbRef',fld:'vALBREF',pic:''},{av:'AV46Unidades',fld:'vUNIDADES',pic:'@!'},{av:'AV47vDisLoc',fld:'vVDISLOC',pic:''},{av:'AV65DisCliNum',fld:'vDISCLINUM',pic:''}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A48AlbRFecUlt',fld:'ALBRFECULT',pic:''},{av:'AV51Modo2',fld:'vMODO2',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'A2153AlbDetPieU',fld:'ALBDETPIEU',pic:'ZZZ9'},{av:'A2150AlbDetMtrD',fld:'ALBDETMTRD',pic:'ZZZZZ9.99'},{av:'A2147AlbDetKgmD',fld:'ALBDETKGMD',pic:'ZZZZZ9.99'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV46Unidades',fld:'vUNIDADES',pic:'@!'},{av:'A2152AlbDetPie',fld:'ALBDETPIE',pic:'ZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'AV57AlbRef',fld:'vALBREF',pic:''},{av:'AV47vDisLoc',fld:'vVDISLOC',pic:''},{av:'AV65DisCliNum',fld:'vDISCLINUM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A2149AlbDetMtr',fld:'ALBDETMTR',pic:'ZZZZZ9.99'},{av:'A2151AlbDetMtrU',fld:'ALBDETMTRU',pic:'ZZZZZ9.99'},{av:'A2146AlbDetKgm',fld:'ALBDETKGM',pic:'ZZZZZ9.99'},{av:'A2148AlbDetKgmU',fld:'ALBDETKGMU',pic:'ZZZZZ9.99'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV51Modo2',fld:'vMODO2',pic:''},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A49AlbRFen',fld:'ALBRFEN',pic:''},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'cmbAlbRReo'},{av:'A55AlbRReo',fld:'ALBRREO',pic:'@!'},{av:'A48AlbRFecUlt',fld:'ALBRFECULT',pic:''},{av:'A50AlbRLoc',fld:'ALBRLOC',pic:''},{av:'A46AlbREnt',fld:'ALBRENT',pic:''},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV55FlagArt',fld:'vFLAGART',pic:'9'},{av:'AV54Rdto',fld:'vRDTO',pic:'ZZ9.99'},{av:'AV53Pesoml',fld:'vPESOML',pic:'ZZZ9'},{av:'AV67anc',fld:'vANC',pic:'ZZZ9'},{av:'AV68grm2',fld:'vGRM2',pic:'ZZZ9'},{av:'AV18AlbCum',fld:'vALBCUM',pic:''}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A2147AlbDetKgmD',fld:'ALBDETKGMD',pic:'ZZZZZ9.99'},{av:'A2150AlbDetMtrD',fld:'ALBDETMTRD',pic:'ZZZZZ9.99'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A46AlbREnt',fld:'ALBRENT',pic:''},{av:'A50AlbRLoc',fld:'ALBRLOC',pic:''},{av:'A49AlbRFen',fld:'ALBRFEN',pic:''},{av:'cmbAlbRReo'},{av:'A55AlbRReo',fld:'ALBRREO',pic:'@!'},{av:'A53AlbRPieReb',fld:'ALBRPIEREB',pic:'ZZZ9'},{av:'A59AlbRUniReb',fld:'ALBRUNIREB',pic:'ZZZZZ9.99'},{av:'A48AlbRFecUlt',fld:'ALBRFECULT',pic:''},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'},{av:'A1222AlbNumEti',fld:'ALBNUMETI',pic:'ZZZ9'},{av:'A1291AlbRDes',fld:'ALBRDES',pic:''},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'A2152AlbDetPie',fld:'ALBDETPIE',pic:'ZZZ9'},{av:'A2149AlbDetMtr',fld:'ALBDETMTR',pic:'ZZZZZ9.99'},{av:'A2146AlbDetKgm',fld:'ALBDETKGM',pic:'ZZZZZ9.99'},{av:'A2151AlbDetMtrU',fld:'ALBDETMTRU',pic:'ZZZZZ9.99'},{av:'A2148AlbDetKgmU',fld:'ALBDETKGMU',pic:'ZZZZZ9.99'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'A971ProceNom',fld:'PROCENOM',pic:''},{av:'A1212TipEntNom',fld:'TIPENTNOM',pic:''},{av:'A2153AlbDetPieU',fld:'ALBDETPIEU',pic:'ZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV55FlagArt',fld:'vFLAGART',pic:'9'},{av:'AV54Rdto',fld:'vRDTO',pic:'ZZ9.99'},{av:'AV53Pesoml',fld:'vPESOML',pic:'ZZZ9'},{av:'AV67anc',fld:'vANC',pic:'ZZZ9'},{av:'AV68grm2',fld:'vGRM2',pic:'ZZZ9'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV18AlbCum',fld:'vALBCUM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z44AlbRecCod'},{av:'Z52AlbRPieEnt'},{av:'Z56AlbRUni'},{av:'Z2147AlbDetKgmD'},{av:'Z2150AlbDetMtrD'},{av:'Z407EmprNom'},{av:'Z279CliNom'},{av:'Z45AlbRef'},{av:'Z840TrnCod'},{av:'Z46AlbREnt'},{av:'Z50AlbRLoc'},{av:'Z49AlbRFen'},{av:'Z55AlbRReo'},{av:'Z53AlbRPieReb'},{av:'Z59AlbRUniReb'},{av:'Z48AlbRFecUlt'},{av:'Z1211TipEntCod'},{av:'Z1222AlbNumEti'},{av:'Z1291AlbRDes'},{av:'Z970ProceCod'},{av:'Z2152AlbDetPie'},{av:'Z2149AlbDetMtr'},{av:'Z2146AlbDetKgm'},{av:'Z2151AlbDetMtrU'},{av:'Z2148AlbDetKgmU'},{av:'Z252CliCod'},{av:'Z841TrnNom'},{av:'Z971ProceNom'},{av:'Z1212TipEntNom'},{av:'Z2153AlbDetPieU'},{av:'Z54AlbRPieUti'},{av:'ZV55FlagArt'},{av:'ZV54Rdto'},{av:'ZV53Pesoml'},{av:'ZV67anc'},{av:'ZV68grm2'},{av:'Z51AlbRPieDis'},{av:'Z58AlbRUniEnt'},{av:'Z47AlbREst'},{av:'Z60AlbRUniUti'},{av:'Z57AlbRUniDis'},{av:'ZV18AlbCum'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_ALBREF","{handler:'valid_Albref',iparms:[{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'AV55FlagArt',fld:'vFLAGART',pic:'9'},{av:'AV54Rdto',fld:'vRDTO',pic:'ZZ9.99'},{av:'AV53Pesoml',fld:'vPESOML',pic:'ZZZ9'},{av:'AV67anc',fld:'vANC',pic:'ZZZ9'},{av:'AV68grm2',fld:'vGRM2',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBREF",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'AV55FlagArt',fld:'vFLAGART',pic:'9'},{av:'AV54Rdto',fld:'vRDTO',pic:'ZZ9.99'},{av:'AV53Pesoml',fld:'vPESOML',pic:'ZZZ9'},{av:'AV67anc',fld:'vANC',pic:'ZZZ9'},{av:'AV68grm2',fld:'vGRM2',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A841TrnNom',fld:'TRNNOM',pic:''}]");
      setEventMetadata("VALID_TRNCOD",",oparms:[{av:'A841TrnNom',fld:'TRNNOM',pic:''}]}");
      setEventMetadata("VALID_ALBRPIEENT","{handler:'valid_Albrpieent',iparms:[]");
      setEventMetadata("VALID_ALBRPIEENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNI","{handler:'valid_Albruni',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A2149AlbDetMtr',fld:'ALBDETMTR',pic:'ZZZZZ9.99'},{av:'A2146AlbDetKgm',fld:'ALBDETKGM',pic:'ZZZZZ9.99'},{av:'A2151AlbDetMtrU',fld:'ALBDETMTRU',pic:'ZZZZZ9.99'},{av:'A2148AlbDetKgmU',fld:'ALBDETKGMU',pic:'ZZZZZ9.99'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A2147AlbDetKgmD',fld:'ALBDETKGMD',pic:'ZZZZZ9.99'},{av:'A2150AlbDetMtrD',fld:'ALBDETMTRD',pic:'ZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A2153AlbDetPieU',fld:'ALBDETPIEU',pic:'ZZZ9'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_ALBRUNI",",oparms:[{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A2153AlbDetPieU',fld:'ALBDETPIEU',pic:'ZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_ALBRUNIENT","{handler:'valid_Albrunient',iparms:[]");
      setEventMetadata("VALID_ALBRUNIENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRREO","{handler:'valid_Albrreo',iparms:[]");
      setEventMetadata("VALID_ALBRREO",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEUTI","{handler:'valid_Albrpieuti',iparms:[]");
      setEventMetadata("VALID_ALBRPIEUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIUTI","{handler:'valid_Albruniuti',iparms:[]");
      setEventMetadata("VALID_ALBRUNIUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBREST","{handler:'valid_Albrest',iparms:[{av:'cmbAlbREst'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'AV18AlbCum',fld:'vALBCUM',pic:''}]");
      setEventMetadata("VALID_ALBREST",",oparms:[{av:'AV18AlbCum',fld:'vALBCUM',pic:''}]}");
      setEventMetadata("VALID_TIPENTCOD","{handler:'valid_Tipentcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1211TipEntCod',fld:'TIPENTCOD',pic:'ZZZ9'},{av:'A1212TipEntNom',fld:'TIPENTNOM',pic:''}]");
      setEventMetadata("VALID_TIPENTCOD",",oparms:[{av:'A1212TipEntNom',fld:'TIPENTNOM',pic:''}]}");
      setEventMetadata("VALID_PROCECOD","{handler:'valid_Procecod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A970ProceCod',fld:'PROCECOD',pic:'ZZZ9'},{av:'A971ProceNom',fld:'PROCENOM',pic:''}]");
      setEventMetadata("VALID_PROCECOD",",oparms:[{av:'A971ProceNom',fld:'PROCENOM',pic:''}]}");
      setEventMetadata("VALID_ALBDETPIE","{handler:'valid_Albdetpie',iparms:[]");
      setEventMetadata("VALID_ALBDETPIE",",oparms:[]}");
      setEventMetadata("VALID_ALBDETMTR","{handler:'valid_Albdetmtr',iparms:[]");
      setEventMetadata("VALID_ALBDETMTR",",oparms:[]}");
      setEventMetadata("VALID_ALBDETKGM","{handler:'valid_Albdetkgm',iparms:[]");
      setEventMetadata("VALID_ALBDETKGM",",oparms:[]}");
      setEventMetadata("VALID_ALBDETMTRU","{handler:'valid_Albdetmtru',iparms:[]");
      setEventMetadata("VALID_ALBDETMTRU",",oparms:[]}");
      setEventMetadata("VALID_ALBDETKGMU","{handler:'valid_Albdetkgmu',iparms:[]");
      setEventMetadata("VALID_ALBDETKGMU",",oparms:[]}");
      setEventMetadata("VALID_ALBDETMTRD","{handler:'valid_Albdetmtrd',iparms:[]");
      setEventMetadata("VALID_ALBDETMTRD",",oparms:[]}");
      setEventMetadata("VALID_ALBDETKGMD","{handler:'valid_Albdetkgmd',iparms:[]");
      setEventMetadata("VALID_ALBDETKGMD",",oparms:[]}");
      setEventMetadata("VALID_ALBDETPIEU","{handler:'valid_Albdetpieu',iparms:[]");
      setEventMetadata("VALID_ALBDETPIEU",",oparms:[]}");
      setEventMetadata("VALID_ALBRECPIE","{handler:'valid_Albrecpie',iparms:[{av:'AV59SumPza',fld:'vSUMPZA',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A2159AlbRecPie',fld:'ALBRECPIE',pic:''},{av:'A4795AlRPieCal',fld:'ALRPIECAL',pic:''}]");
      setEventMetadata("VALID_ALBRECPIE",",oparms:[{av:'A4795AlRPieCal',fld:'ALRPIECAL',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A2159AlbRecPie',fld:'ALBRECPIE',pic:''}]}");
      setEventMetadata("VALID_ALBRECMTR","{handler:'valid_Albrecmtr',iparms:[{av:'AV56CalMKT',fld:'vCALMKT',pic:'9'},{av:'A2159AlbRecPie',fld:'ALBRECPIE',pic:''},{av:'AV55FlagArt',fld:'vFLAGART',pic:'9'},{av:'A2155AlbRecKgm',fld:'ALBRECKGM',pic:'ZZZZZ9.99'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A2157AlbRecMtr',fld:'ALBRECMTR',pic:'ZZZZZ9.99'},{av:'AV54Rdto',fld:'vRDTO',pic:'ZZ9.99'},{av:'AV53Pesoml',fld:'vPESOML',pic:'ZZZ9'},{av:'AV67anc',fld:'vANC',pic:'ZZZ9'},{av:'AV68grm2',fld:'vGRM2',pic:'ZZZ9'}]");
      setEventMetadata("VALID_ALBRECMTR",",oparms:[{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A2157AlbRecMtr',fld:'ALBRECMTR',pic:'ZZZZZ9.99'},{av:'A2155AlbRecKgm',fld:'ALBRECKGM',pic:'ZZZZZ9.99'},{av:'AV54Rdto',fld:'vRDTO',pic:'ZZ9.99'},{av:'AV53Pesoml',fld:'vPESOML',pic:'ZZZ9'},{av:'AV67anc',fld:'vANC',pic:'ZZZ9'},{av:'AV68grm2',fld:'vGRM2',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_ALBRECKGM","{handler:'valid_Albreckgm',iparms:[]");
      setEventMetadata("VALID_ALBRECKGM",",oparms:[]}");
      setEventMetadata("VALID_ALBRECMTRU","{handler:'valid_Albrecmtru',iparms:[]");
      setEventMetadata("VALID_ALBRECMTRU",",oparms:[]}");
      setEventMetadata("VALID_ALBRECKGMU","{handler:'valid_Albreckgmu',iparms:[]");
      setEventMetadata("VALID_ALBRECKGMU",",oparms:[]}");
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
      pr_default.close(52);
      pr_default.close(20);
      pr_default.close(22);
      pr_default.close(21);
      pr_default.close(38);
   }

   /* Aggregate/select formulas */
   public int getAlbDetPieU1( String E396EmprCod ,
                              int E44AlbRecCod )
   {
      Gx_cnt = 0 ;
      /* Using cursor T00T158 */
      pr_default.execute(53, new Object[] {E396EmprCod, Boolean.valueOf(nA44AlbRecCod), Integer.valueOf(E44AlbRecCod)});
      if ( (pr_default.getStatus(53) != 101) )
      {
         Gx_cnt = T00T158_Gx_cnt[0] ;
      }
      pr_default.close(53);
      return Gx_cnt ;
   }

   public int getAlbDetPieU0( String E396EmprCod ,
                              int E44AlbRecCod )
   {
      Gx_cnt = 0 ;
      /* Using cursor T00T159 */
      pr_default.execute(54, new Object[] {E396EmprCod, Boolean.valueOf(nE44AlbRecCod), Integer.valueOf(E44AlbRecCod)});
      if ( (pr_default.getStatus(54) != 101) )
      {
         Gx_cnt = T00T159_Gx_cnt[0] ;
      }
      pr_default.close(54);
      return Gx_cnt ;
   }

   public void initialize( )
   {
      sPrefix = "" ;
      wcpOA396EmprCod = "" ;
      wcpOAV57AlbRef = "" ;
      wcpOAV46Unidades = "" ;
      wcpOAV47vDisLoc = "" ;
      wcpOAV65DisCliNum = "" ;
      Z396EmprCod = "" ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z56AlbRUni = "" ;
      Z45AlbRef = "" ;
      Z46AlbREnt = "" ;
      Z50AlbRLoc = "" ;
      Z49AlbRFen = GXutil.nullDate() ;
      Z55AlbRReo = "" ;
      Z59AlbRUniReb = DecimalUtil.ZERO ;
      Z48AlbRFecUlt = GXutil.nullDate() ;
      Z1291AlbRDes = "" ;
      Z2159AlbRecPie = "" ;
      Z4795AlRPieCal = "" ;
      Z2157AlbRecMtr = DecimalUtil.ZERO ;
      Z2155AlbRecKgm = DecimalUtil.ZERO ;
      Z2158AlbRecMtrU = DecimalUtil.ZERO ;
      Z2156AlbRecKgmU = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A45AlbRef = "" ;
      A56AlbRUni = "" ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2159AlbRecPie = "" ;
      AV57AlbRef = "" ;
      AV46Unidades = "" ;
      AV47vDisLoc = "" ;
      AV65DisCliNum = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A2147AlbDetKgmD = DecimalUtil.ZERO ;
      A2150AlbDetMtrD = DecimalUtil.ZERO ;
      A2146AlbDetKgm = DecimalUtil.ZERO ;
      A2148AlbDetKgmU = DecimalUtil.ZERO ;
      A2149AlbDetMtr = DecimalUtil.ZERO ;
      A2151AlbDetMtrU = DecimalUtil.ZERO ;
      A55AlbRReo = "" ;
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
      bttBtn_get_Jsonclick = "" ;
      lblTextblock3_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock4_Jsonclick = "" ;
      lblTextblock5_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A841TrnNom = "" ;
      lblTextblock9_Jsonclick = "" ;
      A46AlbREnt = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      A50AlbRLoc = "" ;
      lblTextblock13_Jsonclick = "" ;
      A49AlbRFen = GXutil.nullDate() ;
      lblTextblock14_Jsonclick = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      lblTextblock17_Jsonclick = "" ;
      lblTextblock18_Jsonclick = "" ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      lblTextblock19_Jsonclick = "" ;
      A59AlbRUniReb = DecimalUtil.ZERO ;
      lblTextblock20_Jsonclick = "" ;
      lblTextblock21_Jsonclick = "" ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      lblTextblock22_Jsonclick = "" ;
      A48AlbRFecUlt = GXutil.nullDate() ;
      lblTextblock23_Jsonclick = "" ;
      lblTextblock24_Jsonclick = "" ;
      lblTextblock25_Jsonclick = "" ;
      A1212TipEntNom = "" ;
      lblTextblock26_Jsonclick = "" ;
      lblTextblock27_Jsonclick = "" ;
      A1291AlbRDes = "" ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      A971ProceNom = "" ;
      lblTextblock30_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      lblTextblock34_Jsonclick = "" ;
      lblTextblock35_Jsonclick = "" ;
      lblTextblock36_Jsonclick = "" ;
      lblTextblock37_Jsonclick = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode299 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV51Modo2 = "" ;
      AV17UsurCod = "" ;
      AV18AlbCum = "" ;
      AV54Rdto = DecimalUtil.ZERO ;
      A4795AlRPieCal = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode7 = "" ;
      s2147AlbDetKgmD = DecimalUtil.ZERO ;
      O2147AlbDetKgmD = DecimalUtil.ZERO ;
      s2150AlbDetMtrD = DecimalUtil.ZERO ;
      O2150AlbDetMtrD = DecimalUtil.ZERO ;
      s58AlbRUniEnt = DecimalUtil.ZERO ;
      O58AlbRUniEnt = DecimalUtil.ZERO ;
      s60AlbRUniUti = DecimalUtil.ZERO ;
      O60AlbRUniUti = DecimalUtil.ZERO ;
      sV18AlbCum = "" ;
      OV18AlbCum = "" ;
      GXCCtl = "" ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      T00T15_A2152AlbDetPie = new short[1] ;
      T00T15_A2149AlbDetMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T15_A2146AlbDetKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T15_A2151AlbDetMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T15_A2148AlbDetKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z2149AlbDetMtr = DecimalUtil.ZERO ;
      Z2146AlbDetKgm = DecimalUtil.ZERO ;
      Z2151AlbDetMtrU = DecimalUtil.ZERO ;
      Z2148AlbDetKgmU = DecimalUtil.ZERO ;
      Z841TrnNom = "" ;
      Z1212TipEntNom = "" ;
      Z971ProceNom = "" ;
      T00T18_A407EmprNom = new String[] {""} ;
      T00T18_n407EmprNom = new boolean[] {false} ;
      T00T19_A279CliNom = new String[] {""} ;
      T00T114_A44AlbRecCod = new int[1] ;
      T00T114_n44AlbRecCod = new boolean[] {false} ;
      T00T114_A252CliCod = new int[1] ;
      T00T114_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T114_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T114_A52AlbRPieEnt = new int[1] ;
      T00T114_A54AlbRPieUti = new int[1] ;
      T00T114_A47AlbREst = new byte[1] ;
      T00T114_A56AlbRUni = new String[] {""} ;
      T00T114_A407EmprNom = new String[] {""} ;
      T00T114_n407EmprNom = new boolean[] {false} ;
      T00T114_A279CliNom = new String[] {""} ;
      T00T114_A45AlbRef = new String[] {""} ;
      T00T114_A841TrnNom = new String[] {""} ;
      T00T114_n841TrnNom = new boolean[] {false} ;
      T00T114_A46AlbREnt = new String[] {""} ;
      T00T114_A50AlbRLoc = new String[] {""} ;
      T00T114_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T00T114_A55AlbRReo = new String[] {""} ;
      T00T114_A53AlbRPieReb = new int[1] ;
      T00T114_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T114_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T00T114_A1212TipEntNom = new String[] {""} ;
      T00T114_n1212TipEntNom = new boolean[] {false} ;
      T00T114_A1222AlbNumEti = new short[1] ;
      T00T114_A1291AlbRDes = new String[] {""} ;
      T00T114_A971ProceNom = new String[] {""} ;
      T00T114_n971ProceNom = new boolean[] {false} ;
      T00T114_A396EmprCod = new String[] {""} ;
      T00T114_A840TrnCod = new short[1] ;
      T00T114_n840TrnCod = new boolean[] {false} ;
      T00T114_A970ProceCod = new short[1] ;
      T00T114_n970ProceCod = new boolean[] {false} ;
      T00T114_A1211TipEntCod = new short[1] ;
      T00T114_n1211TipEntCod = new boolean[] {false} ;
      T00T114_A2152AlbDetPie = new short[1] ;
      T00T114_A2149AlbDetMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T114_A2146AlbDetKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T114_A2151AlbDetMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T114_A2148AlbDetKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T110_A841TrnNom = new String[] {""} ;
      T00T110_n841TrnNom = new boolean[] {false} ;
      T00T111_A971ProceNom = new String[] {""} ;
      T00T111_n971ProceNom = new boolean[] {false} ;
      T00T112_A1212TipEntNom = new String[] {""} ;
      T00T112_n1212TipEntNom = new boolean[] {false} ;
      T00T115_A841TrnNom = new String[] {""} ;
      T00T115_n841TrnNom = new boolean[] {false} ;
      T00T116_A971ProceNom = new String[] {""} ;
      T00T116_n971ProceNom = new boolean[] {false} ;
      T00T117_A1212TipEntNom = new String[] {""} ;
      T00T117_n1212TipEntNom = new boolean[] {false} ;
      T00T118_A396EmprCod = new String[] {""} ;
      T00T118_A44AlbRecCod = new int[1] ;
      T00T118_n44AlbRecCod = new boolean[] {false} ;
      T00T17_A44AlbRecCod = new int[1] ;
      T00T17_n44AlbRecCod = new boolean[] {false} ;
      T00T17_A252CliCod = new int[1] ;
      T00T17_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T17_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T17_A52AlbRPieEnt = new int[1] ;
      T00T17_A54AlbRPieUti = new int[1] ;
      T00T17_A47AlbREst = new byte[1] ;
      T00T17_A56AlbRUni = new String[] {""} ;
      T00T17_A45AlbRef = new String[] {""} ;
      T00T17_A46AlbREnt = new String[] {""} ;
      T00T17_A50AlbRLoc = new String[] {""} ;
      T00T17_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T00T17_A55AlbRReo = new String[] {""} ;
      T00T17_A53AlbRPieReb = new int[1] ;
      T00T17_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T17_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T00T17_A1222AlbNumEti = new short[1] ;
      T00T17_A1291AlbRDes = new String[] {""} ;
      T00T17_A396EmprCod = new String[] {""} ;
      T00T17_A840TrnCod = new short[1] ;
      T00T17_n840TrnCod = new boolean[] {false} ;
      T00T17_A970ProceCod = new short[1] ;
      T00T17_n970ProceCod = new boolean[] {false} ;
      T00T17_A1211TipEntCod = new short[1] ;
      T00T17_n1211TipEntCod = new boolean[] {false} ;
      T00T119_A396EmprCod = new String[] {""} ;
      T00T119_A44AlbRecCod = new int[1] ;
      T00T119_n44AlbRecCod = new boolean[] {false} ;
      T00T119_A252CliCod = new int[1] ;
      T00T120_A396EmprCod = new String[] {""} ;
      T00T120_A44AlbRecCod = new int[1] ;
      T00T120_n44AlbRecCod = new boolean[] {false} ;
      T00T120_A252CliCod = new int[1] ;
      T00T16_A44AlbRecCod = new int[1] ;
      T00T16_n44AlbRecCod = new boolean[] {false} ;
      T00T16_A252CliCod = new int[1] ;
      T00T16_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T16_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T16_A52AlbRPieEnt = new int[1] ;
      T00T16_A54AlbRPieUti = new int[1] ;
      T00T16_A47AlbREst = new byte[1] ;
      T00T16_A56AlbRUni = new String[] {""} ;
      T00T16_A45AlbRef = new String[] {""} ;
      T00T16_A46AlbREnt = new String[] {""} ;
      T00T16_A50AlbRLoc = new String[] {""} ;
      T00T16_A49AlbRFen = new java.util.Date[] {GXutil.nullDate()} ;
      T00T16_A55AlbRReo = new String[] {""} ;
      T00T16_A53AlbRPieReb = new int[1] ;
      T00T16_A59AlbRUniReb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T16_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      T00T16_A1222AlbNumEti = new short[1] ;
      T00T16_A1291AlbRDes = new String[] {""} ;
      T00T16_A396EmprCod = new String[] {""} ;
      T00T16_A840TrnCod = new short[1] ;
      T00T16_n840TrnCod = new boolean[] {false} ;
      T00T16_A970ProceCod = new short[1] ;
      T00T16_n970ProceCod = new boolean[] {false} ;
      T00T16_A1211TipEntCod = new short[1] ;
      T00T16_n1211TipEntCod = new boolean[] {false} ;
      T00T124_A841TrnNom = new String[] {""} ;
      T00T124_n841TrnNom = new boolean[] {false} ;
      T00T125_A1212TipEntNom = new String[] {""} ;
      T00T125_n1212TipEntNom = new boolean[] {false} ;
      T00T126_A971ProceNom = new String[] {""} ;
      T00T126_n971ProceNom = new boolean[] {false} ;
      T00T127_A396EmprCod = new String[] {""} ;
      T00T127_A13026PedDGId = new int[1] ;
      T00T127_A44AlbRecCod = new int[1] ;
      T00T127_n44AlbRecCod = new boolean[] {false} ;
      T00T128_A396EmprCod = new String[] {""} ;
      T00T128_A11669DevCruId = new int[1] ;
      T00T128_A44AlbRecCod = new int[1] ;
      T00T128_n44AlbRecCod = new boolean[] {false} ;
      T00T129_A396EmprCod = new String[] {""} ;
      T00T129_A44AlbRecCod = new int[1] ;
      T00T129_n44AlbRecCod = new boolean[] {false} ;
      T00T129_A9743Emp_CUb = new String[] {""} ;
      T00T129_A5860Emp_Anp = new short[1] ;
      T00T130_A396EmprCod = new String[] {""} ;
      T00T130_A44AlbRecCod = new int[1] ;
      T00T130_n44AlbRecCod = new boolean[] {false} ;
      T00T130_A7130MatC_Pz = new String[] {""} ;
      T00T131_A396EmprCod = new String[] {""} ;
      T00T131_A44AlbRecCod = new int[1] ;
      T00T131_n44AlbRecCod = new boolean[] {false} ;
      T00T131_A7132MatC_Talla = new String[] {""} ;
      T00T132_A396EmprCod = new String[] {""} ;
      T00T132_A44AlbRecCod = new int[1] ;
      T00T132_n44AlbRecCod = new boolean[] {false} ;
      T00T132_A7115MatC_Lin = new short[1] ;
      T00T133_A396EmprCod = new String[] {""} ;
      T00T133_A30AlbProCod = new long[1] ;
      T00T133_A129BarCod = new int[1] ;
      T00T133_A132BarCodReo = new byte[1] ;
      T00T133_A130BarCodPar = new String[] {""} ;
      T00T133_A6622AlbHdRLn = new short[1] ;
      T00T134_A396EmprCod = new String[] {""} ;
      T00T134_A6235DevEmpCod = new int[1] ;
      T00T134_A6243DevNumLin = new byte[1] ;
      T00T135_A396EmprCod = new String[] {""} ;
      T00T135_A44AlbRecCod = new int[1] ;
      T00T135_n44AlbRecCod = new boolean[] {false} ;
      T00T135_A4596AlbRDefCod = new short[1] ;
      T00T136_A396EmprCod = new String[] {""} ;
      T00T136_A44AlbRecCod = new int[1] ;
      T00T136_n44AlbRecCod = new boolean[] {false} ;
      T00T136_A2159AlbRecPie = new String[] {""} ;
      T00T136_A4395AlRDefCod = new short[1] ;
      T00T136_A4412AlRFasCod = new String[] {""} ;
      T00T137_A396EmprCod = new String[] {""} ;
      T00T137_A44AlbRecCod = new int[1] ;
      T00T137_n44AlbRecCod = new boolean[] {false} ;
      T00T137_A2165HisEmpLin = new short[1] ;
      T00T138_A396EmprCod = new String[] {""} ;
      T00T138_A44AlbRecCod = new int[1] ;
      T00T138_n44AlbRecCod = new boolean[] {false} ;
      T00T138_A1299AlbRLin = new byte[1] ;
      T00T139_A396EmprCod = new String[] {""} ;
      T00T139_A361DisCod = new int[1] ;
      T00T139_A44AlbRecCod = new int[1] ;
      T00T139_n44AlbRecCod = new boolean[] {false} ;
      T00T140_A396EmprCod = new String[] {""} ;
      T00T140_A323DevGenCod = new int[1] ;
      T00T141_A396EmprCod = new String[] {""} ;
      T00T141_A129BarCod = new int[1] ;
      T00T141_A132BarCodReo = new byte[1] ;
      T00T141_A130BarCodPar = new String[] {""} ;
      T00T141_A200BarPieCod = new String[] {""} ;
      T00T143_A2152AlbDetPie = new short[1] ;
      T00T143_A2149AlbDetMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T143_A2146AlbDetKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T143_A2151AlbDetMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T143_A2148AlbDetKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T145_A396EmprCod = new String[] {""} ;
      T00T145_A44AlbRecCod = new int[1] ;
      T00T145_n44AlbRecCod = new boolean[] {false} ;
      T00T146_A4795AlRPieCal = new String[] {""} ;
      T00T146_A44AlbRecCod = new int[1] ;
      T00T146_n44AlbRecCod = new boolean[] {false} ;
      T00T146_A2159AlbRecPie = new String[] {""} ;
      T00T146_A2154AlbRecAnh = new short[1] ;
      T00T146_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T146_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T146_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T146_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T146_A396EmprCod = new String[] {""} ;
      T00T147_A396EmprCod = new String[] {""} ;
      T00T147_A44AlbRecCod = new int[1] ;
      T00T147_n44AlbRecCod = new boolean[] {false} ;
      T00T147_A2159AlbRecPie = new String[] {""} ;
      T00T13_A4795AlRPieCal = new String[] {""} ;
      T00T13_A44AlbRecCod = new int[1] ;
      T00T13_n44AlbRecCod = new boolean[] {false} ;
      T00T13_A2159AlbRecPie = new String[] {""} ;
      T00T13_A2154AlbRecAnh = new short[1] ;
      T00T13_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T13_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T13_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T13_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T13_A396EmprCod = new String[] {""} ;
      T00T12_A4795AlRPieCal = new String[] {""} ;
      T00T12_A44AlbRecCod = new int[1] ;
      T00T12_n44AlbRecCod = new boolean[] {false} ;
      T00T12_A2159AlbRecPie = new String[] {""} ;
      T00T12_A2154AlbRecAnh = new short[1] ;
      T00T12_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T12_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T12_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T12_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00T12_A396EmprCod = new String[] {""} ;
      T00T151_A396EmprCod = new String[] {""} ;
      T00T151_A44AlbRecCod = new int[1] ;
      T00T151_n44AlbRecCod = new boolean[] {false} ;
      T00T151_A2159AlbRecPie = new String[] {""} ;
      T00T151_A10188AlRFibOrd = new int[1] ;
      T00T152_A396EmprCod = new String[] {""} ;
      T00T152_A44AlbRecCod = new int[1] ;
      T00T152_n44AlbRecCod = new boolean[] {false} ;
      T00T152_A2159AlbRecPie = new String[] {""} ;
      T00T152_A9568CodHilz = new String[] {""} ;
      T00T153_A396EmprCod = new String[] {""} ;
      T00T153_A44AlbRecCod = new int[1] ;
      T00T153_n44AlbRecCod = new boolean[] {false} ;
      T00T153_A2159AlbRecPie = new String[] {""} ;
      T00T153_A7697AlREtiTpo = new byte[1] ;
      T00T154_A396EmprCod = new String[] {""} ;
      T00T154_A44AlbRecCod = new int[1] ;
      T00T154_n44AlbRecCod = new boolean[] {false} ;
      T00T154_A2159AlbRecPie = new String[] {""} ;
      T00T154_A5262AlbRecEvt = new short[1] ;
      T00T155_A396EmprCod = new String[] {""} ;
      T00T155_A44AlbRecCod = new int[1] ;
      T00T155_n44AlbRecCod = new boolean[] {false} ;
      T00T155_A2159AlbRecPie = new String[] {""} ;
      T00T155_A4395AlRDefCod = new short[1] ;
      T00T155_A4412AlRFasCod = new String[] {""} ;
      T00T156_A396EmprCod = new String[] {""} ;
      T00T156_A44AlbRecCod = new int[1] ;
      T00T156_n44AlbRecCod = new boolean[] {false} ;
      T00T156_A2159AlbRecPie = new String[] {""} ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      iV51Modo2 = "" ;
      i49AlbRFen = GXutil.nullDate() ;
      i45AlbRef = "" ;
      i55AlbRReo = "" ;
      i48AlbRFecUlt = GXutil.nullDate() ;
      i50AlbRLoc = "" ;
      i46AlbREnt = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      T00T157_A407EmprNom = new String[] {""} ;
      T00T157_n407EmprNom = new boolean[] {false} ;
      Z2147AlbDetKgmD = DecimalUtil.ZERO ;
      Z2150AlbDetMtrD = DecimalUtil.ZERO ;
      ZV54Rdto = DecimalUtil.ZERO ;
      Z57AlbRUniDis = DecimalUtil.ZERO ;
      ZV18AlbCum = "" ;
      ZZ396EmprCod = "" ;
      ZZ56AlbRUni = "" ;
      ZZ2147AlbDetKgmD = DecimalUtil.ZERO ;
      ZZ2150AlbDetMtrD = DecimalUtil.ZERO ;
      ZZ407EmprNom = "" ;
      ZZ279CliNom = "" ;
      ZZ45AlbRef = "" ;
      ZZ46AlbREnt = "" ;
      ZZ50AlbRLoc = "" ;
      ZZ49AlbRFen = GXutil.nullDate() ;
      ZZ55AlbRReo = "" ;
      ZZ59AlbRUniReb = DecimalUtil.ZERO ;
      ZZ48AlbRFecUlt = GXutil.nullDate() ;
      ZZ1291AlbRDes = "" ;
      ZZ2149AlbDetMtr = DecimalUtil.ZERO ;
      ZZ2146AlbDetKgm = DecimalUtil.ZERO ;
      ZZ2151AlbDetMtrU = DecimalUtil.ZERO ;
      ZZ2148AlbDetKgmU = DecimalUtil.ZERO ;
      ZZ841TrnNom = "" ;
      ZZ971ProceNom = "" ;
      ZZ1212TipEntNom = "" ;
      ZZV54Rdto = DecimalUtil.ZERO ;
      ZZ58AlbRUniEnt = DecimalUtil.ZERO ;
      ZZ60AlbRUniUti = DecimalUtil.ZERO ;
      ZZ57AlbRUniDis = DecimalUtil.ZERO ;
      ZZV18AlbCum = "" ;
      GXv_int4 = new byte[1] ;
      GXt_char9 = "" ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_int8 = new short[1] ;
      GXv_int7 = new short[1] ;
      GXv_int6 = new short[1] ;
      T00T158_Gx_cnt = new int[1] ;
      T00T159_Gx_cnt = new int[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.talbde5__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.talbde5__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.talbde5__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.talbde5__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.talbde5__default(),
         new Object[] {
             new Object[] {
            T00T12_A4795AlRPieCal, T00T12_A44AlbRecCod, T00T12_A2159AlbRecPie, T00T12_A2154AlbRecAnh, T00T12_A2157AlbRecMtr, T00T12_A2155AlbRecKgm, T00T12_A2158AlbRecMtrU, T00T12_A2156AlbRecKgmU, T00T12_A396EmprCod
            }
            , new Object[] {
            T00T13_A4795AlRPieCal, T00T13_A44AlbRecCod, T00T13_A2159AlbRecPie, T00T13_A2154AlbRecAnh, T00T13_A2157AlbRecMtr, T00T13_A2155AlbRecKgm, T00T13_A2158AlbRecMtrU, T00T13_A2156AlbRecKgmU, T00T13_A396EmprCod
            }
            , new Object[] {
            T00T15_A2152AlbDetPie, T00T15_A2149AlbDetMtr, T00T15_A2146AlbDetKgm, T00T15_A2151AlbDetMtrU, T00T15_A2148AlbDetKgmU
            }
            , new Object[] {
            T00T16_A44AlbRecCod, T00T16_A252CliCod, T00T16_A58AlbRUniEnt, T00T16_A60AlbRUniUti, T00T16_A52AlbRPieEnt, T00T16_A54AlbRPieUti, T00T16_A47AlbREst, T00T16_A56AlbRUni, T00T16_A45AlbRef, T00T16_A46AlbREnt,
            T00T16_A50AlbRLoc, T00T16_A49AlbRFen, T00T16_A55AlbRReo, T00T16_A53AlbRPieReb, T00T16_A59AlbRUniReb, T00T16_A48AlbRFecUlt, T00T16_A1222AlbNumEti, T00T16_A1291AlbRDes, T00T16_A396EmprCod, T00T16_A840TrnCod,
            T00T16_n840TrnCod, T00T16_A970ProceCod, T00T16_n970ProceCod, T00T16_A1211TipEntCod, T00T16_n1211TipEntCod
            }
            , new Object[] {
            T00T17_A44AlbRecCod, T00T17_A252CliCod, T00T17_A58AlbRUniEnt, T00T17_A60AlbRUniUti, T00T17_A52AlbRPieEnt, T00T17_A54AlbRPieUti, T00T17_A47AlbREst, T00T17_A56AlbRUni, T00T17_A45AlbRef, T00T17_A46AlbREnt,
            T00T17_A50AlbRLoc, T00T17_A49AlbRFen, T00T17_A55AlbRReo, T00T17_A53AlbRPieReb, T00T17_A59AlbRUniReb, T00T17_A48AlbRFecUlt, T00T17_A1222AlbNumEti, T00T17_A1291AlbRDes, T00T17_A396EmprCod, T00T17_A840TrnCod,
            T00T17_n840TrnCod, T00T17_A970ProceCod, T00T17_n970ProceCod, T00T17_A1211TipEntCod, T00T17_n1211TipEntCod
            }
            , new Object[] {
            T00T18_A407EmprNom, T00T18_n407EmprNom
            }
            , new Object[] {
            T00T19_A279CliNom
            }
            , new Object[] {
            T00T110_A841TrnNom, T00T110_n841TrnNom
            }
            , new Object[] {
            T00T111_A971ProceNom, T00T111_n971ProceNom
            }
            , new Object[] {
            T00T112_A1212TipEntNom, T00T112_n1212TipEntNom
            }
            , new Object[] {
            T00T114_A44AlbRecCod, T00T114_A252CliCod, T00T114_A58AlbRUniEnt, T00T114_A60AlbRUniUti, T00T114_A52AlbRPieEnt, T00T114_A54AlbRPieUti, T00T114_A47AlbREst, T00T114_A56AlbRUni, T00T114_A407EmprNom, T00T114_n407EmprNom,
            T00T114_A279CliNom, T00T114_A45AlbRef, T00T114_A841TrnNom, T00T114_n841TrnNom, T00T114_A46AlbREnt, T00T114_A50AlbRLoc, T00T114_A49AlbRFen, T00T114_A55AlbRReo, T00T114_A53AlbRPieReb, T00T114_A59AlbRUniReb,
            T00T114_A48AlbRFecUlt, T00T114_A1212TipEntNom, T00T114_n1212TipEntNom, T00T114_A1222AlbNumEti, T00T114_A1291AlbRDes, T00T114_A971ProceNom, T00T114_n971ProceNom, T00T114_A396EmprCod, T00T114_A840TrnCod, T00T114_n840TrnCod,
            T00T114_A970ProceCod, T00T114_n970ProceCod, T00T114_A1211TipEntCod, T00T114_n1211TipEntCod, T00T114_A2152AlbDetPie, T00T114_A2149AlbDetMtr, T00T114_A2146AlbDetKgm, T00T114_A2151AlbDetMtrU, T00T114_A2148AlbDetKgmU
            }
            , new Object[] {
            T00T115_A841TrnNom, T00T115_n841TrnNom
            }
            , new Object[] {
            T00T116_A971ProceNom, T00T116_n971ProceNom
            }
            , new Object[] {
            T00T117_A1212TipEntNom, T00T117_n1212TipEntNom
            }
            , new Object[] {
            T00T118_A396EmprCod, T00T118_A44AlbRecCod
            }
            , new Object[] {
            T00T119_A396EmprCod, T00T119_A44AlbRecCod, T00T119_A252CliCod
            }
            , new Object[] {
            T00T120_A396EmprCod, T00T120_A44AlbRecCod, T00T120_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00T124_A841TrnNom, T00T124_n841TrnNom
            }
            , new Object[] {
            T00T125_A1212TipEntNom, T00T125_n1212TipEntNom
            }
            , new Object[] {
            T00T126_A971ProceNom, T00T126_n971ProceNom
            }
            , new Object[] {
            T00T127_A396EmprCod, T00T127_A13026PedDGId, T00T127_A44AlbRecCod
            }
            , new Object[] {
            T00T128_A396EmprCod, T00T128_A11669DevCruId, T00T128_A44AlbRecCod
            }
            , new Object[] {
            T00T129_A396EmprCod, T00T129_A44AlbRecCod, T00T129_A9743Emp_CUb, T00T129_A5860Emp_Anp
            }
            , new Object[] {
            T00T130_A396EmprCod, T00T130_A44AlbRecCod, T00T130_A7130MatC_Pz
            }
            , new Object[] {
            T00T131_A396EmprCod, T00T131_A44AlbRecCod, T00T131_A7132MatC_Talla
            }
            , new Object[] {
            T00T132_A396EmprCod, T00T132_A44AlbRecCod, T00T132_A7115MatC_Lin
            }
            , new Object[] {
            T00T133_A396EmprCod, T00T133_A30AlbProCod, T00T133_A129BarCod, T00T133_A132BarCodReo, T00T133_A130BarCodPar, T00T133_A6622AlbHdRLn
            }
            , new Object[] {
            T00T134_A396EmprCod, T00T134_A6235DevEmpCod, T00T134_A6243DevNumLin
            }
            , new Object[] {
            T00T135_A396EmprCod, T00T135_A44AlbRecCod, T00T135_A4596AlbRDefCod
            }
            , new Object[] {
            T00T136_A396EmprCod, T00T136_A44AlbRecCod, T00T136_A2159AlbRecPie, T00T136_A4395AlRDefCod, T00T136_A4412AlRFasCod
            }
            , new Object[] {
            T00T137_A396EmprCod, T00T137_A44AlbRecCod, T00T137_A2165HisEmpLin
            }
            , new Object[] {
            T00T138_A396EmprCod, T00T138_A44AlbRecCod, T00T138_A1299AlbRLin
            }
            , new Object[] {
            T00T139_A396EmprCod, T00T139_A361DisCod, T00T139_A44AlbRecCod
            }
            , new Object[] {
            T00T140_A396EmprCod, T00T140_A323DevGenCod
            }
            , new Object[] {
            T00T141_A396EmprCod, T00T141_A129BarCod, T00T141_A132BarCodReo, T00T141_A130BarCodPar, T00T141_A200BarPieCod
            }
            , new Object[] {
            T00T143_A2152AlbDetPie, T00T143_A2149AlbDetMtr, T00T143_A2146AlbDetKgm, T00T143_A2151AlbDetMtrU, T00T143_A2148AlbDetKgmU
            }
            , new Object[] {
            }
            , new Object[] {
            T00T145_A396EmprCod, T00T145_A44AlbRecCod
            }
            , new Object[] {
            T00T146_A4795AlRPieCal, T00T146_A44AlbRecCod, T00T146_A2159AlbRecPie, T00T146_A2154AlbRecAnh, T00T146_A2157AlbRecMtr, T00T146_A2155AlbRecKgm, T00T146_A2158AlbRecMtrU, T00T146_A2156AlbRecKgmU, T00T146_A396EmprCod
            }
            , new Object[] {
            T00T147_A396EmprCod, T00T147_A44AlbRecCod, T00T147_A2159AlbRecPie
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00T151_A396EmprCod, T00T151_A44AlbRecCod, T00T151_A2159AlbRecPie, T00T151_A10188AlRFibOrd
            }
            , new Object[] {
            T00T152_A396EmprCod, T00T152_A44AlbRecCod, T00T152_A2159AlbRecPie, T00T152_A9568CodHilz
            }
            , new Object[] {
            T00T153_A396EmprCod, T00T153_A44AlbRecCod, T00T153_A2159AlbRecPie, T00T153_A7697AlREtiTpo
            }
            , new Object[] {
            T00T154_A396EmprCod, T00T154_A44AlbRecCod, T00T154_A2159AlbRecPie, T00T154_A5262AlbRecEvt
            }
            , new Object[] {
            T00T155_A396EmprCod, T00T155_A44AlbRecCod, T00T155_A2159AlbRecPie, T00T155_A4395AlRDefCod, T00T155_A4412AlRFasCod
            }
            , new Object[] {
            T00T156_A396EmprCod, T00T156_A44AlbRecCod, T00T156_A2159AlbRecPie
            }
            , new Object[] {
            T00T157_A407EmprNom, T00T157_n407EmprNom
            }
            , new Object[] {
            T00T158_Gx_cnt
            }
            , new Object[] {
            T00T159_Gx_cnt
            }
         }
      );
      Z252CliCod = 0 ;
      A252CliCod = 0 ;
      Z44AlbRecCod = 0 ;
      n44AlbRecCod = false ;
      E44AlbRecCod = 0 ;
      n44AlbRecCod = false ;
      A44AlbRecCod = 0 ;
      n44AlbRecCod = false ;
      Z396EmprCod = "" ;
      E396EmprCod = "" ;
      A396EmprCod = "" ;
      Z46AlbREnt = "" ;
      A46AlbREnt = "" ;
      i46AlbREnt = "" ;
      Z50AlbRLoc = "" ;
      A50AlbRLoc = "" ;
      i50AlbRLoc = "" ;
      Z48AlbRFecUlt = GXutil.today( ) ;
      A48AlbRFecUlt = GXutil.today( ) ;
      i48AlbRFecUlt = GXutil.today( ) ;
      Z47AlbREst = (byte)(0) ;
      A47AlbREst = (byte)(0) ;
      i47AlbREst = (byte)(0) ;
      Z55AlbRReo = httpContext.getMessage( "NO", "") ;
      A55AlbRReo = httpContext.getMessage( "NO", "") ;
      i55AlbRReo = httpContext.getMessage( "NO", "") ;
      Z45AlbRef = "" ;
      i45AlbRef = "" ;
      A45AlbRef = "" ;
      Z49AlbRFen = GXutil.today( ) ;
      A49AlbRFen = GXutil.today( ) ;
      i49AlbRFen = GXutil.today( ) ;
   }

   private byte Z47AlbREst ;
   private byte GxWebError ;
   private byte AV55FlagArt ;
   private byte AV56CalMKT ;
   private byte AV59SumPza ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A47AlbREst ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i47AlbREst ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte ZV55FlagArt ;
   private byte ZZV55FlagArt ;
   private byte ZZ47AlbREst ;
   private byte GXv_int4[] ;
   private short Z1222AlbNumEti ;
   private short Z840TrnCod ;
   private short Z970ProceCod ;
   private short Z1211TipEntCod ;
   private short Z2154AlbRecAnh ;
   private short nRcdDeleted_299 ;
   private short nRcdExists_299 ;
   private short nIsMod_299 ;
   private short A2154AlbRecAnh ;
   private short A840TrnCod ;
   private short A970ProceCod ;
   private short A1211TipEntCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A2152AlbDetPie ;
   private short A2153AlbDetPieU ;
   private short A1222AlbNumEti ;
   private short nBlankRcdCount299 ;
   private short RcdFound299 ;
   private short nBlankRcdUsr299 ;
   private short AV53Pesoml ;
   private short AV67anc ;
   private short AV68grm2 ;
   private short s2153AlbDetPieU ;
   private short O2153AlbDetPieU ;
   private short Z2152AlbDetPie ;
   private short RcdFound7 ;
   private short nIsDirty_7 ;
   private short nIsDirty_299 ;
   private short Z2153AlbDetPieU ;
   private short ZV53Pesoml ;
   private short ZV67anc ;
   private short ZV68grm2 ;
   private short ZZ840TrnCod ;
   private short ZZ1211TipEntCod ;
   private short ZZ1222AlbNumEti ;
   private short ZZ970ProceCod ;
   private short ZZ2152AlbDetPie ;
   private short ZZ2153AlbDetPieU ;
   private short ZZV53Pesoml ;
   private short ZZV67anc ;
   private short ZZV68grm2 ;
   private short GXv_int8[] ;
   private short GXv_int7[] ;
   private short GXv_int6[] ;
   private int wcpOA44AlbRecCod ;
   private int wcpOA252CliCod ;
   private int Z44AlbRecCod ;
   private int Z52AlbRPieEnt ;
   private int Z54AlbRPieUti ;
   private int Z53AlbRPieReb ;
   private int nRC_GXsfl_205 ;
   private int nGXsfl_205_idx=1 ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtAlbRecCod_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtAlbRef_Enabled ;
   private int edtTrnCod_Enabled ;
   private int edtTrnNom_Enabled ;
   private int edtAlbREnt_Enabled ;
   private int A52AlbRPieEnt ;
   private int edtAlbRPieEnt_Enabled ;
   private int edtAlbRLoc_Enabled ;
   private int edtAlbRFen_Enabled ;
   private int edtAlbRUniEnt_Enabled ;
   private int A54AlbRPieUti ;
   private int edtAlbRPieUti_Enabled ;
   private int A53AlbRPieReb ;
   private int edtAlbRPieReb_Enabled ;
   private int edtAlbRUniUti_Enabled ;
   private int edtAlbRUniReb_Enabled ;
   private int A51AlbRPieDis ;
   private int edtAlbRPieDis_Enabled ;
   private int edtAlbRUniDis_Enabled ;
   private int edtAlbRFecUlt_Enabled ;
   private int edtTipEntCod_Enabled ;
   private int edtTipEntNom_Enabled ;
   private int edtAlbNumEti_Enabled ;
   private int edtAlbRDes_Enabled ;
   private int edtProceCod_Enabled ;
   private int edtProceNom_Enabled ;
   private int edtAlbDetPie_Enabled ;
   private int edtAlbDetMtr_Enabled ;
   private int edtAlbDetKgm_Enabled ;
   private int edtAlbDetMtrU_Enabled ;
   private int edtAlbDetKgmU_Enabled ;
   private int edtAlbDetMtrD_Enabled ;
   private int edtAlbDetKgmD_Enabled ;
   private int edtAlbDetPieU_Enabled ;
   private int edtavnRcdDeleted_299_Enabled ;
   private int edtAlbRecPie_Enabled ;
   private int edtAlbRecAnh_Enabled ;
   private int edtAlbRecMtr_Enabled ;
   private int edtAlbRecKgm_Enabled ;
   private int edtAlbRecMtrU_Enabled ;
   private int edtAlbRecKgmU_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int s52AlbRPieEnt ;
   private int O52AlbRPieEnt ;
   private int s54AlbRPieUti ;
   private int O54AlbRPieUti ;
   private int GX_JID ;
   private int Z252CliCod ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int defedtAlbRecPie_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int edtAlbDetPieU_Backcolor ;
   private int edtAlbDetKgmD_Backcolor ;
   private int edtAlbDetMtrD_Backcolor ;
   private int edtAlbDetKgmU_Backcolor ;
   private int edtAlbDetMtrU_Backcolor ;
   private int edtAlbDetKgm_Backcolor ;
   private int edtAlbDetMtr_Backcolor ;
   private int edtAlbDetPie_Backcolor ;
   private int edtProceNom_Backcolor ;
   private int edtProceCod_Backcolor ;
   private int edtAlbRDes_Backcolor ;
   private int edtAlbNumEti_Backcolor ;
   private int edtTipEntNom_Backcolor ;
   private int edtTipEntCod_Backcolor ;
   private int edtAlbRFecUlt_Backcolor ;
   private int edtAlbRUniDis_Backcolor ;
   private int edtAlbRPieDis_Backcolor ;
   private int edtAlbRUniReb_Backcolor ;
   private int edtAlbRUniUti_Backcolor ;
   private int edtAlbRPieReb_Backcolor ;
   private int edtAlbRPieUti_Backcolor ;
   private int edtAlbRUniEnt_Backcolor ;
   private int edtAlbRFen_Backcolor ;
   private int edtAlbRLoc_Backcolor ;
   private int edtAlbRPieEnt_Backcolor ;
   private int edtAlbREnt_Backcolor ;
   private int edtTrnNom_Backcolor ;
   private int edtTrnCod_Backcolor ;
   private int edtAlbRef_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtAlbRecCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int Z51AlbRPieDis ;
   private int ZZ44AlbRecCod ;
   private int ZZ52AlbRPieEnt ;
   private int ZZ53AlbRPieReb ;
   private int ZZ252CliCod ;
   private int ZZ54AlbRPieUti ;
   private int ZZ51AlbRPieDis ;
   private int GXv_int2[] ;
   private int Gx_cnt ;
   private int E44AlbRecCod ;
   private long GRID1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal Z59AlbRUniReb ;
   private java.math.BigDecimal Z2157AlbRecMtr ;
   private java.math.BigDecimal Z2155AlbRecKgm ;
   private java.math.BigDecimal Z2158AlbRecMtrU ;
   private java.math.BigDecimal Z2156AlbRecKgmU ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2147AlbDetKgmD ;
   private java.math.BigDecimal A2150AlbDetMtrD ;
   private java.math.BigDecimal A2146AlbDetKgm ;
   private java.math.BigDecimal A2148AlbDetKgmU ;
   private java.math.BigDecimal A2149AlbDetMtr ;
   private java.math.BigDecimal A2151AlbDetMtrU ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A59AlbRUniReb ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal AV54Rdto ;
   private java.math.BigDecimal s2147AlbDetKgmD ;
   private java.math.BigDecimal O2147AlbDetKgmD ;
   private java.math.BigDecimal s2150AlbDetMtrD ;
   private java.math.BigDecimal O2150AlbDetMtrD ;
   private java.math.BigDecimal s58AlbRUniEnt ;
   private java.math.BigDecimal O58AlbRUniEnt ;
   private java.math.BigDecimal s60AlbRUniUti ;
   private java.math.BigDecimal O60AlbRUniUti ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private java.math.BigDecimal A2156AlbRecKgmU ;
   private java.math.BigDecimal Z2149AlbDetMtr ;
   private java.math.BigDecimal Z2146AlbDetKgm ;
   private java.math.BigDecimal Z2151AlbDetMtrU ;
   private java.math.BigDecimal Z2148AlbDetKgmU ;
   private java.math.BigDecimal Z2147AlbDetKgmD ;
   private java.math.BigDecimal Z2150AlbDetMtrD ;
   private java.math.BigDecimal ZV54Rdto ;
   private java.math.BigDecimal Z57AlbRUniDis ;
   private java.math.BigDecimal ZZ2147AlbDetKgmD ;
   private java.math.BigDecimal ZZ2150AlbDetMtrD ;
   private java.math.BigDecimal ZZ59AlbRUniReb ;
   private java.math.BigDecimal ZZ2149AlbDetMtr ;
   private java.math.BigDecimal ZZ2146AlbDetKgm ;
   private java.math.BigDecimal ZZ2151AlbDetMtrU ;
   private java.math.BigDecimal ZZ2148AlbDetKgmU ;
   private java.math.BigDecimal ZZV54Rdto ;
   private java.math.BigDecimal ZZ58AlbRUniEnt ;
   private java.math.BigDecimal ZZ60AlbRUniUti ;
   private java.math.BigDecimal ZZ57AlbRUniDis ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private String sPrefix ;
   private String wcpOA396EmprCod ;
   private String wcpOAV57AlbRef ;
   private String wcpOAV46Unidades ;
   private String wcpOAV47vDisLoc ;
   private String wcpOAV65DisCliNum ;
   private String Z396EmprCod ;
   private String Z56AlbRUni ;
   private String Z45AlbRef ;
   private String Z46AlbREnt ;
   private String Z50AlbRLoc ;
   private String Z55AlbRReo ;
   private String Z1291AlbRDes ;
   private String Z2159AlbRecPie ;
   private String Z4795AlRPieCal ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A45AlbRef ;
   private String A56AlbRUni ;
   private String A2159AlbRecPie ;
   private String AV57AlbRef ;
   private String AV46Unidades ;
   private String AV47vDisLoc ;
   private String AV65DisCliNum ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtAlbRef_Internalname ;
   private String sGXsfl_205_idx="0001" ;
   private String A55AlbRReo ;
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
   private String edtAlbRecCod_Internalname ;
   private String edtAlbRecCod_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtAlbRef_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtTrnNom_Internalname ;
   private String A841TrnNom ;
   private String edtTrnNom_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtAlbREnt_Internalname ;
   private String A46AlbREnt ;
   private String edtAlbREnt_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String edtAlbRPieEnt_Internalname ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtAlbRLoc_Internalname ;
   private String A50AlbRLoc ;
   private String edtAlbRLoc_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtAlbRFen_Internalname ;
   private String edtAlbRFen_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtAlbRUniEnt_Internalname ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtAlbRPieUti_Internalname ;
   private String edtAlbRPieUti_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtAlbRPieReb_Internalname ;
   private String edtAlbRPieReb_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtAlbRUniUti_Internalname ;
   private String edtAlbRUniUti_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtAlbRUniReb_Internalname ;
   private String edtAlbRUniReb_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtAlbRPieDis_Internalname ;
   private String edtAlbRPieDis_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtAlbRUniDis_Internalname ;
   private String edtAlbRUniDis_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtAlbRFecUlt_Internalname ;
   private String edtAlbRFecUlt_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtTipEntCod_Internalname ;
   private String edtTipEntCod_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtTipEntNom_Internalname ;
   private String A1212TipEntNom ;
   private String edtTipEntNom_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtAlbNumEti_Internalname ;
   private String edtAlbNumEti_Jsonclick ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String edtAlbRDes_Internalname ;
   private String A1291AlbRDes ;
   private String edtAlbRDes_Jsonclick ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock28_Jsonclick ;
   private String edtProceCod_Internalname ;
   private String edtProceCod_Jsonclick ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock29_Jsonclick ;
   private String edtProceNom_Internalname ;
   private String A971ProceNom ;
   private String edtProceNom_Jsonclick ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock30_Jsonclick ;
   private String edtAlbDetPie_Internalname ;
   private String edtAlbDetPie_Jsonclick ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock31_Jsonclick ;
   private String edtAlbDetMtr_Internalname ;
   private String edtAlbDetMtr_Jsonclick ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock32_Jsonclick ;
   private String edtAlbDetKgm_Internalname ;
   private String edtAlbDetKgm_Jsonclick ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock33_Jsonclick ;
   private String edtAlbDetMtrU_Internalname ;
   private String edtAlbDetMtrU_Jsonclick ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock34_Jsonclick ;
   private String edtAlbDetKgmU_Internalname ;
   private String edtAlbDetKgmU_Jsonclick ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock35_Jsonclick ;
   private String edtAlbDetMtrD_Internalname ;
   private String edtAlbDetMtrD_Jsonclick ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock36_Jsonclick ;
   private String edtAlbDetKgmD_Internalname ;
   private String edtAlbDetKgmD_Jsonclick ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock37_Jsonclick ;
   private String edtAlbDetPieU_Internalname ;
   private String edtAlbDetPieU_Jsonclick ;
   private String sMode299 ;
   private String edtavnRcdDeleted_299_Internalname ;
   private String edtAlbRecPie_Internalname ;
   private String edtAlbRecAnh_Internalname ;
   private String edtAlbRecMtr_Internalname ;
   private String edtAlbRecKgm_Internalname ;
   private String edtAlbRecMtrU_Internalname ;
   private String edtAlbRecKgmU_Internalname ;
   private String subGrid1_Internalname ;
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
   private String AV51Modo2 ;
   private String AV17UsurCod ;
   private String AV18AlbCum ;
   private String A4795AlRPieCal ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode7 ;
   private String sV18AlbCum ;
   private String OV18AlbCum ;
   private String GXCCtl ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z841TrnNom ;
   private String Z1212TipEntNom ;
   private String Z971ProceNom ;
   private String sGXsfl_205_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavnRcdDeleted_299_Jsonclick ;
   private String edtAlbRecPie_Jsonclick ;
   private String edtAlbRecAnh_Jsonclick ;
   private String edtAlbRecMtr_Jsonclick ;
   private String edtAlbRecKgm_Jsonclick ;
   private String edtAlbRecMtrU_Jsonclick ;
   private String edtAlbRecKgmU_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String iV51Modo2 ;
   private String i45AlbRef ;
   private String i55AlbRReo ;
   private String i50AlbRLoc ;
   private String i46AlbREnt ;
   private String subGrid1_Header ;
   private String ZV18AlbCum ;
   private String ZZ396EmprCod ;
   private String ZZ56AlbRUni ;
   private String ZZ407EmprNom ;
   private String ZZ279CliNom ;
   private String ZZ45AlbRef ;
   private String ZZ46AlbREnt ;
   private String ZZ50AlbRLoc ;
   private String ZZ55AlbRReo ;
   private String ZZ1291AlbRDes ;
   private String ZZ841TrnNom ;
   private String ZZ971ProceNom ;
   private String ZZ1212TipEntNom ;
   private String ZZV18AlbCum ;
   private String GXt_char9 ;
   private String GXv_char1[] ;
   private String GXv_char3[] ;
   private String GXv_char10[] ;
   private String E396EmprCod ;
   private java.util.Date Z49AlbRFen ;
   private java.util.Date Z48AlbRFecUlt ;
   private java.util.Date A49AlbRFen ;
   private java.util.Date A48AlbRFecUlt ;
   private java.util.Date i49AlbRFen ;
   private java.util.Date i48AlbRFecUlt ;
   private java.util.Date ZZ49AlbRFen ;
   private java.util.Date ZZ48AlbRFecUlt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n44AlbRecCod ;
   private boolean n840TrnCod ;
   private boolean n970ProceCod ;
   private boolean n1211TipEntCod ;
   private boolean wbErr ;
   private boolean bGXsfl_205_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n841TrnNom ;
   private boolean n1212TipEntNom ;
   private boolean n971ProceNom ;
   private boolean Gx_longc ;
   private boolean nA44AlbRecCod ;
   private boolean nE44AlbRecCod ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbRUni ;
   private HTMLChoice cmbAlbRReo ;
   private HTMLChoice cmbAlbREst ;
   private IDataStoreProvider pr_default ;
   private short[] T00T15_A2152AlbDetPie ;
   private java.math.BigDecimal[] T00T15_A2149AlbDetMtr ;
   private java.math.BigDecimal[] T00T15_A2146AlbDetKgm ;
   private java.math.BigDecimal[] T00T15_A2151AlbDetMtrU ;
   private java.math.BigDecimal[] T00T15_A2148AlbDetKgmU ;
   private String[] T00T18_A407EmprNom ;
   private boolean[] T00T18_n407EmprNom ;
   private String[] T00T19_A279CliNom ;
   private int[] T00T114_A44AlbRecCod ;
   private boolean[] T00T114_n44AlbRecCod ;
   private int[] T00T114_A252CliCod ;
   private java.math.BigDecimal[] T00T114_A58AlbRUniEnt ;
   private java.math.BigDecimal[] T00T114_A60AlbRUniUti ;
   private int[] T00T114_A52AlbRPieEnt ;
   private int[] T00T114_A54AlbRPieUti ;
   private byte[] T00T114_A47AlbREst ;
   private String[] T00T114_A56AlbRUni ;
   private String[] T00T114_A407EmprNom ;
   private boolean[] T00T114_n407EmprNom ;
   private String[] T00T114_A279CliNom ;
   private String[] T00T114_A45AlbRef ;
   private String[] T00T114_A841TrnNom ;
   private boolean[] T00T114_n841TrnNom ;
   private String[] T00T114_A46AlbREnt ;
   private String[] T00T114_A50AlbRLoc ;
   private java.util.Date[] T00T114_A49AlbRFen ;
   private String[] T00T114_A55AlbRReo ;
   private int[] T00T114_A53AlbRPieReb ;
   private java.math.BigDecimal[] T00T114_A59AlbRUniReb ;
   private java.util.Date[] T00T114_A48AlbRFecUlt ;
   private String[] T00T114_A1212TipEntNom ;
   private boolean[] T00T114_n1212TipEntNom ;
   private short[] T00T114_A1222AlbNumEti ;
   private String[] T00T114_A1291AlbRDes ;
   private String[] T00T114_A971ProceNom ;
   private boolean[] T00T114_n971ProceNom ;
   private String[] T00T114_A396EmprCod ;
   private short[] T00T114_A840TrnCod ;
   private boolean[] T00T114_n840TrnCod ;
   private short[] T00T114_A970ProceCod ;
   private boolean[] T00T114_n970ProceCod ;
   private short[] T00T114_A1211TipEntCod ;
   private boolean[] T00T114_n1211TipEntCod ;
   private short[] T00T114_A2152AlbDetPie ;
   private java.math.BigDecimal[] T00T114_A2149AlbDetMtr ;
   private java.math.BigDecimal[] T00T114_A2146AlbDetKgm ;
   private java.math.BigDecimal[] T00T114_A2151AlbDetMtrU ;
   private java.math.BigDecimal[] T00T114_A2148AlbDetKgmU ;
   private String[] T00T110_A841TrnNom ;
   private boolean[] T00T110_n841TrnNom ;
   private String[] T00T111_A971ProceNom ;
   private boolean[] T00T111_n971ProceNom ;
   private String[] T00T112_A1212TipEntNom ;
   private boolean[] T00T112_n1212TipEntNom ;
   private String[] T00T115_A841TrnNom ;
   private boolean[] T00T115_n841TrnNom ;
   private String[] T00T116_A971ProceNom ;
   private boolean[] T00T116_n971ProceNom ;
   private String[] T00T117_A1212TipEntNom ;
   private boolean[] T00T117_n1212TipEntNom ;
   private String[] T00T118_A396EmprCod ;
   private int[] T00T118_A44AlbRecCod ;
   private boolean[] T00T118_n44AlbRecCod ;
   private int[] T00T17_A44AlbRecCod ;
   private boolean[] T00T17_n44AlbRecCod ;
   private int[] T00T17_A252CliCod ;
   private java.math.BigDecimal[] T00T17_A58AlbRUniEnt ;
   private java.math.BigDecimal[] T00T17_A60AlbRUniUti ;
   private int[] T00T17_A52AlbRPieEnt ;
   private int[] T00T17_A54AlbRPieUti ;
   private byte[] T00T17_A47AlbREst ;
   private String[] T00T17_A56AlbRUni ;
   private String[] T00T17_A45AlbRef ;
   private String[] T00T17_A46AlbREnt ;
   private String[] T00T17_A50AlbRLoc ;
   private java.util.Date[] T00T17_A49AlbRFen ;
   private String[] T00T17_A55AlbRReo ;
   private int[] T00T17_A53AlbRPieReb ;
   private java.math.BigDecimal[] T00T17_A59AlbRUniReb ;
   private java.util.Date[] T00T17_A48AlbRFecUlt ;
   private short[] T00T17_A1222AlbNumEti ;
   private String[] T00T17_A1291AlbRDes ;
   private String[] T00T17_A396EmprCod ;
   private short[] T00T17_A840TrnCod ;
   private boolean[] T00T17_n840TrnCod ;
   private short[] T00T17_A970ProceCod ;
   private boolean[] T00T17_n970ProceCod ;
   private short[] T00T17_A1211TipEntCod ;
   private boolean[] T00T17_n1211TipEntCod ;
   private String[] T00T119_A396EmprCod ;
   private int[] T00T119_A44AlbRecCod ;
   private boolean[] T00T119_n44AlbRecCod ;
   private int[] T00T119_A252CliCod ;
   private String[] T00T120_A396EmprCod ;
   private int[] T00T120_A44AlbRecCod ;
   private boolean[] T00T120_n44AlbRecCod ;
   private int[] T00T120_A252CliCod ;
   private int[] T00T16_A44AlbRecCod ;
   private boolean[] T00T16_n44AlbRecCod ;
   private int[] T00T16_A252CliCod ;
   private java.math.BigDecimal[] T00T16_A58AlbRUniEnt ;
   private java.math.BigDecimal[] T00T16_A60AlbRUniUti ;
   private int[] T00T16_A52AlbRPieEnt ;
   private int[] T00T16_A54AlbRPieUti ;
   private byte[] T00T16_A47AlbREst ;
   private String[] T00T16_A56AlbRUni ;
   private String[] T00T16_A45AlbRef ;
   private String[] T00T16_A46AlbREnt ;
   private String[] T00T16_A50AlbRLoc ;
   private java.util.Date[] T00T16_A49AlbRFen ;
   private String[] T00T16_A55AlbRReo ;
   private int[] T00T16_A53AlbRPieReb ;
   private java.math.BigDecimal[] T00T16_A59AlbRUniReb ;
   private java.util.Date[] T00T16_A48AlbRFecUlt ;
   private short[] T00T16_A1222AlbNumEti ;
   private String[] T00T16_A1291AlbRDes ;
   private String[] T00T16_A396EmprCod ;
   private short[] T00T16_A840TrnCod ;
   private boolean[] T00T16_n840TrnCod ;
   private short[] T00T16_A970ProceCod ;
   private boolean[] T00T16_n970ProceCod ;
   private short[] T00T16_A1211TipEntCod ;
   private boolean[] T00T16_n1211TipEntCod ;
   private String[] T00T124_A841TrnNom ;
   private boolean[] T00T124_n841TrnNom ;
   private String[] T00T125_A1212TipEntNom ;
   private boolean[] T00T125_n1212TipEntNom ;
   private String[] T00T126_A971ProceNom ;
   private boolean[] T00T126_n971ProceNom ;
   private String[] T00T127_A396EmprCod ;
   private int[] T00T127_A13026PedDGId ;
   private int[] T00T127_A44AlbRecCod ;
   private boolean[] T00T127_n44AlbRecCod ;
   private String[] T00T128_A396EmprCod ;
   private int[] T00T128_A11669DevCruId ;
   private int[] T00T128_A44AlbRecCod ;
   private boolean[] T00T128_n44AlbRecCod ;
   private String[] T00T129_A396EmprCod ;
   private int[] T00T129_A44AlbRecCod ;
   private boolean[] T00T129_n44AlbRecCod ;
   private String[] T00T129_A9743Emp_CUb ;
   private short[] T00T129_A5860Emp_Anp ;
   private String[] T00T130_A396EmprCod ;
   private int[] T00T130_A44AlbRecCod ;
   private boolean[] T00T130_n44AlbRecCod ;
   private String[] T00T130_A7130MatC_Pz ;
   private String[] T00T131_A396EmprCod ;
   private int[] T00T131_A44AlbRecCod ;
   private boolean[] T00T131_n44AlbRecCod ;
   private String[] T00T131_A7132MatC_Talla ;
   private String[] T00T132_A396EmprCod ;
   private int[] T00T132_A44AlbRecCod ;
   private boolean[] T00T132_n44AlbRecCod ;
   private short[] T00T132_A7115MatC_Lin ;
   private String[] T00T133_A396EmprCod ;
   private long[] T00T133_A30AlbProCod ;
   private int[] T00T133_A129BarCod ;
   private byte[] T00T133_A132BarCodReo ;
   private String[] T00T133_A130BarCodPar ;
   private short[] T00T133_A6622AlbHdRLn ;
   private String[] T00T134_A396EmprCod ;
   private int[] T00T134_A6235DevEmpCod ;
   private byte[] T00T134_A6243DevNumLin ;
   private String[] T00T135_A396EmprCod ;
   private int[] T00T135_A44AlbRecCod ;
   private boolean[] T00T135_n44AlbRecCod ;
   private short[] T00T135_A4596AlbRDefCod ;
   private String[] T00T136_A396EmprCod ;
   private int[] T00T136_A44AlbRecCod ;
   private boolean[] T00T136_n44AlbRecCod ;
   private String[] T00T136_A2159AlbRecPie ;
   private short[] T00T136_A4395AlRDefCod ;
   private String[] T00T136_A4412AlRFasCod ;
   private String[] T00T137_A396EmprCod ;
   private int[] T00T137_A44AlbRecCod ;
   private boolean[] T00T137_n44AlbRecCod ;
   private short[] T00T137_A2165HisEmpLin ;
   private String[] T00T138_A396EmprCod ;
   private int[] T00T138_A44AlbRecCod ;
   private boolean[] T00T138_n44AlbRecCod ;
   private byte[] T00T138_A1299AlbRLin ;
   private String[] T00T139_A396EmprCod ;
   private int[] T00T139_A361DisCod ;
   private int[] T00T139_A44AlbRecCod ;
   private boolean[] T00T139_n44AlbRecCod ;
   private String[] T00T140_A396EmprCod ;
   private int[] T00T140_A323DevGenCod ;
   private String[] T00T141_A396EmprCod ;
   private int[] T00T141_A129BarCod ;
   private byte[] T00T141_A132BarCodReo ;
   private String[] T00T141_A130BarCodPar ;
   private String[] T00T141_A200BarPieCod ;
   private short[] T00T143_A2152AlbDetPie ;
   private java.math.BigDecimal[] T00T143_A2149AlbDetMtr ;
   private java.math.BigDecimal[] T00T143_A2146AlbDetKgm ;
   private java.math.BigDecimal[] T00T143_A2151AlbDetMtrU ;
   private java.math.BigDecimal[] T00T143_A2148AlbDetKgmU ;
   private String[] T00T145_A396EmprCod ;
   private int[] T00T145_A44AlbRecCod ;
   private boolean[] T00T145_n44AlbRecCod ;
   private String[] T00T146_A4795AlRPieCal ;
   private int[] T00T146_A44AlbRecCod ;
   private boolean[] T00T146_n44AlbRecCod ;
   private String[] T00T146_A2159AlbRecPie ;
   private short[] T00T146_A2154AlbRecAnh ;
   private java.math.BigDecimal[] T00T146_A2157AlbRecMtr ;
   private java.math.BigDecimal[] T00T146_A2155AlbRecKgm ;
   private java.math.BigDecimal[] T00T146_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] T00T146_A2156AlbRecKgmU ;
   private String[] T00T146_A396EmprCod ;
   private String[] T00T147_A396EmprCod ;
   private int[] T00T147_A44AlbRecCod ;
   private boolean[] T00T147_n44AlbRecCod ;
   private String[] T00T147_A2159AlbRecPie ;
   private String[] T00T13_A4795AlRPieCal ;
   private int[] T00T13_A44AlbRecCod ;
   private boolean[] T00T13_n44AlbRecCod ;
   private String[] T00T13_A2159AlbRecPie ;
   private short[] T00T13_A2154AlbRecAnh ;
   private java.math.BigDecimal[] T00T13_A2157AlbRecMtr ;
   private java.math.BigDecimal[] T00T13_A2155AlbRecKgm ;
   private java.math.BigDecimal[] T00T13_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] T00T13_A2156AlbRecKgmU ;
   private String[] T00T13_A396EmprCod ;
   private String[] T00T12_A4795AlRPieCal ;
   private int[] T00T12_A44AlbRecCod ;
   private boolean[] T00T12_n44AlbRecCod ;
   private String[] T00T12_A2159AlbRecPie ;
   private short[] T00T12_A2154AlbRecAnh ;
   private java.math.BigDecimal[] T00T12_A2157AlbRecMtr ;
   private java.math.BigDecimal[] T00T12_A2155AlbRecKgm ;
   private java.math.BigDecimal[] T00T12_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] T00T12_A2156AlbRecKgmU ;
   private String[] T00T12_A396EmprCod ;
   private String[] T00T151_A396EmprCod ;
   private int[] T00T151_A44AlbRecCod ;
   private boolean[] T00T151_n44AlbRecCod ;
   private String[] T00T151_A2159AlbRecPie ;
   private int[] T00T151_A10188AlRFibOrd ;
   private String[] T00T152_A396EmprCod ;
   private int[] T00T152_A44AlbRecCod ;
   private boolean[] T00T152_n44AlbRecCod ;
   private String[] T00T152_A2159AlbRecPie ;
   private String[] T00T152_A9568CodHilz ;
   private String[] T00T153_A396EmprCod ;
   private int[] T00T153_A44AlbRecCod ;
   private boolean[] T00T153_n44AlbRecCod ;
   private String[] T00T153_A2159AlbRecPie ;
   private byte[] T00T153_A7697AlREtiTpo ;
   private String[] T00T154_A396EmprCod ;
   private int[] T00T154_A44AlbRecCod ;
   private boolean[] T00T154_n44AlbRecCod ;
   private String[] T00T154_A2159AlbRecPie ;
   private short[] T00T154_A5262AlbRecEvt ;
   private String[] T00T155_A396EmprCod ;
   private int[] T00T155_A44AlbRecCod ;
   private boolean[] T00T155_n44AlbRecCod ;
   private String[] T00T155_A2159AlbRecPie ;
   private short[] T00T155_A4395AlRDefCod ;
   private String[] T00T155_A4412AlRFasCod ;
   private String[] T00T156_A396EmprCod ;
   private int[] T00T156_A44AlbRecCod ;
   private boolean[] T00T156_n44AlbRecCod ;
   private String[] T00T156_A2159AlbRecPie ;
   private String[] T00T157_A407EmprNom ;
   private boolean[] T00T157_n407EmprNom ;
   private int[] T00T158_Gx_cnt ;
   private int[] T00T159_Gx_cnt ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class talbde5__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbde5__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbde5__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbde5__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class talbde5__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00T12", "SELECT AlRPieCal, AlbRecCod, AlbRecPie, AlbRecAnh, AlbRecMtr, AlbRecKgm, AlbRecMtrU, AlbRecKgmU, EmprCod FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?  FOR UPDATE OF AlRPieCal, AlbRecAnh, AlbRecMtr, AlbRecKgm, AlbRecMtrU, AlbRecKgmU NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T13", "SELECT AlRPieCal, AlbRecCod, AlbRecPie, AlbRecAnh, AlbRecMtr, AlbRecKgm, AlbRecMtrU, AlbRecKgmU, EmprCod FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T15", "SELECT COALESCE( T1.GXC1, 0) AS AlbDetPie, COALESCE( T1.AlbDetMtr, 0) AS AlbDetMtr, COALESCE( T1.AlbDetKgm, 0) AS AlbDetKgm, COALESCE( T1.AlbDetMtrU, 0) AS AlbDetMtrU, COALESCE( T1.AlbDetKgmU, 0) AS AlbDetKgmU FROM (SELECT COUNT(*) AS GXC1, EmprCod, AlbRecCod, SUM(AlbRecMtr) AS AlbDetMtr, SUM(AlbRecKgm) AS AlbDetKgm, SUM(AlbRecMtrU) AS AlbDetMtrU, SUM(AlbRecKgmU) AS AlbDetKgmU FROM TXPALBDET GROUP BY EmprCod, AlbRecCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T16", "SELECT AlbRecCod, CliCod, AlbRUniEnt, AlbRUniUti, AlbRPieEnt, AlbRPieUti, AlbREst, AlbRUni, AlbRef, AlbREnt, AlbRLoc, AlbRFen, AlbRReo, AlbRPieReb, AlbRUniReb, AlbRFecUlt, AlbNumEti, AlbRDes, EmprCod, TrnCod, ProceCod, TipEntCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF CliCod, AlbRUniEnt, AlbRUniUti, AlbRPieEnt, AlbRPieUti, AlbREst, AlbRUni, AlbRef, AlbREnt, AlbRLoc, AlbRFen, AlbRReo, AlbRPieReb, AlbRUniReb, AlbRFecUlt, AlbNumEti, AlbRDes, TrnCod, ProceCod, TipEntCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T17", "SELECT AlbRecCod, CliCod, AlbRUniEnt, AlbRUniUti, AlbRPieEnt, AlbRPieUti, AlbREst, AlbRUni, AlbRef, AlbREnt, AlbRLoc, AlbRFen, AlbRReo, AlbRPieReb, AlbRUniReb, AlbRFecUlt, AlbNumEti, AlbRDes, EmprCod, TrnCod, ProceCod, TipEntCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T18", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T19", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T110", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T111", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T112", "SELECT TipEntNom FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T114", "SELECT /*+ FIRST_ROWS(1) */ TM1.AlbRecCod, TM1.CliCod, TM1.AlbRUniEnt, TM1.AlbRUniUti, TM1.AlbRPieEnt, TM1.AlbRPieUti, TM1.AlbREst, TM1.AlbRUni, T2.EmprNom, T3.CliNom, TM1.AlbRef, T5.TrnNom, TM1.AlbREnt, TM1.AlbRLoc, TM1.AlbRFen, TM1.AlbRReo, TM1.AlbRPieReb, TM1.AlbRUniReb, TM1.AlbRFecUlt, T6.TipEntNom, TM1.AlbNumEti, TM1.AlbRDes, T7.ProceNom, TM1.EmprCod, TM1.TrnCod, TM1.ProceCod, TM1.TipEntCod, COALESCE( T4.GXC1, 0) AS AlbDetPie, COALESCE( T4.AlbDetMtr, 0) AS AlbDetMtr, COALESCE( T4.AlbDetKgm, 0) AS AlbDetKgm, COALESCE( T4.AlbDetMtrU, 0) AS AlbDetMtrU, COALESCE( T4.AlbDetKgmU, 0) AS AlbDetKgmU FROM ((((((TXPALBREC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) LEFT JOIN (SELECT COUNT(*) AS GXC1, EmprCod, AlbRecCod, SUM(AlbRecMtr) AS AlbDetMtr, SUM(AlbRecKgm) AS AlbDetKgm, SUM(AlbRecMtrU) AS AlbDetMtrU, SUM(AlbRecKgmU) AS AlbDetKgmU FROM TXPALBDET GROUP BY EmprCod, AlbRecCod ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.AlbRecCod = TM1.AlbRecCod) LEFT JOIN TXPTRANSP T5 ON T5.EmprCod = TM1.EmprCod AND T5.TrnCod = TM1.TrnCod) LEFT JOIN TXPENTRAD T6 ON T6.EmprCod = TM1.EmprCod AND T6.TipEntCod = TM1.TipEntCod) LEFT JOIN TXPPROCED T7 ON T7.EmprCod = TM1.EmprCod AND T7.ProceCod = TM1.ProceCod) WHERE TM1.EmprCod = ? and TM1.AlbRecCod = ? and TM1.CliCod = ? ORDER BY TM1.EmprCod, TM1.AlbRecCod ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T115", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T116", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T117", "SELECT TipEntNom FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T118", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T119", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod, CliCod FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? and CliCod = ? ORDER BY EmprCod, AlbRecCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T120", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbRecCod, CliCod FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? and CliCod = ? ORDER BY EmprCod DESC, AlbRecCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00T121", "INSERT INTO TXPALBREC(AlbRecCod, CliCod, AlbRUniEnt, AlbRUniUti, AlbRPieEnt, AlbRPieUti, AlbREst, AlbRUni, AlbRef, AlbREnt, AlbRLoc, AlbRFen, AlbRReo, AlbRPieReb, AlbRUniReb, AlbRFecUlt, AlbNumEti, AlbRDes, EmprCod, TrnCod, ProceCod, TipEntCod, AlbRUlin, HisEmpULin, AlbRDisCli, AlbRImp, AlbRefDsc, AlbPmPPza, AlbRTam, AlbRMdlCod, AlbRUniLot, AlbRPieLot, AlbRHEn, ClasCod, AlbRGrm2, AlbRAnc, AlbPml, AlbRPre, AlbRAju, AlbRRep, AlbREnt2, AlbrUsu, AlbrHor, AlbrUniC, AlbrPieC, AlbrNF, AlbrFeNf, AlbrCfop, AlbRTartC, AlbRLote, AlbRTelar, AlbRLu, AlbRTara, AlbRUniB, AlbDocPrv, AlbRUdas, AlmCod, MatC_ULin, AlbRecSec, AlbColor, AlbOpsT, AlbOpsC, AlbOC, AlbHdri, AlbNumB, AlbNumM, AlbAncC, AlbDndC, AlbAncCr, AlbDndCr, AlbGalga, AlbMaqTej, AlbDmt, Bod_UltPz, Emp_Item1, AlbPdaC, AlbOStj, AlbStLot, AlbTurno, AlbUltP, Cod_mta, AlbOEKOTEX, AlbRPh, AlbRRLong, AlbRRTrans, AlbRLot2) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', ' ', ' ', 0, ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, ' ')", GX_NOMASK, "TXPALBREC")
         ,new UpdateCursor("T00T122", "UPDATE TXPALBREC SET CliCod=?, AlbRUniEnt=?, AlbRUniUti=?, AlbRPieEnt=?, AlbRPieUti=?, AlbREst=?, AlbRUni=?, AlbRef=?, AlbREnt=?, AlbRLoc=?, AlbRFen=?, AlbRReo=?, AlbRPieReb=?, AlbRUniReb=?, AlbRFecUlt=?, AlbNumEti=?, AlbRDes=?, TrnCod=?, ProceCod=?, TipEntCod=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new UpdateCursor("T00T123", "DELETE FROM TXPALBREC  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("T00T124", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T125", "SELECT TipEntNom FROM TXPENTRAD WHERE EmprCod = ? AND TipEntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T126", "SELECT ProceNom FROM TXPPROCED WHERE EmprCod = ? AND ProceCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T127", "SELECT * FROM (SELECT EmprCod, PedDGId, AlbRecCod FROM TXPPEDDG3 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T128", "SELECT * FROM (SELECT EmprCod, DevCruId, AlbRecCod FROM TXPDEVCR1 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T129", "SELECT * FROM (SELECT EmprCod, AlbRecCod, Emp_CUb, Emp_Anp FROM TXPUBIIN WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T130", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Pz FROM TXPREPPZS WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T131", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Talla FROM TXPREPTAL WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T132", "SELECT * FROM (SELECT EmprCod, AlbRecCod, MatC_Lin FROM TXPREPMAT WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T133", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdRLn FROM TXPALBREP WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T134", "SELECT * FROM (SELECT EmprCod, DevEmpCod, DevNumLin FROM TXPDEVEM1 WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T135", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRDefCod FROM TXPALBRDF WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T136", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie, AlRDefCod, AlRFasCod FROM TXPAlRPie WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T137", "SELECT * FROM (SELECT EmprCod, AlbRecCod, HisEmpLin FROM TXPHISEMP WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T138", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRLin FROM TXPALBROB WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T139", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T140", "SELECT * FROM (SELECT EmprCod, DevGenCod FROM TXPDEVGEN WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T141", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? AND AlbRecCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T143", "SELECT COALESCE( T1.GXC1, 0) AS AlbDetPie, COALESCE( T1.AlbDetMtr, 0) AS AlbDetMtr, COALESCE( T1.AlbDetKgm, 0) AS AlbDetKgm, COALESCE( T1.AlbDetMtrU, 0) AS AlbDetMtrU, COALESCE( T1.AlbDetKgmU, 0) AS AlbDetKgmU FROM (SELECT COUNT(*) AS GXC1, EmprCod, AlbRecCod, SUM(AlbRecMtr) AS AlbDetMtr, SUM(AlbRecKgm) AS AlbDetKgm, SUM(AlbRecMtrU) AS AlbDetMtrU, SUM(AlbRecKgmU) AS AlbDetKgmU FROM TXPALBDET GROUP BY EmprCod, AlbRecCod ) T1 WHERE T1.EmprCod = ? AND T1.AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00T144", "UPDATE TXPALBREC SET AlbRUniEnt=?, AlbRUniUti=?, AlbRPieEnt=?, AlbRPieUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("T00T145", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? and CliCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T146", "SELECT AlRPieCal, AlbRecCod, AlbRecPie, AlbRecAnh, AlbRecMtr, AlbRecKgm, AlbRecMtrU, AlbRecKgmU, EmprCod FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? and AlbRecPie = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T147", "SELECT EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00T148", "INSERT INTO TXPALBDET(AlRPieCal, AlbRecCod, AlbRecPie, AlbRecAnh, AlbRecMtr, AlbRecKgm, AlbRecMtrU, AlbRecKgmU, EmprCod, AlbRecCol, AlbRecIdPz, AlbRecIdRc, AlbRecPal, AlRPieClaM, AlRPieUltC, AlRPieDefT, AlRPieDefC, AlRExp1, AlRExp2, AlbRecFec, AlbRecPar, AlbRecCue, ALRPIELOC, ALRPIETEL, ALRPIEOPE, ALRPIEST, AlbRecPnt, AlbRecCo1, AlbRecCo2, AlbHdr, AlbHdrr, AlbHdrp, AlbSerT, AlbColNm, AlbColNn, AlbKgsPf, AlbMtsPf, AlbAfin, AlbNPed, AlbObsp, Bod_Dib, Bod_Tua, Bod_Tub, Bod_Tuc, Bod_Hilz, Bod_FecE, Bod_PedOr, Bod_Rack, Bod_PoS, Bod_Ok, Bod_Talla, Bod_Und, Bod_Medt, Bod_ColNNn, Bod_Por, Bod_codb, Bod_Pes, Bod_DibO, Bod_item3, Bod_ToE, Bod_DescP, Bod_CVar, Bod_NVar, AlRPieTelT, AlRPieCon, AlRPieOri, AlRPieDst, AlrPieKgmT, AlbPCont) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', ' ', 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', 0, 0)", GX_NOMASK, "TXPALBDET")
         ,new UpdateCursor("T00T149", "UPDATE TXPALBDET SET AlRPieCal=?, AlbRecAnh=?, AlbRecMtr=?, AlbRecKgm=?, AlbRecMtrU=?, AlbRecKgmU=?  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?", GX_NOMASK, "TXPALBDET")
         ,new UpdateCursor("T00T150", "DELETE FROM TXPALBDET  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?", GX_NOMASK, "TXPALBDET")
         ,new ForEachCursor("T00T151", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie, AlRFibOrd FROM TXPAlrPiF WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T152", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie, CodHilz FROM TXPHILZPZ WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T153", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie, AlREtiTpo FROM TXPAlRPi1 WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T154", "SELECT * FROM (SELECT EmprCod, albreccod, AlbRecPie, AlbRecEvt FROM TXPALRHIS WHERE EmprCod = ? AND albreccod = ? AND AlbRecPie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T155", "SELECT * FROM (SELECT EmprCod, AlbRecCod, AlbRecPie, AlRDefCod, AlRFasCod FROM TXPAlRPie WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00T156", "SELECT EmprCod, AlbRecCod, AlbRecPie FROM TXPALBDET WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, AlbRecPie ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T157", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T158", "SELECT COUNT(*) FROM TXPALBDET WHERE ( EmprCod = ? and AlbRecCod = ?) and ( AlbRecKgm = AlbRecKgmU) ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00T159", "SELECT COUNT(*) FROM TXPALBDET WHERE ( EmprCod = ? and AlbRecCod = ?) and ( AlbRecMtr = AlbRecMtrU) ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((String[]) buf[10])[0] = rslt.getString(11, 10);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 2);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(16);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 20);
               ((String[]) buf[18])[0] = rslt.getString(19, 3);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(21);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(22);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((String[]) buf[10])[0] = rslt.getString(11, 10);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 2);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(16);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 20);
               ((String[]) buf[18])[0] = rslt.getString(19, 3);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(21);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(22);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(10, 30);
               ((String[]) buf[11])[0] = rslt.getString(11, 16);
               ((String[]) buf[12])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(13, 8);
               ((String[]) buf[15])[0] = rslt.getString(14, 10);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(15);
               ((String[]) buf[17])[0] = rslt.getString(16, 2);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(18,2);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(19);
               ((String[]) buf[21])[0] = rslt.getString(20, 25);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(21);
               ((String[]) buf[24])[0] = rslt.getString(22, 20);
               ((String[]) buf[25])[0] = rslt.getString(23, 30);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(24, 3);
               ((short[]) buf[28])[0] = rslt.getShort(25);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(26);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(27);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((short[]) buf[34])[0] = rslt.getShort(28);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(29,2);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(30,2);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(31,2);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(32,2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 25);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 38 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 3);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 53 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 54 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
               stmt.setString(3, (String)parms[3], 9);
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
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 2 :
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 8 :
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
            case 9 :
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setInt(3, ((Number) parms[3]).intValue());
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setString(8, (String)parms[8], 1);
               stmt.setString(9, (String)parms[9], 16);
               stmt.setString(10, (String)parms[10], 8);
               stmt.setString(11, (String)parms[11], 10);
               stmt.setDate(12, (java.util.Date)parms[12]);
               stmt.setString(13, (String)parms[13], 2);
               stmt.setInt(14, ((Number) parms[14]).intValue());
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[15], 2);
               stmt.setDate(16, (java.util.Date)parms[16]);
               stmt.setShort(17, ((Number) parms[17]).shortValue());
               stmt.setString(18, (String)parms[18], 20);
               stmt.setString(19, (String)parms[19], 3);
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[21]).shortValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[25]).shortValue());
               }
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setString(9, (String)parms[8], 8);
               stmt.setString(10, (String)parms[9], 10);
               stmt.setDate(11, (java.util.Date)parms[10]);
               stmt.setString(12, (String)parms[11], 2);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[13], 2);
               stmt.setDate(15, (java.util.Date)parms[14]);
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setString(17, (String)parms[16], 20);
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[18]).shortValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[20]).shortValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[22]).shortValue());
               }
               stmt.setString(21, (String)parms[23], 3);
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(22, ((Number) parms[25]).intValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
               return;
            case 39 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 3);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[7]).intValue());
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
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
               stmt.setString(3, (String)parms[3], 9);
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
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 16);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 2);
               stmt.setString(9, (String)parms[9], 3);
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setString(7, (String)parms[6], 3);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[8]).intValue());
               }
               stmt.setString(9, (String)parms[9], 9);
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
               stmt.setString(3, (String)parms[3], 9);
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
               stmt.setString(3, (String)parms[3], 9);
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
               stmt.setString(3, (String)parms[3], 9);
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
               stmt.setString(3, (String)parms[3], 9);
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
               stmt.setString(3, (String)parms[3], 9);
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
               stmt.setString(3, (String)parms[3], 9);
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
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
      }
   }

}

