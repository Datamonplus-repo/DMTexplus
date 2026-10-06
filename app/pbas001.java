package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbas001 extends GXProcedure
{
   public pbas001( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbas001.class ), "" );
   }

   public pbas001( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public byte executeUdp( String[] aP0 ,
                           int[] aP1 ,
                           byte[] aP2 ,
                           String[] aP3 ,
                           String[] aP4 ,
                           java.math.BigDecimal[] aP5 ,
                           java.math.BigDecimal[] aP6 ,
                           java.math.BigDecimal[] aP7 ,
                           java.math.BigDecimal[] aP8 )
   {
      pbas001.this.aP9 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
      return aP9[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        byte[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             byte[] aP9 )
   {
      pbas001.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbas001.this.AV8BarCod = aP1[0];
      this.aP1 = aP1;
      pbas001.this.AV10BarCodReo = aP2[0];
      this.aP2 = aP2;
      pbas001.this.AV9BarCodPar = aP3[0];
      this.aP3 = aP3;
      pbas001.this.AV22BarUniMed = aP4[0];
      this.aP4 = aP4;
      pbas001.this.AV15BarKgm = aP5[0];
      this.aP5 = aP5;
      pbas001.this.AV16barMtr = aP6[0];
      this.aP6 = aP6;
      pbas001.this.AV27Coste_f = aP7[0];
      this.aP7 = aP7;
      pbas001.this.AV33Coste_teo = aP8[0];
      this.aP8 = aP8;
      pbas001.this.AV115Traza = aP9[0];
      this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV83TasasEstandar ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TASSTD", ""), GXv_int2) ;
      pbas001.this.GXt_int1 = GXv_int2[0] ;
      AV83TasasEstandar = GXt_int1 ;
      if ( AV115Traza == 1 )
      {
         AV109Nominf = GXutil.str( AV8BarCod, 8, 0) + "-" + GXutil.str( AV10BarCodReo, 1, 0) + AV9BarCodPar + "_" + GXutil.trim( AV120Pgmdesc) ;
         AV110File = ((GXutil.strcmp(AV114Carpeta, "")==0) ? httpContext.getMessage( "C:\\Informes_acatex\\Informes", "")+"\\"+GXutil.trim( AV109Nominf)+httpContext.getMessage( ".csv", "") : GXutil.trim( AV114Carpeta)+"\\"+GXutil.trim( AV109Nominf)+httpContext.getMessage( ".csv", "")) ;
         if ( new app.core.file(remoteHandle, context).executeUdp( AV110File) )
         {
            Cond_result = true ;
         }
         else
         {
            Cond_result = false ;
         }
         if ( Cond_result )
         {
            AV111Stat = GXutil.deleteFile( AV110File) ;
         }
         GXt_int3 = AV112hnd ;
         GXv_int4[0] = GXt_int3 ;
         new app.core.fcreate(remoteHandle, context).execute( AV110File, GXv_int4) ;
         pbas001.this.GXt_int3 = GXv_int4[0] ;
         AV112hnd = (short)(GXt_int3) ;
         AV113Control = httpContext.getMessage( "HDR", "") + ";" + httpContext.getMessage( "Maquina", "") + ";" + httpContext.getMessage( "Tiempo Real(HHMM)", "") + ";" + httpContext.getMessage( "Minutos", "") + ";" + httpContext.getMessage( "Coste Minuto Maq", "") + ";" + httpContext.getMessage( "Coste Kg", "") + ";" + httpContext.getMessage( "Coste Fijo", "") + ";" ;
         AV113Control += httpContext.getMessage( "Unidad", "") + ";" + httpContext.getMessage( "Kilos", "") + ";" + httpContext.getMessage( "Kilos T", "") + ";" + httpContext.getMessage( "Metros", "") + ";" + httpContext.getMessage( "Metros T", "") + ";" + httpContext.getMessage( "Coste Mm", "") + ";" + httpContext.getMessage( "Coste Fab", "") ;
         GXt_int1 = (byte)(AV111Stat) ;
         GXv_int2[0] = GXt_int1 ;
         new app.core.fputs(remoteHandle, context).execute( AV112hnd, AV113Control, GXv_int2) ;
         pbas001.this.GXt_int1 = GXv_int2[0] ;
         AV111Stat = GXt_int1 ;
         System.out.println( AV113Control );
      }
      AV108mAgua = DecimalUtil.doubleToDec(0) ;
      AV107menergia = DecimalUtil.doubleToDec(0) ;
      AV106mgas = DecimalUtil.doubleToDec(0) ;
      AV105mmod = DecimalUtil.doubleToDec(0) ;
      AV104mmoi = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P05SG2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV10BarCodReo), AV9BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P05SG2_A130BarCodPar[0] ;
         A132BarCodReo = P05SG2_A132BarCodReo[0] ;
         A129BarCod = P05SG2_A129BarCod[0] ;
         A603MaqCodBis = P05SG2_A603MaqCodBis[0] ;
         A215BarTieRea = P05SG2_A215BarTieRea[0] ;
         A5719BarFasKgT = P05SG2_A5719BarFasKgT[0] ;
         n5719BarFasKgT = P05SG2_n5719BarFasKgT[0] ;
         A3837BarFasKgm = P05SG2_A3837BarFasKgm[0] ;
         n3837BarFasKgm = P05SG2_n3837BarFasKgm[0] ;
         A5720BarFasMtT = P05SG2_A5720BarFasMtT[0] ;
         n5720BarFasMtT = P05SG2_n5720BarFasMtT[0] ;
         A3838BarFasMtr = P05SG2_A3838BarFasMtr[0] ;
         n3838BarFasMtr = P05SG2_n3838BarFasMtr[0] ;
         A150BarFacTin = P05SG2_A150BarFacTin[0] ;
         A194BarOrdLin = P05SG2_A194BarOrdLin[0] ;
         A758ProCod = P05SG2_A758ProCod[0] ;
         AV39MaqCod = A603MaqCodBis ;
         AV26CosPrd = DecimalUtil.doubleToDec(0) ;
         AV80CosPrd1 = DecimalUtil.doubleToDec(0) ;
         AV28Coste_m = DecimalUtil.doubleToDec(0) ;
         /* Execute user subroutine: 'COSMIN' */
         S131 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV38CosTiR == 0 )
         {
            AV43Min = (byte)(DecimalUtil.decToDouble((A215BarTieRea.subtract(DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(A215BarTieRea))))).multiply(DecimalUtil.doubleToDec(100)))) ;
            AV56Tiempo_m = (int)((GXutil.Int( DecimalUtil.decToDouble(A215BarTieRea))*60)+AV43Min) ;
            AV20BarTieRea = A215BarTieRea ;
         }
         else
         {
            /* Execute user subroutine: 'TIEREA' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV20BarTieRea = DecimalUtil.doubleToDec(GXutil.Int( AV56Tiempo_m/ (double) (60))+(AV56Tiempo_m-(GXutil.Int( AV56Tiempo_m/ (double) (60))*60))/ (double) (100)) ;
         }
         AV80CosPrd1 = ((AV40MaqCosMin.doubleValue()>0) ? GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV56Tiempo_m).multiply(AV40MaqCosMin)), 2) : ((AV116MaqCosKg.doubleValue()>0) ? GXutil.roundDecimal( (AV15BarKgm.multiply(AV116MaqCosKg)), 2) : ((AV117maqcosfijo.doubleValue()>0) ? AV117maqcosfijo : DecimalUtil.doubleToDec(0)))) ;
         if ( GXutil.strcmp(GXutil.trim( AV58TipmaqCod), httpContext.getMessage( "EXT", "")) == 0 )
         {
            AV28Coste_m = ((GXutil.strcmp(AV22BarUniMed, httpContext.getMessage( "K", ""))==0) ? GXutil.roundDecimal( (AV40MaqCosMin.multiply(AV15BarKgm)), 2) : GXutil.roundDecimal( (AV40MaqCosMin.multiply(AV16barMtr)), 2)) ;
         }
         else
         {
            if ( GXutil.strcmp(AV22BarUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               if ( A5719BarFasKgT.doubleValue() > 0 )
               {
                  AV28Coste_m = (AV80CosPrd1.multiply(A3837BarFasKgm)).divide(A5719BarFasKgT, 18, java.math.RoundingMode.DOWN) ;
                  AV67Unidades = A3837BarFasKgm ;
                  AV68Unidadest = A5719BarFasKgT ;
               }
               else
               {
                  if ( AV15BarKgm.doubleValue() > 0 )
                  {
                     AV28Coste_m = (AV80CosPrd1.multiply(AV15BarKgm)).divide(AV15BarKgm, 18, java.math.RoundingMode.DOWN) ;
                  }
                  else
                  {
                     AV28Coste_m = AV80CosPrd1 ;
                  }
                  AV67Unidades = AV15BarKgm ;
                  AV68Unidadest = AV15BarKgm ;
               }
            }
            else
            {
               if ( A5720BarFasMtT.doubleValue() > 0 )
               {
                  AV28Coste_m = (AV80CosPrd1.multiply(A3838BarFasMtr)).divide(A5720BarFasMtT, 18, java.math.RoundingMode.DOWN) ;
                  AV67Unidades = A3838BarFasMtr ;
                  AV68Unidadest = A5720BarFasMtT ;
               }
               else
               {
                  if ( AV16barMtr.doubleValue() > 0 )
                  {
                     AV28Coste_m = (AV80CosPrd1.multiply(AV16barMtr)).divide(AV16barMtr, 18, java.math.RoundingMode.DOWN) ;
                  }
                  else
                  {
                     AV28Coste_m = AV80CosPrd1 ;
                  }
                  AV67Unidades = AV16barMtr ;
                  AV68Unidadest = AV16barMtr ;
               }
            }
         }
         if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) != 0 )
         {
            AV30Coste_p_k = DecimalUtil.doubleToDec(0) ;
            if ( AV15BarKgm.doubleValue() > 0 )
            {
               AV30Coste_p_k = AV28Coste_m.divide(AV15BarKgm, 18, java.math.RoundingMode.DOWN) ;
            }
         }
         else
         {
            AV30Coste_p_k = DecimalUtil.doubleToDec(0) ;
            if ( AV15BarKgm.doubleValue() > 0 )
            {
               AV30Coste_p_k = (AV28Coste_m.add(AV14BarCosPro).add(AV13BarCosAny)).divide(AV15BarKgm, 18, java.math.RoundingMode.DOWN) ;
            }
         }
         if ( AV28Coste_m.doubleValue() > 0 )
         {
            AV27Coste_f = AV27Coste_f.add(AV28Coste_m) ;
         }
         if ( AV34Coste_tm.doubleValue() > 0 )
         {
            AV33Coste_teo = AV33Coste_teo.add(AV34Coste_tm) ;
         }
         /* Execute user subroutine: 'TIEPAR' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( AV56Tiempo_m > 0 )
         {
            AV28Coste_m = GXutil.roundDecimal( (DecimalUtil.doubleToDec(AV56Tiempo_m).multiply(AV40MaqCosMin)), 2) ;
            AV30Coste_p_k = ((AV15BarKgm.doubleValue()>0) ? AV28Coste_m.divide(AV15BarKgm, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
            if ( AV28Coste_m.doubleValue() > 0 )
            {
               AV27Coste_f = AV27Coste_f.add(AV28Coste_m) ;
            }
         }
         if ( AV115Traza == 1 )
         {
            AV113Control = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar + ";" + AV39MaqCod + ";" + GXutil.str( AV20BarTieRea, 5, 2) + ";" + GXutil.str( AV56Tiempo_m, 6, 0) + ";" + GXutil.str( AV40MaqCosMin, 10, 4) + ";" + GXutil.str( AV116MaqCosKg, 10, 4) + ";" + GXutil.str( AV117maqcosfijo, 10, 4) + ";" ;
            AV113Control += AV22BarUniMed + ";" + GXutil.str( A3837BarFasKgm, 9, 2) + ";" + GXutil.str( A5719BarFasKgT, 9, 2) + ";" + GXutil.str( A3838BarFasMtr, 9, 2) + ";" + GXutil.str( A5720BarFasMtT, 9, 2) + ";" + GXutil.str( AV28Coste_m, 10, 2) + ";" + GXutil.str( AV27Coste_f, 10, 2) ;
            GXt_int1 = (byte)(AV111Stat) ;
            GXv_int2[0] = GXt_int1 ;
            new app.core.fputs(remoteHandle, context).execute( AV112hnd, AV113Control, GXv_int2) ;
            pbas001.this.GXt_int1 = GXv_int2[0] ;
            AV111Stat = GXt_int1 ;
            System.out.println( AV113Control );
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV115Traza == 1 )
      {
         GXt_int1 = (byte)(AV111Stat) ;
         GXv_int2[0] = GXt_int1 ;
         new app.core.fclose(remoteHandle, context).execute( AV112hnd, GXv_int2) ;
         pbas001.this.GXt_int1 = GXv_int2[0] ;
         AV111Stat = GXt_int1 ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'TIEPAR' Routine */
      returnInSub = false ;
      AV56Tiempo_m = 0 ;
      /* Using cursor P05SG3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV10BarCodReo), AV9BarCodPar, Short.valueOf(AV17BarOrdLin)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A556HisProEst = P05SG3_A556HisProEst[0] ;
         A656ParCod = P05SG3_A656ParCod[0] ;
         n656ParCod = P05SG3_n656ParCod[0] ;
         A194BarOrdLin = P05SG3_A194BarOrdLin[0] ;
         A130BarCodPar = P05SG3_A130BarCodPar[0] ;
         A132BarCodReo = P05SG3_A132BarCodReo[0] ;
         A129BarCod = P05SG3_A129BarCod[0] ;
         A561HisProLin = P05SG3_A561HisProLin[0] ;
         A558HisProFec = P05SG3_A558HisProFec[0] ;
         A4440HisProDTI = P05SG3_A4440HisProDTI[0] ;
         n4440HisProDTI = P05SG3_n4440HisProDTI[0] ;
         A4441HisProDTF = P05SG3_A4441HisProDTF[0] ;
         n4441HisProDTF = P05SG3_n4441HisProDTF[0] ;
         A602MaqCod = P05SG3_A602MaqCod[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         AV56Tiempo_m = (int)(AV56Tiempo_m+A5605HisProTr2) ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S121( )
   {
      /* 'TIEREA' Routine */
      returnInSub = false ;
      AV56Tiempo_m = 0 ;
      /* Using cursor P05SG4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV10BarCodReo), AV9BarCodPar, Short.valueOf(AV17BarOrdLin)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A556HisProEst = P05SG4_A556HisProEst[0] ;
         A656ParCod = P05SG4_A656ParCod[0] ;
         n656ParCod = P05SG4_n656ParCod[0] ;
         A194BarOrdLin = P05SG4_A194BarOrdLin[0] ;
         A130BarCodPar = P05SG4_A130BarCodPar[0] ;
         A132BarCodReo = P05SG4_A132BarCodReo[0] ;
         A129BarCod = P05SG4_A129BarCod[0] ;
         A561HisProLin = P05SG4_A561HisProLin[0] ;
         A558HisProFec = P05SG4_A558HisProFec[0] ;
         A4440HisProDTI = P05SG4_A4440HisProDTI[0] ;
         n4440HisProDTI = P05SG4_n4440HisProDTI[0] ;
         A4441HisProDTF = P05SG4_A4441HisProDTF[0] ;
         n4441HisProDTF = P05SG4_n4441HisProDTF[0] ;
         A602MaqCod = P05SG4_A602MaqCod[0] ;
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
         {
            A5605HisProTr2 = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)), 0))) ;
         }
         else
         {
            A5605HisProTr2 = (short)(0) ;
         }
         AV56Tiempo_m = (int)(AV56Tiempo_m+(GXutil.Int( A5605HisProTr2))) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public void S131( )
   {
      /* 'COSMIN' Routine */
      returnInSub = false ;
      AV40MaqCosMin = DecimalUtil.doubleToDec(0) ;
      AV41maqDsc = "" ;
      AV117maqcosfijo = DecimalUtil.doubleToDec(0) ;
      AV116MaqCosKg = DecimalUtil.doubleToDec(0) ;
      AV58TipmaqCod = "" ;
      /* Using cursor P05SG5 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV39MaqCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A602MaqCod = P05SG5_A602MaqCod[0] ;
         A605MaqCosMin = P05SG5_A605MaqCosMin[0] ;
         n605MaqCosMin = P05SG5_n605MaqCosMin[0] ;
         A606MaqDsc = P05SG5_A606MaqDsc[0] ;
         n606MaqDsc = P05SG5_n606MaqDsc[0] ;
         A1011TipMaqCod = P05SG5_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P05SG5_n1011TipMaqCod[0] ;
         A13179MaqCosFijo = P05SG5_A13179MaqCosFijo[0] ;
         n13179MaqCosFijo = P05SG5_n13179MaqCosFijo[0] ;
         A13180MaqCosKg = P05SG5_A13180MaqCosKg[0] ;
         n13180MaqCosKg = P05SG5_n13180MaqCosKg[0] ;
         AV40MaqCosMin = ((AV83TasasEstandar>0) ? DecimalUtil.doubleToDec(0) : A605MaqCosMin) ;
         AV41maqDsc = A606MaqDsc ;
         AV58TipmaqCod = A1011TipMaqCod ;
         AV117maqcosfijo = A13179MaqCosFijo ;
         AV116MaqCosKg = A13180MaqCosKg ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbas001.this.A396EmprCod;
      this.aP1[0] = pbas001.this.AV8BarCod;
      this.aP2[0] = pbas001.this.AV10BarCodReo;
      this.aP3[0] = pbas001.this.AV9BarCodPar;
      this.aP4[0] = pbas001.this.AV22BarUniMed;
      this.aP5[0] = pbas001.this.AV15BarKgm;
      this.aP6[0] = pbas001.this.AV16barMtr;
      this.aP7[0] = pbas001.this.AV27Coste_f;
      this.aP8[0] = pbas001.this.AV33Coste_teo;
      this.aP9[0] = pbas001.this.AV115Traza;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV109Nominf = "" ;
      AV120Pgmdesc = "" ;
      AV110File = "" ;
      AV114Carpeta = "" ;
      GXv_int4 = new long[1] ;
      AV113Control = "" ;
      AV108mAgua = DecimalUtil.ZERO ;
      AV107menergia = DecimalUtil.ZERO ;
      AV106mgas = DecimalUtil.ZERO ;
      AV105mmod = DecimalUtil.ZERO ;
      AV104mmoi = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P05SG2_A396EmprCod = new String[] {""} ;
      P05SG2_A130BarCodPar = new String[] {""} ;
      P05SG2_A132BarCodReo = new byte[1] ;
      P05SG2_A129BarCod = new int[1] ;
      P05SG2_A603MaqCodBis = new String[] {""} ;
      P05SG2_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05SG2_A5719BarFasKgT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05SG2_n5719BarFasKgT = new boolean[] {false} ;
      P05SG2_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05SG2_n3837BarFasKgm = new boolean[] {false} ;
      P05SG2_A5720BarFasMtT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05SG2_n5720BarFasMtT = new boolean[] {false} ;
      P05SG2_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05SG2_n3838BarFasMtr = new boolean[] {false} ;
      P05SG2_A150BarFacTin = new String[] {""} ;
      P05SG2_A194BarOrdLin = new short[1] ;
      P05SG2_A758ProCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A603MaqCodBis = "" ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A5719BarFasKgT = DecimalUtil.ZERO ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A5720BarFasMtT = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A150BarFacTin = "" ;
      A758ProCod = "" ;
      AV39MaqCod = "" ;
      AV26CosPrd = DecimalUtil.ZERO ;
      AV80CosPrd1 = DecimalUtil.ZERO ;
      AV28Coste_m = DecimalUtil.ZERO ;
      AV20BarTieRea = DecimalUtil.ZERO ;
      AV40MaqCosMin = DecimalUtil.ZERO ;
      AV116MaqCosKg = DecimalUtil.ZERO ;
      AV117maqcosfijo = DecimalUtil.ZERO ;
      AV58TipmaqCod = "" ;
      AV67Unidades = DecimalUtil.ZERO ;
      AV68Unidadest = DecimalUtil.ZERO ;
      AV30Coste_p_k = DecimalUtil.ZERO ;
      AV14BarCosPro = DecimalUtil.ZERO ;
      AV13BarCosAny = DecimalUtil.ZERO ;
      AV34Coste_tm = DecimalUtil.ZERO ;
      GXv_int2 = new byte[1] ;
      P05SG3_A396EmprCod = new String[] {""} ;
      P05SG3_A556HisProEst = new byte[1] ;
      P05SG3_A656ParCod = new short[1] ;
      P05SG3_n656ParCod = new boolean[] {false} ;
      P05SG3_A194BarOrdLin = new short[1] ;
      P05SG3_A130BarCodPar = new String[] {""} ;
      P05SG3_A132BarCodReo = new byte[1] ;
      P05SG3_A129BarCod = new int[1] ;
      P05SG3_A561HisProLin = new int[1] ;
      P05SG3_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05SG3_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P05SG3_n4440HisProDTI = new boolean[] {false} ;
      P05SG3_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P05SG3_n4441HisProDTF = new boolean[] {false} ;
      P05SG3_A602MaqCod = new String[] {""} ;
      A558HisProFec = GXutil.nullDate() ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A602MaqCod = "" ;
      P05SG4_A396EmprCod = new String[] {""} ;
      P05SG4_A556HisProEst = new byte[1] ;
      P05SG4_A656ParCod = new short[1] ;
      P05SG4_n656ParCod = new boolean[] {false} ;
      P05SG4_A194BarOrdLin = new short[1] ;
      P05SG4_A130BarCodPar = new String[] {""} ;
      P05SG4_A132BarCodReo = new byte[1] ;
      P05SG4_A129BarCod = new int[1] ;
      P05SG4_A561HisProLin = new int[1] ;
      P05SG4_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P05SG4_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P05SG4_n4440HisProDTI = new boolean[] {false} ;
      P05SG4_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P05SG4_n4441HisProDTF = new boolean[] {false} ;
      P05SG4_A602MaqCod = new String[] {""} ;
      AV41maqDsc = "" ;
      P05SG5_A396EmprCod = new String[] {""} ;
      P05SG5_A602MaqCod = new String[] {""} ;
      P05SG5_A605MaqCosMin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05SG5_n605MaqCosMin = new boolean[] {false} ;
      P05SG5_A606MaqDsc = new String[] {""} ;
      P05SG5_n606MaqDsc = new boolean[] {false} ;
      P05SG5_A1011TipMaqCod = new String[] {""} ;
      P05SG5_n1011TipMaqCod = new boolean[] {false} ;
      P05SG5_A13179MaqCosFijo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05SG5_n13179MaqCosFijo = new boolean[] {false} ;
      P05SG5_A13180MaqCosKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P05SG5_n13180MaqCosKg = new boolean[] {false} ;
      A605MaqCosMin = DecimalUtil.ZERO ;
      A606MaqDsc = "" ;
      A1011TipMaqCod = "" ;
      A13179MaqCosFijo = DecimalUtil.ZERO ;
      A13180MaqCosKg = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbas001__default(),
         new Object[] {
             new Object[] {
            P05SG2_A396EmprCod, P05SG2_A130BarCodPar, P05SG2_A132BarCodReo, P05SG2_A129BarCod, P05SG2_A603MaqCodBis, P05SG2_A215BarTieRea, P05SG2_A5719BarFasKgT, P05SG2_n5719BarFasKgT, P05SG2_A3837BarFasKgm, P05SG2_n3837BarFasKgm,
            P05SG2_A5720BarFasMtT, P05SG2_n5720BarFasMtT, P05SG2_A3838BarFasMtr, P05SG2_n3838BarFasMtr, P05SG2_A150BarFacTin, P05SG2_A194BarOrdLin, P05SG2_A758ProCod
            }
            , new Object[] {
            P05SG3_A396EmprCod, P05SG3_A556HisProEst, P05SG3_A656ParCod, P05SG3_n656ParCod, P05SG3_A194BarOrdLin, P05SG3_A130BarCodPar, P05SG3_A132BarCodReo, P05SG3_A129BarCod, P05SG3_A561HisProLin, P05SG3_A558HisProFec,
            P05SG3_A4440HisProDTI, P05SG3_n4440HisProDTI, P05SG3_A4441HisProDTF, P05SG3_n4441HisProDTF, P05SG3_A602MaqCod
            }
            , new Object[] {
            P05SG4_A396EmprCod, P05SG4_A556HisProEst, P05SG4_A656ParCod, P05SG4_n656ParCod, P05SG4_A194BarOrdLin, P05SG4_A130BarCodPar, P05SG4_A132BarCodReo, P05SG4_A129BarCod, P05SG4_A561HisProLin, P05SG4_A558HisProFec,
            P05SG4_A4440HisProDTI, P05SG4_n4440HisProDTI, P05SG4_A4441HisProDTF, P05SG4_n4441HisProDTF, P05SG4_A602MaqCod
            }
            , new Object[] {
            P05SG5_A396EmprCod, P05SG5_A602MaqCod, P05SG5_A605MaqCosMin, P05SG5_n605MaqCosMin, P05SG5_A606MaqDsc, P05SG5_n606MaqDsc, P05SG5_A1011TipMaqCod, P05SG5_n1011TipMaqCod, P05SG5_A13179MaqCosFijo, P05SG5_n13179MaqCosFijo,
            P05SG5_A13180MaqCosKg, P05SG5_n13180MaqCosKg
            }
         }
      );
      AV120Pgmdesc = httpContext.getMessage( "Costes Basicos, calculo costes Fabrica", "") ;
      /* GeneXus formulas. */
      AV120Pgmdesc = httpContext.getMessage( "Costes Basicos, calculo costes Fabrica", "") ;
      Gx_err = (short)(0) ;
   }

   private byte AV10BarCodReo ;
   private byte AV115Traza ;
   private byte AV83TasasEstandar ;
   private byte A132BarCodReo ;
   private byte AV38CosTiR ;
   private byte AV43Min ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A556HisProEst ;
   private short AV111Stat ;
   private short AV112hnd ;
   private short A194BarOrdLin ;
   private short AV17BarOrdLin ;
   private short A656ParCod ;
   private short A5605HisProTr2 ;
   private short Gx_err ;
   private int AV8BarCod ;
   private int A129BarCod ;
   private int AV56Tiempo_m ;
   private int A561HisProLin ;
   private long GXt_int3 ;
   private long GXv_int4[] ;
   private java.math.BigDecimal AV15BarKgm ;
   private java.math.BigDecimal AV16barMtr ;
   private java.math.BigDecimal AV27Coste_f ;
   private java.math.BigDecimal AV33Coste_teo ;
   private java.math.BigDecimal AV108mAgua ;
   private java.math.BigDecimal AV107menergia ;
   private java.math.BigDecimal AV106mgas ;
   private java.math.BigDecimal AV105mmod ;
   private java.math.BigDecimal AV104mmoi ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A5719BarFasKgT ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A5720BarFasMtT ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal AV26CosPrd ;
   private java.math.BigDecimal AV80CosPrd1 ;
   private java.math.BigDecimal AV28Coste_m ;
   private java.math.BigDecimal AV20BarTieRea ;
   private java.math.BigDecimal AV40MaqCosMin ;
   private java.math.BigDecimal AV116MaqCosKg ;
   private java.math.BigDecimal AV117maqcosfijo ;
   private java.math.BigDecimal AV67Unidades ;
   private java.math.BigDecimal AV68Unidadest ;
   private java.math.BigDecimal AV30Coste_p_k ;
   private java.math.BigDecimal AV14BarCosPro ;
   private java.math.BigDecimal AV13BarCosAny ;
   private java.math.BigDecimal AV34Coste_tm ;
   private java.math.BigDecimal A605MaqCosMin ;
   private java.math.BigDecimal A13179MaqCosFijo ;
   private java.math.BigDecimal A13180MaqCosKg ;
   private String A396EmprCod ;
   private String AV9BarCodPar ;
   private String AV22BarUniMed ;
   private String AV109Nominf ;
   private String AV120Pgmdesc ;
   private String AV114Carpeta ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A603MaqCodBis ;
   private String A150BarFacTin ;
   private String A758ProCod ;
   private String AV39MaqCod ;
   private String AV58TipmaqCod ;
   private String A602MaqCod ;
   private String AV41maqDsc ;
   private String A606MaqDsc ;
   private String A1011TipMaqCod ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A558HisProFec ;
   private boolean Cond_result ;
   private boolean n5719BarFasKgT ;
   private boolean n3837BarFasKgm ;
   private boolean n5720BarFasMtT ;
   private boolean n3838BarFasMtr ;
   private boolean returnInSub ;
   private boolean n656ParCod ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private boolean n605MaqCosMin ;
   private boolean n606MaqDsc ;
   private boolean n1011TipMaqCod ;
   private boolean n13179MaqCosFijo ;
   private boolean n13180MaqCosKg ;
   private String AV110File ;
   private String AV113Control ;
   private byte[] aP9 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private IDataStoreProvider pr_default ;
   private String[] P05SG2_A396EmprCod ;
   private String[] P05SG2_A130BarCodPar ;
   private byte[] P05SG2_A132BarCodReo ;
   private int[] P05SG2_A129BarCod ;
   private String[] P05SG2_A603MaqCodBis ;
   private java.math.BigDecimal[] P05SG2_A215BarTieRea ;
   private java.math.BigDecimal[] P05SG2_A5719BarFasKgT ;
   private boolean[] P05SG2_n5719BarFasKgT ;
   private java.math.BigDecimal[] P05SG2_A3837BarFasKgm ;
   private boolean[] P05SG2_n3837BarFasKgm ;
   private java.math.BigDecimal[] P05SG2_A5720BarFasMtT ;
   private boolean[] P05SG2_n5720BarFasMtT ;
   private java.math.BigDecimal[] P05SG2_A3838BarFasMtr ;
   private boolean[] P05SG2_n3838BarFasMtr ;
   private String[] P05SG2_A150BarFacTin ;
   private short[] P05SG2_A194BarOrdLin ;
   private String[] P05SG2_A758ProCod ;
   private String[] P05SG3_A396EmprCod ;
   private byte[] P05SG3_A556HisProEst ;
   private short[] P05SG3_A656ParCod ;
   private boolean[] P05SG3_n656ParCod ;
   private short[] P05SG3_A194BarOrdLin ;
   private String[] P05SG3_A130BarCodPar ;
   private byte[] P05SG3_A132BarCodReo ;
   private int[] P05SG3_A129BarCod ;
   private int[] P05SG3_A561HisProLin ;
   private java.util.Date[] P05SG3_A558HisProFec ;
   private java.util.Date[] P05SG3_A4440HisProDTI ;
   private boolean[] P05SG3_n4440HisProDTI ;
   private java.util.Date[] P05SG3_A4441HisProDTF ;
   private boolean[] P05SG3_n4441HisProDTF ;
   private String[] P05SG3_A602MaqCod ;
   private String[] P05SG4_A396EmprCod ;
   private byte[] P05SG4_A556HisProEst ;
   private short[] P05SG4_A656ParCod ;
   private boolean[] P05SG4_n656ParCod ;
   private short[] P05SG4_A194BarOrdLin ;
   private String[] P05SG4_A130BarCodPar ;
   private byte[] P05SG4_A132BarCodReo ;
   private int[] P05SG4_A129BarCod ;
   private int[] P05SG4_A561HisProLin ;
   private java.util.Date[] P05SG4_A558HisProFec ;
   private java.util.Date[] P05SG4_A4440HisProDTI ;
   private boolean[] P05SG4_n4440HisProDTI ;
   private java.util.Date[] P05SG4_A4441HisProDTF ;
   private boolean[] P05SG4_n4441HisProDTF ;
   private String[] P05SG4_A602MaqCod ;
   private String[] P05SG5_A396EmprCod ;
   private String[] P05SG5_A602MaqCod ;
   private java.math.BigDecimal[] P05SG5_A605MaqCosMin ;
   private boolean[] P05SG5_n605MaqCosMin ;
   private String[] P05SG5_A606MaqDsc ;
   private boolean[] P05SG5_n606MaqDsc ;
   private String[] P05SG5_A1011TipMaqCod ;
   private boolean[] P05SG5_n1011TipMaqCod ;
   private java.math.BigDecimal[] P05SG5_A13179MaqCosFijo ;
   private boolean[] P05SG5_n13179MaqCosFijo ;
   private java.math.BigDecimal[] P05SG5_A13180MaqCosKg ;
   private boolean[] P05SG5_n13180MaqCosKg ;
}

final  class pbas001__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05SG2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, MaqCodBis, BarTieRea, BarFasKgT, BarFasKgm, BarFasMtT, BarFasMtr, BarFacTin, BarOrdLin, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05SG3", "SELECT EmprCod, HisProEst, ParCod, BarOrdLin, BarCodPar, BarCodReo, BarCod, HisProLin, HisProFec, HisProDTI, HisProDTF, MaqCod FROM TXPLHIPRO WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarOrdLin = ?) AND (ParCod = 0) AND (HisProEst = 1) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05SG4", "SELECT EmprCod, HisProEst, ParCod, BarOrdLin, BarCodPar, BarCodReo, BarCod, HisProLin, HisProFec, HisProDTI, HisProDTF, MaqCod FROM TXPLHIPRO WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarOrdLin = ?) AND (ParCod = 0) AND (HisProEst = 1) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P05SG5", "SELECT EmprCod, MaqCod, MaqCosMin, MaqDsc, TipMaqCod, MaqCosFijo, MaqCosKg FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 1);
               ((short[]) buf[15])[0] = rslt.getShort(12);
               ((String[]) buf[16])[0] = rslt.getString(13, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(12, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,4);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,4);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

