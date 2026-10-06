package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pelihte extends GXProcedure
{
   public pelihte( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pelihte.class ), "" );
   }

   public pelihte( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           long[] aP1 ,
                           int[] aP2 ,
                           byte[] aP3 ,
                           String[] aP4 )
   {
      pelihte.this.aP5 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        byte[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             byte[] aP5 )
   {
      pelihte.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pelihte.this.AV22AlbProCod = aP1[0];
      this.aP1 = aP1;
      pelihte.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pelihte.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pelihte.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pelihte.this.AV15Tipo = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV17Flag1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HISEMP", ""), GXv_int1) ;
      pelihte.this.AV17Flag1 = GXv_int1[0] ;
      AV20FlagCra = (byte)(0) ;
      GXv_int1[0] = AV20FlagCra ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CRASA", ""), GXv_int1) ;
      pelihte.this.AV20FlagCra = GXv_int1[0] ;
      AV25FlagBros = (byte)(0) ;
      GXv_int1[0] = AV25FlagBros ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BROS  ", ""), GXv_int1) ;
      pelihte.this.AV25FlagBros = GXv_int1[0] ;
      AV26FlagSalt = (byte)(0) ;
      GXv_int1[0] = AV26FlagSalt ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SALTIN", ""), GXv_int1) ;
      pelihte.this.AV26FlagSalt = GXv_int1[0] ;
      /* Using cursor P01902 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV22AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A396EmprCod, Long.valueOf(AV22AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P01902_A30AlbProCod[0] ;
         A1261BarAlbKgmE = P01902_A1261BarAlbKgmE[0] ;
         A1263BarAlbMtrE = P01902_A1263BarAlbMtrE[0] ;
         A1265BarAlbPie = P01902_A1265BarAlbPie[0] ;
         /* Using cursor P01903 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A365DisDes = P01903_A365DisDes[0] ;
         A361DisCod = P01903_A361DisCod[0] ;
         A213BarSit = P01903_A213BarSit[0] ;
         A161BarFecSal = P01903_A161BarFecSal[0] ;
         /* Using cursor P01905 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(2) != 101) )
         {
            A166BarKgm = P01905_A166BarKgm[0] ;
            n166BarKgm = P01905_n166BarKgm[0] ;
         }
         else
         {
            A166BarKgm = DecimalUtil.doubleToDec(0) ;
            n166BarKgm = false ;
         }
         /* Using cursor P01907 */
         pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(3) != 101) )
         {
            A1269BarAlbPza = P01907_A1269BarAlbPza[0] ;
            n1269BarAlbPza = P01907_n1269BarAlbPza[0] ;
         }
         else
         {
            A1269BarAlbPza = (short)(0) ;
            n1269BarAlbPza = false ;
         }
         AV37BarCod = A129BarCod ;
         AV38BarCodReo = A132BarCodReo ;
         AV39BarCodPar = A130BarCodPar ;
         if ( AV15Tipo == 0 )
         {
            AV16Piezas = A1269BarAlbPza ;
         }
         else
         {
            AV16Piezas = A1265BarAlbPie ;
         }
         if ( AV15Tipo == 0 )
         {
            /* Using cursor P01908 */
            pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A27AlbPKilEnt = P01908_A27AlbPKilEnt[0] ;
               A200BarPieCod = P01908_A200BarPieCod[0] ;
               /* Using cursor P01909 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
               A170BarKilLan = P01909_A170BarKilLan[0] ;
               A183BarMetLan = P01909_A183BarMetLan[0] ;
               A1271BarPieLzd = P01909_A1271BarPieLzd[0] ;
               A201BarPieEst = P01909_A201BarPieEst[0] ;
               A44AlbRecCod = P01909_A44AlbRecCod[0] ;
               if ( AV20FlagCra == 0 )
               {
                  if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
                  {
                     A170BarKilLan = A170BarKilLan.subtract((A1261BarAlbKgmE.divide(DecimalUtil.doubleToDec(AV16Piezas), 18, java.math.RoundingMode.DOWN))) ;
                     A183BarMetLan = A183BarMetLan.subtract((A1263BarAlbMtrE.divide(DecimalUtil.doubleToDec(AV16Piezas), 18, java.math.RoundingMode.DOWN))) ;
                     AV18Kilos = (A1261BarAlbKgmE.divide(DecimalUtil.doubleToDec(AV16Piezas), 18, java.math.RoundingMode.DOWN)) ;
                     AV19Metros = (A1263BarAlbMtrE.divide(DecimalUtil.doubleToDec(AV16Piezas), 18, java.math.RoundingMode.DOWN)) ;
                  }
                  else
                  {
                     A170BarKilLan = A170BarKilLan.subtract(A1261BarAlbKgmE) ;
                     A183BarMetLan = A183BarMetLan.subtract(A1263BarAlbMtrE) ;
                     A1271BarPieLzd = (int)(A1271BarPieLzd-A1265BarAlbPie) ;
                     AV18Kilos = A1261BarAlbKgmE ;
                     AV19Metros = A1263BarAlbMtrE ;
                  }
               }
               A201BarPieEst = (byte)(0) ;
               if ( AV17Flag1 == 1 )
               {
                  GXv_char2[0] = A396EmprCod ;
                  GXv_int3[0] = A361DisCod ;
                  GXv_int4[0] = A44AlbRecCod ;
                  GXv_decimal5[0] = AV18Kilos ;
                  GXv_decimal6[0] = AV19Metros ;
                  GXv_int7[0] = AV16Piezas ;
                  GXv_decimal8[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_int10[0] = 0 ;
                  GXv_char11[0] = httpContext.getMessage( "S", "") ;
                  GXv_char12[0] = "" ;
                  GXv_int13[0] = 0 ;
                  GXv_char14[0] = httpContext.getMessage( "DEL", "") ;
                  GXv_char15[0] = "" ;
                  new app.pmodhis(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int4, GXv_decimal5, GXv_decimal6, GXv_int7, GXv_decimal8, GXv_decimal9, GXv_int10, GXv_char11, GXv_char12, GXv_int13, GXv_char14, GXv_char15) ;
                  pelihte.this.A396EmprCod = GXv_char2[0] ;
                  pelihte.this.A361DisCod = (int)((int)(GXv_int3[0])) ;
                  pelihte.this.A44AlbRecCod = GXv_int4[0] ;
                  pelihte.this.AV18Kilos = GXv_decimal5[0] ;
                  pelihte.this.AV19Metros = GXv_decimal6[0] ;
                  pelihte.this.AV16Piezas = GXv_int7[0] ;
               }
               /* Using cursor P019010 */
               pr_default.execute(6, new Object[] {A170BarKilLan, A183BarMetLan, Integer.valueOf(A1271BarPieLzd), Byte.valueOf(A201BarPieEst), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
               pr_default.readNext(4);
            }
            pr_default.close(4);
            pr_default.close(5);
         }
         else
         {
            /* Using cursor P019011 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A170BarKilLan = P019011_A170BarKilLan[0] ;
               A183BarMetLan = P019011_A183BarMetLan[0] ;
               A1271BarPieLzd = P019011_A1271BarPieLzd[0] ;
               A201BarPieEst = P019011_A201BarPieEst[0] ;
               A44AlbRecCod = P019011_A44AlbRecCod[0] ;
               A200BarPieCod = P019011_A200BarPieCod[0] ;
               if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "S", "")) == 0 )
               {
                  A170BarKilLan = A170BarKilLan.subtract((A1261BarAlbKgmE.divide(DecimalUtil.doubleToDec(AV16Piezas), 18, java.math.RoundingMode.DOWN))) ;
                  A183BarMetLan = A183BarMetLan.subtract((A1263BarAlbMtrE.divide(DecimalUtil.doubleToDec(AV16Piezas), 18, java.math.RoundingMode.DOWN))) ;
                  AV18Kilos = (A1261BarAlbKgmE.divide(DecimalUtil.doubleToDec(AV16Piezas), 18, java.math.RoundingMode.DOWN)) ;
                  AV19Metros = (A1263BarAlbMtrE.divide(DecimalUtil.doubleToDec(AV16Piezas), 18, java.math.RoundingMode.DOWN)) ;
               }
               else
               {
                  A170BarKilLan = A170BarKilLan.subtract(A1261BarAlbKgmE) ;
                  if ( A170BarKilLan.doubleValue() < 0 )
                  {
                     A170BarKilLan = DecimalUtil.doubleToDec(0) ;
                  }
                  A183BarMetLan = A183BarMetLan.subtract(A1263BarAlbMtrE) ;
                  if ( A183BarMetLan.doubleValue() < 0 )
                  {
                     A183BarMetLan = DecimalUtil.doubleToDec(0) ;
                  }
                  A1271BarPieLzd = (int)(A1271BarPieLzd-A1265BarAlbPie) ;
                  if ( A1271BarPieLzd < 0 )
                  {
                     A1271BarPieLzd = 0 ;
                  }
                  AV18Kilos = A1261BarAlbKgmE ;
                  AV19Metros = A1263BarAlbMtrE ;
               }
               A201BarPieEst = (byte)(0) ;
               if ( AV17Flag1 == 1 )
               {
                  GXv_char15[0] = A396EmprCod ;
                  GXv_int3[0] = A361DisCod ;
                  GXv_int13[0] = A44AlbRecCod ;
                  GXv_decimal9[0] = AV18Kilos ;
                  GXv_decimal8[0] = AV19Metros ;
                  GXv_int10[0] = AV16Piezas ;
                  GXv_decimal6[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal5[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_int7[0] = 0 ;
                  GXv_char14[0] = httpContext.getMessage( "S", "") ;
                  GXv_char12[0] = "" ;
                  GXv_int4[0] = 0 ;
                  GXv_char11[0] = httpContext.getMessage( "DEL", "") ;
                  GXv_char2[0] = "" ;
                  new app.pmodhis(remoteHandle, context).execute( GXv_char15, GXv_int3, GXv_int13, GXv_decimal9, GXv_decimal8, GXv_int10, GXv_decimal6, GXv_decimal5, GXv_int7, GXv_char14, GXv_char12, GXv_int4, GXv_char11, GXv_char2) ;
                  pelihte.this.A396EmprCod = GXv_char15[0] ;
                  pelihte.this.A361DisCod = (int)((int)(GXv_int3[0])) ;
                  pelihte.this.A44AlbRecCod = GXv_int13[0] ;
                  pelihte.this.AV18Kilos = GXv_decimal9[0] ;
                  pelihte.this.AV19Metros = GXv_decimal8[0] ;
                  pelihte.this.AV16Piezas = GXv_int10[0] ;
               }
               /* Using cursor P019012 */
               pr_default.execute(8, new Object[] {A170BarKilLan, A183BarMetLan, Integer.valueOf(A1271BarPieLzd), Byte.valueOf(A201BarPieEst), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
               pr_default.readNext(7);
            }
            pr_default.close(7);
         }
         /* Optimized DELETE. */
         /* Using cursor P019013 */
         pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P019014 */
         pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBTXT");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P019015 */
         pr_default.execute(11, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBPRD");
         /* End optimized DELETE. */
         /* Using cursor P019016 */
         pr_default.execute(12, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(12) != 101) )
         {
            A3622AlbPckCaj = P019016_A3622AlbPckCaj[0] ;
            n3622AlbPckCaj = P019016_n3622AlbPckCaj[0] ;
            A3621AlbPckLin = P019016_A3621AlbPckLin[0] ;
            AV29NCaja = GXutil.substring( A3622AlbPckCaj, 7, 6) ;
            GXv_char15[0] = A396EmprCod ;
            GXv_char14[0] = "1" ;
            GXv_int13[0] = A129BarCod ;
            GXv_int1[0] = A132BarCodReo ;
            GXv_char12[0] = A130BarCodPar ;
            GXv_char11[0] = AV29NCaja ;
            new app.pal0008(remoteHandle, context).execute( GXv_char15, GXv_char14, GXv_int13, GXv_int1, GXv_char12, GXv_char11) ;
            pelihte.this.A396EmprCod = GXv_char15[0] ;
            pelihte.this.A129BarCod = GXv_int13[0] ;
            pelihte.this.A132BarCodReo = GXv_int1[0] ;
            pelihte.this.A130BarCodPar = GXv_char12[0] ;
            pelihte.this.AV29NCaja = GXv_char11[0] ;
            pr_default.readNext(12);
         }
         pr_default.close(12);
         /* Optimized DELETE. */
         /* Using cursor P019017 */
         pr_default.execute(13, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBPCK");
         /* End optimized DELETE. */
         /* Using cursor P019018 */
         pr_default.execute(14, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(14) != 101) )
         {
            A1533AlbEComM = P019018_A1533AlbEComM[0] ;
            n1533AlbEComM = P019018_n1533AlbEComM[0] ;
            A1032FonCod = P019018_A1032FonCod[0] ;
            A1056DisComCod = P019018_A1056DisComCod[0] ;
            A2524DisComLin = P019018_A2524DisComLin[0] ;
            A1534AlbEComP = P019018_A1534AlbEComP[0] ;
            n1534AlbEComP = P019018_n1534AlbEComP[0] ;
            AV32DisComLin = A2524DisComLin ;
            AV33DisComCod = A1056DisComCod ;
            AV34FonCod = A1032FonCod ;
            AV35AlbEComM = A1533AlbEComM ;
            AV36AlbEComP = A1534AlbEComP ;
            /* Optimized DELETE. */
            /* Using cursor P019019 */
            pr_default.execute(15, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALESTP");
            /* End optimized DELETE. */
            AV30CosOpeAca = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P019020 */
            pr_default.execute(16, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
            while ( (pr_default.getStatus(16) != 101) )
            {
               A1761ExtCod = P019020_A1761ExtCod[0] ;
               /* Using cursor P019021 */
               pr_default.execute(17, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Short.valueOf(A1761ExtCod)});
               while ( (pr_default.getStatus(17) != 101) )
               {
                  A2651OperPreAlb = P019021_A2651OperPreAlb[0] ;
                  n2651OperPreAlb = P019021_n2651OperPreAlb[0] ;
                  A2102OperCod = P019021_A2102OperCod[0] ;
                  AV30CosOpeAca = AV30CosOpeAca.add(GXutil.roundDecimal( A1533AlbEComM.multiply(A2651OperPreAlb), 2)) ;
                  /* Using cursor P019022 */
                  pr_default.execute(18, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Short.valueOf(A1761ExtCod), A2102OperCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBETO");
                  pr_default.readNext(17);
               }
               pr_default.close(17);
               /* Using cursor P019023 */
               pr_default.execute(19, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Short.valueOf(A1761ExtCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBETE");
               pr_default.readNext(16);
            }
            pr_default.close(16);
            AV31CosOpeEmp = DecimalUtil.doubleToDec(0) ;
            /* Using cursor P019024 */
            pr_default.execute(20, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
            while ( (pr_default.getStatus(20) != 101) )
            {
               A2666ProceCodA = P019024_A2666ProceCodA[0] ;
               /* Using cursor P019025 */
               pr_default.execute(21, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Short.valueOf(A2666ProceCodA)});
               while ( (pr_default.getStatus(21) != 101) )
               {
                  A2652OperPreEAl = P019025_A2652OperPreEAl[0] ;
                  n2652OperPreEAl = P019025_n2652OperPreEAl[0] ;
                  A2102OperCod = P019025_A2102OperCod[0] ;
                  AV31CosOpeEmp = AV31CosOpeEmp.add(GXutil.roundDecimal( A1541BarComMtr.multiply(A2652OperPreEAl), 2)) ;
                  /* Using cursor P019026 */
                  pr_default.execute(22, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Short.valueOf(A2666ProceCodA), A2102OperCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBOPE");
                  pr_default.readNext(21);
               }
               pr_default.close(21);
               /* Using cursor P019027 */
               pr_default.execute(23, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod, Short.valueOf(A2666ProceCodA)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEPR");
               pr_default.readNext(20);
            }
            pr_default.close(20);
            /* Execute user subroutine: 'COMBINA' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(14);
               pr_default.close(3);
               pr_default.close(2);
               pr_default.close(1);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            /* Using cursor P019028 */
            pr_default.execute(24, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBEST");
            pr_default.readNext(14);
         }
         pr_default.close(14);
         if ( A213BarSit == 9 )
         {
            A213BarSit = (byte)(6) ;
         }
         GXv_char15[0] = A396EmprCod ;
         GXv_int13[0] = A129BarCod ;
         GXv_int1[0] = A132BarCodReo ;
         GXv_char14[0] = A130BarCodPar ;
         GXv_date16[0] = AV24FecSal ;
         GXv_int17[0] = AV23ExisteHdr ;
         new app.pfchalb(remoteHandle, context).execute( GXv_char15, GXv_int13, GXv_int1, GXv_char14, GXv_date16, GXv_int17) ;
         pelihte.this.A396EmprCod = GXv_char15[0] ;
         pelihte.this.A129BarCod = GXv_int13[0] ;
         pelihte.this.A132BarCodReo = GXv_int1[0] ;
         pelihte.this.A130BarCodPar = GXv_char14[0] ;
         pelihte.this.AV24FecSal = GXv_date16[0] ;
         pelihte.this.AV23ExisteHdr = GXv_int17[0] ;
         if ( AV23ExisteHdr == 0 )
         {
            A161BarFecSal = GXutil.nullDate() ;
            AV24FecSal = GXutil.nullDate() ;
            AV27BarFasEst = (byte)(0) ;
            AV28BarKgm = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            A161BarFecSal = AV24FecSal ;
            AV27BarFasEst = (byte)(2) ;
            AV28BarKgm = A166BarKgm ;
         }
         if ( ( AV25FlagBros == 1 ) || ( AV26FlagSalt == 1 ) )
         {
            /* Execute user subroutine: 'BARFAS' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               pr_default.close(2);
               pr_default.close(1);
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         /* Using cursor P019029 */
         pr_default.execute(25, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         /* Using cursor P019030 */
         pr_default.execute(26, new Object[] {Byte.valueOf(A213BarSit), A161BarFecSal, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      pr_default.close(1);
      pr_default.close(3);
      pr_default.close(2);
      cleanup();
   }

   public void S111( )
   {
      /* 'ALBBAR' Routine */
      returnInSub = false ;
      AV23ExisteHdr = (byte)(0) ;
      AV24FecSal = GXutil.nullDate() ;
      /* Using cursor P019031 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(27) != 101) )
      {
         A34AlbProfch = P019031_A34AlbProfch[0] ;
         A30AlbProCod = P019031_A30AlbProCod[0] ;
         A34AlbProfch = P019031_A34AlbProfch[0] ;
         AV23ExisteHdr = (byte)(1) ;
         if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV24FecSal)) || GXutil.resetTime(AV24FecSal).before( GXutil.resetTime( A34AlbProfch )) )
         {
            AV24FecSal = A34AlbProfch ;
         }
         pr_default.readNext(27);
      }
      pr_default.close(27);
   }

   public void S121( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      /* Using cursor P019032 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(28) != 101) )
      {
         A457FasCod = P019032_A457FasCod[0] ;
         A153BarFasEst = P019032_A153BarFasEst[0] ;
         A227BarUni = P019032_A227BarUni[0] ;
         A160BarFecRea = P019032_A160BarFecRea[0] ;
         A194BarOrdLin = P019032_A194BarOrdLin[0] ;
         A758ProCod = P019032_A758ProCod[0] ;
         if ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "SALIDA", "")) == 0 )
         {
            A153BarFasEst = AV27BarFasEst ;
            A227BarUni = AV28BarKgm ;
            A160BarFecRea = AV24FecSal ;
            /* Using cursor P019033 */
            pr_default.execute(29, new Object[] {Byte.valueOf(A153BarFasEst), A227BarUni, A160BarFecRea, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         }
         pr_default.readNext(28);
      }
      pr_default.close(28);
   }

   public void S131( )
   {
      /* 'COMBINA' Routine */
      returnInSub = false ;
      /* Using cursor P019034 */
      pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(AV37BarCod), Byte.valueOf(AV38BarCodReo), AV39BarCodPar, Byte.valueOf(AV32DisComLin), AV33DisComCod, AV34FonCod});
      while ( (pr_default.getStatus(30) != 101) )
      {
         A1032FonCod = P019034_A1032FonCod[0] ;
         A1056DisComCod = P019034_A1056DisComCod[0] ;
         A2524DisComLin = P019034_A2524DisComLin[0] ;
         A2513BarGasAca = P019034_A2513BarGasAca[0] ;
         n2513BarGasAca = P019034_n2513BarGasAca[0] ;
         A2514BarGasEmp = P019034_A2514BarGasEmp[0] ;
         n2514BarGasEmp = P019034_n2514BarGasEmp[0] ;
         A1542BarComPEst = P019034_A1542BarComPEst[0] ;
         n1542BarComPEst = P019034_n1542BarComPEst[0] ;
         A1540BarComMLan = P019034_A1540BarComMLan[0] ;
         n1540BarComMLan = P019034_n1540BarComMLan[0] ;
         A1544BarComPLan = P019034_A1544BarComPLan[0] ;
         n1544BarComPLan = P019034_n1544BarComPLan[0] ;
         A2513BarGasAca = A2513BarGasAca.subtract(AV30CosOpeAca) ;
         n2513BarGasAca = false ;
         A2514BarGasEmp = A2514BarGasEmp.subtract(AV31CosOpeEmp) ;
         n2514BarGasEmp = false ;
         A1542BarComPEst = (byte)(0) ;
         n1542BarComPEst = false ;
         A1540BarComMLan = A1540BarComMLan.subtract(AV35AlbEComM) ;
         n1540BarComMLan = false ;
         A1544BarComPLan = (short)(A1544BarComPLan-AV36AlbEComP) ;
         n1544BarComPLan = false ;
         if ( A2513BarGasAca.doubleValue() < 0 )
         {
            A2513BarGasAca = DecimalUtil.doubleToDec(0) ;
            n2513BarGasAca = false ;
         }
         if ( A2514BarGasEmp.doubleValue() < 0 )
         {
            A2514BarGasEmp = DecimalUtil.doubleToDec(0) ;
            n2514BarGasEmp = false ;
         }
         if ( A1540BarComMLan.doubleValue() < 0 )
         {
            A1540BarComMLan = DecimalUtil.doubleToDec(0) ;
            n1540BarComMLan = false ;
         }
         if ( A1544BarComPLan < 0 )
         {
            A1544BarComPLan = (short)(0) ;
            n1544BarComPLan = false ;
         }
         /* Using cursor P019035 */
         pr_default.execute(31, new Object[] {Boolean.valueOf(n2513BarGasAca), A2513BarGasAca, Boolean.valueOf(n2514BarGasEmp), A2514BarGasEmp, Boolean.valueOf(n1542BarComPEst), Byte.valueOf(A1542BarComPEst), Boolean.valueOf(n1540BarComMLan), A1540BarComMLan, Boolean.valueOf(n1544BarComPLan), Short.valueOf(A1544BarComPLan), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Byte.valueOf(A2524DisComLin), A1056DisComCod, A1032FonCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCOM");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(30);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pelihte.this.A396EmprCod;
      this.aP1[0] = pelihte.this.AV22AlbProCod;
      this.aP2[0] = pelihte.this.A129BarCod;
      this.aP3[0] = pelihte.this.A132BarCodReo;
      this.aP4[0] = pelihte.this.A130BarCodPar;
      this.aP5[0] = pelihte.this.AV15Tipo;
      Application.commitDataStores(context, remoteHandle, pr_default, "pelihte");
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
      P01902_A396EmprCod = new String[] {""} ;
      P01902_A129BarCod = new int[1] ;
      P01902_A132BarCodReo = new byte[1] ;
      P01902_A130BarCodPar = new String[] {""} ;
      P01902_A30AlbProCod = new long[1] ;
      P01902_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01902_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01902_A1265BarAlbPie = new int[1] ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      P01903_A365DisDes = new String[] {""} ;
      P01903_A361DisCod = new int[1] ;
      P01903_A213BarSit = new byte[1] ;
      P01903_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      A365DisDes = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      P01905_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01905_n166BarKgm = new boolean[] {false} ;
      A166BarKgm = DecimalUtil.ZERO ;
      P01907_A1269BarAlbPza = new short[1] ;
      P01907_n1269BarAlbPza = new boolean[] {false} ;
      AV39BarCodPar = "" ;
      P01908_A396EmprCod = new String[] {""} ;
      P01908_A30AlbProCod = new long[1] ;
      P01908_A129BarCod = new int[1] ;
      P01908_A132BarCodReo = new byte[1] ;
      P01908_A130BarCodPar = new String[] {""} ;
      P01908_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01908_A200BarPieCod = new String[] {""} ;
      A27AlbPKilEnt = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      P01909_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01909_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01909_A1271BarPieLzd = new int[1] ;
      P01909_A201BarPieEst = new byte[1] ;
      P01909_A44AlbRecCod = new int[1] ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A183BarMetLan = DecimalUtil.ZERO ;
      AV18Kilos = DecimalUtil.ZERO ;
      AV19Metros = DecimalUtil.ZERO ;
      P019011_A396EmprCod = new String[] {""} ;
      P019011_A129BarCod = new int[1] ;
      P019011_A132BarCodReo = new byte[1] ;
      P019011_A130BarCodPar = new String[] {""} ;
      P019011_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019011_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019011_A1271BarPieLzd = new int[1] ;
      P019011_A201BarPieEst = new byte[1] ;
      P019011_A44AlbRecCod = new int[1] ;
      P019011_A200BarPieCod = new String[] {""} ;
      GXv_int3 = new long[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int10 = new int[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_int7 = new int[1] ;
      GXv_int4 = new int[1] ;
      GXv_char2 = new String[1] ;
      P019016_A396EmprCod = new String[] {""} ;
      P019016_A30AlbProCod = new long[1] ;
      P019016_A129BarCod = new int[1] ;
      P019016_A132BarCodReo = new byte[1] ;
      P019016_A130BarCodPar = new String[] {""} ;
      P019016_A3622AlbPckCaj = new String[] {""} ;
      P019016_n3622AlbPckCaj = new boolean[] {false} ;
      P019016_A3621AlbPckLin = new short[1] ;
      A3622AlbPckCaj = "" ;
      AV29NCaja = "" ;
      GXv_char12 = new String[1] ;
      GXv_char11 = new String[1] ;
      P019018_A396EmprCod = new String[] {""} ;
      P019018_A30AlbProCod = new long[1] ;
      P019018_A129BarCod = new int[1] ;
      P019018_A132BarCodReo = new byte[1] ;
      P019018_A130BarCodPar = new String[] {""} ;
      P019018_A1533AlbEComM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019018_n1533AlbEComM = new boolean[] {false} ;
      P019018_A1032FonCod = new String[] {""} ;
      P019018_A1056DisComCod = new String[] {""} ;
      P019018_A2524DisComLin = new byte[1] ;
      P019018_A1534AlbEComP = new short[1] ;
      P019018_n1534AlbEComP = new boolean[] {false} ;
      A1533AlbEComM = DecimalUtil.ZERO ;
      A1032FonCod = "" ;
      A1056DisComCod = "" ;
      AV33DisComCod = "" ;
      AV34FonCod = "" ;
      AV35AlbEComM = DecimalUtil.ZERO ;
      AV30CosOpeAca = DecimalUtil.ZERO ;
      P019020_A396EmprCod = new String[] {""} ;
      P019020_A30AlbProCod = new long[1] ;
      P019020_A129BarCod = new int[1] ;
      P019020_A132BarCodReo = new byte[1] ;
      P019020_A130BarCodPar = new String[] {""} ;
      P019020_A2524DisComLin = new byte[1] ;
      P019020_A1056DisComCod = new String[] {""} ;
      P019020_A1032FonCod = new String[] {""} ;
      P019020_A1761ExtCod = new short[1] ;
      P019021_A396EmprCod = new String[] {""} ;
      P019021_A30AlbProCod = new long[1] ;
      P019021_A129BarCod = new int[1] ;
      P019021_A132BarCodReo = new byte[1] ;
      P019021_A130BarCodPar = new String[] {""} ;
      P019021_A2524DisComLin = new byte[1] ;
      P019021_A1056DisComCod = new String[] {""} ;
      P019021_A1032FonCod = new String[] {""} ;
      P019021_A1761ExtCod = new short[1] ;
      P019021_A2651OperPreAlb = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019021_n2651OperPreAlb = new boolean[] {false} ;
      P019021_A2102OperCod = new String[] {""} ;
      A2651OperPreAlb = DecimalUtil.ZERO ;
      A2102OperCod = "" ;
      AV31CosOpeEmp = DecimalUtil.ZERO ;
      P019024_A396EmprCod = new String[] {""} ;
      P019024_A30AlbProCod = new long[1] ;
      P019024_A129BarCod = new int[1] ;
      P019024_A132BarCodReo = new byte[1] ;
      P019024_A130BarCodPar = new String[] {""} ;
      P019024_A2524DisComLin = new byte[1] ;
      P019024_A1056DisComCod = new String[] {""} ;
      P019024_A1032FonCod = new String[] {""} ;
      P019024_A2666ProceCodA = new short[1] ;
      P019025_A396EmprCod = new String[] {""} ;
      P019025_A30AlbProCod = new long[1] ;
      P019025_A129BarCod = new int[1] ;
      P019025_A132BarCodReo = new byte[1] ;
      P019025_A130BarCodPar = new String[] {""} ;
      P019025_A2524DisComLin = new byte[1] ;
      P019025_A1056DisComCod = new String[] {""} ;
      P019025_A1032FonCod = new String[] {""} ;
      P019025_A2666ProceCodA = new short[1] ;
      P019025_A2652OperPreEAl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019025_n2652OperPreEAl = new boolean[] {false} ;
      P019025_A2102OperCod = new String[] {""} ;
      A2652OperPreEAl = DecimalUtil.ZERO ;
      A1541BarComMtr = DecimalUtil.ZERO ;
      GXv_char15 = new String[1] ;
      GXv_int13 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_char14 = new String[1] ;
      AV24FecSal = GXutil.nullDate() ;
      GXv_date16 = new java.util.Date[1] ;
      GXv_int17 = new byte[1] ;
      AV28BarKgm = DecimalUtil.ZERO ;
      P019031_A396EmprCod = new String[] {""} ;
      P019031_A129BarCod = new int[1] ;
      P019031_A132BarCodReo = new byte[1] ;
      P019031_A130BarCodPar = new String[] {""} ;
      P019031_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P019031_A30AlbProCod = new long[1] ;
      A34AlbProfch = GXutil.nullDate() ;
      P019032_A396EmprCod = new String[] {""} ;
      P019032_A129BarCod = new int[1] ;
      P019032_A132BarCodReo = new byte[1] ;
      P019032_A130BarCodPar = new String[] {""} ;
      P019032_A457FasCod = new String[] {""} ;
      P019032_A153BarFasEst = new byte[1] ;
      P019032_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019032_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P019032_A194BarOrdLin = new short[1] ;
      P019032_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A227BarUni = DecimalUtil.ZERO ;
      A160BarFecRea = GXutil.nullDate() ;
      A758ProCod = "" ;
      P019034_A396EmprCod = new String[] {""} ;
      P019034_A1032FonCod = new String[] {""} ;
      P019034_A1056DisComCod = new String[] {""} ;
      P019034_A2524DisComLin = new byte[1] ;
      P019034_A130BarCodPar = new String[] {""} ;
      P019034_A132BarCodReo = new byte[1] ;
      P019034_A129BarCod = new int[1] ;
      P019034_A2513BarGasAca = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019034_n2513BarGasAca = new boolean[] {false} ;
      P019034_A2514BarGasEmp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019034_n2514BarGasEmp = new boolean[] {false} ;
      P019034_A1542BarComPEst = new byte[1] ;
      P019034_n1542BarComPEst = new boolean[] {false} ;
      P019034_A1540BarComMLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P019034_n1540BarComMLan = new boolean[] {false} ;
      P019034_A1544BarComPLan = new short[1] ;
      P019034_n1544BarComPLan = new boolean[] {false} ;
      A2513BarGasAca = DecimalUtil.ZERO ;
      A2514BarGasEmp = DecimalUtil.ZERO ;
      A1540BarComMLan = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pelihte__default(),
         new Object[] {
             new Object[] {
            P01902_A396EmprCod, P01902_A129BarCod, P01902_A132BarCodReo, P01902_A130BarCodPar, P01902_A30AlbProCod, P01902_A1261BarAlbKgmE, P01902_A1263BarAlbMtrE, P01902_A1265BarAlbPie
            }
            , new Object[] {
            P01903_A365DisDes, P01903_A361DisCod, P01903_A213BarSit, P01903_A161BarFecSal
            }
            , new Object[] {
            P01905_A166BarKgm, P01905_n166BarKgm
            }
            , new Object[] {
            P01907_A1269BarAlbPza, P01907_n1269BarAlbPza
            }
            , new Object[] {
            P01908_A396EmprCod, P01908_A30AlbProCod, P01908_A129BarCod, P01908_A132BarCodReo, P01908_A130BarCodPar, P01908_A27AlbPKilEnt, P01908_A200BarPieCod
            }
            , new Object[] {
            P01909_A170BarKilLan, P01909_A183BarMetLan, P01909_A1271BarPieLzd, P01909_A201BarPieEst, P01909_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            P019011_A396EmprCod, P019011_A129BarCod, P019011_A132BarCodReo, P019011_A130BarCodPar, P019011_A170BarKilLan, P019011_A183BarMetLan, P019011_A1271BarPieLzd, P019011_A201BarPieEst, P019011_A44AlbRecCod, P019011_A200BarPieCod
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
            P019016_A396EmprCod, P019016_A30AlbProCod, P019016_A129BarCod, P019016_A132BarCodReo, P019016_A130BarCodPar, P019016_A3622AlbPckCaj, P019016_n3622AlbPckCaj, P019016_A3621AlbPckLin
            }
            , new Object[] {
            }
            , new Object[] {
            P019018_A396EmprCod, P019018_A30AlbProCod, P019018_A129BarCod, P019018_A132BarCodReo, P019018_A130BarCodPar, P019018_A1533AlbEComM, P019018_n1533AlbEComM, P019018_A1032FonCod, P019018_A1056DisComCod, P019018_A2524DisComLin,
            P019018_A1534AlbEComP, P019018_n1534AlbEComP
            }
            , new Object[] {
            }
            , new Object[] {
            P019020_A396EmprCod, P019020_A30AlbProCod, P019020_A129BarCod, P019020_A132BarCodReo, P019020_A130BarCodPar, P019020_A2524DisComLin, P019020_A1056DisComCod, P019020_A1032FonCod, P019020_A1761ExtCod
            }
            , new Object[] {
            P019021_A396EmprCod, P019021_A30AlbProCod, P019021_A129BarCod, P019021_A132BarCodReo, P019021_A130BarCodPar, P019021_A2524DisComLin, P019021_A1056DisComCod, P019021_A1032FonCod, P019021_A1761ExtCod, P019021_A2651OperPreAlb,
            P019021_n2651OperPreAlb, P019021_A2102OperCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P019024_A396EmprCod, P019024_A30AlbProCod, P019024_A129BarCod, P019024_A132BarCodReo, P019024_A130BarCodPar, P019024_A2524DisComLin, P019024_A1056DisComCod, P019024_A1032FonCod, P019024_A2666ProceCodA
            }
            , new Object[] {
            P019025_A396EmprCod, P019025_A30AlbProCod, P019025_A129BarCod, P019025_A132BarCodReo, P019025_A130BarCodPar, P019025_A2524DisComLin, P019025_A1056DisComCod, P019025_A1032FonCod, P019025_A2666ProceCodA, P019025_A2652OperPreEAl,
            P019025_n2652OperPreEAl, P019025_A2102OperCod
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
            }
            , new Object[] {
            P019031_A396EmprCod, P019031_A129BarCod, P019031_A132BarCodReo, P019031_A130BarCodPar, P019031_A34AlbProfch, P019031_A30AlbProCod
            }
            , new Object[] {
            P019032_A396EmprCod, P019032_A129BarCod, P019032_A132BarCodReo, P019032_A130BarCodPar, P019032_A457FasCod, P019032_A153BarFasEst, P019032_A227BarUni, P019032_A160BarFecRea, P019032_A194BarOrdLin, P019032_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P019034_A396EmprCod, P019034_A1032FonCod, P019034_A1056DisComCod, P019034_A2524DisComLin, P019034_A130BarCodPar, P019034_A132BarCodReo, P019034_A129BarCod, P019034_A2513BarGasAca, P019034_n2513BarGasAca, P019034_A2514BarGasEmp,
            P019034_n2514BarGasEmp, P019034_A1542BarComPEst, P019034_n1542BarComPEst, P019034_A1540BarComMLan, P019034_n1540BarComMLan, P019034_A1544BarComPLan, P019034_n1544BarComPLan
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV15Tipo ;
   private byte AV17Flag1 ;
   private byte AV20FlagCra ;
   private byte AV25FlagBros ;
   private byte AV26FlagSalt ;
   private byte A213BarSit ;
   private byte AV38BarCodReo ;
   private byte A201BarPieEst ;
   private byte A2524DisComLin ;
   private byte AV32DisComLin ;
   private byte GXv_int1[] ;
   private byte AV23ExisteHdr ;
   private byte GXv_int17[] ;
   private byte AV27BarFasEst ;
   private byte A153BarFasEst ;
   private byte A1542BarComPEst ;
   private short A1269BarAlbPza ;
   private short A3621AlbPckLin ;
   private short A1534AlbEComP ;
   private short AV36AlbEComP ;
   private short A1761ExtCod ;
   private short A2666ProceCodA ;
   private short A194BarOrdLin ;
   private short A1544BarComPLan ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private int A361DisCod ;
   private int AV37BarCod ;
   private int AV16Piezas ;
   private int A1271BarPieLzd ;
   private int A44AlbRecCod ;
   private int GXv_int10[] ;
   private int GXv_int7[] ;
   private int GXv_int4[] ;
   private int GXv_int13[] ;
   private long AV22AlbProCod ;
   private long A30AlbProCod ;
   private long GXv_int3[] ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A27AlbPKilEnt ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal AV18Kilos ;
   private java.math.BigDecimal AV19Metros ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal A1533AlbEComM ;
   private java.math.BigDecimal AV35AlbEComM ;
   private java.math.BigDecimal AV30CosOpeAca ;
   private java.math.BigDecimal A2651OperPreAlb ;
   private java.math.BigDecimal AV31CosOpeEmp ;
   private java.math.BigDecimal A2652OperPreEAl ;
   private java.math.BigDecimal A1541BarComMtr ;
   private java.math.BigDecimal AV28BarKgm ;
   private java.math.BigDecimal A227BarUni ;
   private java.math.BigDecimal A2513BarGasAca ;
   private java.math.BigDecimal A2514BarGasEmp ;
   private java.math.BigDecimal A1540BarComMLan ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A365DisDes ;
   private String AV39BarCodPar ;
   private String A200BarPieCod ;
   private String GXv_char2[] ;
   private String A3622AlbPckCaj ;
   private String AV29NCaja ;
   private String GXv_char12[] ;
   private String GXv_char11[] ;
   private String A1032FonCod ;
   private String A1056DisComCod ;
   private String AV33DisComCod ;
   private String AV34FonCod ;
   private String A2102OperCod ;
   private String GXv_char15[] ;
   private String GXv_char14[] ;
   private String A457FasCod ;
   private String A758ProCod ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date AV24FecSal ;
   private java.util.Date GXv_date16[] ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A160BarFecRea ;
   private boolean n166BarKgm ;
   private boolean n1269BarAlbPza ;
   private boolean n3622AlbPckCaj ;
   private boolean n1533AlbEComM ;
   private boolean n1534AlbEComP ;
   private boolean n2651OperPreAlb ;
   private boolean n2652OperPreEAl ;
   private boolean returnInSub ;
   private boolean n2513BarGasAca ;
   private boolean n2514BarGasEmp ;
   private boolean n1542BarComPEst ;
   private boolean n1540BarComMLan ;
   private boolean n1544BarComPLan ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P01902_A396EmprCod ;
   private int[] P01902_A129BarCod ;
   private byte[] P01902_A132BarCodReo ;
   private String[] P01902_A130BarCodPar ;
   private long[] P01902_A30AlbProCod ;
   private java.math.BigDecimal[] P01902_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P01902_A1263BarAlbMtrE ;
   private int[] P01902_A1265BarAlbPie ;
   private String[] P01903_A365DisDes ;
   private int[] P01903_A361DisCod ;
   private byte[] P01903_A213BarSit ;
   private java.util.Date[] P01903_A161BarFecSal ;
   private java.math.BigDecimal[] P01905_A166BarKgm ;
   private boolean[] P01905_n166BarKgm ;
   private short[] P01907_A1269BarAlbPza ;
   private boolean[] P01907_n1269BarAlbPza ;
   private String[] P01908_A396EmprCod ;
   private long[] P01908_A30AlbProCod ;
   private int[] P01908_A129BarCod ;
   private byte[] P01908_A132BarCodReo ;
   private String[] P01908_A130BarCodPar ;
   private java.math.BigDecimal[] P01908_A27AlbPKilEnt ;
   private String[] P01908_A200BarPieCod ;
   private java.math.BigDecimal[] P01909_A170BarKilLan ;
   private java.math.BigDecimal[] P01909_A183BarMetLan ;
   private int[] P01909_A1271BarPieLzd ;
   private byte[] P01909_A201BarPieEst ;
   private int[] P01909_A44AlbRecCod ;
   private String[] P019011_A396EmprCod ;
   private int[] P019011_A129BarCod ;
   private byte[] P019011_A132BarCodReo ;
   private String[] P019011_A130BarCodPar ;
   private java.math.BigDecimal[] P019011_A170BarKilLan ;
   private java.math.BigDecimal[] P019011_A183BarMetLan ;
   private int[] P019011_A1271BarPieLzd ;
   private byte[] P019011_A201BarPieEst ;
   private int[] P019011_A44AlbRecCod ;
   private String[] P019011_A200BarPieCod ;
   private String[] P019016_A396EmprCod ;
   private long[] P019016_A30AlbProCod ;
   private int[] P019016_A129BarCod ;
   private byte[] P019016_A132BarCodReo ;
   private String[] P019016_A130BarCodPar ;
   private String[] P019016_A3622AlbPckCaj ;
   private boolean[] P019016_n3622AlbPckCaj ;
   private short[] P019016_A3621AlbPckLin ;
   private String[] P019018_A396EmprCod ;
   private long[] P019018_A30AlbProCod ;
   private int[] P019018_A129BarCod ;
   private byte[] P019018_A132BarCodReo ;
   private String[] P019018_A130BarCodPar ;
   private java.math.BigDecimal[] P019018_A1533AlbEComM ;
   private boolean[] P019018_n1533AlbEComM ;
   private String[] P019018_A1032FonCod ;
   private String[] P019018_A1056DisComCod ;
   private byte[] P019018_A2524DisComLin ;
   private short[] P019018_A1534AlbEComP ;
   private boolean[] P019018_n1534AlbEComP ;
   private String[] P019020_A396EmprCod ;
   private long[] P019020_A30AlbProCod ;
   private int[] P019020_A129BarCod ;
   private byte[] P019020_A132BarCodReo ;
   private String[] P019020_A130BarCodPar ;
   private byte[] P019020_A2524DisComLin ;
   private String[] P019020_A1056DisComCod ;
   private String[] P019020_A1032FonCod ;
   private short[] P019020_A1761ExtCod ;
   private String[] P019021_A396EmprCod ;
   private long[] P019021_A30AlbProCod ;
   private int[] P019021_A129BarCod ;
   private byte[] P019021_A132BarCodReo ;
   private String[] P019021_A130BarCodPar ;
   private byte[] P019021_A2524DisComLin ;
   private String[] P019021_A1056DisComCod ;
   private String[] P019021_A1032FonCod ;
   private short[] P019021_A1761ExtCod ;
   private java.math.BigDecimal[] P019021_A2651OperPreAlb ;
   private boolean[] P019021_n2651OperPreAlb ;
   private String[] P019021_A2102OperCod ;
   private String[] P019024_A396EmprCod ;
   private long[] P019024_A30AlbProCod ;
   private int[] P019024_A129BarCod ;
   private byte[] P019024_A132BarCodReo ;
   private String[] P019024_A130BarCodPar ;
   private byte[] P019024_A2524DisComLin ;
   private String[] P019024_A1056DisComCod ;
   private String[] P019024_A1032FonCod ;
   private short[] P019024_A2666ProceCodA ;
   private String[] P019025_A396EmprCod ;
   private long[] P019025_A30AlbProCod ;
   private int[] P019025_A129BarCod ;
   private byte[] P019025_A132BarCodReo ;
   private String[] P019025_A130BarCodPar ;
   private byte[] P019025_A2524DisComLin ;
   private String[] P019025_A1056DisComCod ;
   private String[] P019025_A1032FonCod ;
   private short[] P019025_A2666ProceCodA ;
   private java.math.BigDecimal[] P019025_A2652OperPreEAl ;
   private boolean[] P019025_n2652OperPreEAl ;
   private String[] P019025_A2102OperCod ;
   private String[] P019031_A396EmprCod ;
   private int[] P019031_A129BarCod ;
   private byte[] P019031_A132BarCodReo ;
   private String[] P019031_A130BarCodPar ;
   private java.util.Date[] P019031_A34AlbProfch ;
   private long[] P019031_A30AlbProCod ;
   private String[] P019032_A396EmprCod ;
   private int[] P019032_A129BarCod ;
   private byte[] P019032_A132BarCodReo ;
   private String[] P019032_A130BarCodPar ;
   private String[] P019032_A457FasCod ;
   private byte[] P019032_A153BarFasEst ;
   private java.math.BigDecimal[] P019032_A227BarUni ;
   private java.util.Date[] P019032_A160BarFecRea ;
   private short[] P019032_A194BarOrdLin ;
   private String[] P019032_A758ProCod ;
   private String[] P019034_A396EmprCod ;
   private String[] P019034_A1032FonCod ;
   private String[] P019034_A1056DisComCod ;
   private byte[] P019034_A2524DisComLin ;
   private String[] P019034_A130BarCodPar ;
   private byte[] P019034_A132BarCodReo ;
   private int[] P019034_A129BarCod ;
   private java.math.BigDecimal[] P019034_A2513BarGasAca ;
   private boolean[] P019034_n2513BarGasAca ;
   private java.math.BigDecimal[] P019034_A2514BarGasEmp ;
   private boolean[] P019034_n2514BarGasEmp ;
   private byte[] P019034_A1542BarComPEst ;
   private boolean[] P019034_n1542BarComPEst ;
   private java.math.BigDecimal[] P019034_A1540BarComMLan ;
   private boolean[] P019034_n1540BarComMLan ;
   private short[] P019034_A1544BarComPLan ;
   private boolean[] P019034_n1544BarComPLan ;
}

final  class pelihte__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01902", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod, BarAlbKgmE, BarAlbMtrE, BarAlbPie FROM TXPALBBAR WHERE (EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01903", "SELECT DisDes, DisCod, BarSit, BarFecSal FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01905", "SELECT COALESCE( T1.BarKgm, 0) AS BarKgm FROM (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01907", "SELECT COALESCE( T1.BarAlbPza, 0) AS BarAlbPza FROM (SELECT COUNT(*) AS BarAlbPza, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPLALPRD GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.AlbProCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01908", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPKilEnt, BarPieCod FROM TXPLALPRD WHERE (EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01909", "SELECT BarKilLan, BarMetLan, BarPieLzd, BarPieEst, AlbRecCod FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P019010", "UPDATE TXPBARPIE SET BarKilLan=?, BarMetLan=?, BarPieLzd=?, BarPieEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P019011", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarKilLan, BarMetLan, BarPieLzd, BarPieEst, AlbRecCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P019012", "UPDATE TXPBARPIE SET BarKilLan=?, BarMetLan=?, BarPieLzd=?, BarPieEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P019013", "DELETE FROM TXPALBFAS  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new UpdateCursor("P019014", "DELETE FROM TXPALBTXT  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBTXT")
         ,new UpdateCursor("P019015", "DELETE FROM TXPALBPRD  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBPRD")
         ,new ForEachCursor("P019016", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPckCaj, AlbPckLin FROM TXPALBPCK WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P019017", "DELETE FROM TXPALBPCK  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBPCK")
         ,new ForEachCursor("P019018", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbEComM, FonCod, DisComCod, DisComLin, AlbEComP FROM TXPALBEST WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P019019", "DELETE FROM TXPALESTP  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALESTP")
         ,new ForEachCursor("P019020", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, ExtCod FROM TXPALBETE WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P019021", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, ExtCod, OperPreAlb, OperCod FROM TXPALBETO WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? and ExtCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, ExtCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P019022", "DELETE FROM TXPALBETO  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND ExtCod = ? AND OperCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBETO")
         ,new UpdateCursor("P019023", "DELETE FROM TXPALBETE  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND ExtCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBETE")
         ,new ForEachCursor("P019024", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, ProceCodA FROM TXPALBEPR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P019025", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, ProceCodA, OperPreEAl, OperCod FROM TXPALBOPE WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? and ProceCodA = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, ProceCodA ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P019026", "DELETE FROM TXPALBOPE  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND ProceCodA = ? AND OperCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBOPE")
         ,new UpdateCursor("P019027", "DELETE FROM TXPALBEPR  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ? AND ProceCodA = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBEPR")
         ,new UpdateCursor("P019028", "DELETE FROM TXPALBEST  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBEST")
         ,new UpdateCursor("P019029", "DELETE FROM TXPALBBAR  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new UpdateCursor("P019030", "UPDATE TXPBARCAD SET BarSit=?, BarFecSal=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P019031", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.AlbProfch, T1.AlbProCod FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE (T1.EmprCod = ?) AND (T1.BarCod = ?) AND (T1.BarCodReo = ?) AND (T1.BarCodPar = ?) ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P019032", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, BarFasEst, BarUni, BarFecRea, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P019033", "UPDATE TXPBARFAS SET BarFasEst=?, BarUni=?, BarFecRea=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new ForEachCursor("P019034", "SELECT EmprCod, FonCod, DisComCod, DisComLin, BarCodPar, BarCodReo, BarCod, BarGasAca, BarGasEmp, BarComPEst, BarComMLan, BarComPLan FROM TXPBARCOM WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and DisComLin = ? and DisComCod = ? and FonCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P019035", "UPDATE TXPBARCOM SET BarGasAca=?, BarGasEmp=?, BarComPEst=?, BarComMLan=?, BarComPLan=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND DisComLin = ? AND DisComCod = ? AND FonCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCOM")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((String[]) buf[6])[0] = rslt.getString(7, 9);
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 9);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 12);
               ((String[]) buf[8])[0] = rslt.getString(8, 12);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 8);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(11, 8);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 12);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
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
               return;
            case 4 :
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
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 9);
               return;
            case 6 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 9);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 9);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 8);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 8);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 12);
               stmt.setString(8, (String)parms[7], 12);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 26 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 29 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 8);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 12);
               stmt.setString(7, (String)parms[6], 12);
               return;
            case 31 :
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
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[5]).byteValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setInt(7, ((Number) parms[11]).intValue());
               stmt.setByte(8, ((Number) parms[12]).byteValue());
               stmt.setString(9, (String)parms[13], 1);
               stmt.setByte(10, ((Number) parms[14]).byteValue());
               stmt.setString(11, (String)parms[15], 12);
               stmt.setString(12, (String)parms[16], 12);
               return;
      }
   }

}

