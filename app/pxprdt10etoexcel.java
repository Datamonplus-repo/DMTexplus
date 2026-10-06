package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pxprdt10etoexcel extends GXProcedure
{
   public pxprdt10etoexcel( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pxprdt10etoexcel.class ), "" );
   }

   public pxprdt10etoexcel( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             int[] aP11 ,
                             int[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 )
   {
      pxprdt10etoexcel.this.aP15 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
      return aP15[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        java.util.Date[] aP3 ,
                        java.util.Date[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        int[] aP11 ,
                        int[] aP12 ,
                        String[] aP13 ,
                        String[] aP14 ,
                        String[] aP15 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             java.util.Date[] aP3 ,
                             java.util.Date[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             int[] aP11 ,
                             int[] aP12 ,
                             String[] aP13 ,
                             String[] aP14 ,
                             String[] aP15 )
   {
      pxprdt10etoexcel.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pxprdt10etoexcel.this.AV91PMaqCod = aP1[0];
      this.aP1 = aP1;
      pxprdt10etoexcel.this.AV108UMaqCod = aP2[0];
      this.aP2 = aP2;
      pxprdt10etoexcel.this.AV47Hisprodti = aP3[0];
      this.aP3 = aP3;
      pxprdt10etoexcel.this.AV46Hisprodtf = aP4[0];
      this.aP4 = aP4;
      pxprdt10etoexcel.this.AV99TipMaqCod = aP5[0];
      this.aP5 = aP5;
      pxprdt10etoexcel.this.AV35Filename = aP6[0];
      this.aP6 = aP6;
      pxprdt10etoexcel.this.AV11Artcodi = aP7[0];
      this.aP7 = aP7;
      pxprdt10etoexcel.this.AV10Artcodf = aP8[0];
      this.aP8 = aP8;
      pxprdt10etoexcel.this.AV19barcolnomi = aP9[0];
      this.aP9 = aP9;
      pxprdt10etoexcel.this.AV18barcolnomf = aP10[0];
      this.aP10 = aP10;
      pxprdt10etoexcel.this.AV21barcolnumi = aP11[0];
      this.aP11 = aP11;
      pxprdt10etoexcel.this.AV20Barcolnumf = aP12[0];
      this.aP12 = aP12;
      pxprdt10etoexcel.this.AV35Filename = aP13[0];
      this.aP13 = aP13;
      pxprdt10etoexcel.this.aP14 = aP14;
      pxprdt10etoexcel.this.aP15 = aP15;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV39FlagTiReal ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TIREAL", ""), GXv_int1) ;
      pxprdt10etoexcel.this.AV39FlagTiReal = GXv_int1[0] ;
      System.out.println( httpContext.getMessage( "Generando Informe xml... ", "") );
      AV34File = AV35Filename ;
      AV31ExcelDocument.Open(AV34File);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV31ExcelDocument.Clear();
      AV33Fila = (short)(1) ;
      AV25Columna = (byte)(0) ;
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setText( httpContext.getMessage( "Periodo", "")+localUtil.ttoc( AV47Hisprodti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")+"-"+localUtil.ttoc( AV46Hisprodtf, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")+GXutil.format( " [%1]", GXutil.trim( AV112Pgmname), "", "", "", "", "", "", "", "") );
      AV33Fila = (short)(AV33Fila+1) ;
      AV33Fila = (short)(AV33Fila+1) ;
      AV25Columna = (byte)(0) ;
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setText( httpContext.getMessage( "Maquina", "") );
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setText( httpContext.getMessage( "Hdr", "") );
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setText( httpContext.getMessage( "Cliente", "") );
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setText( httpContext.getMessage( "Articulo", "") );
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setText( httpContext.getMessage( "Color", "") );
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setText( httpContext.getMessage( "Numero", "") );
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setText( httpContext.getMessage( "Tc", "") );
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setText( httpContext.getMessage( "Kgs", "") );
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setText( httpContext.getMessage( "Minutos Prod.", "") );
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setText( httpContext.getMessage( "Horas Prod.", "") );
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setText( httpContext.getMessage( "Minutos Teoricos", "") );
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setText( httpContext.getMessage( "Horas Teoricas", "") );
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setText( httpContext.getMessage( "Peso Ideal", "") );
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setText( httpContext.getMessage( "Diferencia", "") );
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setText( httpContext.getMessage( "Operador", "") );
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setText( httpContext.getMessage( "Lote", "") );
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setText( httpContext.getMessage( "Fin", "") );
      AV42ForRgb = 0 ;
      AV101Tot_dift = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P08XT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV91PMaqCod, AV47Hisprodti, AV46Hisprodtf, AV11Artcodi, AV10Artcodf, AV19barcolnomi, AV18barcolnomf, Integer.valueOf(AV21barcolnumi), Integer.valueOf(AV20Barcolnumf), AV99TipMaqCod, AV99TipMaqCod, AV108UMaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8XT2 = false ;
         A656ParCod = P08XT2_A656ParCod[0] ;
         n656ParCod = P08XT2_n656ParCod[0] ;
         A1011TipMaqCod = P08XT2_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P08XT2_n1011TipMaqCod[0] ;
         A136BarColNum = P08XT2_A136BarColNum[0] ;
         A135BarColNom = P08XT2_A135BarColNom[0] ;
         A212BarSer = P08XT2_A212BarSer[0] ;
         A602MaqCod = P08XT2_A602MaqCod[0] ;
         A556HisProEst = P08XT2_A556HisProEst[0] ;
         A461Fase = P08XT2_A461Fase[0] ;
         A129BarCod = P08XT2_A129BarCod[0] ;
         A132BarCodReo = P08XT2_A132BarCodReo[0] ;
         A130BarCodPar = P08XT2_A130BarCodPar[0] ;
         A1525HisProKgr = P08XT2_A1525HisProKgr[0] ;
         A606MaqDsc = P08XT2_A606MaqDsc[0] ;
         n606MaqDsc = P08XT2_n606MaqDsc[0] ;
         A503GruOpeCod = P08XT2_A503GruOpeCod[0] ;
         A3610HisProLot = P08XT2_A3610HisProLot[0] ;
         A6399MaqKgsId = P08XT2_A6399MaqKgsId[0] ;
         n6399MaqKgsId = P08XT2_n6399MaqKgsId[0] ;
         A4440HisProDTI = P08XT2_A4440HisProDTI[0] ;
         n4440HisProDTI = P08XT2_n4440HisProDTI[0] ;
         A4441HisProDTF = P08XT2_A4441HisProDTF[0] ;
         n4441HisProDTF = P08XT2_n4441HisProDTF[0] ;
         A563HisProMin = P08XT2_A563HisProMin[0] ;
         A560HisProHin = P08XT2_A560HisProHin[0] ;
         A562HisProMfi = P08XT2_A562HisProMfi[0] ;
         A559HisProHfi = P08XT2_A559HisProHfi[0] ;
         A558HisProFec = P08XT2_A558HisProFec[0] ;
         A561HisProLin = P08XT2_A561HisProLin[0] ;
         A1011TipMaqCod = P08XT2_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P08XT2_n1011TipMaqCod[0] ;
         A606MaqDsc = P08XT2_A606MaqDsc[0] ;
         n606MaqDsc = P08XT2_n606MaqDsc[0] ;
         A6399MaqKgsId = P08XT2_A6399MaqKgsId[0] ;
         n6399MaqKgsId = P08XT2_n6399MaqKgsId[0] ;
         A136BarColNum = P08XT2_A136BarColNum[0] ;
         A135BarColNom = P08XT2_A135BarColNom[0] ;
         A212BarSer = P08XT2_A212BarSer[0] ;
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
         AV104TotKgs = DecimalUtil.doubleToDec(0) ;
         AV105TotMinT = 0 ;
         AV87NTin = 0 ;
         AV48HisProLot = "" ;
         AV44Gruopecod = 0 ;
         AV106TotMinTp = 0 ;
         AV93Sum_kgs = DecimalUtil.doubleToDec(0) ;
         AV82MaqKgsId = A6399MaqKgsId ;
         AV100Tot_dif = DecimalUtil.doubleToDec(0) ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08XT2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08XT2_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk8XT2 = false ;
            A656ParCod = P08XT2_A656ParCod[0] ;
            n656ParCod = P08XT2_n656ParCod[0] ;
            A1011TipMaqCod = P08XT2_A1011TipMaqCod[0] ;
            n1011TipMaqCod = P08XT2_n1011TipMaqCod[0] ;
            A136BarColNum = P08XT2_A136BarColNum[0] ;
            A135BarColNom = P08XT2_A135BarColNom[0] ;
            A212BarSer = P08XT2_A212BarSer[0] ;
            A556HisProEst = P08XT2_A556HisProEst[0] ;
            A461Fase = P08XT2_A461Fase[0] ;
            A129BarCod = P08XT2_A129BarCod[0] ;
            A132BarCodReo = P08XT2_A132BarCodReo[0] ;
            A130BarCodPar = P08XT2_A130BarCodPar[0] ;
            A1525HisProKgr = P08XT2_A1525HisProKgr[0] ;
            A606MaqDsc = P08XT2_A606MaqDsc[0] ;
            n606MaqDsc = P08XT2_n606MaqDsc[0] ;
            A503GruOpeCod = P08XT2_A503GruOpeCod[0] ;
            A3610HisProLot = P08XT2_A3610HisProLot[0] ;
            A4440HisProDTI = P08XT2_A4440HisProDTI[0] ;
            n4440HisProDTI = P08XT2_n4440HisProDTI[0] ;
            A4441HisProDTF = P08XT2_A4441HisProDTF[0] ;
            n4441HisProDTF = P08XT2_n4441HisProDTF[0] ;
            A563HisProMin = P08XT2_A563HisProMin[0] ;
            A560HisProHin = P08XT2_A560HisProHin[0] ;
            A562HisProMfi = P08XT2_A562HisProMfi[0] ;
            A559HisProHfi = P08XT2_A559HisProHfi[0] ;
            A558HisProFec = P08XT2_A558HisProFec[0] ;
            A561HisProLin = P08XT2_A561HisProLin[0] ;
            A1011TipMaqCod = P08XT2_A1011TipMaqCod[0] ;
            n1011TipMaqCod = P08XT2_n1011TipMaqCod[0] ;
            A606MaqDsc = P08XT2_A606MaqDsc[0] ;
            n606MaqDsc = P08XT2_n606MaqDsc[0] ;
            A136BarColNum = P08XT2_A136BarColNum[0] ;
            A135BarColNom = P08XT2_A135BarColNom[0] ;
            A212BarSer = P08XT2_A212BarSer[0] ;
            if ( ( GXutil.strcmp(A602MaqCod, AV91PMaqCod) >= 0 ) && ( GXutil.strcmp(A602MaqCod, AV108UMaqCod) <= 0 ) )
            {
               if ( ( GXutil.strcmp(A212BarSer, AV11Artcodi) >= 0 ) && ( GXutil.strcmp(A212BarSer, AV10Artcodf) <= 0 ) )
               {
                  if ( ( GXutil.strcmp(A135BarColNom, AV19barcolnomi) >= 0 ) && ( GXutil.strcmp(A135BarColNom, AV18barcolnomf) <= 0 ) )
                  {
                     if ( ( A136BarColNum >= AV21barcolnumi ) && ( A136BarColNum <= AV20Barcolnumf ) )
                     {
                        if ( ( GXutil.strcmp(A1011TipMaqCod, AV99TipMaqCod) == 0 ) || (GXutil.strcmp("", AV99TipMaqCod)==0) )
                        {
                           if ( (( A4441HisProDTF.after( AV47Hisprodti ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV47Hisprodti) )) && (( A4441HisProDTF.before( AV46Hisprodtf ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV46Hisprodtf) )) )
                           {
                              if ( (0==A656ParCod) )
                              {
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
                                 AV49HisProTre = (short)(0) ;
                                 if ( A556HisProEst != 0 )
                                 {
                                    if ( AV39FlagTiReal == 0 )
                                    {
                                       AV49HisProTre = A564HisProTre ;
                                    }
                                    else
                                    {
                                       AV49HisProTre = A5605HisProTr2 ;
                                    }
                                 }
                                 AV38FlagMarca = (byte)(0) ;
                                 GXv_char2[0] = A396EmprCod ;
                                 GXv_char3[0] = A461Fase ;
                                 GXv_char4[0] = AV32FasActTin ;
                                 new app.pfasest(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
                                 pxprdt10etoexcel.this.A396EmprCod = GXv_char2[0] ;
                                 pxprdt10etoexcel.this.A461Fase = GXv_char3[0] ;
                                 pxprdt10etoexcel.this.AV32FasActTin = GXv_char4[0] ;
                                 AV12BarCod = A129BarCod ;
                                 AV16BarCodReo = A132BarCodReo ;
                                 AV14BarCodPar = A130BarCodPar ;
                                 /* Execute user subroutine: 'LEOHDR' */
                                 S121 ();
                                 if ( returnInSub )
                                 {
                                    pr_default.close(0);
                                    pr_default.close(0);
                                    pr_default.close(0);
                                    returnInSub = true;
                                    cleanup();
                                    if (true) return;
                                 }
                                 if ( ( GXutil.strcmp(AV32FasActTin, httpContext.getMessage( "N", "")) == 0 ) && (0==A656ParCod) )
                                 {
                                    AV38FlagMarca = (byte)(1) ;
                                 }
                                 AV55HorRea = (short)(GXutil.Int( AV49HisProTre/ (double) (60))) ;
                                 AV56HorReaint = (short)(GXutil.Int( AV55HorRea)) ;
                                 AV84MinRea = (byte)(AV49HisProTre-(AV56HorReaint*60)) ;
                                 AV85MinRea2 = DecimalUtil.doubleToDec(AV84MinRea/ (double) (100)) ;
                                 AV51HmP = DecimalUtil.doubleToDec(AV56HorReaint).add(AV85MinRea2) ;
                                 AV55HorRea = (short)(GXutil.Int( AV96TiempoF/ (double) (60))) ;
                                 AV56HorReaint = (short)(GXutil.Int( AV55HorRea)) ;
                                 AV84MinRea = (byte)(AV96TiempoF-(AV56HorReaint*60)) ;
                                 AV85MinRea2 = DecimalUtil.doubleToDec(AV84MinRea/ (double) (100)) ;
                                 AV50HmF = DecimalUtil.doubleToDec(AV56HorReaint).add(AV85MinRea2) ;
                                 AV104TotKgs = AV104TotKgs.add(A1525HisProKgr) ;
                                 if ( GXutil.strcmp(AV48HisProLot, A3610HisProLot) != 0 )
                                 {
                                    AV87NTin = (int)(AV87NTin+1) ;
                                    AV106TotMinTp = (int)(AV106TotMinTp+AV49HisProTre) ;
                                 }
                                 if ( ( GXutil.strcmp(AV48HisProLot, A3610HisProLot) == 0 ) && ( AV44Gruopecod != A503GruOpeCod ) )
                                 {
                                    AV106TotMinTp = (int)(AV106TotMinTp+AV49HisProTre) ;
                                 }
                                 if ( ( GXutil.strcmp(AV48HisProLot, A3610HisProLot) != 0 ) && ! (GXutil.strcmp("", AV48HisProLot)==0) )
                                 {
                                    /* Execute user subroutine: 'IMP_LINEA' */
                                    S111 ();
                                    if ( returnInSub )
                                    {
                                       pr_default.close(0);
                                       pr_default.close(0);
                                       pr_default.close(0);
                                       returnInSub = true;
                                       cleanup();
                                       if (true) return;
                                    }
                                    AV93Sum_kgs = A1525HisProKgr ;
                                    AV94Sum_t = AV49HisProTre ;
                                 }
                                 if ( ( ( GXutil.strcmp(AV48HisProLot, A3610HisProLot) == 0 ) ) || ( GXutil.strcmp(AV48HisProLot, " ") == 0 ) )
                                 {
                                    AV93Sum_kgs = AV93Sum_kgs.add(A1525HisProKgr) ;
                                    if ( AV44Gruopecod != A503GruOpeCod )
                                    {
                                       AV94Sum_t = (short)(AV94Sum_t+AV49HisProTre) ;
                                    }
                                 }
                                 AV12BarCod = A129BarCod ;
                                 AV16BarCodReo = A132BarCodReo ;
                                 AV14BarCodPar = A130BarCodPar ;
                                 /* Execute user subroutine: 'LEOHDR' */
                                 S121 ();
                                 if ( returnInSub )
                                 {
                                    pr_default.close(0);
                                    pr_default.close(0);
                                    pr_default.close(0);
                                    returnInSub = true;
                                    cleanup();
                                    if (true) return;
                                 }
                                 AV33Fila = (short)(AV33Fila+1) ;
                                 AV25Columna = (byte)(1) ;
                                 AV45Hdr = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
                                 if ( (0==A656ParCod) )
                                 {
                                    AV25Columna = (byte)(AV25Columna+1) ;
                                    AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setText( A602MaqCod );
                                    AV25Columna = (byte)(AV25Columna+1) ;
                                    AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setText( A606MaqDsc );
                                    AV25Columna = (byte)(AV25Columna+1) ;
                                    AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setText( AV45Hdr );
                                    AV25Columna = (byte)(AV25Columna+1) ;
                                    AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setText( AV24CliNom );
                                    AV25Columna = (byte)(AV25Columna+1) ;
                                    AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setText( AV43ForSer );
                                    AV25Columna = (byte)(AV25Columna+1) ;
                                    AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setText( AV22BarSerdsc );
                                    AV25Columna = (byte)(AV25Columna+1) ;
                                    AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setText( AV40ForColNom );
                                    AV25Columna = (byte)(AV25Columna+1) ;
                                    AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setNumber( AV41ForColNum );
                                    AV25Columna = (byte)(AV25Columna+1) ;
                                    AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setNumber( AV98TipColCod );
                                    AV25Columna = (byte)(AV25Columna+1) ;
                                    AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(A1525HisProKgr)) );
                                    AV25Columna = (byte)(AV25Columna+1) ;
                                    AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setNumber( AV49HisProTre );
                                    AV25Columna = (byte)(AV25Columna+1) ;
                                    AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV51HmP)) );
                                    AV25Columna = (byte)(AV25Columna+1) ;
                                    AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setNumber( AV96TiempoF );
                                    AV25Columna = (byte)(AV25Columna+1) ;
                                    AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV50HmF)) );
                                    AV25Columna = (byte)(AV25Columna+1) ;
                                    AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV82MaqKgsId)) );
                                    AV27DifPes = DecimalUtil.doubleToDec(0) ;
                                    AV25Columna = (byte)(AV25Columna+1) ;
                                    AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV27DifPes)) );
                                    AV25Columna = (byte)(AV25Columna+1) ;
                                    AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setNumber( A503GruOpeCod );
                                    AV25Columna = (byte)(AV25Columna+1) ;
                                    AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setText( A3610HisProLot );
                                    AV25Columna = (byte)(AV25Columna+1) ;
                                    AV31ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
                                    AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setDate( A4441HisProDTF );
                                 }
                                 AV48HisProLot = A3610HisProLot ;
                                 AV44Gruopecod = A503GruOpeCod ;
                              }
                           }
                        }
                     }
                  }
               }
            }
            brk8XT2 = true ;
            pr_default.readNext(0);
         }
         /* Execute user subroutine: 'IMP_LINEA' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV55HorRea = (short)(GXutil.Int( AV105TotMinT/ (double) (60))) ;
         AV56HorReaint = (short)(GXutil.Int( AV55HorRea)) ;
         AV84MinRea = (byte)(AV105TotMinT-(AV56HorReaint*60)) ;
         AV85MinRea2 = DecimalUtil.doubleToDec(AV84MinRea/ (double) (100)) ;
         AV51HmP = DecimalUtil.doubleToDec(AV56HorReaint).add(AV85MinRea2) ;
         AV97TiempoNP = DecimalUtil.doubleToDec(0) ;
         if ( ! (0==AV87NTin) )
         {
            AV97TiempoNP = AV51HmP.divide(DecimalUtil.doubleToDec(AV87NTin), 18, java.math.RoundingMode.DOWN) ;
         }
         AV33Fila = (short)(AV33Fila+1) ;
         AV25Columna = (byte)(9) ;
         AV25Columna = (byte)(AV25Columna+1) ;
         AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV104TotKgs)) );
         AV25Columna = (byte)(AV25Columna+1) ;
         AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setNumber( AV105TotMinT );
         AV25Columna = (byte)(AV25Columna+1) ;
         AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV51HmP)) );
         AV25Columna = (byte)(AV25Columna+1) ;
         AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV100Tot_dif)) );
         if ( ! brk8XT2 )
         {
            brk8XT2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      AV33Fila = (short)(AV33Fila+1) ;
      AV33Fila = (short)(AV33Fila+1) ;
      AV25Columna = (byte)(9) ;
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV102Tot_kgsG)) );
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setNumber( AV103Tot_tG );
      AV55HorRea = (short)(GXutil.Int( AV103Tot_tG/ (double) (60))) ;
      AV56HorReaint = (short)(GXutil.Int( AV55HorRea)) ;
      AV84MinRea = (byte)(AV103Tot_tG-(AV56HorReaint*60)) ;
      AV85MinRea2 = DecimalUtil.doubleToDec(AV84MinRea/ (double) (100)) ;
      AV51HmP = DecimalUtil.doubleToDec(AV56HorReaint).add(AV85MinRea2) ;
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV51HmP)) );
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV101Tot_dift)) );
      AV31ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV31ExcelDocument.Close();
      cleanup();
   }

   public void S111( )
   {
      /* 'IMP_LINEA' Routine */
      returnInSub = false ;
      AV33Fila = (short)(AV33Fila+1) ;
      AV25Columna = (byte)(9) ;
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV93Sum_kgs)) );
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setNumber( AV94Sum_t );
      AV55HorRea = (short)(GXutil.Int( AV94Sum_t/ (double) (60))) ;
      AV56HorReaint = (short)(GXutil.Int( AV55HorRea)) ;
      AV84MinRea = (byte)(AV94Sum_t-(AV56HorReaint*60)) ;
      AV85MinRea2 = DecimalUtil.doubleToDec(AV84MinRea/ (double) (100)) ;
      AV51HmP = DecimalUtil.doubleToDec(AV56HorReaint).add(AV85MinRea2) ;
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV51HmP)) );
      AV12BarCod = (int)(GXutil.lval( GXutil.substring( AV48HisProLot, 1, 8))) ;
      AV16BarCodReo = (byte)(GXutil.lval( GXutil.substring( AV48HisProLot, 9, 1))) ;
      AV14BarCodPar = GXutil.substring( AV48HisProLot, 10, 1) ;
      /* Execute user subroutine: 'LEOHDR' */
      S121 ();
      if (returnInSub) return;
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setNumber( AV96TiempoF );
      AV55HorRea = (short)(GXutil.Int( AV96TiempoF/ (double) (60))) ;
      AV56HorReaint = (short)(GXutil.Int( AV55HorRea)) ;
      AV84MinRea = (byte)(AV96TiempoF-(AV56HorReaint*60)) ;
      AV85MinRea2 = DecimalUtil.doubleToDec(AV84MinRea/ (double) (100)) ;
      AV50HmF = DecimalUtil.doubleToDec(AV56HorReaint).add(AV85MinRea2) ;
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV50HmF)) );
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV82MaqKgsId)) );
      AV27DifPes = AV93Sum_kgs.subtract(A6399MaqKgsId) ;
      AV25Columna = (byte)(AV25Columna+1) ;
      AV31ExcelDocument.Cells(AV33Fila, AV25Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV27DifPes)) );
      AV100Tot_dif = AV100Tot_dif.add(AV27DifPes) ;
      AV101Tot_dift = AV101Tot_dift.add(AV27DifPes) ;
      AV102Tot_kgsG = AV102Tot_kgsG.add(AV93Sum_kgs) ;
      AV103Tot_tG = (int)(AV103Tot_tG+AV94Sum_t) ;
      AV105TotMinT = (int)(AV105TotMinT+AV94Sum_t) ;
   }

   public void S121( )
   {
      /* 'LEOHDR' Routine */
      returnInSub = false ;
      AV23CliCod = 999999 ;
      AV24CliNom = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" ;
      AV43ForSer = "XXXXXXXXXXXXXXXX" ;
      AV22BarSerdsc = "XXXXXXXXXXXXXXXXXXXXXXXXXX" ;
      AV40ForColNom = "XXXXXXXXXXXXX" ;
      AV41ForColNum = 999999 ;
      AV98TipColCod = (byte)(99) ;
      AV36FlagBarcad = (byte)(0) ;
      AV37FlagBH = "X" ;
      /* Using cursor P08XT3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV12BarCod), Byte.valueOf(AV16BarCodReo), AV14BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P08XT3_A130BarCodPar[0] ;
         A132BarCodReo = P08XT3_A132BarCodReo[0] ;
         A129BarCod = P08XT3_A129BarCod[0] ;
         A252CliCod = P08XT3_A252CliCod[0] ;
         n252CliCod = P08XT3_n252CliCod[0] ;
         A279CliNom = P08XT3_A279CliNom[0] ;
         A212BarSer = P08XT3_A212BarSer[0] ;
         A1652BarSerDsc = P08XT3_A1652BarSerDsc[0] ;
         A135BarColNom = P08XT3_A135BarColNom[0] ;
         A136BarColNum = P08XT3_A136BarColNum[0] ;
         A218BarTipCol = P08XT3_A218BarTipCol[0] ;
         A279CliNom = P08XT3_A279CliNom[0] ;
         AV36FlagBarcad = (byte)(1) ;
         AV37FlagBH = httpContext.getMessage( "B", "") ;
         AV23CliCod = A252CliCod ;
         AV24CliNom = A279CliNom ;
         AV43ForSer = A212BarSer ;
         AV22BarSerdsc = A1652BarSerDsc ;
         AV40ForColNom = A135BarColNom ;
         AV41ForColNum = A136BarColNum ;
         AV98TipColCod = A218BarTipCol ;
         /* Execute user subroutine: 'LEOFORMU' */
         S134 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV36FlagBarcad == 0 )
      {
         /* Using cursor P08XT4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV12BarCod), Byte.valueOf(AV16BarCodReo), AV14BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A507HbaBarPar = P08XT4_A507HbaBarPar[0] ;
            A508HbaBarReo = P08XT4_A508HbaBarReo[0] ;
            A506HbaBarCod = P08XT4_A506HbaBarCod[0] ;
            A252CliCod = P08XT4_A252CliCod[0] ;
            n252CliCod = P08XT4_n252CliCod[0] ;
            A279CliNom = P08XT4_A279CliNom[0] ;
            A535HbaSer = P08XT4_A535HbaSer[0] ;
            n535HbaSer = P08XT4_n535HbaSer[0] ;
            A2627HbaSerDsc = P08XT4_A2627HbaSerDsc[0] ;
            n2627HbaSerDsc = P08XT4_n2627HbaSerDsc[0] ;
            A509HbaColNom = P08XT4_A509HbaColNom[0] ;
            n509HbaColNom = P08XT4_n509HbaColNom[0] ;
            A510HbaColNum = P08XT4_A510HbaColNum[0] ;
            n510HbaColNum = P08XT4_n510HbaColNum[0] ;
            A537HbaTipCol = P08XT4_A537HbaTipCol[0] ;
            n537HbaTipCol = P08XT4_n537HbaTipCol[0] ;
            A279CliNom = P08XT4_A279CliNom[0] ;
            AV37FlagBH = httpContext.getMessage( "H", "") ;
            AV23CliCod = A252CliCod ;
            AV24CliNom = A279CliNom ;
            AV43ForSer = A535HbaSer ;
            AV22BarSerdsc = A2627HbaSerDsc ;
            AV40ForColNom = A509HbaColNom ;
            AV41ForColNum = A510HbaColNum ;
            AV98TipColCod = A537HbaTipCol ;
            /* Execute user subroutine: 'LEOFORMU' */
            S134 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               pr_default.close(2);
               returnInSub = true;
               if (true) return;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
   }

   public void S134( )
   {
      /* 'LEOFORMU' Routine */
      returnInSub = false ;
      AV96TiempoF = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P08XT5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV23CliCod), AV43ForSer, AV40ForColNom, Integer.valueOf(AV41ForColNum), Byte.valueOf(AV98TipColCod)});
      c771ProForTie = P08XT5_A771ProForTie[0] ;
      pr_default.close(3);
      AV96TiempoF = (short)(AV96TiempoF+c771ProForTie) ;
      /* End optimized group. */
   }

   public void S141( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV31ExcelDocument.getErrCode() != 0 )
      {
         AV34File = "" ;
         AV109ErrorMessage = AV31ExcelDocument.getErrDescription() ;
         AV31ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pxprdt10etoexcel.this.A396EmprCod;
      this.aP1[0] = pxprdt10etoexcel.this.AV91PMaqCod;
      this.aP2[0] = pxprdt10etoexcel.this.AV108UMaqCod;
      this.aP3[0] = pxprdt10etoexcel.this.AV47Hisprodti;
      this.aP4[0] = pxprdt10etoexcel.this.AV46Hisprodtf;
      this.aP5[0] = pxprdt10etoexcel.this.AV99TipMaqCod;
      this.aP6[0] = pxprdt10etoexcel.this.AV35Filename;
      this.aP7[0] = pxprdt10etoexcel.this.AV11Artcodi;
      this.aP8[0] = pxprdt10etoexcel.this.AV10Artcodf;
      this.aP9[0] = pxprdt10etoexcel.this.AV19barcolnomi;
      this.aP10[0] = pxprdt10etoexcel.this.AV18barcolnomf;
      this.aP11[0] = pxprdt10etoexcel.this.AV21barcolnumi;
      this.aP12[0] = pxprdt10etoexcel.this.AV20Barcolnumf;
      this.aP13[0] = pxprdt10etoexcel.this.AV35Filename;
      this.aP14[0] = pxprdt10etoexcel.this.AV34File;
      this.aP15[0] = pxprdt10etoexcel.this.AV109ErrorMessage;
      CloseOpenCursors();
      AV31ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV34File = "" ;
      AV109ErrorMessage = "" ;
      GXv_int1 = new byte[1] ;
      AV31ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV112Pgmname = "" ;
      AV101Tot_dift = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P08XT2_A396EmprCod = new String[] {""} ;
      P08XT2_A656ParCod = new short[1] ;
      P08XT2_n656ParCod = new boolean[] {false} ;
      P08XT2_A1011TipMaqCod = new String[] {""} ;
      P08XT2_n1011TipMaqCod = new boolean[] {false} ;
      P08XT2_A136BarColNum = new int[1] ;
      P08XT2_A135BarColNom = new String[] {""} ;
      P08XT2_A212BarSer = new String[] {""} ;
      P08XT2_A602MaqCod = new String[] {""} ;
      P08XT2_A556HisProEst = new byte[1] ;
      P08XT2_A461Fase = new String[] {""} ;
      P08XT2_A129BarCod = new int[1] ;
      P08XT2_A132BarCodReo = new byte[1] ;
      P08XT2_A130BarCodPar = new String[] {""} ;
      P08XT2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08XT2_A606MaqDsc = new String[] {""} ;
      P08XT2_n606MaqDsc = new boolean[] {false} ;
      P08XT2_A503GruOpeCod = new int[1] ;
      P08XT2_A3610HisProLot = new String[] {""} ;
      P08XT2_A6399MaqKgsId = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08XT2_n6399MaqKgsId = new boolean[] {false} ;
      P08XT2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08XT2_n4440HisProDTI = new boolean[] {false} ;
      P08XT2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08XT2_n4441HisProDTF = new boolean[] {false} ;
      P08XT2_A563HisProMin = new byte[1] ;
      P08XT2_A560HisProHin = new byte[1] ;
      P08XT2_A562HisProMfi = new byte[1] ;
      P08XT2_A559HisProHfi = new byte[1] ;
      P08XT2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08XT2_A561HisProLin = new int[1] ;
      A1011TipMaqCod = "" ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A602MaqCod = "" ;
      A461Fase = "" ;
      A130BarCodPar = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A606MaqDsc = "" ;
      A3610HisProLot = "" ;
      A6399MaqKgsId = DecimalUtil.ZERO ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A558HisProFec = GXutil.nullDate() ;
      AV104TotKgs = DecimalUtil.ZERO ;
      AV48HisProLot = "" ;
      AV93Sum_kgs = DecimalUtil.ZERO ;
      AV82MaqKgsId = DecimalUtil.ZERO ;
      AV100Tot_dif = DecimalUtil.ZERO ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      AV32FasActTin = "" ;
      GXv_char4 = new String[1] ;
      AV14BarCodPar = "" ;
      AV85MinRea2 = DecimalUtil.ZERO ;
      AV51HmP = DecimalUtil.ZERO ;
      AV50HmF = DecimalUtil.ZERO ;
      AV45Hdr = "" ;
      AV24CliNom = "" ;
      AV43ForSer = "" ;
      AV22BarSerdsc = "" ;
      AV40ForColNom = "" ;
      AV27DifPes = DecimalUtil.ZERO ;
      AV97TiempoNP = DecimalUtil.ZERO ;
      AV102Tot_kgsG = DecimalUtil.ZERO ;
      AV37FlagBH = "" ;
      P08XT3_A396EmprCod = new String[] {""} ;
      P08XT3_A130BarCodPar = new String[] {""} ;
      P08XT3_A132BarCodReo = new byte[1] ;
      P08XT3_A129BarCod = new int[1] ;
      P08XT3_A252CliCod = new int[1] ;
      P08XT3_n252CliCod = new boolean[] {false} ;
      P08XT3_A279CliNom = new String[] {""} ;
      P08XT3_A212BarSer = new String[] {""} ;
      P08XT3_A1652BarSerDsc = new String[] {""} ;
      P08XT3_A135BarColNom = new String[] {""} ;
      P08XT3_A136BarColNum = new int[1] ;
      P08XT3_A218BarTipCol = new byte[1] ;
      A279CliNom = "" ;
      A1652BarSerDsc = "" ;
      P08XT4_A396EmprCod = new String[] {""} ;
      P08XT4_A507HbaBarPar = new String[] {""} ;
      P08XT4_A508HbaBarReo = new byte[1] ;
      P08XT4_A506HbaBarCod = new int[1] ;
      P08XT4_A252CliCod = new int[1] ;
      P08XT4_n252CliCod = new boolean[] {false} ;
      P08XT4_A279CliNom = new String[] {""} ;
      P08XT4_A535HbaSer = new String[] {""} ;
      P08XT4_n535HbaSer = new boolean[] {false} ;
      P08XT4_A2627HbaSerDsc = new String[] {""} ;
      P08XT4_n2627HbaSerDsc = new boolean[] {false} ;
      P08XT4_A509HbaColNom = new String[] {""} ;
      P08XT4_n509HbaColNom = new boolean[] {false} ;
      P08XT4_A510HbaColNum = new int[1] ;
      P08XT4_n510HbaColNum = new boolean[] {false} ;
      P08XT4_A537HbaTipCol = new byte[1] ;
      P08XT4_n537HbaTipCol = new boolean[] {false} ;
      A507HbaBarPar = "" ;
      A535HbaSer = "" ;
      A2627HbaSerDsc = "" ;
      A509HbaColNom = "" ;
      P08XT5_A771ProForTie = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pxprdt10etoexcel__default(),
         new Object[] {
             new Object[] {
            P08XT2_A396EmprCod, P08XT2_A656ParCod, P08XT2_n656ParCod, P08XT2_A1011TipMaqCod, P08XT2_n1011TipMaqCod, P08XT2_A136BarColNum, P08XT2_A135BarColNom, P08XT2_A212BarSer, P08XT2_A602MaqCod, P08XT2_A556HisProEst,
            P08XT2_A461Fase, P08XT2_A129BarCod, P08XT2_A132BarCodReo, P08XT2_A130BarCodPar, P08XT2_A1525HisProKgr, P08XT2_A606MaqDsc, P08XT2_n606MaqDsc, P08XT2_A503GruOpeCod, P08XT2_A3610HisProLot, P08XT2_A6399MaqKgsId,
            P08XT2_n6399MaqKgsId, P08XT2_A4440HisProDTI, P08XT2_n4440HisProDTI, P08XT2_A4441HisProDTF, P08XT2_n4441HisProDTF, P08XT2_A563HisProMin, P08XT2_A560HisProHin, P08XT2_A562HisProMfi, P08XT2_A559HisProHfi, P08XT2_A558HisProFec,
            P08XT2_A561HisProLin
            }
            , new Object[] {
            P08XT3_A396EmprCod, P08XT3_A130BarCodPar, P08XT3_A132BarCodReo, P08XT3_A129BarCod, P08XT3_A252CliCod, P08XT3_n252CliCod, P08XT3_A279CliNom, P08XT3_A212BarSer, P08XT3_A1652BarSerDsc, P08XT3_A135BarColNom,
            P08XT3_A136BarColNum, P08XT3_A218BarTipCol
            }
            , new Object[] {
            P08XT4_A396EmprCod, P08XT4_A507HbaBarPar, P08XT4_A508HbaBarReo, P08XT4_A506HbaBarCod, P08XT4_A252CliCod, P08XT4_n252CliCod, P08XT4_A279CliNom, P08XT4_A535HbaSer, P08XT4_n535HbaSer, P08XT4_A2627HbaSerDsc,
            P08XT4_n2627HbaSerDsc, P08XT4_A509HbaColNom, P08XT4_n509HbaColNom, P08XT4_A510HbaColNum, P08XT4_n510HbaColNum, P08XT4_A537HbaTipCol, P08XT4_n537HbaTipCol
            }
            , new Object[] {
            P08XT5_A771ProForTie
            }
         }
      );
      AV112Pgmname = "PxPrdT10eToExcel" ;
      /* GeneXus formulas. */
      AV112Pgmname = "PxPrdT10eToExcel" ;
      Gx_err = (short)(0) ;
   }

   private byte AV39FlagTiReal ;
   private byte GXv_int1[] ;
   private byte AV25Columna ;
   private byte A556HisProEst ;
   private byte A132BarCodReo ;
   private byte A563HisProMin ;
   private byte A560HisProHin ;
   private byte A562HisProMfi ;
   private byte A559HisProHfi ;
   private byte AV38FlagMarca ;
   private byte AV16BarCodReo ;
   private byte AV84MinRea ;
   private byte AV98TipColCod ;
   private byte AV36FlagBarcad ;
   private byte A218BarTipCol ;
   private byte A508HbaBarReo ;
   private byte A537HbaTipCol ;
   private short AV33Fila ;
   private short A656ParCod ;
   private short A564HisProTre ;
   private short A5605HisProTr2 ;
   private short AV49HisProTre ;
   private short AV55HorRea ;
   private short AV56HorReaint ;
   private short AV96TiempoF ;
   private short AV94Sum_t ;
   private short c771ProForTie ;
   private short Gx_err ;
   private int AV21barcolnumi ;
   private int AV20Barcolnumf ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int A503GruOpeCod ;
   private int A561HisProLin ;
   private int AV105TotMinT ;
   private int AV87NTin ;
   private int AV44Gruopecod ;
   private int AV106TotMinTp ;
   private int AV12BarCod ;
   private int AV41ForColNum ;
   private int AV103Tot_tG ;
   private int AV23CliCod ;
   private int A252CliCod ;
   private int A506HbaBarCod ;
   private int A510HbaColNum ;
   private long AV42ForRgb ;
   private java.math.BigDecimal AV101Tot_dift ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A6399MaqKgsId ;
   private java.math.BigDecimal AV104TotKgs ;
   private java.math.BigDecimal AV93Sum_kgs ;
   private java.math.BigDecimal AV82MaqKgsId ;
   private java.math.BigDecimal AV100Tot_dif ;
   private java.math.BigDecimal AV85MinRea2 ;
   private java.math.BigDecimal AV51HmP ;
   private java.math.BigDecimal AV50HmF ;
   private java.math.BigDecimal AV27DifPes ;
   private java.math.BigDecimal AV97TiempoNP ;
   private java.math.BigDecimal AV102Tot_kgsG ;
   private String A396EmprCod ;
   private String AV91PMaqCod ;
   private String AV108UMaqCod ;
   private String AV99TipMaqCod ;
   private String AV35Filename ;
   private String AV11Artcodi ;
   private String AV10Artcodf ;
   private String AV19barcolnomi ;
   private String AV18barcolnomf ;
   private String AV112Pgmname ;
   private String scmdbuf ;
   private String A1011TipMaqCod ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A602MaqCod ;
   private String A461Fase ;
   private String A130BarCodPar ;
   private String A606MaqDsc ;
   private String A3610HisProLot ;
   private String AV48HisProLot ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String AV32FasActTin ;
   private String GXv_char4[] ;
   private String AV14BarCodPar ;
   private String AV45Hdr ;
   private String AV24CliNom ;
   private String AV43ForSer ;
   private String AV22BarSerdsc ;
   private String AV40ForColNom ;
   private String AV37FlagBH ;
   private String A279CliNom ;
   private String A1652BarSerDsc ;
   private String A507HbaBarPar ;
   private String A535HbaSer ;
   private String A2627HbaSerDsc ;
   private String A509HbaColNom ;
   private java.util.Date AV47Hisprodti ;
   private java.util.Date AV46Hisprodtf ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A558HisProFec ;
   private boolean returnInSub ;
   private boolean brk8XT2 ;
   private boolean n656ParCod ;
   private boolean n1011TipMaqCod ;
   private boolean n606MaqDsc ;
   private boolean n6399MaqKgsId ;
   private boolean n4440HisProDTI ;
   private boolean n4441HisProDTF ;
   private boolean n252CliCod ;
   private boolean n535HbaSer ;
   private boolean n2627HbaSerDsc ;
   private boolean n509HbaColNom ;
   private boolean n510HbaColNum ;
   private boolean n537HbaTipCol ;
   private String AV34File ;
   private String AV109ErrorMessage ;
   private String[] aP15 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private java.util.Date[] aP3 ;
   private java.util.Date[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private int[] aP11 ;
   private int[] aP12 ;
   private String[] aP13 ;
   private String[] aP14 ;
   private IDataStoreProvider pr_default ;
   private String[] P08XT2_A396EmprCod ;
   private short[] P08XT2_A656ParCod ;
   private boolean[] P08XT2_n656ParCod ;
   private String[] P08XT2_A1011TipMaqCod ;
   private boolean[] P08XT2_n1011TipMaqCod ;
   private int[] P08XT2_A136BarColNum ;
   private String[] P08XT2_A135BarColNom ;
   private String[] P08XT2_A212BarSer ;
   private String[] P08XT2_A602MaqCod ;
   private byte[] P08XT2_A556HisProEst ;
   private String[] P08XT2_A461Fase ;
   private int[] P08XT2_A129BarCod ;
   private byte[] P08XT2_A132BarCodReo ;
   private String[] P08XT2_A130BarCodPar ;
   private java.math.BigDecimal[] P08XT2_A1525HisProKgr ;
   private String[] P08XT2_A606MaqDsc ;
   private boolean[] P08XT2_n606MaqDsc ;
   private int[] P08XT2_A503GruOpeCod ;
   private String[] P08XT2_A3610HisProLot ;
   private java.math.BigDecimal[] P08XT2_A6399MaqKgsId ;
   private boolean[] P08XT2_n6399MaqKgsId ;
   private java.util.Date[] P08XT2_A4440HisProDTI ;
   private boolean[] P08XT2_n4440HisProDTI ;
   private java.util.Date[] P08XT2_A4441HisProDTF ;
   private boolean[] P08XT2_n4441HisProDTF ;
   private byte[] P08XT2_A563HisProMin ;
   private byte[] P08XT2_A560HisProHin ;
   private byte[] P08XT2_A562HisProMfi ;
   private byte[] P08XT2_A559HisProHfi ;
   private java.util.Date[] P08XT2_A558HisProFec ;
   private int[] P08XT2_A561HisProLin ;
   private String[] P08XT3_A396EmprCod ;
   private String[] P08XT3_A130BarCodPar ;
   private byte[] P08XT3_A132BarCodReo ;
   private int[] P08XT3_A129BarCod ;
   private int[] P08XT3_A252CliCod ;
   private boolean[] P08XT3_n252CliCod ;
   private String[] P08XT3_A279CliNom ;
   private String[] P08XT3_A212BarSer ;
   private String[] P08XT3_A1652BarSerDsc ;
   private String[] P08XT3_A135BarColNom ;
   private int[] P08XT3_A136BarColNum ;
   private byte[] P08XT3_A218BarTipCol ;
   private String[] P08XT4_A396EmprCod ;
   private String[] P08XT4_A507HbaBarPar ;
   private byte[] P08XT4_A508HbaBarReo ;
   private int[] P08XT4_A506HbaBarCod ;
   private int[] P08XT4_A252CliCod ;
   private boolean[] P08XT4_n252CliCod ;
   private String[] P08XT4_A279CliNom ;
   private String[] P08XT4_A535HbaSer ;
   private boolean[] P08XT4_n535HbaSer ;
   private String[] P08XT4_A2627HbaSerDsc ;
   private boolean[] P08XT4_n2627HbaSerDsc ;
   private String[] P08XT4_A509HbaColNom ;
   private boolean[] P08XT4_n509HbaColNom ;
   private int[] P08XT4_A510HbaColNum ;
   private boolean[] P08XT4_n510HbaColNum ;
   private byte[] P08XT4_A537HbaTipCol ;
   private boolean[] P08XT4_n537HbaTipCol ;
   private short[] P08XT5_A771ProForTie ;
   private com.genexus.gxoffice.ExcelDoc AV31ExcelDocument ;
}

final  class pxprdt10etoexcel__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08XT2", "SELECT T1.EmprCod, T1.ParCod, T2.TipMaqCod, T3.BarColNum, T3.BarColNom, T3.BarSer, T1.MaqCod, T1.HisProEst, T1.Fase, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.HisProKgr, T2.MaqDsc, T1.GruOpeCod, T1.HisProLot, T2.MaqKgsId, T1.HisProDTI, T1.HisProDTF, T1.HisProMin, T1.HisProHin, T1.HisProMfi, T1.HisProHfi, T1.HisProFec, T1.HisProLin FROM ((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.MaqCod >= ?) AND (T1.HisProDTF >= ? and T1.HisProDTF <= ?) AND (T3.BarSer >= ? and T3.BarSer <= ?) AND (T3.BarColNom >= ? and T3.BarColNom <= ?) AND (T3.BarColNum >= ? and T3.BarColNum <= ?) AND (T2.TipMaqCod = ? or (rtrim(?) IS NULL)) AND ((T1.ParCod = 0)) AND (T1.MaqCod <= ?) ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProLot, T1.GruOpeCod, T1.ParCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08XT3", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.CliCod, T2.CliNom, T1.BarSer, T1.BarSerDsc, T1.BarColNom, T1.BarColNum, T1.BarTipCol FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08XT4", "SELECT T1.EmprCod, T1.HbaBarPar, T1.HbaBarReo, T1.HbaBarCod, T1.CliCod, T2.CliNom, T1.HbaSer, T1.HbaSerDsc, T1.HbaColNom, T1.HbaColNum, T1.HbaTipCol FROM (TXPHISBAR T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.HbaBarCod = ? and T1.HbaBarReo = ? and T1.HbaBarPar = ? ORDER BY T1.EmprCod, T1.HbaBarCod, T1.HbaBarReo, T1.HbaBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08XT5", "SELECT SUM(T2.ProForTie) FROM (TXPLFORMU T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 13);
               ((String[]) buf[7])[0] = rslt.getString(6, 16);
               ((String[]) buf[8])[0] = rslt.getString(7, 6);
               ((byte[]) buf[9])[0] = rslt.getByte(8);
               ((String[]) buf[10])[0] = rslt.getString(9, 8);
               ((int[]) buf[11])[0] = rslt.getInt(10);
               ((byte[]) buf[12])[0] = rslt.getByte(11);
               ((String[]) buf[13])[0] = rslt.getString(12, 1);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((String[]) buf[15])[0] = rslt.getString(14, 16);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(15);
               ((String[]) buf[18])[0] = rslt.getString(16, 10);
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(18);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(19);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(20);
               ((byte[]) buf[26])[0] = rslt.getByte(21);
               ((byte[]) buf[27])[0] = rslt.getByte(22);
               ((byte[]) buf[28])[0] = rslt.getByte(23);
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDate(24);
               ((int[]) buf[30])[0] = rslt.getInt(25);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               ((String[]) buf[9])[0] = rslt.getString(9, 13);
               ((int[]) buf[10])[0] = rslt.getInt(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 26);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((int[]) buf[13])[0] = rslt.getInt(10);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(11);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setString(5, (String)parms[4], 16);
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 13);
               stmt.setString(8, (String)parms[7], 13);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setString(11, (String)parms[10], 4);
               stmt.setString(12, (String)parms[11], 4);
               stmt.setString(13, (String)parms[12], 6);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

