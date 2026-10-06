package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class phdrpe1 extends GXProcedure
{
   public phdrpe1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( phdrpe1.class ), "" );
   }

   public phdrpe1( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             java.math.BigDecimal[] aP12 ,
                             java.math.BigDecimal[] aP13 ,
                             java.math.BigDecimal[] aP14 ,
                             java.math.BigDecimal[] aP15 ,
                             java.math.BigDecimal[] aP16 ,
                             int[] aP17 ,
                             int[] aP18 ,
                             int[] aP19 ,
                             int[] aP20 ,
                             int[] aP21 ,
                             int[] aP22 ,
                             int[] aP23 ,
                             int[] aP24 ,
                             int[] aP25 ,
                             int[] aP26 ,
                             String[] aP27 ,
                             String[] aP28 ,
                             String[] aP29 ,
                             String[] aP30 ,
                             String[] aP31 ,
                             String[] aP32 ,
                             String[] aP33 ,
                             String[] aP34 ,
                             String[] aP35 )
   {
      phdrpe1.this.aP36 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36);
      return aP36[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        int[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        java.math.BigDecimal[] aP8 ,
                        java.math.BigDecimal[] aP9 ,
                        java.math.BigDecimal[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        java.math.BigDecimal[] aP12 ,
                        java.math.BigDecimal[] aP13 ,
                        java.math.BigDecimal[] aP14 ,
                        java.math.BigDecimal[] aP15 ,
                        java.math.BigDecimal[] aP16 ,
                        int[] aP17 ,
                        int[] aP18 ,
                        int[] aP19 ,
                        int[] aP20 ,
                        int[] aP21 ,
                        int[] aP22 ,
                        int[] aP23 ,
                        int[] aP24 ,
                        int[] aP25 ,
                        int[] aP26 ,
                        String[] aP27 ,
                        String[] aP28 ,
                        String[] aP29 ,
                        String[] aP30 ,
                        String[] aP31 ,
                        String[] aP32 ,
                        String[] aP33 ,
                        String[] aP34 ,
                        String[] aP35 ,
                        String[] aP36 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             int[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             java.math.BigDecimal[] aP8 ,
                             java.math.BigDecimal[] aP9 ,
                             java.math.BigDecimal[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             java.math.BigDecimal[] aP12 ,
                             java.math.BigDecimal[] aP13 ,
                             java.math.BigDecimal[] aP14 ,
                             java.math.BigDecimal[] aP15 ,
                             java.math.BigDecimal[] aP16 ,
                             int[] aP17 ,
                             int[] aP18 ,
                             int[] aP19 ,
                             int[] aP20 ,
                             int[] aP21 ,
                             int[] aP22 ,
                             int[] aP23 ,
                             int[] aP24 ,
                             int[] aP25 ,
                             int[] aP26 ,
                             String[] aP27 ,
                             String[] aP28 ,
                             String[] aP29 ,
                             String[] aP30 ,
                             String[] aP31 ,
                             String[] aP32 ,
                             String[] aP33 ,
                             String[] aP34 ,
                             String[] aP35 ,
                             String[] aP36 )
   {
      phdrpe1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      phdrpe1.this.AV15BarCod = aP1[0];
      this.aP1 = aP1;
      phdrpe1.this.AV16BarCodReo = aP2[0];
      this.aP2 = aP2;
      phdrpe1.this.AV17BarCodPar = aP3[0];
      this.aP3 = aP3;
      phdrpe1.this.AV18PartCod = aP4[0];
      this.aP4 = aP4;
      phdrpe1.this.AV19CliCod = aP5[0];
      this.aP5 = aP5;
      phdrpe1.this.AV20Kilos = aP6[0];
      this.aP6 = aP6;
      phdrpe1.this.AV21Kilos1 = aP7[0];
      this.aP7 = aP7;
      phdrpe1.this.AV22Kilos2 = aP8[0];
      this.aP8 = aP8;
      phdrpe1.this.AV23Kilos3 = aP9[0];
      this.aP9 = aP9;
      phdrpe1.this.AV24Kilos4 = aP10[0];
      this.aP10 = aP10;
      phdrpe1.this.AV25Kilos5 = aP11[0];
      this.aP11 = aP11;
      phdrpe1.this.AV26Kilos6 = aP12[0];
      this.aP12 = aP12;
      phdrpe1.this.AV27Kilos7 = aP13[0];
      this.aP13 = aP13;
      phdrpe1.this.AV28Kilos8 = aP14[0];
      this.aP14 = aP14;
      phdrpe1.this.AV29Kilos9 = aP15[0];
      this.aP15 = aP15;
      phdrpe1.this.AV30Kilos10 = aP16[0];
      this.aP16 = aP16;
      phdrpe1.this.AV31Conos1 = aP17[0];
      this.aP17 = aP17;
      phdrpe1.this.AV32Conos2 = aP18[0];
      this.aP18 = aP18;
      phdrpe1.this.AV33Conos3 = aP19[0];
      this.aP19 = aP19;
      phdrpe1.this.AV34Conos4 = aP20[0];
      this.aP20 = aP20;
      phdrpe1.this.AV35Conos5 = aP21[0];
      this.aP21 = aP21;
      phdrpe1.this.AV36Conos6 = aP22[0];
      this.aP22 = aP22;
      phdrpe1.this.AV37Conos7 = aP23[0];
      this.aP23 = aP23;
      phdrpe1.this.AV38Conos8 = aP24[0];
      this.aP24 = aP24;
      phdrpe1.this.AV39Conos9 = aP25[0];
      this.aP25 = aP25;
      phdrpe1.this.AV40Conos10 = aP26[0];
      this.aP26 = aP26;
      phdrpe1.this.AV41Local1 = aP27[0];
      this.aP27 = aP27;
      phdrpe1.this.AV42Local2 = aP28[0];
      this.aP28 = aP28;
      phdrpe1.this.AV43Local3 = aP29[0];
      this.aP29 = aP29;
      phdrpe1.this.AV44Local4 = aP30[0];
      this.aP30 = aP30;
      phdrpe1.this.AV45Local5 = aP31[0];
      this.aP31 = aP31;
      phdrpe1.this.AV46Local6 = aP32[0];
      this.aP32 = aP32;
      phdrpe1.this.AV47Local7 = aP33[0];
      this.aP33 = aP33;
      phdrpe1.this.AV48Local8 = aP34[0];
      this.aP34 = aP34;
      phdrpe1.this.AV49Local9 = aP35[0];
      this.aP35 = aP35;
      phdrpe1.this.AV50Local10 = aP36[0];
      this.aP36 = aP36;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV90Tope1 = (short)(0) ;
      AV91Tope2 = (short)(0) ;
      GXv_int1[0] = AV90Tope1 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TOPES1", ""), GXv_int1) ;
      phdrpe1.this.AV90Tope1 = (short)((short)(GXv_int1[0])) ;
      GXv_int1[0] = AV91Tope2 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TOPES2", ""), GXv_int1) ;
      phdrpe1.this.AV91Tope2 = (short)((short)(GXv_int1[0])) ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV73KgsT[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV74ConosT[GX_I-1] = 0 ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV75LocalT[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV76NumPes = (byte)(0) ;
      AV73KgsT[1-1] = AV21Kilos1 ;
      AV73KgsT[2-1] = AV22Kilos2 ;
      AV73KgsT[3-1] = AV23Kilos3 ;
      AV73KgsT[4-1] = AV24Kilos4 ;
      AV73KgsT[5-1] = AV25Kilos5 ;
      AV73KgsT[6-1] = AV26Kilos6 ;
      AV73KgsT[7-1] = AV27Kilos7 ;
      AV73KgsT[8-1] = AV28Kilos8 ;
      AV73KgsT[9-1] = AV29Kilos9 ;
      AV73KgsT[10-1] = AV30Kilos10 ;
      AV74ConosT[1-1] = AV31Conos1 ;
      AV74ConosT[2-1] = AV32Conos2 ;
      AV74ConosT[3-1] = AV33Conos3 ;
      AV74ConosT[4-1] = AV34Conos4 ;
      AV74ConosT[5-1] = AV35Conos5 ;
      AV74ConosT[6-1] = AV36Conos6 ;
      AV74ConosT[7-1] = AV37Conos7 ;
      AV74ConosT[8-1] = AV38Conos8 ;
      AV74ConosT[9-1] = AV39Conos9 ;
      AV74ConosT[10-1] = AV40Conos10 ;
      AV75LocalT[1-1] = AV41Local1 ;
      AV75LocalT[2-1] = AV42Local2 ;
      AV75LocalT[3-1] = AV43Local3 ;
      AV75LocalT[4-1] = AV44Local4 ;
      AV75LocalT[5-1] = AV45Local5 ;
      AV75LocalT[6-1] = AV46Local6 ;
      AV75LocalT[7-1] = AV47Local7 ;
      AV75LocalT[8-1] = AV48Local8 ;
      AV75LocalT[9-1] = AV48Local8 ;
      AV75LocalT[10-1] = AV50Local10 ;
      AV51TotKgs = AV21Kilos1.add(AV22Kilos2).add(AV23Kilos3).add(AV24Kilos4).add(AV25Kilos5).add(AV26Kilos6).add(AV27Kilos7).add(AV28Kilos8).add(AV29Kilos9).add(AV30Kilos10) ;
      AV52TotConos = (int)(AV31Conos1+AV32Conos2+AV33Conos3+AV34Conos4+AV35Conos5+AV36Conos6+AV37Conos7+AV38Conos8+AV39Conos9+AV40Conos10) ;
      AV92KilosTope = AV20Kilos.add(((AV20Kilos.multiply(DecimalUtil.doubleToDec(AV90Tope1))).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
      AV76NumPes = (byte)(1) ;
      AV85FlagU = (byte)(0) ;
      while ( AV76NumPes <= 10 )
      {
         AV77Ubica = AV75LocalT[AV76NumPes-1] ;
         AV78KgsU = AV73KgsT[AV76NumPes-1] ;
         AV79ConU = AV74ConosT[AV76NumPes-1] ;
         AV80KgsEU = DecimalUtil.doubleToDec(0) ;
         AV81ConEU = 0 ;
         AV83KgsUU = DecimalUtil.doubleToDec(0) ;
         AV82ConUU = 0 ;
         /* Using cursor P00D12 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV18PartCod, Integer.valueOf(AV19CliCod), AV77Ubica});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A2285MovParLoc = P00D12_A2285MovParLoc[0] ;
            n2285MovParLoc = P00D12_n2285MovParLoc[0] ;
            A252CliCod = P00D12_A252CliCod[0] ;
            n252CliCod = P00D12_n252CliCod[0] ;
            A2268MovParCod = P00D12_A2268MovParCod[0] ;
            A2277MovParLiT = P00D12_A2277MovParLiT[0] ;
            n2277MovParLiT = P00D12_n2277MovParLiT[0] ;
            A2281MovParKE = P00D12_A2281MovParKE[0] ;
            n2281MovParKE = P00D12_n2281MovParKE[0] ;
            A2282MovParCE = P00D12_A2282MovParCE[0] ;
            n2282MovParCE = P00D12_n2282MovParCE[0] ;
            A2283MovParKU = P00D12_A2283MovParKU[0] ;
            n2283MovParKU = P00D12_n2283MovParKU[0] ;
            A2284MovParCU = P00D12_A2284MovParCU[0] ;
            n2284MovParCU = P00D12_n2284MovParCU[0] ;
            A2276MovParLin = P00D12_A2276MovParLin[0] ;
            if ( GXutil.strcmp(A2277MovParLiT, httpContext.getMessage( "E", "")) == 0 )
            {
               AV80KgsEU = AV80KgsEU.add(A2281MovParKE) ;
               AV81ConEU = (int)(AV81ConEU+A2282MovParCE) ;
            }
            if ( ( GXutil.strcmp(A2277MovParLiT, httpContext.getMessage( "B", "")) == 0 ) || ( GXutil.strcmp(A2277MovParLiT, httpContext.getMessage( "D", "")) == 0 ) )
            {
               AV83KgsUU = AV83KgsUU.add(A2283MovParKU) ;
               AV82ConUU = (int)(AV82ConUU+A2284MovParCU) ;
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         AV86Linea = GXutil.str( AV76NumPes, 10, 0) ;
         AV84Mensa = httpContext.getMessage( "Kgs Pesados superior a Kgs en Ubicacion = ", "") + AV75LocalT[AV76NumPes-1] ;
         AV87Mensa2 = httpContext.getMessage( ", Num Linea= ", "") + AV86Linea ;
         AV88Mensa3 = AV84Mensa + AV87Mensa2 ;
         AV93KgsTopU = (AV80KgsEU.subtract(AV83KgsUU)).add((((AV80KgsEU.subtract(AV83KgsUU)).multiply(DecimalUtil.doubleToDec(AV91Tope2))).divide(DecimalUtil.doubleToDec(100), 18, java.math.RoundingMode.DOWN))) ;
         if ( DecimalUtil.compareTo(AV78KgsU, AV93KgsTopU) > 0 )
         {
            httpContext.GX_msglist.addItem(AV88Mensa3);
            AV85FlagU = (byte)(1) ;
         }
         AV76NumPes = (byte)(AV76NumPes+1) ;
      }
      if ( AV85FlagU == 1 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso no ejecutado,Kgs pesados superior a Ubicacion", ""));
      }
      else
      {
         if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TotKgs)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Error: Total Kilos pesados es Cero", ""));
         }
         else
         {
            if ( DecimalUtil.compareTo(AV51TotKgs, AV92KilosTope) > 0 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Error: Total Kilos Pesados superior a Kilos HDR", ""));
            }
            else
            {
               /* Using cursor P00D13 */
               pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV15BarCod), Byte.valueOf(AV16BarCodReo), AV17BarCodPar});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A966PartCod = P00D13_A966PartCod[0] ;
                  n966PartCod = P00D13_n966PartCod[0] ;
                  A361DisCod = P00D13_A361DisCod[0] ;
                  A136BarColNum = P00D13_A136BarColNum[0] ;
                  A135BarColNom = P00D13_A135BarColNom[0] ;
                  A970ProceCod = P00D13_A970ProceCod[0] ;
                  n970ProceCod = P00D13_n970ProceCod[0] ;
                  A130BarCodPar = P00D13_A130BarCodPar[0] ;
                  A132BarCodReo = P00D13_A132BarCodReo[0] ;
                  A129BarCod = P00D13_A129BarCod[0] ;
                  A252CliCod = P00D13_A252CliCod[0] ;
                  n252CliCod = P00D13_n252CliCod[0] ;
                  A966PartCod = P00D13_A966PartCod[0] ;
                  n966PartCod = P00D13_n966PartCod[0] ;
                  A970ProceCod = P00D13_A970ProceCod[0] ;
                  n970ProceCod = P00D13_n970ProceCod[0] ;
                  GXv_char2[0] = A396EmprCod ;
                  GXv_int1[0] = A129BarCod ;
                  GXv_int3[0] = A132BarCodReo ;
                  GXv_char4[0] = A130BarCodPar ;
                  GXv_decimal5[0] = AV51TotKgs ;
                  GXv_int6[0] = AV52TotConos ;
                  GXv_int7[0] = A252CliCod ;
                  GXv_char8[0] = AV41Local1 ;
                  new app.pcamkil(remoteHandle, context).execute( GXv_char2, GXv_int1, GXv_int3, GXv_char4, GXv_decimal5, GXv_int6, GXv_int7, GXv_char8) ;
                  phdrpe1.this.A396EmprCod = GXv_char2[0] ;
                  phdrpe1.this.A129BarCod = GXv_int1[0] ;
                  phdrpe1.this.A132BarCodReo = GXv_int3[0] ;
                  phdrpe1.this.A130BarCodPar = GXv_char4[0] ;
                  phdrpe1.this.AV51TotKgs = GXv_decimal5[0] ;
                  phdrpe1.this.AV52TotConos = GXv_int6[0] ;
                  phdrpe1.this.A252CliCod = GXv_int7[0] ;
                  phdrpe1.this.AV41Local1 = GXv_char8[0] ;
                  GXv_char8[0] = A396EmprCod ;
                  GXv_int7[0] = A129BarCod ;
                  GXv_int3[0] = A132BarCodReo ;
                  GXv_char4[0] = A130BarCodPar ;
                  new app.phdrpes(remoteHandle, context).execute( GXv_char8, GXv_int7, GXv_int3, GXv_char4) ;
                  phdrpe1.this.A396EmprCod = GXv_char8[0] ;
                  phdrpe1.this.A129BarCod = GXv_int7[0] ;
                  phdrpe1.this.A132BarCodReo = GXv_int3[0] ;
                  phdrpe1.this.A130BarCodPar = GXv_char4[0] ;
                  /* Using cursor P00D14 */
                  pr_default.execute(2, new Object[] {A396EmprCod, AV18PartCod, Integer.valueOf(AV19CliCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
                  while ( (pr_default.getStatus(2) != 101) )
                  {
                     A252CliCod = P00D14_A252CliCod[0] ;
                     n252CliCod = P00D14_n252CliCod[0] ;
                     A2268MovParCod = P00D14_A2268MovParCod[0] ;
                     A2272MovParULi = P00D14_A2272MovParULi[0] ;
                     n2272MovParULi = P00D14_n2272MovParULi[0] ;
                     AV89ConLin = (byte)(A2272MovParULi) ;
                     /* Exiting from a For First loop. */
                     if (true) break;
                  }
                  pr_default.close(2);
                  AV76NumPes = (byte)(1) ;
                  while ( AV76NumPes <= 10 )
                  {
                     if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV73KgsT[AV76NumPes-1])==0) )
                     {
                        /*
                           INSERT RECORD ON TABLE TXPLMOVPD

                        */
                        W252CliCod = A252CliCod ;
                        n252CliCod = false ;
                        A2268MovParCod = AV18PartCod ;
                        A252CliCod = AV19CliCod ;
                        n252CliCod = false ;
                        A2276MovParLin = (short)(AV89ConLin+1) ;
                        A2277MovParLiT = httpContext.getMessage( "B", "") ;
                        n2277MovParLiT = false ;
                        A2278MovParAlb = A361DisCod ;
                        n2278MovParAlb = false ;
                        A2280MovParFec = Gx_date ;
                        n2280MovParFec = false ;
                        A2283MovParKU = AV73KgsT[AV76NumPes-1] ;
                        n2283MovParKU = false ;
                        A2284MovParCU = (short)(AV74ConosT[AV76NumPes-1]) ;
                        n2284MovParCU = false ;
                        A2285MovParLoc = AV75LocalT[AV76NumPes-1] ;
                        n2285MovParLoc = false ;
                        A2279MovParSit = GXutil.concat( A135BarColNom, GXutil.str( A136BarColNum, 6, 0), "/ ") ;
                        n2279MovParSit = false ;
                        AV89ConLin = (byte)(AV89ConLin+1) ;
                        /* Using cursor P00D15 */
                        pr_default.execute(3, new Object[] {A396EmprCod, A2268MovParCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Short.valueOf(A2276MovParLin), Boolean.valueOf(n2277MovParLiT), A2277MovParLiT, Boolean.valueOf(n2278MovParAlb), Integer.valueOf(A2278MovParAlb), Boolean.valueOf(n2279MovParSit), A2279MovParSit, Boolean.valueOf(n2280MovParFec), A2280MovParFec, Boolean.valueOf(n2283MovParKU), A2283MovParKU, Boolean.valueOf(n2284MovParCU), Short.valueOf(A2284MovParCU), Boolean.valueOf(n2285MovParLoc), A2285MovParLoc});
                        Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMOVPD");
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
                        A252CliCod = W252CliCod ;
                        n252CliCod = false ;
                        /* End Insert */
                     }
                     AV76NumPes = (byte)(AV76NumPes+1) ;
                  }
                  n2272MovParULi = false ;
                  /* Optimized UPDATE. */
                  /* Using cursor P00D16 */
                  short AV89ConLin2272Aux;
                  AV89ConLin2272Aux = AV89ConLin ;
                  pr_default.execute(4, new Object[] {Boolean.valueOf(n2272MovParULi), Short.valueOf(AV89ConLin2272Aux), A396EmprCod, AV18PartCod, Integer.valueOf(AV19CliCod), Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMOVPD");
                  /* End optimized UPDATE. */
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(1);
            }
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = phdrpe1.this.A396EmprCod;
      this.aP1[0] = phdrpe1.this.AV15BarCod;
      this.aP2[0] = phdrpe1.this.AV16BarCodReo;
      this.aP3[0] = phdrpe1.this.AV17BarCodPar;
      this.aP4[0] = phdrpe1.this.AV18PartCod;
      this.aP5[0] = phdrpe1.this.AV19CliCod;
      this.aP6[0] = phdrpe1.this.AV20Kilos;
      this.aP7[0] = phdrpe1.this.AV21Kilos1;
      this.aP8[0] = phdrpe1.this.AV22Kilos2;
      this.aP9[0] = phdrpe1.this.AV23Kilos3;
      this.aP10[0] = phdrpe1.this.AV24Kilos4;
      this.aP11[0] = phdrpe1.this.AV25Kilos5;
      this.aP12[0] = phdrpe1.this.AV26Kilos6;
      this.aP13[0] = phdrpe1.this.AV27Kilos7;
      this.aP14[0] = phdrpe1.this.AV28Kilos8;
      this.aP15[0] = phdrpe1.this.AV29Kilos9;
      this.aP16[0] = phdrpe1.this.AV30Kilos10;
      this.aP17[0] = phdrpe1.this.AV31Conos1;
      this.aP18[0] = phdrpe1.this.AV32Conos2;
      this.aP19[0] = phdrpe1.this.AV33Conos3;
      this.aP20[0] = phdrpe1.this.AV34Conos4;
      this.aP21[0] = phdrpe1.this.AV35Conos5;
      this.aP22[0] = phdrpe1.this.AV36Conos6;
      this.aP23[0] = phdrpe1.this.AV37Conos7;
      this.aP24[0] = phdrpe1.this.AV38Conos8;
      this.aP25[0] = phdrpe1.this.AV39Conos9;
      this.aP26[0] = phdrpe1.this.AV40Conos10;
      this.aP27[0] = phdrpe1.this.AV41Local1;
      this.aP28[0] = phdrpe1.this.AV42Local2;
      this.aP29[0] = phdrpe1.this.AV43Local3;
      this.aP30[0] = phdrpe1.this.AV44Local4;
      this.aP31[0] = phdrpe1.this.AV45Local5;
      this.aP32[0] = phdrpe1.this.AV46Local6;
      this.aP33[0] = phdrpe1.this.AV47Local7;
      this.aP34[0] = phdrpe1.this.AV48Local8;
      this.aP35[0] = phdrpe1.this.AV49Local9;
      this.aP36[0] = phdrpe1.this.AV50Local10;
      Application.commitDataStores(context, remoteHandle, pr_default, "phdrpe1");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV73KgsT = new java.math.BigDecimal[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV73KgsT[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV74ConosT = new int[10] ;
      AV75LocalT = new String[10] ;
      GX_I = 1 ;
      while ( GX_I <= 10 )
      {
         AV75LocalT[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV51TotKgs = DecimalUtil.ZERO ;
      AV92KilosTope = DecimalUtil.ZERO ;
      AV77Ubica = "" ;
      AV78KgsU = DecimalUtil.ZERO ;
      AV80KgsEU = DecimalUtil.ZERO ;
      AV83KgsUU = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P00D12_A396EmprCod = new String[] {""} ;
      P00D12_A2285MovParLoc = new String[] {""} ;
      P00D12_n2285MovParLoc = new boolean[] {false} ;
      P00D12_A252CliCod = new int[1] ;
      P00D12_n252CliCod = new boolean[] {false} ;
      P00D12_A2268MovParCod = new String[] {""} ;
      P00D12_A2277MovParLiT = new String[] {""} ;
      P00D12_n2277MovParLiT = new boolean[] {false} ;
      P00D12_A2281MovParKE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00D12_n2281MovParKE = new boolean[] {false} ;
      P00D12_A2282MovParCE = new short[1] ;
      P00D12_n2282MovParCE = new boolean[] {false} ;
      P00D12_A2283MovParKU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00D12_n2283MovParKU = new boolean[] {false} ;
      P00D12_A2284MovParCU = new short[1] ;
      P00D12_n2284MovParCU = new boolean[] {false} ;
      P00D12_A2276MovParLin = new short[1] ;
      A2285MovParLoc = "" ;
      A2268MovParCod = "" ;
      A2277MovParLiT = "" ;
      A2281MovParKE = DecimalUtil.ZERO ;
      A2283MovParKU = DecimalUtil.ZERO ;
      AV86Linea = "" ;
      AV84Mensa = "" ;
      AV87Mensa2 = "" ;
      AV88Mensa3 = "" ;
      AV93KgsTopU = DecimalUtil.ZERO ;
      P00D13_A966PartCod = new String[] {""} ;
      P00D13_n966PartCod = new boolean[] {false} ;
      P00D13_A396EmprCod = new String[] {""} ;
      P00D13_A361DisCod = new int[1] ;
      P00D13_A136BarColNum = new int[1] ;
      P00D13_A135BarColNom = new String[] {""} ;
      P00D13_A970ProceCod = new short[1] ;
      P00D13_n970ProceCod = new boolean[] {false} ;
      P00D13_A130BarCodPar = new String[] {""} ;
      P00D13_A132BarCodReo = new byte[1] ;
      P00D13_A129BarCod = new int[1] ;
      P00D13_A252CliCod = new int[1] ;
      P00D13_n252CliCod = new boolean[] {false} ;
      A966PartCod = "" ;
      A135BarColNom = "" ;
      A130BarCodPar = "" ;
      GXv_char2 = new String[1] ;
      GXv_int1 = new int[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_int6 = new int[1] ;
      GXv_char8 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      P00D14_A396EmprCod = new String[] {""} ;
      P00D14_A970ProceCod = new short[1] ;
      P00D14_n970ProceCod = new boolean[] {false} ;
      P00D14_A252CliCod = new int[1] ;
      P00D14_n252CliCod = new boolean[] {false} ;
      P00D14_A2268MovParCod = new String[] {""} ;
      P00D14_A2272MovParULi = new short[1] ;
      P00D14_n2272MovParULi = new boolean[] {false} ;
      A2280MovParFec = GXutil.nullDate() ;
      Gx_date = GXutil.nullDate() ;
      A2279MovParSit = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.phdrpe1__default(),
         new Object[] {
             new Object[] {
            P00D12_A396EmprCod, P00D12_A2285MovParLoc, P00D12_n2285MovParLoc, P00D12_A252CliCod, P00D12_A2268MovParCod, P00D12_A2277MovParLiT, P00D12_n2277MovParLiT, P00D12_A2281MovParKE, P00D12_n2281MovParKE, P00D12_A2282MovParCE,
            P00D12_n2282MovParCE, P00D12_A2283MovParKU, P00D12_n2283MovParKU, P00D12_A2284MovParCU, P00D12_n2284MovParCU, P00D12_A2276MovParLin
            }
            , new Object[] {
            P00D13_A966PartCod, P00D13_n966PartCod, P00D13_A396EmprCod, P00D13_A361DisCod, P00D13_A136BarColNum, P00D13_A135BarColNom, P00D13_A970ProceCod, P00D13_n970ProceCod, P00D13_A130BarCodPar, P00D13_A132BarCodReo,
            P00D13_A129BarCod, P00D13_A252CliCod, P00D13_n252CliCod
            }
            , new Object[] {
            P00D14_A396EmprCod, P00D14_A970ProceCod, P00D14_n970ProceCod, P00D14_A252CliCod, P00D14_A2268MovParCod, P00D14_A2272MovParULi, P00D14_n2272MovParULi
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
   }

   private byte AV16BarCodReo ;
   private byte AV76NumPes ;
   private byte AV85FlagU ;
   private byte A132BarCodReo ;
   private byte GXv_int3[] ;
   private byte AV89ConLin ;
   private short AV90Tope1 ;
   private short AV91Tope2 ;
   private short A2282MovParCE ;
   private short A2284MovParCU ;
   private short A2276MovParLin ;
   private short A970ProceCod ;
   private short A2272MovParULi ;
   private short Gx_err ;
   private int AV15BarCod ;
   private int AV19CliCod ;
   private int AV31Conos1 ;
   private int AV32Conos2 ;
   private int AV33Conos3 ;
   private int AV34Conos4 ;
   private int AV35Conos5 ;
   private int AV36Conos6 ;
   private int AV37Conos7 ;
   private int AV38Conos8 ;
   private int AV39Conos9 ;
   private int AV40Conos10 ;
   private int GX_I ;
   private int AV74ConosT[] ;
   private int AV52TotConos ;
   private int AV79ConU ;
   private int AV81ConEU ;
   private int AV82ConUU ;
   private int A252CliCod ;
   private int A361DisCod ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int GXv_int1[] ;
   private int GXv_int6[] ;
   private int GXv_int7[] ;
   private int GX_INS308 ;
   private int W252CliCod ;
   private int A2278MovParAlb ;
   private java.math.BigDecimal AV20Kilos ;
   private java.math.BigDecimal AV21Kilos1 ;
   private java.math.BigDecimal AV22Kilos2 ;
   private java.math.BigDecimal AV23Kilos3 ;
   private java.math.BigDecimal AV24Kilos4 ;
   private java.math.BigDecimal AV25Kilos5 ;
   private java.math.BigDecimal AV26Kilos6 ;
   private java.math.BigDecimal AV27Kilos7 ;
   private java.math.BigDecimal AV28Kilos8 ;
   private java.math.BigDecimal AV29Kilos9 ;
   private java.math.BigDecimal AV30Kilos10 ;
   private java.math.BigDecimal AV73KgsT[] ;
   private java.math.BigDecimal AV51TotKgs ;
   private java.math.BigDecimal AV92KilosTope ;
   private java.math.BigDecimal AV78KgsU ;
   private java.math.BigDecimal AV80KgsEU ;
   private java.math.BigDecimal AV83KgsUU ;
   private java.math.BigDecimal A2281MovParKE ;
   private java.math.BigDecimal A2283MovParKU ;
   private java.math.BigDecimal AV93KgsTopU ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private String A396EmprCod ;
   private String AV17BarCodPar ;
   private String AV18PartCod ;
   private String AV41Local1 ;
   private String AV42Local2 ;
   private String AV43Local3 ;
   private String AV44Local4 ;
   private String AV45Local5 ;
   private String AV46Local6 ;
   private String AV47Local7 ;
   private String AV48Local8 ;
   private String AV49Local9 ;
   private String AV50Local10 ;
   private String AV75LocalT[] ;
   private String AV77Ubica ;
   private String scmdbuf ;
   private String A2285MovParLoc ;
   private String A2268MovParCod ;
   private String A2277MovParLiT ;
   private String AV86Linea ;
   private String AV84Mensa ;
   private String AV87Mensa2 ;
   private String AV88Mensa3 ;
   private String A966PartCod ;
   private String A135BarColNom ;
   private String A130BarCodPar ;
   private String GXv_char2[] ;
   private String GXv_char8[] ;
   private String GXv_char4[] ;
   private String A2279MovParSit ;
   private String Gx_emsg ;
   private java.util.Date A2280MovParFec ;
   private java.util.Date Gx_date ;
   private boolean n2285MovParLoc ;
   private boolean n252CliCod ;
   private boolean n2277MovParLiT ;
   private boolean n2281MovParKE ;
   private boolean n2282MovParCE ;
   private boolean n2283MovParKU ;
   private boolean n2284MovParCU ;
   private boolean n966PartCod ;
   private boolean n970ProceCod ;
   private boolean n2272MovParULi ;
   private boolean n2278MovParAlb ;
   private boolean n2280MovParFec ;
   private boolean n2279MovParSit ;
   private String[] aP36 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private int[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private java.math.BigDecimal[] aP8 ;
   private java.math.BigDecimal[] aP9 ;
   private java.math.BigDecimal[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private java.math.BigDecimal[] aP12 ;
   private java.math.BigDecimal[] aP13 ;
   private java.math.BigDecimal[] aP14 ;
   private java.math.BigDecimal[] aP15 ;
   private java.math.BigDecimal[] aP16 ;
   private int[] aP17 ;
   private int[] aP18 ;
   private int[] aP19 ;
   private int[] aP20 ;
   private int[] aP21 ;
   private int[] aP22 ;
   private int[] aP23 ;
   private int[] aP24 ;
   private int[] aP25 ;
   private int[] aP26 ;
   private String[] aP27 ;
   private String[] aP28 ;
   private String[] aP29 ;
   private String[] aP30 ;
   private String[] aP31 ;
   private String[] aP32 ;
   private String[] aP33 ;
   private String[] aP34 ;
   private String[] aP35 ;
   private IDataStoreProvider pr_default ;
   private String[] P00D12_A396EmprCod ;
   private String[] P00D12_A2285MovParLoc ;
   private boolean[] P00D12_n2285MovParLoc ;
   private int[] P00D12_A252CliCod ;
   private boolean[] P00D12_n252CliCod ;
   private String[] P00D12_A2268MovParCod ;
   private String[] P00D12_A2277MovParLiT ;
   private boolean[] P00D12_n2277MovParLiT ;
   private java.math.BigDecimal[] P00D12_A2281MovParKE ;
   private boolean[] P00D12_n2281MovParKE ;
   private short[] P00D12_A2282MovParCE ;
   private boolean[] P00D12_n2282MovParCE ;
   private java.math.BigDecimal[] P00D12_A2283MovParKU ;
   private boolean[] P00D12_n2283MovParKU ;
   private short[] P00D12_A2284MovParCU ;
   private boolean[] P00D12_n2284MovParCU ;
   private short[] P00D12_A2276MovParLin ;
   private String[] P00D13_A966PartCod ;
   private boolean[] P00D13_n966PartCod ;
   private String[] P00D13_A396EmprCod ;
   private int[] P00D13_A361DisCod ;
   private int[] P00D13_A136BarColNum ;
   private String[] P00D13_A135BarColNom ;
   private short[] P00D13_A970ProceCod ;
   private boolean[] P00D13_n970ProceCod ;
   private String[] P00D13_A130BarCodPar ;
   private byte[] P00D13_A132BarCodReo ;
   private int[] P00D13_A129BarCod ;
   private int[] P00D13_A252CliCod ;
   private boolean[] P00D13_n252CliCod ;
   private String[] P00D14_A396EmprCod ;
   private short[] P00D14_A970ProceCod ;
   private boolean[] P00D14_n970ProceCod ;
   private int[] P00D14_A252CliCod ;
   private boolean[] P00D14_n252CliCod ;
   private String[] P00D14_A2268MovParCod ;
   private short[] P00D14_A2272MovParULi ;
   private boolean[] P00D14_n2272MovParULi ;
}

final  class phdrpe1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00D12", "SELECT EmprCod, MovParLoc, CliCod, MovParCod, MovParLiT, MovParKE, MovParCE, MovParKU, MovParCU, MovParLin FROM TXPLMOVPD WHERE (EmprCod = ? and MovParCod = ? and CliCod = ?) AND (MovParLoc = ?) ORDER BY EmprCod, MovParCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00D13", "SELECT T2.PartCod, T1.EmprCod, T1.DisCod, T1.BarColNum, T1.BarColNom, T3.ProceCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.CliCod FROM ((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPCPARTI T3 ON T3.EmprCod = T1.EmprCod AND T3.PartCod = T2.PartCod AND T3.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00D14", "SELECT EmprCod, ProceCod, CliCod, MovParCod, MovParULi FROM TXPCMOVPD WHERE (EmprCod = ? and MovParCod = ? and CliCod = ?) AND (ProceCod = ?) ORDER BY EmprCod, MovParCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00D15", "INSERT INTO TXPLMOVPD(EmprCod, MovParCod, CliCod, MovParLin, MovParLiT, MovParAlb, MovParSit, MovParFec, MovParKU, MovParCU, MovParLoc, MovParKE, MovParCE, MovParExL) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMOVPD")
         ,new UpdateCursor("P00D16", "UPDATE TXPCMOVPD SET MovParULi=?  WHERE (EmprCod = ? and MovParCod = ? and CliCod = ?) AND (ProceCod = ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCMOVPD")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 1);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 16);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 10);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               return;
            case 3 :
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
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 1);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(6, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 20);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DATE );
               }
               else
               {
                  stmt.setDate(8, (java.util.Date)parms[12]);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[18], 10);
               }
               return;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 16);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[6]).shortValue());
               }
               return;
      }
   }

}

