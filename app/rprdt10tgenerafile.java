package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rprdt10tgenerafile extends GXProcedure
{
   public rprdt10tgenerafile( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rprdt10tgenerafile.class ), "" );
   }

   public rprdt10tgenerafile( int remoteHandle ,
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
                             int[] aP12 )
   {
      rprdt10tgenerafile.this.aP13 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
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
                        String[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
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
                             String[] aP13 )
   {
      rprdt10tgenerafile.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rprdt10tgenerafile.this.AV8PMaqCod = aP1[0];
      this.aP1 = aP1;
      rprdt10tgenerafile.this.AV9UMaqCod = aP2[0];
      this.aP2 = aP2;
      rprdt10tgenerafile.this.AV90Hisprodti = aP3[0];
      this.aP3 = aP3;
      rprdt10tgenerafile.this.AV91Hisprodtf = aP4[0];
      this.aP4 = aP4;
      rprdt10tgenerafile.this.AV89TipMaqCod = aP5[0];
      this.aP5 = aP5;
      rprdt10tgenerafile.this.AV92Filename = aP6[0];
      this.aP6 = aP6;
      rprdt10tgenerafile.this.AV95Artcodi = aP7[0];
      this.aP7 = aP7;
      rprdt10tgenerafile.this.AV96Artcodf = aP8[0];
      this.aP8 = aP8;
      rprdt10tgenerafile.this.AV97barcolnomi = aP9[0];
      this.aP9 = aP9;
      rprdt10tgenerafile.this.AV99barcolnomf = aP10[0];
      this.aP10 = aP10;
      rprdt10tgenerafile.this.AV100barcolnumi = aP11[0];
      this.aP11 = aP11;
      rprdt10tgenerafile.this.AV98Barcolnumf = aP12[0];
      this.aP12 = aP12;
      rprdt10tgenerafile.this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV66FlagTiReal ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TIREAL", ""), GXv_int1) ;
      rprdt10tgenerafile.this.AV66FlagTiReal = GXv_int1[0] ;
      AV101Planom = AV92Filename ;
      AV105File.setSource( AV101Planom );
      AV105File.openWrite("");
      if ( ! (0==AV105File.getErrCode()) )
      {
         AV101Planom = "" ;
         Gx_msg = httpContext.getMessage( "Error de apertura del archivo ", "") + AV101Planom ;
         httpContext.GX_msglist.addItem(Gx_msg);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else
      {
         AV104Linea = " " ;
         AV104Linea = httpContext.getMessage( "Maquina", "") + ";" + httpContext.getMessage( "Descripcion", "") + ";" + httpContext.getMessage( "HDR", "") + ";" + httpContext.getMessage( "Cliente", "") + ";" + httpContext.getMessage( "Articulo", "") + ";" + httpContext.getMessage( "Color", "") + ";" + httpContext.getMessage( "Numero Color", "") + ";" + httpContext.getMessage( "TC", "") + ";" + httpContext.getMessage( "Kilos", "") + ";" + httpContext.getMessage( "Tiempo", "") + ";" ;
         AV104Linea += httpContext.getMessage( "Hhmm", "") + ";" + httpContext.getMessage( "Tiempo Final", "") + ";" + httpContext.getMessage( "HHmm", "") + ";" + httpContext.getMessage( "Peso Ideal", "") + ";" + httpContext.getMessage( "Diferencia", "") + ";" + httpContext.getMessage( "Operario", "") + ";" + httpContext.getMessage( "Lote", "") ;
         /* Execute user subroutine: 'WRITELINE &LINEA' */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV104Linea = " " ;
         AV86Tot_dift = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P08XY2 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV8PMaqCod, AV90Hisprodti, AV91Hisprodtf, AV90Hisprodti, AV91Hisprodtf, AV95Artcodi, AV96Artcodf, AV97barcolnomi, AV99barcolnomf, Integer.valueOf(AV100barcolnumi), Integer.valueOf(AV98Barcolnumf), AV89TipMaqCod, AV89TipMaqCod, AV9UMaqCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            brk8XY2 = false ;
            A656ParCod = P08XY2_A656ParCod[0] ;
            n656ParCod = P08XY2_n656ParCod[0] ;
            A1011TipMaqCod = P08XY2_A1011TipMaqCod[0] ;
            n1011TipMaqCod = P08XY2_n1011TipMaqCod[0] ;
            A136BarColNum = P08XY2_A136BarColNum[0] ;
            A135BarColNom = P08XY2_A135BarColNom[0] ;
            A212BarSer = P08XY2_A212BarSer[0] ;
            A602MaqCod = P08XY2_A602MaqCod[0] ;
            A556HisProEst = P08XY2_A556HisProEst[0] ;
            A461Fase = P08XY2_A461Fase[0] ;
            A129BarCod = P08XY2_A129BarCod[0] ;
            A132BarCodReo = P08XY2_A132BarCodReo[0] ;
            A130BarCodPar = P08XY2_A130BarCodPar[0] ;
            A1525HisProKgr = P08XY2_A1525HisProKgr[0] ;
            A606MaqDsc = P08XY2_A606MaqDsc[0] ;
            n606MaqDsc = P08XY2_n606MaqDsc[0] ;
            A503GruOpeCod = P08XY2_A503GruOpeCod[0] ;
            A3610HisProLot = P08XY2_A3610HisProLot[0] ;
            A6399MaqKgsId = P08XY2_A6399MaqKgsId[0] ;
            n6399MaqKgsId = P08XY2_n6399MaqKgsId[0] ;
            A4440HisProDTI = P08XY2_A4440HisProDTI[0] ;
            n4440HisProDTI = P08XY2_n4440HisProDTI[0] ;
            A4441HisProDTF = P08XY2_A4441HisProDTF[0] ;
            n4441HisProDTF = P08XY2_n4441HisProDTF[0] ;
            A563HisProMin = P08XY2_A563HisProMin[0] ;
            A560HisProHin = P08XY2_A560HisProHin[0] ;
            A562HisProMfi = P08XY2_A562HisProMfi[0] ;
            A559HisProHfi = P08XY2_A559HisProHfi[0] ;
            A558HisProFec = P08XY2_A558HisProFec[0] ;
            A561HisProLin = P08XY2_A561HisProLin[0] ;
            A1011TipMaqCod = P08XY2_A1011TipMaqCod[0] ;
            n1011TipMaqCod = P08XY2_n1011TipMaqCod[0] ;
            A606MaqDsc = P08XY2_A606MaqDsc[0] ;
            n606MaqDsc = P08XY2_n606MaqDsc[0] ;
            A6399MaqKgsId = P08XY2_A6399MaqKgsId[0] ;
            n6399MaqKgsId = P08XY2_n6399MaqKgsId[0] ;
            A136BarColNum = P08XY2_A136BarColNum[0] ;
            A135BarColNom = P08XY2_A135BarColNom[0] ;
            A212BarSer = P08XY2_A212BarSer[0] ;
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
            AV30TotKgs = DecimalUtil.doubleToDec(0) ;
            AV31TotMinT = 0 ;
            AV33NTin = 0 ;
            AV56HisProLot = "" ;
            AV67Gruopecod = 0 ;
            AV68TotMinTp = 0 ;
            AV80Sum_kgs = DecimalUtil.doubleToDec(0) ;
            AV82MaqKgsId = A6399MaqKgsId ;
            AV85Tot_dif = DecimalUtil.doubleToDec(0) ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08XY2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08XY2_A602MaqCod[0], A602MaqCod) == 0 ) )
            {
               brk8XY2 = false ;
               A656ParCod = P08XY2_A656ParCod[0] ;
               n656ParCod = P08XY2_n656ParCod[0] ;
               A1011TipMaqCod = P08XY2_A1011TipMaqCod[0] ;
               n1011TipMaqCod = P08XY2_n1011TipMaqCod[0] ;
               A136BarColNum = P08XY2_A136BarColNum[0] ;
               A135BarColNom = P08XY2_A135BarColNom[0] ;
               A212BarSer = P08XY2_A212BarSer[0] ;
               A556HisProEst = P08XY2_A556HisProEst[0] ;
               A461Fase = P08XY2_A461Fase[0] ;
               A129BarCod = P08XY2_A129BarCod[0] ;
               A132BarCodReo = P08XY2_A132BarCodReo[0] ;
               A130BarCodPar = P08XY2_A130BarCodPar[0] ;
               A1525HisProKgr = P08XY2_A1525HisProKgr[0] ;
               A606MaqDsc = P08XY2_A606MaqDsc[0] ;
               n606MaqDsc = P08XY2_n606MaqDsc[0] ;
               A503GruOpeCod = P08XY2_A503GruOpeCod[0] ;
               A3610HisProLot = P08XY2_A3610HisProLot[0] ;
               A4440HisProDTI = P08XY2_A4440HisProDTI[0] ;
               n4440HisProDTI = P08XY2_n4440HisProDTI[0] ;
               A4441HisProDTF = P08XY2_A4441HisProDTF[0] ;
               n4441HisProDTF = P08XY2_n4441HisProDTF[0] ;
               A563HisProMin = P08XY2_A563HisProMin[0] ;
               A560HisProHin = P08XY2_A560HisProHin[0] ;
               A562HisProMfi = P08XY2_A562HisProMfi[0] ;
               A559HisProHfi = P08XY2_A559HisProHfi[0] ;
               A558HisProFec = P08XY2_A558HisProFec[0] ;
               A561HisProLin = P08XY2_A561HisProLin[0] ;
               A1011TipMaqCod = P08XY2_A1011TipMaqCod[0] ;
               n1011TipMaqCod = P08XY2_n1011TipMaqCod[0] ;
               A606MaqDsc = P08XY2_A606MaqDsc[0] ;
               n606MaqDsc = P08XY2_n606MaqDsc[0] ;
               A136BarColNum = P08XY2_A136BarColNum[0] ;
               A135BarColNom = P08XY2_A135BarColNom[0] ;
               A212BarSer = P08XY2_A212BarSer[0] ;
               if ( ( GXutil.strcmp(A602MaqCod, AV8PMaqCod) >= 0 ) && ( GXutil.strcmp(A602MaqCod, AV9UMaqCod) <= 0 ) )
               {
                  if ( ( GXutil.strcmp(A212BarSer, AV95Artcodi) >= 0 ) && ( GXutil.strcmp(A212BarSer, AV96Artcodf) <= 0 ) )
                  {
                     if ( ( GXutil.strcmp(A135BarColNom, AV97barcolnomi) >= 0 ) && ( GXutil.strcmp(A135BarColNom, AV99barcolnomf) <= 0 ) )
                     {
                        if ( ( A136BarColNum >= AV100barcolnumi ) && ( A136BarColNum <= AV98Barcolnumf ) )
                        {
                           if ( ( GXutil.strcmp(A1011TipMaqCod, AV89TipMaqCod) == 0 ) || (GXutil.strcmp("", AV89TipMaqCod)==0) )
                           {
                              if ( (( A4440HisProDTI.after( AV90Hisprodti ) ) || ( GXutil.dateCompare(A4440HisProDTI, AV90Hisprodti) )) && (( A4441HisProDTF.before( AV91Hisprodtf ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV91Hisprodtf) )) )
                              {
                                 if ( (( A4441HisProDTF.after( AV90Hisprodti ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV90Hisprodti) )) )
                                 {
                                    if ( (( A4440HisProDTI.before( AV91Hisprodtf ) ) || ( GXutil.dateCompare(A4440HisProDTI, AV91Hisprodtf) )) )
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
                                          AV12HisProTre = (short)(0) ;
                                          if ( A556HisProEst != 0 )
                                          {
                                             if ( AV66FlagTiReal == 0 )
                                             {
                                                AV12HisProTre = A564HisProTre ;
                                             }
                                             else
                                             {
                                                AV12HisProTre = A5605HisProTr2 ;
                                             }
                                          }
                                          AV29FlagMarca = (byte)(0) ;
                                          GXv_char2[0] = A396EmprCod ;
                                          GXv_char3[0] = A461Fase ;
                                          GXv_char4[0] = AV57FasActTin ;
                                          new app.pfasest(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
                                          rprdt10tgenerafile.this.A396EmprCod = GXv_char2[0] ;
                                          rprdt10tgenerafile.this.A461Fase = GXv_char3[0] ;
                                          rprdt10tgenerafile.this.AV57FasActTin = GXv_char4[0] ;
                                          AV13BarCod = A129BarCod ;
                                          AV14BarCodReo = A132BarCodReo ;
                                          AV15BarCodPar = A130BarCodPar ;
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
                                          if ( ( GXutil.strcmp(AV57FasActTin, httpContext.getMessage( "N", "")) == 0 ) && (0==A656ParCod) )
                                          {
                                             AV29FlagMarca = (byte)(1) ;
                                          }
                                          AV61HorRea = (short)(GXutil.Int( AV12HisProTre/ (double) (60))) ;
                                          AV62HorReaint = (short)(GXutil.Int( AV61HorRea)) ;
                                          AV64MinRea = (byte)(AV12HisProTre-(AV62HorReaint*60)) ;
                                          AV65MinRea2 = DecimalUtil.doubleToDec(AV64MinRea/ (double) (100)) ;
                                          AV24HmP = DecimalUtil.doubleToDec(AV62HorReaint).add(AV65MinRea2) ;
                                          AV61HorRea = (short)(GXutil.Int( AV22TiempoF/ (double) (60))) ;
                                          AV62HorReaint = (short)(GXutil.Int( AV61HorRea)) ;
                                          AV64MinRea = (byte)(AV22TiempoF-(AV62HorReaint*60)) ;
                                          AV65MinRea2 = DecimalUtil.doubleToDec(AV64MinRea/ (double) (100)) ;
                                          AV25HmF = DecimalUtil.doubleToDec(AV62HorReaint).add(AV65MinRea2) ;
                                          AV30TotKgs = AV30TotKgs.add(A1525HisProKgr) ;
                                          if ( GXutil.strcmp(AV56HisProLot, A3610HisProLot) != 0 )
                                          {
                                             AV33NTin = (int)(AV33NTin+1) ;
                                             AV68TotMinTp = (int)(AV68TotMinTp+AV12HisProTre) ;
                                          }
                                          if ( ( GXutil.strcmp(AV56HisProLot, A3610HisProLot) == 0 ) && ( AV67Gruopecod != A503GruOpeCod ) )
                                          {
                                             AV68TotMinTp = (int)(AV68TotMinTp+AV12HisProTre) ;
                                          }
                                          if ( ( GXutil.strcmp(AV56HisProLot, A3610HisProLot) != 0 ) && ! (GXutil.strcmp("", AV56HisProLot)==0) )
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
                                             AV80Sum_kgs = A1525HisProKgr ;
                                             AV81Sum_t = AV12HisProTre ;
                                          }
                                          if ( ( ( GXutil.strcmp(AV56HisProLot, A3610HisProLot) == 0 ) ) || ( GXutil.strcmp(AV56HisProLot, " ") == 0 ) )
                                          {
                                             AV80Sum_kgs = AV80Sum_kgs.add(A1525HisProKgr) ;
                                             if ( AV67Gruopecod != A503GruOpeCod )
                                             {
                                                AV81Sum_t = (short)(AV81Sum_t+AV12HisProTre) ;
                                             }
                                          }
                                          AV13BarCod = A129BarCod ;
                                          AV14BarCodReo = A132BarCodReo ;
                                          AV15BarCodPar = A130BarCodPar ;
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
                                          AV73Fila = (byte)(AV73Fila+1) ;
                                          AV72Columna = (byte)(1) ;
                                          AV70Hdr = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
                                          if ( (0==A656ParCod) )
                                          {
                                             AV104Linea = A602MaqCod + ";" + A606MaqDsc + ";" + AV70Hdr + ";" + AV83CliNom + ";" + AV17ForSer + ";" + AV18ForColNom + ";" + GXutil.str( AV19ForColNum, 6, 0) + ";" + GXutil.str( AV20TipColCod, 2, 0) + ";" + GXutil.str( A1525HisProKgr, 9, 2) + ";" + GXutil.str( AV12HisProTre, 4, 0) + ";" ;
                                             AV104Linea += GXutil.str( AV24HmP, 7, 2) + ";" + GXutil.str( AV22TiempoF, 4, 0) + ";" + GXutil.str( AV25HmF, 7, 2) + ";" + GXutil.str( AV82MaqKgsId, 9, 2) + ";" + GXutil.str( AV79DifPes, 10, 2) + ";" + GXutil.str( A503GruOpeCod, 6, 0) + ";" + A3610HisProLot ;
                                             /* Execute user subroutine: 'WRITELINE &LINEA' */
                                             S141 ();
                                             if ( returnInSub )
                                             {
                                                pr_default.close(0);
                                                pr_default.close(0);
                                                pr_default.close(0);
                                                returnInSub = true;
                                                cleanup();
                                                if (true) return;
                                             }
                                             AV104Linea = " " ;
                                          }
                                          AV56HisProLot = A3610HisProLot ;
                                          AV67Gruopecod = A503GruOpeCod ;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
               brk8XY2 = true ;
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
            AV61HorRea = (short)(GXutil.Int( AV31TotMinT/ (double) (60))) ;
            AV62HorReaint = (short)(GXutil.Int( AV61HorRea)) ;
            AV64MinRea = (byte)(AV31TotMinT-(AV62HorReaint*60)) ;
            AV65MinRea2 = DecimalUtil.doubleToDec(AV64MinRea/ (double) (100)) ;
            AV24HmP = DecimalUtil.doubleToDec(AV62HorReaint).add(AV65MinRea2) ;
            AV34TiempoNP = DecimalUtil.doubleToDec(0) ;
            if ( ! (0==AV33NTin) )
            {
               AV34TiempoNP = AV24HmP.divide(DecimalUtil.doubleToDec(AV33NTin), 18, java.math.RoundingMode.DOWN) ;
            }
            if ( ! brk8XY2 )
            {
               brk8XY2 = true ;
               pr_default.readNext(0);
            }
         }
         pr_default.close(0);
         AV105File.close();
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'IMP_LINEA' Routine */
      returnInSub = false ;
   }

   public void S121( )
   {
      /* 'LEOHDR' Routine */
      returnInSub = false ;
      AV21CliCod = 999999 ;
      AV83CliNom = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX" ;
      AV17ForSer = "XXXXXXXXXXXXXXXX" ;
      AV71BarSerdsc = "XXXXXXXXXXXXXXXXXXXXXXXXXX" ;
      AV18ForColNom = "XXXXXXXXXXXXX" ;
      AV19ForColNum = 999999 ;
      AV20TipColCod = (byte)(99) ;
      AV16FlagBarcad = (byte)(0) ;
      AV32FlagBH = "X" ;
      /* Using cursor P08XY3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV13BarCod), Byte.valueOf(AV14BarCodReo), AV15BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P08XY3_A130BarCodPar[0] ;
         A132BarCodReo = P08XY3_A132BarCodReo[0] ;
         A129BarCod = P08XY3_A129BarCod[0] ;
         A252CliCod = P08XY3_A252CliCod[0] ;
         n252CliCod = P08XY3_n252CliCod[0] ;
         A279CliNom = P08XY3_A279CliNom[0] ;
         A212BarSer = P08XY3_A212BarSer[0] ;
         A1652BarSerDsc = P08XY3_A1652BarSerDsc[0] ;
         A135BarColNom = P08XY3_A135BarColNom[0] ;
         A136BarColNum = P08XY3_A136BarColNum[0] ;
         A218BarTipCol = P08XY3_A218BarTipCol[0] ;
         A279CliNom = P08XY3_A279CliNom[0] ;
         AV16FlagBarcad = (byte)(1) ;
         AV32FlagBH = httpContext.getMessage( "B", "") ;
         AV21CliCod = A252CliCod ;
         AV83CliNom = A279CliNom ;
         AV17ForSer = A212BarSer ;
         AV71BarSerdsc = A1652BarSerDsc ;
         AV18ForColNom = A135BarColNom ;
         AV19ForColNum = A136BarColNum ;
         AV20TipColCod = A218BarTipCol ;
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
      if ( AV16FlagBarcad == 0 )
      {
         /* Using cursor P08XY4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV13BarCod), Byte.valueOf(AV14BarCodReo), AV15BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A507HbaBarPar = P08XY4_A507HbaBarPar[0] ;
            A508HbaBarReo = P08XY4_A508HbaBarReo[0] ;
            A506HbaBarCod = P08XY4_A506HbaBarCod[0] ;
            A252CliCod = P08XY4_A252CliCod[0] ;
            n252CliCod = P08XY4_n252CliCod[0] ;
            A279CliNom = P08XY4_A279CliNom[0] ;
            A535HbaSer = P08XY4_A535HbaSer[0] ;
            n535HbaSer = P08XY4_n535HbaSer[0] ;
            A2627HbaSerDsc = P08XY4_A2627HbaSerDsc[0] ;
            n2627HbaSerDsc = P08XY4_n2627HbaSerDsc[0] ;
            A509HbaColNom = P08XY4_A509HbaColNom[0] ;
            n509HbaColNom = P08XY4_n509HbaColNom[0] ;
            A510HbaColNum = P08XY4_A510HbaColNum[0] ;
            n510HbaColNum = P08XY4_n510HbaColNum[0] ;
            A537HbaTipCol = P08XY4_A537HbaTipCol[0] ;
            n537HbaTipCol = P08XY4_n537HbaTipCol[0] ;
            A279CliNom = P08XY4_A279CliNom[0] ;
            AV32FlagBH = httpContext.getMessage( "H", "") ;
            AV21CliCod = A252CliCod ;
            AV83CliNom = A279CliNom ;
            AV17ForSer = A535HbaSer ;
            AV71BarSerdsc = A2627HbaSerDsc ;
            AV18ForColNom = A509HbaColNom ;
            AV19ForColNum = A510HbaColNum ;
            AV20TipColCod = A537HbaTipCol ;
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
      AV22TiempoF = (short)(0) ;
      /* Optimized group. */
      /* Using cursor P08XY5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV21CliCod), AV17ForSer, AV18ForColNom, Integer.valueOf(AV19ForColNum), Byte.valueOf(AV20TipColCod)});
      c771ProForTie = P08XY5_A771ProForTie[0] ;
      pr_default.close(3);
      AV22TiempoF = (short)(AV22TiempoF+c771ProForTie) ;
      /* End optimized group. */
   }

   public void S141( )
   {
      /* 'WRITELINE &LINEA' Routine */
      returnInSub = false ;
      AV105File.writeLine(GXutil.trim( AV104Linea));
      if ( ! (0==AV105File.getErrCode()) )
      {
         AV101Planom = "" ;
         Gx_msg = httpContext.getMessage( "Error de grabacion en el fichero ", "") + AV101Planom ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = rprdt10tgenerafile.this.A396EmprCod;
      this.aP1[0] = rprdt10tgenerafile.this.AV8PMaqCod;
      this.aP2[0] = rprdt10tgenerafile.this.AV9UMaqCod;
      this.aP3[0] = rprdt10tgenerafile.this.AV90Hisprodti;
      this.aP4[0] = rprdt10tgenerafile.this.AV91Hisprodtf;
      this.aP5[0] = rprdt10tgenerafile.this.AV89TipMaqCod;
      this.aP6[0] = rprdt10tgenerafile.this.AV92Filename;
      this.aP7[0] = rprdt10tgenerafile.this.AV95Artcodi;
      this.aP8[0] = rprdt10tgenerafile.this.AV96Artcodf;
      this.aP9[0] = rprdt10tgenerafile.this.AV97barcolnomi;
      this.aP10[0] = rprdt10tgenerafile.this.AV99barcolnomf;
      this.aP11[0] = rprdt10tgenerafile.this.AV100barcolnumi;
      this.aP12[0] = rprdt10tgenerafile.this.AV98Barcolnumf;
      this.aP13[0] = rprdt10tgenerafile.this.AV101Planom;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV101Planom = "" ;
      GXv_int1 = new byte[1] ;
      AV105File = new com.genexus.util.GXFile();
      Gx_msg = "" ;
      AV104Linea = "" ;
      AV86Tot_dift = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P08XY2_A396EmprCod = new String[] {""} ;
      P08XY2_A656ParCod = new short[1] ;
      P08XY2_n656ParCod = new boolean[] {false} ;
      P08XY2_A1011TipMaqCod = new String[] {""} ;
      P08XY2_n1011TipMaqCod = new boolean[] {false} ;
      P08XY2_A136BarColNum = new int[1] ;
      P08XY2_A135BarColNom = new String[] {""} ;
      P08XY2_A212BarSer = new String[] {""} ;
      P08XY2_A602MaqCod = new String[] {""} ;
      P08XY2_A556HisProEst = new byte[1] ;
      P08XY2_A461Fase = new String[] {""} ;
      P08XY2_A129BarCod = new int[1] ;
      P08XY2_A132BarCodReo = new byte[1] ;
      P08XY2_A130BarCodPar = new String[] {""} ;
      P08XY2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08XY2_A606MaqDsc = new String[] {""} ;
      P08XY2_n606MaqDsc = new boolean[] {false} ;
      P08XY2_A503GruOpeCod = new int[1] ;
      P08XY2_A3610HisProLot = new String[] {""} ;
      P08XY2_A6399MaqKgsId = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08XY2_n6399MaqKgsId = new boolean[] {false} ;
      P08XY2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08XY2_n4440HisProDTI = new boolean[] {false} ;
      P08XY2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08XY2_n4441HisProDTF = new boolean[] {false} ;
      P08XY2_A563HisProMin = new byte[1] ;
      P08XY2_A560HisProHin = new byte[1] ;
      P08XY2_A562HisProMfi = new byte[1] ;
      P08XY2_A559HisProHfi = new byte[1] ;
      P08XY2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08XY2_A561HisProLin = new int[1] ;
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
      AV30TotKgs = DecimalUtil.ZERO ;
      AV56HisProLot = "" ;
      AV80Sum_kgs = DecimalUtil.ZERO ;
      AV82MaqKgsId = DecimalUtil.ZERO ;
      AV85Tot_dif = DecimalUtil.ZERO ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      AV57FasActTin = "" ;
      GXv_char4 = new String[1] ;
      AV15BarCodPar = "" ;
      AV65MinRea2 = DecimalUtil.ZERO ;
      AV24HmP = DecimalUtil.ZERO ;
      AV25HmF = DecimalUtil.ZERO ;
      AV70Hdr = "" ;
      AV83CliNom = "" ;
      AV17ForSer = "" ;
      AV18ForColNom = "" ;
      AV79DifPes = DecimalUtil.ZERO ;
      AV34TiempoNP = DecimalUtil.ZERO ;
      AV71BarSerdsc = "" ;
      AV32FlagBH = "" ;
      P08XY3_A396EmprCod = new String[] {""} ;
      P08XY3_A130BarCodPar = new String[] {""} ;
      P08XY3_A132BarCodReo = new byte[1] ;
      P08XY3_A129BarCod = new int[1] ;
      P08XY3_A252CliCod = new int[1] ;
      P08XY3_n252CliCod = new boolean[] {false} ;
      P08XY3_A279CliNom = new String[] {""} ;
      P08XY3_A212BarSer = new String[] {""} ;
      P08XY3_A1652BarSerDsc = new String[] {""} ;
      P08XY3_A135BarColNom = new String[] {""} ;
      P08XY3_A136BarColNum = new int[1] ;
      P08XY3_A218BarTipCol = new byte[1] ;
      A279CliNom = "" ;
      A1652BarSerDsc = "" ;
      P08XY4_A396EmprCod = new String[] {""} ;
      P08XY4_A507HbaBarPar = new String[] {""} ;
      P08XY4_A508HbaBarReo = new byte[1] ;
      P08XY4_A506HbaBarCod = new int[1] ;
      P08XY4_A252CliCod = new int[1] ;
      P08XY4_n252CliCod = new boolean[] {false} ;
      P08XY4_A279CliNom = new String[] {""} ;
      P08XY4_A535HbaSer = new String[] {""} ;
      P08XY4_n535HbaSer = new boolean[] {false} ;
      P08XY4_A2627HbaSerDsc = new String[] {""} ;
      P08XY4_n2627HbaSerDsc = new boolean[] {false} ;
      P08XY4_A509HbaColNom = new String[] {""} ;
      P08XY4_n509HbaColNom = new boolean[] {false} ;
      P08XY4_A510HbaColNum = new int[1] ;
      P08XY4_n510HbaColNum = new boolean[] {false} ;
      P08XY4_A537HbaTipCol = new byte[1] ;
      P08XY4_n537HbaTipCol = new boolean[] {false} ;
      A507HbaBarPar = "" ;
      A535HbaSer = "" ;
      A2627HbaSerDsc = "" ;
      A509HbaColNom = "" ;
      P08XY5_A771ProForTie = new short[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rprdt10tgenerafile__default(),
         new Object[] {
             new Object[] {
            P08XY2_A396EmprCod, P08XY2_A656ParCod, P08XY2_n656ParCod, P08XY2_A1011TipMaqCod, P08XY2_n1011TipMaqCod, P08XY2_A136BarColNum, P08XY2_A135BarColNom, P08XY2_A212BarSer, P08XY2_A602MaqCod, P08XY2_A556HisProEst,
            P08XY2_A461Fase, P08XY2_A129BarCod, P08XY2_A132BarCodReo, P08XY2_A130BarCodPar, P08XY2_A1525HisProKgr, P08XY2_A606MaqDsc, P08XY2_n606MaqDsc, P08XY2_A503GruOpeCod, P08XY2_A3610HisProLot, P08XY2_A6399MaqKgsId,
            P08XY2_n6399MaqKgsId, P08XY2_A4440HisProDTI, P08XY2_n4440HisProDTI, P08XY2_A4441HisProDTF, P08XY2_n4441HisProDTF, P08XY2_A563HisProMin, P08XY2_A560HisProHin, P08XY2_A562HisProMfi, P08XY2_A559HisProHfi, P08XY2_A558HisProFec,
            P08XY2_A561HisProLin
            }
            , new Object[] {
            P08XY3_A396EmprCod, P08XY3_A130BarCodPar, P08XY3_A132BarCodReo, P08XY3_A129BarCod, P08XY3_A252CliCod, P08XY3_n252CliCod, P08XY3_A279CliNom, P08XY3_A212BarSer, P08XY3_A1652BarSerDsc, P08XY3_A135BarColNom,
            P08XY3_A136BarColNum, P08XY3_A218BarTipCol
            }
            , new Object[] {
            P08XY4_A396EmprCod, P08XY4_A507HbaBarPar, P08XY4_A508HbaBarReo, P08XY4_A506HbaBarCod, P08XY4_A252CliCod, P08XY4_n252CliCod, P08XY4_A279CliNom, P08XY4_A535HbaSer, P08XY4_n535HbaSer, P08XY4_A2627HbaSerDsc,
            P08XY4_n2627HbaSerDsc, P08XY4_A509HbaColNom, P08XY4_n509HbaColNom, P08XY4_A510HbaColNum, P08XY4_n510HbaColNum, P08XY4_A537HbaTipCol, P08XY4_n537HbaTipCol
            }
            , new Object[] {
            P08XY5_A771ProForTie
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV66FlagTiReal ;
   private byte GXv_int1[] ;
   private byte A556HisProEst ;
   private byte A132BarCodReo ;
   private byte A563HisProMin ;
   private byte A560HisProHin ;
   private byte A562HisProMfi ;
   private byte A559HisProHfi ;
   private byte AV29FlagMarca ;
   private byte AV14BarCodReo ;
   private byte AV64MinRea ;
   private byte AV73Fila ;
   private byte AV72Columna ;
   private byte AV20TipColCod ;
   private byte AV16FlagBarcad ;
   private byte A218BarTipCol ;
   private byte A508HbaBarReo ;
   private byte A537HbaTipCol ;
   private short A656ParCod ;
   private short A564HisProTre ;
   private short A5605HisProTr2 ;
   private short AV12HisProTre ;
   private short AV61HorRea ;
   private short AV62HorReaint ;
   private short AV22TiempoF ;
   private short AV81Sum_t ;
   private short c771ProForTie ;
   private short Gx_err ;
   private int AV100barcolnumi ;
   private int AV98Barcolnumf ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int A503GruOpeCod ;
   private int A561HisProLin ;
   private int AV31TotMinT ;
   private int AV33NTin ;
   private int AV67Gruopecod ;
   private int AV68TotMinTp ;
   private int AV13BarCod ;
   private int AV19ForColNum ;
   private int AV21CliCod ;
   private int A252CliCod ;
   private int A506HbaBarCod ;
   private int A510HbaColNum ;
   private java.math.BigDecimal AV86Tot_dift ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A6399MaqKgsId ;
   private java.math.BigDecimal AV30TotKgs ;
   private java.math.BigDecimal AV80Sum_kgs ;
   private java.math.BigDecimal AV82MaqKgsId ;
   private java.math.BigDecimal AV85Tot_dif ;
   private java.math.BigDecimal AV65MinRea2 ;
   private java.math.BigDecimal AV24HmP ;
   private java.math.BigDecimal AV25HmF ;
   private java.math.BigDecimal AV79DifPes ;
   private java.math.BigDecimal AV34TiempoNP ;
   private String A396EmprCod ;
   private String AV8PMaqCod ;
   private String AV9UMaqCod ;
   private String AV89TipMaqCod ;
   private String AV92Filename ;
   private String AV95Artcodi ;
   private String AV96Artcodf ;
   private String AV97barcolnomi ;
   private String AV99barcolnomf ;
   private String AV101Planom ;
   private String Gx_msg ;
   private String AV104Linea ;
   private String scmdbuf ;
   private String A1011TipMaqCod ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A602MaqCod ;
   private String A461Fase ;
   private String A130BarCodPar ;
   private String A606MaqDsc ;
   private String A3610HisProLot ;
   private String AV56HisProLot ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String AV57FasActTin ;
   private String GXv_char4[] ;
   private String AV15BarCodPar ;
   private String AV70Hdr ;
   private String AV83CliNom ;
   private String AV17ForSer ;
   private String AV18ForColNom ;
   private String AV71BarSerdsc ;
   private String AV32FlagBH ;
   private String A279CliNom ;
   private String A1652BarSerDsc ;
   private String A507HbaBarPar ;
   private String A535HbaSer ;
   private String A2627HbaSerDsc ;
   private String A509HbaColNom ;
   private java.util.Date AV90Hisprodti ;
   private java.util.Date AV91Hisprodtf ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A558HisProFec ;
   private boolean returnInSub ;
   private boolean brk8XY2 ;
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
   private com.genexus.util.GXFile AV105File ;
   private String[] aP13 ;
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
   private IDataStoreProvider pr_default ;
   private String[] P08XY2_A396EmprCod ;
   private short[] P08XY2_A656ParCod ;
   private boolean[] P08XY2_n656ParCod ;
   private String[] P08XY2_A1011TipMaqCod ;
   private boolean[] P08XY2_n1011TipMaqCod ;
   private int[] P08XY2_A136BarColNum ;
   private String[] P08XY2_A135BarColNom ;
   private String[] P08XY2_A212BarSer ;
   private String[] P08XY2_A602MaqCod ;
   private byte[] P08XY2_A556HisProEst ;
   private String[] P08XY2_A461Fase ;
   private int[] P08XY2_A129BarCod ;
   private byte[] P08XY2_A132BarCodReo ;
   private String[] P08XY2_A130BarCodPar ;
   private java.math.BigDecimal[] P08XY2_A1525HisProKgr ;
   private String[] P08XY2_A606MaqDsc ;
   private boolean[] P08XY2_n606MaqDsc ;
   private int[] P08XY2_A503GruOpeCod ;
   private String[] P08XY2_A3610HisProLot ;
   private java.math.BigDecimal[] P08XY2_A6399MaqKgsId ;
   private boolean[] P08XY2_n6399MaqKgsId ;
   private java.util.Date[] P08XY2_A4440HisProDTI ;
   private boolean[] P08XY2_n4440HisProDTI ;
   private java.util.Date[] P08XY2_A4441HisProDTF ;
   private boolean[] P08XY2_n4441HisProDTF ;
   private byte[] P08XY2_A563HisProMin ;
   private byte[] P08XY2_A560HisProHin ;
   private byte[] P08XY2_A562HisProMfi ;
   private byte[] P08XY2_A559HisProHfi ;
   private java.util.Date[] P08XY2_A558HisProFec ;
   private int[] P08XY2_A561HisProLin ;
   private String[] P08XY3_A396EmprCod ;
   private String[] P08XY3_A130BarCodPar ;
   private byte[] P08XY3_A132BarCodReo ;
   private int[] P08XY3_A129BarCod ;
   private int[] P08XY3_A252CliCod ;
   private boolean[] P08XY3_n252CliCod ;
   private String[] P08XY3_A279CliNom ;
   private String[] P08XY3_A212BarSer ;
   private String[] P08XY3_A1652BarSerDsc ;
   private String[] P08XY3_A135BarColNom ;
   private int[] P08XY3_A136BarColNum ;
   private byte[] P08XY3_A218BarTipCol ;
   private String[] P08XY4_A396EmprCod ;
   private String[] P08XY4_A507HbaBarPar ;
   private byte[] P08XY4_A508HbaBarReo ;
   private int[] P08XY4_A506HbaBarCod ;
   private int[] P08XY4_A252CliCod ;
   private boolean[] P08XY4_n252CliCod ;
   private String[] P08XY4_A279CliNom ;
   private String[] P08XY4_A535HbaSer ;
   private boolean[] P08XY4_n535HbaSer ;
   private String[] P08XY4_A2627HbaSerDsc ;
   private boolean[] P08XY4_n2627HbaSerDsc ;
   private String[] P08XY4_A509HbaColNom ;
   private boolean[] P08XY4_n509HbaColNom ;
   private int[] P08XY4_A510HbaColNum ;
   private boolean[] P08XY4_n510HbaColNum ;
   private byte[] P08XY4_A537HbaTipCol ;
   private boolean[] P08XY4_n537HbaTipCol ;
   private short[] P08XY5_A771ProForTie ;
}

final  class rprdt10tgenerafile__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08XY2", "SELECT T1.EmprCod, T1.ParCod, T2.TipMaqCod, T3.BarColNum, T3.BarColNom, T3.BarSer, T1.MaqCod, T1.HisProEst, T1.Fase, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.HisProKgr, T2.MaqDsc, T1.GruOpeCod, T1.HisProLot, T2.MaqKgsId, T1.HisProDTI, T1.HisProDTF, T1.HisProMin, T1.HisProHin, T1.HisProMfi, T1.HisProHfi, T1.HisProFec, T1.HisProLin FROM ((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.MaqCod >= ?) AND (T1.HisProDTI >= ? and T1.HisProDTF <= ?) AND (T1.HisProDTF >= ?) AND (T1.HisProDTI <= ?) AND (T3.BarSer >= ? and T3.BarSer <= ?) AND (T3.BarColNom >= ? and T3.BarColNom <= ?) AND (T3.BarColNum >= ? and T3.BarColNum <= ?) AND (T2.TipMaqCod = ? or (rtrim(?) IS NULL)) AND ((T1.ParCod = 0)) AND (T1.MaqCod <= ?) ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProLot, T1.GruOpeCod, T1.ParCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08XY3", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.CliCod, T2.CliNom, T1.BarSer, T1.BarSerDsc, T1.BarColNom, T1.BarColNum, T1.BarTipCol FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08XY4", "SELECT T1.EmprCod, T1.HbaBarPar, T1.HbaBarReo, T1.HbaBarCod, T1.CliCod, T2.CliNom, T1.HbaSer, T1.HbaSerDsc, T1.HbaColNom, T1.HbaColNum, T1.HbaTipCol FROM (TXPHISBAR T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.HbaBarCod = ? and T1.HbaBarReo = ? and T1.HbaBarPar = ? ORDER BY T1.EmprCod, T1.HbaBarCod, T1.HbaBarReo, T1.HbaBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08XY5", "SELECT SUM(T2.ProForTie) FROM (TXPLFORMU T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setDateTime(6, (java.util.Date)parms[5], false);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setString(9, (String)parms[8], 13);
               stmt.setString(10, (String)parms[9], 13);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setString(13, (String)parms[12], 4);
               stmt.setString(14, (String)parms[13], 4);
               stmt.setString(15, (String)parms[14], 6);
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

