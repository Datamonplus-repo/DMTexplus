package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pelihoj extends GXProcedure
{
   public pelihoj( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pelihoj.class ), "" );
   }

   public pelihoj( int remoteHandle ,
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
      pelihoj.this.aP5 = new byte[] {0};
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
      pelihoj.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pelihoj.this.AV22AlbProCod = aP1[0];
      this.aP1 = aP1;
      pelihoj.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pelihoj.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pelihoj.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pelihoj.this.AV15Tipo = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV33Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      pelihoj.this.GXt_char1 = GXv_char2[0] ;
      AV33Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV34Emprnom ;
      GXv_char4[0] = AV35Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV33Station, GXv_char2, GXv_char3, GXv_char4) ;
      pelihoj.this.A396EmprCod = GXv_char2[0] ;
      pelihoj.this.AV34Emprnom = GXv_char3[0] ;
      pelihoj.this.AV35Usurcod = GXv_char4[0] ;
      GXv_int5[0] = AV17Flag1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "HISEMP", ""), GXv_int5) ;
      pelihoj.this.AV17Flag1 = GXv_int5[0] ;
      AV20FlagCra = (byte)(0) ;
      GXv_int5[0] = AV20FlagCra ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CRASA", ""), GXv_int5) ;
      pelihoj.this.AV20FlagCra = GXv_int5[0] ;
      AV25FlagBros = (byte)(0) ;
      GXv_int5[0] = AV25FlagBros ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BROS  ", ""), GXv_int5) ;
      pelihoj.this.AV25FlagBros = GXv_int5[0] ;
      AV26FlagSalt = (byte)(0) ;
      GXv_int5[0] = AV26FlagSalt ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "SALTIN", ""), GXv_int5) ;
      pelihoj.this.AV26FlagSalt = GXv_int5[0] ;
      GXv_int5[0] = AV31Calvet ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CALVET", ""), GXv_int5) ;
      pelihoj.this.AV31Calvet = GXv_int5[0] ;
      /* Using cursor P008G2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV22AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A396EmprCod, Long.valueOf(AV22AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A30AlbProCod = P008G2_A30AlbProCod[0] ;
         A1261BarAlbKgmE = P008G2_A1261BarAlbKgmE[0] ;
         A1263BarAlbMtrE = P008G2_A1263BarAlbMtrE[0] ;
         A1265BarAlbPie = P008G2_A1265BarAlbPie[0] ;
         /* Using cursor P008G3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A365DisDes = P008G3_A365DisDes[0] ;
         A361DisCod = P008G3_A361DisCod[0] ;
         A213BarSit = P008G3_A213BarSit[0] ;
         A161BarFecSal = P008G3_A161BarFecSal[0] ;
         /* Using cursor P008G5 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(2) != 101) )
         {
            A166BarKgm = P008G5_A166BarKgm[0] ;
            n166BarKgm = P008G5_n166BarKgm[0] ;
         }
         else
         {
            A166BarKgm = DecimalUtil.doubleToDec(0) ;
            n166BarKgm = false ;
         }
         /* Using cursor P008G7 */
         pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(3) != 101) )
         {
            A1269BarAlbPza = P008G7_A1269BarAlbPza[0] ;
            n1269BarAlbPza = P008G7_n1269BarAlbPza[0] ;
         }
         else
         {
            A1269BarAlbPza = (short)(0) ;
            n1269BarAlbPza = false ;
         }
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
            /* Using cursor P008G8 */
            pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A27AlbPKilEnt = P008G8_A27AlbPKilEnt[0] ;
               A200BarPieCod = P008G8_A200BarPieCod[0] ;
               /* Using cursor P008G9 */
               pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
               A170BarKilLan = P008G9_A170BarKilLan[0] ;
               A183BarMetLan = P008G9_A183BarMetLan[0] ;
               A1271BarPieLzd = P008G9_A1271BarPieLzd[0] ;
               A201BarPieEst = P008G9_A201BarPieEst[0] ;
               A44AlbRecCod = P008G9_A44AlbRecCod[0] ;
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
                  GXv_char4[0] = A396EmprCod ;
                  GXv_int6[0] = A361DisCod ;
                  GXv_int7[0] = A44AlbRecCod ;
                  GXv_decimal8[0] = AV18Kilos ;
                  GXv_decimal9[0] = AV19Metros ;
                  GXv_int10[0] = AV16Piezas ;
                  GXv_decimal11[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal12[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_int13[0] = 0 ;
                  GXv_char3[0] = httpContext.getMessage( "S", "") ;
                  GXv_char2[0] = "" ;
                  GXv_int14[0] = 0 ;
                  GXv_char15[0] = httpContext.getMessage( "DEL", "") ;
                  GXv_char16[0] = "" ;
                  new app.pmodhis(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int7, GXv_decimal8, GXv_decimal9, GXv_int10, GXv_decimal11, GXv_decimal12, GXv_int13, GXv_char3, GXv_char2, GXv_int14, GXv_char15, GXv_char16) ;
                  pelihoj.this.A396EmprCod = GXv_char4[0] ;
                  pelihoj.this.A361DisCod = (int)((int)(GXv_int6[0])) ;
                  pelihoj.this.A44AlbRecCod = GXv_int7[0] ;
                  pelihoj.this.AV18Kilos = GXv_decimal8[0] ;
                  pelihoj.this.AV19Metros = GXv_decimal9[0] ;
                  pelihoj.this.AV16Piezas = GXv_int10[0] ;
               }
               /* Using cursor P008G10 */
               pr_default.execute(6, new Object[] {A170BarKilLan, A183BarMetLan, Integer.valueOf(A1271BarPieLzd), Byte.valueOf(A201BarPieEst), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
               pr_default.readNext(4);
            }
            pr_default.close(4);
            pr_default.close(5);
         }
         else
         {
            /* Using cursor P008G11 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A170BarKilLan = P008G11_A170BarKilLan[0] ;
               A183BarMetLan = P008G11_A183BarMetLan[0] ;
               A1271BarPieLzd = P008G11_A1271BarPieLzd[0] ;
               A201BarPieEst = P008G11_A201BarPieEst[0] ;
               A44AlbRecCod = P008G11_A44AlbRecCod[0] ;
               A200BarPieCod = P008G11_A200BarPieCod[0] ;
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
                  GXv_char16[0] = A396EmprCod ;
                  GXv_int6[0] = A361DisCod ;
                  GXv_int14[0] = A44AlbRecCod ;
                  GXv_decimal12[0] = AV18Kilos ;
                  GXv_decimal11[0] = AV19Metros ;
                  GXv_int13[0] = AV16Piezas ;
                  GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal8[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_int10[0] = 0 ;
                  GXv_char15[0] = httpContext.getMessage( "S", "") ;
                  GXv_char4[0] = "" ;
                  GXv_int7[0] = 0 ;
                  GXv_char3[0] = httpContext.getMessage( "DEL", "") ;
                  GXv_char2[0] = "" ;
                  new app.pmodhis(remoteHandle, context).execute( GXv_char16, GXv_int6, GXv_int14, GXv_decimal12, GXv_decimal11, GXv_int13, GXv_decimal9, GXv_decimal8, GXv_int10, GXv_char15, GXv_char4, GXv_int7, GXv_char3, GXv_char2) ;
                  pelihoj.this.A396EmprCod = GXv_char16[0] ;
                  pelihoj.this.A361DisCod = (int)((int)(GXv_int6[0])) ;
                  pelihoj.this.A44AlbRecCod = GXv_int14[0] ;
                  pelihoj.this.AV18Kilos = GXv_decimal12[0] ;
                  pelihoj.this.AV19Metros = GXv_decimal11[0] ;
                  pelihoj.this.AV16Piezas = GXv_int13[0] ;
               }
               /* Using cursor P008G12 */
               pr_default.execute(8, new Object[] {A170BarKilLan, A183BarMetLan, Integer.valueOf(A1271BarPieLzd), Byte.valueOf(A201BarPieEst), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A200BarPieCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPIE");
               pr_default.readNext(7);
            }
            pr_default.close(7);
         }
         /* Optimized DELETE. */
         /* Using cursor P008G13 */
         pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P008G14 */
         pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBTXT");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P008G15 */
         pr_default.execute(11, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBPRD");
         /* End optimized DELETE. */
         /* Using cursor P008G16 */
         pr_default.execute(12, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(12) != 101) )
         {
            A3622AlbPckCaj = P008G16_A3622AlbPckCaj[0] ;
            n3622AlbPckCaj = P008G16_n3622AlbPckCaj[0] ;
            A3621AlbPckLin = P008G16_A3621AlbPckLin[0] ;
            if ( AV25FlagBros == 1 )
            {
               AV29NCaja = A3622AlbPckCaj ;
            }
            else
            {
               AV29NCaja = GXutil.substring( A3622AlbPckCaj, 7, 6) ;
            }
            GXv_char16[0] = A396EmprCod ;
            GXv_char15[0] = "1" ;
            GXv_int14[0] = A129BarCod ;
            GXv_int5[0] = A132BarCodReo ;
            GXv_char4[0] = A130BarCodPar ;
            GXv_char3[0] = AV29NCaja ;
            new app.pal0008(remoteHandle, context).execute( GXv_char16, GXv_char15, GXv_int14, GXv_int5, GXv_char4, GXv_char3) ;
            pelihoj.this.A396EmprCod = GXv_char16[0] ;
            pelihoj.this.A129BarCod = GXv_int14[0] ;
            pelihoj.this.A132BarCodReo = GXv_int5[0] ;
            pelihoj.this.A130BarCodPar = GXv_char4[0] ;
            pelihoj.this.AV29NCaja = GXv_char3[0] ;
            pr_default.readNext(12);
         }
         pr_default.close(12);
         /* Optimized DELETE. */
         /* Using cursor P008G17 */
         pr_default.execute(13, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBPCK");
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P008G18 */
         pr_default.execute(14, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREP");
         /* End optimized DELETE. */
         /* Using cursor P008G19 */
         pr_default.execute(15, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         while ( (pr_default.getStatus(15) != 101) )
         {
            A7540Alb_NFisca = P008G19_A7540Alb_NFisca[0] ;
            /* Optimized DELETE. */
            /* Using cursor P008G20 */
            pr_default.execute(16, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), A7540Alb_NFisca});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLNOTRE");
            /* End optimized DELETE. */
            /* Using cursor P008G21 */
            pr_default.execute(17, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), A7540Alb_NFisca});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCNOTRE");
            pr_default.readNext(15);
         }
         pr_default.close(15);
         if ( AV31Calvet == 1 )
         {
            /* Optimized DELETE. */
            /* Using cursor P008G22 */
            pr_default.execute(18, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMETCAL");
            /* End optimized DELETE. */
         }
         /* Optimized DELETE. */
         /* Using cursor P008G23 */
         pr_default.execute(19, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBQUI");
         /* End optimized DELETE. */
         if ( A213BarSit == 9 )
         {
            A213BarSit = (byte)(6) ;
         }
         /* Using cursor P008G24 */
         pr_default.execute(20, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         AV32Texto_ii = httpContext.getMessage( "PELIHOJ-Elimino HDR en Albaran", "") + GXutil.newLine( ) + httpContext.getMessage( "Hdr=", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + GXutil.newLine( ) + httpContext.getMessage( "Albaran=", "") + GXutil.str( A30AlbProCod, 10, 0) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV51Pgmname, AV35Usurcod, AV33Station, AV32Texto_ii, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         GXv_char16[0] = A396EmprCod ;
         GXv_int14[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char15[0] = A130BarCodPar ;
         GXv_date17[0] = AV24FecSal ;
         GXv_int18[0] = AV23ExisteHdr ;
         new app.pfchalb(remoteHandle, context).execute( GXv_char16, GXv_int14, GXv_int5, GXv_char15, GXv_date17, GXv_int18) ;
         pelihoj.this.A396EmprCod = GXv_char16[0] ;
         pelihoj.this.A129BarCod = GXv_int14[0] ;
         pelihoj.this.A132BarCodReo = GXv_int5[0] ;
         pelihoj.this.A130BarCodPar = GXv_char15[0] ;
         pelihoj.this.AV24FecSal = GXv_date17[0] ;
         pelihoj.this.AV23ExisteHdr = GXv_int18[0] ;
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
         /* Using cursor P008G25 */
         pr_default.execute(21, new Object[] {Byte.valueOf(A213BarSit), A161BarFecSal, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      pr_default.close(1);
      pr_default.close(3);
      pr_default.close(2);
      /* Using cursor P008G27 */
      pr_default.execute(22, new Object[] {A396EmprCod, Long.valueOf(AV22AlbProCod)});
      while ( (pr_default.getStatus(22) != 101) )
      {
         A30AlbProCod = P008G27_A30AlbProCod[0] ;
         A5617AlbContLin = P008G27_A5617AlbContLin[0] ;
         n5617AlbContLin = P008G27_n5617AlbContLin[0] ;
         A5617AlbContLin = P008G27_A5617AlbContLin[0] ;
         n5617AlbContLin = P008G27_n5617AlbContLin[0] ;
         AV30AlbContLin = A5617AlbContLin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(22);
      cleanup();
   }

   public void S111( )
   {
      /* 'ALBBAR' Routine */
      returnInSub = false ;
      AV23ExisteHdr = (byte)(0) ;
      AV24FecSal = GXutil.nullDate() ;
      /* Using cursor P008G28 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(23) != 101) )
      {
         A34AlbProfch = P008G28_A34AlbProfch[0] ;
         A30AlbProCod = P008G28_A30AlbProCod[0] ;
         A34AlbProfch = P008G28_A34AlbProfch[0] ;
         AV23ExisteHdr = (byte)(1) ;
         if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV24FecSal)) || GXutil.resetTime(AV24FecSal).before( GXutil.resetTime( A34AlbProfch )) )
         {
            AV24FecSal = A34AlbProfch ;
         }
         pr_default.readNext(23);
      }
      pr_default.close(23);
   }

   public void S121( )
   {
      /* 'BARFAS' Routine */
      returnInSub = false ;
      /* Using cursor P008G29 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(24) != 101) )
      {
         A457FasCod = P008G29_A457FasCod[0] ;
         A153BarFasEst = P008G29_A153BarFasEst[0] ;
         A227BarUni = P008G29_A227BarUni[0] ;
         A160BarFecRea = P008G29_A160BarFecRea[0] ;
         A194BarOrdLin = P008G29_A194BarOrdLin[0] ;
         A758ProCod = P008G29_A758ProCod[0] ;
         if ( GXutil.strcmp(A457FasCod, httpContext.getMessage( "SALIDA", "")) == 0 )
         {
            A153BarFasEst = AV27BarFasEst ;
            A227BarUni = AV28BarKgm ;
            A160BarFecRea = AV24FecSal ;
            /* Using cursor P008G30 */
            pr_default.execute(25, new Object[] {Byte.valueOf(A153BarFasEst), A227BarUni, A160BarFecRea, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         }
         pr_default.readNext(24);
      }
      pr_default.close(24);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pelihoj.this.A396EmprCod;
      this.aP1[0] = pelihoj.this.AV22AlbProCod;
      this.aP2[0] = pelihoj.this.A129BarCod;
      this.aP3[0] = pelihoj.this.A132BarCodReo;
      this.aP4[0] = pelihoj.this.A130BarCodPar;
      this.aP5[0] = pelihoj.this.AV15Tipo;
      Application.commitDataStores(context, remoteHandle, pr_default, "pelihoj");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV33Station = "" ;
      GXt_char1 = "" ;
      AV34Emprnom = "" ;
      AV35Usurcod = "" ;
      scmdbuf = "" ;
      P008G2_A396EmprCod = new String[] {""} ;
      P008G2_A129BarCod = new int[1] ;
      P008G2_A132BarCodReo = new byte[1] ;
      P008G2_A130BarCodPar = new String[] {""} ;
      P008G2_A30AlbProCod = new long[1] ;
      P008G2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008G2_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008G2_A1265BarAlbPie = new int[1] ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      P008G3_A365DisDes = new String[] {""} ;
      P008G3_A361DisCod = new int[1] ;
      P008G3_A213BarSit = new byte[1] ;
      P008G3_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      A365DisDes = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      P008G5_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008G5_n166BarKgm = new boolean[] {false} ;
      A166BarKgm = DecimalUtil.ZERO ;
      P008G7_A1269BarAlbPza = new short[1] ;
      P008G7_n1269BarAlbPza = new boolean[] {false} ;
      P008G8_A396EmprCod = new String[] {""} ;
      P008G8_A30AlbProCod = new long[1] ;
      P008G8_A129BarCod = new int[1] ;
      P008G8_A132BarCodReo = new byte[1] ;
      P008G8_A130BarCodPar = new String[] {""} ;
      P008G8_A27AlbPKilEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008G8_A200BarPieCod = new String[] {""} ;
      A27AlbPKilEnt = DecimalUtil.ZERO ;
      A200BarPieCod = "" ;
      P008G9_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008G9_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008G9_A1271BarPieLzd = new int[1] ;
      P008G9_A201BarPieEst = new byte[1] ;
      P008G9_A44AlbRecCod = new int[1] ;
      A170BarKilLan = DecimalUtil.ZERO ;
      A183BarMetLan = DecimalUtil.ZERO ;
      AV18Kilos = DecimalUtil.ZERO ;
      AV19Metros = DecimalUtil.ZERO ;
      P008G11_A396EmprCod = new String[] {""} ;
      P008G11_A129BarCod = new int[1] ;
      P008G11_A132BarCodReo = new byte[1] ;
      P008G11_A130BarCodPar = new String[] {""} ;
      P008G11_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008G11_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008G11_A1271BarPieLzd = new int[1] ;
      P008G11_A201BarPieEst = new byte[1] ;
      P008G11_A44AlbRecCod = new int[1] ;
      P008G11_A200BarPieCod = new String[] {""} ;
      GXv_int6 = new long[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_int13 = new int[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int10 = new int[1] ;
      GXv_int7 = new int[1] ;
      GXv_char2 = new String[1] ;
      P008G16_A396EmprCod = new String[] {""} ;
      P008G16_A30AlbProCod = new long[1] ;
      P008G16_A129BarCod = new int[1] ;
      P008G16_A132BarCodReo = new byte[1] ;
      P008G16_A130BarCodPar = new String[] {""} ;
      P008G16_A3622AlbPckCaj = new String[] {""} ;
      P008G16_n3622AlbPckCaj = new boolean[] {false} ;
      P008G16_A3621AlbPckLin = new short[1] ;
      A3622AlbPckCaj = "" ;
      AV29NCaja = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      P008G19_A396EmprCod = new String[] {""} ;
      P008G19_A30AlbProCod = new long[1] ;
      P008G19_A7540Alb_NFisca = new String[] {""} ;
      A7540Alb_NFisca = "" ;
      AV32Texto_ii = "" ;
      AV51Pgmname = "" ;
      GXv_char16 = new String[1] ;
      GXv_int14 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char15 = new String[1] ;
      AV24FecSal = GXutil.nullDate() ;
      GXv_date17 = new java.util.Date[1] ;
      GXv_int18 = new byte[1] ;
      AV28BarKgm = DecimalUtil.ZERO ;
      P008G27_A396EmprCod = new String[] {""} ;
      P008G27_A30AlbProCod = new long[1] ;
      P008G27_A5617AlbContLin = new short[1] ;
      P008G27_n5617AlbContLin = new boolean[] {false} ;
      P008G28_A396EmprCod = new String[] {""} ;
      P008G28_A129BarCod = new int[1] ;
      P008G28_A132BarCodReo = new byte[1] ;
      P008G28_A130BarCodPar = new String[] {""} ;
      P008G28_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      P008G28_A30AlbProCod = new long[1] ;
      A34AlbProfch = GXutil.nullDate() ;
      P008G29_A396EmprCod = new String[] {""} ;
      P008G29_A129BarCod = new int[1] ;
      P008G29_A132BarCodReo = new byte[1] ;
      P008G29_A130BarCodPar = new String[] {""} ;
      P008G29_A457FasCod = new String[] {""} ;
      P008G29_A153BarFasEst = new byte[1] ;
      P008G29_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P008G29_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P008G29_A194BarOrdLin = new short[1] ;
      P008G29_A758ProCod = new String[] {""} ;
      A457FasCod = "" ;
      A227BarUni = DecimalUtil.ZERO ;
      A160BarFecRea = GXutil.nullDate() ;
      A758ProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pelihoj__default(),
         new Object[] {
             new Object[] {
            P008G2_A396EmprCod, P008G2_A129BarCod, P008G2_A132BarCodReo, P008G2_A130BarCodPar, P008G2_A30AlbProCod, P008G2_A1261BarAlbKgmE, P008G2_A1263BarAlbMtrE, P008G2_A1265BarAlbPie
            }
            , new Object[] {
            P008G3_A365DisDes, P008G3_A361DisCod, P008G3_A213BarSit, P008G3_A161BarFecSal
            }
            , new Object[] {
            P008G5_A166BarKgm, P008G5_n166BarKgm
            }
            , new Object[] {
            P008G7_A1269BarAlbPza, P008G7_n1269BarAlbPza
            }
            , new Object[] {
            P008G8_A396EmprCod, P008G8_A30AlbProCod, P008G8_A129BarCod, P008G8_A132BarCodReo, P008G8_A130BarCodPar, P008G8_A27AlbPKilEnt, P008G8_A200BarPieCod
            }
            , new Object[] {
            P008G9_A170BarKilLan, P008G9_A183BarMetLan, P008G9_A1271BarPieLzd, P008G9_A201BarPieEst, P008G9_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            P008G11_A396EmprCod, P008G11_A129BarCod, P008G11_A132BarCodReo, P008G11_A130BarCodPar, P008G11_A170BarKilLan, P008G11_A183BarMetLan, P008G11_A1271BarPieLzd, P008G11_A201BarPieEst, P008G11_A44AlbRecCod, P008G11_A200BarPieCod
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
            P008G16_A396EmprCod, P008G16_A30AlbProCod, P008G16_A129BarCod, P008G16_A132BarCodReo, P008G16_A130BarCodPar, P008G16_A3622AlbPckCaj, P008G16_n3622AlbPckCaj, P008G16_A3621AlbPckLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P008G19_A396EmprCod, P008G19_A30AlbProCod, P008G19_A7540Alb_NFisca
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
            }
            , new Object[] {
            P008G27_A396EmprCod, P008G27_A30AlbProCod, P008G27_A5617AlbContLin, P008G27_n5617AlbContLin
            }
            , new Object[] {
            P008G28_A396EmprCod, P008G28_A129BarCod, P008G28_A132BarCodReo, P008G28_A130BarCodPar, P008G28_A34AlbProfch, P008G28_A30AlbProCod
            }
            , new Object[] {
            P008G29_A396EmprCod, P008G29_A129BarCod, P008G29_A132BarCodReo, P008G29_A130BarCodPar, P008G29_A457FasCod, P008G29_A153BarFasEst, P008G29_A227BarUni, P008G29_A160BarFecRea, P008G29_A194BarOrdLin, P008G29_A758ProCod
            }
            , new Object[] {
            }
         }
      );
      AV51Pgmname = "PELIHOJ" ;
      /* GeneXus formulas. */
      AV51Pgmname = "PELIHOJ" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV15Tipo ;
   private byte AV17Flag1 ;
   private byte AV20FlagCra ;
   private byte AV25FlagBros ;
   private byte AV26FlagSalt ;
   private byte AV31Calvet ;
   private byte A213BarSit ;
   private byte A201BarPieEst ;
   private byte GXv_int5[] ;
   private byte AV23ExisteHdr ;
   private byte GXv_int18[] ;
   private byte AV27BarFasEst ;
   private byte A153BarFasEst ;
   private short A1269BarAlbPza ;
   private short A3621AlbPckLin ;
   private short A5617AlbContLin ;
   private short AV30AlbContLin ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A1265BarAlbPie ;
   private int A361DisCod ;
   private int AV16Piezas ;
   private int A1271BarPieLzd ;
   private int A44AlbRecCod ;
   private int GXv_int13[] ;
   private int GXv_int10[] ;
   private int GXv_int7[] ;
   private int GXv_int14[] ;
   private long AV22AlbProCod ;
   private long A30AlbProCod ;
   private long GXv_int6[] ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A27AlbPKilEnt ;
   private java.math.BigDecimal A170BarKilLan ;
   private java.math.BigDecimal A183BarMetLan ;
   private java.math.BigDecimal AV18Kilos ;
   private java.math.BigDecimal AV19Metros ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal AV28BarKgm ;
   private java.math.BigDecimal A227BarUni ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV33Station ;
   private String GXt_char1 ;
   private String AV34Emprnom ;
   private String AV35Usurcod ;
   private String scmdbuf ;
   private String A365DisDes ;
   private String A200BarPieCod ;
   private String GXv_char2[] ;
   private String A3622AlbPckCaj ;
   private String AV29NCaja ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String A7540Alb_NFisca ;
   private String AV51Pgmname ;
   private String GXv_char16[] ;
   private String GXv_char15[] ;
   private String A457FasCod ;
   private String A758ProCod ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date AV24FecSal ;
   private java.util.Date GXv_date17[] ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A160BarFecRea ;
   private boolean n166BarKgm ;
   private boolean n1269BarAlbPza ;
   private boolean n3622AlbPckCaj ;
   private boolean returnInSub ;
   private boolean n5617AlbContLin ;
   private String AV32Texto_ii ;
   private byte[] aP5 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P008G2_A396EmprCod ;
   private int[] P008G2_A129BarCod ;
   private byte[] P008G2_A132BarCodReo ;
   private String[] P008G2_A130BarCodPar ;
   private long[] P008G2_A30AlbProCod ;
   private java.math.BigDecimal[] P008G2_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P008G2_A1263BarAlbMtrE ;
   private int[] P008G2_A1265BarAlbPie ;
   private String[] P008G3_A365DisDes ;
   private int[] P008G3_A361DisCod ;
   private byte[] P008G3_A213BarSit ;
   private java.util.Date[] P008G3_A161BarFecSal ;
   private java.math.BigDecimal[] P008G5_A166BarKgm ;
   private boolean[] P008G5_n166BarKgm ;
   private short[] P008G7_A1269BarAlbPza ;
   private boolean[] P008G7_n1269BarAlbPza ;
   private String[] P008G8_A396EmprCod ;
   private long[] P008G8_A30AlbProCod ;
   private int[] P008G8_A129BarCod ;
   private byte[] P008G8_A132BarCodReo ;
   private String[] P008G8_A130BarCodPar ;
   private java.math.BigDecimal[] P008G8_A27AlbPKilEnt ;
   private String[] P008G8_A200BarPieCod ;
   private java.math.BigDecimal[] P008G9_A170BarKilLan ;
   private java.math.BigDecimal[] P008G9_A183BarMetLan ;
   private int[] P008G9_A1271BarPieLzd ;
   private byte[] P008G9_A201BarPieEst ;
   private int[] P008G9_A44AlbRecCod ;
   private String[] P008G11_A396EmprCod ;
   private int[] P008G11_A129BarCod ;
   private byte[] P008G11_A132BarCodReo ;
   private String[] P008G11_A130BarCodPar ;
   private java.math.BigDecimal[] P008G11_A170BarKilLan ;
   private java.math.BigDecimal[] P008G11_A183BarMetLan ;
   private int[] P008G11_A1271BarPieLzd ;
   private byte[] P008G11_A201BarPieEst ;
   private int[] P008G11_A44AlbRecCod ;
   private String[] P008G11_A200BarPieCod ;
   private String[] P008G16_A396EmprCod ;
   private long[] P008G16_A30AlbProCod ;
   private int[] P008G16_A129BarCod ;
   private byte[] P008G16_A132BarCodReo ;
   private String[] P008G16_A130BarCodPar ;
   private String[] P008G16_A3622AlbPckCaj ;
   private boolean[] P008G16_n3622AlbPckCaj ;
   private short[] P008G16_A3621AlbPckLin ;
   private String[] P008G19_A396EmprCod ;
   private long[] P008G19_A30AlbProCod ;
   private String[] P008G19_A7540Alb_NFisca ;
   private String[] P008G27_A396EmprCod ;
   private long[] P008G27_A30AlbProCod ;
   private short[] P008G27_A5617AlbContLin ;
   private boolean[] P008G27_n5617AlbContLin ;
   private String[] P008G28_A396EmprCod ;
   private int[] P008G28_A129BarCod ;
   private byte[] P008G28_A132BarCodReo ;
   private String[] P008G28_A130BarCodPar ;
   private java.util.Date[] P008G28_A34AlbProfch ;
   private long[] P008G28_A30AlbProCod ;
   private String[] P008G29_A396EmprCod ;
   private int[] P008G29_A129BarCod ;
   private byte[] P008G29_A132BarCodReo ;
   private String[] P008G29_A130BarCodPar ;
   private String[] P008G29_A457FasCod ;
   private byte[] P008G29_A153BarFasEst ;
   private java.math.BigDecimal[] P008G29_A227BarUni ;
   private java.util.Date[] P008G29_A160BarFecRea ;
   private short[] P008G29_A194BarOrdLin ;
   private String[] P008G29_A758ProCod ;
}

final  class pelihoj__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P008G2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod, BarAlbKgmE, BarAlbMtrE, BarAlbPie FROM TXPALBBAR WHERE (EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P008G3", "SELECT DisDes, DisCod, BarSit, BarFecSal FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P008G5", "SELECT COALESCE( T1.BarKgm, 0) AS BarKgm FROM (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P008G7", "SELECT COALESCE( T1.BarAlbPza, 0) AS BarAlbPza FROM (SELECT COUNT(*) AS BarAlbPza, EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPLALPRD GROUP BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.AlbProCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P008G8", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPKilEnt, BarPieCod FROM TXPLALPRD WHERE (EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P008G9", "SELECT BarKilLan, BarMetLan, BarPieLzd, BarPieEst, AlbRecCod FROM TXPBARPIE WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008G10", "UPDATE TXPBARPIE SET BarKilLan=?, BarMetLan=?, BarPieLzd=?, BarPieEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new ForEachCursor("P008G11", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarKilLan, BarMetLan, BarPieLzd, BarPieEst, AlbRecCod, BarPieCod FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarPieCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008G12", "UPDATE TXPBARPIE SET BarKilLan=?, BarMetLan=?, BarPieLzd=?, BarPieEst=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND BarPieCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPIE")
         ,new UpdateCursor("P008G13", "DELETE FROM TXPALBFAS  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new UpdateCursor("P008G14", "DELETE FROM TXPALBTXT  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBTXT")
         ,new UpdateCursor("P008G15", "DELETE FROM TXPALBPRD  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBPRD")
         ,new ForEachCursor("P008G16", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPckCaj, AlbPckLin FROM TXPALBPCK WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008G17", "DELETE FROM TXPALBPCK  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBPCK")
         ,new UpdateCursor("P008G18", "DELETE FROM TXPALBREP  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREP")
         ,new ForEachCursor("P008G19", "SELECT EmprCod, AlbProCod, Alb_NFisca FROM TXPCNOTRE WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, Alb_NFisca ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008G20", "DELETE FROM TXPLNOTRE  WHERE EmprCod = ? and AlbProCod = ? and Alb_NFisca = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLNOTRE")
         ,new UpdateCursor("P008G21", "DELETE FROM TXPCNOTRE  WHERE EmprCod = ? AND AlbProCod = ? AND Alb_NFisca = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCNOTRE")
         ,new UpdateCursor("P008G22", "DELETE FROM TXPMETCAL  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMETCAL")
         ,new UpdateCursor("P008G23", "DELETE FROM TXPALBQUI  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBQUI")
         ,new UpdateCursor("P008G24", "DELETE FROM TXPALBBAR  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new UpdateCursor("P008G25", "UPDATE TXPBARCAD SET BarSit=?, BarFecSal=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P008G27", "SELECT T1.EmprCod, T1.AlbProCod, COALESCE( T2.AlbContLin, 0) AS AlbContLin FROM (TXPCALPRD T1 LEFT JOIN (SELECT COUNT(*) AS AlbContLin, EmprCod, AlbProCod FROM TXPALBBAR GROUP BY EmprCod, AlbProCod ) T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P008G28", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.AlbProfch, T1.AlbProCod FROM (TXPALBBAR T1 INNER JOIN TXPCALPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbProCod = T1.AlbProCod) WHERE (T1.EmprCod = ?) AND (T1.BarCod = ?) AND (T1.BarCodReo = ?) AND (T1.BarCodPar = ?) ORDER BY T1.EmprCod, T1.AlbProCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P008G29", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, FasCod, BarFasEst, BarUni, BarFecRea, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P008G30", "UPDATE TXPBARFAS SET BarFasEst=?, BarUni=?, BarFecRea=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
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
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               return;
            case 24 :
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
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 21 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 25 :
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
   }

}

