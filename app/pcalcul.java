package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcalcul extends GXProcedure
{
   public pcalcul( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcalcul.class ), "" );
   }

   public pcalcul( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String[] aP0 ,
                                           int[] aP1 ,
                                           byte[] aP2 ,
                                           String[] aP3 ,
                                           String[] aP4 ,
                                           java.util.Date[] aP5 ,
                                           java.math.BigDecimal[] aP6 ,
                                           java.math.BigDecimal[] aP7 )
   {
      pcalcul.this.aP8 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.util.Date[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.util.Date[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 )
   {
      pcalcul.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcalcul.this.AV19BarCod = aP1[0];
      this.aP1 = aP1;
      pcalcul.this.AV20BarCodReo = aP2[0];
      this.aP2 = aP2;
      pcalcul.this.AV21BarCodPar = aP3[0];
      this.aP3 = aP3;
      pcalcul.this.AV17FasCod = aP4[0];
      this.aP4 = aP4;
      pcalcul.this.AV16FecTeo = aP5[0];
      this.aP5 = aP5;
      pcalcul.this.AV22TieTot = aP6[0];
      this.aP6 = aP6;
      pcalcul.this.AV23DecTot = aP7[0];
      this.aP7 = aP7;
      pcalcul.this.AV18Resto = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV85Nocommit ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCOMM", ""), GXv_int2) ;
      pcalcul.this.GXt_int1 = GXv_int2[0] ;
      AV85Nocommit = GXt_int1 ;
      GXv_int2[0] = AV57Finite ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FINITE", ""), GXv_int2) ;
      pcalcul.this.AV57Finite = GXv_int2[0] ;
      GXv_int2[0] = AV73SoloMtr ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MTRPLN", ""), GXv_int2) ;
      pcalcul.this.AV73SoloMtr = GXv_int2[0] ;
      GXv_int2[0] = (byte)(DecimalUtil.decToDouble(AV74SoloKgm)) ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KILPLN", ""), GXv_int2) ;
      pcalcul.this.AV74SoloKgm = DecimalUtil.doubleToDec(GXv_int2[0]) ;
      GXt_int1 = AV81Indutexma ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INDUTE", ""), GXv_int2) ;
      pcalcul.this.GXt_int1 = GXv_int2[0] ;
      AV81Indutexma = GXt_int1 ;
      GXt_int1 = AV84Vmtspm ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VMTSPM", ""), GXv_int2) ;
      pcalcul.this.GXt_int1 = GXv_int2[0] ;
      AV84Vmtspm = GXt_int1 ;
      GXt_int3 = AV75MinTint ;
      GXv_int4[0] = GXt_int3 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MINTIN", ""), GXv_int4) ;
      pcalcul.this.GXt_int3 = GXv_int4[0] ;
      AV75MinTint = (short)(GXt_int3) ;
      GXt_int1 = AV87Bros ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "BROS", ""), GXv_int2) ;
      pcalcul.this.GXt_int1 = GXv_int2[0] ;
      AV87Bros = GXt_int1 ;
      GXt_char5 = AV88Carpeta ;
      GXv_char6[0] = GXt_char5 ;
      new app.core.pbusdsc2(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARPET", ""), GXv_char6) ;
      pcalcul.this.GXt_char5 = GXv_char6[0] ;
      AV88Carpeta = GXt_char5 ;
      GXt_int1 = AV101tteotxt ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TXTTEO", ""), GXv_int2) ;
      pcalcul.this.GXt_int1 = GXv_int2[0] ;
      AV101tteotxt = GXt_int1 ;
      GXt_int1 = AV102tintEst ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINEST", ""), GXv_int2) ;
      pcalcul.this.GXt_int1 = GXv_int2[0] ;
      AV102tintEst = GXt_int1 ;
      GXt_int1 = AV105Variantes ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FTRVTE", ""), GXv_int2) ;
      pcalcul.this.GXt_int1 = GXv_int2[0] ;
      AV105Variantes = GXt_int1 ;
      GXt_int3 = AV77Cancho ;
      GXv_int4[0] = GXt_int3 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CANCHO", ""), GXv_int4) ;
      pcalcul.this.GXt_int3 = GXv_int4[0] ;
      AV77Cancho = (short)(GXt_int3) ;
      GXt_int3 = AV79Cgrm2 ;
      GXv_int4[0] = GXt_int3 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CGMR2", ""), GXv_int4) ;
      pcalcul.this.GXt_int3 = GXv_int4[0] ;
      AV79Cgrm2 = (short)(GXt_int3) ;
      AV15TieTeo = DecimalUtil.doubleToDec(0) ;
      AV18Resto = DecimalUtil.doubleToDec(0) ;
      AV23DecTot = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P001O2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV17FasCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P001O2_A457FasCod[0] ;
         A468FasPrePie = P001O2_A468FasPrePie[0] ;
         n468FasPrePie = P001O2_n468FasPrePie[0] ;
         A469FasPreSal = P001O2_A469FasPreSal[0] ;
         n469FasPreSal = P001O2_n469FasPreSal[0] ;
         A456FasActTin = P001O2_A456FasActTin[0] ;
         n456FasActTin = P001O2_n456FasActTin[0] ;
         A472FasVelPro = P001O2_A472FasVelPro[0] ;
         n472FasVelPro = P001O2_n472FasVelPro[0] ;
         A464FasNumPas = P001O2_A464FasNumPas[0] ;
         n464FasNumPas = P001O2_n464FasNumPas[0] ;
         A602MaqCod = P001O2_A602MaqCod[0] ;
         n602MaqCod = P001O2_n602MaqCod[0] ;
         A2999MaqPri = P001O2_A2999MaqPri[0] ;
         n2999MaqPri = P001O2_n2999MaqPri[0] ;
         A459FasDec = P001O2_A459FasDec[0] ;
         n459FasDec = P001O2_n459FasDec[0] ;
         A5168FasPreMC = P001O2_A5168FasPreMC[0] ;
         n5168FasPreMC = P001O2_n5168FasPreMC[0] ;
         A4286FasForMul = P001O2_A4286FasForMul[0] ;
         n4286FasForMul = P001O2_n4286FasForMul[0] ;
         A2999MaqPri = P001O2_A2999MaqPri[0] ;
         n2999MaqPri = P001O2_n2999MaqPri[0] ;
         AV24PrePie = A468FasPrePie ;
         AV25PreSal = A469FasPreSal ;
         AV26ActTin = A456FasActTin ;
         AV27Veloc = A472FasVelPro ;
         AV28NumPas = A464FasNumPas ;
         AV29MaqCod = A602MaqCod ;
         AV58MaqPri = A2999MaqPri ;
         AV35Decal = A459FasDec ;
         AV63FasPreMC = A5168FasPreMC ;
         AV69FasFormul = A4286FasForMul ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P001O4 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV19BarCod), Byte.valueOf(AV20BarCodReo), AV21BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P001O4_A130BarCodPar[0] ;
         A132BarCodReo = P001O4_A132BarCodReo[0] ;
         A129BarCod = P001O4_A129BarCod[0] ;
         A125BarAncAca1 = P001O4_A125BarAncAca1[0] ;
         A1909BarGraAca = P001O4_A1909BarGraAca[0] ;
         A228BarUniMed = P001O4_A228BarUniMed[0] ;
         A211BarRdt = P001O4_A211BarRdt[0] ;
         A155BarFecCli = P001O4_A155BarFecCli[0] ;
         A157BarFecEnt = P001O4_A157BarFecEnt[0] ;
         A212BarSer = P001O4_A212BarSer[0] ;
         A135BarColNom = P001O4_A135BarColNom[0] ;
         A136BarColNum = P001O4_A136BarColNum[0] ;
         A214BarSua = P001O4_A214BarSua[0] ;
         A177BarLar = P001O4_A177BarLar[0] ;
         A218BarTipCol = P001O4_A218BarTipCol[0] ;
         A252CliCod = P001O4_A252CliCod[0] ;
         n252CliCod = P001O4_n252CliCod[0] ;
         A1798BarDibCli = P001O4_A1798BarDibCli[0] ;
         A1799BarDibInt = P001O4_A1799BarDibInt[0] ;
         A166BarKgm = P001O4_A166BarKgm[0] ;
         A184BarMtr = P001O4_A184BarMtr[0] ;
         A199BarPie1 = P001O4_A199BarPie1[0] ;
         A365DisDes = P001O4_A365DisDes[0] ;
         A898BarPieNDes = P001O4_A898BarPieNDes[0] ;
         A166BarKgm = P001O4_A166BarKgm[0] ;
         A184BarMtr = P001O4_A184BarMtr[0] ;
         A199BarPie1 = P001O4_A199BarPie1[0] ;
         A898BarPieNDes = P001O4_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         AV30Kilos = A166BarKgm ;
         AV31Metros = A184BarMtr ;
         AV76Ancho = DecimalUtil.doubleToDec(0) ;
         AV78Grm2 = (short)(0) ;
         if ( AV31Metros.doubleValue() == 0 )
         {
            if ( A125BarAncAca1 == 0 )
            {
               AV76Ancho = DecimalUtil.doubleToDec(AV77Cancho/ (double) (100)) ;
            }
            else
            {
               AV76Ancho = DecimalUtil.doubleToDec(A125BarAncAca1/ (double) (100)) ;
            }
            if ( A1909BarGraAca == 0 )
            {
               AV78Grm2 = AV79Cgrm2 ;
            }
            else
            {
               AV78Grm2 = A1909BarGraAca ;
            }
            if ( (DecimalUtil.doubleToDec(AV78Grm2).multiply(AV76Ancho)).doubleValue() > 0 )
            {
               AV31Metros = (A166BarKgm.divide((DecimalUtil.doubleToDec(AV78Grm2).multiply(AV76Ancho)), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(1000)) ;
            }
         }
         AV32NumPie = (short)(A198BarPie) ;
         AV33UniMed = A228BarUniMed ;
         AV34Rendim = A211BarRdt ;
         if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV16FecTeo)) )
         {
            AV36FecDisCli = A155BarFecCli ;
         }
         else
         {
            AV36FecDisCli = AV16FecTeo ;
         }
         AV37FecFinPrv = A157BarFecEnt ;
         AV72BarSer = A212BarSer ;
         AV70BarColNom = A135BarColNom ;
         AV71BarColNum = A136BarColNum ;
         AV43Suavizado = A214BarSua ;
         AV59Barlar = A177BarLar ;
         AV61BarTipCol = A218BarTipCol ;
         AV65CliCod = A252CliCod ;
         AV66BarDibCli = A1798BarDibCli ;
         AV67BarDibInt = A1799BarDibInt ;
         /* Execute user subroutine: 'MOLCIL' */
         S121 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P001O5 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A761ProFasLin = P001O5_A761ProFasLin[0] ;
            n761ProFasLin = P001O5_n761ProFasLin[0] ;
            A758ProCod = P001O5_A758ProCod[0] ;
            AV82Procod = A758ProCod ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         AV103Nvariantes = (short)(0) ;
         /* Optimized group. */
         /* Using cursor P001O6 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         cV103Nvariantes = P001O6_AV103Nvariantes[0] ;
         pr_default.close(3);
         AV103Nvariantes = (short)(AV103Nvariantes+cV103Nvariantes*1) ;
         /* End optimized group. */
         AV104FactorVariantes = (short)(((AV103Nvariantes==0) ? 1 : ((AV105Variantes==1)&&(AV103Nvariantes>0) ? AV103Nvariantes : 1))) ;
         AV25PreSal = (short)(AV25PreSal*AV104FactorVariantes) ;
         if ( ( AV81Indutexma == 1 ) || ( AV84Vmtspm == 1 ) )
         {
            /* Execute user subroutine: 'SERPAU' */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               pr_default.close(1);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV83Velocidad.doubleValue() > 0 )
            {
               AV27Veloc = AV83Velocidad ;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV112GXLvl159 = (byte)(0) ;
      /* Using cursor P001O7 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV65CliCod), AV72BarSer, AV70BarColNom, Integer.valueOf(AV71BarColNum), Byte.valueOf(AV61BarTipCol)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A831TipColCod = P001O7_A831TipColCod[0] ;
         A483ForColNum = P001O7_A483ForColNum[0] ;
         A482ForColNom = P001O7_A482ForColNom[0] ;
         A494ForSer = P001O7_A494ForSer[0] ;
         A252CliCod = P001O7_A252CliCod[0] ;
         n252CliCod = P001O7_n252CliCod[0] ;
         AV112GXLvl159 = (byte)(1) ;
         AV42ExColor = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      if ( AV112GXLvl159 == 0 )
      {
         AV42ExColor = (byte)(2) ;
      }
      if ( ( AV57Finite == 1 ) && ( GXutil.strcmp(AV58MaqPri, httpContext.getMessage( "S", "")) == 0 ) )
      {
         AV60Largopza = (short)(GXutil.lval( AV59Barlar)) ;
         if ( AV60Largopza > 0 )
         {
            AV32NumPie = (short)(DecimalUtil.decToDouble(AV31Metros.divide(DecimalUtil.doubleToDec(AV60Largopza), 18, java.math.RoundingMode.DOWN))) ;
         }
      }
      GXv_char6[0] = A396EmprCod ;
      GXv_char7[0] = "021500" ;
      GXv_int4[0] = AV38FacCar ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char6, GXv_char7, GXv_int4) ;
      pcalcul.this.A396EmprCod = GXv_char6[0] ;
      pcalcul.this.AV38FacCar = GXv_int4[0] ;
      GXv_char7[0] = A396EmprCod ;
      GXv_char6[0] = "030400" ;
      GXv_int4[0] = AV39MedTie ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char7, GXv_char6, GXv_int4) ;
      pcalcul.this.A396EmprCod = GXv_char7[0] ;
      pcalcul.this.AV39MedTie = GXv_int4[0] ;
      AV41HorPro = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P001O8 */
      pr_default.execute(5, new Object[] {A396EmprCod, AV29MaqCod});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A602MaqCod = P001O8_A602MaqCod[0] ;
         n602MaqCod = P001O8_n602MaqCod[0] ;
         A615MaqMinPro = P001O8_A615MaqMinPro[0] ;
         n615MaqMinPro = P001O8_n615MaqMinPro[0] ;
         A612MaqHorPro = P001O8_A612MaqHorPro[0] ;
         n612MaqHorPro = P001O8_n612MaqHorPro[0] ;
         AV40HorasProd = GXutil.concat( GXutil.str( A612MaqHorPro, 2, 0), GXutil.str( A615MaqMinPro, 2, 0), ".") ;
         AV41HorPro = CommonUtil.decimalVal( AV40HorasProd, ".") ;
         if ( AV41HorPro.doubleValue() == 0 )
         {
            AV41HorPro = DecimalUtil.stringToDec("24.00") ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
      /* Execute user subroutine: 'CALENDARIO' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV49DiasDec = (AV35Decal.multiply(DecimalUtil.doubleToDec(AV38FacCar))).add(AV18Resto) ;
      if ( AV48Flag == 0 )
      {
         AV16FecTeo = GXutil.dadd(AV36FecDisCli,+((int)(GXutil.Int( DecimalUtil.decToDouble(AV49DiasDec))))) ;
         AV18Resto = AV49DiasDec.subtract(DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(AV49DiasDec)))) ;
      }
      else
      {
         while ( AV49DiasDec.doubleValue() >= 1 )
         {
            AV47Dia = (byte)(AV47Dia+1) ;
            AV36FecDisCli = GXutil.dadd(AV36FecDisCli,+(1)) ;
            if ( AV46Mes != GXutil.month( AV36FecDisCli) )
            {
               /* Execute user subroutine: 'CALENDARIO' */
               S141 ();
               if ( returnInSub )
               {
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            AV52NDia = (byte)(AV47Dia*2) ;
            AV51Horas = (byte)(GXutil.lval( GXutil.substring( AV50HorNPro, AV52NDia, 2))) ;
            AV53Tot = DecimalUtil.doubleToDec(AV51Horas).divide(AV41HorPro, 18, java.math.RoundingMode.DOWN) ;
            if ( AV53Tot.doubleValue() > 1 )
            {
               AV53Tot = DecimalUtil.doubleToDec(1) ;
            }
            AV49DiasDec = AV49DiasDec.subtract((DecimalUtil.doubleToDec(1).subtract(AV53Tot))) ;
         }
         AV16FecTeo = AV36FecDisCli ;
         AV18Resto = AV49DiasDec ;
      }
      AV22TieTot = DecimalUtil.doubleToDec(0) ;
      if ( ( GXutil.strcmp(AV26ActTin, httpContext.getMessage( "S", "")) == 0 ) || ( GXutil.strcmp(AV69FasFormul, httpContext.getMessage( "S", "")) == 0 ) )
      {
         AV68Aux = DecimalUtil.doubleToDec(GXutil.len( AV29MaqCod)) ;
         AV114GXLvl232 = (byte)(0) ;
         /* Using cursor P001O9 */
         pr_default.execute(6, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A619MaqTinTip = P001O9_A619MaqTinTip[0] ;
            n619MaqTinTip = P001O9_n619MaqTinTip[0] ;
            A602MaqCod = P001O9_A602MaqCod[0] ;
            n602MaqCod = P001O9_n602MaqCod[0] ;
            if ( GXutil.strcmp(A619MaqTinTip, httpContext.getMessage( "CO", "")) == 0 )
            {
               AV114GXLvl232 = (byte)(1) ;
               if ( GXutil.len( A602MaqCod) >= AV68Aux.doubleValue() )
               {
                  if ( GXutil.strcmp(GXutil.substring( A602MaqCod, 1, (int)(DecimalUtil.decToDouble(AV68Aux))), AV29MaqCod) == 0 )
                  {
                     AV26ActTin = httpContext.getMessage( "N", "") ;
                     AV69FasFormul = httpContext.getMessage( "N", "") ;
                     /* Exit For each command. Update data (if necessary), close cursors & exit. */
                     if (true) break;
                  }
               }
            }
            pr_default.readNext(6);
         }
         pr_default.close(6);
         if ( AV114GXLvl232 == 0 )
         {
         }
      }
      if ( ( AV42ExColor == 1 ) && ( GXutil.strcmp(AV26ActTin, httpContext.getMessage( "S", "")) == 0 ) )
      {
         /* Using cursor P001O10 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV19BarCod), Byte.valueOf(AV20BarCodReo), AV21BarCodPar});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A130BarCodPar = P001O10_A130BarCodPar[0] ;
            A132BarCodReo = P001O10_A132BarCodReo[0] ;
            A129BarCod = P001O10_A129BarCod[0] ;
            A252CliCod = P001O10_A252CliCod[0] ;
            n252CliCod = P001O10_n252CliCod[0] ;
            A212BarSer = P001O10_A212BarSer[0] ;
            A135BarColNom = P001O10_A135BarColNom[0] ;
            A136BarColNum = P001O10_A136BarColNum[0] ;
            A218BarTipCol = P001O10_A218BarTipCol[0] ;
            A180BarMaqCod = P001O10_A180BarMaqCod[0] ;
            AV55BarCliCod = A252CliCod ;
            GXv_char7[0] = A396EmprCod ;
            GXv_int4[0] = A252CliCod ;
            GXv_char6[0] = A212BarSer ;
            GXv_char8[0] = A135BarColNom ;
            GXv_int9[0] = A136BarColNum ;
            GXv_int2[0] = A218BarTipCol ;
            GXv_int10[0] = AV56TiempoT ;
            new app.pfortie(remoteHandle, context).execute( GXv_char7, GXv_int4, GXv_char6, GXv_char8, GXv_int9, GXv_int2, GXv_int10) ;
            pcalcul.this.A396EmprCod = GXv_char7[0] ;
            pcalcul.this.A252CliCod = GXv_int4[0] ;
            pcalcul.this.A212BarSer = GXv_char6[0] ;
            pcalcul.this.A135BarColNom = GXv_char8[0] ;
            pcalcul.this.A136BarColNum = GXv_int9[0] ;
            pcalcul.this.A218BarTipCol = GXv_int2[0] ;
            pcalcul.this.AV56TiempoT = GXv_int10[0] ;
            if ( AV81Indutexma == 1 )
            {
               GXv_char8[0] = A396EmprCod ;
               GXv_int9[0] = A252CliCod ;
               GXv_char7[0] = A212BarSer ;
               GXv_char6[0] = A135BarColNom ;
               GXv_int4[0] = A136BarColNum ;
               GXv_int2[0] = A218BarTipCol ;
               GXv_char11[0] = A180BarMaqCod ;
               GXv_int10[0] = AV80TtmqPr ;
               new app.pttmqpr(remoteHandle, context).execute( GXv_char8, GXv_int9, GXv_char7, GXv_char6, GXv_int4, GXv_int2, GXv_char11, GXv_int10) ;
               pcalcul.this.A396EmprCod = GXv_char8[0] ;
               pcalcul.this.A252CliCod = GXv_int9[0] ;
               pcalcul.this.A212BarSer = GXv_char7[0] ;
               pcalcul.this.A135BarColNom = GXv_char6[0] ;
               pcalcul.this.A136BarColNum = GXv_int4[0] ;
               pcalcul.this.A218BarTipCol = GXv_int2[0] ;
               pcalcul.this.A180BarMaqCod = GXv_char11[0] ;
               pcalcul.this.AV80TtmqPr = GXv_int10[0] ;
               if ( AV80TtmqPr > 0 )
               {
                  AV56TiempoT = AV80TtmqPr ;
               }
            }
            AV86VarAux = DecimalUtil.doubleToDec(AV56TiempoT+AV25PreSal+(AV24PrePie*AV32NumPie)) ;
            /* Using cursor P001O11 */
            pr_default.execute(8, new Object[] {A396EmprCod, AV43Suavizado});
            while ( (pr_default.getStatus(8) != 101) )
            {
               A764ProForCod = P001O11_A764ProForCod[0] ;
               A766ProForDsc = P001O11_A766ProForDsc[0] ;
               A771ProForTie = P001O11_A771ProForTie[0] ;
               AV86VarAux = AV86VarAux.add((DecimalUtil.doubleToDec(A771ProForTie).add(AV44TiePreTot))) ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(8);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(7);
      }
      else
      {
         if ( GXutil.strcmp(AV26ActTin, httpContext.getMessage( "S", "")) == 0 )
         {
            /* Execute user subroutine: 'TIPCOL' */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV86VarAux = ((AV62TipColTie!=0) ? DecimalUtil.doubleToDec(AV62TipColTie) : DecimalUtil.doubleToDec((AV75MinTint/ (double) (60)))) ;
         }
         else
         {
            if ( GXutil.strcmp(AV69FasFormul, httpContext.getMessage( "S", "")) == 0 )
            {
               /* Using cursor P001O12 */
               pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(AV19BarCod), Byte.valueOf(AV20BarCodReo), AV21BarCodPar, AV17FasCod});
               while ( (pr_default.getStatus(9) != 101) )
               {
                  A129BarCod = P001O12_A129BarCod[0] ;
                  A132BarCodReo = P001O12_A132BarCodReo[0] ;
                  A130BarCodPar = P001O12_A130BarCodPar[0] ;
                  A457FasCod = P001O12_A457FasCod[0] ;
                  A252CliCod = P001O12_A252CliCod[0] ;
                  n252CliCod = P001O12_n252CliCod[0] ;
                  A758ProCod = P001O12_A758ProCod[0] ;
                  A212BarSer = P001O12_A212BarSer[0] ;
                  A194BarOrdLin = P001O12_A194BarOrdLin[0] ;
                  A252CliCod = P001O12_A252CliCod[0] ;
                  n252CliCod = P001O12_n252CliCod[0] ;
                  A212BarSer = P001O12_A212BarSer[0] ;
                  AV55BarCliCod = A252CliCod ;
                  GXt_int12 = AV56TiempoT ;
                  GXv_char11[0] = A396EmprCod ;
                  GXv_int9[0] = A252CliCod ;
                  GXv_char8[0] = A212BarSer ;
                  GXv_char7[0] = A758ProCod ;
                  GXv_char6[0] = A457FasCod ;
                  GXv_int10[0] = GXt_int12 ;
                  new app.pfortie1(remoteHandle, context).execute( GXv_char11, GXv_int9, GXv_char8, GXv_char7, GXv_char6, GXv_int10) ;
                  pcalcul.this.A396EmprCod = GXv_char11[0] ;
                  pcalcul.this.A252CliCod = GXv_int9[0] ;
                  pcalcul.this.A212BarSer = GXv_char8[0] ;
                  pcalcul.this.A758ProCod = GXv_char7[0] ;
                  pcalcul.this.A457FasCod = GXv_char6[0] ;
                  pcalcul.this.GXt_int12 = GXv_int10[0] ;
                  AV56TiempoT = GXt_int12 ;
                  AV86VarAux = DecimalUtil.doubleToDec(AV56TiempoT).add(AV44TiePreTot) ;
                  pr_default.readNext(9);
               }
               pr_default.close(9);
            }
            else
            {
               if ( AV27Veloc.doubleValue() != 0 )
               {
                  AV44TiePreTot = DecimalUtil.doubleToDec(AV25PreSal+(AV24PrePie*AV32NumPie)) ;
                  if ( ( GXutil.strcmp(AV33UniMed, httpContext.getMessage( "M", "")) == 0 ) || ( AV73SoloMtr == 1 ) )
                  {
                     AV86VarAux = AV44TiePreTot.add(((AV31Metros.divide(AV27Veloc, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(AV28NumPas)))) ;
                  }
                  else
                  {
                     if ( AV74SoloKgm.doubleValue() == 1 )
                     {
                        AV86VarAux = AV44TiePreTot.add(((AV30Kilos.divide(AV27Veloc, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(AV28NumPas)))) ;
                     }
                     else
                     {
                        if ( AV34Rendim.doubleValue() > 0 )
                        {
                           AV86VarAux = AV44TiePreTot.add(((AV30Kilos.multiply(AV34Rendim).divide(AV27Veloc, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(AV28NumPas)))) ;
                           AV86VarAux = AV44TiePreTot.add(((AV31Metros.divide(AV27Veloc, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(AV28NumPas)))) ;
                        }
                     }
                  }
               }
               else
               {
                  AV86VarAux = AV44TiePreTot ;
               }
               AV86VarAux = AV86VarAux.add(DecimalUtil.doubleToDec(((AV64BarMolCil*AV63FasPreMC)))) ;
            }
         }
      }
      if ( DecimalUtil.compareTo((AV86VarAux.divide(DecimalUtil.doubleToDec(AV39MedTie), 18, java.math.RoundingMode.DOWN)), DecimalUtil.stringToDec("99.99")) > 0 )
      {
         AV86VarAux = DecimalUtil.doubleToDec(0) ;
      }
      AV22TieTot = AV86VarAux.divide(DecimalUtil.doubleToDec(AV39MedTie), 18, java.math.RoundingMode.DOWN) ;
      AV23DecTot = AV35Decal.multiply(DecimalUtil.doubleToDec(AV38FacCar)) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'TIPCOL' Routine */
      returnInSub = false ;
      AV62TipColTie = 0 ;
      /* Using cursor P001O13 */
      pr_default.execute(10, new Object[] {A396EmprCod, Byte.valueOf(AV61BarTipCol)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A831TipColCod = P001O13_A831TipColCod[0] ;
         A4999TipColTie = P001O13_A4999TipColTie[0] ;
         n4999TipColTie = P001O13_n4999TipColTie[0] ;
         AV62TipColTie = A4999TipColTie ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void S121( )
   {
      /* 'MOLCIL' Routine */
      returnInSub = false ;
      AV64BarMolCil = (short)(0) ;
      /* Using cursor P001O14 */
      pr_default.execute(11, new Object[] {A396EmprCod, AV66BarDibCli, Integer.valueOf(AV67BarDibInt)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A1014DibInt = P001O14_A1014DibInt[0] ;
         A252CliCod = P001O14_A252CliCod[0] ;
         n252CliCod = P001O14_n252CliCod[0] ;
         A1013DibCli = P001O14_A1013DibCli[0] ;
         A1823DibTipMaq = P001O14_A1823DibTipMaq[0] ;
         n1823DibTipMaq = P001O14_n1823DibTipMaq[0] ;
         if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "R", "")) == 0 )
         {
            /* Optimized group. */
            /* Using cursor P001O15 */
            pr_default.execute(12, new Object[] {A396EmprCod, A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
            cV64BarMolCil = P001O15_AV64BarMolCil[0] ;
            pr_default.close(12);
            AV64BarMolCil = (short)(AV64BarMolCil+cV64BarMolCil*1) ;
            /* End optimized group. */
         }
         if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "P", "")) == 0 )
         {
            /* Optimized group. */
            /* Using cursor P001O16 */
            pr_default.execute(13, new Object[] {A396EmprCod, A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
            cV64BarMolCil = P001O16_AV64BarMolCil[0] ;
            pr_default.close(13);
            AV64BarMolCil = (short)(AV64BarMolCil+cV64BarMolCil*1) ;
            /* End optimized group. */
         }
         pr_default.readNext(11);
      }
      pr_default.close(11);
   }

   public void S131( )
   {
      /* 'SERPAU' Routine */
      returnInSub = false ;
      AV83Velocidad = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P001O17 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(AV65CliCod), AV72BarSer, AV82Procod, AV17FasCod});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A457FasCod = P001O17_A457FasCod[0] ;
         A758ProCod = P001O17_A758ProCod[0] ;
         A65ArtCod = P001O17_A65ArtCod[0] ;
         A252CliCod = P001O17_A252CliCod[0] ;
         n252CliCod = P001O17_n252CliCod[0] ;
         A8560ArtFasFac = P001O17_A8560ArtFasFac[0] ;
         AV83Velocidad = A8560ArtFasFac ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(14);
   }

   public void S141( )
   {
      /* 'CALENDARIO' Routine */
      returnInSub = false ;
      AV45Anyo = (short)(GXutil.year( AV36FecDisCli)) ;
      if ( AV45Anyo >= 2000 )
      {
         AV45Anyo = (short)(AV45Anyo-2000) ;
      }
      else
      {
         AV45Anyo = (short)(AV45Anyo-1900) ;
      }
      AV46Mes = (byte)(GXutil.month( AV36FecDisCli)) ;
      AV47Dia = (byte)(GXutil.day( AV36FecDisCli)) ;
      AV48Flag = (byte)(0) ;
      /* Using cursor P001O18 */
      pr_default.execute(15, new Object[] {A396EmprCod, AV29MaqCod, Short.valueOf(AV45Anyo), Byte.valueOf(AV46Mes)});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A614MaqMes = P001O18_A614MaqMes[0] ;
         A599MaqAny = P001O18_A599MaqAny[0] ;
         A602MaqCod = P001O18_A602MaqCod[0] ;
         n602MaqCod = P001O18_n602MaqCod[0] ;
         A610MaqHNPMes = P001O18_A610MaqHNPMes[0] ;
         n610MaqHNPMes = P001O18_n610MaqHNPMes[0] ;
         AV48Flag = (byte)(1) ;
         AV50HorNPro = A610MaqHNPMes ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(15);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcalcul.this.A396EmprCod;
      this.aP1[0] = pcalcul.this.AV19BarCod;
      this.aP2[0] = pcalcul.this.AV20BarCodReo;
      this.aP3[0] = pcalcul.this.AV21BarCodPar;
      this.aP4[0] = pcalcul.this.AV17FasCod;
      this.aP5[0] = pcalcul.this.AV16FecTeo;
      this.aP6[0] = pcalcul.this.AV22TieTot;
      this.aP7[0] = pcalcul.this.AV23DecTot;
      this.aP8[0] = pcalcul.this.AV18Resto;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV74SoloKgm = DecimalUtil.ZERO ;
      AV88Carpeta = "" ;
      GXt_char5 = "" ;
      AV15TieTeo = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P001O2_A396EmprCod = new String[] {""} ;
      P001O2_A457FasCod = new String[] {""} ;
      P001O2_A468FasPrePie = new short[1] ;
      P001O2_n468FasPrePie = new boolean[] {false} ;
      P001O2_A469FasPreSal = new short[1] ;
      P001O2_n469FasPreSal = new boolean[] {false} ;
      P001O2_A456FasActTin = new String[] {""} ;
      P001O2_n456FasActTin = new boolean[] {false} ;
      P001O2_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001O2_n472FasVelPro = new boolean[] {false} ;
      P001O2_A464FasNumPas = new short[1] ;
      P001O2_n464FasNumPas = new boolean[] {false} ;
      P001O2_A602MaqCod = new String[] {""} ;
      P001O2_n602MaqCod = new boolean[] {false} ;
      P001O2_A2999MaqPri = new String[] {""} ;
      P001O2_n2999MaqPri = new boolean[] {false} ;
      P001O2_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001O2_n459FasDec = new boolean[] {false} ;
      P001O2_A5168FasPreMC = new short[1] ;
      P001O2_n5168FasPreMC = new boolean[] {false} ;
      P001O2_A4286FasForMul = new String[] {""} ;
      P001O2_n4286FasForMul = new boolean[] {false} ;
      A457FasCod = "" ;
      A456FasActTin = "" ;
      A472FasVelPro = DecimalUtil.ZERO ;
      A602MaqCod = "" ;
      A2999MaqPri = "" ;
      A459FasDec = DecimalUtil.ZERO ;
      A4286FasForMul = "" ;
      AV26ActTin = "" ;
      AV27Veloc = DecimalUtil.ZERO ;
      AV29MaqCod = "" ;
      AV58MaqPri = "" ;
      AV35Decal = DecimalUtil.ZERO ;
      AV69FasFormul = "" ;
      P001O4_A396EmprCod = new String[] {""} ;
      P001O4_A130BarCodPar = new String[] {""} ;
      P001O4_A132BarCodReo = new byte[1] ;
      P001O4_A129BarCod = new int[1] ;
      P001O4_A125BarAncAca1 = new short[1] ;
      P001O4_A1909BarGraAca = new short[1] ;
      P001O4_A228BarUniMed = new String[] {""} ;
      P001O4_A211BarRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001O4_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P001O4_A157BarFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P001O4_A212BarSer = new String[] {""} ;
      P001O4_A135BarColNom = new String[] {""} ;
      P001O4_A136BarColNum = new int[1] ;
      P001O4_A214BarSua = new String[] {""} ;
      P001O4_A177BarLar = new String[] {""} ;
      P001O4_A218BarTipCol = new byte[1] ;
      P001O4_A252CliCod = new int[1] ;
      P001O4_n252CliCod = new boolean[] {false} ;
      P001O4_A1798BarDibCli = new String[] {""} ;
      P001O4_A1799BarDibInt = new int[1] ;
      P001O4_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001O4_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P001O4_A199BarPie1 = new short[1] ;
      P001O4_A365DisDes = new String[] {""} ;
      P001O4_A898BarPieNDes = new int[1] ;
      A130BarCodPar = "" ;
      A228BarUniMed = "" ;
      A211BarRdt = DecimalUtil.ZERO ;
      A155BarFecCli = GXutil.nullDate() ;
      A157BarFecEnt = GXutil.nullDate() ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A214BarSua = "" ;
      A177BarLar = "" ;
      A1798BarDibCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      AV30Kilos = DecimalUtil.ZERO ;
      AV31Metros = DecimalUtil.ZERO ;
      AV76Ancho = DecimalUtil.ZERO ;
      AV33UniMed = "" ;
      AV34Rendim = DecimalUtil.ZERO ;
      AV36FecDisCli = GXutil.nullDate() ;
      AV37FecFinPrv = GXutil.nullDate() ;
      AV72BarSer = "" ;
      AV70BarColNom = "" ;
      AV43Suavizado = "" ;
      AV59Barlar = "" ;
      AV66BarDibCli = "" ;
      P001O5_A396EmprCod = new String[] {""} ;
      P001O5_A129BarCod = new int[1] ;
      P001O5_A132BarCodReo = new byte[1] ;
      P001O5_A130BarCodPar = new String[] {""} ;
      P001O5_A761ProFasLin = new short[1] ;
      P001O5_n761ProFasLin = new boolean[] {false} ;
      P001O5_A758ProCod = new String[] {""} ;
      A758ProCod = "" ;
      AV82Procod = "" ;
      P001O6_AV103Nvariantes = new short[1] ;
      AV83Velocidad = DecimalUtil.ZERO ;
      P001O7_A396EmprCod = new String[] {""} ;
      P001O7_A831TipColCod = new byte[1] ;
      P001O7_A483ForColNum = new int[1] ;
      P001O7_A482ForColNom = new String[] {""} ;
      P001O7_A494ForSer = new String[] {""} ;
      P001O7_A252CliCod = new int[1] ;
      P001O7_n252CliCod = new boolean[] {false} ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      AV41HorPro = DecimalUtil.ZERO ;
      P001O8_A396EmprCod = new String[] {""} ;
      P001O8_A602MaqCod = new String[] {""} ;
      P001O8_n602MaqCod = new boolean[] {false} ;
      P001O8_A615MaqMinPro = new byte[1] ;
      P001O8_n615MaqMinPro = new boolean[] {false} ;
      P001O8_A612MaqHorPro = new byte[1] ;
      P001O8_n612MaqHorPro = new boolean[] {false} ;
      AV40HorasProd = "" ;
      AV49DiasDec = DecimalUtil.ZERO ;
      AV50HorNPro = "" ;
      AV53Tot = DecimalUtil.ZERO ;
      AV68Aux = DecimalUtil.ZERO ;
      P001O9_A396EmprCod = new String[] {""} ;
      P001O9_A619MaqTinTip = new String[] {""} ;
      P001O9_n619MaqTinTip = new boolean[] {false} ;
      P001O9_A602MaqCod = new String[] {""} ;
      P001O9_n602MaqCod = new boolean[] {false} ;
      A619MaqTinTip = "" ;
      P001O10_A396EmprCod = new String[] {""} ;
      P001O10_A130BarCodPar = new String[] {""} ;
      P001O10_A132BarCodReo = new byte[1] ;
      P001O10_A129BarCod = new int[1] ;
      P001O10_A252CliCod = new int[1] ;
      P001O10_n252CliCod = new boolean[] {false} ;
      P001O10_A212BarSer = new String[] {""} ;
      P001O10_A135BarColNom = new String[] {""} ;
      P001O10_A136BarColNum = new int[1] ;
      P001O10_A218BarTipCol = new byte[1] ;
      P001O10_A180BarMaqCod = new String[] {""} ;
      A180BarMaqCod = "" ;
      GXv_int4 = new int[1] ;
      GXv_int2 = new byte[1] ;
      AV86VarAux = DecimalUtil.ZERO ;
      P001O11_A396EmprCod = new String[] {""} ;
      P001O11_A764ProForCod = new String[] {""} ;
      P001O11_A766ProForDsc = new String[] {""} ;
      P001O11_A771ProForTie = new short[1] ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      AV44TiePreTot = DecimalUtil.ZERO ;
      P001O12_A396EmprCod = new String[] {""} ;
      P001O12_A129BarCod = new int[1] ;
      P001O12_A132BarCodReo = new byte[1] ;
      P001O12_A130BarCodPar = new String[] {""} ;
      P001O12_A457FasCod = new String[] {""} ;
      P001O12_A252CliCod = new int[1] ;
      P001O12_n252CliCod = new boolean[] {false} ;
      P001O12_A758ProCod = new String[] {""} ;
      P001O12_A212BarSer = new String[] {""} ;
      P001O12_A194BarOrdLin = new short[1] ;
      GXv_char11 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_char8 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_char6 = new String[1] ;
      GXv_int10 = new short[1] ;
      P001O13_A396EmprCod = new String[] {""} ;
      P001O13_A831TipColCod = new byte[1] ;
      P001O13_A4999TipColTie = new int[1] ;
      P001O13_n4999TipColTie = new boolean[] {false} ;
      P001O14_A396EmprCod = new String[] {""} ;
      P001O14_A1014DibInt = new int[1] ;
      P001O14_A252CliCod = new int[1] ;
      P001O14_n252CliCod = new boolean[] {false} ;
      P001O14_A1013DibCli = new String[] {""} ;
      P001O14_A1823DibTipMaq = new String[] {""} ;
      P001O14_n1823DibTipMaq = new boolean[] {false} ;
      A1013DibCli = "" ;
      A1823DibTipMaq = "" ;
      P001O15_AV64BarMolCil = new short[1] ;
      P001O16_AV64BarMolCil = new short[1] ;
      P001O17_A396EmprCod = new String[] {""} ;
      P001O17_A457FasCod = new String[] {""} ;
      P001O17_A758ProCod = new String[] {""} ;
      P001O17_A65ArtCod = new String[] {""} ;
      P001O17_A252CliCod = new int[1] ;
      P001O17_n252CliCod = new boolean[] {false} ;
      P001O17_A8560ArtFasFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A65ArtCod = "" ;
      A8560ArtFasFac = DecimalUtil.ZERO ;
      P001O18_A396EmprCod = new String[] {""} ;
      P001O18_A614MaqMes = new byte[1] ;
      P001O18_A599MaqAny = new short[1] ;
      P001O18_A602MaqCod = new String[] {""} ;
      P001O18_n602MaqCod = new boolean[] {false} ;
      P001O18_A610MaqHNPMes = new String[] {""} ;
      P001O18_n610MaqHNPMes = new boolean[] {false} ;
      A610MaqHNPMes = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcalcul__default(),
         new Object[] {
             new Object[] {
            P001O2_A396EmprCod, P001O2_A457FasCod, P001O2_A468FasPrePie, P001O2_n468FasPrePie, P001O2_A469FasPreSal, P001O2_n469FasPreSal, P001O2_A456FasActTin, P001O2_n456FasActTin, P001O2_A472FasVelPro, P001O2_n472FasVelPro,
            P001O2_A464FasNumPas, P001O2_n464FasNumPas, P001O2_A602MaqCod, P001O2_n602MaqCod, P001O2_A2999MaqPri, P001O2_n2999MaqPri, P001O2_A459FasDec, P001O2_n459FasDec, P001O2_A5168FasPreMC, P001O2_n5168FasPreMC,
            P001O2_A4286FasForMul, P001O2_n4286FasForMul
            }
            , new Object[] {
            P001O4_A396EmprCod, P001O4_A130BarCodPar, P001O4_A132BarCodReo, P001O4_A129BarCod, P001O4_A125BarAncAca1, P001O4_A1909BarGraAca, P001O4_A228BarUniMed, P001O4_A211BarRdt, P001O4_A155BarFecCli, P001O4_A157BarFecEnt,
            P001O4_A212BarSer, P001O4_A135BarColNom, P001O4_A136BarColNum, P001O4_A214BarSua, P001O4_A177BarLar, P001O4_A218BarTipCol, P001O4_A252CliCod, P001O4_n252CliCod, P001O4_A1798BarDibCli, P001O4_A1799BarDibInt,
            P001O4_A166BarKgm, P001O4_A184BarMtr, P001O4_A199BarPie1, P001O4_A365DisDes, P001O4_A898BarPieNDes
            }
            , new Object[] {
            P001O5_A396EmprCod, P001O5_A129BarCod, P001O5_A132BarCodReo, P001O5_A130BarCodPar, P001O5_A761ProFasLin, P001O5_n761ProFasLin, P001O5_A758ProCod
            }
            , new Object[] {
            P001O6_AV103Nvariantes
            }
            , new Object[] {
            P001O7_A396EmprCod, P001O7_A831TipColCod, P001O7_A483ForColNum, P001O7_A482ForColNom, P001O7_A494ForSer, P001O7_A252CliCod
            }
            , new Object[] {
            P001O8_A396EmprCod, P001O8_A602MaqCod, P001O8_A615MaqMinPro, P001O8_n615MaqMinPro, P001O8_A612MaqHorPro, P001O8_n612MaqHorPro
            }
            , new Object[] {
            P001O9_A396EmprCod, P001O9_A619MaqTinTip, P001O9_n619MaqTinTip, P001O9_A602MaqCod
            }
            , new Object[] {
            P001O10_A396EmprCod, P001O10_A130BarCodPar, P001O10_A132BarCodReo, P001O10_A129BarCod, P001O10_A252CliCod, P001O10_n252CliCod, P001O10_A212BarSer, P001O10_A135BarColNom, P001O10_A136BarColNum, P001O10_A218BarTipCol,
            P001O10_A180BarMaqCod
            }
            , new Object[] {
            P001O11_A396EmprCod, P001O11_A764ProForCod, P001O11_A766ProForDsc, P001O11_A771ProForTie
            }
            , new Object[] {
            P001O12_A396EmprCod, P001O12_A129BarCod, P001O12_A132BarCodReo, P001O12_A130BarCodPar, P001O12_A457FasCod, P001O12_A252CliCod, P001O12_n252CliCod, P001O12_A758ProCod, P001O12_A212BarSer, P001O12_A194BarOrdLin
            }
            , new Object[] {
            P001O13_A396EmprCod, P001O13_A831TipColCod, P001O13_A4999TipColTie, P001O13_n4999TipColTie
            }
            , new Object[] {
            P001O14_A396EmprCod, P001O14_A1014DibInt, P001O14_A252CliCod, P001O14_A1013DibCli, P001O14_A1823DibTipMaq, P001O14_n1823DibTipMaq
            }
            , new Object[] {
            P001O15_AV64BarMolCil
            }
            , new Object[] {
            P001O16_AV64BarMolCil
            }
            , new Object[] {
            P001O17_A396EmprCod, P001O17_A457FasCod, P001O17_A758ProCod, P001O17_A65ArtCod, P001O17_A252CliCod, P001O17_A8560ArtFasFac
            }
            , new Object[] {
            P001O18_A396EmprCod, P001O18_A614MaqMes, P001O18_A599MaqAny, P001O18_A602MaqCod, P001O18_A610MaqHNPMes, P001O18_n610MaqHNPMes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20BarCodReo ;
   private byte AV85Nocommit ;
   private byte AV57Finite ;
   private byte AV73SoloMtr ;
   private byte AV81Indutexma ;
   private byte AV84Vmtspm ;
   private byte AV87Bros ;
   private byte AV101tteotxt ;
   private byte AV102tintEst ;
   private byte AV105Variantes ;
   private byte GXt_int1 ;
   private byte A132BarCodReo ;
   private byte A218BarTipCol ;
   private byte AV61BarTipCol ;
   private byte AV112GXLvl159 ;
   private byte A831TipColCod ;
   private byte AV42ExColor ;
   private byte A615MaqMinPro ;
   private byte A612MaqHorPro ;
   private byte AV48Flag ;
   private byte AV47Dia ;
   private byte AV46Mes ;
   private byte AV52NDia ;
   private byte AV51Horas ;
   private byte AV114GXLvl232 ;
   private byte GXv_int2[] ;
   private byte A614MaqMes ;
   private short AV75MinTint ;
   private short AV77Cancho ;
   private short AV79Cgrm2 ;
   private short A468FasPrePie ;
   private short A469FasPreSal ;
   private short A464FasNumPas ;
   private short A5168FasPreMC ;
   private short AV24PrePie ;
   private short AV25PreSal ;
   private short AV28NumPas ;
   private short AV63FasPreMC ;
   private short A125BarAncAca1 ;
   private short A1909BarGraAca ;
   private short A199BarPie1 ;
   private short AV78Grm2 ;
   private short AV32NumPie ;
   private short A761ProFasLin ;
   private short AV103Nvariantes ;
   private short cV103Nvariantes ;
   private short AV104FactorVariantes ;
   private short AV60Largopza ;
   private short AV56TiempoT ;
   private short AV80TtmqPr ;
   private short A771ProForTie ;
   private short A194BarOrdLin ;
   private short GXt_int12 ;
   private short GXv_int10[] ;
   private short AV64BarMolCil ;
   private short cV64BarMolCil ;
   private short AV45Anyo ;
   private short A599MaqAny ;
   private short Gx_err ;
   private int AV19BarCod ;
   private int GXt_int3 ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A252CliCod ;
   private int A1799BarDibInt ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV71BarColNum ;
   private int AV65CliCod ;
   private int AV67BarDibInt ;
   private int A483ForColNum ;
   private int AV38FacCar ;
   private int AV39MedTie ;
   private int AV55BarCliCod ;
   private int GXv_int4[] ;
   private int AV62TipColTie ;
   private int GXv_int9[] ;
   private int A4999TipColTie ;
   private int A1014DibInt ;
   private java.math.BigDecimal AV22TieTot ;
   private java.math.BigDecimal AV23DecTot ;
   private java.math.BigDecimal AV18Resto ;
   private java.math.BigDecimal AV74SoloKgm ;
   private java.math.BigDecimal AV15TieTeo ;
   private java.math.BigDecimal A472FasVelPro ;
   private java.math.BigDecimal A459FasDec ;
   private java.math.BigDecimal AV27Veloc ;
   private java.math.BigDecimal AV35Decal ;
   private java.math.BigDecimal A211BarRdt ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV30Kilos ;
   private java.math.BigDecimal AV31Metros ;
   private java.math.BigDecimal AV76Ancho ;
   private java.math.BigDecimal AV34Rendim ;
   private java.math.BigDecimal AV83Velocidad ;
   private java.math.BigDecimal AV41HorPro ;
   private java.math.BigDecimal AV49DiasDec ;
   private java.math.BigDecimal AV53Tot ;
   private java.math.BigDecimal AV68Aux ;
   private java.math.BigDecimal AV86VarAux ;
   private java.math.BigDecimal AV44TiePreTot ;
   private java.math.BigDecimal A8560ArtFasFac ;
   private String A396EmprCod ;
   private String AV21BarCodPar ;
   private String AV17FasCod ;
   private String AV88Carpeta ;
   private String GXt_char5 ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A456FasActTin ;
   private String A602MaqCod ;
   private String A2999MaqPri ;
   private String A4286FasForMul ;
   private String AV26ActTin ;
   private String AV29MaqCod ;
   private String AV58MaqPri ;
   private String AV69FasFormul ;
   private String A130BarCodPar ;
   private String A228BarUniMed ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A214BarSua ;
   private String A177BarLar ;
   private String A1798BarDibCli ;
   private String A365DisDes ;
   private String AV33UniMed ;
   private String AV72BarSer ;
   private String AV70BarColNom ;
   private String AV43Suavizado ;
   private String AV59Barlar ;
   private String AV66BarDibCli ;
   private String A758ProCod ;
   private String AV82Procod ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String AV40HorasProd ;
   private String A619MaqTinTip ;
   private String A180BarMaqCod ;
   private String A764ProForCod ;
   private String A766ProForDsc ;
   private String GXv_char11[] ;
   private String GXv_char8[] ;
   private String GXv_char7[] ;
   private String GXv_char6[] ;
   private String A1013DibCli ;
   private String A1823DibTipMaq ;
   private String A65ArtCod ;
   private java.util.Date AV16FecTeo ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A157BarFecEnt ;
   private java.util.Date AV36FecDisCli ;
   private java.util.Date AV37FecFinPrv ;
   private boolean n468FasPrePie ;
   private boolean n469FasPreSal ;
   private boolean n456FasActTin ;
   private boolean n472FasVelPro ;
   private boolean n464FasNumPas ;
   private boolean n602MaqCod ;
   private boolean n2999MaqPri ;
   private boolean n459FasDec ;
   private boolean n5168FasPreMC ;
   private boolean n4286FasForMul ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n761ProFasLin ;
   private boolean n615MaqMinPro ;
   private boolean n612MaqHorPro ;
   private boolean n619MaqTinTip ;
   private boolean n4999TipColTie ;
   private boolean n1823DibTipMaq ;
   private boolean n610MaqHNPMes ;
   private String AV50HorNPro ;
   private String A610MaqHNPMes ;
   private java.math.BigDecimal[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private java.util.Date[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P001O2_A396EmprCod ;
   private String[] P001O2_A457FasCod ;
   private short[] P001O2_A468FasPrePie ;
   private boolean[] P001O2_n468FasPrePie ;
   private short[] P001O2_A469FasPreSal ;
   private boolean[] P001O2_n469FasPreSal ;
   private String[] P001O2_A456FasActTin ;
   private boolean[] P001O2_n456FasActTin ;
   private java.math.BigDecimal[] P001O2_A472FasVelPro ;
   private boolean[] P001O2_n472FasVelPro ;
   private short[] P001O2_A464FasNumPas ;
   private boolean[] P001O2_n464FasNumPas ;
   private String[] P001O2_A602MaqCod ;
   private boolean[] P001O2_n602MaqCod ;
   private String[] P001O2_A2999MaqPri ;
   private boolean[] P001O2_n2999MaqPri ;
   private java.math.BigDecimal[] P001O2_A459FasDec ;
   private boolean[] P001O2_n459FasDec ;
   private short[] P001O2_A5168FasPreMC ;
   private boolean[] P001O2_n5168FasPreMC ;
   private String[] P001O2_A4286FasForMul ;
   private boolean[] P001O2_n4286FasForMul ;
   private String[] P001O4_A396EmprCod ;
   private String[] P001O4_A130BarCodPar ;
   private byte[] P001O4_A132BarCodReo ;
   private int[] P001O4_A129BarCod ;
   private short[] P001O4_A125BarAncAca1 ;
   private short[] P001O4_A1909BarGraAca ;
   private String[] P001O4_A228BarUniMed ;
   private java.math.BigDecimal[] P001O4_A211BarRdt ;
   private java.util.Date[] P001O4_A155BarFecCli ;
   private java.util.Date[] P001O4_A157BarFecEnt ;
   private String[] P001O4_A212BarSer ;
   private String[] P001O4_A135BarColNom ;
   private int[] P001O4_A136BarColNum ;
   private String[] P001O4_A214BarSua ;
   private String[] P001O4_A177BarLar ;
   private byte[] P001O4_A218BarTipCol ;
   private int[] P001O4_A252CliCod ;
   private boolean[] P001O4_n252CliCod ;
   private String[] P001O4_A1798BarDibCli ;
   private int[] P001O4_A1799BarDibInt ;
   private java.math.BigDecimal[] P001O4_A166BarKgm ;
   private java.math.BigDecimal[] P001O4_A184BarMtr ;
   private short[] P001O4_A199BarPie1 ;
   private String[] P001O4_A365DisDes ;
   private int[] P001O4_A898BarPieNDes ;
   private String[] P001O5_A396EmprCod ;
   private int[] P001O5_A129BarCod ;
   private byte[] P001O5_A132BarCodReo ;
   private String[] P001O5_A130BarCodPar ;
   private short[] P001O5_A761ProFasLin ;
   private boolean[] P001O5_n761ProFasLin ;
   private String[] P001O5_A758ProCod ;
   private short[] P001O6_AV103Nvariantes ;
   private String[] P001O7_A396EmprCod ;
   private byte[] P001O7_A831TipColCod ;
   private int[] P001O7_A483ForColNum ;
   private String[] P001O7_A482ForColNom ;
   private String[] P001O7_A494ForSer ;
   private int[] P001O7_A252CliCod ;
   private boolean[] P001O7_n252CliCod ;
   private String[] P001O8_A396EmprCod ;
   private String[] P001O8_A602MaqCod ;
   private boolean[] P001O8_n602MaqCod ;
   private byte[] P001O8_A615MaqMinPro ;
   private boolean[] P001O8_n615MaqMinPro ;
   private byte[] P001O8_A612MaqHorPro ;
   private boolean[] P001O8_n612MaqHorPro ;
   private String[] P001O9_A396EmprCod ;
   private String[] P001O9_A619MaqTinTip ;
   private boolean[] P001O9_n619MaqTinTip ;
   private String[] P001O9_A602MaqCod ;
   private boolean[] P001O9_n602MaqCod ;
   private String[] P001O10_A396EmprCod ;
   private String[] P001O10_A130BarCodPar ;
   private byte[] P001O10_A132BarCodReo ;
   private int[] P001O10_A129BarCod ;
   private int[] P001O10_A252CliCod ;
   private boolean[] P001O10_n252CliCod ;
   private String[] P001O10_A212BarSer ;
   private String[] P001O10_A135BarColNom ;
   private int[] P001O10_A136BarColNum ;
   private byte[] P001O10_A218BarTipCol ;
   private String[] P001O10_A180BarMaqCod ;
   private String[] P001O11_A396EmprCod ;
   private String[] P001O11_A764ProForCod ;
   private String[] P001O11_A766ProForDsc ;
   private short[] P001O11_A771ProForTie ;
   private String[] P001O12_A396EmprCod ;
   private int[] P001O12_A129BarCod ;
   private byte[] P001O12_A132BarCodReo ;
   private String[] P001O12_A130BarCodPar ;
   private String[] P001O12_A457FasCod ;
   private int[] P001O12_A252CliCod ;
   private boolean[] P001O12_n252CliCod ;
   private String[] P001O12_A758ProCod ;
   private String[] P001O12_A212BarSer ;
   private short[] P001O12_A194BarOrdLin ;
   private String[] P001O13_A396EmprCod ;
   private byte[] P001O13_A831TipColCod ;
   private int[] P001O13_A4999TipColTie ;
   private boolean[] P001O13_n4999TipColTie ;
   private String[] P001O14_A396EmprCod ;
   private int[] P001O14_A1014DibInt ;
   private int[] P001O14_A252CliCod ;
   private boolean[] P001O14_n252CliCod ;
   private String[] P001O14_A1013DibCli ;
   private String[] P001O14_A1823DibTipMaq ;
   private boolean[] P001O14_n1823DibTipMaq ;
   private short[] P001O15_AV64BarMolCil ;
   private short[] P001O16_AV64BarMolCil ;
   private String[] P001O17_A396EmprCod ;
   private String[] P001O17_A457FasCod ;
   private String[] P001O17_A758ProCod ;
   private String[] P001O17_A65ArtCod ;
   private int[] P001O17_A252CliCod ;
   private boolean[] P001O17_n252CliCod ;
   private java.math.BigDecimal[] P001O17_A8560ArtFasFac ;
   private String[] P001O18_A396EmprCod ;
   private byte[] P001O18_A614MaqMes ;
   private short[] P001O18_A599MaqAny ;
   private String[] P001O18_A602MaqCod ;
   private boolean[] P001O18_n602MaqCod ;
   private String[] P001O18_A610MaqHNPMes ;
   private boolean[] P001O18_n610MaqHNPMes ;
}

final  class pcalcul__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001O2", "SELECT T1.EmprCod, T1.FasCod, T1.FasPrePie, T1.FasPreSal, T1.FasActTin, T1.FasVelPro, T1.FasNumPas, T1.MaqCod, T2.MaqPri, T1.FasDec, T1.FasPreMC, T1.FasForMul FROM (TXPFASPRO T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) WHERE T1.EmprCod = ? and T1.FasCod = ? ORDER BY T1.EmprCod, T1.FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P001O4", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarAncAca1, T1.BarGraAca, T1.BarUniMed, T1.BarRdt, T1.BarFecCli, T1.BarFecEnt, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarSua, T1.BarLar, T1.BarTipCol, T1.CliCod, T1.BarDibCli, T1.BarDibInt, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P001O5", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProFasLin, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P001O6", "SELECT COUNT(*) FROM TXPBARCOM WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P001O7", "SELECT EmprCod, TipColCod, ForColNum, ForColNom, ForSer, CliCod FROM TXPCFORMU WHERE EmprCod = ? and CliCod = ? and ForSer = ? and ForColNom = ? and ForColNum = ? and TipColCod = ? ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P001O8", "SELECT EmprCod, MaqCod, MaqMinPro, MaqHorPro FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P001O9", "SELECT EmprCod, MaqTinTip, MaqCod FROM TXPMAQUIN WHERE (EmprCod = ?) AND (LENGTH(RTRIM(MaqCod)) = 6) ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P001O10", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol, BarMaqCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P001O11", "SELECT EmprCod, ProForCod, ProForDsc, ProForTie FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P001O12", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasCod, T2.CliCod, T1.ProCod, T2.BarSer, T1.BarOrdLin FROM (TXPBARFAS T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.FasCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P001O13", "SELECT EmprCod, TipColCod, TipColTie FROM TXPTIPCOL WHERE EmprCod = ? and TipColCod = ? ORDER BY EmprCod, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P001O14", "SELECT EmprCod, DibInt, CliCod, DibCli, DibTipMaq FROM TXPCDIBUJ WHERE (EmprCod = ? and DibCli = ?) AND (DibInt = ?) ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P001O15", "SELECT COUNT(*) FROM TXPLDIBUC WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P001O16", "SELECT COUNT(*) FROM TXPLDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P001O17", "SELECT EmprCod, FasCod, ProCod, ArtCod, CliCod, ArtFasFac FROM TXPSERPAU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P001O18", "SELECT EmprCod, MaqMes, MaqAny, MaqCod, MaqHNPMes FROM TXPMAQHNP WHERE EmprCod = ? and MaqCod = ? and MaqAny = ? and MaqMes = ? ORDER BY EmprCod, MaqCod, MaqAny, MaqMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(10,1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((short[]) buf[18])[0] = rslt.getShort(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 16);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 6);
               ((String[]) buf[14])[0] = rslt.getString(15, 10);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((int[]) buf[16])[0] = rslt.getInt(17);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(18, 16);
               ((int[]) buf[19])[0] = rslt.getInt(19);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(21,2);
               ((short[]) buf[22])[0] = rslt.getShort(22);
               ((String[]) buf[23])[0] = rslt.getString(23, 1);
               ((int[]) buf[24])[0] = rslt.getInt(24);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 12 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 13 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 8);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
      }
   }

}

