package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppla001 extends GXProcedure
{
   public ppla001( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppla001.class ), "" );
   }

   public ppla001( int remoteHandle ,
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
                           java.util.Date[] aP5 ,
                           java.math.BigDecimal[] aP6 ,
                           java.math.BigDecimal[] aP7 ,
                           java.math.BigDecimal[] aP8 ,
                           String[] aP9 ,
                           String[] aP10 ,
                           String[] aP11 ,
                           int[] aP12 ,
                           String[] aP13 ,
                           long[] aP14 )
   {
      ppla001.this.aP15 = new byte[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
      return aP15[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        java.util.Date[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        String[] aP11 ,
                        int[] aP12 ,
                        String[] aP13 ,
                        long[] aP14 ,
                        byte[] aP15 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             java.util.Date[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             String[] aP11 ,
                             int[] aP12 ,
                             String[] aP13 ,
                             long[] aP14 ,
                             byte[] aP15 )
   {
      ppla001.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppla001.this.AV19BarCod = aP1[0];
      this.aP1 = aP1;
      ppla001.this.AV20BarCodReo = aP2[0];
      this.aP2 = aP2;
      ppla001.this.AV21BarCodPar = aP3[0];
      this.aP3 = aP3;
      ppla001.this.AV17FasCod = aP4[0];
      this.aP4 = aP4;
      ppla001.this.AV16FecTeo = aP5[0];
      this.aP5 = aP5;
      ppla001.this.AV22TieTot = aP6[0];
      this.aP6 = aP6;
      ppla001.this.AV23DecTot = aP7[0];
      this.aP7 = aP7;
      ppla001.this.AV18Resto = aP8[0];
      this.aP8 = aP8;
      ppla001.this.AV68T_c = aP9[0];
      this.aP9 = aP9;
      ppla001.this.AV91Procodout = aP10[0];
      this.aP10 = aP10;
      ppla001.this.AV92MaqCodOut = aP11[0];
      this.aP11 = aP11;
      ppla001.this.AV93ClicodOut = aP12[0];
      this.aP12 = aP12;
      ppla001.this.AV94BarSerOut = aP13[0];
      this.aP13 = aP13;
      ppla001.this.AV86hnd = aP14[0];
      this.aP14 = aP14;
      ppla001.this.AV89SiCsv = aP15[0];
      this.aP15 = aP15;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV57Finite ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FINITE", ""), GXv_int1) ;
      ppla001.this.AV57Finite = GXv_int1[0] ;
      GXv_int1[0] = (byte)(AV69SoloKgm) ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KILPLN", ""), GXv_int1) ;
      ppla001.this.AV69SoloKgm = GXv_int1[0] ;
      GXt_int2 = AV81Vmtspm ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VMTSPM", ""), GXv_int1) ;
      ppla001.this.GXt_int2 = GXv_int1[0] ;
      AV81Vmtspm = GXt_int2 ;
      GXt_int3 = AV70MinTint ;
      GXv_int4[0] = GXt_int3 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MINTIN", ""), GXv_int4) ;
      ppla001.this.GXt_int3 = GXv_int4[0] ;
      AV70MinTint = (short)(GXt_int3) ;
      if ( AV70MinTint == 0 )
      {
         AV70MinTint = (short)(480) ;
      }
      GXt_int3 = AV71Cancho ;
      GXv_int4[0] = GXt_int3 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CANCHO", ""), GXv_int4) ;
      ppla001.this.GXt_int3 = GXv_int4[0] ;
      AV71Cancho = (short)(GXt_int3) ;
      GXt_int3 = AV72Cgrm2 ;
      GXv_int4[0] = GXt_int3 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CGMR2", ""), GXv_int4) ;
      ppla001.this.GXt_int3 = GXv_int4[0] ;
      AV72Cgrm2 = (short)(GXt_int3) ;
      GXt_int2 = AV82Variantes ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FTRVTE", ""), GXv_int1) ;
      ppla001.this.GXt_int2 = GXv_int1[0] ;
      AV82Variantes = GXt_int2 ;
      GXt_int2 = AV90Acabats ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AC2013", ""), GXv_int1) ;
      ppla001.this.GXt_int2 = GXv_int1[0] ;
      AV90Acabats = GXt_int2 ;
      GXt_int2 = (byte)(AV109Endutex) ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ENDTEX", ""), GXv_int1) ;
      ppla001.this.GXt_int2 = GXv_int1[0] ;
      AV109Endutex = GXt_int2 ;
      GXt_int2 = (byte)(AV108Carvema) ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int1) ;
      ppla001.this.GXt_int2 = GXv_int1[0] ;
      AV108Carvema = GXt_int2 ;
      GXt_int2 = (byte)(AV110Texpasa) ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TEXPAS", ""), GXv_int1) ;
      ppla001.this.GXt_int2 = GXv_int1[0] ;
      AV110Texpasa = GXt_int2 ;
      GXt_int2 = (byte)(AV105parfases) ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PARFST", ""), GXv_int1) ;
      ppla001.this.GXt_int2 = GXv_int1[0] ;
      AV105parfases = GXt_int2 ;
      GXt_int2 = AV128tiempoteorico ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TTEOHM", ""), GXv_int1) ;
      ppla001.this.GXt_int2 = GXv_int1[0] ;
      AV128tiempoteorico = GXt_int2 ;
      GXt_int2 = (byte)(AV111fatelaresconfeccion) ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FATLAV", ""), GXv_int1) ;
      ppla001.this.GXt_int2 = GXv_int1[0] ;
      AV111fatelaresconfeccion = GXt_int2 ;
      GXt_int2 = (byte)(AV112CAPFM1) ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CAPFM1", ""), GXv_int1) ;
      ppla001.this.GXt_int2 = GXv_int1[0] ;
      AV112CAPFM1 = GXt_int2 ;
      GXt_int2 = (byte)(AV113cladd) ;
      GXv_int1[0] = GXt_int2 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CLADD", ""), GXv_int1) ;
      ppla001.this.GXt_int2 = GXv_int1[0] ;
      AV113cladd = GXt_int2 ;
      /* Using cursor P01NX2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV17FasCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P01NX2_A457FasCod[0] ;
         A468FasPrePie = P01NX2_A468FasPrePie[0] ;
         n468FasPrePie = P01NX2_n468FasPrePie[0] ;
         A469FasPreSal = P01NX2_A469FasPreSal[0] ;
         n469FasPreSal = P01NX2_n469FasPreSal[0] ;
         A456FasActTin = P01NX2_A456FasActTin[0] ;
         n456FasActTin = P01NX2_n456FasActTin[0] ;
         A472FasVelPro = P01NX2_A472FasVelPro[0] ;
         n472FasVelPro = P01NX2_n472FasVelPro[0] ;
         A464FasNumPas = P01NX2_A464FasNumPas[0] ;
         n464FasNumPas = P01NX2_n464FasNumPas[0] ;
         A602MaqCod = P01NX2_A602MaqCod[0] ;
         n602MaqCod = P01NX2_n602MaqCod[0] ;
         A2999MaqPri = P01NX2_A2999MaqPri[0] ;
         n2999MaqPri = P01NX2_n2999MaqPri[0] ;
         A459FasDec = P01NX2_A459FasDec[0] ;
         n459FasDec = P01NX2_n459FasDec[0] ;
         A5168FasPreMC = P01NX2_A5168FasPreMC[0] ;
         n5168FasPreMC = P01NX2_n5168FasPreMC[0] ;
         A4343FasEstamp = P01NX2_A4343FasEstamp[0] ;
         n4343FasEstamp = P01NX2_n4343FasEstamp[0] ;
         A5990FasDec2 = P01NX2_A5990FasDec2[0] ;
         n5990FasDec2 = P01NX2_n5990FasDec2[0] ;
         A2999MaqPri = P01NX2_A2999MaqPri[0] ;
         n2999MaqPri = P01NX2_n2999MaqPri[0] ;
         AV24PrePie = A468FasPrePie ;
         AV25PreSal = A469FasPreSal ;
         AV100fasPresal = A469FasPreSal ;
         AV26ActTin = A456FasActTin ;
         AV27Veloc = A472FasVelPro ;
         AV97FasVelpro = A472FasVelPro ;
         AV28NumPas = A464FasNumPas ;
         AV29MaqCod = A602MaqCod ;
         AV58MaqPri = A2999MaqPri ;
         AV35Decal = A459FasDec ;
         AV63FasPreMC = A5168FasPreMC ;
         AV88FasEstamp = A4343FasEstamp ;
         AV101Fasdec2 = A5990FasDec2 ;
         if ( AV108Carvema == 1 )
         {
            if ( GXutil.Int( DecimalUtil.decToDouble(AV101Fasdec2.divide(DecimalUtil.doubleToDec(24), 18, java.math.RoundingMode.DOWN))) == AV101Fasdec2.divide(DecimalUtil.doubleToDec(24), 18, java.math.RoundingMode.DOWN).doubleValue() )
            {
               AV35Decal = AV101Fasdec2.divide(DecimalUtil.doubleToDec(24), 18, java.math.RoundingMode.DOWN) ;
            }
            else
            {
               AV114decalagedecimal = AV101Fasdec2.divide(DecimalUtil.doubleToDec(24), 18, java.math.RoundingMode.DOWN) ;
               AV115decalentero = (short)(GXutil.Int( DecimalUtil.decToDouble(AV101Fasdec2.divide(DecimalUtil.doubleToDec(24), 18, java.math.RoundingMode.DOWN)))) ;
               AV35Decal = DecimalUtil.doubleToDec(AV115decalentero+1) ;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV95ParFMVal = " " ;
      /* Using cursor P01NX3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV93ClicodOut), AV94BarSerOut, AV91Procodout, AV17FasCod, AV92MaqCodOut});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A1664ParFasCod = P01NX3_A1664ParFasCod[0] ;
         A1665ParFasDsc = P01NX3_A1665ParFasDsc[0] ;
         n1665ParFasDsc = P01NX3_n1665ParFasDsc[0] ;
         A9830MaqCodC = P01NX3_A9830MaqCodC[0] ;
         A9836FasCodM = P01NX3_A9836FasCodM[0] ;
         A758ProCod = P01NX3_A758ProCod[0] ;
         A65ArtCod = P01NX3_A65ArtCod[0] ;
         A252CliCod = P01NX3_A252CliCod[0] ;
         n252CliCod = P01NX3_n252CliCod[0] ;
         A9828ParFMVal = P01NX3_A9828ParFMVal[0] ;
         A1665ParFasDsc = P01NX3_A1665ParFasDsc[0] ;
         n1665ParFasDsc = P01NX3_n1665ParFasDsc[0] ;
         AV95ParFMVal = A9828ParFMVal ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV96Velpar = ((GXutil.strcmp(AV95ParFMVal, " ")==0) ? DecimalUtil.doubleToDec(0) : CommonUtil.decimalVal( GXutil.substring( AV95ParFMVal, 1, 8), ".")) ;
      AV27Veloc = ((AV96Velpar.doubleValue()==0) ? AV27Veloc : AV96Velpar) ;
      AV98MaqTmCarg = (short)(0) ;
      AV99MaqTmDcarg = (short)(0) ;
      /* Using cursor P01NX4 */
      pr_default.execute(2, new Object[] {A396EmprCod, AV92MaqCodOut});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A602MaqCod = P01NX4_A602MaqCod[0] ;
         n602MaqCod = P01NX4_n602MaqCod[0] ;
         A13020MaqTmCarg = P01NX4_A13020MaqTmCarg[0] ;
         n13020MaqTmCarg = P01NX4_n13020MaqTmCarg[0] ;
         A13021MaqTmDcarg = P01NX4_A13021MaqTmDcarg[0] ;
         n13021MaqTmDcarg = P01NX4_n13021MaqTmDcarg[0] ;
         AV98MaqTmCarg = (short)(((AV110Texpasa==1) ? 0 : A13020MaqTmCarg)) ;
         AV99MaqTmDcarg = (short)(((AV110Texpasa==1) ? 0 : A13021MaqTmDcarg)) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      AV25PreSal = (short)(AV25PreSal+(AV98MaqTmCarg+AV99MaqTmDcarg)) ;
      /* Using cursor P01NX6 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV19BarCod), Byte.valueOf(AV20BarCodReo), AV21BarCodPar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A130BarCodPar = P01NX6_A130BarCodPar[0] ;
         A132BarCodReo = P01NX6_A132BarCodReo[0] ;
         A129BarCod = P01NX6_A129BarCod[0] ;
         A125BarAncAca1 = P01NX6_A125BarAncAca1[0] ;
         A1909BarGraAca = P01NX6_A1909BarGraAca[0] ;
         A228BarUniMed = P01NX6_A228BarUniMed[0] ;
         A211BarRdt = P01NX6_A211BarRdt[0] ;
         A155BarFecCli = P01NX6_A155BarFecCli[0] ;
         A157BarFecEnt = P01NX6_A157BarFecEnt[0] ;
         A213BarSit = P01NX6_A213BarSit[0] ;
         A214BarSua = P01NX6_A214BarSua[0] ;
         A177BarLar = P01NX6_A177BarLar[0] ;
         A218BarTipCol = P01NX6_A218BarTipCol[0] ;
         A252CliCod = P01NX6_A252CliCod[0] ;
         n252CliCod = P01NX6_n252CliCod[0] ;
         A212BarSer = P01NX6_A212BarSer[0] ;
         A1798BarDibCli = P01NX6_A1798BarDibCli[0] ;
         A1799BarDibInt = P01NX6_A1799BarDibInt[0] ;
         A166BarKgm = P01NX6_A166BarKgm[0] ;
         A184BarMtr = P01NX6_A184BarMtr[0] ;
         A199BarPie1 = P01NX6_A199BarPie1[0] ;
         A365DisDes = P01NX6_A365DisDes[0] ;
         A898BarPieNDes = P01NX6_A898BarPieNDes[0] ;
         A166BarKgm = P01NX6_A166BarKgm[0] ;
         A184BarMtr = P01NX6_A184BarMtr[0] ;
         A199BarPie1 = P01NX6_A199BarPie1[0] ;
         A898BarPieNDes = P01NX6_A898BarPieNDes[0] ;
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
         if ( A125BarAncAca1 == 0 )
         {
            AV73Ancho = DecimalUtil.doubleToDec(AV71Cancho/ (double) (100)) ;
            AV129anchoendutex = AV71Cancho ;
         }
         else
         {
            AV73Ancho = DecimalUtil.doubleToDec(A125BarAncAca1/ (double) (100)) ;
            AV129anchoendutex = A125BarAncAca1 ;
         }
         if ( A1909BarGraAca == 0 )
         {
            AV74Grm2 = AV72Cgrm2 ;
            AV130Grm2endutex = AV72Cgrm2 ;
         }
         else
         {
            AV74Grm2 = A1909BarGraAca ;
            AV130Grm2endutex = A1909BarGraAca ;
         }
         if ( AV31Metros.doubleValue() == 0 )
         {
            if ( (DecimalUtil.doubleToDec(AV74Grm2).multiply(AV73Ancho)).doubleValue() > 0 )
            {
               AV31Metros = (A166BarKgm.divide((DecimalUtil.doubleToDec(AV74Grm2).multiply(AV73Ancho)), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(1000)) ;
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
         AV42ExColor = A213BarSit ;
         AV43Suavizado = A214BarSua ;
         AV59Barlar = A177BarLar ;
         AV61BarTipCol = A218BarTipCol ;
         AV65CliCod = A252CliCod ;
         AV79Barser = A212BarSer ;
         AV66BarDibCli = A1798BarDibCli ;
         AV67BarDibInt = A1799BarDibInt ;
         /* Execute user subroutine: 'MOLCIL' */
         S131 ();
         if ( returnInSub )
         {
            pr_default.close(3);
            pr_default.close(3);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P01NX7 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A761ProFasLin = P01NX7_A761ProFasLin[0] ;
            n761ProFasLin = P01NX7_n761ProFasLin[0] ;
            A758ProCod = P01NX7_A758ProCod[0] ;
            AV78Procod = A758ProCod ;
            pr_default.readNext(4);
         }
         pr_default.close(4);
         AV83Nvariantes = (short)(0) ;
         /* Optimized group. */
         /* Using cursor P01NX8 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         cV83Nvariantes = P01NX8_AV83Nvariantes[0] ;
         pr_default.close(5);
         AV83Nvariantes = (short)(AV83Nvariantes+cV83Nvariantes*1) ;
         /* End optimized group. */
         AV84FactorVariantes = (short)(((AV83Nvariantes==0) ? 1 : ((AV82Variantes==1)&&(AV83Nvariantes>0) ? AV83Nvariantes : 1))) ;
         AV25PreSal = (short)(AV25PreSal*AV84FactorVariantes) ;
         AV131variableparemtros = (byte)(0) ;
         if ( ( AV81Vmtspm == 1 ) || ( AV105parfases == 1 ) )
         {
            /* Execute user subroutine: 'SERPAU' */
            S141 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               pr_default.close(3);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( (0==AV105parfases) )
            {
               AV27Veloc = ((AV80Velocidad.doubleValue()>0) ? AV80Velocidad : AV27Veloc) ;
            }
            AV24PrePie = ((AV116ArtFasPpp>0) ? AV116ArtFasPpp : AV24PrePie) ;
            AV25PreSal = ((AV117ArtFasPyS>0) ? AV117ArtFasPyS : AV25PreSal) ;
            AV27Veloc = ((AV118ArtFasVel.doubleValue()>0) ? AV118ArtFasVel : AV27Veloc) ;
            AV28NumPas = ((AV119ArtFasNPs>0) ? AV119ArtFasNPs : AV28NumPas) ;
            AV131variableparemtros = (byte)(1) ;
         }
         if ( ( AV112CAPFM1 == 1 ) && ( AV131variableparemtros == 0 ) )
         {
            /* Execute user subroutine: 'CAPFM1' */
            S151 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               pr_default.close(3);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV24PrePie = ((AV116ArtFasPpp>0) ? AV116ArtFasPpp : AV24PrePie) ;
            AV25PreSal = ((AV117ArtFasPyS>0) ? AV117ArtFasPyS : AV25PreSal) ;
            AV27Veloc = ((AV118ArtFasVel.doubleValue()>0) ? AV118ArtFasVel : AV27Veloc) ;
            AV28NumPas = ((AV119ArtFasNPs>0) ? AV119ArtFasNPs : AV28NumPas) ;
            AV35Decal = ((AV120CPFMDc.doubleValue()>0) ? AV120CPFMDc : AV35Decal) ;
            AV131variableparemtros = (byte)(1) ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      if ( ( AV57Finite == 1 ) && ( GXutil.strcmp(AV58MaqPri, httpContext.getMessage( "S", "")) == 0 ) )
      {
         AV60Largopza = (short)(GXutil.lval( AV59Barlar)) ;
         if ( AV60Largopza > 0 )
         {
            AV32NumPie = (short)(DecimalUtil.decToDouble(AV31Metros.divide(DecimalUtil.doubleToDec(AV60Largopza), 18, java.math.RoundingMode.DOWN))) ;
         }
      }
      GXv_char5[0] = A396EmprCod ;
      GXv_char6[0] = "021500" ;
      GXv_int4[0] = AV38FacCar ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char5, GXv_char6, GXv_int4) ;
      ppla001.this.A396EmprCod = GXv_char5[0] ;
      ppla001.this.AV38FacCar = GXv_int4[0] ;
      GXv_char6[0] = A396EmprCod ;
      GXv_char5[0] = "030400" ;
      GXv_int4[0] = AV39MedTie ;
      new app.pbuscou(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_int4) ;
      ppla001.this.A396EmprCod = GXv_char6[0] ;
      ppla001.this.AV39MedTie = GXv_int4[0] ;
      /* Using cursor P01NX9 */
      pr_default.execute(6, new Object[] {A396EmprCod, AV29MaqCod});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A602MaqCod = P01NX9_A602MaqCod[0] ;
         n602MaqCod = P01NX9_n602MaqCod[0] ;
         A615MaqMinPro = P01NX9_A615MaqMinPro[0] ;
         n615MaqMinPro = P01NX9_n615MaqMinPro[0] ;
         A612MaqHorPro = P01NX9_A612MaqHorPro[0] ;
         n612MaqHorPro = P01NX9_n612MaqHorPro[0] ;
         AV40HorasProd = GXutil.concat( GXutil.str( A612MaqHorPro, 2, 0), GXutil.str( A615MaqMinPro, 2, 0), ".") ;
         AV41HorPro = CommonUtil.decimalVal( AV40HorasProd, ".") ;
         if ( AV41HorPro.doubleValue() == 0 )
         {
            AV41HorPro = DecimalUtil.stringToDec("24.00") ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
      /* Execute user subroutine: 'CALENDARIO' */
      S121 ();
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
               S121 ();
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
      AV22TieTot = DecimalUtil.ZERO ;
      AV68T_c = GXutil.space( (short)(1)) ;
      AV56TiempoT = (short)(0) ;
      AV106TiempoProRecetas = (short)(0) ;
      AV107Tiempoprocesos = (short)(0) ;
      AV121metroscalculados = DecimalUtil.ZERO ;
      if ( ( GXutil.strcmp(AV26ActTin, httpContext.getMessage( "S", "")) == 0 ) && ( AV42ExColor != 4 ) )
      {
         if ( ( AV42ExColor == 2 ) || ( AV42ExColor == 3 ) )
         {
            /* Execute user subroutine: 'TIPCOL' */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV22TieTot = ((0==AV62TipColTie) ? DecimalUtil.doubleToDec(AV70MinTint) : AV22TieTot) ;
         }
         else
         {
            /* Using cursor P01NX10 */
            pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV19BarCod), Byte.valueOf(AV20BarCodReo), AV21BarCodPar});
            while ( (pr_default.getStatus(7) != 101) )
            {
               A130BarCodPar = P01NX10_A130BarCodPar[0] ;
               A132BarCodReo = P01NX10_A132BarCodReo[0] ;
               A129BarCod = P01NX10_A129BarCod[0] ;
               A252CliCod = P01NX10_A252CliCod[0] ;
               n252CliCod = P01NX10_n252CliCod[0] ;
               A212BarSer = P01NX10_A212BarSer[0] ;
               A135BarColNom = P01NX10_A135BarColNom[0] ;
               A136BarColNum = P01NX10_A136BarColNum[0] ;
               A218BarTipCol = P01NX10_A218BarTipCol[0] ;
               AV55BarCliCod = A252CliCod ;
               GXv_char6[0] = A396EmprCod ;
               GXv_int4[0] = A252CliCod ;
               GXv_char5[0] = A212BarSer ;
               GXv_char7[0] = A135BarColNom ;
               GXv_int8[0] = A136BarColNum ;
               GXv_int1[0] = A218BarTipCol ;
               GXv_int9[0] = AV56TiempoT ;
               new app.pfortie(remoteHandle, context).execute( GXv_char6, GXv_int4, GXv_char5, GXv_char7, GXv_int8, GXv_int1, GXv_int9) ;
               ppla001.this.A396EmprCod = GXv_char6[0] ;
               ppla001.this.A252CliCod = GXv_int4[0] ;
               ppla001.this.A212BarSer = GXv_char5[0] ;
               ppla001.this.A135BarColNom = GXv_char7[0] ;
               ppla001.this.A136BarColNum = GXv_int8[0] ;
               ppla001.this.A218BarTipCol = GXv_int1[0] ;
               ppla001.this.AV56TiempoT = GXv_int9[0] ;
               AV107Tiempoprocesos = AV56TiempoT ;
               AV56TiempoT = ((0==AV56TiempoT) ? AV70MinTint : AV56TiempoT) ;
               AV22TieTot = AV22TieTot.add(DecimalUtil.doubleToDec(AV56TiempoT)).add(DecimalUtil.doubleToDec(AV25PreSal)).add(DecimalUtil.doubleToDec((AV24PrePie*AV32NumPie))) ;
               /* Execute user subroutine: 'CPROFO' */
               S171 ();
               if ( returnInSub )
               {
                  pr_default.close(7);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV68T_c = httpContext.getMessage( "C", "") ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(7);
         }
         if ( AV109Endutex == 1 )
         {
            AV22TieTot = DecimalUtil.doubleToDec(AV25PreSal+(AV24PrePie*AV32NumPie)) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(AV26ActTin, httpContext.getMessage( "S", "")) == 0 )
         {
            if ( AV42ExColor == 4 )
            {
               /* Using cursor P01NX11 */
               pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV19BarCod), Byte.valueOf(AV20BarCodReo), AV21BarCodPar});
               while ( (pr_default.getStatus(8) != 101) )
               {
                  A130BarCodPar = P01NX11_A130BarCodPar[0] ;
                  A132BarCodReo = P01NX11_A132BarCodReo[0] ;
                  A129BarCod = P01NX11_A129BarCod[0] ;
                  A252CliCod = P01NX11_A252CliCod[0] ;
                  n252CliCod = P01NX11_n252CliCod[0] ;
                  A212BarSer = P01NX11_A212BarSer[0] ;
                  A135BarColNom = P01NX11_A135BarColNom[0] ;
                  A136BarColNum = P01NX11_A136BarColNum[0] ;
                  A218BarTipCol = P01NX11_A218BarTipCol[0] ;
                  AV55BarCliCod = A252CliCod ;
                  GXv_char7[0] = A396EmprCod ;
                  GXv_int8[0] = A129BarCod ;
                  GXv_int1[0] = A132BarCodReo ;
                  GXv_char6[0] = A130BarCodPar ;
                  GXv_int9[0] = AV56TiempoT ;
                  new app.ppla002(remoteHandle, context).execute( GXv_char7, GXv_int8, GXv_int1, GXv_char6, GXv_int9) ;
                  ppla001.this.A396EmprCod = GXv_char7[0] ;
                  ppla001.this.A129BarCod = GXv_int8[0] ;
                  ppla001.this.A132BarCodReo = GXv_int1[0] ;
                  ppla001.this.A130BarCodPar = GXv_char6[0] ;
                  ppla001.this.AV56TiempoT = GXv_int9[0] ;
                  AV106TiempoProRecetas = AV56TiempoT ;
                  GXv_char7[0] = A396EmprCod ;
                  GXv_int8[0] = A252CliCod ;
                  GXv_char6[0] = A212BarSer ;
                  GXv_char5[0] = A135BarColNom ;
                  GXv_int4[0] = A136BarColNum ;
                  GXv_int1[0] = A218BarTipCol ;
                  GXv_int10[0] = (byte)(0) ;
                  GXv_decimal11[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_int9[0] = AV75TotLav ;
                  new app.pintlav(remoteHandle, context).execute( GXv_char7, GXv_int8, GXv_char6, GXv_char5, GXv_int4, GXv_int1, GXv_int10, GXv_decimal11, GXv_int9) ;
                  ppla001.this.A396EmprCod = GXv_char7[0] ;
                  ppla001.this.A252CliCod = GXv_int8[0] ;
                  ppla001.this.A212BarSer = GXv_char6[0] ;
                  ppla001.this.A135BarColNom = GXv_char5[0] ;
                  ppla001.this.A136BarColNum = GXv_int4[0] ;
                  ppla001.this.A218BarTipCol = GXv_int1[0] ;
                  ppla001.this.AV75TotLav = GXv_int9[0] ;
                  AV56TiempoT = (short)(AV56TiempoT+AV75TotLav) ;
                  AV22TieTot = AV22TieTot.add(DecimalUtil.doubleToDec(AV56TiempoT)).add(DecimalUtil.doubleToDec(AV25PreSal)).add(DecimalUtil.doubleToDec((AV24PrePie*AV32NumPie))) ;
                  /* Execute user subroutine: 'CPROFO' */
                  S171 ();
                  if ( returnInSub )
                  {
                     pr_default.close(8);
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  if ( AV109Endutex == 1 )
                  {
                     AV22TieTot = DecimalUtil.doubleToDec(AV56TiempoT) ;
                  }
                  AV68T_c = httpContext.getMessage( "R", "") ;
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(8);
            }
            else
            {
               /* Execute user subroutine: 'TIPCOL' */
               S111 ();
               if ( returnInSub )
               {
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               AV22TieTot = DecimalUtil.doubleToDec(AV62TipColTie) ;
               AV22TieTot = ((0==AV62TipColTie) ? DecimalUtil.doubleToDec(AV70MinTint) : AV22TieTot) ;
            }
         }
         else
         {
            if ( AV27Veloc.doubleValue() != 0 )
            {
               AV44TiePreTot = DecimalUtil.doubleToDec(AV25PreSal+(AV24PrePie*AV32NumPie)) ;
               if ( AV109Endutex == 1 )
               {
                  AV121metroscalculados = ((AV130Grm2endutex==0)||(AV129anchoendutex==0) ? DecimalUtil.doubleToDec(0) : (AV30Kilos.divide(DecimalUtil.doubleToDec(AV130Grm2endutex), 18, java.math.RoundingMode.DOWN).divide(DecimalUtil.doubleToDec(AV129anchoendutex), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100000))) ;
                  AV22TieTot = AV44TiePreTot.add((AV121metroscalculados.divide(AV27Veloc, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(AV28NumPas))) ;
               }
               else
               {
                  if ( GXutil.strcmp(AV33UniMed, httpContext.getMessage( "M", "")) == 0 )
                  {
                     AV22TieTot = AV44TiePreTot.add(((AV31Metros.divide(AV27Veloc, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(AV28NumPas)))) ;
                  }
                  else
                  {
                     if ( AV69SoloKgm == 1 )
                     {
                        AV22TieTot = AV44TiePreTot.add(((AV30Kilos.divide(AV27Veloc, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(AV28NumPas)))) ;
                     }
                     else
                     {
                        if ( AV34Rendim.doubleValue() > 0 )
                        {
                           AV22TieTot = AV44TiePreTot.add(((AV30Kilos.multiply(AV34Rendim).divide(AV27Veloc, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(AV28NumPas)))) ;
                        }
                        else
                        {
                           AV22TieTot = AV44TiePreTot.add(((AV31Metros.divide(AV27Veloc, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(AV28NumPas)))) ;
                        }
                     }
                     if ( AV111fatelaresconfeccion == 1 )
                     {
                        AV22TieTot = AV44TiePreTot.add(((AV27Veloc.multiply(DecimalUtil.doubleToDec(AV32NumPie))).multiply(DecimalUtil.doubleToDec(AV28NumPas)))) ;
                     }
                  }
               }
            }
            else
            {
               AV22TieTot = DecimalUtil.doubleToDec(AV25PreSal+(AV24PrePie*AV32NumPie)) ;
            }
            AV22TieTot = AV22TieTot.add(DecimalUtil.doubleToDec((AV64BarMolCil*AV63FasPreMC))) ;
         }
      }
      AV22TieTot = ((DecimalUtil.compareTo((AV22TieTot.divide(DecimalUtil.doubleToDec(AV39MedTie), 18, java.math.RoundingMode.DOWN)), DecimalUtil.stringToDec("9999.99"))>0) ? DecimalUtil.doubleToDec(0) : AV22TieTot) ;
      AV122minteo = (int)(DecimalUtil.decToDouble(AV22TieTot)) ;
      AV123HhMm = DecimalUtil.doubleToDec(GXutil.Int( AV122minteo/ (double) (60))) ;
      AV124HorRea = (short)(GXutil.Int( AV122minteo/ (double) (60))) ;
      AV125HorReaint = (short)(GXutil.Int( AV124HorRea)) ;
      AV126MinRea = (int)(AV122minteo-(AV125HorReaint*60)) ;
      AV127HhMm_t = GXutil.padl( GXutil.trim( GXutil.str( AV125HorReaint, 10, 0)), (short)(2), "0") + "." + GXutil.padl( GXutil.trim( GXutil.str( AV126MinRea, 10, 0)), (short)(2), "0") ;
      AV102bartieteo = CommonUtil.decimalVal( AV127HhMm_t, ".") ;
      AV22TieTot = ((0==AV128tiempoteorico) ? AV22TieTot.divide(DecimalUtil.doubleToDec(AV39MedTie), 18, java.math.RoundingMode.DOWN) : AV102bartieteo) ;
      AV23DecTot = AV35Decal.multiply(DecimalUtil.doubleToDec(AV38FacCar)) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'TIPCOL' Routine */
      returnInSub = false ;
      AV62TipColTie = 0 ;
      /* Using cursor P01NX12 */
      pr_default.execute(9, new Object[] {A396EmprCod, Byte.valueOf(AV61BarTipCol)});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A831TipColCod = P01NX12_A831TipColCod[0] ;
         A4999TipColTie = P01NX12_A4999TipColTie[0] ;
         n4999TipColTie = P01NX12_n4999TipColTie[0] ;
         AV62TipColTie = A4999TipColTie ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
   }

   public void S121( )
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
      /* Using cursor P01NX13 */
      pr_default.execute(10, new Object[] {A396EmprCod, AV29MaqCod, Short.valueOf(AV45Anyo), Byte.valueOf(AV46Mes)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A614MaqMes = P01NX13_A614MaqMes[0] ;
         A599MaqAny = P01NX13_A599MaqAny[0] ;
         A602MaqCod = P01NX13_A602MaqCod[0] ;
         n602MaqCod = P01NX13_n602MaqCod[0] ;
         A610MaqHNPMes = P01NX13_A610MaqHNPMes[0] ;
         n610MaqHNPMes = P01NX13_n610MaqHNPMes[0] ;
         AV48Flag = (byte)(1) ;
         AV50HorNPro = A610MaqHNPMes ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
   }

   public void S131( )
   {
      /* 'MOLCIL' Routine */
      returnInSub = false ;
      AV64BarMolCil = (short)(0) ;
      /* Using cursor P01NX14 */
      pr_default.execute(11, new Object[] {A396EmprCod, AV66BarDibCli, Integer.valueOf(AV65CliCod), Integer.valueOf(AV67BarDibInt)});
      while ( (pr_default.getStatus(11) != 101) )
      {
         A1014DibInt = P01NX14_A1014DibInt[0] ;
         A252CliCod = P01NX14_A252CliCod[0] ;
         n252CliCod = P01NX14_n252CliCod[0] ;
         A1013DibCli = P01NX14_A1013DibCli[0] ;
         A1823DibTipMaq = P01NX14_A1823DibTipMaq[0] ;
         n1823DibTipMaq = P01NX14_n1823DibTipMaq[0] ;
         if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "R", "")) == 0 )
         {
            /* Optimized group. */
            /* Using cursor P01NX15 */
            pr_default.execute(12, new Object[] {A396EmprCod, A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
            cV64BarMolCil = P01NX15_AV64BarMolCil[0] ;
            pr_default.close(12);
            AV64BarMolCil = (short)(AV64BarMolCil+cV64BarMolCil*1) ;
            /* End optimized group. */
         }
         if ( GXutil.strcmp(A1823DibTipMaq, httpContext.getMessage( "P", "")) == 0 )
         {
            /* Optimized group. */
            /* Using cursor P01NX16 */
            pr_default.execute(13, new Object[] {A396EmprCod, A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A1014DibInt)});
            cV64BarMolCil = P01NX16_AV64BarMolCil[0] ;
            pr_default.close(13);
            AV64BarMolCil = (short)(AV64BarMolCil+cV64BarMolCil*1) ;
            /* End optimized group. */
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(11);
   }

   public void S141( )
   {
      /* 'SERPAU' Routine */
      returnInSub = false ;
      AV80Velocidad = DecimalUtil.ZERO ;
      AV119ArtFasNPs = (short)(0) ;
      AV116ArtFasPpp = (short)(0) ;
      AV117ArtFasPyS = (short)(0) ;
      AV118ArtFasVel = DecimalUtil.ZERO ;
      /* Using cursor P01NX17 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(AV65CliCod), AV79Barser, AV78Procod, AV17FasCod});
      while ( (pr_default.getStatus(14) != 101) )
      {
         A457FasCod = P01NX17_A457FasCod[0] ;
         A758ProCod = P01NX17_A758ProCod[0] ;
         A65ArtCod = P01NX17_A65ArtCod[0] ;
         A252CliCod = P01NX17_A252CliCod[0] ;
         n252CliCod = P01NX17_n252CliCod[0] ;
         A8560ArtFasFac = P01NX17_A8560ArtFasFac[0] ;
         A14547ArtFasNPs = P01NX17_A14547ArtFasNPs[0] ;
         A14545ArtFasPpp = P01NX17_A14545ArtFasPpp[0] ;
         A14544ArtFasPyS = P01NX17_A14544ArtFasPyS[0] ;
         A14546ArtFasVel = P01NX17_A14546ArtFasVel[0] ;
         AV80Velocidad = A8560ArtFasFac ;
         AV119ArtFasNPs = A14547ArtFasNPs ;
         AV116ArtFasPpp = A14545ArtFasPpp ;
         AV117ArtFasPyS = A14544ArtFasPyS ;
         AV118ArtFasVel = A14546ArtFasVel ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(14);
   }

   public void S151( )
   {
      /* 'CAPFM1' Routine */
      returnInSub = false ;
      AV119ArtFasNPs = (short)(0) ;
      AV116ArtFasPpp = (short)(0) ;
      AV117ArtFasPyS = (short)(0) ;
      AV118ArtFasVel = DecimalUtil.ZERO ;
      AV120CPFMDc = DecimalUtil.ZERO ;
      /* Using cursor P01NX18 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(AV65CliCod), AV79Barser, AV78Procod, AV17FasCod, AV92MaqCodOut});
      while ( (pr_default.getStatus(15) != 101) )
      {
         A9830MaqCodC = P01NX18_A9830MaqCodC[0] ;
         A9836FasCodM = P01NX18_A9836FasCodM[0] ;
         A758ProCod = P01NX18_A758ProCod[0] ;
         A65ArtCod = P01NX18_A65ArtCod[0] ;
         A252CliCod = P01NX18_A252CliCod[0] ;
         n252CliCod = P01NX18_n252CliCod[0] ;
         A14551CPFMNp = P01NX18_A14551CPFMNp[0] ;
         A14549CPFMPrep = P01NX18_A14549CPFMPrep[0] ;
         A14548CPFMPres = P01NX18_A14548CPFMPres[0] ;
         A14550CPFMVel = P01NX18_A14550CPFMVel[0] ;
         A14552CPFMDc = P01NX18_A14552CPFMDc[0] ;
         AV119ArtFasNPs = A14551CPFMNp ;
         AV116ArtFasPpp = A14549CPFMPrep ;
         AV117ArtFasPyS = A14548CPFMPres ;
         AV118ArtFasVel = A14550CPFMVel ;
         AV120CPFMDc = A14552CPFMDc ;
         pr_default.readNext(15);
      }
      pr_default.close(15);
   }

   public void S161( )
   {
      /* 'ARTICU' Routine */
      returnInSub = false ;
      AV103ArtGraAca = (short)(0) ;
      AV104ArtAcaMin = (short)(0) ;
      /* Using cursor P01NX19 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(AV65CliCod), AV79Barser});
      while ( (pr_default.getStatus(16) != 101) )
      {
         A65ArtCod = P01NX19_A65ArtCod[0] ;
         A252CliCod = P01NX19_A252CliCod[0] ;
         n252CliCod = P01NX19_n252CliCod[0] ;
         A1903ArtGraAca = P01NX19_A1903ArtGraAca[0] ;
         n1903ArtGraAca = P01NX19_n1903ArtGraAca[0] ;
         A63ArtAcaMin = P01NX19_A63ArtAcaMin[0] ;
         n63ArtAcaMin = P01NX19_n63ArtAcaMin[0] ;
         AV103ArtGraAca = A1903ArtGraAca ;
         AV104ArtAcaMin = A63ArtAcaMin ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(16);
   }

   public void S171( )
   {
      /* 'CPROFO' Routine */
      returnInSub = false ;
      /* Using cursor P01NX20 */
      pr_default.execute(17, new Object[] {A396EmprCod, AV43Suavizado});
      while ( (pr_default.getStatus(17) != 101) )
      {
         A764ProForCod = P01NX20_A764ProForCod[0] ;
         A771ProForTie = P01NX20_A771ProForTie[0] ;
         AV22TieTot = AV22TieTot.add(DecimalUtil.doubleToDec(A771ProForTie)).add(DecimalUtil.doubleToDec(AV25PreSal)).add(DecimalUtil.doubleToDec((AV24PrePie*AV32NumPie))) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(17);
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppla001.this.A396EmprCod;
      this.aP1[0] = ppla001.this.AV19BarCod;
      this.aP2[0] = ppla001.this.AV20BarCodReo;
      this.aP3[0] = ppla001.this.AV21BarCodPar;
      this.aP4[0] = ppla001.this.AV17FasCod;
      this.aP5[0] = ppla001.this.AV16FecTeo;
      this.aP6[0] = ppla001.this.AV22TieTot;
      this.aP7[0] = ppla001.this.AV23DecTot;
      this.aP8[0] = ppla001.this.AV18Resto;
      this.aP9[0] = ppla001.this.AV68T_c;
      this.aP10[0] = ppla001.this.AV91Procodout;
      this.aP11[0] = ppla001.this.AV92MaqCodOut;
      this.aP12[0] = ppla001.this.AV93ClicodOut;
      this.aP13[0] = ppla001.this.AV94BarSerOut;
      this.aP14[0] = ppla001.this.AV86hnd;
      this.aP15[0] = ppla001.this.AV89SiCsv;
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
      P01NX2_A396EmprCod = new String[] {""} ;
      P01NX2_A457FasCod = new String[] {""} ;
      P01NX2_A468FasPrePie = new short[1] ;
      P01NX2_n468FasPrePie = new boolean[] {false} ;
      P01NX2_A469FasPreSal = new short[1] ;
      P01NX2_n469FasPreSal = new boolean[] {false} ;
      P01NX2_A456FasActTin = new String[] {""} ;
      P01NX2_n456FasActTin = new boolean[] {false} ;
      P01NX2_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01NX2_n472FasVelPro = new boolean[] {false} ;
      P01NX2_A464FasNumPas = new short[1] ;
      P01NX2_n464FasNumPas = new boolean[] {false} ;
      P01NX2_A602MaqCod = new String[] {""} ;
      P01NX2_n602MaqCod = new boolean[] {false} ;
      P01NX2_A2999MaqPri = new String[] {""} ;
      P01NX2_n2999MaqPri = new boolean[] {false} ;
      P01NX2_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01NX2_n459FasDec = new boolean[] {false} ;
      P01NX2_A5168FasPreMC = new short[1] ;
      P01NX2_n5168FasPreMC = new boolean[] {false} ;
      P01NX2_A4343FasEstamp = new String[] {""} ;
      P01NX2_n4343FasEstamp = new boolean[] {false} ;
      P01NX2_A5990FasDec2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01NX2_n5990FasDec2 = new boolean[] {false} ;
      A457FasCod = "" ;
      A456FasActTin = "" ;
      A472FasVelPro = DecimalUtil.ZERO ;
      A602MaqCod = "" ;
      A2999MaqPri = "" ;
      A459FasDec = DecimalUtil.ZERO ;
      A4343FasEstamp = "" ;
      A5990FasDec2 = DecimalUtil.ZERO ;
      AV26ActTin = "" ;
      AV27Veloc = DecimalUtil.ZERO ;
      AV97FasVelpro = DecimalUtil.ZERO ;
      AV29MaqCod = "" ;
      AV58MaqPri = "" ;
      AV35Decal = DecimalUtil.ZERO ;
      AV88FasEstamp = "" ;
      AV101Fasdec2 = DecimalUtil.ZERO ;
      AV114decalagedecimal = DecimalUtil.ZERO ;
      AV95ParFMVal = "" ;
      P01NX3_A1664ParFasCod = new short[1] ;
      P01NX3_A396EmprCod = new String[] {""} ;
      P01NX3_A1665ParFasDsc = new String[] {""} ;
      P01NX3_n1665ParFasDsc = new boolean[] {false} ;
      P01NX3_A9830MaqCodC = new String[] {""} ;
      P01NX3_A9836FasCodM = new String[] {""} ;
      P01NX3_A758ProCod = new String[] {""} ;
      P01NX3_A65ArtCod = new String[] {""} ;
      P01NX3_A252CliCod = new int[1] ;
      P01NX3_n252CliCod = new boolean[] {false} ;
      P01NX3_A9828ParFMVal = new String[] {""} ;
      A1665ParFasDsc = "" ;
      A9830MaqCodC = "" ;
      A9836FasCodM = "" ;
      A758ProCod = "" ;
      A65ArtCod = "" ;
      A9828ParFMVal = "" ;
      AV96Velpar = DecimalUtil.ZERO ;
      P01NX4_A396EmprCod = new String[] {""} ;
      P01NX4_A602MaqCod = new String[] {""} ;
      P01NX4_n602MaqCod = new boolean[] {false} ;
      P01NX4_A13020MaqTmCarg = new short[1] ;
      P01NX4_n13020MaqTmCarg = new boolean[] {false} ;
      P01NX4_A13021MaqTmDcarg = new short[1] ;
      P01NX4_n13021MaqTmDcarg = new boolean[] {false} ;
      P01NX6_A396EmprCod = new String[] {""} ;
      P01NX6_A130BarCodPar = new String[] {""} ;
      P01NX6_A132BarCodReo = new byte[1] ;
      P01NX6_A129BarCod = new int[1] ;
      P01NX6_A125BarAncAca1 = new short[1] ;
      P01NX6_A1909BarGraAca = new short[1] ;
      P01NX6_A228BarUniMed = new String[] {""} ;
      P01NX6_A211BarRdt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01NX6_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      P01NX6_A157BarFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      P01NX6_A213BarSit = new byte[1] ;
      P01NX6_A214BarSua = new String[] {""} ;
      P01NX6_A177BarLar = new String[] {""} ;
      P01NX6_A218BarTipCol = new byte[1] ;
      P01NX6_A252CliCod = new int[1] ;
      P01NX6_n252CliCod = new boolean[] {false} ;
      P01NX6_A212BarSer = new String[] {""} ;
      P01NX6_A1798BarDibCli = new String[] {""} ;
      P01NX6_A1799BarDibInt = new int[1] ;
      P01NX6_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01NX6_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01NX6_A199BarPie1 = new short[1] ;
      P01NX6_A365DisDes = new String[] {""} ;
      P01NX6_A898BarPieNDes = new int[1] ;
      A130BarCodPar = "" ;
      A228BarUniMed = "" ;
      A211BarRdt = DecimalUtil.ZERO ;
      A155BarFecCli = GXutil.nullDate() ;
      A157BarFecEnt = GXutil.nullDate() ;
      A214BarSua = "" ;
      A177BarLar = "" ;
      A212BarSer = "" ;
      A1798BarDibCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A365DisDes = "" ;
      AV30Kilos = DecimalUtil.ZERO ;
      AV31Metros = DecimalUtil.ZERO ;
      AV73Ancho = DecimalUtil.ZERO ;
      AV33UniMed = "" ;
      AV34Rendim = DecimalUtil.ZERO ;
      AV36FecDisCli = GXutil.nullDate() ;
      AV37FecFinPrv = GXutil.nullDate() ;
      AV43Suavizado = "" ;
      AV59Barlar = "" ;
      AV79Barser = "" ;
      AV66BarDibCli = "" ;
      P01NX7_A396EmprCod = new String[] {""} ;
      P01NX7_A129BarCod = new int[1] ;
      P01NX7_A132BarCodReo = new byte[1] ;
      P01NX7_A130BarCodPar = new String[] {""} ;
      P01NX7_A761ProFasLin = new short[1] ;
      P01NX7_n761ProFasLin = new boolean[] {false} ;
      P01NX7_A758ProCod = new String[] {""} ;
      AV78Procod = "" ;
      P01NX8_AV83Nvariantes = new short[1] ;
      AV80Velocidad = DecimalUtil.ZERO ;
      AV118ArtFasVel = DecimalUtil.ZERO ;
      AV120CPFMDc = DecimalUtil.ZERO ;
      P01NX9_A396EmprCod = new String[] {""} ;
      P01NX9_A602MaqCod = new String[] {""} ;
      P01NX9_n602MaqCod = new boolean[] {false} ;
      P01NX9_A615MaqMinPro = new byte[1] ;
      P01NX9_n615MaqMinPro = new boolean[] {false} ;
      P01NX9_A612MaqHorPro = new byte[1] ;
      P01NX9_n612MaqHorPro = new boolean[] {false} ;
      AV40HorasProd = "" ;
      AV41HorPro = DecimalUtil.ZERO ;
      AV49DiasDec = DecimalUtil.ZERO ;
      AV50HorNPro = "" ;
      AV53Tot = DecimalUtil.ZERO ;
      AV121metroscalculados = DecimalUtil.ZERO ;
      P01NX10_A396EmprCod = new String[] {""} ;
      P01NX10_A130BarCodPar = new String[] {""} ;
      P01NX10_A132BarCodReo = new byte[1] ;
      P01NX10_A129BarCod = new int[1] ;
      P01NX10_A252CliCod = new int[1] ;
      P01NX10_n252CliCod = new boolean[] {false} ;
      P01NX10_A212BarSer = new String[] {""} ;
      P01NX10_A135BarColNom = new String[] {""} ;
      P01NX10_A136BarColNum = new int[1] ;
      P01NX10_A218BarTipCol = new byte[1] ;
      A135BarColNom = "" ;
      P01NX11_A396EmprCod = new String[] {""} ;
      P01NX11_A130BarCodPar = new String[] {""} ;
      P01NX11_A132BarCodReo = new byte[1] ;
      P01NX11_A129BarCod = new int[1] ;
      P01NX11_A252CliCod = new int[1] ;
      P01NX11_n252CliCod = new boolean[] {false} ;
      P01NX11_A212BarSer = new String[] {""} ;
      P01NX11_A135BarColNom = new String[] {""} ;
      P01NX11_A136BarColNum = new int[1] ;
      P01NX11_A218BarTipCol = new byte[1] ;
      GXv_char7 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int1 = new byte[1] ;
      GXv_int10 = new byte[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_int9 = new short[1] ;
      AV44TiePreTot = DecimalUtil.ZERO ;
      AV123HhMm = DecimalUtil.ZERO ;
      AV127HhMm_t = "" ;
      AV102bartieteo = DecimalUtil.ZERO ;
      P01NX12_A396EmprCod = new String[] {""} ;
      P01NX12_A831TipColCod = new byte[1] ;
      P01NX12_A4999TipColTie = new int[1] ;
      P01NX12_n4999TipColTie = new boolean[] {false} ;
      P01NX13_A396EmprCod = new String[] {""} ;
      P01NX13_A614MaqMes = new byte[1] ;
      P01NX13_A599MaqAny = new short[1] ;
      P01NX13_A602MaqCod = new String[] {""} ;
      P01NX13_n602MaqCod = new boolean[] {false} ;
      P01NX13_A610MaqHNPMes = new String[] {""} ;
      P01NX13_n610MaqHNPMes = new boolean[] {false} ;
      A610MaqHNPMes = "" ;
      P01NX14_A396EmprCod = new String[] {""} ;
      P01NX14_A1014DibInt = new int[1] ;
      P01NX14_A252CliCod = new int[1] ;
      P01NX14_n252CliCod = new boolean[] {false} ;
      P01NX14_A1013DibCli = new String[] {""} ;
      P01NX14_A1823DibTipMaq = new String[] {""} ;
      P01NX14_n1823DibTipMaq = new boolean[] {false} ;
      A1013DibCli = "" ;
      A1823DibTipMaq = "" ;
      P01NX15_AV64BarMolCil = new short[1] ;
      P01NX16_AV64BarMolCil = new short[1] ;
      P01NX17_A396EmprCod = new String[] {""} ;
      P01NX17_A457FasCod = new String[] {""} ;
      P01NX17_A758ProCod = new String[] {""} ;
      P01NX17_A65ArtCod = new String[] {""} ;
      P01NX17_A252CliCod = new int[1] ;
      P01NX17_n252CliCod = new boolean[] {false} ;
      P01NX17_A8560ArtFasFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01NX17_A14547ArtFasNPs = new short[1] ;
      P01NX17_A14545ArtFasPpp = new short[1] ;
      P01NX17_A14544ArtFasPyS = new short[1] ;
      P01NX17_A14546ArtFasVel = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A8560ArtFasFac = DecimalUtil.ZERO ;
      A14546ArtFasVel = DecimalUtil.ZERO ;
      P01NX18_A396EmprCod = new String[] {""} ;
      P01NX18_A9830MaqCodC = new String[] {""} ;
      P01NX18_A9836FasCodM = new String[] {""} ;
      P01NX18_A758ProCod = new String[] {""} ;
      P01NX18_A65ArtCod = new String[] {""} ;
      P01NX18_A252CliCod = new int[1] ;
      P01NX18_n252CliCod = new boolean[] {false} ;
      P01NX18_A14551CPFMNp = new short[1] ;
      P01NX18_A14549CPFMPrep = new short[1] ;
      P01NX18_A14548CPFMPres = new short[1] ;
      P01NX18_A14550CPFMVel = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P01NX18_A14552CPFMDc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A14550CPFMVel = DecimalUtil.ZERO ;
      A14552CPFMDc = DecimalUtil.ZERO ;
      P01NX19_A396EmprCod = new String[] {""} ;
      P01NX19_A65ArtCod = new String[] {""} ;
      P01NX19_A252CliCod = new int[1] ;
      P01NX19_n252CliCod = new boolean[] {false} ;
      P01NX19_A1903ArtGraAca = new short[1] ;
      P01NX19_n1903ArtGraAca = new boolean[] {false} ;
      P01NX19_A63ArtAcaMin = new short[1] ;
      P01NX19_n63ArtAcaMin = new boolean[] {false} ;
      P01NX20_A396EmprCod = new String[] {""} ;
      P01NX20_A764ProForCod = new String[] {""} ;
      P01NX20_A771ProForTie = new short[1] ;
      A764ProForCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppla001__default(),
         new Object[] {
             new Object[] {
            P01NX2_A396EmprCod, P01NX2_A457FasCod, P01NX2_A468FasPrePie, P01NX2_n468FasPrePie, P01NX2_A469FasPreSal, P01NX2_n469FasPreSal, P01NX2_A456FasActTin, P01NX2_n456FasActTin, P01NX2_A472FasVelPro, P01NX2_n472FasVelPro,
            P01NX2_A464FasNumPas, P01NX2_n464FasNumPas, P01NX2_A602MaqCod, P01NX2_n602MaqCod, P01NX2_A2999MaqPri, P01NX2_n2999MaqPri, P01NX2_A459FasDec, P01NX2_n459FasDec, P01NX2_A5168FasPreMC, P01NX2_n5168FasPreMC,
            P01NX2_A4343FasEstamp, P01NX2_n4343FasEstamp, P01NX2_A5990FasDec2, P01NX2_n5990FasDec2
            }
            , new Object[] {
            P01NX3_A1664ParFasCod, P01NX3_A396EmprCod, P01NX3_A1665ParFasDsc, P01NX3_n1665ParFasDsc, P01NX3_A9830MaqCodC, P01NX3_A9836FasCodM, P01NX3_A758ProCod, P01NX3_A65ArtCod, P01NX3_A252CliCod, P01NX3_A9828ParFMVal
            }
            , new Object[] {
            P01NX4_A396EmprCod, P01NX4_A602MaqCod, P01NX4_A13020MaqTmCarg, P01NX4_n13020MaqTmCarg, P01NX4_A13021MaqTmDcarg, P01NX4_n13021MaqTmDcarg
            }
            , new Object[] {
            P01NX6_A396EmprCod, P01NX6_A130BarCodPar, P01NX6_A132BarCodReo, P01NX6_A129BarCod, P01NX6_A125BarAncAca1, P01NX6_A1909BarGraAca, P01NX6_A228BarUniMed, P01NX6_A211BarRdt, P01NX6_A155BarFecCli, P01NX6_A157BarFecEnt,
            P01NX6_A213BarSit, P01NX6_A214BarSua, P01NX6_A177BarLar, P01NX6_A218BarTipCol, P01NX6_A252CliCod, P01NX6_n252CliCod, P01NX6_A212BarSer, P01NX6_A1798BarDibCli, P01NX6_A1799BarDibInt, P01NX6_A166BarKgm,
            P01NX6_A184BarMtr, P01NX6_A199BarPie1, P01NX6_A365DisDes, P01NX6_A898BarPieNDes
            }
            , new Object[] {
            P01NX7_A396EmprCod, P01NX7_A129BarCod, P01NX7_A132BarCodReo, P01NX7_A130BarCodPar, P01NX7_A761ProFasLin, P01NX7_n761ProFasLin, P01NX7_A758ProCod
            }
            , new Object[] {
            P01NX8_AV83Nvariantes
            }
            , new Object[] {
            P01NX9_A396EmprCod, P01NX9_A602MaqCod, P01NX9_A615MaqMinPro, P01NX9_n615MaqMinPro, P01NX9_A612MaqHorPro, P01NX9_n612MaqHorPro
            }
            , new Object[] {
            P01NX10_A396EmprCod, P01NX10_A130BarCodPar, P01NX10_A132BarCodReo, P01NX10_A129BarCod, P01NX10_A252CliCod, P01NX10_n252CliCod, P01NX10_A212BarSer, P01NX10_A135BarColNom, P01NX10_A136BarColNum, P01NX10_A218BarTipCol
            }
            , new Object[] {
            P01NX11_A396EmprCod, P01NX11_A130BarCodPar, P01NX11_A132BarCodReo, P01NX11_A129BarCod, P01NX11_A252CliCod, P01NX11_n252CliCod, P01NX11_A212BarSer, P01NX11_A135BarColNom, P01NX11_A136BarColNum, P01NX11_A218BarTipCol
            }
            , new Object[] {
            P01NX12_A396EmprCod, P01NX12_A831TipColCod, P01NX12_A4999TipColTie, P01NX12_n4999TipColTie
            }
            , new Object[] {
            P01NX13_A396EmprCod, P01NX13_A614MaqMes, P01NX13_A599MaqAny, P01NX13_A602MaqCod, P01NX13_A610MaqHNPMes, P01NX13_n610MaqHNPMes
            }
            , new Object[] {
            P01NX14_A396EmprCod, P01NX14_A1014DibInt, P01NX14_A252CliCod, P01NX14_A1013DibCli, P01NX14_A1823DibTipMaq, P01NX14_n1823DibTipMaq
            }
            , new Object[] {
            P01NX15_AV64BarMolCil
            }
            , new Object[] {
            P01NX16_AV64BarMolCil
            }
            , new Object[] {
            P01NX17_A396EmprCod, P01NX17_A457FasCod, P01NX17_A758ProCod, P01NX17_A65ArtCod, P01NX17_A252CliCod, P01NX17_A8560ArtFasFac, P01NX17_A14547ArtFasNPs, P01NX17_A14545ArtFasPpp, P01NX17_A14544ArtFasPyS, P01NX17_A14546ArtFasVel
            }
            , new Object[] {
            P01NX18_A396EmprCod, P01NX18_A9830MaqCodC, P01NX18_A9836FasCodM, P01NX18_A758ProCod, P01NX18_A65ArtCod, P01NX18_A252CliCod, P01NX18_A14551CPFMNp, P01NX18_A14549CPFMPrep, P01NX18_A14548CPFMPres, P01NX18_A14550CPFMVel,
            P01NX18_A14552CPFMDc
            }
            , new Object[] {
            P01NX19_A396EmprCod, P01NX19_A65ArtCod, P01NX19_A252CliCod, P01NX19_A1903ArtGraAca, P01NX19_n1903ArtGraAca, P01NX19_A63ArtAcaMin, P01NX19_n63ArtAcaMin
            }
            , new Object[] {
            P01NX20_A396EmprCod, P01NX20_A764ProForCod, P01NX20_A771ProForTie
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20BarCodReo ;
   private byte AV89SiCsv ;
   private byte AV57Finite ;
   private byte AV81Vmtspm ;
   private byte AV82Variantes ;
   private byte AV90Acabats ;
   private byte AV128tiempoteorico ;
   private byte GXt_int2 ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A218BarTipCol ;
   private byte AV42ExColor ;
   private byte AV61BarTipCol ;
   private byte AV131variableparemtros ;
   private byte A615MaqMinPro ;
   private byte A612MaqHorPro ;
   private byte AV48Flag ;
   private byte AV47Dia ;
   private byte AV46Mes ;
   private byte AV52NDia ;
   private byte AV51Horas ;
   private byte GXv_int1[] ;
   private byte GXv_int10[] ;
   private byte A831TipColCod ;
   private byte A614MaqMes ;
   private short AV70MinTint ;
   private short AV71Cancho ;
   private short AV72Cgrm2 ;
   private short AV109Endutex ;
   private short AV108Carvema ;
   private short AV110Texpasa ;
   private short AV105parfases ;
   private short AV111fatelaresconfeccion ;
   private short AV112CAPFM1 ;
   private short AV113cladd ;
   private short A468FasPrePie ;
   private short A469FasPreSal ;
   private short A464FasNumPas ;
   private short A5168FasPreMC ;
   private short AV24PrePie ;
   private short AV25PreSal ;
   private short AV100fasPresal ;
   private short AV28NumPas ;
   private short AV63FasPreMC ;
   private short AV115decalentero ;
   private short A1664ParFasCod ;
   private short AV98MaqTmCarg ;
   private short AV99MaqTmDcarg ;
   private short A13020MaqTmCarg ;
   private short A13021MaqTmDcarg ;
   private short A125BarAncAca1 ;
   private short A1909BarGraAca ;
   private short A199BarPie1 ;
   private short AV129anchoendutex ;
   private short AV74Grm2 ;
   private short AV130Grm2endutex ;
   private short AV32NumPie ;
   private short A761ProFasLin ;
   private short AV83Nvariantes ;
   private short cV83Nvariantes ;
   private short AV84FactorVariantes ;
   private short AV116ArtFasPpp ;
   private short AV117ArtFasPyS ;
   private short AV119ArtFasNPs ;
   private short AV60Largopza ;
   private short AV56TiempoT ;
   private short AV106TiempoProRecetas ;
   private short AV107Tiempoprocesos ;
   private short AV75TotLav ;
   private short GXv_int9[] ;
   private short AV64BarMolCil ;
   private short AV124HorRea ;
   private short AV125HorReaint ;
   private short AV45Anyo ;
   private short A599MaqAny ;
   private short cV64BarMolCil ;
   private short A14547ArtFasNPs ;
   private short A14545ArtFasPpp ;
   private short A14544ArtFasPyS ;
   private short A14551CPFMNp ;
   private short A14549CPFMPrep ;
   private short A14548CPFMPres ;
   private short AV103ArtGraAca ;
   private short AV104ArtAcaMin ;
   private short A1903ArtGraAca ;
   private short A63ArtAcaMin ;
   private short A771ProForTie ;
   private short Gx_err ;
   private int AV19BarCod ;
   private int AV93ClicodOut ;
   private int AV69SoloKgm ;
   private int GXt_int3 ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int A1799BarDibInt ;
   private int A898BarPieNDes ;
   private int A198BarPie ;
   private int AV65CliCod ;
   private int AV67BarDibInt ;
   private int AV38FacCar ;
   private int AV39MedTie ;
   private int AV62TipColTie ;
   private int A136BarColNum ;
   private int AV55BarCliCod ;
   private int GXv_int8[] ;
   private int GXv_int4[] ;
   private int AV122minteo ;
   private int AV126MinRea ;
   private int A4999TipColTie ;
   private int A1014DibInt ;
   private long AV86hnd ;
   private java.math.BigDecimal AV22TieTot ;
   private java.math.BigDecimal AV23DecTot ;
   private java.math.BigDecimal AV18Resto ;
   private java.math.BigDecimal A472FasVelPro ;
   private java.math.BigDecimal A459FasDec ;
   private java.math.BigDecimal A5990FasDec2 ;
   private java.math.BigDecimal AV27Veloc ;
   private java.math.BigDecimal AV97FasVelpro ;
   private java.math.BigDecimal AV35Decal ;
   private java.math.BigDecimal AV101Fasdec2 ;
   private java.math.BigDecimal AV114decalagedecimal ;
   private java.math.BigDecimal AV96Velpar ;
   private java.math.BigDecimal A211BarRdt ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV30Kilos ;
   private java.math.BigDecimal AV31Metros ;
   private java.math.BigDecimal AV73Ancho ;
   private java.math.BigDecimal AV34Rendim ;
   private java.math.BigDecimal AV80Velocidad ;
   private java.math.BigDecimal AV118ArtFasVel ;
   private java.math.BigDecimal AV120CPFMDc ;
   private java.math.BigDecimal AV41HorPro ;
   private java.math.BigDecimal AV49DiasDec ;
   private java.math.BigDecimal AV53Tot ;
   private java.math.BigDecimal AV121metroscalculados ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal AV44TiePreTot ;
   private java.math.BigDecimal AV123HhMm ;
   private java.math.BigDecimal AV102bartieteo ;
   private java.math.BigDecimal A8560ArtFasFac ;
   private java.math.BigDecimal A14546ArtFasVel ;
   private java.math.BigDecimal A14550CPFMVel ;
   private java.math.BigDecimal A14552CPFMDc ;
   private String A396EmprCod ;
   private String AV21BarCodPar ;
   private String AV17FasCod ;
   private String AV68T_c ;
   private String AV91Procodout ;
   private String AV92MaqCodOut ;
   private String AV94BarSerOut ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A456FasActTin ;
   private String A602MaqCod ;
   private String A2999MaqPri ;
   private String A4343FasEstamp ;
   private String AV26ActTin ;
   private String AV29MaqCod ;
   private String AV58MaqPri ;
   private String AV88FasEstamp ;
   private String AV95ParFMVal ;
   private String A1665ParFasDsc ;
   private String A9830MaqCodC ;
   private String A9836FasCodM ;
   private String A758ProCod ;
   private String A65ArtCod ;
   private String A9828ParFMVal ;
   private String A130BarCodPar ;
   private String A228BarUniMed ;
   private String A214BarSua ;
   private String A177BarLar ;
   private String A212BarSer ;
   private String A1798BarDibCli ;
   private String A365DisDes ;
   private String AV33UniMed ;
   private String AV43Suavizado ;
   private String AV59Barlar ;
   private String AV79Barser ;
   private String AV66BarDibCli ;
   private String AV78Procod ;
   private String AV40HorasProd ;
   private String A135BarColNom ;
   private String GXv_char7[] ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String AV127HhMm_t ;
   private String A1013DibCli ;
   private String A1823DibTipMaq ;
   private String A764ProForCod ;
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
   private boolean n4343FasEstamp ;
   private boolean n5990FasDec2 ;
   private boolean n1665ParFasDsc ;
   private boolean n252CliCod ;
   private boolean n13020MaqTmCarg ;
   private boolean n13021MaqTmDcarg ;
   private boolean returnInSub ;
   private boolean n761ProFasLin ;
   private boolean n615MaqMinPro ;
   private boolean n612MaqHorPro ;
   private boolean n4999TipColTie ;
   private boolean n610MaqHNPMes ;
   private boolean n1823DibTipMaq ;
   private boolean n1903ArtGraAca ;
   private boolean n63ArtAcaMin ;
   private String AV50HorNPro ;
   private String A610MaqHNPMes ;
   private byte[] aP15 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private java.util.Date[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private String[] aP11 ;
   private int[] aP12 ;
   private String[] aP13 ;
   private long[] aP14 ;
   private IDataStoreProvider pr_default ;
   private String[] P01NX2_A396EmprCod ;
   private String[] P01NX2_A457FasCod ;
   private short[] P01NX2_A468FasPrePie ;
   private boolean[] P01NX2_n468FasPrePie ;
   private short[] P01NX2_A469FasPreSal ;
   private boolean[] P01NX2_n469FasPreSal ;
   private String[] P01NX2_A456FasActTin ;
   private boolean[] P01NX2_n456FasActTin ;
   private java.math.BigDecimal[] P01NX2_A472FasVelPro ;
   private boolean[] P01NX2_n472FasVelPro ;
   private short[] P01NX2_A464FasNumPas ;
   private boolean[] P01NX2_n464FasNumPas ;
   private String[] P01NX2_A602MaqCod ;
   private boolean[] P01NX2_n602MaqCod ;
   private String[] P01NX2_A2999MaqPri ;
   private boolean[] P01NX2_n2999MaqPri ;
   private java.math.BigDecimal[] P01NX2_A459FasDec ;
   private boolean[] P01NX2_n459FasDec ;
   private short[] P01NX2_A5168FasPreMC ;
   private boolean[] P01NX2_n5168FasPreMC ;
   private String[] P01NX2_A4343FasEstamp ;
   private boolean[] P01NX2_n4343FasEstamp ;
   private java.math.BigDecimal[] P01NX2_A5990FasDec2 ;
   private boolean[] P01NX2_n5990FasDec2 ;
   private short[] P01NX3_A1664ParFasCod ;
   private String[] P01NX3_A396EmprCod ;
   private String[] P01NX3_A1665ParFasDsc ;
   private boolean[] P01NX3_n1665ParFasDsc ;
   private String[] P01NX3_A9830MaqCodC ;
   private String[] P01NX3_A9836FasCodM ;
   private String[] P01NX3_A758ProCod ;
   private String[] P01NX3_A65ArtCod ;
   private int[] P01NX3_A252CliCod ;
   private boolean[] P01NX3_n252CliCod ;
   private String[] P01NX3_A9828ParFMVal ;
   private String[] P01NX4_A396EmprCod ;
   private String[] P01NX4_A602MaqCod ;
   private boolean[] P01NX4_n602MaqCod ;
   private short[] P01NX4_A13020MaqTmCarg ;
   private boolean[] P01NX4_n13020MaqTmCarg ;
   private short[] P01NX4_A13021MaqTmDcarg ;
   private boolean[] P01NX4_n13021MaqTmDcarg ;
   private String[] P01NX6_A396EmprCod ;
   private String[] P01NX6_A130BarCodPar ;
   private byte[] P01NX6_A132BarCodReo ;
   private int[] P01NX6_A129BarCod ;
   private short[] P01NX6_A125BarAncAca1 ;
   private short[] P01NX6_A1909BarGraAca ;
   private String[] P01NX6_A228BarUniMed ;
   private java.math.BigDecimal[] P01NX6_A211BarRdt ;
   private java.util.Date[] P01NX6_A155BarFecCli ;
   private java.util.Date[] P01NX6_A157BarFecEnt ;
   private byte[] P01NX6_A213BarSit ;
   private String[] P01NX6_A214BarSua ;
   private String[] P01NX6_A177BarLar ;
   private byte[] P01NX6_A218BarTipCol ;
   private int[] P01NX6_A252CliCod ;
   private boolean[] P01NX6_n252CliCod ;
   private String[] P01NX6_A212BarSer ;
   private String[] P01NX6_A1798BarDibCli ;
   private int[] P01NX6_A1799BarDibInt ;
   private java.math.BigDecimal[] P01NX6_A166BarKgm ;
   private java.math.BigDecimal[] P01NX6_A184BarMtr ;
   private short[] P01NX6_A199BarPie1 ;
   private String[] P01NX6_A365DisDes ;
   private int[] P01NX6_A898BarPieNDes ;
   private String[] P01NX7_A396EmprCod ;
   private int[] P01NX7_A129BarCod ;
   private byte[] P01NX7_A132BarCodReo ;
   private String[] P01NX7_A130BarCodPar ;
   private short[] P01NX7_A761ProFasLin ;
   private boolean[] P01NX7_n761ProFasLin ;
   private String[] P01NX7_A758ProCod ;
   private short[] P01NX8_AV83Nvariantes ;
   private String[] P01NX9_A396EmprCod ;
   private String[] P01NX9_A602MaqCod ;
   private boolean[] P01NX9_n602MaqCod ;
   private byte[] P01NX9_A615MaqMinPro ;
   private boolean[] P01NX9_n615MaqMinPro ;
   private byte[] P01NX9_A612MaqHorPro ;
   private boolean[] P01NX9_n612MaqHorPro ;
   private String[] P01NX10_A396EmprCod ;
   private String[] P01NX10_A130BarCodPar ;
   private byte[] P01NX10_A132BarCodReo ;
   private int[] P01NX10_A129BarCod ;
   private int[] P01NX10_A252CliCod ;
   private boolean[] P01NX10_n252CliCod ;
   private String[] P01NX10_A212BarSer ;
   private String[] P01NX10_A135BarColNom ;
   private int[] P01NX10_A136BarColNum ;
   private byte[] P01NX10_A218BarTipCol ;
   private String[] P01NX11_A396EmprCod ;
   private String[] P01NX11_A130BarCodPar ;
   private byte[] P01NX11_A132BarCodReo ;
   private int[] P01NX11_A129BarCod ;
   private int[] P01NX11_A252CliCod ;
   private boolean[] P01NX11_n252CliCod ;
   private String[] P01NX11_A212BarSer ;
   private String[] P01NX11_A135BarColNom ;
   private int[] P01NX11_A136BarColNum ;
   private byte[] P01NX11_A218BarTipCol ;
   private String[] P01NX12_A396EmprCod ;
   private byte[] P01NX12_A831TipColCod ;
   private int[] P01NX12_A4999TipColTie ;
   private boolean[] P01NX12_n4999TipColTie ;
   private String[] P01NX13_A396EmprCod ;
   private byte[] P01NX13_A614MaqMes ;
   private short[] P01NX13_A599MaqAny ;
   private String[] P01NX13_A602MaqCod ;
   private boolean[] P01NX13_n602MaqCod ;
   private String[] P01NX13_A610MaqHNPMes ;
   private boolean[] P01NX13_n610MaqHNPMes ;
   private String[] P01NX14_A396EmprCod ;
   private int[] P01NX14_A1014DibInt ;
   private int[] P01NX14_A252CliCod ;
   private boolean[] P01NX14_n252CliCod ;
   private String[] P01NX14_A1013DibCli ;
   private String[] P01NX14_A1823DibTipMaq ;
   private boolean[] P01NX14_n1823DibTipMaq ;
   private short[] P01NX15_AV64BarMolCil ;
   private short[] P01NX16_AV64BarMolCil ;
   private String[] P01NX17_A396EmprCod ;
   private String[] P01NX17_A457FasCod ;
   private String[] P01NX17_A758ProCod ;
   private String[] P01NX17_A65ArtCod ;
   private int[] P01NX17_A252CliCod ;
   private boolean[] P01NX17_n252CliCod ;
   private java.math.BigDecimal[] P01NX17_A8560ArtFasFac ;
   private short[] P01NX17_A14547ArtFasNPs ;
   private short[] P01NX17_A14545ArtFasPpp ;
   private short[] P01NX17_A14544ArtFasPyS ;
   private java.math.BigDecimal[] P01NX17_A14546ArtFasVel ;
   private String[] P01NX18_A396EmprCod ;
   private String[] P01NX18_A9830MaqCodC ;
   private String[] P01NX18_A9836FasCodM ;
   private String[] P01NX18_A758ProCod ;
   private String[] P01NX18_A65ArtCod ;
   private int[] P01NX18_A252CliCod ;
   private boolean[] P01NX18_n252CliCod ;
   private short[] P01NX18_A14551CPFMNp ;
   private short[] P01NX18_A14549CPFMPrep ;
   private short[] P01NX18_A14548CPFMPres ;
   private java.math.BigDecimal[] P01NX18_A14550CPFMVel ;
   private java.math.BigDecimal[] P01NX18_A14552CPFMDc ;
   private String[] P01NX19_A396EmprCod ;
   private String[] P01NX19_A65ArtCod ;
   private int[] P01NX19_A252CliCod ;
   private boolean[] P01NX19_n252CliCod ;
   private short[] P01NX19_A1903ArtGraAca ;
   private boolean[] P01NX19_n1903ArtGraAca ;
   private short[] P01NX19_A63ArtAcaMin ;
   private boolean[] P01NX19_n63ArtAcaMin ;
   private String[] P01NX20_A396EmprCod ;
   private String[] P01NX20_A764ProForCod ;
   private short[] P01NX20_A771ProForTie ;
}

final  class ppla001__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01NX2", "SELECT T1.EmprCod, T1.FasCod, T1.FasPrePie, T1.FasPreSal, T1.FasActTin, T1.FasVelPro, T1.FasNumPas, T1.MaqCod, T2.MaqPri, T1.FasDec, T1.FasPreMC, T1.FasEstamp, T1.FasDec2 FROM (TXPFASPRO T1 LEFT JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) WHERE T1.EmprCod = ? and T1.FasCod = ? ORDER BY T1.EmprCod, T1.FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01NX3", "SELECT T1.ParFasCod, T1.EmprCod, T2.ParFasDsc, T1.MaqCodC, T1.FasCodM, T1.ProCod, T1.ArtCod, T1.CliCod, T1.ParFMVal FROM (TXPCAPFM2 T1 INNER JOIN TXPPARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.ParFasCod = T1.ParFasCod) WHERE (T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? and T1.ProCod = ? and T1.FasCodM = ?) AND (RTRIM(LTRIM(T1.MaqCodC)) = SUBSTR(?, 1, 4)) AND (T2.ParFasDsc like '%VELO%') ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod, T1.ProCod, T1.FasCodM, T1.MaqCodC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01NX4", "SELECT EmprCod, MaqCod, MaqTmCarg, MaqTmDcarg FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01NX6", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarAncAca1, T1.BarGraAca, T1.BarUniMed, T1.BarRdt, T1.BarFecCli, T1.BarFecEnt, T1.BarSit, T1.BarSua, T1.BarLar, T1.BarTipCol, T1.CliCod, T1.BarSer, T1.BarDibCli, T1.BarDibInt, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr, COALESCE( T2.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T2.BarPieNDes, 0) AS BarPieNDes FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01NX7", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProFasLin, ProCod FROM TXPBARPRO WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01NX8", "SELECT COUNT(*) FROM TXPBARCOM WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01NX9", "SELECT EmprCod, MaqCod, MaqMinPro, MaqHorPro FROM TXPMAQUIN WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01NX10", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01NX11", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, CliCod, BarSer, BarColNom, BarColNum, BarTipCol FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01NX12", "SELECT EmprCod, TipColCod, TipColTie FROM TXPTIPCOL WHERE EmprCod = ? and TipColCod = ? ORDER BY EmprCod, TipColCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01NX13", "SELECT EmprCod, MaqMes, MaqAny, MaqCod, MaqHNPMes FROM TXPMAQHNP WHERE EmprCod = ? and MaqCod = ? and MaqAny = ? and MaqMes = ? ORDER BY EmprCod, MaqCod, MaqAny, MaqMes ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01NX14", "SELECT EmprCod, DibInt, CliCod, DibCli, DibTipMaq FROM TXPCDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ORDER BY EmprCod, DibCli, CliCod, DibInt ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01NX15", "SELECT COUNT(*) FROM TXPLDIBUC WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01NX16", "SELECT COUNT(*) FROM TXPLDIBUJ WHERE EmprCod = ? and DibCli = ? and CliCod = ? and DibInt = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01NX17", "SELECT EmprCod, FasCod, ProCod, ArtCod, CliCod, ArtFasFac, ArtFasNPs, ArtFasPpp, ArtFasPyS, ArtFasVel FROM TXPSERPAU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCod = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01NX18", "SELECT EmprCod, MaqCodC, FasCodM, ProCod, ArtCod, CliCod, CPFMNp, CPFMPrep, CPFMPres, CPFMVel, CPFMDc FROM TXPCAPFM1 WHERE (EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCodM = ?) AND (RTRIM(LTRIM(MaqCodC)) = SUBSTR(?, 1, 4)) ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01NX19", "SELECT EmprCod, ArtCod, CliCod, ArtGraAca, ArtAcaMin FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P01NX20", "SELECT EmprCod, ProForCod, ProForTie FROM TXPCPROFO WHERE EmprCod = ? and ProForCod = ? ORDER BY EmprCod, ProForCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 6);
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 3 :
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
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 6);
               ((String[]) buf[12])[0] = rslt.getString(13, 10);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(16, 16);
               ((String[]) buf[17])[0] = rslt.getString(17, 16);
               ((int[]) buf[18])[0] = rslt.getInt(18);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(20,2);
               ((short[]) buf[21])[0] = rslt.getShort(21);
               ((String[]) buf[22])[0] = rslt.getString(22, 1);
               ((int[]) buf[23])[0] = rslt.getInt(23);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               return;
            case 8 :
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
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,1);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,1);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 6);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

