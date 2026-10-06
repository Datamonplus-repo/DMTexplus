package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class costesquimicosanalisis_wc_impl extends GXWebComponent
{
   public costesquimicosanalisis_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public costesquimicosanalisis_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( costesquimicosanalisis_wc_impl.class ));
   }

   public costesquimicosanalisis_wc_impl( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void setPrefix( String sPPrefix )
   {
      sPrefix = sPPrefix;
   }

   protected void createObjects( )
   {
      cmbavGrupodeacciones = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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
            else if ( GXutil.strcmp(gxfirstwebparm, "dyncomponent") == 0 )
            {
               httpContext.setAjaxEventMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               nDynComponent = (byte)(1) ;
               sCompPrefix = httpContext.GetPar( "sCompPrefix") ;
               sSFPrefix = httpContext.GetPar( "sSFPrefix") ;
               AV33Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Emprcod", AV33Emprcod);
               AV91HreRacabinout = httpContext.GetPar( "HreRacabinout") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91HreRacabinout", AV91HreRacabinout);
               AV14Fecha = localUtil.parseDateParm( httpContext.GetPar( "Fecha")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Fecha", localUtil.format(AV14Fecha, "99/99/99"));
               AV15Fecha_to = localUtil.parseDateParm( httpContext.GetPar( "Fecha_to")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Fecha_to", localUtil.format(AV15Fecha_to, "99/99/99"));
               AV55Calculo = (short)(GXutil.lval( httpContext.GetPar( "Calculo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55Calculo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55Calculo), 4, 0));
               AV8barcod = (int)(GXutil.lval( httpContext.GetPar( "barcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8barcod), 8, 0));
               AV10barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10barcodreo", GXutil.str( AV10barcodreo, 1, 0));
               AV9barcodpar = httpContext.GetPar( "barcodpar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9barcodpar", AV9barcodpar);
               AV5ArtCod = httpContext.GetPar( "ArtCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5ArtCod", AV5ArtCod);
               AV6ArtCod_to = httpContext.GetPar( "ArtCod_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6ArtCod_to", AV6ArtCod_to);
               AV17ForColNom = httpContext.GetPar( "ForColNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17ForColNom", AV17ForColNom);
               AV18ForColNom_to = httpContext.GetPar( "ForColNom_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18ForColNom_to", AV18ForColNom_to);
               AV20ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20ForColNum), 6, 0));
               AV21ForColNum_to = (int)(GXutil.lval( httpContext.GetPar( "ForColNum_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21ForColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21ForColNum_to), 6, 0));
               AV89Clicodinout = (int)(GXutil.lval( httpContext.GetPar( "Clicodinout"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89Clicodinout", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89Clicodinout), 6, 0));
               AV90Clicodinout_to = (int)(GXutil.lval( httpContext.GetPar( "Clicodinout_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90Clicodinout_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90Clicodinout_to), 6, 0));
               AV24IntCod = (byte)(GXutil.lval( httpContext.GetPar( "IntCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24IntCod), 2, 0));
               AV25IntCod_to = (byte)(GXutil.lval( httpContext.GetPar( "IntCod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25IntCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25IntCod_to), 2, 0));
               AV27TipArtCod = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TipArtCod), 4, 0));
               AV28TipArtCod_to = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TipArtCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TipArtCod_to), 4, 0));
               AV30TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TipColCod), 2, 0));
               AV31TipColCod_to = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TipColCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TipColCod_to), 2, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV33Emprcod,AV91HreRacabinout,AV14Fecha,AV15Fecha_to,Short.valueOf(AV55Calculo),Integer.valueOf(AV8barcod),Byte.valueOf(AV10barcodreo),AV9barcodpar,AV5ArtCod,AV6ArtCod_to,AV17ForColNom,AV18ForColNom_to,Integer.valueOf(AV20ForColNum),Integer.valueOf(AV21ForColNum_to),Integer.valueOf(AV89Clicodinout),Integer.valueOf(AV90Clicodinout_to),Byte.valueOf(AV24IntCod),Byte.valueOf(AV25IntCod_to),Short.valueOf(AV27TipArtCod),Short.valueOf(AV28TipArtCod_to),Byte.valueOf(AV30TipColCod),Byte.valueOf(AV31TipColCod_to)});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
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
               gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid") == 0 )
            {
               gxnrgrid_newrow_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid") == 0 )
            {
               gxgrgrid_refresh_invoke( ) ;
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
         }
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isLocalStorageSupported( ) )
         {
            httpContext.pushCurrentUrl();
         }
      }
   }

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_37 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_37"))) ;
      nGXsfl_37_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_37_idx"))) ;
      sGXsfl_37_idx = httpContext.GetPar( "sGXsfl_37_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid_newrow( ) ;
      /* End function gxnrGrid_newrow_invoke */
   }

   public void gxgrgrid_refresh_invoke( )
   {
      subGrid_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid_Rows"))) ;
      AV50ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV45ColumnsSelector);
      AV33Emprcod = httpContext.GetPar( "Emprcod") ;
      AV91HreRacabinout = httpContext.GetPar( "HreRacabinout") ;
      AV14Fecha = localUtil.parseDateParm( httpContext.GetPar( "Fecha")) ;
      AV15Fecha_to = localUtil.parseDateParm( httpContext.GetPar( "Fecha_to")) ;
      AV55Calculo = (short)(GXutil.lval( httpContext.GetPar( "Calculo"))) ;
      AV8barcod = (int)(GXutil.lval( httpContext.GetPar( "barcod"))) ;
      AV10barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "barcodreo"))) ;
      AV9barcodpar = httpContext.GetPar( "barcodpar") ;
      AV5ArtCod = httpContext.GetPar( "ArtCod") ;
      AV6ArtCod_to = httpContext.GetPar( "ArtCod_to") ;
      AV17ForColNom = httpContext.GetPar( "ForColNom") ;
      AV18ForColNom_to = httpContext.GetPar( "ForColNom_to") ;
      AV20ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
      AV21ForColNum_to = (int)(GXutil.lval( httpContext.GetPar( "ForColNum_to"))) ;
      AV89Clicodinout = (int)(GXutil.lval( httpContext.GetPar( "Clicodinout"))) ;
      AV90Clicodinout_to = (int)(GXutil.lval( httpContext.GetPar( "Clicodinout_to"))) ;
      AV24IntCod = (byte)(GXutil.lval( httpContext.GetPar( "IntCod"))) ;
      AV25IntCod_to = (byte)(GXutil.lval( httpContext.GetPar( "IntCod_to"))) ;
      AV27TipArtCod = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod"))) ;
      AV28TipArtCod_to = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod_to"))) ;
      AV30TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
      AV31TipColCod_to = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod_to"))) ;
      AV113Pgmname = httpContext.GetPar( "Pgmname") ;
      AV41FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV77BarAGrest = httpContext.GetPar( "BarAGrest") ;
      AV88TablaA = (byte)(GXutil.lval( httpContext.GetPar( "TablaA"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A4529HreFecTin = localUtil.parseDateParm( httpContext.GetPar( "HreFecTin")) ;
      n4529HreFecTin = false ;
      A4492HreBarCod = (int)(GXutil.lval( httpContext.GetPar( "HreBarCod"))) ;
      A4493HreBarReo = (byte)(GXutil.lval( httpContext.GetPar( "HreBarReo"))) ;
      A4494HreBarPar = httpContext.GetPar( "HreBarPar") ;
      A4495HreNumCie = (byte)(GXutil.lval( httpContext.GetPar( "HreNumCie"))) ;
      A9808HreRacab = httpContext.GetPar( "HreRacab") ;
      n9808HreRacab = false ;
      A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      n252CliCod = false ;
      A4517HreBarSer = httpContext.GetPar( "HreBarSer") ;
      n4517HreBarSer = false ;
      A4519HreTipArt = (short)(GXutil.lval( httpContext.GetPar( "HreTipArt"))) ;
      n4519HreTipArt = false ;
      A4521HreColNom = httpContext.GetPar( "HreColNom") ;
      n4521HreColNom = false ;
      A4522HreColNum = (int)(GXutil.lval( httpContext.GetPar( "HreColNum"))) ;
      n4522HreColNum = false ;
      A4525HreTipCol = (byte)(GXutil.lval( httpContext.GetPar( "HreTipCol"))) ;
      n4525HreTipCol = false ;
      A4539HreIntCod = (byte)(GXutil.lval( httpContext.GetPar( "HreIntCod"))) ;
      n4539HreIntCod = false ;
      A4532HreBarKgm = CommonUtil.decimalVal( httpContext.GetPar( "HreBarKgm"), ".") ;
      n4532HreBarKgm = false ;
      A4542HreTotKgm = CommonUtil.decimalVal( httpContext.GetPar( "HreTotKgm"), ".") ;
      n4542HreTotKgm = false ;
      A13842BarNhdr_Hi = httpContext.GetPar( "BarNhdr_Hi") ;
      A279CliNom = httpContext.GetPar( "CliNom") ;
      A4518HreBarDsc = httpContext.GetPar( "HreBarDsc") ;
      n4518HreBarDsc = false ;
      A4520HreTipArtD = httpContext.GetPar( "HreTipArtD") ;
      n4520HreTipArtD = false ;
      A4526HreTipColN = httpContext.GetPar( "HreTipColN") ;
      n4526HreTipColN = false ;
      A4540HreIntDsc = httpContext.GetPar( "HreIntDsc") ;
      n4540HreIntDsc = false ;
      A10104HreDtf = localUtil.parseDTimeParm( httpContext.GetPar( "HreDtf")) ;
      n10104HreDtf = false ;
      A10103HreDti = localUtil.parseDTimeParm( httpContext.GetPar( "HreDti")) ;
      n10103HreDti = false ;
      A4516HreDisCli = httpContext.GetPar( "HreDisCli") ;
      n4516HreDisCli = false ;
      A11318HreDispCli = httpContext.GetPar( "HreDispCli") ;
      n11318HreDispCli = false ;
      A4497HreAgrCod = (int)(GXutil.lval( httpContext.GetPar( "HreAgrCod"))) ;
      A9985HreAcCod = (int)(GXutil.lval( httpContext.GetPar( "HreAcCod"))) ;
      A4545HreLinMaq = (short)(GXutil.lval( httpContext.GetPar( "HreLinMaq"))) ;
      A4547HreVolPrd = (int)(GXutil.lval( httpContext.GetPar( "HreVolPrd"))) ;
      n4547HreVolPrd = false ;
      A8602HreCosAA = CommonUtil.decimalVal( httpContext.GetPar( "HreCosAA"), ".") ;
      n8602HreCosAA = false ;
      A8603HrecosAd = CommonUtil.decimalVal( httpContext.GetPar( "HrecosAd"), ".") ;
      n8603HrecosAd = false ;
      A8604HreCosAnc = CommonUtil.decimalVal( httpContext.GetPar( "HreCosAnc"), ".") ;
      n8604HreCosAnc = false ;
      A8605HreCosCol = CommonUtil.decimalVal( httpContext.GetPar( "HreCosCol"), ".") ;
      n8605HreCosCol = false ;
      A8606HreCosPA = CommonUtil.decimalVal( httpContext.GetPar( "HreCosPA"), ".") ;
      n8606HreCosPA = false ;
      A8607HreCosPD = CommonUtil.decimalVal( httpContext.GetPar( "HreCosPD"), ".") ;
      n8607HreCosPD = false ;
      A4546HreMaqCod = httpContext.GetPar( "HreMaqCod") ;
      n4546HreMaqCod = false ;
      A4551HreProCod = httpContext.GetPar( "HreProCod") ;
      A4552HreProDsc = httpContext.GetPar( "HreProDsc") ;
      A4500HreAgrKgm = CommonUtil.decimalVal( httpContext.GetPar( "HreAgrKgm"), ".") ;
      A4498HreAgrReo = (byte)(GXutil.lval( httpContext.GetPar( "HreAgrReo"))) ;
      A4499HreAgrPar = httpContext.GetPar( "HreAgrPar") ;
      A4503HreAgrCli = (int)(GXutil.lval( httpContext.GetPar( "HreAgrCli"))) ;
      A4504HreAgrSer = httpContext.GetPar( "HreAgrSer") ;
      A4505HreAgrDsc = httpContext.GetPar( "HreAgrDsc") ;
      A9988HreAcKgm = CommonUtil.decimalVal( httpContext.GetPar( "HreAcKgm"), ".") ;
      n9988HreAcKgm = false ;
      A9986HreAcReo = (byte)(GXutil.lval( httpContext.GetPar( "HreAcReo"))) ;
      A9987HreAcPar = httpContext.GetPar( "HreAcPar") ;
      A9991HreAcCli = (int)(GXutil.lval( httpContext.GetPar( "HreAcCli"))) ;
      n9991HreAcCli = false ;
      A9992HreAcSer = httpContext.GetPar( "HreAcSer") ;
      n9992HreAcSer = false ;
      A9993HreAcDsc = httpContext.GetPar( "HreAcDsc") ;
      n9993HreAcDsc = false ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV50ManageFiltersExecutionStep, AV45ColumnsSelector, AV33Emprcod, AV91HreRacabinout, AV14Fecha, AV15Fecha_to, AV55Calculo, AV8barcod, AV10barcodreo, AV9barcodpar, AV5ArtCod, AV6ArtCod_to, AV17ForColNom, AV18ForColNom_to, AV20ForColNum, AV21ForColNum_to, AV89Clicodinout, AV90Clicodinout_to, AV24IntCod, AV25IntCod_to, AV27TipArtCod, AV28TipArtCod_to, AV30TipColCod, AV31TipColCod_to, AV113Pgmname, AV41FilterFullText, AV77BarAGrest, AV88TablaA, A396EmprCod, A4529HreFecTin, A4492HreBarCod, A4493HreBarReo, A4494HreBarPar, A4495HreNumCie, A9808HreRacab, A252CliCod, A4517HreBarSer, A4519HreTipArt, A4521HreColNom, A4522HreColNum, A4525HreTipCol, A4539HreIntCod, A4532HreBarKgm, A4542HreTotKgm, A13842BarNhdr_Hi, A279CliNom, A4518HreBarDsc, A4520HreTipArtD, A4526HreTipColN, A4540HreIntDsc, A10104HreDtf, A10103HreDti, A4516HreDisCli, A11318HreDispCli, A4497HreAgrCod, A9985HreAcCod, A4545HreLinMaq, A4547HreVolPrd, A8602HreCosAA, A8603HrecosAd, A8604HreCosAnc, A8605HreCosCol, A8606HreCosPA, A8607HreCosPD, A4546HreMaqCod, A4551HreProCod, A4552HreProDsc, A4500HreAgrKgm, A4498HreAgrReo, A4499HreAgrPar, A4503HreAgrCli, A4504HreAgrSer, A4505HreAgrDsc, A9988HreAcKgm, A9986HreAcReo, A9987HreAcPar, A9991HreAcCli, A9992HreAcSer, A9993HreAcDsc, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1FT2( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            validateSpaRequest();
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ! isAjaxCallMode( ) )
            {
               if ( nDynComponent == 0 )
               {
                  httpContext.sendError( 404 );
                  GXutil.writeLog("send_http_error_code 404");
                  GxWebError = (byte)(1) ;
               }
            }
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            if ( nDynComponent == 0 )
            {
               throw new RuntimeException("WebComponent is not allowed to run");
            }
         }
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
      cleanup();
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
         httpContext.writeText( "<title>") ;
         httpContext.writeValue( httpContext.getMessage( "Costes Quimicos Analisis", "")) ;
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
      }
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.costesquimicosanalisis_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV33Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV91HreRacabinout)),GXutil.URLEncode(GXutil.formatDateParm(AV14Fecha)),GXutil.URLEncode(GXutil.formatDateParm(AV15Fecha_to)),GXutil.URLEncode(GXutil.ltrimstr(AV55Calculo,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV8barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV9barcodpar)),GXutil.URLEncode(GXutil.rtrim(AV5ArtCod)),GXutil.URLEncode(GXutil.rtrim(AV6ArtCod_to)),GXutil.URLEncode(GXutil.rtrim(AV17ForColNom)),GXutil.URLEncode(GXutil.rtrim(AV18ForColNom_to)),GXutil.URLEncode(GXutil.ltrimstr(AV20ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV21ForColNum_to,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV89Clicodinout,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV90Clicodinout_to,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV24IntCod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV25IntCod_to,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV27TipArtCod,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV28TipArtCod_to,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV30TipColCod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV31TipColCod_to,2,0))}, new String[] {"Emprcod","HreRacabinout","Fecha","Fecha_to","Calculo","barcod","barcodreo","barcodpar","ArtCod","ArtCod_to","ForColNom","ForColNom_to","ForColNum","ForColNum_to","Clicodinout","Clicodinout_to","IntCod","IntCod_to","TipArtCod","TipArtCod_to","TipColCod","TipColCod_to"}) +"\">") ;
         app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form", true);
      }
      else
      {
         boolean toggleHtmlOutput = httpContext.isOutputEnabled( );
         if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableOutput();
            }
         }
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gxwebcomponent-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         if ( toggleHtmlOutput )
         {
            if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableOutput();
               }
            }
         }
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV113Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_37", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_37, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV48ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV48ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV53GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV54GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV51DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV51DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV45ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV45ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33Emprcod", GXutil.rtrim( wcpOAV33Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV91HreRacabinout", GXutil.rtrim( wcpOAV91HreRacabinout));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV14Fecha", localUtil.dtoc( wcpOAV14Fecha, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV15Fecha_to", localUtil.dtoc( wcpOAV15Fecha_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV55Calculo", GXutil.ltrim( localUtil.ntoc( wcpOAV55Calculo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8barcod", GXutil.ltrim( localUtil.ntoc( wcpOAV8barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10barcodreo", GXutil.ltrim( localUtil.ntoc( wcpOAV10barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9barcodpar", GXutil.rtrim( wcpOAV9barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5ArtCod", GXutil.rtrim( wcpOAV5ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6ArtCod_to", GXutil.rtrim( wcpOAV6ArtCod_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV17ForColNom", GXutil.rtrim( wcpOAV17ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV18ForColNom_to", GXutil.rtrim( wcpOAV18ForColNom_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV20ForColNum", GXutil.ltrim( localUtil.ntoc( wcpOAV20ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV21ForColNum_to", GXutil.ltrim( localUtil.ntoc( wcpOAV21ForColNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV89Clicodinout", GXutil.ltrim( localUtil.ntoc( wcpOAV89Clicodinout, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV90Clicodinout_to", GXutil.ltrim( localUtil.ntoc( wcpOAV90Clicodinout_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV24IntCod", GXutil.ltrim( localUtil.ntoc( wcpOAV24IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV25IntCod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV25IntCod_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV27TipArtCod", GXutil.ltrim( localUtil.ntoc( wcpOAV27TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV28TipArtCod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV28TipArtCod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV30TipColCod", GXutil.ltrim( localUtil.ntoc( wcpOAV30TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV31TipColCod_to", GXutil.ltrim( localUtil.ntoc( wcpOAV31TipColCod_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV50ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV33Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHRERACABINOUT", GXutil.rtrim( AV91HreRacabinout));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECHA", localUtil.dtoc( AV14Fecha, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECHA_TO", localUtil.dtoc( AV15Fecha_to, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCALCULO", GXutil.ltrim( localUtil.ntoc( AV55Calculo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCOD", GXutil.ltrim( localUtil.ntoc( AV8barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV10barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARCODPAR", GXutil.rtrim( AV9barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vARTCOD", GXutil.rtrim( AV5ArtCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vARTCOD_TO", GXutil.rtrim( AV6ArtCod_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNOM", GXutil.rtrim( AV17ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNOM_TO", GXutil.rtrim( AV18ForColNom_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV20ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFORCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV21ForColNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODINOUT", GXutil.ltrim( localUtil.ntoc( AV89Clicodinout, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCLICODINOUT_TO", GXutil.ltrim( localUtil.ntoc( AV90Clicodinout_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINTCOD", GXutil.ltrim( localUtil.ntoc( AV24IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vINTCOD_TO", GXutil.ltrim( localUtil.ntoc( AV25IntCod_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPARTCOD", GXutil.ltrim( localUtil.ntoc( AV27TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPARTCOD_TO", GXutil.ltrim( localUtil.ntoc( AV28TipArtCod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV30TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPCOLCOD_TO", GXutil.ltrim( localUtil.ntoc( AV31TipColCod_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV113Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV113Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREFECTIN", localUtil.dtoc( A4529HreFecTin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRENUMCIE", GXutil.ltrim( localUtil.ntoc( A4495HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRERACAB", GXutil.rtrim( A9808HreRacab));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREBARSER", GXutil.rtrim( A4517HreBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRETIPART", GXutil.ltrim( localUtil.ntoc( A4519HreTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRECOLNOM", GXutil.rtrim( A4521HreColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRECOLNUM", GXutil.ltrim( localUtil.ntoc( A4522HreColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRETIPCOL", GXutil.ltrim( localUtil.ntoc( A4525HreTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREINTCOD", GXutil.ltrim( localUtil.ntoc( A4539HreIntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREBARKGM", GXutil.ltrim( localUtil.ntoc( A4532HreBarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRETOTKGM", GXutil.ltrim( localUtil.ntoc( A4542HreTotKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREBARDSC", GXutil.rtrim( A4518HreBarDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRETIPARTD", GXutil.rtrim( A4520HreTipArtD));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRETIPCOLN", GXutil.rtrim( A4526HreTipColN));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREINTDSC", GXutil.rtrim( A4540HreIntDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREDTF", localUtil.ttoc( A10104HreDtf, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREDTI", localUtil.ttoc( A10103HreDti, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREDISCLI", GXutil.rtrim( A4516HreDisCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREDISPCLI", GXutil.rtrim( A11318HreDispCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREAGRCOD", GXutil.ltrim( localUtil.ntoc( A4497HreAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREACCOD", GXutil.ltrim( localUtil.ntoc( A9985HreAcCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRELINMAQ", GXutil.ltrim( localUtil.ntoc( A4545HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREVOLPRD", GXutil.ltrim( localUtil.ntoc( A4547HreVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRECOSAA", GXutil.ltrim( localUtil.ntoc( A8602HreCosAA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRECOSAD", GXutil.ltrim( localUtil.ntoc( A8603HrecosAd, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRECOSANC", GXutil.ltrim( localUtil.ntoc( A8604HreCosAnc, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRECOSCOL", GXutil.ltrim( localUtil.ntoc( A8605HreCosCol, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRECOSPA", GXutil.ltrim( localUtil.ntoc( A8606HreCosPA, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HRECOSPD", GXutil.ltrim( localUtil.ntoc( A8607HreCosPD, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREMAQCOD", GXutil.rtrim( A4546HreMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREPROCOD", GXutil.rtrim( A4551HreProCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREPRODSC", GXutil.rtrim( A4552HreProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREAGRKGM", GXutil.ltrim( localUtil.ntoc( A4500HreAgrKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREAGRREO", GXutil.ltrim( localUtil.ntoc( A4498HreAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREAGRPAR", GXutil.rtrim( A4499HreAgrPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREAGRCLI", GXutil.ltrim( localUtil.ntoc( A4503HreAgrCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREAGRSER", GXutil.rtrim( A4504HreAgrSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREAGRDSC", GXutil.rtrim( A4505HreAgrDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREACKGM", GXutil.ltrim( localUtil.ntoc( A9988HreAcKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREACREO", GXutil.ltrim( localUtil.ntoc( A9986HreAcReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREACPAR", GXutil.rtrim( A9987HreAcPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREACCLI", GXutil.ltrim( localUtil.ntoc( A9991HreAcCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREACSER", GXutil.rtrim( A9992HreAcSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREACDSC", GXutil.rtrim( A9993HreAcDsc));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV39GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV39GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREBARCOD", GXutil.ltrim( localUtil.ntoc( A4492HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREBARREO", GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"HREBARPAR", GXutil.rtrim( A4494HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARNHDR_HI", GXutil.rtrim( A13842BarNhdr_Hi));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icontype", GXutil.rtrim( Ddo_managefilters_Icontype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icon", GXutil.rtrim( Ddo_managefilters_Icon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Tooltip", GXutil.rtrim( Ddo_managefilters_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Cls", GXutil.rtrim( Ddo_managefilters_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Width", GXutil.rtrim( Dvpanel_tableheader_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autowidth", GXutil.booltostr( Dvpanel_tableheader_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autoheight", GXutil.booltostr( Dvpanel_tableheader_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Cls", GXutil.rtrim( Dvpanel_tableheader_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Title", GXutil.rtrim( Dvpanel_tableheader_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Collapsible", GXutil.booltostr( Dvpanel_tableheader_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Collapsed", GXutil.booltostr( Dvpanel_tableheader_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Showcollapseicon", GXutil.booltostr( Dvpanel_tableheader_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Iconposition", GXutil.rtrim( Dvpanel_tableheader_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autoscroll", GXutil.booltostr( Dvpanel_tableheader_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Class", GXutil.rtrim( Gridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Gridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Gridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Previous", GXutil.rtrim( Gridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Next", GXutil.rtrim( Gridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Caption", GXutil.rtrim( Gridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DETAILWEBCOMPONENT_MODAL_Width", GXutil.rtrim( Detailwebcomponent_modal_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DETAILWEBCOMPONENT_MODAL_Title", GXutil.rtrim( Detailwebcomponent_modal_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DETAILWEBCOMPONENT_MODAL_Confirmtype", GXutil.rtrim( Detailwebcomponent_modal_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DETAILWEBCOMPONENT_MODAL_Bodytype", GXutil.rtrim( Detailwebcomponent_modal_Bodytype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm1FT2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) ) )
      {
         componentjscripts();
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GX_FocusControl", GX_FocusControl);
      define_styles( ) ;
      sendSecurityToken(sPrefix);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.SendAjaxEncryptionKey();
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
         if ( ! ( WebComp_Grid_dwc == null ) )
         {
            WebComp_Grid_dwc.componentjscripts();
         }
         if ( ! ( WebComp_Wwpaux_wc == null ) )
         {
            WebComp_Wwpaux_wc.componentjscripts();
         }
         httpContext.writeTextNL( "</body>") ;
         httpContext.writeTextNL( "</html>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
      }
      else
      {
         httpContext.SendWebComponentState();
         httpContext.writeText( "</div>") ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
   }

   public String getPgmname( )
   {
      return "CostesQuimicosAnalisis_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Costes Quimicos Analisis", "") ;
   }

   public void wb1FT0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( GXutil.len( sPrefix) == 0 )
         {
            renderHtmlHeaders( ) ;
         }
         renderHtmlOpenForm( ) ;
         if ( GXutil.len( sPrefix) != 0 )
         {
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.costesquimicosanalisis_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
         }
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table TableWithSelectableGrid", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMain", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tableheader.setProperty("Width", Dvpanel_tableheader_Width);
         ucDvpanel_tableheader.setProperty("AutoWidth", Dvpanel_tableheader_Autowidth);
         ucDvpanel_tableheader.setProperty("AutoHeight", Dvpanel_tableheader_Autoheight);
         ucDvpanel_tableheader.setProperty("Cls", Dvpanel_tableheader_Cls);
         ucDvpanel_tableheader.setProperty("Title", Dvpanel_tableheader_Title);
         ucDvpanel_tableheader.setProperty("Collapsible", Dvpanel_tableheader_Collapsible);
         ucDvpanel_tableheader.setProperty("Collapsed", Dvpanel_tableheader_Collapsed);
         ucDvpanel_tableheader.setProperty("ShowCollapseIcon", Dvpanel_tableheader_Showcollapseicon);
         ucDvpanel_tableheader.setProperty("IconPosition", Dvpanel_tableheader_Iconposition);
         ucDvpanel_tableheader.setProperty("AutoScroll", Dvpanel_tableheader_Autoscroll);
         ucDvpanel_tableheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableheader_Internalname, sPrefix+"DVPANEL_TABLEHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TABLEHEADERContainer"+"TableHeader"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 37, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesQuimicosAnalisis_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_19_1FT2( true) ;
      }
      else
      {
         wb_table1_19_1FT2( false) ;
      }
      return  ;
   }

   public void wb_table1_19_1FT2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol37( ) ;
      }
      if ( wbEnd == 37 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_37 = (int)(nGXsfl_37_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid", GridContainer, subGrid_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridpaginationbar.setProperty("Class", Gridpaginationbar_Class);
         ucGridpaginationbar.setProperty("ShowFirst", Gridpaginationbar_Showfirst);
         ucGridpaginationbar.setProperty("ShowPrevious", Gridpaginationbar_Showprevious);
         ucGridpaginationbar.setProperty("ShowNext", Gridpaginationbar_Shownext);
         ucGridpaginationbar.setProperty("ShowLast", Gridpaginationbar_Showlast);
         ucGridpaginationbar.setProperty("PagesToShow", Gridpaginationbar_Pagestoshow);
         ucGridpaginationbar.setProperty("PagingButtonsPosition", Gridpaginationbar_Pagingbuttonsposition);
         ucGridpaginationbar.setProperty("PagingCaptionPosition", Gridpaginationbar_Pagingcaptionposition);
         ucGridpaginationbar.setProperty("EmptyGridClass", Gridpaginationbar_Emptygridclass);
         ucGridpaginationbar.setProperty("RowsPerPageSelector", Gridpaginationbar_Rowsperpageselector);
         ucGridpaginationbar.setProperty("RowsPerPageOptions", Gridpaginationbar_Rowsperpageoptions);
         ucGridpaginationbar.setProperty("Previous", Gridpaginationbar_Previous);
         ucGridpaginationbar.setProperty("Next", Gridpaginationbar_Next);
         ucGridpaginationbar.setProperty("Caption", Gridpaginationbar_Caption);
         ucGridpaginationbar.setProperty("EmptyGridCaption", Gridpaginationbar_Emptygridcaption);
         ucGridpaginationbar.setProperty("RowsPerPageCaption", Gridpaginationbar_Rowsperpagecaption);
         ucGridpaginationbar.setProperty("CurrentPage", AV53GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV54GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divCell_grid_dwc_Internalname, 1, 0, "px", 0, "px", divCell_grid_dwc_Class, "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0078"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0078"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_37_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0078"+"");
                  }
                  WebComp_Grid_dwc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspEndCmp();
                  }
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV51DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV51DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV45ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table2_84_1FT2( true) ;
      }
      else
      {
         wb_table2_84_1FT2( false) ;
      }
      return  ;
   }

   public void wb_table2_84_1FT2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDiv_wwpauxwc_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0091"+"", GXutil.rtrim( WebComp_Wwpaux_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0091"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_37_Refreshing )
            {
               if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0091"+"");
                  }
                  WebComp_Wwpaux_wc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspEndCmp();
                  }
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 37 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid", GridContainer, subGrid_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData", GridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData"+"V", GridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start1FT2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            if ( httpContext.exposeMetadata( ) )
            {
               Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
            }
            Form.getMeta().addItem("description", httpContext.getMessage( "Costes Quimicos Analisis", ""), (short)(0)) ;
         }
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
         httpContext.wbHandled = (byte)(0) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            sXEvt = httpContext.cgiGet( "_EventName") ;
            if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
            {
            }
         }
      }
      wbErr = false ;
      if ( ( GXutil.len( sPrefix) == 0 ) || ( nDraw == 1 ) )
      {
         if ( nDoneStart == 0 )
         {
            strup1FT0( ) ;
         }
      }
   }

   public void ws1FT2( )
   {
      start1FT2( ) ;
      evt1FT2( ) ;
   }

   public void evt1FT2( )
   {
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ( ( ( GXutil.len( sPrefix) == 0 ) ) || ( GXutil.strSearch( sXEvt, sPrefix, 1) > 0 ) ) && ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            if ( httpContext.wbHandled == 0 )
            {
               if ( GXutil.len( sPrefix) == 0 )
               {
                  sEvt = httpContext.cgiGet( "_EventName") ;
                  EvtGridId = httpContext.cgiGet( "_EventGridId") ;
                  EvtRowId = httpContext.cgiGet( "_EventRowId") ;
               }
               if ( GXutil.len( sEvt) > 0 )
               {
                  sEvtType = GXutil.left( sEvt, 1) ;
                  sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1FT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_MANAGEFILTERS.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1FT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111FT2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1FT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121FT2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1FT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131FT2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1FT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141FT2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DETAILWEBCOMPONENT_MODAL.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1FT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151FT2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1FT0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1FT0( ) ;
                           }
                           nGXsfl_37_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_372( ) ;
                           cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
                           cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
                           AV98GrupodeAcciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98GrupodeAcciones), 4, 0));
                           AV97DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV97DetailWebComponent);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTablaa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTablaa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTABLAA");
                              GX_FocusControl = edtavTablaa_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV88TablaA = (byte)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTablaa_Internalname, GXutil.str( AV88TablaA, 1, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTABLAA"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV88TablaA), "9")));
                           }
                           else
                           {
                              AV88TablaA = (byte)(localUtil.ctol( httpContext.cgiGet( edtavTablaa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTablaa_Internalname, GXutil.str( AV88TablaA, 1, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTABLAA"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV88TablaA), "9")));
                           }
                           AV42ToA = httpContext.cgiGet( edtavToa_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavToa_Internalname, AV42ToA);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOA"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, GXutil.rtrim( localUtil.format( AV42ToA, ""))));
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavHrefectin_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vHREFECTIN");
                              GX_FocusControl = edtavHrefectin_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV59HreFecTin = GXutil.nullDate() ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrefectin_Internalname, localUtil.format(AV59HreFecTin, "99/99/99"));
                           }
                           else
                           {
                              AV59HreFecTin = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavHrefectin_Internalname), 0)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrefectin_Internalname, localUtil.format(AV59HreFecTin, "99/99/99"));
                           }
                           AV75Marca = httpContext.cgiGet( edtavMarca_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMarca_Internalname, AV75Marca);
                           AV76Hdr = httpContext.cgiGet( edtavHdr_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdr_Internalname, AV76Hdr);
                           AV77BarAGrest = GXutil.upper( httpContext.cgiGet( edtavBaragrest_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaragrest_Internalname, AV77BarAGrest);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARAGREST"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, GXutil.rtrim( localUtil.format( AV77BarAGrest, "@!"))));
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavHrebarkgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavHrebarkgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHREBARKGM");
                              GX_FocusControl = edtavHrebarkgm_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV57HreBarKgm = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebarkgm_Internalname, GXutil.ltrimstr( AV57HreBarKgm, 9, 2));
                           }
                           else
                           {
                              AV57HreBarKgm = localUtil.ctond( httpContext.cgiGet( edtavHrebarkgm_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebarkgm_Internalname, GXutil.ltrimstr( AV57HreBarKgm, 9, 2));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavHretotkgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavHretotkgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHRETOTKGM");
                              GX_FocusControl = edtavHretotkgm_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV58HreTotKgm = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHretotkgm_Internalname, GXutil.ltrimstr( AV58HreTotKgm, 9, 2));
                           }
                           else
                           {
                              AV58HreTotKgm = localUtil.ctond( httpContext.cgiGet( edtavHretotkgm_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHretotkgm_Internalname, GXutil.ltrimstr( AV58HreTotKgm, 9, 2));
                           }
                           AV78HreMaqCod = httpContext.cgiGet( edtavHremaqcod_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHremaqcod_Internalname, AV78HreMaqCod);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHrevolprd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHrevolprd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHREVOLPRD");
                              GX_FocusControl = edtavHrevolprd_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV79HreVolPrd = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrevolprd_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79HreVolPrd), 5, 0));
                           }
                           else
                           {
                              AV79HreVolPrd = (int)(localUtil.ctol( httpContext.cgiGet( edtavHrevolprd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrevolprd_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79HreVolPrd), 5, 0));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRb_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRb_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRB");
                              GX_FocusControl = edtavRb_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV80Rb = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRb_Internalname, GXutil.ltrimstr( AV80Rb, 7, 2));
                           }
                           else
                           {
                              AV80Rb = localUtil.ctond( httpContext.cgiGet( edtavRb_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRb_Internalname, GXutil.ltrimstr( AV80Rb, 7, 2));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCostei_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCostei_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOSTEI");
                              GX_FocusControl = edtavCostei_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV81Costei = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostei_Internalname, GXutil.ltrimstr( AV81Costei, 10, 2));
                           }
                           else
                           {
                              AV81Costei = localUtil.ctond( httpContext.cgiGet( edtavCostei_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostei_Internalname, GXutil.ltrimstr( AV81Costei, 10, 2));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCostet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCostet_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOSTET");
                              GX_FocusControl = edtavCostet_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV82CosteT = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostet_Internalname, GXutil.ltrimstr( AV82CosteT, 10, 2));
                           }
                           else
                           {
                              AV82CosteT = localUtil.ctond( httpContext.cgiGet( edtavCostet_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostet_Internalname, GXutil.ltrimstr( AV82CosteT, 10, 2));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDif_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDif_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIF");
                              GX_FocusControl = edtavDif_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV83Dif = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDif_Internalname, GXutil.ltrimstr( AV83Dif, 10, 2));
                           }
                           else
                           {
                              AV83Dif = localUtil.ctond( httpContext.cgiGet( edtavDif_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDif_Internalname, GXutil.ltrimstr( AV83Dif, 10, 2));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPorc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPorc_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPORC");
                              GX_FocusControl = edtavPorc_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV84Porc = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPorc_Internalname, GXutil.ltrimstr( AV84Porc, 6, 2));
                           }
                           else
                           {
                              AV84Porc = localUtil.ctond( httpContext.cgiGet( edtavPorc_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPorc_Internalname, GXutil.ltrimstr( AV84Porc, 6, 2));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCostek_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCostek_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOSTEK");
                              GX_FocusControl = edtavCostek_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV85CosteK = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostek_Internalname, GXutil.ltrimstr( AV85CosteK, 10, 2));
                           }
                           else
                           {
                              AV85CosteK = localUtil.ctond( httpContext.cgiGet( edtavCostek_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostek_Internalname, GXutil.ltrimstr( AV85CosteK, 10, 2));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
                              GX_FocusControl = edtavClicod_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV11CliCod = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliCod), 6, 0));
                           }
                           else
                           {
                              AV11CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliCod), 6, 0));
                           }
                           AV60CliNom = httpContext.cgiGet( edtavClinom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavClinom_Internalname, AV60CliNom);
                           AV61HreBarSer = httpContext.cgiGet( edtavHrebarser_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebarser_Internalname, AV61HreBarSer);
                           AV62HreBarDsc = httpContext.cgiGet( edtavHrebardsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebardsc_Internalname, AV62HreBarDsc);
                           AV65HreTipArtD = httpContext.cgiGet( edtavHretipartd_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHretipartd_Internalname, AV65HreTipArtD);
                           AV63HreColNom = httpContext.cgiGet( edtavHrecolnom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrecolnom_Internalname, AV63HreColNom);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHrecolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHrecolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHRECOLNUM");
                              GX_FocusControl = edtavHrecolnum_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV64HreColNum = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrecolnum_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64HreColNum), 6, 0));
                           }
                           else
                           {
                              AV64HreColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavHrecolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrecolnum_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64HreColNum), 6, 0));
                           }
                           AV66HreTipColN = httpContext.cgiGet( edtavHretipcoln_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHretipcoln_Internalname, AV66HreTipColN);
                           AV67HreIntDsc = httpContext.cgiGet( edtavHreintdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHreintdsc_Internalname, AV67HreIntDsc);
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavHredti_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHREDTI");
                              GX_FocusControl = edtavHredti_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV73HreDti = GXutil.resetTime( GXutil.nullDate() );
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHredti_Internalname, localUtil.ttoc( AV73HreDti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                           }
                           else
                           {
                              AV73HreDti = localUtil.ctot( httpContext.cgiGet( edtavHredti_Internalname), 0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHredti_Internalname, localUtil.ttoc( AV73HreDti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                           }
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavHredtf_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHREDTF");
                              GX_FocusControl = edtavHredtf_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV72HreDtf = GXutil.resetTime( GXutil.nullDate() );
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHredtf_Internalname, localUtil.ttoc( AV72HreDtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                           }
                           else
                           {
                              AV72HreDtf = localUtil.ctot( httpContext.cgiGet( edtavHredtf_Internalname), 0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHredtf_Internalname, localUtil.ttoc( AV72HreDtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHrebarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHrebarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHREBARCOD");
                              GX_FocusControl = edtavHrebarcod_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV68HreBarCod = 0 ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68HreBarCod), 8, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHREBARCOD"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV68HreBarCod), "ZZZZZZZ9")));
                           }
                           else
                           {
                              AV68HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavHrebarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68HreBarCod), 8, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHREBARCOD"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV68HreBarCod), "ZZZZZZZ9")));
                           }
                           AV69HreBarPar = httpContext.cgiGet( edtavHrebarpar_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebarpar_Internalname, AV69HreBarPar);
                           app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHREBARPAR"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, GXutil.rtrim( localUtil.format( AV69HreBarPar, ""))));
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHrebarreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHrebarreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHREBARREO");
                              GX_FocusControl = edtavHrebarreo_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV70HreBarReo = (byte)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebarreo_Internalname, GXutil.str( AV70HreBarReo, 1, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHREBARREO"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV70HreBarReo), "9")));
                           }
                           else
                           {
                              AV70HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavHrebarreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebarreo_Internalname, GXutil.str( AV70HreBarReo, 1, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHREBARREO"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV70HreBarReo), "9")));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHrenumcie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHrenumcie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHRENUMCIE");
                              GX_FocusControl = edtavHrenumcie_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV71HreNumCie = (byte)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrenumcie_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71HreNumCie), 2, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHRENUMCIE"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV71HreNumCie), "Z9")));
                           }
                           else
                           {
                              AV71HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( edtavHrenumcie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrenumcie_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71HreNumCie), 2, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHRENUMCIE"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV71HreNumCie), "Z9")));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHrelinmaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHrelinmaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHRELINMAQ");
                              GX_FocusControl = edtavHrelinmaq_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV86HreLinMaq = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrelinmaq_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86HreLinMaq), 4, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHRELINMAQ"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV86HreLinMaq), "ZZZ9")));
                           }
                           else
                           {
                              AV86HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtavHrelinmaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrelinmaq_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86HreLinMaq), 4, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHRELINMAQ"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV86HreLinMaq), "ZZZ9")));
                           }
                           AV87EncCli = httpContext.cgiGet( edtavEnccli_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEnccli_Internalname, AV87EncCli);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e161FT2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e171FT2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e181FT2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       if ( ! wbErr )
                                       {
                                          Rfr0gs = false ;
                                          if ( ! Rfr0gs )
                                          {
                                          }
                                          dynload_actions( ) ;
                                       }
                                    }
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                                 {
                                    strup1FT0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGrupodeacciones.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                    }
                                 }
                              }
                           }
                           else
                           {
                           }
                        }
                     }
                  }
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 78 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( sPrefix+"W0078") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess(sPrefix+"W0078", "", sEvt);
                        }
                        WebComp_Grid_dwc_Component = OldGrid_dwc ;
                     }
                     else if ( nCmpId == 91 )
                     {
                        OldWwpaux_wc = httpContext.cgiGet( sPrefix+"W0091") ;
                        if ( ( GXutil.len( OldWwpaux_wc) == 0 ) || ( GXutil.strcmp(OldWwpaux_wc, WebComp_Wwpaux_wc_Component) != 0 ) )
                        {
                           WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app." + OldWwpaux_wc + "_impl", remoteHandle, context);
                           WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                        }
                        if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
                        {
                           WebComp_Wwpaux_wc.componentprocess(sPrefix+"W0091", "", sEvt);
                        }
                        WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1FT2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1FT2( ) ;
         }
      }
   }

   public void pa1FT2( )
   {
      if ( nDonePA == 0 )
      {
         if ( GXutil.len( sPrefix) != 0 )
         {
            initialize_properties( ) ;
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
            {
               gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
            }
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableJsOutput();
            }
         }
         init_web_controls( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( toggleJsOutput )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableJsOutput();
               }
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = edtavFilterfulltext_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_372( ) ;
      while ( nGXsfl_37_idx <= nRC_GXsfl_37 )
      {
         sendrow_372( ) ;
         nGXsfl_37_idx = ((subGrid_Islastpage==1)&&(nGXsfl_37_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_37_idx+1) ;
         sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_372( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 byte AV50ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV45ColumnsSelector ,
                                 String AV33Emprcod ,
                                 String AV91HreRacabinout ,
                                 java.util.Date AV14Fecha ,
                                 java.util.Date AV15Fecha_to ,
                                 short AV55Calculo ,
                                 int AV8barcod ,
                                 byte AV10barcodreo ,
                                 String AV9barcodpar ,
                                 String AV5ArtCod ,
                                 String AV6ArtCod_to ,
                                 String AV17ForColNom ,
                                 String AV18ForColNom_to ,
                                 int AV20ForColNum ,
                                 int AV21ForColNum_to ,
                                 int AV89Clicodinout ,
                                 int AV90Clicodinout_to ,
                                 byte AV24IntCod ,
                                 byte AV25IntCod_to ,
                                 short AV27TipArtCod ,
                                 short AV28TipArtCod_to ,
                                 byte AV30TipColCod ,
                                 byte AV31TipColCod_to ,
                                 String AV113Pgmname ,
                                 String AV41FilterFullText ,
                                 String AV77BarAGrest ,
                                 byte AV88TablaA ,
                                 String A396EmprCod ,
                                 java.util.Date A4529HreFecTin ,
                                 int A4492HreBarCod ,
                                 byte A4493HreBarReo ,
                                 String A4494HreBarPar ,
                                 byte A4495HreNumCie ,
                                 String A9808HreRacab ,
                                 int A252CliCod ,
                                 String A4517HreBarSer ,
                                 short A4519HreTipArt ,
                                 String A4521HreColNom ,
                                 int A4522HreColNum ,
                                 byte A4525HreTipCol ,
                                 byte A4539HreIntCod ,
                                 java.math.BigDecimal A4532HreBarKgm ,
                                 java.math.BigDecimal A4542HreTotKgm ,
                                 String A13842BarNhdr_Hi ,
                                 String A279CliNom ,
                                 String A4518HreBarDsc ,
                                 String A4520HreTipArtD ,
                                 String A4526HreTipColN ,
                                 String A4540HreIntDsc ,
                                 java.util.Date A10104HreDtf ,
                                 java.util.Date A10103HreDti ,
                                 String A4516HreDisCli ,
                                 String A11318HreDispCli ,
                                 int A4497HreAgrCod ,
                                 int A9985HreAcCod ,
                                 short A4545HreLinMaq ,
                                 int A4547HreVolPrd ,
                                 java.math.BigDecimal A8602HreCosAA ,
                                 java.math.BigDecimal A8603HrecosAd ,
                                 java.math.BigDecimal A8604HreCosAnc ,
                                 java.math.BigDecimal A8605HreCosCol ,
                                 java.math.BigDecimal A8606HreCosPA ,
                                 java.math.BigDecimal A8607HreCosPD ,
                                 String A4546HreMaqCod ,
                                 String A4551HreProCod ,
                                 String A4552HreProDsc ,
                                 java.math.BigDecimal A4500HreAgrKgm ,
                                 byte A4498HreAgrReo ,
                                 String A4499HreAgrPar ,
                                 int A4503HreAgrCli ,
                                 String A4504HreAgrSer ,
                                 String A4505HreAgrDsc ,
                                 java.math.BigDecimal A9988HreAcKgm ,
                                 byte A9986HreAcReo ,
                                 String A9987HreAcPar ,
                                 int A9991HreAcCli ,
                                 String A9992HreAcSer ,
                                 String A9993HreAcDsc ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e171FT2 ();
      GRID_nCurrentRecord = 0 ;
      rf1FT2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARAGREST", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV77BarAGrest, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vBARAGREST", GXutil.rtrim( AV77BarAGrest));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTABLAA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV88TablaA), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTABLAA", GXutil.ltrim( localUtil.ntoc( AV88TablaA, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOA", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV42ToA, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOA", GXutil.rtrim( AV42ToA));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHREBARCOD", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV68HreBarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREBARCOD", GXutil.ltrim( localUtil.ntoc( AV68HreBarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHREBARREO", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV70HreBarReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREBARREO", GXutil.ltrim( localUtil.ntoc( AV70HreBarReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHREBARPAR", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV69HreBarPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREBARPAR", GXutil.rtrim( AV69HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHRENUMCIE", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV71HreNumCie), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHRENUMCIE", GXutil.ltrim( localUtil.ntoc( AV71HreNumCie, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHRELINMAQ", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV86HreLinMaq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHRELINMAQ", GXutil.ltrim( localUtil.ntoc( AV86HreLinMaq, (byte)(4), (byte)(0), ".", "")));
   }

   public void clear_multi_value_controls( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         dynload_actions( ) ;
         before_start_formulas( ) ;
      }
   }

   public void fix_multi_value_controls( )
   {
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1FT2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV113Pgmname = "CostesQuimicosAnalisis_WC" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavTablaa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTablaa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTablaa_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavToa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavToa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavToa_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrefectin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrefectin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrefectin_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavMarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMarca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMarca_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavBaragrest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaragrest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaragrest_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrebarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrebarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrebarkgm_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHretotkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHretotkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHretotkgm_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHremaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHremaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHremaqcod_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrevolprd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrevolprd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrevolprd_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavRb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRb_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavCostei_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostei_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostei_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavCostet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostet_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavDif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDif_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavPorc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPorc_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavCostek_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostek_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostek_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrebarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrebarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrebarser_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrebardsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrebardsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrebardsc_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHretipartd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHretipartd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHretipartd_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrecolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrecolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrecolnom_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrecolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrecolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrecolnum_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHretipcoln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHretipcoln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHretipcoln_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHreintdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHreintdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHreintdsc_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHredti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHredti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHredti_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHredtf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHredtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHredtf_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrebarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrebarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrebarcod_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrebarpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrebarpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrebarpar_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrebarreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrebarreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrebarreo_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrenumcie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrenumcie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrenumcie_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrelinmaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrelinmaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrelinmaq_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavEnccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnccli_Enabled), 5, 0), !bGXsfl_37_Refreshing);
   }

   public void rf1FT2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(37) ;
      /* Execute user event: Refresh */
      e171FT2 ();
      nGXsfl_37_idx = 1 ;
      sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_372( ) ;
      bGXsfl_37_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( subGrid_Islastpage != 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordcount( )-subgrid_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
            {
               WebComp_Grid_dwc.componentstart();
            }
         }
      }
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
            {
               WebComp_Wwpaux_wc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_372( ) ;
         e181FT2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_37_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e181FT2 ();
         }
         wbEnd = (short)(37) ;
         wb1FT0( ) ;
      }
      bGXsfl_37_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1FT2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV113Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV113Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARAGREST"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, GXutil.rtrim( localUtil.format( AV77BarAGrest, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTABLAA"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV88TablaA), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOA"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, GXutil.rtrim( localUtil.format( AV42ToA, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHREBARCOD"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV68HreBarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHREBARREO"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV70HreBarReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHREBARPAR"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, GXutil.rtrim( localUtil.format( AV69HreBarPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHRENUMCIE"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV71HreNumCie), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHRELINMAQ"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV86HreLinMaq), "ZZZ9")));
   }

   public int subgrid_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgrid_fnc_recordcount( )
   {
      return (int)(((subGrid_Recordcount==0) ? GRID_nFirstRecordOnPage+1 : subGrid_Recordcount)) ;
   }

   public int subgrid_fnc_recordsperpage( )
   {
      if ( subGrid_Rows > 0 )
      {
         return subGrid_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid_fnc_currentpage( )
   {
      return (int)(((subGrid_Islastpage==1) ? subgrid_fnc_recordcount( )/ (double) (subgrid_fnc_recordsperpage( ))+((((int)((subgrid_fnc_recordcount( )) % (subgrid_fnc_recordsperpage( ))))==0) ? 0 : 1) : GXutil.Int( GRID_nFirstRecordOnPage/ (double) (subgrid_fnc_recordsperpage( )))+1)) ;
   }

   public short subgrid_firstpage( )
   {
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV50ManageFiltersExecutionStep, AV45ColumnsSelector, AV33Emprcod, AV91HreRacabinout, AV14Fecha, AV15Fecha_to, AV55Calculo, AV8barcod, AV10barcodreo, AV9barcodpar, AV5ArtCod, AV6ArtCod_to, AV17ForColNom, AV18ForColNom_to, AV20ForColNum, AV21ForColNum_to, AV89Clicodinout, AV90Clicodinout_to, AV24IntCod, AV25IntCod_to, AV27TipArtCod, AV28TipArtCod_to, AV30TipColCod, AV31TipColCod_to, AV113Pgmname, AV41FilterFullText, AV77BarAGrest, AV88TablaA, A396EmprCod, A4529HreFecTin, A4492HreBarCod, A4493HreBarReo, A4494HreBarPar, A4495HreNumCie, A9808HreRacab, A252CliCod, A4517HreBarSer, A4519HreTipArt, A4521HreColNom, A4522HreColNum, A4525HreTipCol, A4539HreIntCod, A4532HreBarKgm, A4542HreTotKgm, A13842BarNhdr_Hi, A279CliNom, A4518HreBarDsc, A4520HreTipArtD, A4526HreTipColN, A4540HreIntDsc, A10104HreDtf, A10103HreDti, A4516HreDisCli, A11318HreDispCli, A4497HreAgrCod, A9985HreAcCod, A4545HreLinMaq, A4547HreVolPrd, A8602HreCosAA, A8603HrecosAd, A8604HreCosAnc, A8605HreCosCol, A8606HreCosPA, A8607HreCosPD, A4546HreMaqCod, A4551HreProCod, A4552HreProDsc, A4500HreAgrKgm, A4498HreAgrReo, A4499HreAgrPar, A4503HreAgrCli, A4504HreAgrSer, A4505HreAgrDsc, A9988HreAcKgm, A9986HreAcReo, A9987HreAcPar, A9991HreAcCli, A9992HreAcSer, A9993HreAcDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV50ManageFiltersExecutionStep, AV45ColumnsSelector, AV33Emprcod, AV91HreRacabinout, AV14Fecha, AV15Fecha_to, AV55Calculo, AV8barcod, AV10barcodreo, AV9barcodpar, AV5ArtCod, AV6ArtCod_to, AV17ForColNom, AV18ForColNom_to, AV20ForColNum, AV21ForColNum_to, AV89Clicodinout, AV90Clicodinout_to, AV24IntCod, AV25IntCod_to, AV27TipArtCod, AV28TipArtCod_to, AV30TipColCod, AV31TipColCod_to, AV113Pgmname, AV41FilterFullText, AV77BarAGrest, AV88TablaA, A396EmprCod, A4529HreFecTin, A4492HreBarCod, A4493HreBarReo, A4494HreBarPar, A4495HreNumCie, A9808HreRacab, A252CliCod, A4517HreBarSer, A4519HreTipArt, A4521HreColNom, A4522HreColNum, A4525HreTipCol, A4539HreIntCod, A4532HreBarKgm, A4542HreTotKgm, A13842BarNhdr_Hi, A279CliNom, A4518HreBarDsc, A4520HreTipArtD, A4526HreTipColN, A4540HreIntDsc, A10104HreDtf, A10103HreDti, A4516HreDisCli, A11318HreDispCli, A4497HreAgrCod, A9985HreAcCod, A4545HreLinMaq, A4547HreVolPrd, A8602HreCosAA, A8603HrecosAd, A8604HreCosAnc, A8605HreCosCol, A8606HreCosPA, A8607HreCosPD, A4546HreMaqCod, A4551HreProCod, A4552HreProDsc, A4500HreAgrKgm, A4498HreAgrReo, A4499HreAgrPar, A4503HreAgrCli, A4504HreAgrSer, A4505HreAgrDsc, A9988HreAcKgm, A9986HreAcReo, A9987HreAcPar, A9991HreAcCli, A9992HreAcSer, A9993HreAcDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      if ( GRID_nFirstRecordOnPage >= subgrid_fnc_recordsperpage( ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage-subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV50ManageFiltersExecutionStep, AV45ColumnsSelector, AV33Emprcod, AV91HreRacabinout, AV14Fecha, AV15Fecha_to, AV55Calculo, AV8barcod, AV10barcodreo, AV9barcodpar, AV5ArtCod, AV6ArtCod_to, AV17ForColNom, AV18ForColNom_to, AV20ForColNum, AV21ForColNum_to, AV89Clicodinout, AV90Clicodinout_to, AV24IntCod, AV25IntCod_to, AV27TipArtCod, AV28TipArtCod_to, AV30TipColCod, AV31TipColCod_to, AV113Pgmname, AV41FilterFullText, AV77BarAGrest, AV88TablaA, A396EmprCod, A4529HreFecTin, A4492HreBarCod, A4493HreBarReo, A4494HreBarPar, A4495HreNumCie, A9808HreRacab, A252CliCod, A4517HreBarSer, A4519HreTipArt, A4521HreColNom, A4522HreColNum, A4525HreTipCol, A4539HreIntCod, A4532HreBarKgm, A4542HreTotKgm, A13842BarNhdr_Hi, A279CliNom, A4518HreBarDsc, A4520HreTipArtD, A4526HreTipColN, A4540HreIntDsc, A10104HreDtf, A10103HreDti, A4516HreDisCli, A11318HreDispCli, A4497HreAgrCod, A9985HreAcCod, A4545HreLinMaq, A4547HreVolPrd, A8602HreCosAA, A8603HrecosAd, A8604HreCosAnc, A8605HreCosCol, A8606HreCosPA, A8607HreCosPD, A4546HreMaqCod, A4551HreProCod, A4552HreProDsc, A4500HreAgrKgm, A4498HreAgrReo, A4499HreAgrPar, A4503HreAgrCli, A4504HreAgrSer, A4505HreAgrDsc, A9988HreAcKgm, A9986HreAcReo, A9987HreAcPar, A9991HreAcCli, A9992HreAcSer, A9993HreAcDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV50ManageFiltersExecutionStep, AV45ColumnsSelector, AV33Emprcod, AV91HreRacabinout, AV14Fecha, AV15Fecha_to, AV55Calculo, AV8barcod, AV10barcodreo, AV9barcodpar, AV5ArtCod, AV6ArtCod_to, AV17ForColNom, AV18ForColNom_to, AV20ForColNum, AV21ForColNum_to, AV89Clicodinout, AV90Clicodinout_to, AV24IntCod, AV25IntCod_to, AV27TipArtCod, AV28TipArtCod_to, AV30TipColCod, AV31TipColCod_to, AV113Pgmname, AV41FilterFullText, AV77BarAGrest, AV88TablaA, A396EmprCod, A4529HreFecTin, A4492HreBarCod, A4493HreBarReo, A4494HreBarPar, A4495HreNumCie, A9808HreRacab, A252CliCod, A4517HreBarSer, A4519HreTipArt, A4521HreColNom, A4522HreColNum, A4525HreTipCol, A4539HreIntCod, A4532HreBarKgm, A4542HreTotKgm, A13842BarNhdr_Hi, A279CliNom, A4518HreBarDsc, A4520HreTipArtD, A4526HreTipColN, A4540HreIntDsc, A10104HreDtf, A10103HreDti, A4516HreDisCli, A11318HreDispCli, A4497HreAgrCod, A9985HreAcCod, A4545HreLinMaq, A4547HreVolPrd, A8602HreCosAA, A8603HrecosAd, A8604HreCosAnc, A8605HreCosCol, A8606HreCosPA, A8607HreCosPD, A4546HreMaqCod, A4551HreProCod, A4552HreProDsc, A4500HreAgrKgm, A4498HreAgrReo, A4499HreAgrPar, A4503HreAgrCli, A4504HreAgrSer, A4505HreAgrDsc, A9988HreAcKgm, A9986HreAcReo, A9987HreAcPar, A9991HreAcCli, A9992HreAcSer, A9993HreAcDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV50ManageFiltersExecutionStep, AV45ColumnsSelector, AV33Emprcod, AV91HreRacabinout, AV14Fecha, AV15Fecha_to, AV55Calculo, AV8barcod, AV10barcodreo, AV9barcodpar, AV5ArtCod, AV6ArtCod_to, AV17ForColNom, AV18ForColNom_to, AV20ForColNum, AV21ForColNum_to, AV89Clicodinout, AV90Clicodinout_to, AV24IntCod, AV25IntCod_to, AV27TipArtCod, AV28TipArtCod_to, AV30TipColCod, AV31TipColCod_to, AV113Pgmname, AV41FilterFullText, AV77BarAGrest, AV88TablaA, A396EmprCod, A4529HreFecTin, A4492HreBarCod, A4493HreBarReo, A4494HreBarPar, A4495HreNumCie, A9808HreRacab, A252CliCod, A4517HreBarSer, A4519HreTipArt, A4521HreColNom, A4522HreColNum, A4525HreTipCol, A4539HreIntCod, A4532HreBarKgm, A4542HreTotKgm, A13842BarNhdr_Hi, A279CliNom, A4518HreBarDsc, A4520HreTipArtD, A4526HreTipColN, A4540HreIntDsc, A10104HreDtf, A10103HreDti, A4516HreDisCli, A11318HreDispCli, A4497HreAgrCod, A9985HreAcCod, A4545HreLinMaq, A4547HreVolPrd, A8602HreCosAA, A8603HrecosAd, A8604HreCosAnc, A8605HreCosCol, A8606HreCosPA, A8607HreCosPD, A4546HreMaqCod, A4551HreProCod, A4552HreProDsc, A4500HreAgrKgm, A4498HreAgrReo, A4499HreAgrPar, A4503HreAgrCli, A4504HreAgrSer, A4505HreAgrDsc, A9988HreAcKgm, A9986HreAcReo, A9987HreAcPar, A9991HreAcCli, A9992HreAcSer, A9993HreAcDsc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV113Pgmname = "CostesQuimicosAnalisis_WC" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavTablaa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTablaa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTablaa_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavToa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavToa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavToa_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrefectin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrefectin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrefectin_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavMarca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMarca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMarca_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavBaragrest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaragrest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaragrest_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrebarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrebarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrebarkgm_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHretotkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHretotkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHretotkgm_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHremaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHremaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHremaqcod_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrevolprd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrevolprd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrevolprd_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavRb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRb_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavCostei_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostei_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostei_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavCostet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostet_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavDif_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDif_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDif_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavPorc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPorc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPorc_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavCostek_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostek_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostek_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrebarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrebarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrebarser_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrebardsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrebardsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrebardsc_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHretipartd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHretipartd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHretipartd_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrecolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrecolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrecolnom_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrecolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrecolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrecolnum_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHretipcoln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHretipcoln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHretipcoln_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHreintdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHreintdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHreintdsc_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHredti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHredti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHredti_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHredtf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHredtf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHredtf_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrebarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrebarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrebarcod_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrebarpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrebarpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrebarpar_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrebarreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrebarreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrebarreo_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrenumcie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrenumcie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrenumcie_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrelinmaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrelinmaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrelinmaq_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      edtavEnccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnccli_Enabled), 5, 0), !bGXsfl_37_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup1FT0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e161FT2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV48ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV51DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV45ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_37 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_37"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV53GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV54GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV33Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV33Emprcod") ;
         wcpOAV91HreRacabinout = httpContext.cgiGet( sPrefix+"wcpOAV91HreRacabinout") ;
         wcpOAV14Fecha = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV14Fecha"), 0) ;
         wcpOAV15Fecha_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV15Fecha_to"), 0) ;
         wcpOAV55Calculo = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV55Calculo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV8barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV10barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV9barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV9barcodpar") ;
         wcpOAV5ArtCod = httpContext.cgiGet( sPrefix+"wcpOAV5ArtCod") ;
         wcpOAV6ArtCod_to = httpContext.cgiGet( sPrefix+"wcpOAV6ArtCod_to") ;
         wcpOAV17ForColNom = httpContext.cgiGet( sPrefix+"wcpOAV17ForColNom") ;
         wcpOAV18ForColNom_to = httpContext.cgiGet( sPrefix+"wcpOAV18ForColNom_to") ;
         wcpOAV20ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV20ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV21ForColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV21ForColNum_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV89Clicodinout = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV89Clicodinout"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV90Clicodinout_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV90Clicodinout_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV24IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV24IntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV25IntCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV25IntCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV27TipArtCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV27TipArtCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV28TipArtCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV28TipArtCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV30TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV30TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV31TipColCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV31TipColCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV33Emprcod = httpContext.cgiGet( sPrefix+"vEMPRCOD") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_managefilters_Icontype = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icontype") ;
         Ddo_managefilters_Icon = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icon") ;
         Ddo_managefilters_Tooltip = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Tooltip") ;
         Ddo_managefilters_Cls = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Cls") ;
         Dvpanel_tableheader_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Width") ;
         Dvpanel_tableheader_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autowidth")) ;
         Dvpanel_tableheader_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autoheight")) ;
         Dvpanel_tableheader_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Cls") ;
         Dvpanel_tableheader_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Title") ;
         Dvpanel_tableheader_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Collapsible")) ;
         Dvpanel_tableheader_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Collapsed")) ;
         Dvpanel_tableheader_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Showcollapseicon")) ;
         Dvpanel_tableheader_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Iconposition") ;
         Dvpanel_tableheader_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autoscroll")) ;
         Gridpaginationbar_Class = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Class") ;
         Gridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showfirst")) ;
         Gridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showprevious")) ;
         Gridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Shownext")) ;
         Gridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showlast")) ;
         Gridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Gridpaginationbar_Emptygridclass = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Emptygridclass") ;
         Gridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Gridpaginationbar_Previous = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Previous") ;
         Gridpaginationbar_Next = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Next") ;
         Gridpaginationbar_Caption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Caption") ;
         Gridpaginationbar_Emptygridcaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption") ;
         Gridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Detailwebcomponent_modal_Width = httpContext.cgiGet( sPrefix+"DETAILWEBCOMPONENT_MODAL_Width") ;
         Detailwebcomponent_modal_Title = httpContext.cgiGet( sPrefix+"DETAILWEBCOMPONENT_MODAL_Title") ;
         Detailwebcomponent_modal_Confirmtype = httpContext.cgiGet( sPrefix+"DETAILWEBCOMPONENT_MODAL_Confirmtype") ;
         Detailwebcomponent_modal_Bodytype = httpContext.cgiGet( sPrefix+"DETAILWEBCOMPONENT_MODAL_Bodytype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         AV41FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41FilterFullText", AV41FilterFullText);
         /* Read subfile selected row values. */
         nGXsfl_37_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_372( ) ;
         if ( nGXsfl_37_idx > 0 )
         {
            cmbavGrupodeacciones.setName( cmbavGrupodeacciones.getInternalname() );
            cmbavGrupodeacciones.setValue( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()) );
            AV98GrupodeAcciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavGrupodeacciones.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98GrupodeAcciones), 4, 0));
            AV97DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV97DetailWebComponent);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTablaa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTablaa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTABLAA");
               GX_FocusControl = edtavTablaa_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV88TablaA = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTablaa_Internalname, GXutil.str( AV88TablaA, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTABLAA"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV88TablaA), "9")));
            }
            else
            {
               AV88TablaA = (byte)(localUtil.ctol( httpContext.cgiGet( edtavTablaa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTablaa_Internalname, GXutil.str( AV88TablaA, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTABLAA"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV88TablaA), "9")));
            }
            AV42ToA = httpContext.cgiGet( edtavToa_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavToa_Internalname, AV42ToA);
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOA"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, GXutil.rtrim( localUtil.format( AV42ToA, ""))));
            if ( localUtil.vcdate( httpContext.cgiGet( edtavHrefectin_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vHREFECTIN");
               GX_FocusControl = edtavHrefectin_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV59HreFecTin = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrefectin_Internalname, localUtil.format(AV59HreFecTin, "99/99/99"));
            }
            else
            {
               AV59HreFecTin = localUtil.ctod( httpContext.cgiGet( edtavHrefectin_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrefectin_Internalname, localUtil.format(AV59HreFecTin, "99/99/99"));
            }
            AV75Marca = httpContext.cgiGet( edtavMarca_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMarca_Internalname, AV75Marca);
            AV76Hdr = httpContext.cgiGet( edtavHdr_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdr_Internalname, AV76Hdr);
            AV77BarAGrest = GXutil.upper( httpContext.cgiGet( edtavBaragrest_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaragrest_Internalname, AV77BarAGrest);
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARAGREST"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, GXutil.rtrim( localUtil.format( AV77BarAGrest, "@!"))));
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavHrebarkgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavHrebarkgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHREBARKGM");
               GX_FocusControl = edtavHrebarkgm_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV57HreBarKgm = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebarkgm_Internalname, GXutil.ltrimstr( AV57HreBarKgm, 9, 2));
            }
            else
            {
               AV57HreBarKgm = localUtil.ctond( httpContext.cgiGet( edtavHrebarkgm_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebarkgm_Internalname, GXutil.ltrimstr( AV57HreBarKgm, 9, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavHretotkgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavHretotkgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHRETOTKGM");
               GX_FocusControl = edtavHretotkgm_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV58HreTotKgm = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHretotkgm_Internalname, GXutil.ltrimstr( AV58HreTotKgm, 9, 2));
            }
            else
            {
               AV58HreTotKgm = localUtil.ctond( httpContext.cgiGet( edtavHretotkgm_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHretotkgm_Internalname, GXutil.ltrimstr( AV58HreTotKgm, 9, 2));
            }
            AV78HreMaqCod = httpContext.cgiGet( edtavHremaqcod_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHremaqcod_Internalname, AV78HreMaqCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHrevolprd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHrevolprd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHREVOLPRD");
               GX_FocusControl = edtavHrevolprd_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV79HreVolPrd = 0 ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrevolprd_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79HreVolPrd), 5, 0));
            }
            else
            {
               AV79HreVolPrd = (int)(localUtil.ctol( httpContext.cgiGet( edtavHrevolprd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrevolprd_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79HreVolPrd), 5, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRb_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRb_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRB");
               GX_FocusControl = edtavRb_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV80Rb = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRb_Internalname, GXutil.ltrimstr( AV80Rb, 7, 2));
            }
            else
            {
               AV80Rb = localUtil.ctond( httpContext.cgiGet( edtavRb_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRb_Internalname, GXutil.ltrimstr( AV80Rb, 7, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCostei_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCostei_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOSTEI");
               GX_FocusControl = edtavCostei_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV81Costei = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostei_Internalname, GXutil.ltrimstr( AV81Costei, 10, 2));
            }
            else
            {
               AV81Costei = localUtil.ctond( httpContext.cgiGet( edtavCostei_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostei_Internalname, GXutil.ltrimstr( AV81Costei, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCostet_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCostet_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOSTET");
               GX_FocusControl = edtavCostet_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV82CosteT = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostet_Internalname, GXutil.ltrimstr( AV82CosteT, 10, 2));
            }
            else
            {
               AV82CosteT = localUtil.ctond( httpContext.cgiGet( edtavCostet_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostet_Internalname, GXutil.ltrimstr( AV82CosteT, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDif_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDif_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIF");
               GX_FocusControl = edtavDif_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV83Dif = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDif_Internalname, GXutil.ltrimstr( AV83Dif, 10, 2));
            }
            else
            {
               AV83Dif = localUtil.ctond( httpContext.cgiGet( edtavDif_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDif_Internalname, GXutil.ltrimstr( AV83Dif, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPorc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPorc_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPORC");
               GX_FocusControl = edtavPorc_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV84Porc = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPorc_Internalname, GXutil.ltrimstr( AV84Porc, 6, 2));
            }
            else
            {
               AV84Porc = localUtil.ctond( httpContext.cgiGet( edtavPorc_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPorc_Internalname, GXutil.ltrimstr( AV84Porc, 6, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavCostek_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCostek_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOSTEK");
               GX_FocusControl = edtavCostek_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV85CosteK = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostek_Internalname, GXutil.ltrimstr( AV85CosteK, 10, 2));
            }
            else
            {
               AV85CosteK = localUtil.ctond( httpContext.cgiGet( edtavCostek_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostek_Internalname, GXutil.ltrimstr( AV85CosteK, 10, 2));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
               GX_FocusControl = edtavClicod_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV11CliCod = 0 ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliCod), 6, 0));
            }
            else
            {
               AV11CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliCod), 6, 0));
            }
            AV60CliNom = httpContext.cgiGet( edtavClinom_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavClinom_Internalname, AV60CliNom);
            AV61HreBarSer = httpContext.cgiGet( edtavHrebarser_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebarser_Internalname, AV61HreBarSer);
            AV62HreBarDsc = httpContext.cgiGet( edtavHrebardsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebardsc_Internalname, AV62HreBarDsc);
            AV65HreTipArtD = httpContext.cgiGet( edtavHretipartd_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHretipartd_Internalname, AV65HreTipArtD);
            AV63HreColNom = httpContext.cgiGet( edtavHrecolnom_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrecolnom_Internalname, AV63HreColNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHrecolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHrecolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHRECOLNUM");
               GX_FocusControl = edtavHrecolnum_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV64HreColNum = 0 ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrecolnum_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64HreColNum), 6, 0));
            }
            else
            {
               AV64HreColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavHrecolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrecolnum_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64HreColNum), 6, 0));
            }
            AV66HreTipColN = httpContext.cgiGet( edtavHretipcoln_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHretipcoln_Internalname, AV66HreTipColN);
            AV67HreIntDsc = httpContext.cgiGet( edtavHreintdsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHreintdsc_Internalname, AV67HreIntDsc);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtavHredti_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHREDTI");
               GX_FocusControl = edtavHredti_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV73HreDti = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHredti_Internalname, localUtil.ttoc( AV73HreDti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               AV73HreDti = localUtil.ctot( httpContext.cgiGet( edtavHredti_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHredti_Internalname, localUtil.ttoc( AV73HreDti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( localUtil.vcdtime( httpContext.cgiGet( edtavHredtf_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vHREDTF");
               GX_FocusControl = edtavHredtf_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV72HreDtf = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHredtf_Internalname, localUtil.ttoc( AV72HreDtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               AV72HreDtf = localUtil.ctot( httpContext.cgiGet( edtavHredtf_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHredtf_Internalname, localUtil.ttoc( AV72HreDtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHrebarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHrebarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHREBARCOD");
               GX_FocusControl = edtavHrebarcod_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV68HreBarCod = 0 ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68HreBarCod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHREBARCOD"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV68HreBarCod), "ZZZZZZZ9")));
            }
            else
            {
               AV68HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavHrebarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68HreBarCod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHREBARCOD"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV68HreBarCod), "ZZZZZZZ9")));
            }
            AV69HreBarPar = httpContext.cgiGet( edtavHrebarpar_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebarpar_Internalname, AV69HreBarPar);
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHREBARPAR"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, GXutil.rtrim( localUtil.format( AV69HreBarPar, ""))));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHrebarreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHrebarreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHREBARREO");
               GX_FocusControl = edtavHrebarreo_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV70HreBarReo = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebarreo_Internalname, GXutil.str( AV70HreBarReo, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHREBARREO"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV70HreBarReo), "9")));
            }
            else
            {
               AV70HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavHrebarreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebarreo_Internalname, GXutil.str( AV70HreBarReo, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHREBARREO"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV70HreBarReo), "9")));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHrenumcie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHrenumcie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHRENUMCIE");
               GX_FocusControl = edtavHrenumcie_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV71HreNumCie = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrenumcie_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71HreNumCie), 2, 0));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHRENUMCIE"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV71HreNumCie), "Z9")));
            }
            else
            {
               AV71HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( edtavHrenumcie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrenumcie_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71HreNumCie), 2, 0));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHRENUMCIE"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV71HreNumCie), "Z9")));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavHrelinmaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavHrelinmaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vHRELINMAQ");
               GX_FocusControl = edtavHrelinmaq_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV86HreLinMaq = (short)(0) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrelinmaq_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86HreLinMaq), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHRELINMAQ"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV86HreLinMaq), "ZZZ9")));
            }
            else
            {
               AV86HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtavHrelinmaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrelinmaq_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86HreLinMaq), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHRELINMAQ"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV86HreLinMaq), "ZZZ9")));
            }
            AV87EncCli = httpContext.cgiGet( edtavEnccli_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEnccli_Internalname, AV87EncCli);
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e161FT2 ();
      if (returnInSub) return;
   }

   public void e161FT2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV103Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      costesquimicosanalisis_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV103Station = GXt_char1 ;
      GXv_char2[0] = AV33Emprcod ;
      GXv_char3[0] = AV104Emprnom ;
      GXv_char4[0] = AV105Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV103Station, GXv_char2, GXv_char3, GXv_char4) ;
      costesquimicosanalisis_wc_impl.this.AV33Emprcod = GXv_char2[0] ;
      costesquimicosanalisis_wc_impl.this.AV104Emprnom = GXv_char3[0] ;
      costesquimicosanalisis_wc_impl.this.AV105Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Emprcod", AV33Emprcod);
      divCell_grid_dwc_Class = "Invisible WCD_"+GXutil.upper( subGrid_Internalname) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divCell_grid_dwc_Internalname, "Class", divCell_grid_dwc_Class, true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      /* Execute user subroutine: 'LOADSAVEDFILTERS' */
      S112 ();
      if (returnInSub) return;
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV51DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV51DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e171FT2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV35WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV35WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV50ManageFiltersExecutionStep == 1 )
      {
         AV50ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50ManageFiltersExecutionStep", GXutil.str( AV50ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV50ManageFiltersExecutionStep == 2 )
      {
         AV50ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50ManageFiltersExecutionStep", GXutil.str( AV50ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV47Session.getValue("CostesQuimicosAnalisis_WCColumnsSelector"), "") != 0 )
      {
         AV43ColumnsSelectorXML = AV47Session.getValue("CostesQuimicosAnalisis_WCColumnsSelector") ;
         AV45ColumnsSelector.fromxml(AV43ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S142 ();
         if (returnInSub) return;
      }
      edtavToa_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavToa_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavToa_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrefectin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrefectin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrefectin_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavMarca_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMarca_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMarca_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavHdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavBaragrest_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaragrest_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaragrest_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrebarkgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrebarkgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrebarkgm_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavHretotkgm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHretotkgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHretotkgm_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavHremaqcod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHremaqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHremaqcod_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrevolprd_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrevolprd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrevolprd_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavRb_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRb_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavCostei_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostei_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostei_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavCostet_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+12)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostet_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostet_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavDif_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+13)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDif_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDif_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavPorc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+14)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPorc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPorc_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavCostek_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+15)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostek_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCostek_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavClicod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+16)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavClinom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+17)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrebarser_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+18)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrebarser_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrebarser_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrebardsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+19)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrebardsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrebardsc_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavHretipartd_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+20)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHretipartd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHretipartd_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrecolnom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+21)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrecolnom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrecolnom_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavHrecolnum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+22)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrecolnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHrecolnum_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavHretipcoln_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+23)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHretipcoln_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHretipcoln_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavHreintdsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+24)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHreintdsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHreintdsc_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavHredti_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+25)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHredti_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHredti_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavHredtf_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+26)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHredtf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHredtf_Visible), 5, 0), !bGXsfl_37_Refreshing);
      edtavEnccli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV45ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+27)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnccli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEnccli_Visible), 5, 0), !bGXsfl_37_Refreshing);
      AV53GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GridCurrentPage), 10, 0));
      cmbavGrupodeacciones.setColumnHeaderClass( "WWActionGroupColumn" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGrupodeacciones.getInternalname(), "Columnheaderclass", cmbavGrupodeacciones.getColumnHeaderClass(), !bGXsfl_37_Refreshing);
      edtavDetailwebcomponent_Columnheaderclass = "WWIconActionColumn WCD_ActionColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Columnheaderclass", edtavDetailwebcomponent_Columnheaderclass, !bGXsfl_37_Refreshing);
      edtavToa_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavToa_Internalname, "Columnheaderclass", edtavToa_Columnheaderclass, !bGXsfl_37_Refreshing);
      edtavHrefectin_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrefectin_Internalname, "Columnheaderclass", edtavHrefectin_Columnheaderclass, !bGXsfl_37_Refreshing);
      edtavMarca_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMarca_Internalname, "Columnheaderclass", edtavMarca_Columnheaderclass, !bGXsfl_37_Refreshing);
      edtavHdr_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdr_Internalname, "Columnheaderclass", edtavHdr_Columnheaderclass, !bGXsfl_37_Refreshing);
      edtavBaragrest_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaragrest_Internalname, "Columnheaderclass", edtavBaragrest_Columnheaderclass, !bGXsfl_37_Refreshing);
      edtavHrebarkgm_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrebarkgm_Internalname, "Columnheaderclass", edtavHrebarkgm_Columnheaderclass, !bGXsfl_37_Refreshing);
      edtavHretotkgm_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHretotkgm_Internalname, "Columnheaderclass", edtavHretotkgm_Columnheaderclass, !bGXsfl_37_Refreshing);
      edtavHremaqcod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHremaqcod_Internalname, "Columnheaderclass", edtavHremaqcod_Columnheaderclass, !bGXsfl_37_Refreshing);
      edtavHrevolprd_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrevolprd_Internalname, "Columnheaderclass", edtavHrevolprd_Columnheaderclass, !bGXsfl_37_Refreshing);
      edtavRb_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRb_Internalname, "Columnheaderclass", edtavRb_Columnheaderclass, !bGXsfl_37_Refreshing);
      edtavCostei_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostei_Internalname, "Columnheaderclass", edtavCostei_Columnheaderclass, !bGXsfl_37_Refreshing);
      edtavCostet_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostet_Internalname, "Columnheaderclass", edtavCostet_Columnheaderclass, !bGXsfl_37_Refreshing);
      edtavDif_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDif_Internalname, "Columnheaderclass", edtavDif_Columnheaderclass, !bGXsfl_37_Refreshing);
      edtavPorc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPorc_Internalname, "Columnheaderclass", edtavPorc_Columnheaderclass, !bGXsfl_37_Refreshing);
      edtavCostek_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostek_Internalname, "Columnheaderclass", edtavCostek_Columnheaderclass, !bGXsfl_37_Refreshing);
      edtavClicod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicod_Internalname, "Columnheaderclass", edtavClicod_Columnheaderclass, !bGXsfl_37_Refreshing);
      edtavClinom_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Columnheaderclass", edtavClinom_Columnheaderclass, !bGXsfl_37_Refreshing);
      edtavHrebarser_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrebarser_Internalname, "Columnheaderclass", edtavHrebarser_Columnheaderclass, !bGXsfl_37_Refreshing);
      edtavHrebardsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrebardsc_Internalname, "Columnheaderclass", edtavHrebardsc_Columnheaderclass, !bGXsfl_37_Refreshing);
      edtavHretipartd_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHretipartd_Internalname, "Columnheaderclass", edtavHretipartd_Columnheaderclass, !bGXsfl_37_Refreshing);
      edtavHrecolnom_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrecolnom_Internalname, "Columnheaderclass", edtavHrecolnom_Columnheaderclass, !bGXsfl_37_Refreshing);
      edtavHrecolnum_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrecolnum_Internalname, "Columnheaderclass", edtavHrecolnum_Columnheaderclass, !bGXsfl_37_Refreshing);
      edtavHretipcoln_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHretipcoln_Internalname, "Columnheaderclass", edtavHretipcoln_Columnheaderclass, !bGXsfl_37_Refreshing);
      edtavHreintdsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHreintdsc_Internalname, "Columnheaderclass", edtavHreintdsc_Columnheaderclass, !bGXsfl_37_Refreshing);
      edtavHredti_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHredti_Internalname, "Columnheaderclass", edtavHredti_Columnheaderclass, !bGXsfl_37_Refreshing);
      edtavHredtf_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHredtf_Internalname, "Columnheaderclass", edtavHredtf_Columnheaderclass, !bGXsfl_37_Refreshing);
      edtavEnccli_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnccli_Internalname, "Columnheaderclass", edtavEnccli_Columnheaderclass, !bGXsfl_37_Refreshing);
      GXt_int8 = AV56NumeroRegistros ;
      GXv_int9[0] = GXt_int8 ;
      new app.registroscostesquimicosanalisis(remoteHandle, context).execute( AV33Emprcod, AV91HreRacabinout, AV14Fecha, AV15Fecha_to, AV55Calculo, AV8barcod, AV10barcodreo, AV9barcodpar, AV5ArtCod, AV6ArtCod_to, AV17ForColNom, AV18ForColNom_to, AV20ForColNum, AV21ForColNum_to, AV89Clicodinout, AV90Clicodinout_to, AV24IntCod, AV25IntCod_to, AV27TipArtCod, AV28TipArtCod_to, AV30TipColCod, AV31TipColCod_to, GXv_int9) ;
      costesquimicosanalisis_wc_impl.this.GXt_int8 = GXv_int9[0] ;
      AV56NumeroRegistros = GXt_int8 ;
      AV54GridPageCount = (long)((AV56NumeroRegistros/ (double) (10))+1) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54GridPageCount), 10, 0));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV45ColumnsSelector", AV45ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV48ManageFiltersData", AV48ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV39GridState", AV39GridState);
   }

   public void e121FT2( )
   {
      /* Gridpaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgrid_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Next") == 0 )
      {
         subgrid_nextpage( ) ;
      }
      else
      {
         AV52PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV52PageToGo) ;
      }
   }

   public void e131FT2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e181FT2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGrupodeacciones.removeAllItems();
      cmbavGrupodeacciones.addItem("0", ";fa fa-bars", (short)(0));
      if ( GXutil.strcmp(AV77BarAGrest, "S") == 0 )
      {
         cmbavGrupodeacciones.addItem("1", httpContext.getMessage( "Ver Agrupaciones", ""), (short)(0));
      }
      if ( cmbavGrupodeacciones.getItemCount() == 1 )
      {
         cmbavGrupodeacciones.setThemeClass( "Invisible" );
      }
      else
      {
         cmbavGrupodeacciones.setThemeClass( "ConvertToDDO" );
      }
      AV97DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV97DetailWebComponent);
      cmbavGrupodeacciones.setColumnClass( ((AV88TablaA==1) ? "WWActionGroupColumn WWColumnInfo WWColumnInfoFirstColumn" : "WWActionGroupColumn") );
      edtavDetailwebcomponent_Columnclass = ((AV88TablaA==1) ? "WWIconActionColumn WCD_ActionColumn WWColumnInfo" : "WWIconActionColumn WCD_ActionColumn") ;
      edtavToa_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      edtavHrefectin_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      edtavMarca_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      edtavHdr_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      edtavBaragrest_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      edtavHrebarkgm_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      edtavHretotkgm_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      edtavHremaqcod_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      edtavHrevolprd_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      edtavRb_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      edtavCostei_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      edtavCostet_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      edtavDif_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      edtavPorc_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      edtavCostek_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      edtavClicod_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      edtavClinom_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      edtavHrebarser_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      edtavHrebardsc_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      edtavHretipartd_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      edtavHrecolnom_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      edtavHrecolnum_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      edtavHretipcoln_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      edtavHreintdsc_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      edtavHredti_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      edtavHredtf_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      edtavEnccli_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      /* Using cursor H01FT2 */
      pr_default.execute(0, new Object[] {AV33Emprcod, AV14Fecha, AV91HreRacabinout, AV91HreRacabinout, Integer.valueOf(AV89Clicodinout), Integer.valueOf(AV90Clicodinout_to), AV5ArtCod, AV6ArtCod_to, Short.valueOf(AV27TipArtCod), Short.valueOf(AV28TipArtCod_to), AV17ForColNom, AV18ForColNom_to, Integer.valueOf(AV20ForColNum), Integer.valueOf(AV21ForColNum_to), Byte.valueOf(AV30TipColCod), Byte.valueOf(AV31TipColCod_to), Byte.valueOf(AV24IntCod), Byte.valueOf(AV25IntCod_to), Integer.valueOf(AV8barcod), Integer.valueOf(AV8barcod), Byte.valueOf(AV10barcodreo), Byte.valueOf(AV10barcodreo), AV9barcodpar, AV9barcodpar, AV15Fecha_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk1FT3 = false ;
         A396EmprCod = H01FT2_A396EmprCod[0] ;
         A4529HreFecTin = H01FT2_A4529HreFecTin[0] ;
         n4529HreFecTin = H01FT2_n4529HreFecTin[0] ;
         A4547HreVolPrd = H01FT2_A4547HreVolPrd[0] ;
         n4547HreVolPrd = H01FT2_n4547HreVolPrd[0] ;
         A8607HreCosPD = H01FT2_A8607HreCosPD[0] ;
         n8607HreCosPD = H01FT2_n8607HreCosPD[0] ;
         A8606HreCosPA = H01FT2_A8606HreCosPA[0] ;
         n8606HreCosPA = H01FT2_n8606HreCosPA[0] ;
         A8605HreCosCol = H01FT2_A8605HreCosCol[0] ;
         n8605HreCosCol = H01FT2_n8605HreCosCol[0] ;
         A8604HreCosAnc = H01FT2_A8604HreCosAnc[0] ;
         n8604HreCosAnc = H01FT2_n8604HreCosAnc[0] ;
         A8603HrecosAd = H01FT2_A8603HrecosAd[0] ;
         n8603HrecosAd = H01FT2_n8603HrecosAd[0] ;
         A8602HreCosAA = H01FT2_A8602HreCosAA[0] ;
         n8602HreCosAA = H01FT2_n8602HreCosAA[0] ;
         A4532HreBarKgm = H01FT2_A4532HreBarKgm[0] ;
         n4532HreBarKgm = H01FT2_n4532HreBarKgm[0] ;
         A4542HreTotKgm = H01FT2_A4542HreTotKgm[0] ;
         n4542HreTotKgm = H01FT2_n4542HreTotKgm[0] ;
         A4546HreMaqCod = H01FT2_A4546HreMaqCod[0] ;
         n4546HreMaqCod = H01FT2_n4546HreMaqCod[0] ;
         A4545HreLinMaq = H01FT2_A4545HreLinMaq[0] ;
         A4495HreNumCie = H01FT2_A4495HreNumCie[0] ;
         A4539HreIntCod = H01FT2_A4539HreIntCod[0] ;
         n4539HreIntCod = H01FT2_n4539HreIntCod[0] ;
         A4525HreTipCol = H01FT2_A4525HreTipCol[0] ;
         n4525HreTipCol = H01FT2_n4525HreTipCol[0] ;
         A4522HreColNum = H01FT2_A4522HreColNum[0] ;
         n4522HreColNum = H01FT2_n4522HreColNum[0] ;
         A4521HreColNom = H01FT2_A4521HreColNom[0] ;
         n4521HreColNom = H01FT2_n4521HreColNom[0] ;
         A4519HreTipArt = H01FT2_A4519HreTipArt[0] ;
         n4519HreTipArt = H01FT2_n4519HreTipArt[0] ;
         A4517HreBarSer = H01FT2_A4517HreBarSer[0] ;
         n4517HreBarSer = H01FT2_n4517HreBarSer[0] ;
         A252CliCod = H01FT2_A252CliCod[0] ;
         n252CliCod = H01FT2_n252CliCod[0] ;
         A9808HreRacab = H01FT2_A9808HreRacab[0] ;
         n9808HreRacab = H01FT2_n9808HreRacab[0] ;
         A279CliNom = H01FT2_A279CliNom[0] ;
         A4518HreBarDsc = H01FT2_A4518HreBarDsc[0] ;
         n4518HreBarDsc = H01FT2_n4518HreBarDsc[0] ;
         A4520HreTipArtD = H01FT2_A4520HreTipArtD[0] ;
         n4520HreTipArtD = H01FT2_n4520HreTipArtD[0] ;
         A4526HreTipColN = H01FT2_A4526HreTipColN[0] ;
         n4526HreTipColN = H01FT2_n4526HreTipColN[0] ;
         A4540HreIntDsc = H01FT2_A4540HreIntDsc[0] ;
         n4540HreIntDsc = H01FT2_n4540HreIntDsc[0] ;
         A10104HreDtf = H01FT2_A10104HreDtf[0] ;
         n10104HreDtf = H01FT2_n10104HreDtf[0] ;
         A10103HreDti = H01FT2_A10103HreDti[0] ;
         n10103HreDti = H01FT2_n10103HreDti[0] ;
         A4516HreDisCli = H01FT2_A4516HreDisCli[0] ;
         n4516HreDisCli = H01FT2_n4516HreDisCli[0] ;
         A11318HreDispCli = H01FT2_A11318HreDispCli[0] ;
         n11318HreDispCli = H01FT2_n11318HreDispCli[0] ;
         A4494HreBarPar = H01FT2_A4494HreBarPar[0] ;
         A4493HreBarReo = H01FT2_A4493HreBarReo[0] ;
         A4492HreBarCod = H01FT2_A4492HreBarCod[0] ;
         A4529HreFecTin = H01FT2_A4529HreFecTin[0] ;
         n4529HreFecTin = H01FT2_n4529HreFecTin[0] ;
         A4532HreBarKgm = H01FT2_A4532HreBarKgm[0] ;
         n4532HreBarKgm = H01FT2_n4532HreBarKgm[0] ;
         A4542HreTotKgm = H01FT2_A4542HreTotKgm[0] ;
         n4542HreTotKgm = H01FT2_n4542HreTotKgm[0] ;
         A4539HreIntCod = H01FT2_A4539HreIntCod[0] ;
         n4539HreIntCod = H01FT2_n4539HreIntCod[0] ;
         A4525HreTipCol = H01FT2_A4525HreTipCol[0] ;
         n4525HreTipCol = H01FT2_n4525HreTipCol[0] ;
         A4522HreColNum = H01FT2_A4522HreColNum[0] ;
         n4522HreColNum = H01FT2_n4522HreColNum[0] ;
         A4521HreColNom = H01FT2_A4521HreColNom[0] ;
         n4521HreColNom = H01FT2_n4521HreColNom[0] ;
         A4519HreTipArt = H01FT2_A4519HreTipArt[0] ;
         n4519HreTipArt = H01FT2_n4519HreTipArt[0] ;
         A4517HreBarSer = H01FT2_A4517HreBarSer[0] ;
         n4517HreBarSer = H01FT2_n4517HreBarSer[0] ;
         A252CliCod = H01FT2_A252CliCod[0] ;
         n252CliCod = H01FT2_n252CliCod[0] ;
         A9808HreRacab = H01FT2_A9808HreRacab[0] ;
         n9808HreRacab = H01FT2_n9808HreRacab[0] ;
         A4518HreBarDsc = H01FT2_A4518HreBarDsc[0] ;
         n4518HreBarDsc = H01FT2_n4518HreBarDsc[0] ;
         A4520HreTipArtD = H01FT2_A4520HreTipArtD[0] ;
         n4520HreTipArtD = H01FT2_n4520HreTipArtD[0] ;
         A4526HreTipColN = H01FT2_A4526HreTipColN[0] ;
         n4526HreTipColN = H01FT2_n4526HreTipColN[0] ;
         A4540HreIntDsc = H01FT2_A4540HreIntDsc[0] ;
         n4540HreIntDsc = H01FT2_n4540HreIntDsc[0] ;
         A4516HreDisCli = H01FT2_A4516HreDisCli[0] ;
         n4516HreDisCli = H01FT2_n4516HreDisCli[0] ;
         A11318HreDispCli = H01FT2_A11318HreDispCli[0] ;
         n11318HreDispCli = H01FT2_n11318HreDispCli[0] ;
         A279CliNom = H01FT2_A279CliNom[0] ;
         A13842BarNhdr_Hi = GXutil.str( A4492HreBarCod, 8, 0) + "-" + GXutil.str( A4493HreBarReo, 1, 0) + A4494HreBarPar ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13842BarNhdr_Hi", A13842BarNhdr_Hi);
         AV57HreBarKgm = A4532HreBarKgm ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebarkgm_Internalname, GXutil.ltrimstr( AV57HreBarKgm, 9, 2));
         AV58HreTotKgm = A4542HreTotKgm ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHretotkgm_Internalname, GXutil.ltrimstr( AV58HreTotKgm, 9, 2));
         AV59HreFecTin = A4529HreFecTin ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrefectin_Internalname, localUtil.format(AV59HreFecTin, "99/99/99"));
         AV76Hdr = A13842BarNhdr_Hi ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdr_Internalname, AV76Hdr);
         AV11CliCod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliCod), 6, 0));
         AV60CliNom = A279CliNom ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavClinom_Internalname, AV60CliNom);
         AV61HreBarSer = A4517HreBarSer ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebarser_Internalname, AV61HreBarSer);
         AV62HreBarDsc = A4518HreBarDsc ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebardsc_Internalname, AV62HreBarDsc);
         AV63HreColNom = A4521HreColNom ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrecolnom_Internalname, AV63HreColNom);
         AV64HreColNum = A4522HreColNum ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrecolnum_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64HreColNum), 6, 0));
         AV65HreTipArtD = A4520HreTipArtD ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHretipartd_Internalname, AV65HreTipArtD);
         AV66HreTipColN = A4526HreTipColN ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHretipcoln_Internalname, AV66HreTipColN);
         AV67HreIntDsc = A4540HreIntDsc ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHreintdsc_Internalname, AV67HreIntDsc);
         AV68HreBarCod = A4492HreBarCod ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68HreBarCod), 8, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHREBARCOD"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV68HreBarCod), "ZZZZZZZ9")));
         AV69HreBarPar = A4494HreBarPar ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebarpar_Internalname, AV69HreBarPar);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHREBARPAR"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, GXutil.rtrim( localUtil.format( AV69HreBarPar, ""))));
         AV70HreBarReo = A4493HreBarReo ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebarreo_Internalname, GXutil.str( AV70HreBarReo, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHREBARREO"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV70HreBarReo), "9")));
         AV71HreNumCie = A4495HreNumCie ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrenumcie_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71HreNumCie), 2, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHRENUMCIE"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV71HreNumCie), "Z9")));
         AV23HreRacab = A9808HreRacab ;
         AV72HreDtf = A10104HreDtf ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHredtf_Internalname, localUtil.ttoc( AV72HreDtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV73HreDti = A10103HreDti ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHredti_Internalname, localUtil.ttoc( AV73HreDti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV87EncCli = ((GXutil.strcmp("", A11318HreDispCli)==0) ? A4516HreDisCli : A11318HreDispCli) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEnccli_Internalname, AV87EncCli);
         GXt_char1 = AV74PrvDsc ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A252CliCod ;
         GXv_char3[0] = GXt_char1 ;
         new app.pprc252(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3) ;
         costesquimicosanalisis_wc_impl.this.A396EmprCod = GXv_char4[0] ;
         costesquimicosanalisis_wc_impl.this.A252CliCod = GXv_int10[0] ;
         costesquimicosanalisis_wc_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         AV74PrvDsc = GXt_char1 ;
         AV88TablaA = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTablaa_Internalname, GXutil.str( AV88TablaA, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTABLAA"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV88TablaA), "9")));
         AV75Marca = httpContext.getMessage( "P", "") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMarca_Internalname, AV75Marca);
         AV42ToA = ((GXutil.strcmp("", A9808HreRacab)==0) ? httpContext.getMessage( "T", "") : httpContext.getMessage( "A", "")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavToa_Internalname, AV42ToA);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOA"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, GXutil.rtrim( localUtil.format( AV42ToA, ""))));
         AV77BarAGrest = httpContext.getMessage( "N", "") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaragrest_Internalname, AV77BarAGrest);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARAGREST"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, GXutil.rtrim( localUtil.format( AV77BarAGrest, "@!"))));
         if ( GXutil.strcmp(AV42ToA, httpContext.getMessage( "T", "")) == 0 )
         {
            /* Using cursor H01FT3 */
            pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A4497HreAgrCod = H01FT3_A4497HreAgrCod[0] ;
               AV77BarAGrest = httpContext.getMessage( "S", "") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaragrest_Internalname, AV77BarAGrest);
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARAGREST"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, GXutil.rtrim( localUtil.format( AV77BarAGrest, "@!"))));
               pr_default.readNext(1);
            }
            pr_default.close(1);
         }
         else
         {
            /* Using cursor H01FT4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A9985HreAcCod = H01FT4_A9985HreAcCod[0] ;
               AV77BarAGrest = httpContext.getMessage( "S", "") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBaragrest_Internalname, AV77BarAGrest);
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vBARAGREST"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, GXutil.rtrim( localUtil.format( AV77BarAGrest, "@!"))));
               pr_default.readNext(2);
            }
            pr_default.close(2);
         }
         while ( (pr_default.getStatus(0) != 101) && GXutil.dateCompare(GXutil.resetTime(H01FT2_A4529HreFecTin[0]), GXutil.resetTime(A4529HreFecTin)) && ( GXutil.strcmp(H01FT2_A396EmprCod[0], A396EmprCod) == 0 ) && ( H01FT2_A4492HreBarCod[0] == A4492HreBarCod ) && ( H01FT2_A4493HreBarReo[0] == A4493HreBarReo ) )
         {
            if ( ! ( ( GXutil.strcmp(H01FT2_A4494HreBarPar[0], A4494HreBarPar) == 0 ) && ( H01FT2_A4495HreNumCie[0] == A4495HreNumCie ) ) )
            {
               if (true) break;
            }
            brk1FT3 = false ;
            A4547HreVolPrd = H01FT2_A4547HreVolPrd[0] ;
            n4547HreVolPrd = H01FT2_n4547HreVolPrd[0] ;
            A8607HreCosPD = H01FT2_A8607HreCosPD[0] ;
            n8607HreCosPD = H01FT2_n8607HreCosPD[0] ;
            A8606HreCosPA = H01FT2_A8606HreCosPA[0] ;
            n8606HreCosPA = H01FT2_n8606HreCosPA[0] ;
            A8605HreCosCol = H01FT2_A8605HreCosCol[0] ;
            n8605HreCosCol = H01FT2_n8605HreCosCol[0] ;
            A8604HreCosAnc = H01FT2_A8604HreCosAnc[0] ;
            n8604HreCosAnc = H01FT2_n8604HreCosAnc[0] ;
            A8603HrecosAd = H01FT2_A8603HrecosAd[0] ;
            n8603HrecosAd = H01FT2_n8603HrecosAd[0] ;
            A8602HreCosAA = H01FT2_A8602HreCosAA[0] ;
            n8602HreCosAA = H01FT2_n8602HreCosAA[0] ;
            A4532HreBarKgm = H01FT2_A4532HreBarKgm[0] ;
            n4532HreBarKgm = H01FT2_n4532HreBarKgm[0] ;
            A4542HreTotKgm = H01FT2_A4542HreTotKgm[0] ;
            n4542HreTotKgm = H01FT2_n4542HreTotKgm[0] ;
            A4546HreMaqCod = H01FT2_A4546HreMaqCod[0] ;
            n4546HreMaqCod = H01FT2_n4546HreMaqCod[0] ;
            A4545HreLinMaq = H01FT2_A4545HreLinMaq[0] ;
            A10104HreDtf = H01FT2_A10104HreDtf[0] ;
            n10104HreDtf = H01FT2_n10104HreDtf[0] ;
            A10103HreDti = H01FT2_A10103HreDti[0] ;
            n10103HreDti = H01FT2_n10103HreDti[0] ;
            A4532HreBarKgm = H01FT2_A4532HreBarKgm[0] ;
            n4532HreBarKgm = H01FT2_n4532HreBarKgm[0] ;
            A4542HreTotKgm = H01FT2_A4542HreTotKgm[0] ;
            n4542HreTotKgm = H01FT2_n4542HreTotKgm[0] ;
            AV86HreLinMaq = A4545HreLinMaq ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrelinmaq_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86HreLinMaq), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vHRELINMAQ"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV86HreLinMaq), "ZZZ9")));
            AV80Rb = ((AV58HreTotKgm.doubleValue()>0)&&(GXutil.strcmp(AV42ToA, httpContext.getMessage( "T", ""))==0) ? DecimalUtil.doubleToDec(A4547HreVolPrd).divide(AV58HreTotKgm, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRb_Internalname, GXutil.ltrimstr( AV80Rb, 7, 2));
            AV79HreVolPrd = A4547HreVolPrd ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrevolprd_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79HreVolPrd), 5, 0));
            AV82CosteT = ((A4542HreTotKgm.doubleValue()==0) ? DecimalUtil.doubleToDec(0) : A4532HreBarKgm.multiply((A8602HreCosAA.add(A8603HrecosAd).add(A8604HreCosAnc).add(A8605HreCosCol).add(A8606HreCosPA).add(A8607HreCosPD))).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostet_Internalname, GXutil.ltrimstr( AV82CosteT, 10, 2));
            AV81Costei = ((AV58HreTotKgm.doubleValue()==0) ? DecimalUtil.doubleToDec(0) : A4532HreBarKgm.multiply((A8605HreCosCol.add(A8606HreCosPA).add(A8607HreCosPD))).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostei_Internalname, GXutil.ltrimstr( AV81Costei, 10, 2));
            AV83Dif = AV81Costei.subtract(AV82CosteT) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDif_Internalname, GXutil.ltrimstr( AV83Dif, 10, 2));
            AV84Porc = ((AV81Costei.doubleValue()!=0) ? GXutil.roundDecimal( (AV83Dif.divide(AV81Costei, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 2) : DecimalUtil.doubleToDec(0)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPorc_Internalname, GXutil.ltrimstr( AV84Porc, 6, 2));
            AV85CosteK = ((AV57HreBarKgm.doubleValue()>0) ? GXutil.roundDecimal( AV82CosteT.divide(AV57HreBarKgm, 18, java.math.RoundingMode.DOWN), 2) : DecimalUtil.doubleToDec(0)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostek_Internalname, GXutil.ltrimstr( AV85CosteK, 10, 2));
            AV78HreMaqCod = A4546HreMaqCod ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHremaqcod_Internalname, AV78HreMaqCod);
            AV96CosteTotCal = DecimalUtil.doubleToDec(0) ;
            AV95CosteTotC = DecimalUtil.doubleToDec(0) ;
            AV92HreProcod = " " ;
            AV93HreProdsc = " " ;
            if ( GXutil.strcmp(AV42ToA, httpContext.getMessage( "T", "")) != 0 )
            {
               /* Using cursor H01FT5 */
               pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie), Short.valueOf(A4545HreLinMaq)});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A4551HreProCod = H01FT5_A4551HreProCod[0] ;
                  A4552HreProDsc = H01FT5_A4552HreProDsc[0] ;
                  AV92HreProcod = A4551HreProCod ;
                  AV93HreProdsc = A4552HreProDsc ;
                  pr_default.readNext(3);
               }
               pr_default.close(3);
            }
            /* Execute user subroutine: 'APLICOCOLOR' */
            S156 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               pr_default.close(0);
               pr_default.close(0);
               returnInSub = true;
               if (true) return;
            }
            /* Load Method */
            if ( wbStart != -1 )
            {
               wbStart = (short)(37) ;
            }
            if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
            {
               sendrow_372( ) ;
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
               if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
               {
                  GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
               }
            }
            if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
            {
               GRID_nEOF = (byte)(0) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
            GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
            if ( isFullAjaxMode( ) && ! bGXsfl_37_Refreshing )
            {
               httpContext.doAjaxLoad(37, GridRow);
            }
            if ( GXutil.strcmp(AV77BarAGrest, httpContext.getMessage( "S", "")) == 0 )
            {
               if ( GXutil.strcmp(AV42ToA, httpContext.getMessage( "T", "")) == 0 )
               {
                  AV88TablaA = (byte)(0) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTablaa_Internalname, GXutil.str( AV88TablaA, 1, 0));
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTABLAA"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV88TablaA), "9")));
                  /* Using cursor H01FT6 */
                  pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
                  while ( (pr_default.getStatus(4) != 101) )
                  {
                     A4500HreAgrKgm = H01FT6_A4500HreAgrKgm[0] ;
                     A4499HreAgrPar = H01FT6_A4499HreAgrPar[0] ;
                     A4498HreAgrReo = H01FT6_A4498HreAgrReo[0] ;
                     A4503HreAgrCli = H01FT6_A4503HreAgrCli[0] ;
                     A4504HreAgrSer = H01FT6_A4504HreAgrSer[0] ;
                     A4505HreAgrDsc = H01FT6_A4505HreAgrDsc[0] ;
                     A4497HreAgrCod = H01FT6_A4497HreAgrCod[0] ;
                     AV88TablaA = (byte)(1) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTablaa_Internalname, GXutil.str( AV88TablaA, 1, 0));
                     app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTABLAA"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV88TablaA), "9")));
                     AV75Marca = "" ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMarca_Internalname, AV75Marca);
                     AV81Costei = A4500HreAgrKgm.multiply((A8605HreCosCol.add(A8606HreCosPA).add(A8607HreCosPD))).divide(AV58HreTotKgm, 18, java.math.RoundingMode.DOWN) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostei_Internalname, GXutil.ltrimstr( AV81Costei, 10, 2));
                     AV82CosteT = A4500HreAgrKgm.multiply((A8602HreCosAA.add(A8603HrecosAd).add(A8604HreCosAnc).add(A8605HreCosCol).add(A8606HreCosPA).add(A8607HreCosPD))).divide(AV58HreTotKgm, 18, java.math.RoundingMode.DOWN) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostet_Internalname, GXutil.ltrimstr( AV82CosteT, 10, 2));
                     AV83Dif = AV81Costei.subtract(AV82CosteT) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDif_Internalname, GXutil.ltrimstr( AV83Dif, 10, 2));
                     AV84Porc = ((AV81Costei.doubleValue()!=0) ? GXutil.roundDecimal( (AV83Dif.divide(AV81Costei, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 2) : DecimalUtil.doubleToDec(0)) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPorc_Internalname, GXutil.ltrimstr( AV84Porc, 6, 2));
                     AV85CosteK = ((A4500HreAgrKgm.doubleValue()>0) ? GXutil.roundDecimal( AV82CosteT.divide(A4500HreAgrKgm, 18, java.math.RoundingMode.DOWN), 2) : DecimalUtil.doubleToDec(0)) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostek_Internalname, GXutil.ltrimstr( AV85CosteK, 10, 2));
                     AV96CosteTotCal = A4500HreAgrKgm.multiply(AV95CosteTotC).divide(AV58HreTotKgm, 18, java.math.RoundingMode.DOWN) ;
                     AV94costeKCal = (short)(0) ;
                     AV94costeKCal = (short)(DecimalUtil.decToDouble(((A4500HreAgrKgm.doubleValue()>0) ? GXutil.roundDecimal( AV96CosteTotCal.divide(A4500HreAgrKgm, 18, java.math.RoundingMode.DOWN), 2) : DecimalUtil.doubleToDec(0)))) ;
                     AV76Hdr = GXutil.str( A4497HreAgrCod, 8, 0) + "-" + GXutil.str( A4498HreAgrReo, 1, 0) + A4499HreAgrPar ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdr_Internalname, AV76Hdr);
                     AV57HreBarKgm = A4500HreAgrKgm ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebarkgm_Internalname, GXutil.ltrimstr( AV57HreBarKgm, 9, 2));
                     AV11CliCod = A4503HreAgrCli ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliCod), 6, 0));
                     AV14Fecha = GXutil.nullDate() ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Fecha", localUtil.format(AV14Fecha, "99/99/99"));
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int10[0] = A4497HreAgrCod ;
                     GXv_int11[0] = A4498HreAgrReo ;
                     GXv_char3[0] = A4499HreAgrPar ;
                     GXv_decimal12[0] = DecimalUtil.doubleToDec(0) ;
                     GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
                     GXv_int14[0] = 0 ;
                     GXv_char2[0] = "" ;
                     GXv_char15[0] = "" ;
                     GXv_int16[0] = 0 ;
                     GXv_int17[0] = (byte)(0) ;
                     GXv_char18[0] = "" ;
                     GXv_date19[0] = AV14Fecha ;
                     GXv_int20[0] = (byte)(0) ;
                     GXv_char21[0] = AV87EncCli ;
                     GXv_char22[0] = "" ;
                     GXv_int23[0] = 0 ;
                     GXv_date24[0] = AV14Fecha ;
                     GXv_char25[0] = "" ;
                     GXv_char26[0] = "" ;
                     GXv_int27[0] = 0 ;
                     GXv_date28[0] = AV14Fecha ;
                     GXv_char29[0] = "" ;
                     new app.pinfagr(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int11, GXv_char3, GXv_decimal12, GXv_decimal13, GXv_int14, GXv_char2, GXv_char15, GXv_int16, GXv_int17, GXv_char18, GXv_date19, GXv_int20, GXv_char21, GXv_char22, GXv_int23, GXv_date24, GXv_char25, GXv_char26, GXv_int27, GXv_date28, GXv_char29) ;
                     costesquimicosanalisis_wc_impl.this.A396EmprCod = GXv_char4[0] ;
                     costesquimicosanalisis_wc_impl.this.A4497HreAgrCod = GXv_int10[0] ;
                     costesquimicosanalisis_wc_impl.this.A4498HreAgrReo = GXv_int11[0] ;
                     costesquimicosanalisis_wc_impl.this.A4499HreAgrPar = GXv_char3[0] ;
                     costesquimicosanalisis_wc_impl.this.AV14Fecha = GXv_date19[0] ;
                     costesquimicosanalisis_wc_impl.this.AV87EncCli = GXv_char21[0] ;
                     costesquimicosanalisis_wc_impl.this.AV14Fecha = GXv_date24[0] ;
                     costesquimicosanalisis_wc_impl.this.AV14Fecha = GXv_date28[0] ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4497HreAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4497HreAgrCod), 8, 0));
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4498HreAgrReo", GXutil.str( A4498HreAgrReo, 1, 0));
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4499HreAgrPar", A4499HreAgrPar);
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Fecha", localUtil.format(AV14Fecha, "99/99/99"));
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEnccli_Internalname, AV87EncCli);
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Fecha", localUtil.format(AV14Fecha, "99/99/99"));
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Fecha", localUtil.format(AV14Fecha, "99/99/99"));
                     GXt_char1 = AV74PrvDsc ;
                     GXv_char29[0] = A396EmprCod ;
                     GXv_int27[0] = AV11CliCod ;
                     GXv_char26[0] = GXt_char1 ;
                     new app.pprc252(remoteHandle, context).execute( GXv_char29, GXv_int27, GXv_char26) ;
                     costesquimicosanalisis_wc_impl.this.A396EmprCod = GXv_char29[0] ;
                     costesquimicosanalisis_wc_impl.this.AV11CliCod = GXv_int27[0] ;
                     costesquimicosanalisis_wc_impl.this.GXt_char1 = GXv_char26[0] ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliCod), 6, 0));
                     AV74PrvDsc = GXt_char1 ;
                     GXt_char1 = AV60CliNom ;
                     GXv_char29[0] = GXt_char1 ;
                     new app.pclinom(remoteHandle, context).execute( A396EmprCod, A4503HreAgrCli, GXv_char29) ;
                     costesquimicosanalisis_wc_impl.this.GXt_char1 = GXv_char29[0] ;
                     AV60CliNom = GXt_char1 ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavClinom_Internalname, AV60CliNom);
                     AV61HreBarSer = A4504HreAgrSer ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebarser_Internalname, AV61HreBarSer);
                     AV62HreBarDsc = A4505HreAgrDsc ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebardsc_Internalname, AV62HreBarDsc);
                     /* Execute user subroutine: 'APLICOCOLOR' */
                     S156 ();
                     if ( returnInSub )
                     {
                        pr_default.close(4);
                        pr_default.close(0);
                        pr_default.close(0);
                        pr_default.close(0);
                        returnInSub = true;
                        if (true) return;
                     }
                     /* Load Method */
                     if ( wbStart != -1 )
                     {
                        wbStart = (short)(37) ;
                     }
                     if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
                     {
                        sendrow_372( ) ;
                        GRID_nEOF = (byte)(1) ;
                        app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
                        if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
                        {
                           GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
                        }
                     }
                     if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
                     {
                        GRID_nEOF = (byte)(0) ;
                        app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
                     }
                     GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
                     if ( isFullAjaxMode( ) && ! bGXsfl_37_Refreshing )
                     {
                        httpContext.doAjaxLoad(37, GridRow);
                     }
                     pr_default.readNext(4);
                  }
                  pr_default.close(4);
               }
               if ( GXutil.strcmp(AV42ToA, httpContext.getMessage( "A", "")) == 0 )
               {
                  AV88TablaA = (byte)(0) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTablaa_Internalname, GXutil.str( AV88TablaA, 1, 0));
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTABLAA"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV88TablaA), "9")));
                  /* Using cursor H01FT7 */
                  pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
                  while ( (pr_default.getStatus(5) != 101) )
                  {
                     A9988HreAcKgm = H01FT7_A9988HreAcKgm[0] ;
                     n9988HreAcKgm = H01FT7_n9988HreAcKgm[0] ;
                     A9987HreAcPar = H01FT7_A9987HreAcPar[0] ;
                     A9986HreAcReo = H01FT7_A9986HreAcReo[0] ;
                     A9991HreAcCli = H01FT7_A9991HreAcCli[0] ;
                     n9991HreAcCli = H01FT7_n9991HreAcCli[0] ;
                     A9992HreAcSer = H01FT7_A9992HreAcSer[0] ;
                     n9992HreAcSer = H01FT7_n9992HreAcSer[0] ;
                     A9993HreAcDsc = H01FT7_A9993HreAcDsc[0] ;
                     n9993HreAcDsc = H01FT7_n9993HreAcDsc[0] ;
                     A9985HreAcCod = H01FT7_A9985HreAcCod[0] ;
                     AV88TablaA = (byte)(1) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTablaa_Internalname, GXutil.str( AV88TablaA, 1, 0));
                     app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTABLAA"+"_"+sGXsfl_37_idx, getSecureSignedToken( sPrefix+sGXsfl_37_idx, localUtil.format( DecimalUtil.doubleToDec(AV88TablaA), "9")));
                     AV75Marca = "" ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMarca_Internalname, AV75Marca);
                     AV81Costei = A9988HreAcKgm.multiply((A8605HreCosCol.add(A8606HreCosPA).add(A8607HreCosPD))).divide(AV58HreTotKgm, 18, java.math.RoundingMode.DOWN) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostei_Internalname, GXutil.ltrimstr( AV81Costei, 10, 2));
                     AV82CosteT = A9988HreAcKgm.multiply((A8602HreCosAA.add(A8603HrecosAd).add(A8604HreCosAnc).add(A8605HreCosCol).add(A8606HreCosPA).add(A8607HreCosPD))).divide(AV58HreTotKgm, 18, java.math.RoundingMode.DOWN) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostet_Internalname, GXutil.ltrimstr( AV82CosteT, 10, 2));
                     AV83Dif = AV81Costei.subtract(AV82CosteT) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDif_Internalname, GXutil.ltrimstr( AV83Dif, 10, 2));
                     AV84Porc = ((AV81Costei.doubleValue()!=0) ? GXutil.roundDecimal( (AV83Dif.divide(AV81Costei, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 2) : DecimalUtil.doubleToDec(0)) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPorc_Internalname, GXutil.ltrimstr( AV84Porc, 6, 2));
                     AV85CosteK = ((A9988HreAcKgm.doubleValue()>0) ? GXutil.roundDecimal( AV82CosteT.divide(A9988HreAcKgm, 18, java.math.RoundingMode.DOWN), 2) : DecimalUtil.doubleToDec(0)) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCostek_Internalname, GXutil.ltrimstr( AV85CosteK, 10, 2));
                     AV96CosteTotCal = A9988HreAcKgm.multiply(AV95CosteTotC).divide(AV58HreTotKgm, 18, java.math.RoundingMode.DOWN) ;
                     AV94costeKCal = (short)(DecimalUtil.decToDouble(((A9988HreAcKgm.doubleValue()>0) ? GXutil.roundDecimal( AV96CosteTotCal.divide(A9988HreAcKgm, 18, java.math.RoundingMode.DOWN), 2) : DecimalUtil.doubleToDec(0)))) ;
                     AV76Hdr = GXutil.str( A9985HreAcCod, 8, 0) + "-" + GXutil.str( A9986HreAcReo, 1, 0) + A9987HreAcPar ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHdr_Internalname, AV76Hdr);
                     AV57HreBarKgm = A9988HreAcKgm ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebarkgm_Internalname, GXutil.ltrimstr( AV57HreBarKgm, 9, 2));
                     AV11CliCod = A9991HreAcCli ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliCod), 6, 0));
                     AV14Fecha = GXutil.nullDate() ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Fecha", localUtil.format(AV14Fecha, "99/99/99"));
                     GXv_char29[0] = A396EmprCod ;
                     GXv_int27[0] = A9985HreAcCod ;
                     GXv_int20[0] = A9986HreAcReo ;
                     GXv_char26[0] = A9987HreAcPar ;
                     GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
                     GXv_decimal12[0] = DecimalUtil.doubleToDec(0) ;
                     GXv_int23[0] = 0 ;
                     GXv_char25[0] = "" ;
                     GXv_char22[0] = "" ;
                     GXv_int16[0] = 0 ;
                     GXv_int17[0] = (byte)(0) ;
                     GXv_char21[0] = "" ;
                     GXv_date28[0] = AV14Fecha ;
                     GXv_int11[0] = (byte)(0) ;
                     GXv_char18[0] = AV87EncCli ;
                     GXv_char15[0] = "" ;
                     GXv_int14[0] = 0 ;
                     GXv_date24[0] = AV14Fecha ;
                     GXv_char4[0] = "" ;
                     GXv_char3[0] = "" ;
                     GXv_int10[0] = 0 ;
                     GXv_date19[0] = AV14Fecha ;
                     GXv_char2[0] = "" ;
                     new app.pinfagr(remoteHandle, context).execute( GXv_char29, GXv_int27, GXv_int20, GXv_char26, GXv_decimal13, GXv_decimal12, GXv_int23, GXv_char25, GXv_char22, GXv_int16, GXv_int17, GXv_char21, GXv_date28, GXv_int11, GXv_char18, GXv_char15, GXv_int14, GXv_date24, GXv_char4, GXv_char3, GXv_int10, GXv_date19, GXv_char2) ;
                     costesquimicosanalisis_wc_impl.this.A396EmprCod = GXv_char29[0] ;
                     costesquimicosanalisis_wc_impl.this.A9985HreAcCod = GXv_int27[0] ;
                     costesquimicosanalisis_wc_impl.this.A9986HreAcReo = GXv_int20[0] ;
                     costesquimicosanalisis_wc_impl.this.A9987HreAcPar = GXv_char26[0] ;
                     costesquimicosanalisis_wc_impl.this.AV14Fecha = GXv_date28[0] ;
                     costesquimicosanalisis_wc_impl.this.AV87EncCli = GXv_char18[0] ;
                     costesquimicosanalisis_wc_impl.this.AV14Fecha = GXv_date24[0] ;
                     costesquimicosanalisis_wc_impl.this.AV14Fecha = GXv_date19[0] ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9985HreAcCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9985HreAcCod), 8, 0));
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9986HreAcReo", GXutil.str( A9986HreAcReo, 1, 0));
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "A9987HreAcPar", A9987HreAcPar);
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Fecha", localUtil.format(AV14Fecha, "99/99/99"));
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEnccli_Internalname, AV87EncCli);
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Fecha", localUtil.format(AV14Fecha, "99/99/99"));
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Fecha", localUtil.format(AV14Fecha, "99/99/99"));
                     GXt_char1 = AV74PrvDsc ;
                     GXv_char29[0] = A396EmprCod ;
                     GXv_int27[0] = AV11CliCod ;
                     GXv_char26[0] = GXt_char1 ;
                     new app.pprc252(remoteHandle, context).execute( GXv_char29, GXv_int27, GXv_char26) ;
                     costesquimicosanalisis_wc_impl.this.A396EmprCod = GXv_char29[0] ;
                     costesquimicosanalisis_wc_impl.this.AV11CliCod = GXv_int27[0] ;
                     costesquimicosanalisis_wc_impl.this.GXt_char1 = GXv_char26[0] ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavClicod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11CliCod), 6, 0));
                     AV74PrvDsc = GXt_char1 ;
                     GXt_char1 = AV60CliNom ;
                     GXv_char29[0] = GXt_char1 ;
                     new app.pclinom(remoteHandle, context).execute( A396EmprCod, A9991HreAcCli, GXv_char29) ;
                     costesquimicosanalisis_wc_impl.this.GXt_char1 = GXv_char29[0] ;
                     AV60CliNom = GXt_char1 ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavClinom_Internalname, AV60CliNom);
                     AV61HreBarSer = A9992HreAcSer ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebarser_Internalname, AV61HreBarSer);
                     AV62HreBarDsc = A9993HreAcDsc ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavHrebardsc_Internalname, AV62HreBarDsc);
                     /* Execute user subroutine: 'APLICOCOLOR' */
                     S156 ();
                     if ( returnInSub )
                     {
                        pr_default.close(5);
                        pr_default.close(0);
                        pr_default.close(0);
                        pr_default.close(0);
                        returnInSub = true;
                        if (true) return;
                     }
                     /* Load Method */
                     if ( wbStart != -1 )
                     {
                        wbStart = (short)(37) ;
                     }
                     if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
                     {
                        sendrow_372( ) ;
                        GRID_nEOF = (byte)(1) ;
                        app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
                        if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
                        {
                           GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
                        }
                     }
                     if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
                     {
                        GRID_nEOF = (byte)(0) ;
                        app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
                     }
                     GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
                     if ( isFullAjaxMode( ) && ! bGXsfl_37_Refreshing )
                     {
                        httpContext.doAjaxLoad(37, GridRow);
                     }
                     pr_default.readNext(5);
                  }
                  pr_default.close(5);
               }
            }
            brk1FT3 = true ;
            pr_default.readNext(0);
         }
         if ( ! brk1FT3 )
         {
            brk1FT3 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      /*  Sending Event outputs  */
      cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV98GrupodeAcciones, 4, 0)) );
   }

   public void e141FT2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV43ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV45ColumnsSelector.fromJSonString(AV43ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "CostesQuimicosAnalisis_WCColumnsSelector", ((GXutil.strcmp("", AV43ColumnsSelectorXML)==0) ? "" : AV45ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV45ColumnsSelector", AV45ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV48ManageFiltersData", AV48ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV39GridState", AV39GridState);
   }

   public void e111FT2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S162 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S132 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("CostesQuimicosAnalisis_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV113Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV50ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50ManageFiltersExecutionStep", GXutil.str( AV50ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("CostesQuimicosAnalisis_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV50ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50ManageFiltersExecutionStep", GXutil.str( AV50ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV49ManageFiltersXml ;
         GXv_char29[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "CostesQuimicosAnalisis_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char29) ;
         costesquimicosanalisis_wc_impl.this.GXt_char1 = GXv_char29[0] ;
         AV49ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV49ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S162 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV113Pgmname+"GridState", AV49ManageFiltersXml) ;
            AV39GridState.fromxml(AV49ManageFiltersXml, null, null);
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S172 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV39GridState", AV39GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV45ColumnsSelector", AV45ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV48ManageFiltersData", AV48ManageFiltersData);
   }

   public void e151FT2( )
   {
      /* Detailwebcomponent_modal_Close Routine */
      returnInSub = false ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV45ColumnsSelector", AV45ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV48ManageFiltersData", AV48ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV39GridState", AV39GridState);
   }

   public void S142( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV45ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector30[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector30, "&ToA", "", "Tipo", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector30[0] ;
      GXv_SdtWWPColumnsSelector30[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector30, "&HreFecTin", "", "Fecha Cierre", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector30[0] ;
      GXv_SdtWWPColumnsSelector30[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector30, "&Marca", "", "", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector30[0] ;
      GXv_SdtWWPColumnsSelector30[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector30, "&Hdr", "", "N Hdr", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector30[0] ;
      GXv_SdtWWPColumnsSelector30[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector30, "&BarAGrest", "", "Agr?", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector30[0] ;
      GXv_SdtWWPColumnsSelector30[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector30, "&HreBarKgm", "", "Kilos", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector30[0] ;
      GXv_SdtWWPColumnsSelector30[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector30, "&HreTotKgm", "", "Kilos Tot", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector30[0] ;
      GXv_SdtWWPColumnsSelector30[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector30, "&HreMaqCod", "", "Maquina", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector30[0] ;
      GXv_SdtWWPColumnsSelector30[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector30, "&HreVolPrd", "", "Volumen", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector30[0] ;
      GXv_SdtWWPColumnsSelector30[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector30, "&Rb", "", "Rb", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector30[0] ;
      GXv_SdtWWPColumnsSelector30[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector30, "&Costei", "", "Coste Ini", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector30[0] ;
      GXv_SdtWWPColumnsSelector30[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector30, "&CosteT", "", "Coste Tot", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector30[0] ;
      GXv_SdtWWPColumnsSelector30[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector30, "&Dif", "", "Dif", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector30[0] ;
      GXv_SdtWWPColumnsSelector30[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector30, "&Porc", "", "%", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector30[0] ;
      GXv_SdtWWPColumnsSelector30[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector30, "&CosteK", "", "Coste Kg", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector30[0] ;
      GXv_SdtWWPColumnsSelector30[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector30, "&CliCod", "", "Cliente", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector30[0] ;
      GXv_SdtWWPColumnsSelector30[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector30, "&CliNom", "", "Nombre", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector30[0] ;
      GXv_SdtWWPColumnsSelector30[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector30, "&HreBarSer", "", "Articulo", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector30[0] ;
      GXv_SdtWWPColumnsSelector30[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector30, "&HreBarDsc", "", "Descripcion ", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector30[0] ;
      GXv_SdtWWPColumnsSelector30[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector30, "&HreTipArtD", "", "Descripcion Tipo Articulo", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector30[0] ;
      GXv_SdtWWPColumnsSelector30[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector30, "&HreColNom", "", "Color", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector30[0] ;
      GXv_SdtWWPColumnsSelector30[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector30, "&HreColNum", "", "Numero", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector30[0] ;
      GXv_SdtWWPColumnsSelector30[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector30, "&HreTipColN", "", "Descripcion Tc", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector30[0] ;
      GXv_SdtWWPColumnsSelector30[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector30, "&HreIntDsc", "", "Descripcion Intensidad", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector30[0] ;
      GXv_SdtWWPColumnsSelector30[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector30, "&HreDti", "", "Inicio", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector30[0] ;
      GXv_SdtWWPColumnsSelector30[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector30, "&HreDtf", "", "Fin", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector30[0] ;
      GXv_SdtWWPColumnsSelector30[0] = AV45ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector30, "&EncCli", "", "Disp Cliente", true, "") ;
      AV45ColumnsSelector = GXv_SdtWWPColumnsSelector30[0] ;
      GXt_char1 = AV44UserCustomValue ;
      GXv_char29[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "CostesQuimicosAnalisis_WCColumnsSelector", GXv_char29) ;
      costesquimicosanalisis_wc_impl.this.GXt_char1 = GXv_char29[0] ;
      AV44UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV44UserCustomValue)==0) ) )
      {
         AV46ColumnsSelectorAux.fromxml(AV44UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector30[0] = AV46ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector31[0] = AV45ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector30, GXv_SdtWWPColumnsSelector31) ;
         AV46ColumnsSelectorAux = GXv_SdtWWPColumnsSelector30[0] ;
         AV45ColumnsSelector = GXv_SdtWWPColumnsSelector31[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item32 = AV48ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item33[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item32 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "CostesQuimicosAnalisis_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item33) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item32 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item33[0] ;
      AV48ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item32 ;
   }

   public void S162( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV41FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41FilterFullText", AV41FilterFullText);
   }

   public void S182( )
   {
      /* 'DO AGRUPACIONES' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV77BarAGrest, "S") == 0 )
      {
         if ( GXutil.strcmp(AV42ToA, "T") == 0 )
         {
            httpContext.popup(formatLink("app.historicoderecetas_agrupaciontinte_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV33Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV68HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV70HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV69HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(AV71HreNumCie,2,0))}, new String[] {"Emprcod","HreBarCod","HreBarReo","HreBarpar","HreNumCie"}) , new Object[] {});
         }
         else
         {
            httpContext.popup(formatLink("app.historicoderecetas_agrupacionacabados_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV33Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV68HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV70HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV69HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(AV71HreNumCie,2,0))}, new String[] {"Emprcod","HreBarCod","HreBarReo","HreBarpar","HreNumCie"}) , new Object[] {});
         }
      }
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV47Session.getValue(AV113Pgmname+"GridState"), "") == 0 )
      {
         AV39GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV113Pgmname+"GridState"), null, null);
      }
      else
      {
         AV39GridState.fromxml(AV47Session.getValue(AV113Pgmname+"GridState"), null, null);
      }
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S172 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV39GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV39GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV39GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S172( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV114GXV1 = 1 ;
      while ( AV114GXV1 <= AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV40GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV114GXV1));
         if ( GXutil.strcmp(AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV41FilterFullText = AV40GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41FilterFullText", AV41FilterFullText);
         }
         AV114GXV1 = (int)(AV114GXV1+1) ;
      }
   }

   public void S132( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV39GridState.fromxml(AV47Session.getValue(AV113Pgmname+"GridState"), null, null);
      AV39GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState34[0] = AV39GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState34, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV41FilterFullText)==0), (short)(0), AV41FilterFullText, "") ;
      AV39GridState = GXv_SdtWWPGridState34[0] ;
      AV39GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV39GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV113Pgmname+"GridState", AV39GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S156( )
   {
      /* 'APLICOCOLOR' Routine */
      returnInSub = false ;
      cmbavGrupodeacciones.removeAllItems();
      cmbavGrupodeacciones.addItem("0", ";fa fa-bars", (short)(0));
      if ( GXutil.strcmp(AV77BarAGrest, "S") == 0 )
      {
         cmbavGrupodeacciones.addItem("1", httpContext.getMessage( "Ver Agrupaciones", ""), (short)(0));
      }
      if ( cmbavGrupodeacciones.getItemCount() == 1 )
      {
         cmbavGrupodeacciones.setThemeClass( "Invisible" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGrupodeacciones.getInternalname(), "Class", cmbavGrupodeacciones.getThemeClass(), !bGXsfl_37_Refreshing);
      }
      else
      {
         cmbavGrupodeacciones.setThemeClass( "ConvertToDDO" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGrupodeacciones.getInternalname(), "Class", cmbavGrupodeacciones.getThemeClass(), !bGXsfl_37_Refreshing);
      }
      cmbavGrupodeacciones.setColumnClass( ((AV88TablaA==1) ? "WWActionGroupColumn WWColumnInfo WWColumnInfoFirstColumn" : "WWActionGroupColumn") );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGrupodeacciones.getInternalname(), "Columnclass", cmbavGrupodeacciones.getColumnClass(), !bGXsfl_37_Refreshing);
      edtavDetailwebcomponent_Columnclass = ((AV88TablaA==1) ? "WWIconActionColumn WCD_ActionColumn WWColumnInfo" : "WWIconActionColumn WCD_ActionColumn") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Columnclass", edtavDetailwebcomponent_Columnclass, !bGXsfl_37_Refreshing);
      edtavToa_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavToa_Internalname, "Columnclass", edtavToa_Columnclass, !bGXsfl_37_Refreshing);
      edtavHrefectin_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrefectin_Internalname, "Columnclass", edtavHrefectin_Columnclass, !bGXsfl_37_Refreshing);
      edtavMarca_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMarca_Internalname, "Columnclass", edtavMarca_Columnclass, !bGXsfl_37_Refreshing);
      edtavHdr_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHdr_Internalname, "Columnclass", edtavHdr_Columnclass, !bGXsfl_37_Refreshing);
      edtavBaragrest_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBaragrest_Internalname, "Columnclass", edtavBaragrest_Columnclass, !bGXsfl_37_Refreshing);
      edtavHrebarkgm_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrebarkgm_Internalname, "Columnclass", edtavHrebarkgm_Columnclass, !bGXsfl_37_Refreshing);
      edtavHretotkgm_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHretotkgm_Internalname, "Columnclass", edtavHretotkgm_Columnclass, !bGXsfl_37_Refreshing);
      edtavHremaqcod_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHremaqcod_Internalname, "Columnclass", edtavHremaqcod_Columnclass, !bGXsfl_37_Refreshing);
      edtavHrevolprd_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrevolprd_Internalname, "Columnclass", edtavHrevolprd_Columnclass, !bGXsfl_37_Refreshing);
      edtavRb_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavRb_Internalname, "Columnclass", edtavRb_Columnclass, !bGXsfl_37_Refreshing);
      edtavCostei_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostei_Internalname, "Columnclass", edtavCostei_Columnclass, !bGXsfl_37_Refreshing);
      edtavCostet_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostet_Internalname, "Columnclass", edtavCostet_Columnclass, !bGXsfl_37_Refreshing);
      edtavDif_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDif_Internalname, "Columnclass", edtavDif_Columnclass, !bGXsfl_37_Refreshing);
      edtavPorc_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPorc_Internalname, "Columnclass", edtavPorc_Columnclass, !bGXsfl_37_Refreshing);
      edtavCostek_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavCostek_Internalname, "Columnclass", edtavCostek_Columnclass, !bGXsfl_37_Refreshing);
      edtavClicod_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClicod_Internalname, "Columnclass", edtavClicod_Columnclass, !bGXsfl_37_Refreshing);
      edtavClinom_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavClinom_Internalname, "Columnclass", edtavClinom_Columnclass, !bGXsfl_37_Refreshing);
      edtavHrebarser_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrebarser_Internalname, "Columnclass", edtavHrebarser_Columnclass, !bGXsfl_37_Refreshing);
      edtavHrebardsc_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrebardsc_Internalname, "Columnclass", edtavHrebardsc_Columnclass, !bGXsfl_37_Refreshing);
      edtavHretipartd_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHretipartd_Internalname, "Columnclass", edtavHretipartd_Columnclass, !bGXsfl_37_Refreshing);
      edtavHrecolnom_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrecolnom_Internalname, "Columnclass", edtavHrecolnom_Columnclass, !bGXsfl_37_Refreshing);
      edtavHrecolnum_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHrecolnum_Internalname, "Columnclass", edtavHrecolnum_Columnclass, !bGXsfl_37_Refreshing);
      edtavHretipcoln_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHretipcoln_Internalname, "Columnclass", edtavHretipcoln_Columnclass, !bGXsfl_37_Refreshing);
      edtavHreintdsc_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHreintdsc_Internalname, "Columnclass", edtavHreintdsc_Columnclass, !bGXsfl_37_Refreshing);
      edtavHredti_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHredti_Internalname, "Columnclass", edtavHredti_Columnclass, !bGXsfl_37_Refreshing);
      edtavHredtf_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavHredtf_Internalname, "Columnclass", edtavHredtf_Columnclass, !bGXsfl_37_Refreshing);
      edtavEnccli_Columnclass = ((AV88TablaA==1) ? "WWColumn WWColumnInfo" : "WWColumn") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEnccli_Internalname, "Columnclass", edtavEnccli_Columnclass, !bGXsfl_37_Refreshing);
   }

   public void wb_table2_84_1FT2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledetailwebcomponent_modal_Internalname, tblTabledetailwebcomponent_modal_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDetailwebcomponent_modal.setProperty("Width", Detailwebcomponent_modal_Width);
         ucDetailwebcomponent_modal.setProperty("Title", Detailwebcomponent_modal_Title);
         ucDetailwebcomponent_modal.setProperty("ConfirmType", Detailwebcomponent_modal_Confirmtype);
         ucDetailwebcomponent_modal.setProperty("BodyType", Detailwebcomponent_modal_Bodytype);
         ucDetailwebcomponent_modal.render(context, "dvelop.gxbootstrap.confirmpanel", Detailwebcomponent_modal_Internalname, sPrefix+"DETAILWEBCOMPONENT_MODALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DETAILWEBCOMPONENT_MODALContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_84_1FT2e( true) ;
      }
      else
      {
         wb_table2_84_1FT2e( false) ;
      }
   }

   public void wb_table1_19_1FT2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* User Defined Control */
         ucDdo_managefilters.setProperty("IconType", Ddo_managefilters_Icontype);
         ucDdo_managefilters.setProperty("Icon", Ddo_managefilters_Icon);
         ucDdo_managefilters.setProperty("Caption", Ddo_managefilters_Caption);
         ucDdo_managefilters.setProperty("Tooltip", Ddo_managefilters_Tooltip);
         ucDdo_managefilters.setProperty("Cls", Ddo_managefilters_Cls);
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV48ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_24_1FT2( true) ;
      }
      else
      {
         wb_table3_24_1FT2( false) ;
      }
      return  ;
   }

   public void wb_table3_24_1FT2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_19_1FT2e( true) ;
      }
      else
      {
         wb_table1_19_1FT2e( false) ;
      }
   }

   public void wb_table3_24_1FT2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablefilters_Internalname, tblTablefilters_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFilterfulltext_Internalname, httpContext.getMessage( "Filter Full Text", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'" + sPrefix + "',false,'" + sGXsfl_37_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV41FilterFullText, GXutil.rtrim( localUtil.format( AV41FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,28);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_CostesQuimicosAnalisis_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_24_1FT2e( true) ;
      }
      else
      {
         wb_table3_24_1FT2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV33Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Emprcod", AV33Emprcod);
      AV91HreRacabinout = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91HreRacabinout", AV91HreRacabinout);
      AV14Fecha = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Fecha", localUtil.format(AV14Fecha, "99/99/99"));
      AV15Fecha_to = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Fecha_to", localUtil.format(AV15Fecha_to, "99/99/99"));
      AV55Calculo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55Calculo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55Calculo), 4, 0));
      AV8barcod = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8barcod), 8, 0));
      AV10barcodreo = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10barcodreo", GXutil.str( AV10barcodreo, 1, 0));
      AV9barcodpar = (String)getParm(obj,7,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9barcodpar", AV9barcodpar);
      AV5ArtCod = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5ArtCod", AV5ArtCod);
      AV6ArtCod_to = (String)getParm(obj,9,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6ArtCod_to", AV6ArtCod_to);
      AV17ForColNom = (String)getParm(obj,10,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17ForColNom", AV17ForColNom);
      AV18ForColNom_to = (String)getParm(obj,11,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18ForColNom_to", AV18ForColNom_to);
      AV20ForColNum = ((Number) GXutil.testNumericType( getParm(obj,12,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20ForColNum), 6, 0));
      AV21ForColNum_to = ((Number) GXutil.testNumericType( getParm(obj,13,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21ForColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21ForColNum_to), 6, 0));
      AV89Clicodinout = ((Number) GXutil.testNumericType( getParm(obj,14,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89Clicodinout", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89Clicodinout), 6, 0));
      AV90Clicodinout_to = ((Number) GXutil.testNumericType( getParm(obj,15,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90Clicodinout_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90Clicodinout_to), 6, 0));
      AV24IntCod = ((Number) GXutil.testNumericType( getParm(obj,16,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24IntCod), 2, 0));
      AV25IntCod_to = ((Number) GXutil.testNumericType( getParm(obj,17,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25IntCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25IntCod_to), 2, 0));
      AV27TipArtCod = ((Number) GXutil.testNumericType( getParm(obj,18,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TipArtCod), 4, 0));
      AV28TipArtCod_to = ((Number) GXutil.testNumericType( getParm(obj,19,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TipArtCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TipArtCod_to), 4, 0));
      AV30TipColCod = ((Number) GXutil.testNumericType( getParm(obj,20,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TipColCod), 2, 0));
      AV31TipColCod_to = ((Number) GXutil.testNumericType( getParm(obj,21,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TipColCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TipColCod_to), 2, 0));
   }

   public String getresponse( String sGXDynURL )
   {
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa1FT2( ) ;
      ws1FT2( ) ;
      we1FT2( ) ;
      httpContext.setWrapped(false);
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
      String response = "";
      try
      {
         response = ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString("UTF8");
      }
      catch (java.io.UnsupportedEncodingException e)
      {
         Application.printWarning(e.getMessage(), e);
      }
      finally
      {
         httpContext.closeOutputStream();
      }
      return response;
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void componentbind( Object[] obj )
   {
      if ( IsUrlCreated( ) )
      {
         return  ;
      }
      sCtrlAV33Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV91HreRacabinout = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV14Fecha = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV15Fecha_to = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV55Calculo = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV8barcod = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV10barcodreo = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV9barcodpar = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV5ArtCod = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV6ArtCod_to = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV17ForColNom = (String)getParm(obj,10,TypeConstants.STRING) ;
      sCtrlAV18ForColNom_to = (String)getParm(obj,11,TypeConstants.STRING) ;
      sCtrlAV20ForColNum = (String)getParm(obj,12,TypeConstants.STRING) ;
      sCtrlAV21ForColNum_to = (String)getParm(obj,13,TypeConstants.STRING) ;
      sCtrlAV89Clicodinout = (String)getParm(obj,14,TypeConstants.STRING) ;
      sCtrlAV90Clicodinout_to = (String)getParm(obj,15,TypeConstants.STRING) ;
      sCtrlAV24IntCod = (String)getParm(obj,16,TypeConstants.STRING) ;
      sCtrlAV25IntCod_to = (String)getParm(obj,17,TypeConstants.STRING) ;
      sCtrlAV27TipArtCod = (String)getParm(obj,18,TypeConstants.STRING) ;
      sCtrlAV28TipArtCod_to = (String)getParm(obj,19,TypeConstants.STRING) ;
      sCtrlAV30TipColCod = (String)getParm(obj,20,TypeConstants.STRING) ;
      sCtrlAV31TipColCod_to = (String)getParm(obj,21,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1FT2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "costesquimicosanalisis_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1FT2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV33Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Emprcod", AV33Emprcod);
         AV91HreRacabinout = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91HreRacabinout", AV91HreRacabinout);
         AV14Fecha = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Fecha", localUtil.format(AV14Fecha, "99/99/99"));
         AV15Fecha_to = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Fecha_to", localUtil.format(AV15Fecha_to, "99/99/99"));
         AV55Calculo = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55Calculo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55Calculo), 4, 0));
         AV8barcod = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8barcod), 8, 0));
         AV10barcodreo = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10barcodreo", GXutil.str( AV10barcodreo, 1, 0));
         AV9barcodpar = (String)getParm(obj,9,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9barcodpar", AV9barcodpar);
         AV5ArtCod = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5ArtCod", AV5ArtCod);
         AV6ArtCod_to = (String)getParm(obj,11,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6ArtCod_to", AV6ArtCod_to);
         AV17ForColNom = (String)getParm(obj,12,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17ForColNom", AV17ForColNom);
         AV18ForColNom_to = (String)getParm(obj,13,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18ForColNom_to", AV18ForColNom_to);
         AV20ForColNum = ((Number) GXutil.testNumericType( getParm(obj,14,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20ForColNum), 6, 0));
         AV21ForColNum_to = ((Number) GXutil.testNumericType( getParm(obj,15,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21ForColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21ForColNum_to), 6, 0));
         AV89Clicodinout = ((Number) GXutil.testNumericType( getParm(obj,16,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89Clicodinout", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89Clicodinout), 6, 0));
         AV90Clicodinout_to = ((Number) GXutil.testNumericType( getParm(obj,17,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90Clicodinout_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90Clicodinout_to), 6, 0));
         AV24IntCod = ((Number) GXutil.testNumericType( getParm(obj,18,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24IntCod), 2, 0));
         AV25IntCod_to = ((Number) GXutil.testNumericType( getParm(obj,19,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25IntCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25IntCod_to), 2, 0));
         AV27TipArtCod = ((Number) GXutil.testNumericType( getParm(obj,20,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TipArtCod), 4, 0));
         AV28TipArtCod_to = ((Number) GXutil.testNumericType( getParm(obj,21,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TipArtCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TipArtCod_to), 4, 0));
         AV30TipColCod = ((Number) GXutil.testNumericType( getParm(obj,22,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TipColCod), 2, 0));
         AV31TipColCod_to = ((Number) GXutil.testNumericType( getParm(obj,23,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TipColCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TipColCod_to), 2, 0));
      }
      wcpOAV33Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV33Emprcod") ;
      wcpOAV91HreRacabinout = httpContext.cgiGet( sPrefix+"wcpOAV91HreRacabinout") ;
      wcpOAV14Fecha = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV14Fecha"), 0) ;
      wcpOAV15Fecha_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV15Fecha_to"), 0) ;
      wcpOAV55Calculo = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV55Calculo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV8barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8barcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV10barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10barcodreo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV9barcodpar = httpContext.cgiGet( sPrefix+"wcpOAV9barcodpar") ;
      wcpOAV5ArtCod = httpContext.cgiGet( sPrefix+"wcpOAV5ArtCod") ;
      wcpOAV6ArtCod_to = httpContext.cgiGet( sPrefix+"wcpOAV6ArtCod_to") ;
      wcpOAV17ForColNom = httpContext.cgiGet( sPrefix+"wcpOAV17ForColNom") ;
      wcpOAV18ForColNom_to = httpContext.cgiGet( sPrefix+"wcpOAV18ForColNom_to") ;
      wcpOAV20ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV20ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV21ForColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV21ForColNum_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV89Clicodinout = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV89Clicodinout"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV90Clicodinout_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV90Clicodinout_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV24IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV24IntCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV25IntCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV25IntCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV27TipArtCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV27TipArtCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV28TipArtCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV28TipArtCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV30TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV30TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV31TipColCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV31TipColCod_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV33Emprcod, wcpOAV33Emprcod) != 0 ) || ( GXutil.strcmp(AV91HreRacabinout, wcpOAV91HreRacabinout) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV14Fecha), GXutil.resetTime(wcpOAV14Fecha)) ) || !( GXutil.dateCompare(GXutil.resetTime(AV15Fecha_to), GXutil.resetTime(wcpOAV15Fecha_to)) ) || ( AV55Calculo != wcpOAV55Calculo ) || ( AV8barcod != wcpOAV8barcod ) || ( AV10barcodreo != wcpOAV10barcodreo ) || ( GXutil.strcmp(AV9barcodpar, wcpOAV9barcodpar) != 0 ) || ( GXutil.strcmp(AV5ArtCod, wcpOAV5ArtCod) != 0 ) || ( GXutil.strcmp(AV6ArtCod_to, wcpOAV6ArtCod_to) != 0 ) || ( GXutil.strcmp(AV17ForColNom, wcpOAV17ForColNom) != 0 ) || ( GXutil.strcmp(AV18ForColNom_to, wcpOAV18ForColNom_to) != 0 ) || ( AV20ForColNum != wcpOAV20ForColNum ) || ( AV21ForColNum_to != wcpOAV21ForColNum_to ) || ( AV89Clicodinout != wcpOAV89Clicodinout ) || ( AV90Clicodinout_to != wcpOAV90Clicodinout_to ) || ( AV24IntCod != wcpOAV24IntCod ) || ( AV25IntCod_to != wcpOAV25IntCod_to ) || ( AV27TipArtCod != wcpOAV27TipArtCod ) || ( AV28TipArtCod_to != wcpOAV28TipArtCod_to ) || ( AV30TipColCod != wcpOAV30TipColCod ) || ( AV31TipColCod_to != wcpOAV31TipColCod_to ) ) )
      {
         setjustcreated();
      }
      wcpOAV33Emprcod = AV33Emprcod ;
      wcpOAV91HreRacabinout = AV91HreRacabinout ;
      wcpOAV14Fecha = AV14Fecha ;
      wcpOAV15Fecha_to = AV15Fecha_to ;
      wcpOAV55Calculo = AV55Calculo ;
      wcpOAV8barcod = AV8barcod ;
      wcpOAV10barcodreo = AV10barcodreo ;
      wcpOAV9barcodpar = AV9barcodpar ;
      wcpOAV5ArtCod = AV5ArtCod ;
      wcpOAV6ArtCod_to = AV6ArtCod_to ;
      wcpOAV17ForColNom = AV17ForColNom ;
      wcpOAV18ForColNom_to = AV18ForColNom_to ;
      wcpOAV20ForColNum = AV20ForColNum ;
      wcpOAV21ForColNum_to = AV21ForColNum_to ;
      wcpOAV89Clicodinout = AV89Clicodinout ;
      wcpOAV90Clicodinout_to = AV90Clicodinout_to ;
      wcpOAV24IntCod = AV24IntCod ;
      wcpOAV25IntCod_to = AV25IntCod_to ;
      wcpOAV27TipArtCod = AV27TipArtCod ;
      wcpOAV28TipArtCod_to = AV28TipArtCod_to ;
      wcpOAV30TipColCod = AV30TipColCod ;
      wcpOAV31TipColCod_to = AV31TipColCod_to ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV33Emprcod = httpContext.cgiGet( sPrefix+"AV33Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV33Emprcod) > 0 )
      {
         AV33Emprcod = httpContext.cgiGet( sCtrlAV33Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33Emprcod", AV33Emprcod);
      }
      else
      {
         AV33Emprcod = httpContext.cgiGet( sPrefix+"AV33Emprcod_PARM") ;
      }
      sCtrlAV91HreRacabinout = httpContext.cgiGet( sPrefix+"AV91HreRacabinout_CTRL") ;
      if ( GXutil.len( sCtrlAV91HreRacabinout) > 0 )
      {
         AV91HreRacabinout = httpContext.cgiGet( sCtrlAV91HreRacabinout) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV91HreRacabinout", AV91HreRacabinout);
      }
      else
      {
         AV91HreRacabinout = httpContext.cgiGet( sPrefix+"AV91HreRacabinout_PARM") ;
      }
      sCtrlAV14Fecha = httpContext.cgiGet( sPrefix+"AV14Fecha_CTRL") ;
      if ( GXutil.len( sCtrlAV14Fecha) > 0 )
      {
         AV14Fecha = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV14Fecha), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14Fecha", localUtil.format(AV14Fecha, "99/99/99"));
      }
      else
      {
         AV14Fecha = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV14Fecha_PARM"), 0) ;
      }
      sCtrlAV15Fecha_to = httpContext.cgiGet( sPrefix+"AV15Fecha_to_CTRL") ;
      if ( GXutil.len( sCtrlAV15Fecha_to) > 0 )
      {
         AV15Fecha_to = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV15Fecha_to), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Fecha_to", localUtil.format(AV15Fecha_to, "99/99/99"));
      }
      else
      {
         AV15Fecha_to = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV15Fecha_to_PARM"), 0) ;
      }
      sCtrlAV55Calculo = httpContext.cgiGet( sPrefix+"AV55Calculo_CTRL") ;
      if ( GXutil.len( sCtrlAV55Calculo) > 0 )
      {
         AV55Calculo = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV55Calculo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55Calculo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55Calculo), 4, 0));
      }
      else
      {
         AV55Calculo = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV55Calculo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV8barcod = httpContext.cgiGet( sPrefix+"AV8barcod_CTRL") ;
      if ( GXutil.len( sCtrlAV8barcod) > 0 )
      {
         AV8barcod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV8barcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8barcod), 8, 0));
      }
      else
      {
         AV8barcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV8barcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV10barcodreo = httpContext.cgiGet( sPrefix+"AV10barcodreo_CTRL") ;
      if ( GXutil.len( sCtrlAV10barcodreo) > 0 )
      {
         AV10barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV10barcodreo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10barcodreo", GXutil.str( AV10barcodreo, 1, 0));
      }
      else
      {
         AV10barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV10barcodreo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV9barcodpar = httpContext.cgiGet( sPrefix+"AV9barcodpar_CTRL") ;
      if ( GXutil.len( sCtrlAV9barcodpar) > 0 )
      {
         AV9barcodpar = httpContext.cgiGet( sCtrlAV9barcodpar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9barcodpar", AV9barcodpar);
      }
      else
      {
         AV9barcodpar = httpContext.cgiGet( sPrefix+"AV9barcodpar_PARM") ;
      }
      sCtrlAV5ArtCod = httpContext.cgiGet( sPrefix+"AV5ArtCod_CTRL") ;
      if ( GXutil.len( sCtrlAV5ArtCod) > 0 )
      {
         AV5ArtCod = httpContext.cgiGet( sCtrlAV5ArtCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5ArtCod", AV5ArtCod);
      }
      else
      {
         AV5ArtCod = httpContext.cgiGet( sPrefix+"AV5ArtCod_PARM") ;
      }
      sCtrlAV6ArtCod_to = httpContext.cgiGet( sPrefix+"AV6ArtCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV6ArtCod_to) > 0 )
      {
         AV6ArtCod_to = httpContext.cgiGet( sCtrlAV6ArtCod_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6ArtCod_to", AV6ArtCod_to);
      }
      else
      {
         AV6ArtCod_to = httpContext.cgiGet( sPrefix+"AV6ArtCod_to_PARM") ;
      }
      sCtrlAV17ForColNom = httpContext.cgiGet( sPrefix+"AV17ForColNom_CTRL") ;
      if ( GXutil.len( sCtrlAV17ForColNom) > 0 )
      {
         AV17ForColNom = httpContext.cgiGet( sCtrlAV17ForColNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17ForColNom", AV17ForColNom);
      }
      else
      {
         AV17ForColNom = httpContext.cgiGet( sPrefix+"AV17ForColNom_PARM") ;
      }
      sCtrlAV18ForColNom_to = httpContext.cgiGet( sPrefix+"AV18ForColNom_to_CTRL") ;
      if ( GXutil.len( sCtrlAV18ForColNom_to) > 0 )
      {
         AV18ForColNom_to = httpContext.cgiGet( sCtrlAV18ForColNom_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18ForColNom_to", AV18ForColNom_to);
      }
      else
      {
         AV18ForColNom_to = httpContext.cgiGet( sPrefix+"AV18ForColNom_to_PARM") ;
      }
      sCtrlAV20ForColNum = httpContext.cgiGet( sPrefix+"AV20ForColNum_CTRL") ;
      if ( GXutil.len( sCtrlAV20ForColNum) > 0 )
      {
         AV20ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV20ForColNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20ForColNum), 6, 0));
      }
      else
      {
         AV20ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV20ForColNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV21ForColNum_to = httpContext.cgiGet( sPrefix+"AV21ForColNum_to_CTRL") ;
      if ( GXutil.len( sCtrlAV21ForColNum_to) > 0 )
      {
         AV21ForColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV21ForColNum_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21ForColNum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21ForColNum_to), 6, 0));
      }
      else
      {
         AV21ForColNum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV21ForColNum_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV89Clicodinout = httpContext.cgiGet( sPrefix+"AV89Clicodinout_CTRL") ;
      if ( GXutil.len( sCtrlAV89Clicodinout) > 0 )
      {
         AV89Clicodinout = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV89Clicodinout), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV89Clicodinout", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV89Clicodinout), 6, 0));
      }
      else
      {
         AV89Clicodinout = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV89Clicodinout_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV90Clicodinout_to = httpContext.cgiGet( sPrefix+"AV90Clicodinout_to_CTRL") ;
      if ( GXutil.len( sCtrlAV90Clicodinout_to) > 0 )
      {
         AV90Clicodinout_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV90Clicodinout_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV90Clicodinout_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90Clicodinout_to), 6, 0));
      }
      else
      {
         AV90Clicodinout_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV90Clicodinout_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV24IntCod = httpContext.cgiGet( sPrefix+"AV24IntCod_CTRL") ;
      if ( GXutil.len( sCtrlAV24IntCod) > 0 )
      {
         AV24IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV24IntCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24IntCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24IntCod), 2, 0));
      }
      else
      {
         AV24IntCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV24IntCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV25IntCod_to = httpContext.cgiGet( sPrefix+"AV25IntCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV25IntCod_to) > 0 )
      {
         AV25IntCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV25IntCod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25IntCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25IntCod_to), 2, 0));
      }
      else
      {
         AV25IntCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV25IntCod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV27TipArtCod = httpContext.cgiGet( sPrefix+"AV27TipArtCod_CTRL") ;
      if ( GXutil.len( sCtrlAV27TipArtCod) > 0 )
      {
         AV27TipArtCod = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV27TipArtCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TipArtCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TipArtCod), 4, 0));
      }
      else
      {
         AV27TipArtCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV27TipArtCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV28TipArtCod_to = httpContext.cgiGet( sPrefix+"AV28TipArtCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV28TipArtCod_to) > 0 )
      {
         AV28TipArtCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV28TipArtCod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TipArtCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TipArtCod_to), 4, 0));
      }
      else
      {
         AV28TipArtCod_to = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV28TipArtCod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV30TipColCod = httpContext.cgiGet( sPrefix+"AV30TipColCod_CTRL") ;
      if ( GXutil.len( sCtrlAV30TipColCod) > 0 )
      {
         AV30TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV30TipColCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TipColCod), 2, 0));
      }
      else
      {
         AV30TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV30TipColCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV31TipColCod_to = httpContext.cgiGet( sPrefix+"AV31TipColCod_to_CTRL") ;
      if ( GXutil.len( sCtrlAV31TipColCod_to) > 0 )
      {
         AV31TipColCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV31TipColCod_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TipColCod_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31TipColCod_to), 2, 0));
      }
      else
      {
         AV31TipColCod_to = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV31TipColCod_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
   }

   public void componentprocess( String sPPrefix ,
                                 String sPSFPrefix ,
                                 String sCompEvt )
   {
      sCompPrefix = sPPrefix ;
      sSFPrefix = sPSFPrefix ;
      sPrefix = sCompPrefix + sSFPrefix ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      initweb( ) ;
      nDraw = (byte)(0) ;
      pa1FT2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1FT2( ) ;
      if ( isFullAjaxMode( ) )
      {
         componentdraw();
      }
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void componentstart( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
   }

   public void wcstart( )
   {
      nDraw = (byte)(1) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      ws1FT2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33Emprcod_PARM", GXutil.rtrim( AV33Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33Emprcod_CTRL", GXutil.rtrim( sCtrlAV33Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV91HreRacabinout_PARM", GXutil.rtrim( AV91HreRacabinout));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV91HreRacabinout)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV91HreRacabinout_CTRL", GXutil.rtrim( sCtrlAV91HreRacabinout));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14Fecha_PARM", localUtil.dtoc( AV14Fecha, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV14Fecha)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV14Fecha_CTRL", GXutil.rtrim( sCtrlAV14Fecha));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15Fecha_to_PARM", localUtil.dtoc( AV15Fecha_to, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV15Fecha_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV15Fecha_to_CTRL", GXutil.rtrim( sCtrlAV15Fecha_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV55Calculo_PARM", GXutil.ltrim( localUtil.ntoc( AV55Calculo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV55Calculo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV55Calculo_CTRL", GXutil.rtrim( sCtrlAV55Calculo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8barcod_PARM", GXutil.ltrim( localUtil.ntoc( AV8barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8barcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8barcod_CTRL", GXutil.rtrim( sCtrlAV8barcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10barcodreo_PARM", GXutil.ltrim( localUtil.ntoc( AV10barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10barcodreo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10barcodreo_CTRL", GXutil.rtrim( sCtrlAV10barcodreo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9barcodpar_PARM", GXutil.rtrim( AV9barcodpar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9barcodpar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9barcodpar_CTRL", GXutil.rtrim( sCtrlAV9barcodpar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5ArtCod_PARM", GXutil.rtrim( AV5ArtCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5ArtCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5ArtCod_CTRL", GXutil.rtrim( sCtrlAV5ArtCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6ArtCod_to_PARM", GXutil.rtrim( AV6ArtCod_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6ArtCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6ArtCod_to_CTRL", GXutil.rtrim( sCtrlAV6ArtCod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17ForColNom_PARM", GXutil.rtrim( AV17ForColNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV17ForColNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17ForColNom_CTRL", GXutil.rtrim( sCtrlAV17ForColNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18ForColNom_to_PARM", GXutil.rtrim( AV18ForColNom_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV18ForColNom_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18ForColNom_to_CTRL", GXutil.rtrim( sCtrlAV18ForColNom_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20ForColNum_PARM", GXutil.ltrim( localUtil.ntoc( AV20ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV20ForColNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV20ForColNum_CTRL", GXutil.rtrim( sCtrlAV20ForColNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21ForColNum_to_PARM", GXutil.ltrim( localUtil.ntoc( AV21ForColNum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV21ForColNum_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV21ForColNum_to_CTRL", GXutil.rtrim( sCtrlAV21ForColNum_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV89Clicodinout_PARM", GXutil.ltrim( localUtil.ntoc( AV89Clicodinout, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV89Clicodinout)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV89Clicodinout_CTRL", GXutil.rtrim( sCtrlAV89Clicodinout));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV90Clicodinout_to_PARM", GXutil.ltrim( localUtil.ntoc( AV90Clicodinout_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV90Clicodinout_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV90Clicodinout_to_CTRL", GXutil.rtrim( sCtrlAV90Clicodinout_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24IntCod_PARM", GXutil.ltrim( localUtil.ntoc( AV24IntCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV24IntCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24IntCod_CTRL", GXutil.rtrim( sCtrlAV24IntCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25IntCod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV25IntCod_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV25IntCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25IntCod_to_CTRL", GXutil.rtrim( sCtrlAV25IntCod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27TipArtCod_PARM", GXutil.ltrim( localUtil.ntoc( AV27TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV27TipArtCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV27TipArtCod_CTRL", GXutil.rtrim( sCtrlAV27TipArtCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28TipArtCod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV28TipArtCod_to, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV28TipArtCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV28TipArtCod_to_CTRL", GXutil.rtrim( sCtrlAV28TipArtCod_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30TipColCod_PARM", GXutil.ltrim( localUtil.ntoc( AV30TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV30TipColCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV30TipColCod_CTRL", GXutil.rtrim( sCtrlAV30TipColCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31TipColCod_to_PARM", GXutil.ltrim( localUtil.ntoc( AV31TipColCod_to, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV31TipColCod_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV31TipColCod_to_CTRL", GXutil.rtrim( sCtrlAV31TipColCod_to));
      }
   }

   public void componentdraw( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      wcparametersset( ) ;
      we1FT2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public String componentgetstring( String sGXControl )
   {
      String sCtrlName;
      if ( GXutil.strcmp(GXutil.substring( sGXControl, 1, 1), "&") == 0 )
      {
         sCtrlName = GXutil.substring( sGXControl, 2, GXutil.len( sGXControl)-1) ;
      }
      else
      {
         sCtrlName = sGXControl ;
      }
      return httpContext.cgiGet( sPrefix+"v"+GXutil.upper( sCtrlName)) ;
   }

   public void componentjscripts( )
   {
      include_jscripts( ) ;
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         WebComp_Grid_dwc.componentjscripts();
      }
      if ( ! ( WebComp_Wwpaux_wc == null ) )
      {
         WebComp_Wwpaux_wc.componentjscripts();
      }
   }

   public void componentthemes( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
         {
            WebComp_Grid_dwc.componentthemes();
         }
      }
      if ( ! ( WebComp_Wwpaux_wc == null ) )
      {
         if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
         {
            WebComp_Wwpaux_wc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115562572", true, true);
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
      httpContext.AddJavascriptSource("costesquimicosanalisis_wc.js", "?202682115562573", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_372( )
   {
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES_"+sGXsfl_37_idx );
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_37_idx ;
      edtavTablaa_Internalname = sPrefix+"vTABLAA_"+sGXsfl_37_idx ;
      edtavToa_Internalname = sPrefix+"vTOA_"+sGXsfl_37_idx ;
      edtavHrefectin_Internalname = sPrefix+"vHREFECTIN_"+sGXsfl_37_idx ;
      edtavMarca_Internalname = sPrefix+"vMARCA_"+sGXsfl_37_idx ;
      edtavHdr_Internalname = sPrefix+"vHDR_"+sGXsfl_37_idx ;
      edtavBaragrest_Internalname = sPrefix+"vBARAGREST_"+sGXsfl_37_idx ;
      edtavHrebarkgm_Internalname = sPrefix+"vHREBARKGM_"+sGXsfl_37_idx ;
      edtavHretotkgm_Internalname = sPrefix+"vHRETOTKGM_"+sGXsfl_37_idx ;
      edtavHremaqcod_Internalname = sPrefix+"vHREMAQCOD_"+sGXsfl_37_idx ;
      edtavHrevolprd_Internalname = sPrefix+"vHREVOLPRD_"+sGXsfl_37_idx ;
      edtavRb_Internalname = sPrefix+"vRB_"+sGXsfl_37_idx ;
      edtavCostei_Internalname = sPrefix+"vCOSTEI_"+sGXsfl_37_idx ;
      edtavCostet_Internalname = sPrefix+"vCOSTET_"+sGXsfl_37_idx ;
      edtavDif_Internalname = sPrefix+"vDIF_"+sGXsfl_37_idx ;
      edtavPorc_Internalname = sPrefix+"vPORC_"+sGXsfl_37_idx ;
      edtavCostek_Internalname = sPrefix+"vCOSTEK_"+sGXsfl_37_idx ;
      edtavClicod_Internalname = sPrefix+"vCLICOD_"+sGXsfl_37_idx ;
      edtavClinom_Internalname = sPrefix+"vCLINOM_"+sGXsfl_37_idx ;
      edtavHrebarser_Internalname = sPrefix+"vHREBARSER_"+sGXsfl_37_idx ;
      edtavHrebardsc_Internalname = sPrefix+"vHREBARDSC_"+sGXsfl_37_idx ;
      edtavHretipartd_Internalname = sPrefix+"vHRETIPARTD_"+sGXsfl_37_idx ;
      edtavHrecolnom_Internalname = sPrefix+"vHRECOLNOM_"+sGXsfl_37_idx ;
      edtavHrecolnum_Internalname = sPrefix+"vHRECOLNUM_"+sGXsfl_37_idx ;
      edtavHretipcoln_Internalname = sPrefix+"vHRETIPCOLN_"+sGXsfl_37_idx ;
      edtavHreintdsc_Internalname = sPrefix+"vHREINTDSC_"+sGXsfl_37_idx ;
      edtavHredti_Internalname = sPrefix+"vHREDTI_"+sGXsfl_37_idx ;
      edtavHredtf_Internalname = sPrefix+"vHREDTF_"+sGXsfl_37_idx ;
      edtavHrebarcod_Internalname = sPrefix+"vHREBARCOD_"+sGXsfl_37_idx ;
      edtavHrebarpar_Internalname = sPrefix+"vHREBARPAR_"+sGXsfl_37_idx ;
      edtavHrebarreo_Internalname = sPrefix+"vHREBARREO_"+sGXsfl_37_idx ;
      edtavHrenumcie_Internalname = sPrefix+"vHRENUMCIE_"+sGXsfl_37_idx ;
      edtavHrelinmaq_Internalname = sPrefix+"vHRELINMAQ_"+sGXsfl_37_idx ;
      edtavEnccli_Internalname = sPrefix+"vENCCLI_"+sGXsfl_37_idx ;
   }

   public void subsflControlProps_fel_372( )
   {
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES_"+sGXsfl_37_fel_idx );
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_37_fel_idx ;
      edtavTablaa_Internalname = sPrefix+"vTABLAA_"+sGXsfl_37_fel_idx ;
      edtavToa_Internalname = sPrefix+"vTOA_"+sGXsfl_37_fel_idx ;
      edtavHrefectin_Internalname = sPrefix+"vHREFECTIN_"+sGXsfl_37_fel_idx ;
      edtavMarca_Internalname = sPrefix+"vMARCA_"+sGXsfl_37_fel_idx ;
      edtavHdr_Internalname = sPrefix+"vHDR_"+sGXsfl_37_fel_idx ;
      edtavBaragrest_Internalname = sPrefix+"vBARAGREST_"+sGXsfl_37_fel_idx ;
      edtavHrebarkgm_Internalname = sPrefix+"vHREBARKGM_"+sGXsfl_37_fel_idx ;
      edtavHretotkgm_Internalname = sPrefix+"vHRETOTKGM_"+sGXsfl_37_fel_idx ;
      edtavHremaqcod_Internalname = sPrefix+"vHREMAQCOD_"+sGXsfl_37_fel_idx ;
      edtavHrevolprd_Internalname = sPrefix+"vHREVOLPRD_"+sGXsfl_37_fel_idx ;
      edtavRb_Internalname = sPrefix+"vRB_"+sGXsfl_37_fel_idx ;
      edtavCostei_Internalname = sPrefix+"vCOSTEI_"+sGXsfl_37_fel_idx ;
      edtavCostet_Internalname = sPrefix+"vCOSTET_"+sGXsfl_37_fel_idx ;
      edtavDif_Internalname = sPrefix+"vDIF_"+sGXsfl_37_fel_idx ;
      edtavPorc_Internalname = sPrefix+"vPORC_"+sGXsfl_37_fel_idx ;
      edtavCostek_Internalname = sPrefix+"vCOSTEK_"+sGXsfl_37_fel_idx ;
      edtavClicod_Internalname = sPrefix+"vCLICOD_"+sGXsfl_37_fel_idx ;
      edtavClinom_Internalname = sPrefix+"vCLINOM_"+sGXsfl_37_fel_idx ;
      edtavHrebarser_Internalname = sPrefix+"vHREBARSER_"+sGXsfl_37_fel_idx ;
      edtavHrebardsc_Internalname = sPrefix+"vHREBARDSC_"+sGXsfl_37_fel_idx ;
      edtavHretipartd_Internalname = sPrefix+"vHRETIPARTD_"+sGXsfl_37_fel_idx ;
      edtavHrecolnom_Internalname = sPrefix+"vHRECOLNOM_"+sGXsfl_37_fel_idx ;
      edtavHrecolnum_Internalname = sPrefix+"vHRECOLNUM_"+sGXsfl_37_fel_idx ;
      edtavHretipcoln_Internalname = sPrefix+"vHRETIPCOLN_"+sGXsfl_37_fel_idx ;
      edtavHreintdsc_Internalname = sPrefix+"vHREINTDSC_"+sGXsfl_37_fel_idx ;
      edtavHredti_Internalname = sPrefix+"vHREDTI_"+sGXsfl_37_fel_idx ;
      edtavHredtf_Internalname = sPrefix+"vHREDTF_"+sGXsfl_37_fel_idx ;
      edtavHrebarcod_Internalname = sPrefix+"vHREBARCOD_"+sGXsfl_37_fel_idx ;
      edtavHrebarpar_Internalname = sPrefix+"vHREBARPAR_"+sGXsfl_37_fel_idx ;
      edtavHrebarreo_Internalname = sPrefix+"vHREBARREO_"+sGXsfl_37_fel_idx ;
      edtavHrenumcie_Internalname = sPrefix+"vHRENUMCIE_"+sGXsfl_37_fel_idx ;
      edtavHrelinmaq_Internalname = sPrefix+"vHRELINMAQ_"+sGXsfl_37_fel_idx ;
      edtavEnccli_Internalname = sPrefix+"vENCCLI_"+sGXsfl_37_fel_idx ;
   }

   public void sendrow_372( )
   {
      subsflControlProps_372( ) ;
      wb1FT0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_37_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
      {
         GridRow = GXWebRow.GetNew(context,GridContainer) ;
         if ( subGrid_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            subGrid_Backcolor = subGrid_Allbackcolor ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Uniform" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
            subGrid_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_37_idx) % (2))) == 0 )
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Even" ;
               }
            }
            else
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Odd" ;
               }
            }
         }
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_37_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 38,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         if ( ( cmbavGrupodeacciones.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_37_idx ;
            cmbavGrupodeacciones.setName( GXCCtl );
            cmbavGrupodeacciones.setWebtags( "" );
            if ( cmbavGrupodeacciones.getItemCount() > 0 )
            {
               AV98GrupodeAcciones = (short)(GXutil.lval( cmbavGrupodeacciones.getValidValue(GXutil.trim( GXutil.str( AV98GrupodeAcciones, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGrupodeacciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV98GrupodeAcciones), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGrupodeacciones,cmbavGrupodeacciones.getInternalname(),GXutil.trim( GXutil.str( AV98GrupodeAcciones, 4, 0)),Integer.valueOf(1),cmbavGrupodeacciones.getJsonclick(),Integer.valueOf(7),"'"+sPrefix+"'"+",false,"+"'"+"e191ft2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","",cmbavGrupodeacciones.getThemeClass(),cmbavGrupodeacciones.getColumnClass(),cmbavGrupodeacciones.getColumnHeaderClass(),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGrupodeacciones.getEnabled()!=0)&&(cmbavGrupodeacciones.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,38);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGrupodeacciones.setValue( GXutil.trim( GXutil.str( AV98GrupodeAcciones, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGrupodeacciones.getInternalname(), "Values", cmbavGrupodeacciones.ToJavascriptSource(), !bGXsfl_37_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 39,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV97DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,39);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+"e201ft2_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,edtavDetailwebcomponent_Columnclass,edtavDetailwebcomponent_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTablaa_Enabled!=0)&&(edtavTablaa_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 40,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTablaa_Internalname,GXutil.ltrim( localUtil.ntoc( AV88TablaA, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTablaa_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV88TablaA), "9") : localUtil.format( DecimalUtil.doubleToDec(AV88TablaA), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavTablaa_Enabled!=0)&&(edtavTablaa_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTablaa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavTablaa_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavToa_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavToa_Enabled!=0)&&(edtavToa_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 41,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavToa_Internalname,GXutil.rtrim( AV42ToA),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavToa_Enabled!=0)&&(edtavToa_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,41);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavToa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavToa_Columnclass,edtavToa_Columnheaderclass,Integer.valueOf(edtavToa_Visible),Integer.valueOf(edtavToa_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavHrefectin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHrefectin_Enabled!=0)&&(edtavHrefectin_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 42,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHrefectin_Internalname,localUtil.format(AV59HreFecTin, "99/99/99"),localUtil.format( AV59HreFecTin, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavHrefectin_Enabled!=0)&&(edtavHrefectin_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,42);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHrefectin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavHrefectin_Columnclass,edtavHrefectin_Columnheaderclass,Integer.valueOf(edtavHrefectin_Visible),Integer.valueOf(edtavHrefectin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavMarca_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavMarca_Enabled!=0)&&(edtavMarca_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 43,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMarca_Internalname,GXutil.rtrim( AV75Marca),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMarca_Enabled!=0)&&(edtavMarca_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,43);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMarca_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavMarca_Columnclass,edtavMarca_Columnheaderclass,Integer.valueOf(edtavMarca_Visible),Integer.valueOf(edtavMarca_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHdr_Enabled!=0)&&(edtavHdr_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 44,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr_Internalname,GXutil.rtrim( AV76Hdr),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHdr_Enabled!=0)&&(edtavHdr_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,44);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavHdr_Columnclass,edtavHdr_Columnheaderclass,Integer.valueOf(edtavHdr_Visible),Integer.valueOf(edtavHdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavBaragrest_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBaragrest_Enabled!=0)&&(edtavBaragrest_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 45,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBaragrest_Internalname,GXutil.rtrim( AV77BarAGrest),GXutil.rtrim( localUtil.format( AV77BarAGrest, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+((edtavBaragrest_Enabled!=0)&&(edtavBaragrest_Visible!=0) ? " onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,45);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBaragrest_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavBaragrest_Columnclass,edtavBaragrest_Columnheaderclass,Integer.valueOf(edtavBaragrest_Visible),Integer.valueOf(edtavBaragrest_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavHrebarkgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHrebarkgm_Enabled!=0)&&(edtavHrebarkgm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 46,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHrebarkgm_Internalname,GXutil.ltrim( localUtil.ntoc( AV57HreBarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavHrebarkgm_Enabled!=0) ? localUtil.format( AV57HreBarKgm, "ZZZZZ9.99") : localUtil.format( AV57HreBarKgm, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavHrebarkgm_Enabled!=0)&&(edtavHrebarkgm_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,46);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHrebarkgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavHrebarkgm_Columnclass,edtavHrebarkgm_Columnheaderclass,Integer.valueOf(edtavHrebarkgm_Visible),Integer.valueOf(edtavHrebarkgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavHretotkgm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHretotkgm_Enabled!=0)&&(edtavHretotkgm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 47,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHretotkgm_Internalname,GXutil.ltrim( localUtil.ntoc( AV58HreTotKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavHretotkgm_Enabled!=0) ? localUtil.format( AV58HreTotKgm, "ZZZZZ9.99") : localUtil.format( AV58HreTotKgm, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavHretotkgm_Enabled!=0)&&(edtavHretotkgm_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,47);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHretotkgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavHretotkgm_Columnclass,edtavHretotkgm_Columnheaderclass,Integer.valueOf(edtavHretotkgm_Visible),Integer.valueOf(edtavHretotkgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHremaqcod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHremaqcod_Enabled!=0)&&(edtavHremaqcod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 48,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHremaqcod_Internalname,GXutil.rtrim( AV78HreMaqCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHremaqcod_Enabled!=0)&&(edtavHremaqcod_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,48);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHremaqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavHremaqcod_Columnclass,edtavHremaqcod_Columnheaderclass,Integer.valueOf(edtavHremaqcod_Visible),Integer.valueOf(edtavHremaqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavHrevolprd_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHrevolprd_Enabled!=0)&&(edtavHrevolprd_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 49,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHrevolprd_Internalname,GXutil.ltrim( localUtil.ntoc( AV79HreVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavHrevolprd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV79HreVolPrd), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV79HreVolPrd), "ZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavHrevolprd_Enabled!=0)&&(edtavHrevolprd_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHrevolprd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavHrevolprd_Columnclass,edtavHrevolprd_Columnheaderclass,Integer.valueOf(edtavHrevolprd_Visible),Integer.valueOf(edtavHrevolprd_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRb_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavRb_Enabled!=0)&&(edtavRb_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 50,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRb_Internalname,GXutil.ltrim( localUtil.ntoc( AV80Rb, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavRb_Enabled!=0) ? localUtil.format( AV80Rb, "ZZZ9.99") : localUtil.format( AV80Rb, "ZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavRb_Enabled!=0)&&(edtavRb_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,50);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavRb_Columnclass,edtavRb_Columnheaderclass,Integer.valueOf(edtavRb_Visible),Integer.valueOf(edtavRb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostei_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCostei_Enabled!=0)&&(edtavCostei_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 51,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostei_Internalname,GXutil.ltrim( localUtil.ntoc( AV81Costei, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostei_Enabled!=0) ? localUtil.format( AV81Costei, "ZZZZZZ9.99") : localUtil.format( AV81Costei, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavCostei_Enabled!=0)&&(edtavCostei_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,51);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostei_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCostei_Columnclass,edtavCostei_Columnheaderclass,Integer.valueOf(edtavCostei_Visible),Integer.valueOf(edtavCostei_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostet_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCostet_Enabled!=0)&&(edtavCostet_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 52,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostet_Internalname,GXutil.ltrim( localUtil.ntoc( AV82CosteT, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostet_Enabled!=0) ? localUtil.format( AV82CosteT, "ZZZZZZ9.99") : localUtil.format( AV82CosteT, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavCostet_Enabled!=0)&&(edtavCostet_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,52);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCostet_Columnclass,edtavCostet_Columnheaderclass,Integer.valueOf(edtavCostet_Visible),Integer.valueOf(edtavCostet_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDif_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDif_Enabled!=0)&&(edtavDif_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 53,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDif_Internalname,GXutil.ltrim( localUtil.ntoc( AV83Dif, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDif_Enabled!=0) ? localUtil.format( AV83Dif, "ZZZZZZ9.99") : localUtil.format( AV83Dif, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavDif_Enabled!=0)&&(edtavDif_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,53);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDif_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavDif_Columnclass,edtavDif_Columnheaderclass,Integer.valueOf(edtavDif_Visible),Integer.valueOf(edtavDif_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavPorc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPorc_Enabled!=0)&&(edtavPorc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 54,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPorc_Internalname,GXutil.ltrim( localUtil.ntoc( AV84Porc, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPorc_Enabled!=0) ? localUtil.format( AV84Porc, "ZZ9.99") : localUtil.format( AV84Porc, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavPorc_Enabled!=0)&&(edtavPorc_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,54);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPorc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavPorc_Columnclass,edtavPorc_Columnheaderclass,Integer.valueOf(edtavPorc_Visible),Integer.valueOf(edtavPorc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavCostek_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCostek_Enabled!=0)&&(edtavCostek_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 55,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCostek_Internalname,GXutil.ltrim( localUtil.ntoc( AV85CosteK, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavCostek_Enabled!=0) ? localUtil.format( AV85CosteK, "ZZZZZZ9.99") : localUtil.format( AV85CosteK, "ZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavCostek_Enabled!=0)&&(edtavCostek_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,55);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCostek_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavCostek_Columnclass,edtavCostek_Columnheaderclass,Integer.valueOf(edtavCostek_Visible),Integer.valueOf(edtavCostek_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavClicod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavClicod_Enabled!=0)&&(edtavClicod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 56,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavClicod_Internalname,GXutil.ltrim( localUtil.ntoc( AV11CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV11CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV11CliCod), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavClicod_Enabled!=0)&&(edtavClicod_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavClicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavClicod_Columnclass,edtavClicod_Columnheaderclass,Integer.valueOf(edtavClicod_Visible),Integer.valueOf(edtavClicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavClinom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavClinom_Enabled!=0)&&(edtavClinom_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 57,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavClinom_Internalname,GXutil.rtrim( AV60CliNom),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavClinom_Enabled!=0)&&(edtavClinom_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,57);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavClinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavClinom_Columnclass,edtavClinom_Columnheaderclass,Integer.valueOf(edtavClinom_Visible),Integer.valueOf(edtavClinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHrebarser_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHrebarser_Enabled!=0)&&(edtavHrebarser_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 58,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHrebarser_Internalname,GXutil.rtrim( AV61HreBarSer),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHrebarser_Enabled!=0)&&(edtavHrebarser_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,58);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHrebarser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavHrebarser_Columnclass,edtavHrebarser_Columnheaderclass,Integer.valueOf(edtavHrebarser_Visible),Integer.valueOf(edtavHrebarser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHrebardsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHrebardsc_Enabled!=0)&&(edtavHrebardsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 59,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHrebardsc_Internalname,GXutil.rtrim( AV62HreBarDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHrebardsc_Enabled!=0)&&(edtavHrebardsc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,59);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHrebardsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavHrebardsc_Columnclass,edtavHrebardsc_Columnheaderclass,Integer.valueOf(edtavHrebardsc_Visible),Integer.valueOf(edtavHrebardsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHretipartd_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHretipartd_Enabled!=0)&&(edtavHretipartd_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 60,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHretipartd_Internalname,GXutil.rtrim( AV65HreTipArtD),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHretipartd_Enabled!=0)&&(edtavHretipartd_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,60);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHretipartd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavHretipartd_Columnclass,edtavHretipartd_Columnheaderclass,Integer.valueOf(edtavHretipartd_Visible),Integer.valueOf(edtavHretipartd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHrecolnom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHrecolnom_Enabled!=0)&&(edtavHrecolnom_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 61,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHrecolnom_Internalname,GXutil.rtrim( AV63HreColNom),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHrecolnom_Enabled!=0)&&(edtavHrecolnom_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,61);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHrecolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavHrecolnom_Columnclass,edtavHrecolnom_Columnheaderclass,Integer.valueOf(edtavHrecolnom_Visible),Integer.valueOf(edtavHrecolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavHrecolnum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHrecolnum_Enabled!=0)&&(edtavHrecolnum_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 62,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHrecolnum_Internalname,GXutil.ltrim( localUtil.ntoc( AV64HreColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavHrecolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV64HreColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV64HreColNum), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavHrecolnum_Enabled!=0)&&(edtavHrecolnum_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,62);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHrecolnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavHrecolnum_Columnclass,edtavHrecolnum_Columnheaderclass,Integer.valueOf(edtavHrecolnum_Visible),Integer.valueOf(edtavHrecolnum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHretipcoln_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHretipcoln_Enabled!=0)&&(edtavHretipcoln_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 63,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHretipcoln_Internalname,GXutil.rtrim( AV66HreTipColN),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHretipcoln_Enabled!=0)&&(edtavHretipcoln_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,63);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHretipcoln_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavHretipcoln_Columnclass,edtavHretipcoln_Columnheaderclass,Integer.valueOf(edtavHretipcoln_Visible),Integer.valueOf(edtavHretipcoln_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavHreintdsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHreintdsc_Enabled!=0)&&(edtavHreintdsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 64,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHreintdsc_Internalname,GXutil.rtrim( AV67HreIntDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHreintdsc_Enabled!=0)&&(edtavHreintdsc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,64);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHreintdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavHreintdsc_Columnclass,edtavHreintdsc_Columnheaderclass,Integer.valueOf(edtavHreintdsc_Visible),Integer.valueOf(edtavHreintdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavHredti_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHredti_Enabled!=0)&&(edtavHredti_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 65,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHredti_Internalname,localUtil.ttoc( AV73HreDti, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( AV73HreDti, "99/99/99 99:99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavHredti_Enabled!=0)&&(edtavHredti_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,65);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHredti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavHredti_Columnclass,edtavHredti_Columnheaderclass,Integer.valueOf(edtavHredti_Visible),Integer.valueOf(edtavHredti_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavHredtf_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHredtf_Enabled!=0)&&(edtavHredtf_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 66,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHredtf_Internalname,localUtil.ttoc( AV72HreDtf, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( AV72HreDtf, "99/99/99 99:99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavHredtf_Enabled!=0)&&(edtavHredtf_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,66);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHredtf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavHredtf_Columnclass,edtavHredtf_Columnheaderclass,Integer.valueOf(edtavHredtf_Visible),Integer.valueOf(edtavHredtf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHrebarcod_Enabled!=0)&&(edtavHrebarcod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 67,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHrebarcod_Internalname,GXutil.ltrim( localUtil.ntoc( AV68HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavHrebarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV68HreBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV68HreBarCod), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavHrebarcod_Enabled!=0)&&(edtavHrebarcod_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHrebarcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavHrebarcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHrebarpar_Enabled!=0)&&(edtavHrebarpar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 68,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHrebarpar_Internalname,GXutil.rtrim( AV69HreBarPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavHrebarpar_Enabled!=0)&&(edtavHrebarpar_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,68);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHrebarpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavHrebarpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHrebarreo_Enabled!=0)&&(edtavHrebarreo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 69,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHrebarreo_Internalname,GXutil.ltrim( localUtil.ntoc( AV70HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavHrebarreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV70HreBarReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV70HreBarReo), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavHrebarreo_Enabled!=0)&&(edtavHrebarreo_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHrebarreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavHrebarreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHrenumcie_Enabled!=0)&&(edtavHrenumcie_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 70,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHrenumcie_Internalname,GXutil.ltrim( localUtil.ntoc( AV71HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavHrenumcie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV71HreNumCie), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV71HreNumCie), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavHrenumcie_Enabled!=0)&&(edtavHrenumcie_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,70);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHrenumcie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavHrenumcie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavHrelinmaq_Enabled!=0)&&(edtavHrelinmaq_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 71,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHrelinmaq_Internalname,GXutil.ltrim( localUtil.ntoc( AV86HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavHrelinmaq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV86HreLinMaq), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV86HreLinMaq), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavHrelinmaq_Enabled!=0)&&(edtavHrelinmaq_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,71);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavHrelinmaq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavHrelinmaq_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavEnccli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavEnccli_Enabled!=0)&&(edtavEnccli_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 72,'"+sPrefix+"',false,'"+sGXsfl_37_idx+"',37)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEnccli_Internalname,GXutil.rtrim( AV87EncCli),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavEnccli_Enabled!=0)&&(edtavEnccli_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,72);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEnccli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavEnccli_Columnclass,edtavEnccli_Columnheaderclass,Integer.valueOf(edtavEnccli_Visible),Integer.valueOf(edtavEnccli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(37),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1FT2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_37_idx = ((subGrid_Islastpage==1)&&(nGXsfl_37_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_37_idx+1) ;
         sGXsfl_37_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_37_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_372( ) ;
      }
      /* End function sendrow_372 */
   }

   public void startgridcontrol37( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"37\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGrid_Backcolorstyle == 0 )
         {
            subGrid_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGrid_Class) > 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Title" ;
            }
         }
         else
         {
            subGrid_Titlebackstyle = (byte)(1) ;
            if ( subGrid_Backcolorstyle == 1 )
            {
               subGrid_Titlebackcolor = subGrid_Allbackcolor ;
               if ( GXutil.len( subGrid_Class) > 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGrid_Class) > 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+cmbavGrupodeacciones.getThemeClass()+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavToa_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHrefectin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Cierre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavMarca_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavBaragrest_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Agr?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHrebarkgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHretotkgm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos Tot", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHremaqcod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHrevolprd_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Volumen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRb_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rb", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostei_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Ini", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostet_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Tot", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDif_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dif", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavPorc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "%") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavCostek_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Kg", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavClicod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavClinom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHrebarser_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHrebardsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHretipartd_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion Tipo Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHrecolnom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHrecolnum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHretipcoln_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion Tc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHreintdsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion Intensidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHredti_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavHredtf_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavEnccli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Disp Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV98GrupodeAcciones, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavGrupodeacciones.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavGrupodeacciones.getColumnHeaderClass()));
         GridColumn.AddObjectProperty("Class", GXutil.rtrim( cmbavGrupodeacciones.getThemeClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV97DetailWebComponent));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDetailwebcomponent_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDetailwebcomponent_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV88TablaA, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTablaa_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV42ToA));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavToa_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavToa_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavToa_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavToa_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(AV59HreFecTin, "99/99/99"));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavHrefectin_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavHrefectin_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHrefectin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHrefectin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV75Marca));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavMarca_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavMarca_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavMarca_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavMarca_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV76Hdr));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavHdr_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavHdr_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV77BarAGrest));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavBaragrest_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavBaragrest_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBaragrest_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBaragrest_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV57HreBarKgm, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavHrebarkgm_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavHrebarkgm_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHrebarkgm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHrebarkgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV58HreTotKgm, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavHretotkgm_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavHretotkgm_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHretotkgm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHretotkgm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV78HreMaqCod));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavHremaqcod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavHremaqcod_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHremaqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHremaqcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV79HreVolPrd, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavHrevolprd_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavHrevolprd_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHrevolprd_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHrevolprd_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV80Rb, (byte)(7), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavRb_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavRb_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRb_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRb_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV81Costei, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCostei_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCostei_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostei_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostei_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV82CosteT, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCostet_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCostet_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostet_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostet_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV83Dif, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavDif_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavDif_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDif_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDif_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV84Porc, (byte)(6), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavPorc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavPorc_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPorc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavPorc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV85CosteK, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavCostek_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavCostek_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCostek_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavCostek_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV11CliCod, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavClicod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavClicod_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavClicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavClicod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV60CliNom));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavClinom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavClinom_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavClinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavClinom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV61HreBarSer));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavHrebarser_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavHrebarser_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHrebarser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHrebarser_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV62HreBarDsc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavHrebardsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavHrebardsc_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHrebardsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHrebardsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV65HreTipArtD));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavHretipartd_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavHretipartd_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHretipartd_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHretipartd_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV63HreColNom));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavHrecolnom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavHrecolnom_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHrecolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHrecolnom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV64HreColNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavHrecolnum_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavHrecolnum_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHrecolnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHrecolnum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV66HreTipColN));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavHretipcoln_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavHretipcoln_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHretipcoln_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHretipcoln_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV67HreIntDsc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavHreintdsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavHreintdsc_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHreintdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHreintdsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( AV73HreDti, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavHredti_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavHredti_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHredti_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHredti_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( AV72HreDtf, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavHredtf_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavHredtf_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHredtf_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavHredtf_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV68HreBarCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHrebarcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV69HreBarPar));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHrebarpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV70HreBarReo, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHrebarreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV71HreNumCie, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHrenumcie_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV86HreLinMaq, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavHrelinmaq_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV87EncCli));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavEnccli_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavEnccli_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEnccli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavEnccli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      cmbavGrupodeacciones.setInternalname( sPrefix+"vGRUPODEACCIONES" );
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT" ;
      edtavTablaa_Internalname = sPrefix+"vTABLAA" ;
      edtavToa_Internalname = sPrefix+"vTOA" ;
      edtavHrefectin_Internalname = sPrefix+"vHREFECTIN" ;
      edtavMarca_Internalname = sPrefix+"vMARCA" ;
      edtavHdr_Internalname = sPrefix+"vHDR" ;
      edtavBaragrest_Internalname = sPrefix+"vBARAGREST" ;
      edtavHrebarkgm_Internalname = sPrefix+"vHREBARKGM" ;
      edtavHretotkgm_Internalname = sPrefix+"vHRETOTKGM" ;
      edtavHremaqcod_Internalname = sPrefix+"vHREMAQCOD" ;
      edtavHrevolprd_Internalname = sPrefix+"vHREVOLPRD" ;
      edtavRb_Internalname = sPrefix+"vRB" ;
      edtavCostei_Internalname = sPrefix+"vCOSTEI" ;
      edtavCostet_Internalname = sPrefix+"vCOSTET" ;
      edtavDif_Internalname = sPrefix+"vDIF" ;
      edtavPorc_Internalname = sPrefix+"vPORC" ;
      edtavCostek_Internalname = sPrefix+"vCOSTEK" ;
      edtavClicod_Internalname = sPrefix+"vCLICOD" ;
      edtavClinom_Internalname = sPrefix+"vCLINOM" ;
      edtavHrebarser_Internalname = sPrefix+"vHREBARSER" ;
      edtavHrebardsc_Internalname = sPrefix+"vHREBARDSC" ;
      edtavHretipartd_Internalname = sPrefix+"vHRETIPARTD" ;
      edtavHrecolnom_Internalname = sPrefix+"vHRECOLNOM" ;
      edtavHrecolnum_Internalname = sPrefix+"vHRECOLNUM" ;
      edtavHretipcoln_Internalname = sPrefix+"vHRETIPCOLN" ;
      edtavHreintdsc_Internalname = sPrefix+"vHREINTDSC" ;
      edtavHredti_Internalname = sPrefix+"vHREDTI" ;
      edtavHredtf_Internalname = sPrefix+"vHREDTF" ;
      edtavHrebarcod_Internalname = sPrefix+"vHREBARCOD" ;
      edtavHrebarpar_Internalname = sPrefix+"vHREBARPAR" ;
      edtavHrebarreo_Internalname = sPrefix+"vHREBARREO" ;
      edtavHrenumcie_Internalname = sPrefix+"vHRENUMCIE" ;
      edtavHrelinmaq_Internalname = sPrefix+"vHRELINMAQ" ;
      edtavEnccli_Internalname = sPrefix+"vENCCLI" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divCell_grid_dwc_Internalname = sPrefix+"CELL_GRID_DWC" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Detailwebcomponent_modal_Internalname = sPrefix+"DETAILWEBCOMPONENT_MODAL" ;
      tblTabledetailwebcomponent_modal_Internalname = sPrefix+"TABLEDETAILWEBCOMPONENT_MODAL" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      divDiv_wwpauxwc_Internalname = sPrefix+"DIV_WWPAUXWC" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subGrid_Internalname = sPrefix+"GRID" ;
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      init_default_properties( ) ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtavEnccli_Jsonclick = "" ;
      edtavEnccli_Enabled = 1 ;
      edtavHrelinmaq_Jsonclick = "" ;
      edtavHrelinmaq_Visible = 0 ;
      edtavHrelinmaq_Enabled = 1 ;
      edtavHrenumcie_Jsonclick = "" ;
      edtavHrenumcie_Visible = 0 ;
      edtavHrenumcie_Enabled = 1 ;
      edtavHrebarreo_Jsonclick = "" ;
      edtavHrebarreo_Visible = 0 ;
      edtavHrebarreo_Enabled = 1 ;
      edtavHrebarpar_Jsonclick = "" ;
      edtavHrebarpar_Visible = 0 ;
      edtavHrebarpar_Enabled = 1 ;
      edtavHrebarcod_Jsonclick = "" ;
      edtavHrebarcod_Visible = 0 ;
      edtavHrebarcod_Enabled = 1 ;
      edtavHredtf_Jsonclick = "" ;
      edtavHredtf_Enabled = 1 ;
      edtavHredti_Jsonclick = "" ;
      edtavHredti_Enabled = 1 ;
      edtavHreintdsc_Jsonclick = "" ;
      edtavHreintdsc_Enabled = 1 ;
      edtavHretipcoln_Jsonclick = "" ;
      edtavHretipcoln_Enabled = 1 ;
      edtavHrecolnum_Jsonclick = "" ;
      edtavHrecolnum_Enabled = 1 ;
      edtavHrecolnom_Jsonclick = "" ;
      edtavHrecolnom_Enabled = 1 ;
      edtavHretipartd_Jsonclick = "" ;
      edtavHretipartd_Enabled = 1 ;
      edtavHrebardsc_Jsonclick = "" ;
      edtavHrebardsc_Enabled = 1 ;
      edtavHrebarser_Jsonclick = "" ;
      edtavHrebarser_Enabled = 1 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 1 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 1 ;
      edtavCostek_Jsonclick = "" ;
      edtavCostek_Enabled = 1 ;
      edtavPorc_Jsonclick = "" ;
      edtavPorc_Enabled = 1 ;
      edtavDif_Jsonclick = "" ;
      edtavDif_Enabled = 1 ;
      edtavCostet_Jsonclick = "" ;
      edtavCostet_Enabled = 1 ;
      edtavCostei_Jsonclick = "" ;
      edtavCostei_Enabled = 1 ;
      edtavRb_Jsonclick = "" ;
      edtavRb_Enabled = 1 ;
      edtavHrevolprd_Jsonclick = "" ;
      edtavHrevolprd_Enabled = 1 ;
      edtavHremaqcod_Jsonclick = "" ;
      edtavHremaqcod_Enabled = 1 ;
      edtavHretotkgm_Jsonclick = "" ;
      edtavHretotkgm_Enabled = 1 ;
      edtavHrebarkgm_Jsonclick = "" ;
      edtavHrebarkgm_Enabled = 1 ;
      edtavBaragrest_Jsonclick = "" ;
      edtavBaragrest_Enabled = 1 ;
      edtavHdr_Jsonclick = "" ;
      edtavHdr_Enabled = 1 ;
      edtavMarca_Jsonclick = "" ;
      edtavMarca_Enabled = 1 ;
      edtavHrefectin_Jsonclick = "" ;
      edtavHrefectin_Enabled = 1 ;
      edtavToa_Jsonclick = "" ;
      edtavToa_Enabled = 1 ;
      edtavTablaa_Jsonclick = "" ;
      edtavTablaa_Visible = 0 ;
      edtavTablaa_Enabled = 1 ;
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      cmbavGrupodeacciones.setJsonclick( "" );
      cmbavGrupodeacciones.setVisible( -1 );
      cmbavGrupodeacciones.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavEnccli_Columnclass = "WWColumn" ;
      edtavHredtf_Columnclass = "WWColumn" ;
      edtavHredti_Columnclass = "WWColumn" ;
      edtavHreintdsc_Columnclass = "WWColumn" ;
      edtavHretipcoln_Columnclass = "WWColumn" ;
      edtavHrecolnum_Columnclass = "WWColumn" ;
      edtavHrecolnom_Columnclass = "WWColumn" ;
      edtavHretipartd_Columnclass = "WWColumn" ;
      edtavHrebardsc_Columnclass = "WWColumn" ;
      edtavHrebarser_Columnclass = "WWColumn" ;
      edtavClinom_Columnclass = "WWColumn" ;
      edtavClicod_Columnclass = "WWColumn" ;
      edtavCostek_Columnclass = "WWColumn" ;
      edtavPorc_Columnclass = "WWColumn" ;
      edtavDif_Columnclass = "WWColumn" ;
      edtavCostet_Columnclass = "WWColumn" ;
      edtavCostei_Columnclass = "WWColumn" ;
      edtavRb_Columnclass = "WWColumn" ;
      edtavHrevolprd_Columnclass = "WWColumn" ;
      edtavHremaqcod_Columnclass = "WWColumn" ;
      edtavHretotkgm_Columnclass = "WWColumn" ;
      edtavHrebarkgm_Columnclass = "WWColumn" ;
      edtavBaragrest_Columnclass = "WWColumn" ;
      edtavHdr_Columnclass = "WWColumn" ;
      edtavMarca_Columnclass = "WWColumn" ;
      edtavHrefectin_Columnclass = "WWColumn" ;
      edtavToa_Columnclass = "WWColumn" ;
      edtavDetailwebcomponent_Columnclass = "WWIconActionColumn WCD_ActionColumn" ;
      cmbavGrupodeacciones.setColumnClass( "WWActionGroupColumn" );
      cmbavGrupodeacciones.setThemeClass( "ConvertToDDO" );
      edtavEnccli_Columnheaderclass = "" ;
      edtavHredtf_Columnheaderclass = "" ;
      edtavHredti_Columnheaderclass = "" ;
      edtavHreintdsc_Columnheaderclass = "" ;
      edtavHretipcoln_Columnheaderclass = "" ;
      edtavHrecolnum_Columnheaderclass = "" ;
      edtavHrecolnom_Columnheaderclass = "" ;
      edtavHretipartd_Columnheaderclass = "" ;
      edtavHrebardsc_Columnheaderclass = "" ;
      edtavHrebarser_Columnheaderclass = "" ;
      edtavClinom_Columnheaderclass = "" ;
      edtavClicod_Columnheaderclass = "" ;
      edtavCostek_Columnheaderclass = "" ;
      edtavPorc_Columnheaderclass = "" ;
      edtavDif_Columnheaderclass = "" ;
      edtavCostet_Columnheaderclass = "" ;
      edtavCostei_Columnheaderclass = "" ;
      edtavRb_Columnheaderclass = "" ;
      edtavHrevolprd_Columnheaderclass = "" ;
      edtavHremaqcod_Columnheaderclass = "" ;
      edtavHretotkgm_Columnheaderclass = "" ;
      edtavHrebarkgm_Columnheaderclass = "" ;
      edtavBaragrest_Columnheaderclass = "" ;
      edtavHdr_Columnheaderclass = "" ;
      edtavMarca_Columnheaderclass = "" ;
      edtavHrefectin_Columnheaderclass = "" ;
      edtavToa_Columnheaderclass = "" ;
      edtavDetailwebcomponent_Columnheaderclass = "" ;
      cmbavGrupodeacciones.setColumnHeaderClass( "" );
      edtavEnccli_Visible = -1 ;
      edtavHredtf_Visible = -1 ;
      edtavHredti_Visible = -1 ;
      edtavHreintdsc_Visible = -1 ;
      edtavHretipcoln_Visible = -1 ;
      edtavHrecolnum_Visible = -1 ;
      edtavHrecolnom_Visible = -1 ;
      edtavHretipartd_Visible = -1 ;
      edtavHrebardsc_Visible = -1 ;
      edtavHrebarser_Visible = -1 ;
      edtavClinom_Visible = -1 ;
      edtavClicod_Visible = -1 ;
      edtavCostek_Visible = -1 ;
      edtavPorc_Visible = -1 ;
      edtavDif_Visible = -1 ;
      edtavCostet_Visible = -1 ;
      edtavCostei_Visible = -1 ;
      edtavRb_Visible = -1 ;
      edtavHrevolprd_Visible = -1 ;
      edtavHremaqcod_Visible = -1 ;
      edtavHretotkgm_Visible = -1 ;
      edtavHrebarkgm_Visible = -1 ;
      edtavBaragrest_Visible = -1 ;
      edtavHdr_Visible = -1 ;
      edtavMarca_Visible = -1 ;
      edtavHrefectin_Visible = -1 ;
      edtavToa_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      divCell_grid_dwc_Class = "col-xs-12" ;
      Grid_empowerer_Fixedcolumns = ";L;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Detailwebcomponent_modal_Bodytype = "WebComponent" ;
      Detailwebcomponent_modal_Confirmtype = "" ;
      Detailwebcomponent_modal_Title = httpContext.getMessage( "Historico de Recetas (Costes y Anyadidas Productos)", "") ;
      Detailwebcomponent_modal_Width = "400" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Columnssortvalues = "||||||||||||||||||||||||||" ;
      Ddo_grid_Columnids = "3:ToA|4:HreFecTin|5:Marca|6:Hdr|7:BarAGrest|8:HreBarKgm|9:HreTotKgm|10:HreMaqCod|11:HreVolPrd|12:Rb|13:Costei|14:CosteT|15:Dif|16:Porc|17:CosteK|18:CliCod|19:CliNom|20:HreBarSer|21:HreBarDsc|22:HreTipArtD|23:HreColNom|24:HreColNum|25:HreTipColN|26:HreIntDsc|27:HreDti|28:HreDtf|34:EncCli" ;
      Ddo_grid_Gridinternalname = "" ;
      Gridpaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridpaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridpaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridpaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridpaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridpaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridpaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridpaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridpaginationbar_Pagingcaptionposition = "Left" ;
      Gridpaginationbar_Pagingbuttonsposition = "Right" ;
      Gridpaginationbar_Pagestoshow = 5 ;
      Gridpaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridpaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridpaginationbar_Class = "PaginationBar" ;
      Dvpanel_tableheader_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Iconposition = "Right" ;
      Dvpanel_tableheader_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Title = httpContext.getMessage( "WWP_FilterOptions", "") ;
      Dvpanel_tableheader_Cls = "PanelNoHeader" ;
      Dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Width = "100%" ;
      Ddo_managefilters_Cls = "ManageFilters" ;
      Ddo_managefilters_Tooltip = "WWP_ManageFiltersTooltip" ;
      Ddo_managefilters_Icon = "fas fa-filter" ;
      Ddo_managefilters_Icontype = "FontIcon" ;
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRUPODEACCIONES_" + sGXsfl_37_idx ;
      cmbavGrupodeacciones.setName( GXCCtl );
      cmbavGrupodeacciones.setWebtags( "" );
      if ( cmbavGrupodeacciones.getItemCount() > 0 )
      {
      }
      /* End function init_web_controls */
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV77BarAGrest',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV88TablaA',fld:'vTABLAA',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4529HreFecTin',fld:'HREFECTIN',pic:''},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A9808HreRacab',fld:'HRERACAB',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A4517HreBarSer',fld:'HREBARSER',pic:''},{av:'A4519HreTipArt',fld:'HRETIPART',pic:'ZZZ9'},{av:'A4521HreColNom',fld:'HRECOLNOM',pic:''},{av:'A4522HreColNum',fld:'HRECOLNUM',pic:'ZZZZZ9'},{av:'A4525HreTipCol',fld:'HRETIPCOL',pic:'Z9'},{av:'A4539HreIntCod',fld:'HREINTCOD',pic:'Z9'},{av:'A4532HreBarKgm',fld:'HREBARKGM',pic:'ZZZZZ9.99'},{av:'A4542HreTotKgm',fld:'HRETOTKGM',pic:'ZZZZZ9.99'},{av:'A13842BarNhdr_Hi',fld:'BARNHDR_HI',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A4518HreBarDsc',fld:'HREBARDSC',pic:''},{av:'A4520HreTipArtD',fld:'HRETIPARTD',pic:''},{av:'A4526HreTipColN',fld:'HRETIPCOLN',pic:''},{av:'A4540HreIntDsc',fld:'HREINTDSC',pic:''},{av:'A10104HreDtf',fld:'HREDTF',pic:'99/99/99 99:99:99'},{av:'A10103HreDti',fld:'HREDTI',pic:'99/99/99 99:99:99'},{av:'A4516HreDisCli',fld:'HREDISCLI',pic:''},{av:'A11318HreDispCli',fld:'HREDISPCLI',pic:''},{av:'A4497HreAgrCod',fld:'HREAGRCOD',pic:'ZZZZZZZ9'},{av:'A9985HreAcCod',fld:'HREACCOD',pic:'ZZZZZZZ9'},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'},{av:'A4547HreVolPrd',fld:'HREVOLPRD',pic:'ZZZZ9'},{av:'A8602HreCosAA',fld:'HRECOSAA',pic:'ZZZZZZ9.99'},{av:'A8603HrecosAd',fld:'HRECOSAD',pic:'ZZZZZZ9.99'},{av:'A8604HreCosAnc',fld:'HRECOSANC',pic:'ZZZZZZ9.99'},{av:'A8605HreCosCol',fld:'HRECOSCOL',pic:'ZZZZZZ9.99'},{av:'A8606HreCosPA',fld:'HRECOSPA',pic:'ZZZZZZ9.99'},{av:'A8607HreCosPD',fld:'HRECOSPD',pic:'ZZZZZZ9.99'},{av:'A4546HreMaqCod',fld:'HREMAQCOD',pic:''},{av:'A4551HreProCod',fld:'HREPROCOD',pic:''},{av:'A4552HreProDsc',fld:'HREPRODSC',pic:''},{av:'A4500HreAgrKgm',fld:'HREAGRKGM',pic:'ZZZZZ9.99'},{av:'A4498HreAgrReo',fld:'HREAGRREO',pic:'9'},{av:'A4499HreAgrPar',fld:'HREAGRPAR',pic:''},{av:'A4503HreAgrCli',fld:'HREAGRCLI',pic:'ZZZZZ9'},{av:'A4504HreAgrSer',fld:'HREAGRSER',pic:''},{av:'A4505HreAgrDsc',fld:'HREAGRDSC',pic:''},{av:'A9988HreAcKgm',fld:'HREACKGM',pic:'ZZZZZ9.99'},{av:'A9986HreAcReo',fld:'HREACREO',pic:'9'},{av:'A9987HreAcPar',fld:'HREACPAR',pic:''},{av:'A9991HreAcCli',fld:'HREACCLI',pic:'ZZZZZ9'},{av:'A9992HreAcSer',fld:'HREACSER',pic:''},{av:'A9993HreAcDsc',fld:'HREACDSC',pic:''},{av:'sPrefix'},{av:'AV50ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV45ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV33Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV91HreRacabinout',fld:'vHRERACABINOUT',pic:''},{av:'AV14Fecha',fld:'vFECHA',pic:''},{av:'AV15Fecha_to',fld:'vFECHA_TO',pic:''},{av:'AV55Calculo',fld:'vCALCULO',pic:'ZZZ9'},{av:'AV8barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV5ArtCod',fld:'vARTCOD',pic:''},{av:'AV6ArtCod_to',fld:'vARTCOD_TO',pic:''},{av:'AV17ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV18ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV20ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV21ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV89Clicodinout',fld:'vCLICODINOUT',pic:'ZZZZZ9'},{av:'AV90Clicodinout_to',fld:'vCLICODINOUT_TO',pic:'ZZZZZ9'},{av:'AV24IntCod',fld:'vINTCOD',pic:'Z9'},{av:'AV25IntCod_to',fld:'vINTCOD_TO',pic:'Z9'},{av:'AV27TipArtCod',fld:'vTIPARTCOD',pic:'ZZZ9'},{av:'AV28TipArtCod_to',fld:'vTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV30TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV31TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV113Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV41FilterFullText',fld:'vFILTERFULLTEXT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV50ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV45ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavToa_Visible',ctrl:'vTOA',prop:'Visible'},{av:'edtavHrefectin_Visible',ctrl:'vHREFECTIN',prop:'Visible'},{av:'edtavMarca_Visible',ctrl:'vMARCA',prop:'Visible'},{av:'edtavHdr_Visible',ctrl:'vHDR',prop:'Visible'},{av:'edtavBaragrest_Visible',ctrl:'vBARAGREST',prop:'Visible'},{av:'edtavHrebarkgm_Visible',ctrl:'vHREBARKGM',prop:'Visible'},{av:'edtavHretotkgm_Visible',ctrl:'vHRETOTKGM',prop:'Visible'},{av:'edtavHremaqcod_Visible',ctrl:'vHREMAQCOD',prop:'Visible'},{av:'edtavHrevolprd_Visible',ctrl:'vHREVOLPRD',prop:'Visible'},{av:'edtavRb_Visible',ctrl:'vRB',prop:'Visible'},{av:'edtavCostei_Visible',ctrl:'vCOSTEI',prop:'Visible'},{av:'edtavCostet_Visible',ctrl:'vCOSTET',prop:'Visible'},{av:'edtavDif_Visible',ctrl:'vDIF',prop:'Visible'},{av:'edtavPorc_Visible',ctrl:'vPORC',prop:'Visible'},{av:'edtavCostek_Visible',ctrl:'vCOSTEK',prop:'Visible'},{av:'edtavClicod_Visible',ctrl:'vCLICOD',prop:'Visible'},{av:'edtavClinom_Visible',ctrl:'vCLINOM',prop:'Visible'},{av:'edtavHrebarser_Visible',ctrl:'vHREBARSER',prop:'Visible'},{av:'edtavHrebardsc_Visible',ctrl:'vHREBARDSC',prop:'Visible'},{av:'edtavHretipartd_Visible',ctrl:'vHRETIPARTD',prop:'Visible'},{av:'edtavHrecolnom_Visible',ctrl:'vHRECOLNOM',prop:'Visible'},{av:'edtavHrecolnum_Visible',ctrl:'vHRECOLNUM',prop:'Visible'},{av:'edtavHretipcoln_Visible',ctrl:'vHRETIPCOLN',prop:'Visible'},{av:'edtavHreintdsc_Visible',ctrl:'vHREINTDSC',prop:'Visible'},{av:'edtavHredti_Visible',ctrl:'vHREDTI',prop:'Visible'},{av:'edtavHredtf_Visible',ctrl:'vHREDTF',prop:'Visible'},{av:'edtavEnccli_Visible',ctrl:'vENCCLI',prop:'Visible'},{av:'AV53GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'cmbavGrupodeacciones'},{av:'edtavDetailwebcomponent_Columnheaderclass',ctrl:'vDETAILWEBCOMPONENT',prop:'Columnheaderclass'},{av:'edtavToa_Columnheaderclass',ctrl:'vTOA',prop:'Columnheaderclass'},{av:'edtavHrefectin_Columnheaderclass',ctrl:'vHREFECTIN',prop:'Columnheaderclass'},{av:'edtavMarca_Columnheaderclass',ctrl:'vMARCA',prop:'Columnheaderclass'},{av:'edtavHdr_Columnheaderclass',ctrl:'vHDR',prop:'Columnheaderclass'},{av:'edtavBaragrest_Columnheaderclass',ctrl:'vBARAGREST',prop:'Columnheaderclass'},{av:'edtavHrebarkgm_Columnheaderclass',ctrl:'vHREBARKGM',prop:'Columnheaderclass'},{av:'edtavHretotkgm_Columnheaderclass',ctrl:'vHRETOTKGM',prop:'Columnheaderclass'},{av:'edtavHremaqcod_Columnheaderclass',ctrl:'vHREMAQCOD',prop:'Columnheaderclass'},{av:'edtavHrevolprd_Columnheaderclass',ctrl:'vHREVOLPRD',prop:'Columnheaderclass'},{av:'edtavRb_Columnheaderclass',ctrl:'vRB',prop:'Columnheaderclass'},{av:'edtavCostei_Columnheaderclass',ctrl:'vCOSTEI',prop:'Columnheaderclass'},{av:'edtavCostet_Columnheaderclass',ctrl:'vCOSTET',prop:'Columnheaderclass'},{av:'edtavDif_Columnheaderclass',ctrl:'vDIF',prop:'Columnheaderclass'},{av:'edtavPorc_Columnheaderclass',ctrl:'vPORC',prop:'Columnheaderclass'},{av:'edtavCostek_Columnheaderclass',ctrl:'vCOSTEK',prop:'Columnheaderclass'},{av:'edtavClicod_Columnheaderclass',ctrl:'vCLICOD',prop:'Columnheaderclass'},{av:'edtavClinom_Columnheaderclass',ctrl:'vCLINOM',prop:'Columnheaderclass'},{av:'edtavHrebarser_Columnheaderclass',ctrl:'vHREBARSER',prop:'Columnheaderclass'},{av:'edtavHrebardsc_Columnheaderclass',ctrl:'vHREBARDSC',prop:'Columnheaderclass'},{av:'edtavHretipartd_Columnheaderclass',ctrl:'vHRETIPARTD',prop:'Columnheaderclass'},{av:'edtavHrecolnom_Columnheaderclass',ctrl:'vHRECOLNOM',prop:'Columnheaderclass'},{av:'edtavHrecolnum_Columnheaderclass',ctrl:'vHRECOLNUM',prop:'Columnheaderclass'},{av:'edtavHretipcoln_Columnheaderclass',ctrl:'vHRETIPCOLN',prop:'Columnheaderclass'},{av:'edtavHreintdsc_Columnheaderclass',ctrl:'vHREINTDSC',prop:'Columnheaderclass'},{av:'edtavHredti_Columnheaderclass',ctrl:'vHREDTI',prop:'Columnheaderclass'},{av:'edtavHredtf_Columnheaderclass',ctrl:'vHREDTF',prop:'Columnheaderclass'},{av:'edtavEnccli_Columnheaderclass',ctrl:'vENCCLI',prop:'Columnheaderclass'},{av:'AV54GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV48ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV39GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121FT2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV50ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV45ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV33Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV91HreRacabinout',fld:'vHRERACABINOUT',pic:''},{av:'AV14Fecha',fld:'vFECHA',pic:''},{av:'AV15Fecha_to',fld:'vFECHA_TO',pic:''},{av:'AV55Calculo',fld:'vCALCULO',pic:'ZZZ9'},{av:'AV8barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV5ArtCod',fld:'vARTCOD',pic:''},{av:'AV6ArtCod_to',fld:'vARTCOD_TO',pic:''},{av:'AV17ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV18ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV20ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV21ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV89Clicodinout',fld:'vCLICODINOUT',pic:'ZZZZZ9'},{av:'AV90Clicodinout_to',fld:'vCLICODINOUT_TO',pic:'ZZZZZ9'},{av:'AV24IntCod',fld:'vINTCOD',pic:'Z9'},{av:'AV25IntCod_to',fld:'vINTCOD_TO',pic:'Z9'},{av:'AV27TipArtCod',fld:'vTIPARTCOD',pic:'ZZZ9'},{av:'AV28TipArtCod_to',fld:'vTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV30TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV31TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV113Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV41FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV77BarAGrest',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV88TablaA',fld:'vTABLAA',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4529HreFecTin',fld:'HREFECTIN',pic:''},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A9808HreRacab',fld:'HRERACAB',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A4517HreBarSer',fld:'HREBARSER',pic:''},{av:'A4519HreTipArt',fld:'HRETIPART',pic:'ZZZ9'},{av:'A4521HreColNom',fld:'HRECOLNOM',pic:''},{av:'A4522HreColNum',fld:'HRECOLNUM',pic:'ZZZZZ9'},{av:'A4525HreTipCol',fld:'HRETIPCOL',pic:'Z9'},{av:'A4539HreIntCod',fld:'HREINTCOD',pic:'Z9'},{av:'A4532HreBarKgm',fld:'HREBARKGM',pic:'ZZZZZ9.99'},{av:'A4542HreTotKgm',fld:'HRETOTKGM',pic:'ZZZZZ9.99'},{av:'A13842BarNhdr_Hi',fld:'BARNHDR_HI',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A4518HreBarDsc',fld:'HREBARDSC',pic:''},{av:'A4520HreTipArtD',fld:'HRETIPARTD',pic:''},{av:'A4526HreTipColN',fld:'HRETIPCOLN',pic:''},{av:'A4540HreIntDsc',fld:'HREINTDSC',pic:''},{av:'A10104HreDtf',fld:'HREDTF',pic:'99/99/99 99:99:99'},{av:'A10103HreDti',fld:'HREDTI',pic:'99/99/99 99:99:99'},{av:'A4516HreDisCli',fld:'HREDISCLI',pic:''},{av:'A11318HreDispCli',fld:'HREDISPCLI',pic:''},{av:'A4497HreAgrCod',fld:'HREAGRCOD',pic:'ZZZZZZZ9'},{av:'A9985HreAcCod',fld:'HREACCOD',pic:'ZZZZZZZ9'},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'},{av:'A4547HreVolPrd',fld:'HREVOLPRD',pic:'ZZZZ9'},{av:'A8602HreCosAA',fld:'HRECOSAA',pic:'ZZZZZZ9.99'},{av:'A8603HrecosAd',fld:'HRECOSAD',pic:'ZZZZZZ9.99'},{av:'A8604HreCosAnc',fld:'HRECOSANC',pic:'ZZZZZZ9.99'},{av:'A8605HreCosCol',fld:'HRECOSCOL',pic:'ZZZZZZ9.99'},{av:'A8606HreCosPA',fld:'HRECOSPA',pic:'ZZZZZZ9.99'},{av:'A8607HreCosPD',fld:'HRECOSPD',pic:'ZZZZZZ9.99'},{av:'A4546HreMaqCod',fld:'HREMAQCOD',pic:''},{av:'A4551HreProCod',fld:'HREPROCOD',pic:''},{av:'A4552HreProDsc',fld:'HREPRODSC',pic:''},{av:'A4500HreAgrKgm',fld:'HREAGRKGM',pic:'ZZZZZ9.99'},{av:'A4498HreAgrReo',fld:'HREAGRREO',pic:'9'},{av:'A4499HreAgrPar',fld:'HREAGRPAR',pic:''},{av:'A4503HreAgrCli',fld:'HREAGRCLI',pic:'ZZZZZ9'},{av:'A4504HreAgrSer',fld:'HREAGRSER',pic:''},{av:'A4505HreAgrDsc',fld:'HREAGRDSC',pic:''},{av:'A9988HreAcKgm',fld:'HREACKGM',pic:'ZZZZZ9.99'},{av:'A9986HreAcReo',fld:'HREACREO',pic:'9'},{av:'A9987HreAcPar',fld:'HREACPAR',pic:''},{av:'A9991HreAcCli',fld:'HREACCLI',pic:'ZZZZZ9'},{av:'A9992HreAcSer',fld:'HREACSER',pic:''},{av:'A9993HreAcDsc',fld:'HREACDSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131FT2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV50ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV45ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV33Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV91HreRacabinout',fld:'vHRERACABINOUT',pic:''},{av:'AV14Fecha',fld:'vFECHA',pic:''},{av:'AV15Fecha_to',fld:'vFECHA_TO',pic:''},{av:'AV55Calculo',fld:'vCALCULO',pic:'ZZZ9'},{av:'AV8barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV5ArtCod',fld:'vARTCOD',pic:''},{av:'AV6ArtCod_to',fld:'vARTCOD_TO',pic:''},{av:'AV17ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV18ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV20ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV21ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV89Clicodinout',fld:'vCLICODINOUT',pic:'ZZZZZ9'},{av:'AV90Clicodinout_to',fld:'vCLICODINOUT_TO',pic:'ZZZZZ9'},{av:'AV24IntCod',fld:'vINTCOD',pic:'Z9'},{av:'AV25IntCod_to',fld:'vINTCOD_TO',pic:'Z9'},{av:'AV27TipArtCod',fld:'vTIPARTCOD',pic:'ZZZ9'},{av:'AV28TipArtCod_to',fld:'vTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV30TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV31TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV113Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV41FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV77BarAGrest',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV88TablaA',fld:'vTABLAA',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4529HreFecTin',fld:'HREFECTIN',pic:''},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A9808HreRacab',fld:'HRERACAB',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A4517HreBarSer',fld:'HREBARSER',pic:''},{av:'A4519HreTipArt',fld:'HRETIPART',pic:'ZZZ9'},{av:'A4521HreColNom',fld:'HRECOLNOM',pic:''},{av:'A4522HreColNum',fld:'HRECOLNUM',pic:'ZZZZZ9'},{av:'A4525HreTipCol',fld:'HRETIPCOL',pic:'Z9'},{av:'A4539HreIntCod',fld:'HREINTCOD',pic:'Z9'},{av:'A4532HreBarKgm',fld:'HREBARKGM',pic:'ZZZZZ9.99'},{av:'A4542HreTotKgm',fld:'HRETOTKGM',pic:'ZZZZZ9.99'},{av:'A13842BarNhdr_Hi',fld:'BARNHDR_HI',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A4518HreBarDsc',fld:'HREBARDSC',pic:''},{av:'A4520HreTipArtD',fld:'HRETIPARTD',pic:''},{av:'A4526HreTipColN',fld:'HRETIPCOLN',pic:''},{av:'A4540HreIntDsc',fld:'HREINTDSC',pic:''},{av:'A10104HreDtf',fld:'HREDTF',pic:'99/99/99 99:99:99'},{av:'A10103HreDti',fld:'HREDTI',pic:'99/99/99 99:99:99'},{av:'A4516HreDisCli',fld:'HREDISCLI',pic:''},{av:'A11318HreDispCli',fld:'HREDISPCLI',pic:''},{av:'A4497HreAgrCod',fld:'HREAGRCOD',pic:'ZZZZZZZ9'},{av:'A9985HreAcCod',fld:'HREACCOD',pic:'ZZZZZZZ9'},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'},{av:'A4547HreVolPrd',fld:'HREVOLPRD',pic:'ZZZZ9'},{av:'A8602HreCosAA',fld:'HRECOSAA',pic:'ZZZZZZ9.99'},{av:'A8603HrecosAd',fld:'HRECOSAD',pic:'ZZZZZZ9.99'},{av:'A8604HreCosAnc',fld:'HRECOSANC',pic:'ZZZZZZ9.99'},{av:'A8605HreCosCol',fld:'HRECOSCOL',pic:'ZZZZZZ9.99'},{av:'A8606HreCosPA',fld:'HRECOSPA',pic:'ZZZZZZ9.99'},{av:'A8607HreCosPD',fld:'HRECOSPD',pic:'ZZZZZZ9.99'},{av:'A4546HreMaqCod',fld:'HREMAQCOD',pic:''},{av:'A4551HreProCod',fld:'HREPROCOD',pic:''},{av:'A4552HreProDsc',fld:'HREPRODSC',pic:''},{av:'A4500HreAgrKgm',fld:'HREAGRKGM',pic:'ZZZZZ9.99'},{av:'A4498HreAgrReo',fld:'HREAGRREO',pic:'9'},{av:'A4499HreAgrPar',fld:'HREAGRPAR',pic:''},{av:'A4503HreAgrCli',fld:'HREAGRCLI',pic:'ZZZZZ9'},{av:'A4504HreAgrSer',fld:'HREAGRSER',pic:''},{av:'A4505HreAgrDsc',fld:'HREAGRDSC',pic:''},{av:'A9988HreAcKgm',fld:'HREACKGM',pic:'ZZZZZ9.99'},{av:'A9986HreAcReo',fld:'HREACREO',pic:'9'},{av:'A9987HreAcPar',fld:'HREACPAR',pic:''},{av:'A9991HreAcCli',fld:'HREACCLI',pic:'ZZZZZ9'},{av:'A9992HreAcSer',fld:'HREACSER',pic:''},{av:'A9993HreAcDsc',fld:'HREACDSC',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e181FT2',iparms:[{av:'AV77BarAGrest',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV88TablaA',fld:'vTABLAA',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4529HreFecTin',fld:'HREFECTIN',pic:''},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'AV33Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV14Fecha',fld:'vFECHA',pic:''},{av:'AV15Fecha_to',fld:'vFECHA_TO',pic:''},{av:'A9808HreRacab',fld:'HRERACAB',pic:''},{av:'AV91HreRacabinout',fld:'vHRERACABINOUT',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV89Clicodinout',fld:'vCLICODINOUT',pic:'ZZZZZ9'},{av:'AV90Clicodinout_to',fld:'vCLICODINOUT_TO',pic:'ZZZZZ9'},{av:'A4517HreBarSer',fld:'HREBARSER',pic:''},{av:'AV5ArtCod',fld:'vARTCOD',pic:''},{av:'AV6ArtCod_to',fld:'vARTCOD_TO',pic:''},{av:'A4519HreTipArt',fld:'HRETIPART',pic:'ZZZ9'},{av:'AV27TipArtCod',fld:'vTIPARTCOD',pic:'ZZZ9'},{av:'AV28TipArtCod_to',fld:'vTIPARTCOD_TO',pic:'ZZZ9'},{av:'A4521HreColNom',fld:'HRECOLNOM',pic:''},{av:'AV17ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV18ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'A4522HreColNum',fld:'HRECOLNUM',pic:'ZZZZZ9'},{av:'AV20ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV21ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'A4525HreTipCol',fld:'HRETIPCOL',pic:'Z9'},{av:'AV30TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV31TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'A4539HreIntCod',fld:'HREINTCOD',pic:'Z9'},{av:'AV24IntCod',fld:'vINTCOD',pic:'Z9'},{av:'AV25IntCod_to',fld:'vINTCOD_TO',pic:'Z9'},{av:'AV8barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9barcodpar',fld:'vBARCODPAR',pic:''},{av:'A4532HreBarKgm',fld:'HREBARKGM',pic:'ZZZZZ9.99'},{av:'A4542HreTotKgm',fld:'HRETOTKGM',pic:'ZZZZZ9.99'},{av:'A13842BarNhdr_Hi',fld:'BARNHDR_HI',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A4518HreBarDsc',fld:'HREBARDSC',pic:''},{av:'A4520HreTipArtD',fld:'HRETIPARTD',pic:''},{av:'A4526HreTipColN',fld:'HRETIPCOLN',pic:''},{av:'A4540HreIntDsc',fld:'HREINTDSC',pic:''},{av:'A10104HreDtf',fld:'HREDTF',pic:'99/99/99 99:99:99'},{av:'A10103HreDti',fld:'HREDTI',pic:'99/99/99 99:99:99'},{av:'A4516HreDisCli',fld:'HREDISCLI',pic:''},{av:'A11318HreDispCli',fld:'HREDISPCLI',pic:''},{av:'A4497HreAgrCod',fld:'HREAGRCOD',pic:'ZZZZZZZ9'},{av:'A9985HreAcCod',fld:'HREACCOD',pic:'ZZZZZZZ9'},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'},{av:'A4547HreVolPrd',fld:'HREVOLPRD',pic:'ZZZZ9'},{av:'A8602HreCosAA',fld:'HRECOSAA',pic:'ZZZZZZ9.99'},{av:'A8603HrecosAd',fld:'HRECOSAD',pic:'ZZZZZZ9.99'},{av:'A8604HreCosAnc',fld:'HRECOSANC',pic:'ZZZZZZ9.99'},{av:'A8605HreCosCol',fld:'HRECOSCOL',pic:'ZZZZZZ9.99'},{av:'A8606HreCosPA',fld:'HRECOSPA',pic:'ZZZZZZ9.99'},{av:'A8607HreCosPD',fld:'HRECOSPD',pic:'ZZZZZZ9.99'},{av:'A4546HreMaqCod',fld:'HREMAQCOD',pic:''},{av:'A4551HreProCod',fld:'HREPROCOD',pic:''},{av:'A4552HreProDsc',fld:'HREPRODSC',pic:''},{av:'A4500HreAgrKgm',fld:'HREAGRKGM',pic:'ZZZZZ9.99'},{av:'A4498HreAgrReo',fld:'HREAGRREO',pic:'9'},{av:'A4499HreAgrPar',fld:'HREAGRPAR',pic:''},{av:'A4503HreAgrCli',fld:'HREAGRCLI',pic:'ZZZZZ9'},{av:'A4504HreAgrSer',fld:'HREAGRSER',pic:''},{av:'A4505HreAgrDsc',fld:'HREAGRDSC',pic:''},{av:'A9988HreAcKgm',fld:'HREACKGM',pic:'ZZZZZ9.99'},{av:'A9986HreAcReo',fld:'HREACREO',pic:'9'},{av:'A9987HreAcPar',fld:'HREACPAR',pic:''},{av:'A9991HreAcCli',fld:'HREACCLI',pic:'ZZZZZ9'},{av:'A9992HreAcSer',fld:'HREACSER',pic:''},{av:'A9993HreAcDsc',fld:'HREACDSC',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV98GrupodeAcciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'AV97DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{av:'edtavDetailwebcomponent_Columnclass',ctrl:'vDETAILWEBCOMPONENT',prop:'Columnclass'},{av:'edtavToa_Columnclass',ctrl:'vTOA',prop:'Columnclass'},{av:'edtavHrefectin_Columnclass',ctrl:'vHREFECTIN',prop:'Columnclass'},{av:'edtavMarca_Columnclass',ctrl:'vMARCA',prop:'Columnclass'},{av:'edtavHdr_Columnclass',ctrl:'vHDR',prop:'Columnclass'},{av:'edtavBaragrest_Columnclass',ctrl:'vBARAGREST',prop:'Columnclass'},{av:'edtavHrebarkgm_Columnclass',ctrl:'vHREBARKGM',prop:'Columnclass'},{av:'edtavHretotkgm_Columnclass',ctrl:'vHRETOTKGM',prop:'Columnclass'},{av:'edtavHremaqcod_Columnclass',ctrl:'vHREMAQCOD',prop:'Columnclass'},{av:'edtavHrevolprd_Columnclass',ctrl:'vHREVOLPRD',prop:'Columnclass'},{av:'edtavRb_Columnclass',ctrl:'vRB',prop:'Columnclass'},{av:'edtavCostei_Columnclass',ctrl:'vCOSTEI',prop:'Columnclass'},{av:'edtavCostet_Columnclass',ctrl:'vCOSTET',prop:'Columnclass'},{av:'edtavDif_Columnclass',ctrl:'vDIF',prop:'Columnclass'},{av:'edtavPorc_Columnclass',ctrl:'vPORC',prop:'Columnclass'},{av:'edtavCostek_Columnclass',ctrl:'vCOSTEK',prop:'Columnclass'},{av:'edtavClicod_Columnclass',ctrl:'vCLICOD',prop:'Columnclass'},{av:'edtavClinom_Columnclass',ctrl:'vCLINOM',prop:'Columnclass'},{av:'edtavHrebarser_Columnclass',ctrl:'vHREBARSER',prop:'Columnclass'},{av:'edtavHrebardsc_Columnclass',ctrl:'vHREBARDSC',prop:'Columnclass'},{av:'edtavHretipartd_Columnclass',ctrl:'vHRETIPARTD',prop:'Columnclass'},{av:'edtavHrecolnom_Columnclass',ctrl:'vHRECOLNOM',prop:'Columnclass'},{av:'edtavHrecolnum_Columnclass',ctrl:'vHRECOLNUM',prop:'Columnclass'},{av:'edtavHretipcoln_Columnclass',ctrl:'vHRETIPCOLN',prop:'Columnclass'},{av:'edtavHreintdsc_Columnclass',ctrl:'vHREINTDSC',prop:'Columnclass'},{av:'edtavHredti_Columnclass',ctrl:'vHREDTI',prop:'Columnclass'},{av:'edtavHredtf_Columnclass',ctrl:'vHREDTF',prop:'Columnclass'},{av:'edtavEnccli_Columnclass',ctrl:'vENCCLI',prop:'Columnclass'},{av:'AV57HreBarKgm',fld:'vHREBARKGM',pic:'ZZZZZ9.99'},{av:'AV58HreTotKgm',fld:'vHRETOTKGM',pic:'ZZZZZ9.99'},{av:'AV59HreFecTin',fld:'vHREFECTIN',pic:''},{av:'AV76Hdr',fld:'vHDR',pic:''},{av:'AV11CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV60CliNom',fld:'vCLINOM',pic:''},{av:'AV61HreBarSer',fld:'vHREBARSER',pic:''},{av:'AV62HreBarDsc',fld:'vHREBARDSC',pic:''},{av:'AV63HreColNom',fld:'vHRECOLNOM',pic:''},{av:'AV64HreColNum',fld:'vHRECOLNUM',pic:'ZZZZZ9'},{av:'AV65HreTipArtD',fld:'vHRETIPARTD',pic:''},{av:'AV66HreTipColN',fld:'vHRETIPCOLN',pic:''},{av:'AV67HreIntDsc',fld:'vHREINTDSC',pic:''},{av:'AV68HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV69HreBarPar',fld:'vHREBARPAR',pic:'',hsh:true},{av:'AV70HreBarReo',fld:'vHREBARREO',pic:'9',hsh:true},{av:'AV71HreNumCie',fld:'vHRENUMCIE',pic:'Z9',hsh:true},{av:'AV72HreDtf',fld:'vHREDTF',pic:'99/99/99 99:99:99'},{av:'AV73HreDti',fld:'vHREDTI',pic:'99/99/99 99:99:99'},{av:'AV87EncCli',fld:'vENCCLI',pic:''},{av:'AV88TablaA',fld:'vTABLAA',pic:'9',hsh:true},{av:'AV75Marca',fld:'vMARCA',pic:''},{av:'AV42ToA',fld:'vTOA',pic:'',hsh:true},{av:'AV77BarAGrest',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV86HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9',hsh:true},{av:'AV80Rb',fld:'vRB',pic:'ZZZ9.99'},{av:'AV79HreVolPrd',fld:'vHREVOLPRD',pic:'ZZZZ9'},{av:'AV82CosteT',fld:'vCOSTET',pic:'ZZZZZZ9.99'},{av:'AV81Costei',fld:'vCOSTEI',pic:'ZZZZZZ9.99'},{av:'AV83Dif',fld:'vDIF',pic:'ZZZZZZ9.99'},{av:'AV84Porc',fld:'vPORC',pic:'ZZ9.99'},{av:'AV85CosteK',fld:'vCOSTEK',pic:'ZZZZZZ9.99'},{av:'AV78HreMaqCod',fld:'vHREMAQCOD',pic:''},{av:'AV14Fecha',fld:'vFECHA',pic:''},{av:'A4499HreAgrPar',fld:'HREAGRPAR',pic:''},{av:'A4498HreAgrReo',fld:'HREAGRREO',pic:'9'},{av:'A4497HreAgrCod',fld:'HREAGRCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9987HreAcPar',fld:'HREACPAR',pic:''},{av:'A9986HreAcReo',fld:'HREACREO',pic:'9'},{av:'A9985HreAcCod',fld:'HREACCOD',pic:'ZZZZZZZ9'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e141FT2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV50ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV45ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV33Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV91HreRacabinout',fld:'vHRERACABINOUT',pic:''},{av:'AV14Fecha',fld:'vFECHA',pic:''},{av:'AV15Fecha_to',fld:'vFECHA_TO',pic:''},{av:'AV55Calculo',fld:'vCALCULO',pic:'ZZZ9'},{av:'AV8barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV5ArtCod',fld:'vARTCOD',pic:''},{av:'AV6ArtCod_to',fld:'vARTCOD_TO',pic:''},{av:'AV17ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV18ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV20ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV21ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV89Clicodinout',fld:'vCLICODINOUT',pic:'ZZZZZ9'},{av:'AV90Clicodinout_to',fld:'vCLICODINOUT_TO',pic:'ZZZZZ9'},{av:'AV24IntCod',fld:'vINTCOD',pic:'Z9'},{av:'AV25IntCod_to',fld:'vINTCOD_TO',pic:'Z9'},{av:'AV27TipArtCod',fld:'vTIPARTCOD',pic:'ZZZ9'},{av:'AV28TipArtCod_to',fld:'vTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV30TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV31TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV113Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV41FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV77BarAGrest',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV88TablaA',fld:'vTABLAA',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4529HreFecTin',fld:'HREFECTIN',pic:''},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A9808HreRacab',fld:'HRERACAB',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A4517HreBarSer',fld:'HREBARSER',pic:''},{av:'A4519HreTipArt',fld:'HRETIPART',pic:'ZZZ9'},{av:'A4521HreColNom',fld:'HRECOLNOM',pic:''},{av:'A4522HreColNum',fld:'HRECOLNUM',pic:'ZZZZZ9'},{av:'A4525HreTipCol',fld:'HRETIPCOL',pic:'Z9'},{av:'A4539HreIntCod',fld:'HREINTCOD',pic:'Z9'},{av:'A4532HreBarKgm',fld:'HREBARKGM',pic:'ZZZZZ9.99'},{av:'A4542HreTotKgm',fld:'HRETOTKGM',pic:'ZZZZZ9.99'},{av:'A13842BarNhdr_Hi',fld:'BARNHDR_HI',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A4518HreBarDsc',fld:'HREBARDSC',pic:''},{av:'A4520HreTipArtD',fld:'HRETIPARTD',pic:''},{av:'A4526HreTipColN',fld:'HRETIPCOLN',pic:''},{av:'A4540HreIntDsc',fld:'HREINTDSC',pic:''},{av:'A10104HreDtf',fld:'HREDTF',pic:'99/99/99 99:99:99'},{av:'A10103HreDti',fld:'HREDTI',pic:'99/99/99 99:99:99'},{av:'A4516HreDisCli',fld:'HREDISCLI',pic:''},{av:'A11318HreDispCli',fld:'HREDISPCLI',pic:''},{av:'A4497HreAgrCod',fld:'HREAGRCOD',pic:'ZZZZZZZ9'},{av:'A9985HreAcCod',fld:'HREACCOD',pic:'ZZZZZZZ9'},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'},{av:'A4547HreVolPrd',fld:'HREVOLPRD',pic:'ZZZZ9'},{av:'A8602HreCosAA',fld:'HRECOSAA',pic:'ZZZZZZ9.99'},{av:'A8603HrecosAd',fld:'HRECOSAD',pic:'ZZZZZZ9.99'},{av:'A8604HreCosAnc',fld:'HRECOSANC',pic:'ZZZZZZ9.99'},{av:'A8605HreCosCol',fld:'HRECOSCOL',pic:'ZZZZZZ9.99'},{av:'A8606HreCosPA',fld:'HRECOSPA',pic:'ZZZZZZ9.99'},{av:'A8607HreCosPD',fld:'HRECOSPD',pic:'ZZZZZZ9.99'},{av:'A4546HreMaqCod',fld:'HREMAQCOD',pic:''},{av:'A4551HreProCod',fld:'HREPROCOD',pic:''},{av:'A4552HreProDsc',fld:'HREPRODSC',pic:''},{av:'A4500HreAgrKgm',fld:'HREAGRKGM',pic:'ZZZZZ9.99'},{av:'A4498HreAgrReo',fld:'HREAGRREO',pic:'9'},{av:'A4499HreAgrPar',fld:'HREAGRPAR',pic:''},{av:'A4503HreAgrCli',fld:'HREAGRCLI',pic:'ZZZZZ9'},{av:'A4504HreAgrSer',fld:'HREAGRSER',pic:''},{av:'A4505HreAgrDsc',fld:'HREAGRDSC',pic:''},{av:'A9988HreAcKgm',fld:'HREACKGM',pic:'ZZZZZ9.99'},{av:'A9986HreAcReo',fld:'HREACREO',pic:'9'},{av:'A9987HreAcPar',fld:'HREACPAR',pic:''},{av:'A9991HreAcCli',fld:'HREACCLI',pic:'ZZZZZ9'},{av:'A9992HreAcSer',fld:'HREACSER',pic:''},{av:'A9993HreAcDsc',fld:'HREACDSC',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV45ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV50ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtavToa_Visible',ctrl:'vTOA',prop:'Visible'},{av:'edtavHrefectin_Visible',ctrl:'vHREFECTIN',prop:'Visible'},{av:'edtavMarca_Visible',ctrl:'vMARCA',prop:'Visible'},{av:'edtavHdr_Visible',ctrl:'vHDR',prop:'Visible'},{av:'edtavBaragrest_Visible',ctrl:'vBARAGREST',prop:'Visible'},{av:'edtavHrebarkgm_Visible',ctrl:'vHREBARKGM',prop:'Visible'},{av:'edtavHretotkgm_Visible',ctrl:'vHRETOTKGM',prop:'Visible'},{av:'edtavHremaqcod_Visible',ctrl:'vHREMAQCOD',prop:'Visible'},{av:'edtavHrevolprd_Visible',ctrl:'vHREVOLPRD',prop:'Visible'},{av:'edtavRb_Visible',ctrl:'vRB',prop:'Visible'},{av:'edtavCostei_Visible',ctrl:'vCOSTEI',prop:'Visible'},{av:'edtavCostet_Visible',ctrl:'vCOSTET',prop:'Visible'},{av:'edtavDif_Visible',ctrl:'vDIF',prop:'Visible'},{av:'edtavPorc_Visible',ctrl:'vPORC',prop:'Visible'},{av:'edtavCostek_Visible',ctrl:'vCOSTEK',prop:'Visible'},{av:'edtavClicod_Visible',ctrl:'vCLICOD',prop:'Visible'},{av:'edtavClinom_Visible',ctrl:'vCLINOM',prop:'Visible'},{av:'edtavHrebarser_Visible',ctrl:'vHREBARSER',prop:'Visible'},{av:'edtavHrebardsc_Visible',ctrl:'vHREBARDSC',prop:'Visible'},{av:'edtavHretipartd_Visible',ctrl:'vHRETIPARTD',prop:'Visible'},{av:'edtavHrecolnom_Visible',ctrl:'vHRECOLNOM',prop:'Visible'},{av:'edtavHrecolnum_Visible',ctrl:'vHRECOLNUM',prop:'Visible'},{av:'edtavHretipcoln_Visible',ctrl:'vHRETIPCOLN',prop:'Visible'},{av:'edtavHreintdsc_Visible',ctrl:'vHREINTDSC',prop:'Visible'},{av:'edtavHredti_Visible',ctrl:'vHREDTI',prop:'Visible'},{av:'edtavHredtf_Visible',ctrl:'vHREDTF',prop:'Visible'},{av:'edtavEnccli_Visible',ctrl:'vENCCLI',prop:'Visible'},{av:'AV53GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'cmbavGrupodeacciones'},{av:'edtavDetailwebcomponent_Columnheaderclass',ctrl:'vDETAILWEBCOMPONENT',prop:'Columnheaderclass'},{av:'edtavToa_Columnheaderclass',ctrl:'vTOA',prop:'Columnheaderclass'},{av:'edtavHrefectin_Columnheaderclass',ctrl:'vHREFECTIN',prop:'Columnheaderclass'},{av:'edtavMarca_Columnheaderclass',ctrl:'vMARCA',prop:'Columnheaderclass'},{av:'edtavHdr_Columnheaderclass',ctrl:'vHDR',prop:'Columnheaderclass'},{av:'edtavBaragrest_Columnheaderclass',ctrl:'vBARAGREST',prop:'Columnheaderclass'},{av:'edtavHrebarkgm_Columnheaderclass',ctrl:'vHREBARKGM',prop:'Columnheaderclass'},{av:'edtavHretotkgm_Columnheaderclass',ctrl:'vHRETOTKGM',prop:'Columnheaderclass'},{av:'edtavHremaqcod_Columnheaderclass',ctrl:'vHREMAQCOD',prop:'Columnheaderclass'},{av:'edtavHrevolprd_Columnheaderclass',ctrl:'vHREVOLPRD',prop:'Columnheaderclass'},{av:'edtavRb_Columnheaderclass',ctrl:'vRB',prop:'Columnheaderclass'},{av:'edtavCostei_Columnheaderclass',ctrl:'vCOSTEI',prop:'Columnheaderclass'},{av:'edtavCostet_Columnheaderclass',ctrl:'vCOSTET',prop:'Columnheaderclass'},{av:'edtavDif_Columnheaderclass',ctrl:'vDIF',prop:'Columnheaderclass'},{av:'edtavPorc_Columnheaderclass',ctrl:'vPORC',prop:'Columnheaderclass'},{av:'edtavCostek_Columnheaderclass',ctrl:'vCOSTEK',prop:'Columnheaderclass'},{av:'edtavClicod_Columnheaderclass',ctrl:'vCLICOD',prop:'Columnheaderclass'},{av:'edtavClinom_Columnheaderclass',ctrl:'vCLINOM',prop:'Columnheaderclass'},{av:'edtavHrebarser_Columnheaderclass',ctrl:'vHREBARSER',prop:'Columnheaderclass'},{av:'edtavHrebardsc_Columnheaderclass',ctrl:'vHREBARDSC',prop:'Columnheaderclass'},{av:'edtavHretipartd_Columnheaderclass',ctrl:'vHRETIPARTD',prop:'Columnheaderclass'},{av:'edtavHrecolnom_Columnheaderclass',ctrl:'vHRECOLNOM',prop:'Columnheaderclass'},{av:'edtavHrecolnum_Columnheaderclass',ctrl:'vHRECOLNUM',prop:'Columnheaderclass'},{av:'edtavHretipcoln_Columnheaderclass',ctrl:'vHRETIPCOLN',prop:'Columnheaderclass'},{av:'edtavHreintdsc_Columnheaderclass',ctrl:'vHREINTDSC',prop:'Columnheaderclass'},{av:'edtavHredti_Columnheaderclass',ctrl:'vHREDTI',prop:'Columnheaderclass'},{av:'edtavHredtf_Columnheaderclass',ctrl:'vHREDTF',prop:'Columnheaderclass'},{av:'edtavEnccli_Columnheaderclass',ctrl:'vENCCLI',prop:'Columnheaderclass'},{av:'AV54GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV48ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV39GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111FT2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV50ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV45ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV33Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV91HreRacabinout',fld:'vHRERACABINOUT',pic:''},{av:'AV14Fecha',fld:'vFECHA',pic:''},{av:'AV15Fecha_to',fld:'vFECHA_TO',pic:''},{av:'AV55Calculo',fld:'vCALCULO',pic:'ZZZ9'},{av:'AV8barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV5ArtCod',fld:'vARTCOD',pic:''},{av:'AV6ArtCod_to',fld:'vARTCOD_TO',pic:''},{av:'AV17ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV18ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV20ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV21ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV89Clicodinout',fld:'vCLICODINOUT',pic:'ZZZZZ9'},{av:'AV90Clicodinout_to',fld:'vCLICODINOUT_TO',pic:'ZZZZZ9'},{av:'AV24IntCod',fld:'vINTCOD',pic:'Z9'},{av:'AV25IntCod_to',fld:'vINTCOD_TO',pic:'Z9'},{av:'AV27TipArtCod',fld:'vTIPARTCOD',pic:'ZZZ9'},{av:'AV28TipArtCod_to',fld:'vTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV30TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV31TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV113Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV41FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV77BarAGrest',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV88TablaA',fld:'vTABLAA',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4529HreFecTin',fld:'HREFECTIN',pic:''},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A9808HreRacab',fld:'HRERACAB',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A4517HreBarSer',fld:'HREBARSER',pic:''},{av:'A4519HreTipArt',fld:'HRETIPART',pic:'ZZZ9'},{av:'A4521HreColNom',fld:'HRECOLNOM',pic:''},{av:'A4522HreColNum',fld:'HRECOLNUM',pic:'ZZZZZ9'},{av:'A4525HreTipCol',fld:'HRETIPCOL',pic:'Z9'},{av:'A4539HreIntCod',fld:'HREINTCOD',pic:'Z9'},{av:'A4532HreBarKgm',fld:'HREBARKGM',pic:'ZZZZZ9.99'},{av:'A4542HreTotKgm',fld:'HRETOTKGM',pic:'ZZZZZ9.99'},{av:'A13842BarNhdr_Hi',fld:'BARNHDR_HI',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A4518HreBarDsc',fld:'HREBARDSC',pic:''},{av:'A4520HreTipArtD',fld:'HRETIPARTD',pic:''},{av:'A4526HreTipColN',fld:'HRETIPCOLN',pic:''},{av:'A4540HreIntDsc',fld:'HREINTDSC',pic:''},{av:'A10104HreDtf',fld:'HREDTF',pic:'99/99/99 99:99:99'},{av:'A10103HreDti',fld:'HREDTI',pic:'99/99/99 99:99:99'},{av:'A4516HreDisCli',fld:'HREDISCLI',pic:''},{av:'A11318HreDispCli',fld:'HREDISPCLI',pic:''},{av:'A4497HreAgrCod',fld:'HREAGRCOD',pic:'ZZZZZZZ9'},{av:'A9985HreAcCod',fld:'HREACCOD',pic:'ZZZZZZZ9'},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'},{av:'A4547HreVolPrd',fld:'HREVOLPRD',pic:'ZZZZ9'},{av:'A8602HreCosAA',fld:'HRECOSAA',pic:'ZZZZZZ9.99'},{av:'A8603HrecosAd',fld:'HRECOSAD',pic:'ZZZZZZ9.99'},{av:'A8604HreCosAnc',fld:'HRECOSANC',pic:'ZZZZZZ9.99'},{av:'A8605HreCosCol',fld:'HRECOSCOL',pic:'ZZZZZZ9.99'},{av:'A8606HreCosPA',fld:'HRECOSPA',pic:'ZZZZZZ9.99'},{av:'A8607HreCosPD',fld:'HRECOSPD',pic:'ZZZZZZ9.99'},{av:'A4546HreMaqCod',fld:'HREMAQCOD',pic:''},{av:'A4551HreProCod',fld:'HREPROCOD',pic:''},{av:'A4552HreProDsc',fld:'HREPRODSC',pic:''},{av:'A4500HreAgrKgm',fld:'HREAGRKGM',pic:'ZZZZZ9.99'},{av:'A4498HreAgrReo',fld:'HREAGRREO',pic:'9'},{av:'A4499HreAgrPar',fld:'HREAGRPAR',pic:''},{av:'A4503HreAgrCli',fld:'HREAGRCLI',pic:'ZZZZZ9'},{av:'A4504HreAgrSer',fld:'HREAGRSER',pic:''},{av:'A4505HreAgrDsc',fld:'HREAGRDSC',pic:''},{av:'A9988HreAcKgm',fld:'HREACKGM',pic:'ZZZZZ9.99'},{av:'A9986HreAcReo',fld:'HREACREO',pic:'9'},{av:'A9987HreAcPar',fld:'HREACPAR',pic:''},{av:'A9991HreAcCli',fld:'HREACCLI',pic:'ZZZZZ9'},{av:'A9992HreAcSer',fld:'HREACSER',pic:''},{av:'A9993HreAcDsc',fld:'HREACDSC',pic:''},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV39GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV50ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV39GridState',fld:'vGRIDSTATE',pic:''},{av:'AV41FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV45ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavToa_Visible',ctrl:'vTOA',prop:'Visible'},{av:'edtavHrefectin_Visible',ctrl:'vHREFECTIN',prop:'Visible'},{av:'edtavMarca_Visible',ctrl:'vMARCA',prop:'Visible'},{av:'edtavHdr_Visible',ctrl:'vHDR',prop:'Visible'},{av:'edtavBaragrest_Visible',ctrl:'vBARAGREST',prop:'Visible'},{av:'edtavHrebarkgm_Visible',ctrl:'vHREBARKGM',prop:'Visible'},{av:'edtavHretotkgm_Visible',ctrl:'vHRETOTKGM',prop:'Visible'},{av:'edtavHremaqcod_Visible',ctrl:'vHREMAQCOD',prop:'Visible'},{av:'edtavHrevolprd_Visible',ctrl:'vHREVOLPRD',prop:'Visible'},{av:'edtavRb_Visible',ctrl:'vRB',prop:'Visible'},{av:'edtavCostei_Visible',ctrl:'vCOSTEI',prop:'Visible'},{av:'edtavCostet_Visible',ctrl:'vCOSTET',prop:'Visible'},{av:'edtavDif_Visible',ctrl:'vDIF',prop:'Visible'},{av:'edtavPorc_Visible',ctrl:'vPORC',prop:'Visible'},{av:'edtavCostek_Visible',ctrl:'vCOSTEK',prop:'Visible'},{av:'edtavClicod_Visible',ctrl:'vCLICOD',prop:'Visible'},{av:'edtavClinom_Visible',ctrl:'vCLINOM',prop:'Visible'},{av:'edtavHrebarser_Visible',ctrl:'vHREBARSER',prop:'Visible'},{av:'edtavHrebardsc_Visible',ctrl:'vHREBARDSC',prop:'Visible'},{av:'edtavHretipartd_Visible',ctrl:'vHRETIPARTD',prop:'Visible'},{av:'edtavHrecolnom_Visible',ctrl:'vHRECOLNOM',prop:'Visible'},{av:'edtavHrecolnum_Visible',ctrl:'vHRECOLNUM',prop:'Visible'},{av:'edtavHretipcoln_Visible',ctrl:'vHRETIPCOLN',prop:'Visible'},{av:'edtavHreintdsc_Visible',ctrl:'vHREINTDSC',prop:'Visible'},{av:'edtavHredti_Visible',ctrl:'vHREDTI',prop:'Visible'},{av:'edtavHredtf_Visible',ctrl:'vHREDTF',prop:'Visible'},{av:'edtavEnccli_Visible',ctrl:'vENCCLI',prop:'Visible'},{av:'AV53GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'cmbavGrupodeacciones'},{av:'edtavDetailwebcomponent_Columnheaderclass',ctrl:'vDETAILWEBCOMPONENT',prop:'Columnheaderclass'},{av:'edtavToa_Columnheaderclass',ctrl:'vTOA',prop:'Columnheaderclass'},{av:'edtavHrefectin_Columnheaderclass',ctrl:'vHREFECTIN',prop:'Columnheaderclass'},{av:'edtavMarca_Columnheaderclass',ctrl:'vMARCA',prop:'Columnheaderclass'},{av:'edtavHdr_Columnheaderclass',ctrl:'vHDR',prop:'Columnheaderclass'},{av:'edtavBaragrest_Columnheaderclass',ctrl:'vBARAGREST',prop:'Columnheaderclass'},{av:'edtavHrebarkgm_Columnheaderclass',ctrl:'vHREBARKGM',prop:'Columnheaderclass'},{av:'edtavHretotkgm_Columnheaderclass',ctrl:'vHRETOTKGM',prop:'Columnheaderclass'},{av:'edtavHremaqcod_Columnheaderclass',ctrl:'vHREMAQCOD',prop:'Columnheaderclass'},{av:'edtavHrevolprd_Columnheaderclass',ctrl:'vHREVOLPRD',prop:'Columnheaderclass'},{av:'edtavRb_Columnheaderclass',ctrl:'vRB',prop:'Columnheaderclass'},{av:'edtavCostei_Columnheaderclass',ctrl:'vCOSTEI',prop:'Columnheaderclass'},{av:'edtavCostet_Columnheaderclass',ctrl:'vCOSTET',prop:'Columnheaderclass'},{av:'edtavDif_Columnheaderclass',ctrl:'vDIF',prop:'Columnheaderclass'},{av:'edtavPorc_Columnheaderclass',ctrl:'vPORC',prop:'Columnheaderclass'},{av:'edtavCostek_Columnheaderclass',ctrl:'vCOSTEK',prop:'Columnheaderclass'},{av:'edtavClicod_Columnheaderclass',ctrl:'vCLICOD',prop:'Columnheaderclass'},{av:'edtavClinom_Columnheaderclass',ctrl:'vCLINOM',prop:'Columnheaderclass'},{av:'edtavHrebarser_Columnheaderclass',ctrl:'vHREBARSER',prop:'Columnheaderclass'},{av:'edtavHrebardsc_Columnheaderclass',ctrl:'vHREBARDSC',prop:'Columnheaderclass'},{av:'edtavHretipartd_Columnheaderclass',ctrl:'vHRETIPARTD',prop:'Columnheaderclass'},{av:'edtavHrecolnom_Columnheaderclass',ctrl:'vHRECOLNOM',prop:'Columnheaderclass'},{av:'edtavHrecolnum_Columnheaderclass',ctrl:'vHRECOLNUM',prop:'Columnheaderclass'},{av:'edtavHretipcoln_Columnheaderclass',ctrl:'vHRETIPCOLN',prop:'Columnheaderclass'},{av:'edtavHreintdsc_Columnheaderclass',ctrl:'vHREINTDSC',prop:'Columnheaderclass'},{av:'edtavHredti_Columnheaderclass',ctrl:'vHREDTI',prop:'Columnheaderclass'},{av:'edtavHredtf_Columnheaderclass',ctrl:'vHREDTF',prop:'Columnheaderclass'},{av:'edtavEnccli_Columnheaderclass',ctrl:'vENCCLI',prop:'Columnheaderclass'},{av:'AV54GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV48ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRUPODEACCIONES.CLICK","{handler:'e191FT2',iparms:[{av:'cmbavGrupodeacciones'},{av:'AV98GrupodeAcciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'},{av:'AV77BarAGrest',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV42ToA',fld:'vTOA',pic:'',hsh:true},{av:'AV33Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV68HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV70HreBarReo',fld:'vHREBARREO',pic:'9',hsh:true},{av:'AV69HreBarPar',fld:'vHREBARPAR',pic:'',hsh:true},{av:'AV71HreNumCie',fld:'vHRENUMCIE',pic:'Z9',hsh:true}]");
      setEventMetadata("VGRUPODEACCIONES.CLICK",",oparms:[{av:'cmbavGrupodeacciones'},{av:'AV98GrupodeAcciones',fld:'vGRUPODEACCIONES',pic:'ZZZ9'}]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e201FT2',iparms:[{av:'AV33Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV68HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV70HreBarReo',fld:'vHREBARREO',pic:'9',hsh:true},{av:'AV69HreBarPar',fld:'vHREBARPAR',pic:'',hsh:true},{av:'AV71HreNumCie',fld:'vHRENUMCIE',pic:'Z9',hsh:true},{av:'AV86HreLinMaq',fld:'vHRELINMAQ',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("DETAILWEBCOMPONENT_MODAL.CLOSE","{handler:'e151FT2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV50ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV45ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV33Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV91HreRacabinout',fld:'vHRERACABINOUT',pic:''},{av:'AV14Fecha',fld:'vFECHA',pic:''},{av:'AV15Fecha_to',fld:'vFECHA_TO',pic:''},{av:'AV55Calculo',fld:'vCALCULO',pic:'ZZZ9'},{av:'AV8barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV5ArtCod',fld:'vARTCOD',pic:''},{av:'AV6ArtCod_to',fld:'vARTCOD_TO',pic:''},{av:'AV17ForColNom',fld:'vFORCOLNOM',pic:''},{av:'AV18ForColNom_to',fld:'vFORCOLNOM_TO',pic:''},{av:'AV20ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV21ForColNum_to',fld:'vFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV89Clicodinout',fld:'vCLICODINOUT',pic:'ZZZZZ9'},{av:'AV90Clicodinout_to',fld:'vCLICODINOUT_TO',pic:'ZZZZZ9'},{av:'AV24IntCod',fld:'vINTCOD',pic:'Z9'},{av:'AV25IntCod_to',fld:'vINTCOD_TO',pic:'Z9'},{av:'AV27TipArtCod',fld:'vTIPARTCOD',pic:'ZZZ9'},{av:'AV28TipArtCod_to',fld:'vTIPARTCOD_TO',pic:'ZZZ9'},{av:'AV30TipColCod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV31TipColCod_to',fld:'vTIPCOLCOD_TO',pic:'Z9'},{av:'AV113Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV41FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV77BarAGrest',fld:'vBARAGREST',pic:'@!',hsh:true},{av:'AV88TablaA',fld:'vTABLAA',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4529HreFecTin',fld:'HREFECTIN',pic:''},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A9808HreRacab',fld:'HRERACAB',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A4517HreBarSer',fld:'HREBARSER',pic:''},{av:'A4519HreTipArt',fld:'HRETIPART',pic:'ZZZ9'},{av:'A4521HreColNom',fld:'HRECOLNOM',pic:''},{av:'A4522HreColNum',fld:'HRECOLNUM',pic:'ZZZZZ9'},{av:'A4525HreTipCol',fld:'HRETIPCOL',pic:'Z9'},{av:'A4539HreIntCod',fld:'HREINTCOD',pic:'Z9'},{av:'A4532HreBarKgm',fld:'HREBARKGM',pic:'ZZZZZ9.99'},{av:'A4542HreTotKgm',fld:'HRETOTKGM',pic:'ZZZZZ9.99'},{av:'A13842BarNhdr_Hi',fld:'BARNHDR_HI',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A4518HreBarDsc',fld:'HREBARDSC',pic:''},{av:'A4520HreTipArtD',fld:'HRETIPARTD',pic:''},{av:'A4526HreTipColN',fld:'HRETIPCOLN',pic:''},{av:'A4540HreIntDsc',fld:'HREINTDSC',pic:''},{av:'A10104HreDtf',fld:'HREDTF',pic:'99/99/99 99:99:99'},{av:'A10103HreDti',fld:'HREDTI',pic:'99/99/99 99:99:99'},{av:'A4516HreDisCli',fld:'HREDISCLI',pic:''},{av:'A11318HreDispCli',fld:'HREDISPCLI',pic:''},{av:'A4497HreAgrCod',fld:'HREAGRCOD',pic:'ZZZZZZZ9'},{av:'A9985HreAcCod',fld:'HREACCOD',pic:'ZZZZZZZ9'},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'},{av:'A4547HreVolPrd',fld:'HREVOLPRD',pic:'ZZZZ9'},{av:'A8602HreCosAA',fld:'HRECOSAA',pic:'ZZZZZZ9.99'},{av:'A8603HrecosAd',fld:'HRECOSAD',pic:'ZZZZZZ9.99'},{av:'A8604HreCosAnc',fld:'HRECOSANC',pic:'ZZZZZZ9.99'},{av:'A8605HreCosCol',fld:'HRECOSCOL',pic:'ZZZZZZ9.99'},{av:'A8606HreCosPA',fld:'HRECOSPA',pic:'ZZZZZZ9.99'},{av:'A8607HreCosPD',fld:'HRECOSPD',pic:'ZZZZZZ9.99'},{av:'A4546HreMaqCod',fld:'HREMAQCOD',pic:''},{av:'A4551HreProCod',fld:'HREPROCOD',pic:''},{av:'A4552HreProDsc',fld:'HREPRODSC',pic:''},{av:'A4500HreAgrKgm',fld:'HREAGRKGM',pic:'ZZZZZ9.99'},{av:'A4498HreAgrReo',fld:'HREAGRREO',pic:'9'},{av:'A4499HreAgrPar',fld:'HREAGRPAR',pic:''},{av:'A4503HreAgrCli',fld:'HREAGRCLI',pic:'ZZZZZ9'},{av:'A4504HreAgrSer',fld:'HREAGRSER',pic:''},{av:'A4505HreAgrDsc',fld:'HREAGRDSC',pic:''},{av:'A9988HreAcKgm',fld:'HREACKGM',pic:'ZZZZZ9.99'},{av:'A9986HreAcReo',fld:'HREACREO',pic:'9'},{av:'A9987HreAcPar',fld:'HREACPAR',pic:''},{av:'A9991HreAcCli',fld:'HREACCLI',pic:'ZZZZZ9'},{av:'A9992HreAcSer',fld:'HREACSER',pic:''},{av:'A9993HreAcDsc',fld:'HREACDSC',pic:''},{av:'sPrefix'}]");
      setEventMetadata("DETAILWEBCOMPONENT_MODAL.CLOSE",",oparms:[{av:'AV50ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV45ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtavToa_Visible',ctrl:'vTOA',prop:'Visible'},{av:'edtavHrefectin_Visible',ctrl:'vHREFECTIN',prop:'Visible'},{av:'edtavMarca_Visible',ctrl:'vMARCA',prop:'Visible'},{av:'edtavHdr_Visible',ctrl:'vHDR',prop:'Visible'},{av:'edtavBaragrest_Visible',ctrl:'vBARAGREST',prop:'Visible'},{av:'edtavHrebarkgm_Visible',ctrl:'vHREBARKGM',prop:'Visible'},{av:'edtavHretotkgm_Visible',ctrl:'vHRETOTKGM',prop:'Visible'},{av:'edtavHremaqcod_Visible',ctrl:'vHREMAQCOD',prop:'Visible'},{av:'edtavHrevolprd_Visible',ctrl:'vHREVOLPRD',prop:'Visible'},{av:'edtavRb_Visible',ctrl:'vRB',prop:'Visible'},{av:'edtavCostei_Visible',ctrl:'vCOSTEI',prop:'Visible'},{av:'edtavCostet_Visible',ctrl:'vCOSTET',prop:'Visible'},{av:'edtavDif_Visible',ctrl:'vDIF',prop:'Visible'},{av:'edtavPorc_Visible',ctrl:'vPORC',prop:'Visible'},{av:'edtavCostek_Visible',ctrl:'vCOSTEK',prop:'Visible'},{av:'edtavClicod_Visible',ctrl:'vCLICOD',prop:'Visible'},{av:'edtavClinom_Visible',ctrl:'vCLINOM',prop:'Visible'},{av:'edtavHrebarser_Visible',ctrl:'vHREBARSER',prop:'Visible'},{av:'edtavHrebardsc_Visible',ctrl:'vHREBARDSC',prop:'Visible'},{av:'edtavHretipartd_Visible',ctrl:'vHRETIPARTD',prop:'Visible'},{av:'edtavHrecolnom_Visible',ctrl:'vHRECOLNOM',prop:'Visible'},{av:'edtavHrecolnum_Visible',ctrl:'vHRECOLNUM',prop:'Visible'},{av:'edtavHretipcoln_Visible',ctrl:'vHRETIPCOLN',prop:'Visible'},{av:'edtavHreintdsc_Visible',ctrl:'vHREINTDSC',prop:'Visible'},{av:'edtavHredti_Visible',ctrl:'vHREDTI',prop:'Visible'},{av:'edtavHredtf_Visible',ctrl:'vHREDTF',prop:'Visible'},{av:'edtavEnccli_Visible',ctrl:'vENCCLI',prop:'Visible'},{av:'AV53GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'cmbavGrupodeacciones'},{av:'edtavDetailwebcomponent_Columnheaderclass',ctrl:'vDETAILWEBCOMPONENT',prop:'Columnheaderclass'},{av:'edtavToa_Columnheaderclass',ctrl:'vTOA',prop:'Columnheaderclass'},{av:'edtavHrefectin_Columnheaderclass',ctrl:'vHREFECTIN',prop:'Columnheaderclass'},{av:'edtavMarca_Columnheaderclass',ctrl:'vMARCA',prop:'Columnheaderclass'},{av:'edtavHdr_Columnheaderclass',ctrl:'vHDR',prop:'Columnheaderclass'},{av:'edtavBaragrest_Columnheaderclass',ctrl:'vBARAGREST',prop:'Columnheaderclass'},{av:'edtavHrebarkgm_Columnheaderclass',ctrl:'vHREBARKGM',prop:'Columnheaderclass'},{av:'edtavHretotkgm_Columnheaderclass',ctrl:'vHRETOTKGM',prop:'Columnheaderclass'},{av:'edtavHremaqcod_Columnheaderclass',ctrl:'vHREMAQCOD',prop:'Columnheaderclass'},{av:'edtavHrevolprd_Columnheaderclass',ctrl:'vHREVOLPRD',prop:'Columnheaderclass'},{av:'edtavRb_Columnheaderclass',ctrl:'vRB',prop:'Columnheaderclass'},{av:'edtavCostei_Columnheaderclass',ctrl:'vCOSTEI',prop:'Columnheaderclass'},{av:'edtavCostet_Columnheaderclass',ctrl:'vCOSTET',prop:'Columnheaderclass'},{av:'edtavDif_Columnheaderclass',ctrl:'vDIF',prop:'Columnheaderclass'},{av:'edtavPorc_Columnheaderclass',ctrl:'vPORC',prop:'Columnheaderclass'},{av:'edtavCostek_Columnheaderclass',ctrl:'vCOSTEK',prop:'Columnheaderclass'},{av:'edtavClicod_Columnheaderclass',ctrl:'vCLICOD',prop:'Columnheaderclass'},{av:'edtavClinom_Columnheaderclass',ctrl:'vCLINOM',prop:'Columnheaderclass'},{av:'edtavHrebarser_Columnheaderclass',ctrl:'vHREBARSER',prop:'Columnheaderclass'},{av:'edtavHrebardsc_Columnheaderclass',ctrl:'vHREBARDSC',prop:'Columnheaderclass'},{av:'edtavHretipartd_Columnheaderclass',ctrl:'vHRETIPARTD',prop:'Columnheaderclass'},{av:'edtavHrecolnom_Columnheaderclass',ctrl:'vHRECOLNOM',prop:'Columnheaderclass'},{av:'edtavHrecolnum_Columnheaderclass',ctrl:'vHRECOLNUM',prop:'Columnheaderclass'},{av:'edtavHretipcoln_Columnheaderclass',ctrl:'vHRETIPCOLN',prop:'Columnheaderclass'},{av:'edtavHreintdsc_Columnheaderclass',ctrl:'vHREINTDSC',prop:'Columnheaderclass'},{av:'edtavHredti_Columnheaderclass',ctrl:'vHREDTI',prop:'Columnheaderclass'},{av:'edtavHredtf_Columnheaderclass',ctrl:'vHREDTF',prop:'Columnheaderclass'},{av:'edtavEnccli_Columnheaderclass',ctrl:'vENCCLI',prop:'Columnheaderclass'},{av:'AV54GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV48ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV39GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("NULL","{handler:'validv_Enccli',iparms:[]");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      wcpOAV33Emprcod = "" ;
      wcpOAV91HreRacabinout = "" ;
      wcpOAV14Fecha = GXutil.nullDate() ;
      wcpOAV15Fecha_to = GXutil.nullDate() ;
      wcpOAV9barcodpar = "" ;
      wcpOAV5ArtCod = "" ;
      wcpOAV6ArtCod_to = "" ;
      wcpOAV17ForColNom = "" ;
      wcpOAV18ForColNom_to = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV33Emprcod = "" ;
      AV91HreRacabinout = "" ;
      AV14Fecha = GXutil.nullDate() ;
      AV15Fecha_to = GXutil.nullDate() ;
      AV9barcodpar = "" ;
      AV5ArtCod = "" ;
      AV6ArtCod_to = "" ;
      AV17ForColNom = "" ;
      AV18ForColNom_to = "" ;
      AV45ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV113Pgmname = "" ;
      AV41FilterFullText = "" ;
      AV77BarAGrest = "" ;
      A396EmprCod = "" ;
      A4529HreFecTin = GXutil.nullDate() ;
      A4494HreBarPar = "" ;
      A9808HreRacab = "" ;
      A4517HreBarSer = "" ;
      A4521HreColNom = "" ;
      A4532HreBarKgm = DecimalUtil.ZERO ;
      A4542HreTotKgm = DecimalUtil.ZERO ;
      A13842BarNhdr_Hi = "" ;
      A279CliNom = "" ;
      A4518HreBarDsc = "" ;
      A4520HreTipArtD = "" ;
      A4526HreTipColN = "" ;
      A4540HreIntDsc = "" ;
      A10104HreDtf = GXutil.resetTime( GXutil.nullDate() );
      A10103HreDti = GXutil.resetTime( GXutil.nullDate() );
      A4516HreDisCli = "" ;
      A11318HreDispCli = "" ;
      A8602HreCosAA = DecimalUtil.ZERO ;
      A8603HrecosAd = DecimalUtil.ZERO ;
      A8604HreCosAnc = DecimalUtil.ZERO ;
      A8605HreCosCol = DecimalUtil.ZERO ;
      A8606HreCosPA = DecimalUtil.ZERO ;
      A8607HreCosPD = DecimalUtil.ZERO ;
      A4546HreMaqCod = "" ;
      A4551HreProCod = "" ;
      A4552HreProDsc = "" ;
      A4500HreAgrKgm = DecimalUtil.ZERO ;
      A4499HreAgrPar = "" ;
      A4504HreAgrSer = "" ;
      A4505HreAgrDsc = "" ;
      A9988HreAcKgm = DecimalUtil.ZERO ;
      A9987HreAcPar = "" ;
      A9992HreAcSer = "" ;
      A9993HreAcDsc = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV48ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV51DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV39GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      WebComp_Grid_dwc_Component = "" ;
      OldGrid_dwc = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      WebComp_Wwpaux_wc_Component = "" ;
      OldWwpaux_wc = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV97DetailWebComponent = "" ;
      AV42ToA = "" ;
      AV59HreFecTin = GXutil.nullDate() ;
      AV75Marca = "" ;
      AV76Hdr = "" ;
      AV57HreBarKgm = DecimalUtil.ZERO ;
      AV58HreTotKgm = DecimalUtil.ZERO ;
      AV78HreMaqCod = "" ;
      AV80Rb = DecimalUtil.ZERO ;
      AV81Costei = DecimalUtil.ZERO ;
      AV82CosteT = DecimalUtil.ZERO ;
      AV83Dif = DecimalUtil.ZERO ;
      AV84Porc = DecimalUtil.ZERO ;
      AV85CosteK = DecimalUtil.ZERO ;
      AV60CliNom = "" ;
      AV61HreBarSer = "" ;
      AV62HreBarDsc = "" ;
      AV65HreTipArtD = "" ;
      AV63HreColNom = "" ;
      AV66HreTipColN = "" ;
      AV67HreIntDsc = "" ;
      AV73HreDti = GXutil.resetTime( GXutil.nullDate() );
      AV72HreDtf = GXutil.resetTime( GXutil.nullDate() );
      AV69HreBarPar = "" ;
      AV87EncCli = "" ;
      AV103Station = "" ;
      AV104Emprnom = "" ;
      AV105Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV35WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV47Session = httpContext.getWebSession();
      AV43ColumnsSelectorXML = "" ;
      GXv_int9 = new long[1] ;
      scmdbuf = "" ;
      H01FT2_A396EmprCod = new String[] {""} ;
      H01FT2_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      H01FT2_n4529HreFecTin = new boolean[] {false} ;
      H01FT2_A4547HreVolPrd = new int[1] ;
      H01FT2_n4547HreVolPrd = new boolean[] {false} ;
      H01FT2_A8607HreCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01FT2_n8607HreCosPD = new boolean[] {false} ;
      H01FT2_A8606HreCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01FT2_n8606HreCosPA = new boolean[] {false} ;
      H01FT2_A8605HreCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01FT2_n8605HreCosCol = new boolean[] {false} ;
      H01FT2_A8604HreCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01FT2_n8604HreCosAnc = new boolean[] {false} ;
      H01FT2_A8603HrecosAd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01FT2_n8603HrecosAd = new boolean[] {false} ;
      H01FT2_A8602HreCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01FT2_n8602HreCosAA = new boolean[] {false} ;
      H01FT2_A4532HreBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01FT2_n4532HreBarKgm = new boolean[] {false} ;
      H01FT2_A4542HreTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01FT2_n4542HreTotKgm = new boolean[] {false} ;
      H01FT2_A4546HreMaqCod = new String[] {""} ;
      H01FT2_n4546HreMaqCod = new boolean[] {false} ;
      H01FT2_A4545HreLinMaq = new short[1] ;
      H01FT2_A4495HreNumCie = new byte[1] ;
      H01FT2_A4539HreIntCod = new byte[1] ;
      H01FT2_n4539HreIntCod = new boolean[] {false} ;
      H01FT2_A4525HreTipCol = new byte[1] ;
      H01FT2_n4525HreTipCol = new boolean[] {false} ;
      H01FT2_A4522HreColNum = new int[1] ;
      H01FT2_n4522HreColNum = new boolean[] {false} ;
      H01FT2_A4521HreColNom = new String[] {""} ;
      H01FT2_n4521HreColNom = new boolean[] {false} ;
      H01FT2_A4519HreTipArt = new short[1] ;
      H01FT2_n4519HreTipArt = new boolean[] {false} ;
      H01FT2_A4517HreBarSer = new String[] {""} ;
      H01FT2_n4517HreBarSer = new boolean[] {false} ;
      H01FT2_A252CliCod = new int[1] ;
      H01FT2_n252CliCod = new boolean[] {false} ;
      H01FT2_A9808HreRacab = new String[] {""} ;
      H01FT2_n9808HreRacab = new boolean[] {false} ;
      H01FT2_A279CliNom = new String[] {""} ;
      H01FT2_A4518HreBarDsc = new String[] {""} ;
      H01FT2_n4518HreBarDsc = new boolean[] {false} ;
      H01FT2_A4520HreTipArtD = new String[] {""} ;
      H01FT2_n4520HreTipArtD = new boolean[] {false} ;
      H01FT2_A4526HreTipColN = new String[] {""} ;
      H01FT2_n4526HreTipColN = new boolean[] {false} ;
      H01FT2_A4540HreIntDsc = new String[] {""} ;
      H01FT2_n4540HreIntDsc = new boolean[] {false} ;
      H01FT2_A10104HreDtf = new java.util.Date[] {GXutil.nullDate()} ;
      H01FT2_n10104HreDtf = new boolean[] {false} ;
      H01FT2_A10103HreDti = new java.util.Date[] {GXutil.nullDate()} ;
      H01FT2_n10103HreDti = new boolean[] {false} ;
      H01FT2_A4516HreDisCli = new String[] {""} ;
      H01FT2_n4516HreDisCli = new boolean[] {false} ;
      H01FT2_A11318HreDispCli = new String[] {""} ;
      H01FT2_n11318HreDispCli = new boolean[] {false} ;
      H01FT2_A4494HreBarPar = new String[] {""} ;
      H01FT2_A4493HreBarReo = new byte[1] ;
      H01FT2_A4492HreBarCod = new int[1] ;
      AV23HreRacab = "" ;
      AV74PrvDsc = "" ;
      H01FT3_A4498HreAgrReo = new byte[1] ;
      H01FT3_A4499HreAgrPar = new String[] {""} ;
      H01FT3_A396EmprCod = new String[] {""} ;
      H01FT3_A4492HreBarCod = new int[1] ;
      H01FT3_A4493HreBarReo = new byte[1] ;
      H01FT3_A4494HreBarPar = new String[] {""} ;
      H01FT3_A4495HreNumCie = new byte[1] ;
      H01FT3_A4497HreAgrCod = new int[1] ;
      H01FT4_A9986HreAcReo = new byte[1] ;
      H01FT4_A9987HreAcPar = new String[] {""} ;
      H01FT4_A396EmprCod = new String[] {""} ;
      H01FT4_A4492HreBarCod = new int[1] ;
      H01FT4_A4493HreBarReo = new byte[1] ;
      H01FT4_A4494HreBarPar = new String[] {""} ;
      H01FT4_A4495HreNumCie = new byte[1] ;
      H01FT4_A9985HreAcCod = new int[1] ;
      AV96CosteTotCal = DecimalUtil.ZERO ;
      AV95CosteTotC = DecimalUtil.ZERO ;
      AV92HreProcod = "" ;
      AV93HreProdsc = "" ;
      H01FT5_A4550HreLinPro = new byte[1] ;
      H01FT5_A396EmprCod = new String[] {""} ;
      H01FT5_A4492HreBarCod = new int[1] ;
      H01FT5_A4493HreBarReo = new byte[1] ;
      H01FT5_A4494HreBarPar = new String[] {""} ;
      H01FT5_A4495HreNumCie = new byte[1] ;
      H01FT5_A4545HreLinMaq = new short[1] ;
      H01FT5_A4551HreProCod = new String[] {""} ;
      H01FT5_A4552HreProDsc = new String[] {""} ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      H01FT6_A396EmprCod = new String[] {""} ;
      H01FT6_A4492HreBarCod = new int[1] ;
      H01FT6_A4493HreBarReo = new byte[1] ;
      H01FT6_A4494HreBarPar = new String[] {""} ;
      H01FT6_A4495HreNumCie = new byte[1] ;
      H01FT6_A4500HreAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01FT6_A4499HreAgrPar = new String[] {""} ;
      H01FT6_A4498HreAgrReo = new byte[1] ;
      H01FT6_A4503HreAgrCli = new int[1] ;
      H01FT6_A4504HreAgrSer = new String[] {""} ;
      H01FT6_A4505HreAgrDsc = new String[] {""} ;
      H01FT6_A4497HreAgrCod = new int[1] ;
      H01FT7_A396EmprCod = new String[] {""} ;
      H01FT7_A4492HreBarCod = new int[1] ;
      H01FT7_A4493HreBarReo = new byte[1] ;
      H01FT7_A4494HreBarPar = new String[] {""} ;
      H01FT7_A4495HreNumCie = new byte[1] ;
      H01FT7_A9988HreAcKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01FT7_n9988HreAcKgm = new boolean[] {false} ;
      H01FT7_A9987HreAcPar = new String[] {""} ;
      H01FT7_A9986HreAcReo = new byte[1] ;
      H01FT7_A9991HreAcCli = new int[1] ;
      H01FT7_n9991HreAcCli = new boolean[] {false} ;
      H01FT7_A9992HreAcSer = new String[] {""} ;
      H01FT7_n9992HreAcSer = new boolean[] {false} ;
      H01FT7_A9993HreAcDsc = new String[] {""} ;
      H01FT7_n9993HreAcDsc = new boolean[] {false} ;
      H01FT7_A9985HreAcCod = new int[1] ;
      GXv_int20 = new byte[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_int23 = new int[1] ;
      GXv_char25 = new String[1] ;
      GXv_char22 = new String[1] ;
      GXv_int16 = new int[1] ;
      GXv_int17 = new byte[1] ;
      GXv_char21 = new String[1] ;
      GXv_date28 = new java.util.Date[1] ;
      GXv_int11 = new byte[1] ;
      GXv_char18 = new String[1] ;
      GXv_char15 = new String[1] ;
      GXv_int14 = new int[1] ;
      GXv_date24 = new java.util.Date[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_date19 = new java.util.Date[1] ;
      GXv_char2 = new String[1] ;
      GXv_int27 = new int[1] ;
      GXv_char26 = new String[1] ;
      AV49ManageFiltersXml = "" ;
      AV44UserCustomValue = "" ;
      GXt_char1 = "" ;
      GXv_char29 = new String[1] ;
      AV46ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector30 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector31 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item32 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item33 = new GXBaseCollection[1] ;
      AV40GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXv_SdtWWPGridState34 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      ucDetailwebcomponent_modal = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV33Emprcod = "" ;
      sCtrlAV91HreRacabinout = "" ;
      sCtrlAV14Fecha = "" ;
      sCtrlAV15Fecha_to = "" ;
      sCtrlAV55Calculo = "" ;
      sCtrlAV8barcod = "" ;
      sCtrlAV10barcodreo = "" ;
      sCtrlAV9barcodpar = "" ;
      sCtrlAV5ArtCod = "" ;
      sCtrlAV6ArtCod_to = "" ;
      sCtrlAV17ForColNom = "" ;
      sCtrlAV18ForColNom_to = "" ;
      sCtrlAV20ForColNum = "" ;
      sCtrlAV21ForColNum_to = "" ;
      sCtrlAV89Clicodinout = "" ;
      sCtrlAV90Clicodinout_to = "" ;
      sCtrlAV24IntCod = "" ;
      sCtrlAV25IntCod_to = "" ;
      sCtrlAV27TipArtCod = "" ;
      sCtrlAV28TipArtCod_to = "" ;
      sCtrlAV30TipColCod = "" ;
      sCtrlAV31TipColCod_to = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.costesquimicosanalisis_wc__default(),
         new Object[] {
             new Object[] {
            H01FT2_A396EmprCod, H01FT2_A4529HreFecTin, H01FT2_n4529HreFecTin, H01FT2_A4547HreVolPrd, H01FT2_n4547HreVolPrd, H01FT2_A8607HreCosPD, H01FT2_n8607HreCosPD, H01FT2_A8606HreCosPA, H01FT2_n8606HreCosPA, H01FT2_A8605HreCosCol,
            H01FT2_n8605HreCosCol, H01FT2_A8604HreCosAnc, H01FT2_n8604HreCosAnc, H01FT2_A8603HrecosAd, H01FT2_n8603HrecosAd, H01FT2_A8602HreCosAA, H01FT2_n8602HreCosAA, H01FT2_A4532HreBarKgm, H01FT2_n4532HreBarKgm, H01FT2_A4542HreTotKgm,
            H01FT2_n4542HreTotKgm, H01FT2_A4546HreMaqCod, H01FT2_n4546HreMaqCod, H01FT2_A4545HreLinMaq, H01FT2_A4495HreNumCie, H01FT2_A4539HreIntCod, H01FT2_n4539HreIntCod, H01FT2_A4525HreTipCol, H01FT2_n4525HreTipCol, H01FT2_A4522HreColNum,
            H01FT2_n4522HreColNum, H01FT2_A4521HreColNom, H01FT2_n4521HreColNom, H01FT2_A4519HreTipArt, H01FT2_n4519HreTipArt, H01FT2_A4517HreBarSer, H01FT2_n4517HreBarSer, H01FT2_A252CliCod, H01FT2_n252CliCod, H01FT2_A9808HreRacab,
            H01FT2_n9808HreRacab, H01FT2_A279CliNom, H01FT2_A4518HreBarDsc, H01FT2_n4518HreBarDsc, H01FT2_A4520HreTipArtD, H01FT2_n4520HreTipArtD, H01FT2_A4526HreTipColN, H01FT2_n4526HreTipColN, H01FT2_A4540HreIntDsc, H01FT2_n4540HreIntDsc,
            H01FT2_A10104HreDtf, H01FT2_n10104HreDtf, H01FT2_A10103HreDti, H01FT2_n10103HreDti, H01FT2_A4516HreDisCli, H01FT2_n4516HreDisCli, H01FT2_A11318HreDispCli, H01FT2_n11318HreDispCli, H01FT2_A4494HreBarPar, H01FT2_A4493HreBarReo,
            H01FT2_A4492HreBarCod
            }
            , new Object[] {
            H01FT3_A4498HreAgrReo, H01FT3_A4499HreAgrPar, H01FT3_A396EmprCod, H01FT3_A4492HreBarCod, H01FT3_A4493HreBarReo, H01FT3_A4494HreBarPar, H01FT3_A4495HreNumCie, H01FT3_A4497HreAgrCod
            }
            , new Object[] {
            H01FT4_A9986HreAcReo, H01FT4_A9987HreAcPar, H01FT4_A396EmprCod, H01FT4_A4492HreBarCod, H01FT4_A4493HreBarReo, H01FT4_A4494HreBarPar, H01FT4_A4495HreNumCie, H01FT4_A9985HreAcCod
            }
            , new Object[] {
            H01FT5_A4550HreLinPro, H01FT5_A396EmprCod, H01FT5_A4492HreBarCod, H01FT5_A4493HreBarReo, H01FT5_A4494HreBarPar, H01FT5_A4495HreNumCie, H01FT5_A4545HreLinMaq, H01FT5_A4551HreProCod, H01FT5_A4552HreProDsc
            }
            , new Object[] {
            H01FT6_A396EmprCod, H01FT6_A4492HreBarCod, H01FT6_A4493HreBarReo, H01FT6_A4494HreBarPar, H01FT6_A4495HreNumCie, H01FT6_A4500HreAgrKgm, H01FT6_A4499HreAgrPar, H01FT6_A4498HreAgrReo, H01FT6_A4503HreAgrCli, H01FT6_A4504HreAgrSer,
            H01FT6_A4505HreAgrDsc, H01FT6_A4497HreAgrCod
            }
            , new Object[] {
            H01FT7_A396EmprCod, H01FT7_A4492HreBarCod, H01FT7_A4493HreBarReo, H01FT7_A4494HreBarPar, H01FT7_A4495HreNumCie, H01FT7_A9988HreAcKgm, H01FT7_n9988HreAcKgm, H01FT7_A9987HreAcPar, H01FT7_A9986HreAcReo, H01FT7_A9991HreAcCli,
            H01FT7_n9991HreAcCli, H01FT7_A9992HreAcSer, H01FT7_n9992HreAcSer, H01FT7_A9993HreAcDsc, H01FT7_n9993HreAcDsc, H01FT7_A9985HreAcCod
            }
         }
      );
      AV113Pgmname = "CostesQuimicosAnalisis_WC" ;
      /* GeneXus formulas. */
      AV113Pgmname = "CostesQuimicosAnalisis_WC" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavTablaa_Enabled = 0 ;
      edtavToa_Enabled = 0 ;
      edtavHrefectin_Enabled = 0 ;
      edtavMarca_Enabled = 0 ;
      edtavHdr_Enabled = 0 ;
      edtavBaragrest_Enabled = 0 ;
      edtavHrebarkgm_Enabled = 0 ;
      edtavHretotkgm_Enabled = 0 ;
      edtavHremaqcod_Enabled = 0 ;
      edtavHrevolprd_Enabled = 0 ;
      edtavRb_Enabled = 0 ;
      edtavCostei_Enabled = 0 ;
      edtavCostet_Enabled = 0 ;
      edtavDif_Enabled = 0 ;
      edtavPorc_Enabled = 0 ;
      edtavCostek_Enabled = 0 ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavHrebarser_Enabled = 0 ;
      edtavHrebardsc_Enabled = 0 ;
      edtavHretipartd_Enabled = 0 ;
      edtavHrecolnom_Enabled = 0 ;
      edtavHrecolnum_Enabled = 0 ;
      edtavHretipcoln_Enabled = 0 ;
      edtavHreintdsc_Enabled = 0 ;
      edtavHredti_Enabled = 0 ;
      edtavHredtf_Enabled = 0 ;
      edtavHrebarcod_Enabled = 0 ;
      edtavHrebarpar_Enabled = 0 ;
      edtavHrebarreo_Enabled = 0 ;
      edtavHrenumcie_Enabled = 0 ;
      edtavHrelinmaq_Enabled = 0 ;
      edtavEnccli_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wwpaux_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV10barcodreo ;
   private byte wcpOAV24IntCod ;
   private byte wcpOAV25IntCod_to ;
   private byte wcpOAV30TipColCod ;
   private byte wcpOAV31TipColCod_to ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV10barcodreo ;
   private byte AV24IntCod ;
   private byte AV25IntCod_to ;
   private byte AV30TipColCod ;
   private byte AV31TipColCod_to ;
   private byte AV50ManageFiltersExecutionStep ;
   private byte AV88TablaA ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4525HreTipCol ;
   private byte A4539HreIntCod ;
   private byte A4498HreAgrReo ;
   private byte A9986HreAcReo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte AV70HreBarReo ;
   private byte AV71HreNumCie ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXv_int20[] ;
   private byte GXv_int17[] ;
   private byte GXv_int11[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV55Calculo ;
   private short wcpOAV27TipArtCod ;
   private short wcpOAV28TipArtCod_to ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_9 ;
   private short nIsMod_9 ;
   private short nRcdExists_8 ;
   private short nIsMod_8 ;
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short AV55Calculo ;
   private short AV27TipArtCod ;
   private short AV28TipArtCod_to ;
   private short A4519HreTipArt ;
   private short A4545HreLinMaq ;
   private short wbEnd ;
   private short wbStart ;
   private short AV98GrupodeAcciones ;
   private short AV86HreLinMaq ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV94costeKCal ;
   private int wcpOAV8barcod ;
   private int wcpOAV20ForColNum ;
   private int wcpOAV21ForColNum_to ;
   private int wcpOAV89Clicodinout ;
   private int wcpOAV90Clicodinout_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_37 ;
   private int AV8barcod ;
   private int AV20ForColNum ;
   private int AV21ForColNum_to ;
   private int AV89Clicodinout ;
   private int AV90Clicodinout_to ;
   private int nGXsfl_37_idx=1 ;
   private int A4492HreBarCod ;
   private int A252CliCod ;
   private int A4522HreColNum ;
   private int A4497HreAgrCod ;
   private int A9985HreAcCod ;
   private int A4547HreVolPrd ;
   private int A4503HreAgrCli ;
   private int A9991HreAcCli ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV79HreVolPrd ;
   private int AV11CliCod ;
   private int AV64HreColNum ;
   private int AV68HreBarCod ;
   private int subGrid_Islastpage ;
   private int edtavDetailwebcomponent_Enabled ;
   private int edtavTablaa_Enabled ;
   private int edtavToa_Enabled ;
   private int edtavHrefectin_Enabled ;
   private int edtavMarca_Enabled ;
   private int edtavHdr_Enabled ;
   private int edtavBaragrest_Enabled ;
   private int edtavHrebarkgm_Enabled ;
   private int edtavHretotkgm_Enabled ;
   private int edtavHremaqcod_Enabled ;
   private int edtavHrevolprd_Enabled ;
   private int edtavRb_Enabled ;
   private int edtavCostei_Enabled ;
   private int edtavCostet_Enabled ;
   private int edtavDif_Enabled ;
   private int edtavPorc_Enabled ;
   private int edtavCostek_Enabled ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavHrebarser_Enabled ;
   private int edtavHrebardsc_Enabled ;
   private int edtavHretipartd_Enabled ;
   private int edtavHrecolnom_Enabled ;
   private int edtavHrecolnum_Enabled ;
   private int edtavHretipcoln_Enabled ;
   private int edtavHreintdsc_Enabled ;
   private int edtavHredti_Enabled ;
   private int edtavHredtf_Enabled ;
   private int edtavHrebarcod_Enabled ;
   private int edtavHrebarpar_Enabled ;
   private int edtavHrebarreo_Enabled ;
   private int edtavHrenumcie_Enabled ;
   private int edtavHrelinmaq_Enabled ;
   private int edtavEnccli_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int subGrid_Recordcount ;
   private int edtavToa_Visible ;
   private int edtavHrefectin_Visible ;
   private int edtavMarca_Visible ;
   private int edtavHdr_Visible ;
   private int edtavBaragrest_Visible ;
   private int edtavHrebarkgm_Visible ;
   private int edtavHretotkgm_Visible ;
   private int edtavHremaqcod_Visible ;
   private int edtavHrevolprd_Visible ;
   private int edtavRb_Visible ;
   private int edtavCostei_Visible ;
   private int edtavCostet_Visible ;
   private int edtavDif_Visible ;
   private int edtavPorc_Visible ;
   private int edtavCostek_Visible ;
   private int edtavClicod_Visible ;
   private int edtavClinom_Visible ;
   private int edtavHrebarser_Visible ;
   private int edtavHrebardsc_Visible ;
   private int edtavHretipartd_Visible ;
   private int edtavHrecolnom_Visible ;
   private int edtavHrecolnum_Visible ;
   private int edtavHretipcoln_Visible ;
   private int edtavHreintdsc_Visible ;
   private int edtavHredti_Visible ;
   private int edtavHredtf_Visible ;
   private int edtavEnccli_Visible ;
   private int AV52PageToGo ;
   private int GXv_int23[] ;
   private int GXv_int16[] ;
   private int GXv_int14[] ;
   private int GXv_int10[] ;
   private int GXv_int27[] ;
   private int AV114GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavDetailwebcomponent_Visible ;
   private int edtavTablaa_Visible ;
   private int edtavHrebarcod_Visible ;
   private int edtavHrebarpar_Visible ;
   private int edtavHrebarreo_Visible ;
   private int edtavHrenumcie_Visible ;
   private int edtavHrelinmaq_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV53GridCurrentPage ;
   private long AV54GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long AV56NumeroRegistros ;
   private long GXt_int8 ;
   private long GXv_int9[] ;
   private java.math.BigDecimal A4532HreBarKgm ;
   private java.math.BigDecimal A4542HreTotKgm ;
   private java.math.BigDecimal A8602HreCosAA ;
   private java.math.BigDecimal A8603HrecosAd ;
   private java.math.BigDecimal A8604HreCosAnc ;
   private java.math.BigDecimal A8605HreCosCol ;
   private java.math.BigDecimal A8606HreCosPA ;
   private java.math.BigDecimal A8607HreCosPD ;
   private java.math.BigDecimal A4500HreAgrKgm ;
   private java.math.BigDecimal A9988HreAcKgm ;
   private java.math.BigDecimal AV57HreBarKgm ;
   private java.math.BigDecimal AV58HreTotKgm ;
   private java.math.BigDecimal AV80Rb ;
   private java.math.BigDecimal AV81Costei ;
   private java.math.BigDecimal AV82CosteT ;
   private java.math.BigDecimal AV83Dif ;
   private java.math.BigDecimal AV84Porc ;
   private java.math.BigDecimal AV85CosteK ;
   private java.math.BigDecimal AV96CosteTotCal ;
   private java.math.BigDecimal AV95CosteTotC ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private String wcpOAV33Emprcod ;
   private String wcpOAV91HreRacabinout ;
   private String wcpOAV9barcodpar ;
   private String wcpOAV5ArtCod ;
   private String wcpOAV6ArtCod_to ;
   private String wcpOAV17ForColNom ;
   private String wcpOAV18ForColNom_to ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV33Emprcod ;
   private String AV91HreRacabinout ;
   private String AV9barcodpar ;
   private String AV5ArtCod ;
   private String AV6ArtCod_to ;
   private String AV17ForColNom ;
   private String AV18ForColNom_to ;
   private String sGXsfl_37_idx="0001" ;
   private String AV113Pgmname ;
   private String AV77BarAGrest ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String A9808HreRacab ;
   private String A4517HreBarSer ;
   private String A4521HreColNom ;
   private String A13842BarNhdr_Hi ;
   private String A279CliNom ;
   private String A4518HreBarDsc ;
   private String A4520HreTipArtD ;
   private String A4526HreTipColN ;
   private String A4540HreIntDsc ;
   private String A4516HreDisCli ;
   private String A11318HreDispCli ;
   private String A4546HreMaqCod ;
   private String A4551HreProCod ;
   private String A4552HreProDsc ;
   private String A4499HreAgrPar ;
   private String A4504HreAgrSer ;
   private String A4505HreAgrDsc ;
   private String A9987HreAcPar ;
   private String A9992HreAcSer ;
   private String A9993HreAcDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Gridpaginationbar_Class ;
   private String Gridpaginationbar_Pagingbuttonsposition ;
   private String Gridpaginationbar_Pagingcaptionposition ;
   private String Gridpaginationbar_Emptygridclass ;
   private String Gridpaginationbar_Rowsperpageoptions ;
   private String Gridpaginationbar_Previous ;
   private String Gridpaginationbar_Next ;
   private String Gridpaginationbar_Caption ;
   private String Gridpaginationbar_Emptygridcaption ;
   private String Gridpaginationbar_Rowsperpagecaption ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Fixable ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Detailwebcomponent_modal_Width ;
   private String Detailwebcomponent_modal_Title ;
   private String Detailwebcomponent_modal_Confirmtype ;
   private String Detailwebcomponent_modal_Bodytype ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divCell_grid_dwc_Internalname ;
   private String divCell_grid_dwc_Class ;
   private String WebComp_Grid_dwc_Component ;
   private String OldGrid_dwc ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDiv_wwpauxwc_Internalname ;
   private String WebComp_Wwpaux_wc_Component ;
   private String OldWwpaux_wc ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV97DetailWebComponent ;
   private String edtavDetailwebcomponent_Internalname ;
   private String edtavTablaa_Internalname ;
   private String AV42ToA ;
   private String edtavToa_Internalname ;
   private String edtavHrefectin_Internalname ;
   private String AV75Marca ;
   private String edtavMarca_Internalname ;
   private String AV76Hdr ;
   private String edtavHdr_Internalname ;
   private String edtavBaragrest_Internalname ;
   private String edtavHrebarkgm_Internalname ;
   private String edtavHretotkgm_Internalname ;
   private String AV78HreMaqCod ;
   private String edtavHremaqcod_Internalname ;
   private String edtavHrevolprd_Internalname ;
   private String edtavRb_Internalname ;
   private String edtavCostei_Internalname ;
   private String edtavCostet_Internalname ;
   private String edtavDif_Internalname ;
   private String edtavPorc_Internalname ;
   private String edtavCostek_Internalname ;
   private String edtavClicod_Internalname ;
   private String AV60CliNom ;
   private String edtavClinom_Internalname ;
   private String AV61HreBarSer ;
   private String edtavHrebarser_Internalname ;
   private String AV62HreBarDsc ;
   private String edtavHrebardsc_Internalname ;
   private String AV65HreTipArtD ;
   private String edtavHretipartd_Internalname ;
   private String AV63HreColNom ;
   private String edtavHrecolnom_Internalname ;
   private String edtavHrecolnum_Internalname ;
   private String AV66HreTipColN ;
   private String edtavHretipcoln_Internalname ;
   private String AV67HreIntDsc ;
   private String edtavHreintdsc_Internalname ;
   private String edtavHredti_Internalname ;
   private String edtavHredtf_Internalname ;
   private String edtavHrebarcod_Internalname ;
   private String AV69HreBarPar ;
   private String edtavHrebarpar_Internalname ;
   private String edtavHrebarreo_Internalname ;
   private String edtavHrenumcie_Internalname ;
   private String edtavHrelinmaq_Internalname ;
   private String AV87EncCli ;
   private String edtavEnccli_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String AV103Station ;
   private String AV104Emprnom ;
   private String AV105Usurcod ;
   private String edtavDetailwebcomponent_Columnheaderclass ;
   private String edtavToa_Columnheaderclass ;
   private String edtavHrefectin_Columnheaderclass ;
   private String edtavMarca_Columnheaderclass ;
   private String edtavHdr_Columnheaderclass ;
   private String edtavBaragrest_Columnheaderclass ;
   private String edtavHrebarkgm_Columnheaderclass ;
   private String edtavHretotkgm_Columnheaderclass ;
   private String edtavHremaqcod_Columnheaderclass ;
   private String edtavHrevolprd_Columnheaderclass ;
   private String edtavRb_Columnheaderclass ;
   private String edtavCostei_Columnheaderclass ;
   private String edtavCostet_Columnheaderclass ;
   private String edtavDif_Columnheaderclass ;
   private String edtavPorc_Columnheaderclass ;
   private String edtavCostek_Columnheaderclass ;
   private String edtavClicod_Columnheaderclass ;
   private String edtavClinom_Columnheaderclass ;
   private String edtavHrebarser_Columnheaderclass ;
   private String edtavHrebardsc_Columnheaderclass ;
   private String edtavHretipartd_Columnheaderclass ;
   private String edtavHrecolnom_Columnheaderclass ;
   private String edtavHrecolnum_Columnheaderclass ;
   private String edtavHretipcoln_Columnheaderclass ;
   private String edtavHreintdsc_Columnheaderclass ;
   private String edtavHredti_Columnheaderclass ;
   private String edtavHredtf_Columnheaderclass ;
   private String edtavEnccli_Columnheaderclass ;
   private String edtavDetailwebcomponent_Columnclass ;
   private String edtavToa_Columnclass ;
   private String edtavHrefectin_Columnclass ;
   private String edtavMarca_Columnclass ;
   private String edtavHdr_Columnclass ;
   private String edtavBaragrest_Columnclass ;
   private String edtavHrebarkgm_Columnclass ;
   private String edtavHretotkgm_Columnclass ;
   private String edtavHremaqcod_Columnclass ;
   private String edtavHrevolprd_Columnclass ;
   private String edtavRb_Columnclass ;
   private String edtavCostei_Columnclass ;
   private String edtavCostet_Columnclass ;
   private String edtavDif_Columnclass ;
   private String edtavPorc_Columnclass ;
   private String edtavCostek_Columnclass ;
   private String edtavClicod_Columnclass ;
   private String edtavClinom_Columnclass ;
   private String edtavHrebarser_Columnclass ;
   private String edtavHrebardsc_Columnclass ;
   private String edtavHretipartd_Columnclass ;
   private String edtavHrecolnom_Columnclass ;
   private String edtavHrecolnum_Columnclass ;
   private String edtavHretipcoln_Columnclass ;
   private String edtavHreintdsc_Columnclass ;
   private String edtavHredti_Columnclass ;
   private String edtavHredtf_Columnclass ;
   private String edtavEnccli_Columnclass ;
   private String scmdbuf ;
   private String AV23HreRacab ;
   private String AV74PrvDsc ;
   private String AV92HreProcod ;
   private String AV93HreProdsc ;
   private String GXv_char25[] ;
   private String GXv_char22[] ;
   private String GXv_char21[] ;
   private String GXv_char18[] ;
   private String GXv_char15[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char26[] ;
   private String GXt_char1 ;
   private String GXv_char29[] ;
   private String tblTabledetailwebcomponent_modal_Internalname ;
   private String Detailwebcomponent_modal_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV33Emprcod ;
   private String sCtrlAV91HreRacabinout ;
   private String sCtrlAV14Fecha ;
   private String sCtrlAV15Fecha_to ;
   private String sCtrlAV55Calculo ;
   private String sCtrlAV8barcod ;
   private String sCtrlAV10barcodreo ;
   private String sCtrlAV9barcodpar ;
   private String sCtrlAV5ArtCod ;
   private String sCtrlAV6ArtCod_to ;
   private String sCtrlAV17ForColNom ;
   private String sCtrlAV18ForColNom_to ;
   private String sCtrlAV20ForColNum ;
   private String sCtrlAV21ForColNum_to ;
   private String sCtrlAV89Clicodinout ;
   private String sCtrlAV90Clicodinout_to ;
   private String sCtrlAV24IntCod ;
   private String sCtrlAV25IntCod_to ;
   private String sCtrlAV27TipArtCod ;
   private String sCtrlAV28TipArtCod_to ;
   private String sCtrlAV30TipColCod ;
   private String sCtrlAV31TipColCod_to ;
   private String sGXsfl_37_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String edtavTablaa_Jsonclick ;
   private String edtavToa_Jsonclick ;
   private String edtavHrefectin_Jsonclick ;
   private String edtavMarca_Jsonclick ;
   private String edtavHdr_Jsonclick ;
   private String edtavBaragrest_Jsonclick ;
   private String edtavHrebarkgm_Jsonclick ;
   private String edtavHretotkgm_Jsonclick ;
   private String edtavHremaqcod_Jsonclick ;
   private String edtavHrevolprd_Jsonclick ;
   private String edtavRb_Jsonclick ;
   private String edtavCostei_Jsonclick ;
   private String edtavCostet_Jsonclick ;
   private String edtavDif_Jsonclick ;
   private String edtavPorc_Jsonclick ;
   private String edtavCostek_Jsonclick ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Jsonclick ;
   private String edtavHrebarser_Jsonclick ;
   private String edtavHrebardsc_Jsonclick ;
   private String edtavHretipartd_Jsonclick ;
   private String edtavHrecolnom_Jsonclick ;
   private String edtavHrecolnum_Jsonclick ;
   private String edtavHretipcoln_Jsonclick ;
   private String edtavHreintdsc_Jsonclick ;
   private String edtavHredti_Jsonclick ;
   private String edtavHredtf_Jsonclick ;
   private String edtavHrebarcod_Jsonclick ;
   private String edtavHrebarpar_Jsonclick ;
   private String edtavHrebarreo_Jsonclick ;
   private String edtavHrenumcie_Jsonclick ;
   private String edtavHrelinmaq_Jsonclick ;
   private String edtavEnccli_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date A10104HreDtf ;
   private java.util.Date A10103HreDti ;
   private java.util.Date AV73HreDti ;
   private java.util.Date AV72HreDtf ;
   private java.util.Date wcpOAV14Fecha ;
   private java.util.Date wcpOAV15Fecha_to ;
   private java.util.Date AV14Fecha ;
   private java.util.Date AV15Fecha_to ;
   private java.util.Date A4529HreFecTin ;
   private java.util.Date AV59HreFecTin ;
   private java.util.Date GXv_date28[] ;
   private java.util.Date GXv_date24[] ;
   private java.util.Date GXv_date19[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n4529HreFecTin ;
   private boolean n9808HreRacab ;
   private boolean n252CliCod ;
   private boolean n4517HreBarSer ;
   private boolean n4519HreTipArt ;
   private boolean n4521HreColNom ;
   private boolean n4522HreColNum ;
   private boolean n4525HreTipCol ;
   private boolean n4539HreIntCod ;
   private boolean n4532HreBarKgm ;
   private boolean n4542HreTotKgm ;
   private boolean n4518HreBarDsc ;
   private boolean n4520HreTipArtD ;
   private boolean n4526HreTipColN ;
   private boolean n4540HreIntDsc ;
   private boolean n10104HreDtf ;
   private boolean n10103HreDti ;
   private boolean n4516HreDisCli ;
   private boolean n11318HreDispCli ;
   private boolean n4547HreVolPrd ;
   private boolean n8602HreCosAA ;
   private boolean n8603HrecosAd ;
   private boolean n8604HreCosAnc ;
   private boolean n8605HreCosCol ;
   private boolean n8606HreCosPA ;
   private boolean n8607HreCosPD ;
   private boolean n4546HreMaqCod ;
   private boolean n9988HreAcKgm ;
   private boolean n9991HreAcCli ;
   private boolean n9992HreAcSer ;
   private boolean n9993HreAcDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean bGXsfl_37_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean brk1FT3 ;
   private String AV43ColumnsSelectorXML ;
   private String AV49ManageFiltersXml ;
   private String AV44UserCustomValue ;
   private String AV41FilterFullText ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private GXWebComponent WebComp_Wwpaux_wc ;
   private com.genexus.webpanels.WebSession AV47Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDetailwebcomponent_modal ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private HTMLChoice cmbavGrupodeacciones ;
   private IDataStoreProvider pr_default ;
   private String[] H01FT2_A396EmprCod ;
   private java.util.Date[] H01FT2_A4529HreFecTin ;
   private boolean[] H01FT2_n4529HreFecTin ;
   private int[] H01FT2_A4547HreVolPrd ;
   private boolean[] H01FT2_n4547HreVolPrd ;
   private java.math.BigDecimal[] H01FT2_A8607HreCosPD ;
   private boolean[] H01FT2_n8607HreCosPD ;
   private java.math.BigDecimal[] H01FT2_A8606HreCosPA ;
   private boolean[] H01FT2_n8606HreCosPA ;
   private java.math.BigDecimal[] H01FT2_A8605HreCosCol ;
   private boolean[] H01FT2_n8605HreCosCol ;
   private java.math.BigDecimal[] H01FT2_A8604HreCosAnc ;
   private boolean[] H01FT2_n8604HreCosAnc ;
   private java.math.BigDecimal[] H01FT2_A8603HrecosAd ;
   private boolean[] H01FT2_n8603HrecosAd ;
   private java.math.BigDecimal[] H01FT2_A8602HreCosAA ;
   private boolean[] H01FT2_n8602HreCosAA ;
   private java.math.BigDecimal[] H01FT2_A4532HreBarKgm ;
   private boolean[] H01FT2_n4532HreBarKgm ;
   private java.math.BigDecimal[] H01FT2_A4542HreTotKgm ;
   private boolean[] H01FT2_n4542HreTotKgm ;
   private String[] H01FT2_A4546HreMaqCod ;
   private boolean[] H01FT2_n4546HreMaqCod ;
   private short[] H01FT2_A4545HreLinMaq ;
   private byte[] H01FT2_A4495HreNumCie ;
   private byte[] H01FT2_A4539HreIntCod ;
   private boolean[] H01FT2_n4539HreIntCod ;
   private byte[] H01FT2_A4525HreTipCol ;
   private boolean[] H01FT2_n4525HreTipCol ;
   private int[] H01FT2_A4522HreColNum ;
   private boolean[] H01FT2_n4522HreColNum ;
   private String[] H01FT2_A4521HreColNom ;
   private boolean[] H01FT2_n4521HreColNom ;
   private short[] H01FT2_A4519HreTipArt ;
   private boolean[] H01FT2_n4519HreTipArt ;
   private String[] H01FT2_A4517HreBarSer ;
   private boolean[] H01FT2_n4517HreBarSer ;
   private int[] H01FT2_A252CliCod ;
   private boolean[] H01FT2_n252CliCod ;
   private String[] H01FT2_A9808HreRacab ;
   private boolean[] H01FT2_n9808HreRacab ;
   private String[] H01FT2_A279CliNom ;
   private String[] H01FT2_A4518HreBarDsc ;
   private boolean[] H01FT2_n4518HreBarDsc ;
   private String[] H01FT2_A4520HreTipArtD ;
   private boolean[] H01FT2_n4520HreTipArtD ;
   private String[] H01FT2_A4526HreTipColN ;
   private boolean[] H01FT2_n4526HreTipColN ;
   private String[] H01FT2_A4540HreIntDsc ;
   private boolean[] H01FT2_n4540HreIntDsc ;
   private java.util.Date[] H01FT2_A10104HreDtf ;
   private boolean[] H01FT2_n10104HreDtf ;
   private java.util.Date[] H01FT2_A10103HreDti ;
   private boolean[] H01FT2_n10103HreDti ;
   private String[] H01FT2_A4516HreDisCli ;
   private boolean[] H01FT2_n4516HreDisCli ;
   private String[] H01FT2_A11318HreDispCli ;
   private boolean[] H01FT2_n11318HreDispCli ;
   private String[] H01FT2_A4494HreBarPar ;
   private byte[] H01FT2_A4493HreBarReo ;
   private int[] H01FT2_A4492HreBarCod ;
   private byte[] H01FT3_A4498HreAgrReo ;
   private String[] H01FT3_A4499HreAgrPar ;
   private String[] H01FT3_A396EmprCod ;
   private int[] H01FT3_A4492HreBarCod ;
   private byte[] H01FT3_A4493HreBarReo ;
   private String[] H01FT3_A4494HreBarPar ;
   private byte[] H01FT3_A4495HreNumCie ;
   private int[] H01FT3_A4497HreAgrCod ;
   private byte[] H01FT4_A9986HreAcReo ;
   private String[] H01FT4_A9987HreAcPar ;
   private String[] H01FT4_A396EmprCod ;
   private int[] H01FT4_A4492HreBarCod ;
   private byte[] H01FT4_A4493HreBarReo ;
   private String[] H01FT4_A4494HreBarPar ;
   private byte[] H01FT4_A4495HreNumCie ;
   private int[] H01FT4_A9985HreAcCod ;
   private byte[] H01FT5_A4550HreLinPro ;
   private String[] H01FT5_A396EmprCod ;
   private int[] H01FT5_A4492HreBarCod ;
   private byte[] H01FT5_A4493HreBarReo ;
   private String[] H01FT5_A4494HreBarPar ;
   private byte[] H01FT5_A4495HreNumCie ;
   private short[] H01FT5_A4545HreLinMaq ;
   private String[] H01FT5_A4551HreProCod ;
   private String[] H01FT5_A4552HreProDsc ;
   private String[] H01FT6_A396EmprCod ;
   private int[] H01FT6_A4492HreBarCod ;
   private byte[] H01FT6_A4493HreBarReo ;
   private String[] H01FT6_A4494HreBarPar ;
   private byte[] H01FT6_A4495HreNumCie ;
   private java.math.BigDecimal[] H01FT6_A4500HreAgrKgm ;
   private String[] H01FT6_A4499HreAgrPar ;
   private byte[] H01FT6_A4498HreAgrReo ;
   private int[] H01FT6_A4503HreAgrCli ;
   private String[] H01FT6_A4504HreAgrSer ;
   private String[] H01FT6_A4505HreAgrDsc ;
   private int[] H01FT6_A4497HreAgrCod ;
   private String[] H01FT7_A396EmprCod ;
   private int[] H01FT7_A4492HreBarCod ;
   private byte[] H01FT7_A4493HreBarReo ;
   private String[] H01FT7_A4494HreBarPar ;
   private byte[] H01FT7_A4495HreNumCie ;
   private java.math.BigDecimal[] H01FT7_A9988HreAcKgm ;
   private boolean[] H01FT7_n9988HreAcKgm ;
   private String[] H01FT7_A9987HreAcPar ;
   private byte[] H01FT7_A9986HreAcReo ;
   private int[] H01FT7_A9991HreAcCli ;
   private boolean[] H01FT7_n9991HreAcCli ;
   private String[] H01FT7_A9992HreAcSer ;
   private boolean[] H01FT7_n9992HreAcSer ;
   private String[] H01FT7_A9993HreAcDsc ;
   private boolean[] H01FT7_n9993HreAcDsc ;
   private int[] H01FT7_A9985HreAcCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV48ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item32 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item33[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV45ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV46ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector30[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector31[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV51DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV39GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState34[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV40GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPContext AV35WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class costesquimicosanalisis_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01FT2", "SELECT T1.EmprCod, T2.HreFecTin, T1.HreVolPrd, T1.HreCosPD, T1.HreCosPA, T1.HreCosCol, T1.HreCosAnc, T1.HrecosAd, T1.HreCosAA, T2.HreBarKgm, T2.HreTotKgm, T1.HreMaqCod, T1.HreLinMaq, T1.HreNumCie, T2.HreIntCod, T2.HreTipCol, T2.HreColNum, T2.HreColNom, T2.HreTipArt, T2.HreBarSer, T2.CliCod, T2.HreRacab, T3.CliNom, T2.HreBarDsc, T2.HreTipArtD, T2.HreTipColN, T2.HreIntDsc, T1.HreDtf, T1.HreDti, T2.HreDisCli, T2.HreDispCli, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod FROM ((TXPHISREM T1 INNER JOIN TXPHISREH T2 ON T2.EmprCod = T1.EmprCod AND T2.HreBarCod = T1.HreBarCod AND T2.HreBarReo = T1.HreBarReo AND T2.HreBarPar = T1.HreBarPar AND T2.HreNumCie = T1.HreNumCie) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) WHERE (T1.EmprCod = ? and T2.HreFecTin >= ?) AND (T2.HreRacab = ? or ? = 'T') AND (T2.CliCod >= ?) AND (T2.CliCod <= ?) AND (T2.HreBarSer >= ?) AND (T2.HreBarSer <= ?) AND (T2.HreTipArt >= ?) AND (T2.HreTipArt <= ?) AND (T2.HreColNom >= ?) AND (T2.HreColNom <= ?) AND (T2.HreColNum >= ?) AND (T2.HreColNum <= ?) AND (T2.HreTipCol >= ?) AND (T2.HreTipCol <= ?) AND (T2.HreIntCod >= ?) AND (T2.HreIntCod <= ?) AND (T1.HreBarCod = ? or (? = 0)) AND (T1.HreBarReo = ? or (? = 0)) AND (T1.HreBarPar = ? or (rtrim(?) IS NULL)) AND (T2.HreFecTin <= ?) ORDER BY T2.HreFecTin, T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.HreLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FT3", "SELECT HreAgrReo, HreAgrPar, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod FROM TXPHISRAG WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FT4", "SELECT HreAcReo, HreAcPar, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod FROM TXPHISHRA WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FT5", "SELECT HreLinPro, EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreProCod, HreProDsc FROM TXPHISREC WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? and HreLinMaq = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FT6", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrKgm, HreAgrPar, HreAgrReo, HreAgrCli, HreAgrSer, HreAgrDsc, HreAgrCod FROM TXPHISRAG WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FT7", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcKgm, HreAcPar, HreAcReo, HreAcCli, HreAcSer, HreAcDsc, HreAcCod FROM TXPHISHRA WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(13);
               ((byte[]) buf[24])[0] = rslt.getByte(14);
               ((byte[]) buf[25])[0] = rslt.getByte(15);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(16);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(17);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 13);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(19);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(20, 16);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(21);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(23, 30);
               ((String[]) buf[42])[0] = rslt.getString(24, 26);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(25, 30);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getString(26, 26);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(27, 30);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[50])[0] = rslt.getGXDateTime(28);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[52])[0] = rslt.getGXDateTime(29);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(30, 8);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getString(31, 20);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getString(32, 1);
               ((byte[]) buf[59])[0] = rslt.getByte(33);
               ((int[]) buf[60])[0] = rslt.getInt(34);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((String[]) buf[8])[0] = rslt.getString(9, 30);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((String[]) buf[10])[0] = rslt.getString(11, 26);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((int[]) buf[9])[0] = rslt.getInt(9);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(10, 16);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 26);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(12);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 16);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setString(11, (String)parms[10], 13);
               stmt.setString(12, (String)parms[11], 13);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setString(23, (String)parms[22], 1);
               stmt.setString(24, (String)parms[23], 1);
               stmt.setDate(25, (java.util.Date)parms[24]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

