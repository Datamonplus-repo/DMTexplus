package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class informemoda21_impl extends GXWebReport
{
   public informemoda21_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( ! entryPointCalled )
      {
         AV27EmprCod = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV87clicodfrom = (int)(GXutil.lval( httpContext.GetPar( "clicodfrom"))) ;
            AV88clicodto = (int)(GXutil.lval( httpContext.GetPar( "clicodto"))) ;
            AV8PBarCod = (int)(GXutil.lval( httpContext.GetPar( "PBarCod"))) ;
            AV9PBarCodPar = httpContext.GetPar( "PBarCodPar") ;
            AV10PBarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "PBarCodReo"))) ;
            AV11PColNum = (int)(GXutil.lval( httpContext.GetPar( "PColNum"))) ;
            AV12PColor = httpContext.GetPar( "PColor") ;
            AV13PDisCli = httpContext.GetPar( "PDisCli") ;
            AV14PFecDisCli = localUtil.parseDateParm( httpContext.GetPar( "PFecDisCli")) ;
            AV15PSerie = httpContext.GetPar( "PSerie") ;
            AV16PSitua = (byte)(GXutil.lval( httpContext.GetPar( "PSitua"))) ;
            AV17UBarCod = (int)(GXutil.lval( httpContext.GetPar( "UBarCod"))) ;
            AV18UBarCodPar = httpContext.GetPar( "UBarCodPar") ;
            AV19UBarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "UBarCodReo"))) ;
            AV20UColNum = (int)(GXutil.lval( httpContext.GetPar( "UColNum"))) ;
            AV21UColor = httpContext.GetPar( "UColor") ;
            AV22UDisCli = httpContext.GetPar( "UDisCli") ;
            AV23UFecDisCli = localUtil.parseDateParm( httpContext.GetPar( "UFecDisCli")) ;
            AV24USerie = httpContext.GetPar( "USerie") ;
            AV25USitua = (byte)(GXutil.lval( httpContext.GetPar( "USitua"))) ;
            AV48PfecEnt = localUtil.parseDateParm( httpContext.GetPar( "PfecEnt")) ;
            AV49UfecEnt = localUtil.parseDateParm( httpContext.GetPar( "UfecEnt")) ;
            AV59PSerDsc = httpContext.GetPar( "PSerDsc") ;
            AV60USerDsc = httpContext.GetPar( "USerDsc") ;
            AV63NomClii = httpContext.GetPar( "NomClii") ;
            AV64NomClif = httpContext.GetPar( "NomClif") ;
            AV65NumClii = (int)(GXutil.lval( httpContext.GetPar( "NumClii"))) ;
            AV66NumClif = (int)(GXutil.lval( httpContext.GetPar( "NumClif"))) ;
            AV71bartipart1 = (short)(GXutil.lval( httpContext.GetPar( "bartipart1"))) ;
            AV72bartipart2 = (short)(GXutil.lval( httpContext.GetPar( "bartipart2"))) ;
            AV80Barcolnomin = httpContext.GetPar( "Barcolnomin") ;
            AV82Norma = httpContext.GetPar( "Norma") ;
            AV81Trati = httpContext.GetPar( "Trati") ;
            AV26ImpCod = httpContext.GetPar( "ImpCod") ;
            AV92barfecgenfrom = localUtil.parseDateParm( httpContext.GetPar( "barfecgenfrom")) ;
            AV93barfecgento = localUtil.parseDateParm( httpContext.GetPar( "barfecgento")) ;
            AV94barfecsalfrom = localUtil.parseDateParm( httpContext.GetPar( "barfecsalfrom")) ;
            AV95barfecsalto = localUtil.parseDateParm( httpContext.GetPar( "barfecsalto")) ;
            AV89Cod_idtx = httpContext.GetPar( "Cod_idtx") ;
            AV90BarGirar = httpContext.GetPar( "BarGirar") ;
            AV91muestras = httpContext.GetPar( "muestras") ;
         }
      }
      if ( toggleJsOutput )
      {
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      M_top = 0 ;
      M_bot = 1 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName("") ;
      try
      {
         Gx_out = "SCR" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 9, 11909, 16834, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*1)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         GXt_char1 = AV31Lit0 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
         informemoda21_impl.this.GXt_char1 = GXv_char2[0] ;
         AV31Lit0 = GXt_char1 ;
         GXt_char1 = AV32Lit1 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
         informemoda21_impl.this.GXt_char1 = GXv_char2[0] ;
         AV32Lit1 = GXt_char1 ;
         GXt_char1 = AV33Lit2 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN241_", ""), (byte)(99), GXv_char2) ;
         informemoda21_impl.this.GXt_char1 = GXv_char2[0] ;
         AV33Lit2 = GXt_char1 ;
         GXt_char1 = AV34Lit3 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
         informemoda21_impl.this.GXt_char1 = GXv_char2[0] ;
         AV34Lit3 = GXt_char1 ;
         GXt_char1 = AV35Lit4 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN420_", ""), (byte)(99), GXv_char2) ;
         informemoda21_impl.this.GXt_char1 = GXv_char2[0] ;
         AV35Lit4 = GXt_char1 ;
         GXt_char1 = AV36Lit5 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
         informemoda21_impl.this.GXt_char1 = GXv_char2[0] ;
         AV36Lit5 = GXt_char1 ;
         GXt_char1 = AV37Lit6 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN436_", ""), (byte)(99), GXv_char2) ;
         informemoda21_impl.this.GXt_char1 = GXv_char2[0] ;
         AV37Lit6 = GXt_char1 ;
         GXt_char1 = AV38Lit7 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2167_", ""), (byte)(99), GXv_char2) ;
         informemoda21_impl.this.GXt_char1 = GXv_char2[0] ;
         AV38Lit7 = GXt_char1 ;
         GXt_char1 = AV39Lit8 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN428_", ""), (byte)(99), GXv_char2) ;
         informemoda21_impl.this.GXt_char1 = GXv_char2[0] ;
         AV39Lit8 = GXt_char1 ;
         GXt_char1 = AV40Lit9 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
         informemoda21_impl.this.GXt_char1 = GXv_char2[0] ;
         AV40Lit9 = GXt_char1 ;
         GXt_char1 = AV41Lit10 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char2) ;
         informemoda21_impl.this.GXt_char1 = GXv_char2[0] ;
         AV41Lit10 = GXt_char1 ;
         GXt_char1 = AV42Lit11 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN244_", ""), (byte)(99), GXv_char2) ;
         informemoda21_impl.this.GXt_char1 = GXv_char2[0] ;
         AV42Lit11 = GXt_char1 ;
         GXt_char1 = AV43Lit12 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN442_", ""), (byte)(99), GXv_char2) ;
         informemoda21_impl.this.GXt_char1 = GXv_char2[0] ;
         AV43Lit12 = GXt_char1 ;
         GXt_char1 = AV44Lit13 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN430_", ""), (byte)(99), GXv_char2) ;
         informemoda21_impl.this.GXt_char1 = GXv_char2[0] ;
         AV44Lit13 = GXt_char1 ;
         GXt_char1 = AV45Lit14 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN484_", ""), (byte)(99), GXv_char2) ;
         informemoda21_impl.this.GXt_char1 = GXv_char2[0] ;
         AV45Lit14 = GXt_char1 ;
         GXt_char1 = AV46Lit15 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2515_", ""), (byte)(99), GXv_char2) ;
         informemoda21_impl.this.GXt_char1 = GXv_char2[0] ;
         AV46Lit15 = GXt_char1 ;
         GXt_char1 = AV47Lit16 ;
         GXv_char2[0] = GXt_char1 ;
         new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT1351_", ""), (byte)(99), GXv_char2) ;
         informemoda21_impl.this.GXt_char1 = GXv_char2[0] ;
         AV47Lit16 = GXt_char1 ;
         AV69Texto_d = httpContext.getMessage( "O.S.", "") ;
         /* Using cursor P0AQM2 */
         pr_default.execute(0, new Object[] {AV27EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A396EmprCod = P0AQM2_A396EmprCod[0] ;
            A407EmprNom = P0AQM2_A407EmprNom[0] ;
            n407EmprNom = P0AQM2_n407EmprNom[0] ;
            AV30NomEmp = A407EmprNom ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV107LastClicod = 0 ;
         GxHdr3 = true ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV13PDisCli ,
                                              AV22UDisCli ,
                                              Integer.valueOf(AV87clicodfrom) ,
                                              Integer.valueOf(AV88clicodto) ,
                                              Byte.valueOf(AV16PSitua) ,
                                              Byte.valueOf(AV25USitua) ,
                                              AV92barfecgenfrom ,
                                              AV93barfecgento ,
                                              AV94barfecsalfrom ,
                                              AV95barfecsalto ,
                                              AV14PFecDisCli ,
                                              AV23UFecDisCli ,
                                              AV48PfecEnt ,
                                              AV49UfecEnt ,
                                              AV15PSerie ,
                                              AV24USerie ,
                                              AV12PColor ,
                                              AV21UColor ,
                                              Integer.valueOf(AV11PColNum) ,
                                              Integer.valueOf(AV20UColNum) ,
                                              AV63NomClii ,
                                              AV64NomClif ,
                                              Integer.valueOf(AV65NumClii) ,
                                              Integer.valueOf(AV66NumClif) ,
                                              Short.valueOf(AV71bartipart1) ,
                                              Short.valueOf(AV72bartipart2) ,
                                              Integer.valueOf(AV8PBarCod) ,
                                              Integer.valueOf(AV17UBarCod) ,
                                              Byte.valueOf(AV10PBarCodReo) ,
                                              Byte.valueOf(AV19UBarCodReo) ,
                                              AV9PBarCodPar ,
                                              AV18UBarCodPar ,
                                              AV89Cod_idtx ,
                                              AV90BarGirar ,
                                              AV91muestras ,
                                              A14324CP_BARDISN ,
                                              Integer.valueOf(A14326CP_CLICOD) ,
                                              Byte.valueOf(A14307CP_BARSIT) ,
                                              A14308CP_BARFECG ,
                                              A14310CP_BARFECS ,
                                              A14309CP_BARFECC ,
                                              A14304CP_BARFECF ,
                                              A14311CP_BARSER ,
                                              A14331CP_BARCOLO ,
                                              Integer.valueOf(A14332CP_BARCOLU) ,
                                              A14315CP_BARNOMC ,
                                              Integer.valueOf(A14305CP_BARNUMC) ,
                                              Short.valueOf(A14316CP_BARTIPA) ,
                                              Integer.valueOf(A14301CP_BARCOD) ,
                                              Byte.valueOf(A14302CP_BARCODR) ,
                                              A14303CP_BARCODP ,
                                              A14323CP_BARPROP ,
                                              A14317CP_BARGIRA ,
                                              A14306CP_BARPLF ,
                                              AV27EmprCod ,
                                              A14328CP_EMPRCOD } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         /* Using cursor P0AQM3 */
         pr_default.execute(1, new Object[] {AV27EmprCod, AV13PDisCli, AV22UDisCli, Integer.valueOf(AV87clicodfrom), Integer.valueOf(AV88clicodto), Byte.valueOf(AV16PSitua), Byte.valueOf(AV25USitua), AV92barfecgenfrom, AV93barfecgento, AV94barfecsalfrom, AV95barfecsalto, AV14PFecDisCli, AV23UFecDisCli, AV48PfecEnt, AV49UfecEnt, AV15PSerie, AV24USerie, AV12PColor, AV21UColor, Integer.valueOf(AV11PColNum), Integer.valueOf(AV20UColNum), AV63NomClii, AV64NomClif, Integer.valueOf(AV65NumClii), Integer.valueOf(AV66NumClif), Short.valueOf(AV71bartipart1), Short.valueOf(AV72bartipart2), Integer.valueOf(AV8PBarCod), Integer.valueOf(AV17UBarCod), Byte.valueOf(AV10PBarCodReo), Byte.valueOf(AV19UBarCodReo), AV9PBarCodPar, AV18UBarCodPar, AV89Cod_idtx, AV90BarGirar, AV91muestras});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A14306CP_BARPLF = P0AQM3_A14306CP_BARPLF[0] ;
            A14317CP_BARGIRA = P0AQM3_A14317CP_BARGIRA[0] ;
            A14323CP_BARPROP = P0AQM3_A14323CP_BARPROP[0] ;
            A14303CP_BARCODP = P0AQM3_A14303CP_BARCODP[0] ;
            A14302CP_BARCODR = P0AQM3_A14302CP_BARCODR[0] ;
            A14301CP_BARCOD = P0AQM3_A14301CP_BARCOD[0] ;
            A14316CP_BARTIPA = P0AQM3_A14316CP_BARTIPA[0] ;
            A14305CP_BARNUMC = P0AQM3_A14305CP_BARNUMC[0] ;
            A14315CP_BARNOMC = P0AQM3_A14315CP_BARNOMC[0] ;
            A14332CP_BARCOLU = P0AQM3_A14332CP_BARCOLU[0] ;
            A14331CP_BARCOLO = P0AQM3_A14331CP_BARCOLO[0] ;
            A14311CP_BARSER = P0AQM3_A14311CP_BARSER[0] ;
            A14304CP_BARFECF = P0AQM3_A14304CP_BARFECF[0] ;
            A14309CP_BARFECC = P0AQM3_A14309CP_BARFECC[0] ;
            A14310CP_BARFECS = P0AQM3_A14310CP_BARFECS[0] ;
            A14308CP_BARFECG = P0AQM3_A14308CP_BARFECG[0] ;
            A14307CP_BARSIT = P0AQM3_A14307CP_BARSIT[0] ;
            A14326CP_CLICOD = P0AQM3_A14326CP_CLICOD[0] ;
            A14324CP_BARDISN = P0AQM3_A14324CP_BARDISN[0] ;
            A14328CP_EMPRCOD = P0AQM3_A14328CP_EMPRCOD[0] ;
            A14336CP_BARKGM = P0AQM3_A14336CP_BARKGM[0] ;
            A14339CP_BARALBK = P0AQM3_A14339CP_BARALBK[0] ;
            A14338CP_BARPIE = P0AQM3_A14338CP_BARPIE[0] ;
            A14297CP_ID = P0AQM3_A14297CP_ID[0] ;
            AV100CliCod = A14326CP_CLICOD ;
            GXt_char1 = AV101clinom ;
            GXv_char2[0] = GXt_char1 ;
            new app.pclinom(remoteHandle, context).execute( A14328CP_EMPRCOD, A14326CP_CLICOD, GXv_char2) ;
            informemoda21_impl.this.GXt_char1 = GXv_char2[0] ;
            AV101clinom = GXt_char1 ;
            if ( AV107LastClicod != A14326CP_CLICOD )
            {
               if ( AV107LastClicod > 0 )
               {
                  hAQM0( false, 49) ;
                  getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV121totkec, "ZZZZZZ9.99")), 735, Gx_line+17, 809, Gx_line+35, 2+256, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV122totksc, "ZZZZZZ9.99")), 810, Gx_line+17, 884, Gx_line+35, 2+256, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+49) ;
                  AV121totkec = DecimalUtil.doubleToDec(0) ;
                  AV122totksc = DecimalUtil.doubleToDec(0) ;
                  hAQM0( false, 43) ;
                  getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101clinom, "")), 183, Gx_line+14, 403, Gx_line+31, 0, 0, 0, 0) ;
                  getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV100CliCod), "ZZZZZ9")), 125, Gx_line+14, 170, Gx_line+31, 2, 0, 0, 0) ;
                  getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
                  getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit5, "")), 25, Gx_line+14, 114, Gx_line+31, 0, 0, 0, 0) ;
                  Gx_OldLine = Gx_line ;
                  Gx_line = (int)(Gx_line+43) ;
               }
            }
            AV77Hdr = GXutil.trim( GXutil.str( A14301CP_BARCOD, 8, 0)) + "-" + GXutil.str( A14302CP_BARCODR, 1, 0) + A14303CP_BARCODP ;
            AV50KgsS = DecimalUtil.doubleToDec(0) ;
            AV52AlbProCod = 0 ;
            AV53AlbProFch = GXutil.nullDate() ;
            AV73Barcod = A14301CP_BARCOD ;
            AV75Barcodreo = A14302CP_BARCODR ;
            AV74barcodpar = A14303CP_BARCODP ;
            /* Execute user subroutine: 'ALBAR0' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               getPrinter().GxEndPage() ;
               /* Close printer file */
               getPrinter().GxEndDocument() ;
               endPrinter();
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV102bardisnum = A14324CP_BARDISN ;
            AV103barfeccli = A14309CP_BARFECC ;
            AV108BarFecfpr = A14304CP_BARFECF ;
            AV109BarFecsal = A14310CP_BARFECS ;
            AV77Hdr = GXutil.trim( GXutil.str( A14301CP_BARCOD, 8, 0)) + "-" + GXutil.str( A14302CP_BARCODR, 1, 0) + A14303CP_BARCODP ;
            AV56Barser10 = GXutil.substring( A14311CP_BARSER, 1, 10) ;
            AV62BarColNom = A14331CP_BARCOLO ;
            AV110barnomcli = A14315CP_BARNOMC ;
            AV105barcolnum = A14332CP_BARCOLU ;
            AV57BarKgm = A14336CP_BARKGM ;
            AV50KgsS = A14339CP_BARALBK ;
            AV106barsit = A14307CP_BARSIT ;
            GXt_char1 = AV111BarFasCod ;
            GXv_char2[0] = GXt_char1 ;
            new app.pget_barfascod(remoteHandle, context).execute( A14328CP_EMPRCOD, A14301CP_BARCOD, A14302CP_BARCODR, A14303CP_BARCODP, GXv_char2) ;
            informemoda21_impl.this.GXt_char1 = GXv_char2[0] ;
            AV111BarFasCod = GXt_char1 ;
            GXt_int3 = AV52AlbProCod ;
            GXv_int4[0] = GXt_int3 ;
            new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A14328CP_EMPRCOD, A14301CP_BARCOD, A14302CP_BARCODR, A14303CP_BARCODP, GXv_int4) ;
            informemoda21_impl.this.GXt_int3 = GXv_int4[0] ;
            AV52AlbProCod = GXt_int3 ;
            AV51PorMerma = (short)(0) ;
            AV58Lam = GXutil.space( (short)(1)) ;
            AV57BarKgm = A14336CP_BARKGM ;
            AV79BarPie = A14338CP_BARPIE ;
            AV57BarKgm = ((A14336CP_BARKGM.doubleValue()==0)&&(AV78Samofil==0) ? DecimalUtil.doubleToDec(0) : AV57BarKgm) ;
            GXt_char1 = AV86Color ;
            GXv_char2[0] = A14328CP_EMPRCOD ;
            GXv_int5[0] = A14301CP_BARCOD ;
            GXv_int6[0] = A14302CP_BARCODR ;
            GXv_char7[0] = A14303CP_BARCODP ;
            GXv_char8[0] = GXt_char1 ;
            new app.pnortt(remoteHandle, context).execute( GXv_char2, GXv_int5, GXv_int6, GXv_char7, GXv_char8) ;
            informemoda21_impl.this.A14328CP_EMPRCOD = GXv_char2[0] ;
            informemoda21_impl.this.A14301CP_BARCOD = GXv_int5[0] ;
            informemoda21_impl.this.A14302CP_BARCODR = GXv_int6[0] ;
            informemoda21_impl.this.A14303CP_BARCODP = GXv_char7[0] ;
            informemoda21_impl.this.GXt_char1 = GXv_char8[0] ;
            AV86Color = GXt_char1 ;
            if ( ( AV57BarKgm.doubleValue() > 0 ) && ( AV50KgsS.doubleValue() > 0 ) && ( A14307CP_BARSIT >= 9 ) )
            {
               AV51PorMerma = (short)(DecimalUtil.decToDouble(((AV50KgsS.subtract(AV57BarKgm)).divide(AV57BarKgm, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)))) ;
            }
            AV56Barser10 = GXutil.substring( A14311CP_BARSER, 1, 10) ;
            AV62BarColNom = A14331CP_BARCOLO ;
            AV68barFecGen = A14308CP_BARFECG ;
            hAQM0( false, 18) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV56Barser10, "")), 308, Gx_line+0, 382, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV62BarColNom, "")), 592, Gx_line+0, 688, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV57BarKgm, "ZZZZZ9.99")), 742, Gx_line+0, 809, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV68barFecGen, "99/99/99"), 150, Gx_line+0, 209, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV50KgsS, "ZZZZZ9.99")), 817, Gx_line+0, 884, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV51PorMerma), "ZZ9")), 892, Gx_line+0, 915, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV52AlbProCod), "ZZZZZZZZZ9")), 925, Gx_line+0, 999, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(localUtil.format( AV53AlbProFch, "99/99/99"), 1008, Gx_line+0, 1067, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV77Hdr, "")), 217, Gx_line+0, 297, Gx_line+17, 0, 0, 0, 0) ;
            getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV102bardisnum, "")), 17, Gx_line+0, 76, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(localUtil.format( AV103barfeccli, "99/99/99"), 83, Gx_line+0, 142, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV104barserdsc, "")), 392, Gx_line+0, 583, Gx_line+17, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV105barcolnum), "ZZZZZ9")), 692, Gx_line+0, 737, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV106barsit), "Z9")), 1134, Gx_line+0, 1150, Gx_line+17, 2+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV111BarFasCod, "")), 1071, Gx_line+0, 1130, Gx_line+17, 0+256, 0, 0, 0) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+18) ;
            AV121totkec = AV121totkec.add(AV57BarKgm) ;
            AV122totksc = AV122totksc.add(AV50KgsS) ;
            AV54TotKE = AV54TotKE.add(AV57BarKgm) ;
            AV55TotKS = AV55TotKS.add(AV50KgsS) ;
            AV107LastClicod = A14326CP_CLICOD ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         GxHdr3 = false ;
         hAQM0( false, 49) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV121totkec, "ZZZZZZ9.99")), 735, Gx_line+17, 809, Gx_line+35, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV122totksc, "ZZZZZZ9.99")), 810, Gx_line+17, 884, Gx_line+35, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+49) ;
         hAQM0( false, 23) ;
         getPrinter().GxAttris("Courier New", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV54TotKE, "ZZZZZ9.99")), 742, Gx_line+5, 809, Gx_line+23, 2+256, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( AV55TotKS, "ZZZZZ9.99")), 817, Gx_line+5, 884, Gx_line+23, 2+256, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+23) ;
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         hAQM0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      if ( httpContext.willRedirect( ) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'ALBAR0' Routine */
      returnInSub = false ;
      AV53AlbProFch = GXutil.nullDate() ;
      /* Using cursor P0AQM4 */
      pr_default.execute(2, new Object[] {AV27EmprCod, Integer.valueOf(AV73Barcod), Byte.valueOf(AV75Barcodreo), AV74barcodpar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A30AlbProCod = P0AQM4_A30AlbProCod[0] ;
         A130BarCodPar = P0AQM4_A130BarCodPar[0] ;
         A132BarCodReo = P0AQM4_A132BarCodReo[0] ;
         A129BarCod = P0AQM4_A129BarCod[0] ;
         A396EmprCod = P0AQM4_A396EmprCod[0] ;
         A34AlbProfch = P0AQM4_A34AlbProfch[0] ;
         A34AlbProfch = P0AQM4_A34AlbProfch[0] ;
         AV53AlbProFch = A34AlbProfch ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void hAQM0( boolean bFoot ,
                      int Inc )
   {
      /* Skip the required number of lines */
      while ( ( ToSkip > 0 ) || ( Gx_line + Inc > P_lines ) )
      {
         if ( Gx_line + Inc >= P_lines )
         {
            if ( Gx_page > 0 )
            {
               /* Print footers */
               Gx_line = P_lines ;
               getPrinter().GxEndPage() ;
               if ( bFoot )
               {
                  return  ;
               }
            }
            ToSkip = 0 ;
            Gx_line = 0 ;
            Gx_page = (int)(Gx_page+1) ;
            /* Skip Margin Top Lines */
            Gx_line = (int)(Gx_line+(M_top*lineHeight)) ;
            /* Print headers */
            getPrinter().GxStartPage() ;
            getPrinter().setPage(Gx_page);
            if ( GxHdr3 )
            {
               getPrinter().GxAttris("Microsoft Sans Serif", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV30NomEmp, "")), 7, Gx_line+17, 258, Gx_line+39, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV31Lit0, "")), 786, Gx_line+20, 850, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(localUtil.format( Gx_date, "99/99/99"), 855, Gx_line+20, 914, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( Gx_time, "")), 919, Gx_line+20, 1020, Gx_line+37, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 12, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV33Lit2, "")), 7, Gx_line+50, 250, Gx_line+72, 0+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV34Lit3, "")), 925, Gx_line+50, 1001, Gx_line+67, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(Gx_page), "ZZZZZ9")), 976, Gx_line+50, 1027, Gx_line+67, 2+256, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 8, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Encomenda", ""), 15, Gx_line+118, 85, Gx_line+132, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 15, Gx_line+136, 57, Gx_line+150, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data Enc", ""), 89, Gx_line+118, 145, Gx_line+132, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cliente", ""), 96, Gx_line+136, 138, Gx_line+150, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 168, Gx_line+118, 197, Gx_line+132, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ordem S.", ""), 216, Gx_line+136, 271, Gx_line+150, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Artigo", ""), 308, Gx_line+136, 343, Gx_line+150, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Cor", ""), 592, Gx_line+136, 613, Gx_line+150, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Numero", ""), 691, Gx_line+136, 737, Gx_line+150, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Quilos ", ""), 767, Gx_line+118, 809, Gx_line+132, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Entrados", ""), 756, Gx_line+136, 809, Gx_line+150, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Quilos ", ""), 827, Gx_line+118, 869, Gx_line+132, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Saidos", ""), 828, Gx_line+136, 869, Gx_line+150, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Quebra", ""), 872, Gx_line+136, 916, Gx_line+150, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText("%", 882, Gx_line+118, 892, Gx_line+132, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Guia", ""), 960, Gx_line+136, 988, Gx_line+150, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawLine(5, Gx_line+74, 1146, Gx_line+74, 2, 0, 0, 0, 0) ;
               getPrinter().GxDrawLine(8, Gx_line+152, 1149, Gx_line+152, 1, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Data", ""), 1008, Gx_line+118, 1037, Gx_line+132, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Guia", ""), 1008, Gx_line+136, 1036, Gx_line+150, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "S", ""), 1141, Gx_line+136, 1150, Gx_line+150, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Fase", ""), 1073, Gx_line+136, 1102, Gx_line+150, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(httpContext.getMessage( "Ultima", ""), 1069, Gx_line+118, 1106, Gx_line+132, 0+256, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV69Texto_d, "")), 153, Gx_line+135, 211, Gx_line+149, 1, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+155) ;
               getPrinter().GxAttris("Courier New", 9, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV101clinom, "")), 183, Gx_line+14, 403, Gx_line+31, 0, 0, 0, 0) ;
               getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV100CliCod), "ZZZZZ9")), 125, Gx_line+14, 170, Gx_line+31, 2, 0, 0, 0) ;
               getPrinter().GxAttris("Microsoft Sans Serif", 9, true, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
               getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV36Lit5, "")), 25, Gx_line+14, 114, Gx_line+31, 0, 0, 0, 0) ;
               Gx_OldLine = Gx_line ;
               Gx_line = (int)(Gx_line+43) ;
            }
            if (true) break;
         }
         else
         {
            PrtOffset = 0 ;
            Gx_line = (int)(Gx_line+1) ;
         }
         ToSkip = (int)(ToSkip-1) ;
      }
      getPrinter().setPage(Gx_page);
   }

   public void add_metrics( )
   {
      add_metrics0( ) ;
      add_metrics1( ) ;
      add_metrics2( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("Courier New", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("Courier New", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics2( )
   {
      getPrinter().setMetrics("Microsoft Sans Serif", true, false, 57, 15, 72, 163,  new int[] {47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 19, 29, 34, 34, 55, 45, 15, 21, 21, 24, 36, 17, 21, 17, 17, 34, 34, 34, 34, 34, 34, 34, 34, 34, 34, 21, 21, 36, 36, 36, 38, 60, 43, 45, 45, 45, 41, 38, 48, 45, 17, 34, 45, 38, 53, 45, 48, 41, 48, 45, 41, 38, 45, 41, 57, 41, 41, 38, 21, 17, 21, 36, 34, 21, 34, 38, 34, 38, 34, 21, 38, 38, 17, 17, 34, 17, 55, 38, 38, 38, 38, 24, 34, 21, 38, 33, 49, 34, 34, 31, 24, 17, 24, 36, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 47, 17, 21, 34, 34, 34, 34, 17, 34, 21, 46, 23, 34, 36, 21, 46, 34, 25, 34, 21, 21, 21, 36, 34, 21, 20, 21, 23, 34, 52, 52, 52, 38, 45, 45, 45, 45, 45, 45, 62, 45, 41, 41, 41, 41, 17, 17, 17, 17, 45, 45, 48, 48, 48, 48, 48, 36, 48, 45, 45, 45, 45, 41, 41, 38, 34, 34, 34, 34, 34, 34, 55, 34, 34, 34, 34, 34, 17, 17, 17, 17, 38, 38, 38, 38, 38, 38, 38, 34, 38, 38, 38, 38, 38, 34, 38, 34}) ;
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected java.io.OutputStream getOutputStream( )
   {
      return httpContext.getOutputStream();
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
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV27EmprCod = "" ;
      AV9PBarCodPar = "" ;
      AV12PColor = "" ;
      AV13PDisCli = "" ;
      AV14PFecDisCli = GXutil.nullDate() ;
      AV15PSerie = "" ;
      AV18UBarCodPar = "" ;
      AV21UColor = "" ;
      AV22UDisCli = "" ;
      AV23UFecDisCli = GXutil.nullDate() ;
      AV24USerie = "" ;
      AV48PfecEnt = GXutil.nullDate() ;
      AV49UfecEnt = GXutil.nullDate() ;
      AV59PSerDsc = "" ;
      AV60USerDsc = "" ;
      AV63NomClii = "" ;
      AV64NomClif = "" ;
      AV80Barcolnomin = "" ;
      AV82Norma = "" ;
      AV81Trati = "" ;
      AV26ImpCod = "" ;
      AV92barfecgenfrom = GXutil.nullDate() ;
      AV93barfecgento = GXutil.nullDate() ;
      AV94barfecsalfrom = GXutil.nullDate() ;
      AV95barfecsalto = GXutil.nullDate() ;
      AV89Cod_idtx = "" ;
      AV90BarGirar = "" ;
      AV91muestras = "" ;
      AV31Lit0 = "" ;
      AV32Lit1 = "" ;
      AV33Lit2 = "" ;
      AV34Lit3 = "" ;
      AV35Lit4 = "" ;
      AV36Lit5 = "" ;
      AV37Lit6 = "" ;
      AV38Lit7 = "" ;
      AV39Lit8 = "" ;
      AV40Lit9 = "" ;
      AV41Lit10 = "" ;
      AV42Lit11 = "" ;
      AV43Lit12 = "" ;
      AV44Lit13 = "" ;
      AV45Lit14 = "" ;
      AV46Lit15 = "" ;
      AV47Lit16 = "" ;
      AV69Texto_d = "" ;
      scmdbuf = "" ;
      P0AQM2_A396EmprCod = new String[] {""} ;
      P0AQM2_A407EmprNom = new String[] {""} ;
      P0AQM2_n407EmprNom = new boolean[] {false} ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      AV30NomEmp = "" ;
      A14324CP_BARDISN = "" ;
      A14308CP_BARFECG = GXutil.nullDate() ;
      A14310CP_BARFECS = GXutil.nullDate() ;
      A14309CP_BARFECC = GXutil.nullDate() ;
      A14304CP_BARFECF = GXutil.nullDate() ;
      A14311CP_BARSER = "" ;
      A14331CP_BARCOLO = "" ;
      A14315CP_BARNOMC = "" ;
      A14303CP_BARCODP = "" ;
      A14323CP_BARPROP = "" ;
      A14317CP_BARGIRA = "" ;
      A14306CP_BARPLF = "" ;
      A14328CP_EMPRCOD = "" ;
      P0AQM3_A14306CP_BARPLF = new String[] {""} ;
      P0AQM3_A14317CP_BARGIRA = new String[] {""} ;
      P0AQM3_A14323CP_BARPROP = new String[] {""} ;
      P0AQM3_A14303CP_BARCODP = new String[] {""} ;
      P0AQM3_A14302CP_BARCODR = new byte[1] ;
      P0AQM3_A14301CP_BARCOD = new int[1] ;
      P0AQM3_A14316CP_BARTIPA = new short[1] ;
      P0AQM3_A14305CP_BARNUMC = new int[1] ;
      P0AQM3_A14315CP_BARNOMC = new String[] {""} ;
      P0AQM3_A14332CP_BARCOLU = new int[1] ;
      P0AQM3_A14331CP_BARCOLO = new String[] {""} ;
      P0AQM3_A14311CP_BARSER = new String[] {""} ;
      P0AQM3_A14304CP_BARFECF = new java.util.Date[] {GXutil.nullDate()} ;
      P0AQM3_A14309CP_BARFECC = new java.util.Date[] {GXutil.nullDate()} ;
      P0AQM3_A14310CP_BARFECS = new java.util.Date[] {GXutil.nullDate()} ;
      P0AQM3_A14308CP_BARFECG = new java.util.Date[] {GXutil.nullDate()} ;
      P0AQM3_A14307CP_BARSIT = new byte[1] ;
      P0AQM3_A14326CP_CLICOD = new int[1] ;
      P0AQM3_A14324CP_BARDISN = new String[] {""} ;
      P0AQM3_A14328CP_EMPRCOD = new String[] {""} ;
      P0AQM3_A14336CP_BARKGM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AQM3_A14339CP_BARALBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AQM3_A14338CP_BARPIE = new int[1] ;
      P0AQM3_A14297CP_ID = new long[1] ;
      A14336CP_BARKGM = DecimalUtil.ZERO ;
      A14339CP_BARALBK = DecimalUtil.ZERO ;
      AV101clinom = "" ;
      AV121totkec = DecimalUtil.ZERO ;
      AV122totksc = DecimalUtil.ZERO ;
      AV77Hdr = "" ;
      AV50KgsS = DecimalUtil.ZERO ;
      AV53AlbProFch = GXutil.nullDate() ;
      AV74barcodpar = "" ;
      AV102bardisnum = "" ;
      AV103barfeccli = GXutil.nullDate() ;
      AV108BarFecfpr = GXutil.nullDate() ;
      AV109BarFecsal = GXutil.nullDate() ;
      AV56Barser10 = "" ;
      AV62BarColNom = "" ;
      AV110barnomcli = "" ;
      AV57BarKgm = DecimalUtil.ZERO ;
      AV111BarFasCod = "" ;
      GXv_int4 = new long[1] ;
      AV58Lam = "" ;
      AV86Color = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char7 = new String[1] ;
      GXv_char8 = new String[1] ;
      AV68barFecGen = GXutil.nullDate() ;
      AV104barserdsc = "" ;
      AV54TotKE = DecimalUtil.ZERO ;
      AV55TotKS = DecimalUtil.ZERO ;
      P0AQM4_A30AlbProCod = new long[1] ;
      P0AQM4_A130BarCodPar = new String[] {""} ;
      P0AQM4_A132BarCodReo = new byte[1] ;
      P0AQM4_A129BarCod = new int[1] ;
      P0AQM4_A396EmprCod = new String[] {""} ;
      P0AQM4_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      A130BarCodPar = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      Gx_date = GXutil.nullDate() ;
      Gx_time = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.informemoda21__default(),
         new Object[] {
             new Object[] {
            P0AQM2_A396EmprCod, P0AQM2_A407EmprNom, P0AQM2_n407EmprNom
            }
            , new Object[] {
            P0AQM3_A14306CP_BARPLF, P0AQM3_A14317CP_BARGIRA, P0AQM3_A14323CP_BARPROP, P0AQM3_A14303CP_BARCODP, P0AQM3_A14302CP_BARCODR, P0AQM3_A14301CP_BARCOD, P0AQM3_A14316CP_BARTIPA, P0AQM3_A14305CP_BARNUMC, P0AQM3_A14315CP_BARNOMC, P0AQM3_A14332CP_BARCOLU,
            P0AQM3_A14331CP_BARCOLO, P0AQM3_A14311CP_BARSER, P0AQM3_A14304CP_BARFECF, P0AQM3_A14309CP_BARFECC, P0AQM3_A14310CP_BARFECS, P0AQM3_A14308CP_BARFECG, P0AQM3_A14307CP_BARSIT, P0AQM3_A14326CP_CLICOD, P0AQM3_A14324CP_BARDISN, P0AQM3_A14328CP_EMPRCOD,
            P0AQM3_A14336CP_BARKGM, P0AQM3_A14339CP_BARALBK, P0AQM3_A14338CP_BARPIE, P0AQM3_A14297CP_ID
            }
            , new Object[] {
            P0AQM4_A30AlbProCod, P0AQM4_A130BarCodPar, P0AQM4_A132BarCodReo, P0AQM4_A129BarCod, P0AQM4_A396EmprCod, P0AQM4_A34AlbProfch
            }
         }
      );
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      Gx_time = GXutil.time( ) ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV10PBarCodReo ;
   private byte AV16PSitua ;
   private byte AV19UBarCodReo ;
   private byte AV25USitua ;
   private byte A14307CP_BARSIT ;
   private byte A14302CP_BARCODR ;
   private byte AV75Barcodreo ;
   private byte AV106barsit ;
   private byte AV78Samofil ;
   private byte GXv_int6[] ;
   private byte A132BarCodReo ;
   private short gxcookieaux ;
   private short AV71bartipart1 ;
   private short AV72bartipart2 ;
   private short A14316CP_BARTIPA ;
   private short AV51PorMerma ;
   private short Gx_err ;
   private int AV87clicodfrom ;
   private int AV88clicodto ;
   private int AV8PBarCod ;
   private int AV11PColNum ;
   private int AV17UBarCod ;
   private int AV20UColNum ;
   private int AV65NumClii ;
   private int AV66NumClif ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV107LastClicod ;
   private int A14326CP_CLICOD ;
   private int A14332CP_BARCOLU ;
   private int A14305CP_BARNUMC ;
   private int A14301CP_BARCOD ;
   private int A14338CP_BARPIE ;
   private int AV100CliCod ;
   private int Gx_OldLine ;
   private int AV73Barcod ;
   private int AV105barcolnum ;
   private int AV79BarPie ;
   private int GXv_int5[] ;
   private int A129BarCod ;
   private long A14297CP_ID ;
   private long AV52AlbProCod ;
   private long GXt_int3 ;
   private long GXv_int4[] ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A14336CP_BARKGM ;
   private java.math.BigDecimal A14339CP_BARALBK ;
   private java.math.BigDecimal AV121totkec ;
   private java.math.BigDecimal AV122totksc ;
   private java.math.BigDecimal AV50KgsS ;
   private java.math.BigDecimal AV57BarKgm ;
   private java.math.BigDecimal AV54TotKE ;
   private java.math.BigDecimal AV55TotKS ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV27EmprCod ;
   private String AV9PBarCodPar ;
   private String AV12PColor ;
   private String AV13PDisCli ;
   private String AV15PSerie ;
   private String AV18UBarCodPar ;
   private String AV21UColor ;
   private String AV22UDisCli ;
   private String AV24USerie ;
   private String AV59PSerDsc ;
   private String AV60USerDsc ;
   private String AV63NomClii ;
   private String AV64NomClif ;
   private String AV80Barcolnomin ;
   private String AV82Norma ;
   private String AV81Trati ;
   private String AV26ImpCod ;
   private String AV89Cod_idtx ;
   private String AV90BarGirar ;
   private String AV91muestras ;
   private String AV31Lit0 ;
   private String AV32Lit1 ;
   private String AV33Lit2 ;
   private String AV34Lit3 ;
   private String AV35Lit4 ;
   private String AV36Lit5 ;
   private String AV37Lit6 ;
   private String AV38Lit7 ;
   private String AV39Lit8 ;
   private String AV40Lit9 ;
   private String AV41Lit10 ;
   private String AV42Lit11 ;
   private String AV43Lit12 ;
   private String AV44Lit13 ;
   private String AV45Lit14 ;
   private String AV46Lit15 ;
   private String AV47Lit16 ;
   private String AV69Texto_d ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String AV30NomEmp ;
   private String A14324CP_BARDISN ;
   private String A14311CP_BARSER ;
   private String A14331CP_BARCOLO ;
   private String A14303CP_BARCODP ;
   private String A14323CP_BARPROP ;
   private String A14306CP_BARPLF ;
   private String A14328CP_EMPRCOD ;
   private String AV101clinom ;
   private String AV77Hdr ;
   private String AV74barcodpar ;
   private String AV102bardisnum ;
   private String AV56Barser10 ;
   private String AV62BarColNom ;
   private String AV110barnomcli ;
   private String AV111BarFasCod ;
   private String AV58Lam ;
   private String AV86Color ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char7[] ;
   private String GXv_char8[] ;
   private String AV104barserdsc ;
   private String A130BarCodPar ;
   private String Gx_time ;
   private java.util.Date AV14PFecDisCli ;
   private java.util.Date AV23UFecDisCli ;
   private java.util.Date AV48PfecEnt ;
   private java.util.Date AV49UfecEnt ;
   private java.util.Date AV92barfecgenfrom ;
   private java.util.Date AV93barfecgento ;
   private java.util.Date AV94barfecsalfrom ;
   private java.util.Date AV95barfecsalto ;
   private java.util.Date A14308CP_BARFECG ;
   private java.util.Date A14310CP_BARFECS ;
   private java.util.Date A14309CP_BARFECC ;
   private java.util.Date A14304CP_BARFECF ;
   private java.util.Date AV53AlbProFch ;
   private java.util.Date AV103barfeccli ;
   private java.util.Date AV108BarFecfpr ;
   private java.util.Date AV109BarFecsal ;
   private java.util.Date AV68barFecGen ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date Gx_date ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n407EmprNom ;
   private boolean GxHdr3 ;
   private boolean returnInSub ;
   private String A14315CP_BARNOMC ;
   private String A14317CP_BARGIRA ;
   private IDataStoreProvider pr_default ;
   private String[] P0AQM2_A396EmprCod ;
   private String[] P0AQM2_A407EmprNom ;
   private boolean[] P0AQM2_n407EmprNom ;
   private String[] P0AQM3_A14306CP_BARPLF ;
   private String[] P0AQM3_A14317CP_BARGIRA ;
   private String[] P0AQM3_A14323CP_BARPROP ;
   private String[] P0AQM3_A14303CP_BARCODP ;
   private byte[] P0AQM3_A14302CP_BARCODR ;
   private int[] P0AQM3_A14301CP_BARCOD ;
   private short[] P0AQM3_A14316CP_BARTIPA ;
   private int[] P0AQM3_A14305CP_BARNUMC ;
   private String[] P0AQM3_A14315CP_BARNOMC ;
   private int[] P0AQM3_A14332CP_BARCOLU ;
   private String[] P0AQM3_A14331CP_BARCOLO ;
   private String[] P0AQM3_A14311CP_BARSER ;
   private java.util.Date[] P0AQM3_A14304CP_BARFECF ;
   private java.util.Date[] P0AQM3_A14309CP_BARFECC ;
   private java.util.Date[] P0AQM3_A14310CP_BARFECS ;
   private java.util.Date[] P0AQM3_A14308CP_BARFECG ;
   private byte[] P0AQM3_A14307CP_BARSIT ;
   private int[] P0AQM3_A14326CP_CLICOD ;
   private String[] P0AQM3_A14324CP_BARDISN ;
   private String[] P0AQM3_A14328CP_EMPRCOD ;
   private java.math.BigDecimal[] P0AQM3_A14336CP_BARKGM ;
   private java.math.BigDecimal[] P0AQM3_A14339CP_BARALBK ;
   private int[] P0AQM3_A14338CP_BARPIE ;
   private long[] P0AQM3_A14297CP_ID ;
   private long[] P0AQM4_A30AlbProCod ;
   private String[] P0AQM4_A130BarCodPar ;
   private byte[] P0AQM4_A132BarCodReo ;
   private int[] P0AQM4_A129BarCod ;
   private String[] P0AQM4_A396EmprCod ;
   private java.util.Date[] P0AQM4_A34AlbProfch ;
}

final  class informemoda21__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AQM3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV13PDisCli ,
                                          String AV22UDisCli ,
                                          int AV87clicodfrom ,
                                          int AV88clicodto ,
                                          byte AV16PSitua ,
                                          byte AV25USitua ,
                                          java.util.Date AV92barfecgenfrom ,
                                          java.util.Date AV93barfecgento ,
                                          java.util.Date AV94barfecsalfrom ,
                                          java.util.Date AV95barfecsalto ,
                                          java.util.Date AV14PFecDisCli ,
                                          java.util.Date AV23UFecDisCli ,
                                          java.util.Date AV48PfecEnt ,
                                          java.util.Date AV49UfecEnt ,
                                          String AV15PSerie ,
                                          String AV24USerie ,
                                          String AV12PColor ,
                                          String AV21UColor ,
                                          int AV11PColNum ,
                                          int AV20UColNum ,
                                          String AV63NomClii ,
                                          String AV64NomClif ,
                                          int AV65NumClii ,
                                          int AV66NumClif ,
                                          short AV71bartipart1 ,
                                          short AV72bartipart2 ,
                                          int AV8PBarCod ,
                                          int AV17UBarCod ,
                                          byte AV10PBarCodReo ,
                                          byte AV19UBarCodReo ,
                                          String AV9PBarCodPar ,
                                          String AV18UBarCodPar ,
                                          String AV89Cod_idtx ,
                                          String AV90BarGirar ,
                                          String AV91muestras ,
                                          String A14324CP_BARDISN ,
                                          int A14326CP_CLICOD ,
                                          byte A14307CP_BARSIT ,
                                          java.util.Date A14308CP_BARFECG ,
                                          java.util.Date A14310CP_BARFECS ,
                                          java.util.Date A14309CP_BARFECC ,
                                          java.util.Date A14304CP_BARFECF ,
                                          String A14311CP_BARSER ,
                                          String A14331CP_BARCOLO ,
                                          int A14332CP_BARCOLU ,
                                          String A14315CP_BARNOMC ,
                                          int A14305CP_BARNUMC ,
                                          short A14316CP_BARTIPA ,
                                          int A14301CP_BARCOD ,
                                          byte A14302CP_BARCODR ,
                                          String A14303CP_BARCODP ,
                                          String A14323CP_BARPROP ,
                                          String A14317CP_BARGIRA ,
                                          String A14306CP_BARPLF ,
                                          String AV27EmprCod ,
                                          String A14328CP_EMPRCOD )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[36];
      Object[] GXv_Object10 = new Object[2];
      scmdbuf = "SELECT CP_BARPLF, CP_BARGIRA, CP_BARPROP, CP_BARCODP, CP_BARCODR, CP_BARCOD, CP_BARTIPA, CP_BARNUMC, CP_BARNOMC, CP_BARCOLU, CP_BARCOLO, CP_BARSER, CP_BARFECF, CP_BARFECC," ;
      scmdbuf += " CP_BARFECS, CP_BARFECG, CP_BARSIT, CP_CLICOD, CP_BARDISN, CP_EMPRCOD, CP_BARKGM, CP_BARALBK, CP_BARPIE, CP_ID FROM TXPCONPRO" ;
      addWhere(sWhereString, "(CP_EMPRCOD = ?)");
      if ( ! (GXutil.strcmp("", AV13PDisCli)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN >= ?)");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV22UDisCli)==0) )
      {
         addWhere(sWhereString, "(CP_BARDISN <= ?)");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! (0==AV87clicodfrom) )
      {
         addWhere(sWhereString, "(CP_CLICOD >= ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! (0==AV88clicodto) )
      {
         addWhere(sWhereString, "(CP_CLICOD <= ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! (0==AV16PSitua) )
      {
         addWhere(sWhereString, "(CP_BARSIT >= ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( ! (0==AV25USitua) )
      {
         addWhere(sWhereString, "(CP_BARSIT <= ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92barfecgenfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECG >= ?)");
      }
      else
      {
         GXv_int9[7] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV93barfecgento)) )
      {
         addWhere(sWhereString, "(CP_BARFECG <= ?)");
      }
      else
      {
         GXv_int9[8] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV94barfecsalfrom)) )
      {
         addWhere(sWhereString, "(CP_BARFECS >= ?)");
      }
      else
      {
         GXv_int9[9] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV95barfecsalto)) )
      {
         addWhere(sWhereString, "(CP_BARFECS <= ?)");
      }
      else
      {
         GXv_int9[10] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV14PFecDisCli)) )
      {
         addWhere(sWhereString, "(CP_BARFECC >= ?)");
      }
      else
      {
         GXv_int9[11] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV23UFecDisCli)) )
      {
         addWhere(sWhereString, "(CP_BARFECC <= ?)");
      }
      else
      {
         GXv_int9[12] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV48PfecEnt)) )
      {
         addWhere(sWhereString, "(CP_BARFECF >= ?)");
      }
      else
      {
         GXv_int9[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV49UfecEnt)) )
      {
         addWhere(sWhereString, "(CP_BARFECF <= ?)");
      }
      else
      {
         GXv_int9[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15PSerie)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER >= ?)");
      }
      else
      {
         GXv_int9[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV24USerie)==0) )
      {
         addWhere(sWhereString, "(CP_BARSER <= ?)");
      }
      else
      {
         GXv_int9[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12PColor)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO >= ?)");
      }
      else
      {
         GXv_int9[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV21UColor)==0) )
      {
         addWhere(sWhereString, "(CP_BARCOLO <= ?)");
      }
      else
      {
         GXv_int9[18] = (byte)(1) ;
      }
      if ( ! (0==AV11PColNum) )
      {
         addWhere(sWhereString, "(CP_BARCOLU >= ?)");
      }
      else
      {
         GXv_int9[19] = (byte)(1) ;
      }
      if ( ! (0==AV20UColNum) )
      {
         addWhere(sWhereString, "(CP_BARCOLU <= ?)");
      }
      else
      {
         GXv_int9[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV63NomClii)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC >= ?)");
      }
      else
      {
         GXv_int9[21] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV64NomClif)==0) )
      {
         addWhere(sWhereString, "(CP_BARNOMC <= ?)");
      }
      else
      {
         GXv_int9[22] = (byte)(1) ;
      }
      if ( ! (0==AV65NumClii) )
      {
         addWhere(sWhereString, "(CP_BARNUMC >= ?)");
      }
      else
      {
         GXv_int9[23] = (byte)(1) ;
      }
      if ( ! (0==AV66NumClif) )
      {
         addWhere(sWhereString, "(CP_BARNUMC <= ?)");
      }
      else
      {
         GXv_int9[24] = (byte)(1) ;
      }
      if ( ! (0==AV71bartipart1) )
      {
         addWhere(sWhereString, "(CP_BARTIPA >= ?)");
      }
      else
      {
         GXv_int9[25] = (byte)(1) ;
      }
      if ( ! (0==AV72bartipart2) )
      {
         addWhere(sWhereString, "(CP_BARTIPA <= ?)");
      }
      else
      {
         GXv_int9[26] = (byte)(1) ;
      }
      if ( ! (0==AV8PBarCod) )
      {
         addWhere(sWhereString, "(CP_BARCOD >= ?)");
      }
      else
      {
         GXv_int9[27] = (byte)(1) ;
      }
      if ( ! (0==AV17UBarCod) )
      {
         addWhere(sWhereString, "(CP_BARCOD <= ?)");
      }
      else
      {
         GXv_int9[28] = (byte)(1) ;
      }
      if ( ! (0==AV10PBarCodReo) )
      {
         addWhere(sWhereString, "(CP_BARCODR >= ?)");
      }
      else
      {
         GXv_int9[29] = (byte)(1) ;
      }
      if ( ! (0==AV19UBarCodReo) )
      {
         addWhere(sWhereString, "(CP_BARCODR <= ?)");
      }
      else
      {
         GXv_int9[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9PBarCodPar)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP >= ?)");
      }
      else
      {
         GXv_int9[31] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV18UBarCodPar)==0) )
      {
         addWhere(sWhereString, "(CP_BARCODP <= ?)");
      }
      else
      {
         GXv_int9[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV89Cod_idtx)==0) )
      {
         addWhere(sWhereString, "(CP_BARPROP = ?)");
      }
      else
      {
         GXv_int9[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90BarGirar)==0) )
      {
         addWhere(sWhereString, "(CP_BARGIRA = ?)");
      }
      else
      {
         GXv_int9[34] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91muestras)==0) )
      {
         addWhere(sWhereString, "(CP_BARPLF = ?)");
      }
      else
      {
         GXv_int9[35] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY CP_EMPRCOD, CP_CLICOD, CP_BARDISN" ;
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 1 :
                  return conditional_P0AQM3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (java.util.Date)dynConstraints[6] , (java.util.Date)dynConstraints[7] , (java.util.Date)dynConstraints[8] , (java.util.Date)dynConstraints[9] , (java.util.Date)dynConstraints[10] , (java.util.Date)dynConstraints[11] , (java.util.Date)dynConstraints[12] , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , ((Number) dynConstraints[24]).shortValue() , ((Number) dynConstraints[25]).shortValue() , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , ((Number) dynConstraints[29]).byteValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() , ((Number) dynConstraints[37]).byteValue() , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (java.util.Date)dynConstraints[40] , (java.util.Date)dynConstraints[41] , (String)dynConstraints[42] , (String)dynConstraints[43] , ((Number) dynConstraints[44]).intValue() , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).shortValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).byteValue() , (String)dynConstraints[50] , (String)dynConstraints[51] , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AQM2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P0AQM3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AQM4", "SELECT T1.AlbProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.AlbProfch FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getVarchar(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(15);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(16);
               ((byte[]) buf[16])[0] = rslt.getByte(17);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 8);
               ((String[]) buf[19])[0] = rslt.getString(20, 3);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(22,2);
               ((int[]) buf[22])[0] = rslt.getInt(23);
               ((long[]) buf[23])[0] = rslt.getLong(24);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 8);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 8);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[43]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[44]);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[45]);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[48]);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[49]);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[50]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 13);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 13);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[59]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[60]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[61]).shortValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[62]).shortValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[66]).byteValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 1);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 1);
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[69], 4);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 20);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

