package app.lectoroptico ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pacfbar3 extends GXProcedure
{
   public pacfbar3( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pacfbar3.class ), "" );
   }

   public pacfbar3( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            byte[] aP2 ,
                            String[] aP3 )
   {
      pacfbar3.this.aP4 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      pacfbar3.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pacfbar3.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pacfbar3.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pacfbar3.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pacfbar3.this.A194BarOrdLin = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV49TiReal ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TIREAL", ""), GXv_int2) ;
      pacfbar3.this.GXt_int1 = GXv_int2[0] ;
      AV49TiReal = GXt_int1 ;
      GXt_int1 = AV50Carvema ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int2) ;
      pacfbar3.this.GXt_int1 = GXv_int2[0] ;
      AV50Carvema = GXt_int1 ;
      /* Using cursor P01142 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A120BarAgrEst = P01142_A120BarAgrEst[0] ;
         AV42BarAGrest = A120BarAgrEst ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV23HisProF = httpContext.getMessage( "N", "") ;
      AV33Cont = 0 ;
      AV38Kilos = DecimalUtil.doubleToDec(0) ;
      AV39Metros = DecimalUtil.doubleToDec(0) ;
      AV47Hisprodtil = GXutil.resetTime( GXutil.nullDate() );
      AV48Hisprodtfl = GXutil.resetTime( GXutil.nullDate() );
      AV45HisProdti = GXutil.resetTime( GXutil.nullDate() );
      AV46HisProdtf = GXutil.resetTime( GXutil.nullDate() );
      /* Using cursor P01143 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A656ParCod = P01143_A656ParCod[0] ;
         n656ParCod = P01143_n656ParCod[0] ;
         A602MaqCod = P01143_A602MaqCod[0] ;
         n602MaqCod = P01143_n602MaqCod[0] ;
         A568HisProUni = P01143_A568HisProUni[0] ;
         A1525HisProKgr = P01143_A1525HisProKgr[0] ;
         A1526HisProMtr = P01143_A1526HisProMtr[0] ;
         A557HisProF = P01143_A557HisProF[0] ;
         A561HisProLin = P01143_A561HisProLin[0] ;
         A558HisProFec = P01143_A558HisProFec[0] ;
         A4440HisProDTI = P01143_A4440HisProDTI[0] ;
         n4440HisProDTI = P01143_n4440HisProDTI[0] ;
         A4441HisProDTF = P01143_A4441HisProDTF[0] ;
         n4441HisProDTF = P01143_n4441HisProDTF[0] ;
         A563HisProMin = P01143_A563HisProMin[0] ;
         A560HisProHin = P01143_A560HisProHin[0] ;
         A562HisProMfi = P01143_A562HisProMfi[0] ;
         A559HisProHfi = P01143_A559HisProHfi[0] ;
         if ( A560HisProHin <= A559HisProHfi )
         {
            A564HisProTre = (short)(((A559HisProHfi*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
         }
         else
         {
            A564HisProTre = (short)((((A559HisProHfi+24)*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
         }
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         if ( A656ParCod == 0 )
         {
            AV33Cont = (int)(AV33Cont+1) ;
            if ( AV33Cont == 1 )
            {
               AV24HisProHin = A560HisProHin ;
               AV25HisProMin = A563HisProMin ;
               AV26HisProHFi = A559HisProHfi ;
               AV27HisProMFi = A562HisProMfi ;
               AV17HisProFec = A558HisProFec ;
               AV45HisProdti = A4440HisProDTI ;
               AV46HisProdtf = A4441HisProDTF ;
               AV16MaqCod = A602MaqCod ;
            }
            else
            {
               if ( GXutil.resetTime(A558HisProFec).before( GXutil.resetTime( AV17HisProFec )) )
               {
                  AV17HisProFec = A558HisProFec ;
                  AV24HisProHin = A560HisProHin ;
                  AV25HisProMin = A563HisProMin ;
                  AV26HisProHFi = A559HisProHfi ;
                  AV27HisProMFi = A562HisProMfi ;
                  AV16MaqCod = A602MaqCod ;
               }
               if ( ( ! GXutil.dateCompare(GXutil.nullDate(), A4440HisProDTI) && A4440HisProDTI.before( AV45HisProdti ) ) )
               {
                  AV45HisProdti = A4440HisProDTI ;
               }
               if ( ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( AV46HisProdtf ) ) )
               {
                  AV46HisProdtf = A4441HisProDTF ;
               }
            }
            if ( AV49TiReal == 0 )
            {
               AV22HisProTre = (short)(AV22HisProTre+A564HisProTre) ;
            }
            else
            {
               AV22HisProTre = (short)(AV22HisProTre+A5605HisProTr2) ;
            }
            AV32HisProUni = AV32HisProUni.add(A568HisProUni) ;
            AV38Kilos = AV38Kilos.add(A1525HisProKgr) ;
            AV39Metros = AV39Metros.add(A1526HisProMtr) ;
            if ( GXutil.strcmp(A557HisProF, httpContext.getMessage( "S", "")) == 0 )
            {
               AV23HisProF = A557HisProF ;
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P01144 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A457FasCod = P01144_A457FasCod[0] ;
         A758ProCod = P01144_A758ProCod[0] ;
         A602MaqCod = P01144_A602MaqCod[0] ;
         n602MaqCod = P01144_n602MaqCod[0] ;
         A153BarFasEst = P01144_A153BarFasEst[0] ;
         A227BarUni = P01144_A227BarUni[0] ;
         A160BarFecRea = P01144_A160BarFecRea[0] ;
         A3298BarFecRIni = P01144_A3298BarFecRIni[0] ;
         A603MaqCodBis = P01144_A603MaqCodBis[0] ;
         A215BarTieRea = P01144_A215BarTieRea[0] ;
         A165BarHorIni = P01144_A165BarHorIni[0] ;
         A164BarHorFin = P01144_A164BarHorFin[0] ;
         A4442BarFasDTI = P01144_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P01144_n4442BarFasDTI[0] ;
         A4443BarFasDTF = P01144_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P01144_n4443BarFasDTF[0] ;
         A150BarFacTin = P01144_A150BarFacTin[0] ;
         A6012BarFasTip = P01144_A6012BarFasTip[0] ;
         n6012BarFasTip = P01144_n6012BarFasTip[0] ;
         A3837BarFasKgm = P01144_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P01144_n3837BarFasKgm[0] ;
         A3838BarFasMtr = P01144_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P01144_n3838BarFasMtr[0] ;
         A5719BarFasKgT = P01144_A5719BarFasKgT[0] ;
         n5719BarFasKgT = P01144_n5719BarFasKgT[0] ;
         A5720BarFasMtT = P01144_A5720BarFasMtT[0] ;
         n5720BarFasMtT = P01144_n5720BarFasMtT[0] ;
         A602MaqCod = P01144_A602MaqCod[0] ;
         n602MaqCod = P01144_n602MaqCod[0] ;
         if ( AV33Cont == 0 )
         {
            A153BarFasEst = (byte)(0) ;
            A227BarUni = DecimalUtil.ZERO ;
            A160BarFecRea = GXutil.nullDate() ;
            A3298BarFecRIni = GXutil.nullDate() ;
            A603MaqCodBis = A602MaqCod ;
            A215BarTieRea = DecimalUtil.ZERO ;
            A165BarHorIni = (short)(0) ;
            A164BarHorFin = (short)(0) ;
            A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
            n4442BarFasDTI = false ;
            A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
            n4443BarFasDTF = false ;
            AV44Recmaq = (byte)(0) ;
            if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
            {
               AV43RECRECEP = (byte)(0) ;
               AV44Recmaq = (byte)(1) ;
            }
            if ( ( AV50Carvema == 1 ) && ( GXutil.strcmp(A6012BarFasTip, httpContext.getMessage( "P", "")) == 0 ) )
            {
               A6012BarFasTip = "*" ;
               n6012BarFasTip = false ;
            }
            A3837BarFasKgm = DecimalUtil.doubleToDec(0) ;
            n3837BarFasKgm = false ;
            A3838BarFasMtr = DecimalUtil.doubleToDec(0) ;
            n3838BarFasMtr = false ;
            A5719BarFasKgT = DecimalUtil.doubleToDec(0) ;
            n5719BarFasKgT = false ;
            A5720BarFasMtT = DecimalUtil.doubleToDec(0) ;
            n5720BarFasMtT = false ;
            /* Optimized DELETE. */
            /* Using cursor P01145 */
            pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASBOT");
            /* End optimized DELETE. */
         }
         else
         {
            if ( GXutil.strcmp(AV23HisProF, httpContext.getMessage( "N", "")) == 0 )
            {
               AV44Recmaq = (byte)(0) ;
               A153BarFasEst = (byte)(1) ;
               A164BarHorFin = (short)(0) ;
               if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
               {
                  AV43RECRECEP = (byte)(0) ;
                  AV44Recmaq = (byte)(1) ;
               }
            }
            else
            {
               A153BarFasEst = (byte)(2) ;
            }
            A227BarUni = AV32HisProUni ;
            A160BarFecRea = AV17HisProFec ;
            A603MaqCodBis = AV16MaqCod ;
            AV36BarTieRea = DecimalUtil.doubleToDec(AV22HisProTre/ (double) (60)) ;
            AV35BarTie2 = DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(AV36BarTieRea))) ;
            AV37Resto = AV36BarTieRea.subtract(AV35BarTie2) ;
            A215BarTieRea = AV35BarTie2.add(((AV37Resto.multiply(DecimalUtil.doubleToDec(60))).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
            A165BarHorIni = (short)(AV24HisProHin*100+AV25HisProMin) ;
            A164BarHorFin = (short)(AV26HisProHFi*100+AV27HisProMFi) ;
            A4442BarFasDTI = AV45HisProdti ;
            n4442BarFasDTI = false ;
            A4443BarFasDTF = AV46HisProdtf ;
            n4443BarFasDTF = false ;
            AV40Tot_k = AV38Kilos ;
            AV41Tot_m = AV39Metros ;
            if ( ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(AV42BarAGrest, httpContext.getMessage( "S", "")) == 0 ) )
            {
               GXv_char3[0] = A396EmprCod ;
               GXv_int4[0] = A129BarCod ;
               GXv_int2[0] = A132BarCodReo ;
               GXv_char5[0] = A130BarCodPar ;
               GXv_decimal6[0] = AV40Tot_k ;
               GXv_decimal7[0] = AV41Tot_m ;
               new app.pakmtot(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int2, GXv_char5, GXv_decimal6, GXv_decimal7) ;
               pacfbar3.this.A396EmprCod = GXv_char3[0] ;
               pacfbar3.this.A129BarCod = GXv_int4[0] ;
               pacfbar3.this.A132BarCodReo = GXv_int2[0] ;
               pacfbar3.this.A130BarCodPar = GXv_char5[0] ;
               pacfbar3.this.AV40Tot_k = GXv_decimal6[0] ;
               pacfbar3.this.AV41Tot_m = GXv_decimal7[0] ;
            }
            A3837BarFasKgm = AV38Kilos ;
            n3837BarFasKgm = false ;
            A3838BarFasMtr = AV39Metros ;
            n3838BarFasMtr = false ;
            if ( ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 ) && ( GXutil.strcmp(AV42BarAGrest, httpContext.getMessage( "S", "")) == 0 ) )
            {
               A5719BarFasKgT = AV40Tot_k ;
               n5719BarFasKgT = false ;
               A5720BarFasMtT = AV41Tot_m ;
               n5720BarFasMtT = false ;
            }
            else
            {
               A5719BarFasKgT = AV38Kilos ;
               n5719BarFasKgT = false ;
               A5720BarFasMtT = AV39Metros ;
               n5720BarFasMtT = false ;
            }
         }
         /* Using cursor P01146 */
         pr_default.execute(4, new Object[] {Byte.valueOf(A153BarFasEst), A227BarUni, A160BarFecRea, A3298BarFecRIni, A603MaqCodBis, A215BarTieRea, Short.valueOf(A165BarHorIni), Short.valueOf(A164BarHorFin), Boolean.valueOf(n4442BarFasDTI), A4442BarFasDTI, Boolean.valueOf(n4443BarFasDTF), A4443BarFasDTF, Boolean.valueOf(n6012BarFasTip), A6012BarFasTip, Boolean.valueOf(n3837BarFasKgm), A3837BarFasKgm, Boolean.valueOf(n3838BarFasMtr), A3838BarFasMtr, Boolean.valueOf(n5719BarFasKgT), A5719BarFasKgT, Boolean.valueOf(n5720BarFasMtT), A5720BarFasMtT, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( AV44Recmaq == 1 )
      {
         /* Using cursor P01147 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A4701RecRecep = P01147_A4701RecRecep[0] ;
            A2804RecLinMaq = P01147_A2804RecLinMaq[0] ;
            if ( A4701RecRecep == 1 )
            {
               A4701RecRecep = (byte)(0) ;
            }
            /* Using cursor P01148 */
            pr_default.execute(6, new Object[] {Byte.valueOf(A4701RecRecep), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRECMAQ");
            pr_default.readNext(5);
         }
         pr_default.close(5);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pacfbar3.this.A396EmprCod;
      this.aP1[0] = pacfbar3.this.A129BarCod;
      this.aP2[0] = pacfbar3.this.A132BarCodReo;
      this.aP3[0] = pacfbar3.this.A130BarCodPar;
      this.aP4[0] = pacfbar3.this.A194BarOrdLin;
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
      P01142_A396EmprCod = new String[] {""} ;
      P01142_A129BarCod = new int[1] ;
      P01142_A132BarCodReo = new byte[1] ;
      P01142_A130BarCodPar = new String[] {""} ;
      P01142_A120BarAgrEst = new String[] {""} ;
      A120BarAgrEst = "" ;
      AV42BarAGrest = "" ;
      AV23HisProF = "" ;
      AV38Kilos = DecimalUtil.ZERO ;
      AV39Metros = DecimalUtil.ZERO ;
      AV47Hisprodtil = GXutil.resetTime( GXutil.nullDate() );
      AV48Hisprodtfl = GXutil.resetTime( GXutil.nullDate() );
      AV45HisProdti = GXutil.resetTime( GXutil.nullDate() );
      AV46HisProdtf = GXutil.resetTime( GXutil.nullDate() );
      P01143_A396EmprCod = new String[] {""} ;
      P01143_A129BarCod = new int[1] ;
      P01143_A132BarCodReo = new byte[1] ;
      P01143_A130BarCodPar = new String[] {""} ;
      P01143_A194BarOrdLin = new short[1] ;
      P01143_A656ParCod = new short[1] ;
      P01143_n656ParCod = new boolean[] {false} ;
      P01143_A602MaqCod = new String[] {""} ;
      P01143_n602MaqCod = new boolean[] {false} ;
      P01143_A568HisProUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01143_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01143_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01143_A557HisProF = new String[] {""} ;
      P01143_A561HisProLin = new int[1] ;
      P01143_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P01143_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P01143_n4440HisProDTI = new boolean[] {false} ;
      P01143_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P01143_n4441HisProDTF = new boolean[] {false} ;
      P01143_A563HisProMin = new byte[1] ;
      P01143_A560HisProHin = new byte[1] ;
      P01143_A562HisProMfi = new byte[1] ;
      P01143_A559HisProHfi = new byte[1] ;
      A602MaqCod = "" ;
      A568HisProUni = DecimalUtil.ZERO ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A557HisProF = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      AV17HisProFec = GXutil.nullDate() ;
      AV16MaqCod = "" ;
      AV32HisProUni = DecimalUtil.ZERO ;
      P01144_A457FasCod = new String[] {""} ;
      P01144_A396EmprCod = new String[] {""} ;
      P01144_A129BarCod = new int[1] ;
      P01144_A132BarCodReo = new byte[1] ;
      P01144_A130BarCodPar = new String[] {""} ;
      P01144_A194BarOrdLin = new short[1] ;
      P01144_A758ProCod = new String[] {""} ;
      P01144_A602MaqCod = new String[] {""} ;
      P01144_n602MaqCod = new boolean[] {false} ;
      P01144_A153BarFasEst = new byte[1] ;
      P01144_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01144_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P01144_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      P01144_A603MaqCodBis = new String[] {""} ;
      P01144_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01144_A165BarHorIni = new short[1] ;
      P01144_A164BarHorFin = new short[1] ;
      P01144_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P01144_n4442BarFasDTI = new boolean[] {false} ;
      P01144_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P01144_n4443BarFasDTF = new boolean[] {false} ;
      P01144_A150BarFacTin = new String[] {""} ;
      P01144_A6012BarFasTip = new String[] {""} ;
      P01144_n6012BarFasTip = new boolean[] {false} ;
      P01144_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01144_n3837BarFasKgm = new boolean[] {false} ;
      P01144_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01144_n3838BarFasMtr = new boolean[] {false} ;
      P01144_A5719BarFasKgT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01144_n5719BarFasKgT = new boolean[] {false} ;
      P01144_A5720BarFasMtT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01144_n5720BarFasMtT = new boolean[] {false} ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      A227BarUni = DecimalUtil.ZERO ;
      A160BarFecRea = GXutil.nullDate() ;
      A3298BarFecRIni = GXutil.nullDate() ;
      A603MaqCodBis = "" ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A150BarFacTin = "" ;
      A6012BarFasTip = "" ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A5719BarFasKgT = DecimalUtil.ZERO ;
      A5720BarFasMtT = DecimalUtil.ZERO ;
      AV36BarTieRea = DecimalUtil.ZERO ;
      AV35BarTie2 = DecimalUtil.ZERO ;
      AV37Resto = DecimalUtil.ZERO ;
      AV40Tot_k = DecimalUtil.ZERO ;
      AV41Tot_m = DecimalUtil.ZERO ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      P01147_A396EmprCod = new String[] {""} ;
      P01147_A129BarCod = new int[1] ;
      P01147_A132BarCodReo = new byte[1] ;
      P01147_A130BarCodPar = new String[] {""} ;
      P01147_A4701RecRecep = new byte[1] ;
      P01147_A2804RecLinMaq = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.lectoroptico.pacfbar3__default(),
         new Object[] {
             new Object[] {
            P01142_A396EmprCod, P01142_A129BarCod, P01142_A132BarCodReo, P01142_A130BarCodPar, P01142_A120BarAgrEst
            }
            , new Object[] {
            P01143_A396EmprCod, P01143_A129BarCod, P01143_A132BarCodReo, P01143_A130BarCodPar, P01143_A194BarOrdLin, P01143_A656ParCod, P01143_n656ParCod, P01143_A602MaqCod, P01143_A568HisProUni, P01143_A1525HisProKgr,
            P01143_A1526HisProMtr, P01143_A557HisProF, P01143_A561HisProLin, P01143_A558HisProFec, P01143_A4440HisProDTI, P01143_n4440HisProDTI, P01143_A4441HisProDTF, P01143_n4441HisProDTF, P01143_A563HisProMin, P01143_A560HisProHin,
            P01143_A562HisProMfi, P01143_A559HisProHfi
            }
            , new Object[] {
            P01144_A457FasCod, P01144_A396EmprCod, P01144_A129BarCod, P01144_A132BarCodReo, P01144_A130BarCodPar, P01144_A194BarOrdLin, P01144_A758ProCod, P01144_A602MaqCod, P01144_n602MaqCod, P01144_A153BarFasEst,
            P01144_A227BarUni, P01144_A160BarFecRea, P01144_A3298BarFecRIni, P01144_A603MaqCodBis, P01144_A215BarTieRea, P01144_A165BarHorIni, P01144_A164BarHorFin, P01144_A4442BarFasDTI, P01144_n4442BarFasDTI, P01144_A4443BarFasDTF,
            P01144_n4443BarFasDTF, P01144_A150BarFacTin, P01144_A6012BarFasTip, P01144_n6012BarFasTip, P01144_A3837BarFasKgm, P01144_n3837BarFasKgm, P01144_A3838BarFasMtr, P01144_n3838BarFasMtr, P01144_A5719BarFasKgT, P01144_n5719BarFasKgT,
            P01144_A5720BarFasMtT, P01144_n5720BarFasMtT
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01147_A396EmprCod, P01147_A129BarCod, P01147_A132BarCodReo, P01147_A130BarCodPar, P01147_A4701RecRecep, P01147_A2804RecLinMaq
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV49TiReal ;
   private byte AV50Carvema ;
   private byte GXt_int1 ;
   private byte A563HisProMin ;
   private byte A560HisProHin ;
   private byte A562HisProMfi ;
   private byte A559HisProHfi ;
   private byte AV24HisProHin ;
   private byte AV25HisProMin ;
   private byte AV26HisProHFi ;
   private byte AV27HisProMFi ;
   private byte A153BarFasEst ;
   private byte AV44Recmaq ;
   private byte AV43RECRECEP ;
   private byte GXv_int2[] ;
   private byte A4701RecRecep ;
   private short A194BarOrdLin ;
   private short A656ParCod ;
   private short A564HisProTre ;
   private short A5605HisProTr2 ;
   private short AV22HisProTre ;
   private short A165BarHorIni ;
   private short A164BarHorFin ;
   private short A2804RecLinMaq ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV33Cont ;
   private int A561HisProLin ;
   private int GXv_int4[] ;
   private java.math.BigDecimal AV38Kilos ;
   private java.math.BigDecimal AV39Metros ;
   private java.math.BigDecimal A568HisProUni ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal AV32HisProUni ;
   private java.math.BigDecimal A227BarUni ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal A5719BarFasKgT ;
   private java.math.BigDecimal A5720BarFasMtT ;
   private java.math.BigDecimal AV36BarTieRea ;
   private java.math.BigDecimal AV35BarTie2 ;
   private java.math.BigDecimal AV37Resto ;
   private java.math.BigDecimal AV40Tot_k ;
   private java.math.BigDecimal AV41Tot_m ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String scmdbuf ;
   private String A120BarAgrEst ;
   private String AV42BarAGrest ;
   private String AV23HisProF ;
   private String A602MaqCod ;
   private String A557HisProF ;
   private String AV16MaqCod ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String A603MaqCodBis ;
   private String A150BarFacTin ;
   private String A6012BarFasTip ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private java.util.Date AV47Hisprodtil ;
   private java.util.Date AV48Hisprodtfl ;
   private java.util.Date AV45HisProdti ;
   private java.util.Date AV46HisProdtf ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date A558HisProFec ;
   private java.util.Date AV17HisProFec ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date A3298BarFecRIni ;
   private boolean n656ParCod ;
   private boolean n602MaqCod ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private boolean n4442BarFasDTI ;
   private boolean n4443BarFasDTF ;
   private boolean n6012BarFasTip ;
   private boolean n3837BarFasKgm ;
   private boolean n3838BarFasMtr ;
   private boolean n5719BarFasKgT ;
   private boolean n5720BarFasMtT ;
   private short[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P01142_A396EmprCod ;
   private int[] P01142_A129BarCod ;
   private byte[] P01142_A132BarCodReo ;
   private String[] P01142_A130BarCodPar ;
   private String[] P01142_A120BarAgrEst ;
   private String[] P01143_A396EmprCod ;
   private int[] P01143_A129BarCod ;
   private byte[] P01143_A132BarCodReo ;
   private String[] P01143_A130BarCodPar ;
   private short[] P01143_A194BarOrdLin ;
   private short[] P01143_A656ParCod ;
   private boolean[] P01143_n656ParCod ;
   private String[] P01143_A602MaqCod ;
   private boolean[] P01143_n602MaqCod ;
   private java.math.BigDecimal[] P01143_A568HisProUni ;
   private java.math.BigDecimal[] P01143_A1525HisProKgr ;
   private java.math.BigDecimal[] P01143_A1526HisProMtr ;
   private String[] P01143_A557HisProF ;
   private int[] P01143_A561HisProLin ;
   private java.util.Date[] P01143_A558HisProFec ;
   private java.util.Date[] P01143_A4440HisProDTI ;
   private boolean[] P01143_n4440HisProDTI ;
   private java.util.Date[] P01143_A4441HisProDTF ;
   private boolean[] P01143_n4441HisProDTF ;
   private byte[] P01143_A563HisProMin ;
   private byte[] P01143_A560HisProHin ;
   private byte[] P01143_A562HisProMfi ;
   private byte[] P01143_A559HisProHfi ;
   private String[] P01144_A457FasCod ;
   private String[] P01144_A396EmprCod ;
   private int[] P01144_A129BarCod ;
   private byte[] P01144_A132BarCodReo ;
   private String[] P01144_A130BarCodPar ;
   private short[] P01144_A194BarOrdLin ;
   private String[] P01144_A758ProCod ;
   private String[] P01144_A602MaqCod ;
   private boolean[] P01144_n602MaqCod ;
   private byte[] P01144_A153BarFasEst ;
   private java.math.BigDecimal[] P01144_A227BarUni ;
   private java.util.Date[] P01144_A160BarFecRea ;
   private java.util.Date[] P01144_A3298BarFecRIni ;
   private String[] P01144_A603MaqCodBis ;
   private java.math.BigDecimal[] P01144_A215BarTieRea ;
   private short[] P01144_A165BarHorIni ;
   private short[] P01144_A164BarHorFin ;
   private java.util.Date[] P01144_A4442BarFasDTI ;
   private boolean[] P01144_n4442BarFasDTI ;
   private java.util.Date[] P01144_A4443BarFasDTF ;
   private boolean[] P01144_n4443BarFasDTF ;
   private String[] P01144_A150BarFacTin ;
   private String[] P01144_A6012BarFasTip ;
   private boolean[] P01144_n6012BarFasTip ;
   private java.math.BigDecimal[] P01144_A3837BarFasKgm ;
   private boolean[] P01144_n3837BarFasKgm ;
   private java.math.BigDecimal[] P01144_A3838BarFasMtr ;
   private boolean[] P01144_n3838BarFasMtr ;
   private java.math.BigDecimal[] P01144_A5719BarFasKgT ;
   private boolean[] P01144_n5719BarFasKgT ;
   private java.math.BigDecimal[] P01144_A5720BarFasMtT ;
   private boolean[] P01144_n5720BarFasMtT ;
   private String[] P01147_A396EmprCod ;
   private int[] P01147_A129BarCod ;
   private byte[] P01147_A132BarCodReo ;
   private String[] P01147_A130BarCodPar ;
   private byte[] P01147_A4701RecRecep ;
   private short[] P01147_A2804RecLinMaq ;
}

final  class pacfbar3__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01142", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrEst FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01143", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, ParCod, MaqCod, HisProUni, HisProKgr, HisProMtr, HisProF, HisProLin, HisProFec, HisProDTI, HisProDTF, HisProMin, HisProHin, HisProMfi, HisProHfi FROM TXPLHIPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, HisProFec, HisProLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01144", "SELECT T1.FasCod, T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin, T1.ProCod, T2.MaqCod, T1.BarFasEst, T1.BarUni, T1.BarFecRea, T1.BarFecRIni, T1.MaqCodBis, T1.BarTieRea, T1.BarHorIni, T1.BarHorFin, T1.BarFasDTI, T1.BarFasDTF, T1.BarFacTin, T1.BarFasTip, T1.BarFasKgm, T1.BarFasMtr, T1.BarFasKgT, T1.BarFasMtT FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.BarOrdLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01145", "DELETE FROM TXPFASBOT  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASBOT")
         ,new UpdateCursor("P01146", "UPDATE TXPBARFAS SET BarFasEst=?, BarUni=?, BarFecRea=?, BarFecRIni=?, MaqCodBis=?, BarTieRea=?, BarHorIni=?, BarHorFin=?, BarFasDTI=?, BarFasDTF=?, BarFasTip=?, BarFasKgm=?, BarFasMtr=?, BarFasKgT=?, BarFasMtT=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new ForEachCursor("P01147", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecRecep, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01148", "UPDATE TXPRECMAQ SET RecRecep=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRECMAQ")
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
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(15);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(16);
               ((byte[]) buf[19])[0] = rslt.getByte(17);
               ((byte[]) buf[20])[0] = rslt.getByte(18);
               ((byte[]) buf[21])[0] = rslt.getByte(19);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDate(11);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 6);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(19, 1);
               ((String[]) buf[22])[0] = rslt.getString(20, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(22,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(23,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 4 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 6);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[11], false);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[13], 1);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(12, (java.math.BigDecimal)parms[15], 2);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(15, (java.math.BigDecimal)parms[21], 2);
               }
               stmt.setString(16, (String)parms[22], 3);
               stmt.setInt(17, ((Number) parms[23]).intValue());
               stmt.setByte(18, ((Number) parms[24]).byteValue());
               stmt.setString(19, (String)parms[25], 1);
               stmt.setString(20, (String)parms[26], 8);
               stmt.setShort(21, ((Number) parms[27]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
      }
   }

}

