package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pparlav8 extends GXProcedure
{
   public pparlav8( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pparlav8.class ), "" );
   }

   public pparlav8( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 ,
                          byte[] aP2 ,
                          String[] aP3 ,
                          short[] aP4 )
   {
      pparlav8.this.aP5 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        int[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             int[] aP5 )
   {
      pparlav8.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pparlav8.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pparlav8.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pparlav8.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pparlav8.this.A194BarOrdLin = aP4[0];
      this.aP4 = aP4;
      pparlav8.this.AV37BarFasLot = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV56Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = A396EmprCod ;
      GXv_char2[0] = AV57EmprNom ;
      GXv_char3[0] = AV58UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV56Station, GXv_char1, GXv_char2, GXv_char3) ;
      pparlav8.this.A396EmprCod = GXv_char1[0] ;
      pparlav8.this.AV57EmprNom = GXv_char2[0] ;
      pparlav8.this.AV58UsurCod = GXv_char3[0] ;
      /* Using cursor P02F62 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin), Integer.valueOf(AV37BarFasLot)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4643BarFasLot = P02F62_A4643BarFasLot[0] ;
         A4303BarFasEst1 = P02F62_A4303BarFasEst1[0] ;
         n4303BarFasEst1 = P02F62_n4303BarFasEst1[0] ;
         A4307BarUni1 = P02F62_A4307BarUni1[0] ;
         n4307BarUni1 = P02F62_n4307BarUni1[0] ;
         A4305BarFecRea1 = P02F62_A4305BarFecRea1[0] ;
         n4305BarFecRea1 = P02F62_n4305BarFecRea1[0] ;
         A4304BarFecRIn1 = P02F62_A4304BarFecRIn1[0] ;
         n4304BarFecRIn1 = P02F62_n4304BarFecRIn1[0] ;
         A4927BarFasDti1 = P02F62_A4927BarFasDti1[0] ;
         n4927BarFasDti1 = P02F62_n4927BarFasDti1[0] ;
         A4928BarFasDtf1 = P02F62_A4928BarFasDtf1[0] ;
         n4928BarFasDtf1 = P02F62_n4928BarFasDtf1[0] ;
         A4310BarTieRea1 = P02F62_A4310BarTieRea1[0] ;
         n4310BarTieRea1 = P02F62_n4310BarTieRea1[0] ;
         A4308BarHorIni1 = P02F62_A4308BarHorIni1[0] ;
         n4308BarHorIni1 = P02F62_n4308BarHorIni1[0] ;
         A4309BarHorFin1 = P02F62_A4309BarHorFin1[0] ;
         n4309BarHorFin1 = P02F62_n4309BarHorFin1[0] ;
         A4311BarFasMtr1 = P02F62_A4311BarFasMtr1[0] ;
         n4311BarFasMtr1 = P02F62_n4311BarFasMtr1[0] ;
         A4312BarFasKgm1 = P02F62_A4312BarFasKgm1[0] ;
         n4312BarFasKgm1 = P02F62_n4312BarFasKgm1[0] ;
         A4647BarFasNPr1 = P02F62_A4647BarFasNPr1[0] ;
         n4647BarFasNPr1 = P02F62_n4647BarFasNPr1[0] ;
         A758ProCod = P02F62_A758ProCod[0] ;
         A4303BarFasEst1 = (byte)(0) ;
         n4303BarFasEst1 = false ;
         A4307BarUni1 = DecimalUtil.doubleToDec(0) ;
         n4307BarUni1 = false ;
         A4305BarFecRea1 = GXutil.nullDate() ;
         n4305BarFecRea1 = false ;
         A4304BarFecRIn1 = GXutil.nullDate() ;
         n4304BarFecRIn1 = false ;
         A4927BarFasDti1 = GXutil.resetTime( GXutil.nullDate() );
         n4927BarFasDti1 = false ;
         A4928BarFasDtf1 = GXutil.resetTime( GXutil.nullDate() );
         n4928BarFasDtf1 = false ;
         A4310BarTieRea1 = DecimalUtil.doubleToDec(0) ;
         n4310BarTieRea1 = false ;
         A4308BarHorIni1 = (short)(0) ;
         n4308BarHorIni1 = false ;
         A4309BarHorFin1 = (short)(0) ;
         n4309BarHorFin1 = false ;
         A4311BarFasMtr1 = DecimalUtil.doubleToDec(0) ;
         n4311BarFasMtr1 = false ;
         A4312BarFasKgm1 = DecimalUtil.doubleToDec(0) ;
         n4312BarFasKgm1 = false ;
         A4647BarFasNPr1 = (short)(0) ;
         n4647BarFasNPr1 = false ;
         AV55Inc_obs = httpContext.getMessage( "Tabla FASMAQ.Apertura Fase. Se inicializan los campos BarFasEst1,BarFasDti1, BarFasDtf1,etc", "") + GXutil.newLine( ) ;
         AV55Inc_obs += httpContext.getMessage( "OP        ", "") + GXutil.str( A129BarCod, 8, 0) + " " + A130BarCodPar + GXutil.newLine( ) ;
         AV55Inc_obs += httpContext.getMessage( "Partida   ", "") + GXutil.str( A4643BarFasLot, 6, 0) + GXutil.newLine( ) ;
         AV55Inc_obs += httpContext.getMessage( "BarOrdlin ", "") + GXutil.str( A194BarOrdLin, 4, 0) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV62Pgmname, AV58UsurCod, AV56Station, AV55Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         /* Using cursor P02F63 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n4303BarFasEst1), Byte.valueOf(A4303BarFasEst1), Boolean.valueOf(n4307BarUni1), A4307BarUni1, Boolean.valueOf(n4305BarFecRea1), A4305BarFecRea1, Boolean.valueOf(n4304BarFecRIn1), A4304BarFecRIn1, Boolean.valueOf(n4927BarFasDti1), A4927BarFasDti1, Boolean.valueOf(n4928BarFasDtf1), A4928BarFasDtf1, Boolean.valueOf(n4310BarTieRea1), A4310BarTieRea1, Boolean.valueOf(n4308BarHorIni1), Short.valueOf(A4308BarHorIni1), Boolean.valueOf(n4309BarHorFin1), Short.valueOf(A4309BarHorFin1), Boolean.valueOf(n4311BarFasMtr1), A4311BarFasMtr1, Boolean.valueOf(n4312BarFasKgm1), A4312BarFasKgm1, Boolean.valueOf(n4647BarFasNPr1), Short.valueOf(A4647BarFasNPr1), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASMAQ");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P02F64 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A153BarFasEst = P02F64_A153BarFasEst[0] ;
         A227BarUni = P02F64_A227BarUni[0] ;
         A160BarFecRea = P02F64_A160BarFecRea[0] ;
         A3298BarFecRIni = P02F64_A3298BarFecRIni[0] ;
         A4442BarFasDTI = P02F64_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P02F64_n4442BarFasDTI[0] ;
         A4443BarFasDTF = P02F64_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P02F64_n4443BarFasDTF[0] ;
         A603MaqCodBis = P02F64_A603MaqCodBis[0] ;
         A215BarTieRea = P02F64_A215BarTieRea[0] ;
         A165BarHorIni = P02F64_A165BarHorIni[0] ;
         A164BarHorFin = P02F64_A164BarHorFin[0] ;
         A3838BarFasMtr = P02F64_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P02F64_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P02F64_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P02F64_n3837BarFasKgm[0] ;
         A4636BarFasPzas = P02F64_A4636BarFasPzas[0] ;
         n4636BarFasPzas = P02F64_n4636BarFasPzas[0] ;
         A460FasDsc = P02F64_A460FasDsc[0] ;
         A457FasCod = P02F64_A457FasCod[0] ;
         A758ProCod = P02F64_A758ProCod[0] ;
         A460FasDsc = P02F64_A460FasDsc[0] ;
         A153BarFasEst = (byte)(0) ;
         A227BarUni = DecimalUtil.ZERO ;
         A160BarFecRea = GXutil.nullDate() ;
         A3298BarFecRIni = GXutil.nullDate() ;
         A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
         n4442BarFasDTI = false ;
         A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
         n4443BarFasDTF = false ;
         A603MaqCodBis = AV53MaqCod ;
         A215BarTieRea = DecimalUtil.ZERO ;
         A165BarHorIni = (short)(0) ;
         A164BarHorFin = (short)(0) ;
         A3838BarFasMtr = DecimalUtil.doubleToDec(0) ;
         n3838BarFasMtr = false ;
         A3837BarFasKgm = DecimalUtil.doubleToDec(0) ;
         n3837BarFasKgm = false ;
         A4636BarFasPzas = 0 ;
         n4636BarFasPzas = false ;
         AV55Inc_obs = httpContext.getMessage( "Tabla BARFAS.Apertura Fase.", "") + GXutil.newLine( ) ;
         AV55Inc_obs += httpContext.getMessage( "OP        ", "") + GXutil.str( A129BarCod, 8, 0) + " " + A130BarCodPar + GXutil.newLine( ) ;
         AV55Inc_obs += httpContext.getMessage( "BarOrdlin ", "") + GXutil.str( A194BarOrdLin, 4, 0) + GXutil.newLine( ) ;
         AV55Inc_obs += httpContext.getMessage( "Fase      ", "") + GXutil.trim( A457FasCod) + " " + GXutil.trim( A460FasDsc) + GXutil.newLine( ) ;
         AV55Inc_obs += httpContext.getMessage( "BarFasest ", "") + GXutil.str( A153BarFasEst, 1, 0) + GXutil.newLine( ) ;
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV62Pgmname, AV58UsurCod, AV56Station, AV55Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         /* Using cursor P02F65 */
         pr_default.execute(3, new Object[] {Byte.valueOf(A153BarFasEst), A227BarUni, A160BarFecRea, A3298BarFecRIni, Boolean.valueOf(n4442BarFasDTI), A4442BarFasDTI, Boolean.valueOf(n4443BarFasDTF), A4443BarFasDTF, A603MaqCodBis, A215BarTieRea, Short.valueOf(A165BarHorIni), Short.valueOf(A164BarHorFin), Boolean.valueOf(n3838BarFasMtr), A3838BarFasMtr, Boolean.valueOf(n3837BarFasKgm), A3837BarFasKgm, Boolean.valueOf(n4636BarFasPzas), Integer.valueOf(A4636BarFasPzas), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         pr_default.readNext(2);
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pparlav8.this.A396EmprCod;
      this.aP1[0] = pparlav8.this.A129BarCod;
      this.aP2[0] = pparlav8.this.A132BarCodReo;
      this.aP3[0] = pparlav8.this.A130BarCodPar;
      this.aP4[0] = pparlav8.this.A194BarOrdLin;
      this.aP5[0] = pparlav8.this.AV37BarFasLot;
      Application.commitDataStores(context, remoteHandle, pr_default, "pparlav8");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV56Station = "" ;
      GXv_char1 = new String[1] ;
      AV57EmprNom = "" ;
      GXv_char2 = new String[1] ;
      AV58UsurCod = "" ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P02F62_A396EmprCod = new String[] {""} ;
      P02F62_A129BarCod = new int[1] ;
      P02F62_A132BarCodReo = new byte[1] ;
      P02F62_A130BarCodPar = new String[] {""} ;
      P02F62_A194BarOrdLin = new short[1] ;
      P02F62_A4643BarFasLot = new int[1] ;
      P02F62_A4303BarFasEst1 = new byte[1] ;
      P02F62_n4303BarFasEst1 = new boolean[] {false} ;
      P02F62_A4307BarUni1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02F62_n4307BarUni1 = new boolean[] {false} ;
      P02F62_A4305BarFecRea1 = new java.util.Date[] {GXutil.nullDate()} ;
      P02F62_n4305BarFecRea1 = new boolean[] {false} ;
      P02F62_A4304BarFecRIn1 = new java.util.Date[] {GXutil.nullDate()} ;
      P02F62_n4304BarFecRIn1 = new boolean[] {false} ;
      P02F62_A4927BarFasDti1 = new java.util.Date[] {GXutil.nullDate()} ;
      P02F62_n4927BarFasDti1 = new boolean[] {false} ;
      P02F62_A4928BarFasDtf1 = new java.util.Date[] {GXutil.nullDate()} ;
      P02F62_n4928BarFasDtf1 = new boolean[] {false} ;
      P02F62_A4310BarTieRea1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02F62_n4310BarTieRea1 = new boolean[] {false} ;
      P02F62_A4308BarHorIni1 = new short[1] ;
      P02F62_n4308BarHorIni1 = new boolean[] {false} ;
      P02F62_A4309BarHorFin1 = new short[1] ;
      P02F62_n4309BarHorFin1 = new boolean[] {false} ;
      P02F62_A4311BarFasMtr1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02F62_n4311BarFasMtr1 = new boolean[] {false} ;
      P02F62_A4312BarFasKgm1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02F62_n4312BarFasKgm1 = new boolean[] {false} ;
      P02F62_A4647BarFasNPr1 = new short[1] ;
      P02F62_n4647BarFasNPr1 = new boolean[] {false} ;
      P02F62_A758ProCod = new String[] {""} ;
      A4307BarUni1 = DecimalUtil.ZERO ;
      A4305BarFecRea1 = GXutil.nullDate() ;
      A4304BarFecRIn1 = GXutil.nullDate() ;
      A4927BarFasDti1 = GXutil.resetTime( GXutil.nullDate() );
      A4928BarFasDtf1 = GXutil.resetTime( GXutil.nullDate() );
      A4310BarTieRea1 = DecimalUtil.ZERO ;
      A4311BarFasMtr1 = DecimalUtil.ZERO ;
      A4312BarFasKgm1 = DecimalUtil.ZERO ;
      A758ProCod = "" ;
      AV55Inc_obs = "" ;
      AV62Pgmname = "" ;
      P02F64_A396EmprCod = new String[] {""} ;
      P02F64_A129BarCod = new int[1] ;
      P02F64_A132BarCodReo = new byte[1] ;
      P02F64_A130BarCodPar = new String[] {""} ;
      P02F64_A194BarOrdLin = new short[1] ;
      P02F64_A153BarFasEst = new byte[1] ;
      P02F64_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02F64_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P02F64_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      P02F64_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P02F64_n4442BarFasDTI = new boolean[] {false} ;
      P02F64_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P02F64_n4443BarFasDTF = new boolean[] {false} ;
      P02F64_A603MaqCodBis = new String[] {""} ;
      P02F64_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02F64_A165BarHorIni = new short[1] ;
      P02F64_A164BarHorFin = new short[1] ;
      P02F64_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02F64_n3838BarFasMtr = new boolean[] {false} ;
      P02F64_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P02F64_n3837BarFasKgm = new boolean[] {false} ;
      P02F64_A4636BarFasPzas = new int[1] ;
      P02F64_n4636BarFasPzas = new boolean[] {false} ;
      P02F64_A460FasDsc = new String[] {""} ;
      P02F64_A457FasCod = new String[] {""} ;
      P02F64_A758ProCod = new String[] {""} ;
      A227BarUni = DecimalUtil.ZERO ;
      A160BarFecRea = GXutil.nullDate() ;
      A3298BarFecRIni = GXutil.nullDate() ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A603MaqCodBis = "" ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A460FasDsc = "" ;
      A457FasCod = "" ;
      AV53MaqCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pparlav8__default(),
         new Object[] {
             new Object[] {
            P02F62_A396EmprCod, P02F62_A129BarCod, P02F62_A132BarCodReo, P02F62_A130BarCodPar, P02F62_A194BarOrdLin, P02F62_A4643BarFasLot, P02F62_A4303BarFasEst1, P02F62_n4303BarFasEst1, P02F62_A4307BarUni1, P02F62_n4307BarUni1,
            P02F62_A4305BarFecRea1, P02F62_n4305BarFecRea1, P02F62_A4304BarFecRIn1, P02F62_n4304BarFecRIn1, P02F62_A4927BarFasDti1, P02F62_n4927BarFasDti1, P02F62_A4928BarFasDtf1, P02F62_n4928BarFasDtf1, P02F62_A4310BarTieRea1, P02F62_n4310BarTieRea1,
            P02F62_A4308BarHorIni1, P02F62_n4308BarHorIni1, P02F62_A4309BarHorFin1, P02F62_n4309BarHorFin1, P02F62_A4311BarFasMtr1, P02F62_n4311BarFasMtr1, P02F62_A4312BarFasKgm1, P02F62_n4312BarFasKgm1, P02F62_A4647BarFasNPr1, P02F62_n4647BarFasNPr1,
            P02F62_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P02F64_A396EmprCod, P02F64_A129BarCod, P02F64_A132BarCodReo, P02F64_A130BarCodPar, P02F64_A194BarOrdLin, P02F64_A153BarFasEst, P02F64_A227BarUni, P02F64_A160BarFecRea, P02F64_A3298BarFecRIni, P02F64_A4442BarFasDTI,
            P02F64_n4442BarFasDTI, P02F64_A4443BarFasDTF, P02F64_n4443BarFasDTF, P02F64_A603MaqCodBis, P02F64_A215BarTieRea, P02F64_A165BarHorIni, P02F64_A164BarHorFin, P02F64_A3838BarFasMtr, P02F64_n3838BarFasMtr, P02F64_A3837BarFasKgm,
            P02F64_n3837BarFasKgm, P02F64_A4636BarFasPzas, P02F64_n4636BarFasPzas, P02F64_A460FasDsc, P02F64_A457FasCod, P02F64_A758ProCod
            }
            , new Object[] {
            }
         }
      );
      AV62Pgmname = "PPARLAV8" ;
      /* GeneXus formulas. */
      AV62Pgmname = "PPARLAV8" ;
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A4303BarFasEst1 ;
   private byte A153BarFasEst ;
   private short A194BarOrdLin ;
   private short A4308BarHorIni1 ;
   private short A4309BarHorFin1 ;
   private short A4647BarFasNPr1 ;
   private short A165BarHorIni ;
   private short A164BarHorFin ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV37BarFasLot ;
   private int A4643BarFasLot ;
   private int A4636BarFasPzas ;
   private java.math.BigDecimal A4307BarUni1 ;
   private java.math.BigDecimal A4310BarTieRea1 ;
   private java.math.BigDecimal A4311BarFasMtr1 ;
   private java.math.BigDecimal A4312BarFasKgm1 ;
   private java.math.BigDecimal A227BarUni ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV56Station ;
   private String GXv_char1[] ;
   private String AV57EmprNom ;
   private String GXv_char2[] ;
   private String AV58UsurCod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A758ProCod ;
   private String AV62Pgmname ;
   private String A603MaqCodBis ;
   private String A460FasDsc ;
   private String A457FasCod ;
   private String AV53MaqCod ;
   private java.util.Date A4927BarFasDti1 ;
   private java.util.Date A4928BarFasDtf1 ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date A4305BarFecRea1 ;
   private java.util.Date A4304BarFecRIn1 ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date A3298BarFecRIni ;
   private boolean n4303BarFasEst1 ;
   private boolean n4307BarUni1 ;
   private boolean n4305BarFecRea1 ;
   private boolean n4304BarFecRIn1 ;
   private boolean n4927BarFasDti1 ;
   private boolean n4928BarFasDtf1 ;
   private boolean n4310BarTieRea1 ;
   private boolean n4308BarHorIni1 ;
   private boolean n4309BarHorFin1 ;
   private boolean n4311BarFasMtr1 ;
   private boolean n4312BarFasKgm1 ;
   private boolean n4647BarFasNPr1 ;
   private boolean n4442BarFasDTI ;
   private boolean n4443BarFasDTF ;
   private boolean n3838BarFasMtr ;
   private boolean n3837BarFasKgm ;
   private boolean n4636BarFasPzas ;
   private String AV55Inc_obs ;
   private int[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P02F62_A396EmprCod ;
   private int[] P02F62_A129BarCod ;
   private byte[] P02F62_A132BarCodReo ;
   private String[] P02F62_A130BarCodPar ;
   private short[] P02F62_A194BarOrdLin ;
   private int[] P02F62_A4643BarFasLot ;
   private byte[] P02F62_A4303BarFasEst1 ;
   private boolean[] P02F62_n4303BarFasEst1 ;
   private java.math.BigDecimal[] P02F62_A4307BarUni1 ;
   private boolean[] P02F62_n4307BarUni1 ;
   private java.util.Date[] P02F62_A4305BarFecRea1 ;
   private boolean[] P02F62_n4305BarFecRea1 ;
   private java.util.Date[] P02F62_A4304BarFecRIn1 ;
   private boolean[] P02F62_n4304BarFecRIn1 ;
   private java.util.Date[] P02F62_A4927BarFasDti1 ;
   private boolean[] P02F62_n4927BarFasDti1 ;
   private java.util.Date[] P02F62_A4928BarFasDtf1 ;
   private boolean[] P02F62_n4928BarFasDtf1 ;
   private java.math.BigDecimal[] P02F62_A4310BarTieRea1 ;
   private boolean[] P02F62_n4310BarTieRea1 ;
   private short[] P02F62_A4308BarHorIni1 ;
   private boolean[] P02F62_n4308BarHorIni1 ;
   private short[] P02F62_A4309BarHorFin1 ;
   private boolean[] P02F62_n4309BarHorFin1 ;
   private java.math.BigDecimal[] P02F62_A4311BarFasMtr1 ;
   private boolean[] P02F62_n4311BarFasMtr1 ;
   private java.math.BigDecimal[] P02F62_A4312BarFasKgm1 ;
   private boolean[] P02F62_n4312BarFasKgm1 ;
   private short[] P02F62_A4647BarFasNPr1 ;
   private boolean[] P02F62_n4647BarFasNPr1 ;
   private String[] P02F62_A758ProCod ;
   private String[] P02F64_A396EmprCod ;
   private int[] P02F64_A129BarCod ;
   private byte[] P02F64_A132BarCodReo ;
   private String[] P02F64_A130BarCodPar ;
   private short[] P02F64_A194BarOrdLin ;
   private byte[] P02F64_A153BarFasEst ;
   private java.math.BigDecimal[] P02F64_A227BarUni ;
   private java.util.Date[] P02F64_A160BarFecRea ;
   private java.util.Date[] P02F64_A3298BarFecRIni ;
   private java.util.Date[] P02F64_A4442BarFasDTI ;
   private boolean[] P02F64_n4442BarFasDTI ;
   private java.util.Date[] P02F64_A4443BarFasDTF ;
   private boolean[] P02F64_n4443BarFasDTF ;
   private String[] P02F64_A603MaqCodBis ;
   private java.math.BigDecimal[] P02F64_A215BarTieRea ;
   private short[] P02F64_A165BarHorIni ;
   private short[] P02F64_A164BarHorFin ;
   private java.math.BigDecimal[] P02F64_A3838BarFasMtr ;
   private boolean[] P02F64_n3838BarFasMtr ;
   private java.math.BigDecimal[] P02F64_A3837BarFasKgm ;
   private boolean[] P02F64_n3837BarFasKgm ;
   private int[] P02F64_A4636BarFasPzas ;
   private boolean[] P02F64_n4636BarFasPzas ;
   private String[] P02F64_A460FasDsc ;
   private String[] P02F64_A457FasCod ;
   private String[] P02F64_A758ProCod ;
}

final  class pparlav8__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02F62", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasLot, BarFasEst1, BarUni1, BarFecRea1, BarFecRIn1, BarFasDti1, BarFasDtf1, BarTieRea1, BarHorIni1, BarHorFin1, BarFasMtr1, BarFasKgm1, BarFasNPr1, ProCod FROM TXPFASMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? and BarFasLot = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasLot ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02F63", "UPDATE TXPFASMAQ SET BarFasEst1=?, BarUni1=?, BarFecRea1=?, BarFecRIn1=?, BarFasDti1=?, BarFasDtf1=?, BarTieRea1=?, BarHorIni1=?, BarHorFin1=?, BarFasMtr1=?, BarFasKgm1=?, BarFasNPr1=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASMAQ")
         ,new ForEachCursor("P02F64", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin, T1.BarFasEst, T1.BarUni, T1.BarFecRea, T1.BarFecRIni, T1.BarFasDTI, T1.BarFasDTF, T1.MaqCodBis, T1.BarTieRea, T1.BarHorIni, T1.BarHorFin, T1.BarFasMtr, T1.BarFasKgm, T1.BarFasPzas, T2.FasDsc, T1.FasCod, T1.ProCod FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.BarOrdLin = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02F65", "UPDATE TXPBARFAS SET BarFasEst=?, BarUni=?, BarFecRea=?, BarFecRIni=?, BarFasDTI=?, BarFasDTF=?, MaqCodBis=?, BarTieRea=?, BarHorIni=?, BarHorFin=?, BarFasMtr=?, BarFasKgm=?, BarFasPzas=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
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
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((short[]) buf[20])[0] = rslt.getShort(14);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((short[]) buf[22])[0] = rslt.getShort(15);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((short[]) buf[28])[0] = rslt.getShort(18);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(19, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(12, 6);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((short[]) buf[15])[0] = rslt.getShort(14);
               ((short[]) buf[16])[0] = rslt.getShort(15);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(18);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(19, 28);
               ((String[]) buf[24])[0] = rslt.getString(20, 8);
               ((String[]) buf[25])[0] = rslt.getString(21, 8);
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
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
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
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[11], false);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
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
                  stmt.setNull( 10 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(10, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[23]).shortValue());
               }
               stmt.setString(13, (String)parms[24], 3);
               stmt.setInt(14, ((Number) parms[25]).intValue());
               stmt.setByte(15, ((Number) parms[26]).byteValue());
               stmt.setString(16, (String)parms[27], 1);
               stmt.setString(17, (String)parms[28], 8);
               stmt.setShort(18, ((Number) parms[29]).shortValue());
               stmt.setInt(19, ((Number) parms[30]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 3 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setDate(3, (java.util.Date)parms[2]);
               stmt.setDate(4, (java.util.Date)parms[3]);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[7], false);
               }
               stmt.setString(7, (String)parms[8], 6);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[9], 2);
               stmt.setShort(9, ((Number) parms[10]).shortValue());
               stmt.setShort(10, ((Number) parms[11]).shortValue());
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[13], 2);
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
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(13, ((Number) parms[17]).intValue());
               }
               stmt.setString(14, (String)parms[18], 3);
               stmt.setInt(15, ((Number) parms[19]).intValue());
               stmt.setByte(16, ((Number) parms[20]).byteValue());
               stmt.setString(17, (String)parms[21], 1);
               stmt.setString(18, (String)parms[22], 8);
               stmt.setShort(19, ((Number) parms[23]).shortValue());
               return;
      }
   }

}

