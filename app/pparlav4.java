package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pparlav4 extends GXProcedure
{
   public pparlav4( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pparlav4.class ), "" );
   }

   public pparlav4( int remoteHandle ,
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
      pparlav4.this.aP5 = new int[] {0};
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
      pparlav4.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pparlav4.this.A129BarCod = aP1[0];
      this.aP1 = aP1;
      pparlav4.this.A132BarCodReo = aP2[0];
      this.aP2 = aP2;
      pparlav4.this.A130BarCodPar = aP3[0];
      this.aP3 = aP3;
      pparlav4.this.A194BarOrdLin = aP4[0];
      this.aP4 = aP4;
      pparlav4.this.AV37BarFasLot = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV32BarFasDti = GXutil.resetTime( GXutil.nullDate() );
      AV33BarFasDtf = GXutil.resetTime( GXutil.nullDate() );
      AV34v_inicio = (byte)(0) ;
      AV36v_pzas = (short)(0) ;
      AV35v_kgs = DecimalUtil.doubleToDec(0) ;
      AV38HisProF = GXutil.space( (short)(1)) ;
      AV52Cont = (short)(0) ;
      AV53MaqCod = "" ;
      /* Using cursor P01FO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin), Integer.valueOf(AV37BarFasLot)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4704HisProNPar = P01FO2_A4704HisProNPar[0] ;
         A656ParCod = P01FO2_A656ParCod[0] ;
         n656ParCod = P01FO2_n656ParCod[0] ;
         A4440HisProDTI = P01FO2_A4440HisProDTI[0] ;
         n4440HisProDTI = P01FO2_n4440HisProDTI[0] ;
         A4441HisProDTF = P01FO2_A4441HisProDTF[0] ;
         n4441HisProDTF = P01FO2_n4441HisProDTF[0] ;
         A602MaqCod = P01FO2_A602MaqCod[0] ;
         A1525HisProKgr = P01FO2_A1525HisProKgr[0] ;
         A4714HisProNpzs = P01FO2_A4714HisProNpzs[0] ;
         A557HisProF = P01FO2_A557HisProF[0] ;
         A558HisProFec = P01FO2_A558HisProFec[0] ;
         A561HisProLin = P01FO2_A561HisProLin[0] ;
         if ( A656ParCod == 0 )
         {
            AV52Cont = (short)(AV52Cont+1) ;
            if ( AV52Cont == 1 )
            {
               AV32BarFasDti = A4440HisProDTI ;
               AV33BarFasDtf = A4441HisProDTF ;
               AV53MaqCod = A602MaqCod ;
            }
            else
            {
               if ( A4440HisProDTI.before( A4441HisProDTF ) )
               {
                  AV32BarFasDti = A4440HisProDTI ;
                  AV33BarFasDtf = A4441HisProDTF ;
                  AV53MaqCod = A602MaqCod ;
               }
            }
            AV35v_kgs = AV35v_kgs.add(A1525HisProKgr) ;
            AV36v_pzas = (short)(AV36v_pzas+A4714HisProNpzs) ;
            AV38HisProF = A557HisProF ;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P01FO3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin), Integer.valueOf(AV37BarFasLot)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A4643BarFasLot = P01FO3_A4643BarFasLot[0] ;
         A4303BarFasEst1 = P01FO3_A4303BarFasEst1[0] ;
         n4303BarFasEst1 = P01FO3_n4303BarFasEst1[0] ;
         A4307BarUni1 = P01FO3_A4307BarUni1[0] ;
         n4307BarUni1 = P01FO3_n4307BarUni1[0] ;
         A4305BarFecRea1 = P01FO3_A4305BarFecRea1[0] ;
         n4305BarFecRea1 = P01FO3_n4305BarFecRea1[0] ;
         A4304BarFecRIn1 = P01FO3_A4304BarFecRIn1[0] ;
         n4304BarFecRIn1 = P01FO3_n4304BarFecRIn1[0] ;
         A4927BarFasDti1 = P01FO3_A4927BarFasDti1[0] ;
         n4927BarFasDti1 = P01FO3_n4927BarFasDti1[0] ;
         A4928BarFasDtf1 = P01FO3_A4928BarFasDtf1[0] ;
         n4928BarFasDtf1 = P01FO3_n4928BarFasDtf1[0] ;
         A4310BarTieRea1 = P01FO3_A4310BarTieRea1[0] ;
         n4310BarTieRea1 = P01FO3_n4310BarTieRea1[0] ;
         A4308BarHorIni1 = P01FO3_A4308BarHorIni1[0] ;
         n4308BarHorIni1 = P01FO3_n4308BarHorIni1[0] ;
         A4309BarHorFin1 = P01FO3_A4309BarHorFin1[0] ;
         n4309BarHorFin1 = P01FO3_n4309BarHorFin1[0] ;
         A4311BarFasMtr1 = P01FO3_A4311BarFasMtr1[0] ;
         n4311BarFasMtr1 = P01FO3_n4311BarFasMtr1[0] ;
         A4312BarFasKgm1 = P01FO3_A4312BarFasKgm1[0] ;
         n4312BarFasKgm1 = P01FO3_n4312BarFasKgm1[0] ;
         A4647BarFasNPr1 = P01FO3_A4647BarFasNPr1[0] ;
         n4647BarFasNPr1 = P01FO3_n4647BarFasNPr1[0] ;
         A4302BarMaqFas1 = P01FO3_A4302BarMaqFas1[0] ;
         n4302BarMaqFas1 = P01FO3_n4302BarMaqFas1[0] ;
         A4644BarFasNPrd = P01FO3_A4644BarFasNPrd[0] ;
         n4644BarFasNPrd = P01FO3_n4644BarFasNPrd[0] ;
         A4645BarFasKgs = P01FO3_A4645BarFasKgs[0] ;
         n4645BarFasKgs = P01FO3_n4645BarFasKgs[0] ;
         A758ProCod = P01FO3_A758ProCod[0] ;
         if ( AV52Cont == 0 )
         {
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
         }
         else
         {
            AV48Fecha_dt = localUtil.ttoc( AV32BarFasDti, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV50Fecha_a = GXutil.substring( AV48Fecha_dt, 1, 8) ;
            AV49Fecha_if = localUtil.ctod( AV50Fecha_a, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A4304BarFecRIn1 = AV49Fecha_if ;
            n4304BarFecRIn1 = false ;
            AV48Fecha_dt = localUtil.ttoc( AV33BarFasDtf, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV50Fecha_a = GXutil.substring( AV48Fecha_dt, 1, 8) ;
            AV49Fecha_if = localUtil.ctod( AV50Fecha_a, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A4305BarFecRea1 = AV49Fecha_if ;
            n4305BarFecRea1 = false ;
            A4307BarUni1 = AV35v_kgs ;
            n4307BarUni1 = false ;
            AV39Hh = (byte)(GXutil.hour( AV32BarFasDti)) ;
            AV40Mn = (byte)(GXutil.minute( AV32BarFasDti)) ;
            AV41Hm_i = GXutil.str( AV39Hh, 2, 0) + GXutil.str( AV40Mn, 2, 0) ;
            A4308BarHorIni1 = (short)(GXutil.lval( AV41Hm_i)) ;
            n4308BarHorIni1 = false ;
            AV39Hh = (byte)(GXutil.hour( AV33BarFasDtf)) ;
            AV40Mn = (byte)(GXutil.minute( AV33BarFasDtf)) ;
            AV41Hm_i = GXutil.str( AV39Hh, 2, 0) + GXutil.str( AV40Mn, 2, 0) ;
            A4309BarHorFin1 = (short)(GXutil.lval( AV41Hm_i)) ;
            n4309BarHorFin1 = false ;
            AV42Tot_mm = 0 ;
            if ( ! GXutil.dateCompare(GXutil.nullDate(), AV33BarFasDtf) )
            {
               AV43Tot_seg = (int)(GXutil.dtdiff( AV33BarFasDtf, AV32BarFasDti)) ;
               AV42Tot_mm = (int)(AV43Tot_seg/ (double) (60)) ;
            }
            AV44Hh_1 = (byte)(AV42Tot_mm/ (double) (60)) ;
            AV45Hh_2 = (byte)(GXutil.Int( AV44Hh_1)) ;
            AV47Mm_1 = (byte)(AV42Tot_mm-(AV45Hh_2*60)) ;
            AV46Hh_mm = GXutil.trim( GXutil.str( AV45Hh_2, 2, 0)) + "." + GXutil.trim( GXutil.str( AV47Mm_1, 2, 0)) ;
            AV51Hhmm_n = CommonUtil.decimalVal( AV46Hh_mm, ".") ;
            A4310BarTieRea1 = AV51Hhmm_n ;
            n4310BarTieRea1 = false ;
            A4312BarFasKgm1 = AV35v_kgs ;
            n4312BarFasKgm1 = false ;
            A4647BarFasNPr1 = AV36v_pzas ;
            n4647BarFasNPr1 = false ;
            A4927BarFasDti1 = AV32BarFasDti ;
            n4927BarFasDti1 = false ;
            A4928BarFasDtf1 = AV33BarFasDtf ;
            n4928BarFasDtf1 = false ;
            if ( ! (GXutil.strcmp("", AV53MaqCod)==0) )
            {
               A4302BarMaqFas1 = AV53MaqCod ;
               n4302BarMaqFas1 = false ;
            }
            A4303BarFasEst1 = (byte)(1) ;
            n4303BarFasEst1 = false ;
            if ( ( ( DecimalUtil.compareTo(A4312BarFasKgm1, A4645BarFasKgs) >= 0 ) ) || ( ( A4647BarFasNPr1 >= A4644BarFasNPrd ) ) )
            {
               A4303BarFasEst1 = (byte)(2) ;
               n4303BarFasEst1 = false ;
            }
         }
         /* Using cursor P01FO4 */
         pr_default.execute(2, new Object[] {Boolean.valueOf(n4303BarFasEst1), Byte.valueOf(A4303BarFasEst1), Boolean.valueOf(n4307BarUni1), A4307BarUni1, Boolean.valueOf(n4305BarFecRea1), A4305BarFecRea1, Boolean.valueOf(n4304BarFecRIn1), A4304BarFecRIn1, Boolean.valueOf(n4927BarFasDti1), A4927BarFasDti1, Boolean.valueOf(n4928BarFasDtf1), A4928BarFasDtf1, Boolean.valueOf(n4310BarTieRea1), A4310BarTieRea1, Boolean.valueOf(n4308BarHorIni1), Short.valueOf(A4308BarHorIni1), Boolean.valueOf(n4309BarHorFin1), Short.valueOf(A4309BarHorFin1), Boolean.valueOf(n4311BarFasMtr1), A4311BarFasMtr1, Boolean.valueOf(n4312BarFasKgm1), A4312BarFasKgm1, Boolean.valueOf(n4647BarFasNPr1), Short.valueOf(A4647BarFasNPr1), Boolean.valueOf(n4302BarMaqFas1), A4302BarMaqFas1, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Integer.valueOf(A4643BarFasLot)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASMAQ");
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P01FO5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A194BarOrdLin)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A153BarFasEst = P01FO5_A153BarFasEst[0] ;
         A227BarUni = P01FO5_A227BarUni[0] ;
         A160BarFecRea = P01FO5_A160BarFecRea[0] ;
         A3298BarFecRIni = P01FO5_A3298BarFecRIni[0] ;
         A4442BarFasDTI = P01FO5_A4442BarFasDTI[0] ;
         n4442BarFasDTI = P01FO5_n4442BarFasDTI[0] ;
         A4443BarFasDTF = P01FO5_A4443BarFasDTF[0] ;
         n4443BarFasDTF = P01FO5_n4443BarFasDTF[0] ;
         A215BarTieRea = P01FO5_A215BarTieRea[0] ;
         A165BarHorIni = P01FO5_A165BarHorIni[0] ;
         A164BarHorFin = P01FO5_A164BarHorFin[0] ;
         A3838BarFasMtr = P01FO5_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P01FO5_n3838BarFasMtr[0] ;
         A3837BarFasKgm = P01FO5_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P01FO5_n3837BarFasKgm[0] ;
         A4636BarFasPzas = P01FO5_A4636BarFasPzas[0] ;
         n4636BarFasPzas = P01FO5_n4636BarFasPzas[0] ;
         A603MaqCodBis = P01FO5_A603MaqCodBis[0] ;
         A4974BarFasPPr = P01FO5_A4974BarFasPPr[0] ;
         n4974BarFasPPr = P01FO5_n4974BarFasPPr[0] ;
         A4973BarFasKPr = P01FO5_A4973BarFasKPr[0] ;
         n4973BarFasKPr = P01FO5_n4973BarFasKPr[0] ;
         A758ProCod = P01FO5_A758ProCod[0] ;
         if ( AV52Cont == 0 )
         {
            A153BarFasEst = (byte)(0) ;
            A227BarUni = DecimalUtil.ZERO ;
            A160BarFecRea = GXutil.nullDate() ;
            A3298BarFecRIni = GXutil.nullDate() ;
            A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
            n4442BarFasDTI = false ;
            A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
            n4443BarFasDTF = false ;
            A215BarTieRea = DecimalUtil.ZERO ;
            A165BarHorIni = (short)(0) ;
            A164BarHorFin = (short)(0) ;
            A3838BarFasMtr = DecimalUtil.doubleToDec(0) ;
            n3838BarFasMtr = false ;
            A3837BarFasKgm = DecimalUtil.doubleToDec(0) ;
            n3837BarFasKgm = false ;
            A4636BarFasPzas = 0 ;
            n4636BarFasPzas = false ;
         }
         else
         {
            AV48Fecha_dt = localUtil.ttoc( AV32BarFasDti, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV50Fecha_a = GXutil.substring( AV48Fecha_dt, 1, 8) ;
            AV49Fecha_if = localUtil.ctod( AV50Fecha_a, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A3298BarFecRIni = AV49Fecha_if ;
            AV48Fecha_dt = localUtil.ttoc( AV33BarFasDtf, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            AV50Fecha_a = GXutil.substring( AV48Fecha_dt, 1, 8) ;
            AV49Fecha_if = localUtil.ctod( AV50Fecha_a, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A160BarFecRea = AV49Fecha_if ;
            A227BarUni = AV35v_kgs ;
            AV39Hh = (byte)(GXutil.hour( AV32BarFasDti)) ;
            AV40Mn = (byte)(GXutil.minute( AV32BarFasDti)) ;
            AV41Hm_i = GXutil.str( AV39Hh, 2, 0) + GXutil.str( AV40Mn, 2, 0) ;
            A165BarHorIni = (short)(GXutil.lval( AV41Hm_i)) ;
            AV39Hh = (byte)(GXutil.hour( AV33BarFasDtf)) ;
            AV40Mn = (byte)(GXutil.minute( AV33BarFasDtf)) ;
            AV41Hm_i = GXutil.str( AV39Hh, 2, 0) + GXutil.str( AV40Mn, 2, 0) ;
            A164BarHorFin = (short)(GXutil.lval( AV41Hm_i)) ;
            AV42Tot_mm = 0 ;
            if ( ! GXutil.dateCompare(GXutil.nullDate(), AV33BarFasDtf) )
            {
               AV43Tot_seg = (int)(GXutil.dtdiff( AV33BarFasDtf, AV32BarFasDti)) ;
               AV42Tot_mm = (int)(AV43Tot_seg/ (double) (60)) ;
            }
            AV44Hh_1 = (byte)(AV42Tot_mm/ (double) (60)) ;
            AV45Hh_2 = (byte)(GXutil.Int( AV44Hh_1)) ;
            AV47Mm_1 = (byte)(AV42Tot_mm-(AV45Hh_2*60)) ;
            AV46Hh_mm = GXutil.trim( GXutil.str( AV45Hh_2, 2, 0)) + "." + GXutil.trim( GXutil.str( AV47Mm_1, 2, 0)) ;
            AV51Hhmm_n = CommonUtil.decimalVal( AV46Hh_mm, ".") ;
            A215BarTieRea = CommonUtil.decimalVal( AV46Hh_mm, ".") ;
            A3837BarFasKgm = A3837BarFasKgm.add(AV35v_kgs) ;
            n3837BarFasKgm = false ;
            A4636BarFasPzas = (int)(A4636BarFasPzas+AV36v_pzas) ;
            n4636BarFasPzas = false ;
            A4442BarFasDTI = AV32BarFasDti ;
            n4442BarFasDTI = false ;
            A4443BarFasDTF = AV33BarFasDtf ;
            n4443BarFasDTF = false ;
            if ( ! (GXutil.strcmp("", AV53MaqCod)==0) )
            {
               A603MaqCodBis = AV53MaqCod ;
            }
            Gx_msg = httpContext.getMessage( "BarFasKgm =", "") + GXutil.str( A3837BarFasKgm, 9, 2) + GXutil.newLine( ) + httpContext.getMessage( "BarFasKPr =", "") + GXutil.str( A4973BarFasKPr, 9, 2) + GXutil.newLine( ) + httpContext.getMessage( "BarFasPzas=", "") + GXutil.str( A4636BarFasPzas, 6, 0) + GXutil.newLine( ) + httpContext.getMessage( "BarFasPpr=", "") + GXutil.str( A4974BarFasPPr, 6, 0) ;
            A153BarFasEst = (byte)(1) ;
            if ( ( ( DecimalUtil.compareTo(A3837BarFasKgm, A4973BarFasKPr) >= 0 ) && ( A4973BarFasKPr.doubleValue() > 0 ) ) || ( ( A4636BarFasPzas >= A4974BarFasPPr ) && ( A4974BarFasPPr > 0 ) ) )
            {
               A153BarFasEst = (byte)(2) ;
            }
         }
         /* Using cursor P01FO6 */
         pr_default.execute(4, new Object[] {Byte.valueOf(A153BarFasEst), A227BarUni, A160BarFecRea, A3298BarFecRIni, Boolean.valueOf(n4442BarFasDTI), A4442BarFasDTI, Boolean.valueOf(n4443BarFasDTF), A4443BarFasDTF, A215BarTieRea, Short.valueOf(A165BarHorIni), Short.valueOf(A164BarHorFin), Boolean.valueOf(n3838BarFasMtr), A3838BarFasMtr, Boolean.valueOf(n3837BarFasKgm), A3837BarFasKgm, Boolean.valueOf(n4636BarFasPzas), Integer.valueOf(A4636BarFasPzas), A603MaqCodBis, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         pr_default.readNext(3);
      }
      pr_default.close(3);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pparlav4.this.A396EmprCod;
      this.aP1[0] = pparlav4.this.A129BarCod;
      this.aP2[0] = pparlav4.this.A132BarCodReo;
      this.aP3[0] = pparlav4.this.A130BarCodPar;
      this.aP4[0] = pparlav4.this.A194BarOrdLin;
      this.aP5[0] = pparlav4.this.AV37BarFasLot;
      Application.commitDataStores(context, remoteHandle, pr_default, "pparlav4");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV32BarFasDti = GXutil.resetTime( GXutil.nullDate() );
      AV33BarFasDtf = GXutil.resetTime( GXutil.nullDate() );
      AV35v_kgs = DecimalUtil.ZERO ;
      AV38HisProF = "" ;
      AV53MaqCod = "" ;
      scmdbuf = "" ;
      P01FO2_A396EmprCod = new String[] {""} ;
      P01FO2_A129BarCod = new int[1] ;
      P01FO2_A132BarCodReo = new byte[1] ;
      P01FO2_A130BarCodPar = new String[] {""} ;
      P01FO2_A194BarOrdLin = new short[1] ;
      P01FO2_A4704HisProNPar = new int[1] ;
      P01FO2_A656ParCod = new short[1] ;
      P01FO2_n656ParCod = new boolean[] {false} ;
      P01FO2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P01FO2_n4440HisProDTI = new boolean[] {false} ;
      P01FO2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P01FO2_n4441HisProDTF = new boolean[] {false} ;
      P01FO2_A602MaqCod = new String[] {""} ;
      P01FO2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01FO2_A4714HisProNpzs = new short[1] ;
      P01FO2_A557HisProF = new String[] {""} ;
      P01FO2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P01FO2_A561HisProLin = new int[1] ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A602MaqCod = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A557HisProF = "" ;
      A558HisProFec = GXutil.nullDate() ;
      P01FO3_A396EmprCod = new String[] {""} ;
      P01FO3_A129BarCod = new int[1] ;
      P01FO3_A132BarCodReo = new byte[1] ;
      P01FO3_A130BarCodPar = new String[] {""} ;
      P01FO3_A194BarOrdLin = new short[1] ;
      P01FO3_A4643BarFasLot = new int[1] ;
      P01FO3_A4303BarFasEst1 = new byte[1] ;
      P01FO3_n4303BarFasEst1 = new boolean[] {false} ;
      P01FO3_A4307BarUni1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01FO3_n4307BarUni1 = new boolean[] {false} ;
      P01FO3_A4305BarFecRea1 = new java.util.Date[] {GXutil.nullDate()} ;
      P01FO3_n4305BarFecRea1 = new boolean[] {false} ;
      P01FO3_A4304BarFecRIn1 = new java.util.Date[] {GXutil.nullDate()} ;
      P01FO3_n4304BarFecRIn1 = new boolean[] {false} ;
      P01FO3_A4927BarFasDti1 = new java.util.Date[] {GXutil.nullDate()} ;
      P01FO3_n4927BarFasDti1 = new boolean[] {false} ;
      P01FO3_A4928BarFasDtf1 = new java.util.Date[] {GXutil.nullDate()} ;
      P01FO3_n4928BarFasDtf1 = new boolean[] {false} ;
      P01FO3_A4310BarTieRea1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01FO3_n4310BarTieRea1 = new boolean[] {false} ;
      P01FO3_A4308BarHorIni1 = new short[1] ;
      P01FO3_n4308BarHorIni1 = new boolean[] {false} ;
      P01FO3_A4309BarHorFin1 = new short[1] ;
      P01FO3_n4309BarHorFin1 = new boolean[] {false} ;
      P01FO3_A4311BarFasMtr1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01FO3_n4311BarFasMtr1 = new boolean[] {false} ;
      P01FO3_A4312BarFasKgm1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01FO3_n4312BarFasKgm1 = new boolean[] {false} ;
      P01FO3_A4647BarFasNPr1 = new short[1] ;
      P01FO3_n4647BarFasNPr1 = new boolean[] {false} ;
      P01FO3_A4302BarMaqFas1 = new String[] {""} ;
      P01FO3_n4302BarMaqFas1 = new boolean[] {false} ;
      P01FO3_A4644BarFasNPrd = new short[1] ;
      P01FO3_n4644BarFasNPrd = new boolean[] {false} ;
      P01FO3_A4645BarFasKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01FO3_n4645BarFasKgs = new boolean[] {false} ;
      P01FO3_A758ProCod = new String[] {""} ;
      A4307BarUni1 = DecimalUtil.ZERO ;
      A4305BarFecRea1 = GXutil.nullDate() ;
      A4304BarFecRIn1 = GXutil.nullDate() ;
      A4927BarFasDti1 = GXutil.resetTime( GXutil.nullDate() );
      A4928BarFasDtf1 = GXutil.resetTime( GXutil.nullDate() );
      A4310BarTieRea1 = DecimalUtil.ZERO ;
      A4311BarFasMtr1 = DecimalUtil.ZERO ;
      A4312BarFasKgm1 = DecimalUtil.ZERO ;
      A4302BarMaqFas1 = "" ;
      A4645BarFasKgs = DecimalUtil.ZERO ;
      A758ProCod = "" ;
      AV48Fecha_dt = "" ;
      AV50Fecha_a = "" ;
      AV49Fecha_if = GXutil.nullDate() ;
      AV41Hm_i = "" ;
      AV46Hh_mm = "" ;
      AV51Hhmm_n = DecimalUtil.ZERO ;
      P01FO5_A396EmprCod = new String[] {""} ;
      P01FO5_A129BarCod = new int[1] ;
      P01FO5_A132BarCodReo = new byte[1] ;
      P01FO5_A130BarCodPar = new String[] {""} ;
      P01FO5_A194BarOrdLin = new short[1] ;
      P01FO5_A153BarFasEst = new byte[1] ;
      P01FO5_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01FO5_A160BarFecRea = new java.util.Date[] {GXutil.nullDate()} ;
      P01FO5_A3298BarFecRIni = new java.util.Date[] {GXutil.nullDate()} ;
      P01FO5_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P01FO5_n4442BarFasDTI = new boolean[] {false} ;
      P01FO5_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P01FO5_n4443BarFasDTF = new boolean[] {false} ;
      P01FO5_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01FO5_A165BarHorIni = new short[1] ;
      P01FO5_A164BarHorFin = new short[1] ;
      P01FO5_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01FO5_n3838BarFasMtr = new boolean[] {false} ;
      P01FO5_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01FO5_n3837BarFasKgm = new boolean[] {false} ;
      P01FO5_A4636BarFasPzas = new int[1] ;
      P01FO5_n4636BarFasPzas = new boolean[] {false} ;
      P01FO5_A603MaqCodBis = new String[] {""} ;
      P01FO5_A4974BarFasPPr = new short[1] ;
      P01FO5_n4974BarFasPPr = new boolean[] {false} ;
      P01FO5_A4973BarFasKPr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01FO5_n4973BarFasKPr = new boolean[] {false} ;
      P01FO5_A758ProCod = new String[] {""} ;
      A227BarUni = DecimalUtil.ZERO ;
      A160BarFecRea = GXutil.nullDate() ;
      A3298BarFecRIni = GXutil.nullDate() ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A215BarTieRea = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A603MaqCodBis = "" ;
      A4973BarFasKPr = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pparlav4__default(),
         new Object[] {
             new Object[] {
            P01FO2_A396EmprCod, P01FO2_A129BarCod, P01FO2_A132BarCodReo, P01FO2_A130BarCodPar, P01FO2_A194BarOrdLin, P01FO2_A4704HisProNPar, P01FO2_A656ParCod, P01FO2_n656ParCod, P01FO2_A4440HisProDTI, P01FO2_n4440HisProDTI,
            P01FO2_A4441HisProDTF, P01FO2_n4441HisProDTF, P01FO2_A602MaqCod, P01FO2_A1525HisProKgr, P01FO2_A4714HisProNpzs, P01FO2_A557HisProF, P01FO2_A558HisProFec, P01FO2_A561HisProLin
            }
            , new Object[] {
            P01FO3_A396EmprCod, P01FO3_A129BarCod, P01FO3_A132BarCodReo, P01FO3_A130BarCodPar, P01FO3_A194BarOrdLin, P01FO3_A4643BarFasLot, P01FO3_A4303BarFasEst1, P01FO3_n4303BarFasEst1, P01FO3_A4307BarUni1, P01FO3_n4307BarUni1,
            P01FO3_A4305BarFecRea1, P01FO3_n4305BarFecRea1, P01FO3_A4304BarFecRIn1, P01FO3_n4304BarFecRIn1, P01FO3_A4927BarFasDti1, P01FO3_n4927BarFasDti1, P01FO3_A4928BarFasDtf1, P01FO3_n4928BarFasDtf1, P01FO3_A4310BarTieRea1, P01FO3_n4310BarTieRea1,
            P01FO3_A4308BarHorIni1, P01FO3_n4308BarHorIni1, P01FO3_A4309BarHorFin1, P01FO3_n4309BarHorFin1, P01FO3_A4311BarFasMtr1, P01FO3_n4311BarFasMtr1, P01FO3_A4312BarFasKgm1, P01FO3_n4312BarFasKgm1, P01FO3_A4647BarFasNPr1, P01FO3_n4647BarFasNPr1,
            P01FO3_A4302BarMaqFas1, P01FO3_n4302BarMaqFas1, P01FO3_A4644BarFasNPrd, P01FO3_n4644BarFasNPrd, P01FO3_A4645BarFasKgs, P01FO3_n4645BarFasKgs, P01FO3_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            P01FO5_A396EmprCod, P01FO5_A129BarCod, P01FO5_A132BarCodReo, P01FO5_A130BarCodPar, P01FO5_A194BarOrdLin, P01FO5_A153BarFasEst, P01FO5_A227BarUni, P01FO5_A160BarFecRea, P01FO5_A3298BarFecRIni, P01FO5_A4442BarFasDTI,
            P01FO5_n4442BarFasDTI, P01FO5_A4443BarFasDTF, P01FO5_n4443BarFasDTF, P01FO5_A215BarTieRea, P01FO5_A165BarHorIni, P01FO5_A164BarHorFin, P01FO5_A3838BarFasMtr, P01FO5_n3838BarFasMtr, P01FO5_A3837BarFasKgm, P01FO5_n3837BarFasKgm,
            P01FO5_A4636BarFasPzas, P01FO5_n4636BarFasPzas, P01FO5_A603MaqCodBis, P01FO5_A4974BarFasPPr, P01FO5_n4974BarFasPPr, P01FO5_A4973BarFasKPr, P01FO5_n4973BarFasKPr, P01FO5_A758ProCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte AV34v_inicio ;
   private byte A4303BarFasEst1 ;
   private byte AV39Hh ;
   private byte AV40Mn ;
   private byte AV44Hh_1 ;
   private byte AV45Hh_2 ;
   private byte AV47Mm_1 ;
   private byte A153BarFasEst ;
   private short A194BarOrdLin ;
   private short AV36v_pzas ;
   private short AV52Cont ;
   private short A656ParCod ;
   private short A4714HisProNpzs ;
   private short A4308BarHorIni1 ;
   private short A4309BarHorFin1 ;
   private short A4647BarFasNPr1 ;
   private short A4644BarFasNPrd ;
   private short A165BarHorIni ;
   private short A164BarHorFin ;
   private short A4974BarFasPPr ;
   private short Gx_err ;
   private int A129BarCod ;
   private int AV37BarFasLot ;
   private int A4704HisProNPar ;
   private int A561HisProLin ;
   private int A4643BarFasLot ;
   private int AV42Tot_mm ;
   private int AV43Tot_seg ;
   private int A4636BarFasPzas ;
   private java.math.BigDecimal AV35v_kgs ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A4307BarUni1 ;
   private java.math.BigDecimal A4310BarTieRea1 ;
   private java.math.BigDecimal A4311BarFasMtr1 ;
   private java.math.BigDecimal A4312BarFasKgm1 ;
   private java.math.BigDecimal A4645BarFasKgs ;
   private java.math.BigDecimal AV51Hhmm_n ;
   private java.math.BigDecimal A227BarUni ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A4973BarFasKPr ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV38HisProF ;
   private String AV53MaqCod ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String A557HisProF ;
   private String A4302BarMaqFas1 ;
   private String A758ProCod ;
   private String AV48Fecha_dt ;
   private String AV50Fecha_a ;
   private String AV41Hm_i ;
   private String AV46Hh_mm ;
   private String A603MaqCodBis ;
   private String Gx_msg ;
   private java.util.Date AV32BarFasDti ;
   private java.util.Date AV33BarFasDtf ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A4927BarFasDti1 ;
   private java.util.Date A4928BarFasDtf1 ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date A558HisProFec ;
   private java.util.Date A4305BarFecRea1 ;
   private java.util.Date A4304BarFecRIn1 ;
   private java.util.Date AV49Fecha_if ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date A3298BarFecRIni ;
   private boolean n656ParCod ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
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
   private boolean n4302BarMaqFas1 ;
   private boolean n4644BarFasNPrd ;
   private boolean n4645BarFasKgs ;
   private boolean n4442BarFasDTI ;
   private boolean n4443BarFasDTF ;
   private boolean n3838BarFasMtr ;
   private boolean n3837BarFasKgm ;
   private boolean n4636BarFasPzas ;
   private boolean n4974BarFasPPr ;
   private boolean n4973BarFasKPr ;
   private int[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P01FO2_A396EmprCod ;
   private int[] P01FO2_A129BarCod ;
   private byte[] P01FO2_A132BarCodReo ;
   private String[] P01FO2_A130BarCodPar ;
   private short[] P01FO2_A194BarOrdLin ;
   private int[] P01FO2_A4704HisProNPar ;
   private short[] P01FO2_A656ParCod ;
   private boolean[] P01FO2_n656ParCod ;
   private java.util.Date[] P01FO2_A4440HisProDTI ;
   private boolean[] P01FO2_n4440HisProDTI ;
   private java.util.Date[] P01FO2_A4441HisProDTF ;
   private boolean[] P01FO2_n4441HisProDTF ;
   private String[] P01FO2_A602MaqCod ;
   private java.math.BigDecimal[] P01FO2_A1525HisProKgr ;
   private short[] P01FO2_A4714HisProNpzs ;
   private String[] P01FO2_A557HisProF ;
   private java.util.Date[] P01FO2_A558HisProFec ;
   private int[] P01FO2_A561HisProLin ;
   private String[] P01FO3_A396EmprCod ;
   private int[] P01FO3_A129BarCod ;
   private byte[] P01FO3_A132BarCodReo ;
   private String[] P01FO3_A130BarCodPar ;
   private short[] P01FO3_A194BarOrdLin ;
   private int[] P01FO3_A4643BarFasLot ;
   private byte[] P01FO3_A4303BarFasEst1 ;
   private boolean[] P01FO3_n4303BarFasEst1 ;
   private java.math.BigDecimal[] P01FO3_A4307BarUni1 ;
   private boolean[] P01FO3_n4307BarUni1 ;
   private java.util.Date[] P01FO3_A4305BarFecRea1 ;
   private boolean[] P01FO3_n4305BarFecRea1 ;
   private java.util.Date[] P01FO3_A4304BarFecRIn1 ;
   private boolean[] P01FO3_n4304BarFecRIn1 ;
   private java.util.Date[] P01FO3_A4927BarFasDti1 ;
   private boolean[] P01FO3_n4927BarFasDti1 ;
   private java.util.Date[] P01FO3_A4928BarFasDtf1 ;
   private boolean[] P01FO3_n4928BarFasDtf1 ;
   private java.math.BigDecimal[] P01FO3_A4310BarTieRea1 ;
   private boolean[] P01FO3_n4310BarTieRea1 ;
   private short[] P01FO3_A4308BarHorIni1 ;
   private boolean[] P01FO3_n4308BarHorIni1 ;
   private short[] P01FO3_A4309BarHorFin1 ;
   private boolean[] P01FO3_n4309BarHorFin1 ;
   private java.math.BigDecimal[] P01FO3_A4311BarFasMtr1 ;
   private boolean[] P01FO3_n4311BarFasMtr1 ;
   private java.math.BigDecimal[] P01FO3_A4312BarFasKgm1 ;
   private boolean[] P01FO3_n4312BarFasKgm1 ;
   private short[] P01FO3_A4647BarFasNPr1 ;
   private boolean[] P01FO3_n4647BarFasNPr1 ;
   private String[] P01FO3_A4302BarMaqFas1 ;
   private boolean[] P01FO3_n4302BarMaqFas1 ;
   private short[] P01FO3_A4644BarFasNPrd ;
   private boolean[] P01FO3_n4644BarFasNPrd ;
   private java.math.BigDecimal[] P01FO3_A4645BarFasKgs ;
   private boolean[] P01FO3_n4645BarFasKgs ;
   private String[] P01FO3_A758ProCod ;
   private String[] P01FO5_A396EmprCod ;
   private int[] P01FO5_A129BarCod ;
   private byte[] P01FO5_A132BarCodReo ;
   private String[] P01FO5_A130BarCodPar ;
   private short[] P01FO5_A194BarOrdLin ;
   private byte[] P01FO5_A153BarFasEst ;
   private java.math.BigDecimal[] P01FO5_A227BarUni ;
   private java.util.Date[] P01FO5_A160BarFecRea ;
   private java.util.Date[] P01FO5_A3298BarFecRIni ;
   private java.util.Date[] P01FO5_A4442BarFasDTI ;
   private boolean[] P01FO5_n4442BarFasDTI ;
   private java.util.Date[] P01FO5_A4443BarFasDTF ;
   private boolean[] P01FO5_n4443BarFasDTF ;
   private java.math.BigDecimal[] P01FO5_A215BarTieRea ;
   private short[] P01FO5_A165BarHorIni ;
   private short[] P01FO5_A164BarHorFin ;
   private java.math.BigDecimal[] P01FO5_A3838BarFasMtr ;
   private boolean[] P01FO5_n3838BarFasMtr ;
   private java.math.BigDecimal[] P01FO5_A3837BarFasKgm ;
   private boolean[] P01FO5_n3837BarFasKgm ;
   private int[] P01FO5_A4636BarFasPzas ;
   private boolean[] P01FO5_n4636BarFasPzas ;
   private String[] P01FO5_A603MaqCodBis ;
   private short[] P01FO5_A4974BarFasPPr ;
   private boolean[] P01FO5_n4974BarFasPPr ;
   private java.math.BigDecimal[] P01FO5_A4973BarFasKPr ;
   private boolean[] P01FO5_n4973BarFasKPr ;
   private String[] P01FO5_A758ProCod ;
}

final  class pparlav4__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01FO2", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, HisProNPar, ParCod, HisProDTI, HisProDTF, MaqCod, HisProKgr, HisProNpzs, HisProF, HisProFec, HisProLin FROM TXPLHIPRO WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ?) AND (HisProNPar = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01FO3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasLot, BarFasEst1, BarUni1, BarFecRea1, BarFecRIn1, BarFasDti1, BarFasDtf1, BarTieRea1, BarHorIni1, BarHorFin1, BarFasMtr1, BarFasKgm1, BarFasNPr1, BarMaqFas1, BarFasNPrd, BarFasKgs, ProCod FROM TXPFASMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? and BarFasLot = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasLot ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01FO4", "UPDATE TXPFASMAQ SET BarFasEst1=?, BarUni1=?, BarFecRea1=?, BarFecRIn1=?, BarFasDti1=?, BarFasDtf1=?, BarTieRea1=?, BarHorIni1=?, BarHorFin1=?, BarFasMtr1=?, BarFasKgm1=?, BarFasNPr1=?, BarMaqFas1=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ? AND BarFasLot = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASMAQ")
         ,new ForEachCursor("P01FO5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasEst, BarUni, BarFecRea, BarFecRIni, BarFasDTI, BarFasDTF, BarTieRea, BarHorIni, BarHorFin, BarFasMtr, BarFasKgm, BarFasPzas, MaqCodBis, BarFasPPr, BarFasKPr, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01FO6", "UPDATE TXPBARFAS SET BarFasEst=?, BarUni=?, BarFecRea=?, BarFecRIni=?, BarFasDTI=?, BarFasDTF=?, BarTieRea=?, BarHorIni=?, BarHorFin=?, BarFasMtr=?, BarFasKgm=?, BarFasPzas=?, MaqCodBis=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND ProCod = ? AND BarOrdLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
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
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 6);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(11,2);
               ((short[]) buf[14])[0] = rslt.getShort(12);
               ((String[]) buf[15])[0] = rslt.getString(13, 1);
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDate(14);
               ((int[]) buf[17])[0] = rslt.getInt(15);
               return;
            case 1 :
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
               ((String[]) buf[30])[0] = rslt.getString(19, 6);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((short[]) buf[32])[0] = rslt.getShort(20);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(22, 8);
               return;
            case 3 :
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
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((short[]) buf[14])[0] = rslt.getShort(13);
               ((short[]) buf[15])[0] = rslt.getShort(14);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((int[]) buf[20])[0] = rslt.getInt(17);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(18, 6);
               ((short[]) buf[23])[0] = rslt.getShort(19);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(20,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(21, 8);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 2 :
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
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[25], 6);
               }
               stmt.setString(14, (String)parms[26], 3);
               stmt.setInt(15, ((Number) parms[27]).intValue());
               stmt.setByte(16, ((Number) parms[28]).byteValue());
               stmt.setString(17, (String)parms[29], 1);
               stmt.setString(18, (String)parms[30], 8);
               stmt.setShort(19, ((Number) parms[31]).shortValue());
               stmt.setInt(20, ((Number) parms[32]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 4 :
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
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[8], 2);
               stmt.setShort(8, ((Number) parms[9]).shortValue());
               stmt.setShort(9, ((Number) parms[10]).shortValue());
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
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[16]).intValue());
               }
               stmt.setString(13, (String)parms[17], 6);
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

