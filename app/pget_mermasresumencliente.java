package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pget_mermasresumencliente extends GXProcedure
{
   public pget_mermasresumencliente( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pget_mermasresumencliente.class ), "" );
   }

   public pget_mermasresumencliente( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.SdtSDTMermasResumenCliente> executeUdp( String aP0 ,
                                                                       String aP1 ,
                                                                       short aP2 ,
                                                                       short aP3 ,
                                                                       int aP4 ,
                                                                       int aP5 ,
                                                                       String aP6 ,
                                                                       String aP7 ,
                                                                       String aP8 ,
                                                                       String aP9 ,
                                                                       int aP10 ,
                                                                       int aP11 ,
                                                                       String aP12 ,
                                                                       String aP13 ,
                                                                       java.util.Date aP14 ,
                                                                       java.util.Date aP15 )
   {
      pget_mermasresumencliente.this.aP16 = new GXBaseCollection[] {new GXBaseCollection<app.SdtSDTMermasResumenCliente>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16);
      return aP16[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        short aP2 ,
                        short aP3 ,
                        int aP4 ,
                        int aP5 ,
                        String aP6 ,
                        String aP7 ,
                        String aP8 ,
                        String aP9 ,
                        int aP10 ,
                        int aP11 ,
                        String aP12 ,
                        String aP13 ,
                        java.util.Date aP14 ,
                        java.util.Date aP15 ,
                        GXBaseCollection<app.SdtSDTMermasResumenCliente>[] aP16 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             short aP2 ,
                             short aP3 ,
                             int aP4 ,
                             int aP5 ,
                             String aP6 ,
                             String aP7 ,
                             String aP8 ,
                             String aP9 ,
                             int aP10 ,
                             int aP11 ,
                             String aP12 ,
                             String aP13 ,
                             java.util.Date aP14 ,
                             java.util.Date aP15 ,
                             GXBaseCollection<app.SdtSDTMermasResumenCliente>[] aP16 )
   {
      pget_mermasresumencliente.this.A396EmprCod = aP0;
      pget_mermasresumencliente.this.AV8ImpCod = aP1;
      pget_mermasresumencliente.this.AV9PTipArt = aP2;
      pget_mermasresumencliente.this.AV10UTipArt = aP3;
      pget_mermasresumencliente.this.AV11PCliCod = aP4;
      pget_mermasresumencliente.this.AV12UCliCod = aP5;
      pget_mermasresumencliente.this.AV13PSerCod = aP6;
      pget_mermasresumencliente.this.AV14USerCod = aP7;
      pget_mermasresumencliente.this.AV15PColor = aP8;
      pget_mermasresumencliente.this.AV16UColor = aP9;
      pget_mermasresumencliente.this.AV17PColNum = aP10;
      pget_mermasresumencliente.this.AV18UColNum = aP11;
      pget_mermasresumencliente.this.AV19PDisCli = aP12;
      pget_mermasresumencliente.this.AV20UDisCli = aP13;
      pget_mermasresumencliente.this.AV21PFecha = aP14;
      pget_mermasresumencliente.this.AV22UFecha = aP15;
      pget_mermasresumencliente.this.aP16 = aP16;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV31Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN069_", ""), (byte)(99), GXv_char2) ;
      pget_mermasresumencliente.this.GXt_char1 = GXv_char2[0] ;
      AV31Lit0 = GXt_char1 ;
      GXt_char1 = AV32Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      pget_mermasresumencliente.this.GXt_char1 = GXv_char2[0] ;
      AV32Lit1 = GXt_char1 ;
      GXt_char1 = AV33Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
      pget_mermasresumencliente.this.GXt_char1 = GXv_char2[0] ;
      AV33Lit2 = GXt_char1 ;
      GXt_char1 = AV34Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
      pget_mermasresumencliente.this.GXt_char1 = GXv_char2[0] ;
      AV34Lit3 = GXt_char1 ;
      GXt_char1 = AV35Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN428_", ""), (byte)(99), GXv_char2) ;
      pget_mermasresumencliente.this.GXt_char1 = GXv_char2[0] ;
      AV35Lit4 = GXt_char1 ;
      GXt_char1 = AV36Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN506_", ""), (byte)(99), GXv_char2) ;
      pget_mermasresumencliente.this.GXt_char1 = GXv_char2[0] ;
      AV36Lit5 = GXt_char1 ;
      GXt_char1 = AV37Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN438_", ""), (byte)(99), GXv_char2) ;
      pget_mermasresumencliente.this.GXt_char1 = GXv_char2[0] ;
      AV37Lit6 = GXt_char1 ;
      GXt_char1 = AV38Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1376_", ""), (byte)(99), GXv_char2) ;
      pget_mermasresumencliente.this.GXt_char1 = GXv_char2[0] ;
      AV38Lit7 = GXt_char1 ;
      GXt_char1 = AV39Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN323_", ""), (byte)(99), GXv_char2) ;
      pget_mermasresumencliente.this.GXt_char1 = GXv_char2[0] ;
      AV39Lit8 = GXt_char1 ;
      GXt_char1 = AV40Lit9 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
      pget_mermasresumencliente.this.GXt_char1 = GXv_char2[0] ;
      AV40Lit9 = GXt_char1 ;
      GXt_char1 = AV41Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN075_", ""), (byte)(99), GXv_char2) ;
      pget_mermasresumencliente.this.GXt_char1 = GXv_char2[0] ;
      AV41Lit10 = GXt_char1 ;
      GXt_char1 = AV42Lit11 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN244_", ""), (byte)(99), GXv_char2) ;
      pget_mermasresumencliente.this.GXt_char1 = GXv_char2[0] ;
      AV42Lit11 = GXt_char1 ;
      GXt_char1 = AV43Lit12 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      pget_mermasresumencliente.this.GXt_char1 = GXv_char2[0] ;
      AV43Lit12 = GXt_char1 ;
      GXt_char1 = AV44Lit13 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2130_", ""), (byte)(99), GXv_char2) ;
      pget_mermasresumencliente.this.GXt_char1 = GXv_char2[0] ;
      AV44Lit13 = GXt_char1 ;
      GXt_char1 = AV45Lit14 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2423_", ""), (byte)(99), GXv_char2) ;
      pget_mermasresumencliente.this.GXt_char1 = GXv_char2[0] ;
      AV45Lit14 = GXt_char1 ;
      GXt_char1 = AV46Lit15 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN403_", ""), (byte)(99), GXv_char2) ;
      pget_mermasresumencliente.this.GXt_char1 = GXv_char2[0] ;
      AV46Lit15 = GXt_char1 ;
      GXt_char1 = AV47Lit16 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2130_", ""), (byte)(99), GXv_char2) ;
      pget_mermasresumencliente.this.GXt_char1 = GXv_char2[0] ;
      AV47Lit16 = GXt_char1 ;
      GXt_char1 = AV48Lit17 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2423_", ""), (byte)(99), GXv_char2) ;
      pget_mermasresumencliente.this.GXt_char1 = GXv_char2[0] ;
      AV48Lit17 = GXt_char1 ;
      GXt_char1 = AV49Lit18 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN403_", ""), (byte)(99), GXv_char2) ;
      pget_mermasresumencliente.this.GXt_char1 = GXv_char2[0] ;
      AV49Lit18 = GXt_char1 ;
      GXt_char1 = AV50Lit19 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN145_", ""), (byte)(99), GXv_char2) ;
      pget_mermasresumencliente.this.GXt_char1 = GXv_char2[0] ;
      AV50Lit19 = GXt_char1 ;
      GXt_char1 = AV51Lit20 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN146_", ""), (byte)(99), GXv_char2) ;
      pget_mermasresumencliente.this.GXt_char1 = GXv_char2[0] ;
      AV51Lit20 = GXt_char1 ;
      GXt_char1 = AV52Lit21 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2447_", ""), (byte)(99), GXv_char2) ;
      pget_mermasresumencliente.this.GXt_char1 = GXv_char2[0] ;
      AV52Lit21 = GXt_char1 ;
      AV62FlagLamina = (byte)(0) ;
      GXv_int3[0] = AV62FlagLamina ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LAMINA", ""), GXv_int3) ;
      pget_mermasresumencliente.this.AV62FlagLamina = GXv_int3[0] ;
      GXv_int3[0] = AV64NCorte ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NCORTE", ""), GXv_int3) ;
      pget_mermasresumencliente.this.AV64NCorte = GXv_int3[0] ;
      GXt_int4 = AV78Moda21 ;
      GXv_int3[0] = GXt_int4 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int3) ;
      pget_mermasresumencliente.this.GXt_int4 = GXv_int3[0] ;
      AV78Moda21 = GXt_int4 ;
      /* Using cursor P09LD2 */
      pr_default.execute(0, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A407EmprNom = P09LD2_A407EmprNom[0] ;
         n407EmprNom = P09LD2_n407EmprNom[0] ;
         AV60NomEmp = A407EmprNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV25TotKgsEnt = DecimalUtil.doubleToDec(0) ;
      AV26TotKgsSal = DecimalUtil.doubleToDec(0) ;
      AV28TotMtsEnt = DecimalUtil.doubleToDec(0) ;
      AV27TotMtsSal = DecimalUtil.doubleToDec(0) ;
      AV85i = (short)(0) ;
      /* Using cursor P09LD3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV11PCliCod), Integer.valueOf(AV12UCliCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A252CliCod = P09LD3_A252CliCod[0] ;
         n252CliCod = P09LD3_n252CliCod[0] ;
         A279CliNom = P09LD3_A279CliNom[0] ;
         AV85i = (short)(AV85i+1) ;
         AV72Clicodi = A252CliCod ;
         AV73CliNom = A279CliNom ;
         AV57TotKDif = DecimalUtil.doubleToDec(0) ;
         AV29TotKDifN = DecimalUtil.doubleToDec(0) ;
         AV25TotKgsEnt = DecimalUtil.doubleToDec(0) ;
         AV26TotKgsSal = DecimalUtil.doubleToDec(0) ;
         AV58TotMDif = DecimalUtil.doubleToDec(0) ;
         AV30TotMDifN = DecimalUtil.doubleToDec(0) ;
         AV28TotMtsEnt = DecimalUtil.doubleToDec(0) ;
         AV27TotMtsSal = DecimalUtil.doubleToDec(0) ;
         /* Execute user subroutine: 'BARCAD' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV57TotKDif = AV75KgsSalF.subtract(AV74KgsEntF) ;
         AV54PorKgs = DecimalUtil.doubleToDec(0) ;
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74KgsEntF)==0) && ( AV75KgsSalF.doubleValue() > 0 ) )
         {
            AV54PorKgs = ((AV57TotKDif.divide(AV74KgsEntF, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))) ;
         }
         AV58TotMDif = AV77MtsSalF.subtract(AV76MtsEntF) ;
         AV56PorMts = DecimalUtil.doubleToDec(0) ;
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV76MtsEntF)==0) && ( AV77MtsSalF.doubleValue() > 0 ) )
         {
            AV56PorMts = ((AV58TotMDif.divide(AV76MtsEntF, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))) ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      cleanup();
   }

   public void S111( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV9PTipArt) ,
                                           Short.valueOf(AV10UTipArt) ,
                                           AV13PSerCod ,
                                           AV14USerCod ,
                                           AV15PColor ,
                                           AV16UColor ,
                                           Integer.valueOf(AV17PColNum) ,
                                           Integer.valueOf(AV18UColNum) ,
                                           AV19PDisCli ,
                                           AV20UDisCli ,
                                           Short.valueOf(A217BarTipArt) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A143BarDisNum ,
                                           A161BarFecSal ,
                                           AV21PFecha ,
                                           AV22UFecha ,
                                           Byte.valueOf(A213BarSit) ,
                                           A396EmprCod ,
                                           Integer.valueOf(AV72Clicodi) ,
                                           Integer.valueOf(A252CliCod) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BOOLEAN
                                           }
      });
      /* Using cursor P09LD5 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV72Clicodi), AV21PFecha, AV22UFecha, Short.valueOf(AV9PTipArt), Short.valueOf(AV10UTipArt), AV13PSerCod, AV14USerCod, AV15PColor, AV16UColor, Integer.valueOf(AV17PColNum), Integer.valueOf(AV18UColNum), AV19PDisCli, AV20UDisCli});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A130BarCodPar = P09LD5_A130BarCodPar[0] ;
         A132BarCodReo = P09LD5_A132BarCodReo[0] ;
         A129BarCod = P09LD5_A129BarCod[0] ;
         A213BarSit = P09LD5_A213BarSit[0] ;
         A161BarFecSal = P09LD5_A161BarFecSal[0] ;
         A143BarDisNum = P09LD5_A143BarDisNum[0] ;
         A136BarColNum = P09LD5_A136BarColNum[0] ;
         A135BarColNom = P09LD5_A135BarColNom[0] ;
         A212BarSer = P09LD5_A212BarSer[0] ;
         A217BarTipArt = P09LD5_A217BarTipArt[0] ;
         n217BarTipArt = P09LD5_n217BarTipArt[0] ;
         A252CliCod = P09LD5_A252CliCod[0] ;
         n252CliCod = P09LD5_n252CliCod[0] ;
         A2827BarKgsLot = P09LD5_A2827BarKgsLot[0] ;
         A166BarKgm = P09LD5_A166BarKgm[0] ;
         A184BarMtr = P09LD5_A184BarMtr[0] ;
         A166BarKgm = P09LD5_A166BarKgm[0] ;
         A184BarMtr = P09LD5_A184BarMtr[0] ;
         AV69Mts_s = DecimalUtil.doubleToDec(0) ;
         AV70Kgs_s = DecimalUtil.doubleToDec(0) ;
         AV71Albbar = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P09LD6 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A1261BarAlbKgmE = P09LD6_A1261BarAlbKgmE[0] ;
            A1263BarAlbMtrE = P09LD6_A1263BarAlbMtrE[0] ;
            A2243BarKgsCli = P09LD6_A2243BarKgsCli[0] ;
            n2243BarKgsCli = P09LD6_n2243BarKgsCli[0] ;
            A1461BarAlbPN = P09LD6_A1461BarAlbPN[0] ;
            A30AlbProCod = P09LD6_A30AlbProCod[0] ;
            AV79BarAlbKgmE = A1261BarAlbKgmE ;
            AV80BarAlbMtrE = A1263BarAlbMtrE ;
            if ( AV78Moda21 == 1 )
            {
               if ( A2243BarKgsCli.doubleValue() != 0 )
               {
                  AV79BarAlbKgmE = A2243BarKgsCli ;
               }
               if ( A1461BarAlbPN.doubleValue() != 0 )
               {
                  AV80BarAlbMtrE = A1461BarAlbPN ;
               }
            }
            AV69Mts_s = AV69Mts_s.add(AV80BarAlbMtrE) ;
            AV70Kgs_s = AV70Kgs_s.add(AV79BarAlbKgmE) ;
            AV71Albbar = DecimalUtil.doubleToDec(1) ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         if ( AV71Albbar.doubleValue() == 0 )
         {
            /* Optimized group. */
            /* Using cursor P09LD7 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            c183BarMetLan = P09LD7_A183BarMetLan[0] ;
            c170BarKilLan = P09LD7_A170BarKilLan[0] ;
            pr_default.close(4);
            AV69Mts_s = AV69Mts_s.add(c183BarMetLan) ;
            AV70Kgs_s = AV70Kgs_s.add(c170BarKilLan) ;
            /* End optimized group. */
         }
         AV63BarKgm = A166BarKgm ;
         if ( ( A2827BarKgsLot.doubleValue() != 0 ) && ( AV62FlagLamina == 1 ) )
         {
            AV63BarKgm = A2827BarKgsLot ;
         }
         if ( AV64NCorte == 1 )
         {
            AV66CliCod = A252CliCod ;
            AV67ArtCod = A212BarSer ;
            /* Execute user subroutine: 'BUSCA_CORTES' */
            S124 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               pr_default.close(2);
               returnInSub = true;
               if (true) return;
            }
            AV68BarMtrLan = AV69Mts_s.divide(DecimalUtil.doubleToDec((AV65ArtNumCor+1)), 18, java.math.RoundingMode.DOWN) ;
         }
         else
         {
            AV68BarMtrLan = AV69Mts_s ;
         }
         AV25TotKgsEnt = AV25TotKgsEnt.add(AV63BarKgm) ;
         AV26TotKgsSal = AV26TotKgsSal.add(AV70Kgs_s) ;
         AV28TotMtsEnt = AV28TotMtsEnt.add(A184BarMtr) ;
         AV27TotMtsSal = AV27TotMtsSal.add(AV68BarMtrLan) ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV54PorKgs = DecimalUtil.doubleToDec(0) ;
      if ( ( AV25TotKgsEnt.doubleValue() == 0 ) && ( AV28TotMtsEnt.doubleValue() == 0 ) )
      {
      }
      else
      {
         AV57TotKDif = AV26TotKgsSal.subtract(AV25TotKgsEnt) ;
         AV54PorKgs = DecimalUtil.doubleToDec(0) ;
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV25TotKgsEnt)==0) && ( AV26TotKgsSal.doubleValue() > 0 ) )
         {
            AV54PorKgs = ((AV57TotKDif.divide(AV25TotKgsEnt, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))) ;
         }
         AV56PorMts = DecimalUtil.doubleToDec(0) ;
         AV58TotMDif = AV27TotMtsSal.subtract(AV28TotMtsEnt) ;
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV28TotMtsEnt)==0) && ( AV27TotMtsSal.doubleValue() > 0 ) )
         {
            AV56PorMts = ((AV58TotMDif.divide(AV28TotMtsEnt, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100))) ;
         }
         AV74KgsEntF = AV74KgsEntF.add(AV25TotKgsEnt) ;
         AV75KgsSalF = AV75KgsSalF.add(AV26TotKgsSal) ;
         AV76MtsEntF = AV76MtsEntF.add(AV28TotMtsEnt) ;
         AV77MtsSalF = AV77MtsSalF.add(AV27TotMtsSal) ;
         AV82SDTMermasResumen = (app.SdtSDTMermasResumenCliente)new app.SdtSDTMermasResumenCliente(remoteHandle, context);
         AV82SDTMermasResumen.setgxTv_SdtSDTMermasResumenCliente_Clicod( A252CliCod );
         AV82SDTMermasResumen.setgxTv_SdtSDTMermasResumenCliente_Clinom( A279CliNom );
         AV83SDTMermasResumenCliente_level = (app.SdtSDTMermasResumenCliente_ResumenItem)new app.SdtSDTMermasResumenCliente_ResumenItem(remoteHandle, context);
         AV83SDTMermasResumenCliente_level.setgxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosent( AV25TotKgsEnt );
         AV83SDTMermasResumenCliente_level.setgxTv_SdtSDTMermasResumenCliente_ResumenItem_Kilosexp( AV26TotKgsSal );
         AV83SDTMermasResumenCliente_level.setgxTv_SdtSDTMermasResumenCliente_ResumenItem_Difkilos( AV57TotKDif );
         AV83SDTMermasResumenCliente_level.setgxTv_SdtSDTMermasResumenCliente_ResumenItem_Porkilos( AV54PorKgs );
         AV83SDTMermasResumenCliente_level.setgxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosent( AV28TotMtsEnt );
         AV83SDTMermasResumenCliente_level.setgxTv_SdtSDTMermasResumenCliente_ResumenItem_Metrosexp( AV27TotMtsSal );
         AV83SDTMermasResumenCliente_level.setgxTv_SdtSDTMermasResumenCliente_ResumenItem_Difmetros( AV58TotMDif );
         AV83SDTMermasResumenCliente_level.setgxTv_SdtSDTMermasResumenCliente_ResumenItem_Pormetros( AV56PorMts );
         AV82SDTMermasResumen.getgxTv_SdtSDTMermasResumenCliente_Resumen().add(AV83SDTMermasResumenCliente_level, 0);
         AV81SDTMermasResumenCliente.add(AV82SDTMermasResumen, 0);
      }
   }

   public void S124( )
   {
      /* 'BUSCA_CORTES' Routine */
      returnInSub = false ;
      AV65ArtNumCor = (short)(0) ;
      /* Using cursor P09LD8 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV66CliCod), AV67ArtCod});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A65ArtCod = P09LD8_A65ArtCod[0] ;
         A252CliCod = P09LD8_A252CliCod[0] ;
         n252CliCod = P09LD8_n252CliCod[0] ;
         A3121ArtNumCor = P09LD8_A3121ArtNumCor[0] ;
         n3121ArtNumCor = P09LD8_n3121ArtNumCor[0] ;
         AV65ArtNumCor = A3121ArtNumCor ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
   }

   protected void cleanup( )
   {
      this.aP16[0] = pget_mermasresumencliente.this.AV81SDTMermasResumenCliente;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV81SDTMermasResumenCliente = new GXBaseCollection<app.SdtSDTMermasResumenCliente>(app.SdtSDTMermasResumenCliente.class, "SDTMermasResumenCliente", "TexplusNET", remoteHandle);
      AV31Lit0 = "" ;
      AV32Lit1 = "" ;
      AV33Lit2 = "" ;
      AV34Lit3 = "" ;
      AV35Lit4 = "" ;
      AV36Lit5 = "" ;
      AV37Lit6 = "" ;
      AV38Lit7 = "" ;
      AV39Lit8 = "" ;
      AV40Lit9 = "" ;
      AV41Lit10 = "" ;
      AV42Lit11 = "" ;
      AV43Lit12 = "" ;
      AV44Lit13 = "" ;
      AV45Lit14 = "" ;
      AV46Lit15 = "" ;
      AV47Lit16 = "" ;
      AV48Lit17 = "" ;
      AV49Lit18 = "" ;
      AV50Lit19 = "" ;
      AV51Lit20 = "" ;
      AV52Lit21 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new byte[1] ;
      scmdbuf = "" ;
      P09LD2_A396EmprCod = new String[] {""} ;
      P09LD2_A407EmprNom = new String[] {""} ;
      P09LD2_n407EmprNom = new boolean[] {false} ;
      A407EmprNom = "" ;
      AV60NomEmp = "" ;
      AV25TotKgsEnt = DecimalUtil.ZERO ;
      AV26TotKgsSal = DecimalUtil.ZERO ;
      AV28TotMtsEnt = DecimalUtil.ZERO ;
      AV27TotMtsSal = DecimalUtil.ZERO ;
      P09LD3_A396EmprCod = new String[] {""} ;
      P09LD3_A252CliCod = new int[1] ;
      P09LD3_n252CliCod = new boolean[] {false} ;
      P09LD3_A279CliNom = new String[] {""} ;
      A279CliNom = "" ;
      AV73CliNom = "" ;
      AV57TotKDif = DecimalUtil.ZERO ;
      AV29TotKDifN = DecimalUtil.ZERO ;
      AV58TotMDif = DecimalUtil.ZERO ;
      AV30TotMDifN = DecimalUtil.ZERO ;
      AV75KgsSalF = DecimalUtil.ZERO ;
      AV74KgsEntF = DecimalUtil.ZERO ;
      AV54PorKgs = DecimalUtil.ZERO ;
      AV77MtsSalF = DecimalUtil.ZERO ;
      AV76MtsEntF = DecimalUtil.ZERO ;
      AV56PorMts = DecimalUtil.ZERO ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A143BarDisNum = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      P09LD5_A396EmprCod = new String[] {""} ;
      P09LD5_A130BarCodPar = new String[] {""} ;
      P09LD5_A132BarCodReo = new byte[1] ;
      P09LD5_A129BarCod = new int[1] ;
      P09LD5_A213BarSit = new byte[1] ;
      P09LD5_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P09LD5_A143BarDisNum = new String[] {""} ;
      P09LD5_A136BarColNum = new int[1] ;
      P09LD5_A135BarColNom = new String[] {""} ;
      P09LD5_A212BarSer = new String[] {""} ;
      P09LD5_A217BarTipArt = new short[1] ;
      P09LD5_n217BarTipArt = new boolean[] {false} ;
      P09LD5_A252CliCod = new int[1] ;
      P09LD5_n252CliCod = new boolean[] {false} ;
      P09LD5_A2827BarKgsLot = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LD5_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LD5_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A2827BarKgsLot = DecimalUtil.ZERO ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      AV69Mts_s = DecimalUtil.ZERO ;
      AV70Kgs_s = DecimalUtil.ZERO ;
      AV71Albbar = DecimalUtil.ZERO ;
      P09LD6_A396EmprCod = new String[] {""} ;
      P09LD6_A129BarCod = new int[1] ;
      P09LD6_A132BarCodReo = new byte[1] ;
      P09LD6_A130BarCodPar = new String[] {""} ;
      P09LD6_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LD6_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LD6_A2243BarKgsCli = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LD6_n2243BarKgsCli = new boolean[] {false} ;
      P09LD6_A1461BarAlbPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LD6_A30AlbProCod = new long[1] ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A2243BarKgsCli = DecimalUtil.ZERO ;
      A1461BarAlbPN = DecimalUtil.ZERO ;
      AV79BarAlbKgmE = DecimalUtil.ZERO ;
      AV80BarAlbMtrE = DecimalUtil.ZERO ;
      c183BarMetLan = DecimalUtil.ZERO ;
      c170BarKilLan = DecimalUtil.ZERO ;
      P09LD7_A183BarMetLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09LD7_A170BarKilLan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      AV63BarKgm = DecimalUtil.ZERO ;
      AV67ArtCod = "" ;
      AV68BarMtrLan = DecimalUtil.ZERO ;
      AV82SDTMermasResumen = new app.SdtSDTMermasResumenCliente(remoteHandle, context);
      AV83SDTMermasResumenCliente_level = new app.SdtSDTMermasResumenCliente_ResumenItem(remoteHandle, context);
      P09LD8_A396EmprCod = new String[] {""} ;
      P09LD8_A65ArtCod = new String[] {""} ;
      P09LD8_A252CliCod = new int[1] ;
      P09LD8_n252CliCod = new boolean[] {false} ;
      P09LD8_A3121ArtNumCor = new short[1] ;
      P09LD8_n3121ArtNumCor = new boolean[] {false} ;
      A65ArtCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pget_mermasresumencliente__default(),
         new Object[] {
             new Object[] {
            P09LD2_A396EmprCod, P09LD2_A407EmprNom, P09LD2_n407EmprNom
            }
            , new Object[] {
            P09LD3_A396EmprCod, P09LD3_A252CliCod, P09LD3_A279CliNom
            }
            , new Object[] {
            P09LD5_A396EmprCod, P09LD5_A130BarCodPar, P09LD5_A132BarCodReo, P09LD5_A129BarCod, P09LD5_A213BarSit, P09LD5_A161BarFecSal, P09LD5_A143BarDisNum, P09LD5_A136BarColNum, P09LD5_A135BarColNom, P09LD5_A212BarSer,
            P09LD5_A217BarTipArt, P09LD5_n217BarTipArt, P09LD5_A252CliCod, P09LD5_n252CliCod, P09LD5_A2827BarKgsLot, P09LD5_A166BarKgm, P09LD5_A184BarMtr
            }
            , new Object[] {
            P09LD6_A396EmprCod, P09LD6_A129BarCod, P09LD6_A132BarCodReo, P09LD6_A130BarCodPar, P09LD6_A1261BarAlbKgmE, P09LD6_A1263BarAlbMtrE, P09LD6_A2243BarKgsCli, P09LD6_n2243BarKgsCli, P09LD6_A1461BarAlbPN, P09LD6_A30AlbProCod
            }
            , new Object[] {
            P09LD7_A183BarMetLan, P09LD7_A170BarKilLan
            }
            , new Object[] {
            P09LD8_A396EmprCod, P09LD8_A65ArtCod, P09LD8_A252CliCod, P09LD8_A3121ArtNumCor, P09LD8_n3121ArtNumCor
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV62FlagLamina ;
   private byte AV64NCorte ;
   private byte AV78Moda21 ;
   private byte GXt_int4 ;
   private byte GXv_int3[] ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private short AV9PTipArt ;
   private short AV10UTipArt ;
   private short AV85i ;
   private short A217BarTipArt ;
   private short AV65ArtNumCor ;
   private short A3121ArtNumCor ;
   private short Gx_err ;
   private int AV11PCliCod ;
   private int AV12UCliCod ;
   private int AV17PColNum ;
   private int AV18UColNum ;
   private int A252CliCod ;
   private int AV72Clicodi ;
   private int A136BarColNum ;
   private int A129BarCod ;
   private int AV66CliCod ;
   private long A30AlbProCod ;
   private java.math.BigDecimal AV25TotKgsEnt ;
   private java.math.BigDecimal AV26TotKgsSal ;
   private java.math.BigDecimal AV28TotMtsEnt ;
   private java.math.BigDecimal AV27TotMtsSal ;
   private java.math.BigDecimal AV57TotKDif ;
   private java.math.BigDecimal AV29TotKDifN ;
   private java.math.BigDecimal AV58TotMDif ;
   private java.math.BigDecimal AV30TotMDifN ;
   private java.math.BigDecimal AV75KgsSalF ;
   private java.math.BigDecimal AV74KgsEntF ;
   private java.math.BigDecimal AV54PorKgs ;
   private java.math.BigDecimal AV77MtsSalF ;
   private java.math.BigDecimal AV76MtsEntF ;
   private java.math.BigDecimal AV56PorMts ;
   private java.math.BigDecimal A2827BarKgsLot ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV69Mts_s ;
   private java.math.BigDecimal AV70Kgs_s ;
   private java.math.BigDecimal AV71Albbar ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A2243BarKgsCli ;
   private java.math.BigDecimal A1461BarAlbPN ;
   private java.math.BigDecimal AV79BarAlbKgmE ;
   private java.math.BigDecimal AV80BarAlbMtrE ;
   private java.math.BigDecimal c183BarMetLan ;
   private java.math.BigDecimal c170BarKilLan ;
   private java.math.BigDecimal AV63BarKgm ;
   private java.math.BigDecimal AV68BarMtrLan ;
   private String A396EmprCod ;
   private String AV8ImpCod ;
   private String AV13PSerCod ;
   private String AV14USerCod ;
   private String AV15PColor ;
   private String AV16UColor ;
   private String AV19PDisCli ;
   private String AV20UDisCli ;
   private String AV31Lit0 ;
   private String AV32Lit1 ;
   private String AV33Lit2 ;
   private String AV34Lit3 ;
   private String AV35Lit4 ;
   private String AV36Lit5 ;
   private String AV37Lit6 ;
   private String AV38Lit7 ;
   private String AV39Lit8 ;
   private String AV40Lit9 ;
   private String AV41Lit10 ;
   private String AV42Lit11 ;
   private String AV43Lit12 ;
   private String AV44Lit13 ;
   private String AV45Lit14 ;
   private String AV46Lit15 ;
   private String AV47Lit16 ;
   private String AV48Lit17 ;
   private String AV49Lit18 ;
   private String AV50Lit19 ;
   private String AV51Lit20 ;
   private String AV52Lit21 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A407EmprNom ;
   private String AV60NomEmp ;
   private String A279CliNom ;
   private String AV73CliNom ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A143BarDisNum ;
   private String A130BarCodPar ;
   private String AV67ArtCod ;
   private String A65ArtCod ;
   private java.util.Date AV21PFecha ;
   private java.util.Date AV22UFecha ;
   private java.util.Date A161BarFecSal ;
   private boolean n407EmprNom ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n217BarTipArt ;
   private boolean n2243BarKgsCli ;
   private boolean n3121ArtNumCor ;
   private GXBaseCollection<app.SdtSDTMermasResumenCliente>[] aP16 ;
   private IDataStoreProvider pr_default ;
   private String[] P09LD2_A396EmprCod ;
   private String[] P09LD2_A407EmprNom ;
   private boolean[] P09LD2_n407EmprNom ;
   private String[] P09LD3_A396EmprCod ;
   private int[] P09LD3_A252CliCod ;
   private boolean[] P09LD3_n252CliCod ;
   private String[] P09LD3_A279CliNom ;
   private String[] P09LD5_A396EmprCod ;
   private String[] P09LD5_A130BarCodPar ;
   private byte[] P09LD5_A132BarCodReo ;
   private int[] P09LD5_A129BarCod ;
   private byte[] P09LD5_A213BarSit ;
   private java.util.Date[] P09LD5_A161BarFecSal ;
   private String[] P09LD5_A143BarDisNum ;
   private int[] P09LD5_A136BarColNum ;
   private String[] P09LD5_A135BarColNom ;
   private String[] P09LD5_A212BarSer ;
   private short[] P09LD5_A217BarTipArt ;
   private boolean[] P09LD5_n217BarTipArt ;
   private int[] P09LD5_A252CliCod ;
   private boolean[] P09LD5_n252CliCod ;
   private java.math.BigDecimal[] P09LD5_A2827BarKgsLot ;
   private java.math.BigDecimal[] P09LD5_A166BarKgm ;
   private java.math.BigDecimal[] P09LD5_A184BarMtr ;
   private String[] P09LD6_A396EmprCod ;
   private int[] P09LD6_A129BarCod ;
   private byte[] P09LD6_A132BarCodReo ;
   private String[] P09LD6_A130BarCodPar ;
   private java.math.BigDecimal[] P09LD6_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] P09LD6_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P09LD6_A2243BarKgsCli ;
   private boolean[] P09LD6_n2243BarKgsCli ;
   private java.math.BigDecimal[] P09LD6_A1461BarAlbPN ;
   private long[] P09LD6_A30AlbProCod ;
   private java.math.BigDecimal[] P09LD7_A183BarMetLan ;
   private java.math.BigDecimal[] P09LD7_A170BarKilLan ;
   private String[] P09LD8_A396EmprCod ;
   private String[] P09LD8_A65ArtCod ;
   private int[] P09LD8_A252CliCod ;
   private boolean[] P09LD8_n252CliCod ;
   private short[] P09LD8_A3121ArtNumCor ;
   private boolean[] P09LD8_n3121ArtNumCor ;
   private GXBaseCollection<app.SdtSDTMermasResumenCliente> AV81SDTMermasResumenCliente ;
   private app.SdtSDTMermasResumenCliente AV82SDTMermasResumen ;
   private app.SdtSDTMermasResumenCliente_ResumenItem AV83SDTMermasResumenCliente_level ;
}

final  class pget_mermasresumencliente__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P09LD5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV9PTipArt ,
                                          short AV10UTipArt ,
                                          String AV13PSerCod ,
                                          String AV14USerCod ,
                                          String AV15PColor ,
                                          String AV16UColor ,
                                          int AV17PColNum ,
                                          int AV18UColNum ,
                                          String AV19PDisCli ,
                                          String AV20UDisCli ,
                                          short A217BarTipArt ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A143BarDisNum ,
                                          java.util.Date A161BarFecSal ,
                                          java.util.Date AV21PFecha ,
                                          java.util.Date AV22UFecha ,
                                          byte A213BarSit ,
                                          String A396EmprCod ,
                                          int AV72Clicodi ,
                                          int A252CliCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int5 = new byte[14];
      Object[] GXv_Object6 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarSit, T1.BarFecSal, T1.BarDisNum, T1.BarColNum, T1.BarColNom, T1.BarSer, T1.BarTipArt, T1.CliCod," ;
      scmdbuf += " T1.BarKgsLot, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod" ;
      scmdbuf += " AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.CliCod = ?)");
      addWhere(sWhereString, "(T1.BarFecSal >= ? and T1.BarFecSal <= ?)");
      addWhere(sWhereString, "(T1.BarSit >= 9)");
      if ( ! (0==AV9PTipArt) && ! (0==AV10UTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ? and T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
         GXv_int5[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13PSerCod)==0) && ! (GXutil.strcmp("", AV14USerCod)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ? and T1.BarSer <= ?)");
      }
      else
      {
         GXv_int5[6] = (byte)(1) ;
         GXv_int5[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15PColor)==0) && ! (GXutil.strcmp("", AV16UColor)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ? and T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int5[8] = (byte)(1) ;
         GXv_int5[9] = (byte)(1) ;
      }
      if ( ! (0==AV17PColNum) && ! (0==AV18UColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ? and T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int5[10] = (byte)(1) ;
         GXv_int5[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV19PDisCli)==0) && ! (GXutil.strcmp("", AV20UDisCli)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum >= ? and T1.BarDisNum <= ?)");
      }
      else
      {
         GXv_int5[12] = (byte)(1) ;
         GXv_int5[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod" ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 2 :
                  return conditional_P09LD5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).intValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09LD2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09LD3", "SELECT EmprCod, CliCod, CliNom FROM TXPCLIENT WHERE (EmprCod = ? and CliCod >= ?) AND (CliCod <= ?) ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LD5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LD6", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarAlbKgmE, BarAlbMtrE, BarKgsCli, BarAlbPN, AlbProCod FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LD7", "SELECT SUM(BarMetLan), SUM(BarKilLan) FROM TXPBARPIE WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09LD8", "SELECT EmprCod, ArtCod, CliCod, ArtNumCor FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 13);
               ((String[]) buf[9])[0] = rslt.getString(10, 16);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(15,2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,2);
               ((long[]) buf[9])[0] = rslt.getLong(9);
               return;
            case 4 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[16]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 13);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 13);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 8);
               }
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
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

