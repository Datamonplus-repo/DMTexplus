package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pppadto extends GXProcedure
{
   public pppadto( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pppadto.class ), "" );
   }

   public pppadto( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           long[] aP1 ,
                                           int[] aP2 ,
                                           byte[] aP3 ,
                                           String[] aP4 ,
                                           java.math.BigDecimal[] aP5 ,
                                           java.math.BigDecimal[] aP6 ,
                                           java.math.BigDecimal[] aP7 ,
                                           java.math.BigDecimal[] aP8 ,
                                           java.math.BigDecimal[] aP9 ,
                                           java.math.BigDecimal[] aP10 ,
                                           java.math.BigDecimal[] aP11 ,
                                           byte[] aP12 )
   {
      pppadto.this.aP13 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        byte[] aP12 ,
                        java.math.BigDecimal[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             byte[] aP12 ,
                             java.math.BigDecimal[] aP13 )
   {
      pppadto.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pppadto.this.A30AlbProCod = aP1[0];
      this.aP1 = aP1;
      pppadto.this.A129BarCod = aP2[0];
      this.aP2 = aP2;
      pppadto.this.A132BarCodReo = aP3[0];
      this.aP3 = aP3;
      pppadto.this.A130BarCodPar = aP4[0];
      this.aP4 = aP4;
      pppadto.this.AV8PMDDtoTin = aP5[0];
      this.aP5 = aP5;
      pppadto.this.AV9PMDDtoAca = aP6[0];
      this.aP6 = aP6;
      pppadto.this.AV10Precio = aP7[0];
      this.aP7 = aP7;
      pppadto.this.AV11PMDTinPrc = aP8[0];
      this.aP8 = aP8;
      pppadto.this.AV12PMDAcaPrc = aP9[0];
      this.aP9 = aP9;
      pppadto.this.AV15PMDKgmMinS = aP10[0];
      this.aP10 = aP10;
      pppadto.this.AV17MtsMinS = aP11[0];
      this.aP11 = aP11;
      pppadto.this.AV19OkKgMin = aP12[0];
      this.aP12 = aP12;
      pppadto.this.AV28PMDPreUni = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV36siLog ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PPADTO", ""), GXv_int2) ;
      pppadto.this.GXt_int1 = GXv_int2[0] ;
      AV36siLog = GXt_int1 ;
      GXt_int1 = AV41PmlCliente ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PMLCLI", ""), GXv_int2) ;
      pppadto.this.GXt_int1 = GXv_int2[0] ;
      AV41PmlCliente = GXt_int1 ;
      GXv_char3[0] = A396EmprCod ;
      GXv_char4[0] = httpContext.getMessage( "GRAHDR", "") ;
      GXv_int5[0] = AV21ContVal ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char3, GXv_char4, GXv_int5) ;
      pppadto.this.A396EmprCod = GXv_char3[0] ;
      pppadto.this.AV21ContVal = GXv_int5[0] ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "PMLHDR", "") ;
      GXv_int5[0] = AV38ValPml ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5) ;
      pppadto.this.A396EmprCod = GXv_char4[0] ;
      pppadto.this.AV38ValPml = GXv_int5[0] ;
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "PML500", "") ;
      GXv_int5[0] = AV37Pml500 ;
      new app.pvalcon(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_int5) ;
      pppadto.this.A396EmprCod = GXv_char4[0] ;
      pppadto.this.AV37Pml500 = GXv_int5[0] ;
      AV22GraHdr = AV21ContVal ;
      /* Using cursor P037O2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2395BarAlbExt = P037O2_A2395BarAlbExt[0] ;
         n2395BarAlbExt = P037O2_n2395BarAlbExt[0] ;
         A5019AlbHdrgm2 = P037O2_A5019AlbHdrgm2[0] ;
         A3271AlbHdrAnc = P037O2_A3271AlbHdrAnc[0] ;
         A1262BarPreKgm = P037O2_A1262BarPreKgm[0] ;
         A6815BarPreFKg = P037O2_A6815BarPreFKg[0] ;
         n6815BarPreFKg = P037O2_n6815BarPreFKg[0] ;
         A2762AlbBarDto = P037O2_A2762AlbBarDto[0] ;
         n2762AlbBarDto = P037O2_n2762AlbBarDto[0] ;
         A2761AlbBarRec = P037O2_A2761AlbBarRec[0] ;
         A1261BarAlbKgmE = P037O2_A1261BarAlbKgmE[0] ;
         A2243BarKgsCli = P037O2_A2243BarKgsCli[0] ;
         n2243BarKgsCli = P037O2_n2243BarKgsCli[0] ;
         A1263BarAlbMtrE = P037O2_A1263BarAlbMtrE[0] ;
         /* Using cursor P037O3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A252CliCod = P037O3_A252CliCod[0] ;
         n252CliCod = P037O3_n252CliCod[0] ;
         A361DisCod = P037O3_A361DisCod[0] ;
         A5253BarAcc = P037O3_A5253BarAcc[0] ;
         A1909BarGraAca = P037O3_A1909BarGraAca[0] ;
         A125BarAncAca1 = P037O3_A125BarAncAca1[0] ;
         /* Using cursor P037O4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         /* Using cursor P037O5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A8400PMDPreLim = P037O5_A8400PMDPreLim[0] ;
         n8400PMDPreLim = P037O5_n8400PMDPreLim[0] ;
         A8401PMDPreMin = P037O5_A8401PMDPreMin[0] ;
         n8401PMDPreMin = P037O5_n8401PMDPreMin[0] ;
         A5648CliTipo = P037O5_A5648CliTipo[0] ;
         A13291CliFacFm = P037O5_A13291CliFacFm[0] ;
         A13292CliFacFmt = P037O5_A13292CliFacFmt[0] ;
         /* Using cursor P037O6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A388DisPreKgm = P037O6_A388DisPreKgm[0] ;
         A2395BarAlbExt = 1 ;
         n2395BarAlbExt = false ;
         AV27BarGraAca = A5019AlbHdrgm2 ;
         AV26BarAncAca1 = A3271AlbHdrAnc ;
         if ( (0==AV27BarGraAca) )
         {
            AV27BarGraAca = A1909BarGraAca ;
         }
         if ( (0==AV26BarAncAca1) )
         {
            AV26BarAncAca1 = A125BarAncAca1 ;
         }
         AV29PreUni = (byte)(0) ;
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV28PMDPreUni)==0) )
         {
            AV29PreUni = (byte)(1) ;
            A6815BarPreFKg = A1262BarPreKgm ;
            n6815BarPreFKg = false ;
            A1262BarPreKgm = AV10Precio ;
            AV13OkPre = (byte)(1) ;
            A2762AlbBarDto = DecimalUtil.doubleToDec(0) ;
            n2762AlbBarDto = false ;
            A2761AlbBarRec = DecimalUtil.doubleToDec(0) ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P037O2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P037O2_A30AlbProCod[0] == A30AlbProCod ) && ( P037O2_A129BarCod[0] == A129BarCod ) && ( P037O2_A132BarCodReo[0] == A132BarCodReo ) )
            {
               if ( ! ( ( GXutil.strcmp(P037O2_A130BarCodPar[0], A130BarCodPar) == 0 ) ) )
               {
                  if (true) break;
               }
               /* Using cursor P037O4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
               /* Using cursor P037O3 */
               pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               A5253BarAcc = P037O3_A5253BarAcc[0] ;
               A5253BarAcc = httpContext.getMessage( "S", "") ;
               /* Using cursor P037O7 */
               pr_default.execute(5, new Object[] {A5253BarAcc, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
               /* Exiting from a For First loop. */
               if (true) break;
            }
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P037O2_A396EmprCod[0], A396EmprCod) == 0 ) && ( P037O2_A30AlbProCod[0] == A30AlbProCod ) && ( P037O2_A129BarCod[0] == A129BarCod ) && ( P037O2_A132BarCodReo[0] == A132BarCodReo ) )
            {
               if ( ! ( ( GXutil.strcmp(P037O2_A130BarCodPar[0], A130BarCodPar) == 0 ) ) )
               {
                  if (true) break;
               }
               /* Using cursor P037O4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
               /* Using cursor P037O3 */
               pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               A361DisCod = P037O3_A361DisCod[0] ;
               /* Using cursor P037O6 */
               pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
               A388DisPreKgm = P037O6_A388DisPreKgm[0] ;
               A388DisPreKgm = AV10Precio ;
               /* Using cursor P037O8 */
               pr_default.execute(6, new Object[] {A388DisPreKgm, A396EmprCod, Integer.valueOf(A361DisCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
               /* Exiting from a For First loop. */
               if (true) break;
            }
         }
         if ( ( DecimalUtil.compareTo(AV10Precio, A1262BarPreKgm) != 0 ) && ( AV10Precio.doubleValue() > 0 ) )
         {
            A2762AlbBarDto = AV8PMDDtoTin ;
            n2762AlbBarDto = false ;
            A2761AlbBarRec = AV11PMDTinPrc ;
            AV13OkPre = (byte)(1) ;
         }
         if ( AV19OkKgMin == 1 )
         {
            A2243BarKgsCli = A1261BarAlbKgmE ;
            n2243BarKgsCli = false ;
            A1261BarAlbKgmE = AV15PMDKgmMinS ;
            A1263BarAlbMtrE = (((A5019AlbHdrgm2*A3271AlbHdrAnc)>0) ? (A1261BarAlbKgmE.divide(DecimalUtil.doubleToDec((A5019AlbHdrgm2*(A3271AlbHdrAnc/ (double) (100)))), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(1000)) : DecimalUtil.doubleToDec(0)) ;
         }
         AV40clitipo = A5648CliTipo ;
         AV42CliFacFm = A13291CliFacFm ;
         AV43CliFacFmt = A13292CliFacFmt ;
         AV39Pml = 0 ;
         if ( A1263BarAlbMtrE.doubleValue() > 0 )
         {
            AV39Pml = (int)(DecimalUtil.decToDouble(GXutil.roundDecimal( A1261BarAlbKgmE.multiply(DecimalUtil.doubleToDec(1000)).divide(A1263BarAlbMtrE, 18, java.math.RoundingMode.DOWN), 0))) ;
         }
         if ( AV29PreUni == 0 )
         {
            /* Using cursor P037O9 */
            pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A457FasCod = P037O9_A457FasCod[0] ;
               A1275FasKgm = P037O9_A1275FasKgm[0] ;
               A8194GuiFasPBK = P037O9_A8194GuiFasPBK[0] ;
               n8194GuiFasPBK = P037O9_n8194GuiFasPBK[0] ;
               A1276FasMtr = P037O9_A1276FasMtr[0] ;
               A8195GuiFasPBM = P037O9_A8195GuiFasPBM[0] ;
               n8195GuiFasPBM = P037O9_n8195GuiFasPBM[0] ;
               A1242GuiFasPMt = P037O9_A1242GuiFasPMt[0] ;
               A1241GuiFasPKg = P037O9_A1241GuiFasPKg[0] ;
               A7751GuiFasDto = P037O9_A7751GuiFasDto[0] ;
               n7751GuiFasDto = P037O9_n7751GuiFasDto[0] ;
               A7752GuiFasRec = P037O9_A7752GuiFasRec[0] ;
               n7752GuiFasRec = P037O9_n7752GuiFasRec[0] ;
               A1240GuiFasLin = P037O9_A1240GuiFasLin[0] ;
               /* Using cursor P037O10 */
               pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               A252CliCod = P037O10_A252CliCod[0] ;
               n252CliCod = P037O10_n252CliCod[0] ;
               /* Using cursor P037O11 */
               pr_default.execute(9, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
               /* Using cursor P037O12 */
               pr_default.execute(10, new Object[] {A396EmprCod, A457FasCod});
               A4903FasAcab = P037O12_A4903FasAcab[0] ;
               n4903FasAcab = P037O12_n4903FasAcab[0] ;
               /* Using cursor P037O13 */
               pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A457FasCod});
               A12577FasPreKgF = P037O13_A12577FasPreKgF[0] ;
               n12577FasPreKgF = P037O13_n12577FasPreKgF[0] ;
               A466FasPreKgm = P037O13_A466FasPreKgm[0] ;
               n466FasPreKgm = P037O13_n466FasPreKgm[0] ;
               A467FasPreMtr = P037O13_A467FasPreMtr[0] ;
               n467FasPreMtr = P037O13_n467FasPreMtr[0] ;
               A12576FasPreMt2 = P037O13_A12576FasPreMt2[0] ;
               n12576FasPreMt2 = P037O13_n12576FasPreMt2[0] ;
               if ( GXutil.strcmp(A457FasCod, "618     ") != 0 )
               {
                  if ( AV19OkKgMin == 1 )
                  {
                     A8194GuiFasPBK = A1275FasKgm ;
                     n8194GuiFasPBK = false ;
                     A1275FasKgm = AV15PMDKgmMinS ;
                     AV24FasKgm = A1275FasKgm ;
                     if ( AV15PMDKgmMinS.doubleValue() == 0 )
                     {
                        A8195GuiFasPBM = A1276FasMtr ;
                        n8195GuiFasPBM = false ;
                        A1276FasMtr = DecimalUtil.doubleToDec(0) ;
                        A1242GuiFasPMt = DecimalUtil.doubleToDec(0) ;
                     }
                     else
                     {
                        A8195GuiFasPBM = A1276FasMtr ;
                        n8195GuiFasPBM = false ;
                        AV23FasMtr = A1276FasMtr ;
                        AV25Ancho = DecimalUtil.doubleToDec(AV26BarAncAca1/ (double) (100)) ;
                        if ( (DecimalUtil.doubleToDec(AV27BarGraAca).multiply(AV25Ancho)).doubleValue() > 0 )
                        {
                           AV23FasMtr = (AV15PMDKgmMinS.divide((DecimalUtil.doubleToDec(AV27BarGraAca).multiply(AV25Ancho)), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(1000)) ;
                        }
                        if ( GXutil.strcmp(A4903FasAcab, httpContext.getMessage( "S", "")) == 0 )
                        {
                           if ( GXutil.strcmp(A12577FasPreKgF, httpContext.getMessage( "S", "")) == 0 )
                           {
                              A1275FasKgm = AV24FasKgm ;
                              A1241GuiFasPKg = A466FasPreKgm ;
                              A1276FasMtr = DecimalUtil.doubleToDec(0) ;
                              A1242GuiFasPMt = DecimalUtil.doubleToDec(0) ;
                           }
                           else
                           {
                              if ( ( AV39Pml <= AV38ValPml ) && ( AV38ValPml > 0 ) && ( AV39Pml > 0 ) )
                              {
                                 A1275FasKgm = DecimalUtil.doubleToDec(0) ;
                                 A1241GuiFasPKg = DecimalUtil.doubleToDec(0) ;
                                 A1276FasMtr = AV23FasMtr ;
                                 A1242GuiFasPMt = A467FasPreMtr ;
                              }
                              else
                              {
                                 if ( ( ( AV41PmlCliente == 0 ) && ( AV39Pml >= AV37Pml500 ) && ( AV37Pml500 > 0 ) && ( AV39Pml > 0 ) && ( GXutil.strcmp(AV40clitipo, httpContext.getMessage( "I", "")) == 0 ) ) || ( ( AV41PmlCliente == 1 ) && ( AV39Pml >= AV43CliFacFmt ) && ( AV43CliFacFmt > 0 ) && ( AV39Pml > 0 ) && ( GXutil.strcmp(AV42CliFacFm, httpContext.getMessage( "S", "")) == 0 ) ) )
                                 {
                                    A1275FasKgm = DecimalUtil.doubleToDec(0) ;
                                    A1241GuiFasPKg = DecimalUtil.doubleToDec(0) ;
                                    A1276FasMtr = AV23FasMtr ;
                                    A1242GuiFasPMt = A12576FasPreMt2 ;
                                 }
                                 else
                                 {
                                    A1275FasKgm = AV24FasKgm ;
                                    A1241GuiFasPKg = A466FasPreKgm ;
                                    A1276FasMtr = DecimalUtil.doubleToDec(0) ;
                                    A1242GuiFasPMt = DecimalUtil.doubleToDec(0) ;
                                 }
                              }
                           }
                        }
                        else
                        {
                           A1275FasKgm = AV24FasKgm ;
                           A1241GuiFasPKg = A466FasPreKgm ;
                           A1276FasMtr = DecimalUtil.doubleToDec(0) ;
                           A1242GuiFasPMt = DecimalUtil.doubleToDec(0) ;
                        }
                     }
                  }
                  if ( AV13OkPre == 1 )
                  {
                     if ( A1275FasKgm.doubleValue() != 0 )
                     {
                        AV16Kilos = A1275FasKgm ;
                        if ( AV29PreUni == 0 )
                        {
                           AV14PreFas = A1241GuiFasPKg ;
                           if ( DecimalUtil.compareTo(AV14PreFas.multiply(((DecimalUtil.doubleToDec(100).subtract(AV12PMDAcaPrc)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).multiply(AV16Kilos), A8400PMDPreLim) < 0 )
                           {
                              AV14PreFas = A8401PMDPreMin.divide(AV16Kilos, 18, java.math.RoundingMode.DOWN) ;
                           }
                        }
                        else
                        {
                           AV14PreFas = AV28PMDPreUni ;
                        }
                        if ( ( AV9PMDDtoAca.doubleValue() != 0 ) || ( AV12PMDAcaPrc.doubleValue() != 0 ) )
                        {
                           A7751GuiFasDto = AV9PMDDtoAca ;
                           n7751GuiFasDto = false ;
                           A7752GuiFasRec = AV12PMDAcaPrc ;
                           n7752GuiFasRec = false ;
                        }
                     }
                     if ( ( A1242GuiFasPMt.doubleValue() != 0 ) && ( A1276FasMtr.doubleValue() != 0 ) )
                     {
                        AV18Metros = A1276FasMtr ;
                        if ( AV29PreUni == 0 )
                        {
                           AV14PreFas = A1242GuiFasPMt ;
                           if ( DecimalUtil.compareTo(AV14PreFas.multiply(((DecimalUtil.doubleToDec(100).subtract(AV12PMDAcaPrc)).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))).multiply(AV18Metros), A8400PMDPreLim) < 0 )
                           {
                              AV14PreFas = A8401PMDPreMin.divide(AV18Metros, 18, java.math.RoundingMode.DOWN) ;
                           }
                        }
                        else
                        {
                           AV14PreFas = AV28PMDPreUni ;
                        }
                        if ( ( AV9PMDDtoAca.doubleValue() != 0 ) || ( AV12PMDAcaPrc.doubleValue() != 0 ) )
                        {
                           A7751GuiFasDto = AV9PMDDtoAca ;
                           n7751GuiFasDto = false ;
                           A7752GuiFasRec = AV12PMDAcaPrc ;
                           n7752GuiFasRec = false ;
                        }
                     }
                  }
                  else
                  {
                     A7751GuiFasDto = AV9PMDDtoAca ;
                     n7751GuiFasDto = false ;
                     A7752GuiFasRec = AV12PMDAcaPrc ;
                     n7752GuiFasRec = false ;
                  }
               }
               /* Using cursor P037O14 */
               pr_default.execute(12, new Object[] {A1275FasKgm, Boolean.valueOf(n8194GuiFasPBK), A8194GuiFasPBK, A1276FasMtr, Boolean.valueOf(n8195GuiFasPBM), A8195GuiFasPBM, A1242GuiFasPMt, A1241GuiFasPKg, Boolean.valueOf(n7751GuiFasDto), A7751GuiFasDto, Boolean.valueOf(n7752GuiFasRec), A7752GuiFasRec, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
               pr_default.readNext(7);
            }
            pr_default.close(7);
            pr_default.close(8);
            pr_default.close(10);
            pr_default.close(9);
            pr_default.close(11);
         }
         else
         {
            /* Optimized DELETE. */
            /* Using cursor P037O15 */
            pr_default.execute(13, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
            /* End optimized DELETE. */
         }
         /* Using cursor P037O16 */
         pr_default.execute(14, new Object[] {Boolean.valueOf(n2395BarAlbExt), Integer.valueOf(A2395BarAlbExt), A1262BarPreKgm, Boolean.valueOf(n6815BarPreFKg), A6815BarPreFKg, Boolean.valueOf(n2762AlbBarDto), A2762AlbBarDto, A2761AlbBarRec, A1261BarAlbKgmE, Boolean.valueOf(n2243BarKgsCli), A2243BarKgsCli, A1263BarAlbMtrE, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      pr_default.close(1);
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pppadto.this.A396EmprCod;
      this.aP1[0] = pppadto.this.A30AlbProCod;
      this.aP2[0] = pppadto.this.A129BarCod;
      this.aP3[0] = pppadto.this.A132BarCodReo;
      this.aP4[0] = pppadto.this.A130BarCodPar;
      this.aP5[0] = pppadto.this.AV8PMDDtoTin;
      this.aP6[0] = pppadto.this.AV9PMDDtoAca;
      this.aP7[0] = pppadto.this.AV10Precio;
      this.aP8[0] = pppadto.this.AV11PMDTinPrc;
      this.aP9[0] = pppadto.this.AV12PMDAcaPrc;
      this.aP10[0] = pppadto.this.AV15PMDKgmMinS;
      this.aP11[0] = pppadto.this.AV17MtsMinS;
      this.aP12[0] = pppadto.this.AV19OkKgMin;
      this.aP13[0] = pppadto.this.AV28PMDPreUni;
      Application.commitDataStores(context, remoteHandle, pr_default, "pppadto");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int5 = new int[1] ;
      scmdbuf = "" ;
      P037O2_A396EmprCod = new String[] {""} ;
      P037O2_A30AlbProCod = new long[1] ;
      P037O2_A129BarCod = new int[1] ;
      P037O2_A132BarCodReo = new byte[1] ;
      P037O2_A130BarCodPar = new String[] {""} ;
      P037O2_A2395BarAlbExt = new int[1] ;
      P037O2_n2395BarAlbExt = new boolean[] {false} ;
      P037O2_A5019AlbHdrgm2 = new short[1] ;
      P037O2_A3271AlbHdrAnc = new short[1] ;
      P037O2_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037O2_A6815BarPreFKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037O2_n6815BarPreFKg = new boolean[] {false} ;
      P037O2_A2762AlbBarDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037O2_n2762AlbBarDto = new boolean[] {false} ;
      P037O2_A2761AlbBarRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037O2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037O2_A2243BarKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037O2_n2243BarKgsCli = new boolean[] {false} ;
      P037O2_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A6815BarPreFKg = DecimalUtil.ZERO ;
      A2762AlbBarDto = DecimalUtil.ZERO ;
      A2761AlbBarRec = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A2243BarKgsCli = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      P037O3_A252CliCod = new int[1] ;
      P037O3_n252CliCod = new boolean[] {false} ;
      P037O3_A361DisCod = new int[1] ;
      P037O3_A5253BarAcc = new String[] {""} ;
      P037O3_A1909BarGraAca = new short[1] ;
      P037O3_A125BarAncAca1 = new short[1] ;
      A5253BarAcc = "" ;
      P037O4_A396EmprCod = new String[] {""} ;
      P037O5_A8400PMDPreLim = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037O5_n8400PMDPreLim = new boolean[] {false} ;
      P037O5_A8401PMDPreMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037O5_n8401PMDPreMin = new boolean[] {false} ;
      P037O5_A5648CliTipo = new String[] {""} ;
      P037O5_A13291CliFacFm = new String[] {""} ;
      P037O5_A13292CliFacFmt = new short[1] ;
      A8400PMDPreLim = DecimalUtil.ZERO ;
      A8401PMDPreMin = DecimalUtil.ZERO ;
      A5648CliTipo = "" ;
      A13291CliFacFm = "" ;
      P037O6_A388DisPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A388DisPreKgm = DecimalUtil.ZERO ;
      AV40clitipo = "" ;
      AV42CliFacFm = "" ;
      P037O9_A396EmprCod = new String[] {""} ;
      P037O9_A30AlbProCod = new long[1] ;
      P037O9_A129BarCod = new int[1] ;
      P037O9_A132BarCodReo = new byte[1] ;
      P037O9_A130BarCodPar = new String[] {""} ;
      P037O9_A457FasCod = new String[] {""} ;
      P037O9_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037O9_A8194GuiFasPBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037O9_n8194GuiFasPBK = new boolean[] {false} ;
      P037O9_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037O9_A8195GuiFasPBM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037O9_n8195GuiFasPBM = new boolean[] {false} ;
      P037O9_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037O9_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037O9_A7751GuiFasDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037O9_n7751GuiFasDto = new boolean[] {false} ;
      P037O9_A7752GuiFasRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037O9_n7752GuiFasRec = new boolean[] {false} ;
      P037O9_A1240GuiFasLin = new short[1] ;
      A457FasCod = "" ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A8194GuiFasPBK = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A8195GuiFasPBM = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A7751GuiFasDto = DecimalUtil.ZERO ;
      A7752GuiFasRec = DecimalUtil.ZERO ;
      P037O10_A252CliCod = new int[1] ;
      P037O10_n252CliCod = new boolean[] {false} ;
      P037O11_A396EmprCod = new String[] {""} ;
      P037O12_A4903FasAcab = new String[] {""} ;
      P037O12_n4903FasAcab = new boolean[] {false} ;
      A4903FasAcab = "" ;
      P037O13_A12577FasPreKgF = new String[] {""} ;
      P037O13_n12577FasPreKgF = new boolean[] {false} ;
      P037O13_A466FasPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037O13_n466FasPreKgm = new boolean[] {false} ;
      P037O13_A467FasPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037O13_n467FasPreMtr = new boolean[] {false} ;
      P037O13_A12576FasPreMt2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037O13_n12576FasPreMt2 = new boolean[] {false} ;
      A12577FasPreKgF = "" ;
      A466FasPreKgm = DecimalUtil.ZERO ;
      A467FasPreMtr = DecimalUtil.ZERO ;
      A12576FasPreMt2 = DecimalUtil.ZERO ;
      AV24FasKgm = DecimalUtil.ZERO ;
      AV23FasMtr = DecimalUtil.ZERO ;
      AV25Ancho = DecimalUtil.ZERO ;
      AV16Kilos = DecimalUtil.ZERO ;
      AV14PreFas = DecimalUtil.ZERO ;
      AV18Metros = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pppadto__default(),
         new Object[] {
             new Object[] {
            P037O2_A396EmprCod, P037O2_A30AlbProCod, P037O2_A129BarCod, P037O2_A132BarCodReo, P037O2_A130BarCodPar, P037O2_A2395BarAlbExt, P037O2_n2395BarAlbExt, P037O2_A5019AlbHdrgm2, P037O2_A3271AlbHdrAnc, P037O2_A1262BarPreKgm,
            P037O2_A6815BarPreFKg, P037O2_n6815BarPreFKg, P037O2_A2762AlbBarDto, P037O2_n2762AlbBarDto, P037O2_A2761AlbBarRec, P037O2_A1261BarAlbKgmE, P037O2_A2243BarKgsCli, P037O2_n2243BarKgsCli, P037O2_A1263BarAlbMtrE
            }
            , new Object[] {
            P037O3_A252CliCod, P037O3_n252CliCod, P037O3_A361DisCod, P037O3_A5253BarAcc, P037O3_A1909BarGraAca, P037O3_A125BarAncAca1
            }
            , new Object[] {
            P037O4_A396EmprCod
            }
            , new Object[] {
            P037O5_A8400PMDPreLim, P037O5_n8400PMDPreLim, P037O5_A8401PMDPreMin, P037O5_n8401PMDPreMin, P037O5_A5648CliTipo, P037O5_A13291CliFacFm, P037O5_A13292CliFacFmt
            }
            , new Object[] {
            P037O6_A388DisPreKgm
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P037O9_A396EmprCod, P037O9_A30AlbProCod, P037O9_A129BarCod, P037O9_A132BarCodReo, P037O9_A130BarCodPar, P037O9_A457FasCod, P037O9_A1275FasKgm, P037O9_A8194GuiFasPBK, P037O9_n8194GuiFasPBK, P037O9_A1276FasMtr,
            P037O9_A8195GuiFasPBM, P037O9_n8195GuiFasPBM, P037O9_A1242GuiFasPMt, P037O9_A1241GuiFasPKg, P037O9_A7751GuiFasDto, P037O9_n7751GuiFasDto, P037O9_A7752GuiFasRec, P037O9_n7752GuiFasRec, P037O9_A1240GuiFasLin
            }
            , new Object[] {
            P037O10_A252CliCod, P037O10_n252CliCod
            }
            , new Object[] {
            P037O11_A396EmprCod
            }
            , new Object[] {
            P037O12_A4903FasAcab, P037O12_n4903FasAcab
            }
            , new Object[] {
            P037O13_A12577FasPreKgF, P037O13_n12577FasPreKgF, P037O13_A466FasPreKgm, P037O13_n466FasPreKgm, P037O13_A467FasPreMtr, P037O13_n467FasPreMtr, P037O13_A12576FasPreMt2, P037O13_n12576FasPreMt2
            }
            , new Object[] {
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
   private byte AV19OkKgMin ;
   private byte AV36siLog ;
   private byte AV41PmlCliente ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte AV29PreUni ;
   private byte AV13OkPre ;
   private short A5019AlbHdrgm2 ;
   private short A3271AlbHdrAnc ;
   private short A1909BarGraAca ;
   private short A125BarAncAca1 ;
   private short A13292CliFacFmt ;
   private short AV27BarGraAca ;
   private short AV26BarAncAca1 ;
   private short AV43CliFacFmt ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV21ContVal ;
   private int AV38ValPml ;
   private int AV37Pml500 ;
   private int GXv_int5[] ;
   private int AV22GraHdr ;
   private int A2395BarAlbExt ;
   private int A252CliCod ;
   private int A361DisCod ;
   private int AV39Pml ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV8PMDDtoTin ;
   private java.math.BigDecimal AV9PMDDtoAca ;
   private java.math.BigDecimal AV10Precio ;
   private java.math.BigDecimal AV11PMDTinPrc ;
   private java.math.BigDecimal AV12PMDAcaPrc ;
   private java.math.BigDecimal AV15PMDKgmMinS ;
   private java.math.BigDecimal AV17MtsMinS ;
   private java.math.BigDecimal AV28PMDPreUni ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A6815BarPreFKg ;
   private java.math.BigDecimal A2762AlbBarDto ;
   private java.math.BigDecimal A2761AlbBarRec ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A2243BarKgsCli ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A8400PMDPreLim ;
   private java.math.BigDecimal A8401PMDPreMin ;
   private java.math.BigDecimal A388DisPreKgm ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A8194GuiFasPBK ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A8195GuiFasPBM ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A7751GuiFasDto ;
   private java.math.BigDecimal A7752GuiFasRec ;
   private java.math.BigDecimal A466FasPreKgm ;
   private java.math.BigDecimal A467FasPreMtr ;
   private java.math.BigDecimal A12576FasPreMt2 ;
   private java.math.BigDecimal AV24FasKgm ;
   private java.math.BigDecimal AV23FasMtr ;
   private java.math.BigDecimal AV25Ancho ;
   private java.math.BigDecimal AV16Kilos ;
   private java.math.BigDecimal AV14PreFas ;
   private java.math.BigDecimal AV18Metros ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A5253BarAcc ;
   private String A5648CliTipo ;
   private String A13291CliFacFm ;
   private String AV40clitipo ;
   private String AV42CliFacFm ;
   private String A457FasCod ;
   private String A4903FasAcab ;
   private String A12577FasPreKgF ;
   private boolean n2395BarAlbExt ;
   private boolean n6815BarPreFKg ;
   private boolean n2762AlbBarDto ;
   private boolean n2243BarKgsCli ;
   private boolean n252CliCod ;
   private boolean n8400PMDPreLim ;
   private boolean n8401PMDPreMin ;
   private boolean n8194GuiFasPBK ;
   private boolean n8195GuiFasPBM ;
   private boolean n7751GuiFasDto ;
   private boolean n7752GuiFasRec ;
   private boolean n4903FasAcab ;
   private boolean n12577FasPreKgF ;
   private boolean n466FasPreKgm ;
   private boolean n467FasPreMtr ;
   private boolean n12576FasPreMt2 ;
   private java.math.BigDecimal[] aP13 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private byte[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P037O2_A396EmprCod ;
   private long[] P037O2_A30AlbProCod ;
   private int[] P037O2_A129BarCod ;
   private byte[] P037O2_A132BarCodReo ;
   private String[] P037O2_A130BarCodPar ;
   private int[] P037O2_A2395BarAlbExt ;
   private boolean[] P037O2_n2395BarAlbExt ;
   private short[] P037O2_A5019AlbHdrgm2 ;
   private short[] P037O2_A3271AlbHdrAnc ;
   private java.math.BigDecimal[] P037O2_A1262BarPreKgm ;
   private java.math.BigDecimal[] P037O2_A6815BarPreFKg ;
   private boolean[] P037O2_n6815BarPreFKg ;
   private java.math.BigDecimal[] P037O2_A2762AlbBarDto ;
   private boolean[] P037O2_n2762AlbBarDto ;
   private java.math.BigDecimal[] P037O2_A2761AlbBarRec ;
   private java.math.BigDecimal[] P037O2_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P037O2_A2243BarKgsCli ;
   private boolean[] P037O2_n2243BarKgsCli ;
   private java.math.BigDecimal[] P037O2_A1263BarAlbMtrE ;
   private int[] P037O3_A252CliCod ;
   private boolean[] P037O3_n252CliCod ;
   private int[] P037O3_A361DisCod ;
   private String[] P037O3_A5253BarAcc ;
   private short[] P037O3_A1909BarGraAca ;
   private short[] P037O3_A125BarAncAca1 ;
   private String[] P037O4_A396EmprCod ;
   private java.math.BigDecimal[] P037O5_A8400PMDPreLim ;
   private boolean[] P037O5_n8400PMDPreLim ;
   private java.math.BigDecimal[] P037O5_A8401PMDPreMin ;
   private boolean[] P037O5_n8401PMDPreMin ;
   private String[] P037O5_A5648CliTipo ;
   private String[] P037O5_A13291CliFacFm ;
   private short[] P037O5_A13292CliFacFmt ;
   private java.math.BigDecimal[] P037O6_A388DisPreKgm ;
   private String[] P037O9_A396EmprCod ;
   private long[] P037O9_A30AlbProCod ;
   private int[] P037O9_A129BarCod ;
   private byte[] P037O9_A132BarCodReo ;
   private String[] P037O9_A130BarCodPar ;
   private String[] P037O9_A457FasCod ;
   private java.math.BigDecimal[] P037O9_A1275FasKgm ;
   private java.math.BigDecimal[] P037O9_A8194GuiFasPBK ;
   private boolean[] P037O9_n8194GuiFasPBK ;
   private java.math.BigDecimal[] P037O9_A1276FasMtr ;
   private java.math.BigDecimal[] P037O9_A8195GuiFasPBM ;
   private boolean[] P037O9_n8195GuiFasPBM ;
   private java.math.BigDecimal[] P037O9_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P037O9_A1241GuiFasPKg ;
   private java.math.BigDecimal[] P037O9_A7751GuiFasDto ;
   private boolean[] P037O9_n7751GuiFasDto ;
   private java.math.BigDecimal[] P037O9_A7752GuiFasRec ;
   private boolean[] P037O9_n7752GuiFasRec ;
   private short[] P037O9_A1240GuiFasLin ;
   private int[] P037O10_A252CliCod ;
   private boolean[] P037O10_n252CliCod ;
   private String[] P037O11_A396EmprCod ;
   private String[] P037O12_A4903FasAcab ;
   private boolean[] P037O12_n4903FasAcab ;
   private String[] P037O13_A12577FasPreKgF ;
   private boolean[] P037O13_n12577FasPreKgF ;
   private java.math.BigDecimal[] P037O13_A466FasPreKgm ;
   private boolean[] P037O13_n466FasPreKgm ;
   private java.math.BigDecimal[] P037O13_A467FasPreMtr ;
   private boolean[] P037O13_n467FasPreMtr ;
   private java.math.BigDecimal[] P037O13_A12576FasPreMt2 ;
   private boolean[] P037O13_n12576FasPreMt2 ;
}

final  class pppadto__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P037O2", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarAlbExt, AlbHdrgm2, AlbHdrAnc, BarPreKgm, BarPreFKg, AlbBarDto, AlbBarRec, BarAlbKgmE, BarKgsCli, BarAlbMtrE FROM TXPALBBAR WHERE (EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?)  FOR UPDATE OF BarAlbExt, BarPreKgm, BarPreFKg, AlbBarDto, AlbBarRec, BarAlbKgmE, BarKgsCli, BarAlbMtrE NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P037O3", "SELECT CliCod, DisCod, BarAcc, BarGraAca, BarAncAca1 FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P037O4", "SELECT EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P037O5", "SELECT PMDPreLim, PMDPreMin, CliTipo, CliFacFm, CliFacFmt FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P037O6", "SELECT DisPreKgm FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ?  FOR UPDATE OF DisPreKgm NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P037O7", "UPDATE TXPBARCAD SET BarAcc=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new UpdateCursor("P037O8", "UPDATE TXPDISPOS SET DisPreKgm=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISPOS")
         ,new ForEachCursor("P037O9", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, FasCod, FasKgm, GuiFasPBK, FasMtr, GuiFasPBM, GuiFasPMt, GuiFasPKg, GuiFasDto, GuiFasRec, GuiFasLin FROM TXPALBFAS WHERE (EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) AND (EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar  FOR UPDATE OF FasKgm, GuiFasPBK, FasMtr, GuiFasPBM, GuiFasPMt, GuiFasPKg, GuiFasDto, GuiFasRec NOWAIT",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P037O10", "SELECT CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P037O11", "SELECT EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P037O12", "SELECT FasAcab FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P037O13", "SELECT FasPreKgF, FasPreKgm, FasPreMtr, FasPreMt2 FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ? AND FasCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P037O14", "UPDATE TXPALBFAS SET FasKgm=?, GuiFasPBK=?, FasMtr=?, GuiFasPBM=?, GuiFasPMt=?, GuiFasPKg=?, GuiFasDto=?, GuiFasRec=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND GuiFasLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new UpdateCursor("P037O15", "DELETE FROM TXPALBFAS  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new UpdateCursor("P037O16", "UPDATE TXPALBBAR SET BarAlbExt=?, BarPreKgm=?, BarPreFKg=?, AlbBarDto=?, AlbBarRec=?, BarAlbKgmE=?, BarKgsCli=?, BarAlbMtrE=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
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
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(12,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(15,2);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               return;
            case 4 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,5);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(14,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(15);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(3,5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 6 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 7 :
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
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 8);
               return;
            case 12 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 5);
               }
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 5);
               }
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 5);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[7], 5);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[11], 2);
               }
               stmt.setString(9, (String)parms[12], 3);
               stmt.setLong(10, ((Number) parms[13]).longValue());
               stmt.setInt(11, ((Number) parms[14]).intValue());
               stmt.setByte(12, ((Number) parms[15]).byteValue());
               stmt.setString(13, (String)parms[16], 1);
               stmt.setShort(14, ((Number) parms[17]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 5);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 5);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[6], 2);
               }
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[7], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[8], 2);
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[10], 2);
               }
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[11], 2);
               stmt.setString(9, (String)parms[12], 3);
               stmt.setLong(10, ((Number) parms[13]).longValue());
               stmt.setInt(11, ((Number) parms[14]).intValue());
               stmt.setByte(12, ((Number) parms[15]).byteValue());
               stmt.setString(13, (String)parms[16], 1);
               return;
      }
   }

}

