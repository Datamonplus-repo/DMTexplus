package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rprdt11tgenerafile extends GXProcedure
{
   public rprdt11tgenerafile( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rprdt11tgenerafile.class ), "" );
   }

   public rprdt11tgenerafile( int remoteHandle ,
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
      rprdt11tgenerafile.this.aP13 = new String[] {""};
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
      rprdt11tgenerafile.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      rprdt11tgenerafile.this.AV8PMaqCod = aP1[0];
      this.aP1 = aP1;
      rprdt11tgenerafile.this.AV9UMaqCod = aP2[0];
      this.aP2 = aP2;
      rprdt11tgenerafile.this.AV110hISPRODTI = aP3[0];
      this.aP3 = aP3;
      rprdt11tgenerafile.this.AV111hISPRODTF = aP4[0];
      this.aP4 = aP4;
      rprdt11tgenerafile.this.AV89TipMaqCod = aP5[0];
      this.aP5 = aP5;
      rprdt11tgenerafile.this.AV112Filename = aP6[0];
      this.aP6 = aP6;
      rprdt11tgenerafile.this.AV115Artcodi = aP7[0];
      this.aP7 = aP7;
      rprdt11tgenerafile.this.AV116Artcodf = aP8[0];
      this.aP8 = aP8;
      rprdt11tgenerafile.this.AV117Barcolnomi = aP9[0];
      this.aP9 = aP9;
      rprdt11tgenerafile.this.AV118Barcolnomf = aP10[0];
      this.aP10 = aP10;
      rprdt11tgenerafile.this.AV119Barcolnumi = aP11[0];
      this.aP11 = aP11;
      rprdt11tgenerafile.this.AV120Barcolnumf = aP12[0];
      this.aP12 = aP12;
      rprdt11tgenerafile.this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXv_int1[0] = AV66FlagTiReal ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TIREAL", ""), GXv_int1) ;
      rprdt11tgenerafile.this.AV66FlagTiReal = GXv_int1[0] ;
      AV121Planom = AV112Filename ;
      AV125File.setSource( AV121Planom );
      AV125File.openWrite("");
      if ( ! (0==AV125File.getErrCode()) )
      {
         AV121Planom = "" ;
         Gx_msg = httpContext.getMessage( "Error de apertura del archivo ", "") + AV121Planom ;
         httpContext.GX_msglist.addItem(Gx_msg);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      else
      {
         AV123Linea = " " ;
         AV123Linea = httpContext.getMessage( "Maquina", "") + ";" + httpContext.getMessage( "Descripcion", "") + ";" + httpContext.getMessage( "HDR", "") + ";" + httpContext.getMessage( "Cliente", "") + ";" + httpContext.getMessage( "Articulo", "") + ";" + httpContext.getMessage( "Descripcion", "") + ";" + httpContext.getMessage( "Color", "") + ";" + httpContext.getMessage( "Numero Color", "") + ";" + httpContext.getMessage( "TC", "") + ";" + httpContext.getMessage( "Kilos", "") + ";" + httpContext.getMessage( "Hhmm", "") + ";" + httpContext.getMessage( "HHmm", "") + ";" + httpContext.getMessage( "Desvio", "") + ";" ;
         AV123Linea += httpContext.getMessage( "Proceso", "") + ";" + httpContext.getMessage( "Numero", "") + ";" + httpContext.getMessage( "Lote", "") + ";" + httpContext.getMessage( "Numero Pdas", "") ;
         /* Execute user subroutine: 'WRITELINE &LINEA' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV123Linea = " " ;
         AV86Tot_dift = DecimalUtil.doubleToDec(0) ;
         AV94Num_pt = 0 ;
         AV33NTin = 0 ;
         /* Using cursor P08XZ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV8PMaqCod, AV110hISPRODTI, AV111hISPRODTF, AV110hISPRODTI, AV111hISPRODTF, AV89TipMaqCod, AV89TipMaqCod, AV115Artcodi, AV116Artcodf, AV117Barcolnomi, AV118Barcolnomf, Integer.valueOf(AV119Barcolnumi), Integer.valueOf(AV120Barcolnumf), AV9UMaqCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            brk8XZ2 = false ;
            A656ParCod = P08XZ2_A656ParCod[0] ;
            n656ParCod = P08XZ2_n656ParCod[0] ;
            A1011TipMaqCod = P08XZ2_A1011TipMaqCod[0] ;
            n1011TipMaqCod = P08XZ2_n1011TipMaqCod[0] ;
            A136BarColNum = P08XZ2_A136BarColNum[0] ;
            A135BarColNom = P08XZ2_A135BarColNom[0] ;
            A212BarSer = P08XZ2_A212BarSer[0] ;
            A4441HisProDTF = P08XZ2_A4441HisProDTF[0] ;
            n4441HisProDTF = P08XZ2_n4441HisProDTF[0] ;
            A4440HisProDTI = P08XZ2_A4440HisProDTI[0] ;
            n4440HisProDTI = P08XZ2_n4440HisProDTI[0] ;
            A602MaqCod = P08XZ2_A602MaqCod[0] ;
            A3610HisProLot = P08XZ2_A3610HisProLot[0] ;
            A1525HisProKgr = P08XZ2_A1525HisProKgr[0] ;
            A130BarCodPar = P08XZ2_A130BarCodPar[0] ;
            A132BarCodReo = P08XZ2_A132BarCodReo[0] ;
            A129BarCod = P08XZ2_A129BarCod[0] ;
            A6680HisproTdab = P08XZ2_A6680HisproTdab[0] ;
            A606MaqDsc = P08XZ2_A606MaqDsc[0] ;
            n606MaqDsc = P08XZ2_n606MaqDsc[0] ;
            A561HisProLin = P08XZ2_A561HisProLin[0] ;
            A558HisProFec = P08XZ2_A558HisProFec[0] ;
            A6399MaqKgsId = P08XZ2_A6399MaqKgsId[0] ;
            n6399MaqKgsId = P08XZ2_n6399MaqKgsId[0] ;
            A1011TipMaqCod = P08XZ2_A1011TipMaqCod[0] ;
            n1011TipMaqCod = P08XZ2_n1011TipMaqCod[0] ;
            A606MaqDsc = P08XZ2_A606MaqDsc[0] ;
            n606MaqDsc = P08XZ2_n606MaqDsc[0] ;
            A6399MaqKgsId = P08XZ2_A6399MaqKgsId[0] ;
            n6399MaqKgsId = P08XZ2_n6399MaqKgsId[0] ;
            A136BarColNum = P08XZ2_A136BarColNum[0] ;
            A135BarColNom = P08XZ2_A135BarColNom[0] ;
            A212BarSer = P08XZ2_A212BarSer[0] ;
            AV30TotKgs = DecimalUtil.doubleToDec(0) ;
            AV31TotMinT = 0 ;
            AV93Num_p = 0 ;
            AV56HisProLot = "" ;
            AV67Gruopecod = 0 ;
            AV68TotMinTp = 0 ;
            AV80Sum_kgs = DecimalUtil.doubleToDec(0) ;
            AV82MaqKgsId = A6399MaqKgsId ;
            AV85Tot_dif = DecimalUtil.doubleToDec(0) ;
            AV95Tot_teo = 0 ;
            AV12HisProTre = (short)(0) ;
            AV105Last_kgs = DecimalUtil.doubleToDec(0) ;
            AV106Kgs_hdr = DecimalUtil.doubleToDec(0) ;
            while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(P08XZ2_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(P08XZ2_A602MaqCod[0], A602MaqCod) == 0 ) )
            {
               brk8XZ2 = false ;
               A656ParCod = P08XZ2_A656ParCod[0] ;
               n656ParCod = P08XZ2_n656ParCod[0] ;
               A1011TipMaqCod = P08XZ2_A1011TipMaqCod[0] ;
               n1011TipMaqCod = P08XZ2_n1011TipMaqCod[0] ;
               A136BarColNum = P08XZ2_A136BarColNum[0] ;
               A135BarColNom = P08XZ2_A135BarColNom[0] ;
               A212BarSer = P08XZ2_A212BarSer[0] ;
               A4441HisProDTF = P08XZ2_A4441HisProDTF[0] ;
               n4441HisProDTF = P08XZ2_n4441HisProDTF[0] ;
               A4440HisProDTI = P08XZ2_A4440HisProDTI[0] ;
               n4440HisProDTI = P08XZ2_n4440HisProDTI[0] ;
               A3610HisProLot = P08XZ2_A3610HisProLot[0] ;
               A1525HisProKgr = P08XZ2_A1525HisProKgr[0] ;
               A130BarCodPar = P08XZ2_A130BarCodPar[0] ;
               A132BarCodReo = P08XZ2_A132BarCodReo[0] ;
               A129BarCod = P08XZ2_A129BarCod[0] ;
               A6680HisproTdab = P08XZ2_A6680HisproTdab[0] ;
               A606MaqDsc = P08XZ2_A606MaqDsc[0] ;
               n606MaqDsc = P08XZ2_n606MaqDsc[0] ;
               A561HisProLin = P08XZ2_A561HisProLin[0] ;
               A558HisProFec = P08XZ2_A558HisProFec[0] ;
               A1011TipMaqCod = P08XZ2_A1011TipMaqCod[0] ;
               n1011TipMaqCod = P08XZ2_n1011TipMaqCod[0] ;
               A606MaqDsc = P08XZ2_A606MaqDsc[0] ;
               n606MaqDsc = P08XZ2_n606MaqDsc[0] ;
               A136BarColNum = P08XZ2_A136BarColNum[0] ;
               A135BarColNom = P08XZ2_A135BarColNom[0] ;
               A212BarSer = P08XZ2_A212BarSer[0] ;
               if ( ( GXutil.strcmp(A602MaqCod, AV8PMaqCod) >= 0 ) && ( GXutil.strcmp(A602MaqCod, AV9UMaqCod) <= 0 ) )
               {
                  if ( ( GXutil.strcmp(A212BarSer, AV115Artcodi) >= 0 ) && ( GXutil.strcmp(A212BarSer, AV116Artcodf) <= 0 ) )
                  {
                     if ( ( GXutil.strcmp(A135BarColNom, AV117Barcolnomi) >= 0 ) && ( GXutil.strcmp(A135BarColNom, AV118Barcolnomf) <= 0 ) )
                     {
                        if ( ( A136BarColNum >= AV119Barcolnumi ) && ( A136BarColNum <= AV120Barcolnumf ) )
                        {
                           if ( ( GXutil.strcmp(A1011TipMaqCod, AV89TipMaqCod) == 0 ) || (GXutil.strcmp("", AV89TipMaqCod)==0) )
                           {
                              if ( (( A4440HisProDTI.after( AV110hISPRODTI ) ) || ( GXutil.dateCompare(A4440HisProDTI, AV110hISPRODTI) )) && (( A4441HisProDTF.before( AV111hISPRODTF ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV111hISPRODTF) )) )
                              {
                                 if ( (( A4441HisProDTF.after( AV110hISPRODTI ) ) || ( GXutil.dateCompare(A4441HisProDTF, AV110hISPRODTI) )) )
                                 {
                                    if ( (( A4440HisProDTI.before( AV111hISPRODTF ) ) || ( GXutil.dateCompare(A4440HisProDTI, AV111hISPRODTF) )) )
                                    {
                                       if ( (0==A656ParCod) )
                                       {
                                          if ( ( GXutil.strcmp(AV56HisProLot, A3610HisProLot) != 0 ) && ! (GXutil.strcmp("", AV56HisProLot)==0) )
                                          {
                                             AV33NTin = (int)(AV33NTin+1) ;
                                             AV93Num_p = (int)(AV93Num_p+1) ;
                                             AV94Num_pt = (int)(AV94Num_pt+1) ;
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
                                             AV105Last_kgs = A1525HisProKgr ;
                                             AV106Kgs_hdr = A1525HisProKgr ;
                                             AV12HisProTre = (short)(0) ;
                                          }
                                          AV107Hdr_m = GXutil.str( A129BarCod, 8, 0) + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
                                          AV12HisProTre = (short)(AV12HisProTre+A6680HisproTdab) ;
                                          if ( DecimalUtil.compareTo(AV105Last_kgs, A1525HisProKgr) != 0 )
                                          {
                                             AV106Kgs_hdr = AV106Kgs_hdr.add(A1525HisProKgr) ;
                                          }
                                          if ( GXutil.strcmp(AV107Hdr_m, A3610HisProLot) == 0 )
                                          {
                                             AV13BarCod = A129BarCod ;
                                             AV14BarCodReo = A132BarCodReo ;
                                             AV15BarCodPar = A130BarCodPar ;
                                             /* Execute user subroutine: 'LEOHDR' */
                                             S131 ();
                                             if ( returnInSub )
                                             {
                                                pr_default.close(0);
                                                pr_default.close(0);
                                                pr_default.close(0);
                                                returnInSub = true;
                                                cleanup();
                                                if (true) return;
                                             }
                                             AV96Maqcod_v = A602MaqCod ;
                                             AV97MaqDsc_v = A606MaqDsc ;
                                             AV70Hdr = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
                                             AV98Clinom_v = AV83CliNom ;
                                             AV99Barser_v = AV17ForSer ;
                                             AV100Serdsc_v = AV71BarSerdsc ;
                                             AV101ColNom_v = AV18ForColNom ;
                                             AV102Colnum_v = AV19ForColNum ;
                                             AV103Tc_v = AV20TipColCod ;
                                             AV104Kgr_v = AV106Kgs_hdr ;
                                          }
                                          AV56HisProLot = A3610HisProLot ;
                                          AV105Last_kgs = A1525HisProKgr ;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
               brk8XZ2 = true ;
               pr_default.readNext(0);
            }
            AV33NTin = (int)(AV33NTin+1) ;
            AV93Num_p = (int)(AV93Num_p+1) ;
            AV94Num_pt = (int)(AV94Num_pt+1) ;
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
            AV92TiemM_p = 0 ;
            if ( AV93Num_p > 0 )
            {
               AV92TiemM_p = (int)(AV31TotMinT/ (double) (AV93Num_p)) ;
            }
            AV73Fila = (byte)(AV73Fila+2) ;
            AV72Columna = (byte)(6) ;
            AV61HorRea = (short)(GXutil.Int( AV92TiemM_p/ (double) (60))) ;
            AV62HorReaint = (short)(GXutil.Int( AV61HorRea)) ;
            AV64MinRea = (byte)(AV92TiemM_p-(AV62HorReaint*60)) ;
            AV65MinRea2 = DecimalUtil.doubleToDec(AV64MinRea/ (double) (100)) ;
            AV24HmP = DecimalUtil.doubleToDec(AV62HorReaint).add(AV65MinRea2) ;
            AV92TiemM_p = 0 ;
            if ( AV93Num_p > 0 )
            {
               AV92TiemM_p = (int)(AV95Tot_teo/ (double) (AV93Num_p)) ;
            }
            AV61HorRea = (short)(GXutil.Int( AV92TiemM_p/ (double) (60))) ;
            AV62HorReaint = (short)(GXutil.Int( AV61HorRea)) ;
            AV64MinRea = (byte)(AV92TiemM_p-(AV62HorReaint*60)) ;
            AV65MinRea2 = DecimalUtil.doubleToDec(AV64MinRea/ (double) (100)) ;
            AV24HmP = DecimalUtil.doubleToDec(AV62HorReaint).add(AV65MinRea2) ;
            if ( ! brk8XZ2 )
            {
               brk8XZ2 = true ;
               pr_default.readNext(0);
            }
         }
         pr_default.close(0);
         AV123Linea = httpContext.getMessage( "#fi", "") ;
         /* Execute user subroutine: 'WRITELINE &LINEA' */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV125File.close();
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'IMP_LINEA' Routine */
      returnInSub = false ;
      AV30TotKgs = AV30TotKgs.add(AV106Kgs_hdr) ;
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
      AV91Desvio_m = (int)(AV12HisProTre-AV22TiempoF) ;
      AV61HorRea = (short)(GXutil.Int( AV91Desvio_m/ (double) (60))) ;
      AV62HorReaint = (short)(GXutil.Int( AV61HorRea)) ;
      AV64MinRea = (byte)(AV91Desvio_m-(AV62HorReaint*60)) ;
      AV65MinRea2 = DecimalUtil.doubleToDec(AV64MinRea/ (double) (100)) ;
      AV90Desvio_h = DecimalUtil.doubleToDec(AV62HorReaint).add(AV65MinRea2) ;
      AV123Linea = AV96Maqcod_v + ";" + AV97MaqDsc_v + ";" + AV70Hdr + ";" + AV98Clinom_v + ";" + AV99Barser_v + ";" + AV100Serdsc_v + ";" + AV101ColNom_v + ";" + GXutil.str( AV102Colnum_v, 6, 0) + ";" + GXutil.str( AV103Tc_v, 2, 0) + ";" + GXutil.str( AV106Kgs_hdr, 9, 2) + ";" + GXutil.str( AV24HmP, 7, 2) + ";" + GXutil.str( AV25HmF, 7, 2) + ";" + GXutil.str( AV90Desvio_h, 7, 2) + ";" ;
      AV123Linea += AV108Proforcod + ";" + GXutil.str( AV109ProNumRec, 5, 0) + ";" + AV56HisProLot + ";" + GXutil.str( AV93Num_p, 6, 0) ;
      /* Execute user subroutine: 'WRITELINE &LINEA' */
      S121 ();
      if (returnInSub) return;
      AV123Linea = " " ;
      AV87Tot_kgsG = AV87Tot_kgsG.add(AV106Kgs_hdr) ;
      AV88Tot_tG = (int)(AV88Tot_tG+AV12HisProTre) ;
      AV31TotMinT = (int)(AV31TotMinT+AV12HisProTre) ;
      AV95Tot_teo = (int)(AV95Tot_teo+AV22TiempoF) ;
      AV80Sum_kgs = AV80Sum_kgs.add(AV30TotKgs) ;
      AV81Sum_t = (short)(AV81Sum_t+AV12HisProTre) ;
      AV68TotMinTp = (int)(AV68TotMinTp+AV12HisProTre) ;
   }

   public void S131( )
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
      /* Using cursor P08XZ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV13BarCod), Byte.valueOf(AV14BarCodReo), AV15BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P08XZ3_A130BarCodPar[0] ;
         A132BarCodReo = P08XZ3_A132BarCodReo[0] ;
         A129BarCod = P08XZ3_A129BarCod[0] ;
         A252CliCod = P08XZ3_A252CliCod[0] ;
         n252CliCod = P08XZ3_n252CliCod[0] ;
         A279CliNom = P08XZ3_A279CliNom[0] ;
         A212BarSer = P08XZ3_A212BarSer[0] ;
         A1652BarSerDsc = P08XZ3_A1652BarSerDsc[0] ;
         A135BarColNom = P08XZ3_A135BarColNom[0] ;
         A136BarColNum = P08XZ3_A136BarColNum[0] ;
         A218BarTipCol = P08XZ3_A218BarTipCol[0] ;
         A279CliNom = P08XZ3_A279CliNom[0] ;
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
         S144 ();
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
         /* Using cursor P08XZ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV13BarCod), Byte.valueOf(AV14BarCodReo), AV15BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A507HbaBarPar = P08XZ4_A507HbaBarPar[0] ;
            A508HbaBarReo = P08XZ4_A508HbaBarReo[0] ;
            A506HbaBarCod = P08XZ4_A506HbaBarCod[0] ;
            A252CliCod = P08XZ4_A252CliCod[0] ;
            n252CliCod = P08XZ4_n252CliCod[0] ;
            A279CliNom = P08XZ4_A279CliNom[0] ;
            A535HbaSer = P08XZ4_A535HbaSer[0] ;
            n535HbaSer = P08XZ4_n535HbaSer[0] ;
            A2627HbaSerDsc = P08XZ4_A2627HbaSerDsc[0] ;
            n2627HbaSerDsc = P08XZ4_n2627HbaSerDsc[0] ;
            A509HbaColNom = P08XZ4_A509HbaColNom[0] ;
            n509HbaColNom = P08XZ4_n509HbaColNom[0] ;
            A510HbaColNum = P08XZ4_A510HbaColNum[0] ;
            n510HbaColNum = P08XZ4_n510HbaColNum[0] ;
            A537HbaTipCol = P08XZ4_A537HbaTipCol[0] ;
            n537HbaTipCol = P08XZ4_n537HbaTipCol[0] ;
            A279CliNom = P08XZ4_A279CliNom[0] ;
            AV32FlagBH = httpContext.getMessage( "H", "") ;
            AV21CliCod = A252CliCod ;
            AV83CliNom = A279CliNom ;
            AV17ForSer = A535HbaSer ;
            AV71BarSerdsc = A2627HbaSerDsc ;
            AV18ForColNom = A509HbaColNom ;
            AV19ForColNum = A510HbaColNum ;
            AV20TipColCod = A537HbaTipCol ;
            /* Execute user subroutine: 'LEOFORMU' */
            S144 ();
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

   public void S144( )
   {
      /* 'LEOFORMU' Routine */
      returnInSub = false ;
      AV22TiempoF = (short)(0) ;
      AV108Proforcod = " " ;
      AV109ProNumRec = 0 ;
      /* Using cursor P08XZ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(AV21CliCod), AV17ForSer, AV18ForColNom, Integer.valueOf(AV19ForColNum), Byte.valueOf(AV20TipColCod)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A831TipColCod = P08XZ5_A831TipColCod[0] ;
         A483ForColNum = P08XZ5_A483ForColNum[0] ;
         A482ForColNom = P08XZ5_A482ForColNom[0] ;
         A494ForSer = P08XZ5_A494ForSer[0] ;
         A252CliCod = P08XZ5_A252CliCod[0] ;
         n252CliCod = P08XZ5_n252CliCod[0] ;
         A771ProForTie = P08XZ5_A771ProForTie[0] ;
         A764ProForCod = P08XZ5_A764ProForCod[0] ;
         A2393ProNumRec = P08XZ5_A2393ProNumRec[0] ;
         A1160ProForL = P08XZ5_A1160ProForL[0] ;
         A771ProForTie = P08XZ5_A771ProForTie[0] ;
         A2393ProNumRec = P08XZ5_A2393ProNumRec[0] ;
         AV22TiempoF = (short)(AV22TiempoF+A771ProForTie) ;
         AV108Proforcod = A764ProForCod ;
         AV109ProNumRec = A2393ProNumRec ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
      /* Using cursor P08XZ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(AV13BarCod), Byte.valueOf(AV14BarCodReo), AV15BarCodPar});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A6039RecAcab = P08XZ6_A6039RecAcab[0] ;
         n6039RecAcab = P08XZ6_n6039RecAcab[0] ;
         A130BarCodPar = P08XZ6_A130BarCodPar[0] ;
         A132BarCodReo = P08XZ6_A132BarCodReo[0] ;
         A129BarCod = P08XZ6_A129BarCod[0] ;
         A2804RecLinMaq = P08XZ6_A2804RecLinMaq[0] ;
         if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "N", "")) == 0 )
         {
            AV22TiempoF = (short)(0) ;
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
      /* Using cursor P08XZ7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV13BarCod), Byte.valueOf(AV14BarCodReo), AV15BarCodPar});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A6039RecAcab = P08XZ7_A6039RecAcab[0] ;
         n6039RecAcab = P08XZ7_n6039RecAcab[0] ;
         A130BarCodPar = P08XZ7_A130BarCodPar[0] ;
         A132BarCodReo = P08XZ7_A132BarCodReo[0] ;
         A129BarCod = P08XZ7_A129BarCod[0] ;
         A771ProForTie = P08XZ7_A771ProForTie[0] ;
         A764ProForCod = P08XZ7_A764ProForCod[0] ;
         A2393ProNumRec = P08XZ7_A2393ProNumRec[0] ;
         A1273RecLinPro = P08XZ7_A1273RecLinPro[0] ;
         A2804RecLinMaq = P08XZ7_A2804RecLinMaq[0] ;
         A771ProForTie = P08XZ7_A771ProForTie[0] ;
         A2393ProNumRec = P08XZ7_A2393ProNumRec[0] ;
         A6039RecAcab = P08XZ7_A6039RecAcab[0] ;
         n6039RecAcab = P08XZ7_n6039RecAcab[0] ;
         if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "N", "")) == 0 )
         {
            AV22TiempoF = (short)(AV22TiempoF+A771ProForTie) ;
            AV108Proforcod = A764ProForCod ;
            AV109ProNumRec = A2393ProNumRec ;
         }
         pr_default.readNext(5);
      }
      pr_default.close(5);
      /* Using cursor P08XZ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV13BarCod), Byte.valueOf(AV14BarCodReo), AV15BarCodPar});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A4494HreBarPar = P08XZ8_A4494HreBarPar[0] ;
         A4493HreBarReo = P08XZ8_A4493HreBarReo[0] ;
         A4492HreBarCod = P08XZ8_A4492HreBarCod[0] ;
         A4545HreLinMaq = P08XZ8_A4545HreLinMaq[0] ;
         A4495HreNumCie = P08XZ8_A4495HreNumCie[0] ;
         AV22TiempoF = (short)(0) ;
         pr_default.readNext(6);
      }
      pr_default.close(6);
      /* Using cursor P08XZ9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV13BarCod), Byte.valueOf(AV14BarCodReo), AV15BarCodPar});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A4494HreBarPar = P08XZ9_A4494HreBarPar[0] ;
         A4493HreBarReo = P08XZ9_A4493HreBarReo[0] ;
         A4492HreBarCod = P08XZ9_A4492HreBarCod[0] ;
         A4553HreProTie = P08XZ9_A4553HreProTie[0] ;
         A4551HreProCod = P08XZ9_A4551HreProCod[0] ;
         A4556HreNumRec = P08XZ9_A4556HreNumRec[0] ;
         A4550HreLinPro = P08XZ9_A4550HreLinPro[0] ;
         A4545HreLinMaq = P08XZ9_A4545HreLinMaq[0] ;
         A4495HreNumCie = P08XZ9_A4495HreNumCie[0] ;
         AV22TiempoF = (short)(AV22TiempoF+A4553HreProTie) ;
         AV108Proforcod = A4551HreProCod ;
         AV109ProNumRec = A4556HreNumRec ;
         pr_default.readNext(7);
      }
      pr_default.close(7);
   }

   public void S121( )
   {
      /* 'WRITELINE &LINEA' Routine */
      returnInSub = false ;
      AV125File.writeLine(GXutil.trim( AV123Linea));
      if ( ! (0==AV125File.getErrCode()) )
      {
         AV121Planom = "" ;
         Gx_msg = httpContext.getMessage( "Error de grabacion en el fichero ", "") + AV121Planom ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = rprdt11tgenerafile.this.A396EmprCod;
      this.aP1[0] = rprdt11tgenerafile.this.AV8PMaqCod;
      this.aP2[0] = rprdt11tgenerafile.this.AV9UMaqCod;
      this.aP3[0] = rprdt11tgenerafile.this.AV110hISPRODTI;
      this.aP4[0] = rprdt11tgenerafile.this.AV111hISPRODTF;
      this.aP5[0] = rprdt11tgenerafile.this.AV89TipMaqCod;
      this.aP6[0] = rprdt11tgenerafile.this.AV112Filename;
      this.aP7[0] = rprdt11tgenerafile.this.AV115Artcodi;
      this.aP8[0] = rprdt11tgenerafile.this.AV116Artcodf;
      this.aP9[0] = rprdt11tgenerafile.this.AV117Barcolnomi;
      this.aP10[0] = rprdt11tgenerafile.this.AV118Barcolnomf;
      this.aP11[0] = rprdt11tgenerafile.this.AV119Barcolnumi;
      this.aP12[0] = rprdt11tgenerafile.this.AV120Barcolnumf;
      this.aP13[0] = rprdt11tgenerafile.this.AV121Planom;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV121Planom = "" ;
      GXv_int1 = new byte[1] ;
      AV125File = new com.genexus.util.GXFile();
      Gx_msg = "" ;
      AV123Linea = "" ;
      AV86Tot_dift = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P08XZ2_A396EmprCod = new String[] {""} ;
      P08XZ2_A656ParCod = new short[1] ;
      P08XZ2_n656ParCod = new boolean[] {false} ;
      P08XZ2_A1011TipMaqCod = new String[] {""} ;
      P08XZ2_n1011TipMaqCod = new boolean[] {false} ;
      P08XZ2_A136BarColNum = new int[1] ;
      P08XZ2_A135BarColNom = new String[] {""} ;
      P08XZ2_A212BarSer = new String[] {""} ;
      P08XZ2_A4441HisProDTF = new java.util.Date[] {GXutil.nullDate()} ;
      P08XZ2_n4441HisProDTF = new boolean[] {false} ;
      P08XZ2_A4440HisProDTI = new java.util.Date[] {GXutil.nullDate()} ;
      P08XZ2_n4440HisProDTI = new boolean[] {false} ;
      P08XZ2_A602MaqCod = new String[] {""} ;
      P08XZ2_A3610HisProLot = new String[] {""} ;
      P08XZ2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08XZ2_A130BarCodPar = new String[] {""} ;
      P08XZ2_A132BarCodReo = new byte[1] ;
      P08XZ2_A129BarCod = new int[1] ;
      P08XZ2_A6680HisproTdab = new short[1] ;
      P08XZ2_A606MaqDsc = new String[] {""} ;
      P08XZ2_n606MaqDsc = new boolean[] {false} ;
      P08XZ2_A561HisProLin = new int[1] ;
      P08XZ2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08XZ2_A6399MaqKgsId = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08XZ2_n6399MaqKgsId = new boolean[] {false} ;
      A1011TipMaqCod = "" ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A4441HisProDTF = GXutil.resetTime( GXutil.nullDate() );
      A4440HisProDTI = GXutil.resetTime( GXutil.nullDate() );
      A602MaqCod = "" ;
      A3610HisProLot = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A130BarCodPar = "" ;
      A606MaqDsc = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A6399MaqKgsId = DecimalUtil.ZERO ;
      AV30TotKgs = DecimalUtil.ZERO ;
      AV56HisProLot = "" ;
      AV80Sum_kgs = DecimalUtil.ZERO ;
      AV82MaqKgsId = DecimalUtil.ZERO ;
      AV85Tot_dif = DecimalUtil.ZERO ;
      AV105Last_kgs = DecimalUtil.ZERO ;
      AV106Kgs_hdr = DecimalUtil.ZERO ;
      AV107Hdr_m = "" ;
      AV15BarCodPar = "" ;
      AV96Maqcod_v = "" ;
      AV97MaqDsc_v = "" ;
      AV70Hdr = "" ;
      AV98Clinom_v = "" ;
      AV83CliNom = "" ;
      AV99Barser_v = "" ;
      AV17ForSer = "" ;
      AV100Serdsc_v = "" ;
      AV71BarSerdsc = "" ;
      AV101ColNom_v = "" ;
      AV18ForColNom = "" ;
      AV104Kgr_v = DecimalUtil.ZERO ;
      AV65MinRea2 = DecimalUtil.ZERO ;
      AV24HmP = DecimalUtil.ZERO ;
      AV34TiempoNP = DecimalUtil.ZERO ;
      AV25HmF = DecimalUtil.ZERO ;
      AV90Desvio_h = DecimalUtil.ZERO ;
      AV108Proforcod = "" ;
      AV87Tot_kgsG = DecimalUtil.ZERO ;
      AV32FlagBH = "" ;
      P08XZ3_A396EmprCod = new String[] {""} ;
      P08XZ3_A130BarCodPar = new String[] {""} ;
      P08XZ3_A132BarCodReo = new byte[1] ;
      P08XZ3_A129BarCod = new int[1] ;
      P08XZ3_A252CliCod = new int[1] ;
      P08XZ3_n252CliCod = new boolean[] {false} ;
      P08XZ3_A279CliNom = new String[] {""} ;
      P08XZ3_A212BarSer = new String[] {""} ;
      P08XZ3_A1652BarSerDsc = new String[] {""} ;
      P08XZ3_A135BarColNom = new String[] {""} ;
      P08XZ3_A136BarColNum = new int[1] ;
      P08XZ3_A218BarTipCol = new byte[1] ;
      A279CliNom = "" ;
      A1652BarSerDsc = "" ;
      P08XZ4_A396EmprCod = new String[] {""} ;
      P08XZ4_A507HbaBarPar = new String[] {""} ;
      P08XZ4_A508HbaBarReo = new byte[1] ;
      P08XZ4_A506HbaBarCod = new int[1] ;
      P08XZ4_A252CliCod = new int[1] ;
      P08XZ4_n252CliCod = new boolean[] {false} ;
      P08XZ4_A279CliNom = new String[] {""} ;
      P08XZ4_A535HbaSer = new String[] {""} ;
      P08XZ4_n535HbaSer = new boolean[] {false} ;
      P08XZ4_A2627HbaSerDsc = new String[] {""} ;
      P08XZ4_n2627HbaSerDsc = new boolean[] {false} ;
      P08XZ4_A509HbaColNom = new String[] {""} ;
      P08XZ4_n509HbaColNom = new boolean[] {false} ;
      P08XZ4_A510HbaColNum = new int[1] ;
      P08XZ4_n510HbaColNum = new boolean[] {false} ;
      P08XZ4_A537HbaTipCol = new byte[1] ;
      P08XZ4_n537HbaTipCol = new boolean[] {false} ;
      A507HbaBarPar = "" ;
      A535HbaSer = "" ;
      A2627HbaSerDsc = "" ;
      A509HbaColNom = "" ;
      P08XZ5_A396EmprCod = new String[] {""} ;
      P08XZ5_A831TipColCod = new byte[1] ;
      P08XZ5_A483ForColNum = new int[1] ;
      P08XZ5_A482ForColNom = new String[] {""} ;
      P08XZ5_A494ForSer = new String[] {""} ;
      P08XZ5_A252CliCod = new int[1] ;
      P08XZ5_n252CliCod = new boolean[] {false} ;
      P08XZ5_A771ProForTie = new short[1] ;
      P08XZ5_A764ProForCod = new String[] {""} ;
      P08XZ5_A2393ProNumRec = new int[1] ;
      P08XZ5_A1160ProForL = new short[1] ;
      A482ForColNom = "" ;
      A494ForSer = "" ;
      A764ProForCod = "" ;
      P08XZ6_A396EmprCod = new String[] {""} ;
      P08XZ6_A6039RecAcab = new String[] {""} ;
      P08XZ6_n6039RecAcab = new boolean[] {false} ;
      P08XZ6_A130BarCodPar = new String[] {""} ;
      P08XZ6_A132BarCodReo = new byte[1] ;
      P08XZ6_A129BarCod = new int[1] ;
      P08XZ6_A2804RecLinMaq = new short[1] ;
      A6039RecAcab = "" ;
      P08XZ7_A396EmprCod = new String[] {""} ;
      P08XZ7_A6039RecAcab = new String[] {""} ;
      P08XZ7_n6039RecAcab = new boolean[] {false} ;
      P08XZ7_A130BarCodPar = new String[] {""} ;
      P08XZ7_A132BarCodReo = new byte[1] ;
      P08XZ7_A129BarCod = new int[1] ;
      P08XZ7_A771ProForTie = new short[1] ;
      P08XZ7_A764ProForCod = new String[] {""} ;
      P08XZ7_A2393ProNumRec = new int[1] ;
      P08XZ7_A1273RecLinPro = new byte[1] ;
      P08XZ7_A2804RecLinMaq = new short[1] ;
      P08XZ8_A396EmprCod = new String[] {""} ;
      P08XZ8_A4494HreBarPar = new String[] {""} ;
      P08XZ8_A4493HreBarReo = new byte[1] ;
      P08XZ8_A4492HreBarCod = new int[1] ;
      P08XZ8_A4545HreLinMaq = new short[1] ;
      P08XZ8_A4495HreNumCie = new byte[1] ;
      A4494HreBarPar = "" ;
      P08XZ9_A396EmprCod = new String[] {""} ;
      P08XZ9_A4494HreBarPar = new String[] {""} ;
      P08XZ9_A4493HreBarReo = new byte[1] ;
      P08XZ9_A4492HreBarCod = new int[1] ;
      P08XZ9_A4553HreProTie = new short[1] ;
      P08XZ9_A4551HreProCod = new String[] {""} ;
      P08XZ9_A4556HreNumRec = new int[1] ;
      P08XZ9_A4550HreLinPro = new byte[1] ;
      P08XZ9_A4545HreLinMaq = new short[1] ;
      P08XZ9_A4495HreNumCie = new byte[1] ;
      A4551HreProCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rprdt11tgenerafile__default(),
         new Object[] {
             new Object[] {
            P08XZ2_A396EmprCod, P08XZ2_A656ParCod, P08XZ2_n656ParCod, P08XZ2_A1011TipMaqCod, P08XZ2_n1011TipMaqCod, P08XZ2_A136BarColNum, P08XZ2_A135BarColNom, P08XZ2_A212BarSer, P08XZ2_A4441HisProDTF, P08XZ2_n4441HisProDTF,
            P08XZ2_A4440HisProDTI, P08XZ2_n4440HisProDTI, P08XZ2_A602MaqCod, P08XZ2_A3610HisProLot, P08XZ2_A1525HisProKgr, P08XZ2_A130BarCodPar, P08XZ2_A132BarCodReo, P08XZ2_A129BarCod, P08XZ2_A6680HisproTdab, P08XZ2_A606MaqDsc,
            P08XZ2_n606MaqDsc, P08XZ2_A561HisProLin, P08XZ2_A558HisProFec, P08XZ2_A6399MaqKgsId, P08XZ2_n6399MaqKgsId
            }
            , new Object[] {
            P08XZ3_A396EmprCod, P08XZ3_A130BarCodPar, P08XZ3_A132BarCodReo, P08XZ3_A129BarCod, P08XZ3_A252CliCod, P08XZ3_n252CliCod, P08XZ3_A279CliNom, P08XZ3_A212BarSer, P08XZ3_A1652BarSerDsc, P08XZ3_A135BarColNom,
            P08XZ3_A136BarColNum, P08XZ3_A218BarTipCol
            }
            , new Object[] {
            P08XZ4_A396EmprCod, P08XZ4_A507HbaBarPar, P08XZ4_A508HbaBarReo, P08XZ4_A506HbaBarCod, P08XZ4_A252CliCod, P08XZ4_n252CliCod, P08XZ4_A279CliNom, P08XZ4_A535HbaSer, P08XZ4_n535HbaSer, P08XZ4_A2627HbaSerDsc,
            P08XZ4_n2627HbaSerDsc, P08XZ4_A509HbaColNom, P08XZ4_n509HbaColNom, P08XZ4_A510HbaColNum, P08XZ4_n510HbaColNum, P08XZ4_A537HbaTipCol, P08XZ4_n537HbaTipCol
            }
            , new Object[] {
            P08XZ5_A396EmprCod, P08XZ5_A831TipColCod, P08XZ5_A483ForColNum, P08XZ5_A482ForColNom, P08XZ5_A494ForSer, P08XZ5_A252CliCod, P08XZ5_A771ProForTie, P08XZ5_A764ProForCod, P08XZ5_A2393ProNumRec, P08XZ5_A1160ProForL
            }
            , new Object[] {
            P08XZ6_A396EmprCod, P08XZ6_A6039RecAcab, P08XZ6_n6039RecAcab, P08XZ6_A130BarCodPar, P08XZ6_A132BarCodReo, P08XZ6_A129BarCod, P08XZ6_A2804RecLinMaq
            }
            , new Object[] {
            P08XZ7_A396EmprCod, P08XZ7_A6039RecAcab, P08XZ7_n6039RecAcab, P08XZ7_A130BarCodPar, P08XZ7_A132BarCodReo, P08XZ7_A129BarCod, P08XZ7_A771ProForTie, P08XZ7_A764ProForCod, P08XZ7_A2393ProNumRec, P08XZ7_A1273RecLinPro,
            P08XZ7_A2804RecLinMaq
            }
            , new Object[] {
            P08XZ8_A396EmprCod, P08XZ8_A4494HreBarPar, P08XZ8_A4493HreBarReo, P08XZ8_A4492HreBarCod, P08XZ8_A4545HreLinMaq, P08XZ8_A4495HreNumCie
            }
            , new Object[] {
            P08XZ9_A396EmprCod, P08XZ9_A4494HreBarPar, P08XZ9_A4493HreBarReo, P08XZ9_A4492HreBarCod, P08XZ9_A4553HreProTie, P08XZ9_A4551HreProCod, P08XZ9_A4556HreNumRec, P08XZ9_A4550HreLinPro, P08XZ9_A4545HreLinMaq, P08XZ9_A4495HreNumCie
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV66FlagTiReal ;
   private byte GXv_int1[] ;
   private byte A132BarCodReo ;
   private byte AV14BarCodReo ;
   private byte AV103Tc_v ;
   private byte AV20TipColCod ;
   private byte AV64MinRea ;
   private byte AV73Fila ;
   private byte AV72Columna ;
   private byte AV16FlagBarcad ;
   private byte A218BarTipCol ;
   private byte A508HbaBarReo ;
   private byte A537HbaTipCol ;
   private byte A831TipColCod ;
   private byte A1273RecLinPro ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4550HreLinPro ;
   private short A656ParCod ;
   private short A6680HisproTdab ;
   private short AV12HisProTre ;
   private short AV61HorRea ;
   private short AV62HorReaint ;
   private short AV22TiempoF ;
   private short AV81Sum_t ;
   private short A771ProForTie ;
   private short A1160ProForL ;
   private short A2804RecLinMaq ;
   private short A4545HreLinMaq ;
   private short A4553HreProTie ;
   private short Gx_err ;
   private int AV119Barcolnumi ;
   private int AV120Barcolnumf ;
   private int AV94Num_pt ;
   private int AV33NTin ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int A561HisProLin ;
   private int AV31TotMinT ;
   private int AV93Num_p ;
   private int AV67Gruopecod ;
   private int AV68TotMinTp ;
   private int AV95Tot_teo ;
   private int AV13BarCod ;
   private int AV102Colnum_v ;
   private int AV19ForColNum ;
   private int AV92TiemM_p ;
   private int AV91Desvio_m ;
   private int AV109ProNumRec ;
   private int AV88Tot_tG ;
   private int AV21CliCod ;
   private int A252CliCod ;
   private int A506HbaBarCod ;
   private int A510HbaColNum ;
   private int A483ForColNum ;
   private int A2393ProNumRec ;
   private int A4492HreBarCod ;
   private int A4556HreNumRec ;
   private java.math.BigDecimal AV86Tot_dift ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A6399MaqKgsId ;
   private java.math.BigDecimal AV30TotKgs ;
   private java.math.BigDecimal AV80Sum_kgs ;
   private java.math.BigDecimal AV82MaqKgsId ;
   private java.math.BigDecimal AV85Tot_dif ;
   private java.math.BigDecimal AV105Last_kgs ;
   private java.math.BigDecimal AV106Kgs_hdr ;
   private java.math.BigDecimal AV104Kgr_v ;
   private java.math.BigDecimal AV65MinRea2 ;
   private java.math.BigDecimal AV24HmP ;
   private java.math.BigDecimal AV34TiempoNP ;
   private java.math.BigDecimal AV25HmF ;
   private java.math.BigDecimal AV90Desvio_h ;
   private java.math.BigDecimal AV87Tot_kgsG ;
   private String A396EmprCod ;
   private String AV8PMaqCod ;
   private String AV9UMaqCod ;
   private String AV89TipMaqCod ;
   private String AV112Filename ;
   private String AV115Artcodi ;
   private String AV116Artcodf ;
   private String AV117Barcolnomi ;
   private String AV118Barcolnomf ;
   private String AV121Planom ;
   private String Gx_msg ;
   private String AV123Linea ;
   private String scmdbuf ;
   private String A1011TipMaqCod ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A602MaqCod ;
   private String A3610HisProLot ;
   private String A130BarCodPar ;
   private String A606MaqDsc ;
   private String AV56HisProLot ;
   private String AV107Hdr_m ;
   private String AV15BarCodPar ;
   private String AV96Maqcod_v ;
   private String AV97MaqDsc_v ;
   private String AV70Hdr ;
   private String AV98Clinom_v ;
   private String AV83CliNom ;
   private String AV99Barser_v ;
   private String AV17ForSer ;
   private String AV100Serdsc_v ;
   private String AV71BarSerdsc ;
   private String AV101ColNom_v ;
   private String AV18ForColNom ;
   private String AV108Proforcod ;
   private String AV32FlagBH ;
   private String A279CliNom ;
   private String A1652BarSerDsc ;
   private String A507HbaBarPar ;
   private String A535HbaSer ;
   private String A2627HbaSerDsc ;
   private String A509HbaColNom ;
   private String A482ForColNom ;
   private String A494ForSer ;
   private String A764ProForCod ;
   private String A6039RecAcab ;
   private String A4494HreBarPar ;
   private String A4551HreProCod ;
   private java.util.Date AV110hISPRODTI ;
   private java.util.Date AV111hISPRODTF ;
   private java.util.Date A4441HisProDTF ;
   private java.util.Date A4440HisProDTI ;
   private java.util.Date A558HisProFec ;
   private boolean returnInSub ;
   private boolean brk8XZ2 ;
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
   private boolean n6039RecAcab ;
   private com.genexus.util.GXFile AV125File ;
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
   private String[] P08XZ2_A396EmprCod ;
   private short[] P08XZ2_A656ParCod ;
   private boolean[] P08XZ2_n656ParCod ;
   private String[] P08XZ2_A1011TipMaqCod ;
   private boolean[] P08XZ2_n1011TipMaqCod ;
   private int[] P08XZ2_A136BarColNum ;
   private String[] P08XZ2_A135BarColNom ;
   private String[] P08XZ2_A212BarSer ;
   private java.util.Date[] P08XZ2_A4441HisProDTF ;
   private boolean[] P08XZ2_n4441HisProDTF ;
   private java.util.Date[] P08XZ2_A4440HisProDTI ;
   private boolean[] P08XZ2_n4440HisProDTI ;
   private String[] P08XZ2_A602MaqCod ;
   private String[] P08XZ2_A3610HisProLot ;
   private java.math.BigDecimal[] P08XZ2_A1525HisProKgr ;
   private String[] P08XZ2_A130BarCodPar ;
   private byte[] P08XZ2_A132BarCodReo ;
   private int[] P08XZ2_A129BarCod ;
   private short[] P08XZ2_A6680HisproTdab ;
   private String[] P08XZ2_A606MaqDsc ;
   private boolean[] P08XZ2_n606MaqDsc ;
   private int[] P08XZ2_A561HisProLin ;
   private java.util.Date[] P08XZ2_A558HisProFec ;
   private java.math.BigDecimal[] P08XZ2_A6399MaqKgsId ;
   private boolean[] P08XZ2_n6399MaqKgsId ;
   private String[] P08XZ3_A396EmprCod ;
   private String[] P08XZ3_A130BarCodPar ;
   private byte[] P08XZ3_A132BarCodReo ;
   private int[] P08XZ3_A129BarCod ;
   private int[] P08XZ3_A252CliCod ;
   private boolean[] P08XZ3_n252CliCod ;
   private String[] P08XZ3_A279CliNom ;
   private String[] P08XZ3_A212BarSer ;
   private String[] P08XZ3_A1652BarSerDsc ;
   private String[] P08XZ3_A135BarColNom ;
   private int[] P08XZ3_A136BarColNum ;
   private byte[] P08XZ3_A218BarTipCol ;
   private String[] P08XZ4_A396EmprCod ;
   private String[] P08XZ4_A507HbaBarPar ;
   private byte[] P08XZ4_A508HbaBarReo ;
   private int[] P08XZ4_A506HbaBarCod ;
   private int[] P08XZ4_A252CliCod ;
   private boolean[] P08XZ4_n252CliCod ;
   private String[] P08XZ4_A279CliNom ;
   private String[] P08XZ4_A535HbaSer ;
   private boolean[] P08XZ4_n535HbaSer ;
   private String[] P08XZ4_A2627HbaSerDsc ;
   private boolean[] P08XZ4_n2627HbaSerDsc ;
   private String[] P08XZ4_A509HbaColNom ;
   private boolean[] P08XZ4_n509HbaColNom ;
   private int[] P08XZ4_A510HbaColNum ;
   private boolean[] P08XZ4_n510HbaColNum ;
   private byte[] P08XZ4_A537HbaTipCol ;
   private boolean[] P08XZ4_n537HbaTipCol ;
   private String[] P08XZ5_A396EmprCod ;
   private byte[] P08XZ5_A831TipColCod ;
   private int[] P08XZ5_A483ForColNum ;
   private String[] P08XZ5_A482ForColNom ;
   private String[] P08XZ5_A494ForSer ;
   private int[] P08XZ5_A252CliCod ;
   private boolean[] P08XZ5_n252CliCod ;
   private short[] P08XZ5_A771ProForTie ;
   private String[] P08XZ5_A764ProForCod ;
   private int[] P08XZ5_A2393ProNumRec ;
   private short[] P08XZ5_A1160ProForL ;
   private String[] P08XZ6_A396EmprCod ;
   private String[] P08XZ6_A6039RecAcab ;
   private boolean[] P08XZ6_n6039RecAcab ;
   private String[] P08XZ6_A130BarCodPar ;
   private byte[] P08XZ6_A132BarCodReo ;
   private int[] P08XZ6_A129BarCod ;
   private short[] P08XZ6_A2804RecLinMaq ;
   private String[] P08XZ7_A396EmprCod ;
   private String[] P08XZ7_A6039RecAcab ;
   private boolean[] P08XZ7_n6039RecAcab ;
   private String[] P08XZ7_A130BarCodPar ;
   private byte[] P08XZ7_A132BarCodReo ;
   private int[] P08XZ7_A129BarCod ;
   private short[] P08XZ7_A771ProForTie ;
   private String[] P08XZ7_A764ProForCod ;
   private int[] P08XZ7_A2393ProNumRec ;
   private byte[] P08XZ7_A1273RecLinPro ;
   private short[] P08XZ7_A2804RecLinMaq ;
   private String[] P08XZ8_A396EmprCod ;
   private String[] P08XZ8_A4494HreBarPar ;
   private byte[] P08XZ8_A4493HreBarReo ;
   private int[] P08XZ8_A4492HreBarCod ;
   private short[] P08XZ8_A4545HreLinMaq ;
   private byte[] P08XZ8_A4495HreNumCie ;
   private String[] P08XZ9_A396EmprCod ;
   private String[] P08XZ9_A4494HreBarPar ;
   private byte[] P08XZ9_A4493HreBarReo ;
   private int[] P08XZ9_A4492HreBarCod ;
   private short[] P08XZ9_A4553HreProTie ;
   private String[] P08XZ9_A4551HreProCod ;
   private int[] P08XZ9_A4556HreNumRec ;
   private byte[] P08XZ9_A4550HreLinPro ;
   private short[] P08XZ9_A4545HreLinMaq ;
   private byte[] P08XZ9_A4495HreNumCie ;
}

final  class rprdt11tgenerafile__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08XZ2", "SELECT T1.EmprCod, T1.ParCod, T2.TipMaqCod, T3.BarColNum, T3.BarColNom, T3.BarSer, T1.HisProDTF, T1.HisProDTI, T1.MaqCod, T1.HisProLot, T1.HisProKgr, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.HisproTdab, T2.MaqDsc, T1.HisProLin, T1.HisProFec, T2.MaqKgsId FROM ((TXPLHIPRO T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ? and T1.MaqCod >= ?) AND (T1.HisProDTI >= ? and T1.HisProDTF <= ?) AND (T1.HisProDTF >= ?) AND (T1.HisProDTI <= ?) AND (T2.TipMaqCod = ? or (rtrim(?) IS NULL)) AND (T3.BarSer >= ? and T3.BarSer <= ?) AND (T3.BarColNom >= ? and T3.BarColNom <= ?) AND (T3.BarColNum >= ? and T3.BarColNum <= ?) AND ((T1.ParCod = 0)) AND (T1.MaqCod <= ?) ORDER BY T1.EmprCod, T1.MaqCod, T1.HisProFec, T1.HisProLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08XZ3", "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.CliCod, T2.CliNom, T1.BarSer, T1.BarSerDsc, T1.BarColNom, T1.BarColNum, T1.BarTipCol FROM (TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08XZ4", "SELECT T1.EmprCod, T1.HbaBarPar, T1.HbaBarReo, T1.HbaBarCod, T1.CliCod, T2.CliNom, T1.HbaSer, T1.HbaSerDsc, T1.HbaColNom, T1.HbaColNum, T1.HbaTipCol FROM (TXPHISBAR T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.HbaBarCod = ? and T1.HbaBarReo = ? and T1.HbaBarPar = ? ORDER BY T1.EmprCod, T1.HbaBarCod, T1.HbaBarReo, T1.HbaBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08XZ5", "SELECT T1.EmprCod, T1.TipColCod, T1.ForColNum, T1.ForColNom, T1.ForSer, T1.CliCod, T2.ProForTie, T1.ProForCod, T2.ProNumRec, T1.ProForL FROM (TXPLFORMU T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ForSer = ? and T1.ForColNom = ? and T1.ForColNum = ? and T1.TipColCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ForSer, T1.ForColNom, T1.ForColNum, T1.TipColCod, T1.ProForL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08XZ6", "SELECT EmprCod, RecAcab, BarCodPar, BarCodReo, BarCod, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08XZ7", "SELECT T1.EmprCod, T3.RecAcab, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T2.ProForTie, T1.ProForCod, T2.ProNumRec, T1.RecLinPro, T1.RecLinMaq FROM ((TXPCRECET T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) INNER JOIN TXPRECMAQ T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND T3.RecLinMaq = T1.RecLinMaq) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08XZ8", "SELECT EmprCod, HreBarPar, HreBarReo, HreBarCod, HreLinMaq, HreNumCie FROM TXPHISREM WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08XZ9", "SELECT EmprCod, HreBarPar, HreBarReo, HreBarCod, HreProTie, HreProCod, HreNumRec, HreLinPro, HreLinMaq, HreNumCie FROM TXPHISREC WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 6);
               ((String[]) buf[13])[0] = rslt.getString(10, 10);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[15])[0] = rslt.getString(12, 1);
               ((byte[]) buf[16])[0] = rslt.getByte(13);
               ((int[]) buf[17])[0] = rslt.getInt(14);
               ((short[]) buf[18])[0] = rslt.getShort(15);
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
               stmt.setDateTime(5, (java.util.Date)parms[4], false);
               stmt.setDateTime(6, (java.util.Date)parms[5], false);
               stmt.setString(7, (String)parms[6], 4);
               stmt.setString(8, (String)parms[7], 4);
               stmt.setString(9, (String)parms[8], 16);
               stmt.setString(10, (String)parms[9], 16);
               stmt.setString(11, (String)parms[10], 13);
               stmt.setString(12, (String)parms[11], 13);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
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

