package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pxprdt11etoexcel extends GXProcedure
{
   public pxprdt11etoexcel( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pxprdt11etoexcel.class ), "" );
   }

   public pxprdt11etoexcel( int remoteHandle ,
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
                             String[] aP13 )
   {
      pxprdt11etoexcel.this.aP14 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
      return aP14[0];
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
                        String[] aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
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
                             String[] aP14 )
   {
      pxprdt11etoexcel.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pxprdt11etoexcel.this.AV230PMaqCod = aP1[0];
      this.aP1 = aP1;
      pxprdt11etoexcel.this.AV253UMaqCod = aP2[0];
      this.aP2 = aP2;
      pxprdt11etoexcel.this.AV177hISPRODTI = aP3[0];
      this.aP3 = aP3;
      pxprdt11etoexcel.this.AV176hISPRODTF = aP4[0];
      this.aP4 = aP4;
      pxprdt11etoexcel.this.AV243TipMaqCod = aP5[0];
      this.aP5 = aP5;
      pxprdt11etoexcel.this.AV164Filename = aP6[0];
      this.aP6 = aP6;
      pxprdt11etoexcel.this.AV135Artcodi = aP7[0];
      this.aP7 = aP7;
      pxprdt11etoexcel.this.AV134Artcodf = aP8[0];
      this.aP8 = aP8;
      pxprdt11etoexcel.this.AV143Barcolnomi = aP9[0];
      this.aP9 = aP9;
      pxprdt11etoexcel.this.AV142Barcolnomf = aP10[0];
      this.aP10 = aP10;
      pxprdt11etoexcel.this.AV145Barcolnumi = aP11[0];
      this.aP11 = aP11;
      pxprdt11etoexcel.this.AV144Barcolnumf = aP12[0];
      this.aP12 = aP12;
      pxprdt11etoexcel.this.aP13 = aP13;
      pxprdt11etoexcel.this.aP14 = aP14;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV168FlagTiReal ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TIREAL", ""), GXv_int1) ;
      pxprdt11etoexcel.this.AV168FlagTiReal = GXv_int1[0] ;
      AV163File = AV164Filename ;
      AV160ExcelDocument.Open(AV163File);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV160ExcelDocument.Clear();
      AV160ExcelDocument.setAutoFit( (short)(1) );
      AV162Fila = (short)(1) ;
      AV153Columna = (byte)(0) ;
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( httpContext.getMessage( "Periodo", "")+localUtil.ttoc( AV177hISPRODTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")+"-"+localUtil.ttoc( AV176hISPRODTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")+GXutil.format( " [%1]", GXutil.trim( AV257Pgmname), "", "", "", "", "", "", "", "") );
      AV162Fila = (short)(AV162Fila+1) ;
      AV153Columna = (byte)(0) ;
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( httpContext.getMessage( "Maquina", "") );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( httpContext.getMessage( "Hdr", "") );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( httpContext.getMessage( "Cliente", "") );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( httpContext.getMessage( "Articulo", "") );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( httpContext.getMessage( "Color", "") );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( httpContext.getMessage( "Numero", "") );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( httpContext.getMessage( "Tc", "") );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( httpContext.getMessage( "Intensidad", "") );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( httpContext.getMessage( "Kgs", "") );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( httpContext.getMessage( "Horas Prod.", "") );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( httpContext.getMessage( "Horas Teoricas", "") );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( httpContext.getMessage( "Desvio Horas", "") );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( httpContext.getMessage( "Proceso", "") );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( httpContext.getMessage( "Receta", "") );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( httpContext.getMessage( "Lote", "") );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( httpContext.getMessage( "Partidas", "") );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( httpContext.getMessage( "Fin", "") );
      AV171ForRgb = 0 ;
      AV245Tot_dift = DecimalUtil.doubleToDec(0) ;
      AV227Num_pt = 0 ;
      AV225NTin = 0 ;
      /* Using cursor P08XU2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV230PMaqCod, AV177hISPRODTI, AV176hISPRODTF, AV243TipMaqCod, AV243TipMaqCod, AV135Artcodi, AV134Artcodf, AV143Barcolnomi, AV142Barcolnomf, Integer.valueOf(AV145Barcolnumi), Integer.valueOf(AV144Barcolnumf), AV253UMaqCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk8XU2 = false ;
         A656ParCod = P08XU2_A656ParCod[0] ;
         n656ParCod = P08XU2_n656ParCod[0] ;
         A1011TipMaqCod = P08XU2_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P08XU2_n1011TipMaqCod[0] ;
         A136BarColNum = P08XU2_A136BarColNum[0] ;
         A135BarColNom = P08XU2_A135BarColNom[0] ;
         A212BarSer = P08XU2_A212BarSer[0] ;
         A4441HisProDTF = P08XU2_A4441HisProDTF[0] ;
         n4441HisProDTF = P08XU2_n4441HisProDTF[0] ;
         A602MaqCod = P08XU2_A602MaqCod[0] ;
         A3610HisProLot = P08XU2_A3610HisProLot[0] ;
         A1525HisProKgr = P08XU2_A1525HisProKgr[0] ;
         A130BarCodPar = P08XU2_A130BarCodPar[0] ;
         A132BarCodReo = P08XU2_A132BarCodReo[0] ;
         A129BarCod = P08XU2_A129BarCod[0] ;
         A6680HisproTdab = P08XU2_A6680HisproTdab[0] ;
         A4440HisProDTI = P08XU2_A4440HisProDTI[0] ;
         n4440HisProDTI = P08XU2_n4440HisProDTI[0] ;
         A606MaqDsc = P08XU2_A606MaqDsc[0] ;
         n606MaqDsc = P08XU2_n606MaqDsc[0] ;
         A561HisProLin = P08XU2_A561HisProLin[0] ;
         A558HisProFec = P08XU2_A558HisProFec[0] ;
         A6399MaqKgsId = P08XU2_A6399MaqKgsId[0] ;
         n6399MaqKgsId = P08XU2_n6399MaqKgsId[0] ;
         A1011TipMaqCod = P08XU2_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P08XU2_n1011TipMaqCod[0] ;
         A606MaqDsc = P08XU2_A606MaqDsc[0] ;
         n606MaqDsc = P08XU2_n606MaqDsc[0] ;
         A6399MaqKgsId = P08XU2_A6399MaqKgsId[0] ;
         n6399MaqKgsId = P08XU2_n6399MaqKgsId[0] ;
         A136BarColNum = P08XU2_A136BarColNum[0] ;
         A135BarColNom = P08XU2_A135BarColNom[0] ;
         A212BarSer = P08XU2_A212BarSer[0] ;
         AV249TotKgs = DecimalUtil.doubleToDec(0) ;
         AV250TotMinT = 0 ;
         AV226Num_p = 0 ;
         AV178HisProLot = "" ;
         AV173Gruopecod = 0 ;
         AV251TotMinTp = 0 ;
         AV235Sum_kgs = DecimalUtil.doubleToDec(0) ;
         AV220MaqKgsId = A6399MaqKgsId ;
         AV244Tot_dif = DecimalUtil.doubleToDec(0) ;
         AV247Tot_teo = 0 ;
         AV180HisProTre = (short)(0) ;
         AV193Last_kgs = DecimalUtil.doubleToDec(0) ;
         AV192Kgs_hdr = DecimalUtil.doubleToDec(0) ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08XU2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08XU2_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk8XU2 = false ;
            A656ParCod = P08XU2_A656ParCod[0] ;
            n656ParCod = P08XU2_n656ParCod[0] ;
            A1011TipMaqCod = P08XU2_A1011TipMaqCod[0] ;
            n1011TipMaqCod = P08XU2_n1011TipMaqCod[0] ;
            A136BarColNum = P08XU2_A136BarColNum[0] ;
            A135BarColNom = P08XU2_A135BarColNom[0] ;
            A212BarSer = P08XU2_A212BarSer[0] ;
            A4441HisProDTF = P08XU2_A4441HisProDTF[0] ;
            n4441HisProDTF = P08XU2_n4441HisProDTF[0] ;
            A3610HisProLot = P08XU2_A3610HisProLot[0] ;
            A1525HisProKgr = P08XU2_A1525HisProKgr[0] ;
            A130BarCodPar = P08XU2_A130BarCodPar[0] ;
            A132BarCodReo = P08XU2_A132BarCodReo[0] ;
            A129BarCod = P08XU2_A129BarCod[0] ;
            A6680HisproTdab = P08XU2_A6680HisproTdab[0] ;
            A4440HisProDTI = P08XU2_A4440HisProDTI[0] ;
            n4440HisProDTI = P08XU2_n4440HisProDTI[0] ;
            A606MaqDsc = P08XU2_A606MaqDsc[0] ;
            n606MaqDsc = P08XU2_n606MaqDsc[0] ;
            A561HisProLin = P08XU2_A561HisProLin[0] ;
            A558HisProFec = P08XU2_A558HisProFec[0] ;
            A1011TipMaqCod = P08XU2_A1011TipMaqCod[0] ;
            n1011TipMaqCod = P08XU2_n1011TipMaqCod[0] ;
            A606MaqDsc = P08XU2_A606MaqDsc[0] ;
            n606MaqDsc = P08XU2_n606MaqDsc[0] ;
            A136BarColNum = P08XU2_A136BarColNum[0] ;
            A135BarColNom = P08XU2_A135BarColNom[0] ;
            A212BarSer = P08XU2_A212BarSer[0] ;
            if ( ( GXutil.strcmp(A602MaqCod, AV230PMaqCod) >= 0 ) && ( GXutil.strcmp(A602MaqCod, AV253UMaqCod) <= 0 ) )
            {
               if ( ( GXutil.strcmp(A212BarSer, AV135Artcodi) >= 0 ) && ( GXutil.strcmp(A212BarSer, AV134Artcodf) <= 0 ) )
               {
                  if ( ( GXutil.strcmp(A135BarColNom, AV143Barcolnomi) >= 0 ) && ( GXutil.strcmp(A135BarColNom, AV142Barcolnomf) <= 0 ) )
                  {
                     if ( ( A136BarColNum >= AV145Barcolnumi ) && ( A136BarColNum <= AV144Barcolnumf ) )
                     {
                        if ( ( GXutil.strcmp(A1011TipMaqCod, AV243TipMaqCod) == 0 ) || (GXutil.strcmp("", AV243TipMaqCod)==0) )
                        {
                           if ( (( A4441HisProDTF.after( AV177hISPRODTI ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV177hISPRODTI) )) && (( A4441HisProDTF.before( AV176hISPRODTF ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV176hISPRODTF) )) )
                           {
                              if ( (0==A656ParCod) )
                              {
                                 if ( ( GXutil.strcmp(AV178HisProLot, A3610HisProLot) != 0 ) && ! (GXutil.strcmp("", AV178HisProLot)==0) )
                                 {
                                    AV225NTin = (int)(AV225NTin+1) ;
                                    AV226Num_p = (int)(AV226Num_p+1) ;
                                    AV227Num_pt = (int)(AV227Num_pt+1) ;
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
                                    AV193Last_kgs = A1525HisProKgr ;
                                    AV192Kgs_hdr = A1525HisProKgr ;
                                    AV180HisProTre = (short)(0) ;
                                 }
                                 AV175Hdr_m = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
                                 AV179HisproTdab = (short)(0) ;
                                 if ( A6680HisproTdab > 0 )
                                 {
                                    if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
                                    {
                                       AV179HisproTdab = (short)(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)) ;
                                    }
                                 }
                                 AV180HisProTre = (short)(AV180HisProTre+AV179HisproTdab) ;
                                 if ( DecimalUtil.compareTo(AV193Last_kgs, A1525HisProKgr) != 0 )
                                 {
                                    AV192Kgs_hdr = AV192Kgs_hdr.add(A1525HisProKgr) ;
                                 }
                                 if ( GXutil.strcmp(AV175Hdr_m, A3610HisProLot) == 0 )
                                 {
                                    AV136BarCod = A129BarCod ;
                                    AV140BarCodReo = A132BarCodReo ;
                                    AV138BarCodPar = A130BarCodPar ;
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
                                    AV218Maqcod_v = A602MaqCod ;
                                    AV219MaqDsc_v = A606MaqDsc ;
                                    AV174Hdr = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
                                    AV150Clinom_v = AV149CliNom ;
                                    AV146Barser_v = AV172ForSer ;
                                    AV233Serdsc_v = AV147BarSerdsc ;
                                    AV151ColNom_v = AV169ForColNom ;
                                    AV152Colnum_v = AV170ForColNum ;
                                    AV237Tc_v = AV242TipColCod ;
                                    AV191Kgr_v = AV192Kgs_hdr ;
                                    AV190intdsc_v = AV189Intdsc ;
                                 }
                                 AV178HisProLot = A3610HisProLot ;
                                 AV193Last_kgs = A1525HisProKgr ;
                              }
                           }
                        }
                     }
                  }
               }
            }
            brk8XU2 = true ;
            pr_default.readNext(0);
         }
         AV225NTin = (int)(AV225NTin+1) ;
         AV226Num_p = (int)(AV226Num_p+1) ;
         AV227Num_pt = (int)(AV227Num_pt+1) ;
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
         AV186HorRea = (short)(GXutil.Int( AV250TotMinT/ (double) (60))) ;
         AV187HorReaint = (short)(GXutil.Int( AV186HorRea)) ;
         AV222MinRea = (byte)(AV250TotMinT-(AV187HorReaint*60)) ;
         AV223MinRea2 = DecimalUtil.doubleToDec(AV222MinRea/ (double) (100)) ;
         AV182HmP = DecimalUtil.doubleToDec(AV187HorReaint).add(AV223MinRea2) ;
         AV241TiempoNP = DecimalUtil.doubleToDec(0) ;
         if ( ! (0==AV225NTin) )
         {
            AV241TiempoNP = AV182HmP.divide(DecimalUtil.doubleToDec(AV225NTin), 18, java.math.RoundingMode.DOWN) ;
         }
         AV162Fila = (short)(AV162Fila+1) ;
         AV153Columna = (byte)(9) ;
         AV153Columna = (byte)(AV153Columna+1) ;
         AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( "Kgs" );
         AV153Columna = (byte)(AV153Columna+1) ;
         AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( httpContext.getMessage( "Partidas", "") );
         AV162Fila = (short)(AV162Fila+1) ;
         AV153Columna = (byte)(9) ;
         AV153Columna = (byte)(AV153Columna+1) ;
         AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( "Total" );
         AV153Columna = (byte)(AV153Columna+1) ;
         AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV249TotKgs)) );
         Gx_msg = httpContext.getMessage( "Partidas ", "") + GXutil.str( AV226Num_p, 6, 0) ;
         Gx_msg = GXutil.trim( Gx_msg) ;
         AV153Columna = (byte)(AV153Columna+1) ;
         AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( GXutil.trim( GXutil.str( AV226Num_p, 6, 0)) );
         AV239TiemM_p = 0 ;
         if ( AV226Num_p > 0 )
         {
            AV239TiemM_p = (int)(AV250TotMinT/ (double) (AV226Num_p)) ;
         }
         AV162Fila = (short)(AV162Fila+1) ;
         AV153Columna = (byte)(9) ;
         AV186HorRea = (short)(GXutil.Int( AV239TiemM_p/ (double) (60))) ;
         AV187HorReaint = (short)(GXutil.Int( AV186HorRea)) ;
         AV222MinRea = (byte)(AV239TiemM_p-(AV187HorReaint*60)) ;
         AV223MinRea2 = DecimalUtil.doubleToDec(AV222MinRea/ (double) (100)) ;
         AV182HmP = DecimalUtil.doubleToDec(AV187HorReaint).add(AV223MinRea2) ;
         Gx_msg = httpContext.getMessage( "Tiempo Medio p/partida ", "") ;
         AV153Columna = (byte)(AV153Columna+1) ;
         AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( Gx_msg );
         AV153Columna = (byte)(AV153Columna+1) ;
         AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV182HmP)) );
         AV239TiemM_p = 0 ;
         if ( AV226Num_p > 0 )
         {
            AV239TiemM_p = (int)(AV247Tot_teo/ (double) (AV226Num_p)) ;
         }
         AV186HorRea = (short)(GXutil.Int( AV239TiemM_p/ (double) (60))) ;
         AV187HorReaint = (short)(GXutil.Int( AV186HorRea)) ;
         AV222MinRea = (byte)(AV239TiemM_p-(AV187HorReaint*60)) ;
         AV223MinRea2 = DecimalUtil.doubleToDec(AV222MinRea/ (double) (100)) ;
         AV182HmP = DecimalUtil.doubleToDec(AV187HorReaint).add(AV223MinRea2) ;
         AV153Columna = (byte)(AV153Columna+1) ;
         AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV182HmP)) );
         if ( ! brk8XU2 )
         {
            brk8XU2 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      AV162Fila = (short)(AV162Fila+1) ;
      AV160ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV160ExcelDocument.Close();
      cleanup();
   }

   public void S111( )
   {
      /* 'IMP_LINEA' Routine */
      returnInSub = false ;
      AV162Fila = (short)(AV162Fila+1) ;
      AV153Columna = (byte)(0) ;
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( AV218Maqcod_v );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( AV219MaqDsc_v );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( AV174Hdr );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( AV150Clinom_v );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( AV146Barser_v );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( AV233Serdsc_v );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( AV151ColNom_v );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setNumber( AV152Colnum_v );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setNumber( AV237Tc_v );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( AV190intdsc_v );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV192Kgs_hdr)) );
      AV249TotKgs = AV249TotKgs.add(AV192Kgs_hdr) ;
      AV186HorRea = (short)(GXutil.Int( AV180HisProTre/ (double) (60))) ;
      AV187HorReaint = (short)(GXutil.Int( AV186HorRea)) ;
      AV222MinRea = (byte)(AV180HisProTre-(AV187HorReaint*60)) ;
      AV223MinRea2 = DecimalUtil.doubleToDec(AV222MinRea/ (double) (100)) ;
      AV182HmP = DecimalUtil.doubleToDec(AV187HorReaint).add(AV223MinRea2) ;
      AV186HorRea = (short)(GXutil.Int( AV240TiempoF/ (double) (60))) ;
      AV187HorReaint = (short)(GXutil.Int( AV186HorRea)) ;
      AV222MinRea = (byte)(AV240TiempoF-(AV187HorReaint*60)) ;
      AV223MinRea2 = DecimalUtil.doubleToDec(AV222MinRea/ (double) (100)) ;
      AV181HmF = DecimalUtil.doubleToDec(AV187HorReaint).add(AV223MinRea2) ;
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV182HmP)) );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV181HmF)) );
      AV155Desvio_m = (int)(AV180HisProTre-AV240TiempoF) ;
      AV186HorRea = (short)(GXutil.Int( AV155Desvio_m/ (double) (60))) ;
      AV187HorReaint = (short)(GXutil.Int( AV186HorRea)) ;
      AV222MinRea = (byte)(AV155Desvio_m-(AV187HorReaint*60)) ;
      AV223MinRea2 = DecimalUtil.doubleToDec(AV222MinRea/ (double) (100)) ;
      AV154Desvio_h = DecimalUtil.doubleToDec(AV187HorReaint).add(AV223MinRea2) ;
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV154Desvio_h)) );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( AV231Proforcod );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setNumber( AV232ProNumRec );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setText( AV178HisProLot );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setNumber( AV226Num_p );
      AV153Columna = (byte)(AV153Columna+1) ;
      AV160ExcelDocument.setDateFormat(localUtil, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ");
      AV160ExcelDocument.Cells(AV162Fila, AV153Columna, 1, 1).setDate( A4441HisProDTF );
      AV246Tot_kgsG = AV246Tot_kgsG.add(AV192Kgs_hdr) ;
      AV248Tot_tG = (int)(AV248Tot_tG+AV180HisProTre) ;
      AV250TotMinT = (int)(AV250TotMinT+AV180HisProTre) ;
      AV247Tot_teo = (int)(AV247Tot_teo+AV240TiempoF) ;
      AV235Sum_kgs = AV235Sum_kgs.add(AV249TotKgs) ;
      AV236Sum_t = (short)(AV236Sum_t+AV180HisProTre) ;
      AV251TotMinTp = (int)(AV251TotMinTp+AV180HisProTre) ;
   }

   public void S121( )
   {
      /* 'LEOHDR' Routine */
      returnInSub = false ;
      AV148CliCod = 999999 ;
      AV149CliNom = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" ;
      AV172ForSer = "XXXXXXXXXXXXXXXX" ;
      AV147BarSerdsc = "XXXXXXXXXXXXXXXXXXXXXXXXXX" ;
      AV169ForColNom = "XXXXXXXXXXXXX" ;
      AV170ForColNum = 999999 ;
      AV242TipColCod = (byte)(99) ;
      AV165FlagBarcad = (byte)(0) ;
      AV166FlagBH = "X" ;
      AV189Intdsc = "" ;
      /* Using cursor P08XU3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV136BarCod), Byte.valueOf(AV140BarCodReo), AV138BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P08XU3_A130BarCodPar[0] ;
         A132BarCodReo = P08XU3_A132BarCodReo[0] ;
         A129BarCod = P08XU3_A129BarCod[0] ;
         A252CliCod = P08XU3_A252CliCod[0] ;
         n252CliCod = P08XU3_n252CliCod[0] ;
         A279CliNom = P08XU3_A279CliNom[0] ;
         A212BarSer = P08XU3_A212BarSer[0] ;
         A1652BarSerDsc = P08XU3_A1652BarSerDsc[0] ;
         A135BarColNom = P08XU3_A135BarColNom[0] ;
         A136BarColNum = P08XU3_A136BarColNum[0] ;
         A218BarTipCol = P08XU3_A218BarTipCol[0] ;
         A279CliNom = P08XU3_A279CliNom[0] ;
         AV165FlagBarcad = (byte)(1) ;
         AV166FlagBH = httpContext.getMessage( "B", "") ;
         AV148CliCod = A252CliCod ;
         AV149CliNom = A279CliNom ;
         AV172ForSer = A212BarSer ;
         AV147BarSerdsc = A1652BarSerDsc ;
         AV169ForColNom = A135BarColNom ;
         AV170ForColNum = A136BarColNum ;
         AV242TipColCod = A218BarTipCol ;
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
      if ( AV165FlagBarcad == 0 )
      {
         /* Using cursor P08XU4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV136BarCod), Byte.valueOf(AV140BarCodReo), AV138BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A507HbaBarPar = P08XU4_A507HbaBarPar[0] ;
            A508HbaBarReo = P08XU4_A508HbaBarReo[0] ;
            A506HbaBarCod = P08XU4_A506HbaBarCod[0] ;
            A252CliCod = P08XU4_A252CliCod[0] ;
            n252CliCod = P08XU4_n252CliCod[0] ;
            A279CliNom = P08XU4_A279CliNom[0] ;
            A535HbaSer = P08XU4_A535HbaSer[0] ;
            n535HbaSer = P08XU4_n535HbaSer[0] ;
            A2627HbaSerDsc = P08XU4_A2627HbaSerDsc[0] ;
            n2627HbaSerDsc = P08XU4_n2627HbaSerDsc[0] ;
            A509HbaColNom = P08XU4_A509HbaColNom[0] ;
            n509HbaColNom = P08XU4_n509HbaColNom[0] ;
            A510HbaColNum = P08XU4_A510HbaColNum[0] ;
            n510HbaColNum = P08XU4_n510HbaColNum[0] ;
            A537HbaTipCol = P08XU4_A537HbaTipCol[0] ;
            n537HbaTipCol = P08XU4_n537HbaTipCol[0] ;
            A279CliNom = P08XU4_A279CliNom[0] ;
            AV166FlagBH = httpContext.getMessage( "H", "") ;
            AV148CliCod = A252CliCod ;
            AV149CliNom = A279CliNom ;
            AV172ForSer = A535HbaSer ;
            AV147BarSerdsc = A2627HbaSerDsc ;
            AV169ForColNom = A509HbaColNom ;
            AV170ForColNum = A510HbaColNum ;
            AV242TipColCod = A537HbaTipCol ;
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
      AV240TiempoF = (short)(0) ;
      AV231Proforcod = " " ;
      AV232ProNumRec = 0 ;
      /* Using cursor P08XU5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV148CliCod), AV172ForSer, AV169ForColNom, Integer.valueOf(AV170ForColNum), Byte.valueOf(AV242TipColCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A583IntCod = P08XU5_A583IntCod[0] ;
         A831TipColCod = P08XU5_A831TipColCod[0] ;
         A483ForColNum = P08XU5_A483ForColNum[0] ;
         A482ForColNom = P08XU5_A482ForColNom[0] ;
         A494ForSer = P08XU5_A494ForSer[0] ;
         A252CliCod = P08XU5_A252CliCod[0] ;
         n252CliCod = P08XU5_n252CliCod[0] ;
         A771ProForTie = P08XU5_A771ProForTie[0] ;
         A764ProForCod = P08XU5_A764ProForCod[0] ;
         A2393ProNumRec = P08XU5_A2393ProNumRec[0] ;
         A584IntDsc = P08XU5_A584IntDsc[0] ;
         n584IntDsc = P08XU5_n584IntDsc[0] ;
         A1160ProForL = P08XU5_A1160ProForL[0] ;
         A771ProForTie = P08XU5_A771ProForTie[0] ;
         A2393ProNumRec = P08XU5_A2393ProNumRec[0] ;
         A583IntCod = P08XU5_A583IntCod[0] ;
         A584IntDsc = P08XU5_A584IntDsc[0] ;
         n584IntDsc = P08XU5_n584IntDsc[0] ;
         AV240TiempoF = (short)(AV240TiempoF+A771ProForTie) ;
         AV231Proforcod = A764ProForCod ;
         AV232ProNumRec = A2393ProNumRec ;
         AV189Intdsc = A584IntDsc ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
      /* Using cursor P08XU6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV136BarCod), Byte.valueOf(AV140BarCodReo), AV138BarCodPar});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A6039RecAcab = P08XU6_A6039RecAcab[0] ;
         n6039RecAcab = P08XU6_n6039RecAcab[0] ;
         A130BarCodPar = P08XU6_A130BarCodPar[0] ;
         A132BarCodReo = P08XU6_A132BarCodReo[0] ;
         A129BarCod = P08XU6_A129BarCod[0] ;
         A2804RecLinMaq = P08XU6_A2804RecLinMaq[0] ;
         if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "N", "")) == 0 )
         {
            AV240TiempoF = (short)(0) ;
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
      /* Using cursor P08XU7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV136BarCod), Byte.valueOf(AV140BarCodReo), AV138BarCodPar});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A6039RecAcab = P08XU7_A6039RecAcab[0] ;
         n6039RecAcab = P08XU7_n6039RecAcab[0] ;
         A130BarCodPar = P08XU7_A130BarCodPar[0] ;
         A132BarCodReo = P08XU7_A132BarCodReo[0] ;
         A129BarCod = P08XU7_A129BarCod[0] ;
         A771ProForTie = P08XU7_A771ProForTie[0] ;
         A764ProForCod = P08XU7_A764ProForCod[0] ;
         A2393ProNumRec = P08XU7_A2393ProNumRec[0] ;
         A1273RecLinPro = P08XU7_A1273RecLinPro[0] ;
         A2804RecLinMaq = P08XU7_A2804RecLinMaq[0] ;
         A771ProForTie = P08XU7_A771ProForTie[0] ;
         A2393ProNumRec = P08XU7_A2393ProNumRec[0] ;
         A6039RecAcab = P08XU7_A6039RecAcab[0] ;
         n6039RecAcab = P08XU7_n6039RecAcab[0] ;
         if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "N", "")) == 0 )
         {
            AV240TiempoF = (short)(AV240TiempoF+A771ProForTie) ;
            AV231Proforcod = A764ProForCod ;
            AV232ProNumRec = A2393ProNumRec ;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
      /* Using cursor P08XU8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV136BarCod), Byte.valueOf(AV140BarCodReo), AV138BarCodPar});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A4494HreBarPar = P08XU8_A4494HreBarPar[0] ;
         A4493HreBarReo = P08XU8_A4493HreBarReo[0] ;
         A4492HreBarCod = P08XU8_A4492HreBarCod[0] ;
         A4545HreLinMaq = P08XU8_A4545HreLinMaq[0] ;
         A4495HreNumCie = P08XU8_A4495HreNumCie[0] ;
         AV240TiempoF = (short)(0) ;
         pr_default.readNext(6);
      }
      pr_default.close(6);
      /* Using cursor P08XU9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV136BarCod), Byte.valueOf(AV140BarCodReo), AV138BarCodPar});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A4494HreBarPar = P08XU9_A4494HreBarPar[0] ;
         A4493HreBarReo = P08XU9_A4493HreBarReo[0] ;
         A4492HreBarCod = P08XU9_A4492HreBarCod[0] ;
         A4553HreProTie = P08XU9_A4553HreProTie[0] ;
         A4551HreProCod = P08XU9_A4551HreProCod[0] ;
         A4556HreNumRec = P08XU9_A4556HreNumRec[0] ;
         A4550HreLinPro = P08XU9_A4550HreLinPro[0] ;
         A4545HreLinMaq = P08XU9_A4545HreLinMaq[0] ;
         A4495HreNumCie = P08XU9_A4495HreNumCie[0] ;
         AV240TiempoF = (short)(AV240TiempoF+A4553HreProTie) ;
         AV231Proforcod = A4551HreProCod ;
         AV232ProNumRec = A4556HreNumRec ;
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S141( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV160ExcelDocument.getErrCode() != 0 )
      {
         AV163File = "" ;
         AV254ErrorMessage = AV160ExcelDocument.getErrDescription() ;
         AV160ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pxprdt11etoexcel.this.A396EmprCod;
      this.aP1[0] = pxprdt11etoexcel.this.AV230PMaqCod;
      this.aP2[0] = pxprdt11etoexcel.this.AV253UMaqCod;
      this.aP3[0] = pxprdt11etoexcel.this.AV177hISPRODTI;
      this.aP4[0] = pxprdt11etoexcel.this.AV176hISPRODTF;
      this.aP5[0] = pxprdt11etoexcel.this.AV243TipMaqCod;
      this.aP6[0] = pxprdt11etoexcel.this.AV164Filename;
      this.aP7[0] = pxprdt11etoexcel.this.AV135Artcodi;
      this.aP8[0] = pxprdt11etoexcel.this.AV134Artcodf;
      this.aP9[0] = pxprdt11etoexcel.this.AV143Barcolnomi;
      this.aP10[0] = pxprdt11etoexcel.this.AV142Barcolnomf;
      this.aP11[0] = pxprdt11etoexcel.this.AV145Barcolnumi;
      this.aP12[0] = pxprdt11etoexcel.this.AV144Barcolnumf;
      this.aP13[0] = pxprdt11etoexcel.this.AV163File;
      this.aP14[0] = pxprdt11etoexcel.this.AV254ErrorMessage;
      CloseOpenCursors();
      AV160ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV163File = "" ;
      AV254ErrorMessage = "" ;
      GXv_int1 = new byte[1] ;
      AV160ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV257Pgmname = "" ;
      AV245Tot_dift = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P08XU2_A396EmprCod = new String[] {""} ;
      P08XU2_A656ParCod = new short[1] ;
      P08XU2_n656ParCod = new boolean[] {false} ;
      P08XU2_A1011TipMaqCod = new String[] {""} ;
      P08XU2_n1011TipMaqCod = new boolean[] {false} ;
      P08XU2_A136BarColNum = new int[1] ;
      P08XU2_A135BarColNom = new String[] {""} ;
      P08XU2_A212BarSer = new String[] {""} ;
      P08XU2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08XU2_n4441HisProDTF = new boolean[] {false} ;
      P08XU2_A602MaqCod = new String[] {""} ;
      P08XU2_A3610HisProLot = new String[] {""} ;
      P08XU2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08XU2_A130BarCodPar = new String[] {""} ;
      P08XU2_A132BarCodReo = new byte[1] ;
      P08XU2_A129BarCod = new int[1] ;
      P08XU2_A6680HisproTdab = new short[1] ;
      P08XU2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08XU2_n4440HisProDTI = new boolean[] {false} ;
      P08XU2_A606MaqDsc = new String[] {""} ;
      P08XU2_n606MaqDsc = new boolean[] {false} ;
      P08XU2_A561HisProLin = new int[1] ;
      P08XU2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08XU2_A6399MaqKgsId = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08XU2_n6399MaqKgsId = new boolean[] {false} ;
      A1011TipMaqCod = "" ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A602MaqCod = "" ;
      A3610HisProLot = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A606MaqDsc = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A6399MaqKgsId = DecimalUtil.ZERO ;
      AV249TotKgs = DecimalUtil.ZERO ;
      AV178HisProLot = "" ;
      AV235Sum_kgs = DecimalUtil.ZERO ;
      AV220MaqKgsId = DecimalUtil.ZERO ;
      AV244Tot_dif = DecimalUtil.ZERO ;
      AV193Last_kgs = DecimalUtil.ZERO ;
      AV192Kgs_hdr = DecimalUtil.ZERO ;
      AV175Hdr_m = "" ;
      AV138BarCodPar = "" ;
      AV218Maqcod_v = "" ;
      AV219MaqDsc_v = "" ;
      AV174Hdr = "" ;
      AV150Clinom_v = "" ;
      AV149CliNom = "" ;
      AV146Barser_v = "" ;
      AV172ForSer = "" ;
      AV233Serdsc_v = "" ;
      AV147BarSerdsc = "" ;
      AV151ColNom_v = "" ;
      AV169ForColNom = "" ;
      AV191Kgr_v = DecimalUtil.ZERO ;
      AV190intdsc_v = "" ;
      AV189Intdsc = "" ;
      AV223MinRea2 = DecimalUtil.ZERO ;
      AV182HmP = DecimalUtil.ZERO ;
      AV241TiempoNP = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      AV181HmF = DecimalUtil.ZERO ;
      AV154Desvio_h = DecimalUtil.ZERO ;
      AV231Proforcod = "" ;
      AV246Tot_kgsG = DecimalUtil.ZERO ;
      AV166FlagBH = "" ;
      P08XU3_A396EmprCod = new String[] {""} ;
      P08XU3_A130BarCodPar = new String[] {""} ;
      P08XU3_A132BarCodReo = new byte[1] ;
      P08XU3_A129BarCod = new int[1] ;
      P08XU3_A252CliCod = new int[1] ;
      P08XU3_n252CliCod = new boolean[] {false} ;
      P08XU3_A279CliNom = new String[] {""} ;
      P08XU3_A212BarSer = new String[] {""} ;
      P08XU3_A1652BarSerDsc = new String[] {""} ;
      P08XU3_A135BarColNom = new String[] {""} ;
      P08XU3_A136BarColNum = new int[1] ;
      P08XU3_A218BarTipCol = new byte[1] ;
      A279CliNom = "" ;
      A1652BarSerDsc = "" ;
      P08XU4_A396EmprCod = new String[] {""} ;
      P08XU4_A507HbaBarPar = new String[] {""} ;
      P08XU4_A508HbaBarReo = new byte[1] ;
      P08XU4_A506HbaBarCod = new int[1] ;
      P08XU4_A252CliCod = new int[1] ;
      P08XU4_n252CliCod = new boolean[] {false} ;
      P08XU4_A279CliNom = new String[] {""} ;
      P08XU4_A535HbaSer = new String[] {""} ;
      P08XU4_n535HbaSer = new boolean[] {false} ;
      P08XU4_A2627HbaSerDsc = new String[] {""} ;
      P08XU4_n2627HbaSerDsc = new boolean[] {false} ;
      P08XU4_A509HbaColNom = new String[] {""} ;
      P08XU4_n509HbaColNom = new boolean[] {false} ;
      P08XU4_A510HbaColNum = new int[1] ;
      P08XU4_n510HbaColNum = new boolean[] {false} ;
      P08XU4_A537HbaTipCol = new byte[1] ;
      P08XU4_n537HbaTipCol = new boolean[] {false} ;
      A507HbaBarPar = "" ;
      A535HbaSer = "" ;
      A2627HbaSerDsc = "" ;
      A509HbaColNom = "" ;
      P08XU5_A583IntCod = new byte[1] ;
      P08XU5_A396EmprCod = new String[] {""} ;
      P08XU5_A831TipColCod = new byte[1] ;
      P08XU5_A483ForColNum = new int[1] ;
      P08XU5_A482ForColNom = new String[] {""} ;
      P08XU5_A494ForSer = new String[] {""} ;
      P08XU5_A252CliCod = new int[1] ;
      P08XU5_n252CliCod = new boolean[] {false} ;
      P08XU5_A771ProForTie = new short[1] ;
      P08XU5_A764ProForCod = new String[] {""} ;
      P08XU5_A2393ProNumRec = new int[1] ;
      P08XU5_A584IntDsc = new String[] {""} ;
      P08XU5_n584IntDsc = new boolean[] {false} ;
      P08XU5_A1160ProForL = new short[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A764ProForCod = "" ;
      A584IntDsc = "" ;
      P08XU6_A396EmprCod = new String[] {""} ;
      P08XU6_A6039RecAcab = new String[] {""} ;
      P08XU6_n6039RecAcab = new boolean[] {false} ;
      P08XU6_A130BarCodPar = new String[] {""} ;
      P08XU6_A132BarCodReo = new byte[1] ;
      P08XU6_A129BarCod = new int[1] ;
      P08XU6_A2804RecLinMaq = new short[1] ;
      A6039RecAcab = "" ;
      P08XU7_A396EmprCod = new String[] {""} ;
      P08XU7_A6039RecAcab = new String[] {""} ;
      P08XU7_n6039RecAcab = new boolean[] {false} ;
      P08XU7_A130BarCodPar = new String[] {""} ;
      P08XU7_A132BarCodReo = new byte[1] ;
      P08XU7_A129BarCod = new int[1] ;
      P08XU7_A771ProForTie = new short[1] ;
      P08XU7_A764ProForCod = new String[] {""} ;
      P08XU7_A2393ProNumRec = new int[1] ;
      P08XU7_A1273RecLinPro = new byte[1] ;
      P08XU7_A2804RecLinMaq = new short[1] ;
      P08XU8_A396EmprCod = new String[] {""} ;
      P08XU8_A4494HreBarPar = new String[] {""} ;
      P08XU8_A4493HreBarReo = new byte[1] ;
      P08XU8_A4492HreBarCod = new int[1] ;
      P08XU8_A4545HreLinMaq = new short[1] ;
      P08XU8_A4495HreNumCie = new byte[1] ;
      A4494HreBarPar = "" ;
      P08XU9_A396EmprCod = new String[] {""} ;
      P08XU9_A4494HreBarPar = new String[] {""} ;
      P08XU9_A4493HreBarReo = new byte[1] ;
      P08XU9_A4492HreBarCod = new int[1] ;
      P08XU9_A4553HreProTie = new short[1] ;
      P08XU9_A4551HreProCod = new String[] {""} ;
      P08XU9_A4556HreNumRec = new int[1] ;
      P08XU9_A4550HreLinPro = new byte[1] ;
      P08XU9_A4545HreLinMaq = new short[1] ;
      P08XU9_A4495HreNumCie = new byte[1] ;
      A4551HreProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pxprdt11etoexcel__default(),
         new Object[] {
             new Object[] {
            P08XU2_A396EmprCod, P08XU2_A656ParCod, P08XU2_n656ParCod, P08XU2_A1011TipMaqCod, P08XU2_n1011TipMaqCod, P08XU2_A136BarColNum, P08XU2_A135BarColNom, P08XU2_A212BarSer, P08XU2_A4441HisProDTF, P08XU2_n4441HisProDTF,
            P08XU2_A602MaqCod, P08XU2_A3610HisProLot, P08XU2_A1525HisProKgr, P08XU2_A130BarCodPar, P08XU2_A132BarCodReo, P08XU2_A129BarCod, P08XU2_A6680HisproTdab, P08XU2_A4440HisProDTI, P08XU2_n4440HisProDTI, P08XU2_A606MaqDsc,
            P08XU2_n606MaqDsc, P08XU2_A561HisProLin, P08XU2_A558HisProFec, P08XU2_A6399MaqKgsId, P08XU2_n6399MaqKgsId
            }
            , new Object[] {
            P08XU3_A396EmprCod, P08XU3_A130BarCodPar, P08XU3_A132BarCodReo, P08XU3_A129BarCod, P08XU3_A252CliCod, P08XU3_n252CliCod, P08XU3_A279CliNom, P08XU3_A212BarSer, P08XU3_A1652BarSerDsc, P08XU3_A135BarColNom,
            P08XU3_A136BarColNum, P08XU3_A218BarTipCol
            }
            , new Object[] {
            P08XU4_A396EmprCod, P08XU4_A507HbaBarPar, P08XU4_A508HbaBarReo, P08XU4_A506HbaBarCod, P08XU4_A252CliCod, P08XU4_n252CliCod, P08XU4_A279CliNom, P08XU4_A535HbaSer, P08XU4_n535HbaSer, P08XU4_A2627HbaSerDsc,
            P08XU4_n2627HbaSerDsc, P08XU4_A509HbaColNom, P08XU4_n509HbaColNom, P08XU4_A510HbaColNum, P08XU4_n510HbaColNum, P08XU4_A537HbaTipCol, P08XU4_n537HbaTipCol
            }
            , new Object[] {
            P08XU5_A583IntCod, P08XU5_A396EmprCod, P08XU5_A831TipColCod, P08XU5_A483ForColNum, P08XU5_A482ForColNom, P08XU5_A494ForSer, P08XU5_A252CliCod, P08XU5_A771ProForTie, P08XU5_A764ProForCod, P08XU5_A2393ProNumRec,
            P08XU5_A584IntDsc, P08XU5_n584IntDsc, P08XU5_A1160ProForL
            }
            , new Object[] {
            P08XU6_A396EmprCod, P08XU6_A6039RecAcab, P08XU6_n6039RecAcab, P08XU6_A130BarCodPar, P08XU6_A132BarCodReo, P08XU6_A129BarCod, P08XU6_A2804RecLinMaq
            }
            , new Object[] {
            P08XU7_A396EmprCod, P08XU7_A6039RecAcab, P08XU7_n6039RecAcab, P08XU7_A130BarCodPar, P08XU7_A132BarCodReo, P08XU7_A129BarCod, P08XU7_A771ProForTie, P08XU7_A764ProForCod, P08XU7_A2393ProNumRec, P08XU7_A1273RecLinPro,
            P08XU7_A2804RecLinMaq
            }
            , new Object[] {
            P08XU8_A396EmprCod, P08XU8_A4494HreBarPar, P08XU8_A4493HreBarReo, P08XU8_A4492HreBarCod, P08XU8_A4545HreLinMaq, P08XU8_A4495HreNumCie
            }
            , new Object[] {
            P08XU9_A396EmprCod, P08XU9_A4494HreBarPar, P08XU9_A4493HreBarReo, P08XU9_A4492HreBarCod, P08XU9_A4553HreProTie, P08XU9_A4551HreProCod, P08XU9_A4556HreNumRec, P08XU9_A4550HreLinPro, P08XU9_A4545HreLinMaq, P08XU9_A4495HreNumCie
            }
         }
      );
      AV257Pgmname = "PxPrdT11eToExcel" ;
      /* GeneXus formulas. */
      AV257Pgmname = "PxPrdT11eToExcel" ;
      Gx_err = (short)(0) ;
   }

   private byte AV168FlagTiReal ;
   private byte GXv_int1[] ;
   private byte AV153Columna ;
   private byte A132BarCodReo ;
   private byte AV140BarCodReo ;
   private byte AV237Tc_v ;
   private byte AV242TipColCod ;
   private byte AV222MinRea ;
   private byte AV165FlagBarcad ;
   private byte A218BarTipCol ;
   private byte A508HbaBarReo ;
   private byte A537HbaTipCol ;
   private byte A583IntCod ;
   private byte A831TipColCod ;
   private byte A1273RecLinPro ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4550HreLinPro ;
   private short AV162Fila ;
   private short A656ParCod ;
   private short A6680HisproTdab ;
   private short AV180HisProTre ;
   private short AV179HisproTdab ;
   private short AV186HorRea ;
   private short AV187HorReaint ;
   private short AV240TiempoF ;
   private short AV236Sum_t ;
   private short A771ProForTie ;
   private short A1160ProForL ;
   private short A2804RecLinMaq ;
   private short A4545HreLinMaq ;
   private short A4553HreProTie ;
   private short Gx_err ;
   private int AV145Barcolnumi ;
   private int AV144Barcolnumf ;
   private int AV227Num_pt ;
   private int AV225NTin ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private int AV250TotMinT ;
   private int AV226Num_p ;
   private int AV173Gruopecod ;
   private int AV251TotMinTp ;
   private int AV247Tot_teo ;
   private int AV136BarCod ;
   private int AV152Colnum_v ;
   private int AV170ForColNum ;
   private int AV239TiemM_p ;
   private int AV155Desvio_m ;
   private int AV232ProNumRec ;
   private int AV248Tot_tG ;
   private int AV148CliCod ;
   private int A252CliCod ;
   private int A506HbaBarCod ;
   private int A510HbaColNum ;
   private int A483ForColNum ;
   private int A2393ProNumRec ;
   private int A4492HreBarCod ;
   private int A4556HreNumRec ;
   private long AV171ForRgb ;
   private java.math.BigDecimal AV245Tot_dift ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A6399MaqKgsId ;
   private java.math.BigDecimal AV249TotKgs ;
   private java.math.BigDecimal AV235Sum_kgs ;
   private java.math.BigDecimal AV220MaqKgsId ;
   private java.math.BigDecimal AV244Tot_dif ;
   private java.math.BigDecimal AV193Last_kgs ;
   private java.math.BigDecimal AV192Kgs_hdr ;
   private java.math.BigDecimal AV191Kgr_v ;
   private java.math.BigDecimal AV223MinRea2 ;
   private java.math.BigDecimal AV182HmP ;
   private java.math.BigDecimal AV241TiempoNP ;
   private java.math.BigDecimal AV181HmF ;
   private java.math.BigDecimal AV154Desvio_h ;
   private java.math.BigDecimal AV246Tot_kgsG ;
   private String A396EmprCod ;
   private String AV230PMaqCod ;
   private String AV253UMaqCod ;
   private String AV243TipMaqCod ;
   private String AV164Filename ;
   private String AV135Artcodi ;
   private String AV134Artcodf ;
   private String AV143Barcolnomi ;
   private String AV142Barcolnomf ;
   private String AV257Pgmname ;
   private String scmdbuf ;
   private String A1011TipMaqCod ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A602MaqCod ;
   private String A3610HisProLot ;
   private String A130BarCodPar ;
   private String A606MaqDsc ;
   private String AV178HisProLot ;
   private String AV175Hdr_m ;
   private String AV138BarCodPar ;
   private String AV218Maqcod_v ;
   private String AV219MaqDsc_v ;
   private String AV174Hdr ;
   private String AV150Clinom_v ;
   private String AV149CliNom ;
   private String AV146Barser_v ;
   private String AV172ForSer ;
   private String AV233Serdsc_v ;
   private String AV147BarSerdsc ;
   private String AV151ColNom_v ;
   private String AV169ForColNom ;
   private String AV190intdsc_v ;
   private String AV189Intdsc ;
   private String Gx_msg ;
   private String AV231Proforcod ;
   private String AV166FlagBH ;
   private String A279CliNom ;
   private String A1652BarSerDsc ;
   private String A507HbaBarPar ;
   private String A535HbaSer ;
   private String A2627HbaSerDsc ;
   private String A509HbaColNom ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A764ProForCod ;
   private String A584IntDsc ;
   private String A6039RecAcab ;
   private String A4494HreBarPar ;
   private String A4551HreProCod ;
   private java.util.Date AV177hISPRODTI ;
   private java.util.Date AV176hISPRODTF ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A558HisProFec ;
   private boolean returnInSub ;
   private boolean brk8XU2 ;
   private boolean n656ParCod ;
   private boolean n1011TipMaqCod ;
   private boolean n4441HisProDTF ;
   private boolean n4440HisProDTI ;
   private boolean n606MaqDsc ;
   private boolean n6399MaqKgsId ;
   private boolean n252CliCod ;
   private boolean n535HbaSer ;
   private boolean n2627HbaSerDsc ;
   private boolean n509HbaColNom ;
   private boolean n510HbaColNum ;
   private boolean n537HbaTipCol ;
   private boolean n584IntDsc ;
   private boolean n6039RecAcab ;
   private String AV163File ;
   private String AV254ErrorMessage ;
   private String[] aP14 ;
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
   private IDataStoreProvider pr_default ;
   private String[] P08XU2_A396EmprCod ;
   private short[] P08XU2_A656ParCod ;
   private boolean[] P08XU2_n656ParCod ;
   private String[] P08XU2_A1011TipMaqCod ;
   private boolean[] P08XU2_n1011TipMaqCod ;
   private int[] P08XU2_A136BarColNum ;
   private String[] P08XU2_A135BarColNom ;
   private String[] P08XU2_A212BarSer ;
   private java.util.Date[] P08XU2_A4441HisProDTF ;
   private boolean[] P08XU2_n4441HisProDTF ;
   private String[] P08XU2_A602MaqCod ;
   private String[] P08XU2_A3610HisProLot ;
   private java.math.BigDecimal[] P08XU2_A1525HisProKgr ;
   private String[] P08XU2_A130BarCodPar ;
   private byte[] P08XU2_A132BarCodReo ;
   private int[] P08XU2_A129BarCod ;
   private short[] P08XU2_A6680HisproTdab ;
   private java.util.Date[] P08XU2_A4440HisProDTI ;
   private boolean[] P08XU2_n4440HisProDTI ;
   private String[] P08XU2_A606MaqDsc ;
   private boolean[] P08XU2_n606MaqDsc ;
   private int[] P08XU2_A561HisProLin ;
   private java.util.Date[] P08XU2_A558HisProFec ;
   private java.math.BigDecimal[] P08XU2_A6399MaqKgsId ;
   private boolean[] P08XU2_n6399MaqKgsId ;
   private String[] P08XU3_A396EmprCod ;
   private String[] P08XU3_A130BarCodPar ;
   private byte[] P08XU3_A132BarCodReo ;
   private int[] P08XU3_A129BarCod ;
   private int[] P08XU3_A252CliCod ;
   private boolean[] P08XU3_n252CliCod ;
   private String[] P08XU3_A279CliNom ;
   private String[] P08XU3_A212BarSer ;
   private String[] P08XU3_A1652BarSerDsc ;
   private String[] P08XU3_A135BarColNom ;
   private int[] P08XU3_A136BarColNum ;
   private byte[] P08XU3_A218BarTipCol ;
   private String[] P08XU4_A396EmprCod ;
   private String[] P08XU4_A507HbaBarPar ;
   private byte[] P08XU4_A508HbaBarReo ;
   private int[] P08XU4_A506HbaBarCod ;
   private int[] P08XU4_A252CliCod ;
   private boolean[] P08XU4_n252CliCod ;
   private String[] P08XU4_A279CliNom ;
   private String[] P08XU4_A535HbaSer ;
   private boolean[] P08XU4_n535HbaSer ;
   private String[] P08XU4_A2627HbaSerDsc ;
   private boolean[] P08XU4_n2627HbaSerDsc ;
   private String[] P08XU4_A509HbaColNom ;
   private boolean[] P08XU4_n509HbaColNom ;
   private int[] P08XU4_A510HbaColNum ;
   private boolean[] P08XU4_n510HbaColNum ;
   private byte[] P08XU4_A537HbaTipCol ;
   private boolean[] P08XU4_n537HbaTipCol ;
   private byte[] P08XU5_A583IntCod ;
   private String[] P08XU5_A396EmprCod ;
   private byte[] P08XU5_A831TipColCod ;
   private int[] P08XU5_A483ForColNum ;
   private String[] P08XU5_A482ForColNom ;
   private String[] P08XU5_A494ForSer ;
   private int[] P08XU5_A252CliCod ;
   private boolean[] P08XU5_n252CliCod ;
   private short[] P08XU5_A771ProForTie ;
   private String[] P08XU5_A764ProForCod ;
   private int[] P08XU5_A2393ProNumRec ;
   private String[] P08XU5_A584IntDsc ;
   private boolean[] P08XU5_n584IntDsc ;
   private short[] P08XU5_A1160ProForL ;
   private String[] P08XU6_A396EmprCod ;
   private String[] P08XU6_A6039RecAcab ;
   private boolean[] P08XU6_n6039RecAcab ;
   private String[] P08XU6_A130BarCodPar ;
   private byte[] P08XU6_A132BarCodReo ;
   private int[] P08XU6_A129BarCod ;
   private short[] P08XU6_A2804RecLinMaq ;
   private String[] P08XU7_A396EmprCod ;
   private String[] P08XU7_A6039RecAcab ;
   private boolean[] P08XU7_n6039RecAcab ;
   private String[] P08XU7_A130BarCodPar ;
   private byte[] P08XU7_A132BarCodReo ;
   private int[] P08XU7_A129BarCod ;
   private short[] P08XU7_A771ProForTie ;
   private String[] P08XU7_A764ProForCod ;
   private int[] P08XU7_A2393ProNumRec ;
   private byte[] P08XU7_A1273RecLinPro ;
   private short[] P08XU7_A2804RecLinMaq ;
   private String[] P08XU8_A396EmprCod ;
   private String[] P08XU8_A4494HreBarPar ;
   private byte[] P08XU8_A4493HreBarReo ;
   private int[] P08XU8_A4492HreBarCod ;
   private short[] P08XU8_A4545HreLinMaq ;
   private byte[] P08XU8_A4495HreNumCie ;
   private String[] P08XU9_A396EmprCod ;
   private String[] P08XU9_A4494HreBarPar ;
   private byte[] P08XU9_A4493HreBarReo ;
   private int[] P08XU9_A4492HreBarCod ;
   private short[] P08XU9_A4553HreProTie ;
   private String[] P08XU9_A4551HreProCod ;
   private int[] P08XU9_A4556HreNumRec ;
   private byte[] P08XU9_A4550HreLinPro ;
   private short[] P08XU9_A4545HreLinMaq ;
   private byte[] P08XU9_A4495HreNumCie ;
   private com.genexus.gxoffice.ExcelDoc AV160ExcelDocument ;
}

final  class pxprdt11etoexcel__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08XU2", "SELECT T1.EmprCod, T1.ParCod, T2.TipMaqCod, T3.BarColNum, T3.BarColNom, T3.BarSer, T1.HisProDTF, T1.MaqCod, T1.HisProLot, T1.HisProKgr, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.HisproTdab, T1.HisProDTI, T2.MaqDsc, T1.HisProLin, T1.HisProFec, T2.MaqKgsId FROM ((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.MaqCod >= ?) AND (T1.HisProDTF >= ? and T1.HisProDTF <= ?) AND (T2.TipMaqCod = ? or (rtrim(?) IS NULL)) AND (T3.BarSer >= ? and T3.BarSer <= ?) AND (T3.BarColNom >= ? and T3.BarColNom <= ?) AND (T3.BarColNum >= ? and T3.BarColNum <= ?) AND ((T1.ParCod = 0)) AND (T1.MaqCod <= ?) ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec, T1.HisProLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08XU3", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.CliCod, T2.CliNom, T1.BarSer, T1.BarSerDsc, T1.BarColNom, T1.BarColNum, T1.BarTipCol FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08XU4", "SELECT T1.EmprCod, T1.HbaBarPar, T1.HbaBarReo, T1.HbaBarCod, T1.CliCod, T2.CliNom, T1.HbaSer, T1.HbaSerDsc, T1.HbaColNom, T1.HbaColNum, T1.HbaTipCol FROM (TXPHISBAR T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.HbaBarCod = ? and T1.HbaBarReo = ? and T1.HbaBarPar = ? ORDER BY T1.EmprCod, T1.HbaBarCod, T1.HbaBarReo, T1.HbaBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08XU5", "SELECT T3.IntCod, T1.EmprCod, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T2.ProForTie, T1.ProForCod, T2.ProNumRec, T4.IntDsc, T1.ProForL FROM (((TXPLFORMU T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) INNER JOIN TXPCFORMU T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T1.CliCod AND T3.ForSer = T1.ForSer AND T3.ForColNom = T1.ForColNom AND T3.ForColNum = T1.ForColNum AND T3.TipColCod = T1.TipColCod) LEFT JOIN TXPINTENS T4 ON T4.EmprCod = T1.EmprCod AND T4.IntCod = T3.IntCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ProForL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08XU6", "SELECT EmprCod, RecAcab, BarCodPar, BarCodReo, BarCod, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08XU7", "SELECT T1.EmprCod, T3.RecAcab, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.ProForTie, T1.ProForCod, T2.ProNumRec, T1.RecLinPro, T1.RecLinMaq FROM ((TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) INNER JOIN TXPRECMAQ T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND T3.RecLinMaq = T1.RecLinMaq) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08XU8", "SELECT EmprCod, HreBarPar, HreBarReo, HreBarCod, HreLinMaq, HreNumCie FROM TXPHISREM WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08XU9", "SELECT EmprCod, HreBarPar, HreBarReo, HreBarCod, HreProTie, HreProCod, HreNumRec, HreLinPro, HreLinMaq, HreNumCie FROM TXPHISREC WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(8, 6);
               ((String[]) buf[11])[0] = rslt.getString(9, 10);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(10,2);
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
               ((byte[]) buf[14])[0] = rslt.getByte(12);
               ((int[]) buf[15])[0] = rslt.getInt(13);
               ((short[]) buf[16])[0] = rslt.getShort(14);
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(15);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(16, 16);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((int[]) buf[21])[0] = rslt.getInt(17);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(18);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(19,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
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
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(12);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((short[]) buf[10])[0] = rslt.getShort(10);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
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
               stmt.setString(5, (String)parms[4], 4);
               stmt.setString(6, (String)parms[5], 4);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setString(9, (String)parms[8], 13);
               stmt.setString(10, (String)parms[9], 13);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

