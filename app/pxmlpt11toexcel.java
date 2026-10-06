package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pxmlpt11toexcel extends GXProcedure
{
   public pxmlpt11toexcel( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pxmlpt11toexcel.class ), "" );
   }

   public pxmlpt11toexcel( int remoteHandle ,
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
      pxmlpt11toexcel.this.aP14 = new String[] {""};
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
      pxmlpt11toexcel.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pxmlpt11toexcel.this.AV235PMaqCod = aP1[0];
      this.aP1 = aP1;
      pxmlpt11toexcel.this.AV261UMaqCod = aP2[0];
      this.aP2 = aP2;
      pxmlpt11toexcel.this.AV180hISPRODTI = aP3[0];
      this.aP3 = aP3;
      pxmlpt11toexcel.this.AV179hISPRODTF = aP4[0];
      this.aP4 = aP4;
      pxmlpt11toexcel.this.AV250TipMaqCod = aP5[0];
      this.aP5 = aP5;
      pxmlpt11toexcel.this.AV167Filename = aP6[0];
      this.aP6 = aP6;
      pxmlpt11toexcel.this.AV140Artcodi = aP7[0];
      this.aP7 = aP7;
      pxmlpt11toexcel.this.AV139Artcodf = aP8[0];
      this.aP8 = aP8;
      pxmlpt11toexcel.this.AV148Barcolnomi = aP9[0];
      this.aP9 = aP9;
      pxmlpt11toexcel.this.AV147Barcolnomf = aP10[0];
      this.aP10 = aP10;
      pxmlpt11toexcel.this.AV150Barcolnumi = aP11[0];
      this.aP11 = aP11;
      pxmlpt11toexcel.this.AV149Barcolnumf = aP12[0];
      this.aP12 = aP12;
      pxmlpt11toexcel.this.aP13 = aP13;
      pxmlpt11toexcel.this.aP14 = aP14;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV171FlagTiReal ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TIREAL", ""), GXv_int1) ;
      pxmlpt11toexcel.this.AV171FlagTiReal = GXv_int1[0] ;
      AV264File = AV167Filename ;
      AV263ExcelDocument.Open(AV264File);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV263ExcelDocument.Clear();
      AV166Fila = (byte)(1) ;
      AV158Columna = (byte)(0) ;
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setText( httpContext.getMessage( "Periodo ", "")+localUtil.ttoc( AV180hISPRODTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")+"-"+localUtil.ttoc( AV179hISPRODTF, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")+GXutil.format( " [%1]", GXutil.trim( AV267Pgmname), "", "", "", "", "", "", "", "") );
      AV166Fila = (byte)(AV166Fila+1) ;
      AV158Columna = (byte)(0) ;
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setText( httpContext.getMessage( "Maquina", "") );
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setText( httpContext.getMessage( "Descropcion", "") );
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setText( httpContext.getMessage( "Hdr", "") );
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setText( httpContext.getMessage( "Cliente", "") );
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setText( httpContext.getMessage( "Articulo", "") );
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setText( httpContext.getMessage( "Descripcion", "") );
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setText( httpContext.getMessage( "Color", "") );
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setText( httpContext.getMessage( "Numero", "") );
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setText( httpContext.getMessage( "Tc", "") );
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setText( httpContext.getMessage( "Kgs", "") );
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setText( httpContext.getMessage( "Horas Prod.", "") );
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setText( httpContext.getMessage( "Horas Teoricas", "") );
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setText( httpContext.getMessage( "Desvio Horas", "") );
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setText( httpContext.getMessage( "Lote", "") );
      AV184HisProTreParos = (short)(0) ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV242TabParos[GX_I-1] = (short)(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV243TabTime[GX_I-1] = (short)(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      AV192i = 1 ;
      AV196LastParcod = (short)(0) ;
      /* Using cursor P08XV2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV235PMaqCod, AV261UMaqCod, AV180hISPRODTI, AV179hISPRODTF, AV250TipMaqCod, AV250TipMaqCod, AV140Artcodi, AV139Artcodf, AV148Barcolnomi, AV147Barcolnomf, Integer.valueOf(AV150Barcolnumi), Integer.valueOf(AV149Barcolnumf)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A129BarCod = P08XV2_A129BarCod[0] ;
         A132BarCodReo = P08XV2_A132BarCodReo[0] ;
         A130BarCodPar = P08XV2_A130BarCodPar[0] ;
         A656ParCod = P08XV2_A656ParCod[0] ;
         n656ParCod = P08XV2_n656ParCod[0] ;
         A136BarColNum = P08XV2_A136BarColNum[0] ;
         A135BarColNom = P08XV2_A135BarColNom[0] ;
         A212BarSer = P08XV2_A212BarSer[0] ;
         A1011TipMaqCod = P08XV2_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P08XV2_n1011TipMaqCod[0] ;
         A4441HisProDTF = P08XV2_A4441HisProDTF[0] ;
         n4441HisProDTF = P08XV2_n4441HisProDTF[0] ;
         A602MaqCod = P08XV2_A602MaqCod[0] ;
         A6680HisproTdab = P08XV2_A6680HisproTdab[0] ;
         A4440HisProDTI = P08XV2_A4440HisProDTI[0] ;
         n4440HisProDTI = P08XV2_n4440HisProDTI[0] ;
         A558HisProFec = P08XV2_A558HisProFec[0] ;
         A561HisProLin = P08XV2_A561HisProLin[0] ;
         A1011TipMaqCod = P08XV2_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P08XV2_n1011TipMaqCod[0] ;
         A136BarColNum = P08XV2_A136BarColNum[0] ;
         A135BarColNom = P08XV2_A135BarColNom[0] ;
         A212BarSer = P08XV2_A212BarSer[0] ;
         if ( ( A656ParCod != AV196LastParcod ) && ( AV196LastParcod > 0 ) )
         {
            AV242TabParos[AV192i-1] = AV196LastParcod ;
            AV243TabTime[AV192i-1] = AV184HisProTreParos ;
            AV192i = (int)(AV192i+1) ;
            AV184HisProTreParos = (short)(0) ;
         }
         AV182HisproTdab = (short)(0) ;
         if ( A6680HisproTdab > 0 )
         {
            if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
            {
               AV182HisproTdab = (short)(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)) ;
            }
         }
         AV184HisProTreParos = (short)(AV184HisProTreParos+AV182HisproTdab) ;
         AV196LastParcod = A656ParCod ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV242TabParos[AV192i-1] = AV196LastParcod ;
      AV243TabTime[AV192i-1] = AV184HisProTreParos ;
      AV174ForRgb = 0 ;
      AV252Tot_dift = DecimalUtil.doubleToDec(0) ;
      AV230Num_pt = 0 ;
      AV228NTin = 0 ;
      AV182HisproTdab = (short)(0) ;
      /* Using cursor P08XV3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV235PMaqCod, AV180hISPRODTI, AV179hISPRODTF, AV250TipMaqCod, AV250TipMaqCod, AV140Artcodi, AV139Artcodf, AV148Barcolnomi, AV147Barcolnomf, Integer.valueOf(AV150Barcolnumi), Integer.valueOf(AV149Barcolnumf), AV261UMaqCod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         brk8XV3 = false ;
         A656ParCod = P08XV3_A656ParCod[0] ;
         n656ParCod = P08XV3_n656ParCod[0] ;
         A1011TipMaqCod = P08XV3_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P08XV3_n1011TipMaqCod[0] ;
         A136BarColNum = P08XV3_A136BarColNum[0] ;
         A135BarColNom = P08XV3_A135BarColNom[0] ;
         A212BarSer = P08XV3_A212BarSer[0] ;
         A4441HisProDTF = P08XV3_A4441HisProDTF[0] ;
         n4441HisProDTF = P08XV3_n4441HisProDTF[0] ;
         A602MaqCod = P08XV3_A602MaqCod[0] ;
         A3610HisProLot = P08XV3_A3610HisProLot[0] ;
         A1525HisProKgr = P08XV3_A1525HisProKgr[0] ;
         A130BarCodPar = P08XV3_A130BarCodPar[0] ;
         A132BarCodReo = P08XV3_A132BarCodReo[0] ;
         A129BarCod = P08XV3_A129BarCod[0] ;
         A6680HisproTdab = P08XV3_A6680HisproTdab[0] ;
         A4440HisProDTI = P08XV3_A4440HisProDTI[0] ;
         n4440HisProDTI = P08XV3_n4440HisProDTI[0] ;
         A606MaqDsc = P08XV3_A606MaqDsc[0] ;
         n606MaqDsc = P08XV3_n606MaqDsc[0] ;
         A561HisProLin = P08XV3_A561HisProLin[0] ;
         A558HisProFec = P08XV3_A558HisProFec[0] ;
         A6399MaqKgsId = P08XV3_A6399MaqKgsId[0] ;
         n6399MaqKgsId = P08XV3_n6399MaqKgsId[0] ;
         A1011TipMaqCod = P08XV3_A1011TipMaqCod[0] ;
         n1011TipMaqCod = P08XV3_n1011TipMaqCod[0] ;
         A606MaqDsc = P08XV3_A606MaqDsc[0] ;
         n606MaqDsc = P08XV3_n606MaqDsc[0] ;
         A6399MaqKgsId = P08XV3_A6399MaqKgsId[0] ;
         n6399MaqKgsId = P08XV3_n6399MaqKgsId[0] ;
         A136BarColNum = P08XV3_A136BarColNum[0] ;
         A135BarColNom = P08XV3_A135BarColNom[0] ;
         A212BarSer = P08XV3_A212BarSer[0] ;
         AV257TotKgs = DecimalUtil.doubleToDec(0) ;
         AV258TotMinT = 0 ;
         AV229Num_p = 0 ;
         AV181HisProLot = "" ;
         AV176Gruopecod = 0 ;
         AV259TotMinTp = 0 ;
         AV240Sum_kgs = DecimalUtil.doubleToDec(0) ;
         AV223MaqKgsId = A6399MaqKgsId ;
         AV251Tot_dif = DecimalUtil.doubleToDec(0) ;
         AV254Tot_teo = 0 ;
         AV183HisProTre = (short)(0) ;
         AV195Last_kgs = DecimalUtil.doubleToDec(0) ;
         AV194Kgs_hdr = DecimalUtil.doubleToDec(0) ;
         while ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(P08XV3_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08XV3_A602MaqCod[0], A602MaqCod) == 0 ) )
         {
            brk8XV3 = false ;
            A656ParCod = P08XV3_A656ParCod[0] ;
            n656ParCod = P08XV3_n656ParCod[0] ;
            A1011TipMaqCod = P08XV3_A1011TipMaqCod[0] ;
            n1011TipMaqCod = P08XV3_n1011TipMaqCod[0] ;
            A136BarColNum = P08XV3_A136BarColNum[0] ;
            A135BarColNom = P08XV3_A135BarColNom[0] ;
            A212BarSer = P08XV3_A212BarSer[0] ;
            A4441HisProDTF = P08XV3_A4441HisProDTF[0] ;
            n4441HisProDTF = P08XV3_n4441HisProDTF[0] ;
            A3610HisProLot = P08XV3_A3610HisProLot[0] ;
            A1525HisProKgr = P08XV3_A1525HisProKgr[0] ;
            A130BarCodPar = P08XV3_A130BarCodPar[0] ;
            A132BarCodReo = P08XV3_A132BarCodReo[0] ;
            A129BarCod = P08XV3_A129BarCod[0] ;
            A6680HisproTdab = P08XV3_A6680HisproTdab[0] ;
            A4440HisProDTI = P08XV3_A4440HisProDTI[0] ;
            n4440HisProDTI = P08XV3_n4440HisProDTI[0] ;
            A606MaqDsc = P08XV3_A606MaqDsc[0] ;
            n606MaqDsc = P08XV3_n606MaqDsc[0] ;
            A561HisProLin = P08XV3_A561HisProLin[0] ;
            A558HisProFec = P08XV3_A558HisProFec[0] ;
            A1011TipMaqCod = P08XV3_A1011TipMaqCod[0] ;
            n1011TipMaqCod = P08XV3_n1011TipMaqCod[0] ;
            A606MaqDsc = P08XV3_A606MaqDsc[0] ;
            n606MaqDsc = P08XV3_n606MaqDsc[0] ;
            A136BarColNum = P08XV3_A136BarColNum[0] ;
            A135BarColNom = P08XV3_A135BarColNom[0] ;
            A212BarSer = P08XV3_A212BarSer[0] ;
            if ( ( GXutil.strcmp(A602MaqCod, AV235PMaqCod) >= 0 ) && ( GXutil.strcmp(A602MaqCod, AV261UMaqCod) <= 0 ) )
            {
               if ( ( GXutil.strcmp(A212BarSer, AV140Artcodi) >= 0 ) && ( GXutil.strcmp(A212BarSer, AV139Artcodf) <= 0 ) )
               {
                  if ( ( GXutil.strcmp(A135BarColNom, AV148Barcolnomi) >= 0 ) && ( GXutil.strcmp(A135BarColNom, AV147Barcolnomf) <= 0 ) )
                  {
                     if ( ( A136BarColNum >= AV150Barcolnumi ) && ( A136BarColNum <= AV149Barcolnumf ) )
                     {
                        if ( ( GXutil.strcmp(A1011TipMaqCod, AV250TipMaqCod) == 0 ) || (GXutil.strcmp("", AV250TipMaqCod)==0) )
                        {
                           if ( (( A4441HisProDTF.after( AV180hISPRODTI ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV180hISPRODTI) )) && (( A4441HisProDTF.before( AV179hISPRODTF ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV179hISPRODTF) )) )
                           {
                              if ( (0==A656ParCod) )
                              {
                                 if ( ( GXutil.strcmp(AV181HisProLot, A3610HisProLot) != 0 ) && ! (GXutil.strcmp("", AV181HisProLot)==0) )
                                 {
                                    AV228NTin = (int)(AV228NTin+1) ;
                                    AV229Num_p = (int)(AV229Num_p+1) ;
                                    AV230Num_pt = (int)(AV230Num_pt+1) ;
                                    /* Execute user subroutine: 'IMP_LINEA' */
                                    S111 ();
                                    if ( returnInSub )
                                    {
                                       pr_default.close(1);
                                       pr_default.close(1);
                                       pr_default.close(1);
                                       returnInSub = true;
                                       cleanup();
                                       if (true) return;
                                    }
                                    AV195Last_kgs = A1525HisProKgr ;
                                    AV194Kgs_hdr = A1525HisProKgr ;
                                    AV183HisProTre = (short)(0) ;
                                 }
                                 AV178Hdr_m = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
                                 AV182HisproTdab = (short)(0) ;
                                 if ( A6680HisproTdab > 0 )
                                 {
                                    if ( ! GXutil.dateCompare(GXutil.nullDate(), A4441HisProDTF) && A4441HisProDTF.after( A4440HisProDTI ) && ( ( GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI) / (double) ( 60 ) ) <= 9999 ) )
                                    {
                                       AV182HisproTdab = (short)(GXutil.dtdiff( A4441HisProDTF, A4440HisProDTI)/ (double) (60)) ;
                                    }
                                 }
                                 AV183HisProTre = (short)(AV183HisProTre+AV182HisproTdab) ;
                                 if ( DecimalUtil.compareTo(AV195Last_kgs, A1525HisProKgr) != 0 )
                                 {
                                    AV194Kgs_hdr = AV194Kgs_hdr.add(A1525HisProKgr) ;
                                 }
                                 if ( GXutil.strcmp(AV178Hdr_m, A3610HisProLot) == 0 )
                                 {
                                    AV141BarCod = A129BarCod ;
                                    AV145BarCodReo = A132BarCodReo ;
                                    AV143BarCodPar = A130BarCodPar ;
                                    /* Execute user subroutine: 'LEOHDR' */
                                    S121 ();
                                    if ( returnInSub )
                                    {
                                       pr_default.close(1);
                                       pr_default.close(1);
                                       pr_default.close(1);
                                       returnInSub = true;
                                       cleanup();
                                       if (true) return;
                                    }
                                    AV221Maqcod_v = A602MaqCod ;
                                    AV222MaqDsc_v = A606MaqDsc ;
                                    AV177Hdr = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
                                    AV155Clinom_v = AV154CliNom ;
                                    AV151Barser_v = AV175ForSer ;
                                    AV238Serdsc_v = AV152BarSerdsc ;
                                    AV156ColNom_v = AV172ForColNom ;
                                    AV157Colnum_v = AV173ForColNum ;
                                    AV244Tc_v = AV249TipColCod ;
                                    AV193Kgr_v = AV194Kgs_hdr ;
                                 }
                                 AV181HisProLot = A3610HisProLot ;
                                 AV195Last_kgs = A1525HisProKgr ;
                              }
                           }
                        }
                     }
                  }
               }
            }
            brk8XV3 = true ;
            pr_default.readNext(1);
         }
         AV228NTin = (int)(AV228NTin+1) ;
         AV229Num_p = (int)(AV229Num_p+1) ;
         AV230Num_pt = (int)(AV230Num_pt+1) ;
         /* Execute user subroutine: 'IMP_LINEA' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            pr_default.close(1);
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV190HorRea = (short)(GXutil.Int( AV258TotMinT/ (double) (60))) ;
         AV191HorReaint = (short)(GXutil.Int( AV190HorRea)) ;
         AV225MinRea = (byte)(AV258TotMinT-(AV191HorReaint*60)) ;
         AV226MinRea2 = DecimalUtil.doubleToDec(AV225MinRea/ (double) (100)) ;
         AV186HmP = DecimalUtil.doubleToDec(AV191HorReaint).add(AV226MinRea2) ;
         AV248TiempoNP = DecimalUtil.doubleToDec(0) ;
         if ( ! (0==AV228NTin) )
         {
            AV248TiempoNP = AV186HmP.divide(DecimalUtil.doubleToDec(AV228NTin), 18, java.math.RoundingMode.DOWN) ;
         }
         AV166Fila = (byte)(AV166Fila+1) ;
         AV166Fila = (byte)(AV166Fila+1) ;
         AV158Columna = (byte)(9) ;
         AV158Columna = (byte)(AV158Columna+1) ;
         AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV257TotKgs)) );
         Gx_msg = httpContext.getMessage( "Partidas ", "") + GXutil.str( AV229Num_p, 6, 0) ;
         Gx_msg = GXutil.trim( Gx_msg) ;
         AV158Columna = (byte)(AV158Columna+1) ;
         AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setText( GXutil.trim( Gx_msg) );
         AV246TiemM_p = 0 ;
         if ( AV229Num_p > 0 )
         {
            AV246TiemM_p = (int)(AV258TotMinT/ (double) (AV229Num_p)) ;
         }
         AV190HorRea = (short)(GXutil.Int( AV246TiemM_p/ (double) (60))) ;
         AV191HorReaint = (short)(GXutil.Int( AV190HorRea)) ;
         AV225MinRea = (byte)(AV246TiemM_p-(AV191HorReaint*60)) ;
         AV226MinRea2 = DecimalUtil.doubleToDec(AV225MinRea/ (double) (100)) ;
         AV186HmP = DecimalUtil.doubleToDec(AV191HorReaint).add(AV226MinRea2) ;
         Gx_msg = httpContext.getMessage( "Tiempo Medio p/partida ", "") ;
         AV158Columna = (byte)(AV158Columna+1) ;
         AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setText( Gx_msg );
         AV158Columna = (byte)(AV158Columna+1) ;
         AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV186HmP)) );
         AV246TiemM_p = 0 ;
         if ( AV229Num_p > 0 )
         {
            AV246TiemM_p = (int)(AV254Tot_teo/ (double) (AV229Num_p)) ;
         }
         AV190HorRea = (short)(GXutil.Int( AV246TiemM_p/ (double) (60))) ;
         AV191HorReaint = (short)(GXutil.Int( AV190HorRea)) ;
         AV225MinRea = (byte)(AV246TiemM_p-(AV191HorReaint*60)) ;
         AV226MinRea2 = DecimalUtil.doubleToDec(AV225MinRea/ (double) (100)) ;
         AV186HmP = DecimalUtil.doubleToDec(AV191HorReaint).add(AV226MinRea2) ;
         AV158Columna = (byte)(AV158Columna+1) ;
         AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV186HmP)) );
         AV166Fila = (byte)(AV166Fila+1) ;
         AV158Columna = (byte)(10) ;
         AV190HorRea = (short)(GXutil.Int( AV258TotMinT/ (double) (60))) ;
         AV191HorReaint = (short)(GXutil.Int( AV190HorRea)) ;
         AV225MinRea = (byte)(AV258TotMinT-(AV191HorReaint*60)) ;
         AV226MinRea2 = DecimalUtil.doubleToDec(AV225MinRea/ (double) (100)) ;
         AV186HmP = DecimalUtil.doubleToDec(AV191HorReaint).add(AV226MinRea2) ;
         AV158Columna = (byte)(AV158Columna+1) ;
         AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV186HmP)) );
         AV190HorRea = (short)(GXutil.Int( AV254Tot_teo/ (double) (60))) ;
         AV191HorReaint = (short)(GXutil.Int( AV190HorRea)) ;
         AV225MinRea = (byte)(AV254Tot_teo-(AV191HorReaint*60)) ;
         AV226MinRea2 = DecimalUtil.doubleToDec(AV225MinRea/ (double) (100)) ;
         AV186HmP = DecimalUtil.doubleToDec(AV191HorReaint).add(AV226MinRea2) ;
         AV158Columna = (byte)(AV158Columna+1) ;
         AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV186HmP)) );
         AV160Desvio_m = (int)(AV258TotMinT-AV254Tot_teo) ;
         AV190HorRea = (short)(GXutil.Int( AV160Desvio_m/ (double) (60))) ;
         AV191HorReaint = (short)(GXutil.Int( AV190HorRea)) ;
         AV225MinRea = (byte)(AV160Desvio_m-(AV191HorReaint*60)) ;
         AV226MinRea2 = DecimalUtil.doubleToDec(AV225MinRea/ (double) (100)) ;
         AV159Desvio_h = DecimalUtil.doubleToDec(AV191HorReaint).add(AV226MinRea2) ;
         AV158Columna = (byte)(AV158Columna+1) ;
         AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV159Desvio_h)) );
         AV254Tot_teo = 0 ;
         AV258TotMinT = 0 ;
         if ( ! brk8XV3 )
         {
            brk8XV3 = true ;
            pr_default.readNext(1);
         }
      }
      pr_default.close(1);
      AV166Fila = (byte)(AV166Fila+1) ;
      AV166Fila = (byte)(AV166Fila+1) ;
      AV158Columna = (byte)(9) ;
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV253Tot_kgsG)) );
      AV190HorRea = (short)(GXutil.Int( AV256Tot_tG/ (double) (60))) ;
      AV191HorReaint = (short)(GXutil.Int( AV190HorRea)) ;
      AV225MinRea = (byte)(AV256Tot_tG-(AV191HorReaint*60)) ;
      AV226MinRea2 = DecimalUtil.doubleToDec(AV225MinRea/ (double) (100)) ;
      AV186HmP = DecimalUtil.doubleToDec(AV191HorReaint).add(AV226MinRea2) ;
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV186HmP)) );
      AV190HorRea = (short)(GXutil.Int( AV255Tot_teoG/ (double) (60))) ;
      AV191HorReaint = (short)(GXutil.Int( AV190HorRea)) ;
      AV225MinRea = (byte)(AV255Tot_teoG-(AV191HorReaint*60)) ;
      AV226MinRea2 = DecimalUtil.doubleToDec(AV225MinRea/ (double) (100)) ;
      AV186HmP = DecimalUtil.doubleToDec(AV191HorReaint).add(AV226MinRea2) ;
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV186HmP)) );
      AV160Desvio_m = (int)(AV256Tot_tG-AV255Tot_teoG) ;
      AV190HorRea = (short)(GXutil.Int( AV160Desvio_m/ (double) (60))) ;
      AV191HorReaint = (short)(GXutil.Int( AV190HorRea)) ;
      AV225MinRea = (byte)(AV160Desvio_m-(AV191HorReaint*60)) ;
      AV226MinRea2 = DecimalUtil.doubleToDec(AV225MinRea/ (double) (100)) ;
      AV159Desvio_h = DecimalUtil.doubleToDec(AV191HorReaint).add(AV226MinRea2) ;
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV159Desvio_h)) );
      AV192i = 1 ;
      while ( AV192i <= 100 )
      {
         if ( AV242TabParos[AV192i-1] == 0 )
         {
            if (true) break;
         }
         AV166Fila = (byte)(AV166Fila+1) ;
         AV158Columna = (byte)(6) ;
         AV232ParCod = AV242TabParos[AV192i-1] ;
         AV158Columna = (byte)(AV158Columna+1) ;
         AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setNumber( AV232ParCod );
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = AV232ParCod ;
         GXv_char4[0] = AV233ParcodNom ;
         GXv_int1[0] = (byte)(0) ;
         new app.ppardsc(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_char4, GXv_int1) ;
         pxmlpt11toexcel.this.A396EmprCod = GXv_char2[0] ;
         pxmlpt11toexcel.this.AV232ParCod = GXv_int3[0] ;
         pxmlpt11toexcel.this.AV233ParcodNom = GXv_char4[0] ;
         AV158Columna = (byte)(AV158Columna+1) ;
         AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setText( AV233ParcodNom );
         AV158Columna = (byte)(AV158Columna+1) ;
         AV158Columna = (byte)(AV158Columna+1) ;
         AV190HorRea = (short)(GXutil.Int( AV243TabTime[AV192i-1]/ (double) (60))) ;
         AV191HorReaint = (short)(GXutil.Int( AV190HorRea)) ;
         AV225MinRea = (byte)(AV243TabTime[AV192i-1]-(AV191HorReaint*60)) ;
         AV226MinRea2 = DecimalUtil.doubleToDec(AV225MinRea/ (double) (100)) ;
         AV186HmP = DecimalUtil.doubleToDec(AV191HorReaint).add(AV226MinRea2) ;
         AV158Columna = (byte)(AV158Columna+1) ;
         AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV186HmP)) );
         AV192i = (int)(AV192i+1) ;
      }
      AV263ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV263ExcelDocument.Close();
      cleanup();
   }

   public void S111( )
   {
      /* 'IMP_LINEA' Routine */
      returnInSub = false ;
      AV166Fila = (byte)(AV166Fila+1) ;
      AV158Columna = (byte)(0) ;
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setText( AV221Maqcod_v );
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setText( AV222MaqDsc_v );
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setText( AV177Hdr );
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setText( AV155Clinom_v );
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setText( AV151Barser_v );
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setText( AV238Serdsc_v );
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setText( AV156ColNom_v );
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setNumber( AV157Colnum_v );
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setNumber( AV244Tc_v );
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV194Kgs_hdr)) );
      AV257TotKgs = AV257TotKgs.add(AV194Kgs_hdr) ;
      AV190HorRea = (short)(GXutil.Int( AV183HisProTre/ (double) (60))) ;
      AV191HorReaint = (short)(GXutil.Int( AV190HorRea)) ;
      AV225MinRea = (byte)(AV183HisProTre-(AV191HorReaint*60)) ;
      AV226MinRea2 = DecimalUtil.doubleToDec(AV225MinRea/ (double) (100)) ;
      AV186HmP = DecimalUtil.doubleToDec(AV191HorReaint).add(AV226MinRea2) ;
      AV190HorRea = (short)(GXutil.Int( AV247TiempoF/ (double) (60))) ;
      AV191HorReaint = (short)(GXutil.Int( AV190HorRea)) ;
      AV225MinRea = (byte)(AV247TiempoF-(AV191HorReaint*60)) ;
      AV226MinRea2 = DecimalUtil.doubleToDec(AV225MinRea/ (double) (100)) ;
      AV185HmF = DecimalUtil.doubleToDec(AV191HorReaint).add(AV226MinRea2) ;
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV186HmP)) );
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV185HmF)) );
      AV160Desvio_m = (int)(AV183HisProTre-AV247TiempoF) ;
      AV190HorRea = (short)(GXutil.Int( AV160Desvio_m/ (double) (60))) ;
      AV191HorReaint = (short)(GXutil.Int( AV190HorRea)) ;
      AV225MinRea = (byte)(AV160Desvio_m-(AV191HorReaint*60)) ;
      AV226MinRea2 = DecimalUtil.doubleToDec(AV225MinRea/ (double) (100)) ;
      AV159Desvio_h = DecimalUtil.doubleToDec(AV191HorReaint).add(AV226MinRea2) ;
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV159Desvio_h)) );
      AV158Columna = (byte)(AV158Columna+1) ;
      AV263ExcelDocument.Cells(AV166Fila, AV158Columna, 1, 1).setText( AV181HisProLot );
      AV253Tot_kgsG = AV253Tot_kgsG.add(AV194Kgs_hdr) ;
      AV256Tot_tG = (int)(AV256Tot_tG+AV183HisProTre) ;
      AV258TotMinT = (int)(AV258TotMinT+AV183HisProTre) ;
      AV254Tot_teo = (int)(AV254Tot_teo+AV247TiempoF) ;
      AV255Tot_teoG = (int)(AV255Tot_teoG+AV247TiempoF) ;
      AV240Sum_kgs = AV240Sum_kgs.add(AV257TotKgs) ;
      AV241Sum_t = (short)(AV241Sum_t+AV183HisProTre) ;
      AV259TotMinTp = (int)(AV259TotMinTp+AV183HisProTre) ;
   }

   public void S121( )
   {
      /* 'LEOHDR' Routine */
      returnInSub = false ;
      AV153CliCod = 999999 ;
      AV154CliNom = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" ;
      AV175ForSer = "XXXXXXXXXXXXXXXX" ;
      AV152BarSerdsc = "XXXXXXXXXXXXXXXXXXXXXXXXXX" ;
      AV172ForColNom = "XXXXXXXXXXXXX" ;
      AV173ForColNum = 999999 ;
      AV249TipColCod = (byte)(99) ;
      AV168FlagBarcad = (byte)(0) ;
      AV169FlagBH = "X" ;
      /* Using cursor P08XV4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV141BarCod), Byte.valueOf(AV145BarCodReo), AV143BarCodPar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A130BarCodPar = P08XV4_A130BarCodPar[0] ;
         A132BarCodReo = P08XV4_A132BarCodReo[0] ;
         A129BarCod = P08XV4_A129BarCod[0] ;
         A252CliCod = P08XV4_A252CliCod[0] ;
         n252CliCod = P08XV4_n252CliCod[0] ;
         A279CliNom = P08XV4_A279CliNom[0] ;
         A212BarSer = P08XV4_A212BarSer[0] ;
         A1652BarSerDsc = P08XV4_A1652BarSerDsc[0] ;
         A1234BarNomCli = P08XV4_A1234BarNomCli[0] ;
         A136BarColNum = P08XV4_A136BarColNum[0] ;
         A218BarTipCol = P08XV4_A218BarTipCol[0] ;
         A279CliNom = P08XV4_A279CliNom[0] ;
         AV168FlagBarcad = (byte)(1) ;
         AV169FlagBH = httpContext.getMessage( "B", "") ;
         AV153CliCod = A252CliCod ;
         AV154CliNom = A279CliNom ;
         AV175ForSer = A212BarSer ;
         AV152BarSerdsc = A1652BarSerDsc ;
         AV172ForColNom = A1234BarNomCli ;
         AV173ForColNum = A136BarColNum ;
         AV249TipColCod = A218BarTipCol ;
         /* Execute user subroutine: 'LEOFORMU' */
         S135 ();
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
      if ( AV168FlagBarcad == 0 )
      {
         /* Using cursor P08XV5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV141BarCod), Byte.valueOf(AV145BarCodReo), AV143BarCodPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A507HbaBarPar = P08XV5_A507HbaBarPar[0] ;
            A508HbaBarReo = P08XV5_A508HbaBarReo[0] ;
            A506HbaBarCod = P08XV5_A506HbaBarCod[0] ;
            A252CliCod = P08XV5_A252CliCod[0] ;
            n252CliCod = P08XV5_n252CliCod[0] ;
            A279CliNom = P08XV5_A279CliNom[0] ;
            A535HbaSer = P08XV5_A535HbaSer[0] ;
            n535HbaSer = P08XV5_n535HbaSer[0] ;
            A2627HbaSerDsc = P08XV5_A2627HbaSerDsc[0] ;
            n2627HbaSerDsc = P08XV5_n2627HbaSerDsc[0] ;
            A509HbaColNom = P08XV5_A509HbaColNom[0] ;
            n509HbaColNom = P08XV5_n509HbaColNom[0] ;
            A510HbaColNum = P08XV5_A510HbaColNum[0] ;
            n510HbaColNum = P08XV5_n510HbaColNum[0] ;
            A537HbaTipCol = P08XV5_A537HbaTipCol[0] ;
            n537HbaTipCol = P08XV5_n537HbaTipCol[0] ;
            A279CliNom = P08XV5_A279CliNom[0] ;
            AV169FlagBH = httpContext.getMessage( "H", "") ;
            AV153CliCod = A252CliCod ;
            AV154CliNom = A279CliNom ;
            AV175ForSer = A535HbaSer ;
            AV152BarSerdsc = A2627HbaSerDsc ;
            AV172ForColNom = A509HbaColNom ;
            AV173ForColNum = A510HbaColNum ;
            AV249TipColCod = A537HbaTipCol ;
            /* Execute user subroutine: 'LEOFORMU' */
            S135 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               pr_default.close(3);
               returnInSub = true;
               if (true) return;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
   }

   public void S135( )
   {
      /* 'LEOFORMU' Routine */
      returnInSub = false ;
      AV247TiempoF = (short)(0) ;
      AV236Proforcod = " " ;
      AV237ProNumRec = 0 ;
      /* Using cursor P08XV6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV153CliCod), AV175ForSer, AV172ForColNom, Integer.valueOf(AV173ForColNum), Byte.valueOf(AV249TipColCod)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A831TipColCod = P08XV6_A831TipColCod[0] ;
         A483ForColNum = P08XV6_A483ForColNum[0] ;
         A482ForColNom = P08XV6_A482ForColNom[0] ;
         A494ForSer = P08XV6_A494ForSer[0] ;
         A252CliCod = P08XV6_A252CliCod[0] ;
         n252CliCod = P08XV6_n252CliCod[0] ;
         A771ProForTie = P08XV6_A771ProForTie[0] ;
         A764ProForCod = P08XV6_A764ProForCod[0] ;
         A2393ProNumRec = P08XV6_A2393ProNumRec[0] ;
         A1160ProForL = P08XV6_A1160ProForL[0] ;
         A771ProForTie = P08XV6_A771ProForTie[0] ;
         A2393ProNumRec = P08XV6_A2393ProNumRec[0] ;
         AV247TiempoF = (short)(AV247TiempoF+A771ProForTie) ;
         AV236Proforcod = A764ProForCod ;
         AV237ProNumRec = A2393ProNumRec ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
      /* Using cursor P08XV7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV141BarCod), Byte.valueOf(AV145BarCodReo), AV143BarCodPar});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A6039RecAcab = P08XV7_A6039RecAcab[0] ;
         n6039RecAcab = P08XV7_n6039RecAcab[0] ;
         A130BarCodPar = P08XV7_A130BarCodPar[0] ;
         A132BarCodReo = P08XV7_A132BarCodReo[0] ;
         A129BarCod = P08XV7_A129BarCod[0] ;
         A2804RecLinMaq = P08XV7_A2804RecLinMaq[0] ;
         if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "N", "")) == 0 )
         {
            AV247TiempoF = (short)(0) ;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
      /* Using cursor P08XV8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV141BarCod), Byte.valueOf(AV145BarCodReo), AV143BarCodPar});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A6039RecAcab = P08XV8_A6039RecAcab[0] ;
         n6039RecAcab = P08XV8_n6039RecAcab[0] ;
         A130BarCodPar = P08XV8_A130BarCodPar[0] ;
         A132BarCodReo = P08XV8_A132BarCodReo[0] ;
         A129BarCod = P08XV8_A129BarCod[0] ;
         A771ProForTie = P08XV8_A771ProForTie[0] ;
         A764ProForCod = P08XV8_A764ProForCod[0] ;
         A2393ProNumRec = P08XV8_A2393ProNumRec[0] ;
         A1273RecLinPro = P08XV8_A1273RecLinPro[0] ;
         A2804RecLinMaq = P08XV8_A2804RecLinMaq[0] ;
         A771ProForTie = P08XV8_A771ProForTie[0] ;
         A2393ProNumRec = P08XV8_A2393ProNumRec[0] ;
         A6039RecAcab = P08XV8_A6039RecAcab[0] ;
         n6039RecAcab = P08XV8_n6039RecAcab[0] ;
         if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "N", "")) == 0 )
         {
            AV247TiempoF = (short)(AV247TiempoF+A771ProForTie) ;
            AV236Proforcod = A764ProForCod ;
            AV237ProNumRec = A2393ProNumRec ;
         }
         pr_default.readNext(6);
      }
      pr_default.close(6);
      /* Using cursor P08XV9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV141BarCod), Byte.valueOf(AV145BarCodReo), AV143BarCodPar});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A4494HreBarPar = P08XV9_A4494HreBarPar[0] ;
         A4493HreBarReo = P08XV9_A4493HreBarReo[0] ;
         A4492HreBarCod = P08XV9_A4492HreBarCod[0] ;
         A4545HreLinMaq = P08XV9_A4545HreLinMaq[0] ;
         A4495HreNumCie = P08XV9_A4495HreNumCie[0] ;
         AV247TiempoF = (short)(0) ;
         pr_default.readNext(7);
      }
      pr_default.close(7);
      /* Using cursor P08XV10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV141BarCod), Byte.valueOf(AV145BarCodReo), AV143BarCodPar});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A4494HreBarPar = P08XV10_A4494HreBarPar[0] ;
         A4493HreBarReo = P08XV10_A4493HreBarReo[0] ;
         A4492HreBarCod = P08XV10_A4492HreBarCod[0] ;
         A4553HreProTie = P08XV10_A4553HreProTie[0] ;
         A4551HreProCod = P08XV10_A4551HreProCod[0] ;
         A4556HreNumRec = P08XV10_A4556HreNumRec[0] ;
         A4550HreLinPro = P08XV10_A4550HreLinPro[0] ;
         A4545HreLinMaq = P08XV10_A4545HreLinMaq[0] ;
         A4495HreNumCie = P08XV10_A4495HreNumCie[0] ;
         AV247TiempoF = (short)(AV247TiempoF+A4553HreProTie) ;
         AV236Proforcod = A4551HreProCod ;
         AV237ProNumRec = A4556HreNumRec ;
         pr_default.readNext(8);
      }
      pr_default.close(8);
   }

   public void S141( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV263ExcelDocument.getErrCode() != 0 )
      {
         AV264File = "" ;
         AV262ErrorMessage = AV263ExcelDocument.getErrDescription() ;
         AV263ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pxmlpt11toexcel.this.A396EmprCod;
      this.aP1[0] = pxmlpt11toexcel.this.AV235PMaqCod;
      this.aP2[0] = pxmlpt11toexcel.this.AV261UMaqCod;
      this.aP3[0] = pxmlpt11toexcel.this.AV180hISPRODTI;
      this.aP4[0] = pxmlpt11toexcel.this.AV179hISPRODTF;
      this.aP5[0] = pxmlpt11toexcel.this.AV250TipMaqCod;
      this.aP6[0] = pxmlpt11toexcel.this.AV167Filename;
      this.aP7[0] = pxmlpt11toexcel.this.AV140Artcodi;
      this.aP8[0] = pxmlpt11toexcel.this.AV139Artcodf;
      this.aP9[0] = pxmlpt11toexcel.this.AV148Barcolnomi;
      this.aP10[0] = pxmlpt11toexcel.this.AV147Barcolnomf;
      this.aP11[0] = pxmlpt11toexcel.this.AV150Barcolnumi;
      this.aP12[0] = pxmlpt11toexcel.this.AV149Barcolnumf;
      this.aP13[0] = pxmlpt11toexcel.this.AV264File;
      this.aP14[0] = pxmlpt11toexcel.this.AV262ErrorMessage;
      CloseOpenCursors();
      AV263ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV264File = "" ;
      AV262ErrorMessage = "" ;
      AV263ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV267Pgmname = "" ;
      AV242TabParos = new short[100] ;
      AV243TabTime = new short[100] ;
      scmdbuf = "" ;
      P08XV2_A129BarCod = new int[1] ;
      P08XV2_A132BarCodReo = new byte[1] ;
      P08XV2_A130BarCodPar = new String[] {""} ;
      P08XV2_A396EmprCod = new String[] {""} ;
      P08XV2_A656ParCod = new short[1] ;
      P08XV2_n656ParCod = new boolean[] {false} ;
      P08XV2_A136BarColNum = new int[1] ;
      P08XV2_A135BarColNom = new String[] {""} ;
      P08XV2_A212BarSer = new String[] {""} ;
      P08XV2_A1011TipMaqCod = new String[] {""} ;
      P08XV2_n1011TipMaqCod = new boolean[] {false} ;
      P08XV2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08XV2_n4441HisProDTF = new boolean[] {false} ;
      P08XV2_A602MaqCod = new String[] {""} ;
      P08XV2_A6680HisproTdab = new short[1] ;
      P08XV2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08XV2_n4440HisProDTI = new boolean[] {false} ;
      P08XV2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08XV2_A561HisProLin = new int[1] ;
      A130BarCodPar = "" ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A1011TipMaqCod = "" ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A602MaqCod = "" ;
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A558HisProFec = GXutil.nullDate() ;
      AV252Tot_dift = DecimalUtil.ZERO ;
      P08XV3_A396EmprCod = new String[] {""} ;
      P08XV3_A656ParCod = new short[1] ;
      P08XV3_n656ParCod = new boolean[] {false} ;
      P08XV3_A1011TipMaqCod = new String[] {""} ;
      P08XV3_n1011TipMaqCod = new boolean[] {false} ;
      P08XV3_A136BarColNum = new int[1] ;
      P08XV3_A135BarColNom = new String[] {""} ;
      P08XV3_A212BarSer = new String[] {""} ;
      P08XV3_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08XV3_n4441HisProDTF = new boolean[] {false} ;
      P08XV3_A602MaqCod = new String[] {""} ;
      P08XV3_A3610HisProLot = new String[] {""} ;
      P08XV3_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08XV3_A130BarCodPar = new String[] {""} ;
      P08XV3_A132BarCodReo = new byte[1] ;
      P08XV3_A129BarCod = new int[1] ;
      P08XV3_A6680HisproTdab = new short[1] ;
      P08XV3_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08XV3_n4440HisProDTI = new boolean[] {false} ;
      P08XV3_A606MaqDsc = new String[] {""} ;
      P08XV3_n606MaqDsc = new boolean[] {false} ;
      P08XV3_A561HisProLin = new int[1] ;
      P08XV3_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08XV3_A6399MaqKgsId = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08XV3_n6399MaqKgsId = new boolean[] {false} ;
      A3610HisProLot = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A606MaqDsc = "" ;
      A6399MaqKgsId = DecimalUtil.ZERO ;
      AV257TotKgs = DecimalUtil.ZERO ;
      AV181HisProLot = "" ;
      AV240Sum_kgs = DecimalUtil.ZERO ;
      AV223MaqKgsId = DecimalUtil.ZERO ;
      AV251Tot_dif = DecimalUtil.ZERO ;
      AV195Last_kgs = DecimalUtil.ZERO ;
      AV194Kgs_hdr = DecimalUtil.ZERO ;
      AV178Hdr_m = "" ;
      AV143BarCodPar = "" ;
      AV221Maqcod_v = "" ;
      AV222MaqDsc_v = "" ;
      AV177Hdr = "" ;
      AV155Clinom_v = "" ;
      AV154CliNom = "" ;
      AV151Barser_v = "" ;
      AV175ForSer = "" ;
      AV238Serdsc_v = "" ;
      AV152BarSerdsc = "" ;
      AV156ColNom_v = "" ;
      AV172ForColNom = "" ;
      AV193Kgr_v = DecimalUtil.ZERO ;
      AV226MinRea2 = DecimalUtil.ZERO ;
      AV186HmP = DecimalUtil.ZERO ;
      AV248TiempoNP = DecimalUtil.ZERO ;
      Gx_msg = "" ;
      AV159Desvio_h = DecimalUtil.ZERO ;
      AV253Tot_kgsG = DecimalUtil.ZERO ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new short[1] ;
      AV233ParcodNom = "" ;
      GXv_char4 = new String[1] ;
      GXv_int1 = new byte[1] ;
      AV185HmF = DecimalUtil.ZERO ;
      AV169FlagBH = "" ;
      P08XV4_A396EmprCod = new String[] {""} ;
      P08XV4_A130BarCodPar = new String[] {""} ;
      P08XV4_A132BarCodReo = new byte[1] ;
      P08XV4_A129BarCod = new int[1] ;
      P08XV4_A252CliCod = new int[1] ;
      P08XV4_n252CliCod = new boolean[] {false} ;
      P08XV4_A279CliNom = new String[] {""} ;
      P08XV4_A212BarSer = new String[] {""} ;
      P08XV4_A1652BarSerDsc = new String[] {""} ;
      P08XV4_A1234BarNomCli = new String[] {""} ;
      P08XV4_A136BarColNum = new int[1] ;
      P08XV4_A218BarTipCol = new byte[1] ;
      A279CliNom = "" ;
      A1652BarSerDsc = "" ;
      A1234BarNomCli = "" ;
      P08XV5_A396EmprCod = new String[] {""} ;
      P08XV5_A507HbaBarPar = new String[] {""} ;
      P08XV5_A508HbaBarReo = new byte[1] ;
      P08XV5_A506HbaBarCod = new int[1] ;
      P08XV5_A252CliCod = new int[1] ;
      P08XV5_n252CliCod = new boolean[] {false} ;
      P08XV5_A279CliNom = new String[] {""} ;
      P08XV5_A535HbaSer = new String[] {""} ;
      P08XV5_n535HbaSer = new boolean[] {false} ;
      P08XV5_A2627HbaSerDsc = new String[] {""} ;
      P08XV5_n2627HbaSerDsc = new boolean[] {false} ;
      P08XV5_A509HbaColNom = new String[] {""} ;
      P08XV5_n509HbaColNom = new boolean[] {false} ;
      P08XV5_A510HbaColNum = new int[1] ;
      P08XV5_n510HbaColNum = new boolean[] {false} ;
      P08XV5_A537HbaTipCol = new byte[1] ;
      P08XV5_n537HbaTipCol = new boolean[] {false} ;
      A507HbaBarPar = "" ;
      A535HbaSer = "" ;
      A2627HbaSerDsc = "" ;
      A509HbaColNom = "" ;
      AV236Proforcod = "" ;
      P08XV6_A396EmprCod = new String[] {""} ;
      P08XV6_A831TipColCod = new byte[1] ;
      P08XV6_A483ForColNum = new int[1] ;
      P08XV6_A482ForColNom = new String[] {""} ;
      P08XV6_A494ForSer = new String[] {""} ;
      P08XV6_A252CliCod = new int[1] ;
      P08XV6_n252CliCod = new boolean[] {false} ;
      P08XV6_A771ProForTie = new short[1] ;
      P08XV6_A764ProForCod = new String[] {""} ;
      P08XV6_A2393ProNumRec = new int[1] ;
      P08XV6_A1160ProForL = new short[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A764ProForCod = "" ;
      P08XV7_A396EmprCod = new String[] {""} ;
      P08XV7_A6039RecAcab = new String[] {""} ;
      P08XV7_n6039RecAcab = new boolean[] {false} ;
      P08XV7_A130BarCodPar = new String[] {""} ;
      P08XV7_A132BarCodReo = new byte[1] ;
      P08XV7_A129BarCod = new int[1] ;
      P08XV7_A2804RecLinMaq = new short[1] ;
      A6039RecAcab = "" ;
      P08XV8_A396EmprCod = new String[] {""} ;
      P08XV8_A6039RecAcab = new String[] {""} ;
      P08XV8_n6039RecAcab = new boolean[] {false} ;
      P08XV8_A130BarCodPar = new String[] {""} ;
      P08XV8_A132BarCodReo = new byte[1] ;
      P08XV8_A129BarCod = new int[1] ;
      P08XV8_A771ProForTie = new short[1] ;
      P08XV8_A764ProForCod = new String[] {""} ;
      P08XV8_A2393ProNumRec = new int[1] ;
      P08XV8_A1273RecLinPro = new byte[1] ;
      P08XV8_A2804RecLinMaq = new short[1] ;
      P08XV9_A396EmprCod = new String[] {""} ;
      P08XV9_A4494HreBarPar = new String[] {""} ;
      P08XV9_A4493HreBarReo = new byte[1] ;
      P08XV9_A4492HreBarCod = new int[1] ;
      P08XV9_A4545HreLinMaq = new short[1] ;
      P08XV9_A4495HreNumCie = new byte[1] ;
      A4494HreBarPar = "" ;
      P08XV10_A396EmprCod = new String[] {""} ;
      P08XV10_A4494HreBarPar = new String[] {""} ;
      P08XV10_A4493HreBarReo = new byte[1] ;
      P08XV10_A4492HreBarCod = new int[1] ;
      P08XV10_A4553HreProTie = new short[1] ;
      P08XV10_A4551HreProCod = new String[] {""} ;
      P08XV10_A4556HreNumRec = new int[1] ;
      P08XV10_A4550HreLinPro = new byte[1] ;
      P08XV10_A4545HreLinMaq = new short[1] ;
      P08XV10_A4495HreNumCie = new byte[1] ;
      A4551HreProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pxmlpt11toexcel__default(),
         new Object[] {
             new Object[] {
            P08XV2_A129BarCod, P08XV2_A132BarCodReo, P08XV2_A130BarCodPar, P08XV2_A396EmprCod, P08XV2_A656ParCod, P08XV2_n656ParCod, P08XV2_A136BarColNum, P08XV2_A135BarColNom, P08XV2_A212BarSer, P08XV2_A1011TipMaqCod,
            P08XV2_n1011TipMaqCod, P08XV2_A4441HisProDTF, P08XV2_n4441HisProDTF, P08XV2_A602MaqCod, P08XV2_A6680HisproTdab, P08XV2_A4440HisProDTI, P08XV2_n4440HisProDTI, P08XV2_A558HisProFec, P08XV2_A561HisProLin
            }
            , new Object[] {
            P08XV3_A396EmprCod, P08XV3_A656ParCod, P08XV3_n656ParCod, P08XV3_A1011TipMaqCod, P08XV3_n1011TipMaqCod, P08XV3_A136BarColNum, P08XV3_A135BarColNom, P08XV3_A212BarSer, P08XV3_A4441HisProDTF, P08XV3_n4441HisProDTF,
            P08XV3_A602MaqCod, P08XV3_A3610HisProLot, P08XV3_A1525HisProKgr, P08XV3_A130BarCodPar, P08XV3_A132BarCodReo, P08XV3_A129BarCod, P08XV3_A6680HisproTdab, P08XV3_A4440HisProDTI, P08XV3_n4440HisProDTI, P08XV3_A606MaqDsc,
            P08XV3_n606MaqDsc, P08XV3_A561HisProLin, P08XV3_A558HisProFec, P08XV3_A6399MaqKgsId, P08XV3_n6399MaqKgsId
            }
            , new Object[] {
            P08XV4_A396EmprCod, P08XV4_A130BarCodPar, P08XV4_A132BarCodReo, P08XV4_A129BarCod, P08XV4_A252CliCod, P08XV4_n252CliCod, P08XV4_A279CliNom, P08XV4_A212BarSer, P08XV4_A1652BarSerDsc, P08XV4_A1234BarNomCli,
            P08XV4_A136BarColNum, P08XV4_A218BarTipCol
            }
            , new Object[] {
            P08XV5_A396EmprCod, P08XV5_A507HbaBarPar, P08XV5_A508HbaBarReo, P08XV5_A506HbaBarCod, P08XV5_A252CliCod, P08XV5_n252CliCod, P08XV5_A279CliNom, P08XV5_A535HbaSer, P08XV5_n535HbaSer, P08XV5_A2627HbaSerDsc,
            P08XV5_n2627HbaSerDsc, P08XV5_A509HbaColNom, P08XV5_n509HbaColNom, P08XV5_A510HbaColNum, P08XV5_n510HbaColNum, P08XV5_A537HbaTipCol, P08XV5_n537HbaTipCol
            }
            , new Object[] {
            P08XV6_A396EmprCod, P08XV6_A831TipColCod, P08XV6_A483ForColNum, P08XV6_A482ForColNom, P08XV6_A494ForSer, P08XV6_A252CliCod, P08XV6_A771ProForTie, P08XV6_A764ProForCod, P08XV6_A2393ProNumRec, P08XV6_A1160ProForL
            }
            , new Object[] {
            P08XV7_A396EmprCod, P08XV7_A6039RecAcab, P08XV7_n6039RecAcab, P08XV7_A130BarCodPar, P08XV7_A132BarCodReo, P08XV7_A129BarCod, P08XV7_A2804RecLinMaq
            }
            , new Object[] {
            P08XV8_A396EmprCod, P08XV8_A6039RecAcab, P08XV8_n6039RecAcab, P08XV8_A130BarCodPar, P08XV8_A132BarCodReo, P08XV8_A129BarCod, P08XV8_A771ProForTie, P08XV8_A764ProForCod, P08XV8_A2393ProNumRec, P08XV8_A1273RecLinPro,
            P08XV8_A2804RecLinMaq
            }
            , new Object[] {
            P08XV9_A396EmprCod, P08XV9_A4494HreBarPar, P08XV9_A4493HreBarReo, P08XV9_A4492HreBarCod, P08XV9_A4545HreLinMaq, P08XV9_A4495HreNumCie
            }
            , new Object[] {
            P08XV10_A396EmprCod, P08XV10_A4494HreBarPar, P08XV10_A4493HreBarReo, P08XV10_A4492HreBarCod, P08XV10_A4553HreProTie, P08XV10_A4551HreProCod, P08XV10_A4556HreNumRec, P08XV10_A4550HreLinPro, P08XV10_A4545HreLinMaq, P08XV10_A4495HreNumCie
            }
         }
      );
      AV267Pgmname = "PXmlPT11ToExcel" ;
      /* GeneXus formulas. */
      AV267Pgmname = "PXmlPT11ToExcel" ;
      Gx_err = (short)(0) ;
   }

   private byte AV171FlagTiReal ;
   private byte AV166Fila ;
   private byte AV158Columna ;
   private byte A132BarCodReo ;
   private byte AV145BarCodReo ;
   private byte AV244Tc_v ;
   private byte AV249TipColCod ;
   private byte AV225MinRea ;
   private byte GXv_int1[] ;
   private byte AV168FlagBarcad ;
   private byte A218BarTipCol ;
   private byte A508HbaBarReo ;
   private byte A537HbaTipCol ;
   private byte A831TipColCod ;
   private byte A1273RecLinPro ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4550HreLinPro ;
   private short AV184HisProTreParos ;
   private short AV242TabParos[] ;
   private short AV243TabTime[] ;
   private short AV196LastParcod ;
   private short A656ParCod ;
   private short A6680HisproTdab ;
   private short AV182HisproTdab ;
   private short AV183HisProTre ;
   private short AV190HorRea ;
   private short AV191HorReaint ;
   private short AV232ParCod ;
   private short GXv_int3[] ;
   private short AV247TiempoF ;
   private short AV241Sum_t ;
   private short A771ProForTie ;
   private short A1160ProForL ;
   private short A2804RecLinMaq ;
   private short A4545HreLinMaq ;
   private short A4553HreProTie ;
   private short Gx_err ;
   private int AV150Barcolnumi ;
   private int AV149Barcolnumf ;
   private int GX_I ;
   private int AV192i ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int A561HisProLin ;
   private int AV230Num_pt ;
   private int AV228NTin ;
   private int AV258TotMinT ;
   private int AV229Num_p ;
   private int AV176Gruopecod ;
   private int AV259TotMinTp ;
   private int AV254Tot_teo ;
   private int AV141BarCod ;
   private int AV157Colnum_v ;
   private int AV173ForColNum ;
   private int AV246TiemM_p ;
   private int AV160Desvio_m ;
   private int AV256Tot_tG ;
   private int AV255Tot_teoG ;
   private int AV153CliCod ;
   private int A252CliCod ;
   private int A506HbaBarCod ;
   private int A510HbaColNum ;
   private int AV237ProNumRec ;
   private int A483ForColNum ;
   private int A2393ProNumRec ;
   private int A4492HreBarCod ;
   private int A4556HreNumRec ;
   private long AV174ForRgb ;
   private java.math.BigDecimal AV252Tot_dift ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A6399MaqKgsId ;
   private java.math.BigDecimal AV257TotKgs ;
   private java.math.BigDecimal AV240Sum_kgs ;
   private java.math.BigDecimal AV223MaqKgsId ;
   private java.math.BigDecimal AV251Tot_dif ;
   private java.math.BigDecimal AV195Last_kgs ;
   private java.math.BigDecimal AV194Kgs_hdr ;
   private java.math.BigDecimal AV193Kgr_v ;
   private java.math.BigDecimal AV226MinRea2 ;
   private java.math.BigDecimal AV186HmP ;
   private java.math.BigDecimal AV248TiempoNP ;
   private java.math.BigDecimal AV159Desvio_h ;
   private java.math.BigDecimal AV253Tot_kgsG ;
   private java.math.BigDecimal AV185HmF ;
   private String A396EmprCod ;
   private String AV235PMaqCod ;
   private String AV261UMaqCod ;
   private String AV250TipMaqCod ;
   private String AV167Filename ;
   private String AV140Artcodi ;
   private String AV139Artcodf ;
   private String AV148Barcolnomi ;
   private String AV147Barcolnomf ;
   private String AV267Pgmname ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A1011TipMaqCod ;
   private String A602MaqCod ;
   private String A3610HisProLot ;
   private String A606MaqDsc ;
   private String AV181HisProLot ;
   private String AV178Hdr_m ;
   private String AV143BarCodPar ;
   private String AV221Maqcod_v ;
   private String AV222MaqDsc_v ;
   private String AV177Hdr ;
   private String AV155Clinom_v ;
   private String AV154CliNom ;
   private String AV151Barser_v ;
   private String AV175ForSer ;
   private String AV238Serdsc_v ;
   private String AV152BarSerdsc ;
   private String AV156ColNom_v ;
   private String AV172ForColNom ;
   private String Gx_msg ;
   private String GXv_char2[] ;
   private String AV233ParcodNom ;
   private String GXv_char4[] ;
   private String AV169FlagBH ;
   private String A279CliNom ;
   private String A1652BarSerDsc ;
   private String A1234BarNomCli ;
   private String A507HbaBarPar ;
   private String A535HbaSer ;
   private String A2627HbaSerDsc ;
   private String A509HbaColNom ;
   private String AV236Proforcod ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A764ProForCod ;
   private String A6039RecAcab ;
   private String A4494HreBarPar ;
   private String A4551HreProCod ;
   private java.util.Date AV180hISPRODTI ;
   private java.util.Date AV179hISPRODTF ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A558HisProFec ;
   private boolean returnInSub ;
   private boolean n656ParCod ;
   private boolean n1011TipMaqCod ;
   private boolean n4441HisProDTF ;
   private boolean n4440HisProDTI ;
   private boolean brk8XV3 ;
   private boolean n606MaqDsc ;
   private boolean n6399MaqKgsId ;
   private boolean n252CliCod ;
   private boolean n535HbaSer ;
   private boolean n2627HbaSerDsc ;
   private boolean n509HbaColNom ;
   private boolean n510HbaColNum ;
   private boolean n537HbaTipCol ;
   private boolean n6039RecAcab ;
   private String AV264File ;
   private String AV262ErrorMessage ;
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
   private int[] P08XV2_A129BarCod ;
   private byte[] P08XV2_A132BarCodReo ;
   private String[] P08XV2_A130BarCodPar ;
   private String[] P08XV2_A396EmprCod ;
   private short[] P08XV2_A656ParCod ;
   private boolean[] P08XV2_n656ParCod ;
   private int[] P08XV2_A136BarColNum ;
   private String[] P08XV2_A135BarColNom ;
   private String[] P08XV2_A212BarSer ;
   private String[] P08XV2_A1011TipMaqCod ;
   private boolean[] P08XV2_n1011TipMaqCod ;
   private java.util.Date[] P08XV2_A4441HisProDTF ;
   private boolean[] P08XV2_n4441HisProDTF ;
   private String[] P08XV2_A602MaqCod ;
   private short[] P08XV2_A6680HisproTdab ;
   private java.util.Date[] P08XV2_A4440HisProDTI ;
   private boolean[] P08XV2_n4440HisProDTI ;
   private java.util.Date[] P08XV2_A558HisProFec ;
   private int[] P08XV2_A561HisProLin ;
   private String[] P08XV3_A396EmprCod ;
   private short[] P08XV3_A656ParCod ;
   private boolean[] P08XV3_n656ParCod ;
   private String[] P08XV3_A1011TipMaqCod ;
   private boolean[] P08XV3_n1011TipMaqCod ;
   private int[] P08XV3_A136BarColNum ;
   private String[] P08XV3_A135BarColNom ;
   private String[] P08XV3_A212BarSer ;
   private java.util.Date[] P08XV3_A4441HisProDTF ;
   private boolean[] P08XV3_n4441HisProDTF ;
   private String[] P08XV3_A602MaqCod ;
   private String[] P08XV3_A3610HisProLot ;
   private java.math.BigDecimal[] P08XV3_A1525HisProKgr ;
   private String[] P08XV3_A130BarCodPar ;
   private byte[] P08XV3_A132BarCodReo ;
   private int[] P08XV3_A129BarCod ;
   private short[] P08XV3_A6680HisproTdab ;
   private java.util.Date[] P08XV3_A4440HisProDTI ;
   private boolean[] P08XV3_n4440HisProDTI ;
   private String[] P08XV3_A606MaqDsc ;
   private boolean[] P08XV3_n606MaqDsc ;
   private int[] P08XV3_A561HisProLin ;
   private java.util.Date[] P08XV3_A558HisProFec ;
   private java.math.BigDecimal[] P08XV3_A6399MaqKgsId ;
   private boolean[] P08XV3_n6399MaqKgsId ;
   private String[] P08XV4_A396EmprCod ;
   private String[] P08XV4_A130BarCodPar ;
   private byte[] P08XV4_A132BarCodReo ;
   private int[] P08XV4_A129BarCod ;
   private int[] P08XV4_A252CliCod ;
   private boolean[] P08XV4_n252CliCod ;
   private String[] P08XV4_A279CliNom ;
   private String[] P08XV4_A212BarSer ;
   private String[] P08XV4_A1652BarSerDsc ;
   private String[] P08XV4_A1234BarNomCli ;
   private int[] P08XV4_A136BarColNum ;
   private byte[] P08XV4_A218BarTipCol ;
   private String[] P08XV5_A396EmprCod ;
   private String[] P08XV5_A507HbaBarPar ;
   private byte[] P08XV5_A508HbaBarReo ;
   private int[] P08XV5_A506HbaBarCod ;
   private int[] P08XV5_A252CliCod ;
   private boolean[] P08XV5_n252CliCod ;
   private String[] P08XV5_A279CliNom ;
   private String[] P08XV5_A535HbaSer ;
   private boolean[] P08XV5_n535HbaSer ;
   private String[] P08XV5_A2627HbaSerDsc ;
   private boolean[] P08XV5_n2627HbaSerDsc ;
   private String[] P08XV5_A509HbaColNom ;
   private boolean[] P08XV5_n509HbaColNom ;
   private int[] P08XV5_A510HbaColNum ;
   private boolean[] P08XV5_n510HbaColNum ;
   private byte[] P08XV5_A537HbaTipCol ;
   private boolean[] P08XV5_n537HbaTipCol ;
   private String[] P08XV6_A396EmprCod ;
   private byte[] P08XV6_A831TipColCod ;
   private int[] P08XV6_A483ForColNum ;
   private String[] P08XV6_A482ForColNom ;
   private String[] P08XV6_A494ForSer ;
   private int[] P08XV6_A252CliCod ;
   private boolean[] P08XV6_n252CliCod ;
   private short[] P08XV6_A771ProForTie ;
   private String[] P08XV6_A764ProForCod ;
   private int[] P08XV6_A2393ProNumRec ;
   private short[] P08XV6_A1160ProForL ;
   private String[] P08XV7_A396EmprCod ;
   private String[] P08XV7_A6039RecAcab ;
   private boolean[] P08XV7_n6039RecAcab ;
   private String[] P08XV7_A130BarCodPar ;
   private byte[] P08XV7_A132BarCodReo ;
   private int[] P08XV7_A129BarCod ;
   private short[] P08XV7_A2804RecLinMaq ;
   private String[] P08XV8_A396EmprCod ;
   private String[] P08XV8_A6039RecAcab ;
   private boolean[] P08XV8_n6039RecAcab ;
   private String[] P08XV8_A130BarCodPar ;
   private byte[] P08XV8_A132BarCodReo ;
   private int[] P08XV8_A129BarCod ;
   private short[] P08XV8_A771ProForTie ;
   private String[] P08XV8_A764ProForCod ;
   private int[] P08XV8_A2393ProNumRec ;
   private byte[] P08XV8_A1273RecLinPro ;
   private short[] P08XV8_A2804RecLinMaq ;
   private String[] P08XV9_A396EmprCod ;
   private String[] P08XV9_A4494HreBarPar ;
   private byte[] P08XV9_A4493HreBarReo ;
   private int[] P08XV9_A4492HreBarCod ;
   private short[] P08XV9_A4545HreLinMaq ;
   private byte[] P08XV9_A4495HreNumCie ;
   private String[] P08XV10_A396EmprCod ;
   private String[] P08XV10_A4494HreBarPar ;
   private byte[] P08XV10_A4493HreBarReo ;
   private int[] P08XV10_A4492HreBarCod ;
   private short[] P08XV10_A4553HreProTie ;
   private String[] P08XV10_A4551HreProCod ;
   private int[] P08XV10_A4556HreNumRec ;
   private byte[] P08XV10_A4550HreLinPro ;
   private short[] P08XV10_A4545HreLinMaq ;
   private byte[] P08XV10_A4495HreNumCie ;
   private com.genexus.gxoffice.ExcelDoc AV263ExcelDocument ;
}

final  class pxmlpt11toexcel__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08XV2", "SELECT T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.EmprCod, T1.ParCod, T3.BarColNum, T3.BarColNom, T3.BarSer, T2.TipMaqCod, T1.HisProDTF, T1.MaqCod, T1.HisproTdab, T1.HisProDTI, T1.HisProFec, T1.HisProLin FROM ((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.ParCod > 0) AND (T1.MaqCod >= ? and T1.MaqCod <= ?) AND (T1.HisProDTF >= ? and T1.HisProDTF <= ?) AND (T2.TipMaqCod = ? or (rtrim(?) IS NULL)) AND (T3.BarSer >= ? and T3.BarSer <= ?) AND (T3.BarColNom >= ? and T3.BarColNom <= ?) AND (T3.BarColNum >= ? and T3.BarColNum <= ?) ORDER BY T1.EmprCod, T1.ParCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08XV3", "SELECT T1.EmprCod, T1.ParCod, T2.TipMaqCod, T3.BarColNum, T3.BarColNom, T3.BarSer, T1.HisProDTF, T1.MaqCod, T1.HisProLot, T1.HisProKgr, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.HisproTdab, T1.HisProDTI, T2.MaqDsc, T1.HisProLin, T1.HisProFec, T2.MaqKgsId FROM ((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.MaqCod >= ?) AND (T1.HisProDTF >= ? and T1.HisProDTF <= ?) AND (T2.TipMaqCod = ? or (rtrim(?) IS NULL)) AND (T3.BarSer >= ? and T3.BarSer <= ?) AND (T3.BarColNom >= ? and T3.BarColNom <= ?) AND (T3.BarColNum >= ? and T3.BarColNum <= ?) AND ((T1.ParCod = 0)) AND (T1.MaqCod <= ?) ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec, T1.HisProLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08XV4", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.CliCod, T2.CliNom, T1.BarSer, T1.BarSerDsc, T1.BarNomCli, T1.BarColNum, T1.BarTipCol FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08XV5", "SELECT T1.EmprCod, T1.HbaBarPar, T1.HbaBarReo, T1.HbaBarCod, T1.CliCod, T2.CliNom, T1.HbaSer, T1.HbaSerDsc, T1.HbaColNom, T1.HbaColNum, T1.HbaTipCol FROM (TXPHISBAR T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.HbaBarCod = ? and T1.HbaBarReo = ? and T1.HbaBarPar = ? ORDER BY T1.EmprCod, T1.HbaBarCod, T1.HbaBarReo, T1.HbaBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08XV6", "SELECT T1.EmprCod, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T2.ProForTie, T1.ProForCod, T2.ProNumRec, T1.ProForL FROM (TXPLFORMU T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ProForL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08XV7", "SELECT EmprCod, RecAcab, BarCodPar, BarCodReo, BarCod, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08XV8", "SELECT T1.EmprCod, T3.RecAcab, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.ProForTie, T1.ProForCod, T2.ProNumRec, T1.RecLinPro, T1.RecLinMaq FROM ((TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) INNER JOIN TXPRECMAQ T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND T3.RecLinMaq = T1.RecLinMaq) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08XV9", "SELECT EmprCod, HreBarPar, HreBarReo, HreBarCod, HreLinMaq, HreNumCie FROM TXPHISREM WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08XV10", "SELECT EmprCod, HreBarPar, HreBarReo, HreBarCod, HreProTie, HreProCod, HreNumRec, HreLinPro, HreLinMaq, HreNumCie FROM TXPHISREC WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 16);
               ((String[]) buf[9])[0] = rslt.getString(9, 4);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(10);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 6);
               ((short[]) buf[14])[0] = rslt.getShort(12);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(13);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDate(14);
               ((int[]) buf[18])[0] = rslt.getInt(15);
               return;
            case 1 :
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
            case 2 :
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
            case 3 :
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
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((short[]) buf[6])[0] = rslt.getShort(6);
               return;
            case 6 :
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
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 8 :
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
               stmt.setString(3, (String)parms[2], 6);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setString(6, (String)parms[5], 4);
               stmt.setString(7, (String)parms[6], 4);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setString(9, (String)parms[8], 16);
               stmt.setString(10, (String)parms[9], 13);
               stmt.setString(11, (String)parms[10], 13);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               return;
            case 1 :
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
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

