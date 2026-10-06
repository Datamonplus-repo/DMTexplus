package app.costesbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class costesbasicos_prc extends GXProcedure
{
   public costesbasicos_prc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( costesbasicos_prc.class ), "" );
   }

   public costesbasicos_prc( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             int aP5 ,
                             int aP6 ,
                             java.util.Date aP7 ,
                             java.util.Date aP8 ,
                             java.util.Date aP9 ,
                             java.util.Date aP10 )
   {
      costesbasicos_prc.this.aP11 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
      return aP11[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        byte aP3 ,
                        String aP4 ,
                        int aP5 ,
                        int aP6 ,
                        java.util.Date aP7 ,
                        java.util.Date aP8 ,
                        java.util.Date aP9 ,
                        java.util.Date aP10 ,
                        String[] aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             byte aP3 ,
                             String aP4 ,
                             int aP5 ,
                             int aP6 ,
                             java.util.Date aP7 ,
                             java.util.Date aP8 ,
                             java.util.Date aP9 ,
                             java.util.Date aP10 ,
                             String[] aP11 )
   {
      costesbasicos_prc.this.AV8Emprcod = aP0;
      costesbasicos_prc.this.AV18Artcod = aP1;
      costesbasicos_prc.this.AV15Barcod1 = aP2;
      costesbasicos_prc.this.AV16Barcodreo1 = aP3;
      costesbasicos_prc.this.AV17Barcodpar1 = aP4;
      costesbasicos_prc.this.AV9Clicod1 = aP5;
      costesbasicos_prc.this.AV10Clicod3 = aP6;
      costesbasicos_prc.this.AV13fec1 = aP7;
      costesbasicos_prc.this.AV14Fec2 = aP8;
      costesbasicos_prc.this.AV11fec3 = aP9;
      costesbasicos_prc.this.AV12Fec4 = aP10;
      costesbasicos_prc.this.aP11 = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = (byte)(AV37CosTiR) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV8Emprcod, httpContext.getMessage( "COSTIR", ""), GXv_int2) ;
      costesbasicos_prc.this.GXt_int1 = GXv_int2[0] ;
      AV37CosTiR = GXt_int1 ;
      GXt_int1 = (byte)(AV38TasasEstandar) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV8Emprcod, httpContext.getMessage( "TASSTD", ""), GXv_int2) ;
      costesbasicos_prc.this.GXt_int1 = GXv_int2[0] ;
      AV38TasasEstandar = GXt_int1 ;
      GXt_int1 = (byte)(AV39Moda21) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV8Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
      costesbasicos_prc.this.GXt_int1 = GXv_int2[0] ;
      AV39Moda21 = GXt_int1 ;
      GXt_int1 = AV36reoperados ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV8Emprcod, httpContext.getMessage( "NCHROR", ""), GXv_int2) ;
      costesbasicos_prc.this.GXt_int1 = GXv_int2[0] ;
      AV36reoperados = GXt_int1 ;
      AV19CostesBasicos_SDT.clear();
      AV21CostesBasicos_SDTJson = "" ;
      AV73GXLvl17 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Integer.valueOf(AV9Clicod1) ,
                                           Integer.valueOf(AV10Clicod3) ,
                                           AV11fec3 ,
                                           AV12Fec4 ,
                                           AV18Artcod ,
                                           AV13fec1 ,
                                           AV14Fec2 ,
                                           Integer.valueOf(AV15Barcod1) ,
                                           Byte.valueOf(AV16Barcodreo1) ,
                                           AV17Barcodpar1 ,
                                           Integer.valueOf(A252CliCod) ,
                                           A159BarFecGen ,
                                           A212BarSer ,
                                           A161BarFecSal ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           AV8Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV18Artcod = GXutil.padr( GXutil.rtrim( AV18Artcod), 16, "%") ;
      /* Using cursor P0AT83 */
      pr_default.execute(0, new Object[] {AV8Emprcod, Integer.valueOf(AV9Clicod1), Integer.valueOf(AV10Clicod3), AV11fec3, AV12Fec4, lV18Artcod, AV13fec1, AV14Fec2, Integer.valueOf(AV15Barcod1), Byte.valueOf(AV16Barcodreo1), AV17Barcodpar1});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P0AT83_A396EmprCod[0] ;
         A161BarFecSal = P0AT83_A161BarFecSal[0] ;
         A212BarSer = P0AT83_A212BarSer[0] ;
         A159BarFecGen = P0AT83_A159BarFecGen[0] ;
         A252CliCod = P0AT83_A252CliCod[0] ;
         n252CliCod = P0AT83_n252CliCod[0] ;
         A228BarUniMed = P0AT83_A228BarUniMed[0] ;
         A141BarCosPro = P0AT83_A141BarCosPro[0] ;
         A213BarSit = P0AT83_A213BarSit[0] ;
         A140BarCosAny = P0AT83_A140BarCosAny[0] ;
         A148BarEstReo = P0AT83_A148BarEstReo[0] ;
         A135BarColNom = P0AT83_A135BarColNom[0] ;
         A136BarColNum = P0AT83_A136BarColNum[0] ;
         A1652BarSerDsc = P0AT83_A1652BarSerDsc[0] ;
         A217BarTipArt = P0AT83_A217BarTipArt[0] ;
         n217BarTipArt = P0AT83_n217BarTipArt[0] ;
         A279CliNom = P0AT83_A279CliNom[0] ;
         A166BarKgm = P0AT83_A166BarKgm[0] ;
         A184BarMtr = P0AT83_A184BarMtr[0] ;
         A130BarCodPar = P0AT83_A130BarCodPar[0] ;
         A132BarCodReo = P0AT83_A132BarCodReo[0] ;
         A129BarCod = P0AT83_A129BarCod[0] ;
         A279CliNom = P0AT83_A279CliNom[0] ;
         A166BarKgm = P0AT83_A166BarKgm[0] ;
         A184BarMtr = P0AT83_A184BarMtr[0] ;
         A13696BarNHdr = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A132BarCodReo, 1, 0)) + A130BarCodPar ;
         AV73GXLvl17 = (byte)(1) ;
         AV68BarCod = A129BarCod ;
         /* Execute user subroutine: 'ALBBAR' */
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
         AV24Barunimed = A228BarUniMed ;
         AV22BarKgm = A166BarKgm ;
         AV23barMtr = A184BarMtr ;
         GXv_decimal3[0] = AV25Costefab ;
         GXv_decimal4[0] = AV26CosteTeo ;
         GXv_decimal5[0] = AV27mAgua ;
         GXv_decimal6[0] = AV28menergia ;
         GXv_decimal7[0] = AV29mgas ;
         GXv_decimal8[0] = AV30mmod ;
         GXv_decimal9[0] = AV31mmoi ;
         GXv_decimal10[0] = AV32madc ;
         GXv_decimal11[0] = AV33mam ;
         GXv_decimal12[0] = AV34mgi ;
         GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
         new app.costesbasicos.costesbasicos_00(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV24Barunimed, AV22BarKgm, AV23barMtr, GXv_decimal3, GXv_decimal4, GXv_decimal5, GXv_decimal6, GXv_decimal7, GXv_decimal8, GXv_decimal9, GXv_decimal10, GXv_decimal11, GXv_decimal12, GXv_decimal13, AV35Traza, AV36reoperados) ;
         costesbasicos_prc.this.AV25Costefab = GXv_decimal3[0] ;
         costesbasicos_prc.this.AV26CosteTeo = GXv_decimal4[0] ;
         costesbasicos_prc.this.AV27mAgua = GXv_decimal5[0] ;
         costesbasicos_prc.this.AV28menergia = GXv_decimal6[0] ;
         costesbasicos_prc.this.AV29mgas = GXv_decimal7[0] ;
         costesbasicos_prc.this.AV30mmod = GXv_decimal8[0] ;
         costesbasicos_prc.this.AV31mmoi = GXv_decimal9[0] ;
         costesbasicos_prc.this.AV32madc = GXv_decimal10[0] ;
         costesbasicos_prc.this.AV33mam = GXv_decimal11[0] ;
         costesbasicos_prc.this.AV34mgi = GXv_decimal12[0] ;
         AV25Costefab = ((AV38TasasEstandar==1) ? (AV27mAgua.add(AV28menergia).add(AV29mgas).add(AV30mmod).add(AV31mmoi).add(AV32madc).add(AV33mam).add(AV34mgi)) : AV25Costefab) ;
         GXv_decimal13[0] = AV40Barcosprolconti ;
         GXv_decimal12[0] = AV41BarCosAnylconti ;
         GXv_decimal11[0] = AV42BarKgmTin ;
         GXv_decimal10[0] = AV43BarMtrTin ;
         GXv_int2[0] = AV44lconti ;
         new app.costesbasicos.pcoslconti(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal13, GXv_decimal12, GXv_decimal11, GXv_decimal10, GXv_int2) ;
         costesbasicos_prc.this.AV40Barcosprolconti = GXv_decimal13[0] ;
         costesbasicos_prc.this.AV41BarCosAnylconti = GXv_decimal12[0] ;
         costesbasicos_prc.this.AV42BarKgmTin = GXv_decimal11[0] ;
         costesbasicos_prc.this.AV43BarMtrTin = GXv_decimal10[0] ;
         costesbasicos_prc.this.AV44lconti = GXv_int2[0] ;
         AV45BarCosPro = ((A213BarSit>=9)&&(((A166BarKgm.doubleValue()==0)&&(GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "K", ""))==0))||((A184BarMtr.doubleValue()==0)&&(GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "M", ""))==0))) ? AV40Barcosprolconti : A141BarCosPro) ;
         AV46BarCosAny = ((A213BarSit>=9)&&(((A166BarKgm.doubleValue()==0)&&(GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "K", ""))==0))||((A184BarMtr.doubleValue()==0)&&(GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "M", ""))==0))) ? AV41BarCosAnylconti : A140BarCosAny) ;
         if ( AV44lconti == 1 )
         {
            AV45BarCosPro = ((A148BarEstReo==1)&&((A166BarKgm.doubleValue()>0)||(A184BarMtr.doubleValue()>0))&&(AV36reoperados==1) ? AV40Barcosprolconti : AV45BarCosPro) ;
            AV46BarCosAny = ((A148BarEstReo==1)&&((A166BarKgm.doubleValue()>0)||(A184BarMtr.doubleValue()>0))&&(AV36reoperados==1) ? AV41BarCosAnylconti : AV46BarCosAny) ;
         }
         AV22BarKgm = ((A213BarSit>=9)&&(A166BarKgm.doubleValue()==0) ? AV42BarKgmTin : A166BarKgm) ;
         AV23barMtr = ((A213BarSit>=9)&&(A184BarMtr.doubleValue()==0) ? AV43BarMtrTin : A184BarMtr) ;
         AV47Coste_p = (AV45BarCosPro.add(AV46BarCosAny)) ;
         AV48CostepOld = (AV45BarCosPro.add(AV46BarCosAny)) ;
         AV49Costest = DecimalUtil.doubleToDec(0) ;
         AV50costefab2 = DecimalUtil.ZERO ;
         AV51Barcosprolcontiorigen = DecimalUtil.ZERO ;
         AV52BarCosAnylcontiorigen = DecimalUtil.ZERO ;
         if ( ( A148BarEstReo == 1 ) && ( AV36reoperados == 1 ) && ( ( ( A166BarKgm.doubleValue() == 0 ) && ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "K", "")) == 0 ) ) || ( ( A184BarMtr.doubleValue() == 0 ) && ( GXutil.strcmp(A228BarUniMed, httpContext.getMessage( "M", "")) == 0 ) ) ) )
         {
            GXv_char14[0] = A396EmprCod ;
            GXv_int15[0] = A129BarCod ;
            GXv_int2[0] = A132BarCodReo ;
            GXv_char16[0] = A130BarCodPar ;
            GXv_decimal13[0] = AV50costefab2 ;
            new app.costesbasicos.pprc393(remoteHandle, context).execute( GXv_char14, GXv_int15, GXv_int2, GXv_char16, GXv_decimal13, AV36reoperados) ;
            costesbasicos_prc.this.A396EmprCod = GXv_char14[0] ;
            costesbasicos_prc.this.A129BarCod = GXv_int15[0] ;
            costesbasicos_prc.this.A132BarCodReo = GXv_int2[0] ;
            costesbasicos_prc.this.A130BarCodPar = GXv_char16[0] ;
            costesbasicos_prc.this.AV50costefab2 = GXv_decimal13[0] ;
            GXv_decimal13[0] = AV51Barcosprolcontiorigen ;
            GXv_decimal12[0] = AV52BarCosAnylcontiorigen ;
            new app.costesbasicos.porcoslconti(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_decimal13, GXv_decimal12) ;
            costesbasicos_prc.this.AV51Barcosprolcontiorigen = GXv_decimal13[0] ;
            costesbasicos_prc.this.AV52BarCosAnylcontiorigen = GXv_decimal12[0] ;
         }
         AV53CostefabAcumulado = (AV25Costefab.add(AV50costefab2)) ;
         AV54costequimicoacumulado = (AV46BarCosAny.add(AV45BarCosPro)).add((AV52BarCosAnylcontiorigen.add(AV51Barcosprolcontiorigen))) ;
         AV55Coste_t = (AV25Costefab.add(AV50costefab2)).add(AV47Coste_p).add(AV49Costest) ;
         AV56Margen = AV59Valor.subtract(AV55Coste_t) ;
         AV57costofinalmerma = AV47Coste_p.add(AV25Costefab) ;
         AV20CostesBasicos_SDTItem = (app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem)new app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem(remoteHandle, context);
         AV20CostesBasicos_SDTItem.setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcod( A129BarCod );
         AV20CostesBasicos_SDTItem.setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodreo( A132BarCodReo );
         AV20CostesBasicos_SDTItem.setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcodpar( A130BarCodPar );
         AV20CostesBasicos_SDTItem.setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnom( A135BarColNom );
         AV20CostesBasicos_SDTItem.setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barcolnum( A136BarColNum );
         AV20CostesBasicos_SDTItem.setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen( A159BarFecGen );
         AV20CostesBasicos_SDTItem.setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal( A161BarFecSal );
         AV20CostesBasicos_SDTItem.setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barkgm( AV22BarKgm );
         AV20CostesBasicos_SDTItem.setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barmtr( AV23barMtr );
         AV20CostesBasicos_SDTItem.setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barnhdr( A13696BarNHdr );
         AV20CostesBasicos_SDTItem.setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barser( A212BarSer );
         AV20CostesBasicos_SDTItem.setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barserdsc( A1652BarSerDsc );
         AV20CostesBasicos_SDTItem.setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Bartipart( A217BarTipArt );
         AV20CostesBasicos_SDTItem.setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barunimed( A228BarUniMed );
         AV20CostesBasicos_SDTItem.setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clicod( A252CliCod );
         AV20CostesBasicos_SDTItem.setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Clinom( A279CliNom );
         AV20CostesBasicos_SDTItem.setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Coste_p( AV47Coste_p );
         AV20CostesBasicos_SDTItem.setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costequimicoacumulado( AV54costequimicoacumulado );
         AV20CostesBasicos_SDTItem.setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab( AV25Costefab );
         AV20CostesBasicos_SDTItem.setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefab2( AV50costefab2 );
         AV20CostesBasicos_SDTItem.setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costefabacumulado( AV53CostefabAcumulado );
         AV20CostesBasicos_SDTItem.setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Valor( AV59Valor );
         AV20CostesBasicos_SDTItem.setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Margen( AV56Margen );
         AV20CostesBasicos_SDTItem.setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Txtalb( AV60TxtAlb );
         AV20CostesBasicos_SDTItem.setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barprekgm( AV58barprekgm );
         AV20CostesBasicos_SDTItem.setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecgen( A159BarFecGen );
         AV20CostesBasicos_SDTItem.setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Barfecsal( A161BarFecSal );
         AV20CostesBasicos_SDTItem.setgxTv_SdtCostesBasicos_SDT_CostesBasicos_SDTItem_Costeteo( AV26CosteTeo );
         AV19CostesBasicos_SDT.add(AV20CostesBasicos_SDTItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV73GXLvl17 == 0 )
      {
         System.out.println( httpContext.getMessage( "NO existe registro en BARCAD", "") );
      }
      AV21CostesBasicos_SDTJson = AV19CostesBasicos_SDT.toJSonString(false) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'ALBBAR' Routine */
      returnInSub = false ;
      AV59Valor = DecimalUtil.doubleToDec(0) ;
      AV60TxtAlb = " " ;
      AV61KilospPieza = DecimalUtil.ZERO ;
      AV63kgsent = DecimalUtil.ZERO ;
      AV64mtsent = DecimalUtil.ZERO ;
      AV58barprekgm = DecimalUtil.ZERO ;
      /* Using cursor P0AT84 */
      pr_default.execute(1, new Object[] {AV8Emprcod, Integer.valueOf(AV68BarCod), Byte.valueOf(AV69BarCodReo), AV70BarCodPar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P0AT84_A130BarCodPar[0] ;
         A132BarCodReo = P0AT84_A132BarCodReo[0] ;
         A129BarCod = P0AT84_A129BarCod[0] ;
         A30AlbProCod = P0AT84_A30AlbProCod[0] ;
         A396EmprCod = P0AT84_A396EmprCod[0] ;
         A32AlbProEsp = P0AT84_A32AlbProEsp[0] ;
         A1264BarPreMtr = P0AT84_A1264BarPreMtr[0] ;
         A1263BarAlbMtrE = P0AT84_A1263BarAlbMtrE[0] ;
         A1262BarPreKgm = P0AT84_A1262BarPreKgm[0] ;
         A1261BarAlbKgmE = P0AT84_A1261BarAlbKgmE[0] ;
         if ( GXutil.strcmp(AV60TxtAlb, "") == 0 )
         {
            AV60TxtAlb = GXutil.trim( GXutil.str( A30AlbProCod, 10, 0)) ;
         }
         else
         {
            AV60TxtAlb += "/" + GXutil.trim( GXutil.str( A30AlbProCod, 10, 0)) ;
         }
         AV59Valor = AV59Valor.add((GXutil.roundDecimal( A1261BarAlbKgmE.multiply(A1262BarPreKgm), 2).add(GXutil.roundDecimal( A1263BarAlbMtrE.multiply(A1264BarPreMtr), 2)))) ;
         /* Using cursor P0AT85 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A1242GuiFasPMt = P0AT85_A1242GuiFasPMt[0] ;
            A1276FasMtr = P0AT85_A1276FasMtr[0] ;
            A1241GuiFasPKg = P0AT85_A1241GuiFasPKg[0] ;
            A1275FasKgm = P0AT85_A1275FasKgm[0] ;
            A1240GuiFasLin = P0AT85_A1240GuiFasLin[0] ;
            AV59Valor = AV59Valor.add((GXutil.roundDecimal( A1275FasKgm.multiply(A1241GuiFasPKg), 2).add(GXutil.roundDecimal( A1276FasMtr.multiply(A1242GuiFasPMt), 2)))) ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         AV58barprekgm = A1262BarPreKgm ;
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV39Moda21 == 1 )
      {
         AV59Valor = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P0AT86 */
         pr_default.execute(3, new Object[] {AV8Emprcod, Integer.valueOf(AV68BarCod), Byte.valueOf(AV69BarCodReo), AV70BarCodPar});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A1296FacBarPar = P0AT86_A1296FacBarPar[0] ;
            A1295FacBarReo = P0AT86_A1295FacBarReo[0] ;
            A1294FacBarCod = P0AT86_A1294FacBarCod[0] ;
            A396EmprCod = P0AT86_A396EmprCod[0] ;
            A430FacCod = P0AT86_A430FacCod[0] ;
            A446FacLin = P0AT86_A446FacLin[0] ;
            AV65facbarcod = A1294FacBarCod ;
            AV66FacBarReo = A1295FacBarReo ;
            AV67FacBarPar = A1296FacBarPar ;
            GXv_char16[0] = AV8Emprcod ;
            GXv_int15[0] = A430FacCod ;
            GXv_int17[0] = AV65facbarcod ;
            GXv_int2[0] = AV66FacBarReo ;
            GXv_char14[0] = AV67FacBarPar ;
            GXv_decimal13[0] = AV59Valor ;
            new app.pm21totliquido(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_int17, GXv_int2, GXv_char14, GXv_decimal13) ;
            costesbasicos_prc.this.AV8Emprcod = GXv_char16[0] ;
            costesbasicos_prc.this.A430FacCod = GXv_int15[0] ;
            costesbasicos_prc.this.AV65facbarcod = GXv_int17[0] ;
            costesbasicos_prc.this.AV66FacBarReo = GXv_int2[0] ;
            costesbasicos_prc.this.AV67FacBarPar = GXv_char14[0] ;
            costesbasicos_prc.this.AV59Valor = GXv_decimal13[0] ;
            pr_default.readNext(3);
         }
         pr_default.close(3);
      }
   }

   protected void cleanup( )
   {
      this.aP11[0] = costesbasicos_prc.this.AV21CostesBasicos_SDTJson;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21CostesBasicos_SDTJson = "" ;
      AV19CostesBasicos_SDT = new GXBaseCollection<app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem>(app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem.class, "CostesBasicos_SDTItem", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      lV18Artcod = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A212BarSer = "" ;
      A161BarFecSal = GXutil.nullDate() ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      P0AT83_A396EmprCod = new String[] {""} ;
      P0AT83_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      P0AT83_A212BarSer = new String[] {""} ;
      P0AT83_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P0AT83_A252CliCod = new int[1] ;
      P0AT83_n252CliCod = new boolean[] {false} ;
      P0AT83_A228BarUniMed = new String[] {""} ;
      P0AT83_A141BarCosPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT83_A213BarSit = new byte[1] ;
      P0AT83_A140BarCosAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT83_A148BarEstReo = new byte[1] ;
      P0AT83_A135BarColNom = new String[] {""} ;
      P0AT83_A136BarColNum = new int[1] ;
      P0AT83_A1652BarSerDsc = new String[] {""} ;
      P0AT83_A217BarTipArt = new short[1] ;
      P0AT83_n217BarTipArt = new boolean[] {false} ;
      P0AT83_A279CliNom = new String[] {""} ;
      P0AT83_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT83_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT83_A130BarCodPar = new String[] {""} ;
      P0AT83_A132BarCodReo = new byte[1] ;
      P0AT83_A129BarCod = new int[1] ;
      A228BarUniMed = "" ;
      A141BarCosPro = DecimalUtil.ZERO ;
      A140BarCosAny = DecimalUtil.ZERO ;
      A135BarColNom = "" ;
      A1652BarSerDsc = "" ;
      A279CliNom = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A13696BarNHdr = "" ;
      AV70BarCodPar = "" ;
      AV24Barunimed = "" ;
      AV22BarKgm = DecimalUtil.ZERO ;
      AV23barMtr = DecimalUtil.ZERO ;
      AV25Costefab = DecimalUtil.ZERO ;
      GXv_decimal3 = new java.math.BigDecimal[1] ;
      AV26CosteTeo = DecimalUtil.ZERO ;
      GXv_decimal4 = new java.math.BigDecimal[1] ;
      AV27mAgua = DecimalUtil.ZERO ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      AV28menergia = DecimalUtil.ZERO ;
      GXv_decimal6 = new java.math.BigDecimal[1] ;
      AV29mgas = DecimalUtil.ZERO ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      AV30mmod = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      AV31mmoi = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      AV32madc = DecimalUtil.ZERO ;
      AV33mam = DecimalUtil.ZERO ;
      AV34mgi = DecimalUtil.ZERO ;
      AV40Barcosprolconti = DecimalUtil.ZERO ;
      AV41BarCosAnylconti = DecimalUtil.ZERO ;
      AV42BarKgmTin = DecimalUtil.ZERO ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      AV43BarMtrTin = DecimalUtil.ZERO ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      AV45BarCosPro = DecimalUtil.ZERO ;
      AV46BarCosAny = DecimalUtil.ZERO ;
      AV47Coste_p = DecimalUtil.ZERO ;
      AV48CostepOld = DecimalUtil.ZERO ;
      AV49Costest = DecimalUtil.ZERO ;
      AV50costefab2 = DecimalUtil.ZERO ;
      AV51Barcosprolcontiorigen = DecimalUtil.ZERO ;
      AV52BarCosAnylcontiorigen = DecimalUtil.ZERO ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      AV53CostefabAcumulado = DecimalUtil.ZERO ;
      AV54costequimicoacumulado = DecimalUtil.ZERO ;
      AV55Coste_t = DecimalUtil.ZERO ;
      AV56Margen = DecimalUtil.ZERO ;
      AV59Valor = DecimalUtil.ZERO ;
      AV57costofinalmerma = DecimalUtil.ZERO ;
      AV20CostesBasicos_SDTItem = new app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem(remoteHandle, context);
      AV60TxtAlb = "" ;
      AV58barprekgm = DecimalUtil.ZERO ;
      AV61KilospPieza = DecimalUtil.ZERO ;
      AV63kgsent = DecimalUtil.ZERO ;
      AV64mtsent = DecimalUtil.ZERO ;
      P0AT84_A130BarCodPar = new String[] {""} ;
      P0AT84_A132BarCodReo = new byte[1] ;
      P0AT84_A129BarCod = new int[1] ;
      P0AT84_A30AlbProCod = new long[1] ;
      P0AT84_A396EmprCod = new String[] {""} ;
      P0AT84_A32AlbProEsp = new byte[1] ;
      P0AT84_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT84_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT84_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT84_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      P0AT85_A396EmprCod = new String[] {""} ;
      P0AT85_A30AlbProCod = new long[1] ;
      P0AT85_A129BarCod = new int[1] ;
      P0AT85_A132BarCodReo = new byte[1] ;
      P0AT85_A130BarCodPar = new String[] {""} ;
      P0AT85_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT85_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT85_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT85_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0AT85_A1240GuiFasLin = new short[1] ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      P0AT86_A1296FacBarPar = new String[] {""} ;
      P0AT86_A1295FacBarReo = new byte[1] ;
      P0AT86_A1294FacBarCod = new int[1] ;
      P0AT86_A396EmprCod = new String[] {""} ;
      P0AT86_A430FacCod = new int[1] ;
      P0AT86_A446FacLin = new int[1] ;
      A1296FacBarPar = "" ;
      AV67FacBarPar = "" ;
      GXv_char16 = new String[1] ;
      GXv_int15 = new int[1] ;
      GXv_int17 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char14 = new String[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.costesbasicos.costesbasicos_prc__default(),
         new Object[] {
             new Object[] {
            P0AT83_A396EmprCod, P0AT83_A161BarFecSal, P0AT83_A212BarSer, P0AT83_A159BarFecGen, P0AT83_A252CliCod, P0AT83_n252CliCod, P0AT83_A228BarUniMed, P0AT83_A141BarCosPro, P0AT83_A213BarSit, P0AT83_A140BarCosAny,
            P0AT83_A148BarEstReo, P0AT83_A135BarColNom, P0AT83_A136BarColNum, P0AT83_A1652BarSerDsc, P0AT83_A217BarTipArt, P0AT83_n217BarTipArt, P0AT83_A279CliNom, P0AT83_A166BarKgm, P0AT83_A184BarMtr, P0AT83_A130BarCodPar,
            P0AT83_A132BarCodReo, P0AT83_A129BarCod
            }
            , new Object[] {
            P0AT84_A130BarCodPar, P0AT84_A132BarCodReo, P0AT84_A129BarCod, P0AT84_A30AlbProCod, P0AT84_A396EmprCod, P0AT84_A32AlbProEsp, P0AT84_A1264BarPreMtr, P0AT84_A1263BarAlbMtrE, P0AT84_A1262BarPreKgm, P0AT84_A1261BarAlbKgmE
            }
            , new Object[] {
            P0AT85_A396EmprCod, P0AT85_A30AlbProCod, P0AT85_A129BarCod, P0AT85_A132BarCodReo, P0AT85_A130BarCodPar, P0AT85_A1242GuiFasPMt, P0AT85_A1276FasMtr, P0AT85_A1241GuiFasPKg, P0AT85_A1275FasKgm, P0AT85_A1240GuiFasLin
            }
            , new Object[] {
            P0AT86_A1296FacBarPar, P0AT86_A1295FacBarReo, P0AT86_A1294FacBarCod, P0AT86_A396EmprCod, P0AT86_A430FacCod, P0AT86_A446FacLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16Barcodreo1 ;
   private byte AV36reoperados ;
   private byte GXt_int1 ;
   private byte AV73GXLvl17 ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte A148BarEstReo ;
   private byte AV69BarCodReo ;
   private byte AV35Traza ;
   private byte AV44lconti ;
   private byte A32AlbProEsp ;
   private byte A1295FacBarReo ;
   private byte AV66FacBarReo ;
   private byte GXv_int2[] ;
   private short AV37CosTiR ;
   private short AV38TasasEstandar ;
   private short AV39Moda21 ;
   private short A217BarTipArt ;
   private short A1240GuiFasLin ;
   private short Gx_err ;
   private int AV15Barcod1 ;
   private int AV9Clicod1 ;
   private int AV10Clicod3 ;
   private int A252CliCod ;
   private int A129BarCod ;
   private int A136BarColNum ;
   private int AV68BarCod ;
   private int A1294FacBarCod ;
   private int A430FacCod ;
   private int A446FacLin ;
   private int AV65facbarcod ;
   private int GXv_int15[] ;
   private int GXv_int17[] ;
   private long A30AlbProCod ;
   private java.math.BigDecimal A141BarCosPro ;
   private java.math.BigDecimal A140BarCosAny ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV22BarKgm ;
   private java.math.BigDecimal AV23barMtr ;
   private java.math.BigDecimal AV25Costefab ;
   private java.math.BigDecimal GXv_decimal3[] ;
   private java.math.BigDecimal AV26CosteTeo ;
   private java.math.BigDecimal GXv_decimal4[] ;
   private java.math.BigDecimal AV27mAgua ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal AV28menergia ;
   private java.math.BigDecimal GXv_decimal6[] ;
   private java.math.BigDecimal AV29mgas ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal AV30mmod ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal AV31mmoi ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal AV32madc ;
   private java.math.BigDecimal AV33mam ;
   private java.math.BigDecimal AV34mgi ;
   private java.math.BigDecimal AV40Barcosprolconti ;
   private java.math.BigDecimal AV41BarCosAnylconti ;
   private java.math.BigDecimal AV42BarKgmTin ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal AV43BarMtrTin ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal AV45BarCosPro ;
   private java.math.BigDecimal AV46BarCosAny ;
   private java.math.BigDecimal AV47Coste_p ;
   private java.math.BigDecimal AV48CostepOld ;
   private java.math.BigDecimal AV49Costest ;
   private java.math.BigDecimal AV50costefab2 ;
   private java.math.BigDecimal AV51Barcosprolcontiorigen ;
   private java.math.BigDecimal AV52BarCosAnylcontiorigen ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal AV53CostefabAcumulado ;
   private java.math.BigDecimal AV54costequimicoacumulado ;
   private java.math.BigDecimal AV55Coste_t ;
   private java.math.BigDecimal AV56Margen ;
   private java.math.BigDecimal AV59Valor ;
   private java.math.BigDecimal AV57costofinalmerma ;
   private java.math.BigDecimal AV58barprekgm ;
   private java.math.BigDecimal AV61KilospPieza ;
   private java.math.BigDecimal AV63kgsent ;
   private java.math.BigDecimal AV64mtsent ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private String AV8Emprcod ;
   private String AV18Artcod ;
   private String AV17Barcodpar1 ;
   private String scmdbuf ;
   private String lV18Artcod ;
   private String A212BarSer ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A228BarUniMed ;
   private String A135BarColNom ;
   private String A1652BarSerDsc ;
   private String A279CliNom ;
   private String A13696BarNHdr ;
   private String AV70BarCodPar ;
   private String AV24Barunimed ;
   private String A1296FacBarPar ;
   private String AV67FacBarPar ;
   private String GXv_char16[] ;
   private String GXv_char14[] ;
   private java.util.Date AV13fec1 ;
   private java.util.Date AV14Fec2 ;
   private java.util.Date AV11fec3 ;
   private java.util.Date AV12Fec4 ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A161BarFecSal ;
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private boolean returnInSub ;
   private String AV21CostesBasicos_SDTJson ;
   private String AV60TxtAlb ;
   private String[] aP11 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AT83_A396EmprCod ;
   private java.util.Date[] P0AT83_A161BarFecSal ;
   private String[] P0AT83_A212BarSer ;
   private java.util.Date[] P0AT83_A159BarFecGen ;
   private int[] P0AT83_A252CliCod ;
   private boolean[] P0AT83_n252CliCod ;
   private String[] P0AT83_A228BarUniMed ;
   private java.math.BigDecimal[] P0AT83_A141BarCosPro ;
   private byte[] P0AT83_A213BarSit ;
   private java.math.BigDecimal[] P0AT83_A140BarCosAny ;
   private byte[] P0AT83_A148BarEstReo ;
   private String[] P0AT83_A135BarColNom ;
   private int[] P0AT83_A136BarColNum ;
   private String[] P0AT83_A1652BarSerDsc ;
   private short[] P0AT83_A217BarTipArt ;
   private boolean[] P0AT83_n217BarTipArt ;
   private String[] P0AT83_A279CliNom ;
   private java.math.BigDecimal[] P0AT83_A166BarKgm ;
   private java.math.BigDecimal[] P0AT83_A184BarMtr ;
   private String[] P0AT83_A130BarCodPar ;
   private byte[] P0AT83_A132BarCodReo ;
   private int[] P0AT83_A129BarCod ;
   private String[] P0AT84_A130BarCodPar ;
   private byte[] P0AT84_A132BarCodReo ;
   private int[] P0AT84_A129BarCod ;
   private long[] P0AT84_A30AlbProCod ;
   private String[] P0AT84_A396EmprCod ;
   private byte[] P0AT84_A32AlbProEsp ;
   private java.math.BigDecimal[] P0AT84_A1264BarPreMtr ;
   private java.math.BigDecimal[] P0AT84_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] P0AT84_A1262BarPreKgm ;
   private java.math.BigDecimal[] P0AT84_A1261BarAlbKgmE ;
   private String[] P0AT85_A396EmprCod ;
   private long[] P0AT85_A30AlbProCod ;
   private int[] P0AT85_A129BarCod ;
   private byte[] P0AT85_A132BarCodReo ;
   private String[] P0AT85_A130BarCodPar ;
   private java.math.BigDecimal[] P0AT85_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P0AT85_A1276FasMtr ;
   private java.math.BigDecimal[] P0AT85_A1241GuiFasPKg ;
   private java.math.BigDecimal[] P0AT85_A1275FasKgm ;
   private short[] P0AT85_A1240GuiFasLin ;
   private String[] P0AT86_A1296FacBarPar ;
   private byte[] P0AT86_A1295FacBarReo ;
   private int[] P0AT86_A1294FacBarCod ;
   private String[] P0AT86_A396EmprCod ;
   private int[] P0AT86_A430FacCod ;
   private int[] P0AT86_A446FacLin ;
   private GXBaseCollection<app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem> AV19CostesBasicos_SDT ;
   private app.costesbasicos.SdtCostesBasicos_SDT_CostesBasicos_SDTItem AV20CostesBasicos_SDTItem ;
}

final  class costesbasicos_prc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P0AT83( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV9Clicod1 ,
                                          int AV10Clicod3 ,
                                          java.util.Date AV11fec3 ,
                                          java.util.Date AV12Fec4 ,
                                          String AV18Artcod ,
                                          java.util.Date AV13fec1 ,
                                          java.util.Date AV14Fec2 ,
                                          int AV15Barcod1 ,
                                          byte AV16Barcodreo1 ,
                                          String AV17Barcodpar1 ,
                                          int A252CliCod ,
                                          java.util.Date A159BarFecGen ,
                                          String A212BarSer ,
                                          java.util.Date A161BarFecSal ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String AV8Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[11];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT T1.EmprCod, T1.BarFecSal, T1.BarSer, T1.BarFecGen, T1.CliCod, T1.BarUniMed, T1.BarCosPro, T1.BarSit, T1.BarCosAny, T1.BarEstReo, T1.BarColNom, T1.BarColNum," ;
      scmdbuf += " T1.BarSerDsc, T1.BarTipArt, T2.CliNom, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T3.BarMtr, 0) AS BarMtr, T1.BarCodPar, T1.BarCodReo, T1.BarCod FROM ((TXPBARCAD" ;
      scmdbuf += " T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar," ;
      scmdbuf += " SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (0==AV9Clicod1) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int18[1] = (byte)(1) ;
      }
      if ( ! (0==AV10Clicod3) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int18[2] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV11fec3)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int18[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV12Fec4)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int18[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV18Artcod)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer like ?)");
      }
      else
      {
         GXv_int18[5] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV13fec1)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int18[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV14Fec2)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int18[7] = (byte)(1) ;
      }
      if ( ! (0==AV15Barcod1) )
      {
         addWhere(sWhereString, "(T1.BarCod = ?)");
      }
      else
      {
         GXv_int18[8] = (byte)(1) ;
      }
      if ( ! (0==AV16Barcodreo1) )
      {
         addWhere(sWhereString, "(T1.BarCodReo = ?)");
      }
      else
      {
         GXv_int18[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV17Barcodpar1)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int18[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.CliCod, T1.BarFecGen" ;
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P0AT83(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (java.util.Date)dynConstraints[2] , (java.util.Date)dynConstraints[3] , (String)dynConstraints[4] , (java.util.Date)dynConstraints[5] , (java.util.Date)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).byteValue() , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , (java.util.Date)dynConstraints[11] , (String)dynConstraints[12] , (java.util.Date)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AT83", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AT84", "SELECT BarCodPar, BarCodReo, BarCod, AlbProCod, EmprCod, AlbProEsp, BarPreMtr, BarAlbMtrE, BarPreKgm, BarAlbKgmE FROM TXPALBBAR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AT85", "SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasPMt, FasMtr, GuiFasPKg, FasKgm, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0AT86", "SELECT FacBarPar, FacBarReo, FacBarCod, EmprCod, FacCod, FacLin FROM TXPLFAVEN WHERE EmprCod = ? and FacBarCod = ? and FacBarReo = ? and FacBarPar = ? ORDER BY EmprCod, FacBarCod, FacBarReo, FacBarPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,2);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 26);
               ((short[]) buf[14])[0] = rslt.getShort(14);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(15, 30);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(16,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(17,2);
               ((String[]) buf[19])[0] = rslt.getString(18, 1);
               ((byte[]) buf[20])[0] = rslt.getByte(19);
               ((int[]) buf[21])[0] = rslt.getInt(20);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
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
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[14]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[15]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[20]).byteValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

