package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class peliho2 extends GXProcedure
{
   public peliho2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( peliho2.class ), "" );
   }

   public peliho2( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 )
   {
      peliho2.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      peliho2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      peliho2.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      peliho2.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      peliho2.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      peliho2.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV17SiRemito ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SIREMI", ""), GXv_int2) ;
      peliho2.this.GXt_int1 = GXv_int2[0] ;
      AV17SiRemito = GXt_int1 ;
      /* Using cursor P008Y2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1261BarAlbKgmE = P008Y2_A1261BarAlbKgmE[0] ;
         A1263BarAlbMtrE = P008Y2_A1263BarAlbMtrE[0] ;
         A1265BarAlbPie = P008Y2_A1265BarAlbPie[0] ;
         A1458BarAlbBul = P008Y2_A1458BarAlbBul[0] ;
         A1266BarAlbTub = P008Y2_A1266BarAlbTub[0] ;
         A5019AlbHdrgm2 = P008Y2_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P008Y2_A3271AlbHdrAnc[0] ;
         A2396BarAlbObs = P008Y2_A2396BarAlbObs[0] ;
         A2763AlbHdrUlin = P008Y2_A2763AlbHdrUlin[0] ;
         A1248GuiFasULin = P008Y2_A1248GuiFasULin[0] ;
         A1262BarPreKgm = P008Y2_A1262BarPreKgm[0] ;
         A1264BarPreMtr = P008Y2_A1264BarPreMtr[0] ;
         /* Using cursor P008Y3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A212BarSer = P008Y3_A212BarSer[0] ;
         A1652BarSerDsc = P008Y3_A1652BarSerDsc[0] ;
         A135BarColNom = P008Y3_A135BarColNom[0] ;
         A136BarColNum = P008Y3_A136BarColNum[0] ;
         A218BarTipCol = P008Y3_A218BarTipCol[0] ;
         A1234BarNomCli = P008Y3_A1234BarNomCli[0] ;
         A1235BarNumCli = P008Y3_A1235BarNumCli[0] ;
         A4812BarEncCli = P008Y3_A4812BarEncCli[0] ;
         A213BarSit = P008Y3_A213BarSit[0] ;
         A161BarFecSal = P008Y3_A161BarFecSal[0] ;
         W396EmprCod = A396EmprCod ;
         W30AlbProCod = A30AlbProCod ;
         /* Using cursor P008Y4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A205BarPieMet = P008Y4_A205BarPieMet[0] ;
            A200BarPieCod = P008Y4_A200BarPieCod[0] ;
            GXv_char3[0] = A396EmprCod ;
            GXv_int4[0] = A30AlbProCod ;
            GXv_int5[0] = A129BarCod ;
            GXv_int2[0] = A132BarCodReo ;
            GXv_char6[0] = A130BarCodPar ;
            GXv_char7[0] = A200BarPieCod ;
            new app.pelipie(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_int2, GXv_char6, GXv_char7) ;
            peliho2.this.A396EmprCod = GXv_char3[0] ;
            peliho2.this.A30AlbProCod = GXv_int4[0] ;
            peliho2.this.A129BarCod = GXv_int5[0] ;
            peliho2.this.A132BarCodReo = GXv_int2[0] ;
            peliho2.this.A130BarCodPar = GXv_char6[0] ;
            peliho2.this.A200BarPieCod = GXv_char7[0] ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         if ( AV17SiRemito == 1 )
         {
            /*
               INSERT RECORD ON TABLE TXPDLT001

            */
            W396EmprCod = A396EmprCod ;
            W30AlbProCod = A30AlbProCod ;
            A12176DltHdr = A129BarCod ;
            A12177DltR = A132BarCodReo ;
            A12178DltP = A130BarCodPar ;
            A12145DltKgs = A1261BarAlbKgmE ;
            n12145DltKgs = false ;
            A12146DltMts = A1263BarAlbMtrE ;
            n12146DltMts = false ;
            A12147DltPzs = A1265BarAlbPie ;
            n12147DltPzs = false ;
            A12148DltBultos = A1458BarAlbBul ;
            n12148DltBultos = false ;
            A12149DltTubos = A1266BarAlbTub ;
            n12149DltTubos = false ;
            A12150DltArtCod = A212BarSer ;
            n12150DltArtCod = false ;
            A12151DltArtDsc = A1652BarSerDsc ;
            n12151DltArtDsc = false ;
            A12152DltColNom = A135BarColNom ;
            n12152DltColNom = false ;
            A12153DltColNum = A136BarColNum ;
            n12153DltColNum = false ;
            A12154DltTc = A218BarTipCol ;
            n12154DltTc = false ;
            A12155DltColClNm = A1234BarNomCli ;
            n12155DltColClNm = false ;
            A12156DltColClNr = A1235BarNumCli ;
            n12156DltColClNr = false ;
            A12157DltGrm2 = A5019AlbHdrgm2 ;
            n12157DltGrm2 = false ;
            A12158DltAnc = A3271AlbHdrAnc ;
            n12158DltAnc = false ;
            A12159DltAlbObs = A2396BarAlbObs ;
            n12159DltAlbObs = false ;
            A12160DltUltTxt = A2763AlbHdrUlin ;
            n12160DltUltTxt = false ;
            A12161DltUltFs = A1248GuiFasULin ;
            n12161DltUltFs = false ;
            A12163DltPreKg = A1262BarPreKgm ;
            n12163DltPreKg = false ;
            A12164DltPreMt = A1264BarPreMtr ;
            n12164DltPreMt = false ;
            A12162DltEncCli = A4812BarEncCli ;
            n12162DltEncCli = false ;
            /* Using cursor P008Y5 */
            pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, Boolean.valueOf(n12145DltKgs), A12145DltKgs, Boolean.valueOf(n12146DltMts), A12146DltMts, Boolean.valueOf(n12147DltPzs), Integer.valueOf(A12147DltPzs), Boolean.valueOf(n12148DltBultos), Short.valueOf(A12148DltBultos), Boolean.valueOf(n12149DltTubos), Integer.valueOf(A12149DltTubos), Boolean.valueOf(n12150DltArtCod), A12150DltArtCod, Boolean.valueOf(n12151DltArtDsc), A12151DltArtDsc, Boolean.valueOf(n12152DltColNom), A12152DltColNom, Boolean.valueOf(n12153DltColNum), Integer.valueOf(A12153DltColNum), Boolean.valueOf(n12154DltTc), Byte.valueOf(A12154DltTc), Boolean.valueOf(n12155DltColClNm), A12155DltColClNm, Boolean.valueOf(n12156DltColClNr), Integer.valueOf(A12156DltColClNr), Boolean.valueOf(n12157DltGrm2), Short.valueOf(A12157DltGrm2), Boolean.valueOf(n12158DltAnc), Short.valueOf(A12158DltAnc), Boolean.valueOf(n12159DltAlbObs), A12159DltAlbObs, Boolean.valueOf(n12160DltUltTxt), Short.valueOf(A12160DltUltTxt), Boolean.valueOf(n12161DltUltFs), Short.valueOf(A12161DltUltFs), Boolean.valueOf(n12162DltEncCli), A12162DltEncCli, Boolean.valueOf(n12163DltPreKg), A12163DltPreKg, Boolean.valueOf(n12164DltPreMt), A12164DltPreMt});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDLT001");
            if ( (pr_default.getStatus(3) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A396EmprCod = W396EmprCod ;
            A30AlbProCod = W30AlbProCod ;
            /* End Insert */
         }
         /* Using cursor P008Y6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         if ( A213BarSit == 9 )
         {
            A213BarSit = (byte)(6) ;
         }
         GXv_char7[0] = A396EmprCod ;
         GXv_int5[0] = A129BarCod ;
         GXv_int2[0] = A132BarCodReo ;
         GXv_char6[0] = A130BarCodPar ;
         GXv_date8[0] = AV15FecSal ;
         GXv_int9[0] = AV16ExisteHDR ;
         new app.pfchalb(remoteHandle, context).execute( GXv_char7, GXv_int5, GXv_int2, GXv_char6, GXv_date8, GXv_int9) ;
         peliho2.this.A396EmprCod = GXv_char7[0] ;
         peliho2.this.A129BarCod = GXv_int5[0] ;
         peliho2.this.A132BarCodReo = GXv_int2[0] ;
         peliho2.this.A130BarCodPar = GXv_char6[0] ;
         peliho2.this.AV15FecSal = GXv_date8[0] ;
         peliho2.this.AV16ExisteHDR = GXv_int9[0] ;
         if ( AV16ExisteHDR == 0 )
         {
            A161BarFecSal = GXutil.nullDate() ;
         }
         else
         {
            A161BarFecSal = AV15FecSal ;
         }
         /* Using cursor P008Y7 */
         pr_default.execute(5, new Object[] {Byte.valueOf(A213BarSit), A161BarFecSal, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         A396EmprCod = W396EmprCod ;
         A30AlbProCod = W30AlbProCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      pr_default.close(1);
      /* Optimized DELETE. */
      /* Using cursor P008Y8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBPRD");
      /* End optimized DELETE. */
      /* Using cursor P008Y9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A1240GuiFasLin = P008Y9_A1240GuiFasLin[0] ;
         A1275FasKgm = P008Y9_A1275FasKgm[0] ;
         A1276FasMtr = P008Y9_A1276FasMtr[0] ;
         W396EmprCod = A396EmprCod ;
         W30AlbProCod = A30AlbProCod ;
         if ( AV17SiRemito == 1 )
         {
            /*
               INSERT RECORD ON TABLE TXPDLT004

            */
            W396EmprCod = A396EmprCod ;
            W30AlbProCod = A30AlbProCod ;
            A12176DltHdr = A129BarCod ;
            A12177DltR = A132BarCodReo ;
            A12178DltP = A130BarCodPar ;
            A12182DltLin = A1240GuiFasLin ;
            A12174DltKgsFs = A1275FasKgm ;
            n12174DltKgsFs = false ;
            A12175DltMtsFs = A1276FasMtr ;
            n12175DltMtsFs = false ;
            /* Using cursor P008Y10 */
            pr_default.execute(8, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A12176DltHdr), Byte.valueOf(A12177DltR), A12178DltP, Short.valueOf(A12182DltLin), Boolean.valueOf(n12174DltKgsFs), A12174DltKgsFs, Boolean.valueOf(n12175DltMtsFs), A12175DltMtsFs});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDLT004");
            if ( (pr_default.getStatus(8) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A396EmprCod = W396EmprCod ;
            A30AlbProCod = W30AlbProCod ;
            /* End Insert */
         }
         /* Using cursor P008Y11 */
         pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
         A396EmprCod = W396EmprCod ;
         A30AlbProCod = W30AlbProCod ;
         pr_default.readNext(7);
      }
      pr_default.close(7);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = peliho2.this.A396EmprCod;
      this.aP1[0] = peliho2.this.A30AlbProCod;
      this.aP2[0] = peliho2.this.A129BarCod;
      this.aP3[0] = peliho2.this.A132BarCodReo;
      this.aP4[0] = peliho2.this.A130BarCodPar;
      Application.commitDataStores(context, remoteHandle, pr_default, "peliho2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P008Y2_A396EmprCod = new String[] {""} ;
      P008Y2_A30AlbProCod = new long[1] ;
      P008Y2_A129BarCod = new int[1] ;
      P008Y2_A132BarCodReo = new byte[1] ;
      P008Y2_A130BarCodPar = new String[] {""} ;
      P008Y2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008Y2_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008Y2_A1265BarAlbPie = new int[1] ;
      P008Y2_A1458BarAlbBul = new short[1] ;
      P008Y2_A1266BarAlbTub = new int[1] ;
      P008Y2_A5019AlbHdrgm2 = new short[1] ;
      P008Y2_A3271AlbHdrAnc = new short[1] ;
      P008Y2_A2396BarAlbObs = new String[] {""} ;
      P008Y2_A2763AlbHdrUlin = new short[1] ;
      P008Y2_A1248GuiFasULin = new short[1] ;
      P008Y2_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008Y2_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A2396BarAlbObs = "" ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      P008Y3_A212BarSer = new String[] {""} ;
      P008Y3_A1652BarSerDsc = new String[] {""} ;
      P008Y3_A135BarColNom = new String[] {""} ;
      P008Y3_A136BarColNum = new int[1] ;
      P008Y3_A218BarTipCol = new byte[1] ;
      P008Y3_A1234BarNomCli = new String[] {""} ;
      P008Y3_A1235BarNumCli = new int[1] ;
      P008Y3_A4812BarEncCli = new String[] {""} ;
      P008Y3_A213BarSit = new byte[1] ;
      P008Y3_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A4812BarEncCli = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      W396EmprCod = "" ;
      P008Y4_A396EmprCod = new String[] {""} ;
      P008Y4_A129BarCod = new int[1] ;
      P008Y4_A132BarCodReo = new byte[1] ;
      P008Y4_A130BarCodPar = new String[] {""} ;
      P008Y4_A205BarPieMet = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008Y4_A200BarPieCod = new String[] {""} ;
      A205BarPieMet = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new long[1] ;
      A12178DltP = "" ;
      A12145DltKgs = DecimalUtil.ZERO ;
      A12146DltMts = DecimalUtil.ZERO ;
      A12150DltArtCod = "" ;
      A12151DltArtDsc = "" ;
      A12152DltColNom = "" ;
      A12155DltColClNm = "" ;
      A12159DltAlbObs = "" ;
      A12163DltPreKg = DecimalUtil.ZERO ;
      A12164DltPreMt = DecimalUtil.ZERO ;
      A12162DltEncCli = "" ;
      Gx_emsg = "" ;
      GXv_char7 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char6 = new String[1] ;
      AV15FecSal = GXutil.nullDate() ;
      GXv_date8 = new java.util.Date[1] ;
      GXv_int9 = new byte[1] ;
      P008Y9_A396EmprCod = new String[] {""} ;
      P008Y9_A30AlbProCod = new long[1] ;
      P008Y9_A129BarCod = new int[1] ;
      P008Y9_A132BarCodReo = new byte[1] ;
      P008Y9_A130BarCodPar = new String[] {""} ;
      P008Y9_A1240GuiFasLin = new short[1] ;
      P008Y9_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008Y9_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A12174DltKgsFs = DecimalUtil.ZERO ;
      A12175DltMtsFs = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.peliho2__default(),
         new Object[] {
             new Object[] {
            P008Y2_A396EmprCod, P008Y2_A30AlbProCod, P008Y2_A129BarCod, P008Y2_A132BarCodReo, P008Y2_A130BarCodPar, P008Y2_A1261BarAlbKgmE, P008Y2_A1263BarAlbMtrE, P008Y2_A1265BarAlbPie, P008Y2_A1458BarAlbBul, P008Y2_A1266BarAlbTub,
            P008Y2_A5019AlbHdrgm2, P008Y2_A3271AlbHdrAnc, P008Y2_A2396BarAlbObs, P008Y2_A2763AlbHdrUlin, P008Y2_A1248GuiFasULin, P008Y2_A1262BarPreKgm, P008Y2_A1264BarPreMtr
            }
            , new Object[] {
            P008Y3_A212BarSer, P008Y3_A1652BarSerDsc, P008Y3_A135BarColNom, P008Y3_A136BarColNum, P008Y3_A218BarTipCol, P008Y3_A1234BarNomCli, P008Y3_A1235BarNumCli, P008Y3_A4812BarEncCli, P008Y3_A213BarSit, P008Y3_A161BarFecSal
            }
            , new Object[] {
            P008Y4_A396EmprCod, P008Y4_A129BarCod, P008Y4_A132BarCodReo, P008Y4_A130BarCodPar, P008Y4_A205BarPieMet, P008Y4_A200BarPieCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P008Y9_A396EmprCod, P008Y9_A30AlbProCod, P008Y9_A129BarCod, P008Y9_A132BarCodReo, P008Y9_A130BarCodPar, P008Y9_A1240GuiFasLin, P008Y9_A1275FasKgm, P008Y9_A1276FasMtr
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV17SiRemito ;
   private byte GXt_int1 ;
   private byte A218BarTipCol ;
   private byte A213BarSit ;
   private byte A12177DltR ;
   private byte A12154DltTc ;
   private byte GXv_int2[] ;
   private byte AV16ExisteHDR ;
   private byte GXv_int9[] ;
   private short A1458BarAlbBul ;
   private short A5019AlbHdrgm2 ;
   private short A3271AlbHdrAnc ;
   private short A2763AlbHdrUlin ;
   private short A1248GuiFasULin ;
   private short A12148DltBultos ;
   private short A12157DltGrm2 ;
   private short A12158DltAnc ;
   private short A12160DltUltTxt ;
   private short A12161DltUltFs ;
   private short Gx_err ;
   private short A1240GuiFasLin ;
   private short A12182DltLin ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private int A1266BarAlbTub ;
   private int A136BarColNum ;
   private int A1235BarNumCli ;
   private int GX_INS1688 ;
   private int A12176DltHdr ;
   private int A12147DltPzs ;
   private int A12149DltTubos ;
   private int A12153DltColNum ;
   private int A12156DltColClNr ;
   private int GXv_int5[] ;
   private int GX_INS1692 ;
   private long A30AlbProCod ;
   private long W30AlbProCod ;
   private long GXv_int4[] ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A205BarPieMet ;
   private java.math.BigDecimal A12145DltKgs ;
   private java.math.BigDecimal A12146DltMts ;
   private java.math.BigDecimal A12163DltPreKg ;
   private java.math.BigDecimal A12164DltPreMt ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A12174DltKgsFs ;
   private java.math.BigDecimal A12175DltMtsFs ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A2396BarAlbObs ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A4812BarEncCli ;
   private String W396EmprCod ;
   private String A200BarPieCod ;
   private String GXv_char3[] ;
   private String A12178DltP ;
   private String A12150DltArtCod ;
   private String A12151DltArtDsc ;
   private String A12152DltColNom ;
   private String A12155DltColClNm ;
   private String A12159DltAlbObs ;
   private String A12162DltEncCli ;
   private String Gx_emsg ;
   private String GXv_char7[] ;
   private String GXv_char6[] ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date AV15FecSal ;
   private java.util.Date GXv_date8[] ;
   private boolean n12145DltKgs ;
   private boolean n12146DltMts ;
   private boolean n12147DltPzs ;
   private boolean n12148DltBultos ;
   private boolean n12149DltTubos ;
   private boolean n12150DltArtCod ;
   private boolean n12151DltArtDsc ;
   private boolean n12152DltColNom ;
   private boolean n12153DltColNum ;
   private boolean n12154DltTc ;
   private boolean n12155DltColClNm ;
   private boolean n12156DltColClNr ;
   private boolean n12157DltGrm2 ;
   private boolean n12158DltAnc ;
   private boolean n12159DltAlbObs ;
   private boolean n12160DltUltTxt ;
   private boolean n12161DltUltFs ;
   private boolean n12163DltPreKg ;
   private boolean n12164DltPreMt ;
   private boolean n12162DltEncCli ;
   private boolean n12174DltKgsFs ;
   private boolean n12175DltMtsFs ;
   private String[] aP4 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P008Y2_A396EmprCod ;
   private long[] P008Y2_A30AlbProCod ;
   private int[] P008Y2_A129BarCod ;
   private byte[] P008Y2_A132BarCodReo ;
   private String[] P008Y2_A130BarCodPar ;
   private java.math.BigDecimal[] P008Y2_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P008Y2_A1263BarAlbMtrE ;
   private int[] P008Y2_A1265BarAlbPie ;
   private short[] P008Y2_A1458BarAlbBul ;
   private int[] P008Y2_A1266BarAlbTub ;
   private short[] P008Y2_A5019AlbHdrgm2 ;
   private short[] P008Y2_A3271AlbHdrAnc ;
   private String[] P008Y2_A2396BarAlbObs ;
   private short[] P008Y2_A2763AlbHdrUlin ;
   private short[] P008Y2_A1248GuiFasULin ;
   private java.math.BigDecimal[] P008Y2_A1262BarPreKgm ;
   private java.math.BigDecimal[] P008Y2_A1264BarPreMtr ;
   private String[] P008Y3_A212BarSer ;
   private String[] P008Y3_A1652BarSerDsc ;
   private String[] P008Y3_A135BarColNom ;
   private int[] P008Y3_A136BarColNum ;
   private byte[] P008Y3_A218BarTipCol ;
   private String[] P008Y3_A1234BarNomCli ;
   private int[] P008Y3_A1235BarNumCli ;
   private String[] P008Y3_A4812BarEncCli ;
   private byte[] P008Y3_A213BarSit ;
   private java.util.Date[] P008Y3_A161BarFecSal ;
   private String[] P008Y4_A396EmprCod ;
   private int[] P008Y4_A129BarCod ;
   private byte[] P008Y4_A132BarCodReo ;
   private String[] P008Y4_A130BarCodPar ;
   private java.math.BigDecimal[] P008Y4_A205BarPieMet ;
   private String[] P008Y4_A200BarPieCod ;
   private String[] P008Y9_A396EmprCod ;
   private long[] P008Y9_A30AlbProCod ;
   private int[] P008Y9_A129BarCod ;
   private byte[] P008Y9_A132BarCodReo ;
   private String[] P008Y9_A130BarCodPar ;
   private short[] P008Y9_A1240GuiFasLin ;
   private java.math.BigDecimal[] P008Y9_A1275FasKgm ;
   private java.math.BigDecimal[] P008Y9_A1276FasMtr ;
}

final  class peliho2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P008Y2", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarAlbKgmE, BarAlbMtrE, BarAlbPie, BarAlbBul, BarAlbTub, AlbHdrgm2, AlbHdrAnc, BarAlbObs, AlbHdrUlin, GuiFasULin, BarPreKgm, BarPreMtr FROM TXPALBBAR WHERE (EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P008Y3", "SELECT BarSer, BarSerDsc, BarColNom, BarColNum, BarTipCol, BarNomCli, BarNumCli, BarEncCli, BarSit, BarFecSal FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P008Y4", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarPieMet, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008Y5", "INSERT INTO TXPDLT001(EmprCod, AlbProCod, DltHdr, DltR, DltP, DltKgs, DltMts, DltPzs, DltBultos, DltTubos, DltArtCod, DltArtDsc, DltColNom, DltColNum, DltTc, DltColClNm, DltColClNr, DltGrm2, DltAnc, DltAlbObs, DltUltTxt, DltUltFs, DltEncCli, DltPreKg, DltPreMt, DltKgsCli, DltTubo, DltTuboN, DltModCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDLT001")
         ,new UpdateCursor("P008Y6", "DELETE FROM TXPALBBAR  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new UpdateCursor("P008Y7", "UPDATE TXPBARCAD SET BarSit=?, BarFecSal=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P008Y8", "DELETE FROM TXPALBPRD  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBPRD")
         ,new ForEachCursor("P008Y9", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin, FasKgm, FasMtr FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008Y10", "INSERT INTO TXPDLT004(EmprCod, AlbProCod, DltHdr, DltR, DltP, DltLin, DltKgsFs, DltMtsFs, DltFascod, DltFasDsc, DltPrKFs, DltPrMFs, DltPrKBFs, DltPrMBFs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDLT004")
         ,new UpdateCursor("P008Y11", "DELETE FROM TXPALBFAS  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 30);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,5);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(17,5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
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
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 3);
               stmt.setLong(7, ((Number) parms[6]).longValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[6], 2);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[10]).intValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[14]).intValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[16], 16);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[18], 26);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[20], 13);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[22]).intValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[24]).byteValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[26], 13);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(17, ((Number) parms[28]).intValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[30]).shortValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[32]).shortValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[34], 30);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[36]).shortValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(22, ((Number) parms[38]).shortValue());
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[40], 20);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[42], 5);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(25, (java.math.BigDecimal)parms[44], 5);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 5 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 2);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

