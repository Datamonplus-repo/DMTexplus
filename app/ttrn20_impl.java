package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrn20_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"MOLACTIVO") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1013DibCli = httpContext.GetPar( "DibCli") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1014DibInt = (int)(GXutil.lval( httpContext.GetPar( "DibInt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         A2098MolCod = (byte)(GXutil.lval( httpContext.GetPar( "MolCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asamolactivo1LY557( A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt, A2098MolCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TAESDC2") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11759TaesId2 = httpContext.GetPar( "TaesId2") ;
         n11759TaesId2 = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asataesdc21LY557( A396EmprCod, A11759TaesId2) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"MOLCODVIR") == 0 )
      {
         A2098MolCod = (byte)(GXutil.lval( httpContext.GetPar( "MolCod"))) ;
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1013DibCli = httpContext.GetPar( "DibCli") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1014DibInt = (int)(GXutil.lval( httpContext.GetPar( "DibInt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         A1823DibTipMaq = httpContext.GetPar( "DibTipMaq") ;
         n1823DibTipMaq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", A1823DibTipMaq);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx5asamolcodvir1LY557( A2098MolCod, A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt, A1823DibTipMaq) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"MOLDIB") == 0 )
      {
         A2098MolCod = (byte)(GXutil.lval( httpContext.GetPar( "MolCod"))) ;
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1013DibCli = httpContext.GetPar( "DibCli") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1014DibInt = (int)(GXutil.lval( httpContext.GetPar( "DibInt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         A1823DibTipMaq = httpContext.GetPar( "DibTipMaq") ;
         n1823DibTipMaq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", A1823DibTipMaq);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asamoldib1LY557( A2098MolCod, A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt, A1823DibTipMaq) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel7"+"_"+"MOLPRCCOB") == 0 )
      {
         A2098MolCod = (byte)(GXutil.lval( httpContext.GetPar( "MolCod"))) ;
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1013DibCli = httpContext.GetPar( "DibCli") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1014DibInt = (int)(GXutil.lval( httpContext.GetPar( "DibInt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         A1823DibTipMaq = httpContext.GetPar( "DibTipMaq") ;
         n1823DibTipMaq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", A1823DibTipMaq);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx7asamolprccob1LY557( A2098MolCod, A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt, A1823DibTipMaq) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A499GrpFamCod = (byte)(GXutil.lval( httpContext.GetPar( "GrpFamCod"))) ;
         n499GrpFamCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A499GrpFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A499GrpFamCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_13( A396EmprCod, A499GrpFamCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_14") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A583IntCod = (byte)(GXutil.lval( httpContext.GetPar( "IntCod"))) ;
         n583IntCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A396EmprCod, A583IntCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_12( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A2141SerEst = httpContext.GetPar( "SerEst") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_16( A396EmprCod, A252CliCod, A2141SerEst) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1013DibCli = httpContext.GetPar( "DibCli") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1014DibInt = (int)(GXutil.lval( httpContext.GetPar( "DibInt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_18") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A8052Dg_codigo = (short)(GXutil.lval( httpContext.GetPar( "Dg_codigo"))) ;
         n8052Dg_codigo = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_18( A396EmprCod, A8052Dg_codigo) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A2141SerEst = httpContext.GetPar( "SerEst") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
         A1013DibCli = httpContext.GetPar( "DibCli") ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A1014DibInt = (int)(GXutil.lval( httpContext.GetPar( "DibInt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         A2074ColCom = httpContext.GetPar( "ColCom") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2074ColCom", A2074ColCom);
         A2078ColFon = httpContext.GetPar( "ColFon") ;
         httpContext.ajax_rsp_assign_attri("", false, "A2078ColFon", A2078ColFon);
         A2098MolCod = (byte)(GXutil.lval( httpContext.GetPar( "MolCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_19( A396EmprCod, A252CliCod, A2141SerEst, A1013DibCli, A1014DibInt, A2074ColCom, A2078ColFon, A2098MolCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_21") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_21( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_22") == 0 )
      {
         A2144UniEstCod = httpContext.GetPar( "UniEstCod") ;
         n2144UniEstCod = false ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_22( A2144UniEstCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
      {
         gxnrgrid1_newrow_invoke( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid2") == 0 )
      {
         gxnrgrid2_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento Formulas Estampacion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCliCod_Internalname ;
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
      nRC_GXsfl_150 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_150"))) ;
      nGXsfl_150_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_150_idx"))) ;
      sGXsfl_150_idx = httpContext.GetPar( "sGXsfl_150_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public void gxnrgrid2_newrow_invoke( )
   {
      nRC_GXsfl_257 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_257"))) ;
      nGXsfl_257_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_257_idx"))) ;
      sGXsfl_257_idx = httpContext.GetPar( "sGXsfl_257_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid2_newrow( ) ;
      /* End function gxnrGrid2_newrow_invoke */
   }

   public ttrn20_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrn20_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn20_impl.class ));
   }

   public ttrn20_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      lstDibTipMaq = new HTMLChoice();
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
      if ( lstDibTipMaq.getItemCount() > 0 )
      {
         A1823DibTipMaq = lstDibTipMaq.getValidValue(A1823DibTipMaq) ;
         n1823DibTipMaq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", A1823DibTipMaq);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         lstDibTipMaq.setValue( GXutil.rtrim( A1823DibTipMaq) );
         httpContext.ajax_rsp_assign_prop("", false, lstDibTipMaq.getInternalname(), "Values", lstDibTipMaq.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn20.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 6,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn20.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 7,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn20.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn20.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TTrn20.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Código Empresa", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock2_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblock2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock3_Internalname, httpContext.getMessage( "Serie", ""), "", "", lblTextblock3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSerEst_Internalname, GXutil.rtrim( A2141SerEst), GXutil.rtrim( localUtil.format( A2141SerEst, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSerEst_Jsonclick, 0, "", "", "", "", "", 1, edtSerEst_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock4_Internalname, httpContext.getMessage( "Dibujo del Cliente", ""), "", "", lblTextblock4_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibCli_Internalname, GXutil.rtrim( A1013DibCli), GXutil.rtrim( localUtil.format( A1013DibCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibCli_Jsonclick, 0, "", "", "", "", "", 1, edtDibCli_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock5_Internalname, httpContext.getMessage( "Dibujo Interno", ""), "", "", lblTextblock5_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibInt_Internalname, GXutil.ltrim( localUtil.ntoc( A1014DibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDibInt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibInt_Jsonclick, 0, "", "", "", "", "", 1, edtDibInt_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock6_Internalname, httpContext.getMessage( "Combinacion", ""), "", "", lblTextblock6_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtColCom_Internalname, GXutil.rtrim( A2074ColCom), GXutil.rtrim( localUtil.format( A2074ColCom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColCom_Jsonclick, 0, "", "", "", "", "", 1, edtColCom_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock7_Internalname, httpContext.getMessage( "Fondo", ""), "", "", lblTextblock7_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtColFon_Internalname, GXutil.rtrim( A2078ColFon), GXutil.rtrim( localUtil.format( A2078ColFon, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColFon_Jsonclick, 0, "", "", "", "", "", 1, edtColFon_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn20.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_get_Internalname, "", httpContext.getMessage( "GX_BtnGet", ""), bttBtn_get_Jsonclick, 6, httpContext.getMessage( "GX_BtnGet", ""), "", StyleString, ClassString, bttBtn_get_Visible, bttBtn_get_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EGET."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock8_Internalname, httpContext.getMessage( "Nombre", ""), "", "", lblTextblock8_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock9_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "", "", lblTextblock9_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock10_Internalname, httpContext.getMessage( "Tipo Maquina  Plana,Rotativa,Digital", ""), "", "", lblTextblock10_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* ListBox */
      app.GxWebStd.gx_listbox_ctrl1( httpContext, lstDibTipMaq, lstDibTipMaq.getInternalname(), GXutil.rtrim( A1823DibTipMaq), 3, lstDibTipMaq.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, lstDibTipMaq.getEnabled(), 1, (short)(0), 0, "em", 0, "row", "", "", "", "", "", "", true, (byte)(0), "HLP_TTrn20.htm");
      lstDibTipMaq.setValue( GXutil.rtrim( A1823DibTipMaq) );
      httpContext.ajax_rsp_assign_prop("", false, lstDibTipMaq.getInternalname(), "Values", lstDibTipMaq.ToJavascriptSource(), true);
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock11_Internalname, httpContext.getMessage( "Numero de Moldes/Cilindros", ""), "", "", lblTextblock11_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibMolCil_Internalname, GXutil.ltrim( localUtil.ntoc( A1019DibMolCil, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDibMolCil_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1019DibMolCil), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1019DibMolCil), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibMolCil_Jsonclick, 0, "", "", "", "", "", 1, edtDibMolCil_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock12_Internalname, httpContext.getMessage( "Numero Moldes cilindros", ""), "", "", lblTextblock12_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibMolCi2_Internalname, GXutil.ltrim( localUtil.ntoc( A2090DibMolCi2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDibMolCi2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2090DibMolCi2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2090DibMolCi2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibMolCi2_Jsonclick, 0, "", "", "", "", "", 1, edtDibMolCi2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock13_Internalname, httpContext.getMessage( "Moldes / Cilindro", ""), "", "", lblTextblock13_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtColMolCil_Internalname, GXutil.ltrim( localUtil.ntoc( A2079ColMolCil, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtColMolCil_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2079ColMolCil), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2079ColMolCil), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColMolCil_Jsonclick, 0, "", "", "", "", "", 1, edtColMolCil_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock14_Internalname, httpContext.getMessage( "Busqueda de Serie", ""), "", "", lblTextblock14_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtColEstSer_Internalname, GXutil.rtrim( A2077ColEstSer), GXutil.rtrim( localUtil.format( A2077ColEstSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColEstSer_Jsonclick, 0, "", "", "", "", "", 1, edtColEstSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock15_Internalname, httpContext.getMessage( "Ancho", ""), "", "", lblTextblock15_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtColEstAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A2075ColEstAnh, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtColEstAnh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2075ColEstAnh), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2075ColEstAnh), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColEstAnh_Jsonclick, 0, "", "", "", "", "", 1, edtColEstAnh_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock16_Internalname, httpContext.getMessage( "Cód Externo", ""), "", "", lblTextblock16_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtColCodExt_Internalname, GXutil.rtrim( A5336ColCodExt), GXutil.rtrim( localUtil.format( A5336ColCodExt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColCodExt_Jsonclick, 0, "", "", "", "", "", 1, edtColCodExt_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock17_Internalname, httpContext.getMessage( "Metros Base", ""), "", "", lblTextblock17_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtColEstMba_Internalname, GXutil.ltrim( localUtil.ntoc( A2076ColEstMba, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtColEstMba_Enabled!=0) ? localUtil.format( A2076ColEstMba, "ZZZZZ9.99") : localUtil.format( A2076ColEstMba, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,101);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColEstMba_Jsonclick, 0, "", "", "", "", "", 1, edtColEstMba_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock18_Internalname, httpContext.getMessage( "Cobertura al 100%", ""), "", "", lblTextblock18_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibCob_Internalname, GXutil.ltrim( localUtil.ntoc( A4861DibCob, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDibCob_Enabled!=0) ? localUtil.format( A4861DibCob, "ZZ9.99") : localUtil.format( A4861DibCob, "ZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibCob_Jsonclick, 0, "", "", "", "", "", 1, edtDibCob_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock19_Internalname, httpContext.getMessage( "Código Intensidad", ""), "", "", lblTextblock19_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtIntCod_Internalname, GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtIntCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A583IntCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntCod_Jsonclick, 0, "", "", "", "", "", 1, edtIntCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock20_Internalname, httpContext.getMessage( "Descripción Intensidad", ""), "", "", lblTextblock20_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtIntDsc_Internalname, GXutil.rtrim( A584IntDsc), GXutil.rtrim( localUtil.format( A584IntDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtIntDsc_Jsonclick, 0, "", "", "", "", "", 1, edtIntDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock21_Internalname, httpContext.getMessage( "Bitmap de la Comb de Estampado", ""), "", "", lblTextblock21_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtColBmp_Internalname, GXutil.rtrim( A7028ColBmp), GXutil.rtrim( localUtil.format( A7028ColBmp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,121);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColBmp_Jsonclick, 0, "", "", "", "", "", 1, edtColBmp_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock22_Internalname, httpContext.getMessage( "DibBmp", ""), "", "", lblTextblock22_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibBmp_Internalname, GXutil.rtrim( A7140DibBmp), GXutil.rtrim( localUtil.format( A7140DibBmp, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibBmp_Jsonclick, 0, "", "", "", "", "", 1, edtDibBmp_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock23_Internalname, httpContext.getMessage( "Codigo Familia", ""), "", "", lblTextblock23_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 131,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGrpFamCod_Internalname, GXutil.ltrim( localUtil.ntoc( A499GrpFamCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGrpFamCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A499GrpFamCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A499GrpFamCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,131);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGrpFamCod_Jsonclick, 0, "", "", "", "", "", 1, edtGrpFamCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock24_Internalname, httpContext.getMessage( "Descripcion Familia", ""), "", "", lblTextblock24_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGrpFamDsc_Internalname, GXutil.rtrim( A500GrpFamDsc), GXutil.rtrim( localUtil.format( A500GrpFamDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGrpFamDsc_Jsonclick, 0, "", "", "", "", "", 1, edtGrpFamDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock25_Internalname, httpContext.getMessage( "Nombre Color Variante", ""), "", "", lblTextblock25_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtColNomCol_Internalname, GXutil.rtrim( A8419ColNomCol), GXutil.rtrim( localUtil.format( A8419ColNomCol, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColNomCol_Jsonclick, 0, "", "", "", "", "", 1, edtColNomCol_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock26_Internalname, httpContext.getMessage( "Consumo Pasta Articulo por gr/m2", ""), "", "", lblTextblock26_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtColGrm2_Internalname, GXutil.ltrim( localUtil.ntoc( A10770ColGrm2, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtColGrm2_Enabled!=0) ? localUtil.format( A10770ColGrm2, "ZZZZZ9.99") : localUtil.format( A10770ColGrm2, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,146);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtColGrm2_Jsonclick, 0, "", "", "", "", "", 1, edtColGrm2_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn20.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "<td>") ;
      /*  Grid Control  */
      startgridcontrol150( ) ;
      /* Save parent mode. */
      sMode557 = Gx_mode ;
      nGXsfl_150_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount557 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_557 = (short)(1) ;
            scanStart1LY557( ) ;
            while ( RcdFound557 != 0 )
            {
               init_level_properties557( ) ;
               getByPrimaryKey1LY557( ) ;
               addRow1LY557( ) ;
               scanNext1LY557( ) ;
            }
            scanEnd1LY557( ) ;
            nBlankRcdCount557 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1LY557( ) ;
         standaloneModal1LY557( ) ;
         sMode557 = Gx_mode ;
         while ( nGXsfl_150_idx < nRC_GXsfl_150 )
         {
            bGXsfl_150_Refreshing = true ;
            readRow1LY557( ) ;
            edtMolCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOLCOD_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMolCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMolCod_Enabled), 5, 0), !bGXsfl_150_Refreshing);
            edtMolCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOLCON_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMolCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMolCon_Enabled), 5, 0), !bGXsfl_150_Refreshing);
            edtMolDib_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOLDIB_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMolDib_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMolDib_Enabled), 5, 0), !bGXsfl_150_Refreshing);
            edtMolCodVir_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOLCODVIR_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMolCodVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMolCodVir_Enabled), 5, 0), !bGXsfl_150_Refreshing);
            edtForPrdUL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUL_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdUL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUL_Enabled), 5, 0), !bGXsfl_150_Refreshing);
            edtMolPesMin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOLPESMIN_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMolPesMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMolPesMin_Enabled), 5, 0), !bGXsfl_150_Refreshing);
            edtMolForEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOLFOREST_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMolForEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMolForEst_Enabled), 5, 0), !bGXsfl_150_Refreshing);
            edtMolPesMax_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOLPESMAX_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMolPesMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMolPesMax_Enabled), 5, 0), !bGXsfl_150_Refreshing);
            edtMolCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOLCOL_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMolCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMolCol_Enabled), 5, 0), !bGXsfl_150_Refreshing);
            edtMolPrcCob_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOLPRCCOB_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMolPrcCob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMolPrcCob_Enabled), 5, 0), !bGXsfl_150_Refreshing);
            edtTotParCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TOTPARCOL_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTotParCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTotParCol_Enabled), 5, 0), !bGXsfl_150_Refreshing);
            edtTotColMol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TOTCOLMOL_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTotColMol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTotColMol_Enabled), 5, 0), !bGXsfl_150_Refreshing);
            edtDg_codigo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DG_CODIGO_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDg_codigo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDg_codigo_Enabled), 5, 0), !bGXsfl_150_Refreshing);
            edtDg_Degr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DG_DEGR_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDg_Degr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDg_Degr_Enabled), 5, 0), !bGXsfl_150_Refreshing);
            edtDg_Valor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DG_VALOR_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDg_Valor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDg_Valor_Enabled), 5, 0), !bGXsfl_150_Refreshing);
            edtMolActivo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOLACTIVO_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMolActivo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMolActivo_Enabled), 5, 0), !bGXsfl_150_Refreshing);
            edtMolPorVar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOLPORVAR_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMolPorVar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMolPorVar_Enabled), 5, 0), !bGXsfl_150_Refreshing);
            edtTaesId2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAESID2_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTaesId2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesId2_Enabled), 5, 0), !bGXsfl_150_Refreshing);
            edtTaesDc2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAESDC2_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTaesDc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesDc2_Enabled), 5, 0), !bGXsfl_150_Refreshing);
            edtPasForUL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASFORUL_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPasForUL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasForUL_Enabled), 5, 0), !bGXsfl_150_Refreshing);
            if ( ( nRcdExists_557 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1LY557( ) ;
            }
            sendRow1LY557( ) ;
            bGXsfl_150_Refreshing = false ;
         }
         Gx_mode = sMode557 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount557 = (short)(5) ;
         nRcdExists_557 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1LY557( ) ;
            while ( RcdFound557 != 0 )
            {
               sGXsfl_150_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_150_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_150557( ) ;
               init_level_properties557( ) ;
               standaloneNotModal1LY557( ) ;
               getByPrimaryKey1LY557( ) ;
               standaloneModal1LY557( ) ;
               addRow1LY557( ) ;
               scanNext1LY557( ) ;
            }
            scanEnd1LY557( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode557 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_150_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_150_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_150557( ) ;
      initAll1LY557( ) ;
      init_level_properties557( ) ;
      nRcdExists_557 = (short)(0) ;
      nIsMod_557 = (short)(0) ;
      nRcdDeleted_557 = (short)(0) ;
      nBlankRcdCount557 = (short)(nBlankRcdUsr557+nBlankRcdCount557) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount557 > 0 )
      {
         standaloneNotModal1LY557( ) ;
         standaloneModal1LY557( ) ;
         addRow1LY557( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMolCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount557 = (short)(nBlankRcdCount557-1) ;
      }
      Gx_mode = sMode557 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* Restore parent mode. */
      Gx_mode = sMode557 ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 267,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn20.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 268,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_check_Internalname, "", httpContext.getMessage( "GX_BtnCheck", ""), bttBtn_check_Jsonclick, 5, httpContext.getMessage( "GX_BtnCheck", ""), "", StyleString, ClassString, bttBtn_check_Visible, bttBtn_check_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"ECHECK."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn20.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 269,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn20.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 270,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn20.htm");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 271,'',false,'',0)\"" ;
      ClassString = "" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_help_Internalname, "", httpContext.getMessage( "GX_BtnHelp", ""), bttBtn_help_Jsonclick, 3, httpContext.getMessage( "GX_BtnHelp", ""), "", StyleString, ClassString, bttBtn_help_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EHELP."+"'", TempTags, "", 2, "HLP_TTrn20.htm");
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
      e111LY2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2141SerEst = httpContext.cgiGet( "Z2141SerEst") ;
            Z1013DibCli = httpContext.cgiGet( "Z1013DibCli") ;
            Z1014DibInt = (int)(localUtil.ctol( httpContext.cgiGet( "Z1014DibInt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2074ColCom = httpContext.cgiGet( "Z2074ColCom") ;
            Z2078ColFon = httpContext.cgiGet( "Z2078ColFon") ;
            Z2079ColMolCil = (short)(localUtil.ctol( httpContext.cgiGet( "Z2079ColMolCil"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5336ColCodExt = httpContext.cgiGet( "Z5336ColCodExt") ;
            Z2076ColEstMba = localUtil.ctond( httpContext.cgiGet( "Z2076ColEstMba")) ;
            Z7028ColBmp = httpContext.cgiGet( "Z7028ColBmp") ;
            Z8419ColNomCol = httpContext.cgiGet( "Z8419ColNomCol") ;
            Z10770ColGrm2 = localUtil.ctond( httpContext.cgiGet( "Z10770ColGrm2")) ;
            Z499GrpFamCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z499GrpFamCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z583IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z583IntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_150 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_150"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            else
            {
               A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            A2141SerEst = httpContext.cgiGet( edtSerEst_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
            A1013DibCli = httpContext.cgiGet( edtDibCli_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DIBINT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDibInt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1014DibInt = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
            }
            else
            {
               A1014DibInt = (int)(localUtil.ctol( httpContext.cgiGet( edtDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
            }
            A2074ColCom = httpContext.cgiGet( edtColCom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2074ColCom", A2074ColCom);
            A2078ColFon = httpContext.cgiGet( edtColFon_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2078ColFon", A2078ColFon);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            lstDibTipMaq.setName( lstDibTipMaq.getInternalname() );
            lstDibTipMaq.setValue( httpContext.cgiGet( lstDibTipMaq.getInternalname()) );
            A1823DibTipMaq = httpContext.cgiGet( lstDibTipMaq.getInternalname()) ;
            n1823DibTipMaq = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", A1823DibTipMaq);
            A1019DibMolCil = (short)(localUtil.ctol( httpContext.cgiGet( edtDibMolCil_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1019DibMolCil = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1019DibMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1019DibMolCil), 4, 0));
            A2090DibMolCi2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDibMolCi2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n2090DibMolCi2 = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2090DibMolCi2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2090DibMolCi2), 4, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtColMolCil_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtColMolCil_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "COLMOLCIL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtColMolCil_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2079ColMolCil = (short)(0) ;
               n2079ColMolCil = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2079ColMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2079ColMolCil), 4, 0));
            }
            else
            {
               A2079ColMolCil = (short)(localUtil.ctol( httpContext.cgiGet( edtColMolCil_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n2079ColMolCil = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2079ColMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2079ColMolCil), 4, 0));
            }
            A2077ColEstSer = httpContext.cgiGet( edtColEstSer_Internalname) ;
            n2077ColEstSer = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2077ColEstSer", A2077ColEstSer);
            A2075ColEstAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtColEstAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n2075ColEstAnh = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2075ColEstAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2075ColEstAnh), 3, 0));
            A5336ColCodExt = httpContext.cgiGet( edtColCodExt_Internalname) ;
            n5336ColCodExt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5336ColCodExt", A5336ColCodExt);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtColEstMba_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtColEstMba_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "COLESTMBA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtColEstMba_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2076ColEstMba = DecimalUtil.ZERO ;
               n2076ColEstMba = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2076ColEstMba", GXutil.ltrimstr( A2076ColEstMba, 9, 2));
            }
            else
            {
               A2076ColEstMba = localUtil.ctond( httpContext.cgiGet( edtColEstMba_Internalname)) ;
               n2076ColEstMba = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A2076ColEstMba", GXutil.ltrimstr( A2076ColEstMba, 9, 2));
            }
            A4861DibCob = localUtil.ctond( httpContext.cgiGet( edtDibCob_Internalname)) ;
            n4861DibCob = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4861DibCob", GXutil.ltrimstr( A4861DibCob, 6, 2));
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
            A7028ColBmp = httpContext.cgiGet( edtColBmp_Internalname) ;
            n7028ColBmp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7028ColBmp", A7028ColBmp);
            A7140DibBmp = httpContext.cgiGet( edtDibBmp_Internalname) ;
            n7140DibBmp = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7140DibBmp", A7140DibBmp);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGrpFamCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGrpFamCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "GRPFAMCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtGrpFamCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A499GrpFamCod = (byte)(0) ;
               n499GrpFamCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A499GrpFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A499GrpFamCod), 2, 0));
            }
            else
            {
               A499GrpFamCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtGrpFamCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n499GrpFamCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A499GrpFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A499GrpFamCod), 2, 0));
            }
            A500GrpFamDsc = httpContext.cgiGet( edtGrpFamDsc_Internalname) ;
            n500GrpFamDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A500GrpFamDsc", A500GrpFamDsc);
            A8419ColNomCol = httpContext.cgiGet( edtColNomCol_Internalname) ;
            n8419ColNomCol = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A8419ColNomCol", A8419ColNomCol);
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtColGrm2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtColGrm2_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "COLGRM2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtColGrm2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10770ColGrm2 = DecimalUtil.ZERO ;
               n10770ColGrm2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10770ColGrm2", GXutil.ltrimstr( A10770ColGrm2, 9, 2));
            }
            else
            {
               A10770ColGrm2 = localUtil.ctond( httpContext.cgiGet( edtColGrm2_Internalname)) ;
               n10770ColGrm2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10770ColGrm2", GXutil.ltrimstr( A10770ColGrm2, 9, 2));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            /* Check if conditions changed and reset current page numbers */
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
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A2141SerEst = httpContext.GetPar( "SerEst") ;
               httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
               A1013DibCli = httpContext.GetPar( "DibCli") ;
               httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
               A1014DibInt = (int)(GXutil.lval( httpContext.GetPar( "DibInt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
               A2074ColCom = httpContext.GetPar( "ColCom") ;
               httpContext.ajax_rsp_assign_attri("", false, "A2074ColCom", A2074ColCom);
               A2078ColFon = httpContext.GetPar( "ColFon") ;
               httpContext.ajax_rsp_assign_attri("", false, "A2078ColFon", A2078ColFon);
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
                        e111LY2 ();
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
            initAll1LY556( ) ;
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
      httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_558_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_558_Enabled), 5, 0), !bGXsfl_257_Refreshing);
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
      disableAttributes1LY556( ) ;
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

   public void confirm_1LY0( )
   {
      beforeValidate1LY556( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1LY556( ) ;
         }
         else
         {
            checkExtendedTable1LY556( ) ;
            if ( AnyError == 0 )
            {
               zm1LY556( 11) ;
               zm1LY556( 12) ;
               zm1LY556( 13) ;
               zm1LY556( 14) ;
               zm1LY556( 15) ;
               zm1LY556( 16) ;
            }
            closeExtendedTableCursors1LY556( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode556 = Gx_mode ;
         confirm_1LY557( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode556 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode556 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( AnyError == 0 )
      {
         confirmValues1LY0( ) ;
      }
   }

   public void confirm_1LY558( )
   {
      s6045TotParCol = O6045TotParCol ;
      s6047TotColMol = O6047TotColMol ;
      nGXsfl_257_idx = 0 ;
      while ( nGXsfl_257_idx < nRC_GXsfl_257 )
      {
         readRow1LY558( ) ;
         if ( ( nRcdExists_558 != 0 ) || ( nIsMod_558 != 0 ) )
         {
            getKey1LY558( ) ;
            if ( ( nRcdExists_558 == 0 ) && ( nRcdDeleted_558 == 0 ) )
            {
               if ( RcdFound558 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1LY558( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1LY558( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1LY558( 21) ;
                        zm1LY558( 22) ;
                     }
                     closeExtendedTableCursors1LY558( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O6045TotParCol = A6045TotParCol ;
                     O6047TotColMol = A6047TotColMol ;
                  }
               }
               else
               {
                  GXCCtl = "MOLCOD_" + sGXsfl_150_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMolCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound558 != 0 )
               {
                  if ( nRcdDeleted_558 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1LY558( ) ;
                     load1LY558( ) ;
                     beforeValidate1LY558( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1LY558( ) ;
                        O6045TotParCol = A6045TotParCol ;
                        O6047TotColMol = A6047TotColMol ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_558 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1LY558( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1LY558( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1LY558( 21) ;
                              zm1LY558( 22) ;
                           }
                           closeExtendedTableCursors1LY558( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O6045TotParCol = A6045TotParCol ;
                           O6047TotColMol = A6047TotColMol ;
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_558 == 0 )
                  {
                     GXCCtl = "MOLCOD_" + sGXsfl_150_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMolCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtavnRcdDeleted_558_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_558, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2535ForPrdLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom)) ;
         httpContext.changePostValue( edtUniEstCod_Internalname, GXutil.rtrim( A2144UniEstCod)) ;
         httpContext.changePostValue( edtPrdForCan_Internalname, GXutil.ltrim( localUtil.ntoc( A2116PrdForCan, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdForPar_Internalname, GXutil.ltrim( localUtil.ntoc( A6046PrdForPar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2535ForPrdLin_"+sGXsfl_257_idx, GXutil.ltrim( localUtil.ntoc( Z2535ForPrdLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2116PrdForCan_"+sGXsfl_257_idx, GXutil.ltrim( localUtil.ntoc( Z2116PrdForCan, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6046PrdForPar_"+sGXsfl_257_idx, GXutil.ltrim( localUtil.ntoc( Z6046PrdForPar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_257_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z2144UniEstCod_"+sGXsfl_257_idx, GXutil.rtrim( Z2144UniEstCod)) ;
         httpContext.changePostValue( "T6046PrdForPar_"+sGXsfl_257_idx, GXutil.ltrim( localUtil.ntoc( O6046PrdForPar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2116PrdForCan_"+sGXsfl_257_idx, GXutil.ltrim( localUtil.ntoc( O2116PrdForCan, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_558_"+sGXsfl_257_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_558, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_558_"+sGXsfl_257_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_558, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_558_"+sGXsfl_257_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_558, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_558 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_558_"+sGXsfl_257_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_558_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDLIN_"+sGXsfl_257_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_257_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_257_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UNIESTCOD_"+sGXsfl_257_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUniEstCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDFORCAN_"+sGXsfl_257_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdForCan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDFORPAR_"+sGXsfl_257_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdForPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O6045TotParCol = s6045TotParCol ;
      O6047TotColMol = s6047TotColMol ;
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1LY557( )
   {
      nGXsfl_150_idx = 0 ;
      while ( nGXsfl_150_idx < nRC_GXsfl_150 )
      {
         readRow1LY557( ) ;
         if ( ( nRcdExists_557 != 0 ) || ( nIsMod_557 != 0 ) )
         {
            getKey1LY557( ) ;
            if ( ( nRcdExists_557 == 0 ) && ( nRcdDeleted_557 == 0 ) )
            {
               if ( RcdFound557 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1LY557( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1LY557( ) ;
                     if ( AnyError == 0 )
                     {
                        zm1LY557( 18) ;
                        zm1LY557( 19) ;
                     }
                     closeExtendedTableCursors1LY557( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Save parent mode. */
                        sMode557 = Gx_mode ;
                        confirm_1LY558( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Restore parent mode. */
                           Gx_mode = sMode557 ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           IsConfirmed = (short)(1) ;
                           httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                        }
                        /* Restore parent mode. */
                        Gx_mode = sMode557 ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                  }
               }
               else
               {
                  GXCCtl = "MOLCOD_" + sGXsfl_150_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMolCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound557 != 0 )
               {
                  if ( nRcdDeleted_557 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1LY557( ) ;
                     load1LY557( ) ;
                     beforeValidate1LY557( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1LY557( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_557 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1LY557( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1LY557( ) ;
                           if ( AnyError == 0 )
                           {
                              zm1LY557( 18) ;
                              zm1LY557( 19) ;
                           }
                           closeExtendedTableCursors1LY557( ) ;
                           if ( AnyError == 0 )
                           {
                              /* Save parent mode. */
                              sMode557 = Gx_mode ;
                              confirm_1LY558( ) ;
                              if ( AnyError == 0 )
                              {
                                 /* Restore parent mode. */
                                 Gx_mode = sMode557 ;
                                 httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                                 IsConfirmed = (short)(1) ;
                                 httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                              }
                              /* Restore parent mode. */
                              Gx_mode = sMode557 ;
                              httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_557 == 0 )
                  {
                     GXCCtl = "MOLCOD_" + sGXsfl_150_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMolCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMolCod_Internalname, GXutil.ltrim( localUtil.ntoc( A2098MolCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMolCon_Internalname, GXutil.ltrim( localUtil.ntoc( A2100MolCon, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMolDib_Internalname, GXutil.rtrim( A2101MolDib)) ;
         httpContext.changePostValue( edtMolCodVir_Internalname, GXutil.ltrim( localUtil.ntoc( A2099MolCodVir, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdUL_Internalname, GXutil.ltrim( localUtil.ntoc( A2536ForPrdUL, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMolPesMin_Internalname, GXutil.ltrim( localUtil.ntoc( A2650MolPesMin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMolForEst_Internalname, GXutil.rtrim( A2648MolForEst)) ;
         httpContext.changePostValue( edtMolPesMax_Internalname, GXutil.ltrim( localUtil.ntoc( A2649MolPesMax, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMolCol_Internalname, GXutil.rtrim( A4420MolCol)) ;
         httpContext.changePostValue( edtMolPrcCob_Internalname, GXutil.ltrim( localUtil.ntoc( A4862MolPrcCob, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTotParCol_Internalname, GXutil.ltrim( localUtil.ntoc( A6045TotParCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTotColMol_Internalname, GXutil.ltrim( localUtil.ntoc( A6047TotColMol, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDg_codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A8052Dg_codigo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDg_Degr_Internalname, GXutil.ltrim( localUtil.ntoc( A8054Dg_Degr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDg_Valor_Internalname, GXutil.ltrim( localUtil.ntoc( A8055Dg_Valor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMolActivo_Internalname, GXutil.rtrim( A8418MolActivo)) ;
         httpContext.changePostValue( edtMolPorVar_Internalname, GXutil.ltrim( localUtil.ntoc( A9608MolPorVar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTaesId2_Internalname, GXutil.rtrim( A11759TaesId2)) ;
         httpContext.changePostValue( edtTaesDc2_Internalname, GXutil.rtrim( A11760TaesDc2)) ;
         httpContext.changePostValue( edtPasForUL_Internalname, GXutil.ltrim( localUtil.ntoc( A2655PasForUL, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2098MolCod_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( Z2098MolCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2100MolCon_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( Z2100MolCon, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2536ForPrdUL_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( Z2536ForPrdUL, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2650MolPesMin_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( Z2650MolPesMin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2648MolForEst_"+sGXsfl_150_idx, GXutil.rtrim( Z2648MolForEst)) ;
         httpContext.changePostValue( "ZT_"+"Z2649MolPesMax_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( Z2649MolPesMax, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4420MolCol_"+sGXsfl_150_idx, GXutil.rtrim( Z4420MolCol)) ;
         httpContext.changePostValue( "ZT_"+"Z9608MolPorVar_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( Z9608MolPorVar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11759TaesId2_"+sGXsfl_150_idx, GXutil.rtrim( Z11759TaesId2)) ;
         httpContext.changePostValue( "ZT_"+"Z2655PasForUL_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( Z2655PasForUL, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8052Dg_codigo_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( Z8052Dg_codigo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6045TotParCol_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( O6045TotParCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6047TotColMol_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( O6047TotColMol, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_257_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_257, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_557_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_557, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_557_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_557, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_557_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_557, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_557 != 0 )
         {
            httpContext.changePostValue( "MOLCOD_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOLCON_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOLDIB_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolDib_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOLCODVIR_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolCodVir_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUL_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOLPESMIN_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolPesMin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOLFOREST_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolForEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOLPESMAX_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolPesMax_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOLCOL_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOLPRCCOB_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolPrcCob_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TOTPARCOL_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTotParCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TOTCOLMOL_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTotColMol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DG_CODIGO_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDg_codigo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DG_DEGR_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDg_Degr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DG_VALOR_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDg_Valor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOLACTIVO_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolActivo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOLPORVAR_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolPorVar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAESID2_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTaesId2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAESDC2_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTaesDc2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASFORUL_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForUL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1LY0( )
   {
   }

   public void e111LY2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      ttrn20_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV33Pgmname, (byte)(99), GXv_char2) ;
      ttrn20_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      ttrn20_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      AV12Station = context.getWorkstationId( remoteHandle) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttrn20_impl.this.A396EmprCod = GXv_char2[0] ;
      ttrn20_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttrn20_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void zm1LY556( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2079ColMolCil = T01LY12_A2079ColMolCil[0] ;
            Z5336ColCodExt = T01LY12_A5336ColCodExt[0] ;
            Z2076ColEstMba = T01LY12_A2076ColEstMba[0] ;
            Z7028ColBmp = T01LY12_A7028ColBmp[0] ;
            Z8419ColNomCol = T01LY12_A8419ColNomCol[0] ;
            Z10770ColGrm2 = T01LY12_A10770ColGrm2[0] ;
            Z499GrpFamCod = T01LY12_A499GrpFamCod[0] ;
            Z583IntCod = T01LY12_A583IntCod[0] ;
         }
         else
         {
            Z2079ColMolCil = A2079ColMolCil ;
            Z5336ColCodExt = A5336ColCodExt ;
            Z2076ColEstMba = A2076ColEstMba ;
            Z7028ColBmp = A7028ColBmp ;
            Z8419ColNomCol = A8419ColNomCol ;
            Z10770ColGrm2 = A10770ColGrm2 ;
            Z499GrpFamCod = A499GrpFamCod ;
            Z583IntCod = A583IntCod ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z2141SerEst = A2141SerEst ;
         Z2074ColCom = A2074ColCom ;
         Z2078ColFon = A2078ColFon ;
         Z2079ColMolCil = A2079ColMolCil ;
         Z5336ColCodExt = A5336ColCodExt ;
         Z2076ColEstMba = A2076ColEstMba ;
         Z7028ColBmp = A7028ColBmp ;
         Z8419ColNomCol = A8419ColNomCol ;
         Z10770ColGrm2 = A10770ColGrm2 ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z499GrpFamCod = A499GrpFamCod ;
         Z583IntCod = A583IntCod ;
         Z1013DibCli = A1013DibCli ;
         Z1014DibInt = A1014DibInt ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z2075ColEstAnh = A2075ColEstAnh ;
         Z2077ColEstSer = A2077ColEstSer ;
         Z1823DibTipMaq = A1823DibTipMaq ;
         Z1019DibMolCil = A1019DibMolCil ;
         Z2090DibMolCi2 = A2090DibMolCi2 ;
         Z4861DibCob = A4861DibCob ;
         Z7140DibBmp = A7140DibBmp ;
         Z584IntDsc = A584IntDsc ;
         Z500GrpFamDsc = A500GrpFamDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV33Pgmname = "TTrn20" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Pgmname", AV33Pgmname);
      /* Using cursor T01LY13 */
      pr_default.execute(10, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01LY13_A407EmprNom[0] ;
      n407EmprNom = T01LY13_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(10);
   }

   public void standaloneModal( )
   {
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
   }

   public void load1LY556( )
   {
      /* Using cursor T01LY19 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound556 = (short)(1) ;
         A407EmprNom = T01LY19_A407EmprNom[0] ;
         n407EmprNom = T01LY19_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A279CliNom = T01LY19_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A1823DibTipMaq = T01LY19_A1823DibTipMaq[0] ;
         n1823DibTipMaq = T01LY19_n1823DibTipMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", A1823DibTipMaq);
         A1019DibMolCil = T01LY19_A1019DibMolCil[0] ;
         n1019DibMolCil = T01LY19_n1019DibMolCil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1019DibMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1019DibMolCil), 4, 0));
         A2090DibMolCi2 = T01LY19_A2090DibMolCi2[0] ;
         n2090DibMolCi2 = T01LY19_n2090DibMolCi2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2090DibMolCi2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2090DibMolCi2), 4, 0));
         A2079ColMolCil = T01LY19_A2079ColMolCil[0] ;
         n2079ColMolCil = T01LY19_n2079ColMolCil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2079ColMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2079ColMolCil), 4, 0));
         A5336ColCodExt = T01LY19_A5336ColCodExt[0] ;
         n5336ColCodExt = T01LY19_n5336ColCodExt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5336ColCodExt", A5336ColCodExt);
         A2076ColEstMba = T01LY19_A2076ColEstMba[0] ;
         n2076ColEstMba = T01LY19_n2076ColEstMba[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2076ColEstMba", GXutil.ltrimstr( A2076ColEstMba, 9, 2));
         A4861DibCob = T01LY19_A4861DibCob[0] ;
         n4861DibCob = T01LY19_n4861DibCob[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4861DibCob", GXutil.ltrimstr( A4861DibCob, 6, 2));
         A584IntDsc = T01LY19_A584IntDsc[0] ;
         n584IntDsc = T01LY19_n584IntDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
         A7028ColBmp = T01LY19_A7028ColBmp[0] ;
         n7028ColBmp = T01LY19_n7028ColBmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7028ColBmp", A7028ColBmp);
         A7140DibBmp = T01LY19_A7140DibBmp[0] ;
         n7140DibBmp = T01LY19_n7140DibBmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7140DibBmp", A7140DibBmp);
         A500GrpFamDsc = T01LY19_A500GrpFamDsc[0] ;
         n500GrpFamDsc = T01LY19_n500GrpFamDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A500GrpFamDsc", A500GrpFamDsc);
         A8419ColNomCol = T01LY19_A8419ColNomCol[0] ;
         n8419ColNomCol = T01LY19_n8419ColNomCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8419ColNomCol", A8419ColNomCol);
         A10770ColGrm2 = T01LY19_A10770ColGrm2[0] ;
         n10770ColGrm2 = T01LY19_n10770ColGrm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10770ColGrm2", GXutil.ltrimstr( A10770ColGrm2, 9, 2));
         A499GrpFamCod = T01LY19_A499GrpFamCod[0] ;
         n499GrpFamCod = T01LY19_n499GrpFamCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A499GrpFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A499GrpFamCod), 2, 0));
         A583IntCod = T01LY19_A583IntCod[0] ;
         n583IntCod = T01LY19_n583IntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         A2075ColEstAnh = T01LY19_A2075ColEstAnh[0] ;
         n2075ColEstAnh = T01LY19_n2075ColEstAnh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2075ColEstAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2075ColEstAnh), 3, 0));
         A2077ColEstSer = T01LY19_A2077ColEstSer[0] ;
         n2077ColEstSer = T01LY19_n2077ColEstSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2077ColEstSer", A2077ColEstSer);
         zm1LY556( -10) ;
      }
      pr_default.close(16);
      onLoadActions1LY556( ) ;
   }

   public void onLoadActions1LY556( )
   {
   }

   public void checkExtendedTable1LY556( )
   {
      nIsDirty_556 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01LY15 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n499GrpFamCod), Byte.valueOf(A499GrpFamCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GRUFAM", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRPFAMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGrpFamCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A500GrpFamDsc = T01LY15_A500GrpFamDsc[0] ;
      n500GrpFamDsc = T01LY15_n500GrpFamDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A500GrpFamDsc", A500GrpFamDsc);
      pr_default.close(12);
      /* Using cursor T01LY16 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTENS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A584IntDsc = T01LY16_A584IntDsc[0] ;
      n584IntDsc = T01LY16_n584IntDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
      pr_default.close(13);
      /* Using cursor T01LY14 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01LY14_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(11);
      /* Using cursor T01LY18 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A2075ColEstAnh = T01LY18_A2075ColEstAnh[0] ;
         n2075ColEstAnh = T01LY18_n2075ColEstAnh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2075ColEstAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2075ColEstAnh), 3, 0));
         A2077ColEstSer = T01LY18_A2077ColEstSer[0] ;
         n2077ColEstSer = T01LY18_n2077ColEstSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2077ColEstSer", A2077ColEstSer);
      }
      else
      {
         nIsDirty_556 = (short)(1) ;
         A2077ColEstSer = "" ;
         n2077ColEstSer = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2077ColEstSer", A2077ColEstSer);
         nIsDirty_556 = (short)(1) ;
         A2075ColEstAnh = (short)(0) ;
         n2075ColEstAnh = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2075ColEstAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2075ColEstAnh), 3, 0));
      }
      pr_default.close(15);
      /* Using cursor T01LY17 */
      pr_default.execute(14, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDIBUJ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DIBINT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDibCli_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1823DibTipMaq = T01LY17_A1823DibTipMaq[0] ;
      n1823DibTipMaq = T01LY17_n1823DibTipMaq[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", A1823DibTipMaq);
      A1019DibMolCil = T01LY17_A1019DibMolCil[0] ;
      n1019DibMolCil = T01LY17_n1019DibMolCil[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1019DibMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1019DibMolCil), 4, 0));
      A2090DibMolCi2 = T01LY17_A2090DibMolCi2[0] ;
      n2090DibMolCi2 = T01LY17_n2090DibMolCi2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2090DibMolCi2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2090DibMolCi2), 4, 0));
      A4861DibCob = T01LY17_A4861DibCob[0] ;
      n4861DibCob = T01LY17_n4861DibCob[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4861DibCob", GXutil.ltrimstr( A4861DibCob, 6, 2));
      A7140DibBmp = T01LY17_A7140DibBmp[0] ;
      n7140DibBmp = T01LY17_n7140DibBmp[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A7140DibBmp", A7140DibBmp);
      pr_default.close(14);
   }

   public void closeExtendedTableCursors1LY556( )
   {
      pr_default.close(12);
      pr_default.close(13);
      pr_default.close(11);
      pr_default.close(15);
      pr_default.close(14);
   }

   public void enableDisable( )
   {
   }

   public void gxload_13( String A396EmprCod ,
                          byte A499GrpFamCod )
   {
      /* Using cursor T01LY20 */
      pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n499GrpFamCod), Byte.valueOf(A499GrpFamCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GRUFAM", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRPFAMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGrpFamCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A500GrpFamDsc = T01LY20_A500GrpFamDsc[0] ;
      n500GrpFamDsc = T01LY20_n500GrpFamDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A500GrpFamDsc", A500GrpFamDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A500GrpFamDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void gxload_14( String A396EmprCod ,
                          byte A583IntCod )
   {
      /* Using cursor T01LY21 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTENS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A584IntDsc = T01LY21_A584IntDsc[0] ;
      n584IntDsc = T01LY21_n584IntDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A584IntDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void gxload_12( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01LY22 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01LY22_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void gxload_16( String A396EmprCod ,
                          int A252CliCod ,
                          String A2141SerEst )
   {
      /* Using cursor T01LY23 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst});
      if ( (pr_default.getStatus(20) != 101) )
      {
         A2075ColEstAnh = T01LY23_A2075ColEstAnh[0] ;
         n2075ColEstAnh = T01LY23_n2075ColEstAnh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2075ColEstAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2075ColEstAnh), 3, 0));
         A2077ColEstSer = T01LY23_A2077ColEstSer[0] ;
         n2077ColEstSer = T01LY23_n2077ColEstSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2077ColEstSer", A2077ColEstSer);
      }
      else
      {
         A2077ColEstSer = "" ;
         n2077ColEstSer = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2077ColEstSer", A2077ColEstSer);
         A2075ColEstAnh = (short)(0) ;
         n2075ColEstAnh = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2075ColEstAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2075ColEstAnh), 3, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2075ColEstAnh, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2077ColEstSer))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void gxload_15( String A396EmprCod ,
                          String A1013DibCli ,
                          int A252CliCod ,
                          int A1014DibInt )
   {
      /* Using cursor T01LY24 */
      pr_default.execute(21, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDIBUJ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DIBINT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDibCli_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1823DibTipMaq = T01LY24_A1823DibTipMaq[0] ;
      n1823DibTipMaq = T01LY24_n1823DibTipMaq[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", A1823DibTipMaq);
      A1019DibMolCil = T01LY24_A1019DibMolCil[0] ;
      n1019DibMolCil = T01LY24_n1019DibMolCil[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1019DibMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1019DibMolCil), 4, 0));
      A2090DibMolCi2 = T01LY24_A2090DibMolCi2[0] ;
      n2090DibMolCi2 = T01LY24_n2090DibMolCi2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2090DibMolCi2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2090DibMolCi2), 4, 0));
      A4861DibCob = T01LY24_A4861DibCob[0] ;
      n4861DibCob = T01LY24_n4861DibCob[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4861DibCob", GXutil.ltrimstr( A4861DibCob, 6, 2));
      A7140DibBmp = T01LY24_A7140DibBmp[0] ;
      n7140DibBmp = T01LY24_n7140DibBmp[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A7140DibBmp", A7140DibBmp);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1823DibTipMaq))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1019DibMolCil, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2090DibMolCi2, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4861DibCob, (byte)(6), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7140DibBmp))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(21) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(21);
   }

   public void getKey1LY556( )
   {
      /* Using cursor T01LY25 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound556 = (short)(1) ;
      }
      else
      {
         RcdFound556 = (short)(0) ;
      }
      pr_default.close(22);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01LY12 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
      if ( (pr_default.getStatus(9) != 101) && ( GXutil.strcmp(T01LY12_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1LY556( 10) ;
         RcdFound556 = (short)(1) ;
         A2141SerEst = T01LY12_A2141SerEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
         A2074ColCom = T01LY12_A2074ColCom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2074ColCom", A2074ColCom);
         A2078ColFon = T01LY12_A2078ColFon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2078ColFon", A2078ColFon);
         A2079ColMolCil = T01LY12_A2079ColMolCil[0] ;
         n2079ColMolCil = T01LY12_n2079ColMolCil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2079ColMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2079ColMolCil), 4, 0));
         A5336ColCodExt = T01LY12_A5336ColCodExt[0] ;
         n5336ColCodExt = T01LY12_n5336ColCodExt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5336ColCodExt", A5336ColCodExt);
         A2076ColEstMba = T01LY12_A2076ColEstMba[0] ;
         n2076ColEstMba = T01LY12_n2076ColEstMba[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2076ColEstMba", GXutil.ltrimstr( A2076ColEstMba, 9, 2));
         A7028ColBmp = T01LY12_A7028ColBmp[0] ;
         n7028ColBmp = T01LY12_n7028ColBmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7028ColBmp", A7028ColBmp);
         A8419ColNomCol = T01LY12_A8419ColNomCol[0] ;
         n8419ColNomCol = T01LY12_n8419ColNomCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8419ColNomCol", A8419ColNomCol);
         A10770ColGrm2 = T01LY12_A10770ColGrm2[0] ;
         n10770ColGrm2 = T01LY12_n10770ColGrm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10770ColGrm2", GXutil.ltrimstr( A10770ColGrm2, 9, 2));
         A252CliCod = T01LY12_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A499GrpFamCod = T01LY12_A499GrpFamCod[0] ;
         n499GrpFamCod = T01LY12_n499GrpFamCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A499GrpFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A499GrpFamCod), 2, 0));
         A583IntCod = T01LY12_A583IntCod[0] ;
         n583IntCod = T01LY12_n583IntCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
         A1013DibCli = T01LY12_A1013DibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A1014DibInt = T01LY12_A1014DibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z2141SerEst = A2141SerEst ;
         Z1013DibCli = A1013DibCli ;
         Z1014DibInt = A1014DibInt ;
         Z2074ColCom = A2074ColCom ;
         Z2078ColFon = A2078ColFon ;
         sMode556 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1LY556( ) ;
         if ( AnyError == 1 )
         {
            RcdFound556 = (short)(0) ;
            initializeNonKey1LY556( ) ;
         }
         Gx_mode = sMode556 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound556 = (short)(0) ;
         initializeNonKey1LY556( ) ;
         sMode556 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode556 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(9);
   }

   public void getEqualNoModal( )
   {
      getKey1LY556( ) ;
      if ( RcdFound556 == 0 )
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
      RcdFound556 = (short)(0) ;
      /* Using cursor T01LY26 */
      pr_default.execute(23, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A2141SerEst, A2141SerEst, Integer.valueOf(A252CliCod), A1013DibCli, A1013DibCli, A2141SerEst, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Integer.valueOf(A1014DibInt), A1013DibCli, A2141SerEst, Integer.valueOf(A252CliCod), A2074ColCom, A2074ColCom, Integer.valueOf(A1014DibInt), A1013DibCli, A2141SerEst, Integer.valueOf(A252CliCod), A2078ColFon, A396EmprCod});
      if ( (pr_default.getStatus(23) != 101) )
      {
         while ( (pr_default.getStatus(23) != 101) && ( ( T01LY26_A252CliCod[0] < A252CliCod ) || ( T01LY26_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LY26_A2141SerEst[0], A2141SerEst) < 0 ) || ( GXutil.strcmp(T01LY26_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LY26_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LY26_A1013DibCli[0], A1013DibCli) < 0 ) || ( GXutil.strcmp(T01LY26_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T01LY26_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LY26_A252CliCod[0] == A252CliCod ) && ( T01LY26_A1014DibInt[0] < A1014DibInt ) || ( T01LY26_A1014DibInt[0] == A1014DibInt ) && ( GXutil.strcmp(T01LY26_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T01LY26_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LY26_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LY26_A2074ColCom[0], A2074ColCom) < 0 ) || ( GXutil.strcmp(T01LY26_A2074ColCom[0], A2074ColCom) == 0 ) && ( T01LY26_A1014DibInt[0] == A1014DibInt ) && ( GXutil.strcmp(T01LY26_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T01LY26_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LY26_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LY26_A2078ColFon[0], A2078ColFon) < 0 ) ) && ( GXutil.strcmp(T01LY26_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(23);
         }
         if ( (pr_default.getStatus(23) != 101) && ( ( T01LY26_A252CliCod[0] > A252CliCod ) || ( T01LY26_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LY26_A2141SerEst[0], A2141SerEst) > 0 ) || ( GXutil.strcmp(T01LY26_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LY26_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LY26_A1013DibCli[0], A1013DibCli) > 0 ) || ( GXutil.strcmp(T01LY26_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T01LY26_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LY26_A252CliCod[0] == A252CliCod ) && ( T01LY26_A1014DibInt[0] > A1014DibInt ) || ( T01LY26_A1014DibInt[0] == A1014DibInt ) && ( GXutil.strcmp(T01LY26_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T01LY26_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LY26_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LY26_A2074ColCom[0], A2074ColCom) > 0 ) || ( GXutil.strcmp(T01LY26_A2074ColCom[0], A2074ColCom) == 0 ) && ( T01LY26_A1014DibInt[0] == A1014DibInt ) && ( GXutil.strcmp(T01LY26_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T01LY26_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LY26_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LY26_A2078ColFon[0], A2078ColFon) > 0 ) ) && ( GXutil.strcmp(T01LY26_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01LY26_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A2141SerEst = T01LY26_A2141SerEst[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
            A1013DibCli = T01LY26_A1013DibCli[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
            A1014DibInt = T01LY26_A1014DibInt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
            A2074ColCom = T01LY26_A2074ColCom[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2074ColCom", A2074ColCom);
            A2078ColFon = T01LY26_A2078ColFon[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2078ColFon", A2078ColFon);
            RcdFound556 = (short)(1) ;
         }
      }
      pr_default.close(23);
   }

   public void move_previous( )
   {
      RcdFound556 = (short)(0) ;
      /* Using cursor T01LY27 */
      pr_default.execute(24, new Object[] {Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A2141SerEst, A2141SerEst, Integer.valueOf(A252CliCod), A1013DibCli, A1013DibCli, A2141SerEst, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt), Integer.valueOf(A1014DibInt), A1013DibCli, A2141SerEst, Integer.valueOf(A252CliCod), A2074ColCom, A2074ColCom, Integer.valueOf(A1014DibInt), A1013DibCli, A2141SerEst, Integer.valueOf(A252CliCod), A2078ColFon, A396EmprCod});
      if ( (pr_default.getStatus(24) != 101) )
      {
         while ( (pr_default.getStatus(24) != 101) && ( ( T01LY27_A252CliCod[0] > A252CliCod ) || ( T01LY27_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LY27_A2141SerEst[0], A2141SerEst) > 0 ) || ( GXutil.strcmp(T01LY27_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LY27_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LY27_A1013DibCli[0], A1013DibCli) > 0 ) || ( GXutil.strcmp(T01LY27_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T01LY27_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LY27_A252CliCod[0] == A252CliCod ) && ( T01LY27_A1014DibInt[0] > A1014DibInt ) || ( T01LY27_A1014DibInt[0] == A1014DibInt ) && ( GXutil.strcmp(T01LY27_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T01LY27_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LY27_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LY27_A2074ColCom[0], A2074ColCom) > 0 ) || ( GXutil.strcmp(T01LY27_A2074ColCom[0], A2074ColCom) == 0 ) && ( T01LY27_A1014DibInt[0] == A1014DibInt ) && ( GXutil.strcmp(T01LY27_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T01LY27_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LY27_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LY27_A2078ColFon[0], A2078ColFon) > 0 ) ) && ( GXutil.strcmp(T01LY27_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(24);
         }
         if ( (pr_default.getStatus(24) != 101) && ( ( T01LY27_A252CliCod[0] < A252CliCod ) || ( T01LY27_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LY27_A2141SerEst[0], A2141SerEst) < 0 ) || ( GXutil.strcmp(T01LY27_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LY27_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LY27_A1013DibCli[0], A1013DibCli) < 0 ) || ( GXutil.strcmp(T01LY27_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T01LY27_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LY27_A252CliCod[0] == A252CliCod ) && ( T01LY27_A1014DibInt[0] < A1014DibInt ) || ( T01LY27_A1014DibInt[0] == A1014DibInt ) && ( GXutil.strcmp(T01LY27_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T01LY27_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LY27_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LY27_A2074ColCom[0], A2074ColCom) < 0 ) || ( GXutil.strcmp(T01LY27_A2074ColCom[0], A2074ColCom) == 0 ) && ( T01LY27_A1014DibInt[0] == A1014DibInt ) && ( GXutil.strcmp(T01LY27_A1013DibCli[0], A1013DibCli) == 0 ) && ( GXutil.strcmp(T01LY27_A2141SerEst[0], A2141SerEst) == 0 ) && ( T01LY27_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01LY27_A2078ColFon[0], A2078ColFon) < 0 ) ) && ( GXutil.strcmp(T01LY27_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T01LY27_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A2141SerEst = T01LY27_A2141SerEst[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
            A1013DibCli = T01LY27_A1013DibCli[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
            A1014DibInt = T01LY27_A1014DibInt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
            A2074ColCom = T01LY27_A2074ColCom[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2074ColCom", A2074ColCom);
            A2078ColFon = T01LY27_A2078ColFon[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2078ColFon", A2078ColFon);
            RcdFound556 = (short)(1) ;
         }
      }
      pr_default.close(24);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1LY556( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1LY556( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound556 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A2141SerEst, Z2141SerEst) != 0 ) || ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A1014DibInt != Z1014DibInt ) || ( GXutil.strcmp(A2074ColCom, Z2074ColCom) != 0 ) || ( GXutil.strcmp(A2078ColFon, Z2078ColFon) != 0 ) )
            {
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A2141SerEst = Z2141SerEst ;
               httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
               A1013DibCli = Z1013DibCli ;
               httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
               A1014DibInt = Z1014DibInt ;
               httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
               A2074ColCom = Z2074ColCom ;
               httpContext.ajax_rsp_assign_attri("", false, "A2074ColCom", A2074ColCom);
               A2078ColFon = Z2078ColFon ;
               httpContext.ajax_rsp_assign_attri("", false, "A2078ColFon", A2078ColFon);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1LY556( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A2141SerEst, Z2141SerEst) != 0 ) || ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A1014DibInt != Z1014DibInt ) || ( GXutil.strcmp(A2074ColCom, Z2074ColCom) != 0 ) || ( GXutil.strcmp(A2078ColFon, Z2078ColFon) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1LY556( ) ;
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
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1LY556( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A2141SerEst, Z2141SerEst) != 0 ) || ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A1014DibInt != Z1014DibInt ) || ( GXutil.strcmp(A2074ColCom, Z2074ColCom) != 0 ) || ( GXutil.strcmp(A2078ColFon, Z2078ColFon) != 0 ) )
      {
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A2141SerEst = Z2141SerEst ;
         httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
         A1013DibCli = Z1013DibCli ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A1014DibInt = Z1014DibInt ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         A2074ColCom = Z2074ColCom ;
         httpContext.ajax_rsp_assign_attri("", false, "A2074ColCom", A2074ColCom);
         A2078ColFon = Z2078ColFon ;
         httpContext.ajax_rsp_assign_attri("", false, "A2078ColFon", A2078ColFon);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCliCod_Internalname ;
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
      getKey1LY556( ) ;
      if ( RcdFound556 == 1 )
      {
         if ( isIns( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "EMPRCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A2141SerEst, Z2141SerEst) != 0 ) || ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A1014DibInt != Z1014DibInt ) || ( GXutil.strcmp(A2074ColCom, Z2074ColCom) != 0 ) || ( GXutil.strcmp(A2078ColFon, Z2078ColFon) != 0 ) )
         {
            A252CliCod = Z252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A2141SerEst = Z2141SerEst ;
            httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
            A1013DibCli = Z1013DibCli ;
            httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
            A1014DibInt = Z1014DibInt ;
            httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
            A2074ColCom = Z2074ColCom ;
            httpContext.ajax_rsp_assign_attri("", false, "A2074ColCom", A2074ColCom);
            A2078ColFon = Z2078ColFon ;
            httpContext.ajax_rsp_assign_attri("", false, "A2078ColFon", A2078ColFon);
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
         if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A2141SerEst, Z2141SerEst) != 0 ) || ( GXutil.strcmp(A1013DibCli, Z1013DibCli) != 0 ) || ( A1014DibInt != Z1014DibInt ) || ( GXutil.strcmp(A2074ColCom, Z2074ColCom) != 0 ) || ( GXutil.strcmp(A2078ColFon, Z2078ColFon) != 0 ) )
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
      Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrn20");
      GX_FocusControl = edtColMolCil_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
   }

   public void insert_check( )
   {
      confirm_1LY0( ) ;
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
      if ( RcdFound556 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtColMolCil_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1LY556( ) ;
      if ( RcdFound556 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtColMolCil_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1LY556( ) ;
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
      if ( RcdFound556 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtColMolCil_Internalname ;
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
      if ( RcdFound556 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtColMolCil_Internalname ;
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
      scanStart1LY556( ) ;
      if ( RcdFound556 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound556 != 0 )
         {
            scanNext1LY556( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtColMolCil_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1LY556( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1LY556( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01LY11 */
         pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
         if ( (pr_default.getStatus(8) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCFORES"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(8) == 101) || ( Z2079ColMolCil != T01LY11_A2079ColMolCil[0] ) || ( GXutil.strcmp(Z5336ColCodExt, T01LY11_A5336ColCodExt[0]) != 0 ) || ( DecimalUtil.compareTo(Z2076ColEstMba, T01LY11_A2076ColEstMba[0]) != 0 ) || ( GXutil.strcmp(Z7028ColBmp, T01LY11_A7028ColBmp[0]) != 0 ) || ( GXutil.strcmp(Z8419ColNomCol, T01LY11_A8419ColNomCol[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z10770ColGrm2, T01LY11_A10770ColGrm2[0]) != 0 ) || ( Z499GrpFamCod != T01LY11_A499GrpFamCod[0] ) || ( Z583IntCod != T01LY11_A583IntCod[0] ) )
         {
            if ( Z2079ColMolCil != T01LY11_A2079ColMolCil[0] )
            {
               GXutil.writeLogln("ttrn20:[seudo value changed for attri]"+"ColMolCil");
               GXutil.writeLogRaw("Old: ",Z2079ColMolCil);
               GXutil.writeLogRaw("Current: ",T01LY11_A2079ColMolCil[0]);
            }
            if ( GXutil.strcmp(Z5336ColCodExt, T01LY11_A5336ColCodExt[0]) != 0 )
            {
               GXutil.writeLogln("ttrn20:[seudo value changed for attri]"+"ColCodExt");
               GXutil.writeLogRaw("Old: ",Z5336ColCodExt);
               GXutil.writeLogRaw("Current: ",T01LY11_A5336ColCodExt[0]);
            }
            if ( DecimalUtil.compareTo(Z2076ColEstMba, T01LY11_A2076ColEstMba[0]) != 0 )
            {
               GXutil.writeLogln("ttrn20:[seudo value changed for attri]"+"ColEstMba");
               GXutil.writeLogRaw("Old: ",Z2076ColEstMba);
               GXutil.writeLogRaw("Current: ",T01LY11_A2076ColEstMba[0]);
            }
            if ( GXutil.strcmp(Z7028ColBmp, T01LY11_A7028ColBmp[0]) != 0 )
            {
               GXutil.writeLogln("ttrn20:[seudo value changed for attri]"+"ColBmp");
               GXutil.writeLogRaw("Old: ",Z7028ColBmp);
               GXutil.writeLogRaw("Current: ",T01LY11_A7028ColBmp[0]);
            }
            if ( GXutil.strcmp(Z8419ColNomCol, T01LY11_A8419ColNomCol[0]) != 0 )
            {
               GXutil.writeLogln("ttrn20:[seudo value changed for attri]"+"ColNomCol");
               GXutil.writeLogRaw("Old: ",Z8419ColNomCol);
               GXutil.writeLogRaw("Current: ",T01LY11_A8419ColNomCol[0]);
            }
            if ( DecimalUtil.compareTo(Z10770ColGrm2, T01LY11_A10770ColGrm2[0]) != 0 )
            {
               GXutil.writeLogln("ttrn20:[seudo value changed for attri]"+"ColGrm2");
               GXutil.writeLogRaw("Old: ",Z10770ColGrm2);
               GXutil.writeLogRaw("Current: ",T01LY11_A10770ColGrm2[0]);
            }
            if ( Z499GrpFamCod != T01LY11_A499GrpFamCod[0] )
            {
               GXutil.writeLogln("ttrn20:[seudo value changed for attri]"+"GrpFamCod");
               GXutil.writeLogRaw("Old: ",Z499GrpFamCod);
               GXutil.writeLogRaw("Current: ",T01LY11_A499GrpFamCod[0]);
            }
            if ( Z583IntCod != T01LY11_A583IntCod[0] )
            {
               GXutil.writeLogln("ttrn20:[seudo value changed for attri]"+"IntCod");
               GXutil.writeLogRaw("Old: ",Z583IntCod);
               GXutil.writeLogRaw("Current: ",T01LY11_A583IntCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCFORES"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1LY556( )
   {
      beforeValidate1LY556( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LY556( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1LY556( 0) ;
         checkOptimisticConcurrency1LY556( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LY556( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1LY556( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LY28 */
                  pr_default.execute(25, new Object[] {A2141SerEst, A2074ColCom, A2078ColFon, Boolean.valueOf(n2079ColMolCil), Short.valueOf(A2079ColMolCil), Boolean.valueOf(n5336ColCodExt), A5336ColCodExt, Boolean.valueOf(n2076ColEstMba), A2076ColEstMba, Boolean.valueOf(n7028ColBmp), A7028ColBmp, Boolean.valueOf(n8419ColNomCol), A8419ColNomCol, Boolean.valueOf(n10770ColGrm2), A10770ColGrm2, A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n499GrpFamCod), Byte.valueOf(A499GrpFamCod), Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod), A1013DibCli, Integer.valueOf(A1014DibInt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORES");
                  if ( (pr_default.getStatus(25) == 1) )
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
                        processLevel1LY556( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1LY0( ) ;
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
            load1LY556( ) ;
         }
         endLevel1LY556( ) ;
      }
      closeExtendedTableCursors1LY556( ) ;
   }

   public void update1LY556( )
   {
      beforeValidate1LY556( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LY556( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LY556( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LY556( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1LY556( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LY29 */
                  pr_default.execute(26, new Object[] {Boolean.valueOf(n2079ColMolCil), Short.valueOf(A2079ColMolCil), Boolean.valueOf(n5336ColCodExt), A5336ColCodExt, Boolean.valueOf(n2076ColEstMba), A2076ColEstMba, Boolean.valueOf(n7028ColBmp), A7028ColBmp, Boolean.valueOf(n8419ColNomCol), A8419ColNomCol, Boolean.valueOf(n10770ColGrm2), A10770ColGrm2, Boolean.valueOf(n499GrpFamCod), Byte.valueOf(A499GrpFamCod), Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod), A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORES");
                  if ( (pr_default.getStatus(26) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCFORES"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1LY556( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1LY556( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1LY0( ) ;
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
         endLevel1LY556( ) ;
      }
      closeExtendedTableCursors1LY556( ) ;
   }

   public void deferredUpdate1LY556( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1LY556( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LY556( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1LY556( ) ;
         afterConfirm1LY556( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1LY556( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01LY30 */
               pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFORES");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound556 == 0 )
                     {
                        initAll1LY556( ) ;
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
                     resetCaption1LY0( ) ;
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
      sMode556 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1LY556( ) ;
      Gx_mode = sMode556 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1LY556( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01LY31 */
         pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01LY31_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(28);
         /* Using cursor T01LY32 */
         pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst});
         if ( (pr_default.getStatus(29) != 101) )
         {
            A2075ColEstAnh = T01LY32_A2075ColEstAnh[0] ;
            n2075ColEstAnh = T01LY32_n2075ColEstAnh[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2075ColEstAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2075ColEstAnh), 3, 0));
            A2077ColEstSer = T01LY32_A2077ColEstSer[0] ;
            n2077ColEstSer = T01LY32_n2077ColEstSer[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2077ColEstSer", A2077ColEstSer);
         }
         else
         {
            A2077ColEstSer = "" ;
            n2077ColEstSer = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2077ColEstSer", A2077ColEstSer);
            A2075ColEstAnh = (short)(0) ;
            n2075ColEstAnh = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2075ColEstAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2075ColEstAnh), 3, 0));
         }
         pr_default.close(29);
         /* Using cursor T01LY33 */
         pr_default.execute(30, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
         A1823DibTipMaq = T01LY33_A1823DibTipMaq[0] ;
         n1823DibTipMaq = T01LY33_n1823DibTipMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", A1823DibTipMaq);
         A1019DibMolCil = T01LY33_A1019DibMolCil[0] ;
         n1019DibMolCil = T01LY33_n1019DibMolCil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1019DibMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1019DibMolCil), 4, 0));
         A2090DibMolCi2 = T01LY33_A2090DibMolCi2[0] ;
         n2090DibMolCi2 = T01LY33_n2090DibMolCi2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2090DibMolCi2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2090DibMolCi2), 4, 0));
         A4861DibCob = T01LY33_A4861DibCob[0] ;
         n4861DibCob = T01LY33_n4861DibCob[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4861DibCob", GXutil.ltrimstr( A4861DibCob, 6, 2));
         A7140DibBmp = T01LY33_A7140DibBmp[0] ;
         n7140DibBmp = T01LY33_n7140DibBmp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7140DibBmp", A7140DibBmp);
         pr_default.close(30);
         /* Using cursor T01LY34 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
         A584IntDsc = T01LY34_A584IntDsc[0] ;
         n584IntDsc = T01LY34_n584IntDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
         pr_default.close(31);
         /* Using cursor T01LY35 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n499GrpFamCod), Byte.valueOf(A499GrpFamCod)});
         A500GrpFamDsc = T01LY35_A500GrpFamDsc[0] ;
         n500GrpFamDsc = T01LY35_n500GrpFamDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A500GrpFamDsc", A500GrpFamDsc);
         pr_default.close(32);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01LY36 */
         pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01LY37 */
         pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FOROBS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01LY38 */
         pr_default.execute(35, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MFORES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
      }
   }

   public void processNestedLevel1LY557( )
   {
      nGXsfl_150_idx = 0 ;
      while ( nGXsfl_150_idx < nRC_GXsfl_150 )
      {
         readRow1LY557( ) ;
         if ( ( nRcdExists_557 != 0 ) || ( nIsMod_557 != 0 ) )
         {
            standaloneNotModal1LY557( ) ;
            getKey1LY557( ) ;
            if ( ( nRcdExists_557 == 0 ) && ( nRcdDeleted_557 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1LY557( ) ;
            }
            else
            {
               if ( RcdFound557 != 0 )
               {
                  if ( ( nRcdDeleted_557 != 0 ) && ( nRcdExists_557 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1LY557( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_557 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1LY557( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_557 == 0 )
                  {
                     GXCCtl = "MOLCOD_" + sGXsfl_150_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMolCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMolCod_Internalname, GXutil.ltrim( localUtil.ntoc( A2098MolCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMolCon_Internalname, GXutil.ltrim( localUtil.ntoc( A2100MolCon, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMolDib_Internalname, GXutil.rtrim( A2101MolDib)) ;
         httpContext.changePostValue( edtMolCodVir_Internalname, GXutil.ltrim( localUtil.ntoc( A2099MolCodVir, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdUL_Internalname, GXutil.ltrim( localUtil.ntoc( A2536ForPrdUL, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMolPesMin_Internalname, GXutil.ltrim( localUtil.ntoc( A2650MolPesMin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMolForEst_Internalname, GXutil.rtrim( A2648MolForEst)) ;
         httpContext.changePostValue( edtMolPesMax_Internalname, GXutil.ltrim( localUtil.ntoc( A2649MolPesMax, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMolCol_Internalname, GXutil.rtrim( A4420MolCol)) ;
         httpContext.changePostValue( edtMolPrcCob_Internalname, GXutil.ltrim( localUtil.ntoc( A4862MolPrcCob, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTotParCol_Internalname, GXutil.ltrim( localUtil.ntoc( A6045TotParCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTotColMol_Internalname, GXutil.ltrim( localUtil.ntoc( A6047TotColMol, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDg_codigo_Internalname, GXutil.ltrim( localUtil.ntoc( A8052Dg_codigo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDg_Degr_Internalname, GXutil.ltrim( localUtil.ntoc( A8054Dg_Degr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDg_Valor_Internalname, GXutil.ltrim( localUtil.ntoc( A8055Dg_Valor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMolActivo_Internalname, GXutil.rtrim( A8418MolActivo)) ;
         httpContext.changePostValue( edtMolPorVar_Internalname, GXutil.ltrim( localUtil.ntoc( A9608MolPorVar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTaesId2_Internalname, GXutil.rtrim( A11759TaesId2)) ;
         httpContext.changePostValue( edtTaesDc2_Internalname, GXutil.rtrim( A11760TaesDc2)) ;
         httpContext.changePostValue( edtPasForUL_Internalname, GXutil.ltrim( localUtil.ntoc( A2655PasForUL, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2098MolCod_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( Z2098MolCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2100MolCon_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( Z2100MolCon, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2536ForPrdUL_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( Z2536ForPrdUL, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2650MolPesMin_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( Z2650MolPesMin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2648MolForEst_"+sGXsfl_150_idx, GXutil.rtrim( Z2648MolForEst)) ;
         httpContext.changePostValue( "ZT_"+"Z2649MolPesMax_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( Z2649MolPesMax, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4420MolCol_"+sGXsfl_150_idx, GXutil.rtrim( Z4420MolCol)) ;
         httpContext.changePostValue( "ZT_"+"Z9608MolPorVar_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( Z9608MolPorVar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11759TaesId2_"+sGXsfl_150_idx, GXutil.rtrim( Z11759TaesId2)) ;
         httpContext.changePostValue( "ZT_"+"Z2655PasForUL_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( Z2655PasForUL, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z8052Dg_codigo_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( Z8052Dg_codigo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6045TotParCol_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( O6045TotParCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T6047TotColMol_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( O6047TotColMol, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRC_GXsfl_257_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_257, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_557_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_557, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_557_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_557, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_557_"+sGXsfl_150_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_557, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_557 != 0 )
         {
            httpContext.changePostValue( "MOLCOD_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOLCON_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOLDIB_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolDib_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOLCODVIR_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolCodVir_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDUL_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOLPESMIN_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolPesMin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOLFOREST_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolForEst_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOLPESMAX_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolPesMax_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOLCOL_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOLPRCCOB_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolPrcCob_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TOTPARCOL_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTotParCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TOTCOLMOL_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTotColMol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DG_CODIGO_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDg_codigo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DG_DEGR_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDg_Degr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DG_VALOR_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDg_Valor_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOLACTIVO_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolActivo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MOLPORVAR_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolPorVar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAESID2_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTaesId2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAESDC2_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTaesDc2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PASFORUL_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForUL_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1LY557( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_557 = (short)(0) ;
      nIsMod_557 = (short)(0) ;
      nRcdDeleted_557 = (short)(0) ;
   }

   public void processLevel1LY556( )
   {
      /* Save parent mode. */
      sMode556 = Gx_mode ;
      processNestedLevel1LY557( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode556 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1LY556( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(8);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1LY556( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttrn20");
         if ( AnyError == 0 )
         {
            confirmValues1LY0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrn20");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1LY556( )
   {
      /* Scan By routine */
      /* Using cursor T01LY39 */
      pr_default.execute(36, new Object[] {A396EmprCod});
      RcdFound556 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound556 = (short)(1) ;
         A252CliCod = T01LY39_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A2141SerEst = T01LY39_A2141SerEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
         A1013DibCli = T01LY39_A1013DibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A1014DibInt = T01LY39_A1014DibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         A2074ColCom = T01LY39_A2074ColCom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2074ColCom", A2074ColCom);
         A2078ColFon = T01LY39_A2078ColFon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2078ColFon", A2078ColFon);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1LY556( )
   {
      /* Scan next routine */
      pr_default.readNext(36);
      RcdFound556 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound556 = (short)(1) ;
         A252CliCod = T01LY39_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A2141SerEst = T01LY39_A2141SerEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
         A1013DibCli = T01LY39_A1013DibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A1014DibInt = T01LY39_A1014DibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         A2074ColCom = T01LY39_A2074ColCom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2074ColCom", A2074ColCom);
         A2078ColFon = T01LY39_A2078ColFon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2078ColFon", A2078ColFon);
      }
   }

   public void scanEnd1LY556( )
   {
      pr_default.close(36);
   }

   public void afterConfirm1LY556( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1LY556( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1LY556( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1LY556( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1LY556( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1LY556( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1LY556( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtSerEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSerEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSerEst_Enabled), 5, 0), true);
      edtDibCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCli_Enabled), 5, 0), true);
      edtDibInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibInt_Enabled), 5, 0), true);
      edtColCom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColCom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColCom_Enabled), 5, 0), true);
      edtColFon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColFon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColFon_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      lstDibTipMaq.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, lstDibTipMaq.getInternalname(), "Enabled", GXutil.ltrimstr( lstDibTipMaq.getEnabled(), 5, 0), true);
      edtDibMolCil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibMolCil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibMolCil_Enabled), 5, 0), true);
      edtDibMolCi2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibMolCi2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibMolCi2_Enabled), 5, 0), true);
      edtColMolCil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColMolCil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColMolCil_Enabled), 5, 0), true);
      edtColEstSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColEstSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColEstSer_Enabled), 5, 0), true);
      edtColEstAnh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColEstAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColEstAnh_Enabled), 5, 0), true);
      edtColCodExt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColCodExt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColCodExt_Enabled), 5, 0), true);
      edtColEstMba_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColEstMba_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColEstMba_Enabled), 5, 0), true);
      edtDibCob_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibCob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCob_Enabled), 5, 0), true);
      edtIntCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntCod_Enabled), 5, 0), true);
      edtIntDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtIntDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtIntDsc_Enabled), 5, 0), true);
      edtColBmp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColBmp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColBmp_Enabled), 5, 0), true);
      edtDibBmp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibBmp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibBmp_Enabled), 5, 0), true);
      edtGrpFamCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrpFamCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpFamCod_Enabled), 5, 0), true);
      edtGrpFamDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrpFamDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrpFamDsc_Enabled), 5, 0), true);
      edtColNomCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColNomCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColNomCol_Enabled), 5, 0), true);
      edtColGrm2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtColGrm2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtColGrm2_Enabled), 5, 0), true);
   }

   public void zm1LY557( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2100MolCon = T01LY7_A2100MolCon[0] ;
            Z2536ForPrdUL = T01LY7_A2536ForPrdUL[0] ;
            Z2650MolPesMin = T01LY7_A2650MolPesMin[0] ;
            Z2648MolForEst = T01LY7_A2648MolForEst[0] ;
            Z2649MolPesMax = T01LY7_A2649MolPesMax[0] ;
            Z4420MolCol = T01LY7_A4420MolCol[0] ;
            Z9608MolPorVar = T01LY7_A9608MolPorVar[0] ;
            Z11759TaesId2 = T01LY7_A11759TaesId2[0] ;
            Z2655PasForUL = T01LY7_A2655PasForUL[0] ;
            Z8052Dg_codigo = T01LY7_A8052Dg_codigo[0] ;
         }
         else
         {
            Z2100MolCon = A2100MolCon ;
            Z2536ForPrdUL = A2536ForPrdUL ;
            Z2650MolPesMin = A2650MolPesMin ;
            Z2648MolForEst = A2648MolForEst ;
            Z2649MolPesMax = A2649MolPesMax ;
            Z4420MolCol = A4420MolCol ;
            Z9608MolPorVar = A9608MolPorVar ;
            Z11759TaesId2 = A11759TaesId2 ;
            Z2655PasForUL = A2655PasForUL ;
            Z8052Dg_codigo = A8052Dg_codigo ;
         }
      }
      if ( GX_JID == -17 )
      {
         Z252CliCod = A252CliCod ;
         Z2141SerEst = A2141SerEst ;
         Z1013DibCli = A1013DibCli ;
         Z1014DibInt = A1014DibInt ;
         Z2074ColCom = A2074ColCom ;
         Z2078ColFon = A2078ColFon ;
         Z2098MolCod = A2098MolCod ;
         Z2100MolCon = A2100MolCon ;
         Z2536ForPrdUL = A2536ForPrdUL ;
         Z2650MolPesMin = A2650MolPesMin ;
         Z2648MolForEst = A2648MolForEst ;
         Z2649MolPesMax = A2649MolPesMax ;
         Z4420MolCol = A4420MolCol ;
         Z9608MolPorVar = A9608MolPorVar ;
         Z11759TaesId2 = A11759TaesId2 ;
         Z2655PasForUL = A2655PasForUL ;
         Z396EmprCod = A396EmprCod ;
         Z8052Dg_codigo = A8052Dg_codigo ;
         Z6045TotParCol = A6045TotParCol ;
         Z6047TotColMol = A6047TotColMol ;
         Z8054Dg_Degr = A8054Dg_Degr ;
      }
   }

   public void standaloneNotModal1LY557( )
   {
   }

   public void standaloneModal1LY557( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMolCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMolCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMolCod_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      }
      else
      {
         edtMolCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMolCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMolCod_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      }
   }

   public void load1LY557( )
   {
      /* Using cursor T01LY41 */
      pr_default.execute(37, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound557 = (short)(1) ;
         A2100MolCon = T01LY41_A2100MolCon[0] ;
         n2100MolCon = T01LY41_n2100MolCon[0] ;
         A2536ForPrdUL = T01LY41_A2536ForPrdUL[0] ;
         n2536ForPrdUL = T01LY41_n2536ForPrdUL[0] ;
         A2650MolPesMin = T01LY41_A2650MolPesMin[0] ;
         n2650MolPesMin = T01LY41_n2650MolPesMin[0] ;
         A2648MolForEst = T01LY41_A2648MolForEst[0] ;
         n2648MolForEst = T01LY41_n2648MolForEst[0] ;
         A2649MolPesMax = T01LY41_A2649MolPesMax[0] ;
         n2649MolPesMax = T01LY41_n2649MolPesMax[0] ;
         A4420MolCol = T01LY41_A4420MolCol[0] ;
         n4420MolCol = T01LY41_n4420MolCol[0] ;
         A8054Dg_Degr = T01LY41_A8054Dg_Degr[0] ;
         n8054Dg_Degr = T01LY41_n8054Dg_Degr[0] ;
         A9608MolPorVar = T01LY41_A9608MolPorVar[0] ;
         n9608MolPorVar = T01LY41_n9608MolPorVar[0] ;
         A11759TaesId2 = T01LY41_A11759TaesId2[0] ;
         n11759TaesId2 = T01LY41_n11759TaesId2[0] ;
         A2655PasForUL = T01LY41_A2655PasForUL[0] ;
         n2655PasForUL = T01LY41_n2655PasForUL[0] ;
         A8052Dg_codigo = T01LY41_A8052Dg_codigo[0] ;
         n8052Dg_codigo = T01LY41_n8052Dg_codigo[0] ;
         A6045TotParCol = T01LY41_A6045TotParCol[0] ;
         A6047TotColMol = T01LY41_A6047TotColMol[0] ;
         zm1LY557( -17) ;
      }
      pr_default.close(37);
      onLoadActions1LY557( ) ;
   }

   public void onLoadActions1LY557( )
   {
      if ( A8054Dg_Degr == 0 )
      {
         A8055Dg_Valor = (short)(1) ;
      }
      else
      {
         if ( ( A8054Dg_Degr >= 1 ) && ( A8054Dg_Degr <= 9 ) )
         {
            A8055Dg_Valor = (short)(A8054Dg_Degr+1) ;
         }
         else
         {
            if ( A8054Dg_Degr > 9 )
            {
               A8055Dg_Valor = A8054Dg_Degr ;
            }
            else
            {
               A8055Dg_Valor = (short)(0) ;
            }
         }
      }
      GXt_char1 = A11760TaesDc2 ;
      GXv_char4[0] = GXt_char1 ;
      new app.ptaesdc(remoteHandle, context).execute( A396EmprCod, A11759TaesId2, GXv_char4) ;
      ttrn20_impl.this.GXt_char1 = GXv_char4[0] ;
      A11760TaesDc2 = GXt_char1 ;
      GXt_char1 = A8418MolActivo ;
      GXv_char4[0] = GXt_char1 ;
      new app.pbusclac(remoteHandle, context).execute( A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt, A2098MolCod, GXv_char4) ;
      ttrn20_impl.this.GXt_char1 = GXv_char4[0] ;
      A8418MolActivo = GXt_char1 ;
   }

   public void checkExtendedTable1LY557( )
   {
      nIsDirty_557 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1LY557( ) ;
      /* Using cursor T01LY8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n8052Dg_codigo), Short.valueOf(A8052Dg_codigo)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         GXCCtl = "DG_CODIGO_" + sGXsfl_150_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DEGRA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDg_codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A8054Dg_Degr = T01LY8_A8054Dg_Degr[0] ;
      n8054Dg_Degr = T01LY8_n8054Dg_Degr[0] ;
      pr_default.close(6);
      if ( A8054Dg_Degr == 0 )
      {
         nIsDirty_557 = (short)(1) ;
         A8055Dg_Valor = (short)(1) ;
      }
      else
      {
         if ( ( A8054Dg_Degr >= 1 ) && ( A8054Dg_Degr <= 9 ) )
         {
            nIsDirty_557 = (short)(1) ;
            A8055Dg_Valor = (short)(A8054Dg_Degr+1) ;
         }
         else
         {
            if ( A8054Dg_Degr > 9 )
            {
               nIsDirty_557 = (short)(1) ;
               A8055Dg_Valor = A8054Dg_Degr ;
            }
            else
            {
               nIsDirty_557 = (short)(1) ;
               A8055Dg_Valor = (short)(0) ;
            }
         }
      }
      nIsDirty_557 = (short)(1) ;
      GXt_char1 = A11760TaesDc2 ;
      GXv_char4[0] = GXt_char1 ;
      new app.ptaesdc(remoteHandle, context).execute( A396EmprCod, A11759TaesId2, GXv_char4) ;
      ttrn20_impl.this.GXt_char1 = GXv_char4[0] ;
      A11760TaesDc2 = GXt_char1 ;
      /* Using cursor T01LY10 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A6045TotParCol = T01LY10_A6045TotParCol[0] ;
         A6047TotColMol = T01LY10_A6047TotColMol[0] ;
      }
      else
      {
         nIsDirty_557 = (short)(1) ;
         A6045TotParCol = (byte)(0) ;
         nIsDirty_557 = (short)(1) ;
         A6047TotColMol = DecimalUtil.doubleToDec(0) ;
      }
      pr_default.close(7);
      nIsDirty_557 = (short)(1) ;
      GXt_char1 = A8418MolActivo ;
      GXv_char4[0] = GXt_char1 ;
      new app.pbusclac(remoteHandle, context).execute( A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt, A2098MolCod, GXv_char4) ;
      ttrn20_impl.this.GXt_char1 = GXv_char4[0] ;
      A8418MolActivo = GXt_char1 ;
      if ( ! ( ( GXutil.strcmp(A2648MolForEst, "S") == 0 ) || ( GXutil.strcmp(A2648MolForEst, "N") == 0 ) ) )
      {
         GXCCtl = "MOLFOREST_" + sGXsfl_150_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Molde Activo (S/N)", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMolForEst_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1LY557( )
   {
      pr_default.close(6);
      pr_default.close(7);
   }

   public void enableDisable1LY557( )
   {
   }

   public void gxload_18( String A396EmprCod ,
                          short A8052Dg_codigo )
   {
      /* Using cursor T01LY42 */
      pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n8052Dg_codigo), Short.valueOf(A8052Dg_codigo)});
      if ( (pr_default.getStatus(38) == 101) )
      {
         GXCCtl = "DG_CODIGO_" + sGXsfl_150_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DEGRA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDg_codigo_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A8054Dg_Degr = T01LY42_A8054Dg_Degr[0] ;
      n8054Dg_Degr = T01LY42_n8054Dg_Degr[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A8054Dg_Degr, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(38) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(38);
   }

   public void gxload_19( String A396EmprCod ,
                          int A252CliCod ,
                          String A2141SerEst ,
                          String A1013DibCli ,
                          int A1014DibInt ,
                          String A2074ColCom ,
                          String A2078ColFon ,
                          byte A2098MolCod )
   {
      /* Using cursor T01LY44 */
      pr_default.execute(39, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
      if ( (pr_default.getStatus(39) != 101) )
      {
         A6045TotParCol = T01LY44_A6045TotParCol[0] ;
         A6047TotColMol = T01LY44_A6047TotColMol[0] ;
      }
      else
      {
         A6045TotParCol = (byte)(0) ;
         A6047TotColMol = DecimalUtil.doubleToDec(0) ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6045TotParCol, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6047TotColMol, (byte)(10), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(39) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(39);
   }

   public void getKey1LY557( )
   {
      /* Using cursor T01LY45 */
      pr_default.execute(40, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound557 = (short)(1) ;
      }
      else
      {
         RcdFound557 = (short)(0) ;
      }
      pr_default.close(40);
   }

   public void getByPrimaryKey1LY557( )
   {
      /* Using cursor T01LY7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
      if ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T01LY7_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1LY557( 17) ;
         RcdFound557 = (short)(1) ;
         initializeNonKey1LY557( ) ;
         A2098MolCod = T01LY7_A2098MolCod[0] ;
         A2100MolCon = T01LY7_A2100MolCon[0] ;
         n2100MolCon = T01LY7_n2100MolCon[0] ;
         A2536ForPrdUL = T01LY7_A2536ForPrdUL[0] ;
         n2536ForPrdUL = T01LY7_n2536ForPrdUL[0] ;
         A2650MolPesMin = T01LY7_A2650MolPesMin[0] ;
         n2650MolPesMin = T01LY7_n2650MolPesMin[0] ;
         A2648MolForEst = T01LY7_A2648MolForEst[0] ;
         n2648MolForEst = T01LY7_n2648MolForEst[0] ;
         A2649MolPesMax = T01LY7_A2649MolPesMax[0] ;
         n2649MolPesMax = T01LY7_n2649MolPesMax[0] ;
         A4420MolCol = T01LY7_A4420MolCol[0] ;
         n4420MolCol = T01LY7_n4420MolCol[0] ;
         A9608MolPorVar = T01LY7_A9608MolPorVar[0] ;
         n9608MolPorVar = T01LY7_n9608MolPorVar[0] ;
         A11759TaesId2 = T01LY7_A11759TaesId2[0] ;
         n11759TaesId2 = T01LY7_n11759TaesId2[0] ;
         A2655PasForUL = T01LY7_A2655PasForUL[0] ;
         n2655PasForUL = T01LY7_n2655PasForUL[0] ;
         A8052Dg_codigo = T01LY7_A8052Dg_codigo[0] ;
         n8052Dg_codigo = T01LY7_n8052Dg_codigo[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z2141SerEst = A2141SerEst ;
         Z1013DibCli = A1013DibCli ;
         Z1014DibInt = A1014DibInt ;
         Z2074ColCom = A2074ColCom ;
         Z2078ColFon = A2078ColFon ;
         Z2098MolCod = A2098MolCod ;
         sMode557 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1LY557( ) ;
         load1LY557( ) ;
         Gx_mode = sMode557 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound557 = (short)(0) ;
         initializeNonKey1LY557( ) ;
         sMode557 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1LY557( ) ;
         Gx_mode = sMode557 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1LY557( ) ;
      }
      pr_default.close(5);
   }

   public void checkOptimisticConcurrency1LY557( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01LY6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMFORES"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(4) == 101) || ( DecimalUtil.compareTo(Z2100MolCon, T01LY6_A2100MolCon[0]) != 0 ) || ( Z2536ForPrdUL != T01LY6_A2536ForPrdUL[0] ) || ( DecimalUtil.compareTo(Z2650MolPesMin, T01LY6_A2650MolPesMin[0]) != 0 ) || ( GXutil.strcmp(Z2648MolForEst, T01LY6_A2648MolForEst[0]) != 0 ) || ( DecimalUtil.compareTo(Z2649MolPesMax, T01LY6_A2649MolPesMax[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4420MolCol, T01LY6_A4420MolCol[0]) != 0 ) || ( Z9608MolPorVar != T01LY6_A9608MolPorVar[0] ) || ( GXutil.strcmp(Z11759TaesId2, T01LY6_A11759TaesId2[0]) != 0 ) || ( Z2655PasForUL != T01LY6_A2655PasForUL[0] ) || ( Z8052Dg_codigo != T01LY6_A8052Dg_codigo[0] ) )
         {
            if ( DecimalUtil.compareTo(Z2100MolCon, T01LY6_A2100MolCon[0]) != 0 )
            {
               GXutil.writeLogln("ttrn20:[seudo value changed for attri]"+"MolCon");
               GXutil.writeLogRaw("Old: ",Z2100MolCon);
               GXutil.writeLogRaw("Current: ",T01LY6_A2100MolCon[0]);
            }
            if ( Z2536ForPrdUL != T01LY6_A2536ForPrdUL[0] )
            {
               GXutil.writeLogln("ttrn20:[seudo value changed for attri]"+"ForPrdUL");
               GXutil.writeLogRaw("Old: ",Z2536ForPrdUL);
               GXutil.writeLogRaw("Current: ",T01LY6_A2536ForPrdUL[0]);
            }
            if ( DecimalUtil.compareTo(Z2650MolPesMin, T01LY6_A2650MolPesMin[0]) != 0 )
            {
               GXutil.writeLogln("ttrn20:[seudo value changed for attri]"+"MolPesMin");
               GXutil.writeLogRaw("Old: ",Z2650MolPesMin);
               GXutil.writeLogRaw("Current: ",T01LY6_A2650MolPesMin[0]);
            }
            if ( GXutil.strcmp(Z2648MolForEst, T01LY6_A2648MolForEst[0]) != 0 )
            {
               GXutil.writeLogln("ttrn20:[seudo value changed for attri]"+"MolForEst");
               GXutil.writeLogRaw("Old: ",Z2648MolForEst);
               GXutil.writeLogRaw("Current: ",T01LY6_A2648MolForEst[0]);
            }
            if ( DecimalUtil.compareTo(Z2649MolPesMax, T01LY6_A2649MolPesMax[0]) != 0 )
            {
               GXutil.writeLogln("ttrn20:[seudo value changed for attri]"+"MolPesMax");
               GXutil.writeLogRaw("Old: ",Z2649MolPesMax);
               GXutil.writeLogRaw("Current: ",T01LY6_A2649MolPesMax[0]);
            }
            if ( GXutil.strcmp(Z4420MolCol, T01LY6_A4420MolCol[0]) != 0 )
            {
               GXutil.writeLogln("ttrn20:[seudo value changed for attri]"+"MolCol");
               GXutil.writeLogRaw("Old: ",Z4420MolCol);
               GXutil.writeLogRaw("Current: ",T01LY6_A4420MolCol[0]);
            }
            if ( Z9608MolPorVar != T01LY6_A9608MolPorVar[0] )
            {
               GXutil.writeLogln("ttrn20:[seudo value changed for attri]"+"MolPorVar");
               GXutil.writeLogRaw("Old: ",Z9608MolPorVar);
               GXutil.writeLogRaw("Current: ",T01LY6_A9608MolPorVar[0]);
            }
            if ( GXutil.strcmp(Z11759TaesId2, T01LY6_A11759TaesId2[0]) != 0 )
            {
               GXutil.writeLogln("ttrn20:[seudo value changed for attri]"+"TaesId2");
               GXutil.writeLogRaw("Old: ",Z11759TaesId2);
               GXutil.writeLogRaw("Current: ",T01LY6_A11759TaesId2[0]);
            }
            if ( Z2655PasForUL != T01LY6_A2655PasForUL[0] )
            {
               GXutil.writeLogln("ttrn20:[seudo value changed for attri]"+"PasForUL");
               GXutil.writeLogRaw("Old: ",Z2655PasForUL);
               GXutil.writeLogRaw("Current: ",T01LY6_A2655PasForUL[0]);
            }
            if ( Z8052Dg_codigo != T01LY6_A8052Dg_codigo[0] )
            {
               GXutil.writeLogln("ttrn20:[seudo value changed for attri]"+"Dg_codigo");
               GXutil.writeLogRaw("Old: ",Z8052Dg_codigo);
               GXutil.writeLogRaw("Current: ",T01LY6_A8052Dg_codigo[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMFORES"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1LY557( )
   {
      beforeValidate1LY557( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LY557( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1LY557( 0) ;
         checkOptimisticConcurrency1LY557( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LY557( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1LY557( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LY46 */
                  pr_default.execute(41, new Object[] {Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod), Boolean.valueOf(n2100MolCon), A2100MolCon, Boolean.valueOf(n2536ForPrdUL), Short.valueOf(A2536ForPrdUL), Boolean.valueOf(n2650MolPesMin), A2650MolPesMin, Boolean.valueOf(n2648MolForEst), A2648MolForEst, Boolean.valueOf(n2649MolPesMax), A2649MolPesMax, Boolean.valueOf(n4420MolCol), A4420MolCol, Boolean.valueOf(n9608MolPorVar), Short.valueOf(A9608MolPorVar), Boolean.valueOf(n11759TaesId2), A11759TaesId2, Boolean.valueOf(n2655PasForUL), Short.valueOf(A2655PasForUL), A396EmprCod, Boolean.valueOf(n8052Dg_codigo), Short.valueOf(A8052Dg_codigo)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMFORES");
                  if ( (pr_default.getStatus(41) == 1) )
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
                        processLevel1LY557( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
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
            load1LY557( ) ;
         }
         endLevel1LY557( ) ;
      }
      closeExtendedTableCursors1LY557( ) ;
   }

   public void update1LY557( )
   {
      beforeValidate1LY557( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LY557( ) ;
      }
      if ( ( nIsMod_557 != 0 ) || ( nIsDirty_557 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1LY557( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1LY557( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1LY557( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01LY47 */
                     pr_default.execute(42, new Object[] {Boolean.valueOf(n2100MolCon), A2100MolCon, Boolean.valueOf(n2536ForPrdUL), Short.valueOf(A2536ForPrdUL), Boolean.valueOf(n2650MolPesMin), A2650MolPesMin, Boolean.valueOf(n2648MolForEst), A2648MolForEst, Boolean.valueOf(n2649MolPesMax), A2649MolPesMax, Boolean.valueOf(n4420MolCol), A4420MolCol, Boolean.valueOf(n9608MolPorVar), Short.valueOf(A9608MolPorVar), Boolean.valueOf(n11759TaesId2), A11759TaesId2, Boolean.valueOf(n2655PasForUL), Short.valueOf(A2655PasForUL), Boolean.valueOf(n8052Dg_codigo), Short.valueOf(A8052Dg_codigo), A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMFORES");
                     if ( (pr_default.getStatus(42) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMFORES"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1LY557( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           processLevel1LY557( ) ;
                           if ( AnyError == 0 )
                           {
                              getByPrimaryKey1LY557( ) ;
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
            endLevel1LY557( ) ;
         }
      }
      closeExtendedTableCursors1LY557( ) ;
   }

   public void deferredUpdate1LY557( )
   {
   }

   public void delete1LY557( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1LY557( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LY557( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1LY557( ) ;
         afterConfirm1LY557( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1LY557( ) ;
            if ( AnyError == 0 )
            {
               A6045TotParCol = O6045TotParCol ;
               A6047TotColMol = O6047TotColMol ;
               scanStart1LY558( ) ;
               while ( RcdFound558 != 0 )
               {
                  getByPrimaryKey1LY558( ) ;
                  delete1LY558( ) ;
                  scanNext1LY558( ) ;
                  O6045TotParCol = A6045TotParCol ;
                  O6047TotColMol = A6047TotColMol ;
               }
               scanEnd1LY558( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LY48 */
                  pr_default.execute(43, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMFORES");
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
      }
      sMode557 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1LY557( ) ;
      Gx_mode = sMode557 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1LY557( )
   {
      standaloneModal1LY557( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01LY50 */
         pr_default.execute(44, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
         if ( (pr_default.getStatus(44) != 101) )
         {
            A6045TotParCol = T01LY50_A6045TotParCol[0] ;
            A6047TotColMol = T01LY50_A6047TotColMol[0] ;
         }
         else
         {
            A6045TotParCol = (byte)(0) ;
            A6047TotColMol = DecimalUtil.doubleToDec(0) ;
         }
         pr_default.close(44);
         GXt_char1 = A8418MolActivo ;
         GXv_char4[0] = GXt_char1 ;
         new app.pbusclac(remoteHandle, context).execute( A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt, A2098MolCod, GXv_char4) ;
         ttrn20_impl.this.GXt_char1 = GXv_char4[0] ;
         A8418MolActivo = GXt_char1 ;
         /* Using cursor T01LY51 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n8052Dg_codigo), Short.valueOf(A8052Dg_codigo)});
         A8054Dg_Degr = T01LY51_A8054Dg_Degr[0] ;
         n8054Dg_Degr = T01LY51_n8054Dg_Degr[0] ;
         pr_default.close(45);
         if ( A8054Dg_Degr == 0 )
         {
            A8055Dg_Valor = (short)(1) ;
         }
         else
         {
            if ( ( A8054Dg_Degr >= 1 ) && ( A8054Dg_Degr <= 9 ) )
            {
               A8055Dg_Valor = (short)(A8054Dg_Degr+1) ;
            }
            else
            {
               if ( A8054Dg_Degr > 9 )
               {
                  A8055Dg_Valor = A8054Dg_Degr ;
               }
               else
               {
                  A8055Dg_Valor = (short)(0) ;
               }
            }
         }
         GXt_char1 = A11760TaesDc2 ;
         GXv_char4[0] = GXt_char1 ;
         new app.ptaesdc(remoteHandle, context).execute( A396EmprCod, A11759TaesId2, GXv_char4) ;
         ttrn20_impl.this.GXt_char1 = GXv_char4[0] ;
         A11760TaesDc2 = GXt_char1 ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01LY52 */
         pr_default.execute(46, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PASFOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
      }
   }

   public void processNestedLevel1LY558( )
   {
      s6045TotParCol = O6045TotParCol ;
      s6047TotColMol = O6047TotColMol ;
      nGXsfl_257_idx = 0 ;
      while ( nGXsfl_257_idx < nRC_GXsfl_257 )
      {
         readRow1LY558( ) ;
         if ( ( nRcdExists_558 != 0 ) || ( nIsMod_558 != 0 ) )
         {
            standaloneNotModal1LY558( ) ;
            getKey1LY558( ) ;
            if ( ( nRcdExists_558 == 0 ) && ( nRcdDeleted_558 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1LY558( ) ;
            }
            else
            {
               if ( RcdFound558 != 0 )
               {
                  if ( ( nRcdDeleted_558 != 0 ) && ( nRcdExists_558 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1LY558( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_558 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1LY558( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_558 == 0 )
                  {
                     GXCCtl = "MOLCOD_" + sGXsfl_150_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMolCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O6045TotParCol = A6045TotParCol ;
            O6047TotColMol = A6047TotColMol ;
         }
         httpContext.changePostValue( edtavnRcdDeleted_558_Internalname, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_558, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtForPrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A2535ForPrdLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom)) ;
         httpContext.changePostValue( edtUniEstCod_Internalname, GXutil.rtrim( A2144UniEstCod)) ;
         httpContext.changePostValue( edtPrdForCan_Internalname, GXutil.ltrim( localUtil.ntoc( A2116PrdForCan, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdForPar_Internalname, GXutil.ltrim( localUtil.ntoc( A6046PrdForPar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2535ForPrdLin_"+sGXsfl_257_idx, GXutil.ltrim( localUtil.ntoc( Z2535ForPrdLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2116PrdForCan_"+sGXsfl_257_idx, GXutil.ltrim( localUtil.ntoc( Z2116PrdForCan, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6046PrdForPar_"+sGXsfl_257_idx, GXutil.ltrim( localUtil.ntoc( Z6046PrdForPar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_257_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z2144UniEstCod_"+sGXsfl_257_idx, GXutil.rtrim( Z2144UniEstCod)) ;
         httpContext.changePostValue( "T6046PrdForPar_"+sGXsfl_257_idx, GXutil.ltrim( localUtil.ntoc( O6046PrdForPar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2116PrdForCan_"+sGXsfl_257_idx, GXutil.ltrim( localUtil.ntoc( O2116PrdForCan, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_558_"+sGXsfl_257_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_558, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_558_"+sGXsfl_257_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_558, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_558_"+sGXsfl_257_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_558, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_558 != 0 )
         {
            httpContext.changePostValue( "vNRCDDELETED_558_"+sGXsfl_257_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_558_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FORPRDLIN_"+sGXsfl_257_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_257_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNOM_"+sGXsfl_257_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "UNIESTCOD_"+sGXsfl_257_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUniEstCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDFORCAN_"+sGXsfl_257_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdForCan_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDFORPAR_"+sGXsfl_257_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdForPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1LY558( ) ;
      if ( AnyError != 0 )
      {
         O6045TotParCol = s6045TotParCol ;
         O6047TotColMol = s6047TotColMol ;
      }
      nRcdExists_558 = (short)(0) ;
      nIsMod_558 = (short)(0) ;
      nRcdDeleted_558 = (short)(0) ;
   }

   public void processLevel1LY557( )
   {
      /* Save parent mode. */
      sMode557 = Gx_mode ;
      processNestedLevel1LY558( ) ;
      if ( AnyError != 0 )
      {
         O6045TotParCol = s6045TotParCol ;
         O6047TotColMol = s6047TotColMol ;
      }
      /* Restore parent mode. */
      Gx_mode = sMode557 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1LY557( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(4);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1LY557( )
   {
      /* Scan By routine */
      /* Using cursor T01LY53 */
      pr_default.execute(47, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon});
      RcdFound557 = (short)(0) ;
      if ( (pr_default.getStatus(47) != 101) )
      {
         RcdFound557 = (short)(1) ;
         A2098MolCod = T01LY53_A2098MolCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1LY557( )
   {
      /* Scan next routine */
      pr_default.readNext(47);
      RcdFound557 = (short)(0) ;
      if ( (pr_default.getStatus(47) != 101) )
      {
         RcdFound557 = (short)(1) ;
         A2098MolCod = T01LY53_A2098MolCod[0] ;
      }
   }

   public void scanEnd1LY557( )
   {
      pr_default.close(47);
   }

   public void afterConfirm1LY557( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1LY557( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1LY557( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1LY557( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1LY557( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1LY557( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1LY557( )
   {
      edtMolCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMolCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMolCod_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtMolCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMolCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMolCon_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtMolDib_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMolDib_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMolDib_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtMolCodVir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMolCodVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMolCodVir_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtForPrdUL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUL_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtMolPesMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMolPesMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMolPesMin_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtMolForEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMolForEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMolForEst_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtMolPesMax_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMolPesMax_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMolPesMax_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtMolCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMolCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMolCol_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtMolPrcCob_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMolPrcCob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMolPrcCob_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtTotParCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTotParCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTotParCol_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtTotColMol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTotColMol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTotColMol_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtDg_codigo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDg_codigo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDg_codigo_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtDg_Degr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDg_Degr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDg_Degr_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtDg_Valor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDg_Valor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDg_Valor_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtMolActivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMolActivo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMolActivo_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtMolPorVar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMolPorVar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMolPorVar_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtTaesId2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTaesId2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesId2_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtTaesDc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTaesDc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTaesDc2_Enabled), 5, 0), !bGXsfl_150_Refreshing);
      edtPasForUL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPasForUL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPasForUL_Enabled), 5, 0), !bGXsfl_150_Refreshing);
   }

   public void zm1LY558( int GX_JID )
   {
      if ( ( GX_JID == 20 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2116PrdForCan = T01LY3_A2116PrdForCan[0] ;
            Z6046PrdForPar = T01LY3_A6046PrdForPar[0] ;
            Z719PrdNum = T01LY3_A719PrdNum[0] ;
            Z2144UniEstCod = T01LY3_A2144UniEstCod[0] ;
         }
         else
         {
            Z2116PrdForCan = A2116PrdForCan ;
            Z6046PrdForPar = A6046PrdForPar ;
            Z719PrdNum = A719PrdNum ;
            Z2144UniEstCod = A2144UniEstCod ;
         }
      }
      if ( GX_JID == -20 )
      {
         Z252CliCod = A252CliCod ;
         Z2141SerEst = A2141SerEst ;
         Z1013DibCli = A1013DibCli ;
         Z1014DibInt = A1014DibInt ;
         Z2074ColCom = A2074ColCom ;
         Z2078ColFon = A2078ColFon ;
         Z2098MolCod = A2098MolCod ;
         Z2535ForPrdLin = A2535ForPrdLin ;
         Z2116PrdForCan = A2116PrdForCan ;
         Z6046PrdForPar = A6046PrdForPar ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z2144UniEstCod = A2144UniEstCod ;
         Z718PrdNom = A718PrdNom ;
      }
   }

   public void standaloneNotModal1LY558( )
   {
   }

   public void standaloneModal1LY558( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtForPrdLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForPrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdLin_Enabled), 5, 0), !bGXsfl_257_Refreshing);
      }
      else
      {
         edtForPrdLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForPrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdLin_Enabled), 5, 0), !bGXsfl_257_Refreshing);
      }
   }

   public void load1LY558( )
   {
      /* Using cursor T01LY54 */
      pr_default.execute(48, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod), Short.valueOf(A2535ForPrdLin)});
      if ( (pr_default.getStatus(48) != 101) )
      {
         RcdFound558 = (short)(1) ;
         A718PrdNom = T01LY54_A718PrdNom[0] ;
         A2116PrdForCan = T01LY54_A2116PrdForCan[0] ;
         n2116PrdForCan = T01LY54_n2116PrdForCan[0] ;
         A6046PrdForPar = T01LY54_A6046PrdForPar[0] ;
         n6046PrdForPar = T01LY54_n6046PrdForPar[0] ;
         A719PrdNum = T01LY54_A719PrdNum[0] ;
         n719PrdNum = T01LY54_n719PrdNum[0] ;
         A2144UniEstCod = T01LY54_A2144UniEstCod[0] ;
         n2144UniEstCod = T01LY54_n2144UniEstCod[0] ;
         zm1LY558( -20) ;
      }
      pr_default.close(48);
      onLoadActions1LY558( ) ;
   }

   public void onLoadActions1LY558( )
   {
      if ( isIns( )  )
      {
         A6047TotColMol = O6047TotColMol.add(A2116PrdForCan) ;
      }
      else
      {
         if ( isUpd( )  )
         {
            A6047TotColMol = O6047TotColMol.add(A2116PrdForCan).subtract(O2116PrdForCan) ;
         }
         else
         {
            if ( isDlt( )  )
            {
               A6047TotColMol = O6047TotColMol.subtract(O2116PrdForCan) ;
            }
         }
      }
      if ( isIns( )  )
      {
         A6045TotParCol = (byte)(O6045TotParCol+A6046PrdForPar) ;
      }
      else
      {
         if ( isUpd( )  )
         {
            A6045TotParCol = (byte)(O6045TotParCol+A6046PrdForPar-O6046PrdForPar) ;
         }
         else
         {
            if ( isDlt( )  )
            {
               A6045TotParCol = (byte)(O6045TotParCol-O6046PrdForPar) ;
            }
         }
      }
   }

   public void checkExtendedTable1LY558( )
   {
      nIsDirty_558 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1LY558( ) ;
      /* Using cursor T01LY4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_257_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01LY4_A718PrdNom[0] ;
      pr_default.close(2);
      /* Using cursor T01LY5 */
      pr_default.execute(3, new Object[] {Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         GXCCtl = "UNIESTCOD_" + sGXsfl_257_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNIEST", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtUniEstCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
      if ( isIns( )  )
      {
         nIsDirty_558 = (short)(1) ;
         A6047TotColMol = O6047TotColMol.add(A2116PrdForCan) ;
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_558 = (short)(1) ;
            A6047TotColMol = O6047TotColMol.add(A2116PrdForCan).subtract(O2116PrdForCan) ;
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_558 = (short)(1) ;
               A6047TotColMol = O6047TotColMol.subtract(O2116PrdForCan) ;
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_558 = (short)(1) ;
         A6045TotParCol = (byte)(O6045TotParCol+A6046PrdForPar) ;
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_558 = (short)(1) ;
            A6045TotParCol = (byte)(O6045TotParCol+A6046PrdForPar-O6046PrdForPar) ;
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_558 = (short)(1) ;
               A6045TotParCol = (byte)(O6045TotParCol-O6046PrdForPar) ;
            }
         }
      }
   }

   public void closeExtendedTableCursors1LY558( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable1LY558( )
   {
   }

   public void gxload_21( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T01LY55 */
      pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(49) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_257_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01LY55_A718PrdNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(49) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(49);
   }

   public void gxload_22( String A2144UniEstCod )
   {
      /* Using cursor T01LY56 */
      pr_default.execute(50, new Object[] {Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
      if ( (pr_default.getStatus(50) == 101) )
      {
         GXCCtl = "UNIESTCOD_" + sGXsfl_257_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNIEST", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtUniEstCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(50) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(50);
   }

   public void getKey1LY558( )
   {
      /* Using cursor T01LY57 */
      pr_default.execute(51, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod), Short.valueOf(A2535ForPrdLin)});
      if ( (pr_default.getStatus(51) != 101) )
      {
         RcdFound558 = (short)(1) ;
      }
      else
      {
         RcdFound558 = (short)(0) ;
      }
      pr_default.close(51);
   }

   public void getByPrimaryKey1LY558( )
   {
      /* Using cursor T01LY3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod), Short.valueOf(A2535ForPrdLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01LY3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1LY558( 20) ;
         RcdFound558 = (short)(1) ;
         initializeNonKey1LY558( ) ;
         A2535ForPrdLin = T01LY3_A2535ForPrdLin[0] ;
         A2116PrdForCan = T01LY3_A2116PrdForCan[0] ;
         n2116PrdForCan = T01LY3_n2116PrdForCan[0] ;
         A6046PrdForPar = T01LY3_A6046PrdForPar[0] ;
         n6046PrdForPar = T01LY3_n6046PrdForPar[0] ;
         A719PrdNum = T01LY3_A719PrdNum[0] ;
         n719PrdNum = T01LY3_n719PrdNum[0] ;
         A2144UniEstCod = T01LY3_A2144UniEstCod[0] ;
         n2144UniEstCod = T01LY3_n2144UniEstCod[0] ;
         O6046PrdForPar = A6046PrdForPar ;
         n6046PrdForPar = false ;
         O2116PrdForCan = A2116PrdForCan ;
         n2116PrdForCan = false ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z2141SerEst = A2141SerEst ;
         Z1013DibCli = A1013DibCli ;
         Z1014DibInt = A1014DibInt ;
         Z2074ColCom = A2074ColCom ;
         Z2078ColFon = A2078ColFon ;
         Z2098MolCod = A2098MolCod ;
         Z2535ForPrdLin = A2535ForPrdLin ;
         sMode558 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1LY558( ) ;
         load1LY558( ) ;
         Gx_mode = sMode558 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound558 = (short)(0) ;
         initializeNonKey1LY558( ) ;
         sMode558 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1LY558( ) ;
         Gx_mode = sMode558 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1LY558( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1LY558( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01LY2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod), Short.valueOf(A2535ForPrdLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRECPR2"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z2116PrdForCan, T01LY2_A2116PrdForCan[0]) != 0 ) || ( Z6046PrdForPar != T01LY2_A6046PrdForPar[0] ) || ( GXutil.strcmp(Z719PrdNum, T01LY2_A719PrdNum[0]) != 0 ) || ( GXutil.strcmp(Z2144UniEstCod, T01LY2_A2144UniEstCod[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z2116PrdForCan, T01LY2_A2116PrdForCan[0]) != 0 )
            {
               GXutil.writeLogln("ttrn20:[seudo value changed for attri]"+"PrdForCan");
               GXutil.writeLogRaw("Old: ",Z2116PrdForCan);
               GXutil.writeLogRaw("Current: ",T01LY2_A2116PrdForCan[0]);
            }
            if ( Z6046PrdForPar != T01LY2_A6046PrdForPar[0] )
            {
               GXutil.writeLogln("ttrn20:[seudo value changed for attri]"+"PrdForPar");
               GXutil.writeLogRaw("Old: ",Z6046PrdForPar);
               GXutil.writeLogRaw("Current: ",T01LY2_A6046PrdForPar[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T01LY2_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("ttrn20:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T01LY2_A719PrdNum[0]);
            }
            if ( GXutil.strcmp(Z2144UniEstCod, T01LY2_A2144UniEstCod[0]) != 0 )
            {
               GXutil.writeLogln("ttrn20:[seudo value changed for attri]"+"UniEstCod");
               GXutil.writeLogRaw("Old: ",Z2144UniEstCod);
               GXutil.writeLogRaw("Current: ",T01LY2_A2144UniEstCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPRECPR2"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1LY558( )
   {
      beforeValidate1LY558( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LY558( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1LY558( 0) ;
         checkOptimisticConcurrency1LY558( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LY558( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1LY558( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LY58 */
                  pr_default.execute(52, new Object[] {Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod), Short.valueOf(A2535ForPrdLin), Boolean.valueOf(n2116PrdForCan), A2116PrdForCan, Boolean.valueOf(n6046PrdForPar), Short.valueOf(A6046PrdForPar), A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECPR2");
                  if ( (pr_default.getStatus(52) == 1) )
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
            load1LY558( ) ;
         }
         endLevel1LY558( ) ;
      }
      closeExtendedTableCursors1LY558( ) ;
   }

   public void update1LY558( )
   {
      beforeValidate1LY558( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LY558( ) ;
      }
      if ( ( nIsMod_558 != 0 ) || ( nIsDirty_558 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1LY558( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1LY558( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1LY558( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01LY59 */
                     pr_default.execute(53, new Object[] {Boolean.valueOf(n2116PrdForCan), A2116PrdForCan, Boolean.valueOf(n6046PrdForPar), Short.valueOf(A6046PrdForPar), Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n2144UniEstCod), A2144UniEstCod, A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod), Short.valueOf(A2535ForPrdLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECPR2");
                     if ( (pr_default.getStatus(53) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPRECPR2"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1LY558( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1LY558( ) ;
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
            endLevel1LY558( ) ;
         }
      }
      closeExtendedTableCursors1LY558( ) ;
   }

   public void deferredUpdate1LY558( )
   {
   }

   public void delete1LY558( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1LY558( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LY558( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1LY558( ) ;
         afterConfirm1LY558( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1LY558( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01LY60 */
               pr_default.execute(54, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod), Short.valueOf(A2535ForPrdLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECPR2");
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
      sMode558 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1LY558( ) ;
      Gx_mode = sMode558 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1LY558( )
   {
      standaloneModal1LY558( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01LY61 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         A718PrdNom = T01LY61_A718PrdNom[0] ;
         pr_default.close(55);
         if ( isIns( )  )
         {
            A6047TotColMol = O6047TotColMol.add(A2116PrdForCan) ;
         }
         else
         {
            if ( isUpd( )  )
            {
               A6047TotColMol = O6047TotColMol.add(A2116PrdForCan).subtract(O2116PrdForCan) ;
            }
            else
            {
               if ( isDlt( )  )
               {
                  A6047TotColMol = O6047TotColMol.subtract(O2116PrdForCan) ;
               }
            }
         }
         if ( isIns( )  )
         {
            A6045TotParCol = (byte)(O6045TotParCol+A6046PrdForPar) ;
         }
         else
         {
            if ( isUpd( )  )
            {
               A6045TotParCol = (byte)(O6045TotParCol+A6046PrdForPar-O6046PrdForPar) ;
            }
            else
            {
               if ( isDlt( )  )
               {
                  A6045TotParCol = (byte)(O6045TotParCol-O6046PrdForPar) ;
               }
            }
         }
      }
   }

   public void endLevel1LY558( )
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

   public void scanStart1LY558( )
   {
      /* Scan By routine */
      /* Using cursor T01LY62 */
      pr_default.execute(56, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
      RcdFound558 = (short)(0) ;
      if ( (pr_default.getStatus(56) != 101) )
      {
         RcdFound558 = (short)(1) ;
         A2535ForPrdLin = T01LY62_A2535ForPrdLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1LY558( )
   {
      /* Scan next routine */
      pr_default.readNext(56);
      RcdFound558 = (short)(0) ;
      if ( (pr_default.getStatus(56) != 101) )
      {
         RcdFound558 = (short)(1) ;
         A2535ForPrdLin = T01LY62_A2535ForPrdLin[0] ;
      }
   }

   public void scanEnd1LY558( )
   {
      pr_default.close(56);
   }

   public void afterConfirm1LY558( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1LY558( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1LY558( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1LY558( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1LY558( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1LY558( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1LY558( )
   {
      edtForPrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdLin_Enabled), 5, 0), !bGXsfl_257_Refreshing);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_257_Refreshing);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_257_Refreshing);
      edtUniEstCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtUniEstCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUniEstCod_Enabled), 5, 0), !bGXsfl_257_Refreshing);
      edtPrdForCan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdForCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdForCan_Enabled), 5, 0), !bGXsfl_257_Refreshing);
      edtPrdForPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdForPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdForPar_Enabled), 5, 0), !bGXsfl_257_Refreshing);
   }

   public void send_integrity_lvl_hashes1LY558( )
   {
   }

   public void send_integrity_lvl_hashes1LY557( )
   {
   }

   public void send_integrity_lvl_hashes1LY556( )
   {
   }

   public void subsflControlProps_150557( )
   {
      lblTextblock27_Internalname = "TEXTBLOCK27_"+sGXsfl_150_idx ;
      edtMolCod_Internalname = "MOLCOD_"+sGXsfl_150_idx ;
      lblTextblock28_Internalname = "TEXTBLOCK28_"+sGXsfl_150_idx ;
      edtMolCon_Internalname = "MOLCON_"+sGXsfl_150_idx ;
      lblTextblock29_Internalname = "TEXTBLOCK29_"+sGXsfl_150_idx ;
      edtMolDib_Internalname = "MOLDIB_"+sGXsfl_150_idx ;
      lblTextblock30_Internalname = "TEXTBLOCK30_"+sGXsfl_150_idx ;
      edtMolCodVir_Internalname = "MOLCODVIR_"+sGXsfl_150_idx ;
      lblTextblock31_Internalname = "TEXTBLOCK31_"+sGXsfl_150_idx ;
      edtForPrdUL_Internalname = "FORPRDUL_"+sGXsfl_150_idx ;
      lblTextblock32_Internalname = "TEXTBLOCK32_"+sGXsfl_150_idx ;
      edtMolPesMin_Internalname = "MOLPESMIN_"+sGXsfl_150_idx ;
      lblTextblock33_Internalname = "TEXTBLOCK33_"+sGXsfl_150_idx ;
      edtMolForEst_Internalname = "MOLFOREST_"+sGXsfl_150_idx ;
      lblTextblock34_Internalname = "TEXTBLOCK34_"+sGXsfl_150_idx ;
      edtMolPesMax_Internalname = "MOLPESMAX_"+sGXsfl_150_idx ;
      lblTextblock35_Internalname = "TEXTBLOCK35_"+sGXsfl_150_idx ;
      edtMolCol_Internalname = "MOLCOL_"+sGXsfl_150_idx ;
      lblTextblock36_Internalname = "TEXTBLOCK36_"+sGXsfl_150_idx ;
      edtMolPrcCob_Internalname = "MOLPRCCOB_"+sGXsfl_150_idx ;
      lblTextblock37_Internalname = "TEXTBLOCK37_"+sGXsfl_150_idx ;
      edtTotParCol_Internalname = "TOTPARCOL_"+sGXsfl_150_idx ;
      lblTextblock38_Internalname = "TEXTBLOCK38_"+sGXsfl_150_idx ;
      edtTotColMol_Internalname = "TOTCOLMOL_"+sGXsfl_150_idx ;
      lblTextblock39_Internalname = "TEXTBLOCK39_"+sGXsfl_150_idx ;
      edtDg_codigo_Internalname = "DG_CODIGO_"+sGXsfl_150_idx ;
      lblTextblock40_Internalname = "TEXTBLOCK40_"+sGXsfl_150_idx ;
      edtDg_Degr_Internalname = "DG_DEGR_"+sGXsfl_150_idx ;
      lblTextblock41_Internalname = "TEXTBLOCK41_"+sGXsfl_150_idx ;
      edtDg_Valor_Internalname = "DG_VALOR_"+sGXsfl_150_idx ;
      lblTextblock42_Internalname = "TEXTBLOCK42_"+sGXsfl_150_idx ;
      edtMolActivo_Internalname = "MOLACTIVO_"+sGXsfl_150_idx ;
      lblTextblock43_Internalname = "TEXTBLOCK43_"+sGXsfl_150_idx ;
      edtMolPorVar_Internalname = "MOLPORVAR_"+sGXsfl_150_idx ;
      lblTextblock44_Internalname = "TEXTBLOCK44_"+sGXsfl_150_idx ;
      edtTaesId2_Internalname = "TAESID2_"+sGXsfl_150_idx ;
      lblTextblock45_Internalname = "TEXTBLOCK45_"+sGXsfl_150_idx ;
      edtTaesDc2_Internalname = "TAESDC2_"+sGXsfl_150_idx ;
      lblTextblock46_Internalname = "TEXTBLOCK46_"+sGXsfl_150_idx ;
      edtPasForUL_Internalname = "PASFORUL_"+sGXsfl_150_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_150_idx ;
   }

   public void subsflControlProps_fel_150557( )
   {
      lblTextblock27_Internalname = "TEXTBLOCK27_"+sGXsfl_150_fel_idx ;
      edtMolCod_Internalname = "MOLCOD_"+sGXsfl_150_fel_idx ;
      lblTextblock28_Internalname = "TEXTBLOCK28_"+sGXsfl_150_fel_idx ;
      edtMolCon_Internalname = "MOLCON_"+sGXsfl_150_fel_idx ;
      lblTextblock29_Internalname = "TEXTBLOCK29_"+sGXsfl_150_fel_idx ;
      edtMolDib_Internalname = "MOLDIB_"+sGXsfl_150_fel_idx ;
      lblTextblock30_Internalname = "TEXTBLOCK30_"+sGXsfl_150_fel_idx ;
      edtMolCodVir_Internalname = "MOLCODVIR_"+sGXsfl_150_fel_idx ;
      lblTextblock31_Internalname = "TEXTBLOCK31_"+sGXsfl_150_fel_idx ;
      edtForPrdUL_Internalname = "FORPRDUL_"+sGXsfl_150_fel_idx ;
      lblTextblock32_Internalname = "TEXTBLOCK32_"+sGXsfl_150_fel_idx ;
      edtMolPesMin_Internalname = "MOLPESMIN_"+sGXsfl_150_fel_idx ;
      lblTextblock33_Internalname = "TEXTBLOCK33_"+sGXsfl_150_fel_idx ;
      edtMolForEst_Internalname = "MOLFOREST_"+sGXsfl_150_fel_idx ;
      lblTextblock34_Internalname = "TEXTBLOCK34_"+sGXsfl_150_fel_idx ;
      edtMolPesMax_Internalname = "MOLPESMAX_"+sGXsfl_150_fel_idx ;
      lblTextblock35_Internalname = "TEXTBLOCK35_"+sGXsfl_150_fel_idx ;
      edtMolCol_Internalname = "MOLCOL_"+sGXsfl_150_fel_idx ;
      lblTextblock36_Internalname = "TEXTBLOCK36_"+sGXsfl_150_fel_idx ;
      edtMolPrcCob_Internalname = "MOLPRCCOB_"+sGXsfl_150_fel_idx ;
      lblTextblock37_Internalname = "TEXTBLOCK37_"+sGXsfl_150_fel_idx ;
      edtTotParCol_Internalname = "TOTPARCOL_"+sGXsfl_150_fel_idx ;
      lblTextblock38_Internalname = "TEXTBLOCK38_"+sGXsfl_150_fel_idx ;
      edtTotColMol_Internalname = "TOTCOLMOL_"+sGXsfl_150_fel_idx ;
      lblTextblock39_Internalname = "TEXTBLOCK39_"+sGXsfl_150_fel_idx ;
      edtDg_codigo_Internalname = "DG_CODIGO_"+sGXsfl_150_fel_idx ;
      lblTextblock40_Internalname = "TEXTBLOCK40_"+sGXsfl_150_fel_idx ;
      edtDg_Degr_Internalname = "DG_DEGR_"+sGXsfl_150_fel_idx ;
      lblTextblock41_Internalname = "TEXTBLOCK41_"+sGXsfl_150_fel_idx ;
      edtDg_Valor_Internalname = "DG_VALOR_"+sGXsfl_150_fel_idx ;
      lblTextblock42_Internalname = "TEXTBLOCK42_"+sGXsfl_150_fel_idx ;
      edtMolActivo_Internalname = "MOLACTIVO_"+sGXsfl_150_fel_idx ;
      lblTextblock43_Internalname = "TEXTBLOCK43_"+sGXsfl_150_fel_idx ;
      edtMolPorVar_Internalname = "MOLPORVAR_"+sGXsfl_150_fel_idx ;
      lblTextblock44_Internalname = "TEXTBLOCK44_"+sGXsfl_150_fel_idx ;
      edtTaesId2_Internalname = "TAESID2_"+sGXsfl_150_fel_idx ;
      lblTextblock45_Internalname = "TEXTBLOCK45_"+sGXsfl_150_fel_idx ;
      edtTaesDc2_Internalname = "TAESDC2_"+sGXsfl_150_fel_idx ;
      lblTextblock46_Internalname = "TEXTBLOCK46_"+sGXsfl_150_fel_idx ;
      edtPasForUL_Internalname = "PASFORUL_"+sGXsfl_150_fel_idx ;
      subGrid2_Internalname = "GRID2_"+sGXsfl_150_fel_idx ;
   }

   public void addRow1LY557( )
   {
      nRC_GXsfl_257 = 0 ;
      nGXsfl_150_idx = (int)(nGXsfl_150_idx+1) ;
      sGXsfl_150_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_150_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_150557( ) ;
      sendRow1LY557( ) ;
   }

   public void sendRow1LY557( )
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
         if ( ((int)((nGXsfl_150_idx) % (2))) == 0 )
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
      /* Start of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGrid1_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_150_idx+"\">") ;
      }
      if ( GRID1_IsPaging == 0 )
      {
         GXCCtl = "GRID2_nFirstRecordOnPage_" + sGXsfl_150_idx ;
         GRID2_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      else
      {
         GRID2_nFirstRecordOnPage = 0 ;
      }
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"",subGrid1_Linesclass,""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Table start */
      Grid1Row.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTable3_Internalname+"_"+sGXsfl_150_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock27_Internalname,httpContext.getMessage( "Codigo de Molde", ""),"","",lblTextblock27_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_557_" + sGXsfl_150_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 158,'',false,'" + sGXsfl_150_idx + "',150)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMolCod_Internalname,GXutil.ltrim( localUtil.ntoc( A2098MolCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2098MolCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,158);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMolCod_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtMolCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(2),"chr",Integer.valueOf(1),"row",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock28_Internalname,httpContext.getMessage( "Consumo", ""),"","",lblTextblock28_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_557_" + sGXsfl_150_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 163,'',false,'" + sGXsfl_150_idx + "',150)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMolCon_Internalname,GXutil.ltrim( localUtil.ntoc( A2100MolCon, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMolCon_Enabled!=0) ? localUtil.format( A2100MolCon, "ZZZZZ9.99") : localUtil.format( A2100MolCon, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,163);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMolCon_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtMolCon_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(9),"chr",Integer.valueOf(1),"row",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock29_Internalname,httpContext.getMessage( "Nombre molde / cilindro", ""),"","",lblTextblock29_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMolDib_Internalname,GXutil.rtrim( A2101MolDib),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMolDib_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtMolDib_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(20),"chr",Integer.valueOf(1),"row",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock30_Internalname,httpContext.getMessage( "Codigo Molde / Cilindro Dib.", ""),"","",lblTextblock30_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMolCodVir_Internalname,GXutil.ltrim( localUtil.ntoc( A2099MolCodVir, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMolCodVir_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2099MolCodVir), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A2099MolCodVir), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMolCodVir_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtMolCodVir_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(2),"chr",Integer.valueOf(1),"row",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock31_Internalname,httpContext.getMessage( "Ultima Linea Producto", ""),"","",lblTextblock31_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_557_" + sGXsfl_150_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 178,'',false,'" + sGXsfl_150_idx + "',150)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdUL_Internalname,GXutil.ltrim( localUtil.ntoc( A2536ForPrdUL, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtForPrdUL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2536ForPrdUL), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2536ForPrdUL), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,178);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdUL_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtForPrdUL_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(3),"chr",Integer.valueOf(1),"row",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock32_Internalname,httpContext.getMessage( "Pesada Minima", ""),"","",lblTextblock32_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_557_" + sGXsfl_150_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 183,'',false,'" + sGXsfl_150_idx + "',150)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMolPesMin_Internalname,GXutil.ltrim( localUtil.ntoc( A2650MolPesMin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMolPesMin_Enabled!=0) ? localUtil.format( A2650MolPesMin, "ZZZZZ9.99") : localUtil.format( A2650MolPesMin, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,183);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMolPesMin_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtMolPesMin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(9),"chr",Integer.valueOf(1),"row",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock33_Internalname,httpContext.getMessage( "Molde Activo (S/N)", ""),"","",lblTextblock33_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_557_" + sGXsfl_150_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 188,'',false,'" + sGXsfl_150_idx + "',150)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMolForEst_Internalname,GXutil.rtrim( A2648MolForEst),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,188);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMolForEst_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtMolForEst_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock34_Internalname,httpContext.getMessage( "Pesada Maxima", ""),"","",lblTextblock34_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_557_" + sGXsfl_150_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 193,'',false,'" + sGXsfl_150_idx + "',150)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMolPesMax_Internalname,GXutil.ltrim( localUtil.ntoc( A2649MolPesMax, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMolPesMax_Enabled!=0) ? localUtil.format( A2649MolPesMax, "ZZZZZ9.99") : localUtil.format( A2649MolPesMax, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,193);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMolPesMax_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtMolPesMax_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(9),"chr",Integer.valueOf(1),"row",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock35_Internalname,httpContext.getMessage( "Color", ""),"","",lblTextblock35_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_557_" + sGXsfl_150_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 198,'',false,'" + sGXsfl_150_idx + "',150)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMolCol_Internalname,GXutil.rtrim( A4420MolCol),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,198);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMolCol_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtMolCol_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(20),"chr",Integer.valueOf(1),"row",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock36_Internalname,httpContext.getMessage( "MolPrcCob", ""),"","",lblTextblock36_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMolPrcCob_Internalname,GXutil.ltrim( localUtil.ntoc( A4862MolPrcCob, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMolPrcCob_Enabled!=0) ? localUtil.format( A4862MolPrcCob, "Z9.99") : localUtil.format( A4862MolPrcCob, "Z9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMolPrcCob_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtMolPrcCob_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(5),"chr",Integer.valueOf(1),"row",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock37_Internalname,httpContext.getMessage( "Partes Color (formula)", ""),"","",lblTextblock37_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTotParCol_Internalname,GXutil.ltrim( localUtil.ntoc( A6045TotParCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTotParCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6045TotParCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A6045TotParCol), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTotParCol_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtTotParCol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(2),"chr",Integer.valueOf(1),"row",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock38_Internalname,httpContext.getMessage( "Total Color por Molde-Formula", ""),"","",lblTextblock38_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTotColMol_Internalname,GXutil.ltrim( localUtil.ntoc( A6047TotColMol, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTotColMol_Enabled!=0) ? localUtil.format( A6047TotColMol, "ZZZZZZ9.99") : localUtil.format( A6047TotColMol, "ZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTotColMol_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtTotColMol_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(10),"chr",Integer.valueOf(1),"row",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock39_Internalname,httpContext.getMessage( "Codigo", ""),"","",lblTextblock39_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_557_" + sGXsfl_150_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 218,'',false,'" + sGXsfl_150_idx + "',150)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDg_codigo_Internalname,GXutil.ltrim( localUtil.ntoc( A8052Dg_codigo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDg_codigo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8052Dg_codigo), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8052Dg_codigo), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,218);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDg_codigo_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDg_codigo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock40_Internalname,httpContext.getMessage( "Degradacion(1:)", ""),"","",lblTextblock40_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDg_Degr_Internalname,GXutil.ltrim( localUtil.ntoc( A8054Dg_Degr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDg_Degr_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8054Dg_Degr), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8054Dg_Degr), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDg_Degr_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDg_Degr_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock41_Internalname,httpContext.getMessage( "Valor", ""),"","",lblTextblock41_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDg_Valor_Internalname,GXutil.ltrim( localUtil.ntoc( A8055Dg_Valor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDg_Valor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8055Dg_Valor), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8055Dg_Valor), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDg_Valor_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtDg_Valor_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(4),"chr",Integer.valueOf(1),"row",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock42_Internalname,httpContext.getMessage( "Activo?", ""),"","",lblTextblock42_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMolActivo_Internalname,GXutil.rtrim( A8418MolActivo),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMolActivo_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtMolActivo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock43_Internalname,httpContext.getMessage( "% Varilla", ""),"","",lblTextblock43_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_557_" + sGXsfl_150_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 238,'',false,'" + sGXsfl_150_idx + "',150)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMolPorVar_Internalname,GXutil.ltrim( localUtil.ntoc( A9608MolPorVar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMolPorVar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9608MolPorVar), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9608MolPorVar), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,238);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMolPorVar_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtMolPorVar_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(3),"chr",Integer.valueOf(1),"row",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock44_Internalname,httpContext.getMessage( "Tabla Ligantes-Espesantes", ""),"","",lblTextblock44_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_557_" + sGXsfl_150_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 243,'',false,'" + sGXsfl_150_idx + "',150)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTaesId2_Internalname,GXutil.rtrim( A11759TaesId2),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,243);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTaesId2_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtTaesId2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock45_Internalname,httpContext.getMessage( "Descripcion Tabla", ""),"","",lblTextblock45_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTaesDc2_Internalname,GXutil.rtrim( A11760TaesDc2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTaesDc2_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtTaesDc2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(80),"chr",Integer.valueOf(1),"row",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Text block */
      Grid1Row.AddColumnProperties("label", 1, isAjaxCallMode( ), new Object[] {lblTextblock46_Internalname,httpContext.getMessage( "Ultima Linea Pastas", ""),"","",lblTextblock46_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'","","TextBlock",Integer.valueOf(0),"",Integer.valueOf(1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0)});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_557_" + sGXsfl_150_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 253,'',false,'" + sGXsfl_150_idx + "',150)\"" ;
      ROClassString = "" ;
      Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPasForUL_Internalname,GXutil.ltrim( localUtil.ntoc( A2655PasForUL, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPasForUL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2655PasForUL), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2655PasForUL), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,253);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPasForUL_Jsonclick,Integer.valueOf(0),"","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtPasForUL_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(3),"chr",Integer.valueOf(1),"row",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(150),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      Grid1Row.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      Grid1Row.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /*  Child Grid Control  */
      Grid1Row.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"Grid2Container"});
      if ( isAjaxCallMode( ) )
      {
         Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         Grid2Container.Clear();
      }
      startgridcontrol257( ) ;
      nGXsfl_257_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount558 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_558 = (short)(1) ;
            scanStart1LY558( ) ;
            while ( RcdFound558 != 0 )
            {
               init_level_properties558( ) ;
               getByPrimaryKey1LY558( ) ;
               addRow1LY558( ) ;
               scanNext1LY558( ) ;
            }
            scanEnd1LY558( ) ;
            nBlankRcdCount558 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B6045TotParCol = A6045TotParCol ;
         B6047TotColMol = A6047TotColMol ;
         standaloneNotModal1LY558( ) ;
         standaloneModal1LY558( ) ;
         sMode558 = Gx_mode ;
         while ( nGXsfl_257_idx < nRC_GXsfl_257 )
         {
            bGXsfl_257_Refreshing = true ;
            readRow1LY558( ) ;
            edtavnRcdDeleted_558_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_558_"+sGXsfl_257_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtavnRcdDeleted_558_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavnRcdDeleted_558_Enabled), 5, 0), !bGXsfl_257_Refreshing);
            edtForPrdLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDLIN_"+sGXsfl_257_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtForPrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdLin_Enabled), 5, 0), !bGXsfl_257_Refreshing);
            edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_257_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_257_Refreshing);
            edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_257_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), !bGXsfl_257_Refreshing);
            edtUniEstCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UNIESTCOD_"+sGXsfl_257_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtUniEstCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtUniEstCod_Enabled), 5, 0), !bGXsfl_257_Refreshing);
            edtPrdForCan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDFORCAN_"+sGXsfl_257_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdForCan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdForCan_Enabled), 5, 0), !bGXsfl_257_Refreshing);
            edtPrdForPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDFORPAR_"+sGXsfl_257_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdForPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdForPar_Enabled), 5, 0), !bGXsfl_257_Refreshing);
            if ( ( nRcdExists_558 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1LY558( ) ;
            }
            sendRow1LY558( ) ;
            bGXsfl_257_Refreshing = false ;
         }
         Gx_mode = sMode558 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A6045TotParCol = B6045TotParCol ;
         A6047TotColMol = B6047TotColMol ;
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount558 = (short)(5) ;
         nRcdExists_558 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1LY558( ) ;
            while ( RcdFound558 != 0 )
            {
               sGXsfl_257_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_257_idx+1), 4, 0), (short)(4), "0") + sGXsfl_150_idx ;
               subsflControlProps_257558( ) ;
               init_level_properties558( ) ;
               standaloneNotModal1LY558( ) ;
               getByPrimaryKey1LY558( ) ;
               standaloneModal1LY558( ) ;
               addRow1LY558( ) ;
               scanNext1LY558( ) ;
            }
            scanEnd1LY558( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode558 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_257_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_257_idx+1), 4, 0), (short)(4), "0") + sGXsfl_150_idx ;
      subsflControlProps_257558( ) ;
      initAll1LY558( ) ;
      init_level_properties558( ) ;
      B6045TotParCol = A6045TotParCol ;
      B6047TotColMol = A6047TotColMol ;
      nRcdExists_558 = (short)(0) ;
      nIsMod_558 = (short)(0) ;
      nRcdDeleted_558 = (short)(0) ;
      if ( ( CommonUtil.decimalVal( EvtGridId, ".").add(CommonUtil.decimalVal( EvtRowId, ".")).doubleValue() == 0 ) || ( 150 == CommonUtil.decimalVal( EvtGridId, ".").doubleValue() ) && ( DecimalUtil.compareTo(CommonUtil.decimalVal( EvtRowId, "."), CommonUtil.decimalVal( sGXsfl_150_idx, ".")) == 0 ) )
      {
         nBlankRcdCount558 = (short)(nBlankRcdUsr558+nBlankRcdCount558) ;
      }
      fRowAdded = 0 ;
      while ( nBlankRcdCount558 > 0 )
      {
         standaloneNotModal1LY558( ) ;
         standaloneModal1LY558( ) ;
         addRow1LY558( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtForPrdLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount558 = (short)(nBlankRcdCount558-1) ;
      }
      Gx_mode = sMode558 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A6045TotParCol = B6045TotParCol ;
      A6047TotColMol = B6047TotColMol ;
      if ( ! isAjaxCallMode( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"_"+sGXsfl_150_idx, Grid2Container.ToJavascriptSource());
      }
      if ( isAjaxCallMode( ) )
      {
         Grid1Row.AddGrid("Grid2", Grid2Container);
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Grid2ContainerData"+"V_"+sGXsfl_150_idx, Grid2Container.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid2ContainerData"+"V_"+sGXsfl_150_idx+"\" value='"+Grid2Container.GridValuesHidden()+"'/>") ;
      }
      /* End of table */
      httpContext.ajax_sending_grid_row(Grid1Row);
      send_integrity_lvl_hashes1LY557( ) ;
      GXCCtl = "Z2098MolCod_" + sGXsfl_150_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2098MolCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2100MolCon_" + sGXsfl_150_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2100MolCon, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2536ForPrdUL_" + sGXsfl_150_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2536ForPrdUL, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2650MolPesMin_" + sGXsfl_150_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2650MolPesMin, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2648MolForEst_" + sGXsfl_150_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2648MolForEst));
      GXCCtl = "Z2649MolPesMax_" + sGXsfl_150_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2649MolPesMax, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4420MolCol_" + sGXsfl_150_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4420MolCol));
      GXCCtl = "Z9608MolPorVar_" + sGXsfl_150_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9608MolPorVar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11759TaesId2_" + sGXsfl_150_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11759TaesId2));
      GXCCtl = "Z2655PasForUL_" + sGXsfl_150_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2655PasForUL, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z8052Dg_codigo_" + sGXsfl_150_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8052Dg_codigo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O6045TotParCol_" + sGXsfl_150_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O6045TotParCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O6047TotColMol_" + sGXsfl_150_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O6047TotColMol, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRC_GXsfl_257_" + sGXsfl_150_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nGXsfl_257_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_557_" + sGXsfl_150_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_557, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_557_" + sGXsfl_150_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_557, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_557_" + sGXsfl_150_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_557, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MOLCOD_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MOLCON_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MOLDIB_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolDib_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MOLCODVIR_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolCodVir_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDUL_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUL_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MOLPESMIN_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolPesMin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MOLFOREST_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolForEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MOLPESMAX_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolPesMax_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MOLCOL_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MOLPRCCOB_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolPrcCob_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TOTPARCOL_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTotParCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TOTCOLMOL_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTotColMol_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DG_CODIGO_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDg_codigo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DG_DEGR_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDg_Degr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DG_VALOR_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDg_Valor_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MOLACTIVO_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolActivo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MOLPORVAR_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMolPorVar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TAESID2_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTaesId2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TAESDC2_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTaesDc2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PASFORUL_"+sGXsfl_150_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForUL_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      GRID2_nFirstRecordOnPage = 0 ;
      GRID2_nCurrentRecord = 0 ;
      /* End of Columns property logic. */
      if ( Grid1Container.GetWrapped() == 1 )
      {
         if ( 1 > 0 )
         {
            if ( ((int)((nGXsfl_150_idx) % (1))) == 0 )
            {
               httpContext.writeTextNL( "</tr>") ;
            }
         }
      }
      Grid1Container.AddRow(Grid1Row);
   }

   public void readRow1LY557( )
   {
      nGXsfl_150_idx = (int)(nGXsfl_150_idx+1) ;
      sGXsfl_150_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_150_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_150557( ) ;
      edtMolCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOLCOD_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMolCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOLCON_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMolDib_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOLDIB_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMolCodVir_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOLCODVIR_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdUL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDUL_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMolPesMin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOLPESMIN_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMolForEst_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOLFOREST_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMolPesMax_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOLPESMAX_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMolCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOLCOL_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMolPrcCob_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOLPRCCOB_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTotParCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TOTPARCOL_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTotColMol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TOTCOLMOL_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDg_codigo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DG_CODIGO_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDg_Degr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DG_DEGR_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDg_Valor_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DG_VALOR_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMolActivo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOLACTIVO_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMolPorVar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MOLPORVAR_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTaesId2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAESID2_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTaesDc2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAESDC2_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPasForUL_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PASFORUL_"+sGXsfl_150_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMolCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMolCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "MOLCOD_" + sGXsfl_150_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMolCod_Internalname ;
         wbErr = true ;
         A2098MolCod = (byte)(0) ;
      }
      else
      {
         A2098MolCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtMolCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMolCon_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMolCon_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "MOLCON_" + sGXsfl_150_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMolCon_Internalname ;
         wbErr = true ;
         A2100MolCon = DecimalUtil.ZERO ;
         n2100MolCon = false ;
      }
      else
      {
         A2100MolCon = localUtil.ctond( httpContext.cgiGet( edtMolCon_Internalname)) ;
         n2100MolCon = false ;
      }
      A2101MolDib = httpContext.cgiGet( edtMolDib_Internalname) ;
      A2099MolCodVir = (byte)(localUtil.ctol( httpContext.cgiGet( edtMolCodVir_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "FORPRDUL_" + sGXsfl_150_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUL_Internalname ;
         wbErr = true ;
         A2536ForPrdUL = (short)(0) ;
         n2536ForPrdUL = false ;
      }
      else
      {
         A2536ForPrdUL = (short)(localUtil.ctol( httpContext.cgiGet( edtForPrdUL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n2536ForPrdUL = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMolPesMin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMolPesMin_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "MOLPESMIN_" + sGXsfl_150_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMolPesMin_Internalname ;
         wbErr = true ;
         A2650MolPesMin = DecimalUtil.ZERO ;
         n2650MolPesMin = false ;
      }
      else
      {
         A2650MolPesMin = localUtil.ctond( httpContext.cgiGet( edtMolPesMin_Internalname)) ;
         n2650MolPesMin = false ;
      }
      A2648MolForEst = httpContext.cgiGet( edtMolForEst_Internalname) ;
      n2648MolForEst = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMolPesMax_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMolPesMax_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "MOLPESMAX_" + sGXsfl_150_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMolPesMax_Internalname ;
         wbErr = true ;
         A2649MolPesMax = DecimalUtil.ZERO ;
         n2649MolPesMax = false ;
      }
      else
      {
         A2649MolPesMax = localUtil.ctond( httpContext.cgiGet( edtMolPesMax_Internalname)) ;
         n2649MolPesMax = false ;
      }
      A4420MolCol = httpContext.cgiGet( edtMolCol_Internalname) ;
      n4420MolCol = false ;
      A4862MolPrcCob = localUtil.ctond( httpContext.cgiGet( edtMolPrcCob_Internalname)) ;
      A6045TotParCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtTotParCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A6047TotColMol = localUtil.ctond( httpContext.cgiGet( edtTotColMol_Internalname)) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDg_codigo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDg_codigo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "DG_CODIGO_" + sGXsfl_150_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDg_codigo_Internalname ;
         wbErr = true ;
         A8052Dg_codigo = (short)(0) ;
         n8052Dg_codigo = false ;
      }
      else
      {
         A8052Dg_codigo = (short)(localUtil.ctol( httpContext.cgiGet( edtDg_codigo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n8052Dg_codigo = false ;
      }
      A8054Dg_Degr = (short)(localUtil.ctol( httpContext.cgiGet( edtDg_Degr_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n8054Dg_Degr = false ;
      A8055Dg_Valor = (short)(localUtil.ctol( httpContext.cgiGet( edtDg_Valor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A8418MolActivo = httpContext.cgiGet( edtMolActivo_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMolPorVar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMolPorVar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "MOLPORVAR_" + sGXsfl_150_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMolPorVar_Internalname ;
         wbErr = true ;
         A9608MolPorVar = (short)(0) ;
         n9608MolPorVar = false ;
      }
      else
      {
         A9608MolPorVar = (short)(localUtil.ctol( httpContext.cgiGet( edtMolPorVar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n9608MolPorVar = false ;
      }
      A11759TaesId2 = httpContext.cgiGet( edtTaesId2_Internalname) ;
      n11759TaesId2 = false ;
      A11760TaesDc2 = httpContext.cgiGet( edtTaesDc2_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPasForUL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPasForUL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "PASFORUL_" + sGXsfl_150_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPasForUL_Internalname ;
         wbErr = true ;
         A2655PasForUL = (short)(0) ;
         n2655PasForUL = false ;
      }
      else
      {
         A2655PasForUL = (short)(localUtil.ctol( httpContext.cgiGet( edtPasForUL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n2655PasForUL = false ;
      }
      GXCCtl = "Z2098MolCod_" + sGXsfl_150_idx ;
      Z2098MolCod = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2100MolCon_" + sGXsfl_150_idx ;
      Z2100MolCon = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2536ForPrdUL_" + sGXsfl_150_idx ;
      Z2536ForPrdUL = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2650MolPesMin_" + sGXsfl_150_idx ;
      Z2650MolPesMin = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2648MolForEst_" + sGXsfl_150_idx ;
      Z2648MolForEst = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2649MolPesMax_" + sGXsfl_150_idx ;
      Z2649MolPesMax = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4420MolCol_" + sGXsfl_150_idx ;
      Z4420MolCol = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z9608MolPorVar_" + sGXsfl_150_idx ;
      Z9608MolPorVar = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11759TaesId2_" + sGXsfl_150_idx ;
      Z11759TaesId2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2655PasForUL_" + sGXsfl_150_idx ;
      Z2655PasForUL = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z8052Dg_codigo_" + sGXsfl_150_idx ;
      Z8052Dg_codigo = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O6045TotParCol_" + sGXsfl_150_idx ;
      O6045TotParCol = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O6047TotColMol_" + sGXsfl_150_idx ;
      O6047TotColMol = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRC_GXsfl_257_" + sGXsfl_150_idx ;
      nRC_GXsfl_257 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_557_" + sGXsfl_150_idx ;
      nRcdDeleted_557 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_557_" + sGXsfl_150_idx ;
      nRcdExists_557 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_557_" + sGXsfl_150_idx ;
      nIsMod_557 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRC_GXsfl_257_" + sGXsfl_150_idx ;
      nRC_GXsfl_257 = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_257558( )
   {
      edtavnRcdDeleted_558_Internalname = "vNRCDDELETED_558_"+sGXsfl_257_idx ;
      edtForPrdLin_Internalname = "FORPRDLIN_"+sGXsfl_257_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_257_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_257_idx ;
      edtUniEstCod_Internalname = "UNIESTCOD_"+sGXsfl_257_idx ;
      edtPrdForCan_Internalname = "PRDFORCAN_"+sGXsfl_257_idx ;
      edtPrdForPar_Internalname = "PRDFORPAR_"+sGXsfl_257_idx ;
   }

   public void subsflControlProps_fel_257558( )
   {
      edtavnRcdDeleted_558_Internalname = "vNRCDDELETED_558_"+sGXsfl_257_fel_idx ;
      edtForPrdLin_Internalname = "FORPRDLIN_"+sGXsfl_257_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_257_fel_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_257_fel_idx ;
      edtUniEstCod_Internalname = "UNIESTCOD_"+sGXsfl_257_fel_idx ;
      edtPrdForCan_Internalname = "PRDFORCAN_"+sGXsfl_257_fel_idx ;
      edtPrdForPar_Internalname = "PRDFORPAR_"+sGXsfl_257_fel_idx ;
   }

   public void addRow1LY558( )
   {
      nGXsfl_257_idx = (int)(nGXsfl_257_idx+1) ;
      sGXsfl_257_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_257_idx), 4, 0), (short)(4), "0") + sGXsfl_150_idx ;
      subsflControlProps_257558( ) ;
      sendRow1LY558( ) ;
   }

   public void sendRow1LY558( )
   {
      Grid2Row = GXWebRow.GetNew(context) ;
      if ( subGrid2_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGrid2_Backstyle = (byte)(0) ;
         subGrid2_Backcolor = subGrid2_Allbackcolor ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Uniform" ;
         }
      }
      else if ( subGrid2_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
         {
            subGrid2_Linesclass = subGrid2_Class+"Odd" ;
         }
         subGrid2_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGrid2_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGrid2_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_257_idx) % (2))) == 0 )
         {
            subGrid2_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Even" ;
            }
         }
         else
         {
            subGrid2_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGrid2_Class, "") != 0 )
            {
               subGrid2_Linesclass = subGrid2_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_558_" + sGXsfl_257_idx + "',1);gx.fn.setControlValue('nIsMod_557_" + sGXsfl_150_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 258,'',false,'" + sGXsfl_257_idx + "',257)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavnRcdDeleted_558_Internalname,GXutil.ltrim( localUtil.ntoc( nRcdDeleted_558, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavnRcdDeleted_558_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_558), "9999") : localUtil.format( DecimalUtil.doubleToDec(nRcdDeleted_558), "9999")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,258);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavnRcdDeleted_558_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtavnRcdDeleted_558_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(257),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_558_" + sGXsfl_257_idx + "',1);gx.fn.setControlValue('nIsMod_557_" + sGXsfl_150_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 259,'',false,'" + sGXsfl_257_idx + "',257)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A2535ForPrdLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2535ForPrdLin), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,259);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtForPrdLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(257),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_558_" + sGXsfl_257_idx + "',1);gx.fn.setControlValue('nIsMod_557_" + sGXsfl_150_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 260,'',false,'" + sGXsfl_257_idx + "',257)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,260);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdNum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(257),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(257),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_558_" + sGXsfl_257_idx + "',1);gx.fn.setControlValue('nIsMod_557_" + sGXsfl_150_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 262,'',false,'" + sGXsfl_257_idx + "',257)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtUniEstCod_Internalname,GXutil.rtrim( A2144UniEstCod),GXutil.rtrim( localUtil.format( A2144UniEstCod, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,262);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtUniEstCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtUniEstCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(257),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_558_" + sGXsfl_257_idx + "',1);gx.fn.setControlValue('nIsMod_557_" + sGXsfl_150_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 263,'',false,'" + sGXsfl_257_idx + "',257)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdForCan_Internalname,GXutil.ltrim( localUtil.ntoc( A2116PrdForCan, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdForCan_Enabled!=0) ? localUtil.format( A2116PrdForCan, "ZZZZZ9.999") : localUtil.format( A2116PrdForCan, "ZZZZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,263);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdForCan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdForCan_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(257),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_558_" + sGXsfl_257_idx + "',1);gx.fn.setControlValue('nIsMod_557_" + sGXsfl_150_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 264,'',false,'" + sGXsfl_257_idx + "',257)\"" ;
      ROClassString = "Attribute" ;
      Grid2Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdForPar_Internalname,GXutil.ltrim( localUtil.ntoc( A6046PrdForPar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdForPar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6046PrdForPar), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6046PrdForPar), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,264);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdForPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtPrdForPar_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(257),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Grid2Row);
      send_integrity_lvl_hashes1LY558( ) ;
      GXCCtl = "Z2535ForPrdLin_" + sGXsfl_257_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2535ForPrdLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2116PrdForCan_" + sGXsfl_257_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2116PrdForCan, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6046PrdForPar_" + sGXsfl_257_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6046PrdForPar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z719PrdNum_" + sGXsfl_257_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z719PrdNum));
      GXCCtl = "Z2144UniEstCod_" + sGXsfl_257_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2144UniEstCod));
      GXCCtl = "O6046PrdForPar_" + sGXsfl_257_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O6046PrdForPar, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O2116PrdForCan_" + sGXsfl_257_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2116PrdForCan, (byte)(10), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_558_" + sGXsfl_257_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_558, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_558_" + sGXsfl_257_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_558, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_558_" + sGXsfl_257_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_558, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNRCDDELETED_558_"+sGXsfl_257_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_558_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORPRDLIN_"+sGXsfl_257_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM_"+sGXsfl_257_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM_"+sGXsfl_257_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "UNIESTCOD_"+sGXsfl_257_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtUniEstCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDFORCAN_"+sGXsfl_257_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdForCan_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDFORPAR_"+sGXsfl_257_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdForPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Grid2Container.AddRow(Grid2Row);
   }

   public void readRow1LY558( )
   {
      nGXsfl_257_idx = (int)(nGXsfl_257_idx+1) ;
      sGXsfl_257_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_257_idx), 4, 0), (short)(4), "0") + sGXsfl_150_idx ;
      subsflControlProps_257558( ) ;
      edtavnRcdDeleted_558_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "vNRCDDELETED_558_"+sGXsfl_257_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtForPrdLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FORPRDLIN_"+sGXsfl_257_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_257_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNOM_"+sGXsfl_257_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtUniEstCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "UNIESTCOD_"+sGXsfl_257_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdForCan_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDFORCAN_"+sGXsfl_257_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdForPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDFORPAR_"+sGXsfl_257_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_558_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_558_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNRCDDELETED_558");
         AnyError = (short)(1) ;
         GX_FocusControl = edtavnRcdDeleted_558_Internalname ;
         wbErr = true ;
         nRcdDeleted_558 = (short)(0) ;
      }
      else
      {
         nRcdDeleted_558 = (short)(localUtil.ctol( httpContext.cgiGet( edtavnRcdDeleted_558_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "FORPRDLIN_" + sGXsfl_257_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdLin_Internalname ;
         wbErr = true ;
         A2535ForPrdLin = (short)(0) ;
      }
      else
      {
         A2535ForPrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtForPrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
      n719PrdNum = false ;
      A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
      A2144UniEstCod = GXutil.upper( httpContext.cgiGet( edtUniEstCod_Internalname)) ;
      n2144UniEstCod = false ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdForCan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdForCan_Internalname)), DecimalUtil.stringToDec("999999.999")) > 0 ) ) )
      {
         GXCCtl = "PRDFORCAN_" + sGXsfl_257_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdForCan_Internalname ;
         wbErr = true ;
         A2116PrdForCan = DecimalUtil.ZERO ;
         n2116PrdForCan = false ;
      }
      else
      {
         A2116PrdForCan = localUtil.ctond( httpContext.cgiGet( edtPrdForCan_Internalname)) ;
         n2116PrdForCan = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdForPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdForPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "PRDFORPAR_" + sGXsfl_257_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdForPar_Internalname ;
         wbErr = true ;
         A6046PrdForPar = (short)(0) ;
         n6046PrdForPar = false ;
      }
      else
      {
         A6046PrdForPar = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdForPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n6046PrdForPar = false ;
      }
      GXCCtl = "Z2535ForPrdLin_" + sGXsfl_257_idx ;
      Z2535ForPrdLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z2116PrdForCan_" + sGXsfl_257_idx ;
      Z2116PrdForCan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6046PrdForPar_" + sGXsfl_257_idx ;
      Z6046PrdForPar = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_257_idx ;
      Z719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2144UniEstCod_" + sGXsfl_257_idx ;
      Z2144UniEstCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O6046PrdForPar_" + sGXsfl_257_idx ;
      O6046PrdForPar = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "O2116PrdForCan_" + sGXsfl_257_idx ;
      O2116PrdForCan = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_558_" + sGXsfl_257_idx ;
      nRcdDeleted_558 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_558_" + sGXsfl_257_idx ;
      nRcdExists_558 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_558_" + sGXsfl_257_idx ;
      nIsMod_558 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtForPrdLin_Enabled = edtForPrdLin_Enabled ;
      defedtMolCod_Enabled = edtMolCod_Enabled ;
   }

   public void confirmValues1LY0( )
   {
      nGXsfl_150_idx = 0 ;
      sGXsfl_150_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_150_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_150557( ) ;
      while ( nGXsfl_150_idx < nRC_GXsfl_150 )
      {
         nGXsfl_150_idx = (int)(nGXsfl_150_idx+1) ;
         sGXsfl_150_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_150_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_150557( ) ;
         httpContext.changePostValue( "Z2098MolCod_"+sGXsfl_150_idx, httpContext.cgiGet( "ZT_"+"Z2098MolCod_"+sGXsfl_150_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2098MolCod_"+sGXsfl_150_idx) ;
         httpContext.changePostValue( "Z2100MolCon_"+sGXsfl_150_idx, httpContext.cgiGet( "ZT_"+"Z2100MolCon_"+sGXsfl_150_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2100MolCon_"+sGXsfl_150_idx) ;
         httpContext.changePostValue( "Z2536ForPrdUL_"+sGXsfl_150_idx, httpContext.cgiGet( "ZT_"+"Z2536ForPrdUL_"+sGXsfl_150_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2536ForPrdUL_"+sGXsfl_150_idx) ;
         httpContext.changePostValue( "Z2650MolPesMin_"+sGXsfl_150_idx, httpContext.cgiGet( "ZT_"+"Z2650MolPesMin_"+sGXsfl_150_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2650MolPesMin_"+sGXsfl_150_idx) ;
         httpContext.changePostValue( "Z2648MolForEst_"+sGXsfl_150_idx, httpContext.cgiGet( "ZT_"+"Z2648MolForEst_"+sGXsfl_150_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2648MolForEst_"+sGXsfl_150_idx) ;
         httpContext.changePostValue( "Z2649MolPesMax_"+sGXsfl_150_idx, httpContext.cgiGet( "ZT_"+"Z2649MolPesMax_"+sGXsfl_150_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2649MolPesMax_"+sGXsfl_150_idx) ;
         httpContext.changePostValue( "Z4420MolCol_"+sGXsfl_150_idx, httpContext.cgiGet( "ZT_"+"Z4420MolCol_"+sGXsfl_150_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4420MolCol_"+sGXsfl_150_idx) ;
         httpContext.changePostValue( "Z9608MolPorVar_"+sGXsfl_150_idx, httpContext.cgiGet( "ZT_"+"Z9608MolPorVar_"+sGXsfl_150_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9608MolPorVar_"+sGXsfl_150_idx) ;
         httpContext.changePostValue( "Z11759TaesId2_"+sGXsfl_150_idx, httpContext.cgiGet( "ZT_"+"Z11759TaesId2_"+sGXsfl_150_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11759TaesId2_"+sGXsfl_150_idx) ;
         httpContext.changePostValue( "Z2655PasForUL_"+sGXsfl_150_idx, httpContext.cgiGet( "ZT_"+"Z2655PasForUL_"+sGXsfl_150_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2655PasForUL_"+sGXsfl_150_idx) ;
         httpContext.changePostValue( "Z8052Dg_codigo_"+sGXsfl_150_idx, httpContext.cgiGet( "ZT_"+"Z8052Dg_codigo_"+sGXsfl_150_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8052Dg_codigo_"+sGXsfl_150_idx) ;
      }
      nGXsfl_257_idx = 0 ;
      sGXsfl_257_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_257_idx), 4, 0), (short)(4), "0") + sGXsfl_150_idx ;
      subsflControlProps_257558( ) ;
      while ( nGXsfl_257_idx < nRC_GXsfl_257 )
      {
         nGXsfl_257_idx = (int)(nGXsfl_257_idx+1) ;
         sGXsfl_257_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_257_idx), 4, 0), (short)(4), "0") + sGXsfl_150_idx ;
         subsflControlProps_257558( ) ;
         httpContext.changePostValue( "Z2535ForPrdLin_"+sGXsfl_257_idx, httpContext.cgiGet( "ZT_"+"Z2535ForPrdLin_"+sGXsfl_257_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2535ForPrdLin_"+sGXsfl_257_idx) ;
         httpContext.changePostValue( "Z2116PrdForCan_"+sGXsfl_257_idx, httpContext.cgiGet( "ZT_"+"Z2116PrdForCan_"+sGXsfl_257_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2116PrdForCan_"+sGXsfl_257_idx) ;
         httpContext.changePostValue( "Z6046PrdForPar_"+sGXsfl_257_idx, httpContext.cgiGet( "ZT_"+"Z6046PrdForPar_"+sGXsfl_257_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6046PrdForPar_"+sGXsfl_257_idx) ;
         httpContext.changePostValue( "Z719PrdNum_"+sGXsfl_257_idx, httpContext.cgiGet( "ZT_"+"Z719PrdNum_"+sGXsfl_257_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_257_idx) ;
         httpContext.changePostValue( "Z2144UniEstCod_"+sGXsfl_257_idx, httpContext.cgiGet( "ZT_"+"Z2144UniEstCod_"+sGXsfl_257_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2144UniEstCod_"+sGXsfl_257_idx) ;
      }
      httpContext.changePostValue( "O6045TotParCol", httpContext.cgiGet( "T6045TotParCol")) ;
      httpContext.deletePostValue( "T6045TotParCol") ;
      httpContext.changePostValue( "O6047TotColMol", httpContext.cgiGet( "T6047TotColMol")) ;
      httpContext.deletePostValue( "T6047TotColMol") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"Form\" data-gx-class=\"Form\" novalidate action=\""+formatLink("app.ttrn20", new String[] {}, new String[] {}) +"\">") ;
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
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2141SerEst", GXutil.rtrim( Z2141SerEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1013DibCli", GXutil.rtrim( Z1013DibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1014DibInt", GXutil.ltrim( localUtil.ntoc( Z1014DibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2074ColCom", GXutil.rtrim( Z2074ColCom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2078ColFon", GXutil.rtrim( Z2078ColFon));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2079ColMolCil", GXutil.ltrim( localUtil.ntoc( Z2079ColMolCil, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5336ColCodExt", GXutil.rtrim( Z5336ColCodExt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2076ColEstMba", GXutil.ltrim( localUtil.ntoc( Z2076ColEstMba, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7028ColBmp", GXutil.rtrim( Z7028ColBmp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8419ColNomCol", GXutil.rtrim( Z8419ColNomCol));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10770ColGrm2", GXutil.ltrim( localUtil.ntoc( Z10770ColGrm2, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z499GrpFamCod", GXutil.ltrim( localUtil.ntoc( Z499GrpFamCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z583IntCod", GXutil.ltrim( localUtil.ntoc( Z583IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_150", GXutil.ltrim( localUtil.ntoc( nGXsfl_150_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV33Pgmname));
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
      return formatLink("app.ttrn20", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TTrn20" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento Formulas Estampacion", "") ;
   }

   public void initializeNonKey1LY556( )
   {
      A2075ColEstAnh = (short)(0) ;
      n2075ColEstAnh = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2075ColEstAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2075ColEstAnh), 3, 0));
      A2077ColEstSer = "" ;
      n2077ColEstSer = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2077ColEstSer", A2077ColEstSer);
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A1823DibTipMaq = "" ;
      n1823DibTipMaq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", A1823DibTipMaq);
      A1019DibMolCil = (short)(0) ;
      n1019DibMolCil = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1019DibMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1019DibMolCil), 4, 0));
      A2090DibMolCi2 = (short)(0) ;
      n2090DibMolCi2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2090DibMolCi2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2090DibMolCi2), 4, 0));
      A2079ColMolCil = (short)(0) ;
      n2079ColMolCil = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2079ColMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2079ColMolCil), 4, 0));
      A5336ColCodExt = "" ;
      n5336ColCodExt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5336ColCodExt", A5336ColCodExt);
      A2076ColEstMba = DecimalUtil.ZERO ;
      n2076ColEstMba = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2076ColEstMba", GXutil.ltrimstr( A2076ColEstMba, 9, 2));
      A4861DibCob = DecimalUtil.ZERO ;
      n4861DibCob = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4861DibCob", GXutil.ltrimstr( A4861DibCob, 6, 2));
      A583IntCod = (byte)(0) ;
      n583IntCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A583IntCod), 2, 0));
      A584IntDsc = "" ;
      n584IntDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", A584IntDsc);
      A7028ColBmp = "" ;
      n7028ColBmp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7028ColBmp", A7028ColBmp);
      A7140DibBmp = "" ;
      n7140DibBmp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7140DibBmp", A7140DibBmp);
      A499GrpFamCod = (byte)(0) ;
      n499GrpFamCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A499GrpFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A499GrpFamCod), 2, 0));
      A500GrpFamDsc = "" ;
      n500GrpFamDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A500GrpFamDsc", A500GrpFamDsc);
      A8419ColNomCol = "" ;
      n8419ColNomCol = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A8419ColNomCol", A8419ColNomCol);
      A10770ColGrm2 = DecimalUtil.ZERO ;
      n10770ColGrm2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10770ColGrm2", GXutil.ltrimstr( A10770ColGrm2, 9, 2));
      Z2079ColMolCil = (short)(0) ;
      Z5336ColCodExt = "" ;
      Z2076ColEstMba = DecimalUtil.ZERO ;
      Z7028ColBmp = "" ;
      Z8419ColNomCol = "" ;
      Z10770ColGrm2 = DecimalUtil.ZERO ;
      Z499GrpFamCod = (byte)(0) ;
      Z583IntCod = (byte)(0) ;
   }

   public void initAll1LY556( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A2141SerEst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2141SerEst", A2141SerEst);
      A1013DibCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
      A1014DibInt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
      A2074ColCom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2074ColCom", A2074ColCom);
      A2078ColFon = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2078ColFon", A2078ColFon);
      initializeNonKey1LY556( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1LY557( )
   {
      A11760TaesDc2 = "" ;
      A8055Dg_Valor = (short)(0) ;
      A2099MolCodVir = (byte)(0) ;
      A2101MolDib = "" ;
      A4862MolPrcCob = DecimalUtil.ZERO ;
      A8418MolActivo = "" ;
      A2100MolCon = DecimalUtil.ZERO ;
      n2100MolCon = false ;
      A2536ForPrdUL = (short)(0) ;
      n2536ForPrdUL = false ;
      A2650MolPesMin = DecimalUtil.ZERO ;
      n2650MolPesMin = false ;
      A2648MolForEst = "" ;
      n2648MolForEst = false ;
      A2649MolPesMax = DecimalUtil.ZERO ;
      n2649MolPesMax = false ;
      A4420MolCol = "" ;
      n4420MolCol = false ;
      A6045TotParCol = (byte)(0) ;
      A6047TotColMol = DecimalUtil.ZERO ;
      A8052Dg_codigo = (short)(0) ;
      n8052Dg_codigo = false ;
      A8054Dg_Degr = (short)(0) ;
      n8054Dg_Degr = false ;
      A9608MolPorVar = (short)(0) ;
      n9608MolPorVar = false ;
      A11759TaesId2 = "" ;
      n11759TaesId2 = false ;
      A2655PasForUL = (short)(0) ;
      n2655PasForUL = false ;
      O6045TotParCol = A6045TotParCol ;
      O6047TotColMol = A6047TotColMol ;
      Z2100MolCon = DecimalUtil.ZERO ;
      Z2536ForPrdUL = (short)(0) ;
      Z2650MolPesMin = DecimalUtil.ZERO ;
      Z2648MolForEst = "" ;
      Z2649MolPesMax = DecimalUtil.ZERO ;
      Z4420MolCol = "" ;
      Z9608MolPorVar = (short)(0) ;
      Z11759TaesId2 = "" ;
      Z2655PasForUL = (short)(0) ;
      Z8052Dg_codigo = (short)(0) ;
   }

   public void initAll1LY557( )
   {
      A2098MolCod = (byte)(0) ;
      initializeNonKey1LY557( ) ;
   }

   public void standaloneModalInsert1LY557( )
   {
   }

   public void initializeNonKey1LY558( )
   {
      A719PrdNum = "" ;
      n719PrdNum = false ;
      A718PrdNom = "" ;
      A2144UniEstCod = "" ;
      n2144UniEstCod = false ;
      A2116PrdForCan = DecimalUtil.ZERO ;
      n2116PrdForCan = false ;
      A6046PrdForPar = (short)(0) ;
      n6046PrdForPar = false ;
      O6046PrdForPar = A6046PrdForPar ;
      n6046PrdForPar = false ;
      O2116PrdForCan = A2116PrdForCan ;
      n2116PrdForCan = false ;
      Z2116PrdForCan = DecimalUtil.ZERO ;
      Z6046PrdForPar = (short)(0) ;
      Z719PrdNum = "" ;
      Z2144UniEstCod = "" ;
   }

   public void initAll1LY558( )
   {
      A2535ForPrdLin = (short)(0) ;
      initializeNonKey1LY558( ) ;
   }

   public void standaloneModalInsert1LY558( )
   {
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241510260", true, true);
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
      httpContext.AddJavascriptSource("ttrn20.js", "?20268241510260", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties557( )
   {
      edtMolCod_Enabled = defedtMolCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMolCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMolCod_Enabled), 5, 0), !bGXsfl_150_Refreshing);
   }

   public void init_level_properties558( )
   {
      edtForPrdLin_Enabled = defedtForPrdLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdLin_Enabled), 5, 0), !bGXsfl_257_Refreshing);
   }

   public void startgridcontrol150( )
   {
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("Header", subGrid1_Header);
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Class", "FreeStyleGrid");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Borderwidth", GXutil.ltrim( localUtil.ntoc( subGrid1_Borderwidth, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock27_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2098MolCod, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMolCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock28_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2100MolCon, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMolCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock29_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2101MolDib));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMolDib_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock30_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2099MolCodVir, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMolCodVir_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock31_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2536ForPrdUL, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdUL_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock32_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2650MolPesMin, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMolPesMin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock33_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A2648MolForEst));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMolForEst_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock34_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2649MolPesMax, (byte)(9), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMolPesMax_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock35_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A4420MolCol));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMolCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock36_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4862MolPrcCob, (byte)(5), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMolPrcCob_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock37_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6045TotParCol, (byte)(2), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTotParCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock38_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6047TotColMol, (byte)(10), (byte)(2), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTotColMol_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock39_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8052Dg_codigo, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDg_codigo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock40_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8054Dg_Degr, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDg_Degr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock41_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8055Dg_Valor, (byte)(4), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDg_Valor_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock42_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A8418MolActivo));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMolActivo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock43_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A9608MolPorVar, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMolPorVar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock44_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11759TaesId2));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTaesId2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock45_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A11760TaesDc2));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTaesDc2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", lblTextblock46_Caption);
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2655PasForUL, (byte)(3), (byte)(0), ".", "")));
      Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPasForUL_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid1Container.AddColumnProperties(Grid1Column);
      Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol257( )
   {
      Grid2Container.AddObjectProperty("GridName", "Grid2");
      Grid2Container.AddObjectProperty("Header", subGrid2_Header);
      Grid2Container.AddObjectProperty("Class", "");
      Grid2Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid2_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("CmpContext", "");
      Grid2Container.AddObjectProperty("InMasterPage", "false");
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( nRcdDeleted_558, (byte)(4), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavnRcdDeleted_558_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2535ForPrdLin, (byte)(3), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtForPrdLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.rtrim( A2144UniEstCod));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtUniEstCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2116PrdForCan, (byte)(10), (byte)(3), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdForCan_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Grid2Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6046PrdForPar, (byte)(3), (byte)(0), ".", "")));
      Grid2Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdForPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Grid2Container.AddColumnProperties(Grid2Column);
      Grid2Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid2_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid2_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Grid2Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid2_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = "CLICOD" ;
      lblTextblock3_Internalname = "TEXTBLOCK3" ;
      edtSerEst_Internalname = "SEREST" ;
      lblTextblock4_Internalname = "TEXTBLOCK4" ;
      edtDibCli_Internalname = "DIBCLI" ;
      lblTextblock5_Internalname = "TEXTBLOCK5" ;
      edtDibInt_Internalname = "DIBINT" ;
      lblTextblock6_Internalname = "TEXTBLOCK6" ;
      edtColCom_Internalname = "COLCOM" ;
      lblTextblock7_Internalname = "TEXTBLOCK7" ;
      edtColFon_Internalname = "COLFON" ;
      bttBtn_get_Internalname = "BTN_GET" ;
      lblTextblock8_Internalname = "TEXTBLOCK8" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      lblTextblock9_Internalname = "TEXTBLOCK9" ;
      edtCliNom_Internalname = "CLINOM" ;
      lblTextblock10_Internalname = "TEXTBLOCK10" ;
      lstDibTipMaq.setInternalname( "DIBTIPMAQ" );
      lblTextblock11_Internalname = "TEXTBLOCK11" ;
      edtDibMolCil_Internalname = "DIBMOLCIL" ;
      lblTextblock12_Internalname = "TEXTBLOCK12" ;
      edtDibMolCi2_Internalname = "DIBMOLCI2" ;
      lblTextblock13_Internalname = "TEXTBLOCK13" ;
      edtColMolCil_Internalname = "COLMOLCIL" ;
      lblTextblock14_Internalname = "TEXTBLOCK14" ;
      edtColEstSer_Internalname = "COLESTSER" ;
      lblTextblock15_Internalname = "TEXTBLOCK15" ;
      edtColEstAnh_Internalname = "COLESTANH" ;
      lblTextblock16_Internalname = "TEXTBLOCK16" ;
      edtColCodExt_Internalname = "COLCODEXT" ;
      lblTextblock17_Internalname = "TEXTBLOCK17" ;
      edtColEstMba_Internalname = "COLESTMBA" ;
      lblTextblock18_Internalname = "TEXTBLOCK18" ;
      edtDibCob_Internalname = "DIBCOB" ;
      lblTextblock19_Internalname = "TEXTBLOCK19" ;
      edtIntCod_Internalname = "INTCOD" ;
      lblTextblock20_Internalname = "TEXTBLOCK20" ;
      edtIntDsc_Internalname = "INTDSC" ;
      lblTextblock21_Internalname = "TEXTBLOCK21" ;
      edtColBmp_Internalname = "COLBMP" ;
      lblTextblock22_Internalname = "TEXTBLOCK22" ;
      edtDibBmp_Internalname = "DIBBMP" ;
      lblTextblock23_Internalname = "TEXTBLOCK23" ;
      edtGrpFamCod_Internalname = "GRPFAMCOD" ;
      lblTextblock24_Internalname = "TEXTBLOCK24" ;
      edtGrpFamDsc_Internalname = "GRPFAMDSC" ;
      lblTextblock25_Internalname = "TEXTBLOCK25" ;
      edtColNomCol_Internalname = "COLNOMCOL" ;
      lblTextblock26_Internalname = "TEXTBLOCK26" ;
      edtColGrm2_Internalname = "COLGRM2" ;
      lblTextblock27_Internalname = "TEXTBLOCK27" ;
      edtMolCod_Internalname = "MOLCOD" ;
      lblTextblock28_Internalname = "TEXTBLOCK28" ;
      edtMolCon_Internalname = "MOLCON" ;
      lblTextblock29_Internalname = "TEXTBLOCK29" ;
      edtMolDib_Internalname = "MOLDIB" ;
      lblTextblock30_Internalname = "TEXTBLOCK30" ;
      edtMolCodVir_Internalname = "MOLCODVIR" ;
      lblTextblock31_Internalname = "TEXTBLOCK31" ;
      edtForPrdUL_Internalname = "FORPRDUL" ;
      lblTextblock32_Internalname = "TEXTBLOCK32" ;
      edtMolPesMin_Internalname = "MOLPESMIN" ;
      lblTextblock33_Internalname = "TEXTBLOCK33" ;
      edtMolForEst_Internalname = "MOLFOREST" ;
      lblTextblock34_Internalname = "TEXTBLOCK34" ;
      edtMolPesMax_Internalname = "MOLPESMAX" ;
      lblTextblock35_Internalname = "TEXTBLOCK35" ;
      edtMolCol_Internalname = "MOLCOL" ;
      lblTextblock36_Internalname = "TEXTBLOCK36" ;
      edtMolPrcCob_Internalname = "MOLPRCCOB" ;
      lblTextblock37_Internalname = "TEXTBLOCK37" ;
      edtTotParCol_Internalname = "TOTPARCOL" ;
      lblTextblock38_Internalname = "TEXTBLOCK38" ;
      edtTotColMol_Internalname = "TOTCOLMOL" ;
      lblTextblock39_Internalname = "TEXTBLOCK39" ;
      edtDg_codigo_Internalname = "DG_CODIGO" ;
      lblTextblock40_Internalname = "TEXTBLOCK40" ;
      edtDg_Degr_Internalname = "DG_DEGR" ;
      lblTextblock41_Internalname = "TEXTBLOCK41" ;
      edtDg_Valor_Internalname = "DG_VALOR" ;
      lblTextblock42_Internalname = "TEXTBLOCK42" ;
      edtMolActivo_Internalname = "MOLACTIVO" ;
      lblTextblock43_Internalname = "TEXTBLOCK43" ;
      edtMolPorVar_Internalname = "MOLPORVAR" ;
      lblTextblock44_Internalname = "TEXTBLOCK44" ;
      edtTaesId2_Internalname = "TAESID2" ;
      lblTextblock45_Internalname = "TEXTBLOCK45" ;
      edtTaesDc2_Internalname = "TAESDC2" ;
      lblTextblock46_Internalname = "TEXTBLOCK46" ;
      edtPasForUL_Internalname = "PASFORUL" ;
      edtavnRcdDeleted_558_Internalname = "vNRCDDELETED_558" ;
      edtForPrdLin_Internalname = "FORPRDLIN" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtUniEstCod_Internalname = "UNIESTCOD" ;
      edtPrdForCan_Internalname = "PRDFORCAN" ;
      edtPrdForPar_Internalname = "PRDFORPAR" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_check_Internalname = "BTN_CHECK" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      bttBtn_help_Internalname = "BTN_HELP" ;
      tblTable1_Internalname = "TABLE1" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
      subGrid2_Internalname = "GRID2" ;
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
      subGrid2_Allowcollapsing = (byte)(0) ;
      subGrid2_Allowselection = (byte)(0) ;
      subGrid2_Header = "" ;
      subGrid1_Allowcollapsing = (byte)(0) ;
      lblTextblock46_Caption = httpContext.getMessage( "Ultima Linea Pastas", "") ;
      lblTextblock45_Caption = httpContext.getMessage( "Descripcion Tabla", "") ;
      lblTextblock44_Caption = httpContext.getMessage( "Tabla Ligantes-Espesantes", "") ;
      lblTextblock43_Caption = httpContext.getMessage( "% Varilla", "") ;
      lblTextblock42_Caption = httpContext.getMessage( "Activo?", "") ;
      lblTextblock41_Caption = httpContext.getMessage( "Valor", "") ;
      lblTextblock40_Caption = httpContext.getMessage( "Degradacion(1:)", "") ;
      lblTextblock39_Caption = httpContext.getMessage( "Codigo", "") ;
      lblTextblock38_Caption = httpContext.getMessage( "Total Color por Molde-Formula", "") ;
      lblTextblock37_Caption = httpContext.getMessage( "Partes Color (formula)", "") ;
      lblTextblock36_Caption = httpContext.getMessage( "MolPrcCob", "") ;
      lblTextblock35_Caption = httpContext.getMessage( "Color", "") ;
      lblTextblock34_Caption = httpContext.getMessage( "Pesada Maxima", "") ;
      lblTextblock33_Caption = httpContext.getMessage( "Molde Activo (S/N)", "") ;
      lblTextblock32_Caption = httpContext.getMessage( "Pesada Minima", "") ;
      lblTextblock31_Caption = httpContext.getMessage( "Ultima Linea Producto", "") ;
      lblTextblock30_Caption = httpContext.getMessage( "Codigo Molde / Cilindro Dib.", "") ;
      lblTextblock29_Caption = httpContext.getMessage( "Nombre molde / cilindro", "") ;
      lblTextblock28_Caption = httpContext.getMessage( "Consumo", "") ;
      lblTextblock27_Caption = httpContext.getMessage( "Codigo de Molde", "") ;
      subGrid1_Borderwidth = (short)(1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Mantenimiento Formulas Estampacion", "") );
      edtPrdForPar_Jsonclick = "" ;
      edtPrdForCan_Jsonclick = "" ;
      edtUniEstCod_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtForPrdLin_Jsonclick = "" ;
      edtavnRcdDeleted_558_Jsonclick = "" ;
      subGrid2_Class = "" ;
      subGrid2_Backcolorstyle = (byte)(2) ;
      edtPasForUL_Jsonclick = "" ;
      edtTaesDc2_Jsonclick = "" ;
      edtTaesId2_Jsonclick = "" ;
      edtMolPorVar_Jsonclick = "" ;
      edtMolActivo_Jsonclick = "" ;
      edtDg_Valor_Jsonclick = "" ;
      edtDg_Degr_Jsonclick = "" ;
      edtDg_codigo_Jsonclick = "" ;
      edtTotColMol_Jsonclick = "" ;
      edtTotParCol_Jsonclick = "" ;
      edtMolPrcCob_Jsonclick = "" ;
      edtMolCol_Jsonclick = "" ;
      edtMolPesMax_Jsonclick = "" ;
      edtMolForEst_Jsonclick = "" ;
      edtMolPesMin_Jsonclick = "" ;
      edtForPrdUL_Jsonclick = "" ;
      edtMolCodVir_Jsonclick = "" ;
      edtMolDib_Jsonclick = "" ;
      edtMolCon_Jsonclick = "" ;
      edtMolCod_Jsonclick = "" ;
      subGrid1_Class = "FreeStyleGrid" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtPrdForPar_Enabled = 1 ;
      edtPrdForCan_Enabled = 1 ;
      edtUniEstCod_Enabled = 1 ;
      edtPrdNom_Enabled = 0 ;
      edtPrdNum_Enabled = 1 ;
      edtForPrdLin_Enabled = 1 ;
      edtavnRcdDeleted_558_Enabled = 1 ;
      bttBtn_help_Visible = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_check_Enabled = 1 ;
      bttBtn_check_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtPasForUL_Enabled = 1 ;
      edtTaesDc2_Enabled = 0 ;
      edtTaesId2_Enabled = 1 ;
      edtMolPorVar_Enabled = 1 ;
      edtMolActivo_Enabled = 0 ;
      edtDg_Valor_Enabled = 0 ;
      edtDg_Degr_Enabled = 0 ;
      edtDg_codigo_Enabled = 1 ;
      edtTotColMol_Enabled = 0 ;
      edtTotParCol_Enabled = 0 ;
      edtMolPrcCob_Enabled = 0 ;
      edtMolCol_Enabled = 1 ;
      edtMolPesMax_Enabled = 1 ;
      edtMolForEst_Enabled = 1 ;
      edtMolPesMin_Enabled = 1 ;
      edtForPrdUL_Enabled = 1 ;
      edtMolCodVir_Enabled = 0 ;
      edtMolDib_Enabled = 0 ;
      edtMolCon_Enabled = 1 ;
      edtMolCod_Enabled = 1 ;
      edtColGrm2_Jsonclick = "" ;
      edtColGrm2_Backcolor = (int)(0xFFFFFF) ;
      edtColGrm2_Enabled = 1 ;
      edtColNomCol_Jsonclick = "" ;
      edtColNomCol_Backcolor = (int)(0xFFFFFF) ;
      edtColNomCol_Enabled = 1 ;
      edtGrpFamDsc_Jsonclick = "" ;
      edtGrpFamDsc_Backcolor = (int)(0xFFFFFF) ;
      edtGrpFamDsc_Enabled = 0 ;
      edtGrpFamCod_Jsonclick = "" ;
      edtGrpFamCod_Backcolor = (int)(0xFFFFFF) ;
      edtGrpFamCod_Enabled = 1 ;
      edtDibBmp_Jsonclick = "" ;
      edtDibBmp_Backcolor = (int)(0xFFFFFF) ;
      edtDibBmp_Enabled = 0 ;
      edtColBmp_Jsonclick = "" ;
      edtColBmp_Backcolor = (int)(0xFFFFFF) ;
      edtColBmp_Enabled = 1 ;
      edtIntDsc_Jsonclick = "" ;
      edtIntDsc_Backcolor = (int)(0xFFFFFF) ;
      edtIntDsc_Enabled = 0 ;
      edtIntCod_Jsonclick = "" ;
      edtIntCod_Backcolor = (int)(0xFFFFFF) ;
      edtIntCod_Enabled = 1 ;
      edtDibCob_Jsonclick = "" ;
      edtDibCob_Backcolor = (int)(0xFFFFFF) ;
      edtDibCob_Enabled = 0 ;
      edtColEstMba_Jsonclick = "" ;
      edtColEstMba_Backcolor = (int)(0xFFFFFF) ;
      edtColEstMba_Enabled = 1 ;
      edtColCodExt_Jsonclick = "" ;
      edtColCodExt_Backcolor = (int)(0xFFFFFF) ;
      edtColCodExt_Enabled = 1 ;
      edtColEstAnh_Jsonclick = "" ;
      edtColEstAnh_Backcolor = (int)(0xFFFFFF) ;
      edtColEstAnh_Enabled = 0 ;
      edtColEstSer_Jsonclick = "" ;
      edtColEstSer_Backcolor = (int)(0xFFFFFF) ;
      edtColEstSer_Enabled = 0 ;
      edtColMolCil_Jsonclick = "" ;
      edtColMolCil_Backcolor = (int)(0xFFFFFF) ;
      edtColMolCil_Enabled = 1 ;
      edtDibMolCi2_Jsonclick = "" ;
      edtDibMolCi2_Backcolor = (int)(0xFFFFFF) ;
      edtDibMolCi2_Enabled = 0 ;
      edtDibMolCil_Jsonclick = "" ;
      edtDibMolCil_Backcolor = (int)(0xFFFFFF) ;
      edtDibMolCil_Enabled = 0 ;
      lstDibTipMaq.setJsonclick( "" );
      lstDibTipMaq.setEnabled( 0 );
      lstDibTipMaq.setIBackground( (int)(0xFFFFFF) );
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Backcolor = (int)(0xFFFFFF) ;
      edtCliNom_Enabled = 0 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Backcolor = (int)(0xFFFFFF) ;
      edtEmprNom_Enabled = 0 ;
      bttBtn_get_Enabled = 1 ;
      bttBtn_get_Visible = 1 ;
      edtColFon_Jsonclick = "" ;
      edtColFon_Backcolor = (int)(0xFFFFFF) ;
      edtColFon_Enabled = 1 ;
      edtColCom_Jsonclick = "" ;
      edtColCom_Backcolor = (int)(0xFFFFFF) ;
      edtColCom_Enabled = 1 ;
      edtDibInt_Jsonclick = "" ;
      edtDibInt_Backcolor = (int)(0xFFFFFF) ;
      edtDibInt_Enabled = 1 ;
      edtDibCli_Jsonclick = "" ;
      edtDibCli_Backcolor = (int)(0xFFFFFF) ;
      edtDibCli_Enabled = 1 ;
      edtSerEst_Jsonclick = "" ;
      edtSerEst_Backcolor = (int)(0xFFFFFF) ;
      edtSerEst_Enabled = 1 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Backcolor = (int)(0xFFFFFF) ;
      edtCliCod_Enabled = 1 ;
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

   public void gx2asamolactivo1LY557( String A396EmprCod ,
                                      String A1013DibCli ,
                                      int A252CliCod ,
                                      int A1014DibInt ,
                                      byte A2098MolCod )
   {
      GXt_char1 = A8418MolActivo ;
      GXv_char4[0] = GXt_char1 ;
      new app.pbusclac(remoteHandle, context).execute( A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt, A2098MolCod, GXv_char4) ;
      ttrn20_impl.this.GXt_char1 = GXv_char4[0] ;
      A8418MolActivo = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A8418MolActivo))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx4asataesdc21LY557( String A396EmprCod ,
                                    String A11759TaesId2 )
   {
      GXt_char1 = A11760TaesDc2 ;
      GXv_char4[0] = GXt_char1 ;
      new app.ptaesdc(remoteHandle, context).execute( A396EmprCod, A11759TaesId2, GXv_char4) ;
      ttrn20_impl.this.GXt_char1 = GXv_char4[0] ;
      A11760TaesDc2 = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A11760TaesDc2))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx5asamolcodvir1LY557( byte A2098MolCod ,
                                      String A396EmprCod ,
                                      String A1013DibCli ,
                                      int A252CliCod ,
                                      int A1014DibInt ,
                                      String A1823DibTipMaq )
   {
      if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "P", "")) == 0 )
      {
         A2099MolCodVir = getMolCodVir0( A2098MolCod, A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt) ;
      }
      else
      {
         if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "R", "")) == 0 )
         {
            A2099MolCodVir = getMolCodVir1( A2098MolCod, A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt) ;
         }
         else
         {
            A2099MolCodVir = (byte)(0) ;
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2099MolCodVir, (byte)(2), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx6asamoldib1LY557( byte A2098MolCod ,
                                   String A396EmprCod ,
                                   String A1013DibCli ,
                                   int A252CliCod ,
                                   int A1014DibInt ,
                                   String A1823DibTipMaq )
   {
      if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "P", "")) == 0 )
      {
         A2101MolDib = getMolDib0( A2098MolCod, A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt) ;
      }
      else
      {
         if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "R", "")) == 0 )
         {
            A2101MolDib = getMolDib1( A2098MolCod, A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt) ;
         }
         else
         {
            A2101MolDib = "" ;
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2101MolDib))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx7asamolprccob1LY557( byte A2098MolCod ,
                                      String A396EmprCod ,
                                      String A1013DibCli ,
                                      int A252CliCod ,
                                      int A1014DibInt ,
                                      String A1823DibTipMaq )
   {
      if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "R", "")) == 0 )
      {
         A4862MolPrcCob = getMolPrcCob0( A2098MolCod, A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt) ;
      }
      else
      {
         if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "P", "")) == 0 )
         {
            A4862MolPrcCob = getMolPrcCob1( A2098MolCod, A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt) ;
         }
         else
         {
            A4862MolPrcCob = DecimalUtil.doubleToDec(0) ;
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4862MolPrcCob, (byte)(5), (byte)(2), ".", "")))+"\"") ;
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
      subsflControlProps_150557( ) ;
      while ( nGXsfl_150_idx <= nRC_GXsfl_150 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1LY557( ) ;
         standaloneModal1LY557( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1LY557( ) ;
         Grid1Row.AddGrid("Grid2", Grid2Container);
         nGXsfl_150_idx = (int)(nGXsfl_150_idx+1) ;
         sGXsfl_150_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_150_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_150557( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxnrgrid2_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_257558( ) ;
      while ( nGXsfl_257_idx <= nRC_GXsfl_257 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1LY557( ) ;
         standaloneModal1LY557( ) ;
         standaloneNotModal1LY558( ) ;
         standaloneModal1LY558( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1LY558( ) ;
         nGXsfl_257_idx = (int)(nGXsfl_257_idx+1) ;
         sGXsfl_257_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_257_idx), 4, 0), (short)(4), "0") + sGXsfl_150_idx ;
         subsflControlProps_257558( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid2Container)) ;
      /* End function gxnrGrid2_newrow */
   }

   public void init_web_controls( )
   {
      lstDibTipMaq.setName( "DIBTIPMAQ" );
      lstDibTipMaq.setWebtags( "" );
      lstDibTipMaq.addItem("R", httpContext.getMessage( "Rotativa", ""), (short)(0));
      lstDibTipMaq.addItem("P", httpContext.getMessage( "Plana", ""), (short)(0));
      lstDibTipMaq.addItem("D", httpContext.getMessage( "Digital", ""), (short)(0));
      if ( lstDibTipMaq.getItemCount() > 0 )
      {
         A1823DibTipMaq = lstDibTipMaq.getValidValue(A1823DibTipMaq) ;
         n1823DibTipMaq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", A1823DibTipMaq);
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01LY63 */
      pr_default.execute(57, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(57) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01LY63_A407EmprNom[0] ;
      n407EmprNom = T01LY63_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(57);
      /* Using cursor T01LY31 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01LY31_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(28);
      /* Using cursor T01LY32 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst});
      if ( (pr_default.getStatus(29) != 101) )
      {
         A2075ColEstAnh = T01LY32_A2075ColEstAnh[0] ;
         n2075ColEstAnh = T01LY32_n2075ColEstAnh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2075ColEstAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2075ColEstAnh), 3, 0));
         A2077ColEstSer = T01LY32_A2077ColEstSer[0] ;
         n2077ColEstSer = T01LY32_n2077ColEstSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2077ColEstSer", A2077ColEstSer);
      }
      else
      {
         A2077ColEstSer = "" ;
         n2077ColEstSer = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2077ColEstSer", A2077ColEstSer);
         A2075ColEstAnh = (short)(0) ;
         n2075ColEstAnh = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2075ColEstAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2075ColEstAnh), 3, 0));
      }
      pr_default.close(29);
      /* Using cursor T01LY33 */
      pr_default.execute(30, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDIBUJ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DIBINT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDibCli_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1823DibTipMaq = T01LY33_A1823DibTipMaq[0] ;
      n1823DibTipMaq = T01LY33_n1823DibTipMaq[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", A1823DibTipMaq);
      A1019DibMolCil = T01LY33_A1019DibMolCil[0] ;
      n1019DibMolCil = T01LY33_n1019DibMolCil[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1019DibMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1019DibMolCil), 4, 0));
      A2090DibMolCi2 = T01LY33_A2090DibMolCi2[0] ;
      n2090DibMolCi2 = T01LY33_n2090DibMolCi2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2090DibMolCi2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2090DibMolCi2), 4, 0));
      A4861DibCob = T01LY33_A4861DibCob[0] ;
      n4861DibCob = T01LY33_n4861DibCob[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4861DibCob", GXutil.ltrimstr( A4861DibCob, 6, 2));
      A7140DibBmp = T01LY33_A7140DibBmp[0] ;
      n7140DibBmp = T01LY33_n7140DibBmp[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A7140DibBmp", A7140DibBmp);
      pr_default.close(30);
      GX_FocusControl = edtColMolCil_Internalname ;
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

   public void valid_Clicod( )
   {
      /* Using cursor T01LY31 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01LY31_A279CliNom[0] ;
      pr_default.close(28);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
   }

   public void valid_Serest( )
   {
      n2075ColEstAnh = false ;
      n2077ColEstSer = false ;
      /* Using cursor T01LY32 */
      pr_default.execute(29, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst});
      if ( (pr_default.getStatus(29) != 101) )
      {
         A2075ColEstAnh = T01LY32_A2075ColEstAnh[0] ;
         n2075ColEstAnh = T01LY32_n2075ColEstAnh[0] ;
         A2077ColEstSer = T01LY32_A2077ColEstSer[0] ;
         n2077ColEstSer = T01LY32_n2077ColEstSer[0] ;
      }
      else
      {
         A2077ColEstSer = "" ;
         n2077ColEstSer = false ;
         A2075ColEstAnh = (short)(0) ;
         n2075ColEstAnh = false ;
      }
      pr_default.close(29);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2075ColEstAnh", GXutil.ltrim( localUtil.ntoc( A2075ColEstAnh, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2077ColEstSer", GXutil.rtrim( A2077ColEstSer));
   }

   public void valid_Dibint( )
   {
      n1823DibTipMaq = false ;
      A1823DibTipMaq = lstDibTipMaq.getValue() ;
      n1823DibTipMaq = false ;
      lstDibTipMaq.setValue( A1823DibTipMaq );
      n1019DibMolCil = false ;
      n2090DibMolCi2 = false ;
      n4861DibCob = false ;
      n7140DibBmp = false ;
      /* Using cursor T01LY33 */
      pr_default.execute(30, new Object[] {A396EmprCod, A1013DibCli, Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDIBUJ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DIBINT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDibCli_Internalname ;
      }
      A1823DibTipMaq = T01LY33_A1823DibTipMaq[0] ;
      n1823DibTipMaq = T01LY33_n1823DibTipMaq[0] ;
      lstDibTipMaq.setValue( A1823DibTipMaq );
      A1019DibMolCil = T01LY33_A1019DibMolCil[0] ;
      n1019DibMolCil = T01LY33_n1019DibMolCil[0] ;
      A2090DibMolCi2 = T01LY33_A2090DibMolCi2[0] ;
      n2090DibMolCi2 = T01LY33_n2090DibMolCi2[0] ;
      A4861DibCob = T01LY33_A4861DibCob[0] ;
      n4861DibCob = T01LY33_n4861DibCob[0] ;
      A7140DibBmp = T01LY33_A7140DibBmp[0] ;
      n7140DibBmp = T01LY33_n7140DibBmp[0] ;
      pr_default.close(30);
      dynload_actions( ) ;
      if ( lstDibTipMaq.getItemCount() > 0 )
      {
         A1823DibTipMaq = lstDibTipMaq.getValidValue(A1823DibTipMaq) ;
         n1823DibTipMaq = false ;
         lstDibTipMaq.setValue( A1823DibTipMaq );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         lstDibTipMaq.setValue( GXutil.rtrim( A1823DibTipMaq) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", GXutil.rtrim( A1823DibTipMaq));
      lstDibTipMaq.setValue( GXutil.rtrim( A1823DibTipMaq) );
      httpContext.ajax_rsp_assign_prop("", false, lstDibTipMaq.getInternalname(), "Values", lstDibTipMaq.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A1019DibMolCil", GXutil.ltrim( localUtil.ntoc( A1019DibMolCil, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2090DibMolCi2", GXutil.ltrim( localUtil.ntoc( A2090DibMolCi2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4861DibCob", GXutil.ltrim( localUtil.ntoc( A4861DibCob, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7140DibBmp", GXutil.rtrim( A7140DibBmp));
   }

   public void valid_Colfon( )
   {
      n1823DibTipMaq = false ;
      A1823DibTipMaq = lstDibTipMaq.getValue() ;
      n1823DibTipMaq = false ;
      lstDibTipMaq.setValue( A1823DibTipMaq );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      if ( lstDibTipMaq.getItemCount() > 0 )
      {
         A1823DibTipMaq = lstDibTipMaq.getValidValue(A1823DibTipMaq) ;
         n1823DibTipMaq = false ;
         lstDibTipMaq.setValue( A1823DibTipMaq );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         lstDibTipMaq.setValue( GXutil.rtrim( A1823DibTipMaq) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A2079ColMolCil", GXutil.ltrim( localUtil.ntoc( A2079ColMolCil, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5336ColCodExt", GXutil.rtrim( A5336ColCodExt));
      httpContext.ajax_rsp_assign_attri("", false, "A2076ColEstMba", GXutil.ltrim( localUtil.ntoc( A2076ColEstMba, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A583IntCod", GXutil.ltrim( localUtil.ntoc( A583IntCod, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7028ColBmp", GXutil.rtrim( A7028ColBmp));
      httpContext.ajax_rsp_assign_attri("", false, "A499GrpFamCod", GXutil.ltrim( localUtil.ntoc( A499GrpFamCod, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8419ColNomCol", GXutil.rtrim( A8419ColNomCol));
      httpContext.ajax_rsp_assign_attri("", false, "A10770ColGrm2", GXutil.ltrim( localUtil.ntoc( A10770ColGrm2, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A500GrpFamDsc", GXutil.rtrim( A500GrpFamDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", GXutil.rtrim( A584IntDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A2075ColEstAnh", GXutil.ltrim( localUtil.ntoc( A2075ColEstAnh, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2077ColEstSer", GXutil.rtrim( A2077ColEstSer));
      httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", GXutil.rtrim( A1823DibTipMaq));
      lstDibTipMaq.setValue( GXutil.rtrim( A1823DibTipMaq) );
      httpContext.ajax_rsp_assign_prop("", false, lstDibTipMaq.getInternalname(), "Values", lstDibTipMaq.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A1019DibMolCil", GXutil.ltrim( localUtil.ntoc( A1019DibMolCil, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2090DibMolCi2", GXutil.ltrim( localUtil.ntoc( A2090DibMolCi2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4861DibCob", GXutil.ltrim( localUtil.ntoc( A4861DibCob, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7140DibBmp", GXutil.rtrim( A7140DibBmp));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2141SerEst", GXutil.rtrim( Z2141SerEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1013DibCli", GXutil.rtrim( Z1013DibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1014DibInt", GXutil.ltrim( localUtil.ntoc( Z1014DibInt, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2074ColCom", GXutil.rtrim( Z2074ColCom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2078ColFon", GXutil.rtrim( Z2078ColFon));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2079ColMolCil", GXutil.ltrim( localUtil.ntoc( Z2079ColMolCil, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5336ColCodExt", GXutil.rtrim( Z5336ColCodExt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2076ColEstMba", GXutil.ltrim( localUtil.ntoc( Z2076ColEstMba, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z583IntCod", GXutil.ltrim( localUtil.ntoc( Z583IntCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7028ColBmp", GXutil.rtrim( Z7028ColBmp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z499GrpFamCod", GXutil.ltrim( localUtil.ntoc( Z499GrpFamCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8419ColNomCol", GXutil.rtrim( Z8419ColNomCol));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10770ColGrm2", GXutil.ltrim( localUtil.ntoc( Z10770ColGrm2, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z500GrpFamDsc", GXutil.rtrim( Z500GrpFamDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z584IntDsc", GXutil.rtrim( Z584IntDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2075ColEstAnh", GXutil.ltrim( localUtil.ntoc( Z2075ColEstAnh, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2077ColEstSer", GXutil.rtrim( Z2077ColEstSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1823DibTipMaq", GXutil.rtrim( Z1823DibTipMaq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1019DibMolCil", GXutil.ltrim( localUtil.ntoc( Z1019DibMolCil, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2090DibMolCi2", GXutil.ltrim( localUtil.ntoc( Z2090DibMolCi2, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4861DibCob", GXutil.ltrim( localUtil.ntoc( Z4861DibCob, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7140DibBmp", GXutil.rtrim( Z7140DibBmp));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_get_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_get_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_check_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_check_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Intcod( )
   {
      n583IntCod = false ;
      n584IntDsc = false ;
      /* Using cursor T01LY34 */
      pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n583IntCod), Byte.valueOf(A583IntCod)});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "INTENS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "INTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtIntCod_Internalname ;
      }
      A584IntDsc = T01LY34_A584IntDsc[0] ;
      n584IntDsc = T01LY34_n584IntDsc[0] ;
      pr_default.close(31);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A584IntDsc", GXutil.rtrim( A584IntDsc));
   }

   public void valid_Grpfamcod( )
   {
      n499GrpFamCod = false ;
      n500GrpFamDsc = false ;
      /* Using cursor T01LY35 */
      pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n499GrpFamCod), Byte.valueOf(A499GrpFamCod)});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GRUFAM", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRPFAMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGrpFamCod_Internalname ;
      }
      A500GrpFamDsc = T01LY35_A500GrpFamDsc[0] ;
      n500GrpFamDsc = T01LY35_n500GrpFamDsc[0] ;
      pr_default.close(32);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A500GrpFamDsc", GXutil.rtrim( A500GrpFamDsc));
   }

   public void valid_Molcod( )
   {
      /* Using cursor T01LY50 */
      pr_default.execute(44, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A2141SerEst, A1013DibCli, Integer.valueOf(A1014DibInt), A2074ColCom, A2078ColFon, Byte.valueOf(A2098MolCod)});
      if ( (pr_default.getStatus(44) != 101) )
      {
         A6045TotParCol = T01LY50_A6045TotParCol[0] ;
         A6047TotColMol = T01LY50_A6047TotColMol[0] ;
      }
      else
      {
         A6045TotParCol = (byte)(0) ;
         A6047TotColMol = DecimalUtil.doubleToDec(0) ;
      }
      pr_default.close(44);
      GXt_char1 = A8418MolActivo ;
      GXv_char4[0] = GXt_char1 ;
      new app.pbusclac(remoteHandle, context).execute( A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt, A2098MolCod, GXv_char4) ;
      ttrn20_impl.this.GXt_char1 = GXv_char4[0] ;
      A8418MolActivo = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6045TotParCol", GXutil.ltrim( localUtil.ntoc( A6045TotParCol, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6047TotColMol", GXutil.ltrim( localUtil.ntoc( A6047TotColMol, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8418MolActivo", GXutil.rtrim( A8418MolActivo));
   }

   public void valid_Dg_codigo( )
   {
      n8052Dg_codigo = false ;
      n8054Dg_Degr = false ;
      /* Using cursor T01LY51 */
      pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n8052Dg_codigo), Short.valueOf(A8052Dg_codigo)});
      if ( (pr_default.getStatus(45) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DEGRA", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DG_CODIGO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDg_codigo_Internalname ;
      }
      A8054Dg_Degr = T01LY51_A8054Dg_Degr[0] ;
      n8054Dg_Degr = T01LY51_n8054Dg_Degr[0] ;
      pr_default.close(45);
      if ( A8054Dg_Degr == 0 )
      {
         A8055Dg_Valor = (short)(1) ;
      }
      else
      {
         if ( ( A8054Dg_Degr >= 1 ) && ( A8054Dg_Degr <= 9 ) )
         {
            A8055Dg_Valor = (short)(A8054Dg_Degr+1) ;
         }
         else
         {
            if ( A8054Dg_Degr > 9 )
            {
               A8055Dg_Valor = A8054Dg_Degr ;
            }
            else
            {
               A8055Dg_Valor = (short)(0) ;
            }
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A8054Dg_Degr", GXutil.ltrim( localUtil.ntoc( A8054Dg_Degr, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8055Dg_Valor", GXutil.ltrim( localUtil.ntoc( A8055Dg_Valor, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Taesid2( )
   {
      n11759TaesId2 = false ;
      GXt_char1 = A11760TaesDc2 ;
      GXv_char4[0] = GXt_char1 ;
      new app.ptaesdc(remoteHandle, context).execute( A396EmprCod, A11759TaesId2, GXv_char4) ;
      ttrn20_impl.this.GXt_char1 = GXv_char4[0] ;
      A11760TaesDc2 = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A11760TaesDc2", GXutil.rtrim( A11760TaesDc2));
   }

   public void valid_Prdnum( )
   {
      n719PrdNum = false ;
      /* Using cursor T01LY61 */
      pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(55) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A718PrdNom = T01LY61_A718PrdNom[0] ;
      pr_default.close(55);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
   }

   public void valid_Uniestcod( )
   {
      n2144UniEstCod = false ;
      /* Using cursor T01LY64 */
      pr_default.execute(58, new Object[] {Boolean.valueOf(n2144UniEstCod), A2144UniEstCod});
      if ( (pr_default.getStatus(58) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNIEST", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "UNIESTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtUniEstCod_Internalname ;
      }
      pr_default.close(58);
      dynload_actions( ) ;
      /*  Sending validation outputs */
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
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''}]}");
      setEventMetadata("VALID_SEREST","{handler:'valid_Serest',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A2141SerEst',fld:'SEREST',pic:''},{av:'A2075ColEstAnh',fld:'COLESTANH',pic:'ZZ9'},{av:'A2077ColEstSer',fld:'COLESTSER',pic:''}]");
      setEventMetadata("VALID_SEREST",",oparms:[{av:'A2075ColEstAnh',fld:'COLESTANH',pic:'ZZ9'},{av:'A2077ColEstSer',fld:'COLESTSER',pic:''}]}");
      setEventMetadata("VALID_DIBCLI","{handler:'valid_Dibcli',iparms:[]");
      setEventMetadata("VALID_DIBCLI",",oparms:[]}");
      setEventMetadata("VALID_DIBINT","{handler:'valid_Dibint',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1013DibCli',fld:'DIBCLI',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1014DibInt',fld:'DIBINT',pic:'ZZZZZZZ9'},{av:'lstDibTipMaq'},{av:'A1823DibTipMaq',fld:'DIBTIPMAQ',pic:''},{av:'A1019DibMolCil',fld:'DIBMOLCIL',pic:'ZZZ9'},{av:'A2090DibMolCi2',fld:'DIBMOLCI2',pic:'ZZZ9'},{av:'A4861DibCob',fld:'DIBCOB',pic:'ZZ9.99'},{av:'A7140DibBmp',fld:'DIBBMP',pic:''}]");
      setEventMetadata("VALID_DIBINT",",oparms:[{av:'lstDibTipMaq'},{av:'A1823DibTipMaq',fld:'DIBTIPMAQ',pic:''},{av:'A1019DibMolCil',fld:'DIBMOLCIL',pic:'ZZZ9'},{av:'A2090DibMolCi2',fld:'DIBMOLCI2',pic:'ZZZ9'},{av:'A4861DibCob',fld:'DIBCOB',pic:'ZZ9.99'},{av:'A7140DibBmp',fld:'DIBBMP',pic:''}]}");
      setEventMetadata("VALID_COLCOM","{handler:'valid_Colcom',iparms:[]");
      setEventMetadata("VALID_COLCOM",",oparms:[]}");
      setEventMetadata("VALID_COLFON","{handler:'valid_Colfon',iparms:[{av:'lstDibTipMaq'},{av:'A1823DibTipMaq',fld:'DIBTIPMAQ',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A2141SerEst',fld:'SEREST',pic:''},{av:'A1013DibCli',fld:'DIBCLI',pic:''},{av:'A1014DibInt',fld:'DIBINT',pic:'ZZZZZZZ9'},{av:'A2074ColCom',fld:'COLCOM',pic:''},{av:'A2078ColFon',fld:'COLFON',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_COLFON",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A2079ColMolCil',fld:'COLMOLCIL',pic:'ZZZ9'},{av:'A5336ColCodExt',fld:'COLCODEXT',pic:''},{av:'A2076ColEstMba',fld:'COLESTMBA',pic:'ZZZZZ9.99'},{av:'A583IntCod',fld:'INTCOD',pic:'Z9'},{av:'A7028ColBmp',fld:'COLBMP',pic:''},{av:'A499GrpFamCod',fld:'GRPFAMCOD',pic:'Z9'},{av:'A8419ColNomCol',fld:'COLNOMCOL',pic:''},{av:'A10770ColGrm2',fld:'COLGRM2',pic:'ZZZZZ9.99'},{av:'A500GrpFamDsc',fld:'GRPFAMDSC',pic:''},{av:'A584IntDsc',fld:'INTDSC',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A2075ColEstAnh',fld:'COLESTANH',pic:'ZZ9'},{av:'A2077ColEstSer',fld:'COLESTSER',pic:''},{av:'lstDibTipMaq'},{av:'A1823DibTipMaq',fld:'DIBTIPMAQ',pic:''},{av:'A1019DibMolCil',fld:'DIBMOLCIL',pic:'ZZZ9'},{av:'A2090DibMolCi2',fld:'DIBMOLCI2',pic:'ZZZ9'},{av:'A4861DibCob',fld:'DIBCOB',pic:'ZZ9.99'},{av:'A7140DibBmp',fld:'DIBBMP',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z252CliCod'},{av:'Z2141SerEst'},{av:'Z1013DibCli'},{av:'Z1014DibInt'},{av:'Z2074ColCom'},{av:'Z2078ColFon'},{av:'Z407EmprNom'},{av:'Z2079ColMolCil'},{av:'Z5336ColCodExt'},{av:'Z2076ColEstMba'},{av:'Z583IntCod'},{av:'Z7028ColBmp'},{av:'Z499GrpFamCod'},{av:'Z8419ColNomCol'},{av:'Z10770ColGrm2'},{av:'Z500GrpFamDsc'},{av:'Z584IntDsc'},{av:'Z279CliNom'},{av:'Z2075ColEstAnh'},{av:'Z2077ColEstSer'},{av:'Z1823DibTipMaq'},{av:'Z1019DibMolCil'},{av:'Z2090DibMolCi2'},{av:'Z4861DibCob'},{av:'Z7140DibBmp'},{ctrl:'BTN_GET',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{ctrl:'BTN_CHECK',prop:'Enabled'}]}");
      setEventMetadata("VALID_DIBTIPMAQ","{handler:'valid_Dibtipmaq',iparms:[]");
      setEventMetadata("VALID_DIBTIPMAQ",",oparms:[]}");
      setEventMetadata("VALID_INTCOD","{handler:'valid_Intcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A583IntCod',fld:'INTCOD',pic:'Z9'},{av:'A584IntDsc',fld:'INTDSC',pic:''}]");
      setEventMetadata("VALID_INTCOD",",oparms:[{av:'A584IntDsc',fld:'INTDSC',pic:''}]}");
      setEventMetadata("VALID_GRPFAMCOD","{handler:'valid_Grpfamcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A499GrpFamCod',fld:'GRPFAMCOD',pic:'Z9'},{av:'A500GrpFamDsc',fld:'GRPFAMDSC',pic:''}]");
      setEventMetadata("VALID_GRPFAMCOD",",oparms:[{av:'A500GrpFamDsc',fld:'GRPFAMDSC',pic:''}]}");
      setEventMetadata("VALID_MOLCOD","{handler:'valid_Molcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A2141SerEst',fld:'SEREST',pic:''},{av:'A1013DibCli',fld:'DIBCLI',pic:''},{av:'A1014DibInt',fld:'DIBINT',pic:'ZZZZZZZ9'},{av:'A2074ColCom',fld:'COLCOM',pic:''},{av:'A2078ColFon',fld:'COLFON',pic:''},{av:'A2098MolCod',fld:'MOLCOD',pic:'Z9'},{av:'A6045TotParCol',fld:'TOTPARCOL',pic:'Z9'},{av:'A6047TotColMol',fld:'TOTCOLMOL',pic:'ZZZZZZ9.99'},{av:'A8418MolActivo',fld:'MOLACTIVO',pic:''}]");
      setEventMetadata("VALID_MOLCOD",",oparms:[{av:'A6045TotParCol',fld:'TOTPARCOL',pic:'Z9'},{av:'A6047TotColMol',fld:'TOTCOLMOL',pic:'ZZZZZZ9.99'},{av:'A8418MolActivo',fld:'MOLACTIVO',pic:''}]}");
      setEventMetadata("VALID_MOLFOREST","{handler:'valid_Molforest',iparms:[]");
      setEventMetadata("VALID_MOLFOREST",",oparms:[]}");
      setEventMetadata("VALID_DG_CODIGO","{handler:'valid_Dg_codigo',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A8052Dg_codigo',fld:'DG_CODIGO',pic:'ZZZ9'},{av:'A8054Dg_Degr',fld:'DG_DEGR',pic:'ZZZ9'},{av:'A8055Dg_Valor',fld:'DG_VALOR',pic:'ZZZ9'}]");
      setEventMetadata("VALID_DG_CODIGO",",oparms:[{av:'A8054Dg_Degr',fld:'DG_DEGR',pic:'ZZZ9'},{av:'A8055Dg_Valor',fld:'DG_VALOR',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_DG_DEGR","{handler:'valid_Dg_degr',iparms:[]");
      setEventMetadata("VALID_DG_DEGR",",oparms:[]}");
      setEventMetadata("VALID_TAESID2","{handler:'valid_Taesid2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11759TaesId2',fld:'TAESID2',pic:''},{av:'A11760TaesDc2',fld:'TAESDC2',pic:''}]");
      setEventMetadata("VALID_TAESID2",",oparms:[{av:'A11760TaesDc2',fld:'TAESDC2',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Pasforul',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("VALID_FORPRDLIN","{handler:'valid_Forprdlin',iparms:[]");
      setEventMetadata("VALID_FORPRDLIN",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''}]}");
      setEventMetadata("VALID_UNIESTCOD","{handler:'valid_Uniestcod',iparms:[{av:'A2144UniEstCod',fld:'UNIESTCOD',pic:'@!'}]");
      setEventMetadata("VALID_UNIESTCOD",",oparms:[]}");
      setEventMetadata("VALID_PRDFORCAN","{handler:'valid_Prdforcan',iparms:[]");
      setEventMetadata("VALID_PRDFORCAN",",oparms:[]}");
      setEventMetadata("VALID_PRDFORPAR","{handler:'valid_Prdforpar',iparms:[]");
      setEventMetadata("VALID_PRDFORPAR",",oparms:[]}");
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
      pr_default.close(55);
      pr_default.close(58);
      pr_default.close(45);
      pr_default.close(44);
      pr_default.close(28);
      pr_default.close(57);
      pr_default.close(32);
      pr_default.close(31);
      pr_default.close(30);
      pr_default.close(29);
   }

   /* Aggregate/select formulas */
   public java.math.BigDecimal getMolPrcCob1( byte E2098MolCod ,
                                              String E396EmprCod ,
                                              String E1013DibCli ,
                                              int E252CliCod ,
                                              int E1014DibInt )
   {
      X5381DibPrcCobM = DecimalUtil.ZERO ;
      Gx_first = true ;
      /* Using cursor T01LY65 */
      pr_default.execute(59, new Object[] {E396EmprCod, E1013DibCli, Integer.valueOf(E252CliCod), Integer.valueOf(E1014DibInt)});
      while ( (pr_default.getStatus(59) != 101) )
      {
         if ( ( ( T01LY65_A2088DibDibMol[0] == E2098MolCod ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( GXutil.strcmp(E1013DibCli, E1013DibCli) == 0 ) && ( E252CliCod == E252CliCod ) && ( E1014DibInt == E1014DibInt ) ) )
         {
            X5381DibPrcCobM = T01LY65_A5381DibPrcCobM[0] ;
            nX5381DibPrcCobM = false ;
            if (true) break;
         }
         pr_default.readNext(59);
      }
      pr_default.close(59);
      return X5381DibPrcCobM ;
   }

   public java.math.BigDecimal getMolPrcCob0( byte E2098MolCod ,
                                              String E396EmprCod ,
                                              String E1013DibCli ,
                                              int E252CliCod ,
                                              int E1014DibInt )
   {
      X4860DibPrcCob = DecimalUtil.ZERO ;
      Gx_first = true ;
      /* Using cursor T01LY66 */
      pr_default.execute(60, new Object[] {E396EmprCod, E1013DibCli, Integer.valueOf(E252CliCod), Integer.valueOf(E1014DibInt)});
      while ( (pr_default.getStatus(60) != 101) )
      {
         if ( ( ( T01LY66_A2089DibLinMol[0] == E2098MolCod ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( GXutil.strcmp(E1013DibCli, E1013DibCli) == 0 ) && ( E252CliCod == E252CliCod ) && ( E1014DibInt == E1014DibInt ) ) )
         {
            X4860DibPrcCob = T01LY66_A4860DibPrcCob[0] ;
            nX4860DibPrcCob = false ;
            if (true) break;
         }
         pr_default.readNext(60);
      }
      pr_default.close(60);
      return X4860DibPrcCob ;
   }

   public String getMolDib1( byte E2098MolCod ,
                             String E396EmprCod ,
                             String E1013DibCli ,
                             int E252CliCod ,
                             int E1014DibInt )
   {
      X1030DibRelMC = "" ;
      Gx_first = true ;
      /* Using cursor T01LY67 */
      pr_default.execute(61, new Object[] {E396EmprCod, E1013DibCli, Integer.valueOf(E252CliCod), Integer.valueOf(E1014DibInt)});
      while ( (pr_default.getStatus(61) != 101) )
      {
         if ( ( ( T01LY67_A2089DibLinMol[0] == E2098MolCod ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( GXutil.strcmp(E1013DibCli, E1013DibCli) == 0 ) && ( E252CliCod == E252CliCod ) && ( E1014DibInt == E1014DibInt ) ) )
         {
            X1030DibRelMC = T01LY67_A1030DibRelMC[0] ;
            nX1030DibRelMC = false ;
            if (true) break;
         }
         pr_default.readNext(61);
      }
      pr_default.close(61);
      return X1030DibRelMC ;
   }

   public String getMolDib0( byte E2098MolCod ,
                             String E396EmprCod ,
                             String E1013DibCli ,
                             int E252CliCod ,
                             int E1014DibInt )
   {
      X2092DibRelMC2 = "" ;
      Gx_first = true ;
      /* Using cursor T01LY68 */
      pr_default.execute(62, new Object[] {E396EmprCod, E1013DibCli, Integer.valueOf(E252CliCod), Integer.valueOf(E1014DibInt)});
      while ( (pr_default.getStatus(62) != 101) )
      {
         if ( ( ( T01LY68_A2088DibDibMol[0] == E2098MolCod ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( GXutil.strcmp(E1013DibCli, E1013DibCli) == 0 ) && ( E252CliCod == E252CliCod ) && ( E1014DibInt == E1014DibInt ) ) )
         {
            X2092DibRelMC2 = T01LY68_A2092DibRelMC2[0] ;
            nX2092DibRelMC2 = false ;
            if (true) break;
         }
         pr_default.readNext(62);
      }
      pr_default.close(62);
      return X2092DibRelMC2 ;
   }

   public byte getMolCodVir1( byte E2098MolCod ,
                              String E396EmprCod ,
                              String E1013DibCli ,
                              int E252CliCod ,
                              int E1014DibInt )
   {
      X2089DibLinMol = (byte)(0) ;
      Gx_first = true ;
      /* Using cursor T01LY69 */
      pr_default.execute(63, new Object[] {E396EmprCod, E1013DibCli, Integer.valueOf(E252CliCod), Integer.valueOf(E1014DibInt)});
      while ( (pr_default.getStatus(63) != 101) )
      {
         if ( ( ( T01LY69_A2089DibLinMol[0] == E2098MolCod ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( GXutil.strcmp(E1013DibCli, E1013DibCli) == 0 ) && ( E252CliCod == E252CliCod ) && ( E1014DibInt == E1014DibInt ) ) )
         {
            X2089DibLinMol = T01LY69_A2089DibLinMol[0] ;
            nX2089DibLinMol = false ;
            if (true) break;
         }
         pr_default.readNext(63);
      }
      pr_default.close(63);
      return X2089DibLinMol ;
   }

   public byte getMolCodVir0( byte E2098MolCod ,
                              String E396EmprCod ,
                              String E1013DibCli ,
                              int E252CliCod ,
                              int E1014DibInt )
   {
      X2088DibDibMol = (byte)(0) ;
      Gx_first = true ;
      /* Using cursor T01LY70 */
      pr_default.execute(64, new Object[] {E396EmprCod, E1013DibCli, Integer.valueOf(E252CliCod), Integer.valueOf(E1014DibInt)});
      while ( (pr_default.getStatus(64) != 101) )
      {
         if ( ( ( T01LY70_A2088DibDibMol[0] == E2098MolCod ) ) && ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( GXutil.strcmp(E1013DibCli, E1013DibCli) == 0 ) && ( E252CliCod == E252CliCod ) && ( E1014DibInt == E1014DibInt ) ) )
         {
            X2088DibDibMol = T01LY70_A2088DibDibMol[0] ;
            nX2088DibDibMol = false ;
            if (true) break;
         }
         pr_default.readNext(64);
      }
      pr_default.close(64);
      return X2088DibDibMol ;
   }

   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z2141SerEst = "" ;
      Z1013DibCli = "" ;
      Z2074ColCom = "" ;
      Z2078ColFon = "" ;
      Z5336ColCodExt = "" ;
      Z2076ColEstMba = DecimalUtil.ZERO ;
      Z7028ColBmp = "" ;
      Z8419ColNomCol = "" ;
      Z10770ColGrm2 = DecimalUtil.ZERO ;
      Z2100MolCon = DecimalUtil.ZERO ;
      Z2650MolPesMin = DecimalUtil.ZERO ;
      Z2648MolForEst = "" ;
      Z2649MolPesMax = DecimalUtil.ZERO ;
      Z4420MolCol = "" ;
      Z11759TaesId2 = "" ;
      O6047TotColMol = DecimalUtil.ZERO ;
      Z2116PrdForCan = DecimalUtil.ZERO ;
      Z719PrdNum = "" ;
      Z2144UniEstCod = "" ;
      O2116PrdForCan = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A1013DibCli = "" ;
      A11759TaesId2 = "" ;
      A1823DibTipMaq = "" ;
      A2141SerEst = "" ;
      A2074ColCom = "" ;
      A2078ColFon = "" ;
      A719PrdNum = "" ;
      A2144UniEstCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      Gx_mode = "" ;
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
      lblTextblock6_Jsonclick = "" ;
      lblTextblock7_Jsonclick = "" ;
      bttBtn_get_Jsonclick = "" ;
      lblTextblock8_Jsonclick = "" ;
      A407EmprNom = "" ;
      lblTextblock9_Jsonclick = "" ;
      A279CliNom = "" ;
      lblTextblock10_Jsonclick = "" ;
      lblTextblock11_Jsonclick = "" ;
      lblTextblock12_Jsonclick = "" ;
      lblTextblock13_Jsonclick = "" ;
      lblTextblock14_Jsonclick = "" ;
      A2077ColEstSer = "" ;
      lblTextblock15_Jsonclick = "" ;
      lblTextblock16_Jsonclick = "" ;
      A5336ColCodExt = "" ;
      lblTextblock17_Jsonclick = "" ;
      A2076ColEstMba = DecimalUtil.ZERO ;
      lblTextblock18_Jsonclick = "" ;
      A4861DibCob = DecimalUtil.ZERO ;
      lblTextblock19_Jsonclick = "" ;
      lblTextblock20_Jsonclick = "" ;
      A584IntDsc = "" ;
      lblTextblock21_Jsonclick = "" ;
      A7028ColBmp = "" ;
      lblTextblock22_Jsonclick = "" ;
      A7140DibBmp = "" ;
      lblTextblock23_Jsonclick = "" ;
      lblTextblock24_Jsonclick = "" ;
      A500GrpFamDsc = "" ;
      lblTextblock25_Jsonclick = "" ;
      A8419ColNomCol = "" ;
      lblTextblock26_Jsonclick = "" ;
      A10770ColGrm2 = DecimalUtil.ZERO ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode557 = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_check_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      bttBtn_help_Jsonclick = "" ;
      AV33Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      sMode556 = "" ;
      s6047TotColMol = DecimalUtil.ZERO ;
      A6047TotColMol = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      A718PrdNom = "" ;
      A2116PrdForCan = DecimalUtil.ZERO ;
      T2116PrdForCan = DecimalUtil.ZERO ;
      A2100MolCon = DecimalUtil.ZERO ;
      A2101MolDib = "" ;
      A2650MolPesMin = DecimalUtil.ZERO ;
      A2648MolForEst = "" ;
      A2649MolPesMax = DecimalUtil.ZERO ;
      A4420MolCol = "" ;
      A4862MolPrcCob = DecimalUtil.ZERO ;
      A8418MolActivo = "" ;
      A11760TaesDc2 = "" ;
      T6047TotColMol = DecimalUtil.ZERO ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV12Station = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z2077ColEstSer = "" ;
      Z1823DibTipMaq = "" ;
      Z4861DibCob = DecimalUtil.ZERO ;
      Z7140DibBmp = "" ;
      Z584IntDsc = "" ;
      Z500GrpFamDsc = "" ;
      T01LY13_A407EmprNom = new String[] {""} ;
      T01LY13_n407EmprNom = new boolean[] {false} ;
      T01LY19_A65ArtCod = new String[] {""} ;
      T01LY19_A2141SerEst = new String[] {""} ;
      T01LY19_A2074ColCom = new String[] {""} ;
      T01LY19_A2078ColFon = new String[] {""} ;
      T01LY19_A407EmprNom = new String[] {""} ;
      T01LY19_n407EmprNom = new boolean[] {false} ;
      T01LY19_A279CliNom = new String[] {""} ;
      T01LY19_A1823DibTipMaq = new String[] {""} ;
      T01LY19_n1823DibTipMaq = new boolean[] {false} ;
      T01LY19_A1019DibMolCil = new short[1] ;
      T01LY19_n1019DibMolCil = new boolean[] {false} ;
      T01LY19_A2090DibMolCi2 = new short[1] ;
      T01LY19_n2090DibMolCi2 = new boolean[] {false} ;
      T01LY19_A2079ColMolCil = new short[1] ;
      T01LY19_n2079ColMolCil = new boolean[] {false} ;
      T01LY19_A5336ColCodExt = new String[] {""} ;
      T01LY19_n5336ColCodExt = new boolean[] {false} ;
      T01LY19_A2076ColEstMba = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LY19_n2076ColEstMba = new boolean[] {false} ;
      T01LY19_A4861DibCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LY19_n4861DibCob = new boolean[] {false} ;
      T01LY19_A584IntDsc = new String[] {""} ;
      T01LY19_n584IntDsc = new boolean[] {false} ;
      T01LY19_A7028ColBmp = new String[] {""} ;
      T01LY19_n7028ColBmp = new boolean[] {false} ;
      T01LY19_A7140DibBmp = new String[] {""} ;
      T01LY19_n7140DibBmp = new boolean[] {false} ;
      T01LY19_A500GrpFamDsc = new String[] {""} ;
      T01LY19_n500GrpFamDsc = new boolean[] {false} ;
      T01LY19_A8419ColNomCol = new String[] {""} ;
      T01LY19_n8419ColNomCol = new boolean[] {false} ;
      T01LY19_A10770ColGrm2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LY19_n10770ColGrm2 = new boolean[] {false} ;
      T01LY19_A396EmprCod = new String[] {""} ;
      T01LY19_A252CliCod = new int[1] ;
      T01LY19_A499GrpFamCod = new byte[1] ;
      T01LY19_n499GrpFamCod = new boolean[] {false} ;
      T01LY19_A583IntCod = new byte[1] ;
      T01LY19_n583IntCod = new boolean[] {false} ;
      T01LY19_A1013DibCli = new String[] {""} ;
      T01LY19_A1014DibInt = new int[1] ;
      T01LY19_A2075ColEstAnh = new short[1] ;
      T01LY19_n2075ColEstAnh = new boolean[] {false} ;
      T01LY19_A2077ColEstSer = new String[] {""} ;
      T01LY19_n2077ColEstSer = new boolean[] {false} ;
      T01LY15_A500GrpFamDsc = new String[] {""} ;
      T01LY15_n500GrpFamDsc = new boolean[] {false} ;
      T01LY16_A584IntDsc = new String[] {""} ;
      T01LY16_n584IntDsc = new boolean[] {false} ;
      T01LY14_A279CliNom = new String[] {""} ;
      T01LY18_A2075ColEstAnh = new short[1] ;
      T01LY18_n2075ColEstAnh = new boolean[] {false} ;
      T01LY18_A2077ColEstSer = new String[] {""} ;
      T01LY18_n2077ColEstSer = new boolean[] {false} ;
      T01LY17_A1823DibTipMaq = new String[] {""} ;
      T01LY17_n1823DibTipMaq = new boolean[] {false} ;
      T01LY17_A1019DibMolCil = new short[1] ;
      T01LY17_n1019DibMolCil = new boolean[] {false} ;
      T01LY17_A2090DibMolCi2 = new short[1] ;
      T01LY17_n2090DibMolCi2 = new boolean[] {false} ;
      T01LY17_A4861DibCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LY17_n4861DibCob = new boolean[] {false} ;
      T01LY17_A7140DibBmp = new String[] {""} ;
      T01LY17_n7140DibBmp = new boolean[] {false} ;
      T01LY20_A500GrpFamDsc = new String[] {""} ;
      T01LY20_n500GrpFamDsc = new boolean[] {false} ;
      T01LY21_A584IntDsc = new String[] {""} ;
      T01LY21_n584IntDsc = new boolean[] {false} ;
      T01LY22_A279CliNom = new String[] {""} ;
      T01LY23_A2075ColEstAnh = new short[1] ;
      T01LY23_n2075ColEstAnh = new boolean[] {false} ;
      T01LY23_A2077ColEstSer = new String[] {""} ;
      T01LY23_n2077ColEstSer = new boolean[] {false} ;
      T01LY24_A1823DibTipMaq = new String[] {""} ;
      T01LY24_n1823DibTipMaq = new boolean[] {false} ;
      T01LY24_A1019DibMolCil = new short[1] ;
      T01LY24_n1019DibMolCil = new boolean[] {false} ;
      T01LY24_A2090DibMolCi2 = new short[1] ;
      T01LY24_n2090DibMolCi2 = new boolean[] {false} ;
      T01LY24_A4861DibCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LY24_n4861DibCob = new boolean[] {false} ;
      T01LY24_A7140DibBmp = new String[] {""} ;
      T01LY24_n7140DibBmp = new boolean[] {false} ;
      T01LY25_A396EmprCod = new String[] {""} ;
      T01LY25_A252CliCod = new int[1] ;
      T01LY25_A2141SerEst = new String[] {""} ;
      T01LY25_A1013DibCli = new String[] {""} ;
      T01LY25_A1014DibInt = new int[1] ;
      T01LY25_A2074ColCom = new String[] {""} ;
      T01LY25_A2078ColFon = new String[] {""} ;
      T01LY12_A2141SerEst = new String[] {""} ;
      T01LY12_A2074ColCom = new String[] {""} ;
      T01LY12_A2078ColFon = new String[] {""} ;
      T01LY12_A2079ColMolCil = new short[1] ;
      T01LY12_n2079ColMolCil = new boolean[] {false} ;
      T01LY12_A5336ColCodExt = new String[] {""} ;
      T01LY12_n5336ColCodExt = new boolean[] {false} ;
      T01LY12_A2076ColEstMba = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LY12_n2076ColEstMba = new boolean[] {false} ;
      T01LY12_A7028ColBmp = new String[] {""} ;
      T01LY12_n7028ColBmp = new boolean[] {false} ;
      T01LY12_A8419ColNomCol = new String[] {""} ;
      T01LY12_n8419ColNomCol = new boolean[] {false} ;
      T01LY12_A10770ColGrm2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LY12_n10770ColGrm2 = new boolean[] {false} ;
      T01LY12_A396EmprCod = new String[] {""} ;
      T01LY12_A252CliCod = new int[1] ;
      T01LY12_A499GrpFamCod = new byte[1] ;
      T01LY12_n499GrpFamCod = new boolean[] {false} ;
      T01LY12_A583IntCod = new byte[1] ;
      T01LY12_n583IntCod = new boolean[] {false} ;
      T01LY12_A1013DibCli = new String[] {""} ;
      T01LY12_A1014DibInt = new int[1] ;
      T01LY26_A396EmprCod = new String[] {""} ;
      T01LY26_A252CliCod = new int[1] ;
      T01LY26_A2141SerEst = new String[] {""} ;
      T01LY26_A1013DibCli = new String[] {""} ;
      T01LY26_A1014DibInt = new int[1] ;
      T01LY26_A2074ColCom = new String[] {""} ;
      T01LY26_A2078ColFon = new String[] {""} ;
      T01LY27_A396EmprCod = new String[] {""} ;
      T01LY27_A252CliCod = new int[1] ;
      T01LY27_A2141SerEst = new String[] {""} ;
      T01LY27_A1013DibCli = new String[] {""} ;
      T01LY27_A1014DibInt = new int[1] ;
      T01LY27_A2074ColCom = new String[] {""} ;
      T01LY27_A2078ColFon = new String[] {""} ;
      T01LY11_A2141SerEst = new String[] {""} ;
      T01LY11_A2074ColCom = new String[] {""} ;
      T01LY11_A2078ColFon = new String[] {""} ;
      T01LY11_A2079ColMolCil = new short[1] ;
      T01LY11_n2079ColMolCil = new boolean[] {false} ;
      T01LY11_A5336ColCodExt = new String[] {""} ;
      T01LY11_n5336ColCodExt = new boolean[] {false} ;
      T01LY11_A2076ColEstMba = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LY11_n2076ColEstMba = new boolean[] {false} ;
      T01LY11_A7028ColBmp = new String[] {""} ;
      T01LY11_n7028ColBmp = new boolean[] {false} ;
      T01LY11_A8419ColNomCol = new String[] {""} ;
      T01LY11_n8419ColNomCol = new boolean[] {false} ;
      T01LY11_A10770ColGrm2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LY11_n10770ColGrm2 = new boolean[] {false} ;
      T01LY11_A396EmprCod = new String[] {""} ;
      T01LY11_A252CliCod = new int[1] ;
      T01LY11_A499GrpFamCod = new byte[1] ;
      T01LY11_n499GrpFamCod = new boolean[] {false} ;
      T01LY11_A583IntCod = new byte[1] ;
      T01LY11_n583IntCod = new boolean[] {false} ;
      T01LY11_A1013DibCli = new String[] {""} ;
      T01LY11_A1014DibInt = new int[1] ;
      T01LY31_A279CliNom = new String[] {""} ;
      T01LY32_A2075ColEstAnh = new short[1] ;
      T01LY32_n2075ColEstAnh = new boolean[] {false} ;
      T01LY32_A2077ColEstSer = new String[] {""} ;
      T01LY32_n2077ColEstSer = new boolean[] {false} ;
      T01LY33_A1823DibTipMaq = new String[] {""} ;
      T01LY33_n1823DibTipMaq = new boolean[] {false} ;
      T01LY33_A1019DibMolCil = new short[1] ;
      T01LY33_n1019DibMolCil = new boolean[] {false} ;
      T01LY33_A2090DibMolCi2 = new short[1] ;
      T01LY33_n2090DibMolCi2 = new boolean[] {false} ;
      T01LY33_A4861DibCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LY33_n4861DibCob = new boolean[] {false} ;
      T01LY33_A7140DibBmp = new String[] {""} ;
      T01LY33_n7140DibBmp = new boolean[] {false} ;
      T01LY34_A584IntDsc = new String[] {""} ;
      T01LY34_n584IntDsc = new boolean[] {false} ;
      T01LY35_A500GrpFamDsc = new String[] {""} ;
      T01LY35_n500GrpFamDsc = new boolean[] {false} ;
      T01LY36_A396EmprCod = new String[] {""} ;
      T01LY36_A252CliCod = new int[1] ;
      T01LY36_A2141SerEst = new String[] {""} ;
      T01LY36_A1013DibCli = new String[] {""} ;
      T01LY36_A1014DibInt = new int[1] ;
      T01LY36_A2074ColCom = new String[] {""} ;
      T01LY36_A2078ColFon = new String[] {""} ;
      T01LY36_A11712ClaveID = new short[1] ;
      T01LY37_A396EmprCod = new String[] {""} ;
      T01LY37_A252CliCod = new int[1] ;
      T01LY37_A2141SerEst = new String[] {""} ;
      T01LY37_A1013DibCli = new String[] {""} ;
      T01LY37_A1014DibInt = new int[1] ;
      T01LY37_A2074ColCom = new String[] {""} ;
      T01LY37_A2078ColFon = new String[] {""} ;
      T01LY37_A2095ForObsLin = new byte[1] ;
      T01LY38_A396EmprCod = new String[] {""} ;
      T01LY38_A252CliCod = new int[1] ;
      T01LY38_A2141SerEst = new String[] {""} ;
      T01LY38_A1013DibCli = new String[] {""} ;
      T01LY38_A1014DibInt = new int[1] ;
      T01LY38_A2074ColCom = new String[] {""} ;
      T01LY38_A2078ColFon = new String[] {""} ;
      T01LY38_A2098MolCod = new byte[1] ;
      T01LY39_A396EmprCod = new String[] {""} ;
      T01LY39_A252CliCod = new int[1] ;
      T01LY39_A2141SerEst = new String[] {""} ;
      T01LY39_A1013DibCli = new String[] {""} ;
      T01LY39_A1014DibInt = new int[1] ;
      T01LY39_A2074ColCom = new String[] {""} ;
      T01LY39_A2078ColFon = new String[] {""} ;
      Z6047TotColMol = DecimalUtil.ZERO ;
      T01LY41_A252CliCod = new int[1] ;
      T01LY41_A2141SerEst = new String[] {""} ;
      T01LY41_A1013DibCli = new String[] {""} ;
      T01LY41_A1014DibInt = new int[1] ;
      T01LY41_A2074ColCom = new String[] {""} ;
      T01LY41_A2078ColFon = new String[] {""} ;
      T01LY41_A2098MolCod = new byte[1] ;
      T01LY41_A2100MolCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LY41_n2100MolCon = new boolean[] {false} ;
      T01LY41_A2536ForPrdUL = new short[1] ;
      T01LY41_n2536ForPrdUL = new boolean[] {false} ;
      T01LY41_A2650MolPesMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LY41_n2650MolPesMin = new boolean[] {false} ;
      T01LY41_A2648MolForEst = new String[] {""} ;
      T01LY41_n2648MolForEst = new boolean[] {false} ;
      T01LY41_A2649MolPesMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LY41_n2649MolPesMax = new boolean[] {false} ;
      T01LY41_A4420MolCol = new String[] {""} ;
      T01LY41_n4420MolCol = new boolean[] {false} ;
      T01LY41_A8054Dg_Degr = new short[1] ;
      T01LY41_n8054Dg_Degr = new boolean[] {false} ;
      T01LY41_A9608MolPorVar = new short[1] ;
      T01LY41_n9608MolPorVar = new boolean[] {false} ;
      T01LY41_A11759TaesId2 = new String[] {""} ;
      T01LY41_n11759TaesId2 = new boolean[] {false} ;
      T01LY41_A2655PasForUL = new short[1] ;
      T01LY41_n2655PasForUL = new boolean[] {false} ;
      T01LY41_A396EmprCod = new String[] {""} ;
      T01LY41_A8052Dg_codigo = new short[1] ;
      T01LY41_n8052Dg_codigo = new boolean[] {false} ;
      T01LY41_A6045TotParCol = new byte[1] ;
      T01LY41_A6047TotColMol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LY8_A8054Dg_Degr = new short[1] ;
      T01LY8_n8054Dg_Degr = new boolean[] {false} ;
      T01LY10_A6045TotParCol = new byte[1] ;
      T01LY10_A6047TotColMol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LY42_A8054Dg_Degr = new short[1] ;
      T01LY42_n8054Dg_Degr = new boolean[] {false} ;
      T01LY44_A6045TotParCol = new byte[1] ;
      T01LY44_A6047TotColMol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LY45_A396EmprCod = new String[] {""} ;
      T01LY45_A252CliCod = new int[1] ;
      T01LY45_A2141SerEst = new String[] {""} ;
      T01LY45_A1013DibCli = new String[] {""} ;
      T01LY45_A1014DibInt = new int[1] ;
      T01LY45_A2074ColCom = new String[] {""} ;
      T01LY45_A2078ColFon = new String[] {""} ;
      T01LY45_A2098MolCod = new byte[1] ;
      T01LY7_A252CliCod = new int[1] ;
      T01LY7_A2141SerEst = new String[] {""} ;
      T01LY7_A1013DibCli = new String[] {""} ;
      T01LY7_A1014DibInt = new int[1] ;
      T01LY7_A2074ColCom = new String[] {""} ;
      T01LY7_A2078ColFon = new String[] {""} ;
      T01LY7_A2098MolCod = new byte[1] ;
      T01LY7_A2100MolCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LY7_n2100MolCon = new boolean[] {false} ;
      T01LY7_A2536ForPrdUL = new short[1] ;
      T01LY7_n2536ForPrdUL = new boolean[] {false} ;
      T01LY7_A2650MolPesMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LY7_n2650MolPesMin = new boolean[] {false} ;
      T01LY7_A2648MolForEst = new String[] {""} ;
      T01LY7_n2648MolForEst = new boolean[] {false} ;
      T01LY7_A2649MolPesMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LY7_n2649MolPesMax = new boolean[] {false} ;
      T01LY7_A4420MolCol = new String[] {""} ;
      T01LY7_n4420MolCol = new boolean[] {false} ;
      T01LY7_A9608MolPorVar = new short[1] ;
      T01LY7_n9608MolPorVar = new boolean[] {false} ;
      T01LY7_A11759TaesId2 = new String[] {""} ;
      T01LY7_n11759TaesId2 = new boolean[] {false} ;
      T01LY7_A2655PasForUL = new short[1] ;
      T01LY7_n2655PasForUL = new boolean[] {false} ;
      T01LY7_A396EmprCod = new String[] {""} ;
      T01LY7_A8052Dg_codigo = new short[1] ;
      T01LY7_n8052Dg_codigo = new boolean[] {false} ;
      T01LY6_A252CliCod = new int[1] ;
      T01LY6_A2141SerEst = new String[] {""} ;
      T01LY6_A1013DibCli = new String[] {""} ;
      T01LY6_A1014DibInt = new int[1] ;
      T01LY6_A2074ColCom = new String[] {""} ;
      T01LY6_A2078ColFon = new String[] {""} ;
      T01LY6_A2098MolCod = new byte[1] ;
      T01LY6_A2100MolCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LY6_n2100MolCon = new boolean[] {false} ;
      T01LY6_A2536ForPrdUL = new short[1] ;
      T01LY6_n2536ForPrdUL = new boolean[] {false} ;
      T01LY6_A2650MolPesMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LY6_n2650MolPesMin = new boolean[] {false} ;
      T01LY6_A2648MolForEst = new String[] {""} ;
      T01LY6_n2648MolForEst = new boolean[] {false} ;
      T01LY6_A2649MolPesMax = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LY6_n2649MolPesMax = new boolean[] {false} ;
      T01LY6_A4420MolCol = new String[] {""} ;
      T01LY6_n4420MolCol = new boolean[] {false} ;
      T01LY6_A9608MolPorVar = new short[1] ;
      T01LY6_n9608MolPorVar = new boolean[] {false} ;
      T01LY6_A11759TaesId2 = new String[] {""} ;
      T01LY6_n11759TaesId2 = new boolean[] {false} ;
      T01LY6_A2655PasForUL = new short[1] ;
      T01LY6_n2655PasForUL = new boolean[] {false} ;
      T01LY6_A396EmprCod = new String[] {""} ;
      T01LY6_A8052Dg_codigo = new short[1] ;
      T01LY6_n8052Dg_codigo = new boolean[] {false} ;
      T01LY50_A6045TotParCol = new byte[1] ;
      T01LY50_A6047TotColMol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LY51_A8054Dg_Degr = new short[1] ;
      T01LY51_n8054Dg_Degr = new boolean[] {false} ;
      T01LY52_A396EmprCod = new String[] {""} ;
      T01LY52_A252CliCod = new int[1] ;
      T01LY52_A2141SerEst = new String[] {""} ;
      T01LY52_A1013DibCli = new String[] {""} ;
      T01LY52_A1014DibInt = new int[1] ;
      T01LY52_A2074ColCom = new String[] {""} ;
      T01LY52_A2078ColFon = new String[] {""} ;
      T01LY52_A2098MolCod = new byte[1] ;
      T01LY52_A2654PasForLin = new short[1] ;
      T01LY53_A396EmprCod = new String[] {""} ;
      T01LY53_A252CliCod = new int[1] ;
      T01LY53_A2141SerEst = new String[] {""} ;
      T01LY53_A1013DibCli = new String[] {""} ;
      T01LY53_A1014DibInt = new int[1] ;
      T01LY53_A2074ColCom = new String[] {""} ;
      T01LY53_A2078ColFon = new String[] {""} ;
      T01LY53_A2098MolCod = new byte[1] ;
      Z718PrdNom = "" ;
      T01LY54_A252CliCod = new int[1] ;
      T01LY54_A2141SerEst = new String[] {""} ;
      T01LY54_A1013DibCli = new String[] {""} ;
      T01LY54_A1014DibInt = new int[1] ;
      T01LY54_A2074ColCom = new String[] {""} ;
      T01LY54_A2078ColFon = new String[] {""} ;
      T01LY54_A2098MolCod = new byte[1] ;
      T01LY54_A2535ForPrdLin = new short[1] ;
      T01LY54_A718PrdNom = new String[] {""} ;
      T01LY54_A2116PrdForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LY54_n2116PrdForCan = new boolean[] {false} ;
      T01LY54_A6046PrdForPar = new short[1] ;
      T01LY54_n6046PrdForPar = new boolean[] {false} ;
      T01LY54_A396EmprCod = new String[] {""} ;
      T01LY54_A719PrdNum = new String[] {""} ;
      T01LY54_n719PrdNum = new boolean[] {false} ;
      T01LY54_A2144UniEstCod = new String[] {""} ;
      T01LY54_n2144UniEstCod = new boolean[] {false} ;
      T01LY4_A718PrdNom = new String[] {""} ;
      T01LY5_A2144UniEstCod = new String[] {""} ;
      T01LY5_n2144UniEstCod = new boolean[] {false} ;
      T01LY55_A718PrdNom = new String[] {""} ;
      T01LY56_A2144UniEstCod = new String[] {""} ;
      T01LY56_n2144UniEstCod = new boolean[] {false} ;
      T01LY57_A396EmprCod = new String[] {""} ;
      T01LY57_A252CliCod = new int[1] ;
      T01LY57_A2141SerEst = new String[] {""} ;
      T01LY57_A1013DibCli = new String[] {""} ;
      T01LY57_A1014DibInt = new int[1] ;
      T01LY57_A2074ColCom = new String[] {""} ;
      T01LY57_A2078ColFon = new String[] {""} ;
      T01LY57_A2098MolCod = new byte[1] ;
      T01LY57_A2535ForPrdLin = new short[1] ;
      T01LY3_A252CliCod = new int[1] ;
      T01LY3_A2141SerEst = new String[] {""} ;
      T01LY3_A1013DibCli = new String[] {""} ;
      T01LY3_A1014DibInt = new int[1] ;
      T01LY3_A2074ColCom = new String[] {""} ;
      T01LY3_A2078ColFon = new String[] {""} ;
      T01LY3_A2098MolCod = new byte[1] ;
      T01LY3_A2535ForPrdLin = new short[1] ;
      T01LY3_A2116PrdForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LY3_n2116PrdForCan = new boolean[] {false} ;
      T01LY3_A6046PrdForPar = new short[1] ;
      T01LY3_n6046PrdForPar = new boolean[] {false} ;
      T01LY3_A396EmprCod = new String[] {""} ;
      T01LY3_A719PrdNum = new String[] {""} ;
      T01LY3_n719PrdNum = new boolean[] {false} ;
      T01LY3_A2144UniEstCod = new String[] {""} ;
      T01LY3_n2144UniEstCod = new boolean[] {false} ;
      sMode558 = "" ;
      T01LY2_A252CliCod = new int[1] ;
      T01LY2_A2141SerEst = new String[] {""} ;
      T01LY2_A1013DibCli = new String[] {""} ;
      T01LY2_A1014DibInt = new int[1] ;
      T01LY2_A2074ColCom = new String[] {""} ;
      T01LY2_A2078ColFon = new String[] {""} ;
      T01LY2_A2098MolCod = new byte[1] ;
      T01LY2_A2535ForPrdLin = new short[1] ;
      T01LY2_A2116PrdForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LY2_n2116PrdForCan = new boolean[] {false} ;
      T01LY2_A6046PrdForPar = new short[1] ;
      T01LY2_n6046PrdForPar = new boolean[] {false} ;
      T01LY2_A396EmprCod = new String[] {""} ;
      T01LY2_A719PrdNum = new String[] {""} ;
      T01LY2_n719PrdNum = new boolean[] {false} ;
      T01LY2_A2144UniEstCod = new String[] {""} ;
      T01LY2_n2144UniEstCod = new boolean[] {false} ;
      T01LY61_A718PrdNom = new String[] {""} ;
      T01LY62_A396EmprCod = new String[] {""} ;
      T01LY62_A252CliCod = new int[1] ;
      T01LY62_A2141SerEst = new String[] {""} ;
      T01LY62_A1013DibCli = new String[] {""} ;
      T01LY62_A1014DibInt = new int[1] ;
      T01LY62_A2074ColCom = new String[] {""} ;
      T01LY62_A2078ColFon = new String[] {""} ;
      T01LY62_A2098MolCod = new byte[1] ;
      T01LY62_A2535ForPrdLin = new short[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      lblTextblock27_Jsonclick = "" ;
      ROClassString = "" ;
      lblTextblock28_Jsonclick = "" ;
      lblTextblock29_Jsonclick = "" ;
      lblTextblock30_Jsonclick = "" ;
      lblTextblock31_Jsonclick = "" ;
      lblTextblock32_Jsonclick = "" ;
      lblTextblock33_Jsonclick = "" ;
      lblTextblock34_Jsonclick = "" ;
      lblTextblock35_Jsonclick = "" ;
      lblTextblock36_Jsonclick = "" ;
      lblTextblock37_Jsonclick = "" ;
      lblTextblock38_Jsonclick = "" ;
      lblTextblock39_Jsonclick = "" ;
      lblTextblock40_Jsonclick = "" ;
      lblTextblock41_Jsonclick = "" ;
      lblTextblock42_Jsonclick = "" ;
      lblTextblock43_Jsonclick = "" ;
      lblTextblock44_Jsonclick = "" ;
      lblTextblock45_Jsonclick = "" ;
      lblTextblock46_Jsonclick = "" ;
      Grid2Container = new com.genexus.webpanels.GXWebGrid(context);
      B6047TotColMol = DecimalUtil.ZERO ;
      Grid2Row = new com.genexus.webpanels.GXWebRow();
      subGrid2_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      subGrid1_Header = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      Grid2Column = new com.genexus.webpanels.GXWebColumn();
      T01LY63_A407EmprNom = new String[] {""} ;
      T01LY63_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ2141SerEst = "" ;
      ZZ1013DibCli = "" ;
      ZZ2074ColCom = "" ;
      ZZ2078ColFon = "" ;
      ZZ407EmprNom = "" ;
      ZZ5336ColCodExt = "" ;
      ZZ2076ColEstMba = DecimalUtil.ZERO ;
      ZZ7028ColBmp = "" ;
      ZZ8419ColNomCol = "" ;
      ZZ10770ColGrm2 = DecimalUtil.ZERO ;
      ZZ500GrpFamDsc = "" ;
      ZZ584IntDsc = "" ;
      ZZ279CliNom = "" ;
      ZZ2077ColEstSer = "" ;
      ZZ1823DibTipMaq = "" ;
      ZZ4861DibCob = DecimalUtil.ZERO ;
      ZZ7140DibBmp = "" ;
      Z8418MolActivo = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      Z11760TaesDc2 = "" ;
      T01LY64_A2144UniEstCod = new String[] {""} ;
      T01LY64_n2144UniEstCod = new boolean[] {false} ;
      X5381DibPrcCobM = DecimalUtil.ZERO ;
      E396EmprCod = "" ;
      E1013DibCli = "" ;
      T01LY65_A396EmprCod = new String[] {""} ;
      T01LY65_A1013DibCli = new String[] {""} ;
      T01LY65_A252CliCod = new int[1] ;
      T01LY65_A1014DibInt = new int[1] ;
      T01LY65_A1029DibLin = new short[1] ;
      T01LY65_A5381DibPrcCobM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LY65_n5381DibPrcCobM = new boolean[] {false} ;
      T01LY65_A2088DibDibMol = new byte[1] ;
      T01LY65_n2088DibDibMol = new boolean[] {false} ;
      X4860DibPrcCob = DecimalUtil.ZERO ;
      T01LY66_A396EmprCod = new String[] {""} ;
      T01LY66_A1013DibCli = new String[] {""} ;
      T01LY66_A252CliCod = new int[1] ;
      T01LY66_A1014DibInt = new int[1] ;
      T01LY66_A1807DibLinCil = new short[1] ;
      T01LY66_A4860DibPrcCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01LY66_n4860DibPrcCob = new boolean[] {false} ;
      T01LY66_A2089DibLinMol = new byte[1] ;
      T01LY66_n2089DibLinMol = new boolean[] {false} ;
      X1030DibRelMC = "" ;
      T01LY67_A396EmprCod = new String[] {""} ;
      T01LY67_A1013DibCli = new String[] {""} ;
      T01LY67_A252CliCod = new int[1] ;
      T01LY67_A1014DibInt = new int[1] ;
      T01LY67_A1807DibLinCil = new short[1] ;
      T01LY67_A1030DibRelMC = new String[] {""} ;
      T01LY67_n1030DibRelMC = new boolean[] {false} ;
      T01LY67_A2089DibLinMol = new byte[1] ;
      T01LY67_n2089DibLinMol = new boolean[] {false} ;
      X2092DibRelMC2 = "" ;
      T01LY68_A396EmprCod = new String[] {""} ;
      T01LY68_A1013DibCli = new String[] {""} ;
      T01LY68_A252CliCod = new int[1] ;
      T01LY68_A1014DibInt = new int[1] ;
      T01LY68_A1029DibLin = new short[1] ;
      T01LY68_A2092DibRelMC2 = new String[] {""} ;
      T01LY68_n2092DibRelMC2 = new boolean[] {false} ;
      T01LY68_A2088DibDibMol = new byte[1] ;
      T01LY68_n2088DibDibMol = new boolean[] {false} ;
      T01LY69_A396EmprCod = new String[] {""} ;
      T01LY69_A1013DibCli = new String[] {""} ;
      T01LY69_A252CliCod = new int[1] ;
      T01LY69_A1014DibInt = new int[1] ;
      T01LY69_A1807DibLinCil = new short[1] ;
      T01LY69_A2089DibLinMol = new byte[1] ;
      T01LY69_n2089DibLinMol = new boolean[] {false} ;
      T01LY70_A396EmprCod = new String[] {""} ;
      T01LY70_A1013DibCli = new String[] {""} ;
      T01LY70_A252CliCod = new int[1] ;
      T01LY70_A1014DibInt = new int[1] ;
      T01LY70_A1029DibLin = new short[1] ;
      T01LY70_A2088DibDibMol = new byte[1] ;
      T01LY70_n2088DibDibMol = new boolean[] {false} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttrn20__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttrn20__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttrn20__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttrn20__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn20__default(),
         new Object[] {
             new Object[] {
            T01LY2_A252CliCod, T01LY2_A2141SerEst, T01LY2_A1013DibCli, T01LY2_A1014DibInt, T01LY2_A2074ColCom, T01LY2_A2078ColFon, T01LY2_A2098MolCod, T01LY2_A2535ForPrdLin, T01LY2_A2116PrdForCan, T01LY2_n2116PrdForCan,
            T01LY2_A6046PrdForPar, T01LY2_n6046PrdForPar, T01LY2_A396EmprCod, T01LY2_A719PrdNum, T01LY2_n719PrdNum, T01LY2_A2144UniEstCod, T01LY2_n2144UniEstCod
            }
            , new Object[] {
            T01LY3_A252CliCod, T01LY3_A2141SerEst, T01LY3_A1013DibCli, T01LY3_A1014DibInt, T01LY3_A2074ColCom, T01LY3_A2078ColFon, T01LY3_A2098MolCod, T01LY3_A2535ForPrdLin, T01LY3_A2116PrdForCan, T01LY3_n2116PrdForCan,
            T01LY3_A6046PrdForPar, T01LY3_n6046PrdForPar, T01LY3_A396EmprCod, T01LY3_A719PrdNum, T01LY3_n719PrdNum, T01LY3_A2144UniEstCod, T01LY3_n2144UniEstCod
            }
            , new Object[] {
            T01LY4_A718PrdNom
            }
            , new Object[] {
            T01LY5_A2144UniEstCod
            }
            , new Object[] {
            T01LY6_A252CliCod, T01LY6_A2141SerEst, T01LY6_A1013DibCli, T01LY6_A1014DibInt, T01LY6_A2074ColCom, T01LY6_A2078ColFon, T01LY6_A2098MolCod, T01LY6_A2100MolCon, T01LY6_n2100MolCon, T01LY6_A2536ForPrdUL,
            T01LY6_n2536ForPrdUL, T01LY6_A2650MolPesMin, T01LY6_n2650MolPesMin, T01LY6_A2648MolForEst, T01LY6_n2648MolForEst, T01LY6_A2649MolPesMax, T01LY6_n2649MolPesMax, T01LY6_A4420MolCol, T01LY6_n4420MolCol, T01LY6_A9608MolPorVar,
            T01LY6_n9608MolPorVar, T01LY6_A11759TaesId2, T01LY6_n11759TaesId2, T01LY6_A2655PasForUL, T01LY6_n2655PasForUL, T01LY6_A396EmprCod, T01LY6_A8052Dg_codigo, T01LY6_n8052Dg_codigo
            }
            , new Object[] {
            T01LY7_A252CliCod, T01LY7_A2141SerEst, T01LY7_A1013DibCli, T01LY7_A1014DibInt, T01LY7_A2074ColCom, T01LY7_A2078ColFon, T01LY7_A2098MolCod, T01LY7_A2100MolCon, T01LY7_n2100MolCon, T01LY7_A2536ForPrdUL,
            T01LY7_n2536ForPrdUL, T01LY7_A2650MolPesMin, T01LY7_n2650MolPesMin, T01LY7_A2648MolForEst, T01LY7_n2648MolForEst, T01LY7_A2649MolPesMax, T01LY7_n2649MolPesMax, T01LY7_A4420MolCol, T01LY7_n4420MolCol, T01LY7_A9608MolPorVar,
            T01LY7_n9608MolPorVar, T01LY7_A11759TaesId2, T01LY7_n11759TaesId2, T01LY7_A2655PasForUL, T01LY7_n2655PasForUL, T01LY7_A396EmprCod, T01LY7_A8052Dg_codigo, T01LY7_n8052Dg_codigo
            }
            , new Object[] {
            T01LY8_A8054Dg_Degr, T01LY8_n8054Dg_Degr
            }
            , new Object[] {
            T01LY10_A6045TotParCol, T01LY10_A6047TotColMol
            }
            , new Object[] {
            T01LY11_A2141SerEst, T01LY11_A2074ColCom, T01LY11_A2078ColFon, T01LY11_A2079ColMolCil, T01LY11_n2079ColMolCil, T01LY11_A5336ColCodExt, T01LY11_n5336ColCodExt, T01LY11_A2076ColEstMba, T01LY11_n2076ColEstMba, T01LY11_A7028ColBmp,
            T01LY11_n7028ColBmp, T01LY11_A8419ColNomCol, T01LY11_n8419ColNomCol, T01LY11_A10770ColGrm2, T01LY11_n10770ColGrm2, T01LY11_A396EmprCod, T01LY11_A252CliCod, T01LY11_A499GrpFamCod, T01LY11_n499GrpFamCod, T01LY11_A583IntCod,
            T01LY11_n583IntCod, T01LY11_A1013DibCli, T01LY11_A1014DibInt
            }
            , new Object[] {
            T01LY12_A2141SerEst, T01LY12_A2074ColCom, T01LY12_A2078ColFon, T01LY12_A2079ColMolCil, T01LY12_n2079ColMolCil, T01LY12_A5336ColCodExt, T01LY12_n5336ColCodExt, T01LY12_A2076ColEstMba, T01LY12_n2076ColEstMba, T01LY12_A7028ColBmp,
            T01LY12_n7028ColBmp, T01LY12_A8419ColNomCol, T01LY12_n8419ColNomCol, T01LY12_A10770ColGrm2, T01LY12_n10770ColGrm2, T01LY12_A396EmprCod, T01LY12_A252CliCod, T01LY12_A499GrpFamCod, T01LY12_n499GrpFamCod, T01LY12_A583IntCod,
            T01LY12_n583IntCod, T01LY12_A1013DibCli, T01LY12_A1014DibInt
            }
            , new Object[] {
            T01LY13_A407EmprNom, T01LY13_n407EmprNom
            }
            , new Object[] {
            T01LY14_A279CliNom
            }
            , new Object[] {
            T01LY15_A500GrpFamDsc, T01LY15_n500GrpFamDsc
            }
            , new Object[] {
            T01LY16_A584IntDsc, T01LY16_n584IntDsc
            }
            , new Object[] {
            T01LY17_A1823DibTipMaq, T01LY17_n1823DibTipMaq, T01LY17_A1019DibMolCil, T01LY17_n1019DibMolCil, T01LY17_A2090DibMolCi2, T01LY17_n2090DibMolCi2, T01LY17_A4861DibCob, T01LY17_n4861DibCob, T01LY17_A7140DibBmp, T01LY17_n7140DibBmp
            }
            , new Object[] {
            T01LY18_A2075ColEstAnh, T01LY18_n2075ColEstAnh, T01LY18_A2077ColEstSer, T01LY18_n2077ColEstSer
            }
            , new Object[] {
            T01LY19_A65ArtCod, T01LY19_A2141SerEst, T01LY19_A2074ColCom, T01LY19_A2078ColFon, T01LY19_A407EmprNom, T01LY19_n407EmprNom, T01LY19_A279CliNom, T01LY19_A1823DibTipMaq, T01LY19_n1823DibTipMaq, T01LY19_A1019DibMolCil,
            T01LY19_n1019DibMolCil, T01LY19_A2090DibMolCi2, T01LY19_n2090DibMolCi2, T01LY19_A2079ColMolCil, T01LY19_n2079ColMolCil, T01LY19_A5336ColCodExt, T01LY19_n5336ColCodExt, T01LY19_A2076ColEstMba, T01LY19_n2076ColEstMba, T01LY19_A4861DibCob,
            T01LY19_n4861DibCob, T01LY19_A584IntDsc, T01LY19_n584IntDsc, T01LY19_A7028ColBmp, T01LY19_n7028ColBmp, T01LY19_A7140DibBmp, T01LY19_n7140DibBmp, T01LY19_A500GrpFamDsc, T01LY19_n500GrpFamDsc, T01LY19_A8419ColNomCol,
            T01LY19_n8419ColNomCol, T01LY19_A10770ColGrm2, T01LY19_n10770ColGrm2, T01LY19_A396EmprCod, T01LY19_A252CliCod, T01LY19_A499GrpFamCod, T01LY19_n499GrpFamCod, T01LY19_A583IntCod, T01LY19_n583IntCod, T01LY19_A1013DibCli,
            T01LY19_A1014DibInt, T01LY19_A2075ColEstAnh, T01LY19_n2075ColEstAnh, T01LY19_A2077ColEstSer, T01LY19_n2077ColEstSer
            }
            , new Object[] {
            T01LY20_A500GrpFamDsc, T01LY20_n500GrpFamDsc
            }
            , new Object[] {
            T01LY21_A584IntDsc, T01LY21_n584IntDsc
            }
            , new Object[] {
            T01LY22_A279CliNom
            }
            , new Object[] {
            T01LY23_A2075ColEstAnh, T01LY23_n2075ColEstAnh, T01LY23_A2077ColEstSer, T01LY23_n2077ColEstSer
            }
            , new Object[] {
            T01LY24_A1823DibTipMaq, T01LY24_n1823DibTipMaq, T01LY24_A1019DibMolCil, T01LY24_n1019DibMolCil, T01LY24_A2090DibMolCi2, T01LY24_n2090DibMolCi2, T01LY24_A4861DibCob, T01LY24_n4861DibCob, T01LY24_A7140DibBmp, T01LY24_n7140DibBmp
            }
            , new Object[] {
            T01LY25_A396EmprCod, T01LY25_A252CliCod, T01LY25_A2141SerEst, T01LY25_A1013DibCli, T01LY25_A1014DibInt, T01LY25_A2074ColCom, T01LY25_A2078ColFon
            }
            , new Object[] {
            T01LY26_A396EmprCod, T01LY26_A252CliCod, T01LY26_A2141SerEst, T01LY26_A1013DibCli, T01LY26_A1014DibInt, T01LY26_A2074ColCom, T01LY26_A2078ColFon
            }
            , new Object[] {
            T01LY27_A396EmprCod, T01LY27_A252CliCod, T01LY27_A2141SerEst, T01LY27_A1013DibCli, T01LY27_A1014DibInt, T01LY27_A2074ColCom, T01LY27_A2078ColFon
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01LY31_A279CliNom
            }
            , new Object[] {
            T01LY32_A2075ColEstAnh, T01LY32_n2075ColEstAnh, T01LY32_A2077ColEstSer, T01LY32_n2077ColEstSer
            }
            , new Object[] {
            T01LY33_A1823DibTipMaq, T01LY33_n1823DibTipMaq, T01LY33_A1019DibMolCil, T01LY33_n1019DibMolCil, T01LY33_A2090DibMolCi2, T01LY33_n2090DibMolCi2, T01LY33_A4861DibCob, T01LY33_n4861DibCob, T01LY33_A7140DibBmp, T01LY33_n7140DibBmp
            }
            , new Object[] {
            T01LY34_A584IntDsc, T01LY34_n584IntDsc
            }
            , new Object[] {
            T01LY35_A500GrpFamDsc, T01LY35_n500GrpFamDsc
            }
            , new Object[] {
            T01LY36_A396EmprCod, T01LY36_A252CliCod, T01LY36_A2141SerEst, T01LY36_A1013DibCli, T01LY36_A1014DibInt, T01LY36_A2074ColCom, T01LY36_A2078ColFon, T01LY36_A11712ClaveID
            }
            , new Object[] {
            T01LY37_A396EmprCod, T01LY37_A252CliCod, T01LY37_A2141SerEst, T01LY37_A1013DibCli, T01LY37_A1014DibInt, T01LY37_A2074ColCom, T01LY37_A2078ColFon, T01LY37_A2095ForObsLin
            }
            , new Object[] {
            T01LY38_A396EmprCod, T01LY38_A252CliCod, T01LY38_A2141SerEst, T01LY38_A1013DibCli, T01LY38_A1014DibInt, T01LY38_A2074ColCom, T01LY38_A2078ColFon, T01LY38_A2098MolCod
            }
            , new Object[] {
            T01LY39_A396EmprCod, T01LY39_A252CliCod, T01LY39_A2141SerEst, T01LY39_A1013DibCli, T01LY39_A1014DibInt, T01LY39_A2074ColCom, T01LY39_A2078ColFon
            }
            , new Object[] {
            T01LY41_A252CliCod, T01LY41_A2141SerEst, T01LY41_A1013DibCli, T01LY41_A1014DibInt, T01LY41_A2074ColCom, T01LY41_A2078ColFon, T01LY41_A2098MolCod, T01LY41_A2100MolCon, T01LY41_n2100MolCon, T01LY41_A2536ForPrdUL,
            T01LY41_n2536ForPrdUL, T01LY41_A2650MolPesMin, T01LY41_n2650MolPesMin, T01LY41_A2648MolForEst, T01LY41_n2648MolForEst, T01LY41_A2649MolPesMax, T01LY41_n2649MolPesMax, T01LY41_A4420MolCol, T01LY41_n4420MolCol, T01LY41_A8054Dg_Degr,
            T01LY41_n8054Dg_Degr, T01LY41_A9608MolPorVar, T01LY41_n9608MolPorVar, T01LY41_A11759TaesId2, T01LY41_n11759TaesId2, T01LY41_A2655PasForUL, T01LY41_n2655PasForUL, T01LY41_A396EmprCod, T01LY41_A8052Dg_codigo, T01LY41_n8052Dg_codigo,
            T01LY41_A6045TotParCol, T01LY41_A6047TotColMol
            }
            , new Object[] {
            T01LY42_A8054Dg_Degr, T01LY42_n8054Dg_Degr
            }
            , new Object[] {
            T01LY44_A6045TotParCol, T01LY44_A6047TotColMol
            }
            , new Object[] {
            T01LY45_A396EmprCod, T01LY45_A252CliCod, T01LY45_A2141SerEst, T01LY45_A1013DibCli, T01LY45_A1014DibInt, T01LY45_A2074ColCom, T01LY45_A2078ColFon, T01LY45_A2098MolCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01LY50_A6045TotParCol, T01LY50_A6047TotColMol
            }
            , new Object[] {
            T01LY51_A8054Dg_Degr, T01LY51_n8054Dg_Degr
            }
            , new Object[] {
            T01LY52_A396EmprCod, T01LY52_A252CliCod, T01LY52_A2141SerEst, T01LY52_A1013DibCli, T01LY52_A1014DibInt, T01LY52_A2074ColCom, T01LY52_A2078ColFon, T01LY52_A2098MolCod, T01LY52_A2654PasForLin
            }
            , new Object[] {
            T01LY53_A396EmprCod, T01LY53_A252CliCod, T01LY53_A2141SerEst, T01LY53_A1013DibCli, T01LY53_A1014DibInt, T01LY53_A2074ColCom, T01LY53_A2078ColFon, T01LY53_A2098MolCod
            }
            , new Object[] {
            T01LY54_A252CliCod, T01LY54_A2141SerEst, T01LY54_A1013DibCli, T01LY54_A1014DibInt, T01LY54_A2074ColCom, T01LY54_A2078ColFon, T01LY54_A2098MolCod, T01LY54_A2535ForPrdLin, T01LY54_A718PrdNom, T01LY54_A2116PrdForCan,
            T01LY54_n2116PrdForCan, T01LY54_A6046PrdForPar, T01LY54_n6046PrdForPar, T01LY54_A396EmprCod, T01LY54_A719PrdNum, T01LY54_n719PrdNum, T01LY54_A2144UniEstCod, T01LY54_n2144UniEstCod
            }
            , new Object[] {
            T01LY55_A718PrdNom
            }
            , new Object[] {
            T01LY56_A2144UniEstCod
            }
            , new Object[] {
            T01LY57_A396EmprCod, T01LY57_A252CliCod, T01LY57_A2141SerEst, T01LY57_A1013DibCli, T01LY57_A1014DibInt, T01LY57_A2074ColCom, T01LY57_A2078ColFon, T01LY57_A2098MolCod, T01LY57_A2535ForPrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01LY61_A718PrdNom
            }
            , new Object[] {
            T01LY62_A396EmprCod, T01LY62_A252CliCod, T01LY62_A2141SerEst, T01LY62_A1013DibCli, T01LY62_A1014DibInt, T01LY62_A2074ColCom, T01LY62_A2078ColFon, T01LY62_A2098MolCod, T01LY62_A2535ForPrdLin
            }
            , new Object[] {
            T01LY63_A407EmprNom, T01LY63_n407EmprNom
            }
            , new Object[] {
            T01LY64_A2144UniEstCod
            }
            , new Object[] {
            T01LY65_A396EmprCod, T01LY65_A1013DibCli, T01LY65_A252CliCod, T01LY65_A1014DibInt, T01LY65_A1029DibLin, T01LY65_A5381DibPrcCobM, T01LY65_n5381DibPrcCobM, T01LY65_A2088DibDibMol, T01LY65_n2088DibDibMol
            }
            , new Object[] {
            T01LY66_A396EmprCod, T01LY66_A1013DibCli, T01LY66_A252CliCod, T01LY66_A1014DibInt, T01LY66_A1807DibLinCil, T01LY66_A4860DibPrcCob, T01LY66_n4860DibPrcCob, T01LY66_A2089DibLinMol, T01LY66_n2089DibLinMol
            }
            , new Object[] {
            T01LY67_A396EmprCod, T01LY67_A1013DibCli, T01LY67_A252CliCod, T01LY67_A1014DibInt, T01LY67_A1807DibLinCil, T01LY67_A1030DibRelMC, T01LY67_n1030DibRelMC, T01LY67_A2089DibLinMol, T01LY67_n2089DibLinMol
            }
            , new Object[] {
            T01LY68_A396EmprCod, T01LY68_A1013DibCli, T01LY68_A252CliCod, T01LY68_A1014DibInt, T01LY68_A1029DibLin, T01LY68_A2092DibRelMC2, T01LY68_n2092DibRelMC2, T01LY68_A2088DibDibMol, T01LY68_n2088DibDibMol
            }
            , new Object[] {
            T01LY69_A396EmprCod, T01LY69_A1013DibCli, T01LY69_A252CliCod, T01LY69_A1014DibInt, T01LY69_A1807DibLinCil, T01LY69_A2089DibLinMol, T01LY69_n2089DibLinMol
            }
            , new Object[] {
            T01LY70_A396EmprCod, T01LY70_A1013DibCli, T01LY70_A252CliCod, T01LY70_A1014DibInt, T01LY70_A1029DibLin, T01LY70_A2088DibDibMol, T01LY70_n2088DibDibMol
            }
         }
      );
      Z396EmprCod = "" ;
      E396EmprCod = "" ;
      A396EmprCod = "" ;
      AV33Pgmname = "TTrn20" ;
   }

   private byte Z499GrpFamCod ;
   private byte Z583IntCod ;
   private byte Z2098MolCod ;
   private byte O6045TotParCol ;
   private byte GxWebError ;
   private byte A2098MolCod ;
   private byte A499GrpFamCod ;
   private byte A583IntCod ;
   private byte nKeyPressed ;
   private byte s6045TotParCol ;
   private byte A6045TotParCol ;
   private byte A2099MolCodVir ;
   private byte T6045TotParCol ;
   private byte Gx_BScreen ;
   private byte Z6045TotParCol ;
   private byte subGrid1_Backcolorstyle ;
   private byte subGrid1_Backstyle ;
   private byte B6045TotParCol ;
   private byte subGrid2_Backcolorstyle ;
   private byte subGrid2_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private byte subGrid2_Allowselection ;
   private byte subGrid2_Allowhovering ;
   private byte subGrid2_Allowcollapsing ;
   private byte subGrid2_Collapsed ;
   private byte ZZ583IntCod ;
   private byte ZZ499GrpFamCod ;
   private byte E2098MolCod ;
   private byte X2089DibLinMol ;
   private byte X2088DibDibMol ;
   private short Z2079ColMolCil ;
   private short Z2536ForPrdUL ;
   private short Z9608MolPorVar ;
   private short Z2655PasForUL ;
   private short Z8052Dg_codigo ;
   private short nRcdDeleted_557 ;
   private short nRcdExists_557 ;
   private short nIsMod_557 ;
   private short Z2535ForPrdLin ;
   private short Z6046PrdForPar ;
   private short O6046PrdForPar ;
   private short nRcdDeleted_558 ;
   private short nRcdExists_558 ;
   private short nIsMod_558 ;
   private short A8052Dg_codigo ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A1019DibMolCil ;
   private short A2090DibMolCi2 ;
   private short A2079ColMolCil ;
   private short A2075ColEstAnh ;
   private short nBlankRcdCount557 ;
   private short RcdFound557 ;
   private short nBlankRcdUsr557 ;
   private short RcdFound558 ;
   private short A2535ForPrdLin ;
   private short A6046PrdForPar ;
   private short T6046PrdForPar ;
   private short A2536ForPrdUL ;
   private short A8054Dg_Degr ;
   private short A8055Dg_Valor ;
   private short A9608MolPorVar ;
   private short A2655PasForUL ;
   private short Z2075ColEstAnh ;
   private short Z1019DibMolCil ;
   private short Z2090DibMolCi2 ;
   private short RcdFound556 ;
   private short nIsDirty_556 ;
   private short Z8054Dg_Degr ;
   private short nIsDirty_557 ;
   private short nIsDirty_558 ;
   private short nBlankRcdCount558 ;
   private short nBlankRcdUsr558 ;
   private short subGrid1_Borderwidth ;
   private short ZZ2079ColMolCil ;
   private short ZZ2075ColEstAnh ;
   private short ZZ1019DibMolCil ;
   private short ZZ2090DibMolCi2 ;
   private short Z8055Dg_Valor ;
   private int Z252CliCod ;
   private int Z1014DibInt ;
   private int nRC_GXsfl_150 ;
   private int nGXsfl_150_idx=1 ;
   private int nRC_GXsfl_257 ;
   private int nGXsfl_257_idx=1 ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtSerEst_Enabled ;
   private int edtDibCli_Enabled ;
   private int edtDibInt_Enabled ;
   private int edtColCom_Enabled ;
   private int edtColFon_Enabled ;
   private int bttBtn_get_Visible ;
   private int bttBtn_get_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtDibMolCil_Enabled ;
   private int edtDibMolCi2_Enabled ;
   private int edtColMolCil_Enabled ;
   private int edtColEstSer_Enabled ;
   private int edtColEstAnh_Enabled ;
   private int edtColCodExt_Enabled ;
   private int edtColEstMba_Enabled ;
   private int edtDibCob_Enabled ;
   private int edtIntCod_Enabled ;
   private int edtIntDsc_Enabled ;
   private int edtColBmp_Enabled ;
   private int edtDibBmp_Enabled ;
   private int edtGrpFamCod_Enabled ;
   private int edtGrpFamDsc_Enabled ;
   private int edtColNomCol_Enabled ;
   private int edtColGrm2_Enabled ;
   private int edtMolCod_Enabled ;
   private int edtMolCon_Enabled ;
   private int edtMolDib_Enabled ;
   private int edtMolCodVir_Enabled ;
   private int edtForPrdUL_Enabled ;
   private int edtMolPesMin_Enabled ;
   private int edtMolForEst_Enabled ;
   private int edtMolPesMax_Enabled ;
   private int edtMolCol_Enabled ;
   private int edtMolPrcCob_Enabled ;
   private int edtTotParCol_Enabled ;
   private int edtTotColMol_Enabled ;
   private int edtDg_codigo_Enabled ;
   private int edtDg_Degr_Enabled ;
   private int edtDg_Valor_Enabled ;
   private int edtMolActivo_Enabled ;
   private int edtMolPorVar_Enabled ;
   private int edtTaesId2_Enabled ;
   private int edtTaesDc2_Enabled ;
   private int edtPasForUL_Enabled ;
   private int fRowAdded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_check_Visible ;
   private int bttBtn_check_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int bttBtn_help_Visible ;
   private int edtavnRcdDeleted_558_Enabled ;
   private int edtForPrdLin_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtUniEstCod_Enabled ;
   private int edtPrdForCan_Enabled ;
   private int edtPrdForPar_Enabled ;
   private int GX_JID ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int GRID1_IsPaging ;
   private int subGrid2_Backcolor ;
   private int subGrid2_Allbackcolor ;
   private int defedtForPrdLin_Enabled ;
   private int defedtMolCod_Enabled ;
   private int idxLst ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int subGrid2_Selectedindex ;
   private int subGrid2_Selectioncolor ;
   private int subGrid2_Hoveringcolor ;
   private int edtColGrm2_Backcolor ;
   private int edtColNomCol_Backcolor ;
   private int edtGrpFamDsc_Backcolor ;
   private int edtGrpFamCod_Backcolor ;
   private int edtDibBmp_Backcolor ;
   private int edtColBmp_Backcolor ;
   private int edtIntDsc_Backcolor ;
   private int edtIntCod_Backcolor ;
   private int edtDibCob_Backcolor ;
   private int edtColEstMba_Backcolor ;
   private int edtColCodExt_Backcolor ;
   private int edtColEstAnh_Backcolor ;
   private int edtColEstSer_Backcolor ;
   private int edtColMolCil_Backcolor ;
   private int edtDibMolCi2_Backcolor ;
   private int edtDibMolCil_Backcolor ;
   private int edtCliNom_Backcolor ;
   private int edtEmprNom_Backcolor ;
   private int edtColFon_Backcolor ;
   private int edtColCom_Backcolor ;
   private int edtDibInt_Backcolor ;
   private int edtDibCli_Backcolor ;
   private int edtSerEst_Backcolor ;
   private int edtCliCod_Backcolor ;
   private int edtEmprCod_Backcolor ;
   private int ZZ252CliCod ;
   private int ZZ1014DibInt ;
   private int E252CliCod ;
   private int E1014DibInt ;
   private long GRID1_nFirstRecordOnPage ;
   private long GRID2_nFirstRecordOnPage ;
   private long GRID2_nCurrentRecord ;
   private java.math.BigDecimal Z2076ColEstMba ;
   private java.math.BigDecimal Z10770ColGrm2 ;
   private java.math.BigDecimal Z2100MolCon ;
   private java.math.BigDecimal Z2650MolPesMin ;
   private java.math.BigDecimal Z2649MolPesMax ;
   private java.math.BigDecimal O6047TotColMol ;
   private java.math.BigDecimal Z2116PrdForCan ;
   private java.math.BigDecimal O2116PrdForCan ;
   private java.math.BigDecimal A2076ColEstMba ;
   private java.math.BigDecimal A4861DibCob ;
   private java.math.BigDecimal A10770ColGrm2 ;
   private java.math.BigDecimal s6047TotColMol ;
   private java.math.BigDecimal A6047TotColMol ;
   private java.math.BigDecimal A2116PrdForCan ;
   private java.math.BigDecimal T2116PrdForCan ;
   private java.math.BigDecimal A2100MolCon ;
   private java.math.BigDecimal A2650MolPesMin ;
   private java.math.BigDecimal A2649MolPesMax ;
   private java.math.BigDecimal A4862MolPrcCob ;
   private java.math.BigDecimal T6047TotColMol ;
   private java.math.BigDecimal Z4861DibCob ;
   private java.math.BigDecimal Z6047TotColMol ;
   private java.math.BigDecimal B6047TotColMol ;
   private java.math.BigDecimal ZZ2076ColEstMba ;
   private java.math.BigDecimal ZZ10770ColGrm2 ;
   private java.math.BigDecimal ZZ4861DibCob ;
   private java.math.BigDecimal X5381DibPrcCobM ;
   private java.math.BigDecimal X4860DibPrcCob ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z2141SerEst ;
   private String Z1013DibCli ;
   private String Z2074ColCom ;
   private String Z2078ColFon ;
   private String Z5336ColCodExt ;
   private String Z7028ColBmp ;
   private String Z8419ColNomCol ;
   private String Z2648MolForEst ;
   private String Z4420MolCol ;
   private String Z11759TaesId2 ;
   private String Z719PrdNum ;
   private String Z2144UniEstCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A1013DibCli ;
   private String A11759TaesId2 ;
   private String A1823DibTipMaq ;
   private String A2141SerEst ;
   private String A2074ColCom ;
   private String A2078ColFon ;
   private String A719PrdNum ;
   private String A2144UniEstCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliCod_Internalname ;
   private String sGXsfl_150_idx="0001" ;
   private String Gx_mode ;
   private String sGXsfl_257_idx="0001" ;
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
   private String edtCliCod_Jsonclick ;
   private String lblTextblock3_Internalname ;
   private String lblTextblock3_Jsonclick ;
   private String edtSerEst_Internalname ;
   private String edtSerEst_Jsonclick ;
   private String lblTextblock4_Internalname ;
   private String lblTextblock4_Jsonclick ;
   private String edtDibCli_Internalname ;
   private String edtDibCli_Jsonclick ;
   private String lblTextblock5_Internalname ;
   private String lblTextblock5_Jsonclick ;
   private String edtDibInt_Internalname ;
   private String edtDibInt_Jsonclick ;
   private String lblTextblock6_Internalname ;
   private String lblTextblock6_Jsonclick ;
   private String edtColCom_Internalname ;
   private String edtColCom_Jsonclick ;
   private String lblTextblock7_Internalname ;
   private String lblTextblock7_Jsonclick ;
   private String edtColFon_Internalname ;
   private String edtColFon_Jsonclick ;
   private String bttBtn_get_Internalname ;
   private String bttBtn_get_Jsonclick ;
   private String lblTextblock8_Internalname ;
   private String lblTextblock8_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String lblTextblock9_Internalname ;
   private String lblTextblock9_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String lblTextblock10_Internalname ;
   private String lblTextblock10_Jsonclick ;
   private String lblTextblock11_Internalname ;
   private String lblTextblock11_Jsonclick ;
   private String edtDibMolCil_Internalname ;
   private String edtDibMolCil_Jsonclick ;
   private String lblTextblock12_Internalname ;
   private String lblTextblock12_Jsonclick ;
   private String edtDibMolCi2_Internalname ;
   private String edtDibMolCi2_Jsonclick ;
   private String lblTextblock13_Internalname ;
   private String lblTextblock13_Jsonclick ;
   private String edtColMolCil_Internalname ;
   private String edtColMolCil_Jsonclick ;
   private String lblTextblock14_Internalname ;
   private String lblTextblock14_Jsonclick ;
   private String edtColEstSer_Internalname ;
   private String A2077ColEstSer ;
   private String edtColEstSer_Jsonclick ;
   private String lblTextblock15_Internalname ;
   private String lblTextblock15_Jsonclick ;
   private String edtColEstAnh_Internalname ;
   private String edtColEstAnh_Jsonclick ;
   private String lblTextblock16_Internalname ;
   private String lblTextblock16_Jsonclick ;
   private String edtColCodExt_Internalname ;
   private String A5336ColCodExt ;
   private String edtColCodExt_Jsonclick ;
   private String lblTextblock17_Internalname ;
   private String lblTextblock17_Jsonclick ;
   private String edtColEstMba_Internalname ;
   private String edtColEstMba_Jsonclick ;
   private String lblTextblock18_Internalname ;
   private String lblTextblock18_Jsonclick ;
   private String edtDibCob_Internalname ;
   private String edtDibCob_Jsonclick ;
   private String lblTextblock19_Internalname ;
   private String lblTextblock19_Jsonclick ;
   private String edtIntCod_Internalname ;
   private String edtIntCod_Jsonclick ;
   private String lblTextblock20_Internalname ;
   private String lblTextblock20_Jsonclick ;
   private String edtIntDsc_Internalname ;
   private String A584IntDsc ;
   private String edtIntDsc_Jsonclick ;
   private String lblTextblock21_Internalname ;
   private String lblTextblock21_Jsonclick ;
   private String edtColBmp_Internalname ;
   private String A7028ColBmp ;
   private String edtColBmp_Jsonclick ;
   private String lblTextblock22_Internalname ;
   private String lblTextblock22_Jsonclick ;
   private String edtDibBmp_Internalname ;
   private String A7140DibBmp ;
   private String edtDibBmp_Jsonclick ;
   private String lblTextblock23_Internalname ;
   private String lblTextblock23_Jsonclick ;
   private String edtGrpFamCod_Internalname ;
   private String edtGrpFamCod_Jsonclick ;
   private String lblTextblock24_Internalname ;
   private String lblTextblock24_Jsonclick ;
   private String edtGrpFamDsc_Internalname ;
   private String A500GrpFamDsc ;
   private String edtGrpFamDsc_Jsonclick ;
   private String lblTextblock25_Internalname ;
   private String lblTextblock25_Jsonclick ;
   private String edtColNomCol_Internalname ;
   private String A8419ColNomCol ;
   private String edtColNomCol_Jsonclick ;
   private String lblTextblock26_Internalname ;
   private String lblTextblock26_Jsonclick ;
   private String edtColGrm2_Internalname ;
   private String edtColGrm2_Jsonclick ;
   private String sMode557 ;
   private String edtMolCod_Internalname ;
   private String edtMolCon_Internalname ;
   private String edtMolDib_Internalname ;
   private String edtMolCodVir_Internalname ;
   private String edtForPrdUL_Internalname ;
   private String edtMolPesMin_Internalname ;
   private String edtMolForEst_Internalname ;
   private String edtMolPesMax_Internalname ;
   private String edtMolCol_Internalname ;
   private String edtMolPrcCob_Internalname ;
   private String edtTotParCol_Internalname ;
   private String edtTotColMol_Internalname ;
   private String edtDg_codigo_Internalname ;
   private String edtDg_Degr_Internalname ;
   private String edtDg_Valor_Internalname ;
   private String edtMolActivo_Internalname ;
   private String edtMolPorVar_Internalname ;
   private String edtTaesId2_Internalname ;
   private String edtTaesDc2_Internalname ;
   private String edtPasForUL_Internalname ;
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
   private String AV33Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String edtavnRcdDeleted_558_Internalname ;
   private String sMode556 ;
   private String GXCCtl ;
   private String edtForPrdLin_Internalname ;
   private String edtPrdNum_Internalname ;
   private String edtPrdNom_Internalname ;
   private String A718PrdNom ;
   private String edtUniEstCod_Internalname ;
   private String edtPrdForCan_Internalname ;
   private String edtPrdForPar_Internalname ;
   private String A2101MolDib ;
   private String A2648MolForEst ;
   private String A4420MolCol ;
   private String A8418MolActivo ;
   private String A11760TaesDc2 ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV12Station ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z2077ColEstSer ;
   private String Z1823DibTipMaq ;
   private String Z7140DibBmp ;
   private String Z584IntDsc ;
   private String Z500GrpFamDsc ;
   private String Z718PrdNom ;
   private String sMode558 ;
   private String lblTextblock27_Internalname ;
   private String lblTextblock28_Internalname ;
   private String lblTextblock29_Internalname ;
   private String lblTextblock30_Internalname ;
   private String lblTextblock31_Internalname ;
   private String lblTextblock32_Internalname ;
   private String lblTextblock33_Internalname ;
   private String lblTextblock34_Internalname ;
   private String lblTextblock35_Internalname ;
   private String lblTextblock36_Internalname ;
   private String lblTextblock37_Internalname ;
   private String lblTextblock38_Internalname ;
   private String lblTextblock39_Internalname ;
   private String lblTextblock40_Internalname ;
   private String lblTextblock41_Internalname ;
   private String lblTextblock42_Internalname ;
   private String lblTextblock43_Internalname ;
   private String lblTextblock44_Internalname ;
   private String lblTextblock45_Internalname ;
   private String lblTextblock46_Internalname ;
   private String subGrid2_Internalname ;
   private String sGXsfl_150_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String tblTable3_Internalname ;
   private String lblTextblock27_Jsonclick ;
   private String ROClassString ;
   private String edtMolCod_Jsonclick ;
   private String lblTextblock28_Jsonclick ;
   private String edtMolCon_Jsonclick ;
   private String lblTextblock29_Jsonclick ;
   private String edtMolDib_Jsonclick ;
   private String lblTextblock30_Jsonclick ;
   private String edtMolCodVir_Jsonclick ;
   private String lblTextblock31_Jsonclick ;
   private String edtForPrdUL_Jsonclick ;
   private String lblTextblock32_Jsonclick ;
   private String edtMolPesMin_Jsonclick ;
   private String lblTextblock33_Jsonclick ;
   private String edtMolForEst_Jsonclick ;
   private String lblTextblock34_Jsonclick ;
   private String edtMolPesMax_Jsonclick ;
   private String lblTextblock35_Jsonclick ;
   private String edtMolCol_Jsonclick ;
   private String lblTextblock36_Jsonclick ;
   private String edtMolPrcCob_Jsonclick ;
   private String lblTextblock37_Jsonclick ;
   private String edtTotParCol_Jsonclick ;
   private String lblTextblock38_Jsonclick ;
   private String edtTotColMol_Jsonclick ;
   private String lblTextblock39_Jsonclick ;
   private String edtDg_codigo_Jsonclick ;
   private String lblTextblock40_Jsonclick ;
   private String edtDg_Degr_Jsonclick ;
   private String lblTextblock41_Jsonclick ;
   private String edtDg_Valor_Jsonclick ;
   private String lblTextblock42_Jsonclick ;
   private String edtMolActivo_Jsonclick ;
   private String lblTextblock43_Jsonclick ;
   private String edtMolPorVar_Jsonclick ;
   private String lblTextblock44_Jsonclick ;
   private String edtTaesId2_Jsonclick ;
   private String lblTextblock45_Jsonclick ;
   private String edtTaesDc2_Jsonclick ;
   private String lblTextblock46_Jsonclick ;
   private String edtPasForUL_Jsonclick ;
   private String sGXsfl_257_fel_idx="0001" ;
   private String subGrid2_Class ;
   private String subGrid2_Linesclass ;
   private String edtavnRcdDeleted_558_Jsonclick ;
   private String edtForPrdLin_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtUniEstCod_Jsonclick ;
   private String edtPrdForCan_Jsonclick ;
   private String edtPrdForPar_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGrid1_Header ;
   private String lblTextblock27_Caption ;
   private String lblTextblock28_Caption ;
   private String lblTextblock29_Caption ;
   private String lblTextblock30_Caption ;
   private String lblTextblock31_Caption ;
   private String lblTextblock32_Caption ;
   private String lblTextblock33_Caption ;
   private String lblTextblock34_Caption ;
   private String lblTextblock35_Caption ;
   private String lblTextblock36_Caption ;
   private String lblTextblock37_Caption ;
   private String lblTextblock38_Caption ;
   private String lblTextblock39_Caption ;
   private String lblTextblock40_Caption ;
   private String lblTextblock41_Caption ;
   private String lblTextblock42_Caption ;
   private String lblTextblock43_Caption ;
   private String lblTextblock44_Caption ;
   private String lblTextblock45_Caption ;
   private String lblTextblock46_Caption ;
   private String subGrid2_Header ;
   private String ZZ396EmprCod ;
   private String ZZ2141SerEst ;
   private String ZZ1013DibCli ;
   private String ZZ2074ColCom ;
   private String ZZ2078ColFon ;
   private String ZZ407EmprNom ;
   private String ZZ5336ColCodExt ;
   private String ZZ7028ColBmp ;
   private String ZZ8419ColNomCol ;
   private String ZZ500GrpFamDsc ;
   private String ZZ584IntDsc ;
   private String ZZ279CliNom ;
   private String ZZ2077ColEstSer ;
   private String ZZ1823DibTipMaq ;
   private String ZZ7140DibBmp ;
   private String Z8418MolActivo ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String Z11760TaesDc2 ;
   private String E396EmprCod ;
   private String E1013DibCli ;
   private String X1030DibRelMC ;
   private String X2092DibRelMC2 ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n11759TaesId2 ;
   private boolean n1823DibTipMaq ;
   private boolean n499GrpFamCod ;
   private boolean n583IntCod ;
   private boolean n8052Dg_codigo ;
   private boolean n719PrdNum ;
   private boolean n2144UniEstCod ;
   private boolean wbErr ;
   private boolean bGXsfl_150_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n1019DibMolCil ;
   private boolean n2090DibMolCi2 ;
   private boolean n2079ColMolCil ;
   private boolean n2077ColEstSer ;
   private boolean n2075ColEstAnh ;
   private boolean n5336ColCodExt ;
   private boolean n2076ColEstMba ;
   private boolean n4861DibCob ;
   private boolean n584IntDsc ;
   private boolean n7028ColBmp ;
   private boolean n7140DibBmp ;
   private boolean n500GrpFamDsc ;
   private boolean n8419ColNomCol ;
   private boolean n10770ColGrm2 ;
   private boolean bGXsfl_257_Refreshing=false ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean n2100MolCon ;
   private boolean n2536ForPrdUL ;
   private boolean n2650MolPesMin ;
   private boolean n2648MolForEst ;
   private boolean n2649MolPesMax ;
   private boolean n4420MolCol ;
   private boolean n8054Dg_Degr ;
   private boolean n9608MolPorVar ;
   private boolean n2655PasForUL ;
   private boolean n2116PrdForCan ;
   private boolean n6046PrdForPar ;
   private boolean Gx_first ;
   private boolean nX5381DibPrcCobM ;
   private boolean nX4860DibPrcCob ;
   private boolean nX1030DibRelMC ;
   private boolean nX2092DibRelMC2 ;
   private boolean nX2089DibLinMol ;
   private boolean nX2088DibDibMol ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebGrid Grid2Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebRow Grid2Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.webpanels.GXWebColumn Grid2Column ;
   private HTMLChoice lstDibTipMaq ;
   private IDataStoreProvider pr_default ;
   private String[] T01LY13_A407EmprNom ;
   private boolean[] T01LY13_n407EmprNom ;
   private String[] T01LY19_A65ArtCod ;
   private String[] T01LY19_A2141SerEst ;
   private String[] T01LY19_A2074ColCom ;
   private String[] T01LY19_A2078ColFon ;
   private String[] T01LY19_A407EmprNom ;
   private boolean[] T01LY19_n407EmprNom ;
   private String[] T01LY19_A279CliNom ;
   private String[] T01LY19_A1823DibTipMaq ;
   private boolean[] T01LY19_n1823DibTipMaq ;
   private short[] T01LY19_A1019DibMolCil ;
   private boolean[] T01LY19_n1019DibMolCil ;
   private short[] T01LY19_A2090DibMolCi2 ;
   private boolean[] T01LY19_n2090DibMolCi2 ;
   private short[] T01LY19_A2079ColMolCil ;
   private boolean[] T01LY19_n2079ColMolCil ;
   private String[] T01LY19_A5336ColCodExt ;
   private boolean[] T01LY19_n5336ColCodExt ;
   private java.math.BigDecimal[] T01LY19_A2076ColEstMba ;
   private boolean[] T01LY19_n2076ColEstMba ;
   private java.math.BigDecimal[] T01LY19_A4861DibCob ;
   private boolean[] T01LY19_n4861DibCob ;
   private String[] T01LY19_A584IntDsc ;
   private boolean[] T01LY19_n584IntDsc ;
   private String[] T01LY19_A7028ColBmp ;
   private boolean[] T01LY19_n7028ColBmp ;
   private String[] T01LY19_A7140DibBmp ;
   private boolean[] T01LY19_n7140DibBmp ;
   private String[] T01LY19_A500GrpFamDsc ;
   private boolean[] T01LY19_n500GrpFamDsc ;
   private String[] T01LY19_A8419ColNomCol ;
   private boolean[] T01LY19_n8419ColNomCol ;
   private java.math.BigDecimal[] T01LY19_A10770ColGrm2 ;
   private boolean[] T01LY19_n10770ColGrm2 ;
   private String[] T01LY19_A396EmprCod ;
   private int[] T01LY19_A252CliCod ;
   private byte[] T01LY19_A499GrpFamCod ;
   private boolean[] T01LY19_n499GrpFamCod ;
   private byte[] T01LY19_A583IntCod ;
   private boolean[] T01LY19_n583IntCod ;
   private String[] T01LY19_A1013DibCli ;
   private int[] T01LY19_A1014DibInt ;
   private short[] T01LY19_A2075ColEstAnh ;
   private boolean[] T01LY19_n2075ColEstAnh ;
   private String[] T01LY19_A2077ColEstSer ;
   private boolean[] T01LY19_n2077ColEstSer ;
   private String[] T01LY15_A500GrpFamDsc ;
   private boolean[] T01LY15_n500GrpFamDsc ;
   private String[] T01LY16_A584IntDsc ;
   private boolean[] T01LY16_n584IntDsc ;
   private String[] T01LY14_A279CliNom ;
   private short[] T01LY18_A2075ColEstAnh ;
   private boolean[] T01LY18_n2075ColEstAnh ;
   private String[] T01LY18_A2077ColEstSer ;
   private boolean[] T01LY18_n2077ColEstSer ;
   private String[] T01LY17_A1823DibTipMaq ;
   private boolean[] T01LY17_n1823DibTipMaq ;
   private short[] T01LY17_A1019DibMolCil ;
   private boolean[] T01LY17_n1019DibMolCil ;
   private short[] T01LY17_A2090DibMolCi2 ;
   private boolean[] T01LY17_n2090DibMolCi2 ;
   private java.math.BigDecimal[] T01LY17_A4861DibCob ;
   private boolean[] T01LY17_n4861DibCob ;
   private String[] T01LY17_A7140DibBmp ;
   private boolean[] T01LY17_n7140DibBmp ;
   private String[] T01LY20_A500GrpFamDsc ;
   private boolean[] T01LY20_n500GrpFamDsc ;
   private String[] T01LY21_A584IntDsc ;
   private boolean[] T01LY21_n584IntDsc ;
   private String[] T01LY22_A279CliNom ;
   private short[] T01LY23_A2075ColEstAnh ;
   private boolean[] T01LY23_n2075ColEstAnh ;
   private String[] T01LY23_A2077ColEstSer ;
   private boolean[] T01LY23_n2077ColEstSer ;
   private String[] T01LY24_A1823DibTipMaq ;
   private boolean[] T01LY24_n1823DibTipMaq ;
   private short[] T01LY24_A1019DibMolCil ;
   private boolean[] T01LY24_n1019DibMolCil ;
   private short[] T01LY24_A2090DibMolCi2 ;
   private boolean[] T01LY24_n2090DibMolCi2 ;
   private java.math.BigDecimal[] T01LY24_A4861DibCob ;
   private boolean[] T01LY24_n4861DibCob ;
   private String[] T01LY24_A7140DibBmp ;
   private boolean[] T01LY24_n7140DibBmp ;
   private String[] T01LY25_A396EmprCod ;
   private int[] T01LY25_A252CliCod ;
   private String[] T01LY25_A2141SerEst ;
   private String[] T01LY25_A1013DibCli ;
   private int[] T01LY25_A1014DibInt ;
   private String[] T01LY25_A2074ColCom ;
   private String[] T01LY25_A2078ColFon ;
   private String[] T01LY12_A2141SerEst ;
   private String[] T01LY12_A2074ColCom ;
   private String[] T01LY12_A2078ColFon ;
   private short[] T01LY12_A2079ColMolCil ;
   private boolean[] T01LY12_n2079ColMolCil ;
   private String[] T01LY12_A5336ColCodExt ;
   private boolean[] T01LY12_n5336ColCodExt ;
   private java.math.BigDecimal[] T01LY12_A2076ColEstMba ;
   private boolean[] T01LY12_n2076ColEstMba ;
   private String[] T01LY12_A7028ColBmp ;
   private boolean[] T01LY12_n7028ColBmp ;
   private String[] T01LY12_A8419ColNomCol ;
   private boolean[] T01LY12_n8419ColNomCol ;
   private java.math.BigDecimal[] T01LY12_A10770ColGrm2 ;
   private boolean[] T01LY12_n10770ColGrm2 ;
   private String[] T01LY12_A396EmprCod ;
   private int[] T01LY12_A252CliCod ;
   private byte[] T01LY12_A499GrpFamCod ;
   private boolean[] T01LY12_n499GrpFamCod ;
   private byte[] T01LY12_A583IntCod ;
   private boolean[] T01LY12_n583IntCod ;
   private String[] T01LY12_A1013DibCli ;
   private int[] T01LY12_A1014DibInt ;
   private String[] T01LY26_A396EmprCod ;
   private int[] T01LY26_A252CliCod ;
   private String[] T01LY26_A2141SerEst ;
   private String[] T01LY26_A1013DibCli ;
   private int[] T01LY26_A1014DibInt ;
   private String[] T01LY26_A2074ColCom ;
   private String[] T01LY26_A2078ColFon ;
   private String[] T01LY27_A396EmprCod ;
   private int[] T01LY27_A252CliCod ;
   private String[] T01LY27_A2141SerEst ;
   private String[] T01LY27_A1013DibCli ;
   private int[] T01LY27_A1014DibInt ;
   private String[] T01LY27_A2074ColCom ;
   private String[] T01LY27_A2078ColFon ;
   private String[] T01LY11_A2141SerEst ;
   private String[] T01LY11_A2074ColCom ;
   private String[] T01LY11_A2078ColFon ;
   private short[] T01LY11_A2079ColMolCil ;
   private boolean[] T01LY11_n2079ColMolCil ;
   private String[] T01LY11_A5336ColCodExt ;
   private boolean[] T01LY11_n5336ColCodExt ;
   private java.math.BigDecimal[] T01LY11_A2076ColEstMba ;
   private boolean[] T01LY11_n2076ColEstMba ;
   private String[] T01LY11_A7028ColBmp ;
   private boolean[] T01LY11_n7028ColBmp ;
   private String[] T01LY11_A8419ColNomCol ;
   private boolean[] T01LY11_n8419ColNomCol ;
   private java.math.BigDecimal[] T01LY11_A10770ColGrm2 ;
   private boolean[] T01LY11_n10770ColGrm2 ;
   private String[] T01LY11_A396EmprCod ;
   private int[] T01LY11_A252CliCod ;
   private byte[] T01LY11_A499GrpFamCod ;
   private boolean[] T01LY11_n499GrpFamCod ;
   private byte[] T01LY11_A583IntCod ;
   private boolean[] T01LY11_n583IntCod ;
   private String[] T01LY11_A1013DibCli ;
   private int[] T01LY11_A1014DibInt ;
   private String[] T01LY31_A279CliNom ;
   private short[] T01LY32_A2075ColEstAnh ;
   private boolean[] T01LY32_n2075ColEstAnh ;
   private String[] T01LY32_A2077ColEstSer ;
   private boolean[] T01LY32_n2077ColEstSer ;
   private String[] T01LY33_A1823DibTipMaq ;
   private boolean[] T01LY33_n1823DibTipMaq ;
   private short[] T01LY33_A1019DibMolCil ;
   private boolean[] T01LY33_n1019DibMolCil ;
   private short[] T01LY33_A2090DibMolCi2 ;
   private boolean[] T01LY33_n2090DibMolCi2 ;
   private java.math.BigDecimal[] T01LY33_A4861DibCob ;
   private boolean[] T01LY33_n4861DibCob ;
   private String[] T01LY33_A7140DibBmp ;
   private boolean[] T01LY33_n7140DibBmp ;
   private String[] T01LY34_A584IntDsc ;
   private boolean[] T01LY34_n584IntDsc ;
   private String[] T01LY35_A500GrpFamDsc ;
   private boolean[] T01LY35_n500GrpFamDsc ;
   private String[] T01LY36_A396EmprCod ;
   private int[] T01LY36_A252CliCod ;
   private String[] T01LY36_A2141SerEst ;
   private String[] T01LY36_A1013DibCli ;
   private int[] T01LY36_A1014DibInt ;
   private String[] T01LY36_A2074ColCom ;
   private String[] T01LY36_A2078ColFon ;
   private short[] T01LY36_A11712ClaveID ;
   private String[] T01LY37_A396EmprCod ;
   private int[] T01LY37_A252CliCod ;
   private String[] T01LY37_A2141SerEst ;
   private String[] T01LY37_A1013DibCli ;
   private int[] T01LY37_A1014DibInt ;
   private String[] T01LY37_A2074ColCom ;
   private String[] T01LY37_A2078ColFon ;
   private byte[] T01LY37_A2095ForObsLin ;
   private String[] T01LY38_A396EmprCod ;
   private int[] T01LY38_A252CliCod ;
   private String[] T01LY38_A2141SerEst ;
   private String[] T01LY38_A1013DibCli ;
   private int[] T01LY38_A1014DibInt ;
   private String[] T01LY38_A2074ColCom ;
   private String[] T01LY38_A2078ColFon ;
   private byte[] T01LY38_A2098MolCod ;
   private String[] T01LY39_A396EmprCod ;
   private int[] T01LY39_A252CliCod ;
   private String[] T01LY39_A2141SerEst ;
   private String[] T01LY39_A1013DibCli ;
   private int[] T01LY39_A1014DibInt ;
   private String[] T01LY39_A2074ColCom ;
   private String[] T01LY39_A2078ColFon ;
   private int[] T01LY41_A252CliCod ;
   private String[] T01LY41_A2141SerEst ;
   private String[] T01LY41_A1013DibCli ;
   private int[] T01LY41_A1014DibInt ;
   private String[] T01LY41_A2074ColCom ;
   private String[] T01LY41_A2078ColFon ;
   private byte[] T01LY41_A2098MolCod ;
   private java.math.BigDecimal[] T01LY41_A2100MolCon ;
   private boolean[] T01LY41_n2100MolCon ;
   private short[] T01LY41_A2536ForPrdUL ;
   private boolean[] T01LY41_n2536ForPrdUL ;
   private java.math.BigDecimal[] T01LY41_A2650MolPesMin ;
   private boolean[] T01LY41_n2650MolPesMin ;
   private String[] T01LY41_A2648MolForEst ;
   private boolean[] T01LY41_n2648MolForEst ;
   private java.math.BigDecimal[] T01LY41_A2649MolPesMax ;
   private boolean[] T01LY41_n2649MolPesMax ;
   private String[] T01LY41_A4420MolCol ;
   private boolean[] T01LY41_n4420MolCol ;
   private short[] T01LY41_A8054Dg_Degr ;
   private boolean[] T01LY41_n8054Dg_Degr ;
   private short[] T01LY41_A9608MolPorVar ;
   private boolean[] T01LY41_n9608MolPorVar ;
   private String[] T01LY41_A11759TaesId2 ;
   private boolean[] T01LY41_n11759TaesId2 ;
   private short[] T01LY41_A2655PasForUL ;
   private boolean[] T01LY41_n2655PasForUL ;
   private String[] T01LY41_A396EmprCod ;
   private short[] T01LY41_A8052Dg_codigo ;
   private boolean[] T01LY41_n8052Dg_codigo ;
   private byte[] T01LY41_A6045TotParCol ;
   private java.math.BigDecimal[] T01LY41_A6047TotColMol ;
   private short[] T01LY8_A8054Dg_Degr ;
   private boolean[] T01LY8_n8054Dg_Degr ;
   private byte[] T01LY10_A6045TotParCol ;
   private java.math.BigDecimal[] T01LY10_A6047TotColMol ;
   private short[] T01LY42_A8054Dg_Degr ;
   private boolean[] T01LY42_n8054Dg_Degr ;
   private byte[] T01LY44_A6045TotParCol ;
   private java.math.BigDecimal[] T01LY44_A6047TotColMol ;
   private String[] T01LY45_A396EmprCod ;
   private int[] T01LY45_A252CliCod ;
   private String[] T01LY45_A2141SerEst ;
   private String[] T01LY45_A1013DibCli ;
   private int[] T01LY45_A1014DibInt ;
   private String[] T01LY45_A2074ColCom ;
   private String[] T01LY45_A2078ColFon ;
   private byte[] T01LY45_A2098MolCod ;
   private int[] T01LY7_A252CliCod ;
   private String[] T01LY7_A2141SerEst ;
   private String[] T01LY7_A1013DibCli ;
   private int[] T01LY7_A1014DibInt ;
   private String[] T01LY7_A2074ColCom ;
   private String[] T01LY7_A2078ColFon ;
   private byte[] T01LY7_A2098MolCod ;
   private java.math.BigDecimal[] T01LY7_A2100MolCon ;
   private boolean[] T01LY7_n2100MolCon ;
   private short[] T01LY7_A2536ForPrdUL ;
   private boolean[] T01LY7_n2536ForPrdUL ;
   private java.math.BigDecimal[] T01LY7_A2650MolPesMin ;
   private boolean[] T01LY7_n2650MolPesMin ;
   private String[] T01LY7_A2648MolForEst ;
   private boolean[] T01LY7_n2648MolForEst ;
   private java.math.BigDecimal[] T01LY7_A2649MolPesMax ;
   private boolean[] T01LY7_n2649MolPesMax ;
   private String[] T01LY7_A4420MolCol ;
   private boolean[] T01LY7_n4420MolCol ;
   private short[] T01LY7_A9608MolPorVar ;
   private boolean[] T01LY7_n9608MolPorVar ;
   private String[] T01LY7_A11759TaesId2 ;
   private boolean[] T01LY7_n11759TaesId2 ;
   private short[] T01LY7_A2655PasForUL ;
   private boolean[] T01LY7_n2655PasForUL ;
   private String[] T01LY7_A396EmprCod ;
   private short[] T01LY7_A8052Dg_codigo ;
   private boolean[] T01LY7_n8052Dg_codigo ;
   private int[] T01LY6_A252CliCod ;
   private String[] T01LY6_A2141SerEst ;
   private String[] T01LY6_A1013DibCli ;
   private int[] T01LY6_A1014DibInt ;
   private String[] T01LY6_A2074ColCom ;
   private String[] T01LY6_A2078ColFon ;
   private byte[] T01LY6_A2098MolCod ;
   private java.math.BigDecimal[] T01LY6_A2100MolCon ;
   private boolean[] T01LY6_n2100MolCon ;
   private short[] T01LY6_A2536ForPrdUL ;
   private boolean[] T01LY6_n2536ForPrdUL ;
   private java.math.BigDecimal[] T01LY6_A2650MolPesMin ;
   private boolean[] T01LY6_n2650MolPesMin ;
   private String[] T01LY6_A2648MolForEst ;
   private boolean[] T01LY6_n2648MolForEst ;
   private java.math.BigDecimal[] T01LY6_A2649MolPesMax ;
   private boolean[] T01LY6_n2649MolPesMax ;
   private String[] T01LY6_A4420MolCol ;
   private boolean[] T01LY6_n4420MolCol ;
   private short[] T01LY6_A9608MolPorVar ;
   private boolean[] T01LY6_n9608MolPorVar ;
   private String[] T01LY6_A11759TaesId2 ;
   private boolean[] T01LY6_n11759TaesId2 ;
   private short[] T01LY6_A2655PasForUL ;
   private boolean[] T01LY6_n2655PasForUL ;
   private String[] T01LY6_A396EmprCod ;
   private short[] T01LY6_A8052Dg_codigo ;
   private boolean[] T01LY6_n8052Dg_codigo ;
   private byte[] T01LY50_A6045TotParCol ;
   private java.math.BigDecimal[] T01LY50_A6047TotColMol ;
   private short[] T01LY51_A8054Dg_Degr ;
   private boolean[] T01LY51_n8054Dg_Degr ;
   private String[] T01LY52_A396EmprCod ;
   private int[] T01LY52_A252CliCod ;
   private String[] T01LY52_A2141SerEst ;
   private String[] T01LY52_A1013DibCli ;
   private int[] T01LY52_A1014DibInt ;
   private String[] T01LY52_A2074ColCom ;
   private String[] T01LY52_A2078ColFon ;
   private byte[] T01LY52_A2098MolCod ;
   private short[] T01LY52_A2654PasForLin ;
   private String[] T01LY53_A396EmprCod ;
   private int[] T01LY53_A252CliCod ;
   private String[] T01LY53_A2141SerEst ;
   private String[] T01LY53_A1013DibCli ;
   private int[] T01LY53_A1014DibInt ;
   private String[] T01LY53_A2074ColCom ;
   private String[] T01LY53_A2078ColFon ;
   private byte[] T01LY53_A2098MolCod ;
   private int[] T01LY54_A252CliCod ;
   private String[] T01LY54_A2141SerEst ;
   private String[] T01LY54_A1013DibCli ;
   private int[] T01LY54_A1014DibInt ;
   private String[] T01LY54_A2074ColCom ;
   private String[] T01LY54_A2078ColFon ;
   private byte[] T01LY54_A2098MolCod ;
   private short[] T01LY54_A2535ForPrdLin ;
   private String[] T01LY54_A718PrdNom ;
   private java.math.BigDecimal[] T01LY54_A2116PrdForCan ;
   private boolean[] T01LY54_n2116PrdForCan ;
   private short[] T01LY54_A6046PrdForPar ;
   private boolean[] T01LY54_n6046PrdForPar ;
   private String[] T01LY54_A396EmprCod ;
   private String[] T01LY54_A719PrdNum ;
   private boolean[] T01LY54_n719PrdNum ;
   private String[] T01LY54_A2144UniEstCod ;
   private boolean[] T01LY54_n2144UniEstCod ;
   private String[] T01LY4_A718PrdNom ;
   private String[] T01LY5_A2144UniEstCod ;
   private boolean[] T01LY5_n2144UniEstCod ;
   private String[] T01LY55_A718PrdNom ;
   private String[] T01LY56_A2144UniEstCod ;
   private boolean[] T01LY56_n2144UniEstCod ;
   private String[] T01LY57_A396EmprCod ;
   private int[] T01LY57_A252CliCod ;
   private String[] T01LY57_A2141SerEst ;
   private String[] T01LY57_A1013DibCli ;
   private int[] T01LY57_A1014DibInt ;
   private String[] T01LY57_A2074ColCom ;
   private String[] T01LY57_A2078ColFon ;
   private byte[] T01LY57_A2098MolCod ;
   private short[] T01LY57_A2535ForPrdLin ;
   private int[] T01LY3_A252CliCod ;
   private String[] T01LY3_A2141SerEst ;
   private String[] T01LY3_A1013DibCli ;
   private int[] T01LY3_A1014DibInt ;
   private String[] T01LY3_A2074ColCom ;
   private String[] T01LY3_A2078ColFon ;
   private byte[] T01LY3_A2098MolCod ;
   private short[] T01LY3_A2535ForPrdLin ;
   private java.math.BigDecimal[] T01LY3_A2116PrdForCan ;
   private boolean[] T01LY3_n2116PrdForCan ;
   private short[] T01LY3_A6046PrdForPar ;
   private boolean[] T01LY3_n6046PrdForPar ;
   private String[] T01LY3_A396EmprCod ;
   private String[] T01LY3_A719PrdNum ;
   private boolean[] T01LY3_n719PrdNum ;
   private String[] T01LY3_A2144UniEstCod ;
   private boolean[] T01LY3_n2144UniEstCod ;
   private int[] T01LY2_A252CliCod ;
   private String[] T01LY2_A2141SerEst ;
   private String[] T01LY2_A1013DibCli ;
   private int[] T01LY2_A1014DibInt ;
   private String[] T01LY2_A2074ColCom ;
   private String[] T01LY2_A2078ColFon ;
   private byte[] T01LY2_A2098MolCod ;
   private short[] T01LY2_A2535ForPrdLin ;
   private java.math.BigDecimal[] T01LY2_A2116PrdForCan ;
   private boolean[] T01LY2_n2116PrdForCan ;
   private short[] T01LY2_A6046PrdForPar ;
   private boolean[] T01LY2_n6046PrdForPar ;
   private String[] T01LY2_A396EmprCod ;
   private String[] T01LY2_A719PrdNum ;
   private boolean[] T01LY2_n719PrdNum ;
   private String[] T01LY2_A2144UniEstCod ;
   private boolean[] T01LY2_n2144UniEstCod ;
   private String[] T01LY61_A718PrdNom ;
   private String[] T01LY62_A396EmprCod ;
   private int[] T01LY62_A252CliCod ;
   private String[] T01LY62_A2141SerEst ;
   private String[] T01LY62_A1013DibCli ;
   private int[] T01LY62_A1014DibInt ;
   private String[] T01LY62_A2074ColCom ;
   private String[] T01LY62_A2078ColFon ;
   private byte[] T01LY62_A2098MolCod ;
   private short[] T01LY62_A2535ForPrdLin ;
   private String[] T01LY63_A407EmprNom ;
   private boolean[] T01LY63_n407EmprNom ;
   private String[] T01LY64_A2144UniEstCod ;
   private boolean[] T01LY64_n2144UniEstCod ;
   private String[] T01LY65_A396EmprCod ;
   private String[] T01LY65_A1013DibCli ;
   private int[] T01LY65_A252CliCod ;
   private int[] T01LY65_A1014DibInt ;
   private short[] T01LY65_A1029DibLin ;
   private java.math.BigDecimal[] T01LY65_A5381DibPrcCobM ;
   private boolean[] T01LY65_n5381DibPrcCobM ;
   private byte[] T01LY65_A2088DibDibMol ;
   private boolean[] T01LY65_n2088DibDibMol ;
   private String[] T01LY66_A396EmprCod ;
   private String[] T01LY66_A1013DibCli ;
   private int[] T01LY66_A252CliCod ;
   private int[] T01LY66_A1014DibInt ;
   private short[] T01LY66_A1807DibLinCil ;
   private java.math.BigDecimal[] T01LY66_A4860DibPrcCob ;
   private boolean[] T01LY66_n4860DibPrcCob ;
   private byte[] T01LY66_A2089DibLinMol ;
   private boolean[] T01LY66_n2089DibLinMol ;
   private String[] T01LY67_A396EmprCod ;
   private String[] T01LY67_A1013DibCli ;
   private int[] T01LY67_A252CliCod ;
   private int[] T01LY67_A1014DibInt ;
   private short[] T01LY67_A1807DibLinCil ;
   private String[] T01LY67_A1030DibRelMC ;
   private boolean[] T01LY67_n1030DibRelMC ;
   private byte[] T01LY67_A2089DibLinMol ;
   private boolean[] T01LY67_n2089DibLinMol ;
   private String[] T01LY68_A396EmprCod ;
   private String[] T01LY68_A1013DibCli ;
   private int[] T01LY68_A252CliCod ;
   private int[] T01LY68_A1014DibInt ;
   private short[] T01LY68_A1029DibLin ;
   private String[] T01LY68_A2092DibRelMC2 ;
   private boolean[] T01LY68_n2092DibRelMC2 ;
   private byte[] T01LY68_A2088DibDibMol ;
   private boolean[] T01LY68_n2088DibDibMol ;
   private String[] T01LY69_A396EmprCod ;
   private String[] T01LY69_A1013DibCli ;
   private int[] T01LY69_A252CliCod ;
   private int[] T01LY69_A1014DibInt ;
   private short[] T01LY69_A1807DibLinCil ;
   private byte[] T01LY69_A2089DibLinMol ;
   private boolean[] T01LY69_n2089DibLinMol ;
   private String[] T01LY70_A396EmprCod ;
   private String[] T01LY70_A1013DibCli ;
   private int[] T01LY70_A252CliCod ;
   private int[] T01LY70_A1014DibInt ;
   private short[] T01LY70_A1029DibLin ;
   private byte[] T01LY70_A2088DibDibMol ;
   private boolean[] T01LY70_n2088DibDibMol ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class ttrn20__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn20__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn20__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn20__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn20__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01LY2", "SELECT CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, ForPrdLin, PrdForCan, PrdForPar, EmprCod, PrdNum, UniEstCod FROM TXPRECPR2 WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND MolCod = ? AND ForPrdLin = ?  FOR UPDATE OF PrdForCan, PrdForPar, PrdNum, UniEstCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY3", "SELECT CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, ForPrdLin, PrdForCan, PrdForPar, EmprCod, PrdNum, UniEstCod FROM TXPRECPR2 WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND MolCod = ? AND ForPrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY4", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY5", "SELECT UniEstCod FROM TXPUNIEST WHERE UniEstCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY6", "SELECT CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, MolCon, ForPrdUL, MolPesMin, MolForEst, MolPesMax, MolCol, MolPorVar, TaesId2, PasForUL, EmprCod, Dg_codigo FROM TXPMFORES WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND MolCod = ?  FOR UPDATE OF MolCon, ForPrdUL, MolPesMin, MolForEst, MolPesMax, MolCol, MolPorVar, TaesId2, PasForUL, Dg_codigo NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY7", "SELECT CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, MolCon, ForPrdUL, MolPesMin, MolForEst, MolPesMax, MolCol, MolPorVar, TaesId2, PasForUL, EmprCod, Dg_codigo FROM TXPMFORES WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND MolCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY8", "SELECT Dg_Degr FROM TXPDEGRA WHERE EmprCod = ? AND Dg_codigo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY10", "SELECT COALESCE( T1.TotParCol, 0) AS TotParCol, COALESCE( T1.TotColMol, 0) AS TotColMol FROM (SELECT SUM(PrdForPar) AS TotParCol, EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, SUM(PrdForCan) AS TotColMol FROM TXPRECPR2 GROUP BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? AND T1.SerEst = ? AND T1.DibCli = ? AND T1.DibInt = ? AND T1.ColCom = ? AND T1.ColFon = ? AND T1.MolCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY11", "SELECT SerEst, ColCom, ColFon, ColMolCil, ColCodExt, ColEstMba, ColBmp, ColNomCol, ColGrm2, EmprCod, CliCod, GrpFamCod, IntCod, DibCli, DibInt FROM TXPCFORES WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ?  FOR UPDATE OF ColMolCil, ColCodExt, ColEstMba, ColBmp, ColNomCol, ColGrm2, GrpFamCod, IntCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY12", "SELECT SerEst, ColCom, ColFon, ColMolCil, ColCodExt, ColEstMba, ColBmp, ColNomCol, ColGrm2, EmprCod, CliCod, GrpFamCod, IntCod, DibCli, DibInt FROM TXPCFORES WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY13", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY14", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY15", "SELECT GrpFamDsc FROM TXPGRUFAM WHERE EmprCod = ? AND GrpFamCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY16", "SELECT IntDsc FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY17", "SELECT DibTipMaq, DibMolCil, DibMolCi2, DibCob, DibBmp FROM TXPCDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY18", "SELECT COALESCE( ArtAcaMin, 0) AS ColEstAnh, COALESCE( ArtCod, '') AS ColEstSer FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY19", "SELECT /*+ FIRST_ROWS(100) */ T4.ArtCod, TM1.SerEst, TM1.ColCom, TM1.ColFon, T2.EmprNom, T3.CliNom, T5.DibTipMaq, T5.DibMolCil, T5.DibMolCi2, TM1.ColMolCil, TM1.ColCodExt, TM1.ColEstMba, T5.DibCob, T6.IntDsc, TM1.ColBmp, T5.DibBmp, T7.GrpFamDsc, TM1.ColNomCol, TM1.ColGrm2, TM1.EmprCod, TM1.CliCod, TM1.GrpFamCod, TM1.IntCod, TM1.DibCli, TM1.DibInt, COALESCE( T4.ArtAcaMin, 0) AS ColEstAnh, COALESCE( T4.ArtCod, '') AS ColEstSer FROM ((((((TXPCFORES TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) LEFT JOIN TXPARTICU T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod AND T4.ArtCod = TM1.SerEst) INNER JOIN TXPCDIBUJ T5 ON T5.EmprCod = TM1.EmprCod AND T5.DibCli = TM1.DibCli AND T5.CliCod = TM1.CliCod AND T5.DibInt = TM1.DibInt) LEFT JOIN TXPINTENS T6 ON T6.EmprCod = TM1.EmprCod AND T6.IntCod = TM1.IntCod) LEFT JOIN TXPGRUFAM T7 ON T7.EmprCod = TM1.EmprCod AND T7.GrpFamCod = TM1.GrpFamCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.SerEst = ? and TM1.DibCli = ? and TM1.DibInt = ? and TM1.ColCom = ? and TM1.ColFon = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.SerEst, TM1.DibCli, TM1.DibInt, TM1.ColCom, TM1.ColFon ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY20", "SELECT GrpFamDsc FROM TXPGRUFAM WHERE EmprCod = ? AND GrpFamCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY21", "SELECT IntDsc FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY22", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY23", "SELECT COALESCE( ArtAcaMin, 0) AS ColEstAnh, COALESCE( ArtCod, '') AS ColEstSer FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY24", "SELECT DibTipMaq, DibMolCil, DibMolCi2, DibCob, DibBmp FROM TXPCDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY25", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon FROM TXPCFORES WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY26", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon FROM TXPCFORES WHERE ( CliCod > ? or CliCod = ? and SerEst > ? or SerEst = ? and CliCod = ? and DibCli > ? or DibCli = ? and SerEst = ? and CliCod = ? and DibInt > ? or DibInt = ? and DibCli = ? and SerEst = ? and CliCod = ? and ColCom > ? or ColCom = ? and DibInt = ? and DibCli = ? and SerEst = ? and CliCod = ? and ColFon > ?) and EmprCod = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LY27", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon FROM TXPCFORES WHERE ( CliCod < ? or CliCod = ? and SerEst < ? or SerEst = ? and CliCod = ? and DibCli < ? or DibCli = ? and SerEst = ? and CliCod = ? and DibInt < ? or DibInt = ? and DibCli = ? and SerEst = ? and CliCod = ? and ColCom < ? or ColCom = ? and DibInt = ? and DibCli = ? and SerEst = ? and CliCod = ? and ColFon < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC, SerEst DESC, DibCli DESC, DibInt DESC, ColCom DESC, ColFon DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01LY28", "INSERT INTO TXPCFORES(SerEst, ColCom, ColFon, ColMolCil, ColCodExt, ColEstMba, ColBmp, ColNomCol, ColGrm2, EmprCod, CliCod, GrpFamCod, IntCod, DibCli, DibInt, ForObsULin, ClaveIdUlt, DGCalID, DGPerfID, DGDespID, DGAltCab) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPCFORES")
         ,new UpdateCursor("T01LY29", "UPDATE TXPCFORES SET ColMolCil=?, ColCodExt=?, ColEstMba=?, ColBmp=?, ColNomCol=?, ColGrm2=?, GrpFamCod=?, IntCod=?  WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ?", GX_NOMASK, "TXPCFORES")
         ,new UpdateCursor("T01LY30", "DELETE FROM TXPCFORES  WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ?", GX_NOMASK, "TXPCFORES")
         ,new ForEachCursor("T01LY31", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY32", "SELECT COALESCE( ArtAcaMin, 0) AS ColEstAnh, COALESCE( ArtCod, '') AS ColEstSer FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ? AND ArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY33", "SELECT DibTipMaq, DibMolCil, DibMolCi2, DibCob, DibBmp FROM TXPCDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY34", "SELECT IntDsc FROM TXPINTENS WHERE EmprCod = ? AND IntCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY35", "SELECT GrpFamDsc FROM TXPGRUFAM WHERE EmprCod = ? AND GrpFamCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY36", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, ClaveID FROM TXPClaves WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LY37", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, ForObsLin FROM TXPFOROBS WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LY38", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod FROM TXPMFORES WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LY39", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon FROM TXPCFORES WHERE EmprCod = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY41", "SELECT T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon, T1.MolCod, T1.MolCon, T1.ForPrdUL, T1.MolPesMin, T1.MolForEst, T1.MolPesMax, T1.MolCol, T3.Dg_Degr, T1.MolPorVar, T1.TaesId2, T1.PasForUL, T1.EmprCod, T1.Dg_codigo, COALESCE( T2.TotParCol, 0) AS TotParCol, COALESCE( T2.TotColMol, 0) AS TotColMol FROM ((TXPMFORES T1 LEFT JOIN (SELECT SUM(PrdForPar) AS TotParCol, EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, SUM(PrdForCan) AS TotColMol FROM TXPRECPR2 GROUP BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod AND T2.SerEst = T1.SerEst AND T2.DibCli = T1.DibCli AND T2.DibInt = T1.DibInt AND T2.ColCom = T1.ColCom AND T2.ColFon = T1.ColFon AND T2.MolCod = T1.MolCod) LEFT JOIN TXPDEGRA T3 ON T3.EmprCod = T1.EmprCod AND T3.Dg_codigo = T1.Dg_codigo) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.SerEst = ? and T1.DibCli = ? and T1.DibInt = ? and T1.ColCom = ? and T1.ColFon = ? and T1.MolCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon, T1.MolCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY42", "SELECT Dg_Degr FROM TXPDEGRA WHERE EmprCod = ? AND Dg_codigo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY44", "SELECT COALESCE( T1.TotParCol, 0) AS TotParCol, COALESCE( T1.TotColMol, 0) AS TotColMol FROM (SELECT SUM(PrdForPar) AS TotParCol, EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, SUM(PrdForCan) AS TotColMol FROM TXPRECPR2 GROUP BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? AND T1.SerEst = ? AND T1.DibCli = ? AND T1.DibInt = ? AND T1.ColCom = ? AND T1.ColFon = ? AND T1.MolCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY45", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod FROM TXPMFORES WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND MolCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01LY46", "INSERT INTO TXPMFORES(CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, MolCon, ForPrdUL, MolPesMin, MolForEst, MolPesMax, MolCol, MolPorVar, TaesId2, PasForUL, EmprCod, Dg_codigo) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMFORES")
         ,new UpdateCursor("T01LY47", "UPDATE TXPMFORES SET MolCon=?, ForPrdUL=?, MolPesMin=?, MolForEst=?, MolPesMax=?, MolCol=?, MolPorVar=?, TaesId2=?, PasForUL=?, Dg_codigo=?  WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND MolCod = ?", GX_NOMASK, "TXPMFORES")
         ,new UpdateCursor("T01LY48", "DELETE FROM TXPMFORES  WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND MolCod = ?", GX_NOMASK, "TXPMFORES")
         ,new ForEachCursor("T01LY50", "SELECT COALESCE( T1.TotParCol, 0) AS TotParCol, COALESCE( T1.TotColMol, 0) AS TotColMol FROM (SELECT SUM(PrdForPar) AS TotParCol, EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, SUM(PrdForCan) AS TotColMol FROM TXPRECPR2 GROUP BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod ) T1 WHERE T1.EmprCod = ? AND T1.CliCod = ? AND T1.SerEst = ? AND T1.DibCli = ? AND T1.DibInt = ? AND T1.ColCom = ? AND T1.ColFon = ? AND T1.MolCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY51", "SELECT Dg_Degr FROM TXPDEGRA WHERE EmprCod = ? AND Dg_codigo = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY52", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, PasForLin FROM TXPPASFOR WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND MolCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LY53", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod FROM TXPMFORES WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY54", "SELECT T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon, T1.MolCod, T1.ForPrdLin, T2.PrdNom, T1.PrdForCan, T1.PrdForPar, T1.EmprCod, T1.PrdNum, T1.UniEstCod FROM (TXPRECPR2 T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.SerEst = ? and T1.DibCli = ? and T1.DibInt = ? and T1.ColCom = ? and T1.ColFon = ? and T1.MolCod = ? and T1.ForPrdLin = ? ORDER BY T1.EmprCod, T1.CliCod, T1.SerEst, T1.DibCli, T1.DibInt, T1.ColCom, T1.ColFon, T1.MolCod, T1.ForPrdLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY55", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY56", "SELECT UniEstCod FROM TXPUNIEST WHERE UniEstCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY57", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, ForPrdLin FROM TXPRECPR2 WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND MolCod = ? AND ForPrdLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01LY58", "INSERT INTO TXPRECPR2(CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, ForPrdLin, PrdForCan, PrdForPar, EmprCod, PrdNum, UniEstCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPRECPR2")
         ,new UpdateCursor("T01LY59", "UPDATE TXPRECPR2 SET PrdForCan=?, PrdForPar=?, PrdNum=?, UniEstCod=?  WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND MolCod = ? AND ForPrdLin = ?", GX_NOMASK, "TXPRECPR2")
         ,new UpdateCursor("T01LY60", "DELETE FROM TXPRECPR2  WHERE EmprCod = ? AND CliCod = ? AND SerEst = ? AND DibCli = ? AND DibInt = ? AND ColCom = ? AND ColFon = ? AND MolCod = ? AND ForPrdLin = ?", GX_NOMASK, "TXPRECPR2")
         ,new ForEachCursor("T01LY61", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY62", "SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, ForPrdLin FROM TXPRECPR2 WHERE EmprCod = ? and CliCod = ? and SerEst = ? and DibCli = ? and DibInt = ? and ColCom = ? and ColFon = ? and MolCod = ? ORDER BY EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, ForPrdLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY63", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY64", "SELECT UniEstCod FROM TXPUNIEST WHERE UniEstCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY65", "SELECT EmprCod, DibCli, CliCod, DibInt, DibLin, DibPrcCobM, DibDibMol FROM TXPLDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, DibLin ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY66", "SELECT EmprCod, DibCli, CliCod, DibInt, DibLinCil, DibPrcCob, DibLinMol FROM TXPLDIBUC WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, DibLinCil ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY67", "SELECT EmprCod, DibCli, CliCod, DibInt, DibLinCil, DibRelMC, DibLinMol FROM TXPLDIBUC WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, DibLinCil ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY68", "SELECT EmprCod, DibCli, CliCod, DibInt, DibLin, DibRelMC2, DibDibMol FROM TXPLDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, DibLin ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY69", "SELECT EmprCod, DibCli, CliCod, DibInt, DibLinCil, DibLinMol FROM TXPLDIBUC WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, DibLinCil ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LY70", "SELECT EmprCod, DibCli, CliCod, DibInt, DibLin, DibDibMol FROM TXPLDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt, DibLin ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 3);
               ((String[]) buf[13])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,3);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(11, 3);
               ((String[]) buf[13])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(13, 3);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(14);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(17, 3);
               ((short[]) buf[26])[0] = rslt.getShort(18);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(14);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(15, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(17, 3);
               ((short[]) buf[26])[0] = rslt.getShort(18);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 128);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 40);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 3);
               ((int[]) buf[16])[0] = rslt.getInt(11);
               ((byte[]) buf[17])[0] = rslt.getByte(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 16);
               ((int[]) buf[22])[0] = rslt.getInt(15);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 128);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(8, 40);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 3);
               ((int[]) buf[16])[0] = rslt.getInt(11);
               ((byte[]) buf[17])[0] = rslt.getByte(12);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((byte[]) buf[19])[0] = rslt.getByte(13);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 16);
               ((int[]) buf[22])[0] = rslt.getInt(15);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 128);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 15 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(9);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(15, 128);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(16, 128);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(18, 40);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(20, 3);
               ((int[]) buf[34])[0] = rslt.getInt(21);
               ((byte[]) buf[35])[0] = rslt.getByte(22);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((byte[]) buf[37])[0] = rslt.getByte(23);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(24, 16);
               ((int[]) buf[40])[0] = rslt.getInt(25);
               ((short[]) buf[41])[0] = rslt.getShort(26);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(27, 16);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 20 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 128);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 29 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(5, 128);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 37 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(13, 20);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(14);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(17);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(18, 3);
               ((short[]) buf[28])[0] = rslt.getShort(19);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((byte[]) buf[30])[0] = rslt.getByte(20);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(21,2);
               return;
            case 38 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 39 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 44 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 45 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               return;
            case 48 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 26);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 3);
               ((String[]) buf[14])[0] = rslt.getString(13, 6);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(14, 3);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 23 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setString(12, (String)parms[11], 16);
               stmt.setString(13, (String)parms[12], 16);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setString(15, (String)parms[14], 12);
               stmt.setString(16, (String)parms[15], 12);
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setString(18, (String)parms[17], 16);
               stmt.setString(19, (String)parms[18], 16);
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setString(21, (String)parms[20], 12);
               stmt.setString(22, (String)parms[21], 3);
               return;
            case 24 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setString(12, (String)parms[11], 16);
               stmt.setString(13, (String)parms[12], 16);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setString(15, (String)parms[14], 12);
               stmt.setString(16, (String)parms[15], 12);
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setString(18, (String)parms[17], 16);
               stmt.setString(19, (String)parms[18], 16);
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setString(21, (String)parms[20], 12);
               stmt.setString(22, (String)parms[21], 3);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setString(2, (String)parms[1], 12);
               stmt.setString(3, (String)parms[2], 12);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 128);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[12], 40);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[14], 2);
               }
               stmt.setString(10, (String)parms[15], 3);
               stmt.setInt(11, ((Number) parms[16]).intValue());
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[18]).byteValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[20]).byteValue());
               }
               stmt.setString(14, (String)parms[21], 16);
               stmt.setInt(15, ((Number) parms[22]).intValue());
               return;
            case 26 :
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
                  stmt.setString(2, (String)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 128);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 40);
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
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[15]).byteValue());
               }
               stmt.setString(9, (String)parms[16], 3);
               stmt.setInt(10, ((Number) parms[17]).intValue());
               stmt.setString(11, (String)parms[18], 16);
               stmt.setString(12, (String)parms[19], 16);
               stmt.setInt(13, ((Number) parms[20]).intValue());
               stmt.setString(14, (String)parms[21], 12);
               stmt.setString(15, (String)parms[22], 12);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 31 :
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
            case 32 :
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
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 38 :
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
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 41 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 16);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 12);
               stmt.setString(6, (String)parms[5], 12);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[14], 1);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[18], 20);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[20]).shortValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[22], 6);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[24]).shortValue());
               }
               stmt.setString(17, (String)parms[25], 3);
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[27]).shortValue());
               }
               return;
            case 42 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
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
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
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
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[9], 2);
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
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 6);
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
               stmt.setString(11, (String)parms[20], 3);
               stmt.setInt(12, ((Number) parms[21]).intValue());
               stmt.setString(13, (String)parms[22], 16);
               stmt.setString(14, (String)parms[23], 16);
               stmt.setInt(15, ((Number) parms[24]).intValue());
               stmt.setString(16, (String)parms[25], 12);
               stmt.setString(17, (String)parms[26], 12);
               stmt.setByte(18, ((Number) parms[27]).byteValue());
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 45 :
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
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 50 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 52 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 16);
               stmt.setString(3, (String)parms[2], 16);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 12);
               stmt.setString(6, (String)parms[5], 12);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[9], 3);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[11]).shortValue());
               }
               stmt.setString(11, (String)parms[12], 3);
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[14], 6);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[16], 3);
               }
               return;
            case 53 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 3);
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 6);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 3);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setInt(6, ((Number) parms[9]).intValue());
               stmt.setString(7, (String)parms[10], 16);
               stmt.setString(8, (String)parms[11], 16);
               stmt.setInt(9, ((Number) parms[12]).intValue());
               stmt.setString(10, (String)parms[13], 12);
               stmt.setString(11, (String)parms[14], 12);
               stmt.setByte(12, ((Number) parms[15]).byteValue());
               stmt.setShort(13, ((Number) parms[16]).shortValue());
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 16);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               return;
            case 57 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 58 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 3);
               }
               return;
            case 59 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 61 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 62 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 64 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
      }
   }

}

