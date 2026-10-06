package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webrdtoplanificacion_impl extends GXDataArea
{
   public webrdtoplanificacion_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webrdtoplanificacion_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webrdtoplanificacion_impl.class ));
   }

   public webrdtoplanificacion_impl( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavOpgrid = UIFactory.getCheckbox(this);
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridhdrs") == 0 )
         {
            gxnrgridhdrs_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridhdrs") == 0 )
         {
            gxgrgridhdrs_refresh_invoke( ) ;
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
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_9 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_9"))) ;
      nGXsfl_9_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_9_idx"))) ;
      sGXsfl_9_idx = httpContext.GetPar( "sGXsfl_9_idx") ;
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
      subGridhdrs_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridhdrs_Rows"))) ;
      AV62EmprCod = httpContext.GetPar( "EmprCod") ;
      AV70FecInicio = localUtil.parseDateParm( httpContext.GetPar( "FecInicio")) ;
      AV69FechaFin = localUtil.parseDateParm( httpContext.GetPar( "FechaFin")) ;
      AV165Maqcod1 = httpContext.GetPar( "Maqcod1") ;
      AV166MaqCod10 = httpContext.GetPar( "MaqCod10") ;
      AV167Maqcod11 = httpContext.GetPar( "Maqcod11") ;
      AV168MaqCod12 = httpContext.GetPar( "MaqCod12") ;
      AV169Maqcod13 = httpContext.GetPar( "Maqcod13") ;
      AV170Maqcod14 = httpContext.GetPar( "Maqcod14") ;
      AV171Maqcod15 = httpContext.GetPar( "Maqcod15") ;
      AV172Maqcod16 = httpContext.GetPar( "Maqcod16") ;
      AV173Maqcod17 = httpContext.GetPar( "Maqcod17") ;
      AV174Maqcod18 = httpContext.GetPar( "Maqcod18") ;
      AV175Maqcod19 = httpContext.GetPar( "Maqcod19") ;
      AV176Maqcod2 = httpContext.GetPar( "Maqcod2") ;
      AV177Maqcod20 = httpContext.GetPar( "Maqcod20") ;
      AV178Maqcod21 = httpContext.GetPar( "Maqcod21") ;
      AV179Maqcod22 = httpContext.GetPar( "Maqcod22") ;
      AV180Maqcod23 = httpContext.GetPar( "Maqcod23") ;
      AV181Maqcod24 = httpContext.GetPar( "Maqcod24") ;
      AV182Maqcod25 = httpContext.GetPar( "Maqcod25") ;
      AV183Maqcod26 = httpContext.GetPar( "Maqcod26") ;
      AV184Maqcod27 = httpContext.GetPar( "Maqcod27") ;
      AV185Maqcod28 = httpContext.GetPar( "Maqcod28") ;
      AV186Maqcod3 = httpContext.GetPar( "Maqcod3") ;
      AV187Maqcod4 = httpContext.GetPar( "Maqcod4") ;
      AV188Maqcod5 = httpContext.GetPar( "Maqcod5") ;
      AV189Maqcod6 = httpContext.GetPar( "Maqcod6") ;
      AV190Maqcod7 = httpContext.GetPar( "Maqcod7") ;
      AV191Maqcod8 = httpContext.GetPar( "Maqcod8") ;
      AV192Maqcod9 = httpContext.GetPar( "Maqcod9") ;
      AV225Maqdsc1 = httpContext.GetPar( "Maqdsc1") ;
      AV226Maqdsc10 = httpContext.GetPar( "Maqdsc10") ;
      AV227Maqdsc11 = httpContext.GetPar( "Maqdsc11") ;
      AV228Maqdsc12 = httpContext.GetPar( "Maqdsc12") ;
      AV229Maqdsc13 = httpContext.GetPar( "Maqdsc13") ;
      AV230Maqdsc14 = httpContext.GetPar( "Maqdsc14") ;
      AV231Maqdsc15 = httpContext.GetPar( "Maqdsc15") ;
      AV232MaqDsc16 = httpContext.GetPar( "MaqDsc16") ;
      AV233MaqDsc17 = httpContext.GetPar( "MaqDsc17") ;
      AV234MaqDsc18 = httpContext.GetPar( "MaqDsc18") ;
      AV235MaqDsc19 = httpContext.GetPar( "MaqDsc19") ;
      AV236Maqdsc2 = httpContext.GetPar( "Maqdsc2") ;
      AV237MaqDsc20 = httpContext.GetPar( "MaqDsc20") ;
      AV238MaqDsc21 = httpContext.GetPar( "MaqDsc21") ;
      AV239MaqDsc22 = httpContext.GetPar( "MaqDsc22") ;
      AV240MaqDsc23 = httpContext.GetPar( "MaqDsc23") ;
      AV241MaqDsc24 = httpContext.GetPar( "MaqDsc24") ;
      AV242MaqDsc25 = httpContext.GetPar( "MaqDsc25") ;
      AV243MaqDsc26 = httpContext.GetPar( "MaqDsc26") ;
      AV244MaqDsc27 = httpContext.GetPar( "MaqDsc27") ;
      AV245MaqDsc28 = httpContext.GetPar( "MaqDsc28") ;
      AV246Maqdsc3 = httpContext.GetPar( "Maqdsc3") ;
      AV247Maqdsc4 = httpContext.GetPar( "Maqdsc4") ;
      AV248Maqdsc5 = httpContext.GetPar( "Maqdsc5") ;
      AV249Maqdsc6 = httpContext.GetPar( "Maqdsc6") ;
      AV250Maqdsc7 = httpContext.GetPar( "Maqdsc7") ;
      AV251Maqdsc8 = httpContext.GetPar( "Maqdsc8") ;
      AV252Maqdsc9 = httpContext.GetPar( "Maqdsc9") ;
      AV337t = (short)(GXutil.lval( httpContext.GetPar( "t"))) ;
      AV164Maqcod = httpContext.GetPar( "Maqcod") ;
      AV41Barordlin = (short)(GXutil.lval( httpContext.GetPar( "Barordlin"))) ;
      AV30Barfasestant = (byte)(GXutil.lval( httpContext.GetPar( "Barfasestant"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV10Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV18Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV14Barcodpar = httpContext.GetPar( "Barcodpar") ;
      A150BarFacTin = httpContext.GetPar( "BarFacTin") ;
      A153BarFasEst = (byte)(GXutil.lval( httpContext.GetPar( "BarFasEst"))) ;
      A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
      AV88Hdr2 = httpContext.GetPar( "Hdr2") ;
      AV8B2 = (short)(GXutil.lval( httpContext.GetPar( "B2"))) ;
      AV75G2 = (short)(GXutil.lval( httpContext.GetPar( "G2"))) ;
      AV300R2 = (short)(GXutil.lval( httpContext.GetPar( "R2"))) ;
      AV67Fec2 = localUtil.parseDateParm( httpContext.GetPar( "Fec2")) ;
      AV66Fec1 = localUtil.parseDateParm( httpContext.GetPar( "Fec1")) ;
      AV52CliCodIN = (int)(GXutil.lval( httpContext.GetPar( "CliCodIN"))) ;
      AV23BarColNomIn = httpContext.GetPar( "BarColNomIn") ;
      AV26BarEnccliIN = httpContext.GetPar( "BarEnccliIN") ;
      AV12BarcodIn = (int)(GXutil.lval( httpContext.GetPar( "BarcodIn"))) ;
      AV20BarcodreoIN = (byte)(GXutil.lval( httpContext.GetPar( "BarcodreoIN"))) ;
      AV16BarcodparIN = httpContext.GetPar( "BarcodparIN") ;
      AV65EstadoFaseHdr = (byte)(GXutil.lval( httpContext.GetPar( "EstadoFaseHdr"))) ;
      AV33BarFasEstSig = (byte)(GXutil.lval( httpContext.GetPar( "BarFasEstSig"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, subGridhdrs_Rows, AV62EmprCod, AV70FecInicio, AV69FechaFin, AV165Maqcod1, AV166MaqCod10, AV167Maqcod11, AV168MaqCod12, AV169Maqcod13, AV170Maqcod14, AV171Maqcod15, AV172Maqcod16, AV173Maqcod17, AV174Maqcod18, AV175Maqcod19, AV176Maqcod2, AV177Maqcod20, AV178Maqcod21, AV179Maqcod22, AV180Maqcod23, AV181Maqcod24, AV182Maqcod25, AV183Maqcod26, AV184Maqcod27, AV185Maqcod28, AV186Maqcod3, AV187Maqcod4, AV188Maqcod5, AV189Maqcod6, AV190Maqcod7, AV191Maqcod8, AV192Maqcod9, AV225Maqdsc1, AV226Maqdsc10, AV227Maqdsc11, AV228Maqdsc12, AV229Maqdsc13, AV230Maqdsc14, AV231Maqdsc15, AV232MaqDsc16, AV233MaqDsc17, AV234MaqDsc18, AV235MaqDsc19, AV236Maqdsc2, AV237MaqDsc20, AV238MaqDsc21, AV239MaqDsc22, AV240MaqDsc23, AV241MaqDsc24, AV242MaqDsc25, AV243MaqDsc26, AV244MaqDsc27, AV245MaqDsc28, AV246Maqdsc3, AV247Maqdsc4, AV248Maqdsc5, AV249Maqdsc6, AV250Maqdsc7, AV251Maqdsc8, AV252Maqdsc9, AV337t, AV164Maqcod, AV41Barordlin, AV30Barfasestant, A396EmprCod, A129BarCod, AV10Barcod, A132BarCodReo, AV18Barcodreo, A130BarCodPar, AV14Barcodpar, A150BarFacTin, A153BarFasEst, A194BarOrdLin, AV88Hdr2, AV8B2, AV75G2, AV300R2, AV67Fec2, AV66Fec1, AV52CliCodIN, AV23BarColNomIn, AV26BarEnccliIN, AV12BarcodIn, AV20BarcodreoIN, AV16BarcodparIN, AV65EstadoFaseHdr, AV33BarFasEstSig) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void gxnrgridhdrs_newrow_invoke( )
   {
      nRC_GXsfl_71 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_71"))) ;
      nGXsfl_71_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_71_idx"))) ;
      sGXsfl_71_idx = httpContext.GetPar( "sGXsfl_71_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridhdrs_newrow( ) ;
      /* End function gxnrGridhdrs_newrow_invoke */
   }

   public void gxgrgridhdrs_refresh_invoke( )
   {
      subGrid_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid_Rows"))) ;
      subGridhdrs_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridhdrs_Rows"))) ;
      AV62EmprCod = httpContext.GetPar( "EmprCod") ;
      AV70FecInicio = localUtil.parseDateParm( httpContext.GetPar( "FecInicio")) ;
      AV69FechaFin = localUtil.parseDateParm( httpContext.GetPar( "FechaFin")) ;
      AV165Maqcod1 = httpContext.GetPar( "Maqcod1") ;
      AV166MaqCod10 = httpContext.GetPar( "MaqCod10") ;
      AV167Maqcod11 = httpContext.GetPar( "Maqcod11") ;
      AV168MaqCod12 = httpContext.GetPar( "MaqCod12") ;
      AV169Maqcod13 = httpContext.GetPar( "Maqcod13") ;
      AV170Maqcod14 = httpContext.GetPar( "Maqcod14") ;
      AV171Maqcod15 = httpContext.GetPar( "Maqcod15") ;
      AV172Maqcod16 = httpContext.GetPar( "Maqcod16") ;
      AV173Maqcod17 = httpContext.GetPar( "Maqcod17") ;
      AV174Maqcod18 = httpContext.GetPar( "Maqcod18") ;
      AV175Maqcod19 = httpContext.GetPar( "Maqcod19") ;
      AV176Maqcod2 = httpContext.GetPar( "Maqcod2") ;
      AV177Maqcod20 = httpContext.GetPar( "Maqcod20") ;
      AV178Maqcod21 = httpContext.GetPar( "Maqcod21") ;
      AV179Maqcod22 = httpContext.GetPar( "Maqcod22") ;
      AV180Maqcod23 = httpContext.GetPar( "Maqcod23") ;
      AV181Maqcod24 = httpContext.GetPar( "Maqcod24") ;
      AV182Maqcod25 = httpContext.GetPar( "Maqcod25") ;
      AV183Maqcod26 = httpContext.GetPar( "Maqcod26") ;
      AV184Maqcod27 = httpContext.GetPar( "Maqcod27") ;
      AV185Maqcod28 = httpContext.GetPar( "Maqcod28") ;
      AV186Maqcod3 = httpContext.GetPar( "Maqcod3") ;
      AV187Maqcod4 = httpContext.GetPar( "Maqcod4") ;
      AV188Maqcod5 = httpContext.GetPar( "Maqcod5") ;
      AV189Maqcod6 = httpContext.GetPar( "Maqcod6") ;
      AV190Maqcod7 = httpContext.GetPar( "Maqcod7") ;
      AV191Maqcod8 = httpContext.GetPar( "Maqcod8") ;
      AV192Maqcod9 = httpContext.GetPar( "Maqcod9") ;
      AV225Maqdsc1 = httpContext.GetPar( "Maqdsc1") ;
      AV226Maqdsc10 = httpContext.GetPar( "Maqdsc10") ;
      AV227Maqdsc11 = httpContext.GetPar( "Maqdsc11") ;
      AV228Maqdsc12 = httpContext.GetPar( "Maqdsc12") ;
      AV229Maqdsc13 = httpContext.GetPar( "Maqdsc13") ;
      AV230Maqdsc14 = httpContext.GetPar( "Maqdsc14") ;
      AV231Maqdsc15 = httpContext.GetPar( "Maqdsc15") ;
      AV232MaqDsc16 = httpContext.GetPar( "MaqDsc16") ;
      AV233MaqDsc17 = httpContext.GetPar( "MaqDsc17") ;
      AV234MaqDsc18 = httpContext.GetPar( "MaqDsc18") ;
      AV235MaqDsc19 = httpContext.GetPar( "MaqDsc19") ;
      AV236Maqdsc2 = httpContext.GetPar( "Maqdsc2") ;
      AV237MaqDsc20 = httpContext.GetPar( "MaqDsc20") ;
      AV238MaqDsc21 = httpContext.GetPar( "MaqDsc21") ;
      AV239MaqDsc22 = httpContext.GetPar( "MaqDsc22") ;
      AV240MaqDsc23 = httpContext.GetPar( "MaqDsc23") ;
      AV241MaqDsc24 = httpContext.GetPar( "MaqDsc24") ;
      AV242MaqDsc25 = httpContext.GetPar( "MaqDsc25") ;
      AV243MaqDsc26 = httpContext.GetPar( "MaqDsc26") ;
      AV244MaqDsc27 = httpContext.GetPar( "MaqDsc27") ;
      AV245MaqDsc28 = httpContext.GetPar( "MaqDsc28") ;
      AV246Maqdsc3 = httpContext.GetPar( "Maqdsc3") ;
      AV247Maqdsc4 = httpContext.GetPar( "Maqdsc4") ;
      AV248Maqdsc5 = httpContext.GetPar( "Maqdsc5") ;
      AV249Maqdsc6 = httpContext.GetPar( "Maqdsc6") ;
      AV250Maqdsc7 = httpContext.GetPar( "Maqdsc7") ;
      AV251Maqdsc8 = httpContext.GetPar( "Maqdsc8") ;
      AV252Maqdsc9 = httpContext.GetPar( "Maqdsc9") ;
      AV337t = (short)(GXutil.lval( httpContext.GetPar( "t"))) ;
      AV164Maqcod = httpContext.GetPar( "Maqcod") ;
      AV41Barordlin = (short)(GXutil.lval( httpContext.GetPar( "Barordlin"))) ;
      AV30Barfasestant = (byte)(GXutil.lval( httpContext.GetPar( "Barfasestant"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV10Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV18Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV14Barcodpar = httpContext.GetPar( "Barcodpar") ;
      A150BarFacTin = httpContext.GetPar( "BarFacTin") ;
      A153BarFasEst = (byte)(GXutil.lval( httpContext.GetPar( "BarFasEst"))) ;
      A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
      AV67Fec2 = localUtil.parseDateParm( httpContext.GetPar( "Fec2")) ;
      A159BarFecGen = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen")) ;
      A180BarMaqCod = httpContext.GetPar( "BarMaqCod") ;
      A213BarSit = (byte)(GXutil.lval( httpContext.GetPar( "BarSit"))) ;
      AV66Fec1 = localUtil.parseDateParm( httpContext.GetPar( "Fec1")) ;
      A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      n252CliCod = false ;
      AV52CliCodIN = (int)(GXutil.lval( httpContext.GetPar( "CliCodIN"))) ;
      A135BarColNom = httpContext.GetPar( "BarColNom") ;
      AV23BarColNomIn = httpContext.GetPar( "BarColNomIn") ;
      A143BarDisNum = httpContext.GetPar( "BarDisNum") ;
      A4812BarEncCli = httpContext.GetPar( "BarEncCli") ;
      AV26BarEnccliIN = httpContext.GetPar( "BarEnccliIN") ;
      AV12BarcodIn = (int)(GXutil.lval( httpContext.GetPar( "BarcodIn"))) ;
      AV20BarcodreoIN = (byte)(GXutil.lval( httpContext.GetPar( "BarcodreoIN"))) ;
      AV16BarcodparIN = httpContext.GetPar( "BarcodparIN") ;
      A120BarAgrEst = httpContext.GetPar( "BarAgrEst") ;
      AV65EstadoFaseHdr = (byte)(GXutil.lval( httpContext.GetPar( "EstadoFaseHdr"))) ;
      AV33BarFasEstSig = (byte)(GXutil.lval( httpContext.GetPar( "BarFasEstSig"))) ;
      A1652BarSerDsc = httpContext.GetPar( "BarSerDsc") ;
      A212BarSer = httpContext.GetPar( "BarSer") ;
      A136BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
      A166BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
      A812RecTotKgm = CommonUtil.decimalVal( httpContext.GetPar( "RecTotKgm"), ".") ;
      A279CliNom = httpContext.GetPar( "CliNom") ;
      A158BarFecFpr = localUtil.parseDateParm( httpContext.GetPar( "BarFecFpr")) ;
      A1234BarNomCli = httpContext.GetPar( "BarNomCli") ;
      A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
      A218BarTipCol = (byte)(GXutil.lval( httpContext.GetPar( "BarTipCol"))) ;
      A13234BarRGB = GXutil.lval( httpContext.GetPar( "BarRGB")) ;
      AV8B2 = (short)(GXutil.lval( httpContext.GetPar( "B2"))) ;
      AV75G2 = (short)(GXutil.lval( httpContext.GetPar( "G2"))) ;
      AV300R2 = (short)(GXutil.lval( httpContext.GetPar( "R2"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridhdrs_refresh( subGrid_Rows, subGridhdrs_Rows, AV62EmprCod, AV70FecInicio, AV69FechaFin, AV165Maqcod1, AV166MaqCod10, AV167Maqcod11, AV168MaqCod12, AV169Maqcod13, AV170Maqcod14, AV171Maqcod15, AV172Maqcod16, AV173Maqcod17, AV174Maqcod18, AV175Maqcod19, AV176Maqcod2, AV177Maqcod20, AV178Maqcod21, AV179Maqcod22, AV180Maqcod23, AV181Maqcod24, AV182Maqcod25, AV183Maqcod26, AV184Maqcod27, AV185Maqcod28, AV186Maqcod3, AV187Maqcod4, AV188Maqcod5, AV189Maqcod6, AV190Maqcod7, AV191Maqcod8, AV192Maqcod9, AV225Maqdsc1, AV226Maqdsc10, AV227Maqdsc11, AV228Maqdsc12, AV229Maqdsc13, AV230Maqdsc14, AV231Maqdsc15, AV232MaqDsc16, AV233MaqDsc17, AV234MaqDsc18, AV235MaqDsc19, AV236Maqdsc2, AV237MaqDsc20, AV238MaqDsc21, AV239MaqDsc22, AV240MaqDsc23, AV241MaqDsc24, AV242MaqDsc25, AV243MaqDsc26, AV244MaqDsc27, AV245MaqDsc28, AV246Maqdsc3, AV247Maqdsc4, AV248Maqdsc5, AV249Maqdsc6, AV250Maqdsc7, AV251Maqdsc8, AV252Maqdsc9, AV337t, AV164Maqcod, AV41Barordlin, AV30Barfasestant, A396EmprCod, A129BarCod, AV10Barcod, A132BarCodReo, AV18Barcodreo, A130BarCodPar, AV14Barcodpar, A150BarFacTin, A153BarFasEst, A194BarOrdLin, AV67Fec2, A159BarFecGen, A180BarMaqCod, A213BarSit, AV66Fec1, A252CliCod, AV52CliCodIN, A135BarColNom, AV23BarColNomIn, A143BarDisNum, A4812BarEncCli, AV26BarEnccliIN, AV12BarcodIn, AV20BarcodreoIN, AV16BarcodparIN, A120BarAgrEst, AV65EstadoFaseHdr, AV33BarFasEstSig, A1652BarSerDsc, A212BarSer, A136BarColNum, A166BarKgm, A812RecTotKgm, A279CliNom, A158BarFecFpr, A1234BarNomCli, A361DisCod, A218BarTipCol, A13234BarRGB, AV8B2, AV75G2, AV300R2) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridhdrs_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
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

   public byte executeStartEvent( )
   {
      paAU2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startAU2( ) ;
      }
      return gxajaxcallmode ;
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
      if ( nGXWrapped != 1 )
      {
         MasterPageObj.master_styles();
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
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"true\"" : "") ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      if ( nGXWrapped == 0 )
      {
         bodyStyle += "-moz-opacity:0;opacity:0;" ;
      }
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webrdtoplanificacion", new String[] {}, new String[] {}) +"\">") ;
         app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
         httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      }
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECINICIO", getSecureSignedToken( "", AV70FecInicio));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECHAFIN", getSecureSignedToken( "", AV69FechaFin));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV165Maqcod1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD10", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV166MaqCod10, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD11", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV167Maqcod11, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD12", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV168MaqCod12, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD13", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV169Maqcod13, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD14", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV170Maqcod14, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD15", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV171Maqcod15, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD16", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV172Maqcod16, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD17", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV173Maqcod17, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD18", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV174Maqcod18, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD19", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV175Maqcod19, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV176Maqcod2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD20", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV177Maqcod20, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD21", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV178Maqcod21, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD22", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV179Maqcod22, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD23", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV180Maqcod23, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD24", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV181Maqcod24, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD25", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV182Maqcod25, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD26", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV183Maqcod26, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD27", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV184Maqcod27, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD28", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV185Maqcod28, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV186Maqcod3, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD4", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV187Maqcod4, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD5", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV188Maqcod5, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD6", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV189Maqcod6, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD7", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV190Maqcod7, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD8", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV191Maqcod8, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD9", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV192Maqcod9, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV225Maqdsc1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC10", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV226Maqdsc10, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC11", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV227Maqdsc11, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC12", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV228Maqdsc12, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC13", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV229Maqdsc13, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC14", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV230Maqdsc14, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC15", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV231Maqdsc15, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC16", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV232MaqDsc16, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC17", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV233MaqDsc17, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC18", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV234MaqDsc18, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC19", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV235MaqDsc19, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV236Maqdsc2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC20", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV237MaqDsc20, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC21", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV238MaqDsc21, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC22", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV239MaqDsc22, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC23", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV240MaqDsc23, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC24", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV241MaqDsc24, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC25", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV242MaqDsc25, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC26", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV243MaqDsc26, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC27", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV244MaqDsc27, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC28", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV245MaqDsc28, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV246Maqdsc3, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC4", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV247Maqdsc4, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC5", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV248Maqdsc5, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC6", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV249Maqdsc6, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC7", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV250Maqdsc7, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC8", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV251Maqdsc8, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC9", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV252Maqdsc9, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV337t), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV164Maqcod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Barordlin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASESTANT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30Barfasestant), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14Barcodpar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vB2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8B2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vG2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV75G2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vR2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV300R2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFEC2", getSecureSignedToken( "", AV67Fec2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFEC1", getSecureSignedToken( "", AV66Fec1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV52CliCodIN), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOMIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23BarColNomIn, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARENCCLIIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26BarEnccliIN, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12BarcodIn), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREOIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20BarcodreoIN), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPARIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16BarcodparIN, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vESTADOFASEHDR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV65EstadoFaseHdr), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASESTSIG", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33BarFasEstSig), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_9", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_9, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_71", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_71, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV62EmprCod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTAB_MAQ", AV339Tab_maq);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTAB_MAQ", AV339Tab_maq);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vFECINICIO", localUtil.dtoc( AV70FecInicio, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECINICIO", getSecureSignedToken( "", AV70FecInicio));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECHAFIN", localUtil.dtoc( AV69FechaFin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECHAFIN", getSecureSignedToken( "", AV69FechaFin));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD1", GXutil.rtrim( AV165Maqcod1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV165Maqcod1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD10", GXutil.rtrim( AV166MaqCod10));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD10", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV166MaqCod10, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD11", GXutil.rtrim( AV167Maqcod11));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD11", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV167Maqcod11, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD12", GXutil.rtrim( AV168MaqCod12));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD12", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV168MaqCod12, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD13", GXutil.rtrim( AV169Maqcod13));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD13", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV169Maqcod13, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD14", GXutil.rtrim( AV170Maqcod14));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD14", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV170Maqcod14, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD15", GXutil.rtrim( AV171Maqcod15));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD15", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV171Maqcod15, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD16", GXutil.rtrim( AV172Maqcod16));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD16", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV172Maqcod16, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD17", GXutil.rtrim( AV173Maqcod17));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD17", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV173Maqcod17, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD18", GXutil.rtrim( AV174Maqcod18));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD18", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV174Maqcod18, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD19", GXutil.rtrim( AV175Maqcod19));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD19", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV175Maqcod19, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD2", GXutil.rtrim( AV176Maqcod2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV176Maqcod2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD20", GXutil.rtrim( AV177Maqcod20));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD20", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV177Maqcod20, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD21", GXutil.rtrim( AV178Maqcod21));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD21", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV178Maqcod21, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD22", GXutil.rtrim( AV179Maqcod22));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD22", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV179Maqcod22, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD23", GXutil.rtrim( AV180Maqcod23));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD23", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV180Maqcod23, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD24", GXutil.rtrim( AV181Maqcod24));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD24", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV181Maqcod24, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD25", GXutil.rtrim( AV182Maqcod25));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD25", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV182Maqcod25, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD26", GXutil.rtrim( AV183Maqcod26));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD26", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV183Maqcod26, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD27", GXutil.rtrim( AV184Maqcod27));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD27", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV184Maqcod27, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD28", GXutil.rtrim( AV185Maqcod28));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD28", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV185Maqcod28, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD3", GXutil.rtrim( AV186Maqcod3));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV186Maqcod3, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD4", GXutil.rtrim( AV187Maqcod4));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD4", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV187Maqcod4, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD5", GXutil.rtrim( AV188Maqcod5));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD5", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV188Maqcod5, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD6", GXutil.rtrim( AV189Maqcod6));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD6", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV189Maqcod6, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD7", GXutil.rtrim( AV190Maqcod7));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD7", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV190Maqcod7, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD8", GXutil.rtrim( AV191Maqcod8));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD8", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV191Maqcod8, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD9", GXutil.rtrim( AV192Maqcod9));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD9", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV192Maqcod9, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC1", GXutil.rtrim( AV225Maqdsc1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV225Maqdsc1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC10", GXutil.rtrim( AV226Maqdsc10));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC10", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV226Maqdsc10, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC11", GXutil.rtrim( AV227Maqdsc11));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC11", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV227Maqdsc11, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC12", GXutil.rtrim( AV228Maqdsc12));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC12", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV228Maqdsc12, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC13", GXutil.rtrim( AV229Maqdsc13));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC13", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV229Maqdsc13, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC14", GXutil.rtrim( AV230Maqdsc14));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC14", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV230Maqdsc14, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC15", GXutil.rtrim( AV231Maqdsc15));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC15", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV231Maqdsc15, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC16", GXutil.rtrim( AV232MaqDsc16));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC16", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV232MaqDsc16, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC17", GXutil.rtrim( AV233MaqDsc17));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC17", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV233MaqDsc17, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC18", GXutil.rtrim( AV234MaqDsc18));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC18", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV234MaqDsc18, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC19", GXutil.rtrim( AV235MaqDsc19));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC19", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV235MaqDsc19, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC2", GXutil.rtrim( AV236Maqdsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV236Maqdsc2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC20", GXutil.rtrim( AV237MaqDsc20));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC20", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV237MaqDsc20, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC21", GXutil.rtrim( AV238MaqDsc21));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC21", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV238MaqDsc21, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC22", GXutil.rtrim( AV239MaqDsc22));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC22", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV239MaqDsc22, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC23", GXutil.rtrim( AV240MaqDsc23));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC23", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV240MaqDsc23, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC24", GXutil.rtrim( AV241MaqDsc24));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC24", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV241MaqDsc24, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC25", GXutil.rtrim( AV242MaqDsc25));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC25", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV242MaqDsc25, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC26", GXutil.rtrim( AV243MaqDsc26));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC26", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV243MaqDsc26, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC27", GXutil.rtrim( AV244MaqDsc27));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC27", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV244MaqDsc27, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC28", GXutil.rtrim( AV245MaqDsc28));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC28", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV245MaqDsc28, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC3", GXutil.rtrim( AV246Maqdsc3));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV246Maqdsc3, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC4", GXutil.rtrim( AV247Maqdsc4));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC4", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV247Maqdsc4, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC5", GXutil.rtrim( AV248Maqdsc5));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC5", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV248Maqdsc5, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC6", GXutil.rtrim( AV249Maqdsc6));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC6", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV249Maqdsc6, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC7", GXutil.rtrim( AV250Maqdsc7));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC7", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV250Maqdsc7, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC8", GXutil.rtrim( AV251Maqdsc8));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC8", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV251Maqdsc8, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC9", GXutil.rtrim( AV252Maqdsc9));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC9", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV252Maqdsc9, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQHDRS", AV253MaqHdrs);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQHDRS", AV253MaqHdrs);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vT", GXutil.ltrim( localUtil.ntoc( AV337t, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV337t), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD", GXutil.rtrim( AV164Maqcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV164Maqcod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV41Barordlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Barordlin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFASESTANT", GXutil.ltrim( localUtil.ntoc( AV30Barfasestant, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASESTANT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30Barfasestant), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV10Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV18Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV14Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14Barcodpar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFACTIN", GXutil.rtrim( A150BarFacTin));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASEST", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARORDLIN", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vB2", GXutil.ltrim( localUtil.ntoc( AV8B2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vB2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8B2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vG2", GXutil.ltrim( localUtil.ntoc( AV75G2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vG2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV75G2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vR2", GXutil.ltrim( localUtil.ntoc( AV300R2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vR2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV300R2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQUINASTXT", AV256Maquinastxt);
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQUINASHDRSTXT", AV255MaquinasHdrstxt);
      app.GxWebStd.gx_hidden_field( httpContext, "vNOSPMAQ", GXutil.ltrim( localUtil.ntoc( AV265NospMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFILENAME", GXutil.rtrim( AV72Filename));
      app.GxWebStd.gx_hidden_field( httpContext, "vFEC2", localUtil.dtoc( AV67Fec2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFEC2", getSecureSignedToken( "", AV67Fec2));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFECGEN", localUtil.dtoc( A159BarFecGen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQCOD", GXutil.rtrim( A180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSIT", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFEC1", localUtil.dtoc( AV66Fec1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFEC1", getSecureSignedToken( "", AV66Fec1));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICODIN", GXutil.ltrim( localUtil.ntoc( AV52CliCodIN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV52CliCodIN), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNOM", GXutil.rtrim( A135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNOMIN", GXutil.rtrim( AV23BarColNomIn));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOMIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23BarColNomIn, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARDISNUM", GXutil.rtrim( A143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "BARENCCLI", GXutil.rtrim( A4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARENCCLIIN", GXutil.rtrim( AV26BarEnccliIN));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARENCCLIIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26BarEnccliIN, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODIN", GXutil.ltrim( localUtil.ntoc( AV12BarcodIn, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12BarcodIn), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREOIN", GXutil.ltrim( localUtil.ntoc( AV20BarcodreoIN, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREOIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20BarcodreoIN), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPARIN", GXutil.rtrim( AV16BarcodparIN));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPARIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16BarcodparIN, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGREST", GXutil.rtrim( A120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "vESTADOFASEHDR", GXutil.ltrim( localUtil.ntoc( AV65EstadoFaseHdr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vESTADOFASEHDR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV65EstadoFaseHdr), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFASESTSIG", GXutil.ltrim( localUtil.ntoc( AV33BarFasEstSig, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASESTSIG", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33BarFasEstSig), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSERDSC", GXutil.rtrim( A1652BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSER", GXutil.rtrim( A212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNUM", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARKGM", GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECTOTKGM", GXutil.ltrim( localUtil.ntoc( A812RecTotKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFECFPR", localUtil.dtoc( A158BarFecFpr, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNOMCLI", GXutil.rtrim( A1234BarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTIPCOL", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARRGB", GXutil.ltrim( localUtil.ntoc( A13234BarRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCODPLN", GXutil.rtrim( AV195MaqCodPln));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDHDRS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDHDRS_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDHDRS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDHDRS_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vARCHIVO_Eof", GXutil.booltostr( AV5Archivo.getEof()));
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
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "</form>") ;
      }
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

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         weAU2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtAU2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return false ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.webrdtoplanificacion", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WebRdtoPlanificacion" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Programacion Tinte Validacion NE", "") ;
   }

   public void wbAU0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( nGXWrapped == 1 )
         {
            renderHtmlHeaders( ) ;
            renderHtmlOpenForm( ) ;
         }
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", "", "false");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_6_AU2( true) ;
      }
      else
      {
         wb_table1_6_AU2( false) ;
      }
      return  ;
   }

   public void wb_table1_6_AU2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_68_AU2( true) ;
      }
      else
      {
         wb_table2_68_AU2( false) ;
      }
      return  ;
   }

   public void wb_table2_68_AU2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table3_89_AU2( true) ;
      }
      else
      {
         wb_table3_89_AU2( false) ;
      }
      return  ;
   }

   public void wb_table3_89_AU2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 9 )
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
               GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
               GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer, subGrid_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      if ( wbEnd == 71 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridhdrsContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               GridhdrsContainer.AddObjectProperty("GRIDHDRS_nEOF", GRIDHDRS_nEOF);
               GridhdrsContainer.AddObjectProperty("GRIDHDRS_nFirstRecordOnPage", GRIDHDRS_nFirstRecordOnPage);
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"GridhdrsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Gridhdrs", GridhdrsContainer, subGridhdrs_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridhdrsContainerData", GridhdrsContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridhdrsContainerData"+"V", GridhdrsContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridhdrsContainerData"+"V"+"\" value='"+GridhdrsContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void startAU2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
         }
         Form.getMeta().addItem("description", httpContext.getMessage( "Programacion Tinte Validacion NE", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupAU0( ) ;
   }

   public void wsAU2( )
   {
      startAU2( ) ;
      evtAU2( ) ;
   }

   public void evtAU2( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
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
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRIDPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid_lastpage( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDHDRSPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRIDHDRSPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgridhdrs_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgridhdrs_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgridhdrs_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgridhdrs_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 14), "'EXPORTAR RTF'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_9_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_9_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_9_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_92( ) ;
                           AV77Hdr1 = httpContext.cgiGet( edtavHdr1_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr1_Internalname, AV77Hdr1);
                           AV88Hdr2 = httpContext.cgiGet( edtavHdr2_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr2_Internalname, AV88Hdr2);
                           AV98Hdr3 = httpContext.cgiGet( edtavHdr3_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr3_Internalname, AV98Hdr3);
                           AV99Hdr4 = httpContext.cgiGet( edtavHdr4_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr4_Internalname, AV99Hdr4);
                           AV100Hdr5 = httpContext.cgiGet( edtavHdr5_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr5_Internalname, AV100Hdr5);
                           AV101Hdr6 = httpContext.cgiGet( edtavHdr6_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr6_Internalname, AV101Hdr6);
                           AV102Hdr7 = httpContext.cgiGet( edtavHdr7_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr7_Internalname, AV102Hdr7);
                           AV103Hdr8 = httpContext.cgiGet( edtavHdr8_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr8_Internalname, AV103Hdr8);
                           AV104Hdr9 = httpContext.cgiGet( edtavHdr9_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr9_Internalname, AV104Hdr9);
                           AV78Hdr10 = httpContext.cgiGet( edtavHdr10_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr10_Internalname, AV78Hdr10);
                           AV79Hdr11 = httpContext.cgiGet( edtavHdr11_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr11_Internalname, AV79Hdr11);
                           AV80Hdr12 = httpContext.cgiGet( edtavHdr12_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr12_Internalname, AV80Hdr12);
                           AV81Hdr13 = httpContext.cgiGet( edtavHdr13_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr13_Internalname, AV81Hdr13);
                           AV82Hdr14 = httpContext.cgiGet( edtavHdr14_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr14_Internalname, AV82Hdr14);
                           AV83Hdr15 = httpContext.cgiGet( edtavHdr15_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr15_Internalname, AV83Hdr15);
                           AV84Hdr16 = httpContext.cgiGet( edtavHdr16_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr16_Internalname, AV84Hdr16);
                           AV85Hdr17 = httpContext.cgiGet( edtavHdr17_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr17_Internalname, AV85Hdr17);
                           AV86Hdr18 = httpContext.cgiGet( edtavHdr18_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr18_Internalname, AV86Hdr18);
                           AV87Hdr19 = httpContext.cgiGet( edtavHdr19_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr19_Internalname, AV87Hdr19);
                           AV89Hdr20 = httpContext.cgiGet( edtavHdr20_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr20_Internalname, AV89Hdr20);
                           AV90Hdr21 = httpContext.cgiGet( edtavHdr21_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr21_Internalname, AV90Hdr21);
                           AV91Hdr22 = httpContext.cgiGet( edtavHdr22_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr22_Internalname, AV91Hdr22);
                           AV92Hdr23 = httpContext.cgiGet( edtavHdr23_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr23_Internalname, AV92Hdr23);
                           AV93Hdr24 = httpContext.cgiGet( edtavHdr24_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr24_Internalname, AV93Hdr24);
                           AV94Hdr25 = httpContext.cgiGet( edtavHdr25_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr25_Internalname, AV94Hdr25);
                           AV95Hdr26 = httpContext.cgiGet( edtavHdr26_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr26_Internalname, AV95Hdr26);
                           AV96Hdr27 = httpContext.cgiGet( edtavHdr27_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr27_Internalname, AV96Hdr27);
                           AV97Hdr28 = httpContext.cgiGet( edtavHdr28_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdr28_Internalname, AV97Hdr28);
                           AV112Linea1 = httpContext.cgiGet( edtavLinea1_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea1_Internalname, AV112Linea1);
                           AV123Linea2 = httpContext.cgiGet( edtavLinea2_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea2_Internalname, AV123Linea2);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLINEA2"+"_"+sGXsfl_9_idx, getSecureSignedToken( sGXsfl_9_idx, GXutil.rtrim( localUtil.format( AV123Linea2, ""))));
                           AV133Linea3 = httpContext.cgiGet( edtavLinea3_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea3_Internalname, AV133Linea3);
                           AV134Linea4 = httpContext.cgiGet( edtavLinea4_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea4_Internalname, AV134Linea4);
                           AV135Linea5 = httpContext.cgiGet( edtavLinea5_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea5_Internalname, AV135Linea5);
                           AV136Linea6 = httpContext.cgiGet( edtavLinea6_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea6_Internalname, AV136Linea6);
                           AV137Linea7 = httpContext.cgiGet( edtavLinea7_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea7_Internalname, AV137Linea7);
                           AV138LInea8 = httpContext.cgiGet( edtavLinea8_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea8_Internalname, AV138LInea8);
                           AV139Linea9 = httpContext.cgiGet( edtavLinea9_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea9_Internalname, AV139Linea9);
                           AV113Linea10 = httpContext.cgiGet( edtavLinea10_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea10_Internalname, AV113Linea10);
                           AV114Linea11 = httpContext.cgiGet( edtavLinea11_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea11_Internalname, AV114Linea11);
                           AV115Linea12 = httpContext.cgiGet( edtavLinea12_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea12_Internalname, AV115Linea12);
                           AV116Linea13 = httpContext.cgiGet( edtavLinea13_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea13_Internalname, AV116Linea13);
                           AV117Linea14 = httpContext.cgiGet( edtavLinea14_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea14_Internalname, AV117Linea14);
                           AV118Linea15 = httpContext.cgiGet( edtavLinea15_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea15_Internalname, AV118Linea15);
                           AV119Linea16 = httpContext.cgiGet( edtavLinea16_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea16_Internalname, AV119Linea16);
                           AV120Linea17 = httpContext.cgiGet( edtavLinea17_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea17_Internalname, AV120Linea17);
                           AV121Linea18 = httpContext.cgiGet( edtavLinea18_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea18_Internalname, AV121Linea18);
                           AV122Linea19 = httpContext.cgiGet( edtavLinea19_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea19_Internalname, AV122Linea19);
                           AV124Linea20 = httpContext.cgiGet( edtavLinea20_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea20_Internalname, AV124Linea20);
                           AV125Linea21 = httpContext.cgiGet( edtavLinea21_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea21_Internalname, AV125Linea21);
                           AV126Linea22 = httpContext.cgiGet( edtavLinea22_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea22_Internalname, AV126Linea22);
                           AV127Linea23 = httpContext.cgiGet( edtavLinea23_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea23_Internalname, AV127Linea23);
                           AV128Linea24 = httpContext.cgiGet( edtavLinea24_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea24_Internalname, AV128Linea24);
                           AV129Linea25 = httpContext.cgiGet( edtavLinea25_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea25_Internalname, AV129Linea25);
                           AV130Linea26 = httpContext.cgiGet( edtavLinea26_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea26_Internalname, AV130Linea26);
                           AV131Linea27 = httpContext.cgiGet( edtavLinea27_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea27_Internalname, AV131Linea27);
                           AV132Linea28 = httpContext.cgiGet( edtavLinea28_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavLinea28_Internalname, AV132Linea28);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e11AU2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e12AU2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e13AU2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'EXPORTAR RTF'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'Exportar RTF' */
                                 e14AU2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    if ( ! Rfr0gs )
                                    {
                                    }
                                    dynload_actions( ) ;
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                              }
                           }
                           else
                           {
                           }
                        }
                        else if ( GXutil.strcmp(GXutil.left( sEvt, 13), "GRIDHDRS.LOAD") == 0 )
                        {
                           nGXsfl_71_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_713( ) ;
                           AV268OpGrid = ((GXutil.strcmp(httpContext.cgiGet( chkavOpgrid.getInternalname()), "S")==0) ? "S" : "N") ;
                           httpContext.ajax_rsp_assign_attri("", false, chkavOpgrid.getInternalname(), AV268OpGrid);
                           AV105Hdrgrid = httpContext.cgiGet( edtavHdrgrid_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavHdrgrid_Internalname, AV105Hdrgrid);
                           AV9BarAgrestgrid = GXutil.upper( httpContext.cgiGet( edtavBaragrestgrid_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBaragrestgrid_Internalname, AV9BarAgrestgrid);
                           AV162Maccod = (int)(localUtil.ctol( httpContext.cgiGet( edtavMaccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavMaccod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV162Maccod), 8, 0));
                           AV53CliNomgrid = httpContext.cgiGet( edtavClinomgrid_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavClinomgrid_Internalname, AV53CliNomgrid);
                           AV25BarEnccligrid = httpContext.cgiGet( edtavBarenccligrid_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarenccligrid_Internalname, AV25BarEnccligrid);
                           AV22BarcolNomgrid = httpContext.cgiGet( edtavBarcolnomgrid_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnomgrid_Internalname, AV22BarcolNomgrid);
                           AV44BarserGrid = httpContext.cgiGet( edtavBarsergrid_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarsergrid_Internalname, AV44BarserGrid);
                           AV43BarSerDscgrid = httpContext.cgiGet( edtavBarserdscgrid_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarserdscgrid_Internalname, AV43BarSerDscgrid);
                           AV387Barnomcligrid1 = httpContext.cgiGet( edtavBarnomcligrid1_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarnomcligrid1_Internalname, AV387Barnomcligrid1);
                           AV37BarKgsgrid = localUtil.ctond( httpContext.cgiGet( edtavBarkgsgrid_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarkgsgrid_Internalname, GXutil.ltrimstr( AV37BarKgsgrid, 9, 2));
                           AV302Rectotkgmgrid = localUtil.ctond( httpContext.cgiGet( edtavRectotkgmgrid_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavRectotkgmgrid_Internalname, GXutil.ltrimstr( AV302Rectotkgmgrid, 10, 2));
                           AV35Barfecgengrid = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavBarfecgengrid_Internalname), 0)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarfecgengrid_Internalname, localUtil.format(AV35Barfecgengrid, "99/99/99"));
                           AV34barfecfprgrid = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavBarfecfprgrid_Internalname), 0)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarfecfprgrid_Internalname, localUtil.format(AV34barfecfprgrid, "99/99/99"));
                           AV45BarSitgrid = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarsitgrid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarsitgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45BarSitgrid), 2, 0));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "GRIDHDRS.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e15AU3 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                              }
                           }
                           else
                           {
                           }
                        }
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void weAU2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            if ( nGXWrapped == 1 )
            {
               renderHtmlCloseForm( ) ;
            }
         }
      }
   }

   public void paAU2( )
   {
      if ( nDonePA == 0 )
      {
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
         if ( ! httpContext.isAjaxRequest( ) )
         {
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
      subsflControlProps_92( ) ;
      while ( nGXsfl_9_idx <= nRC_GXsfl_9 )
      {
         sendrow_92( ) ;
         nGXsfl_9_idx = ((subGrid_Islastpage==1)&&(nGXsfl_9_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_9_idx+1) ;
         sGXsfl_9_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_9_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_92( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxnrgridhdrs_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_713( ) ;
      while ( nGXsfl_71_idx <= nRC_GXsfl_71 )
      {
         sendrow_713( ) ;
         nGXsfl_71_idx = ((subGridhdrs_Islastpage==1)&&(nGXsfl_71_idx+1>subgridhdrs_fnc_recordsperpage( )) ? 1 : nGXsfl_71_idx+1) ;
         sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_713( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridhdrsContainer)) ;
      /* End function gxnrGridhdrs_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 int subGridhdrs_Rows ,
                                 String AV62EmprCod ,
                                 java.util.Date AV70FecInicio ,
                                 java.util.Date AV69FechaFin ,
                                 String AV165Maqcod1 ,
                                 String AV166MaqCod10 ,
                                 String AV167Maqcod11 ,
                                 String AV168MaqCod12 ,
                                 String AV169Maqcod13 ,
                                 String AV170Maqcod14 ,
                                 String AV171Maqcod15 ,
                                 String AV172Maqcod16 ,
                                 String AV173Maqcod17 ,
                                 String AV174Maqcod18 ,
                                 String AV175Maqcod19 ,
                                 String AV176Maqcod2 ,
                                 String AV177Maqcod20 ,
                                 String AV178Maqcod21 ,
                                 String AV179Maqcod22 ,
                                 String AV180Maqcod23 ,
                                 String AV181Maqcod24 ,
                                 String AV182Maqcod25 ,
                                 String AV183Maqcod26 ,
                                 String AV184Maqcod27 ,
                                 String AV185Maqcod28 ,
                                 String AV186Maqcod3 ,
                                 String AV187Maqcod4 ,
                                 String AV188Maqcod5 ,
                                 String AV189Maqcod6 ,
                                 String AV190Maqcod7 ,
                                 String AV191Maqcod8 ,
                                 String AV192Maqcod9 ,
                                 String AV225Maqdsc1 ,
                                 String AV226Maqdsc10 ,
                                 String AV227Maqdsc11 ,
                                 String AV228Maqdsc12 ,
                                 String AV229Maqdsc13 ,
                                 String AV230Maqdsc14 ,
                                 String AV231Maqdsc15 ,
                                 String AV232MaqDsc16 ,
                                 String AV233MaqDsc17 ,
                                 String AV234MaqDsc18 ,
                                 String AV235MaqDsc19 ,
                                 String AV236Maqdsc2 ,
                                 String AV237MaqDsc20 ,
                                 String AV238MaqDsc21 ,
                                 String AV239MaqDsc22 ,
                                 String AV240MaqDsc23 ,
                                 String AV241MaqDsc24 ,
                                 String AV242MaqDsc25 ,
                                 String AV243MaqDsc26 ,
                                 String AV244MaqDsc27 ,
                                 String AV245MaqDsc28 ,
                                 String AV246Maqdsc3 ,
                                 String AV247Maqdsc4 ,
                                 String AV248Maqdsc5 ,
                                 String AV249Maqdsc6 ,
                                 String AV250Maqdsc7 ,
                                 String AV251Maqdsc8 ,
                                 String AV252Maqdsc9 ,
                                 short AV337t ,
                                 String AV164Maqcod ,
                                 short AV41Barordlin ,
                                 byte AV30Barfasestant ,
                                 String A396EmprCod ,
                                 int A129BarCod ,
                                 int AV10Barcod ,
                                 byte A132BarCodReo ,
                                 byte AV18Barcodreo ,
                                 String A130BarCodPar ,
                                 String AV14Barcodpar ,
                                 String A150BarFacTin ,
                                 byte A153BarFasEst ,
                                 short A194BarOrdLin ,
                                 String AV88Hdr2 ,
                                 short AV8B2 ,
                                 short AV75G2 ,
                                 short AV300R2 ,
                                 java.util.Date AV67Fec2 ,
                                 java.util.Date AV66Fec1 ,
                                 int AV52CliCodIN ,
                                 String AV23BarColNomIn ,
                                 String AV26BarEnccliIN ,
                                 int AV12BarcodIn ,
                                 byte AV20BarcodreoIN ,
                                 String AV16BarcodparIN ,
                                 byte AV65EstadoFaseHdr ,
                                 byte AV33BarFasEstSig )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e12AU2 ();
      GRID_nCurrentRecord = 0 ;
      rfAU2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void gxgrgridhdrs_refresh( int subGrid_Rows ,
                                     int subGridhdrs_Rows ,
                                     String AV62EmprCod ,
                                     java.util.Date AV70FecInicio ,
                                     java.util.Date AV69FechaFin ,
                                     String AV165Maqcod1 ,
                                     String AV166MaqCod10 ,
                                     String AV167Maqcod11 ,
                                     String AV168MaqCod12 ,
                                     String AV169Maqcod13 ,
                                     String AV170Maqcod14 ,
                                     String AV171Maqcod15 ,
                                     String AV172Maqcod16 ,
                                     String AV173Maqcod17 ,
                                     String AV174Maqcod18 ,
                                     String AV175Maqcod19 ,
                                     String AV176Maqcod2 ,
                                     String AV177Maqcod20 ,
                                     String AV178Maqcod21 ,
                                     String AV179Maqcod22 ,
                                     String AV180Maqcod23 ,
                                     String AV181Maqcod24 ,
                                     String AV182Maqcod25 ,
                                     String AV183Maqcod26 ,
                                     String AV184Maqcod27 ,
                                     String AV185Maqcod28 ,
                                     String AV186Maqcod3 ,
                                     String AV187Maqcod4 ,
                                     String AV188Maqcod5 ,
                                     String AV189Maqcod6 ,
                                     String AV190Maqcod7 ,
                                     String AV191Maqcod8 ,
                                     String AV192Maqcod9 ,
                                     String AV225Maqdsc1 ,
                                     String AV226Maqdsc10 ,
                                     String AV227Maqdsc11 ,
                                     String AV228Maqdsc12 ,
                                     String AV229Maqdsc13 ,
                                     String AV230Maqdsc14 ,
                                     String AV231Maqdsc15 ,
                                     String AV232MaqDsc16 ,
                                     String AV233MaqDsc17 ,
                                     String AV234MaqDsc18 ,
                                     String AV235MaqDsc19 ,
                                     String AV236Maqdsc2 ,
                                     String AV237MaqDsc20 ,
                                     String AV238MaqDsc21 ,
                                     String AV239MaqDsc22 ,
                                     String AV240MaqDsc23 ,
                                     String AV241MaqDsc24 ,
                                     String AV242MaqDsc25 ,
                                     String AV243MaqDsc26 ,
                                     String AV244MaqDsc27 ,
                                     String AV245MaqDsc28 ,
                                     String AV246Maqdsc3 ,
                                     String AV247Maqdsc4 ,
                                     String AV248Maqdsc5 ,
                                     String AV249Maqdsc6 ,
                                     String AV250Maqdsc7 ,
                                     String AV251Maqdsc8 ,
                                     String AV252Maqdsc9 ,
                                     short AV337t ,
                                     String AV164Maqcod ,
                                     short AV41Barordlin ,
                                     byte AV30Barfasestant ,
                                     String A396EmprCod ,
                                     int A129BarCod ,
                                     int AV10Barcod ,
                                     byte A132BarCodReo ,
                                     byte AV18Barcodreo ,
                                     String A130BarCodPar ,
                                     String AV14Barcodpar ,
                                     String A150BarFacTin ,
                                     byte A153BarFasEst ,
                                     short A194BarOrdLin ,
                                     java.util.Date AV67Fec2 ,
                                     java.util.Date A159BarFecGen ,
                                     String A180BarMaqCod ,
                                     byte A213BarSit ,
                                     java.util.Date AV66Fec1 ,
                                     int A252CliCod ,
                                     int AV52CliCodIN ,
                                     String A135BarColNom ,
                                     String AV23BarColNomIn ,
                                     String A143BarDisNum ,
                                     String A4812BarEncCli ,
                                     String AV26BarEnccliIN ,
                                     int AV12BarcodIn ,
                                     byte AV20BarcodreoIN ,
                                     String AV16BarcodparIN ,
                                     String A120BarAgrEst ,
                                     byte AV65EstadoFaseHdr ,
                                     byte AV33BarFasEstSig ,
                                     String A1652BarSerDsc ,
                                     String A212BarSer ,
                                     int A136BarColNum ,
                                     java.math.BigDecimal A166BarKgm ,
                                     java.math.BigDecimal A812RecTotKgm ,
                                     String A279CliNom ,
                                     java.util.Date A158BarFecFpr ,
                                     String A1234BarNomCli ,
                                     int A361DisCod ,
                                     byte A218BarTipCol ,
                                     long A13234BarRGB ,
                                     short AV8B2 ,
                                     short AV75G2 ,
                                     short AV300R2 )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e12AU2 ();
      GRIDHDRS_nCurrentRecord = 0 ;
      rfAU3( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridhdrs_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLINEA2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV123Linea2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vLINEA2", GXutil.rtrim( AV123Linea2));
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
      rfAU2( ) ;
      rfAU3( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavLinea2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea2_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea3_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea4_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea5_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea6_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea7_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea7_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea7_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea8_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea9_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea9_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea9_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea10_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea10_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea10_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea11_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea11_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea11_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea12_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea12_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea12_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea13_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea13_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea13_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea14_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea14_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea14_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea15_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea15_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea15_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea16_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea16_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea16_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea17_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea17_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea17_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea18_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea18_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea18_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea19_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea20_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea20_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea20_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea21_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea21_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea21_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea22_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea22_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea22_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea23_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea23_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea23_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea24_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea24_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea24_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea25_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea25_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea25_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea26_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea26_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea26_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea27_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea27_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea27_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea28_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea28_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea28_Enabled), 5, 0), !bGXsfl_9_Refreshing);
   }

   public void rfAU2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(9) ;
      /* Execute user event: Refresh */
      e12AU2 ();
      nGXsfl_9_idx = 1 ;
      sGXsfl_9_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_9_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_92( ) ;
      bGXsfl_9_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( subGrid_Islastpage != 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordcount( )-subgrid_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_92( ) ;
         e13AU2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_9_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e13AU2 ();
         }
         wbEnd = (short)(9) ;
         wbAU0( ) ;
      }
      bGXsfl_9_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesAU2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vFECINICIO", localUtil.dtoc( AV70FecInicio, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECINICIO", getSecureSignedToken( "", AV70FecInicio));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECHAFIN", localUtil.dtoc( AV69FechaFin, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECHAFIN", getSecureSignedToken( "", AV69FechaFin));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD1", GXutil.rtrim( AV165Maqcod1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV165Maqcod1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD10", GXutil.rtrim( AV166MaqCod10));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD10", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV166MaqCod10, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD11", GXutil.rtrim( AV167Maqcod11));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD11", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV167Maqcod11, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD12", GXutil.rtrim( AV168MaqCod12));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD12", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV168MaqCod12, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD13", GXutil.rtrim( AV169Maqcod13));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD13", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV169Maqcod13, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD14", GXutil.rtrim( AV170Maqcod14));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD14", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV170Maqcod14, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD15", GXutil.rtrim( AV171Maqcod15));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD15", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV171Maqcod15, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD16", GXutil.rtrim( AV172Maqcod16));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD16", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV172Maqcod16, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD17", GXutil.rtrim( AV173Maqcod17));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD17", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV173Maqcod17, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD18", GXutil.rtrim( AV174Maqcod18));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD18", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV174Maqcod18, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD19", GXutil.rtrim( AV175Maqcod19));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD19", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV175Maqcod19, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD2", GXutil.rtrim( AV176Maqcod2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV176Maqcod2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD20", GXutil.rtrim( AV177Maqcod20));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD20", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV177Maqcod20, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD21", GXutil.rtrim( AV178Maqcod21));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD21", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV178Maqcod21, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD22", GXutil.rtrim( AV179Maqcod22));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD22", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV179Maqcod22, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD23", GXutil.rtrim( AV180Maqcod23));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD23", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV180Maqcod23, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD24", GXutil.rtrim( AV181Maqcod24));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD24", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV181Maqcod24, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD25", GXutil.rtrim( AV182Maqcod25));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD25", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV182Maqcod25, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD26", GXutil.rtrim( AV183Maqcod26));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD26", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV183Maqcod26, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD27", GXutil.rtrim( AV184Maqcod27));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD27", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV184Maqcod27, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD28", GXutil.rtrim( AV185Maqcod28));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD28", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV185Maqcod28, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD3", GXutil.rtrim( AV186Maqcod3));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV186Maqcod3, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD4", GXutil.rtrim( AV187Maqcod4));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD4", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV187Maqcod4, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD5", GXutil.rtrim( AV188Maqcod5));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD5", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV188Maqcod5, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD6", GXutil.rtrim( AV189Maqcod6));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD6", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV189Maqcod6, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD7", GXutil.rtrim( AV190Maqcod7));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD7", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV190Maqcod7, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD8", GXutil.rtrim( AV191Maqcod8));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD8", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV191Maqcod8, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD9", GXutil.rtrim( AV192Maqcod9));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD9", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV192Maqcod9, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC1", GXutil.rtrim( AV225Maqdsc1));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV225Maqdsc1, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC10", GXutil.rtrim( AV226Maqdsc10));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC10", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV226Maqdsc10, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC11", GXutil.rtrim( AV227Maqdsc11));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC11", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV227Maqdsc11, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC12", GXutil.rtrim( AV228Maqdsc12));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC12", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV228Maqdsc12, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC13", GXutil.rtrim( AV229Maqdsc13));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC13", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV229Maqdsc13, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC14", GXutil.rtrim( AV230Maqdsc14));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC14", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV230Maqdsc14, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC15", GXutil.rtrim( AV231Maqdsc15));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC15", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV231Maqdsc15, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC16", GXutil.rtrim( AV232MaqDsc16));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC16", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV232MaqDsc16, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC17", GXutil.rtrim( AV233MaqDsc17));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC17", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV233MaqDsc17, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC18", GXutil.rtrim( AV234MaqDsc18));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC18", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV234MaqDsc18, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC19", GXutil.rtrim( AV235MaqDsc19));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC19", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV235MaqDsc19, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC2", GXutil.rtrim( AV236Maqdsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV236Maqdsc2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC20", GXutil.rtrim( AV237MaqDsc20));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC20", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV237MaqDsc20, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC21", GXutil.rtrim( AV238MaqDsc21));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC21", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV238MaqDsc21, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC22", GXutil.rtrim( AV239MaqDsc22));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC22", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV239MaqDsc22, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC23", GXutil.rtrim( AV240MaqDsc23));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC23", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV240MaqDsc23, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC24", GXutil.rtrim( AV241MaqDsc24));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC24", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV241MaqDsc24, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC25", GXutil.rtrim( AV242MaqDsc25));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC25", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV242MaqDsc25, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC26", GXutil.rtrim( AV243MaqDsc26));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC26", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV243MaqDsc26, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC27", GXutil.rtrim( AV244MaqDsc27));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC27", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV244MaqDsc27, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC28", GXutil.rtrim( AV245MaqDsc28));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC28", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV245MaqDsc28, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC3", GXutil.rtrim( AV246Maqdsc3));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV246Maqdsc3, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC4", GXutil.rtrim( AV247Maqdsc4));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC4", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV247Maqdsc4, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC5", GXutil.rtrim( AV248Maqdsc5));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC5", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV248Maqdsc5, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC6", GXutil.rtrim( AV249Maqdsc6));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC6", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV249Maqdsc6, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC7", GXutil.rtrim( AV250Maqdsc7));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC7", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV250Maqdsc7, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC8", GXutil.rtrim( AV251Maqdsc8));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC8", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV251Maqdsc8, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC9", GXutil.rtrim( AV252Maqdsc9));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC9", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV252Maqdsc9, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vT", GXutil.ltrim( localUtil.ntoc( AV337t, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV337t), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD", GXutil.rtrim( AV164Maqcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV164Maqcod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV41Barordlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Barordlin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFASESTANT", GXutil.ltrim( localUtil.ntoc( AV30Barfasestant, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASESTANT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30Barfasestant), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV10Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Barcod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV18Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Barcodreo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV14Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14Barcodpar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vB2", GXutil.ltrim( localUtil.ntoc( AV8B2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vB2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8B2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vG2", GXutil.ltrim( localUtil.ntoc( AV75G2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vG2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV75G2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vR2", GXutil.ltrim( localUtil.ntoc( AV300R2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vR2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV300R2), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLINEA2"+"_"+sGXsfl_9_idx, getSecureSignedToken( sGXsfl_9_idx, GXutil.rtrim( localUtil.format( AV123Linea2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFEC2", localUtil.dtoc( AV67Fec2, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFEC2", getSecureSignedToken( "", AV67Fec2));
      app.GxWebStd.gx_hidden_field( httpContext, "vFEC1", localUtil.dtoc( AV66Fec1, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFEC1", getSecureSignedToken( "", AV66Fec1));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICODIN", GXutil.ltrim( localUtil.ntoc( AV52CliCodIN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICODIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV52CliCodIN), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNOMIN", GXutil.rtrim( AV23BarColNomIn));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNOMIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23BarColNomIn, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARENCCLIIN", GXutil.rtrim( AV26BarEnccliIN));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARENCCLIIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26BarEnccliIN, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODIN", GXutil.ltrim( localUtil.ntoc( AV12BarcodIn, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12BarcodIn), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREOIN", GXutil.ltrim( localUtil.ntoc( AV20BarcodreoIN, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREOIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV20BarcodreoIN), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPARIN", GXutil.rtrim( AV16BarcodparIN));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPARIN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16BarcodparIN, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vESTADOFASEHDR", GXutil.ltrim( localUtil.ntoc( AV65EstadoFaseHdr, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vESTADOFASEHDR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV65EstadoFaseHdr), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARFASESTSIG", GXutil.ltrim( localUtil.ntoc( AV33BarFasEstSig, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASESTSIG", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33BarFasEstSig), "9")));
   }

   public void rfAU3( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridhdrsContainer.ClearRows();
      }
      wbStart = (short)(71) ;
      nGXsfl_71_idx = 1 ;
      sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_713( ) ;
      bGXsfl_71_Refreshing = true ;
      GridhdrsContainer.AddObjectProperty("GridName", "Gridhdrs");
      GridhdrsContainer.AddObjectProperty("CmpContext", "");
      GridhdrsContainer.AddObjectProperty("InMasterPage", "false");
      GridhdrsContainer.AddObjectProperty("Class", "WorkWith");
      GridhdrsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridhdrsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridhdrsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridhdrsContainer.setPageSize( subgridhdrs_fnc_recordsperpage( ) );
      if ( subGrid_Islastpage != 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordcount( )-subgrid_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_713( ) ;
         e15AU3 ();
         if ( ( GRIDHDRS_nCurrentRecord > 0 ) && ( GRIDHDRS_nGridOutOfScope == 0 ) && ( nGXsfl_71_idx == 1 ) )
         {
            GRIDHDRS_nCurrentRecord = 0 ;
            GRIDHDRS_nGridOutOfScope = 1 ;
            subgridhdrs_firstpage( ) ;
            e15AU3 ();
         }
         wbEnd = (short)(71) ;
         wbAU0( ) ;
      }
      bGXsfl_71_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesAU3( )
   {
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
      return 5*1 ;
   }

   public int subgrid_fnc_currentpage( )
   {
      return (int)(((subGrid_Islastpage==1) ? subgrid_fnc_recordcount( )/ (double) (subgrid_fnc_recordsperpage( ))+((((int)((subgrid_fnc_recordcount( )) % (subgrid_fnc_recordsperpage( ))))==0) ? 0 : 1) : GXutil.Int( GRID_nFirstRecordOnPage/ (double) (subgrid_fnc_recordsperpage( )))+1)) ;
   }

   public short subgrid_firstpage( )
   {
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, subGridhdrs_Rows, AV62EmprCod, AV70FecInicio, AV69FechaFin, AV165Maqcod1, AV166MaqCod10, AV167Maqcod11, AV168MaqCod12, AV169Maqcod13, AV170Maqcod14, AV171Maqcod15, AV172Maqcod16, AV173Maqcod17, AV174Maqcod18, AV175Maqcod19, AV176Maqcod2, AV177Maqcod20, AV178Maqcod21, AV179Maqcod22, AV180Maqcod23, AV181Maqcod24, AV182Maqcod25, AV183Maqcod26, AV184Maqcod27, AV185Maqcod28, AV186Maqcod3, AV187Maqcod4, AV188Maqcod5, AV189Maqcod6, AV190Maqcod7, AV191Maqcod8, AV192Maqcod9, AV225Maqdsc1, AV226Maqdsc10, AV227Maqdsc11, AV228Maqdsc12, AV229Maqdsc13, AV230Maqdsc14, AV231Maqdsc15, AV232MaqDsc16, AV233MaqDsc17, AV234MaqDsc18, AV235MaqDsc19, AV236Maqdsc2, AV237MaqDsc20, AV238MaqDsc21, AV239MaqDsc22, AV240MaqDsc23, AV241MaqDsc24, AV242MaqDsc25, AV243MaqDsc26, AV244MaqDsc27, AV245MaqDsc28, AV246Maqdsc3, AV247Maqdsc4, AV248Maqdsc5, AV249Maqdsc6, AV250Maqdsc7, AV251Maqdsc8, AV252Maqdsc9, AV337t, AV164Maqcod, AV41Barordlin, AV30Barfasestant, A396EmprCod, A129BarCod, AV10Barcod, A132BarCodReo, AV18Barcodreo, A130BarCodPar, AV14Barcodpar, A150BarFacTin, A153BarFasEst, A194BarOrdLin, AV88Hdr2, AV8B2, AV75G2, AV300R2, AV67Fec2, AV66Fec1, AV52CliCodIN, AV23BarColNomIn, AV26BarEnccliIN, AV12BarcodIn, AV20BarcodreoIN, AV16BarcodparIN, AV65EstadoFaseHdr, AV33BarFasEstSig) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, subGridhdrs_Rows, AV62EmprCod, AV70FecInicio, AV69FechaFin, AV165Maqcod1, AV166MaqCod10, AV167Maqcod11, AV168MaqCod12, AV169Maqcod13, AV170Maqcod14, AV171Maqcod15, AV172Maqcod16, AV173Maqcod17, AV174Maqcod18, AV175Maqcod19, AV176Maqcod2, AV177Maqcod20, AV178Maqcod21, AV179Maqcod22, AV180Maqcod23, AV181Maqcod24, AV182Maqcod25, AV183Maqcod26, AV184Maqcod27, AV185Maqcod28, AV186Maqcod3, AV187Maqcod4, AV188Maqcod5, AV189Maqcod6, AV190Maqcod7, AV191Maqcod8, AV192Maqcod9, AV225Maqdsc1, AV226Maqdsc10, AV227Maqdsc11, AV228Maqdsc12, AV229Maqdsc13, AV230Maqdsc14, AV231Maqdsc15, AV232MaqDsc16, AV233MaqDsc17, AV234MaqDsc18, AV235MaqDsc19, AV236Maqdsc2, AV237MaqDsc20, AV238MaqDsc21, AV239MaqDsc22, AV240MaqDsc23, AV241MaqDsc24, AV242MaqDsc25, AV243MaqDsc26, AV244MaqDsc27, AV245MaqDsc28, AV246Maqdsc3, AV247Maqdsc4, AV248Maqdsc5, AV249Maqdsc6, AV250Maqdsc7, AV251Maqdsc8, AV252Maqdsc9, AV337t, AV164Maqcod, AV41Barordlin, AV30Barfasestant, A396EmprCod, A129BarCod, AV10Barcod, A132BarCodReo, AV18Barcodreo, A130BarCodPar, AV14Barcodpar, A150BarFacTin, A153BarFasEst, A194BarOrdLin, AV88Hdr2, AV8B2, AV75G2, AV300R2, AV67Fec2, AV66Fec1, AV52CliCodIN, AV23BarColNomIn, AV26BarEnccliIN, AV12BarcodIn, AV20BarcodreoIN, AV16BarcodparIN, AV65EstadoFaseHdr, AV33BarFasEstSig) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, subGridhdrs_Rows, AV62EmprCod, AV70FecInicio, AV69FechaFin, AV165Maqcod1, AV166MaqCod10, AV167Maqcod11, AV168MaqCod12, AV169Maqcod13, AV170Maqcod14, AV171Maqcod15, AV172Maqcod16, AV173Maqcod17, AV174Maqcod18, AV175Maqcod19, AV176Maqcod2, AV177Maqcod20, AV178Maqcod21, AV179Maqcod22, AV180Maqcod23, AV181Maqcod24, AV182Maqcod25, AV183Maqcod26, AV184Maqcod27, AV185Maqcod28, AV186Maqcod3, AV187Maqcod4, AV188Maqcod5, AV189Maqcod6, AV190Maqcod7, AV191Maqcod8, AV192Maqcod9, AV225Maqdsc1, AV226Maqdsc10, AV227Maqdsc11, AV228Maqdsc12, AV229Maqdsc13, AV230Maqdsc14, AV231Maqdsc15, AV232MaqDsc16, AV233MaqDsc17, AV234MaqDsc18, AV235MaqDsc19, AV236Maqdsc2, AV237MaqDsc20, AV238MaqDsc21, AV239MaqDsc22, AV240MaqDsc23, AV241MaqDsc24, AV242MaqDsc25, AV243MaqDsc26, AV244MaqDsc27, AV245MaqDsc28, AV246Maqdsc3, AV247Maqdsc4, AV248Maqdsc5, AV249Maqdsc6, AV250Maqdsc7, AV251Maqdsc8, AV252Maqdsc9, AV337t, AV164Maqcod, AV41Barordlin, AV30Barfasestant, A396EmprCod, A129BarCod, AV10Barcod, A132BarCodReo, AV18Barcodreo, A130BarCodPar, AV14Barcodpar, A150BarFacTin, A153BarFasEst, A194BarOrdLin, AV88Hdr2, AV8B2, AV75G2, AV300R2, AV67Fec2, AV66Fec1, AV52CliCodIN, AV23BarColNomIn, AV26BarEnccliIN, AV12BarcodIn, AV20BarcodreoIN, AV16BarcodparIN, AV65EstadoFaseHdr, AV33BarFasEstSig) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, subGridhdrs_Rows, AV62EmprCod, AV70FecInicio, AV69FechaFin, AV165Maqcod1, AV166MaqCod10, AV167Maqcod11, AV168MaqCod12, AV169Maqcod13, AV170Maqcod14, AV171Maqcod15, AV172Maqcod16, AV173Maqcod17, AV174Maqcod18, AV175Maqcod19, AV176Maqcod2, AV177Maqcod20, AV178Maqcod21, AV179Maqcod22, AV180Maqcod23, AV181Maqcod24, AV182Maqcod25, AV183Maqcod26, AV184Maqcod27, AV185Maqcod28, AV186Maqcod3, AV187Maqcod4, AV188Maqcod5, AV189Maqcod6, AV190Maqcod7, AV191Maqcod8, AV192Maqcod9, AV225Maqdsc1, AV226Maqdsc10, AV227Maqdsc11, AV228Maqdsc12, AV229Maqdsc13, AV230Maqdsc14, AV231Maqdsc15, AV232MaqDsc16, AV233MaqDsc17, AV234MaqDsc18, AV235MaqDsc19, AV236Maqdsc2, AV237MaqDsc20, AV238MaqDsc21, AV239MaqDsc22, AV240MaqDsc23, AV241MaqDsc24, AV242MaqDsc25, AV243MaqDsc26, AV244MaqDsc27, AV245MaqDsc28, AV246Maqdsc3, AV247Maqdsc4, AV248Maqdsc5, AV249Maqdsc6, AV250Maqdsc7, AV251Maqdsc8, AV252Maqdsc9, AV337t, AV164Maqcod, AV41Barordlin, AV30Barfasestant, A396EmprCod, A129BarCod, AV10Barcod, A132BarCodReo, AV18Barcodreo, A130BarCodPar, AV14Barcodpar, A150BarFacTin, A153BarFasEst, A194BarOrdLin, AV88Hdr2, AV8B2, AV75G2, AV300R2, AV67Fec2, AV66Fec1, AV52CliCodIN, AV23BarColNomIn, AV26BarEnccliIN, AV12BarcodIn, AV20BarcodreoIN, AV16BarcodparIN, AV65EstadoFaseHdr, AV33BarFasEstSig) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, subGridhdrs_Rows, AV62EmprCod, AV70FecInicio, AV69FechaFin, AV165Maqcod1, AV166MaqCod10, AV167Maqcod11, AV168MaqCod12, AV169Maqcod13, AV170Maqcod14, AV171Maqcod15, AV172Maqcod16, AV173Maqcod17, AV174Maqcod18, AV175Maqcod19, AV176Maqcod2, AV177Maqcod20, AV178Maqcod21, AV179Maqcod22, AV180Maqcod23, AV181Maqcod24, AV182Maqcod25, AV183Maqcod26, AV184Maqcod27, AV185Maqcod28, AV186Maqcod3, AV187Maqcod4, AV188Maqcod5, AV189Maqcod6, AV190Maqcod7, AV191Maqcod8, AV192Maqcod9, AV225Maqdsc1, AV226Maqdsc10, AV227Maqdsc11, AV228Maqdsc12, AV229Maqdsc13, AV230Maqdsc14, AV231Maqdsc15, AV232MaqDsc16, AV233MaqDsc17, AV234MaqDsc18, AV235MaqDsc19, AV236Maqdsc2, AV237MaqDsc20, AV238MaqDsc21, AV239MaqDsc22, AV240MaqDsc23, AV241MaqDsc24, AV242MaqDsc25, AV243MaqDsc26, AV244MaqDsc27, AV245MaqDsc28, AV246Maqdsc3, AV247Maqdsc4, AV248Maqdsc5, AV249Maqdsc6, AV250Maqdsc7, AV251Maqdsc8, AV252Maqdsc9, AV337t, AV164Maqcod, AV41Barordlin, AV30Barfasestant, A396EmprCod, A129BarCod, AV10Barcod, A132BarCodReo, AV18Barcodreo, A130BarCodPar, AV14Barcodpar, A150BarFacTin, A153BarFasEst, A194BarOrdLin, AV88Hdr2, AV8B2, AV75G2, AV300R2, AV67Fec2, AV66Fec1, AV52CliCodIN, AV23BarColNomIn, AV26BarEnccliIN, AV12BarcodIn, AV20BarcodreoIN, AV16BarcodparIN, AV65EstadoFaseHdr, AV33BarFasEstSig) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public int subgridhdrs_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgridhdrs_fnc_recordcount( )
   {
      return (int)(((subGridhdrs_Recordcount==0) ? GRIDHDRS_nFirstRecordOnPage+1 : subGridhdrs_Recordcount)) ;
   }

   public int subgridhdrs_fnc_recordsperpage( )
   {
      return 5*1 ;
   }

   public int subgridhdrs_fnc_currentpage( )
   {
      return (int)(((subGridhdrs_Islastpage==1) ? subgridhdrs_fnc_recordcount( )/ (double) (subgridhdrs_fnc_recordsperpage( ))+((((int)((subgridhdrs_fnc_recordcount( )) % (subgridhdrs_fnc_recordsperpage( ))))==0) ? 0 : 1) : GXutil.Int( GRIDHDRS_nFirstRecordOnPage/ (double) (subgridhdrs_fnc_recordsperpage( )))+1)) ;
   }

   public short subgridhdrs_firstpage( )
   {
      GRIDHDRS_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDHDRS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDHDRS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridhdrs_refresh( subGrid_Rows, subGridhdrs_Rows, AV62EmprCod, AV70FecInicio, AV69FechaFin, AV165Maqcod1, AV166MaqCod10, AV167Maqcod11, AV168MaqCod12, AV169Maqcod13, AV170Maqcod14, AV171Maqcod15, AV172Maqcod16, AV173Maqcod17, AV174Maqcod18, AV175Maqcod19, AV176Maqcod2, AV177Maqcod20, AV178Maqcod21, AV179Maqcod22, AV180Maqcod23, AV181Maqcod24, AV182Maqcod25, AV183Maqcod26, AV184Maqcod27, AV185Maqcod28, AV186Maqcod3, AV187Maqcod4, AV188Maqcod5, AV189Maqcod6, AV190Maqcod7, AV191Maqcod8, AV192Maqcod9, AV225Maqdsc1, AV226Maqdsc10, AV227Maqdsc11, AV228Maqdsc12, AV229Maqdsc13, AV230Maqdsc14, AV231Maqdsc15, AV232MaqDsc16, AV233MaqDsc17, AV234MaqDsc18, AV235MaqDsc19, AV236Maqdsc2, AV237MaqDsc20, AV238MaqDsc21, AV239MaqDsc22, AV240MaqDsc23, AV241MaqDsc24, AV242MaqDsc25, AV243MaqDsc26, AV244MaqDsc27, AV245MaqDsc28, AV246Maqdsc3, AV247Maqdsc4, AV248Maqdsc5, AV249Maqdsc6, AV250Maqdsc7, AV251Maqdsc8, AV252Maqdsc9, AV337t, AV164Maqcod, AV41Barordlin, AV30Barfasestant, A396EmprCod, A129BarCod, AV10Barcod, A132BarCodReo, AV18Barcodreo, A130BarCodPar, AV14Barcodpar, A150BarFacTin, A153BarFasEst, A194BarOrdLin, AV67Fec2, A159BarFecGen, A180BarMaqCod, A213BarSit, AV66Fec1, A252CliCod, AV52CliCodIN, A135BarColNom, AV23BarColNomIn, A143BarDisNum, A4812BarEncCli, AV26BarEnccliIN, AV12BarcodIn, AV20BarcodreoIN, AV16BarcodparIN, A120BarAgrEst, AV65EstadoFaseHdr, AV33BarFasEstSig, A1652BarSerDsc, A212BarSer, A136BarColNum, A166BarKgm, A812RecTotKgm, A279CliNom, A158BarFecFpr, A1234BarNomCli, A361DisCod, A218BarTipCol, A13234BarRGB, AV8B2, AV75G2, AV300R2) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridhdrs_nextpage( )
   {
      if ( GRIDHDRS_nEOF == 0 )
      {
         GRIDHDRS_nFirstRecordOnPage = (long)(GRIDHDRS_nFirstRecordOnPage+subgridhdrs_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDHDRS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDHDRS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridhdrsContainer.AddObjectProperty("GRIDHDRS_nFirstRecordOnPage", GRIDHDRS_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridhdrs_refresh( subGrid_Rows, subGridhdrs_Rows, AV62EmprCod, AV70FecInicio, AV69FechaFin, AV165Maqcod1, AV166MaqCod10, AV167Maqcod11, AV168MaqCod12, AV169Maqcod13, AV170Maqcod14, AV171Maqcod15, AV172Maqcod16, AV173Maqcod17, AV174Maqcod18, AV175Maqcod19, AV176Maqcod2, AV177Maqcod20, AV178Maqcod21, AV179Maqcod22, AV180Maqcod23, AV181Maqcod24, AV182Maqcod25, AV183Maqcod26, AV184Maqcod27, AV185Maqcod28, AV186Maqcod3, AV187Maqcod4, AV188Maqcod5, AV189Maqcod6, AV190Maqcod7, AV191Maqcod8, AV192Maqcod9, AV225Maqdsc1, AV226Maqdsc10, AV227Maqdsc11, AV228Maqdsc12, AV229Maqdsc13, AV230Maqdsc14, AV231Maqdsc15, AV232MaqDsc16, AV233MaqDsc17, AV234MaqDsc18, AV235MaqDsc19, AV236Maqdsc2, AV237MaqDsc20, AV238MaqDsc21, AV239MaqDsc22, AV240MaqDsc23, AV241MaqDsc24, AV242MaqDsc25, AV243MaqDsc26, AV244MaqDsc27, AV245MaqDsc28, AV246Maqdsc3, AV247Maqdsc4, AV248Maqdsc5, AV249Maqdsc6, AV250Maqdsc7, AV251Maqdsc8, AV252Maqdsc9, AV337t, AV164Maqcod, AV41Barordlin, AV30Barfasestant, A396EmprCod, A129BarCod, AV10Barcod, A132BarCodReo, AV18Barcodreo, A130BarCodPar, AV14Barcodpar, A150BarFacTin, A153BarFasEst, A194BarOrdLin, AV67Fec2, A159BarFecGen, A180BarMaqCod, A213BarSit, AV66Fec1, A252CliCod, AV52CliCodIN, A135BarColNom, AV23BarColNomIn, A143BarDisNum, A4812BarEncCli, AV26BarEnccliIN, AV12BarcodIn, AV20BarcodreoIN, AV16BarcodparIN, A120BarAgrEst, AV65EstadoFaseHdr, AV33BarFasEstSig, A1652BarSerDsc, A212BarSer, A136BarColNum, A166BarKgm, A812RecTotKgm, A279CliNom, A158BarFecFpr, A1234BarNomCli, A361DisCod, A218BarTipCol, A13234BarRGB, AV8B2, AV75G2, AV300R2) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDHDRS_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridhdrs_previouspage( )
   {
      if ( GRIDHDRS_nFirstRecordOnPage >= subgridhdrs_fnc_recordsperpage( ) )
      {
         GRIDHDRS_nFirstRecordOnPage = (long)(GRIDHDRS_nFirstRecordOnPage-subgridhdrs_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDHDRS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDHDRS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridhdrs_refresh( subGrid_Rows, subGridhdrs_Rows, AV62EmprCod, AV70FecInicio, AV69FechaFin, AV165Maqcod1, AV166MaqCod10, AV167Maqcod11, AV168MaqCod12, AV169Maqcod13, AV170Maqcod14, AV171Maqcod15, AV172Maqcod16, AV173Maqcod17, AV174Maqcod18, AV175Maqcod19, AV176Maqcod2, AV177Maqcod20, AV178Maqcod21, AV179Maqcod22, AV180Maqcod23, AV181Maqcod24, AV182Maqcod25, AV183Maqcod26, AV184Maqcod27, AV185Maqcod28, AV186Maqcod3, AV187Maqcod4, AV188Maqcod5, AV189Maqcod6, AV190Maqcod7, AV191Maqcod8, AV192Maqcod9, AV225Maqdsc1, AV226Maqdsc10, AV227Maqdsc11, AV228Maqdsc12, AV229Maqdsc13, AV230Maqdsc14, AV231Maqdsc15, AV232MaqDsc16, AV233MaqDsc17, AV234MaqDsc18, AV235MaqDsc19, AV236Maqdsc2, AV237MaqDsc20, AV238MaqDsc21, AV239MaqDsc22, AV240MaqDsc23, AV241MaqDsc24, AV242MaqDsc25, AV243MaqDsc26, AV244MaqDsc27, AV245MaqDsc28, AV246Maqdsc3, AV247Maqdsc4, AV248Maqdsc5, AV249Maqdsc6, AV250Maqdsc7, AV251Maqdsc8, AV252Maqdsc9, AV337t, AV164Maqcod, AV41Barordlin, AV30Barfasestant, A396EmprCod, A129BarCod, AV10Barcod, A132BarCodReo, AV18Barcodreo, A130BarCodPar, AV14Barcodpar, A150BarFacTin, A153BarFasEst, A194BarOrdLin, AV67Fec2, A159BarFecGen, A180BarMaqCod, A213BarSit, AV66Fec1, A252CliCod, AV52CliCodIN, A135BarColNom, AV23BarColNomIn, A143BarDisNum, A4812BarEncCli, AV26BarEnccliIN, AV12BarcodIn, AV20BarcodreoIN, AV16BarcodparIN, A120BarAgrEst, AV65EstadoFaseHdr, AV33BarFasEstSig, A1652BarSerDsc, A212BarSer, A136BarColNum, A166BarKgm, A812RecTotKgm, A279CliNom, A158BarFecFpr, A1234BarNomCli, A361DisCod, A218BarTipCol, A13234BarRGB, AV8B2, AV75G2, AV300R2) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridhdrs_lastpage( )
   {
      subGridhdrs_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgridhdrs_refresh( subGrid_Rows, subGridhdrs_Rows, AV62EmprCod, AV70FecInicio, AV69FechaFin, AV165Maqcod1, AV166MaqCod10, AV167Maqcod11, AV168MaqCod12, AV169Maqcod13, AV170Maqcod14, AV171Maqcod15, AV172Maqcod16, AV173Maqcod17, AV174Maqcod18, AV175Maqcod19, AV176Maqcod2, AV177Maqcod20, AV178Maqcod21, AV179Maqcod22, AV180Maqcod23, AV181Maqcod24, AV182Maqcod25, AV183Maqcod26, AV184Maqcod27, AV185Maqcod28, AV186Maqcod3, AV187Maqcod4, AV188Maqcod5, AV189Maqcod6, AV190Maqcod7, AV191Maqcod8, AV192Maqcod9, AV225Maqdsc1, AV226Maqdsc10, AV227Maqdsc11, AV228Maqdsc12, AV229Maqdsc13, AV230Maqdsc14, AV231Maqdsc15, AV232MaqDsc16, AV233MaqDsc17, AV234MaqDsc18, AV235MaqDsc19, AV236Maqdsc2, AV237MaqDsc20, AV238MaqDsc21, AV239MaqDsc22, AV240MaqDsc23, AV241MaqDsc24, AV242MaqDsc25, AV243MaqDsc26, AV244MaqDsc27, AV245MaqDsc28, AV246Maqdsc3, AV247Maqdsc4, AV248Maqdsc5, AV249Maqdsc6, AV250Maqdsc7, AV251Maqdsc8, AV252Maqdsc9, AV337t, AV164Maqcod, AV41Barordlin, AV30Barfasestant, A396EmprCod, A129BarCod, AV10Barcod, A132BarCodReo, AV18Barcodreo, A130BarCodPar, AV14Barcodpar, A150BarFacTin, A153BarFasEst, A194BarOrdLin, AV67Fec2, A159BarFecGen, A180BarMaqCod, A213BarSit, AV66Fec1, A252CliCod, AV52CliCodIN, A135BarColNom, AV23BarColNomIn, A143BarDisNum, A4812BarEncCli, AV26BarEnccliIN, AV12BarcodIn, AV20BarcodreoIN, AV16BarcodparIN, A120BarAgrEst, AV65EstadoFaseHdr, AV33BarFasEstSig, A1652BarSerDsc, A212BarSer, A136BarColNum, A166BarKgm, A812RecTotKgm, A279CliNom, A158BarFecFpr, A1234BarNomCli, A361DisCod, A218BarTipCol, A13234BarRGB, AV8B2, AV75G2, AV300R2) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridhdrs_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDHDRS_nFirstRecordOnPage = (long)(subgridhdrs_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDHDRS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDHDRS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDHDRS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridhdrs_refresh( subGrid_Rows, subGridhdrs_Rows, AV62EmprCod, AV70FecInicio, AV69FechaFin, AV165Maqcod1, AV166MaqCod10, AV167Maqcod11, AV168MaqCod12, AV169Maqcod13, AV170Maqcod14, AV171Maqcod15, AV172Maqcod16, AV173Maqcod17, AV174Maqcod18, AV175Maqcod19, AV176Maqcod2, AV177Maqcod20, AV178Maqcod21, AV179Maqcod22, AV180Maqcod23, AV181Maqcod24, AV182Maqcod25, AV183Maqcod26, AV184Maqcod27, AV185Maqcod28, AV186Maqcod3, AV187Maqcod4, AV188Maqcod5, AV189Maqcod6, AV190Maqcod7, AV191Maqcod8, AV192Maqcod9, AV225Maqdsc1, AV226Maqdsc10, AV227Maqdsc11, AV228Maqdsc12, AV229Maqdsc13, AV230Maqdsc14, AV231Maqdsc15, AV232MaqDsc16, AV233MaqDsc17, AV234MaqDsc18, AV235MaqDsc19, AV236Maqdsc2, AV237MaqDsc20, AV238MaqDsc21, AV239MaqDsc22, AV240MaqDsc23, AV241MaqDsc24, AV242MaqDsc25, AV243MaqDsc26, AV244MaqDsc27, AV245MaqDsc28, AV246Maqdsc3, AV247Maqdsc4, AV248Maqdsc5, AV249Maqdsc6, AV250Maqdsc7, AV251Maqdsc8, AV252Maqdsc9, AV337t, AV164Maqcod, AV41Barordlin, AV30Barfasestant, A396EmprCod, A129BarCod, AV10Barcod, A132BarCodReo, AV18Barcodreo, A130BarCodPar, AV14Barcodpar, A150BarFacTin, A153BarFasEst, A194BarOrdLin, AV67Fec2, A159BarFecGen, A180BarMaqCod, A213BarSit, AV66Fec1, A252CliCod, AV52CliCodIN, A135BarColNom, AV23BarColNomIn, A143BarDisNum, A4812BarEncCli, AV26BarEnccliIN, AV12BarcodIn, AV20BarcodreoIN, AV16BarcodparIN, A120BarAgrEst, AV65EstadoFaseHdr, AV33BarFasEstSig, A1652BarSerDsc, A212BarSer, A136BarColNum, A166BarKgm, A812RecTotKgm, A279CliNom, A158BarFecFpr, A1234BarNomCli, A361DisCod, A218BarTipCol, A13234BarRGB, AV8B2, AV75G2, AV300R2) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavMsgcontrol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMsgcontrol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMsgcontrol_Enabled), 5, 0), true);
      edtavLinea2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea2_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea3_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea4_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea5_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea5_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea5_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea6_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea6_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea6_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea7_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea7_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea7_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea8_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea9_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea9_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea9_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea10_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea10_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea10_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea11_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea11_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea11_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea12_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea12_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea12_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea13_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea13_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea13_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea14_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea14_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea14_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea15_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea15_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea15_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea16_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea16_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea16_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea17_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea17_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea17_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea18_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea18_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea18_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea19_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea19_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea19_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea20_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea20_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea20_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea21_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea21_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea21_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea22_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea22_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea22_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea23_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea23_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea23_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea24_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea24_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea24_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea25_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea25_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea25_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea26_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea26_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea26_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea27_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea27_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea27_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      edtavLinea28_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLinea28_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLinea28_Enabled), 5, 0), !bGXsfl_9_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupAU0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11AU2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_9 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_9"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_71 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_71"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV195MaqCodPln = httpContext.cgiGet( "vMAQCODPLN") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDHDRS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRIDHDRS_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRIDHDRS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRIDHDRS_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         AV699MsgControl = httpContext.cgiGet( edtavMsgcontrol_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV699MsgControl", AV699MsgControl);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
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
      e11AU2 ();
      if (returnInSub) return;
   }

   public void e11AU2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV336Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webrdtoplanificacion_impl.this.GXt_char1 = GXv_char2[0] ;
      AV336Station = GXt_char1 ;
      GXv_char2[0] = AV62EmprCod ;
      GXv_char3[0] = AV63EmprNom ;
      GXv_char4[0] = AV350UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV336Station, GXv_char2, GXv_char3, GXv_char4) ;
      webrdtoplanificacion_impl.this.AV62EmprCod = GXv_char2[0] ;
      webrdtoplanificacion_impl.this.AV63EmprNom = GXv_char3[0] ;
      webrdtoplanificacion_impl.this.AV350UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62EmprCod", AV62EmprCod);
      GXt_char1 = AV49Carpeta ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( AV62EmprCod, httpContext.getMessage( "CARPET", ""), GXv_char4) ;
      webrdtoplanificacion_impl.this.GXt_char1 = GXv_char4[0] ;
      AV49Carpeta = GXt_char1 ;
      GXt_int5 = AV59dias ;
      GXv_int6[0] = GXt_int5 ;
      new app.pbuscon(remoteHandle, context).execute( AV62EmprCod, httpContext.getMessage( "DIASPL", ""), GXv_int6) ;
      webrdtoplanificacion_impl.this.GXt_int5 = GXv_int6[0] ;
      AV59dias = (short)(GXt_int5) ;
      AV59dias = (short)(((AV59dias==0) ? 60 : AV59dias)) ;
      AV70FecInicio = GXutil.dadd(GXutil.today( ),-((int)(AV59dias))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70FecInicio", localUtil.format(AV70FecInicio, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECINICIO", getSecureSignedToken( "", AV70FecInicio));
      AV69FechaFin = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69FechaFin", localUtil.format(AV69FechaFin, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFECHAFIN", getSecureSignedToken( "", AV69FechaFin));
   }

   public void e12AU2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      System.out.println( httpContext.getMessage( "Actualizando Array de Maquinas", "") );
      GXv_char4[0] = AV62EmprCod ;
      new app.pprc207(remoteHandle, context).execute( GXv_char4, AV339Tab_maq) ;
      webrdtoplanificacion_impl.this.AV62EmprCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62EmprCod", AV62EmprCod);
      System.out.println( httpContext.getMessage( "Creando fichero PLANO", "") );
      new app.copypprc218(remoteHandle, context).execute( ) ;
      GXv_char4[0] = AV62EmprCod ;
      GXv_char3[0] = AV165Maqcod1 ;
      GXv_char2[0] = AV166MaqCod10 ;
      GXv_char7[0] = AV167Maqcod11 ;
      GXv_char8[0] = AV168MaqCod12 ;
      GXv_char9[0] = AV169Maqcod13 ;
      GXv_char10[0] = AV170Maqcod14 ;
      GXv_char11[0] = AV171Maqcod15 ;
      GXv_char12[0] = AV172Maqcod16 ;
      GXv_char13[0] = AV173Maqcod17 ;
      GXv_char14[0] = AV174Maqcod18 ;
      GXv_char15[0] = AV175Maqcod19 ;
      GXv_char16[0] = AV176Maqcod2 ;
      GXv_char17[0] = AV177Maqcod20 ;
      GXv_char18[0] = AV178Maqcod21 ;
      GXv_char19[0] = AV179Maqcod22 ;
      GXv_char20[0] = AV180Maqcod23 ;
      GXv_char21[0] = AV181Maqcod24 ;
      GXv_char22[0] = AV182Maqcod25 ;
      GXv_char23[0] = AV183Maqcod26 ;
      GXv_char24[0] = AV184Maqcod27 ;
      GXv_char25[0] = AV185Maqcod28 ;
      GXv_char26[0] = AV186Maqcod3 ;
      GXv_char27[0] = AV187Maqcod4 ;
      GXv_char28[0] = AV188Maqcod5 ;
      GXv_char29[0] = AV189Maqcod6 ;
      GXv_char30[0] = AV190Maqcod7 ;
      GXv_char31[0] = AV191Maqcod8 ;
      GXv_char32[0] = AV192Maqcod9 ;
      GXv_char33[0] = AV225Maqdsc1 ;
      GXv_char34[0] = AV226Maqdsc10 ;
      GXv_char35[0] = AV227Maqdsc11 ;
      GXv_char36[0] = AV228Maqdsc12 ;
      GXv_char37[0] = AV229Maqdsc13 ;
      GXv_char38[0] = AV230Maqdsc14 ;
      GXv_char39[0] = AV231Maqdsc15 ;
      GXv_char40[0] = AV232MaqDsc16 ;
      GXv_char41[0] = AV233MaqDsc17 ;
      GXv_char42[0] = AV234MaqDsc18 ;
      GXv_char43[0] = AV235MaqDsc19 ;
      GXv_char44[0] = AV236Maqdsc2 ;
      GXv_char45[0] = AV237MaqDsc20 ;
      GXv_char46[0] = AV238MaqDsc21 ;
      GXv_char47[0] = AV239MaqDsc22 ;
      GXv_char48[0] = AV240MaqDsc23 ;
      GXv_char49[0] = AV241MaqDsc24 ;
      GXv_char50[0] = AV242MaqDsc25 ;
      GXv_char51[0] = AV243MaqDsc26 ;
      GXv_char52[0] = AV244MaqDsc27 ;
      GXv_char53[0] = AV245MaqDsc28 ;
      GXv_char54[0] = AV246Maqdsc3 ;
      GXv_char55[0] = AV247Maqdsc4 ;
      GXv_char56[0] = AV248Maqdsc5 ;
      GXv_char57[0] = AV249Maqdsc6 ;
      GXv_char58[0] = AV250Maqdsc7 ;
      GXv_char59[0] = AV251Maqdsc8 ;
      GXv_char60[0] = AV252Maqdsc9 ;
      GXv_int61[0] = AV337t ;
      new app.pprc204(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2, GXv_char7, GXv_char8, GXv_char9, GXv_char10, GXv_char11, GXv_char12, GXv_char13, GXv_char14, GXv_char15, GXv_char16, GXv_char17, GXv_char18, GXv_char19, GXv_char20, GXv_char21, GXv_char22, GXv_char23, GXv_char24, GXv_char25, GXv_char26, GXv_char27, GXv_char28, GXv_char29, GXv_char30, GXv_char31, GXv_char32, GXv_char33, GXv_char34, GXv_char35, GXv_char36, GXv_char37, GXv_char38, GXv_char39, GXv_char40, GXv_char41, GXv_char42, GXv_char43, GXv_char44, GXv_char45, GXv_char46, GXv_char47, GXv_char48, GXv_char49, GXv_char50, GXv_char51, GXv_char52, GXv_char53, GXv_char54, GXv_char55, GXv_char56, GXv_char57, GXv_char58, GXv_char59, GXv_char60, AV339Tab_maq, AV253MaqHdrs, GXv_int61) ;
      webrdtoplanificacion_impl.this.AV62EmprCod = GXv_char4[0] ;
      webrdtoplanificacion_impl.this.AV165Maqcod1 = GXv_char3[0] ;
      webrdtoplanificacion_impl.this.AV166MaqCod10 = GXv_char2[0] ;
      webrdtoplanificacion_impl.this.AV167Maqcod11 = GXv_char7[0] ;
      webrdtoplanificacion_impl.this.AV168MaqCod12 = GXv_char8[0] ;
      webrdtoplanificacion_impl.this.AV169Maqcod13 = GXv_char9[0] ;
      webrdtoplanificacion_impl.this.AV170Maqcod14 = GXv_char10[0] ;
      webrdtoplanificacion_impl.this.AV171Maqcod15 = GXv_char11[0] ;
      webrdtoplanificacion_impl.this.AV172Maqcod16 = GXv_char12[0] ;
      webrdtoplanificacion_impl.this.AV173Maqcod17 = GXv_char13[0] ;
      webrdtoplanificacion_impl.this.AV174Maqcod18 = GXv_char14[0] ;
      webrdtoplanificacion_impl.this.AV175Maqcod19 = GXv_char15[0] ;
      webrdtoplanificacion_impl.this.AV176Maqcod2 = GXv_char16[0] ;
      webrdtoplanificacion_impl.this.AV177Maqcod20 = GXv_char17[0] ;
      webrdtoplanificacion_impl.this.AV178Maqcod21 = GXv_char18[0] ;
      webrdtoplanificacion_impl.this.AV179Maqcod22 = GXv_char19[0] ;
      webrdtoplanificacion_impl.this.AV180Maqcod23 = GXv_char20[0] ;
      webrdtoplanificacion_impl.this.AV181Maqcod24 = GXv_char21[0] ;
      webrdtoplanificacion_impl.this.AV182Maqcod25 = GXv_char22[0] ;
      webrdtoplanificacion_impl.this.AV183Maqcod26 = GXv_char23[0] ;
      webrdtoplanificacion_impl.this.AV184Maqcod27 = GXv_char24[0] ;
      webrdtoplanificacion_impl.this.AV185Maqcod28 = GXv_char25[0] ;
      webrdtoplanificacion_impl.this.AV186Maqcod3 = GXv_char26[0] ;
      webrdtoplanificacion_impl.this.AV187Maqcod4 = GXv_char27[0] ;
      webrdtoplanificacion_impl.this.AV188Maqcod5 = GXv_char28[0] ;
      webrdtoplanificacion_impl.this.AV189Maqcod6 = GXv_char29[0] ;
      webrdtoplanificacion_impl.this.AV190Maqcod7 = GXv_char30[0] ;
      webrdtoplanificacion_impl.this.AV191Maqcod8 = GXv_char31[0] ;
      webrdtoplanificacion_impl.this.AV192Maqcod9 = GXv_char32[0] ;
      webrdtoplanificacion_impl.this.AV225Maqdsc1 = GXv_char33[0] ;
      webrdtoplanificacion_impl.this.AV226Maqdsc10 = GXv_char34[0] ;
      webrdtoplanificacion_impl.this.AV227Maqdsc11 = GXv_char35[0] ;
      webrdtoplanificacion_impl.this.AV228Maqdsc12 = GXv_char36[0] ;
      webrdtoplanificacion_impl.this.AV229Maqdsc13 = GXv_char37[0] ;
      webrdtoplanificacion_impl.this.AV230Maqdsc14 = GXv_char38[0] ;
      webrdtoplanificacion_impl.this.AV231Maqdsc15 = GXv_char39[0] ;
      webrdtoplanificacion_impl.this.AV232MaqDsc16 = GXv_char40[0] ;
      webrdtoplanificacion_impl.this.AV233MaqDsc17 = GXv_char41[0] ;
      webrdtoplanificacion_impl.this.AV234MaqDsc18 = GXv_char42[0] ;
      webrdtoplanificacion_impl.this.AV235MaqDsc19 = GXv_char43[0] ;
      webrdtoplanificacion_impl.this.AV236Maqdsc2 = GXv_char44[0] ;
      webrdtoplanificacion_impl.this.AV237MaqDsc20 = GXv_char45[0] ;
      webrdtoplanificacion_impl.this.AV238MaqDsc21 = GXv_char46[0] ;
      webrdtoplanificacion_impl.this.AV239MaqDsc22 = GXv_char47[0] ;
      webrdtoplanificacion_impl.this.AV240MaqDsc23 = GXv_char48[0] ;
      webrdtoplanificacion_impl.this.AV241MaqDsc24 = GXv_char49[0] ;
      webrdtoplanificacion_impl.this.AV242MaqDsc25 = GXv_char50[0] ;
      webrdtoplanificacion_impl.this.AV243MaqDsc26 = GXv_char51[0] ;
      webrdtoplanificacion_impl.this.AV244MaqDsc27 = GXv_char52[0] ;
      webrdtoplanificacion_impl.this.AV245MaqDsc28 = GXv_char53[0] ;
      webrdtoplanificacion_impl.this.AV246Maqdsc3 = GXv_char54[0] ;
      webrdtoplanificacion_impl.this.AV247Maqdsc4 = GXv_char55[0] ;
      webrdtoplanificacion_impl.this.AV248Maqdsc5 = GXv_char56[0] ;
      webrdtoplanificacion_impl.this.AV249Maqdsc6 = GXv_char57[0] ;
      webrdtoplanificacion_impl.this.AV250Maqdsc7 = GXv_char58[0] ;
      webrdtoplanificacion_impl.this.AV251Maqdsc8 = GXv_char59[0] ;
      webrdtoplanificacion_impl.this.AV252Maqdsc9 = GXv_char60[0] ;
      webrdtoplanificacion_impl.this.AV337t = GXv_int61[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62EmprCod", AV62EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV165Maqcod1", AV165Maqcod1);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV165Maqcod1, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV166MaqCod10", AV166MaqCod10);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD10", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV166MaqCod10, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV167Maqcod11", AV167Maqcod11);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD11", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV167Maqcod11, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV168MaqCod12", AV168MaqCod12);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD12", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV168MaqCod12, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV169Maqcod13", AV169Maqcod13);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD13", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV169Maqcod13, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV170Maqcod14", AV170Maqcod14);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD14", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV170Maqcod14, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV171Maqcod15", AV171Maqcod15);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD15", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV171Maqcod15, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV172Maqcod16", AV172Maqcod16);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD16", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV172Maqcod16, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV173Maqcod17", AV173Maqcod17);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD17", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV173Maqcod17, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV174Maqcod18", AV174Maqcod18);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD18", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV174Maqcod18, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV175Maqcod19", AV175Maqcod19);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD19", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV175Maqcod19, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV176Maqcod2", AV176Maqcod2);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV176Maqcod2, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV177Maqcod20", AV177Maqcod20);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD20", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV177Maqcod20, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV178Maqcod21", AV178Maqcod21);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD21", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV178Maqcod21, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV179Maqcod22", AV179Maqcod22);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD22", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV179Maqcod22, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV180Maqcod23", AV180Maqcod23);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD23", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV180Maqcod23, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV181Maqcod24", AV181Maqcod24);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD24", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV181Maqcod24, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV182Maqcod25", AV182Maqcod25);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD25", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV182Maqcod25, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV183Maqcod26", AV183Maqcod26);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD26", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV183Maqcod26, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV184Maqcod27", AV184Maqcod27);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD27", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV184Maqcod27, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV185Maqcod28", AV185Maqcod28);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD28", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV185Maqcod28, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV186Maqcod3", AV186Maqcod3);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV186Maqcod3, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV187Maqcod4", AV187Maqcod4);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD4", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV187Maqcod4, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV188Maqcod5", AV188Maqcod5);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD5", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV188Maqcod5, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV189Maqcod6", AV189Maqcod6);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD6", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV189Maqcod6, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV190Maqcod7", AV190Maqcod7);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD7", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV190Maqcod7, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV191Maqcod8", AV191Maqcod8);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD8", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV191Maqcod8, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV192Maqcod9", AV192Maqcod9);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD9", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV192Maqcod9, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV225Maqdsc1", AV225Maqdsc1);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV225Maqdsc1, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV226Maqdsc10", AV226Maqdsc10);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC10", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV226Maqdsc10, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV227Maqdsc11", AV227Maqdsc11);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC11", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV227Maqdsc11, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV228Maqdsc12", AV228Maqdsc12);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC12", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV228Maqdsc12, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV229Maqdsc13", AV229Maqdsc13);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC13", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV229Maqdsc13, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV230Maqdsc14", AV230Maqdsc14);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC14", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV230Maqdsc14, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV231Maqdsc15", AV231Maqdsc15);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC15", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV231Maqdsc15, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV232MaqDsc16", AV232MaqDsc16);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC16", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV232MaqDsc16, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV233MaqDsc17", AV233MaqDsc17);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC17", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV233MaqDsc17, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV234MaqDsc18", AV234MaqDsc18);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC18", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV234MaqDsc18, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV235MaqDsc19", AV235MaqDsc19);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC19", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV235MaqDsc19, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV236Maqdsc2", AV236Maqdsc2);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV236Maqdsc2, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV237MaqDsc20", AV237MaqDsc20);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC20", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV237MaqDsc20, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV238MaqDsc21", AV238MaqDsc21);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC21", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV238MaqDsc21, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV239MaqDsc22", AV239MaqDsc22);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC22", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV239MaqDsc22, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV240MaqDsc23", AV240MaqDsc23);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC23", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV240MaqDsc23, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV241MaqDsc24", AV241MaqDsc24);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC24", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV241MaqDsc24, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV242MaqDsc25", AV242MaqDsc25);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC25", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV242MaqDsc25, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV243MaqDsc26", AV243MaqDsc26);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC26", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV243MaqDsc26, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV244MaqDsc27", AV244MaqDsc27);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC27", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV244MaqDsc27, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV245MaqDsc28", AV245MaqDsc28);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC28", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV245MaqDsc28, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV246Maqdsc3", AV246Maqdsc3);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV246Maqdsc3, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV247Maqdsc4", AV247Maqdsc4);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC4", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV247Maqdsc4, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV248Maqdsc5", AV248Maqdsc5);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC5", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV248Maqdsc5, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV249Maqdsc6", AV249Maqdsc6);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC6", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV249Maqdsc6, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV250Maqdsc7", AV250Maqdsc7);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC7", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV250Maqdsc7, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV251Maqdsc8", AV251Maqdsc8);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC8", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV251Maqdsc8, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV252Maqdsc9", AV252Maqdsc9);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQDSC9", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV252Maqdsc9, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV337t", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV337t), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV337t), "ZZZ9")));
      System.out.println( httpContext.getMessage( "Presentamos DATOS", "") );
      AV108i = (short)(1) ;
      while ( AV108i <= 28 )
      {
         if ( GXutil.strcmp(AV339Tab_maq[AV108i-1], " ") == 0 )
         {
            if (true) break;
         }
         AV164Maqcod = AV339Tab_maq[AV108i-1] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV164Maqcod", AV164Maqcod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV164Maqcod, ""))));
         /* Execute user subroutine: 'CARGOHDRS' */
         S112 ();
         if (returnInSub) return;
         AV108i = (short)(AV108i+1) ;
      }
      GXv_char60[0] = AV256Maquinastxt ;
      GXv_char59[0] = AV255MaquinasHdrstxt ;
      new app.creoarchivofvectormatriz(remoteHandle, context).execute( AV339Tab_maq, AV253MaqHdrs, GXv_char60, GXv_char59) ;
      webrdtoplanificacion_impl.this.AV256Maquinastxt = GXv_char60[0] ;
      webrdtoplanificacion_impl.this.AV255MaquinasHdrstxt = GXv_char59[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV256Maquinastxt", AV256Maquinastxt);
      httpContext.ajax_rsp_assign_attri("", false, "AV255MaquinasHdrstxt", AV255MaquinasHdrstxt);
      edtavHdr1_Title = AV225Maqdsc1 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr1_Internalname, "Title", edtavHdr1_Title, !bGXsfl_9_Refreshing);
      edtavHdr2_Title = AV236Maqdsc2 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr2_Internalname, "Title", edtavHdr2_Title, !bGXsfl_9_Refreshing);
      edtavHdr3_Title = AV246Maqdsc3 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr3_Internalname, "Title", edtavHdr3_Title, !bGXsfl_9_Refreshing);
      edtavHdr4_Title = AV247Maqdsc4 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr4_Internalname, "Title", edtavHdr4_Title, !bGXsfl_9_Refreshing);
      edtavHdr5_Title = AV248Maqdsc5 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr5_Internalname, "Title", edtavHdr5_Title, !bGXsfl_9_Refreshing);
      edtavHdr6_Title = AV249Maqdsc6 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr6_Internalname, "Title", edtavHdr6_Title, !bGXsfl_9_Refreshing);
      edtavHdr7_Title = AV250Maqdsc7 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr7_Internalname, "Title", edtavHdr7_Title, !bGXsfl_9_Refreshing);
      edtavHdr8_Title = AV251Maqdsc8 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr8_Internalname, "Title", edtavHdr8_Title, !bGXsfl_9_Refreshing);
      edtavHdr9_Title = AV252Maqdsc9 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr9_Internalname, "Title", edtavHdr9_Title, !bGXsfl_9_Refreshing);
      edtavHdr10_Title = AV226Maqdsc10 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr10_Internalname, "Title", edtavHdr10_Title, !bGXsfl_9_Refreshing);
      edtavHdr11_Title = AV227Maqdsc11 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr11_Internalname, "Title", edtavHdr11_Title, !bGXsfl_9_Refreshing);
      edtavHdr12_Title = AV228Maqdsc12 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr12_Internalname, "Title", edtavHdr12_Title, !bGXsfl_9_Refreshing);
      edtavHdr13_Title = AV229Maqdsc13 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr13_Internalname, "Title", edtavHdr13_Title, !bGXsfl_9_Refreshing);
      edtavHdr14_Title = AV230Maqdsc14 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr14_Internalname, "Title", edtavHdr14_Title, !bGXsfl_9_Refreshing);
      edtavHdr15_Title = AV231Maqdsc15 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr15_Internalname, "Title", edtavHdr15_Title, !bGXsfl_9_Refreshing);
      edtavHdr16_Title = AV232MaqDsc16 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr16_Internalname, "Title", edtavHdr16_Title, !bGXsfl_9_Refreshing);
      edtavHdr17_Title = AV233MaqDsc17 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr17_Internalname, "Title", edtavHdr17_Title, !bGXsfl_9_Refreshing);
      edtavHdr18_Title = AV234MaqDsc18 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr18_Internalname, "Title", edtavHdr18_Title, !bGXsfl_9_Refreshing);
      edtavHdr19_Title = AV235MaqDsc19 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr19_Internalname, "Title", edtavHdr19_Title, !bGXsfl_9_Refreshing);
      edtavHdr20_Title = AV237MaqDsc20 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr20_Internalname, "Title", edtavHdr20_Title, !bGXsfl_9_Refreshing);
      edtavHdr21_Title = AV238MaqDsc21 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr21_Internalname, "Title", edtavHdr21_Title, !bGXsfl_9_Refreshing);
      edtavHdr22_Title = AV239MaqDsc22 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr22_Internalname, "Title", edtavHdr22_Title, !bGXsfl_9_Refreshing);
      edtavHdr23_Title = AV240MaqDsc23 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr23_Internalname, "Title", edtavHdr23_Title, !bGXsfl_9_Refreshing);
      edtavHdr24_Title = AV241MaqDsc24 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr24_Internalname, "Title", edtavHdr24_Title, !bGXsfl_9_Refreshing);
      edtavHdr25_Title = AV242MaqDsc25 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr25_Internalname, "Title", edtavHdr25_Title, !bGXsfl_9_Refreshing);
      edtavHdr26_Title = AV243MaqDsc26 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr26_Internalname, "Title", edtavHdr26_Title, !bGXsfl_9_Refreshing);
      edtavHdr27_Title = AV244MaqDsc27 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr27_Internalname, "Title", edtavHdr27_Title, !bGXsfl_9_Refreshing);
      edtavHdr28_Title = AV245MaqDsc28 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr28_Internalname, "Title", edtavHdr28_Title, !bGXsfl_9_Refreshing);
      System.out.println( " " );
      GXt_int5 = AV265NospMaq ;
      GXv_char60[0] = AV62EmprCod ;
      GXv_char59[0] = httpContext.getMessage( "NOSMAQ", "") ;
      GXv_int6[0] = GXt_int5 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char60, GXv_char59, GXv_int6) ;
      webrdtoplanificacion_impl.this.AV62EmprCod = GXv_char60[0] ;
      webrdtoplanificacion_impl.this.GXt_int5 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62EmprCod", AV62EmprCod);
      AV265NospMaq = (short)(GXt_int5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV265NospMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV265NospMaq), 4, 0));
      AV265NospMaq = (short)(((0==AV265NospMaq) ? 3 : AV265NospMaq)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV265NospMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV265NospMaq), 4, 0));
      /*  Sending Event outputs  */
   }

   private void e13AU2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV270Partidas = DecimalUtil.doubleToDec(1) ;
      AV110k = (short)(2) ;
      while ( AV110k <= 26 )
      {
         AV109j = (short)(1) ;
         while ( AV109j <= 28 )
         {
            AV344Texto = AV253MaqHdrs[AV109j-1][AV110k-1] ;
            AV76Hdr = GXutil.substring( AV344Texto, 27, 11) ;
            AV64EstadoFasegrid = " " ;
            AV303Rgb = 16777215 ;
            GXv_int62[0] = AV303Rgb ;
            GXv_int61[0] = AV299R ;
            GXv_int63[0] = AV74G ;
            GXv_int64[0] = AV7B ;
            new app.pleorgb(remoteHandle, context).execute( GXv_int62, GXv_int61, GXv_int63, GXv_int64) ;
            webrdtoplanificacion_impl.this.AV303Rgb = GXv_int62[0] ;
            webrdtoplanificacion_impl.this.AV299R = GXv_int61[0] ;
            webrdtoplanificacion_impl.this.AV74G = GXv_int63[0] ;
            webrdtoplanificacion_impl.this.AV7B = GXv_int64[0] ;
            if ( GXutil.strcmp(AV76Hdr, " ") != 0 )
            {
               AV10Barcod = (int)(GXutil.lval( GXutil.substring( AV76Hdr, 1, 8))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Barcod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Barcod), "ZZZZZZZ9")));
               AV18Barcodreo = (byte)(GXutil.lval( GXutil.substring( AV76Hdr, 10, 1))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18Barcodreo", GXutil.str( AV18Barcodreo, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Barcodreo), "9")));
               AV14Barcodpar = GXutil.substring( AV76Hdr, 11, 1) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14Barcodpar", AV14Barcodpar);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14Barcodpar, ""))));
               GXv_char60[0] = AV62EmprCod ;
               GXv_int6[0] = AV10Barcod ;
               GXv_int65[0] = AV18Barcodreo ;
               GXv_char59[0] = AV14Barcodpar ;
               GXv_int66[0] = AV32BarFasestGrid1 ;
               new app.pcp0999(remoteHandle, context).execute( GXv_char60, GXv_int6, GXv_int65, GXv_char59, GXv_int66) ;
               webrdtoplanificacion_impl.this.AV62EmprCod = GXv_char60[0] ;
               webrdtoplanificacion_impl.this.AV10Barcod = GXv_int6[0] ;
               webrdtoplanificacion_impl.this.AV18Barcodreo = GXv_int65[0] ;
               webrdtoplanificacion_impl.this.AV14Barcodpar = GXv_char59[0] ;
               webrdtoplanificacion_impl.this.AV32BarFasestGrid1 = GXv_int66[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV62EmprCod", AV62EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV10Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Barcod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Barcod), "ZZZZZZZ9")));
               httpContext.ajax_rsp_assign_attri("", false, "AV18Barcodreo", GXutil.str( AV18Barcodreo, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Barcodreo), "9")));
               httpContext.ajax_rsp_assign_attri("", false, "AV14Barcodpar", AV14Barcodpar);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14Barcodpar, ""))));
               AV64EstadoFasegrid = ((AV32BarFasestGrid1==9) ? httpContext.getMessage( "TIN:-", "") : httpContext.getMessage( "TIN:", "")+GXutil.str( AV32BarFasestGrid1, 1, 0)) ;
               AV303Rgb = ((GXutil.strcmp("", AV344Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV344Texto, 50, 10), ".")))) ;
               GXv_int62[0] = AV303Rgb ;
               GXv_int64[0] = AV299R ;
               GXv_int63[0] = AV74G ;
               GXv_int61[0] = AV7B ;
               new app.pleorgb(remoteHandle, context).execute( GXv_int62, GXv_int64, GXv_int63, GXv_int61) ;
               webrdtoplanificacion_impl.this.AV303Rgb = GXv_int62[0] ;
               webrdtoplanificacion_impl.this.AV299R = GXv_int64[0] ;
               webrdtoplanificacion_impl.this.AV74G = GXv_int63[0] ;
               webrdtoplanificacion_impl.this.AV7B = GXv_int61[0] ;
               GXv_int62[0] = AV303Rgb ;
               GXv_int64[0] = AV300R2 ;
               GXv_int63[0] = AV75G2 ;
               GXv_int61[0] = AV8B2 ;
               new app.pleorgb(remoteHandle, context).execute( GXv_int62, GXv_int64, GXv_int63, GXv_int61) ;
               webrdtoplanificacion_impl.this.AV303Rgb = GXv_int62[0] ;
               webrdtoplanificacion_impl.this.AV300R2 = GXv_int64[0] ;
               webrdtoplanificacion_impl.this.AV75G2 = GXv_int63[0] ;
               webrdtoplanificacion_impl.this.AV8B2 = GXv_int61[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV300R2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV300R2), 3, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vR2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV300R2), "ZZ9")));
               httpContext.ajax_rsp_assign_attri("", false, "AV75G2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75G2), 3, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vG2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV75G2), "ZZ9")));
               httpContext.ajax_rsp_assign_attri("", false, "AV8B2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8B2), 3, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vB2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8B2), "ZZ9")));
               AV260Min = ((AV300R2<AV75G2) ? ((AV300R2<AV8B2) ? DecimalUtil.doubleToDec(AV300R2) : DecimalUtil.doubleToDec(AV8B2)) : ((AV75G2<AV8B2) ? DecimalUtil.doubleToDec(AV75G2) : DecimalUtil.doubleToDec(AV8B2))) ;
               AV259Max = ((AV300R2>AV75G2) ? ((AV300R2>AV8B2) ? DecimalUtil.doubleToDec(AV300R2) : DecimalUtil.doubleToDec(AV8B2)) : ((AV75G2>AV8B2) ? DecimalUtil.doubleToDec(AV75G2) : DecimalUtil.doubleToDec(AV8B2))) ;
               AV111L = (AV260Min.divide(DecimalUtil.doubleToDec(255), 18, java.math.RoundingMode.DOWN).add(AV259Max.divide(DecimalUtil.doubleToDec(255), 18, java.math.RoundingMode.DOWN))).divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN) ;
               if ( DecimalUtil.compareTo(AV111L, DecimalUtil.stringToDec("0.5")) >= 0 )
               {
                  AV300R2 = (short)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV300R2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV300R2), 3, 0));
                  app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vR2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV300R2), "ZZ9")));
                  AV8B2 = (short)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV8B2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8B2), 3, 0));
                  app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vB2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8B2), "ZZ9")));
                  AV75G2 = (short)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV75G2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75G2), 3, 0));
                  app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vG2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV75G2), "ZZ9")));
               }
               else
               {
                  AV300R2 = (short)(255) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV300R2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV300R2), 3, 0));
                  app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vR2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV300R2), "ZZ9")));
                  AV8B2 = (short)(255) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV8B2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8B2), 3, 0));
                  app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vB2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8B2), "ZZ9")));
                  AV75G2 = (short)(255) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV75G2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75G2), 3, 0));
                  app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vG2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV75G2), "ZZ9")));
               }
            }
            AV76Hdr = ((GXutil.strcmp("", AV344Texto)==0) ? " " : httpContext.getMessage( "Os ", "")+AV76Hdr) ;
            AV48Cant = GXutil.ltrim( GXutil.rtrim( GXutil.substring( AV344Texto, 38, 10))) ;
            AV48Cant = ((GXutil.strcmp("", AV48Cant)==0) ? " " : AV48Cant+httpContext.getMessage( " kg", "")) ;
            if ( AV109j == 1 )
            {
               AV77Hdr1 = GXutil.substring( AV344Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr1_Internalname, AV77Hdr1);
               AV77Hdr1 += GXutil.substring( AV344Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr1_Internalname, AV77Hdr1);
               AV77Hdr1 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr1_Internalname, AV77Hdr1);
               AV77Hdr1 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr1_Internalname, AV77Hdr1);
               AV77Hdr1 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr1_Internalname, AV77Hdr1);
               AV112Linea1 = AV344Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea1_Internalname, AV112Linea1);
               AV304Rgb1 = ((GXutil.strcmp("", AV344Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV344Texto, 50, 10), ".")))) ;
               AV165Maqcod1 = AV339Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV165Maqcod1", AV165Maqcod1);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD1", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV165Maqcod1, ""))));
               AV196MaqCodRc1 = GXutil.substring( AV344Texto, 59, 6) ;
               edtavHdr1_Backcolor = GXutil.getColor( AV299R, AV74G, AV7B) ;
               edtavHdr1_Forecolor = GXutil.getColor( AV300R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 2 )
            {
               AV88Hdr2 = GXutil.substring( AV344Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr2_Internalname, AV88Hdr2);
               AV88Hdr2 += GXutil.substring( AV344Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr2_Internalname, AV88Hdr2);
               AV88Hdr2 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr2_Internalname, AV88Hdr2);
               AV88Hdr2 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr2_Internalname, AV88Hdr2);
               AV88Hdr2 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr2_Internalname, AV88Hdr2);
               AV123Linea2 = AV344Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea2_Internalname, AV123Linea2);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLINEA2"+"_"+sGXsfl_9_idx, getSecureSignedToken( sGXsfl_9_idx, GXutil.rtrim( localUtil.format( AV123Linea2, ""))));
               AV315Rgb2 = ((GXutil.strcmp("", AV344Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV344Texto, 50, 10), ".")))) ;
               AV176Maqcod2 = AV339Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV176Maqcod2", AV176Maqcod2);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV176Maqcod2, ""))));
               AV207MaqCodRc2 = GXutil.substring( AV344Texto, 59, 6) ;
               edtavHdr2_Backcolor = GXutil.getColor( AV299R, AV74G, AV7B) ;
               edtavHdr3_Forecolor = GXutil.getColor( AV300R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 3 )
            {
               AV98Hdr3 = GXutil.substring( AV344Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr3_Internalname, AV98Hdr3);
               AV98Hdr3 += GXutil.substring( AV344Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr3_Internalname, AV98Hdr3);
               AV98Hdr3 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr3_Internalname, AV98Hdr3);
               AV98Hdr3 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr3_Internalname, AV98Hdr3);
               AV98Hdr3 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr3_Internalname, AV98Hdr3);
               AV133Linea3 = AV344Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea3_Internalname, AV133Linea3);
               AV325Rgb3 = ((GXutil.strcmp("", AV344Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV344Texto, 50, 10), ".")))) ;
               AV186Maqcod3 = AV339Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV186Maqcod3", AV186Maqcod3);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD3", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV186Maqcod3, ""))));
               AV217MaqCodRc3 = GXutil.substring( AV344Texto, 59, 6) ;
               edtavHdr3_Backcolor = GXutil.getColor( AV299R, AV74G, AV7B) ;
               edtavHdr3_Forecolor = GXutil.getColor( AV300R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 4 )
            {
               AV99Hdr4 = GXutil.substring( AV344Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr4_Internalname, AV99Hdr4);
               AV99Hdr4 += GXutil.substring( AV344Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr4_Internalname, AV99Hdr4);
               AV99Hdr4 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr4_Internalname, AV99Hdr4);
               AV99Hdr4 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr4_Internalname, AV99Hdr4);
               AV99Hdr4 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr4_Internalname, AV99Hdr4);
               AV134Linea4 = AV344Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea4_Internalname, AV134Linea4);
               AV326Rgb4 = ((GXutil.strcmp("", AV344Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV344Texto, 50, 10), ".")))) ;
               AV187Maqcod4 = AV339Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV187Maqcod4", AV187Maqcod4);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD4", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV187Maqcod4, ""))));
               AV218MaqCodRc4 = GXutil.substring( AV344Texto, 59, 6) ;
               edtavHdr4_Backcolor = GXutil.getColor( AV299R, AV74G, AV7B) ;
               edtavHdr4_Forecolor = GXutil.getColor( AV300R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 5 )
            {
               AV100Hdr5 = GXutil.substring( AV344Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr5_Internalname, AV100Hdr5);
               AV100Hdr5 += GXutil.substring( AV344Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr5_Internalname, AV100Hdr5);
               AV100Hdr5 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr5_Internalname, AV100Hdr5);
               AV100Hdr5 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr5_Internalname, AV100Hdr5);
               AV100Hdr5 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr5_Internalname, AV100Hdr5);
               AV135Linea5 = AV344Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea5_Internalname, AV135Linea5);
               AV327Rgb5 = ((GXutil.strcmp("", AV344Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV344Texto, 50, 10), ".")))) ;
               AV188Maqcod5 = AV339Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV188Maqcod5", AV188Maqcod5);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD5", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV188Maqcod5, ""))));
               AV219MaqCodRc5 = GXutil.substring( AV344Texto, 59, 6) ;
               edtavHdr5_Backcolor = GXutil.getColor( AV299R, AV74G, AV7B) ;
               edtavHdr5_Forecolor = GXutil.getColor( AV300R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 6 )
            {
               AV101Hdr6 = GXutil.substring( AV344Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr6_Internalname, AV101Hdr6);
               AV101Hdr6 += GXutil.substring( AV344Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr6_Internalname, AV101Hdr6);
               AV101Hdr6 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr6_Internalname, AV101Hdr6);
               AV101Hdr6 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr6_Internalname, AV101Hdr6);
               AV101Hdr6 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr6_Internalname, AV101Hdr6);
               AV136Linea6 = AV344Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea6_Internalname, AV136Linea6);
               AV328Rgb6 = ((GXutil.strcmp("", AV344Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV344Texto, 50, 10), ".")))) ;
               AV189Maqcod6 = AV339Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV189Maqcod6", AV189Maqcod6);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD6", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV189Maqcod6, ""))));
               AV220MaqCodRc6 = GXutil.substring( AV344Texto, 59, 6) ;
               edtavHdr6_Backcolor = GXutil.getColor( AV299R, AV74G, AV7B) ;
               edtavHdr6_Forecolor = GXutil.getColor( AV300R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 7 )
            {
               AV102Hdr7 = GXutil.substring( AV344Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr7_Internalname, AV102Hdr7);
               AV102Hdr7 += GXutil.substring( AV344Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr7_Internalname, AV102Hdr7);
               AV102Hdr7 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr7_Internalname, AV102Hdr7);
               AV102Hdr7 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr7_Internalname, AV102Hdr7);
               AV102Hdr7 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr7_Internalname, AV102Hdr7);
               AV137Linea7 = AV344Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea7_Internalname, AV137Linea7);
               AV329Rgb7 = ((GXutil.strcmp("", AV344Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV344Texto, 50, 10), ".")))) ;
               AV190Maqcod7 = AV339Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV190Maqcod7", AV190Maqcod7);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD7", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV190Maqcod7, ""))));
               AV221MaqCodRc7 = GXutil.substring( AV344Texto, 59, 6) ;
               edtavHdr7_Backcolor = GXutil.getColor( AV299R, AV74G, AV7B) ;
               edtavHdr7_Forecolor = GXutil.getColor( AV300R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 8 )
            {
               AV103Hdr8 = GXutil.substring( AV344Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr8_Internalname, AV103Hdr8);
               AV103Hdr8 += GXutil.substring( AV344Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr8_Internalname, AV103Hdr8);
               AV103Hdr8 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr8_Internalname, AV103Hdr8);
               AV103Hdr8 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr8_Internalname, AV103Hdr8);
               AV103Hdr8 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr8_Internalname, AV103Hdr8);
               AV138LInea8 = AV344Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea8_Internalname, AV138LInea8);
               AV330Rgb8 = ((GXutil.strcmp("", AV344Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV344Texto, 50, 10), ".")))) ;
               AV191Maqcod8 = AV339Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV191Maqcod8", AV191Maqcod8);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD8", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV191Maqcod8, ""))));
               AV222MaqCodRc8 = GXutil.substring( AV344Texto, 59, 6) ;
               edtavHdr8_Backcolor = GXutil.getColor( AV299R, AV74G, AV7B) ;
               edtavHdr8_Forecolor = GXutil.getColor( AV300R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 9 )
            {
               AV104Hdr9 = GXutil.substring( AV344Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr9_Internalname, AV104Hdr9);
               AV104Hdr9 += GXutil.substring( AV344Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr9_Internalname, AV104Hdr9);
               AV104Hdr9 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr9_Internalname, AV104Hdr9);
               AV104Hdr9 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr9_Internalname, AV104Hdr9);
               AV104Hdr9 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr9_Internalname, AV104Hdr9);
               AV139Linea9 = AV344Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea9_Internalname, AV139Linea9);
               AV331Rgb9 = ((GXutil.strcmp("", AV344Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV344Texto, 50, 10), ".")))) ;
               AV192Maqcod9 = AV339Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV192Maqcod9", AV192Maqcod9);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD9", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV192Maqcod9, ""))));
               AV223MaqCodRc9 = GXutil.substring( AV344Texto, 59, 6) ;
               edtavHdr9_Backcolor = GXutil.getColor( AV299R, AV74G, AV7B) ;
               edtavHdr9_Forecolor = GXutil.getColor( AV300R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 10 )
            {
               AV78Hdr10 = GXutil.substring( AV344Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr10_Internalname, AV78Hdr10);
               AV78Hdr10 += GXutil.substring( AV344Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr10_Internalname, AV78Hdr10);
               AV78Hdr10 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr10_Internalname, AV78Hdr10);
               AV78Hdr10 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr10_Internalname, AV78Hdr10);
               AV78Hdr10 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr10_Internalname, AV78Hdr10);
               AV113Linea10 = AV344Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea10_Internalname, AV113Linea10);
               AV305Rgb10 = ((GXutil.strcmp("", AV344Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV344Texto, 50, 10), ".")))) ;
               AV166MaqCod10 = AV339Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV166MaqCod10", AV166MaqCod10);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD10", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV166MaqCod10, ""))));
               AV197MaqCodRc10 = GXutil.substring( AV344Texto, 59, 6) ;
               edtavHdr10_Backcolor = GXutil.getColor( AV299R, AV74G, AV7B) ;
               edtavHdr10_Forecolor = GXutil.getColor( AV300R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 11 )
            {
               AV79Hdr11 = GXutil.substring( AV344Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr11_Internalname, AV79Hdr11);
               AV79Hdr11 += GXutil.substring( AV344Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr11_Internalname, AV79Hdr11);
               AV79Hdr11 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr11_Internalname, AV79Hdr11);
               AV79Hdr11 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr11_Internalname, AV79Hdr11);
               AV79Hdr11 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr11_Internalname, AV79Hdr11);
               AV114Linea11 = AV344Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea11_Internalname, AV114Linea11);
               AV306Rgb11 = ((GXutil.strcmp("", AV344Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV344Texto, 50, 10), ".")))) ;
               AV167Maqcod11 = AV339Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV167Maqcod11", AV167Maqcod11);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD11", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV167Maqcod11, ""))));
               AV198MaqCodRc11 = GXutil.substring( AV344Texto, 59, 6) ;
               edtavHdr11_Backcolor = GXutil.getColor( AV299R, AV74G, AV7B) ;
               edtavHdr11_Forecolor = GXutil.getColor( AV300R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 12 )
            {
               AV80Hdr12 = GXutil.substring( AV344Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr12_Internalname, AV80Hdr12);
               AV80Hdr12 += GXutil.substring( AV344Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr12_Internalname, AV80Hdr12);
               AV80Hdr12 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr12_Internalname, AV80Hdr12);
               AV80Hdr12 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr12_Internalname, AV80Hdr12);
               AV80Hdr12 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr12_Internalname, AV80Hdr12);
               AV115Linea12 = AV344Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea12_Internalname, AV115Linea12);
               AV307Rgb12 = ((GXutil.strcmp("", AV344Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV344Texto, 50, 10), ".")))) ;
               AV168MaqCod12 = AV339Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV168MaqCod12", AV168MaqCod12);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD12", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV168MaqCod12, ""))));
               AV199MaqCodRc12 = GXutil.substring( AV344Texto, 59, 6) ;
               edtavHdr12_Backcolor = GXutil.getColor( AV299R, AV74G, AV7B) ;
               edtavHdr12_Forecolor = GXutil.getColor( AV300R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 13 )
            {
               AV81Hdr13 = GXutil.substring( AV344Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr13_Internalname, AV81Hdr13);
               AV81Hdr13 += GXutil.substring( AV344Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr13_Internalname, AV81Hdr13);
               AV81Hdr13 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr13_Internalname, AV81Hdr13);
               AV81Hdr13 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr13_Internalname, AV81Hdr13);
               AV81Hdr13 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr13_Internalname, AV81Hdr13);
               AV116Linea13 = AV344Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea13_Internalname, AV116Linea13);
               AV308Rgb13 = ((GXutil.strcmp("", AV344Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV344Texto, 50, 10), ".")))) ;
               AV169Maqcod13 = AV339Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV169Maqcod13", AV169Maqcod13);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD13", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV169Maqcod13, ""))));
               AV200MaqCodRc13 = GXutil.substring( AV344Texto, 59, 6) ;
               edtavHdr13_Backcolor = GXutil.getColor( AV299R, AV74G, AV7B) ;
               edtavHdr13_Forecolor = GXutil.getColor( AV300R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 14 )
            {
               AV82Hdr14 = GXutil.substring( AV344Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr14_Internalname, AV82Hdr14);
               AV82Hdr14 += GXutil.substring( AV344Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr14_Internalname, AV82Hdr14);
               AV82Hdr14 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr14_Internalname, AV82Hdr14);
               AV82Hdr14 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr14_Internalname, AV82Hdr14);
               AV82Hdr14 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr14_Internalname, AV82Hdr14);
               AV117Linea14 = AV344Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea14_Internalname, AV117Linea14);
               AV309Rgb14 = ((GXutil.strcmp("", AV344Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV344Texto, 50, 10), ".")))) ;
               AV170Maqcod14 = AV339Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV170Maqcod14", AV170Maqcod14);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD14", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV170Maqcod14, ""))));
               AV201MaqCodRc14 = GXutil.substring( AV344Texto, 59, 6) ;
               edtavHdr14_Backcolor = GXutil.getColor( AV299R, AV74G, AV7B) ;
               edtavHdr14_Forecolor = GXutil.getColor( AV300R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 15 )
            {
               AV83Hdr15 = GXutil.substring( AV344Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr15_Internalname, AV83Hdr15);
               AV83Hdr15 += GXutil.substring( AV344Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr15_Internalname, AV83Hdr15);
               AV83Hdr15 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr15_Internalname, AV83Hdr15);
               AV83Hdr15 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr15_Internalname, AV83Hdr15);
               AV83Hdr15 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr15_Internalname, AV83Hdr15);
               AV118Linea15 = AV344Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea15_Internalname, AV118Linea15);
               AV310Rgb15 = ((GXutil.strcmp("", AV344Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV344Texto, 50, 10), ".")))) ;
               AV171Maqcod15 = AV339Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV171Maqcod15", AV171Maqcod15);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD15", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV171Maqcod15, ""))));
               AV219MaqCodRc5 = GXutil.substring( AV344Texto, 59, 6) ;
               edtavHdr15_Backcolor = GXutil.getColor( AV299R, AV74G, AV7B) ;
               edtavHdr15_Forecolor = GXutil.getColor( AV300R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 16 )
            {
               AV84Hdr16 = GXutil.substring( AV344Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr16_Internalname, AV84Hdr16);
               AV84Hdr16 += GXutil.substring( AV344Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr16_Internalname, AV84Hdr16);
               AV84Hdr16 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr16_Internalname, AV84Hdr16);
               AV84Hdr16 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr16_Internalname, AV84Hdr16);
               AV84Hdr16 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr16_Internalname, AV84Hdr16);
               AV119Linea16 = AV344Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea16_Internalname, AV119Linea16);
               AV311Rgb16 = ((GXutil.strcmp("", AV344Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV344Texto, 50, 10), ".")))) ;
               AV172Maqcod16 = AV339Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV172Maqcod16", AV172Maqcod16);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD16", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV172Maqcod16, ""))));
               AV203MaqCodRc16 = GXutil.substring( AV344Texto, 59, 6) ;
               edtavHdr16_Backcolor = GXutil.getColor( AV299R, AV74G, AV7B) ;
               edtavHdr16_Forecolor = GXutil.getColor( AV300R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 17 )
            {
               AV85Hdr17 = GXutil.substring( AV344Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr17_Internalname, AV85Hdr17);
               AV85Hdr17 += GXutil.substring( AV344Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr17_Internalname, AV85Hdr17);
               AV85Hdr17 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr17_Internalname, AV85Hdr17);
               AV85Hdr17 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr17_Internalname, AV85Hdr17);
               AV88Hdr2 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr2_Internalname, AV88Hdr2);
               AV120Linea17 = AV344Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea17_Internalname, AV120Linea17);
               AV312Rgb17 = ((GXutil.strcmp("", AV344Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV344Texto, 50, 10), ".")))) ;
               AV173Maqcod17 = AV339Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV173Maqcod17", AV173Maqcod17);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD17", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV173Maqcod17, ""))));
               AV204MaqCodRc17 = GXutil.substring( AV344Texto, 59, 6) ;
               edtavHdr17_Backcolor = GXutil.getColor( AV299R, AV74G, AV7B) ;
               edtavHdr17_Forecolor = GXutil.getColor( AV300R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 18 )
            {
               AV86Hdr18 = GXutil.substring( AV344Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr18_Internalname, AV86Hdr18);
               AV86Hdr18 += GXutil.substring( AV344Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr18_Internalname, AV86Hdr18);
               AV86Hdr18 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr18_Internalname, AV86Hdr18);
               AV86Hdr18 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr18_Internalname, AV86Hdr18);
               AV86Hdr18 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr18_Internalname, AV86Hdr18);
               AV121Linea18 = AV344Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea18_Internalname, AV121Linea18);
               AV313Rgb18 = ((GXutil.strcmp("", AV344Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV344Texto, 50, 10), ".")))) ;
               AV174Maqcod18 = AV339Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV174Maqcod18", AV174Maqcod18);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD18", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV174Maqcod18, ""))));
               AV205MaqCodRc18 = GXutil.substring( AV344Texto, 59, 6) ;
               edtavHdr18_Backcolor = GXutil.getColor( AV299R, AV74G, AV7B) ;
               edtavHdr18_Forecolor = GXutil.getColor( AV300R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 19 )
            {
               AV87Hdr19 = GXutil.substring( AV344Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr19_Internalname, AV87Hdr19);
               AV87Hdr19 += GXutil.substring( AV344Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr19_Internalname, AV87Hdr19);
               AV87Hdr19 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr19_Internalname, AV87Hdr19);
               AV87Hdr19 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr19_Internalname, AV87Hdr19);
               AV87Hdr19 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr19_Internalname, AV87Hdr19);
               AV122Linea19 = AV344Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea19_Internalname, AV122Linea19);
               AV314Rgb19 = ((GXutil.strcmp("", AV344Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV344Texto, 50, 10), ".")))) ;
               AV175Maqcod19 = AV339Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV175Maqcod19", AV175Maqcod19);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD19", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV175Maqcod19, ""))));
               AV206MaqCodRc19 = GXutil.substring( AV344Texto, 59, 6) ;
               edtavHdr19_Backcolor = GXutil.getColor( AV299R, AV74G, AV7B) ;
               edtavHdr19_Forecolor = GXutil.getColor( AV300R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 20 )
            {
               AV89Hdr20 = GXutil.substring( AV344Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr20_Internalname, AV89Hdr20);
               AV89Hdr20 += GXutil.substring( AV344Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr20_Internalname, AV89Hdr20);
               AV89Hdr20 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr20_Internalname, AV89Hdr20);
               AV89Hdr20 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr20_Internalname, AV89Hdr20);
               AV89Hdr20 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr20_Internalname, AV89Hdr20);
               AV124Linea20 = AV344Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea20_Internalname, AV124Linea20);
               AV316Rgb20 = ((GXutil.strcmp("", AV344Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV344Texto, 50, 10), ".")))) ;
               AV177Maqcod20 = AV339Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV177Maqcod20", AV177Maqcod20);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD20", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV177Maqcod20, ""))));
               AV208MaqCodRc20 = GXutil.substring( AV344Texto, 59, 6) ;
               edtavHdr20_Backcolor = GXutil.getColor( AV299R, AV74G, AV7B) ;
               edtavHdr20_Forecolor = GXutil.getColor( AV300R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 21 )
            {
               AV90Hdr21 = GXutil.substring( AV344Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr21_Internalname, AV90Hdr21);
               AV90Hdr21 += GXutil.substring( AV344Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr21_Internalname, AV90Hdr21);
               AV90Hdr21 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr21_Internalname, AV90Hdr21);
               AV90Hdr21 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr21_Internalname, AV90Hdr21);
               AV90Hdr21 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr21_Internalname, AV90Hdr21);
               AV125Linea21 = AV344Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea21_Internalname, AV125Linea21);
               AV317Rgb21 = ((GXutil.strcmp("", AV344Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV344Texto, 50, 10), ".")))) ;
               AV178Maqcod21 = AV339Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV178Maqcod21", AV178Maqcod21);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD21", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV178Maqcod21, ""))));
               AV209MaqCodRc21 = GXutil.substring( AV344Texto, 59, 6) ;
               edtavHdr21_Backcolor = GXutil.getColor( AV299R, AV74G, AV7B) ;
               edtavHdr21_Forecolor = GXutil.getColor( AV300R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 22 )
            {
               AV91Hdr22 = GXutil.substring( AV344Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr22_Internalname, AV91Hdr22);
               AV91Hdr22 += GXutil.substring( AV344Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr22_Internalname, AV91Hdr22);
               AV91Hdr22 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr22_Internalname, AV91Hdr22);
               AV91Hdr22 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr22_Internalname, AV91Hdr22);
               AV91Hdr22 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr22_Internalname, AV91Hdr22);
               AV126Linea22 = AV344Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea22_Internalname, AV126Linea22);
               AV318Rgb22 = ((GXutil.strcmp("", AV344Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV344Texto, 50, 10), ".")))) ;
               AV179Maqcod22 = AV339Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV179Maqcod22", AV179Maqcod22);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD22", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV179Maqcod22, ""))));
               AV210MaqCodRc22 = GXutil.substring( AV344Texto, 59, 6) ;
               edtavHdr22_Backcolor = GXutil.getColor( AV299R, AV74G, AV7B) ;
               edtavHdr22_Forecolor = GXutil.getColor( AV300R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 23 )
            {
               AV92Hdr23 = GXutil.substring( AV344Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr23_Internalname, AV92Hdr23);
               AV92Hdr23 += GXutil.substring( AV344Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr23_Internalname, AV92Hdr23);
               AV92Hdr23 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr23_Internalname, AV92Hdr23);
               AV92Hdr23 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr23_Internalname, AV92Hdr23);
               AV92Hdr23 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr23_Internalname, AV92Hdr23);
               AV127Linea23 = AV344Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea23_Internalname, AV127Linea23);
               AV319Rgb23 = ((GXutil.strcmp("", AV344Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV344Texto, 50, 10), ".")))) ;
               AV180Maqcod23 = AV339Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV180Maqcod23", AV180Maqcod23);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD23", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV180Maqcod23, ""))));
               AV211MaqCodRc23 = GXutil.substring( AV344Texto, 59, 6) ;
               edtavHdr23_Backcolor = GXutil.getColor( AV299R, AV74G, AV7B) ;
               edtavHdr23_Forecolor = GXutil.getColor( AV300R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 24 )
            {
               AV93Hdr24 = GXutil.substring( AV344Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr24_Internalname, AV93Hdr24);
               AV93Hdr24 += GXutil.substring( AV344Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr24_Internalname, AV93Hdr24);
               AV93Hdr24 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr24_Internalname, AV93Hdr24);
               AV93Hdr24 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr24_Internalname, AV93Hdr24);
               AV93Hdr24 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr24_Internalname, AV93Hdr24);
               AV128Linea24 = AV344Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea24_Internalname, AV128Linea24);
               AV320Rgb24 = ((GXutil.strcmp("", AV344Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV344Texto, 50, 10), ".")))) ;
               AV181Maqcod24 = AV339Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV181Maqcod24", AV181Maqcod24);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD24", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV181Maqcod24, ""))));
               AV212MaqCodRc24 = GXutil.substring( AV344Texto, 59, 6) ;
               edtavHdr24_Backcolor = GXutil.getColor( AV299R, AV74G, AV7B) ;
               edtavHdr24_Forecolor = GXutil.getColor( AV300R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 25 )
            {
               AV94Hdr25 = GXutil.substring( AV344Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr25_Internalname, AV94Hdr25);
               AV94Hdr25 += GXutil.substring( AV344Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr25_Internalname, AV94Hdr25);
               AV94Hdr25 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr25_Internalname, AV94Hdr25);
               AV94Hdr25 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr25_Internalname, AV94Hdr25);
               AV94Hdr25 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr25_Internalname, AV94Hdr25);
               AV129Linea25 = AV344Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea25_Internalname, AV129Linea25);
               AV321Rgb25 = ((GXutil.strcmp("", AV344Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV344Texto, 50, 10), ".")))) ;
               AV182Maqcod25 = AV339Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV182Maqcod25", AV182Maqcod25);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD25", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV182Maqcod25, ""))));
               AV213MaqCodRc25 = GXutil.substring( AV344Texto, 59, 6) ;
               edtavHdr25_Backcolor = GXutil.getColor( AV299R, AV74G, AV7B) ;
               edtavHdr25_Forecolor = GXutil.getColor( AV300R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 26 )
            {
               AV95Hdr26 = GXutil.substring( AV344Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr26_Internalname, AV95Hdr26);
               AV95Hdr26 += GXutil.substring( AV344Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr26_Internalname, AV95Hdr26);
               AV95Hdr26 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr26_Internalname, AV95Hdr26);
               AV95Hdr26 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr26_Internalname, AV95Hdr26);
               AV95Hdr26 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr26_Internalname, AV95Hdr26);
               AV130Linea26 = AV344Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea26_Internalname, AV130Linea26);
               AV322Rgb26 = ((GXutil.strcmp("", AV344Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV344Texto, 50, 10), ".")))) ;
               AV183Maqcod26 = AV339Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV183Maqcod26", AV183Maqcod26);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD26", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV183Maqcod26, ""))));
               AV214MaqCodRc26 = GXutil.substring( AV344Texto, 59, 6) ;
               edtavHdr26_Backcolor = GXutil.getColor( AV299R, AV74G, AV7B) ;
               edtavHdr26_Forecolor = GXutil.getColor( AV300R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 27 )
            {
               AV96Hdr27 = GXutil.substring( AV344Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr27_Internalname, AV96Hdr27);
               AV96Hdr27 += GXutil.substring( AV344Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr27_Internalname, AV96Hdr27);
               AV96Hdr27 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr27_Internalname, AV96Hdr27);
               AV96Hdr27 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr27_Internalname, AV96Hdr27);
               AV96Hdr27 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr27_Internalname, AV96Hdr27);
               AV131Linea27 = AV344Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea27_Internalname, AV131Linea27);
               AV323Rgb27 = ((GXutil.strcmp("", AV344Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV344Texto, 50, 10), ".")))) ;
               AV184Maqcod27 = AV339Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV184Maqcod27", AV184Maqcod27);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD27", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV184Maqcod27, ""))));
               AV215MaqCodRc27 = GXutil.substring( AV344Texto, 59, 6) ;
               edtavHdr27_Backcolor = GXutil.getColor( AV299R, AV74G, AV7B) ;
               edtavHdr27_Forecolor = GXutil.getColor( AV300R2, AV75G2, AV8B2) ;
            }
            else if ( AV109j == 28 )
            {
               AV97Hdr28 = GXutil.substring( AV344Texto, 1, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr28_Internalname, AV97Hdr28);
               AV97Hdr28 += GXutil.substring( AV344Texto, 14, 13) + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr28_Internalname, AV97Hdr28);
               AV97Hdr28 += AV76Hdr + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr28_Internalname, AV97Hdr28);
               AV97Hdr28 += AV48Cant + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr28_Internalname, AV97Hdr28);
               AV97Hdr28 += AV64EstadoFasegrid + httpContext.getMessage( "<br>", "") ;
               httpContext.ajax_rsp_assign_attri("", false, edtavHdr28_Internalname, AV97Hdr28);
               AV132Linea28 = AV344Texto ;
               httpContext.ajax_rsp_assign_attri("", false, edtavLinea28_Internalname, AV132Linea28);
               AV324Rgb28 = ((GXutil.strcmp("", AV344Texto)==0) ? 16777215 : (long)(DecimalUtil.decToDouble(CommonUtil.decimalVal( GXutil.substring( AV344Texto, 50, 10), ".")))) ;
               AV185Maqcod28 = AV339Tab_maq[AV109j-1] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV185Maqcod28", AV185Maqcod28);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD28", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV185Maqcod28, ""))));
               AV216MaqCodRc28 = GXutil.substring( AV344Texto, 59, 6) ;
               edtavHdr28_Backcolor = GXutil.getColor( AV299R, AV74G, AV7B) ;
               edtavHdr28_Forecolor = GXutil.getColor( AV300R2, AV75G2, AV8B2) ;
            }
            AV109j = (short)(AV109j+1) ;
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(9) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( 5 == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_92( ) ;
            GRID_nEOF = (byte)(1) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
            {
               GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
            }
         }
         if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
         {
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_9_Refreshing )
         {
            httpContext.doAjaxLoad(9, GridRow);
         }
         AV110k = (short)(AV110k+1) ;
         AV270Partidas = AV270Partidas.add(DecimalUtil.doubleToDec(1)) ;
      }
      /*  Sending Event outputs  */
   }

   public void e14AU2( )
   {
      /* 'Exportar RTF' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.webwkp113", new String[] {GXutil.URLEncode(GXutil.rtrim(AV62EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV256Maquinastxt)),GXutil.URLEncode(GXutil.rtrim(AV255MaquinasHdrstxt)),GXutil.URLEncode(GXutil.ltrimstr(AV265NospMaq,4,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "T", ""))),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "Planificacion TINTE", ""))),GXutil.URLEncode(GXutil.rtrim(AV72Filename))}, new String[] {"emprcod","Maquinastxt","MaquinasHdrstxt","NospMaq","Tinte","titulo","Filename"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'CARGOHDRS' Routine */
      returnInSub = false ;
      AV5Archivo.openRead("");
      AV109j = (short)(2) ;
      AV345Texto_l = AV5Archivo.readLine() ;
      while ( ! AV5Archivo.getEof() )
      {
         AV345Texto_l = ((GXutil.len( AV345Texto_l)<=0) ? httpContext.getMessage( "FIN", "") : AV345Texto_l) ;
         if ( GXutil.strcmp(AV345Texto_l, httpContext.getMessage( "FIN", "")) == 0 )
         {
            if (true) break;
         }
         if ( GXutil.strcmp(AV164Maqcod, GXutil.substring( AV345Texto_l, 7, 6)) == 0 )
         {
            AV10Barcod = (int)(GXutil.lval( GXutil.substring( AV345Texto_l, 13, 8))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Barcod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Barcod), "ZZZZZZZ9")));
            AV18Barcodreo = (byte)(GXutil.lval( GXutil.substring( AV345Texto_l, 22, 1))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Barcodreo", GXutil.str( AV18Barcodreo, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Barcodreo), "9")));
            AV14Barcodpar = (GXutil.substring( AV345Texto_l, 23, 1)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Barcodpar", AV14Barcodpar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14Barcodpar, ""))));
            /* Execute user subroutine: 'BARFAS' */
            S124 ();
            if (returnInSub) return;
            GXv_char60[0] = AV62EmprCod ;
            GXv_int6[0] = AV10Barcod ;
            GXv_int66[0] = AV18Barcodreo ;
            GXv_char59[0] = AV14Barcodpar ;
            GXv_int64[0] = AV41Barordlin ;
            GXv_char58[0] = " " ;
            GXv_int65[0] = AV30Barfasestant ;
            GXv_char57[0] = " " ;
            GXv_int63[0] = (short)(0) ;
            GXv_char56[0] = " " ;
            GXv_int67[0] = (byte)(0) ;
            GXv_char55[0] = " " ;
            GXv_int61[0] = (short)(0) ;
            new app.pprc39(remoteHandle, context).execute( GXv_char60, GXv_int6, GXv_int66, GXv_char59, GXv_int64, GXv_char58, GXv_int65, GXv_char57, GXv_int63, GXv_char56, GXv_int67, GXv_char55, GXv_int61) ;
            webrdtoplanificacion_impl.this.AV62EmprCod = GXv_char60[0] ;
            webrdtoplanificacion_impl.this.AV10Barcod = GXv_int6[0] ;
            webrdtoplanificacion_impl.this.AV18Barcodreo = GXv_int66[0] ;
            webrdtoplanificacion_impl.this.AV14Barcodpar = GXv_char59[0] ;
            webrdtoplanificacion_impl.this.AV41Barordlin = GXv_int64[0] ;
            webrdtoplanificacion_impl.this.AV30Barfasestant = GXv_int65[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62EmprCod", AV62EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV10Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Barcod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Barcod), "ZZZZZZZ9")));
            httpContext.ajax_rsp_assign_attri("", false, "AV18Barcodreo", GXutil.str( AV18Barcodreo, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Barcodreo), "9")));
            httpContext.ajax_rsp_assign_attri("", false, "AV14Barcodpar", AV14Barcodpar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14Barcodpar, ""))));
            httpContext.ajax_rsp_assign_attri("", false, "AV41Barordlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Barordlin), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Barordlin), "ZZZ9")));
            httpContext.ajax_rsp_assign_attri("", false, "AV30Barfasestant", GXutil.str( AV30Barfasestant, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASESTANT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV30Barfasestant), "9")));
            GXv_char60[0] = AV62EmprCod ;
            GXv_int6[0] = AV10Barcod ;
            GXv_int67[0] = AV18Barcodreo ;
            GXv_char59[0] = AV14Barcodpar ;
            GXv_int66[0] = AV28BarFasEst ;
            GXv_date68[0] = AV68fecha ;
            GXv_char58[0] = AV193MaqCodBis ;
            new app.pplat07(remoteHandle, context).execute( GXv_char60, GXv_int6, GXv_int67, GXv_char59, GXv_int66, GXv_date68, GXv_char58) ;
            webrdtoplanificacion_impl.this.AV62EmprCod = GXv_char60[0] ;
            webrdtoplanificacion_impl.this.AV10Barcod = GXv_int6[0] ;
            webrdtoplanificacion_impl.this.AV18Barcodreo = GXv_int67[0] ;
            webrdtoplanificacion_impl.this.AV14Barcodpar = GXv_char59[0] ;
            webrdtoplanificacion_impl.this.AV28BarFasEst = GXv_int66[0] ;
            webrdtoplanificacion_impl.this.AV68fecha = GXv_date68[0] ;
            webrdtoplanificacion_impl.this.AV193MaqCodBis = GXv_char58[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62EmprCod", AV62EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV10Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Barcod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Barcod), "ZZZZZZZ9")));
            httpContext.ajax_rsp_assign_attri("", false, "AV18Barcodreo", GXutil.str( AV18Barcodreo, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Barcodreo), "9")));
            httpContext.ajax_rsp_assign_attri("", false, "AV14Barcodpar", AV14Barcodpar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14Barcodpar, ""))));
            if ( AV28BarFasEst < 2 )
            {
               AV344Texto = GXutil.substring( AV345Texto_l, 24, 13) ;
               AV344Texto = ((GXutil.strcmp("", AV344Texto)==0) ? "."+GXutil.space( (short)(12)) : AV344Texto) ;
               AV346Texto1 = AV344Texto ;
               AV344Texto = GXutil.substring( AV345Texto_l, 37, 13) ;
               AV344Texto = ((GXutil.strcmp("", AV344Texto)==0) ? "."+GXutil.space( (short)(12)) : AV344Texto) ;
               AV346Texto1 += AV344Texto ;
               AV344Texto = GXutil.str( AV10Barcod, 8, 0) + "-" + GXutil.str( AV18Barcodreo, 1, 0) + AV14Barcodpar ;
               AV344Texto = ((GXutil.strcmp("", AV344Texto)==0) ? "."+GXutil.space( (short)(9)) : AV344Texto) ;
               AV346Texto1 += AV344Texto ;
               AV344Texto = GXutil.substring( AV345Texto_l, 50, 10) ;
               AV344Texto = ((GXutil.strcmp("", AV344Texto)==0) ? "."+GXutil.space( (short)(9)) : AV344Texto) ;
               AV346Texto1 += AV344Texto ;
               AV344Texto = " " ;
               AV346Texto1 += AV344Texto ;
               AV344Texto = GXutil.substring( AV345Texto_l, 60, 10) ;
               AV346Texto1 += AV344Texto ;
               AV344Texto = GXutil.substring( AV345Texto_l, 1, 6) ;
               AV346Texto1 += AV344Texto ;
               AV253MaqHdrs[AV108i-1][AV109j-1] = AV346Texto1 ;
               AV109j = (short)(AV109j+1) ;
            }
         }
         AV345Texto_l = AV5Archivo.readLine() ;
      }
      AV5Archivo.close();
   }

   public void S124( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      AV41Barordlin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41Barordlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Barordlin), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Barordlin), "ZZZ9")));
      AV65EstadoFaseHdr = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65EstadoFaseHdr", GXutil.str( AV65EstadoFaseHdr, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vESTADOFASEHDR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV65EstadoFaseHdr), "9")));
      /* Using cursor H00AU2 */
      pr_default.execute(0, new Object[] {AV62EmprCod, Integer.valueOf(AV10Barcod), Byte.valueOf(AV18Barcodreo), AV14Barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A153BarFasEst = H00AU2_A153BarFasEst[0] ;
         A150BarFacTin = H00AU2_A150BarFacTin[0] ;
         A130BarCodPar = H00AU2_A130BarCodPar[0] ;
         A132BarCodReo = H00AU2_A132BarCodReo[0] ;
         A129BarCod = H00AU2_A129BarCod[0] ;
         A396EmprCod = H00AU2_A396EmprCod[0] ;
         A194BarOrdLin = H00AU2_A194BarOrdLin[0] ;
         if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
         {
            AV41Barordlin = A194BarOrdLin ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41Barordlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Barordlin), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Barordlin), "ZZZ9")));
            AV65EstadoFaseHdr = A153BarFasEst ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65EstadoFaseHdr", GXutil.str( AV65EstadoFaseHdr, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vESTADOFASEHDR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV65EstadoFaseHdr), "9")));
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   private void e15AU3( )
   {
      /* Gridhdrs_Load Routine */
      returnInSub = false ;
      AV263Nhdrs = 0 ;
      AV348TotKgs = DecimalUtil.doubleToDec(0) ;
      AV67Fec2 = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV67Fec2)) ? GXutil.today( ) : AV67Fec2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67Fec2", localUtil.format(AV67Fec2, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFEC2", getSecureSignedToken( "", AV67Fec2));
      System.out.println( httpContext.getMessage( "Lectura de HDRs pendientes de Planificar", "") );
      lV23BarColNomIn = GXutil.padr( GXutil.rtrim( AV23BarColNomIn), 13, "%") ;
      /* Using cursor H00AU5 */
      pr_default.execute(1, new Object[] {AV62EmprCod, AV66Fec1, Integer.valueOf(AV52CliCodIN), Integer.valueOf(AV52CliCodIN), lV23BarColNomIn, AV23BarColNomIn, AV26BarEnccliIN, AV26BarEnccliIN, AV26BarEnccliIN, Integer.valueOf(AV12BarcodIn), Integer.valueOf(AV12BarcodIn), Byte.valueOf(AV20BarcodreoIN), Byte.valueOf(AV20BarcodreoIN), AV16BarcodparIN, AV16BarcodparIN, AV67Fec2});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A396EmprCod = H00AU5_A396EmprCod[0] ;
         A130BarCodPar = H00AU5_A130BarCodPar[0] ;
         A132BarCodReo = H00AU5_A132BarCodReo[0] ;
         A129BarCod = H00AU5_A129BarCod[0] ;
         A143BarDisNum = H00AU5_A143BarDisNum[0] ;
         A4812BarEncCli = H00AU5_A4812BarEncCli[0] ;
         A135BarColNom = H00AU5_A135BarColNom[0] ;
         A252CliCod = H00AU5_A252CliCod[0] ;
         n252CliCod = H00AU5_n252CliCod[0] ;
         A159BarFecGen = H00AU5_A159BarFecGen[0] ;
         A180BarMaqCod = H00AU5_A180BarMaqCod[0] ;
         A213BarSit = H00AU5_A213BarSit[0] ;
         A120BarAgrEst = H00AU5_A120BarAgrEst[0] ;
         A1652BarSerDsc = H00AU5_A1652BarSerDsc[0] ;
         A212BarSer = H00AU5_A212BarSer[0] ;
         A136BarColNum = H00AU5_A136BarColNum[0] ;
         A279CliNom = H00AU5_A279CliNom[0] ;
         A158BarFecFpr = H00AU5_A158BarFecFpr[0] ;
         A1234BarNomCli = H00AU5_A1234BarNomCli[0] ;
         A361DisCod = H00AU5_A361DisCod[0] ;
         A218BarTipCol = H00AU5_A218BarTipCol[0] ;
         A13234BarRGB = H00AU5_A13234BarRGB[0] ;
         A166BarKgm = H00AU5_A166BarKgm[0] ;
         A219BarTotAgr = H00AU5_A219BarTotAgr[0] ;
         n219BarTotAgr = H00AU5_n219BarTotAgr[0] ;
         A166BarKgm = H00AU5_A166BarKgm[0] ;
         A219BarTotAgr = H00AU5_A219BarTotAgr[0] ;
         n219BarTotAgr = H00AU5_n219BarTotAgr[0] ;
         A279CliNom = H00AU5_A279CliNom[0] ;
         if ( A219BarTotAgr.doubleValue() != 0 )
         {
            A812RecTotKgm = A219BarTotAgr.add(A166BarKgm) ;
            httpContext.ajax_rsp_assign_attri("", false, "A812RecTotKgm", GXutil.ltrimstr( A812RecTotKgm, 10, 2));
         }
         else
         {
            A812RecTotKgm = A166BarKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "A812RecTotKgm", GXutil.ltrimstr( A812RecTotKgm, 10, 2));
         }
         AV13Barcodm = A129BarCod ;
         AV21Barcodreom = A132BarCodReo ;
         AV17Barcodparm = A130BarCodPar ;
         AV703Op = "" ;
         if ( GXutil.strcmp(A120BarAgrEst, httpContext.getMessage( "S", "")) == 0 )
         {
            new app.pminagr(remoteHandle, context).execute( A396EmprCod, AV13Barcodm, AV21Barcodreom, AV17Barcodparm) ;
            if ( ( A129BarCod == AV13Barcodm ) && ( A132BarCodReo == AV21Barcodreom ) && ( GXutil.strcmp(A130BarCodPar, AV17Barcodparm) == 0 ) )
            {
               AV703Op = "*" ;
            }
         }
         else
         {
            AV703Op = "*" ;
         }
         AV10Barcod = A129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Barcod), 8, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Barcod), "ZZZZZZZ9")));
         AV18Barcodreo = A132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Barcodreo", GXutil.str( AV18Barcodreo, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Barcodreo), "9")));
         AV14Barcodpar = A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Barcodpar", AV14Barcodpar);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14Barcodpar, ""))));
         /* Execute user subroutine: 'BARFAS' */
         S124 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            pr_default.close(1);
            pr_default.close(1);
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
         if ( ( AV41Barordlin > 0 ) && ( AV65EstadoFaseHdr == 0 ) )
         {
            GXv_char60[0] = AV62EmprCod ;
            GXv_int6[0] = AV10Barcod ;
            GXv_int67[0] = AV18Barcodreo ;
            GXv_char59[0] = AV14Barcodpar ;
            GXv_int64[0] = AV41Barordlin ;
            GXv_char58[0] = " " ;
            GXv_int66[0] = (byte)(0) ;
            GXv_char57[0] = " " ;
            GXv_int63[0] = (short)(0) ;
            GXv_char56[0] = " " ;
            GXv_int65[0] = AV33BarFasEstSig ;
            GXv_char55[0] = " " ;
            GXv_int61[0] = (short)(0) ;
            new app.pprc39(remoteHandle, context).execute( GXv_char60, GXv_int6, GXv_int67, GXv_char59, GXv_int64, GXv_char58, GXv_int66, GXv_char57, GXv_int63, GXv_char56, GXv_int65, GXv_char55, GXv_int61) ;
            webrdtoplanificacion_impl.this.AV62EmprCod = GXv_char60[0] ;
            webrdtoplanificacion_impl.this.AV10Barcod = GXv_int6[0] ;
            webrdtoplanificacion_impl.this.AV18Barcodreo = GXv_int67[0] ;
            webrdtoplanificacion_impl.this.AV14Barcodpar = GXv_char59[0] ;
            webrdtoplanificacion_impl.this.AV41Barordlin = GXv_int64[0] ;
            webrdtoplanificacion_impl.this.AV33BarFasEstSig = GXv_int65[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62EmprCod", AV62EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV10Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Barcod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV10Barcod), "ZZZZZZZ9")));
            httpContext.ajax_rsp_assign_attri("", false, "AV18Barcodreo", GXutil.str( AV18Barcodreo, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Barcodreo), "9")));
            httpContext.ajax_rsp_assign_attri("", false, "AV14Barcodpar", AV14Barcodpar);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14Barcodpar, ""))));
            httpContext.ajax_rsp_assign_attri("", false, "AV41Barordlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Barordlin), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV41Barordlin), "ZZZ9")));
            httpContext.ajax_rsp_assign_attri("", false, "AV33BarFasEstSig", GXutil.str( AV33BarFasEstSig, 1, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARFASESTSIG", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33BarFasEstSig), "9")));
            GXv_char60[0] = A396EmprCod ;
            GXv_int6[0] = A129BarCod ;
            GXv_int67[0] = A132BarCodReo ;
            GXv_char59[0] = A130BarCodPar ;
            GXv_int66[0] = AV31BarFasEstgrid ;
            GXv_date68[0] = AV68fecha ;
            GXv_char58[0] = " " ;
            GXv_char57[0] = AV27BarFacTingrid ;
            new app.ptintefase(remoteHandle, context).execute( GXv_char60, GXv_int6, GXv_int67, GXv_char59, GXv_int66, GXv_date68, GXv_char58, GXv_char57) ;
            webrdtoplanificacion_impl.this.A396EmprCod = GXv_char60[0] ;
            webrdtoplanificacion_impl.this.A129BarCod = GXv_int6[0] ;
            webrdtoplanificacion_impl.this.A132BarCodReo = GXv_int67[0] ;
            webrdtoplanificacion_impl.this.A130BarCodPar = GXv_char59[0] ;
            webrdtoplanificacion_impl.this.AV31BarFasEstgrid = GXv_int66[0] ;
            webrdtoplanificacion_impl.this.AV68fecha = GXv_date68[0] ;
            webrdtoplanificacion_impl.this.AV27BarFacTingrid = GXv_char57[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            AV106Hdrmngrid = GXutil.str( AV13Barcodm, 8, 0) + "-" + GXutil.str( AV21Barcodreom, 1, 0) + AV17Barcodparm ;
            GXv_int6[0] = AV162Maccod ;
            new app.pbusmace(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int6) ;
            webrdtoplanificacion_impl.this.AV162Maccod = GXv_int6[0] ;
            httpContext.ajax_rsp_assign_attri("", false, edtavMaccod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV162Maccod), 8, 0));
            if ( GXutil.strcmp(AV703Op, "*") == 0 )
            {
               if ( GXutil.strcmp(AV27BarFacTingrid, httpContext.getMessage( "S", "")) == 0 )
               {
                  if ( AV31BarFasEstgrid == 0 )
                  {
                     if ( AV33BarFasEstSig == 0 )
                     {
                        AV105Hdrgrid = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
                        httpContext.ajax_rsp_assign_attri("", false, edtavHdrgrid_Internalname, AV105Hdrgrid);
                        AV9BarAgrestgrid = A120BarAgrEst ;
                        httpContext.ajax_rsp_assign_attri("", false, edtavBaragrestgrid_Internalname, AV9BarAgrestgrid);
                        AV43BarSerDscgrid = A1652BarSerDsc ;
                        httpContext.ajax_rsp_assign_attri("", false, edtavBarserdscgrid_Internalname, AV43BarSerDscgrid);
                        AV44BarserGrid = A212BarSer ;
                        httpContext.ajax_rsp_assign_attri("", false, edtavBarsergrid_Internalname, AV44BarserGrid);
                        AV22BarcolNomgrid = A135BarColNom ;
                        httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnomgrid_Internalname, AV22BarcolNomgrid);
                        AV24Barcolnumgrid = A136BarColNum ;
                        AV37BarKgsgrid = A166BarKgm ;
                        httpContext.ajax_rsp_assign_attri("", false, edtavBarkgsgrid_Internalname, GXutil.ltrimstr( AV37BarKgsgrid, 9, 2));
                        AV302Rectotkgmgrid = A812RecTotKgm ;
                        httpContext.ajax_rsp_assign_attri("", false, edtavRectotkgmgrid_Internalname, GXutil.ltrimstr( AV302Rectotkgmgrid, 10, 2));
                        AV39Barmaqcodgrid = A180BarMaqCod ;
                        AV45BarSitgrid = A213BarSit ;
                        httpContext.ajax_rsp_assign_attri("", false, edtavBarsitgrid_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45BarSitgrid), 2, 0));
                        AV51ClicodGrid = A252CliCod ;
                        AV53CliNomgrid = A279CliNom ;
                        httpContext.ajax_rsp_assign_attri("", false, edtavClinomgrid_Internalname, AV53CliNomgrid);
                        AV35Barfecgengrid = A159BarFecGen ;
                        httpContext.ajax_rsp_assign_attri("", false, edtavBarfecgengrid_Internalname, localUtil.format(AV35Barfecgengrid, "99/99/99"));
                        AV34barfecfprgrid = A158BarFecFpr ;
                        httpContext.ajax_rsp_assign_attri("", false, edtavBarfecfprgrid_Internalname, localUtil.format(AV34barfecfprgrid, "99/99/99"));
                        AV25BarEnccligrid = ((GXutil.strcmp("", A4812BarEncCli)==0) ? A143BarDisNum : A4812BarEncCli) ;
                        httpContext.ajax_rsp_assign_attri("", false, edtavBarenccligrid_Internalname, AV25BarEnccligrid);
                        AV268OpGrid = httpContext.getMessage( "N", "") ;
                        httpContext.ajax_rsp_assign_attri("", false, chkavOpgrid.getInternalname(), AV268OpGrid);
                        AV40Barnomcligrid = A1234BarNomCli ;
                        AV11Barcodgrid = A129BarCod ;
                        AV19Barcodreogrid = A132BarCodReo ;
                        AV15barcodpargrid = A130BarCodPar ;
                        AV61DisCodGrid = A361DisCod ;
                        AV46BarTipcolgrid = A218BarTipCol ;
                        AV42BarRgb = ((A13234BarRGB<0) ? 16777215 : A13234BarRGB) ;
                        GXv_int62[0] = AV42BarRgb ;
                        GXv_int64[0] = AV299R ;
                        GXv_int63[0] = AV74G ;
                        GXv_int61[0] = AV7B ;
                        new app.pleorgb(remoteHandle, context).execute( GXv_int62, GXv_int64, GXv_int63, GXv_int61) ;
                        webrdtoplanificacion_impl.this.AV42BarRgb = GXv_int62[0] ;
                        webrdtoplanificacion_impl.this.AV299R = GXv_int64[0] ;
                        webrdtoplanificacion_impl.this.AV74G = GXv_int63[0] ;
                        webrdtoplanificacion_impl.this.AV7B = GXv_int61[0] ;
                        GXv_int62[0] = AV42BarRgb ;
                        GXv_int64[0] = AV300R2 ;
                        GXv_int63[0] = AV75G2 ;
                        GXv_int61[0] = AV8B2 ;
                        new app.pleorgb(remoteHandle, context).execute( GXv_int62, GXv_int64, GXv_int63, GXv_int61) ;
                        webrdtoplanificacion_impl.this.AV42BarRgb = GXv_int62[0] ;
                        webrdtoplanificacion_impl.this.AV300R2 = GXv_int64[0] ;
                        webrdtoplanificacion_impl.this.AV75G2 = GXv_int63[0] ;
                        webrdtoplanificacion_impl.this.AV8B2 = GXv_int61[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV300R2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV300R2), 3, 0));
                        app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vR2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV300R2), "ZZ9")));
                        httpContext.ajax_rsp_assign_attri("", false, "AV75G2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75G2), 3, 0));
                        app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vG2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV75G2), "ZZ9")));
                        httpContext.ajax_rsp_assign_attri("", false, "AV8B2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8B2), 3, 0));
                        app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vB2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8B2), "ZZ9")));
                        AV260Min = ((AV300R2<AV75G2) ? ((AV300R2<AV8B2) ? DecimalUtil.doubleToDec(AV300R2) : DecimalUtil.doubleToDec(AV8B2)) : ((AV75G2<AV8B2) ? DecimalUtil.doubleToDec(AV75G2) : DecimalUtil.doubleToDec(AV8B2))) ;
                        AV259Max = ((AV300R2>AV75G2) ? ((AV300R2>AV8B2) ? DecimalUtil.doubleToDec(AV300R2) : DecimalUtil.doubleToDec(AV8B2)) : ((AV75G2>AV8B2) ? DecimalUtil.doubleToDec(AV75G2) : DecimalUtil.doubleToDec(AV8B2))) ;
                        AV111L = (AV260Min.divide(DecimalUtil.doubleToDec(255), 18, java.math.RoundingMode.DOWN).add(AV259Max.divide(DecimalUtil.doubleToDec(255), 18, java.math.RoundingMode.DOWN))).divide(DecimalUtil.doubleToDec(2), 18, java.math.RoundingMode.DOWN) ;
                        if ( DecimalUtil.compareTo(AV111L, DecimalUtil.stringToDec("0.5")) >= 0 )
                        {
                           AV300R2 = (short)(0) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV300R2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV300R2), 3, 0));
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vR2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV300R2), "ZZ9")));
                           AV8B2 = (short)(0) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV8B2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8B2), 3, 0));
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vB2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8B2), "ZZ9")));
                           AV75G2 = (short)(0) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV75G2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75G2), 3, 0));
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vG2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV75G2), "ZZ9")));
                        }
                        else
                        {
                           AV300R2 = (short)(255) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV300R2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV300R2), 3, 0));
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vR2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV300R2), "ZZ9")));
                           AV8B2 = (short)(255) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV8B2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8B2), 3, 0));
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vB2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8B2), "ZZ9")));
                           AV75G2 = (short)(255) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV75G2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75G2), 3, 0));
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vG2", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV75G2), "ZZ9")));
                        }
                        edtavBarcolnomgrid_Backcolor = GXutil.getColor( AV299R, AV74G, AV7B) ;
                        edtavBarcolnomgrid_Forecolor = GXutil.getColor( AV300R2, AV75G2, AV8B2) ;
                        AV348TotKgs = AV348TotKgs.add(A812RecTotKgm) ;
                        AV263Nhdrs = (int)(AV263Nhdrs+1) ;
                        /* Load Method */
                        if ( wbStart != -1 )
                        {
                           wbStart = (short)(71) ;
                        }
                        if ( ( subGridhdrs_Islastpage == 1 ) || ( 5 == 0 ) || ( ( GRIDHDRS_nCurrentRecord >= GRIDHDRS_nFirstRecordOnPage ) && ( GRIDHDRS_nCurrentRecord < GRIDHDRS_nFirstRecordOnPage + subgridhdrs_fnc_recordsperpage( ) ) ) )
                        {
                           sendrow_713( ) ;
                           GRIDHDRS_nEOF = (byte)(1) ;
                           app.GxWebStd.gx_hidden_field( httpContext, "GRIDHDRS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDHDRS_nEOF, (byte)(1), (byte)(0), ".", "")));
                           if ( ( subGridhdrs_Islastpage == 1 ) && ( ((int)((GRIDHDRS_nCurrentRecord) % (subgridhdrs_fnc_recordsperpage( )))) == 0 ) )
                           {
                              GRIDHDRS_nFirstRecordOnPage = GRIDHDRS_nCurrentRecord ;
                           }
                        }
                        if ( GRIDHDRS_nCurrentRecord >= GRIDHDRS_nFirstRecordOnPage + subgridhdrs_fnc_recordsperpage( ) )
                        {
                           GRIDHDRS_nEOF = (byte)(0) ;
                           app.GxWebStd.gx_hidden_field( httpContext, "GRIDHDRS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDHDRS_nEOF, (byte)(1), (byte)(0), ".", "")));
                        }
                        GRIDHDRS_nCurrentRecord = (long)(GRIDHDRS_nCurrentRecord+1) ;
                        if ( isFullAjaxMode( ) && ! bGXsfl_71_Refreshing )
                        {
                           httpContext.doAjaxLoad(71, GridhdrsRow);
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      System.out.println( " " );
      /*  Sending Event outputs  */
   }

   public void wb_table3_89_AU2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"Center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-Center;text-align:-moz-Center;text-align:-webkit-Center;vertical-align:Middle")+"\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group gx-label-top", "left", "top", ""+" data-gx-for=\""+edtavMsgcontrol_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 100, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMsgcontrol_Internalname, AV699MsgControl, GXutil.rtrim( localUtil.format( AV699MsgControl, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMsgcontrol_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavMsgcontrol_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebRdtoPlanificacion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_89_AU2e( true) ;
      }
      else
      {
         wb_table3_89_AU2e( false) ;
      }
   }

   public void wb_table2_68_AU2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\""+GXutil.CssPrettify( "vertical-align:Middle")+"\">") ;
         /*  Grid Control  */
         GridhdrsContainer.SetWrapped(nGXWrapped);
         startgridcontrol71( ) ;
      }
      if ( wbEnd == 71 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_71 = (int)(nGXsfl_71_idx-1) ;
         if ( GridhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            GridhdrsContainer.AddObjectProperty("GRIDHDRS_nEOF", GRIDHDRS_nEOF);
            GridhdrsContainer.AddObjectProperty("GRIDHDRS_nFirstRecordOnPage", GRIDHDRS_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"GridhdrsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Gridhdrs", GridhdrsContainer, subGridhdrs_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridhdrsContainerData", GridhdrsContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridhdrsContainerData"+"V", GridhdrsContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridhdrsContainerData"+"V"+"\" value='"+GridhdrsContainer.GridValuesHidden()+"'/>") ;
            }
         }
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_68_AU2e( true) ;
      }
      else
      {
         wb_table2_68_AU2e( false) ;
      }
   }

   public void wb_table1_6_AU2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol9( ) ;
      }
      if ( wbEnd == 9 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_9 = (int)(nGXsfl_9_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
            GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer, subGrid_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
            }
         }
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_6_AU2e( true) ;
      }
      else
      {
         wb_table1_6_AU2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
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
      paAU2( ) ;
      wsAU2( ) ;
      weAU2( ) ;
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
      httpContext.setWrapped(false);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20267101111929", true, true);
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
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("messages."+httpContext.getLanguageProperty( "code")+".js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
         httpContext.AddJavascriptSource("webrdtoplanificacion.js", "?20267101111930", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_92( )
   {
      edtavHdr1_Internalname = "vHDR1_"+sGXsfl_9_idx ;
      edtavHdr2_Internalname = "vHDR2_"+sGXsfl_9_idx ;
      edtavHdr3_Internalname = "vHDR3_"+sGXsfl_9_idx ;
      edtavHdr4_Internalname = "vHDR4_"+sGXsfl_9_idx ;
      edtavHdr5_Internalname = "vHDR5_"+sGXsfl_9_idx ;
      edtavHdr6_Internalname = "vHDR6_"+sGXsfl_9_idx ;
      edtavHdr7_Internalname = "vHDR7_"+sGXsfl_9_idx ;
      edtavHdr8_Internalname = "vHDR8_"+sGXsfl_9_idx ;
      edtavHdr9_Internalname = "vHDR9_"+sGXsfl_9_idx ;
      edtavHdr10_Internalname = "vHDR10_"+sGXsfl_9_idx ;
      edtavHdr11_Internalname = "vHDR11_"+sGXsfl_9_idx ;
      edtavHdr12_Internalname = "vHDR12_"+sGXsfl_9_idx ;
      edtavHdr13_Internalname = "vHDR13_"+sGXsfl_9_idx ;
      edtavHdr14_Internalname = "vHDR14_"+sGXsfl_9_idx ;
      edtavHdr15_Internalname = "vHDR15_"+sGXsfl_9_idx ;
      edtavHdr16_Internalname = "vHDR16_"+sGXsfl_9_idx ;
      edtavHdr17_Internalname = "vHDR17_"+sGXsfl_9_idx ;
      edtavHdr18_Internalname = "vHDR18_"+sGXsfl_9_idx ;
      edtavHdr19_Internalname = "vHDR19_"+sGXsfl_9_idx ;
      edtavHdr20_Internalname = "vHDR20_"+sGXsfl_9_idx ;
      edtavHdr21_Internalname = "vHDR21_"+sGXsfl_9_idx ;
      edtavHdr22_Internalname = "vHDR22_"+sGXsfl_9_idx ;
      edtavHdr23_Internalname = "vHDR23_"+sGXsfl_9_idx ;
      edtavHdr24_Internalname = "vHDR24_"+sGXsfl_9_idx ;
      edtavHdr25_Internalname = "vHDR25_"+sGXsfl_9_idx ;
      edtavHdr26_Internalname = "vHDR26_"+sGXsfl_9_idx ;
      edtavHdr27_Internalname = "vHDR27_"+sGXsfl_9_idx ;
      edtavHdr28_Internalname = "vHDR28_"+sGXsfl_9_idx ;
      edtavLinea1_Internalname = "vLINEA1_"+sGXsfl_9_idx ;
      edtavLinea2_Internalname = "vLINEA2_"+sGXsfl_9_idx ;
      edtavLinea3_Internalname = "vLINEA3_"+sGXsfl_9_idx ;
      edtavLinea4_Internalname = "vLINEA4_"+sGXsfl_9_idx ;
      edtavLinea5_Internalname = "vLINEA5_"+sGXsfl_9_idx ;
      edtavLinea6_Internalname = "vLINEA6_"+sGXsfl_9_idx ;
      edtavLinea7_Internalname = "vLINEA7_"+sGXsfl_9_idx ;
      edtavLinea8_Internalname = "vLINEA8_"+sGXsfl_9_idx ;
      edtavLinea9_Internalname = "vLINEA9_"+sGXsfl_9_idx ;
      edtavLinea10_Internalname = "vLINEA10_"+sGXsfl_9_idx ;
      edtavLinea11_Internalname = "vLINEA11_"+sGXsfl_9_idx ;
      edtavLinea12_Internalname = "vLINEA12_"+sGXsfl_9_idx ;
      edtavLinea13_Internalname = "vLINEA13_"+sGXsfl_9_idx ;
      edtavLinea14_Internalname = "vLINEA14_"+sGXsfl_9_idx ;
      edtavLinea15_Internalname = "vLINEA15_"+sGXsfl_9_idx ;
      edtavLinea16_Internalname = "vLINEA16_"+sGXsfl_9_idx ;
      edtavLinea17_Internalname = "vLINEA17_"+sGXsfl_9_idx ;
      edtavLinea18_Internalname = "vLINEA18_"+sGXsfl_9_idx ;
      edtavLinea19_Internalname = "vLINEA19_"+sGXsfl_9_idx ;
      edtavLinea20_Internalname = "vLINEA20_"+sGXsfl_9_idx ;
      edtavLinea21_Internalname = "vLINEA21_"+sGXsfl_9_idx ;
      edtavLinea22_Internalname = "vLINEA22_"+sGXsfl_9_idx ;
      edtavLinea23_Internalname = "vLINEA23_"+sGXsfl_9_idx ;
      edtavLinea24_Internalname = "vLINEA24_"+sGXsfl_9_idx ;
      edtavLinea25_Internalname = "vLINEA25_"+sGXsfl_9_idx ;
      edtavLinea26_Internalname = "vLINEA26_"+sGXsfl_9_idx ;
      edtavLinea27_Internalname = "vLINEA27_"+sGXsfl_9_idx ;
      edtavLinea28_Internalname = "vLINEA28_"+sGXsfl_9_idx ;
   }

   public void subsflControlProps_fel_92( )
   {
      edtavHdr1_Internalname = "vHDR1_"+sGXsfl_9_fel_idx ;
      edtavHdr2_Internalname = "vHDR2_"+sGXsfl_9_fel_idx ;
      edtavHdr3_Internalname = "vHDR3_"+sGXsfl_9_fel_idx ;
      edtavHdr4_Internalname = "vHDR4_"+sGXsfl_9_fel_idx ;
      edtavHdr5_Internalname = "vHDR5_"+sGXsfl_9_fel_idx ;
      edtavHdr6_Internalname = "vHDR6_"+sGXsfl_9_fel_idx ;
      edtavHdr7_Internalname = "vHDR7_"+sGXsfl_9_fel_idx ;
      edtavHdr8_Internalname = "vHDR8_"+sGXsfl_9_fel_idx ;
      edtavHdr9_Internalname = "vHDR9_"+sGXsfl_9_fel_idx ;
      edtavHdr10_Internalname = "vHDR10_"+sGXsfl_9_fel_idx ;
      edtavHdr11_Internalname = "vHDR11_"+sGXsfl_9_fel_idx ;
      edtavHdr12_Internalname = "vHDR12_"+sGXsfl_9_fel_idx ;
      edtavHdr13_Internalname = "vHDR13_"+sGXsfl_9_fel_idx ;
      edtavHdr14_Internalname = "vHDR14_"+sGXsfl_9_fel_idx ;
      edtavHdr15_Internalname = "vHDR15_"+sGXsfl_9_fel_idx ;
      edtavHdr16_Internalname = "vHDR16_"+sGXsfl_9_fel_idx ;
      edtavHdr17_Internalname = "vHDR17_"+sGXsfl_9_fel_idx ;
      edtavHdr18_Internalname = "vHDR18_"+sGXsfl_9_fel_idx ;
      edtavHdr19_Internalname = "vHDR19_"+sGXsfl_9_fel_idx ;
      edtavHdr20_Internalname = "vHDR20_"+sGXsfl_9_fel_idx ;
      edtavHdr21_Internalname = "vHDR21_"+sGXsfl_9_fel_idx ;
      edtavHdr22_Internalname = "vHDR22_"+sGXsfl_9_fel_idx ;
      edtavHdr23_Internalname = "vHDR23_"+sGXsfl_9_fel_idx ;
      edtavHdr24_Internalname = "vHDR24_"+sGXsfl_9_fel_idx ;
      edtavHdr25_Internalname = "vHDR25_"+sGXsfl_9_fel_idx ;
      edtavHdr26_Internalname = "vHDR26_"+sGXsfl_9_fel_idx ;
      edtavHdr27_Internalname = "vHDR27_"+sGXsfl_9_fel_idx ;
      edtavHdr28_Internalname = "vHDR28_"+sGXsfl_9_fel_idx ;
      edtavLinea1_Internalname = "vLINEA1_"+sGXsfl_9_fel_idx ;
      edtavLinea2_Internalname = "vLINEA2_"+sGXsfl_9_fel_idx ;
      edtavLinea3_Internalname = "vLINEA3_"+sGXsfl_9_fel_idx ;
      edtavLinea4_Internalname = "vLINEA4_"+sGXsfl_9_fel_idx ;
      edtavLinea5_Internalname = "vLINEA5_"+sGXsfl_9_fel_idx ;
      edtavLinea6_Internalname = "vLINEA6_"+sGXsfl_9_fel_idx ;
      edtavLinea7_Internalname = "vLINEA7_"+sGXsfl_9_fel_idx ;
      edtavLinea8_Internalname = "vLINEA8_"+sGXsfl_9_fel_idx ;
      edtavLinea9_Internalname = "vLINEA9_"+sGXsfl_9_fel_idx ;
      edtavLinea10_Internalname = "vLINEA10_"+sGXsfl_9_fel_idx ;
      edtavLinea11_Internalname = "vLINEA11_"+sGXsfl_9_fel_idx ;
      edtavLinea12_Internalname = "vLINEA12_"+sGXsfl_9_fel_idx ;
      edtavLinea13_Internalname = "vLINEA13_"+sGXsfl_9_fel_idx ;
      edtavLinea14_Internalname = "vLINEA14_"+sGXsfl_9_fel_idx ;
      edtavLinea15_Internalname = "vLINEA15_"+sGXsfl_9_fel_idx ;
      edtavLinea16_Internalname = "vLINEA16_"+sGXsfl_9_fel_idx ;
      edtavLinea17_Internalname = "vLINEA17_"+sGXsfl_9_fel_idx ;
      edtavLinea18_Internalname = "vLINEA18_"+sGXsfl_9_fel_idx ;
      edtavLinea19_Internalname = "vLINEA19_"+sGXsfl_9_fel_idx ;
      edtavLinea20_Internalname = "vLINEA20_"+sGXsfl_9_fel_idx ;
      edtavLinea21_Internalname = "vLINEA21_"+sGXsfl_9_fel_idx ;
      edtavLinea22_Internalname = "vLINEA22_"+sGXsfl_9_fel_idx ;
      edtavLinea23_Internalname = "vLINEA23_"+sGXsfl_9_fel_idx ;
      edtavLinea24_Internalname = "vLINEA24_"+sGXsfl_9_fel_idx ;
      edtavLinea25_Internalname = "vLINEA25_"+sGXsfl_9_fel_idx ;
      edtavLinea26_Internalname = "vLINEA26_"+sGXsfl_9_fel_idx ;
      edtavLinea27_Internalname = "vLINEA27_"+sGXsfl_9_fel_idx ;
      edtavLinea28_Internalname = "vLINEA28_"+sGXsfl_9_fel_idx ;
   }

   public void sendrow_92( )
   {
      subsflControlProps_92( ) ;
      wbAU0( ) ;
      if ( ( 5 * 1 == 0 ) || ( nGXsfl_9_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_9_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_9_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr1_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr1_Internalname,GXutil.rtrim( AV77Hdr1),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr1_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr1_Forecolor)+";"+((edtavHdr1_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr1_Backcolor)+";"),ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr2_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr2_Internalname,GXutil.rtrim( AV88Hdr2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr2_Jsonclick,Integer.valueOf(0),"Attribute",((edtavHdr2_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr2_Backcolor)+";"),ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr3_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr3_Internalname,GXutil.rtrim( AV98Hdr3),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr3_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr3_Forecolor)+";"+((edtavHdr3_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr3_Backcolor)+";"),ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr4_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr4_Internalname,GXutil.rtrim( AV99Hdr4),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr4_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr4_Forecolor)+";"+((edtavHdr4_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr4_Backcolor)+";"),ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr5_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr5_Internalname,GXutil.rtrim( AV100Hdr5),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr5_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr5_Forecolor)+";"+((edtavHdr5_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr5_Backcolor)+";"),ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr6_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr6_Internalname,GXutil.rtrim( AV101Hdr6),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr6_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr6_Forecolor)+";"+((edtavHdr6_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr6_Backcolor)+";"),ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr7_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr7_Internalname,GXutil.rtrim( AV102Hdr7),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr7_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr7_Forecolor)+";"+((edtavHdr7_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr7_Backcolor)+";"),ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr8_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr8_Internalname,GXutil.rtrim( AV103Hdr8),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr8_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr8_Forecolor)+";"+((edtavHdr8_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr8_Backcolor)+";"),ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr9_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr9_Internalname,GXutil.rtrim( AV104Hdr9),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr9_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr9_Forecolor)+";"+((edtavHdr9_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr9_Backcolor)+";"),ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr10_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr10_Internalname,GXutil.rtrim( AV78Hdr10),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr10_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr10_Forecolor)+";"+((edtavHdr10_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr10_Backcolor)+";"),ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr11_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr11_Internalname,GXutil.rtrim( AV79Hdr11),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr11_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr11_Forecolor)+";"+((edtavHdr11_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr11_Backcolor)+";"),ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr12_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr12_Internalname,GXutil.rtrim( AV80Hdr12),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr12_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr12_Forecolor)+";"+((edtavHdr12_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr12_Backcolor)+";"),ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr13_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr13_Internalname,GXutil.rtrim( AV81Hdr13),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr13_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr13_Forecolor)+";"+((edtavHdr13_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr13_Backcolor)+";"),ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr14_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr14_Internalname,GXutil.rtrim( AV82Hdr14),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr14_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr14_Forecolor)+";"+((edtavHdr14_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr14_Backcolor)+";"),ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr15_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr15_Internalname,GXutil.rtrim( AV83Hdr15),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr15_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr15_Forecolor)+";"+((edtavHdr15_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr15_Backcolor)+";"),ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr16_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr16_Internalname,GXutil.rtrim( AV84Hdr16),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr16_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr16_Forecolor)+";"+((edtavHdr16_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr16_Backcolor)+";"),ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr17_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr17_Internalname,GXutil.rtrim( AV85Hdr17),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr17_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr17_Forecolor)+";"+((edtavHdr17_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr17_Backcolor)+";"),ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr18_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr18_Internalname,GXutil.rtrim( AV86Hdr18),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr18_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr18_Forecolor)+";"+((edtavHdr18_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr18_Backcolor)+";"),ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr19_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr19_Internalname,GXutil.rtrim( AV87Hdr19),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr19_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr19_Forecolor)+";"+((edtavHdr19_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr19_Backcolor)+";"),ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr20_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr20_Internalname,GXutil.rtrim( AV89Hdr20),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr20_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr20_Forecolor)+";"+((edtavHdr20_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr20_Backcolor)+";"),ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr21_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr21_Internalname,GXutil.rtrim( AV90Hdr21),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr21_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr21_Forecolor)+";"+((edtavHdr21_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr21_Backcolor)+";"),ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr22_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr22_Internalname,GXutil.rtrim( AV91Hdr22),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr22_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr22_Forecolor)+";"+((edtavHdr22_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr22_Backcolor)+";"),ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr23_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr23_Internalname,GXutil.rtrim( AV92Hdr23),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr23_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr23_Forecolor)+";"+((edtavHdr23_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr23_Backcolor)+";"),ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr24_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr24_Internalname,GXutil.rtrim( AV93Hdr24),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr24_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr24_Forecolor)+";"+((edtavHdr24_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr24_Backcolor)+";"),ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr25_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr25_Internalname,GXutil.rtrim( AV94Hdr25),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr25_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr25_Forecolor)+";"+((edtavHdr25_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr25_Backcolor)+";"),ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr26_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr26_Internalname,GXutil.rtrim( AV95Hdr26),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr26_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr26_Forecolor)+";"+((edtavHdr26_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr26_Backcolor)+";"),ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr27_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr27_Internalname,GXutil.rtrim( AV96Hdr27),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr27_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr27_Forecolor)+";"+((edtavHdr27_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr27_Backcolor)+";"),ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavHdr28_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdr28_Internalname,GXutil.rtrim( AV97Hdr28),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdr28_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavHdr28_Forecolor)+";"+((edtavHdr28_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavHdr28_Backcolor)+";"),ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea1_Internalname,GXutil.rtrim( AV112Linea1),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea2_Internalname,GXutil.rtrim( AV123Linea2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavLinea2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea3_Internalname,GXutil.rtrim( AV133Linea3),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea3_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavLinea3_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea4_Internalname,GXutil.rtrim( AV134Linea4),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea4_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavLinea4_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea5_Internalname,GXutil.rtrim( AV135Linea5),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea5_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavLinea5_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea6_Internalname,GXutil.rtrim( AV136Linea6),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea6_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavLinea6_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea7_Internalname,GXutil.rtrim( AV137Linea7),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea7_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavLinea7_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea8_Internalname,GXutil.rtrim( AV138LInea8),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea8_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavLinea8_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea9_Internalname,GXutil.rtrim( AV139Linea9),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea9_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavLinea9_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea10_Internalname,GXutil.rtrim( AV113Linea10),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea10_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavLinea10_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea11_Internalname,GXutil.rtrim( AV114Linea11),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea11_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavLinea11_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea12_Internalname,GXutil.rtrim( AV115Linea12),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea12_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavLinea12_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea13_Internalname,GXutil.rtrim( AV116Linea13),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea13_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavLinea13_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea14_Internalname,GXutil.rtrim( AV117Linea14),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea14_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavLinea14_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea15_Internalname,GXutil.rtrim( AV118Linea15),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea15_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavLinea15_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea16_Internalname,GXutil.rtrim( AV119Linea16),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea16_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavLinea16_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea17_Internalname,GXutil.rtrim( AV120Linea17),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea17_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavLinea17_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea18_Internalname,GXutil.rtrim( AV121Linea18),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea18_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavLinea18_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea19_Internalname,GXutil.rtrim( AV122Linea19),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea19_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavLinea19_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea20_Internalname,GXutil.rtrim( AV124Linea20),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea20_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavLinea20_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea21_Internalname,GXutil.rtrim( AV125Linea21),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea21_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavLinea21_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea22_Internalname,GXutil.rtrim( AV126Linea22),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea22_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavLinea22_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea23_Internalname,GXutil.rtrim( AV127Linea23),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea23_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavLinea23_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea24_Internalname,GXutil.rtrim( AV128Linea24),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea24_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavLinea24_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea25_Internalname,GXutil.rtrim( AV129Linea25),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea25_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavLinea25_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea26_Internalname,GXutil.rtrim( AV130Linea26),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea26_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavLinea26_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea27_Internalname,GXutil.rtrim( AV131Linea27),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea27_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavLinea27_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavLinea28_Internalname,GXutil.rtrim( AV132Linea28),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavLinea28_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(0),Integer.valueOf(edtavLinea28_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(80),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesAU2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_9_idx = ((subGrid_Islastpage==1)&&(nGXsfl_9_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_9_idx+1) ;
         sGXsfl_9_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_9_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_92( ) ;
      }
      /* End function sendrow_92 */
   }

   public void subsflControlProps_713( )
   {
      chkavOpgrid.setInternalname( "vOPGRID_"+sGXsfl_71_idx );
      edtavHdrgrid_Internalname = "vHDRGRID_"+sGXsfl_71_idx ;
      edtavBaragrestgrid_Internalname = "vBARAGRESTGRID_"+sGXsfl_71_idx ;
      edtavMaccod_Internalname = "vMACCOD_"+sGXsfl_71_idx ;
      edtavClinomgrid_Internalname = "vCLINOMGRID_"+sGXsfl_71_idx ;
      edtavBarenccligrid_Internalname = "vBARENCCLIGRID_"+sGXsfl_71_idx ;
      edtavBarcolnomgrid_Internalname = "vBARCOLNOMGRID_"+sGXsfl_71_idx ;
      edtavBarsergrid_Internalname = "vBARSERGRID_"+sGXsfl_71_idx ;
      edtavBarserdscgrid_Internalname = "vBARSERDSCGRID_"+sGXsfl_71_idx ;
      edtavBarnomcligrid1_Internalname = "vBARNOMCLIGRID1_"+sGXsfl_71_idx ;
      edtavBarkgsgrid_Internalname = "vBARKGSGRID_"+sGXsfl_71_idx ;
      edtavRectotkgmgrid_Internalname = "vRECTOTKGMGRID_"+sGXsfl_71_idx ;
      edtavBarfecgengrid_Internalname = "vBARFECGENGRID_"+sGXsfl_71_idx ;
      edtavBarfecfprgrid_Internalname = "vBARFECFPRGRID_"+sGXsfl_71_idx ;
      edtavBarsitgrid_Internalname = "vBARSITGRID_"+sGXsfl_71_idx ;
   }

   public void subsflControlProps_fel_713( )
   {
      chkavOpgrid.setInternalname( "vOPGRID_"+sGXsfl_71_fel_idx );
      edtavHdrgrid_Internalname = "vHDRGRID_"+sGXsfl_71_fel_idx ;
      edtavBaragrestgrid_Internalname = "vBARAGRESTGRID_"+sGXsfl_71_fel_idx ;
      edtavMaccod_Internalname = "vMACCOD_"+sGXsfl_71_fel_idx ;
      edtavClinomgrid_Internalname = "vCLINOMGRID_"+sGXsfl_71_fel_idx ;
      edtavBarenccligrid_Internalname = "vBARENCCLIGRID_"+sGXsfl_71_fel_idx ;
      edtavBarcolnomgrid_Internalname = "vBARCOLNOMGRID_"+sGXsfl_71_fel_idx ;
      edtavBarsergrid_Internalname = "vBARSERGRID_"+sGXsfl_71_fel_idx ;
      edtavBarserdscgrid_Internalname = "vBARSERDSCGRID_"+sGXsfl_71_fel_idx ;
      edtavBarnomcligrid1_Internalname = "vBARNOMCLIGRID1_"+sGXsfl_71_fel_idx ;
      edtavBarkgsgrid_Internalname = "vBARKGSGRID_"+sGXsfl_71_fel_idx ;
      edtavRectotkgmgrid_Internalname = "vRECTOTKGMGRID_"+sGXsfl_71_fel_idx ;
      edtavBarfecgengrid_Internalname = "vBARFECGENGRID_"+sGXsfl_71_fel_idx ;
      edtavBarfecfprgrid_Internalname = "vBARFECFPRGRID_"+sGXsfl_71_fel_idx ;
      edtavBarsitgrid_Internalname = "vBARSITGRID_"+sGXsfl_71_fel_idx ;
   }

   public void sendrow_713( )
   {
      subsflControlProps_713( ) ;
      wbAU0( ) ;
      if ( ( 5 * 1 == 0 ) || ( nGXsfl_71_idx <= subgridhdrs_fnc_recordsperpage( ) * 1 ) )
      {
         GridhdrsRow = GXWebRow.GetNew(context,GridhdrsContainer) ;
         if ( subGridhdrs_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridhdrs_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridhdrs_Class, "") != 0 )
            {
               subGridhdrs_Linesclass = subGridhdrs_Class+"Odd" ;
            }
         }
         else if ( subGridhdrs_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridhdrs_Backstyle = (byte)(0) ;
            subGridhdrs_Backcolor = subGridhdrs_Allbackcolor ;
            if ( GXutil.strcmp(subGridhdrs_Class, "") != 0 )
            {
               subGridhdrs_Linesclass = subGridhdrs_Class+"Uniform" ;
            }
         }
         else if ( subGridhdrs_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridhdrs_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridhdrs_Class, "") != 0 )
            {
               subGridhdrs_Linesclass = subGridhdrs_Class+"Odd" ;
            }
            subGridhdrs_Backcolor = (int)(0x0) ;
         }
         else if ( subGridhdrs_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridhdrs_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_71_idx) % (2))) == 0 )
            {
               subGridhdrs_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridhdrs_Class, "") != 0 )
               {
                  subGridhdrs_Linesclass = subGridhdrs_Class+"Even" ;
               }
            }
            else
            {
               subGridhdrs_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridhdrs_Class, "") != 0 )
               {
                  subGridhdrs_Linesclass = subGridhdrs_Class+"Odd" ;
               }
            }
         }
         if ( GridhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_71_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vOPGRID_" + sGXsfl_71_idx ;
         chkavOpgrid.setName( GXCCtl );
         chkavOpgrid.setWebtags( "" );
         chkavOpgrid.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavOpgrid.getInternalname(), "TitleCaption", chkavOpgrid.getCaption(), !bGXsfl_71_Refreshing);
         chkavOpgrid.setCheckedValue( "N" );
         AV268OpGrid = ((GXutil.strcmp(GXutil.rtrim( AV268OpGrid), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, chkavOpgrid.getInternalname(), AV268OpGrid);
         GridhdrsRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavOpgrid.getInternalname(),AV268OpGrid,"","",Integer.valueOf(-1),Integer.valueOf(0),"S","",StyleString,ClassString,"","",""});
         /* Subfile cell */
         if ( GridhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavHdrgrid_Internalname,GXutil.rtrim( AV105Hdrgrid),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavHdrgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBaragrestgrid_Internalname,GXutil.rtrim( AV9BarAgrestgrid),GXutil.rtrim( localUtil.format( AV9BarAgrestgrid, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBaragrestgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaccod_Internalname,GXutil.ltrim( localUtil.ntoc( AV162Maccod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV162Maccod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavMaccod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavClinomgrid_Internalname,GXutil.rtrim( AV53CliNomgrid),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavClinomgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarenccligrid_Internalname,GXutil.rtrim( AV25BarEnccligrid),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarenccligrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavBarcolnomgrid_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcolnomgrid_Internalname,GXutil.rtrim( AV22BarcolNomgrid),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarcolnomgrid_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavBarcolnomgrid_Forecolor)+";"+((edtavBarcolnomgrid_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavBarcolnomgrid_Backcolor)+";"),ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarsergrid_Internalname,GXutil.rtrim( AV44BarserGrid),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarsergrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarserdscgrid_Internalname,GXutil.rtrim( AV43BarSerDscgrid),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarserdscgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarnomcligrid1_Internalname,GXutil.rtrim( AV387Barnomcligrid1),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarnomcligrid1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(false),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarkgsgrid_Internalname,GXutil.ltrim( localUtil.ntoc( AV37BarKgsgrid, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV37BarKgsgrid, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarkgsgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRectotkgmgrid_Internalname,GXutil.ltrim( localUtil.ntoc( AV302Rectotkgmgrid, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV302Rectotkgmgrid, "ZZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRectotkgmgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarfecgengrid_Internalname,localUtil.format(AV35Barfecgengrid, "99/99/99"),localUtil.format( AV35Barfecgengrid, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarfecgengrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarfecfprgrid_Internalname,localUtil.format(AV34barfecfprgrid, "99/99/99"),localUtil.format( AV34barfecfprgrid, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarfecfprgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarsitgrid_Internalname,GXutil.ltrim( localUtil.ntoc( AV45BarSitgrid, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV45BarSitgrid), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarsitgrid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(71),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(false),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesAU3( ) ;
         GXCCtl = "BARTOTAGR_" + sGXsfl_71_idx ;
         app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A219BarTotAgr, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
         GXCCtl = "BARKGM_" + sGXsfl_71_idx ;
         app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
         GXCCtl = "RECTOTKGM_" + sGXsfl_71_idx ;
         app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A812RecTotKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
         GridhdrsContainer.AddRow(GridhdrsRow);
         nGXsfl_71_idx = ((subGridhdrs_Islastpage==1)&&(nGXsfl_71_idx+1>subgridhdrs_fnc_recordsperpage( )) ? 1 : nGXsfl_71_idx+1) ;
         sGXsfl_71_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_71_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_713( ) ;
      }
      /* End function sendrow_713 */
   }

   public void startgridcontrol71( )
   {
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridhdrsContainer"+"DivS\" data-gxgridid=\"71\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridhdrs_Internalname, subGridhdrs_Internalname, "", "WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridhdrs_Backcolorstyle == 0 )
         {
            subGridhdrs_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridhdrs_Class) > 0 )
            {
               subGridhdrs_Linesclass = subGridhdrs_Class+"Title" ;
            }
         }
         else
         {
            subGridhdrs_Titlebackstyle = (byte)(1) ;
            if ( subGridhdrs_Backcolorstyle == 1 )
            {
               subGridhdrs_Titlebackcolor = subGridhdrs_Allbackcolor ;
               if ( GXutil.len( subGridhdrs_Class) > 0 )
               {
                  subGridhdrs_Linesclass = subGridhdrs_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridhdrs_Class) > 0 )
               {
                  subGridhdrs_Linesclass = subGridhdrs_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "A?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Accesorio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pedido Cli", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Serie", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción Serie", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cli", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tot Kgs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha HDR", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Entrega", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "St", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridhdrsContainer.AddObjectProperty("GridName", "Gridhdrs");
      }
      else
      {
         GridhdrsContainer.AddObjectProperty("GridName", "Gridhdrs");
         GridhdrsContainer.AddObjectProperty("Header", subGridhdrs_Header);
         GridhdrsContainer.AddObjectProperty("Class", "WorkWith");
         GridhdrsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("CmpContext", "");
         GridhdrsContainer.AddObjectProperty("InMasterPage", "false");
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.rtrim( AV268OpGrid));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.rtrim( AV105Hdrgrid));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.rtrim( AV9BarAgrestgrid));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV162Maccod, (byte)(8), (byte)(0), ".", "")));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.rtrim( AV53CliNomgrid));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.rtrim( AV25BarEnccligrid));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.rtrim( AV22BarcolNomgrid));
         GridhdrsColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavBarcolnomgrid_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridhdrsColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavBarcolnomgrid_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.rtrim( AV44BarserGrid));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.rtrim( AV43BarSerDscgrid));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.rtrim( AV387Barnomcligrid1));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV37BarKgsgrid, (byte)(9), (byte)(2), ".", "")));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV302Rectotkgmgrid, (byte)(10), (byte)(2), ".", "")));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", localUtil.format(AV35Barfecgengrid, "99/99/99"));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", localUtil.format(AV34barfecfprgrid, "99/99/99"));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV45BarSitgrid, (byte)(2), (byte)(0), ".", "")));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void startgridcontrol9( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"9\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr1_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr2_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr3_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr4_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr5_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr6_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr7_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr8_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr9_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr10_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr11_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr12_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr13_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr14_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr15_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr16_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr17_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr18_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr19_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr20_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr21_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr22_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr23_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr24_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr25_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr26_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr27_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( edtavHdr28_Title) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea1", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea3", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea4", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea5", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea6", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea7", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "LInea8", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea9", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea10", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea11", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea12", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea13", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea14", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea15", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea16", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea17", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea18", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea19", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea20", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea21", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea22", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea23", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea24", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea25", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea26", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea27", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea28", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV77Hdr1));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr1_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr1_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr1_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV88Hdr2));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr2_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr2_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV98Hdr3));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr3_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr3_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr3_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV99Hdr4));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr4_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr4_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr4_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV100Hdr5));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr5_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr5_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr5_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV101Hdr6));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr6_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr6_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr6_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV102Hdr7));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr7_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr7_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr7_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV103Hdr8));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr8_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr8_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr8_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV104Hdr9));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr9_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr9_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr9_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV78Hdr10));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr10_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr10_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr10_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV79Hdr11));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr11_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr11_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr11_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV80Hdr12));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr12_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr12_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr12_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV81Hdr13));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr13_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr13_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr13_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV82Hdr14));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr14_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr14_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr14_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV83Hdr15));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr15_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr15_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr15_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV84Hdr16));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr16_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr16_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr16_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV85Hdr17));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr17_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr17_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr17_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV86Hdr18));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr18_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr18_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr18_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV87Hdr19));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr19_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr19_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr19_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV89Hdr20));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr20_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr20_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr20_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV90Hdr21));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr21_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr21_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr21_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV91Hdr22));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr22_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr22_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr22_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV92Hdr23));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr23_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr23_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr23_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV93Hdr24));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr24_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr24_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr24_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV94Hdr25));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr25_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr25_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr25_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV95Hdr26));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr26_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr26_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr26_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV96Hdr27));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr27_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr27_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr27_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV97Hdr28));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( edtavHdr28_Title));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavHdr28_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavHdr28_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV112Linea1));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV123Linea2));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV133Linea3));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea3_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV134Linea4));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea4_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV135Linea5));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea5_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV136Linea6));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea6_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV137Linea7));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea7_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV138LInea8));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea8_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV139Linea9));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea9_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV113Linea10));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea10_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV114Linea11));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea11_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV115Linea12));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea12_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV116Linea13));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea13_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV117Linea14));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea14_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV118Linea15));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea15_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV119Linea16));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea16_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV120Linea17));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea17_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV121Linea18));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea18_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV122Linea19));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea19_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV124Linea20));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea20_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV125Linea21));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea21_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV126Linea22));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea22_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV127Linea23));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea23_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV128Linea24));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea24_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV129Linea25));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea25_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV130Linea26));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea26_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV131Linea27));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea27_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV132Linea28));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavLinea28_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavHdr1_Internalname = "vHDR1" ;
      edtavHdr2_Internalname = "vHDR2" ;
      edtavHdr3_Internalname = "vHDR3" ;
      edtavHdr4_Internalname = "vHDR4" ;
      edtavHdr5_Internalname = "vHDR5" ;
      edtavHdr6_Internalname = "vHDR6" ;
      edtavHdr7_Internalname = "vHDR7" ;
      edtavHdr8_Internalname = "vHDR8" ;
      edtavHdr9_Internalname = "vHDR9" ;
      edtavHdr10_Internalname = "vHDR10" ;
      edtavHdr11_Internalname = "vHDR11" ;
      edtavHdr12_Internalname = "vHDR12" ;
      edtavHdr13_Internalname = "vHDR13" ;
      edtavHdr14_Internalname = "vHDR14" ;
      edtavHdr15_Internalname = "vHDR15" ;
      edtavHdr16_Internalname = "vHDR16" ;
      edtavHdr17_Internalname = "vHDR17" ;
      edtavHdr18_Internalname = "vHDR18" ;
      edtavHdr19_Internalname = "vHDR19" ;
      edtavHdr20_Internalname = "vHDR20" ;
      edtavHdr21_Internalname = "vHDR21" ;
      edtavHdr22_Internalname = "vHDR22" ;
      edtavHdr23_Internalname = "vHDR23" ;
      edtavHdr24_Internalname = "vHDR24" ;
      edtavHdr25_Internalname = "vHDR25" ;
      edtavHdr26_Internalname = "vHDR26" ;
      edtavHdr27_Internalname = "vHDR27" ;
      edtavHdr28_Internalname = "vHDR28" ;
      edtavLinea1_Internalname = "vLINEA1" ;
      edtavLinea2_Internalname = "vLINEA2" ;
      edtavLinea3_Internalname = "vLINEA3" ;
      edtavLinea4_Internalname = "vLINEA4" ;
      edtavLinea5_Internalname = "vLINEA5" ;
      edtavLinea6_Internalname = "vLINEA6" ;
      edtavLinea7_Internalname = "vLINEA7" ;
      edtavLinea8_Internalname = "vLINEA8" ;
      edtavLinea9_Internalname = "vLINEA9" ;
      edtavLinea10_Internalname = "vLINEA10" ;
      edtavLinea11_Internalname = "vLINEA11" ;
      edtavLinea12_Internalname = "vLINEA12" ;
      edtavLinea13_Internalname = "vLINEA13" ;
      edtavLinea14_Internalname = "vLINEA14" ;
      edtavLinea15_Internalname = "vLINEA15" ;
      edtavLinea16_Internalname = "vLINEA16" ;
      edtavLinea17_Internalname = "vLINEA17" ;
      edtavLinea18_Internalname = "vLINEA18" ;
      edtavLinea19_Internalname = "vLINEA19" ;
      edtavLinea20_Internalname = "vLINEA20" ;
      edtavLinea21_Internalname = "vLINEA21" ;
      edtavLinea22_Internalname = "vLINEA22" ;
      edtavLinea23_Internalname = "vLINEA23" ;
      edtavLinea24_Internalname = "vLINEA24" ;
      edtavLinea25_Internalname = "vLINEA25" ;
      edtavLinea26_Internalname = "vLINEA26" ;
      edtavLinea27_Internalname = "vLINEA27" ;
      edtavLinea28_Internalname = "vLINEA28" ;
      tblTable1_Internalname = "TABLE1" ;
      chkavOpgrid.setInternalname( "vOPGRID" );
      edtavHdrgrid_Internalname = "vHDRGRID" ;
      edtavBaragrestgrid_Internalname = "vBARAGRESTGRID" ;
      edtavMaccod_Internalname = "vMACCOD" ;
      edtavClinomgrid_Internalname = "vCLINOMGRID" ;
      edtavBarenccligrid_Internalname = "vBARENCCLIGRID" ;
      edtavBarcolnomgrid_Internalname = "vBARCOLNOMGRID" ;
      edtavBarsergrid_Internalname = "vBARSERGRID" ;
      edtavBarserdscgrid_Internalname = "vBARSERDSCGRID" ;
      edtavBarnomcligrid1_Internalname = "vBARNOMCLIGRID1" ;
      edtavBarkgsgrid_Internalname = "vBARKGSGRID" ;
      edtavRectotkgmgrid_Internalname = "vRECTOTKGMGRID" ;
      edtavBarfecgengrid_Internalname = "vBARFECGENGRID" ;
      edtavBarfecfprgrid_Internalname = "vBARFECFPRGRID" ;
      edtavBarsitgrid_Internalname = "vBARSITGRID" ;
      tblTable2_Internalname = "TABLE2" ;
      edtavMsgcontrol_Internalname = "vMSGCONTROL" ;
      tblTable3_Internalname = "TABLE3" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid_Internalname = "GRID" ;
      subGridhdrs_Internalname = "GRIDHDRS" ;
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
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      subGridhdrs_Allowcollapsing = (byte)(0) ;
      subGridhdrs_Allowselection = (byte)(0) ;
      subGridhdrs_Header = "" ;
      edtavBarsitgrid_Jsonclick = "" ;
      edtavBarfecfprgrid_Jsonclick = "" ;
      edtavBarfecgengrid_Jsonclick = "" ;
      edtavRectotkgmgrid_Jsonclick = "" ;
      edtavBarkgsgrid_Jsonclick = "" ;
      edtavBarnomcligrid1_Jsonclick = "" ;
      edtavBarserdscgrid_Jsonclick = "" ;
      edtavBarsergrid_Jsonclick = "" ;
      edtavBarcolnomgrid_Jsonclick = "" ;
      edtavBarcolnomgrid_Forecolor = (int)(0x000000) ;
      edtavBarcolnomgrid_Backcolor = -1 ;
      edtavBarenccligrid_Jsonclick = "" ;
      edtavClinomgrid_Jsonclick = "" ;
      edtavMaccod_Jsonclick = "" ;
      edtavBaragrestgrid_Jsonclick = "" ;
      edtavHdrgrid_Jsonclick = "" ;
      chkavOpgrid.setCaption( "" );
      subGridhdrs_Class = "WorkWith" ;
      subGridhdrs_Backcolorstyle = (byte)(0) ;
      edtavLinea28_Jsonclick = "" ;
      edtavLinea28_Enabled = 0 ;
      edtavLinea27_Jsonclick = "" ;
      edtavLinea27_Enabled = 0 ;
      edtavLinea26_Jsonclick = "" ;
      edtavLinea26_Enabled = 0 ;
      edtavLinea25_Jsonclick = "" ;
      edtavLinea25_Enabled = 0 ;
      edtavLinea24_Jsonclick = "" ;
      edtavLinea24_Enabled = 0 ;
      edtavLinea23_Jsonclick = "" ;
      edtavLinea23_Enabled = 0 ;
      edtavLinea22_Jsonclick = "" ;
      edtavLinea22_Enabled = 0 ;
      edtavLinea21_Jsonclick = "" ;
      edtavLinea21_Enabled = 0 ;
      edtavLinea20_Jsonclick = "" ;
      edtavLinea20_Enabled = 0 ;
      edtavLinea19_Jsonclick = "" ;
      edtavLinea19_Enabled = 0 ;
      edtavLinea18_Jsonclick = "" ;
      edtavLinea18_Enabled = 0 ;
      edtavLinea17_Jsonclick = "" ;
      edtavLinea17_Enabled = 0 ;
      edtavLinea16_Jsonclick = "" ;
      edtavLinea16_Enabled = 0 ;
      edtavLinea15_Jsonclick = "" ;
      edtavLinea15_Enabled = 0 ;
      edtavLinea14_Jsonclick = "" ;
      edtavLinea14_Enabled = 0 ;
      edtavLinea13_Jsonclick = "" ;
      edtavLinea13_Enabled = 0 ;
      edtavLinea12_Jsonclick = "" ;
      edtavLinea12_Enabled = 0 ;
      edtavLinea11_Jsonclick = "" ;
      edtavLinea11_Enabled = 0 ;
      edtavLinea10_Jsonclick = "" ;
      edtavLinea10_Enabled = 0 ;
      edtavLinea9_Jsonclick = "" ;
      edtavLinea9_Enabled = 0 ;
      edtavLinea8_Jsonclick = "" ;
      edtavLinea8_Enabled = 0 ;
      edtavLinea7_Jsonclick = "" ;
      edtavLinea7_Enabled = 0 ;
      edtavLinea6_Jsonclick = "" ;
      edtavLinea6_Enabled = 0 ;
      edtavLinea5_Jsonclick = "" ;
      edtavLinea5_Enabled = 0 ;
      edtavLinea4_Jsonclick = "" ;
      edtavLinea4_Enabled = 0 ;
      edtavLinea3_Jsonclick = "" ;
      edtavLinea3_Enabled = 0 ;
      edtavLinea2_Jsonclick = "" ;
      edtavLinea2_Enabled = 0 ;
      edtavLinea1_Jsonclick = "" ;
      edtavHdr28_Jsonclick = "" ;
      edtavHdr28_Forecolor = (int)(0x000000) ;
      edtavHdr28_Backcolor = -1 ;
      edtavHdr27_Jsonclick = "" ;
      edtavHdr27_Forecolor = (int)(0x000000) ;
      edtavHdr27_Backcolor = -1 ;
      edtavHdr26_Jsonclick = "" ;
      edtavHdr26_Forecolor = (int)(0x000000) ;
      edtavHdr26_Backcolor = -1 ;
      edtavHdr25_Jsonclick = "" ;
      edtavHdr25_Forecolor = (int)(0x000000) ;
      edtavHdr25_Backcolor = -1 ;
      edtavHdr24_Jsonclick = "" ;
      edtavHdr24_Forecolor = (int)(0x000000) ;
      edtavHdr24_Backcolor = -1 ;
      edtavHdr23_Jsonclick = "" ;
      edtavHdr23_Forecolor = (int)(0x000000) ;
      edtavHdr23_Backcolor = -1 ;
      edtavHdr22_Jsonclick = "" ;
      edtavHdr22_Forecolor = (int)(0x000000) ;
      edtavHdr22_Backcolor = -1 ;
      edtavHdr21_Jsonclick = "" ;
      edtavHdr21_Forecolor = (int)(0x000000) ;
      edtavHdr21_Backcolor = -1 ;
      edtavHdr20_Jsonclick = "" ;
      edtavHdr20_Forecolor = (int)(0x000000) ;
      edtavHdr20_Backcolor = -1 ;
      edtavHdr19_Jsonclick = "" ;
      edtavHdr19_Forecolor = (int)(0x000000) ;
      edtavHdr19_Backcolor = -1 ;
      edtavHdr18_Jsonclick = "" ;
      edtavHdr18_Forecolor = (int)(0x000000) ;
      edtavHdr18_Backcolor = -1 ;
      edtavHdr17_Jsonclick = "" ;
      edtavHdr17_Forecolor = (int)(0x000000) ;
      edtavHdr17_Backcolor = -1 ;
      edtavHdr16_Jsonclick = "" ;
      edtavHdr16_Forecolor = (int)(0x000000) ;
      edtavHdr16_Backcolor = -1 ;
      edtavHdr15_Jsonclick = "" ;
      edtavHdr15_Forecolor = (int)(0x000000) ;
      edtavHdr15_Backcolor = -1 ;
      edtavHdr14_Jsonclick = "" ;
      edtavHdr14_Forecolor = (int)(0x000000) ;
      edtavHdr14_Backcolor = -1 ;
      edtavHdr13_Jsonclick = "" ;
      edtavHdr13_Forecolor = (int)(0x000000) ;
      edtavHdr13_Backcolor = -1 ;
      edtavHdr12_Jsonclick = "" ;
      edtavHdr12_Forecolor = (int)(0x000000) ;
      edtavHdr12_Backcolor = -1 ;
      edtavHdr11_Jsonclick = "" ;
      edtavHdr11_Forecolor = (int)(0x000000) ;
      edtavHdr11_Backcolor = -1 ;
      edtavHdr10_Jsonclick = "" ;
      edtavHdr10_Forecolor = (int)(0x000000) ;
      edtavHdr10_Backcolor = -1 ;
      edtavHdr9_Jsonclick = "" ;
      edtavHdr9_Forecolor = (int)(0x000000) ;
      edtavHdr9_Backcolor = -1 ;
      edtavHdr8_Jsonclick = "" ;
      edtavHdr8_Forecolor = (int)(0x000000) ;
      edtavHdr8_Backcolor = -1 ;
      edtavHdr7_Jsonclick = "" ;
      edtavHdr7_Forecolor = (int)(0x000000) ;
      edtavHdr7_Backcolor = -1 ;
      edtavHdr6_Jsonclick = "" ;
      edtavHdr6_Forecolor = (int)(0x000000) ;
      edtavHdr6_Backcolor = -1 ;
      edtavHdr5_Jsonclick = "" ;
      edtavHdr5_Forecolor = (int)(0x000000) ;
      edtavHdr5_Backcolor = -1 ;
      edtavHdr4_Jsonclick = "" ;
      edtavHdr4_Forecolor = (int)(0x000000) ;
      edtavHdr4_Backcolor = -1 ;
      edtavHdr3_Jsonclick = "" ;
      edtavHdr3_Forecolor = (int)(0x000000) ;
      edtavHdr3_Backcolor = -1 ;
      edtavHdr2_Jsonclick = "" ;
      edtavHdr2_Backcolor = -1 ;
      edtavHdr1_Jsonclick = "" ;
      edtavHdr1_Forecolor = (int)(0x000000) ;
      edtavHdr1_Backcolor = -1 ;
      subGrid_Class = "WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavMsgcontrol_Jsonclick = "" ;
      edtavMsgcontrol_Enabled = 0 ;
      edtavHdr28_Title = httpContext.getMessage( "Hdr28", "") ;
      edtavHdr27_Title = httpContext.getMessage( "Hdr27", "") ;
      edtavHdr26_Title = httpContext.getMessage( "Hdr26", "") ;
      edtavHdr25_Title = httpContext.getMessage( "Hdr25", "") ;
      edtavHdr24_Title = httpContext.getMessage( "Hdr24", "") ;
      edtavHdr23_Title = httpContext.getMessage( "Hdr23", "") ;
      edtavHdr22_Title = httpContext.getMessage( "Hdr22", "") ;
      edtavHdr21_Title = httpContext.getMessage( "Hdr21", "") ;
      edtavHdr20_Title = httpContext.getMessage( "Hdr20", "") ;
      edtavHdr19_Title = httpContext.getMessage( "Hdr19", "") ;
      edtavHdr18_Title = httpContext.getMessage( "Hdr18", "") ;
      edtavHdr17_Title = httpContext.getMessage( "Hdr17", "") ;
      edtavHdr16_Title = httpContext.getMessage( "Hdr16", "") ;
      edtavHdr15_Title = httpContext.getMessage( "Hdr15", "") ;
      edtavHdr14_Title = httpContext.getMessage( "Hdr14", "") ;
      edtavHdr13_Title = httpContext.getMessage( "Hdr13", "") ;
      edtavHdr12_Title = httpContext.getMessage( "Hdr12", "") ;
      edtavHdr11_Title = httpContext.getMessage( "Hdr11", "") ;
      edtavHdr10_Title = httpContext.getMessage( "Hdr10", "") ;
      edtavHdr9_Title = httpContext.getMessage( "Hdr9", "") ;
      edtavHdr8_Title = httpContext.getMessage( "Hdr8", "") ;
      edtavHdr7_Title = httpContext.getMessage( "Hdr7", "") ;
      edtavHdr6_Title = httpContext.getMessage( "Hdr6", "") ;
      edtavHdr5_Title = httpContext.getMessage( "Hdr5", "") ;
      edtavHdr4_Title = httpContext.getMessage( "Hdr4", "") ;
      edtavHdr3_Title = httpContext.getMessage( "Hdr3", "") ;
      edtavHdr2_Title = httpContext.getMessage( "Hdr2", "") ;
      edtavHdr1_Title = httpContext.getMessage( "Hdr1", "") ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Programacion Tinte Validacion NE", "") );
      subGridhdrs_Rows = 5 ;
      subGrid_Rows = 5 ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vOPGRID_" + sGXsfl_71_idx ;
      chkavOpgrid.setName( GXCCtl );
      chkavOpgrid.setWebtags( "" );
      chkavOpgrid.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavOpgrid.getInternalname(), "TitleCaption", chkavOpgrid.getCaption(), !bGXsfl_71_Refreshing);
      chkavOpgrid.setCheckedValue( "N" );
      AV268OpGrid = ((GXutil.strcmp(GXutil.rtrim( AV268OpGrid), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, chkavOpgrid.getInternalname(), AV268OpGrid);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV88Hdr2',fld:'vHDR2',pic:''},{av:'GRIDHDRS_nFirstRecordOnPage'},{av:'GRIDHDRS_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'subGridhdrs_Rows',ctrl:'GRIDHDRS',prop:'Rows'},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A812RecTotKgm',fld:'RECTOTKGM',pic:'ZZZZZZ9.99'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:''},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A13234BarRGB',fld:'BARRGB',pic:'ZZZZZZZZZ9'},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV339Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV5Archivo.getEof()',ctrl:'vARCHIVO',prop:'Eof'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV337t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV8B2',fld:'vB2',pic:'ZZ9',hsh:true},{av:'AV75G2',fld:'vG2',pic:'ZZ9',hsh:true},{av:'AV300R2',fld:'vR2',pic:'ZZ9',hsh:true},{av:'AV67Fec2',fld:'vFEC2',pic:'',hsh:true},{av:'AV66Fec1',fld:'vFEC1',pic:'',hsh:true},{av:'AV52CliCodIN',fld:'vCLICODIN',pic:'ZZZZZ9',hsh:true},{av:'AV23BarColNomIn',fld:'vBARCOLNOMIN',pic:'',hsh:true},{av:'AV26BarEnccliIN',fld:'vBARENCCLIIN',pic:'',hsh:true},{av:'AV12BarcodIn',fld:'vBARCODIN',pic:'ZZZZZZZ9',hsh:true},{av:'AV20BarcodreoIN',fld:'vBARCODREOIN',pic:'9',hsh:true},{av:'AV16BarcodparIN',fld:'vBARCODPARIN',pic:'',hsh:true},{av:'AV65EstadoFaseHdr',fld:'vESTADOFASEHDR',pic:'9',hsh:true},{av:'AV33BarFasEstSig',fld:'vBARFASESTSIG',pic:'9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV339Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV337t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV255MaquinasHdrstxt',fld:'vMAQUINASHDRSTXT',pic:''},{av:'AV256Maquinastxt',fld:'vMAQUINASTXT',pic:''},{av:'edtavHdr1_Title',ctrl:'vHDR1',prop:'Title'},{av:'edtavHdr2_Title',ctrl:'vHDR2',prop:'Title'},{av:'edtavHdr3_Title',ctrl:'vHDR3',prop:'Title'},{av:'edtavHdr4_Title',ctrl:'vHDR4',prop:'Title'},{av:'edtavHdr5_Title',ctrl:'vHDR5',prop:'Title'},{av:'edtavHdr6_Title',ctrl:'vHDR6',prop:'Title'},{av:'edtavHdr7_Title',ctrl:'vHDR7',prop:'Title'},{av:'edtavHdr8_Title',ctrl:'vHDR8',prop:'Title'},{av:'edtavHdr9_Title',ctrl:'vHDR9',prop:'Title'},{av:'edtavHdr10_Title',ctrl:'vHDR10',prop:'Title'},{av:'edtavHdr11_Title',ctrl:'vHDR11',prop:'Title'},{av:'edtavHdr12_Title',ctrl:'vHDR12',prop:'Title'},{av:'edtavHdr13_Title',ctrl:'vHDR13',prop:'Title'},{av:'edtavHdr14_Title',ctrl:'vHDR14',prop:'Title'},{av:'edtavHdr15_Title',ctrl:'vHDR15',prop:'Title'},{av:'edtavHdr16_Title',ctrl:'vHDR16',prop:'Title'},{av:'edtavHdr17_Title',ctrl:'vHDR17',prop:'Title'},{av:'edtavHdr18_Title',ctrl:'vHDR18',prop:'Title'},{av:'edtavHdr19_Title',ctrl:'vHDR19',prop:'Title'},{av:'edtavHdr20_Title',ctrl:'vHDR20',prop:'Title'},{av:'edtavHdr21_Title',ctrl:'vHDR21',prop:'Title'},{av:'edtavHdr22_Title',ctrl:'vHDR22',prop:'Title'},{av:'edtavHdr23_Title',ctrl:'vHDR23',prop:'Title'},{av:'edtavHdr24_Title',ctrl:'vHDR24',prop:'Title'},{av:'edtavHdr25_Title',ctrl:'vHDR25',prop:'Title'},{av:'edtavHdr26_Title',ctrl:'vHDR26',prop:'Title'},{av:'edtavHdr27_Title',ctrl:'vHDR27',prop:'Title'},{av:'edtavHdr28_Title',ctrl:'vHDR28',prop:'Title'},{av:'AV265NospMaq',fld:'vNOSPMAQ',pic:'ZZZ9'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV65EstadoFaseHdr',fld:'vESTADOFASEHDR',pic:'9',hsh:true}]}");
      setEventMetadata("GRID.LOAD","{handler:'e13AU2',iparms:[{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV88Hdr2',fld:'vHDR2',pic:''},{av:'AV8B2',fld:'vB2',pic:'ZZ9',hsh:true},{av:'AV75G2',fld:'vG2',pic:'ZZ9',hsh:true},{av:'AV300R2',fld:'vR2',pic:'ZZ9',hsh:true},{av:'AV339Tab_maq',fld:'vTAB_MAQ',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8B2',fld:'vB2',pic:'ZZ9',hsh:true},{av:'AV75G2',fld:'vG2',pic:'ZZ9',hsh:true},{av:'AV300R2',fld:'vR2',pic:'ZZ9',hsh:true},{av:'AV97Hdr28',fld:'vHDR28',pic:''},{av:'AV132Linea28',fld:'vLINEA28',pic:''},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'edtavHdr28_Backcolor',ctrl:'vHDR28',prop:'Backcolor'},{av:'edtavHdr28_Forecolor',ctrl:'vHDR28',prop:'Forecolor'},{av:'AV96Hdr27',fld:'vHDR27',pic:''},{av:'AV131Linea27',fld:'vLINEA27',pic:''},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'edtavHdr27_Backcolor',ctrl:'vHDR27',prop:'Backcolor'},{av:'edtavHdr27_Forecolor',ctrl:'vHDR27',prop:'Forecolor'},{av:'AV95Hdr26',fld:'vHDR26',pic:''},{av:'AV130Linea26',fld:'vLINEA26',pic:''},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'edtavHdr26_Backcolor',ctrl:'vHDR26',prop:'Backcolor'},{av:'edtavHdr26_Forecolor',ctrl:'vHDR26',prop:'Forecolor'},{av:'AV94Hdr25',fld:'vHDR25',pic:''},{av:'AV129Linea25',fld:'vLINEA25',pic:''},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'edtavHdr25_Backcolor',ctrl:'vHDR25',prop:'Backcolor'},{av:'edtavHdr25_Forecolor',ctrl:'vHDR25',prop:'Forecolor'},{av:'AV93Hdr24',fld:'vHDR24',pic:''},{av:'AV128Linea24',fld:'vLINEA24',pic:''},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'edtavHdr24_Backcolor',ctrl:'vHDR24',prop:'Backcolor'},{av:'edtavHdr24_Forecolor',ctrl:'vHDR24',prop:'Forecolor'},{av:'AV92Hdr23',fld:'vHDR23',pic:''},{av:'AV127Linea23',fld:'vLINEA23',pic:''},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'edtavHdr23_Backcolor',ctrl:'vHDR23',prop:'Backcolor'},{av:'edtavHdr23_Forecolor',ctrl:'vHDR23',prop:'Forecolor'},{av:'AV91Hdr22',fld:'vHDR22',pic:''},{av:'AV126Linea22',fld:'vLINEA22',pic:''},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'edtavHdr22_Backcolor',ctrl:'vHDR22',prop:'Backcolor'},{av:'edtavHdr22_Forecolor',ctrl:'vHDR22',prop:'Forecolor'},{av:'AV90Hdr21',fld:'vHDR21',pic:''},{av:'AV125Linea21',fld:'vLINEA21',pic:''},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'edtavHdr21_Backcolor',ctrl:'vHDR21',prop:'Backcolor'},{av:'edtavHdr21_Forecolor',ctrl:'vHDR21',prop:'Forecolor'},{av:'AV89Hdr20',fld:'vHDR20',pic:''},{av:'AV124Linea20',fld:'vLINEA20',pic:''},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'edtavHdr20_Backcolor',ctrl:'vHDR20',prop:'Backcolor'},{av:'edtavHdr20_Forecolor',ctrl:'vHDR20',prop:'Forecolor'},{av:'AV87Hdr19',fld:'vHDR19',pic:''},{av:'AV122Linea19',fld:'vLINEA19',pic:''},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'edtavHdr19_Backcolor',ctrl:'vHDR19',prop:'Backcolor'},{av:'edtavHdr19_Forecolor',ctrl:'vHDR19',prop:'Forecolor'},{av:'AV86Hdr18',fld:'vHDR18',pic:''},{av:'AV121Linea18',fld:'vLINEA18',pic:''},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'edtavHdr18_Backcolor',ctrl:'vHDR18',prop:'Backcolor'},{av:'edtavHdr18_Forecolor',ctrl:'vHDR18',prop:'Forecolor'},{av:'AV85Hdr17',fld:'vHDR17',pic:''},{av:'AV88Hdr2',fld:'vHDR2',pic:''},{av:'AV120Linea17',fld:'vLINEA17',pic:''},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'edtavHdr17_Backcolor',ctrl:'vHDR17',prop:'Backcolor'},{av:'edtavHdr17_Forecolor',ctrl:'vHDR17',prop:'Forecolor'},{av:'AV84Hdr16',fld:'vHDR16',pic:''},{av:'AV119Linea16',fld:'vLINEA16',pic:''},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'edtavHdr16_Backcolor',ctrl:'vHDR16',prop:'Backcolor'},{av:'edtavHdr16_Forecolor',ctrl:'vHDR16',prop:'Forecolor'},{av:'AV83Hdr15',fld:'vHDR15',pic:''},{av:'AV118Linea15',fld:'vLINEA15',pic:''},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'edtavHdr15_Backcolor',ctrl:'vHDR15',prop:'Backcolor'},{av:'edtavHdr15_Forecolor',ctrl:'vHDR15',prop:'Forecolor'},{av:'AV82Hdr14',fld:'vHDR14',pic:''},{av:'AV117Linea14',fld:'vLINEA14',pic:''},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'edtavHdr14_Backcolor',ctrl:'vHDR14',prop:'Backcolor'},{av:'edtavHdr14_Forecolor',ctrl:'vHDR14',prop:'Forecolor'},{av:'AV81Hdr13',fld:'vHDR13',pic:''},{av:'AV116Linea13',fld:'vLINEA13',pic:''},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'edtavHdr13_Backcolor',ctrl:'vHDR13',prop:'Backcolor'},{av:'edtavHdr13_Forecolor',ctrl:'vHDR13',prop:'Forecolor'},{av:'AV80Hdr12',fld:'vHDR12',pic:''},{av:'AV115Linea12',fld:'vLINEA12',pic:''},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'edtavHdr12_Backcolor',ctrl:'vHDR12',prop:'Backcolor'},{av:'edtavHdr12_Forecolor',ctrl:'vHDR12',prop:'Forecolor'},{av:'AV79Hdr11',fld:'vHDR11',pic:''},{av:'AV114Linea11',fld:'vLINEA11',pic:''},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'edtavHdr11_Backcolor',ctrl:'vHDR11',prop:'Backcolor'},{av:'edtavHdr11_Forecolor',ctrl:'vHDR11',prop:'Forecolor'},{av:'AV78Hdr10',fld:'vHDR10',pic:''},{av:'AV113Linea10',fld:'vLINEA10',pic:''},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'edtavHdr10_Backcolor',ctrl:'vHDR10',prop:'Backcolor'},{av:'edtavHdr10_Forecolor',ctrl:'vHDR10',prop:'Forecolor'},{av:'AV104Hdr9',fld:'vHDR9',pic:''},{av:'AV139Linea9',fld:'vLINEA9',pic:''},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'edtavHdr9_Backcolor',ctrl:'vHDR9',prop:'Backcolor'},{av:'edtavHdr9_Forecolor',ctrl:'vHDR9',prop:'Forecolor'},{av:'AV103Hdr8',fld:'vHDR8',pic:''},{av:'AV138LInea8',fld:'vLINEA8',pic:''},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'edtavHdr8_Backcolor',ctrl:'vHDR8',prop:'Backcolor'},{av:'edtavHdr8_Forecolor',ctrl:'vHDR8',prop:'Forecolor'},{av:'AV102Hdr7',fld:'vHDR7',pic:''},{av:'AV137Linea7',fld:'vLINEA7',pic:''},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'edtavHdr7_Backcolor',ctrl:'vHDR7',prop:'Backcolor'},{av:'edtavHdr7_Forecolor',ctrl:'vHDR7',prop:'Forecolor'},{av:'AV101Hdr6',fld:'vHDR6',pic:''},{av:'AV136Linea6',fld:'vLINEA6',pic:''},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'edtavHdr6_Backcolor',ctrl:'vHDR6',prop:'Backcolor'},{av:'edtavHdr6_Forecolor',ctrl:'vHDR6',prop:'Forecolor'},{av:'AV100Hdr5',fld:'vHDR5',pic:''},{av:'AV135Linea5',fld:'vLINEA5',pic:''},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'edtavHdr5_Backcolor',ctrl:'vHDR5',prop:'Backcolor'},{av:'edtavHdr5_Forecolor',ctrl:'vHDR5',prop:'Forecolor'},{av:'AV99Hdr4',fld:'vHDR4',pic:''},{av:'AV134Linea4',fld:'vLINEA4',pic:''},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'edtavHdr4_Backcolor',ctrl:'vHDR4',prop:'Backcolor'},{av:'edtavHdr4_Forecolor',ctrl:'vHDR4',prop:'Forecolor'},{av:'AV98Hdr3',fld:'vHDR3',pic:''},{av:'AV133Linea3',fld:'vLINEA3',pic:''},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'edtavHdr3_Backcolor',ctrl:'vHDR3',prop:'Backcolor'},{av:'edtavHdr3_Forecolor',ctrl:'vHDR3',prop:'Forecolor'},{av:'AV123Linea2',fld:'vLINEA2',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'edtavHdr2_Backcolor',ctrl:'vHDR2',prop:'Backcolor'},{av:'AV77Hdr1',fld:'vHDR1',pic:''},{av:'AV112Linea1',fld:'vLINEA1',pic:''},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'edtavHdr1_Backcolor',ctrl:'vHDR1',prop:'Backcolor'},{av:'edtavHdr1_Forecolor',ctrl:'vHDR1',prop:'Forecolor'}]}");
      setEventMetadata("'EXPORTAR RTF'","{handler:'e14AU2',iparms:[{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV256Maquinastxt',fld:'vMAQUINASTXT',pic:''},{av:'AV255MaquinasHdrstxt',fld:'vMAQUINASHDRSTXT',pic:''},{av:'AV265NospMaq',fld:'vNOSPMAQ',pic:'ZZZ9'},{av:'AV72Filename',fld:'vFILENAME',pic:''}]");
      setEventMetadata("'EXPORTAR RTF'",",oparms:[{av:'AV72Filename',fld:'vFILENAME',pic:''},{av:'AV265NospMaq',fld:'vNOSPMAQ',pic:'ZZZ9'},{av:'AV255MaquinasHdrstxt',fld:'vMAQUINASHDRSTXT',pic:''},{av:'AV256Maquinastxt',fld:'vMAQUINASTXT',pic:''},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("GRIDHDRS.LOAD","{handler:'e15AU3',iparms:[{av:'AV67Fec2',fld:'vFEC2',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'AV66Fec1',fld:'vFEC1',pic:'',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV52CliCodIN',fld:'vCLICODIN',pic:'ZZZZZ9',hsh:true},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'AV23BarColNomIn',fld:'vBARCOLNOMIN',pic:'',hsh:true},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'AV26BarEnccliIN',fld:'vBARENCCLIIN',pic:'',hsh:true},{av:'AV12BarcodIn',fld:'vBARCODIN',pic:'ZZZZZZZ9',hsh:true},{av:'AV20BarcodreoIN',fld:'vBARCODREOIN',pic:'9',hsh:true},{av:'AV16BarcodparIN',fld:'vBARCODPARIN',pic:'',hsh:true},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV65EstadoFaseHdr',fld:'vESTADOFASEHDR',pic:'9',hsh:true},{av:'AV33BarFasEstSig',fld:'vBARFASESTSIG',pic:'9',hsh:true},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A812RecTotKgm',fld:'RECTOTKGM',pic:'ZZZZZZ9.99'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:''},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A13234BarRGB',fld:'BARRGB',pic:'ZZZZZZZZZ9'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("GRIDHDRS.LOAD",",oparms:[{av:'AV67Fec2',fld:'vFEC2',pic:'',hsh:true},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV33BarFasEstSig',fld:'vBARFASESTSIG',pic:'9',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV162Maccod',fld:'vMACCOD',pic:'ZZZZZZZ9'},{av:'AV105Hdrgrid',fld:'vHDRGRID',pic:''},{av:'AV9BarAgrestgrid',fld:'vBARAGRESTGRID',pic:'@!'},{av:'AV43BarSerDscgrid',fld:'vBARSERDSCGRID',pic:''},{av:'AV44BarserGrid',fld:'vBARSERGRID',pic:''},{av:'AV22BarcolNomgrid',fld:'vBARCOLNOMGRID',pic:''},{av:'AV37BarKgsgrid',fld:'vBARKGSGRID',pic:'ZZZZZ9.99'},{av:'AV302Rectotkgmgrid',fld:'vRECTOTKGMGRID',pic:'ZZZZZZ9.99'},{av:'AV45BarSitgrid',fld:'vBARSITGRID',pic:'Z9'},{av:'AV53CliNomgrid',fld:'vCLINOMGRID',pic:''},{av:'AV35Barfecgengrid',fld:'vBARFECGENGRID',pic:''},{av:'AV34barfecfprgrid',fld:'vBARFECFPRGRID',pic:''},{av:'AV25BarEnccligrid',fld:'vBARENCCLIGRID',pic:''},{av:'AV268OpGrid',fld:'vOPGRID',pic:''},{av:'AV8B2',fld:'vB2',pic:'ZZ9',hsh:true},{av:'AV75G2',fld:'vG2',pic:'ZZ9',hsh:true},{av:'AV300R2',fld:'vR2',pic:'ZZ9',hsh:true},{av:'edtavBarcolnomgrid_Backcolor',ctrl:'vBARCOLNOMGRID',prop:'Backcolor'},{av:'edtavBarcolnomgrid_Forecolor',ctrl:'vBARCOLNOMGRID',prop:'Forecolor'},{av:'AV65EstadoFaseHdr',fld:'vESTADOFASEHDR',pic:'9',hsh:true}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'subGridhdrs_Rows',ctrl:'GRIDHDRS',prop:'Rows'},{av:'AV88Hdr2',fld:'vHDR2',pic:''},{av:'AV8B2',fld:'vB2',pic:'ZZ9',hsh:true},{av:'AV75G2',fld:'vG2',pic:'ZZ9',hsh:true},{av:'AV300R2',fld:'vR2',pic:'ZZ9',hsh:true},{av:'AV67Fec2',fld:'vFEC2',pic:'',hsh:true},{av:'AV66Fec1',fld:'vFEC1',pic:'',hsh:true},{av:'AV52CliCodIN',fld:'vCLICODIN',pic:'ZZZZZ9',hsh:true},{av:'AV23BarColNomIn',fld:'vBARCOLNOMIN',pic:'',hsh:true},{av:'AV26BarEnccliIN',fld:'vBARENCCLIIN',pic:'',hsh:true},{av:'AV12BarcodIn',fld:'vBARCODIN',pic:'ZZZZZZZ9',hsh:true},{av:'AV20BarcodreoIN',fld:'vBARCODREOIN',pic:'9',hsh:true},{av:'AV16BarcodparIN',fld:'vBARCODPARIN',pic:'',hsh:true},{av:'AV65EstadoFaseHdr',fld:'vESTADOFASEHDR',pic:'9',hsh:true},{av:'AV33BarFasEstSig',fld:'vBARFASESTSIG',pic:'9',hsh:true},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV339Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV337t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV5Archivo.getEof()',ctrl:'vARCHIVO',prop:'Eof'},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV339Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV337t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV255MaquinasHdrstxt',fld:'vMAQUINASHDRSTXT',pic:''},{av:'AV256Maquinastxt',fld:'vMAQUINASTXT',pic:''},{av:'edtavHdr1_Title',ctrl:'vHDR1',prop:'Title'},{av:'edtavHdr2_Title',ctrl:'vHDR2',prop:'Title'},{av:'edtavHdr3_Title',ctrl:'vHDR3',prop:'Title'},{av:'edtavHdr4_Title',ctrl:'vHDR4',prop:'Title'},{av:'edtavHdr5_Title',ctrl:'vHDR5',prop:'Title'},{av:'edtavHdr6_Title',ctrl:'vHDR6',prop:'Title'},{av:'edtavHdr7_Title',ctrl:'vHDR7',prop:'Title'},{av:'edtavHdr8_Title',ctrl:'vHDR8',prop:'Title'},{av:'edtavHdr9_Title',ctrl:'vHDR9',prop:'Title'},{av:'edtavHdr10_Title',ctrl:'vHDR10',prop:'Title'},{av:'edtavHdr11_Title',ctrl:'vHDR11',prop:'Title'},{av:'edtavHdr12_Title',ctrl:'vHDR12',prop:'Title'},{av:'edtavHdr13_Title',ctrl:'vHDR13',prop:'Title'},{av:'edtavHdr14_Title',ctrl:'vHDR14',prop:'Title'},{av:'edtavHdr15_Title',ctrl:'vHDR15',prop:'Title'},{av:'edtavHdr16_Title',ctrl:'vHDR16',prop:'Title'},{av:'edtavHdr17_Title',ctrl:'vHDR17',prop:'Title'},{av:'edtavHdr18_Title',ctrl:'vHDR18',prop:'Title'},{av:'edtavHdr19_Title',ctrl:'vHDR19',prop:'Title'},{av:'edtavHdr20_Title',ctrl:'vHDR20',prop:'Title'},{av:'edtavHdr21_Title',ctrl:'vHDR21',prop:'Title'},{av:'edtavHdr22_Title',ctrl:'vHDR22',prop:'Title'},{av:'edtavHdr23_Title',ctrl:'vHDR23',prop:'Title'},{av:'edtavHdr24_Title',ctrl:'vHDR24',prop:'Title'},{av:'edtavHdr25_Title',ctrl:'vHDR25',prop:'Title'},{av:'edtavHdr26_Title',ctrl:'vHDR26',prop:'Title'},{av:'edtavHdr27_Title',ctrl:'vHDR27',prop:'Title'},{av:'edtavHdr28_Title',ctrl:'vHDR28',prop:'Title'},{av:'AV265NospMaq',fld:'vNOSPMAQ',pic:'ZZZ9'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV65EstadoFaseHdr',fld:'vESTADOFASEHDR',pic:'9',hsh:true}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'subGridhdrs_Rows',ctrl:'GRIDHDRS',prop:'Rows'},{av:'AV88Hdr2',fld:'vHDR2',pic:''},{av:'AV8B2',fld:'vB2',pic:'ZZ9',hsh:true},{av:'AV75G2',fld:'vG2',pic:'ZZ9',hsh:true},{av:'AV300R2',fld:'vR2',pic:'ZZ9',hsh:true},{av:'AV67Fec2',fld:'vFEC2',pic:'',hsh:true},{av:'AV66Fec1',fld:'vFEC1',pic:'',hsh:true},{av:'AV52CliCodIN',fld:'vCLICODIN',pic:'ZZZZZ9',hsh:true},{av:'AV23BarColNomIn',fld:'vBARCOLNOMIN',pic:'',hsh:true},{av:'AV26BarEnccliIN',fld:'vBARENCCLIIN',pic:'',hsh:true},{av:'AV12BarcodIn',fld:'vBARCODIN',pic:'ZZZZZZZ9',hsh:true},{av:'AV20BarcodreoIN',fld:'vBARCODREOIN',pic:'9',hsh:true},{av:'AV16BarcodparIN',fld:'vBARCODPARIN',pic:'',hsh:true},{av:'AV65EstadoFaseHdr',fld:'vESTADOFASEHDR',pic:'9',hsh:true},{av:'AV33BarFasEstSig',fld:'vBARFASESTSIG',pic:'9',hsh:true},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV339Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV337t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV5Archivo.getEof()',ctrl:'vARCHIVO',prop:'Eof'},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV339Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV337t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV255MaquinasHdrstxt',fld:'vMAQUINASHDRSTXT',pic:''},{av:'AV256Maquinastxt',fld:'vMAQUINASTXT',pic:''},{av:'edtavHdr1_Title',ctrl:'vHDR1',prop:'Title'},{av:'edtavHdr2_Title',ctrl:'vHDR2',prop:'Title'},{av:'edtavHdr3_Title',ctrl:'vHDR3',prop:'Title'},{av:'edtavHdr4_Title',ctrl:'vHDR4',prop:'Title'},{av:'edtavHdr5_Title',ctrl:'vHDR5',prop:'Title'},{av:'edtavHdr6_Title',ctrl:'vHDR6',prop:'Title'},{av:'edtavHdr7_Title',ctrl:'vHDR7',prop:'Title'},{av:'edtavHdr8_Title',ctrl:'vHDR8',prop:'Title'},{av:'edtavHdr9_Title',ctrl:'vHDR9',prop:'Title'},{av:'edtavHdr10_Title',ctrl:'vHDR10',prop:'Title'},{av:'edtavHdr11_Title',ctrl:'vHDR11',prop:'Title'},{av:'edtavHdr12_Title',ctrl:'vHDR12',prop:'Title'},{av:'edtavHdr13_Title',ctrl:'vHDR13',prop:'Title'},{av:'edtavHdr14_Title',ctrl:'vHDR14',prop:'Title'},{av:'edtavHdr15_Title',ctrl:'vHDR15',prop:'Title'},{av:'edtavHdr16_Title',ctrl:'vHDR16',prop:'Title'},{av:'edtavHdr17_Title',ctrl:'vHDR17',prop:'Title'},{av:'edtavHdr18_Title',ctrl:'vHDR18',prop:'Title'},{av:'edtavHdr19_Title',ctrl:'vHDR19',prop:'Title'},{av:'edtavHdr20_Title',ctrl:'vHDR20',prop:'Title'},{av:'edtavHdr21_Title',ctrl:'vHDR21',prop:'Title'},{av:'edtavHdr22_Title',ctrl:'vHDR22',prop:'Title'},{av:'edtavHdr23_Title',ctrl:'vHDR23',prop:'Title'},{av:'edtavHdr24_Title',ctrl:'vHDR24',prop:'Title'},{av:'edtavHdr25_Title',ctrl:'vHDR25',prop:'Title'},{av:'edtavHdr26_Title',ctrl:'vHDR26',prop:'Title'},{av:'edtavHdr27_Title',ctrl:'vHDR27',prop:'Title'},{av:'edtavHdr28_Title',ctrl:'vHDR28',prop:'Title'},{av:'AV265NospMaq',fld:'vNOSPMAQ',pic:'ZZZ9'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV65EstadoFaseHdr',fld:'vESTADOFASEHDR',pic:'9',hsh:true}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'subGridhdrs_Rows',ctrl:'GRIDHDRS',prop:'Rows'},{av:'AV88Hdr2',fld:'vHDR2',pic:''},{av:'AV8B2',fld:'vB2',pic:'ZZ9',hsh:true},{av:'AV75G2',fld:'vG2',pic:'ZZ9',hsh:true},{av:'AV300R2',fld:'vR2',pic:'ZZ9',hsh:true},{av:'AV67Fec2',fld:'vFEC2',pic:'',hsh:true},{av:'AV66Fec1',fld:'vFEC1',pic:'',hsh:true},{av:'AV52CliCodIN',fld:'vCLICODIN',pic:'ZZZZZ9',hsh:true},{av:'AV23BarColNomIn',fld:'vBARCOLNOMIN',pic:'',hsh:true},{av:'AV26BarEnccliIN',fld:'vBARENCCLIIN',pic:'',hsh:true},{av:'AV12BarcodIn',fld:'vBARCODIN',pic:'ZZZZZZZ9',hsh:true},{av:'AV20BarcodreoIN',fld:'vBARCODREOIN',pic:'9',hsh:true},{av:'AV16BarcodparIN',fld:'vBARCODPARIN',pic:'',hsh:true},{av:'AV65EstadoFaseHdr',fld:'vESTADOFASEHDR',pic:'9',hsh:true},{av:'AV33BarFasEstSig',fld:'vBARFASESTSIG',pic:'9',hsh:true},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV339Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV337t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV5Archivo.getEof()',ctrl:'vARCHIVO',prop:'Eof'},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV339Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV337t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV255MaquinasHdrstxt',fld:'vMAQUINASHDRSTXT',pic:''},{av:'AV256Maquinastxt',fld:'vMAQUINASTXT',pic:''},{av:'edtavHdr1_Title',ctrl:'vHDR1',prop:'Title'},{av:'edtavHdr2_Title',ctrl:'vHDR2',prop:'Title'},{av:'edtavHdr3_Title',ctrl:'vHDR3',prop:'Title'},{av:'edtavHdr4_Title',ctrl:'vHDR4',prop:'Title'},{av:'edtavHdr5_Title',ctrl:'vHDR5',prop:'Title'},{av:'edtavHdr6_Title',ctrl:'vHDR6',prop:'Title'},{av:'edtavHdr7_Title',ctrl:'vHDR7',prop:'Title'},{av:'edtavHdr8_Title',ctrl:'vHDR8',prop:'Title'},{av:'edtavHdr9_Title',ctrl:'vHDR9',prop:'Title'},{av:'edtavHdr10_Title',ctrl:'vHDR10',prop:'Title'},{av:'edtavHdr11_Title',ctrl:'vHDR11',prop:'Title'},{av:'edtavHdr12_Title',ctrl:'vHDR12',prop:'Title'},{av:'edtavHdr13_Title',ctrl:'vHDR13',prop:'Title'},{av:'edtavHdr14_Title',ctrl:'vHDR14',prop:'Title'},{av:'edtavHdr15_Title',ctrl:'vHDR15',prop:'Title'},{av:'edtavHdr16_Title',ctrl:'vHDR16',prop:'Title'},{av:'edtavHdr17_Title',ctrl:'vHDR17',prop:'Title'},{av:'edtavHdr18_Title',ctrl:'vHDR18',prop:'Title'},{av:'edtavHdr19_Title',ctrl:'vHDR19',prop:'Title'},{av:'edtavHdr20_Title',ctrl:'vHDR20',prop:'Title'},{av:'edtavHdr21_Title',ctrl:'vHDR21',prop:'Title'},{av:'edtavHdr22_Title',ctrl:'vHDR22',prop:'Title'},{av:'edtavHdr23_Title',ctrl:'vHDR23',prop:'Title'},{av:'edtavHdr24_Title',ctrl:'vHDR24',prop:'Title'},{av:'edtavHdr25_Title',ctrl:'vHDR25',prop:'Title'},{av:'edtavHdr26_Title',ctrl:'vHDR26',prop:'Title'},{av:'edtavHdr27_Title',ctrl:'vHDR27',prop:'Title'},{av:'edtavHdr28_Title',ctrl:'vHDR28',prop:'Title'},{av:'AV265NospMaq',fld:'vNOSPMAQ',pic:'ZZZ9'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV65EstadoFaseHdr',fld:'vESTADOFASEHDR',pic:'9',hsh:true}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'subGridhdrs_Rows',ctrl:'GRIDHDRS',prop:'Rows'},{av:'AV88Hdr2',fld:'vHDR2',pic:''},{av:'AV8B2',fld:'vB2',pic:'ZZ9',hsh:true},{av:'AV75G2',fld:'vG2',pic:'ZZ9',hsh:true},{av:'AV300R2',fld:'vR2',pic:'ZZ9',hsh:true},{av:'AV67Fec2',fld:'vFEC2',pic:'',hsh:true},{av:'AV66Fec1',fld:'vFEC1',pic:'',hsh:true},{av:'AV52CliCodIN',fld:'vCLICODIN',pic:'ZZZZZ9',hsh:true},{av:'AV23BarColNomIn',fld:'vBARCOLNOMIN',pic:'',hsh:true},{av:'AV26BarEnccliIN',fld:'vBARENCCLIIN',pic:'',hsh:true},{av:'AV12BarcodIn',fld:'vBARCODIN',pic:'ZZZZZZZ9',hsh:true},{av:'AV20BarcodreoIN',fld:'vBARCODREOIN',pic:'9',hsh:true},{av:'AV16BarcodparIN',fld:'vBARCODPARIN',pic:'',hsh:true},{av:'AV65EstadoFaseHdr',fld:'vESTADOFASEHDR',pic:'9',hsh:true},{av:'AV33BarFasEstSig',fld:'vBARFASESTSIG',pic:'9',hsh:true},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV339Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV337t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV5Archivo.getEof()',ctrl:'vARCHIVO',prop:'Eof'},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV339Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV337t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV255MaquinasHdrstxt',fld:'vMAQUINASHDRSTXT',pic:''},{av:'AV256Maquinastxt',fld:'vMAQUINASTXT',pic:''},{av:'edtavHdr1_Title',ctrl:'vHDR1',prop:'Title'},{av:'edtavHdr2_Title',ctrl:'vHDR2',prop:'Title'},{av:'edtavHdr3_Title',ctrl:'vHDR3',prop:'Title'},{av:'edtavHdr4_Title',ctrl:'vHDR4',prop:'Title'},{av:'edtavHdr5_Title',ctrl:'vHDR5',prop:'Title'},{av:'edtavHdr6_Title',ctrl:'vHDR6',prop:'Title'},{av:'edtavHdr7_Title',ctrl:'vHDR7',prop:'Title'},{av:'edtavHdr8_Title',ctrl:'vHDR8',prop:'Title'},{av:'edtavHdr9_Title',ctrl:'vHDR9',prop:'Title'},{av:'edtavHdr10_Title',ctrl:'vHDR10',prop:'Title'},{av:'edtavHdr11_Title',ctrl:'vHDR11',prop:'Title'},{av:'edtavHdr12_Title',ctrl:'vHDR12',prop:'Title'},{av:'edtavHdr13_Title',ctrl:'vHDR13',prop:'Title'},{av:'edtavHdr14_Title',ctrl:'vHDR14',prop:'Title'},{av:'edtavHdr15_Title',ctrl:'vHDR15',prop:'Title'},{av:'edtavHdr16_Title',ctrl:'vHDR16',prop:'Title'},{av:'edtavHdr17_Title',ctrl:'vHDR17',prop:'Title'},{av:'edtavHdr18_Title',ctrl:'vHDR18',prop:'Title'},{av:'edtavHdr19_Title',ctrl:'vHDR19',prop:'Title'},{av:'edtavHdr20_Title',ctrl:'vHDR20',prop:'Title'},{av:'edtavHdr21_Title',ctrl:'vHDR21',prop:'Title'},{av:'edtavHdr22_Title',ctrl:'vHDR22',prop:'Title'},{av:'edtavHdr23_Title',ctrl:'vHDR23',prop:'Title'},{av:'edtavHdr24_Title',ctrl:'vHDR24',prop:'Title'},{av:'edtavHdr25_Title',ctrl:'vHDR25',prop:'Title'},{av:'edtavHdr26_Title',ctrl:'vHDR26',prop:'Title'},{av:'edtavHdr27_Title',ctrl:'vHDR27',prop:'Title'},{av:'edtavHdr28_Title',ctrl:'vHDR28',prop:'Title'},{av:'AV265NospMaq',fld:'vNOSPMAQ',pic:'ZZZ9'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV65EstadoFaseHdr',fld:'vESTADOFASEHDR',pic:'9',hsh:true}]}");
      setEventMetadata("GRIDHDRS_FIRSTPAGE","{handler:'subgridhdrs_firstpage',iparms:[{av:'GRIDHDRS_nFirstRecordOnPage'},{av:'GRIDHDRS_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'subGridhdrs_Rows',ctrl:'GRIDHDRS',prop:'Rows'},{av:'AV67Fec2',fld:'vFEC2',pic:'',hsh:true},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'AV66Fec1',fld:'vFEC1',pic:'',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV52CliCodIN',fld:'vCLICODIN',pic:'ZZZZZ9',hsh:true},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'AV23BarColNomIn',fld:'vBARCOLNOMIN',pic:'',hsh:true},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'AV26BarEnccliIN',fld:'vBARENCCLIIN',pic:'',hsh:true},{av:'AV12BarcodIn',fld:'vBARCODIN',pic:'ZZZZZZZ9',hsh:true},{av:'AV20BarcodreoIN',fld:'vBARCODREOIN',pic:'9',hsh:true},{av:'AV16BarcodparIN',fld:'vBARCODPARIN',pic:'',hsh:true},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'AV65EstadoFaseHdr',fld:'vESTADOFASEHDR',pic:'9',hsh:true},{av:'AV33BarFasEstSig',fld:'vBARFASESTSIG',pic:'9',hsh:true},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A812RecTotKgm',fld:'RECTOTKGM',pic:'ZZZZZZ9.99'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:''},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A13234BarRGB',fld:'BARRGB',pic:'ZZZZZZZZZ9'},{av:'AV8B2',fld:'vB2',pic:'ZZ9',hsh:true},{av:'AV75G2',fld:'vG2',pic:'ZZ9',hsh:true},{av:'AV300R2',fld:'vR2',pic:'ZZ9',hsh:true},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV339Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV337t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV5Archivo.getEof()',ctrl:'vARCHIVO',prop:'Eof'},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("GRIDHDRS_FIRSTPAGE",",oparms:[{av:'AV339Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV337t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV255MaquinasHdrstxt',fld:'vMAQUINASHDRSTXT',pic:''},{av:'AV256Maquinastxt',fld:'vMAQUINASTXT',pic:''},{av:'edtavHdr1_Title',ctrl:'vHDR1',prop:'Title'},{av:'edtavHdr2_Title',ctrl:'vHDR2',prop:'Title'},{av:'edtavHdr3_Title',ctrl:'vHDR3',prop:'Title'},{av:'edtavHdr4_Title',ctrl:'vHDR4',prop:'Title'},{av:'edtavHdr5_Title',ctrl:'vHDR5',prop:'Title'},{av:'edtavHdr6_Title',ctrl:'vHDR6',prop:'Title'},{av:'edtavHdr7_Title',ctrl:'vHDR7',prop:'Title'},{av:'edtavHdr8_Title',ctrl:'vHDR8',prop:'Title'},{av:'edtavHdr9_Title',ctrl:'vHDR9',prop:'Title'},{av:'edtavHdr10_Title',ctrl:'vHDR10',prop:'Title'},{av:'edtavHdr11_Title',ctrl:'vHDR11',prop:'Title'},{av:'edtavHdr12_Title',ctrl:'vHDR12',prop:'Title'},{av:'edtavHdr13_Title',ctrl:'vHDR13',prop:'Title'},{av:'edtavHdr14_Title',ctrl:'vHDR14',prop:'Title'},{av:'edtavHdr15_Title',ctrl:'vHDR15',prop:'Title'},{av:'edtavHdr16_Title',ctrl:'vHDR16',prop:'Title'},{av:'edtavHdr17_Title',ctrl:'vHDR17',prop:'Title'},{av:'edtavHdr18_Title',ctrl:'vHDR18',prop:'Title'},{av:'edtavHdr19_Title',ctrl:'vHDR19',prop:'Title'},{av:'edtavHdr20_Title',ctrl:'vHDR20',prop:'Title'},{av:'edtavHdr21_Title',ctrl:'vHDR21',prop:'Title'},{av:'edtavHdr22_Title',ctrl:'vHDR22',prop:'Title'},{av:'edtavHdr23_Title',ctrl:'vHDR23',prop:'Title'},{av:'edtavHdr24_Title',ctrl:'vHDR24',prop:'Title'},{av:'edtavHdr25_Title',ctrl:'vHDR25',prop:'Title'},{av:'edtavHdr26_Title',ctrl:'vHDR26',prop:'Title'},{av:'edtavHdr27_Title',ctrl:'vHDR27',prop:'Title'},{av:'edtavHdr28_Title',ctrl:'vHDR28',prop:'Title'},{av:'AV265NospMaq',fld:'vNOSPMAQ',pic:'ZZZ9'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV65EstadoFaseHdr',fld:'vESTADOFASEHDR',pic:'9',hsh:true}]}");
      setEventMetadata("GRIDHDRS_PREVPAGE","{handler:'subgridhdrs_previouspage',iparms:[{av:'GRIDHDRS_nFirstRecordOnPage'},{av:'GRIDHDRS_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'subGridhdrs_Rows',ctrl:'GRIDHDRS',prop:'Rows'},{av:'AV67Fec2',fld:'vFEC2',pic:'',hsh:true},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'AV66Fec1',fld:'vFEC1',pic:'',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV52CliCodIN',fld:'vCLICODIN',pic:'ZZZZZ9',hsh:true},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'AV23BarColNomIn',fld:'vBARCOLNOMIN',pic:'',hsh:true},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'AV26BarEnccliIN',fld:'vBARENCCLIIN',pic:'',hsh:true},{av:'AV12BarcodIn',fld:'vBARCODIN',pic:'ZZZZZZZ9',hsh:true},{av:'AV20BarcodreoIN',fld:'vBARCODREOIN',pic:'9',hsh:true},{av:'AV16BarcodparIN',fld:'vBARCODPARIN',pic:'',hsh:true},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'AV65EstadoFaseHdr',fld:'vESTADOFASEHDR',pic:'9',hsh:true},{av:'AV33BarFasEstSig',fld:'vBARFASESTSIG',pic:'9',hsh:true},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A812RecTotKgm',fld:'RECTOTKGM',pic:'ZZZZZZ9.99'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:''},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A13234BarRGB',fld:'BARRGB',pic:'ZZZZZZZZZ9'},{av:'AV8B2',fld:'vB2',pic:'ZZ9',hsh:true},{av:'AV75G2',fld:'vG2',pic:'ZZ9',hsh:true},{av:'AV300R2',fld:'vR2',pic:'ZZ9',hsh:true},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV339Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV337t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV5Archivo.getEof()',ctrl:'vARCHIVO',prop:'Eof'},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("GRIDHDRS_PREVPAGE",",oparms:[{av:'AV339Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV337t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV255MaquinasHdrstxt',fld:'vMAQUINASHDRSTXT',pic:''},{av:'AV256Maquinastxt',fld:'vMAQUINASTXT',pic:''},{av:'edtavHdr1_Title',ctrl:'vHDR1',prop:'Title'},{av:'edtavHdr2_Title',ctrl:'vHDR2',prop:'Title'},{av:'edtavHdr3_Title',ctrl:'vHDR3',prop:'Title'},{av:'edtavHdr4_Title',ctrl:'vHDR4',prop:'Title'},{av:'edtavHdr5_Title',ctrl:'vHDR5',prop:'Title'},{av:'edtavHdr6_Title',ctrl:'vHDR6',prop:'Title'},{av:'edtavHdr7_Title',ctrl:'vHDR7',prop:'Title'},{av:'edtavHdr8_Title',ctrl:'vHDR8',prop:'Title'},{av:'edtavHdr9_Title',ctrl:'vHDR9',prop:'Title'},{av:'edtavHdr10_Title',ctrl:'vHDR10',prop:'Title'},{av:'edtavHdr11_Title',ctrl:'vHDR11',prop:'Title'},{av:'edtavHdr12_Title',ctrl:'vHDR12',prop:'Title'},{av:'edtavHdr13_Title',ctrl:'vHDR13',prop:'Title'},{av:'edtavHdr14_Title',ctrl:'vHDR14',prop:'Title'},{av:'edtavHdr15_Title',ctrl:'vHDR15',prop:'Title'},{av:'edtavHdr16_Title',ctrl:'vHDR16',prop:'Title'},{av:'edtavHdr17_Title',ctrl:'vHDR17',prop:'Title'},{av:'edtavHdr18_Title',ctrl:'vHDR18',prop:'Title'},{av:'edtavHdr19_Title',ctrl:'vHDR19',prop:'Title'},{av:'edtavHdr20_Title',ctrl:'vHDR20',prop:'Title'},{av:'edtavHdr21_Title',ctrl:'vHDR21',prop:'Title'},{av:'edtavHdr22_Title',ctrl:'vHDR22',prop:'Title'},{av:'edtavHdr23_Title',ctrl:'vHDR23',prop:'Title'},{av:'edtavHdr24_Title',ctrl:'vHDR24',prop:'Title'},{av:'edtavHdr25_Title',ctrl:'vHDR25',prop:'Title'},{av:'edtavHdr26_Title',ctrl:'vHDR26',prop:'Title'},{av:'edtavHdr27_Title',ctrl:'vHDR27',prop:'Title'},{av:'edtavHdr28_Title',ctrl:'vHDR28',prop:'Title'},{av:'AV265NospMaq',fld:'vNOSPMAQ',pic:'ZZZ9'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV65EstadoFaseHdr',fld:'vESTADOFASEHDR',pic:'9',hsh:true}]}");
      setEventMetadata("GRIDHDRS_NEXTPAGE","{handler:'subgridhdrs_nextpage',iparms:[{av:'GRIDHDRS_nFirstRecordOnPage'},{av:'GRIDHDRS_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'subGridhdrs_Rows',ctrl:'GRIDHDRS',prop:'Rows'},{av:'AV67Fec2',fld:'vFEC2',pic:'',hsh:true},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'AV66Fec1',fld:'vFEC1',pic:'',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV52CliCodIN',fld:'vCLICODIN',pic:'ZZZZZ9',hsh:true},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'AV23BarColNomIn',fld:'vBARCOLNOMIN',pic:'',hsh:true},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'AV26BarEnccliIN',fld:'vBARENCCLIIN',pic:'',hsh:true},{av:'AV12BarcodIn',fld:'vBARCODIN',pic:'ZZZZZZZ9',hsh:true},{av:'AV20BarcodreoIN',fld:'vBARCODREOIN',pic:'9',hsh:true},{av:'AV16BarcodparIN',fld:'vBARCODPARIN',pic:'',hsh:true},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'AV65EstadoFaseHdr',fld:'vESTADOFASEHDR',pic:'9',hsh:true},{av:'AV33BarFasEstSig',fld:'vBARFASESTSIG',pic:'9',hsh:true},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A812RecTotKgm',fld:'RECTOTKGM',pic:'ZZZZZZ9.99'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:''},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A13234BarRGB',fld:'BARRGB',pic:'ZZZZZZZZZ9'},{av:'AV8B2',fld:'vB2',pic:'ZZ9',hsh:true},{av:'AV75G2',fld:'vG2',pic:'ZZ9',hsh:true},{av:'AV300R2',fld:'vR2',pic:'ZZ9',hsh:true},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV339Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV337t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV5Archivo.getEof()',ctrl:'vARCHIVO',prop:'Eof'},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("GRIDHDRS_NEXTPAGE",",oparms:[{av:'AV339Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV337t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV255MaquinasHdrstxt',fld:'vMAQUINASHDRSTXT',pic:''},{av:'AV256Maquinastxt',fld:'vMAQUINASTXT',pic:''},{av:'edtavHdr1_Title',ctrl:'vHDR1',prop:'Title'},{av:'edtavHdr2_Title',ctrl:'vHDR2',prop:'Title'},{av:'edtavHdr3_Title',ctrl:'vHDR3',prop:'Title'},{av:'edtavHdr4_Title',ctrl:'vHDR4',prop:'Title'},{av:'edtavHdr5_Title',ctrl:'vHDR5',prop:'Title'},{av:'edtavHdr6_Title',ctrl:'vHDR6',prop:'Title'},{av:'edtavHdr7_Title',ctrl:'vHDR7',prop:'Title'},{av:'edtavHdr8_Title',ctrl:'vHDR8',prop:'Title'},{av:'edtavHdr9_Title',ctrl:'vHDR9',prop:'Title'},{av:'edtavHdr10_Title',ctrl:'vHDR10',prop:'Title'},{av:'edtavHdr11_Title',ctrl:'vHDR11',prop:'Title'},{av:'edtavHdr12_Title',ctrl:'vHDR12',prop:'Title'},{av:'edtavHdr13_Title',ctrl:'vHDR13',prop:'Title'},{av:'edtavHdr14_Title',ctrl:'vHDR14',prop:'Title'},{av:'edtavHdr15_Title',ctrl:'vHDR15',prop:'Title'},{av:'edtavHdr16_Title',ctrl:'vHDR16',prop:'Title'},{av:'edtavHdr17_Title',ctrl:'vHDR17',prop:'Title'},{av:'edtavHdr18_Title',ctrl:'vHDR18',prop:'Title'},{av:'edtavHdr19_Title',ctrl:'vHDR19',prop:'Title'},{av:'edtavHdr20_Title',ctrl:'vHDR20',prop:'Title'},{av:'edtavHdr21_Title',ctrl:'vHDR21',prop:'Title'},{av:'edtavHdr22_Title',ctrl:'vHDR22',prop:'Title'},{av:'edtavHdr23_Title',ctrl:'vHDR23',prop:'Title'},{av:'edtavHdr24_Title',ctrl:'vHDR24',prop:'Title'},{av:'edtavHdr25_Title',ctrl:'vHDR25',prop:'Title'},{av:'edtavHdr26_Title',ctrl:'vHDR26',prop:'Title'},{av:'edtavHdr27_Title',ctrl:'vHDR27',prop:'Title'},{av:'edtavHdr28_Title',ctrl:'vHDR28',prop:'Title'},{av:'AV265NospMaq',fld:'vNOSPMAQ',pic:'ZZZ9'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV65EstadoFaseHdr',fld:'vESTADOFASEHDR',pic:'9',hsh:true}]}");
      setEventMetadata("GRIDHDRS_LASTPAGE","{handler:'subgridhdrs_lastpage',iparms:[{av:'GRIDHDRS_nFirstRecordOnPage'},{av:'GRIDHDRS_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'subGridhdrs_Rows',ctrl:'GRIDHDRS',prop:'Rows'},{av:'AV67Fec2',fld:'vFEC2',pic:'',hsh:true},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'AV66Fec1',fld:'vFEC1',pic:'',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV52CliCodIN',fld:'vCLICODIN',pic:'ZZZZZ9',hsh:true},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'AV23BarColNomIn',fld:'vBARCOLNOMIN',pic:'',hsh:true},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'AV26BarEnccliIN',fld:'vBARENCCLIIN',pic:'',hsh:true},{av:'AV12BarcodIn',fld:'vBARCODIN',pic:'ZZZZZZZ9',hsh:true},{av:'AV20BarcodreoIN',fld:'vBARCODREOIN',pic:'9',hsh:true},{av:'AV16BarcodparIN',fld:'vBARCODPARIN',pic:'',hsh:true},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'AV65EstadoFaseHdr',fld:'vESTADOFASEHDR',pic:'9',hsh:true},{av:'AV33BarFasEstSig',fld:'vBARFASESTSIG',pic:'9',hsh:true},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A812RecTotKgm',fld:'RECTOTKGM',pic:'ZZZZZZ9.99'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:''},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A13234BarRGB',fld:'BARRGB',pic:'ZZZZZZZZZ9'},{av:'AV8B2',fld:'vB2',pic:'ZZ9',hsh:true},{av:'AV75G2',fld:'vG2',pic:'ZZ9',hsh:true},{av:'AV300R2',fld:'vR2',pic:'ZZ9',hsh:true},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV339Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV337t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV5Archivo.getEof()',ctrl:'vARCHIVO',prop:'Eof'},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("GRIDHDRS_LASTPAGE",",oparms:[{av:'AV339Tab_maq',fld:'vTAB_MAQ',pic:''},{av:'AV62EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV69FechaFin',fld:'vFECHAFIN',pic:'',hsh:true},{av:'AV70FecInicio',fld:'vFECINICIO',pic:'',hsh:true},{av:'AV337t',fld:'vT',pic:'ZZZ9',hsh:true},{av:'AV253MaqHdrs',fld:'vMAQHDRS',pic:''},{av:'AV252Maqdsc9',fld:'vMAQDSC9',pic:'',hsh:true},{av:'AV251Maqdsc8',fld:'vMAQDSC8',pic:'',hsh:true},{av:'AV250Maqdsc7',fld:'vMAQDSC7',pic:'',hsh:true},{av:'AV249Maqdsc6',fld:'vMAQDSC6',pic:'',hsh:true},{av:'AV248Maqdsc5',fld:'vMAQDSC5',pic:'',hsh:true},{av:'AV247Maqdsc4',fld:'vMAQDSC4',pic:'',hsh:true},{av:'AV246Maqdsc3',fld:'vMAQDSC3',pic:'',hsh:true},{av:'AV245MaqDsc28',fld:'vMAQDSC28',pic:'',hsh:true},{av:'AV244MaqDsc27',fld:'vMAQDSC27',pic:'',hsh:true},{av:'AV243MaqDsc26',fld:'vMAQDSC26',pic:'',hsh:true},{av:'AV242MaqDsc25',fld:'vMAQDSC25',pic:'',hsh:true},{av:'AV241MaqDsc24',fld:'vMAQDSC24',pic:'',hsh:true},{av:'AV240MaqDsc23',fld:'vMAQDSC23',pic:'',hsh:true},{av:'AV239MaqDsc22',fld:'vMAQDSC22',pic:'',hsh:true},{av:'AV238MaqDsc21',fld:'vMAQDSC21',pic:'',hsh:true},{av:'AV237MaqDsc20',fld:'vMAQDSC20',pic:'',hsh:true},{av:'AV236Maqdsc2',fld:'vMAQDSC2',pic:'',hsh:true},{av:'AV235MaqDsc19',fld:'vMAQDSC19',pic:'',hsh:true},{av:'AV234MaqDsc18',fld:'vMAQDSC18',pic:'',hsh:true},{av:'AV233MaqDsc17',fld:'vMAQDSC17',pic:'',hsh:true},{av:'AV232MaqDsc16',fld:'vMAQDSC16',pic:'',hsh:true},{av:'AV231Maqdsc15',fld:'vMAQDSC15',pic:'',hsh:true},{av:'AV230Maqdsc14',fld:'vMAQDSC14',pic:'',hsh:true},{av:'AV229Maqdsc13',fld:'vMAQDSC13',pic:'',hsh:true},{av:'AV228Maqdsc12',fld:'vMAQDSC12',pic:'',hsh:true},{av:'AV227Maqdsc11',fld:'vMAQDSC11',pic:'',hsh:true},{av:'AV226Maqdsc10',fld:'vMAQDSC10',pic:'',hsh:true},{av:'AV225Maqdsc1',fld:'vMAQDSC1',pic:'',hsh:true},{av:'AV192Maqcod9',fld:'vMAQCOD9',pic:'',hsh:true},{av:'AV191Maqcod8',fld:'vMAQCOD8',pic:'',hsh:true},{av:'AV190Maqcod7',fld:'vMAQCOD7',pic:'',hsh:true},{av:'AV189Maqcod6',fld:'vMAQCOD6',pic:'',hsh:true},{av:'AV188Maqcod5',fld:'vMAQCOD5',pic:'',hsh:true},{av:'AV187Maqcod4',fld:'vMAQCOD4',pic:'',hsh:true},{av:'AV186Maqcod3',fld:'vMAQCOD3',pic:'',hsh:true},{av:'AV185Maqcod28',fld:'vMAQCOD28',pic:'',hsh:true},{av:'AV184Maqcod27',fld:'vMAQCOD27',pic:'',hsh:true},{av:'AV183Maqcod26',fld:'vMAQCOD26',pic:'',hsh:true},{av:'AV182Maqcod25',fld:'vMAQCOD25',pic:'',hsh:true},{av:'AV181Maqcod24',fld:'vMAQCOD24',pic:'',hsh:true},{av:'AV180Maqcod23',fld:'vMAQCOD23',pic:'',hsh:true},{av:'AV179Maqcod22',fld:'vMAQCOD22',pic:'',hsh:true},{av:'AV178Maqcod21',fld:'vMAQCOD21',pic:'',hsh:true},{av:'AV177Maqcod20',fld:'vMAQCOD20',pic:'',hsh:true},{av:'AV176Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV175Maqcod19',fld:'vMAQCOD19',pic:'',hsh:true},{av:'AV174Maqcod18',fld:'vMAQCOD18',pic:'',hsh:true},{av:'AV173Maqcod17',fld:'vMAQCOD17',pic:'',hsh:true},{av:'AV172Maqcod16',fld:'vMAQCOD16',pic:'',hsh:true},{av:'AV171Maqcod15',fld:'vMAQCOD15',pic:'',hsh:true},{av:'AV170Maqcod14',fld:'vMAQCOD14',pic:'',hsh:true},{av:'AV169Maqcod13',fld:'vMAQCOD13',pic:'',hsh:true},{av:'AV168MaqCod12',fld:'vMAQCOD12',pic:'',hsh:true},{av:'AV167Maqcod11',fld:'vMAQCOD11',pic:'',hsh:true},{av:'AV166MaqCod10',fld:'vMAQCOD10',pic:'',hsh:true},{av:'AV165Maqcod1',fld:'vMAQCOD1',pic:'',hsh:true},{av:'AV164Maqcod',fld:'vMAQCOD',pic:'',hsh:true},{av:'AV255MaquinasHdrstxt',fld:'vMAQUINASHDRSTXT',pic:''},{av:'AV256Maquinastxt',fld:'vMAQUINASTXT',pic:''},{av:'edtavHdr1_Title',ctrl:'vHDR1',prop:'Title'},{av:'edtavHdr2_Title',ctrl:'vHDR2',prop:'Title'},{av:'edtavHdr3_Title',ctrl:'vHDR3',prop:'Title'},{av:'edtavHdr4_Title',ctrl:'vHDR4',prop:'Title'},{av:'edtavHdr5_Title',ctrl:'vHDR5',prop:'Title'},{av:'edtavHdr6_Title',ctrl:'vHDR6',prop:'Title'},{av:'edtavHdr7_Title',ctrl:'vHDR7',prop:'Title'},{av:'edtavHdr8_Title',ctrl:'vHDR8',prop:'Title'},{av:'edtavHdr9_Title',ctrl:'vHDR9',prop:'Title'},{av:'edtavHdr10_Title',ctrl:'vHDR10',prop:'Title'},{av:'edtavHdr11_Title',ctrl:'vHDR11',prop:'Title'},{av:'edtavHdr12_Title',ctrl:'vHDR12',prop:'Title'},{av:'edtavHdr13_Title',ctrl:'vHDR13',prop:'Title'},{av:'edtavHdr14_Title',ctrl:'vHDR14',prop:'Title'},{av:'edtavHdr15_Title',ctrl:'vHDR15',prop:'Title'},{av:'edtavHdr16_Title',ctrl:'vHDR16',prop:'Title'},{av:'edtavHdr17_Title',ctrl:'vHDR17',prop:'Title'},{av:'edtavHdr18_Title',ctrl:'vHDR18',prop:'Title'},{av:'edtavHdr19_Title',ctrl:'vHDR19',prop:'Title'},{av:'edtavHdr20_Title',ctrl:'vHDR20',prop:'Title'},{av:'edtavHdr21_Title',ctrl:'vHDR21',prop:'Title'},{av:'edtavHdr22_Title',ctrl:'vHDR22',prop:'Title'},{av:'edtavHdr23_Title',ctrl:'vHDR23',prop:'Title'},{av:'edtavHdr24_Title',ctrl:'vHDR24',prop:'Title'},{av:'edtavHdr25_Title',ctrl:'vHDR25',prop:'Title'},{av:'edtavHdr26_Title',ctrl:'vHDR26',prop:'Title'},{av:'edtavHdr27_Title',ctrl:'vHDR27',prop:'Title'},{av:'edtavHdr28_Title',ctrl:'vHDR28',prop:'Title'},{av:'AV265NospMaq',fld:'vNOSPMAQ',pic:'ZZZ9'},{av:'AV10Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18Barcodreo',fld:'vBARCODREO',pic:'9',hsh:true},{av:'AV14Barcodpar',fld:'vBARCODPAR',pic:'',hsh:true},{av:'AV30Barfasestant',fld:'vBARFASESTANT',pic:'9',hsh:true},{av:'AV41Barordlin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV65EstadoFaseHdr',fld:'vESTADOFASEHDR',pic:'9',hsh:true}]}");
      setEventMetadata("NULL","{handler:'validv_Linea28',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Barsitgrid',iparms:[]");
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
      AV5Archivo = new com.genexus.util.GXFile();
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV62EmprCod = "" ;
      AV70FecInicio = GXutil.nullDate() ;
      AV69FechaFin = GXutil.nullDate() ;
      AV165Maqcod1 = "" ;
      AV166MaqCod10 = "" ;
      AV167Maqcod11 = "" ;
      AV168MaqCod12 = "" ;
      AV169Maqcod13 = "" ;
      AV170Maqcod14 = "" ;
      AV171Maqcod15 = "" ;
      AV172Maqcod16 = "" ;
      AV173Maqcod17 = "" ;
      AV174Maqcod18 = "" ;
      AV175Maqcod19 = "" ;
      AV176Maqcod2 = "" ;
      AV177Maqcod20 = "" ;
      AV178Maqcod21 = "" ;
      AV179Maqcod22 = "" ;
      AV180Maqcod23 = "" ;
      AV181Maqcod24 = "" ;
      AV182Maqcod25 = "" ;
      AV183Maqcod26 = "" ;
      AV184Maqcod27 = "" ;
      AV185Maqcod28 = "" ;
      AV186Maqcod3 = "" ;
      AV187Maqcod4 = "" ;
      AV188Maqcod5 = "" ;
      AV189Maqcod6 = "" ;
      AV190Maqcod7 = "" ;
      AV191Maqcod8 = "" ;
      AV192Maqcod9 = "" ;
      AV225Maqdsc1 = "" ;
      AV226Maqdsc10 = "" ;
      AV227Maqdsc11 = "" ;
      AV228Maqdsc12 = "" ;
      AV229Maqdsc13 = "" ;
      AV230Maqdsc14 = "" ;
      AV231Maqdsc15 = "" ;
      AV232MaqDsc16 = "" ;
      AV233MaqDsc17 = "" ;
      AV234MaqDsc18 = "" ;
      AV235MaqDsc19 = "" ;
      AV236Maqdsc2 = "" ;
      AV237MaqDsc20 = "" ;
      AV238MaqDsc21 = "" ;
      AV239MaqDsc22 = "" ;
      AV240MaqDsc23 = "" ;
      AV241MaqDsc24 = "" ;
      AV242MaqDsc25 = "" ;
      AV243MaqDsc26 = "" ;
      AV244MaqDsc27 = "" ;
      AV245MaqDsc28 = "" ;
      AV246Maqdsc3 = "" ;
      AV247Maqdsc4 = "" ;
      AV248Maqdsc5 = "" ;
      AV249Maqdsc6 = "" ;
      AV250Maqdsc7 = "" ;
      AV251Maqdsc8 = "" ;
      AV252Maqdsc9 = "" ;
      AV164Maqcod = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV14Barcodpar = "" ;
      A150BarFacTin = "" ;
      AV88Hdr2 = "" ;
      AV67Fec2 = GXutil.nullDate() ;
      AV66Fec1 = GXutil.nullDate() ;
      AV23BarColNomIn = "" ;
      AV26BarEnccliIN = "" ;
      AV16BarcodparIN = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A180BarMaqCod = "" ;
      A135BarColNom = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A120BarAgrEst = "" ;
      A1652BarSerDsc = "" ;
      A212BarSer = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      A158BarFecFpr = GXutil.nullDate() ;
      A1234BarNomCli = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV339Tab_maq = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV339Tab_maq[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV253MaqHdrs = new String[100][1000] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         GX_J = 1 ;
         while ( GX_J <= 1000 )
         {
            AV253MaqHdrs[GX_I-1][GX_J-1] = "" ;
            GX_J = (int)(GX_J+1) ;
         }
         GX_I = (int)(GX_I+1) ;
      }
      AV256Maquinastxt = "" ;
      AV255MaquinasHdrstxt = "" ;
      AV72Filename = "" ;
      AV195MaqCodPln = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      GridhdrsContainer = new com.genexus.webpanels.GXWebGrid(context);
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV77Hdr1 = "" ;
      AV98Hdr3 = "" ;
      AV99Hdr4 = "" ;
      AV100Hdr5 = "" ;
      AV101Hdr6 = "" ;
      AV102Hdr7 = "" ;
      AV103Hdr8 = "" ;
      AV104Hdr9 = "" ;
      AV78Hdr10 = "" ;
      AV79Hdr11 = "" ;
      AV80Hdr12 = "" ;
      AV81Hdr13 = "" ;
      AV82Hdr14 = "" ;
      AV83Hdr15 = "" ;
      AV84Hdr16 = "" ;
      AV85Hdr17 = "" ;
      AV86Hdr18 = "" ;
      AV87Hdr19 = "" ;
      AV89Hdr20 = "" ;
      AV90Hdr21 = "" ;
      AV91Hdr22 = "" ;
      AV92Hdr23 = "" ;
      AV93Hdr24 = "" ;
      AV94Hdr25 = "" ;
      AV95Hdr26 = "" ;
      AV96Hdr27 = "" ;
      AV97Hdr28 = "" ;
      AV112Linea1 = "" ;
      AV123Linea2 = "" ;
      AV133Linea3 = "" ;
      AV134Linea4 = "" ;
      AV135Linea5 = "" ;
      AV136Linea6 = "" ;
      AV137Linea7 = "" ;
      AV138LInea8 = "" ;
      AV139Linea9 = "" ;
      AV113Linea10 = "" ;
      AV114Linea11 = "" ;
      AV115Linea12 = "" ;
      AV116Linea13 = "" ;
      AV117Linea14 = "" ;
      AV118Linea15 = "" ;
      AV119Linea16 = "" ;
      AV120Linea17 = "" ;
      AV121Linea18 = "" ;
      AV122Linea19 = "" ;
      AV124Linea20 = "" ;
      AV125Linea21 = "" ;
      AV126Linea22 = "" ;
      AV127Linea23 = "" ;
      AV128Linea24 = "" ;
      AV129Linea25 = "" ;
      AV130Linea26 = "" ;
      AV131Linea27 = "" ;
      AV132Linea28 = "" ;
      AV268OpGrid = "" ;
      AV105Hdrgrid = "" ;
      AV9BarAgrestgrid = "" ;
      AV53CliNomgrid = "" ;
      AV25BarEnccligrid = "" ;
      AV22BarcolNomgrid = "" ;
      AV44BarserGrid = "" ;
      AV43BarSerDscgrid = "" ;
      AV387Barnomcligrid1 = "" ;
      AV37BarKgsgrid = DecimalUtil.ZERO ;
      AV302Rectotkgmgrid = DecimalUtil.ZERO ;
      AV35Barfecgengrid = GXutil.nullDate() ;
      AV34barfecfprgrid = GXutil.nullDate() ;
      AV699MsgControl = "" ;
      AV336Station = "" ;
      AV63EmprNom = "" ;
      AV350UsurCod = "" ;
      AV49Carpeta = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_char12 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_char14 = new String[1] ;
      GXv_char15 = new String[1] ;
      GXv_char16 = new String[1] ;
      GXv_char17 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_char19 = new String[1] ;
      GXv_char20 = new String[1] ;
      GXv_char21 = new String[1] ;
      GXv_char22 = new String[1] ;
      GXv_char23 = new String[1] ;
      GXv_char24 = new String[1] ;
      GXv_char25 = new String[1] ;
      GXv_char26 = new String[1] ;
      GXv_char27 = new String[1] ;
      GXv_char28 = new String[1] ;
      GXv_char29 = new String[1] ;
      GXv_char30 = new String[1] ;
      GXv_char31 = new String[1] ;
      GXv_char32 = new String[1] ;
      GXv_char33 = new String[1] ;
      GXv_char34 = new String[1] ;
      GXv_char35 = new String[1] ;
      GXv_char36 = new String[1] ;
      GXv_char37 = new String[1] ;
      GXv_char38 = new String[1] ;
      GXv_char39 = new String[1] ;
      GXv_char40 = new String[1] ;
      GXv_char41 = new String[1] ;
      GXv_char42 = new String[1] ;
      GXv_char43 = new String[1] ;
      GXv_char44 = new String[1] ;
      GXv_char45 = new String[1] ;
      GXv_char46 = new String[1] ;
      GXv_char47 = new String[1] ;
      GXv_char48 = new String[1] ;
      GXv_char49 = new String[1] ;
      GXv_char50 = new String[1] ;
      GXv_char51 = new String[1] ;
      GXv_char52 = new String[1] ;
      GXv_char53 = new String[1] ;
      GXv_char54 = new String[1] ;
      AV270Partidas = DecimalUtil.ZERO ;
      AV344Texto = "" ;
      AV76Hdr = "" ;
      AV64EstadoFasegrid = "" ;
      AV260Min = DecimalUtil.ZERO ;
      AV259Max = DecimalUtil.ZERO ;
      AV111L = DecimalUtil.ZERO ;
      AV48Cant = "" ;
      AV196MaqCodRc1 = "" ;
      AV207MaqCodRc2 = "" ;
      AV217MaqCodRc3 = "" ;
      AV218MaqCodRc4 = "" ;
      AV219MaqCodRc5 = "" ;
      AV220MaqCodRc6 = "" ;
      AV221MaqCodRc7 = "" ;
      AV222MaqCodRc8 = "" ;
      AV223MaqCodRc9 = "" ;
      AV197MaqCodRc10 = "" ;
      AV198MaqCodRc11 = "" ;
      AV199MaqCodRc12 = "" ;
      AV200MaqCodRc13 = "" ;
      AV201MaqCodRc14 = "" ;
      AV203MaqCodRc16 = "" ;
      AV204MaqCodRc17 = "" ;
      AV205MaqCodRc18 = "" ;
      AV206MaqCodRc19 = "" ;
      AV208MaqCodRc20 = "" ;
      AV209MaqCodRc21 = "" ;
      AV210MaqCodRc22 = "" ;
      AV211MaqCodRc23 = "" ;
      AV212MaqCodRc24 = "" ;
      AV213MaqCodRc25 = "" ;
      AV214MaqCodRc26 = "" ;
      AV215MaqCodRc27 = "" ;
      AV216MaqCodRc28 = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV345Texto_l = "" ;
      AV68fecha = GXutil.nullDate() ;
      AV193MaqCodBis = "" ;
      AV346Texto1 = "" ;
      scmdbuf = "" ;
      H00AU2_A758ProCod = new String[] {""} ;
      H00AU2_A153BarFasEst = new byte[1] ;
      H00AU2_A150BarFacTin = new String[] {""} ;
      H00AU2_A130BarCodPar = new String[] {""} ;
      H00AU2_A132BarCodReo = new byte[1] ;
      H00AU2_A129BarCod = new int[1] ;
      H00AU2_A396EmprCod = new String[] {""} ;
      H00AU2_A194BarOrdLin = new short[1] ;
      AV348TotKgs = DecimalUtil.ZERO ;
      lV23BarColNomIn = "" ;
      H00AU5_A396EmprCod = new String[] {""} ;
      H00AU5_A130BarCodPar = new String[] {""} ;
      H00AU5_A132BarCodReo = new byte[1] ;
      H00AU5_A129BarCod = new int[1] ;
      H00AU5_A143BarDisNum = new String[] {""} ;
      H00AU5_A4812BarEncCli = new String[] {""} ;
      H00AU5_A135BarColNom = new String[] {""} ;
      H00AU5_A252CliCod = new int[1] ;
      H00AU5_n252CliCod = new boolean[] {false} ;
      H00AU5_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H00AU5_A180BarMaqCod = new String[] {""} ;
      H00AU5_A213BarSit = new byte[1] ;
      H00AU5_A120BarAgrEst = new String[] {""} ;
      H00AU5_A1652BarSerDsc = new String[] {""} ;
      H00AU5_A212BarSer = new String[] {""} ;
      H00AU5_A136BarColNum = new int[1] ;
      H00AU5_A279CliNom = new String[] {""} ;
      H00AU5_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      H00AU5_A1234BarNomCli = new String[] {""} ;
      H00AU5_A361DisCod = new int[1] ;
      H00AU5_A218BarTipCol = new byte[1] ;
      H00AU5_A13234BarRGB = new long[1] ;
      H00AU5_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00AU5_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00AU5_n219BarTotAgr = new boolean[] {false} ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      AV17Barcodparm = "" ;
      AV703Op = "" ;
      GXv_char56 = new String[1] ;
      GXv_int65 = new byte[1] ;
      GXv_char55 = new String[1] ;
      GXv_char60 = new String[1] ;
      GXv_int67 = new byte[1] ;
      GXv_char59 = new String[1] ;
      GXv_int66 = new byte[1] ;
      GXv_date68 = new java.util.Date[1] ;
      GXv_char58 = new String[1] ;
      AV27BarFacTingrid = "" ;
      GXv_char57 = new String[1] ;
      AV106Hdrmngrid = "" ;
      GXv_int6 = new int[1] ;
      AV39Barmaqcodgrid = "" ;
      AV40Barnomcligrid = "" ;
      AV15barcodpargrid = "" ;
      GXv_int62 = new long[1] ;
      GXv_int64 = new short[1] ;
      GXv_int63 = new short[1] ;
      GXv_int61 = new short[1] ;
      GridhdrsRow = new com.genexus.webpanels.GXWebRow();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      subGridhdrs_Linesclass = "" ;
      ClassString = "" ;
      StyleString = "" ;
      GXCCtl = "" ;
      GridhdrsColumn = new com.genexus.webpanels.GXWebColumn();
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webrdtoplanificacion__default(),
         new Object[] {
             new Object[] {
            H00AU2_A758ProCod, H00AU2_A153BarFasEst, H00AU2_A150BarFacTin, H00AU2_A130BarCodPar, H00AU2_A132BarCodReo, H00AU2_A129BarCod, H00AU2_A396EmprCod, H00AU2_A194BarOrdLin
            }
            , new Object[] {
            H00AU5_A396EmprCod, H00AU5_A130BarCodPar, H00AU5_A132BarCodReo, H00AU5_A129BarCod, H00AU5_A143BarDisNum, H00AU5_A4812BarEncCli, H00AU5_A135BarColNom, H00AU5_A252CliCod, H00AU5_n252CliCod, H00AU5_A159BarFecGen,
            H00AU5_A180BarMaqCod, H00AU5_A213BarSit, H00AU5_A120BarAgrEst, H00AU5_A1652BarSerDsc, H00AU5_A212BarSer, H00AU5_A136BarColNum, H00AU5_A279CliNom, H00AU5_A158BarFecFpr, H00AU5_A1234BarNomCli, H00AU5_A361DisCod,
            H00AU5_A218BarTipCol, H00AU5_A13234BarRGB, H00AU5_A166BarKgm, H00AU5_A219BarTotAgr, H00AU5_n219BarTotAgr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavLinea2_Enabled = 0 ;
      edtavLinea3_Enabled = 0 ;
      edtavLinea4_Enabled = 0 ;
      edtavLinea5_Enabled = 0 ;
      edtavLinea6_Enabled = 0 ;
      edtavLinea7_Enabled = 0 ;
      edtavLinea8_Enabled = 0 ;
      edtavLinea9_Enabled = 0 ;
      edtavLinea10_Enabled = 0 ;
      edtavLinea11_Enabled = 0 ;
      edtavLinea12_Enabled = 0 ;
      edtavLinea13_Enabled = 0 ;
      edtavLinea14_Enabled = 0 ;
      edtavLinea15_Enabled = 0 ;
      edtavLinea16_Enabled = 0 ;
      edtavLinea17_Enabled = 0 ;
      edtavLinea18_Enabled = 0 ;
      edtavLinea19_Enabled = 0 ;
      edtavLinea20_Enabled = 0 ;
      edtavLinea21_Enabled = 0 ;
      edtavLinea22_Enabled = 0 ;
      edtavLinea23_Enabled = 0 ;
      edtavLinea24_Enabled = 0 ;
      edtavLinea25_Enabled = 0 ;
      edtavLinea26_Enabled = 0 ;
      edtavLinea27_Enabled = 0 ;
      edtavLinea28_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte GRIDHDRS_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV30Barfasestant ;
   private byte A132BarCodReo ;
   private byte AV18Barcodreo ;
   private byte A153BarFasEst ;
   private byte AV20BarcodreoIN ;
   private byte AV65EstadoFaseHdr ;
   private byte AV33BarFasEstSig ;
   private byte A213BarSit ;
   private byte A218BarTipCol ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte AV45BarSitgrid ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGridhdrs_Backcolorstyle ;
   private byte AV32BarFasestGrid1 ;
   private byte AV28BarFasEst ;
   private byte AV21Barcodreom ;
   private byte GXv_int65[] ;
   private byte GXv_int67[] ;
   private byte AV31BarFasEstgrid ;
   private byte GXv_int66[] ;
   private byte AV19Barcodreogrid ;
   private byte AV46BarTipcolgrid ;
   private byte subGrid_Backstyle ;
   private byte subGridhdrs_Backstyle ;
   private byte subGridhdrs_Titlebackstyle ;
   private byte subGridhdrs_Allowselection ;
   private byte subGridhdrs_Allowhovering ;
   private byte subGridhdrs_Allowcollapsing ;
   private byte subGridhdrs_Collapsed ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short AV337t ;
   private short AV41Barordlin ;
   private short A194BarOrdLin ;
   private short AV8B2 ;
   private short AV75G2 ;
   private short AV300R2 ;
   private short AV265NospMaq ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV59dias ;
   private short AV108i ;
   private short AV110k ;
   private short AV109j ;
   private short AV299R ;
   private short AV74G ;
   private short AV7B ;
   private short GXv_int64[] ;
   private short GXv_int63[] ;
   private short GXv_int61[] ;
   private int nRC_GXsfl_9 ;
   private int nRC_GXsfl_71 ;
   private int subGrid_Rows ;
   private int subGridhdrs_Rows ;
   private int nGXsfl_9_idx=1 ;
   private int A129BarCod ;
   private int AV10Barcod ;
   private int AV52CliCodIN ;
   private int AV12BarcodIn ;
   private int nGXsfl_71_idx=1 ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A361DisCod ;
   private int AV162Maccod ;
   private int subGrid_Islastpage ;
   private int subGridhdrs_Islastpage ;
   private int edtavLinea2_Enabled ;
   private int edtavLinea3_Enabled ;
   private int edtavLinea4_Enabled ;
   private int edtavLinea5_Enabled ;
   private int edtavLinea6_Enabled ;
   private int edtavLinea7_Enabled ;
   private int edtavLinea8_Enabled ;
   private int edtavLinea9_Enabled ;
   private int edtavLinea10_Enabled ;
   private int edtavLinea11_Enabled ;
   private int edtavLinea12_Enabled ;
   private int edtavLinea13_Enabled ;
   private int edtavLinea14_Enabled ;
   private int edtavLinea15_Enabled ;
   private int edtavLinea16_Enabled ;
   private int edtavLinea17_Enabled ;
   private int edtavLinea18_Enabled ;
   private int edtavLinea19_Enabled ;
   private int edtavLinea20_Enabled ;
   private int edtavLinea21_Enabled ;
   private int edtavLinea22_Enabled ;
   private int edtavLinea23_Enabled ;
   private int edtavLinea24_Enabled ;
   private int edtavLinea25_Enabled ;
   private int edtavLinea26_Enabled ;
   private int edtavLinea27_Enabled ;
   private int edtavLinea28_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int GRIDHDRS_nGridOutOfScope ;
   private int subGrid_Recordcount ;
   private int subGridhdrs_Recordcount ;
   private int edtavMsgcontrol_Enabled ;
   private int GXt_int5 ;
   private int edtavHdr1_Backcolor ;
   private int edtavHdr1_Forecolor ;
   private int edtavHdr2_Backcolor ;
   private int edtavHdr3_Forecolor ;
   private int edtavHdr3_Backcolor ;
   private int edtavHdr4_Backcolor ;
   private int edtavHdr4_Forecolor ;
   private int edtavHdr5_Backcolor ;
   private int edtavHdr5_Forecolor ;
   private int edtavHdr6_Backcolor ;
   private int edtavHdr6_Forecolor ;
   private int edtavHdr7_Backcolor ;
   private int edtavHdr7_Forecolor ;
   private int edtavHdr8_Backcolor ;
   private int edtavHdr8_Forecolor ;
   private int edtavHdr9_Backcolor ;
   private int edtavHdr9_Forecolor ;
   private int edtavHdr10_Backcolor ;
   private int edtavHdr10_Forecolor ;
   private int edtavHdr11_Backcolor ;
   private int edtavHdr11_Forecolor ;
   private int edtavHdr12_Backcolor ;
   private int edtavHdr12_Forecolor ;
   private int edtavHdr13_Backcolor ;
   private int edtavHdr13_Forecolor ;
   private int edtavHdr14_Backcolor ;
   private int edtavHdr14_Forecolor ;
   private int edtavHdr15_Backcolor ;
   private int edtavHdr15_Forecolor ;
   private int edtavHdr16_Backcolor ;
   private int edtavHdr16_Forecolor ;
   private int edtavHdr17_Backcolor ;
   private int edtavHdr17_Forecolor ;
   private int edtavHdr18_Backcolor ;
   private int edtavHdr18_Forecolor ;
   private int edtavHdr19_Backcolor ;
   private int edtavHdr19_Forecolor ;
   private int edtavHdr20_Backcolor ;
   private int edtavHdr20_Forecolor ;
   private int edtavHdr21_Backcolor ;
   private int edtavHdr21_Forecolor ;
   private int edtavHdr22_Backcolor ;
   private int edtavHdr22_Forecolor ;
   private int edtavHdr23_Backcolor ;
   private int edtavHdr23_Forecolor ;
   private int edtavHdr24_Backcolor ;
   private int edtavHdr24_Forecolor ;
   private int edtavHdr25_Backcolor ;
   private int edtavHdr25_Forecolor ;
   private int edtavHdr26_Backcolor ;
   private int edtavHdr26_Forecolor ;
   private int edtavHdr27_Backcolor ;
   private int edtavHdr27_Forecolor ;
   private int edtavHdr28_Backcolor ;
   private int edtavHdr28_Forecolor ;
   private int AV263Nhdrs ;
   private int AV13Barcodm ;
   private int GXv_int6[] ;
   private int AV24Barcolnumgrid ;
   private int AV51ClicodGrid ;
   private int AV11Barcodgrid ;
   private int AV61DisCodGrid ;
   private int edtavBarcolnomgrid_Backcolor ;
   private int edtavBarcolnomgrid_Forecolor ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGridhdrs_Backcolor ;
   private int subGridhdrs_Allbackcolor ;
   private int subGridhdrs_Titlebackcolor ;
   private int subGridhdrs_Selectedindex ;
   private int subGridhdrs_Selectioncolor ;
   private int subGridhdrs_Hoveringcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int GX_I ;
   private int GX_J ;
   private long GRID_nFirstRecordOnPage ;
   private long GRIDHDRS_nFirstRecordOnPage ;
   private long A13234BarRGB ;
   private long GRID_nCurrentRecord ;
   private long GRIDHDRS_nCurrentRecord ;
   private long AV303Rgb ;
   private long AV304Rgb1 ;
   private long AV315Rgb2 ;
   private long AV325Rgb3 ;
   private long AV326Rgb4 ;
   private long AV327Rgb5 ;
   private long AV328Rgb6 ;
   private long AV329Rgb7 ;
   private long AV330Rgb8 ;
   private long AV331Rgb9 ;
   private long AV305Rgb10 ;
   private long AV306Rgb11 ;
   private long AV307Rgb12 ;
   private long AV308Rgb13 ;
   private long AV309Rgb14 ;
   private long AV310Rgb15 ;
   private long AV311Rgb16 ;
   private long AV312Rgb17 ;
   private long AV313Rgb18 ;
   private long AV314Rgb19 ;
   private long AV316Rgb20 ;
   private long AV317Rgb21 ;
   private long AV318Rgb22 ;
   private long AV319Rgb23 ;
   private long AV320Rgb24 ;
   private long AV321Rgb25 ;
   private long AV322Rgb26 ;
   private long AV323Rgb27 ;
   private long AV324Rgb28 ;
   private long AV42BarRgb ;
   private long GXv_int62[] ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal AV37BarKgsgrid ;
   private java.math.BigDecimal AV302Rectotkgmgrid ;
   private java.math.BigDecimal AV270Partidas ;
   private java.math.BigDecimal AV260Min ;
   private java.math.BigDecimal AV259Max ;
   private java.math.BigDecimal AV111L ;
   private java.math.BigDecimal AV348TotKgs ;
   private java.math.BigDecimal A219BarTotAgr ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_9_idx="0001" ;
   private String AV62EmprCod ;
   private String AV165Maqcod1 ;
   private String AV166MaqCod10 ;
   private String AV167Maqcod11 ;
   private String AV168MaqCod12 ;
   private String AV169Maqcod13 ;
   private String AV170Maqcod14 ;
   private String AV171Maqcod15 ;
   private String AV172Maqcod16 ;
   private String AV173Maqcod17 ;
   private String AV174Maqcod18 ;
   private String AV175Maqcod19 ;
   private String AV176Maqcod2 ;
   private String AV177Maqcod20 ;
   private String AV178Maqcod21 ;
   private String AV179Maqcod22 ;
   private String AV180Maqcod23 ;
   private String AV181Maqcod24 ;
   private String AV182Maqcod25 ;
   private String AV183Maqcod26 ;
   private String AV184Maqcod27 ;
   private String AV185Maqcod28 ;
   private String AV186Maqcod3 ;
   private String AV187Maqcod4 ;
   private String AV188Maqcod5 ;
   private String AV189Maqcod6 ;
   private String AV190Maqcod7 ;
   private String AV191Maqcod8 ;
   private String AV192Maqcod9 ;
   private String AV225Maqdsc1 ;
   private String AV226Maqdsc10 ;
   private String AV227Maqdsc11 ;
   private String AV228Maqdsc12 ;
   private String AV229Maqdsc13 ;
   private String AV230Maqdsc14 ;
   private String AV231Maqdsc15 ;
   private String AV232MaqDsc16 ;
   private String AV233MaqDsc17 ;
   private String AV234MaqDsc18 ;
   private String AV235MaqDsc19 ;
   private String AV236Maqdsc2 ;
   private String AV237MaqDsc20 ;
   private String AV238MaqDsc21 ;
   private String AV239MaqDsc22 ;
   private String AV240MaqDsc23 ;
   private String AV241MaqDsc24 ;
   private String AV242MaqDsc25 ;
   private String AV243MaqDsc26 ;
   private String AV244MaqDsc27 ;
   private String AV245MaqDsc28 ;
   private String AV246Maqdsc3 ;
   private String AV247Maqdsc4 ;
   private String AV248Maqdsc5 ;
   private String AV249Maqdsc6 ;
   private String AV250Maqdsc7 ;
   private String AV251Maqdsc8 ;
   private String AV252Maqdsc9 ;
   private String AV164Maqcod ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV14Barcodpar ;
   private String A150BarFacTin ;
   private String AV88Hdr2 ;
   private String AV23BarColNomIn ;
   private String AV26BarEnccliIN ;
   private String AV16BarcodparIN ;
   private String sGXsfl_71_idx="0001" ;
   private String A180BarMaqCod ;
   private String A135BarColNom ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A120BarAgrEst ;
   private String A1652BarSerDsc ;
   private String A212BarSer ;
   private String A279CliNom ;
   private String A1234BarNomCli ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV339Tab_maq[] ;
   private String AV253MaqHdrs[][] ;
   private String AV72Filename ;
   private String AV195MaqCodPln ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String subGridhdrs_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV77Hdr1 ;
   private String edtavHdr1_Internalname ;
   private String edtavHdr2_Internalname ;
   private String AV98Hdr3 ;
   private String edtavHdr3_Internalname ;
   private String AV99Hdr4 ;
   private String edtavHdr4_Internalname ;
   private String AV100Hdr5 ;
   private String edtavHdr5_Internalname ;
   private String AV101Hdr6 ;
   private String edtavHdr6_Internalname ;
   private String AV102Hdr7 ;
   private String edtavHdr7_Internalname ;
   private String AV103Hdr8 ;
   private String edtavHdr8_Internalname ;
   private String AV104Hdr9 ;
   private String edtavHdr9_Internalname ;
   private String AV78Hdr10 ;
   private String edtavHdr10_Internalname ;
   private String AV79Hdr11 ;
   private String edtavHdr11_Internalname ;
   private String AV80Hdr12 ;
   private String edtavHdr12_Internalname ;
   private String AV81Hdr13 ;
   private String edtavHdr13_Internalname ;
   private String AV82Hdr14 ;
   private String edtavHdr14_Internalname ;
   private String AV83Hdr15 ;
   private String edtavHdr15_Internalname ;
   private String AV84Hdr16 ;
   private String edtavHdr16_Internalname ;
   private String AV85Hdr17 ;
   private String edtavHdr17_Internalname ;
   private String AV86Hdr18 ;
   private String edtavHdr18_Internalname ;
   private String AV87Hdr19 ;
   private String edtavHdr19_Internalname ;
   private String AV89Hdr20 ;
   private String edtavHdr20_Internalname ;
   private String AV90Hdr21 ;
   private String edtavHdr21_Internalname ;
   private String AV91Hdr22 ;
   private String edtavHdr22_Internalname ;
   private String AV92Hdr23 ;
   private String edtavHdr23_Internalname ;
   private String AV93Hdr24 ;
   private String edtavHdr24_Internalname ;
   private String AV94Hdr25 ;
   private String edtavHdr25_Internalname ;
   private String AV95Hdr26 ;
   private String edtavHdr26_Internalname ;
   private String AV96Hdr27 ;
   private String edtavHdr27_Internalname ;
   private String AV97Hdr28 ;
   private String edtavHdr28_Internalname ;
   private String AV112Linea1 ;
   private String edtavLinea1_Internalname ;
   private String AV123Linea2 ;
   private String edtavLinea2_Internalname ;
   private String AV133Linea3 ;
   private String edtavLinea3_Internalname ;
   private String AV134Linea4 ;
   private String edtavLinea4_Internalname ;
   private String AV135Linea5 ;
   private String edtavLinea5_Internalname ;
   private String AV136Linea6 ;
   private String edtavLinea6_Internalname ;
   private String AV137Linea7 ;
   private String edtavLinea7_Internalname ;
   private String AV138LInea8 ;
   private String edtavLinea8_Internalname ;
   private String AV139Linea9 ;
   private String edtavLinea9_Internalname ;
   private String AV113Linea10 ;
   private String edtavLinea10_Internalname ;
   private String AV114Linea11 ;
   private String edtavLinea11_Internalname ;
   private String AV115Linea12 ;
   private String edtavLinea12_Internalname ;
   private String AV116Linea13 ;
   private String edtavLinea13_Internalname ;
   private String AV117Linea14 ;
   private String edtavLinea14_Internalname ;
   private String AV118Linea15 ;
   private String edtavLinea15_Internalname ;
   private String AV119Linea16 ;
   private String edtavLinea16_Internalname ;
   private String AV120Linea17 ;
   private String edtavLinea17_Internalname ;
   private String AV121Linea18 ;
   private String edtavLinea18_Internalname ;
   private String AV122Linea19 ;
   private String edtavLinea19_Internalname ;
   private String AV124Linea20 ;
   private String edtavLinea20_Internalname ;
   private String AV125Linea21 ;
   private String edtavLinea21_Internalname ;
   private String AV126Linea22 ;
   private String edtavLinea22_Internalname ;
   private String AV127Linea23 ;
   private String edtavLinea23_Internalname ;
   private String AV128Linea24 ;
   private String edtavLinea24_Internalname ;
   private String AV129Linea25 ;
   private String edtavLinea25_Internalname ;
   private String AV130Linea26 ;
   private String edtavLinea26_Internalname ;
   private String AV131Linea27 ;
   private String edtavLinea27_Internalname ;
   private String AV132Linea28 ;
   private String edtavLinea28_Internalname ;
   private String AV268OpGrid ;
   private String AV105Hdrgrid ;
   private String edtavHdrgrid_Internalname ;
   private String AV9BarAgrestgrid ;
   private String edtavBaragrestgrid_Internalname ;
   private String edtavMaccod_Internalname ;
   private String AV53CliNomgrid ;
   private String edtavClinomgrid_Internalname ;
   private String AV25BarEnccligrid ;
   private String edtavBarenccligrid_Internalname ;
   private String AV22BarcolNomgrid ;
   private String edtavBarcolnomgrid_Internalname ;
   private String AV44BarserGrid ;
   private String edtavBarsergrid_Internalname ;
   private String AV43BarSerDscgrid ;
   private String edtavBarserdscgrid_Internalname ;
   private String AV387Barnomcligrid1 ;
   private String edtavBarnomcligrid1_Internalname ;
   private String edtavBarkgsgrid_Internalname ;
   private String edtavRectotkgmgrid_Internalname ;
   private String edtavBarfecgengrid_Internalname ;
   private String edtavBarfecfprgrid_Internalname ;
   private String edtavBarsitgrid_Internalname ;
   private String edtavMsgcontrol_Internalname ;
   private String AV336Station ;
   private String AV63EmprNom ;
   private String AV350UsurCod ;
   private String AV49Carpeta ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char7[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private String GXv_char10[] ;
   private String GXv_char11[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private String GXv_char14[] ;
   private String GXv_char15[] ;
   private String GXv_char16[] ;
   private String GXv_char17[] ;
   private String GXv_char18[] ;
   private String GXv_char19[] ;
   private String GXv_char20[] ;
   private String GXv_char21[] ;
   private String GXv_char22[] ;
   private String GXv_char23[] ;
   private String GXv_char24[] ;
   private String GXv_char25[] ;
   private String GXv_char26[] ;
   private String GXv_char27[] ;
   private String GXv_char28[] ;
   private String GXv_char29[] ;
   private String GXv_char30[] ;
   private String GXv_char31[] ;
   private String GXv_char32[] ;
   private String GXv_char33[] ;
   private String GXv_char34[] ;
   private String GXv_char35[] ;
   private String GXv_char36[] ;
   private String GXv_char37[] ;
   private String GXv_char38[] ;
   private String GXv_char39[] ;
   private String GXv_char40[] ;
   private String GXv_char41[] ;
   private String GXv_char42[] ;
   private String GXv_char43[] ;
   private String GXv_char44[] ;
   private String GXv_char45[] ;
   private String GXv_char46[] ;
   private String GXv_char47[] ;
   private String GXv_char48[] ;
   private String GXv_char49[] ;
   private String GXv_char50[] ;
   private String GXv_char51[] ;
   private String GXv_char52[] ;
   private String GXv_char53[] ;
   private String GXv_char54[] ;
   private String edtavHdr1_Title ;
   private String edtavHdr2_Title ;
   private String edtavHdr3_Title ;
   private String edtavHdr4_Title ;
   private String edtavHdr5_Title ;
   private String edtavHdr6_Title ;
   private String edtavHdr7_Title ;
   private String edtavHdr8_Title ;
   private String edtavHdr9_Title ;
   private String edtavHdr10_Title ;
   private String edtavHdr11_Title ;
   private String edtavHdr12_Title ;
   private String edtavHdr13_Title ;
   private String edtavHdr14_Title ;
   private String edtavHdr15_Title ;
   private String edtavHdr16_Title ;
   private String edtavHdr17_Title ;
   private String edtavHdr18_Title ;
   private String edtavHdr19_Title ;
   private String edtavHdr20_Title ;
   private String edtavHdr21_Title ;
   private String edtavHdr22_Title ;
   private String edtavHdr23_Title ;
   private String edtavHdr24_Title ;
   private String edtavHdr25_Title ;
   private String edtavHdr26_Title ;
   private String edtavHdr27_Title ;
   private String edtavHdr28_Title ;
   private String AV344Texto ;
   private String AV76Hdr ;
   private String AV64EstadoFasegrid ;
   private String AV48Cant ;
   private String AV196MaqCodRc1 ;
   private String AV207MaqCodRc2 ;
   private String AV217MaqCodRc3 ;
   private String AV218MaqCodRc4 ;
   private String AV219MaqCodRc5 ;
   private String AV220MaqCodRc6 ;
   private String AV221MaqCodRc7 ;
   private String AV222MaqCodRc8 ;
   private String AV223MaqCodRc9 ;
   private String AV197MaqCodRc10 ;
   private String AV198MaqCodRc11 ;
   private String AV199MaqCodRc12 ;
   private String AV200MaqCodRc13 ;
   private String AV201MaqCodRc14 ;
   private String AV203MaqCodRc16 ;
   private String AV204MaqCodRc17 ;
   private String AV205MaqCodRc18 ;
   private String AV206MaqCodRc19 ;
   private String AV208MaqCodRc20 ;
   private String AV209MaqCodRc21 ;
   private String AV210MaqCodRc22 ;
   private String AV211MaqCodRc23 ;
   private String AV212MaqCodRc24 ;
   private String AV213MaqCodRc25 ;
   private String AV214MaqCodRc26 ;
   private String AV215MaqCodRc27 ;
   private String AV216MaqCodRc28 ;
   private String AV345Texto_l ;
   private String AV193MaqCodBis ;
   private String AV346Texto1 ;
   private String scmdbuf ;
   private String lV23BarColNomIn ;
   private String AV17Barcodparm ;
   private String AV703Op ;
   private String GXv_char56[] ;
   private String GXv_char55[] ;
   private String GXv_char60[] ;
   private String GXv_char59[] ;
   private String GXv_char58[] ;
   private String AV27BarFacTingrid ;
   private String GXv_char57[] ;
   private String AV106Hdrmngrid ;
   private String AV39Barmaqcodgrid ;
   private String AV40Barnomcligrid ;
   private String AV15barcodpargrid ;
   private String tblTable3_Internalname ;
   private String edtavMsgcontrol_Jsonclick ;
   private String tblTable2_Internalname ;
   private String tblTable1_Internalname ;
   private String sGXsfl_9_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavHdr1_Jsonclick ;
   private String edtavHdr2_Jsonclick ;
   private String edtavHdr3_Jsonclick ;
   private String edtavHdr4_Jsonclick ;
   private String edtavHdr5_Jsonclick ;
   private String edtavHdr6_Jsonclick ;
   private String edtavHdr7_Jsonclick ;
   private String edtavHdr8_Jsonclick ;
   private String edtavHdr9_Jsonclick ;
   private String edtavHdr10_Jsonclick ;
   private String edtavHdr11_Jsonclick ;
   private String edtavHdr12_Jsonclick ;
   private String edtavHdr13_Jsonclick ;
   private String edtavHdr14_Jsonclick ;
   private String edtavHdr15_Jsonclick ;
   private String edtavHdr16_Jsonclick ;
   private String edtavHdr17_Jsonclick ;
   private String edtavHdr18_Jsonclick ;
   private String edtavHdr19_Jsonclick ;
   private String edtavHdr20_Jsonclick ;
   private String edtavHdr21_Jsonclick ;
   private String edtavHdr22_Jsonclick ;
   private String edtavHdr23_Jsonclick ;
   private String edtavHdr24_Jsonclick ;
   private String edtavHdr25_Jsonclick ;
   private String edtavHdr26_Jsonclick ;
   private String edtavHdr27_Jsonclick ;
   private String edtavHdr28_Jsonclick ;
   private String edtavLinea1_Jsonclick ;
   private String edtavLinea2_Jsonclick ;
   private String edtavLinea3_Jsonclick ;
   private String edtavLinea4_Jsonclick ;
   private String edtavLinea5_Jsonclick ;
   private String edtavLinea6_Jsonclick ;
   private String edtavLinea7_Jsonclick ;
   private String edtavLinea8_Jsonclick ;
   private String edtavLinea9_Jsonclick ;
   private String edtavLinea10_Jsonclick ;
   private String edtavLinea11_Jsonclick ;
   private String edtavLinea12_Jsonclick ;
   private String edtavLinea13_Jsonclick ;
   private String edtavLinea14_Jsonclick ;
   private String edtavLinea15_Jsonclick ;
   private String edtavLinea16_Jsonclick ;
   private String edtavLinea17_Jsonclick ;
   private String edtavLinea18_Jsonclick ;
   private String edtavLinea19_Jsonclick ;
   private String edtavLinea20_Jsonclick ;
   private String edtavLinea21_Jsonclick ;
   private String edtavLinea22_Jsonclick ;
   private String edtavLinea23_Jsonclick ;
   private String edtavLinea24_Jsonclick ;
   private String edtavLinea25_Jsonclick ;
   private String edtavLinea26_Jsonclick ;
   private String edtavLinea27_Jsonclick ;
   private String edtavLinea28_Jsonclick ;
   private String sGXsfl_71_fel_idx="0001" ;
   private String subGridhdrs_Class ;
   private String subGridhdrs_Linesclass ;
   private String ClassString ;
   private String StyleString ;
   private String GXCCtl ;
   private String edtavHdrgrid_Jsonclick ;
   private String edtavBaragrestgrid_Jsonclick ;
   private String edtavMaccod_Jsonclick ;
   private String edtavClinomgrid_Jsonclick ;
   private String edtavBarenccligrid_Jsonclick ;
   private String edtavBarcolnomgrid_Jsonclick ;
   private String edtavBarsergrid_Jsonclick ;
   private String edtavBarserdscgrid_Jsonclick ;
   private String edtavBarnomcligrid1_Jsonclick ;
   private String edtavBarkgsgrid_Jsonclick ;
   private String edtavRectotkgmgrid_Jsonclick ;
   private String edtavBarfecgengrid_Jsonclick ;
   private String edtavBarfecfprgrid_Jsonclick ;
   private String edtavBarsitgrid_Jsonclick ;
   private String subGridhdrs_Header ;
   private String subGrid_Header ;
   private java.util.Date AV70FecInicio ;
   private java.util.Date AV69FechaFin ;
   private java.util.Date AV67Fec2 ;
   private java.util.Date AV66Fec1 ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date AV35Barfecgengrid ;
   private java.util.Date AV34barfecfprgrid ;
   private java.util.Date AV68fecha ;
   private java.util.Date GXv_date68[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n252CliCod ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_9_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean bGXsfl_71_Refreshing=false ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean n219BarTotAgr ;
   private String AV256Maquinastxt ;
   private String AV255MaquinasHdrstxt ;
   private String AV699MsgControl ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebGrid GridhdrsContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebRow GridhdrsRow ;
   private com.genexus.webpanels.GXWebColumn GridhdrsColumn ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.util.GXFile AV5Archivo ;
   private ICheckbox chkavOpgrid ;
   private IDataStoreProvider pr_default ;
   private String[] H00AU2_A758ProCod ;
   private byte[] H00AU2_A153BarFasEst ;
   private String[] H00AU2_A150BarFacTin ;
   private String[] H00AU2_A130BarCodPar ;
   private byte[] H00AU2_A132BarCodReo ;
   private int[] H00AU2_A129BarCod ;
   private String[] H00AU2_A396EmprCod ;
   private short[] H00AU2_A194BarOrdLin ;
   private String[] H00AU5_A396EmprCod ;
   private String[] H00AU5_A130BarCodPar ;
   private byte[] H00AU5_A132BarCodReo ;
   private int[] H00AU5_A129BarCod ;
   private String[] H00AU5_A143BarDisNum ;
   private String[] H00AU5_A4812BarEncCli ;
   private String[] H00AU5_A135BarColNom ;
   private int[] H00AU5_A252CliCod ;
   private boolean[] H00AU5_n252CliCod ;
   private java.util.Date[] H00AU5_A159BarFecGen ;
   private String[] H00AU5_A180BarMaqCod ;
   private byte[] H00AU5_A213BarSit ;
   private String[] H00AU5_A120BarAgrEst ;
   private String[] H00AU5_A1652BarSerDsc ;
   private String[] H00AU5_A212BarSer ;
   private int[] H00AU5_A136BarColNum ;
   private String[] H00AU5_A279CliNom ;
   private java.util.Date[] H00AU5_A158BarFecFpr ;
   private String[] H00AU5_A1234BarNomCli ;
   private int[] H00AU5_A361DisCod ;
   private byte[] H00AU5_A218BarTipCol ;
   private long[] H00AU5_A13234BarRGB ;
   private java.math.BigDecimal[] H00AU5_A166BarKgm ;
   private java.math.BigDecimal[] H00AU5_A219BarTotAgr ;
   private boolean[] H00AU5_n219BarTotAgr ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class webrdtoplanificacion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00AU2", "SELECT ProCod, BarFasEst, BarFacTin, BarCodPar, BarCodReo, BarCod, EmprCod, BarOrdLin FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarFasEst < 2) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00AU5", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarDisNum, T1.BarEncCli, T1.BarColNom, T1.CliCod, T1.BarFecGen, T1.BarMaqCod, T1.BarSit, T1.BarAgrEst, T1.BarSerDsc, T1.BarSer, T1.BarColNum, T4.CliNom, T1.BarFecFpr, T1.BarNomCli, T1.DisCod, T1.BarTipCol, T1.BarRGB, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T3.BarTotAgr, 0) AS BarTotAgr FROM (((TXPBARCAD T1 LEFT JOIN (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) WHERE (T1.EmprCod = ? and T1.BarFecGen >= ?) AND (( T1.BarSit < 4 and (rtrim(T1.BarMaqCod) IS NULL AND NOT(T1.BarMaqCod IS NULL))) or ( ( T1.BarSit > 4 and T1.BarSit < 6))) AND (T1.CliCod = ? or (? = 0)) AND (T1.BarColNom like ? or (rtrim(?) IS NULL)) AND (( ( T1.BarEncCli = ? and Not (rtrim(T1.BarEncCli) IS NULL AND NOT(T1.BarEncCli IS NULL))) or ( T1.BarDisNum = ? and (rtrim(T1.BarEncCli) IS NULL AND NOT(T1.BarEncCli IS NULL)))) or (rtrim(?) IS NULL)) AND (T1.BarCod = ? or (? = 0)) AND (T1.BarCodReo = ? or (? = 0)) AND (T1.BarCodPar = ? or (rtrim(?) IS NULL)) AND (T1.BarFecGen <= ?) ORDER BY T1.EmprCod, T1.BarFecGen, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 20);
               ((String[]) buf[6])[0] = rslt.getString(7, 13);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 1);
               ((String[]) buf[13])[0] = rslt.getString(13, 26);
               ((String[]) buf[14])[0] = rslt.getString(14, 16);
               ((int[]) buf[15])[0] = rslt.getInt(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 13);
               ((int[]) buf[19])[0] = rslt.getInt(19);
               ((byte[]) buf[20])[0] = rslt.getByte(20);
               ((long[]) buf[21])[0] = rslt.getLong(21);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 13);
               stmt.setString(6, (String)parms[5], 13);
               stmt.setString(7, (String)parms[6], 20);
               stmt.setString(8, (String)parms[7], 20);
               stmt.setString(9, (String)parms[8], 20);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setString(14, (String)parms[13], 1);
               stmt.setString(15, (String)parms[14], 1);
               stmt.setDate(16, (java.util.Date)parms[15]);
               return;
      }
   }

}

