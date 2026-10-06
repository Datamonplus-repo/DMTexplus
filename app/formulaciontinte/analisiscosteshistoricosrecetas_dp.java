package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class analisiscosteshistoricosrecetas_dp extends GXProcedure
{
   public analisiscosteshistoricosrecetas_dp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( analisiscosteshistoricosrecetas_dp.class ), "" );
   }

   public analisiscosteshistoricosrecetas_dp( int remoteHandle ,
                                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public GXBaseCollection<app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT> executeUdp( String aP0 ,
                                                                                                    String aP1 ,
                                                                                                    java.util.Date aP2 ,
                                                                                                    java.util.Date aP3 ,
                                                                                                    byte aP4 ,
                                                                                                    int aP5 ,
                                                                                                    byte aP6 ,
                                                                                                    String aP7 ,
                                                                                                    String aP8 ,
                                                                                                    String aP9 ,
                                                                                                    String aP10 ,
                                                                                                    String aP11 ,
                                                                                                    int aP12 ,
                                                                                                    int aP13 ,
                                                                                                    int aP14 ,
                                                                                                    int aP15 ,
                                                                                                    byte aP16 ,
                                                                                                    byte aP17 ,
                                                                                                    short aP18 ,
                                                                                                    short aP19 ,
                                                                                                    byte aP20 ,
                                                                                                    byte aP21 )
   {
      analisiscosteshistoricosrecetas_dp.this.aP22 = new GXBaseCollection[] {new GXBaseCollection<app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT>()};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22);
      return aP22[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        java.util.Date aP2 ,
                        java.util.Date aP3 ,
                        byte aP4 ,
                        int aP5 ,
                        byte aP6 ,
                        String aP7 ,
                        String aP8 ,
                        String aP9 ,
                        String aP10 ,
                        String aP11 ,
                        int aP12 ,
                        int aP13 ,
                        int aP14 ,
                        int aP15 ,
                        byte aP16 ,
                        byte aP17 ,
                        short aP18 ,
                        short aP19 ,
                        byte aP20 ,
                        byte aP21 ,
                        GXBaseCollection<app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT>[] aP22 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             java.util.Date aP2 ,
                             java.util.Date aP3 ,
                             byte aP4 ,
                             int aP5 ,
                             byte aP6 ,
                             String aP7 ,
                             String aP8 ,
                             String aP9 ,
                             String aP10 ,
                             String aP11 ,
                             int aP12 ,
                             int aP13 ,
                             int aP14 ,
                             int aP15 ,
                             byte aP16 ,
                             byte aP17 ,
                             short aP18 ,
                             short aP19 ,
                             byte aP20 ,
                             byte aP21 ,
                             GXBaseCollection<app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT>[] aP22 )
   {
      analisiscosteshistoricosrecetas_dp.this.AV5Emprcod = aP0;
      analisiscosteshistoricosrecetas_dp.this.AV6HreRacab = aP1;
      analisiscosteshistoricosrecetas_dp.this.AV7Fec1 = aP2;
      analisiscosteshistoricosrecetas_dp.this.AV8Fec2 = aP3;
      analisiscosteshistoricosrecetas_dp.this.AV9Calculo = aP4;
      analisiscosteshistoricosrecetas_dp.this.AV10barcod = aP5;
      analisiscosteshistoricosrecetas_dp.this.AV11barcodreo = aP6;
      analisiscosteshistoricosrecetas_dp.this.AV12barcodpar = aP7;
      analisiscosteshistoricosrecetas_dp.this.AV13ARtcod1 = aP8;
      analisiscosteshistoricosrecetas_dp.this.AV14ARtcod3 = aP9;
      analisiscosteshistoricosrecetas_dp.this.AV15Barcolnom1 = aP10;
      analisiscosteshistoricosrecetas_dp.this.AV16Barcolnom3 = aP11;
      analisiscosteshistoricosrecetas_dp.this.AV17Barcolnum1 = aP12;
      analisiscosteshistoricosrecetas_dp.this.AV18Barcolnum3 = aP13;
      analisiscosteshistoricosrecetas_dp.this.AV19Clicod1 = aP14;
      analisiscosteshistoricosrecetas_dp.this.AV20Clicod3 = aP15;
      analisiscosteshistoricosrecetas_dp.this.AV21Intcod1 = aP16;
      analisiscosteshistoricosrecetas_dp.this.AV22Intcod3 = aP17;
      analisiscosteshistoricosrecetas_dp.this.AV23TipArtCod1 = aP18;
      analisiscosteshistoricosrecetas_dp.this.AV24TipArtCod3 = aP19;
      analisiscosteshistoricosrecetas_dp.this.AV25Tipcolcod1 = aP20;
      analisiscosteshistoricosrecetas_dp.this.AV26Tipcolcod3 = aP21;
      analisiscosteshistoricosrecetas_dp.this.aP22 = aP22;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV7Fec1 ,
                                           AV8Fec2 ,
                                           Integer.valueOf(AV19Clicod1) ,
                                           Integer.valueOf(AV20Clicod3) ,
                                           AV13ARtcod1 ,
                                           AV14ARtcod3 ,
                                           Short.valueOf(AV23TipArtCod1) ,
                                           Short.valueOf(AV24TipArtCod3) ,
                                           AV15Barcolnom1 ,
                                           AV16Barcolnom3 ,
                                           Integer.valueOf(AV17Barcolnum1) ,
                                           Integer.valueOf(AV18Barcolnum3) ,
                                           Byte.valueOf(AV25Tipcolcod1) ,
                                           Byte.valueOf(AV26Tipcolcod3) ,
                                           Byte.valueOf(AV21Intcod1) ,
                                           Byte.valueOf(AV22Intcod3) ,
                                           Integer.valueOf(AV10barcod) ,
                                           Byte.valueOf(AV11barcodreo) ,
                                           AV12barcodpar ,
                                           A4529HreFecTin ,
                                           Integer.valueOf(A252CliCod) ,
                                           A4517HreBarSer ,
                                           Short.valueOf(A4519HreTipArt) ,
                                           A4521HreColNom ,
                                           Integer.valueOf(A4522HreColNum) ,
                                           Byte.valueOf(A4525HreTipCol) ,
                                           Byte.valueOf(A4539HreIntCod) ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar ,
                                           A9808HreRacab ,
                                           AV6HreRacab ,
                                           AV5Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P002O2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, AV6HreRacab, AV6HreRacab, AV7Fec1, AV8Fec2, Integer.valueOf(AV19Clicod1), Integer.valueOf(AV20Clicod3), AV13ARtcod1, AV14ARtcod3, Short.valueOf(AV23TipArtCod1), Short.valueOf(AV24TipArtCod3), AV15Barcolnom1, AV16Barcolnom3, Integer.valueOf(AV17Barcolnum1), Integer.valueOf(AV18Barcolnum3), Byte.valueOf(AV25Tipcolcod1), Byte.valueOf(AV26Tipcolcod3), Byte.valueOf(AV21Intcod1), Byte.valueOf(AV22Intcod3), Integer.valueOf(AV10barcod), Byte.valueOf(AV11barcodreo), AV12barcodpar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4494HreBarPar = P002O2_A4494HreBarPar[0] ;
         A4493HreBarReo = P002O2_A4493HreBarReo[0] ;
         A4492HreBarCod = P002O2_A4492HreBarCod[0] ;
         A4539HreIntCod = P002O2_A4539HreIntCod[0] ;
         n4539HreIntCod = P002O2_n4539HreIntCod[0] ;
         A4525HreTipCol = P002O2_A4525HreTipCol[0] ;
         n4525HreTipCol = P002O2_n4525HreTipCol[0] ;
         A4522HreColNum = P002O2_A4522HreColNum[0] ;
         n4522HreColNum = P002O2_n4522HreColNum[0] ;
         A4521HreColNom = P002O2_A4521HreColNom[0] ;
         n4521HreColNom = P002O2_n4521HreColNom[0] ;
         A4519HreTipArt = P002O2_A4519HreTipArt[0] ;
         n4519HreTipArt = P002O2_n4519HreTipArt[0] ;
         A4517HreBarSer = P002O2_A4517HreBarSer[0] ;
         n4517HreBarSer = P002O2_n4517HreBarSer[0] ;
         A252CliCod = P002O2_A252CliCod[0] ;
         n252CliCod = P002O2_n252CliCod[0] ;
         A9808HreRacab = P002O2_A9808HreRacab[0] ;
         n9808HreRacab = P002O2_n9808HreRacab[0] ;
         A4529HreFecTin = P002O2_A4529HreFecTin[0] ;
         n4529HreFecTin = P002O2_n4529HreFecTin[0] ;
         A396EmprCod = P002O2_A396EmprCod[0] ;
         A4495HreNumCie = P002O2_A4495HreNumCie[0] ;
         A4532HreBarKgm = P002O2_A4532HreBarKgm[0] ;
         n4532HreBarKgm = P002O2_n4532HreBarKgm[0] ;
         A4542HreTotKgm = P002O2_A4542HreTotKgm[0] ;
         n4542HreTotKgm = P002O2_n4542HreTotKgm[0] ;
         A279CliNom = P002O2_A279CliNom[0] ;
         A4518HreBarDsc = P002O2_A4518HreBarDsc[0] ;
         n4518HreBarDsc = P002O2_n4518HreBarDsc[0] ;
         A4520HreTipArtD = P002O2_A4520HreTipArtD[0] ;
         n4520HreTipArtD = P002O2_n4520HreTipArtD[0] ;
         A4526HreTipColN = P002O2_A4526HreTipColN[0] ;
         n4526HreTipColN = P002O2_n4526HreTipColN[0] ;
         A4540HreIntDsc = P002O2_A4540HreIntDsc[0] ;
         n4540HreIntDsc = P002O2_n4540HreIntDsc[0] ;
         A4516HreDisCli = P002O2_A4516HreDisCli[0] ;
         n4516HreDisCli = P002O2_n4516HreDisCli[0] ;
         A11318HreDispCli = P002O2_A11318HreDispCli[0] ;
         n11318HreDispCli = P002O2_n11318HreDispCli[0] ;
         A4547HreVolPrd = P002O2_A4547HreVolPrd[0] ;
         n4547HreVolPrd = P002O2_n4547HreVolPrd[0] ;
         A8607HreCosPD = P002O2_A8607HreCosPD[0] ;
         n8607HreCosPD = P002O2_n8607HreCosPD[0] ;
         A8606HreCosPA = P002O2_A8606HreCosPA[0] ;
         n8606HreCosPA = P002O2_n8606HreCosPA[0] ;
         A8605HreCosCol = P002O2_A8605HreCosCol[0] ;
         n8605HreCosCol = P002O2_n8605HreCosCol[0] ;
         A8604HreCosAnc = P002O2_A8604HreCosAnc[0] ;
         n8604HreCosAnc = P002O2_n8604HreCosAnc[0] ;
         A8603HrecosAd = P002O2_A8603HrecosAd[0] ;
         n8603HrecosAd = P002O2_n8603HrecosAd[0] ;
         A8602HreCosAA = P002O2_A8602HreCosAA[0] ;
         n8602HreCosAA = P002O2_n8602HreCosAA[0] ;
         A4546HreMaqCod = P002O2_A4546HreMaqCod[0] ;
         n4546HreMaqCod = P002O2_n4546HreMaqCod[0] ;
         A4545HreLinMaq = P002O2_A4545HreLinMaq[0] ;
         A4539HreIntCod = P002O2_A4539HreIntCod[0] ;
         n4539HreIntCod = P002O2_n4539HreIntCod[0] ;
         A4525HreTipCol = P002O2_A4525HreTipCol[0] ;
         n4525HreTipCol = P002O2_n4525HreTipCol[0] ;
         A4522HreColNum = P002O2_A4522HreColNum[0] ;
         n4522HreColNum = P002O2_n4522HreColNum[0] ;
         A4521HreColNom = P002O2_A4521HreColNom[0] ;
         n4521HreColNom = P002O2_n4521HreColNom[0] ;
         A4519HreTipArt = P002O2_A4519HreTipArt[0] ;
         n4519HreTipArt = P002O2_n4519HreTipArt[0] ;
         A4517HreBarSer = P002O2_A4517HreBarSer[0] ;
         n4517HreBarSer = P002O2_n4517HreBarSer[0] ;
         A252CliCod = P002O2_A252CliCod[0] ;
         n252CliCod = P002O2_n252CliCod[0] ;
         A9808HreRacab = P002O2_A9808HreRacab[0] ;
         n9808HreRacab = P002O2_n9808HreRacab[0] ;
         A4529HreFecTin = P002O2_A4529HreFecTin[0] ;
         n4529HreFecTin = P002O2_n4529HreFecTin[0] ;
         A4532HreBarKgm = P002O2_A4532HreBarKgm[0] ;
         n4532HreBarKgm = P002O2_n4532HreBarKgm[0] ;
         A4542HreTotKgm = P002O2_A4542HreTotKgm[0] ;
         n4542HreTotKgm = P002O2_n4542HreTotKgm[0] ;
         A4518HreBarDsc = P002O2_A4518HreBarDsc[0] ;
         n4518HreBarDsc = P002O2_n4518HreBarDsc[0] ;
         A4520HreTipArtD = P002O2_A4520HreTipArtD[0] ;
         n4520HreTipArtD = P002O2_n4520HreTipArtD[0] ;
         A4526HreTipColN = P002O2_A4526HreTipColN[0] ;
         n4526HreTipColN = P002O2_n4526HreTipColN[0] ;
         A4540HreIntDsc = P002O2_A4540HreIntDsc[0] ;
         n4540HreIntDsc = P002O2_n4540HreIntDsc[0] ;
         A4516HreDisCli = P002O2_A4516HreDisCli[0] ;
         n4516HreDisCli = P002O2_n4516HreDisCli[0] ;
         A11318HreDispCli = P002O2_A11318HreDispCli[0] ;
         n11318HreDispCli = P002O2_n11318HreDispCli[0] ;
         A279CliNom = P002O2_A279CliNom[0] ;
         Gxm1analisiscosteshistoricosrecetas_sdt = (app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)new app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT(remoteHandle, context);
         Gxm2rootcol.add(Gxm1analisiscosteshistoricosrecetas_sdt, 0);
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Toa( ((GXutil.strcmp("", A9808HreRacab)==0) ? "T" : "A") );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin( A4529HreFecTin );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Marca( "*" );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hdr( GXutil.str( A4492HreBarCod, 8, 0)+"-"+GXutil.str( A4493HreBarReo, 1, 0)+A4494HreBarPar );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarcod( A4492HreBarCod );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarreo( A4493HreBarReo );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarpar( A4494HreBarPar );
         GXt_char1 = "" ;
         GXv_char2[0] = A396EmprCod ;
         GXv_int3[0] = A4492HreBarCod ;
         GXv_int4[0] = A4493HreBarReo ;
         GXv_char5[0] = A4494HreBarPar ;
         GXv_int6[0] = A4495HreNumCie ;
         GXv_char7[0] = GXt_char1 ;
         new app.formulaciontinte.agrupaciontinteoacabado(remoteHandle, context).execute( GXv_char2, GXv_int3, GXv_int4, GXv_char5, GXv_int6, GXv_char7) ;
         analisiscosteshistoricosrecetas_dp.this.A396EmprCod = GXv_char2[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4492HreBarCod = GXv_int3[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4493HreBarReo = GXv_int4[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4494HreBarPar = GXv_char5[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4495HreNumCie = GXv_int6[0] ;
         analisiscosteshistoricosrecetas_dp.this.GXt_char1 = GXv_char7[0] ;
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrest( GXt_char1 );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarkgm( A4532HreBarKgm );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretotkgm( A4542HreTotKgm );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clicod( A252CliCod );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clinom( A279CliNom );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarser( A4517HreBarSer );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebardsc( A4518HreBarDsc );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipartd( A4520HreTipArtD );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnom( A4521HreColNom );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnum( A4522HreColNum );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipcoln( A4526HreTipColN );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreintdsc( A4540HreIntDsc );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Enccli( ((GXutil.strcmp("", A11318HreDispCli)==0) ? A4516HreDisCli : A11318HreDispCli) );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrevolprd( A4547HreVolPrd );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Rb( ((A4542HreTotKgm.doubleValue()>0)&&(GXutil.strcmp("", A9808HreRacab)==0) ? DecimalUtil.doubleToDec(A4547HreVolPrd).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costei( ((A4542HreTotKgm.doubleValue()>0) ? A4532HreBarKgm.multiply((A8605HreCosCol.add(A8606HreCosPA).add(A8607HreCosPD))).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) );
         AV27Costei = ((A4542HreTotKgm.doubleValue()>0) ? A4532HreBarKgm.multiply((A8605HreCosCol.add(A8606HreCosPA).add(A8607HreCosPD))).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costet( ((A4542HreTotKgm.doubleValue()>0) ? A4532HreBarKgm.multiply((A8602HreCosAA.add(A8603HrecosAd).add(A8604HreCosAnc).add(A8605HreCosCol).add(A8606HreCosPA).add(A8607HreCosPD))).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) );
         AV28CosteT = ((A4542HreTotKgm.doubleValue()>0) ? A4532HreBarKgm.multiply((A8602HreCosAA.add(A8603HrecosAd).add(A8604HreCosAnc).add(A8605HreCosCol).add(A8606HreCosPA).add(A8607HreCosPD))).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Dif( AV27Costei.subtract(AV28CosteT) );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Porc( DecimalUtil.doubleToDec(((DecimalUtil.compareTo(DecimalUtil.ZERO, AV27Costei)==0) ? 0 : (long)(DecimalUtil.decToDouble(GXutil.roundDecimal( ((AV27Costei.subtract(AV28CosteT)).divide(AV27Costei, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 2))))) );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costek( ((A4532HreBarKgm.doubleValue()>0) ? GXutil.roundDecimal( AV28CosteT.divide(A4532HreBarKgm, 18, java.math.RoundingMode.DOWN), 2) : DecimalUtil.doubleToDec(0)) );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hremaqcod( A4546HreMaqCod );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrlot( GXutil.str( A4492HreBarCod, 8, 0)+GXutil.str( A4493HreBarReo, 1, 0)+A4494HreBarPar );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosi( A8605HreCosCol.add(A8606HreCosPA).add(A8607HreCosPD) );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosa( A8602HreCosAA.add(A8603HrecosAd).add(A8604HreCosAnc) );
         AV29ItemOrderSDT = GXutil.substring( localUtil.dtoc( A4529HreFecTin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 7, 2) + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.dtoc( A4529HreFecTin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 4, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.dtoc( A4529HreFecTin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 1, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( A4492HreBarCod, 8, 0)), (short)(8), "0") + GXutil.str( A4493HreBarReo, 1, 0) + A4494HreBarPar + "0" ;
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Itemordersdt( AV29ItemOrderSDT );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprocod( ((GXutil.strcmp(A9808HreRacab, "T")!=0) ? A4551HreProCod : " ") );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprodsc( ((GXutil.strcmp(A9808HreRacab, "T")!=0) ? A4552HreProDsc : " ") );
         GXt_char1 = "" ;
         GXv_char7[0] = A396EmprCod ;
         GXv_int3[0] = A252CliCod ;
         GXv_char5[0] = GXt_char1 ;
         new app.pprc252(remoteHandle, context).execute( GXv_char7, GXv_int3, GXv_char5) ;
         analisiscosteshistoricosrecetas_dp.this.A396EmprCod = GXv_char7[0] ;
         analisiscosteshistoricosrecetas_dp.this.A252CliCod = GXv_int3[0] ;
         analisiscosteshistoricosrecetas_dp.this.GXt_char1 = GXv_char5[0] ;
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Prvdsc( GXt_char1 );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa( (byte)(0) );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV7Fec1 ,
                                           AV8Fec2 ,
                                           Integer.valueOf(AV19Clicod1) ,
                                           Integer.valueOf(AV20Clicod3) ,
                                           AV13ARtcod1 ,
                                           AV14ARtcod3 ,
                                           Short.valueOf(AV23TipArtCod1) ,
                                           Short.valueOf(AV24TipArtCod3) ,
                                           AV15Barcolnom1 ,
                                           AV16Barcolnom3 ,
                                           Integer.valueOf(AV17Barcolnum1) ,
                                           Integer.valueOf(AV18Barcolnum3) ,
                                           Byte.valueOf(AV25Tipcolcod1) ,
                                           Byte.valueOf(AV26Tipcolcod3) ,
                                           Byte.valueOf(AV21Intcod1) ,
                                           Byte.valueOf(AV22Intcod3) ,
                                           Integer.valueOf(AV10barcod) ,
                                           Byte.valueOf(AV11barcodreo) ,
                                           AV12barcodpar ,
                                           A4529HreFecTin ,
                                           Integer.valueOf(A252CliCod) ,
                                           A4517HreBarSer ,
                                           Short.valueOf(A4519HreTipArt) ,
                                           A4521HreColNom ,
                                           Integer.valueOf(A4522HreColNum) ,
                                           Byte.valueOf(A4525HreTipCol) ,
                                           Byte.valueOf(A4539HreIntCod) ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar ,
                                           A9808HreRacab ,
                                           AV6HreRacab ,
                                           AV5Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P002O3 */
      pr_default.execute(1, new Object[] {AV5Emprcod, AV6HreRacab, AV6HreRacab, AV7Fec1, AV8Fec2, Integer.valueOf(AV19Clicod1), Integer.valueOf(AV20Clicod3), AV13ARtcod1, AV14ARtcod3, Short.valueOf(AV23TipArtCod1), Short.valueOf(AV24TipArtCod3), AV15Barcolnom1, AV16Barcolnom3, Integer.valueOf(AV17Barcolnum1), Integer.valueOf(AV18Barcolnum3), Byte.valueOf(AV25Tipcolcod1), Byte.valueOf(AV26Tipcolcod3), Byte.valueOf(AV21Intcod1), Byte.valueOf(AV22Intcod3), Integer.valueOf(AV10barcod), Byte.valueOf(AV11barcodreo), AV12barcodpar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A4494HreBarPar = P002O3_A4494HreBarPar[0] ;
         A4493HreBarReo = P002O3_A4493HreBarReo[0] ;
         A4492HreBarCod = P002O3_A4492HreBarCod[0] ;
         A4539HreIntCod = P002O3_A4539HreIntCod[0] ;
         n4539HreIntCod = P002O3_n4539HreIntCod[0] ;
         A4525HreTipCol = P002O3_A4525HreTipCol[0] ;
         n4525HreTipCol = P002O3_n4525HreTipCol[0] ;
         A4522HreColNum = P002O3_A4522HreColNum[0] ;
         n4522HreColNum = P002O3_n4522HreColNum[0] ;
         A4521HreColNom = P002O3_A4521HreColNom[0] ;
         n4521HreColNom = P002O3_n4521HreColNom[0] ;
         A4519HreTipArt = P002O3_A4519HreTipArt[0] ;
         n4519HreTipArt = P002O3_n4519HreTipArt[0] ;
         A4517HreBarSer = P002O3_A4517HreBarSer[0] ;
         n4517HreBarSer = P002O3_n4517HreBarSer[0] ;
         A252CliCod = P002O3_A252CliCod[0] ;
         n252CliCod = P002O3_n252CliCod[0] ;
         A9808HreRacab = P002O3_A9808HreRacab[0] ;
         n9808HreRacab = P002O3_n9808HreRacab[0] ;
         A4529HreFecTin = P002O3_A4529HreFecTin[0] ;
         n4529HreFecTin = P002O3_n4529HreFecTin[0] ;
         A396EmprCod = P002O3_A396EmprCod[0] ;
         A4499HreAgrPar = P002O3_A4499HreAgrPar[0] ;
         A4498HreAgrReo = P002O3_A4498HreAgrReo[0] ;
         A4497HreAgrCod = P002O3_A4497HreAgrCod[0] ;
         A4500HreAgrKgm = P002O3_A4500HreAgrKgm[0] ;
         A4542HreTotKgm = P002O3_A4542HreTotKgm[0] ;
         n4542HreTotKgm = P002O3_n4542HreTotKgm[0] ;
         A4503HreAgrCli = P002O3_A4503HreAgrCli[0] ;
         A4504HreAgrSer = P002O3_A4504HreAgrSer[0] ;
         A4505HreAgrDsc = P002O3_A4505HreAgrDsc[0] ;
         A4506HreAgrCol = P002O3_A4506HreAgrCol[0] ;
         A4507HreAgrNumC = P002O3_A4507HreAgrNumC[0] ;
         A4540HreIntDsc = P002O3_A4540HreIntDsc[0] ;
         n4540HreIntDsc = P002O3_n4540HreIntDsc[0] ;
         A4495HreNumCie = P002O3_A4495HreNumCie[0] ;
         A4496HreMaqHdr = P002O3_A4496HreMaqHdr[0] ;
         n4496HreMaqHdr = P002O3_n4496HreMaqHdr[0] ;
         A4539HreIntCod = P002O3_A4539HreIntCod[0] ;
         n4539HreIntCod = P002O3_n4539HreIntCod[0] ;
         A4525HreTipCol = P002O3_A4525HreTipCol[0] ;
         n4525HreTipCol = P002O3_n4525HreTipCol[0] ;
         A4522HreColNum = P002O3_A4522HreColNum[0] ;
         n4522HreColNum = P002O3_n4522HreColNum[0] ;
         A4521HreColNom = P002O3_A4521HreColNom[0] ;
         n4521HreColNom = P002O3_n4521HreColNom[0] ;
         A4519HreTipArt = P002O3_A4519HreTipArt[0] ;
         n4519HreTipArt = P002O3_n4519HreTipArt[0] ;
         A4517HreBarSer = P002O3_A4517HreBarSer[0] ;
         n4517HreBarSer = P002O3_n4517HreBarSer[0] ;
         A252CliCod = P002O3_A252CliCod[0] ;
         n252CliCod = P002O3_n252CliCod[0] ;
         A9808HreRacab = P002O3_A9808HreRacab[0] ;
         n9808HreRacab = P002O3_n9808HreRacab[0] ;
         A4529HreFecTin = P002O3_A4529HreFecTin[0] ;
         n4529HreFecTin = P002O3_n4529HreFecTin[0] ;
         A4542HreTotKgm = P002O3_A4542HreTotKgm[0] ;
         n4542HreTotKgm = P002O3_n4542HreTotKgm[0] ;
         A4540HreIntDsc = P002O3_A4540HreIntDsc[0] ;
         n4540HreIntDsc = P002O3_n4540HreIntDsc[0] ;
         A4496HreMaqHdr = P002O3_A4496HreMaqHdr[0] ;
         n4496HreMaqHdr = P002O3_n4496HreMaqHdr[0] ;
         Gxm1analisiscosteshistoricosrecetas_sdt = (app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)new app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT(remoteHandle, context);
         Gxm2rootcol.add(Gxm1analisiscosteshistoricosrecetas_sdt, 0);
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Toa( "T" );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin( A4529HreFecTin );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Marca( " " );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hdr( GXutil.str( A4497HreAgrCod, 8, 0)+"-"+GXutil.str( A4498HreAgrReo, 1, 0)+A4499HreAgrPar );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrest( "S" );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarkgm( A4500HreAgrKgm );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretotkgm( A4542HreTotKgm );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clicod( A4503HreAgrCli );
         GXt_char1 = "" ;
         GXv_char7[0] = GXt_char1 ;
         new app.pclinom(remoteHandle, context).execute( A396EmprCod, A4503HreAgrCli, GXv_char7) ;
         analisiscosteshistoricosrecetas_dp.this.GXt_char1 = GXv_char7[0] ;
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clinom( GXt_char1 );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarser( A4504HreAgrSer );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebardsc( A4505HreAgrDsc );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipartd( " " );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnom( A4506HreAgrCol );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnum( A4507HreAgrNumC );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipcoln( " " );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreintdsc( A4540HreIntDsc );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Enccli( " " );
         GXt_int8 = AV31HreVolPrd ;
         GXv_char7[0] = A396EmprCod ;
         GXv_int3[0] = A4492HreBarCod ;
         GXv_int6[0] = A4493HreBarReo ;
         GXv_char5[0] = A4494HreBarPar ;
         GXv_int4[0] = A4495HreNumCie ;
         GXv_int9[0] = GXt_int8 ;
         new app.formulaciontinte.analisiscosteshistoricosrecetas_volumen(remoteHandle, context).execute( GXv_char7, GXv_int3, GXv_int6, GXv_char5, GXv_int4, GXv_int9) ;
         analisiscosteshistoricosrecetas_dp.this.A396EmprCod = GXv_char7[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4492HreBarCod = GXv_int3[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4493HreBarReo = GXv_int6[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4494HreBarPar = GXv_char5[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4495HreNumCie = GXv_int4[0] ;
         analisiscosteshistoricosrecetas_dp.this.GXt_int8 = GXv_int9[0] ;
         AV31HreVolPrd = GXt_int8 ;
         GXt_int8 = 0 ;
         GXv_char7[0] = A396EmprCod ;
         GXv_int9[0] = A4492HreBarCod ;
         GXv_int6[0] = A4493HreBarReo ;
         GXv_char5[0] = A4494HreBarPar ;
         GXv_int4[0] = A4495HreNumCie ;
         GXv_int3[0] = GXt_int8 ;
         new app.formulaciontinte.analisiscosteshistoricosrecetas_volumen(remoteHandle, context).execute( GXv_char7, GXv_int9, GXv_int6, GXv_char5, GXv_int4, GXv_int3) ;
         analisiscosteshistoricosrecetas_dp.this.A396EmprCod = GXv_char7[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4492HreBarCod = GXv_int9[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4493HreBarReo = GXv_int6[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4494HreBarPar = GXv_char5[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4495HreNumCie = GXv_int4[0] ;
         analisiscosteshistoricosrecetas_dp.this.GXt_int8 = GXv_int3[0] ;
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrevolprd( GXt_int8 );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Rb( ((A4542HreTotKgm.doubleValue()>0) ? DecimalUtil.doubleToDec(AV31HreVolPrd).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) );
         GXt_decimal10 = AV33CostequimicosI ;
         GXv_char7[0] = A396EmprCod ;
         GXv_int9[0] = A4492HreBarCod ;
         GXv_int6[0] = A4493HreBarReo ;
         GXv_char5[0] = A4494HreBarPar ;
         GXv_int4[0] = A4495HreNumCie ;
         GXv_decimal11[0] = GXt_decimal10 ;
         new app.formulaciontinte.analisiscosteshistoricosrecetas_costesiniciales(remoteHandle, context).execute( GXv_char7, GXv_int9, GXv_int6, GXv_char5, GXv_int4, GXv_decimal11) ;
         analisiscosteshistoricosrecetas_dp.this.A396EmprCod = GXv_char7[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4492HreBarCod = GXv_int9[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4493HreBarReo = GXv_int6[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4494HreBarPar = GXv_char5[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4495HreNumCie = GXv_int4[0] ;
         analisiscosteshistoricosrecetas_dp.this.GXt_decimal10 = GXv_decimal11[0] ;
         AV33CostequimicosI = GXt_decimal10 ;
         AV27Costei = ((A4542HreTotKgm.doubleValue()>0) ? (A4500HreAgrKgm.multiply(AV33CostequimicosI)).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costei( ((A4542HreTotKgm.doubleValue()>0) ? (A4500HreAgrKgm.multiply(AV33CostequimicosI)).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) );
         GXt_decimal10 = AV34CosteQuimicosT ;
         GXv_char7[0] = A396EmprCod ;
         GXv_int9[0] = A4492HreBarCod ;
         GXv_int6[0] = A4493HreBarReo ;
         GXv_char5[0] = A4494HreBarPar ;
         GXv_int4[0] = A4495HreNumCie ;
         GXv_decimal11[0] = GXt_decimal10 ;
         new app.formulaciontinte.analisiscosteshistoricosrecetas_costestotales(remoteHandle, context).execute( GXv_char7, GXv_int9, GXv_int6, GXv_char5, GXv_int4, GXv_decimal11) ;
         analisiscosteshistoricosrecetas_dp.this.A396EmprCod = GXv_char7[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4492HreBarCod = GXv_int9[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4493HreBarReo = GXv_int6[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4494HreBarPar = GXv_char5[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4495HreNumCie = GXv_int4[0] ;
         analisiscosteshistoricosrecetas_dp.this.GXt_decimal10 = GXv_decimal11[0] ;
         AV34CosteQuimicosT = GXt_decimal10 ;
         AV28CosteT = ((A4542HreTotKgm.doubleValue()>0) ? (A4500HreAgrKgm.multiply(AV34CosteQuimicosT)).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costet( ((A4542HreTotKgm.doubleValue()>0) ? (A4500HreAgrKgm.multiply(AV34CosteQuimicosT)).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Dif( AV27Costei.subtract(AV28CosteT) );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Porc( DecimalUtil.doubleToDec(((DecimalUtil.compareTo(DecimalUtil.ZERO, AV27Costei)==0) ? 0 : (long)(DecimalUtil.decToDouble(GXutil.roundDecimal( ((AV27Costei.subtract(AV28CosteT)).divide(AV27Costei, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 2))))) );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costek( ((A4500HreAgrKgm.doubleValue()>0) ? GXutil.roundDecimal( AV28CosteT.divide(A4500HreAgrKgm, 18, java.math.RoundingMode.DOWN), 2) : DecimalUtil.doubleToDec(0)) );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hremaqcod( A4496HreMaqHdr );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrlot( GXutil.str( A4492HreBarCod, 8, 0)+GXutil.str( A4493HreBarReo, 1, 0)+A4494HreBarPar );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosi( AV33CostequimicosI );
         GXt_decimal10 = DecimalUtil.ZERO ;
         GXv_char7[0] = A396EmprCod ;
         GXv_int9[0] = A4492HreBarCod ;
         GXv_int6[0] = A4493HreBarReo ;
         GXv_char5[0] = A4494HreBarPar ;
         GXv_int4[0] = A4495HreNumCie ;
         GXv_decimal11[0] = GXt_decimal10 ;
         new app.formulaciontinte.analisiscosteshistoricosrecetas_costesanyadidas(remoteHandle, context).execute( GXv_char7, GXv_int9, GXv_int6, GXv_char5, GXv_int4, GXv_decimal11) ;
         analisiscosteshistoricosrecetas_dp.this.A396EmprCod = GXv_char7[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4492HreBarCod = GXv_int9[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4493HreBarReo = GXv_int6[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4494HreBarPar = GXv_char5[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4495HreNumCie = GXv_int4[0] ;
         analisiscosteshistoricosrecetas_dp.this.GXt_decimal10 = GXv_decimal11[0] ;
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosa( GXt_decimal10 );
         AV29ItemOrderSDT = GXutil.substring( localUtil.dtoc( A4529HreFecTin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 7, 2) + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.dtoc( A4529HreFecTin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 4, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.dtoc( A4529HreFecTin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 1, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( A4492HreBarCod, 8, 0)), (short)(8), "0") + GXutil.str( A4493HreBarReo, 1, 0) + A4494HreBarPar + "1" ;
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Itemordersdt( AV29ItemOrderSDT );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprocod( " " );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprodsc( " " );
         GXt_char1 = "" ;
         GXv_char7[0] = A396EmprCod ;
         GXv_int9[0] = A4503HreAgrCli ;
         GXv_char5[0] = GXt_char1 ;
         new app.pprc252(remoteHandle, context).execute( GXv_char7, GXv_int9, GXv_char5) ;
         analisiscosteshistoricosrecetas_dp.this.A396EmprCod = GXv_char7[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4503HreAgrCli = GXv_int9[0] ;
         analisiscosteshistoricosrecetas_dp.this.GXt_char1 = GXv_char5[0] ;
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Prvdsc( GXt_char1 );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa( (byte)(1) );
         pr_default.readNext(1);
      }
      pr_default.close(1);
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV7Fec1 ,
                                           AV8Fec2 ,
                                           Integer.valueOf(AV19Clicod1) ,
                                           Integer.valueOf(AV20Clicod3) ,
                                           AV13ARtcod1 ,
                                           AV14ARtcod3 ,
                                           Short.valueOf(AV23TipArtCod1) ,
                                           Short.valueOf(AV24TipArtCod3) ,
                                           AV15Barcolnom1 ,
                                           AV16Barcolnom3 ,
                                           Integer.valueOf(AV17Barcolnum1) ,
                                           Integer.valueOf(AV18Barcolnum3) ,
                                           Byte.valueOf(AV25Tipcolcod1) ,
                                           Byte.valueOf(AV26Tipcolcod3) ,
                                           Byte.valueOf(AV21Intcod1) ,
                                           Byte.valueOf(AV22Intcod3) ,
                                           Integer.valueOf(AV10barcod) ,
                                           Byte.valueOf(AV11barcodreo) ,
                                           AV12barcodpar ,
                                           A4529HreFecTin ,
                                           Integer.valueOf(A252CliCod) ,
                                           A4517HreBarSer ,
                                           Short.valueOf(A4519HreTipArt) ,
                                           A4521HreColNom ,
                                           Integer.valueOf(A4522HreColNum) ,
                                           Byte.valueOf(A4525HreTipCol) ,
                                           Byte.valueOf(A4539HreIntCod) ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar ,
                                           A9808HreRacab ,
                                           AV6HreRacab ,
                                           AV5Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P002O4 */
      pr_default.execute(2, new Object[] {AV5Emprcod, AV6HreRacab, AV6HreRacab, AV7Fec1, AV8Fec2, Integer.valueOf(AV19Clicod1), Integer.valueOf(AV20Clicod3), AV13ARtcod1, AV14ARtcod3, Short.valueOf(AV23TipArtCod1), Short.valueOf(AV24TipArtCod3), AV15Barcolnom1, AV16Barcolnom3, Integer.valueOf(AV17Barcolnum1), Integer.valueOf(AV18Barcolnum3), Byte.valueOf(AV25Tipcolcod1), Byte.valueOf(AV26Tipcolcod3), Byte.valueOf(AV21Intcod1), Byte.valueOf(AV22Intcod3), Integer.valueOf(AV10barcod), Byte.valueOf(AV11barcodreo), AV12barcodpar});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A4494HreBarPar = P002O4_A4494HreBarPar[0] ;
         A4493HreBarReo = P002O4_A4493HreBarReo[0] ;
         A4492HreBarCod = P002O4_A4492HreBarCod[0] ;
         A4539HreIntCod = P002O4_A4539HreIntCod[0] ;
         n4539HreIntCod = P002O4_n4539HreIntCod[0] ;
         A4525HreTipCol = P002O4_A4525HreTipCol[0] ;
         n4525HreTipCol = P002O4_n4525HreTipCol[0] ;
         A4522HreColNum = P002O4_A4522HreColNum[0] ;
         n4522HreColNum = P002O4_n4522HreColNum[0] ;
         A4521HreColNom = P002O4_A4521HreColNom[0] ;
         n4521HreColNom = P002O4_n4521HreColNom[0] ;
         A4519HreTipArt = P002O4_A4519HreTipArt[0] ;
         n4519HreTipArt = P002O4_n4519HreTipArt[0] ;
         A4517HreBarSer = P002O4_A4517HreBarSer[0] ;
         n4517HreBarSer = P002O4_n4517HreBarSer[0] ;
         A252CliCod = P002O4_A252CliCod[0] ;
         n252CliCod = P002O4_n252CliCod[0] ;
         A9808HreRacab = P002O4_A9808HreRacab[0] ;
         n9808HreRacab = P002O4_n9808HreRacab[0] ;
         A4529HreFecTin = P002O4_A4529HreFecTin[0] ;
         n4529HreFecTin = P002O4_n4529HreFecTin[0] ;
         A396EmprCod = P002O4_A396EmprCod[0] ;
         A9987HreAcPar = P002O4_A9987HreAcPar[0] ;
         A9986HreAcReo = P002O4_A9986HreAcReo[0] ;
         A9985HreAcCod = P002O4_A9985HreAcCod[0] ;
         A9988HreAcKgm = P002O4_A9988HreAcKgm[0] ;
         n9988HreAcKgm = P002O4_n9988HreAcKgm[0] ;
         A4542HreTotKgm = P002O4_A4542HreTotKgm[0] ;
         n4542HreTotKgm = P002O4_n4542HreTotKgm[0] ;
         A9991HreAcCli = P002O4_A9991HreAcCli[0] ;
         n9991HreAcCli = P002O4_n9991HreAcCli[0] ;
         A9992HreAcSer = P002O4_A9992HreAcSer[0] ;
         n9992HreAcSer = P002O4_n9992HreAcSer[0] ;
         A9993HreAcDsc = P002O4_A9993HreAcDsc[0] ;
         n9993HreAcDsc = P002O4_n9993HreAcDsc[0] ;
         A9994HreAcCol = P002O4_A9994HreAcCol[0] ;
         n9994HreAcCol = P002O4_n9994HreAcCol[0] ;
         A9995HreAcNumC = P002O4_A9995HreAcNumC[0] ;
         n9995HreAcNumC = P002O4_n9995HreAcNumC[0] ;
         A4540HreIntDsc = P002O4_A4540HreIntDsc[0] ;
         n4540HreIntDsc = P002O4_n4540HreIntDsc[0] ;
         A4495HreNumCie = P002O4_A4495HreNumCie[0] ;
         A4496HreMaqHdr = P002O4_A4496HreMaqHdr[0] ;
         n4496HreMaqHdr = P002O4_n4496HreMaqHdr[0] ;
         A4539HreIntCod = P002O4_A4539HreIntCod[0] ;
         n4539HreIntCod = P002O4_n4539HreIntCod[0] ;
         A4525HreTipCol = P002O4_A4525HreTipCol[0] ;
         n4525HreTipCol = P002O4_n4525HreTipCol[0] ;
         A4522HreColNum = P002O4_A4522HreColNum[0] ;
         n4522HreColNum = P002O4_n4522HreColNum[0] ;
         A4521HreColNom = P002O4_A4521HreColNom[0] ;
         n4521HreColNom = P002O4_n4521HreColNom[0] ;
         A4519HreTipArt = P002O4_A4519HreTipArt[0] ;
         n4519HreTipArt = P002O4_n4519HreTipArt[0] ;
         A4517HreBarSer = P002O4_A4517HreBarSer[0] ;
         n4517HreBarSer = P002O4_n4517HreBarSer[0] ;
         A252CliCod = P002O4_A252CliCod[0] ;
         n252CliCod = P002O4_n252CliCod[0] ;
         A9808HreRacab = P002O4_A9808HreRacab[0] ;
         n9808HreRacab = P002O4_n9808HreRacab[0] ;
         A4529HreFecTin = P002O4_A4529HreFecTin[0] ;
         n4529HreFecTin = P002O4_n4529HreFecTin[0] ;
         A4542HreTotKgm = P002O4_A4542HreTotKgm[0] ;
         n4542HreTotKgm = P002O4_n4542HreTotKgm[0] ;
         A4540HreIntDsc = P002O4_A4540HreIntDsc[0] ;
         n4540HreIntDsc = P002O4_n4540HreIntDsc[0] ;
         A4496HreMaqHdr = P002O4_A4496HreMaqHdr[0] ;
         n4496HreMaqHdr = P002O4_n4496HreMaqHdr[0] ;
         Gxm1analisiscosteshistoricosrecetas_sdt = (app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT)new app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT(remoteHandle, context);
         Gxm2rootcol.add(Gxm1analisiscosteshistoricosrecetas_sdt, 0);
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Toa( "A" );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrefectin( A4529HreFecTin );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Marca( " " );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hdr( GXutil.str( A9985HreAcCod, 8, 0)+"-"+GXutil.str( A9986HreAcReo, 1, 0)+A9987HreAcPar );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrest( "S" );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarkgm( A9988HreAcKgm );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretotkgm( A4542HreTotKgm );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clicod( A9991HreAcCli );
         GXt_char1 = "" ;
         GXv_char7[0] = GXt_char1 ;
         new app.pclinom(remoteHandle, context).execute( A396EmprCod, A9991HreAcCli, GXv_char7) ;
         analisiscosteshistoricosrecetas_dp.this.GXt_char1 = GXv_char7[0] ;
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Clinom( GXt_char1 );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebarser( A9992HreAcSer );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrebardsc( A9993HreAcDsc );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipartd( " " );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnom( A9994HreAcCol );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrecolnum( A9995HreAcNumC );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hretipcoln( " " );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreintdsc( A4540HreIntDsc );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Enccli( " " );
         GXt_int8 = AV31HreVolPrd ;
         GXv_char7[0] = A396EmprCod ;
         GXv_int9[0] = A4492HreBarCod ;
         GXv_int6[0] = A4493HreBarReo ;
         GXv_char5[0] = A4494HreBarPar ;
         GXv_int4[0] = A4495HreNumCie ;
         GXv_int3[0] = GXt_int8 ;
         new app.formulaciontinte.analisiscosteshistoricosrecetas_volumen(remoteHandle, context).execute( GXv_char7, GXv_int9, GXv_int6, GXv_char5, GXv_int4, GXv_int3) ;
         analisiscosteshistoricosrecetas_dp.this.A396EmprCod = GXv_char7[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4492HreBarCod = GXv_int9[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4493HreBarReo = GXv_int6[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4494HreBarPar = GXv_char5[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4495HreNumCie = GXv_int4[0] ;
         analisiscosteshistoricosrecetas_dp.this.GXt_int8 = GXv_int3[0] ;
         AV31HreVolPrd = GXt_int8 ;
         GXt_int8 = 0 ;
         GXv_char7[0] = A396EmprCod ;
         GXv_int9[0] = A4492HreBarCod ;
         GXv_int6[0] = A4493HreBarReo ;
         GXv_char5[0] = A4494HreBarPar ;
         GXv_int4[0] = A4495HreNumCie ;
         GXv_int3[0] = GXt_int8 ;
         new app.formulaciontinte.analisiscosteshistoricosrecetas_volumen(remoteHandle, context).execute( GXv_char7, GXv_int9, GXv_int6, GXv_char5, GXv_int4, GXv_int3) ;
         analisiscosteshistoricosrecetas_dp.this.A396EmprCod = GXv_char7[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4492HreBarCod = GXv_int9[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4493HreBarReo = GXv_int6[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4494HreBarPar = GXv_char5[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4495HreNumCie = GXv_int4[0] ;
         analisiscosteshistoricosrecetas_dp.this.GXt_int8 = GXv_int3[0] ;
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hrevolprd( GXt_int8 );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Rb( ((A4542HreTotKgm.doubleValue()>0) ? DecimalUtil.doubleToDec(AV31HreVolPrd).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) );
         GXt_decimal10 = AV33CostequimicosI ;
         GXv_char7[0] = A396EmprCod ;
         GXv_int9[0] = A4492HreBarCod ;
         GXv_int6[0] = A4493HreBarReo ;
         GXv_char5[0] = A4494HreBarPar ;
         GXv_int4[0] = A4495HreNumCie ;
         GXv_decimal11[0] = GXt_decimal10 ;
         new app.formulaciontinte.analisiscosteshistoricosrecetas_costesiniciales(remoteHandle, context).execute( GXv_char7, GXv_int9, GXv_int6, GXv_char5, GXv_int4, GXv_decimal11) ;
         analisiscosteshistoricosrecetas_dp.this.A396EmprCod = GXv_char7[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4492HreBarCod = GXv_int9[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4493HreBarReo = GXv_int6[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4494HreBarPar = GXv_char5[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4495HreNumCie = GXv_int4[0] ;
         analisiscosteshistoricosrecetas_dp.this.GXt_decimal10 = GXv_decimal11[0] ;
         AV33CostequimicosI = GXt_decimal10 ;
         AV27Costei = ((A4542HreTotKgm.doubleValue()>0) ? (A9988HreAcKgm.multiply(AV33CostequimicosI)).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costei( ((A4542HreTotKgm.doubleValue()>0) ? (A9988HreAcKgm.multiply(AV33CostequimicosI)).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) );
         GXt_decimal10 = AV34CosteQuimicosT ;
         GXv_char7[0] = A396EmprCod ;
         GXv_int9[0] = A4492HreBarCod ;
         GXv_int6[0] = A4493HreBarReo ;
         GXv_char5[0] = A4494HreBarPar ;
         GXv_int4[0] = A4495HreNumCie ;
         GXv_decimal11[0] = GXt_decimal10 ;
         new app.formulaciontinte.analisiscosteshistoricosrecetas_costestotales(remoteHandle, context).execute( GXv_char7, GXv_int9, GXv_int6, GXv_char5, GXv_int4, GXv_decimal11) ;
         analisiscosteshistoricosrecetas_dp.this.A396EmprCod = GXv_char7[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4492HreBarCod = GXv_int9[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4493HreBarReo = GXv_int6[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4494HreBarPar = GXv_char5[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4495HreNumCie = GXv_int4[0] ;
         analisiscosteshistoricosrecetas_dp.this.GXt_decimal10 = GXv_decimal11[0] ;
         AV34CosteQuimicosT = GXt_decimal10 ;
         AV28CosteT = ((A4542HreTotKgm.doubleValue()>0) ? (A9988HreAcKgm.multiply(AV34CosteQuimicosT)).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) ;
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costet( ((A4542HreTotKgm.doubleValue()>0) ? (A9988HreAcKgm.multiply(AV34CosteQuimicosT)).divide(A4542HreTotKgm, 18, java.math.RoundingMode.DOWN) : DecimalUtil.doubleToDec(0)) );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Dif( AV27Costei.subtract(AV28CosteT) );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Porc( DecimalUtil.doubleToDec(((DecimalUtil.compareTo(DecimalUtil.ZERO, AV27Costei)==0) ? 0 : (long)(DecimalUtil.decToDouble(GXutil.roundDecimal( ((AV27Costei.subtract(AV28CosteT)).divide(AV27Costei, 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(100)), 2))))) );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costek( ((A9988HreAcKgm.doubleValue()>0) ? GXutil.roundDecimal( AV28CosteT.divide(A9988HreAcKgm, 18, java.math.RoundingMode.DOWN), 2) : DecimalUtil.doubleToDec(0)) );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hremaqcod( A4496HreMaqHdr );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Baragrlot( GXutil.str( A4492HreBarCod, 8, 0)+GXutil.str( A4493HreBarReo, 1, 0)+A4494HreBarPar );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosi( AV33CostequimicosI );
         GXt_decimal10 = DecimalUtil.ZERO ;
         GXv_char7[0] = A396EmprCod ;
         GXv_int9[0] = A4492HreBarCod ;
         GXv_int6[0] = A4493HreBarReo ;
         GXv_char5[0] = A4494HreBarPar ;
         GXv_int4[0] = A4495HreNumCie ;
         GXv_decimal11[0] = GXt_decimal10 ;
         new app.formulaciontinte.analisiscosteshistoricosrecetas_costesanyadidas(remoteHandle, context).execute( GXv_char7, GXv_int9, GXv_int6, GXv_char5, GXv_int4, GXv_decimal11) ;
         analisiscosteshistoricosrecetas_dp.this.A396EmprCod = GXv_char7[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4492HreBarCod = GXv_int9[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4493HreBarReo = GXv_int6[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4494HreBarPar = GXv_char5[0] ;
         analisiscosteshistoricosrecetas_dp.this.A4495HreNumCie = GXv_int4[0] ;
         analisiscosteshistoricosrecetas_dp.this.GXt_decimal10 = GXv_decimal11[0] ;
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Costesquimicosa( GXt_decimal10 );
         AV29ItemOrderSDT = GXutil.substring( localUtil.dtoc( A4529HreFecTin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 7, 2) + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.dtoc( A4529HreFecTin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 4, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.substring( localUtil.dtoc( A4529HreFecTin, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"), 1, 2)), (short)(2), "0") + GXutil.padl( GXutil.trim( GXutil.str( A4492HreBarCod, 8, 0)), (short)(8), "0") + GXutil.str( A4493HreBarReo, 1, 0) + A4494HreBarPar + "1" ;
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Itemordersdt( AV29ItemOrderSDT );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprocod( A4551HreProCod );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Hreprodsc( A4552HreProDsc );
         GXt_char1 = "" ;
         GXv_char7[0] = A396EmprCod ;
         GXv_int9[0] = A9991HreAcCli ;
         GXv_char5[0] = GXt_char1 ;
         new app.pprc252(remoteHandle, context).execute( GXv_char7, GXv_int9, GXv_char5) ;
         analisiscosteshistoricosrecetas_dp.this.A396EmprCod = GXv_char7[0] ;
         analisiscosteshistoricosrecetas_dp.this.A9991HreAcCli = GXv_int9[0] ;
         analisiscosteshistoricosrecetas_dp.this.GXt_char1 = GXv_char5[0] ;
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Prvdsc( GXt_char1 );
         Gxm1analisiscosteshistoricosrecetas_sdt.setgxTv_SdtAnalisisCostesHistoricosRecetas_SDT_Tablaa( (byte)(1) );
         pr_default.readNext(2);
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP22[0] = analisiscosteshistoricosrecetas_dp.this.Gxm2rootcol;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gxm2rootcol = new GXBaseCollection<app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT>(app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT.class, "AnalisisCostesHistoricosRecetas_SDT", "TexplusNET", remoteHandle);
      scmdbuf = "" ;
      A4529HreFecTin = GXutil.nullDate() ;
      A4517HreBarSer = "" ;
      A4521HreColNom = "" ;
      A4494HreBarPar = "" ;
      A9808HreRacab = "" ;
      A396EmprCod = "" ;
      P002O2_A4494HreBarPar = new String[] {""} ;
      P002O2_A4493HreBarReo = new byte[1] ;
      P002O2_A4492HreBarCod = new int[1] ;
      P002O2_A4539HreIntCod = new byte[1] ;
      P002O2_n4539HreIntCod = new boolean[] {false} ;
      P002O2_A4525HreTipCol = new byte[1] ;
      P002O2_n4525HreTipCol = new boolean[] {false} ;
      P002O2_A4522HreColNum = new int[1] ;
      P002O2_n4522HreColNum = new boolean[] {false} ;
      P002O2_A4521HreColNom = new String[] {""} ;
      P002O2_n4521HreColNom = new boolean[] {false} ;
      P002O2_A4519HreTipArt = new short[1] ;
      P002O2_n4519HreTipArt = new boolean[] {false} ;
      P002O2_A4517HreBarSer = new String[] {""} ;
      P002O2_n4517HreBarSer = new boolean[] {false} ;
      P002O2_A252CliCod = new int[1] ;
      P002O2_n252CliCod = new boolean[] {false} ;
      P002O2_A9808HreRacab = new String[] {""} ;
      P002O2_n9808HreRacab = new boolean[] {false} ;
      P002O2_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      P002O2_n4529HreFecTin = new boolean[] {false} ;
      P002O2_A396EmprCod = new String[] {""} ;
      P002O2_A4495HreNumCie = new byte[1] ;
      P002O2_A4532HreBarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002O2_n4532HreBarKgm = new boolean[] {false} ;
      P002O2_A4542HreTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002O2_n4542HreTotKgm = new boolean[] {false} ;
      P002O2_A279CliNom = new String[] {""} ;
      P002O2_A4518HreBarDsc = new String[] {""} ;
      P002O2_n4518HreBarDsc = new boolean[] {false} ;
      P002O2_A4520HreTipArtD = new String[] {""} ;
      P002O2_n4520HreTipArtD = new boolean[] {false} ;
      P002O2_A4526HreTipColN = new String[] {""} ;
      P002O2_n4526HreTipColN = new boolean[] {false} ;
      P002O2_A4540HreIntDsc = new String[] {""} ;
      P002O2_n4540HreIntDsc = new boolean[] {false} ;
      P002O2_A4516HreDisCli = new String[] {""} ;
      P002O2_n4516HreDisCli = new boolean[] {false} ;
      P002O2_A11318HreDispCli = new String[] {""} ;
      P002O2_n11318HreDispCli = new boolean[] {false} ;
      P002O2_A4547HreVolPrd = new int[1] ;
      P002O2_n4547HreVolPrd = new boolean[] {false} ;
      P002O2_A8607HreCosPD = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002O2_n8607HreCosPD = new boolean[] {false} ;
      P002O2_A8606HreCosPA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002O2_n8606HreCosPA = new boolean[] {false} ;
      P002O2_A8605HreCosCol = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002O2_n8605HreCosCol = new boolean[] {false} ;
      P002O2_A8604HreCosAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002O2_n8604HreCosAnc = new boolean[] {false} ;
      P002O2_A8603HrecosAd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002O2_n8603HrecosAd = new boolean[] {false} ;
      P002O2_A8602HreCosAA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002O2_n8602HreCosAA = new boolean[] {false} ;
      P002O2_A4546HreMaqCod = new String[] {""} ;
      P002O2_n4546HreMaqCod = new boolean[] {false} ;
      P002O2_A4545HreLinMaq = new short[1] ;
      A4532HreBarKgm = DecimalUtil.ZERO ;
      A4542HreTotKgm = DecimalUtil.ZERO ;
      A279CliNom = "" ;
      A4518HreBarDsc = "" ;
      A4520HreTipArtD = "" ;
      A4526HreTipColN = "" ;
      A4540HreIntDsc = "" ;
      A4516HreDisCli = "" ;
      A11318HreDispCli = "" ;
      A8607HreCosPD = DecimalUtil.ZERO ;
      A8606HreCosPA = DecimalUtil.ZERO ;
      A8605HreCosCol = DecimalUtil.ZERO ;
      A8604HreCosAnc = DecimalUtil.ZERO ;
      A8603HrecosAd = DecimalUtil.ZERO ;
      A8602HreCosAA = DecimalUtil.ZERO ;
      A4546HreMaqCod = "" ;
      Gxm1analisiscosteshistoricosrecetas_sdt = new app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT(remoteHandle, context);
      GXv_char2 = new String[1] ;
      AV27Costei = DecimalUtil.ZERO ;
      AV28CosteT = DecimalUtil.ZERO ;
      AV29ItemOrderSDT = "" ;
      A4551HreProCod = "" ;
      A4552HreProDsc = "" ;
      P002O3_A4494HreBarPar = new String[] {""} ;
      P002O3_A4493HreBarReo = new byte[1] ;
      P002O3_A4492HreBarCod = new int[1] ;
      P002O3_A4539HreIntCod = new byte[1] ;
      P002O3_n4539HreIntCod = new boolean[] {false} ;
      P002O3_A4525HreTipCol = new byte[1] ;
      P002O3_n4525HreTipCol = new boolean[] {false} ;
      P002O3_A4522HreColNum = new int[1] ;
      P002O3_n4522HreColNum = new boolean[] {false} ;
      P002O3_A4521HreColNom = new String[] {""} ;
      P002O3_n4521HreColNom = new boolean[] {false} ;
      P002O3_A4519HreTipArt = new short[1] ;
      P002O3_n4519HreTipArt = new boolean[] {false} ;
      P002O3_A4517HreBarSer = new String[] {""} ;
      P002O3_n4517HreBarSer = new boolean[] {false} ;
      P002O3_A252CliCod = new int[1] ;
      P002O3_n252CliCod = new boolean[] {false} ;
      P002O3_A9808HreRacab = new String[] {""} ;
      P002O3_n9808HreRacab = new boolean[] {false} ;
      P002O3_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      P002O3_n4529HreFecTin = new boolean[] {false} ;
      P002O3_A396EmprCod = new String[] {""} ;
      P002O3_A4499HreAgrPar = new String[] {""} ;
      P002O3_A4498HreAgrReo = new byte[1] ;
      P002O3_A4497HreAgrCod = new int[1] ;
      P002O3_A4500HreAgrKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002O3_A4542HreTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002O3_n4542HreTotKgm = new boolean[] {false} ;
      P002O3_A4503HreAgrCli = new int[1] ;
      P002O3_A4504HreAgrSer = new String[] {""} ;
      P002O3_A4505HreAgrDsc = new String[] {""} ;
      P002O3_A4506HreAgrCol = new String[] {""} ;
      P002O3_A4507HreAgrNumC = new int[1] ;
      P002O3_A4540HreIntDsc = new String[] {""} ;
      P002O3_n4540HreIntDsc = new boolean[] {false} ;
      P002O3_A4495HreNumCie = new byte[1] ;
      P002O3_A4496HreMaqHdr = new String[] {""} ;
      P002O3_n4496HreMaqHdr = new boolean[] {false} ;
      A4499HreAgrPar = "" ;
      A4500HreAgrKgm = DecimalUtil.ZERO ;
      A4504HreAgrSer = "" ;
      A4505HreAgrDsc = "" ;
      A4506HreAgrCol = "" ;
      A4496HreMaqHdr = "" ;
      AV33CostequimicosI = DecimalUtil.ZERO ;
      AV34CosteQuimicosT = DecimalUtil.ZERO ;
      P002O4_A4494HreBarPar = new String[] {""} ;
      P002O4_A4493HreBarReo = new byte[1] ;
      P002O4_A4492HreBarCod = new int[1] ;
      P002O4_A4539HreIntCod = new byte[1] ;
      P002O4_n4539HreIntCod = new boolean[] {false} ;
      P002O4_A4525HreTipCol = new byte[1] ;
      P002O4_n4525HreTipCol = new boolean[] {false} ;
      P002O4_A4522HreColNum = new int[1] ;
      P002O4_n4522HreColNum = new boolean[] {false} ;
      P002O4_A4521HreColNom = new String[] {""} ;
      P002O4_n4521HreColNom = new boolean[] {false} ;
      P002O4_A4519HreTipArt = new short[1] ;
      P002O4_n4519HreTipArt = new boolean[] {false} ;
      P002O4_A4517HreBarSer = new String[] {""} ;
      P002O4_n4517HreBarSer = new boolean[] {false} ;
      P002O4_A252CliCod = new int[1] ;
      P002O4_n252CliCod = new boolean[] {false} ;
      P002O4_A9808HreRacab = new String[] {""} ;
      P002O4_n9808HreRacab = new boolean[] {false} ;
      P002O4_A4529HreFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      P002O4_n4529HreFecTin = new boolean[] {false} ;
      P002O4_A396EmprCod = new String[] {""} ;
      P002O4_A9987HreAcPar = new String[] {""} ;
      P002O4_A9986HreAcReo = new byte[1] ;
      P002O4_A9985HreAcCod = new int[1] ;
      P002O4_A9988HreAcKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002O4_n9988HreAcKgm = new boolean[] {false} ;
      P002O4_A4542HreTotKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P002O4_n4542HreTotKgm = new boolean[] {false} ;
      P002O4_A9991HreAcCli = new int[1] ;
      P002O4_n9991HreAcCli = new boolean[] {false} ;
      P002O4_A9992HreAcSer = new String[] {""} ;
      P002O4_n9992HreAcSer = new boolean[] {false} ;
      P002O4_A9993HreAcDsc = new String[] {""} ;
      P002O4_n9993HreAcDsc = new boolean[] {false} ;
      P002O4_A9994HreAcCol = new String[] {""} ;
      P002O4_n9994HreAcCol = new boolean[] {false} ;
      P002O4_A9995HreAcNumC = new int[1] ;
      P002O4_n9995HreAcNumC = new boolean[] {false} ;
      P002O4_A4540HreIntDsc = new String[] {""} ;
      P002O4_n4540HreIntDsc = new boolean[] {false} ;
      P002O4_A4495HreNumCie = new byte[1] ;
      P002O4_A4496HreMaqHdr = new String[] {""} ;
      P002O4_n4496HreMaqHdr = new boolean[] {false} ;
      A9987HreAcPar = "" ;
      A9988HreAcKgm = DecimalUtil.ZERO ;
      A9992HreAcSer = "" ;
      A9993HreAcDsc = "" ;
      A9994HreAcCol = "" ;
      GXv_int3 = new int[1] ;
      GXt_decimal10 = DecimalUtil.ZERO ;
      GXv_int6 = new byte[1] ;
      GXv_int4 = new byte[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXt_char1 = "" ;
      GXv_char7 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_char5 = new String[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.analisiscosteshistoricosrecetas_dp__default(),
         new Object[] {
             new Object[] {
            P002O2_A4494HreBarPar, P002O2_A4493HreBarReo, P002O2_A4492HreBarCod, P002O2_A4539HreIntCod, P002O2_n4539HreIntCod, P002O2_A4525HreTipCol, P002O2_n4525HreTipCol, P002O2_A4522HreColNum, P002O2_n4522HreColNum, P002O2_A4521HreColNom,
            P002O2_n4521HreColNom, P002O2_A4519HreTipArt, P002O2_n4519HreTipArt, P002O2_A4517HreBarSer, P002O2_n4517HreBarSer, P002O2_A252CliCod, P002O2_n252CliCod, P002O2_A9808HreRacab, P002O2_n9808HreRacab, P002O2_A4529HreFecTin,
            P002O2_n4529HreFecTin, P002O2_A396EmprCod, P002O2_A4495HreNumCie, P002O2_A4532HreBarKgm, P002O2_n4532HreBarKgm, P002O2_A4542HreTotKgm, P002O2_n4542HreTotKgm, P002O2_A279CliNom, P002O2_A4518HreBarDsc, P002O2_n4518HreBarDsc,
            P002O2_A4520HreTipArtD, P002O2_n4520HreTipArtD, P002O2_A4526HreTipColN, P002O2_n4526HreTipColN, P002O2_A4540HreIntDsc, P002O2_n4540HreIntDsc, P002O2_A4516HreDisCli, P002O2_n4516HreDisCli, P002O2_A11318HreDispCli, P002O2_n11318HreDispCli,
            P002O2_A4547HreVolPrd, P002O2_n4547HreVolPrd, P002O2_A8607HreCosPD, P002O2_n8607HreCosPD, P002O2_A8606HreCosPA, P002O2_n8606HreCosPA, P002O2_A8605HreCosCol, P002O2_n8605HreCosCol, P002O2_A8604HreCosAnc, P002O2_n8604HreCosAnc,
            P002O2_A8603HrecosAd, P002O2_n8603HrecosAd, P002O2_A8602HreCosAA, P002O2_n8602HreCosAA, P002O2_A4546HreMaqCod, P002O2_n4546HreMaqCod, P002O2_A4545HreLinMaq
            }
            , new Object[] {
            P002O3_A4494HreBarPar, P002O3_A4493HreBarReo, P002O3_A4492HreBarCod, P002O3_A4539HreIntCod, P002O3_n4539HreIntCod, P002O3_A4525HreTipCol, P002O3_n4525HreTipCol, P002O3_A4522HreColNum, P002O3_n4522HreColNum, P002O3_A4521HreColNom,
            P002O3_n4521HreColNom, P002O3_A4519HreTipArt, P002O3_n4519HreTipArt, P002O3_A4517HreBarSer, P002O3_n4517HreBarSer, P002O3_A252CliCod, P002O3_n252CliCod, P002O3_A9808HreRacab, P002O3_n9808HreRacab, P002O3_A4529HreFecTin,
            P002O3_n4529HreFecTin, P002O3_A396EmprCod, P002O3_A4499HreAgrPar, P002O3_A4498HreAgrReo, P002O3_A4497HreAgrCod, P002O3_A4500HreAgrKgm, P002O3_A4542HreTotKgm, P002O3_n4542HreTotKgm, P002O3_A4503HreAgrCli, P002O3_A4504HreAgrSer,
            P002O3_A4505HreAgrDsc, P002O3_A4506HreAgrCol, P002O3_A4507HreAgrNumC, P002O3_A4540HreIntDsc, P002O3_n4540HreIntDsc, P002O3_A4495HreNumCie, P002O3_A4496HreMaqHdr, P002O3_n4496HreMaqHdr
            }
            , new Object[] {
            P002O4_A4494HreBarPar, P002O4_A4493HreBarReo, P002O4_A4492HreBarCod, P002O4_A4539HreIntCod, P002O4_n4539HreIntCod, P002O4_A4525HreTipCol, P002O4_n4525HreTipCol, P002O4_A4522HreColNum, P002O4_n4522HreColNum, P002O4_A4521HreColNom,
            P002O4_n4521HreColNom, P002O4_A4519HreTipArt, P002O4_n4519HreTipArt, P002O4_A4517HreBarSer, P002O4_n4517HreBarSer, P002O4_A252CliCod, P002O4_n252CliCod, P002O4_A9808HreRacab, P002O4_n9808HreRacab, P002O4_A4529HreFecTin,
            P002O4_n4529HreFecTin, P002O4_A396EmprCod, P002O4_A9987HreAcPar, P002O4_A9986HreAcReo, P002O4_A9985HreAcCod, P002O4_A9988HreAcKgm, P002O4_n9988HreAcKgm, P002O4_A4542HreTotKgm, P002O4_n4542HreTotKgm, P002O4_A9991HreAcCli,
            P002O4_n9991HreAcCli, P002O4_A9992HreAcSer, P002O4_n9992HreAcSer, P002O4_A9993HreAcDsc, P002O4_n9993HreAcDsc, P002O4_A9994HreAcCol, P002O4_n9994HreAcCol, P002O4_A9995HreAcNumC, P002O4_n9995HreAcNumC, P002O4_A4540HreIntDsc,
            P002O4_n4540HreIntDsc, P002O4_A4495HreNumCie, P002O4_A4496HreMaqHdr, P002O4_n4496HreMaqHdr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9Calculo ;
   private byte AV11barcodreo ;
   private byte AV21Intcod1 ;
   private byte AV22Intcod3 ;
   private byte AV25Tipcolcod1 ;
   private byte AV26Tipcolcod3 ;
   private byte A4525HreTipCol ;
   private byte A4539HreIntCod ;
   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4498HreAgrReo ;
   private byte A9986HreAcReo ;
   private byte GXv_int6[] ;
   private byte GXv_int4[] ;
   private short AV23TipArtCod1 ;
   private short AV24TipArtCod3 ;
   private short A4519HreTipArt ;
   private short A4545HreLinMaq ;
   private short Gx_err ;
   private int AV10barcod ;
   private int AV17Barcolnum1 ;
   private int AV18Barcolnum3 ;
   private int AV19Clicod1 ;
   private int AV20Clicod3 ;
   private int A252CliCod ;
   private int A4522HreColNum ;
   private int A4492HreBarCod ;
   private int A4547HreVolPrd ;
   private int A4497HreAgrCod ;
   private int A4503HreAgrCli ;
   private int A4507HreAgrNumC ;
   private int AV31HreVolPrd ;
   private int A9985HreAcCod ;
   private int A9991HreAcCli ;
   private int A9995HreAcNumC ;
   private int GXt_int8 ;
   private int GXv_int3[] ;
   private int GXv_int9[] ;
   private java.math.BigDecimal A4532HreBarKgm ;
   private java.math.BigDecimal A4542HreTotKgm ;
   private java.math.BigDecimal A8607HreCosPD ;
   private java.math.BigDecimal A8606HreCosPA ;
   private java.math.BigDecimal A8605HreCosCol ;
   private java.math.BigDecimal A8604HreCosAnc ;
   private java.math.BigDecimal A8603HrecosAd ;
   private java.math.BigDecimal A8602HreCosAA ;
   private java.math.BigDecimal AV27Costei ;
   private java.math.BigDecimal AV28CosteT ;
   private java.math.BigDecimal A4500HreAgrKgm ;
   private java.math.BigDecimal AV33CostequimicosI ;
   private java.math.BigDecimal AV34CosteQuimicosT ;
   private java.math.BigDecimal A9988HreAcKgm ;
   private java.math.BigDecimal GXt_decimal10 ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private String AV5Emprcod ;
   private String AV6HreRacab ;
   private String AV12barcodpar ;
   private String AV13ARtcod1 ;
   private String AV14ARtcod3 ;
   private String AV15Barcolnom1 ;
   private String AV16Barcolnom3 ;
   private String scmdbuf ;
   private String A4517HreBarSer ;
   private String A4521HreColNom ;
   private String A4494HreBarPar ;
   private String A9808HreRacab ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private String A4518HreBarDsc ;
   private String A4520HreTipArtD ;
   private String A4526HreTipColN ;
   private String A4540HreIntDsc ;
   private String A4516HreDisCli ;
   private String A11318HreDispCli ;
   private String A4546HreMaqCod ;
   private String GXv_char2[] ;
   private String AV29ItemOrderSDT ;
   private String A4551HreProCod ;
   private String A4552HreProDsc ;
   private String A4499HreAgrPar ;
   private String A4504HreAgrSer ;
   private String A4505HreAgrDsc ;
   private String A4506HreAgrCol ;
   private String A4496HreMaqHdr ;
   private String A9987HreAcPar ;
   private String A9992HreAcSer ;
   private String A9993HreAcDsc ;
   private String A9994HreAcCol ;
   private String GXt_char1 ;
   private String GXv_char7[] ;
   private String GXv_char5[] ;
   private java.util.Date AV7Fec1 ;
   private java.util.Date AV8Fec2 ;
   private java.util.Date A4529HreFecTin ;
   private boolean n4539HreIntCod ;
   private boolean n4525HreTipCol ;
   private boolean n4522HreColNum ;
   private boolean n4521HreColNom ;
   private boolean n4519HreTipArt ;
   private boolean n4517HreBarSer ;
   private boolean n252CliCod ;
   private boolean n9808HreRacab ;
   private boolean n4529HreFecTin ;
   private boolean n4532HreBarKgm ;
   private boolean n4542HreTotKgm ;
   private boolean n4518HreBarDsc ;
   private boolean n4520HreTipArtD ;
   private boolean n4526HreTipColN ;
   private boolean n4540HreIntDsc ;
   private boolean n4516HreDisCli ;
   private boolean n11318HreDispCli ;
   private boolean n4547HreVolPrd ;
   private boolean n8607HreCosPD ;
   private boolean n8606HreCosPA ;
   private boolean n8605HreCosCol ;
   private boolean n8604HreCosAnc ;
   private boolean n8603HrecosAd ;
   private boolean n8602HreCosAA ;
   private boolean n4546HreMaqCod ;
   private boolean n4496HreMaqHdr ;
   private boolean n9988HreAcKgm ;
   private boolean n9991HreAcCli ;
   private boolean n9992HreAcSer ;
   private boolean n9993HreAcDsc ;
   private boolean n9994HreAcCol ;
   private boolean n9995HreAcNumC ;
   private GXBaseCollection<app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT>[] aP22 ;
   private IDataStoreProvider pr_default ;
   private String[] P002O2_A4494HreBarPar ;
   private byte[] P002O2_A4493HreBarReo ;
   private int[] P002O2_A4492HreBarCod ;
   private byte[] P002O2_A4539HreIntCod ;
   private boolean[] P002O2_n4539HreIntCod ;
   private byte[] P002O2_A4525HreTipCol ;
   private boolean[] P002O2_n4525HreTipCol ;
   private int[] P002O2_A4522HreColNum ;
   private boolean[] P002O2_n4522HreColNum ;
   private String[] P002O2_A4521HreColNom ;
   private boolean[] P002O2_n4521HreColNom ;
   private short[] P002O2_A4519HreTipArt ;
   private boolean[] P002O2_n4519HreTipArt ;
   private String[] P002O2_A4517HreBarSer ;
   private boolean[] P002O2_n4517HreBarSer ;
   private int[] P002O2_A252CliCod ;
   private boolean[] P002O2_n252CliCod ;
   private String[] P002O2_A9808HreRacab ;
   private boolean[] P002O2_n9808HreRacab ;
   private java.util.Date[] P002O2_A4529HreFecTin ;
   private boolean[] P002O2_n4529HreFecTin ;
   private String[] P002O2_A396EmprCod ;
   private byte[] P002O2_A4495HreNumCie ;
   private java.math.BigDecimal[] P002O2_A4532HreBarKgm ;
   private boolean[] P002O2_n4532HreBarKgm ;
   private java.math.BigDecimal[] P002O2_A4542HreTotKgm ;
   private boolean[] P002O2_n4542HreTotKgm ;
   private String[] P002O2_A279CliNom ;
   private String[] P002O2_A4518HreBarDsc ;
   private boolean[] P002O2_n4518HreBarDsc ;
   private String[] P002O2_A4520HreTipArtD ;
   private boolean[] P002O2_n4520HreTipArtD ;
   private String[] P002O2_A4526HreTipColN ;
   private boolean[] P002O2_n4526HreTipColN ;
   private String[] P002O2_A4540HreIntDsc ;
   private boolean[] P002O2_n4540HreIntDsc ;
   private String[] P002O2_A4516HreDisCli ;
   private boolean[] P002O2_n4516HreDisCli ;
   private String[] P002O2_A11318HreDispCli ;
   private boolean[] P002O2_n11318HreDispCli ;
   private int[] P002O2_A4547HreVolPrd ;
   private boolean[] P002O2_n4547HreVolPrd ;
   private java.math.BigDecimal[] P002O2_A8607HreCosPD ;
   private boolean[] P002O2_n8607HreCosPD ;
   private java.math.BigDecimal[] P002O2_A8606HreCosPA ;
   private boolean[] P002O2_n8606HreCosPA ;
   private java.math.BigDecimal[] P002O2_A8605HreCosCol ;
   private boolean[] P002O2_n8605HreCosCol ;
   private java.math.BigDecimal[] P002O2_A8604HreCosAnc ;
   private boolean[] P002O2_n8604HreCosAnc ;
   private java.math.BigDecimal[] P002O2_A8603HrecosAd ;
   private boolean[] P002O2_n8603HrecosAd ;
   private java.math.BigDecimal[] P002O2_A8602HreCosAA ;
   private boolean[] P002O2_n8602HreCosAA ;
   private String[] P002O2_A4546HreMaqCod ;
   private boolean[] P002O2_n4546HreMaqCod ;
   private short[] P002O2_A4545HreLinMaq ;
   private String[] P002O3_A4494HreBarPar ;
   private byte[] P002O3_A4493HreBarReo ;
   private int[] P002O3_A4492HreBarCod ;
   private byte[] P002O3_A4539HreIntCod ;
   private boolean[] P002O3_n4539HreIntCod ;
   private byte[] P002O3_A4525HreTipCol ;
   private boolean[] P002O3_n4525HreTipCol ;
   private int[] P002O3_A4522HreColNum ;
   private boolean[] P002O3_n4522HreColNum ;
   private String[] P002O3_A4521HreColNom ;
   private boolean[] P002O3_n4521HreColNom ;
   private short[] P002O3_A4519HreTipArt ;
   private boolean[] P002O3_n4519HreTipArt ;
   private String[] P002O3_A4517HreBarSer ;
   private boolean[] P002O3_n4517HreBarSer ;
   private int[] P002O3_A252CliCod ;
   private boolean[] P002O3_n252CliCod ;
   private String[] P002O3_A9808HreRacab ;
   private boolean[] P002O3_n9808HreRacab ;
   private java.util.Date[] P002O3_A4529HreFecTin ;
   private boolean[] P002O3_n4529HreFecTin ;
   private String[] P002O3_A396EmprCod ;
   private String[] P002O3_A4499HreAgrPar ;
   private byte[] P002O3_A4498HreAgrReo ;
   private int[] P002O3_A4497HreAgrCod ;
   private java.math.BigDecimal[] P002O3_A4500HreAgrKgm ;
   private java.math.BigDecimal[] P002O3_A4542HreTotKgm ;
   private boolean[] P002O3_n4542HreTotKgm ;
   private int[] P002O3_A4503HreAgrCli ;
   private String[] P002O3_A4504HreAgrSer ;
   private String[] P002O3_A4505HreAgrDsc ;
   private String[] P002O3_A4506HreAgrCol ;
   private int[] P002O3_A4507HreAgrNumC ;
   private String[] P002O3_A4540HreIntDsc ;
   private boolean[] P002O3_n4540HreIntDsc ;
   private byte[] P002O3_A4495HreNumCie ;
   private String[] P002O3_A4496HreMaqHdr ;
   private boolean[] P002O3_n4496HreMaqHdr ;
   private String[] P002O4_A4494HreBarPar ;
   private byte[] P002O4_A4493HreBarReo ;
   private int[] P002O4_A4492HreBarCod ;
   private byte[] P002O4_A4539HreIntCod ;
   private boolean[] P002O4_n4539HreIntCod ;
   private byte[] P002O4_A4525HreTipCol ;
   private boolean[] P002O4_n4525HreTipCol ;
   private int[] P002O4_A4522HreColNum ;
   private boolean[] P002O4_n4522HreColNum ;
   private String[] P002O4_A4521HreColNom ;
   private boolean[] P002O4_n4521HreColNom ;
   private short[] P002O4_A4519HreTipArt ;
   private boolean[] P002O4_n4519HreTipArt ;
   private String[] P002O4_A4517HreBarSer ;
   private boolean[] P002O4_n4517HreBarSer ;
   private int[] P002O4_A252CliCod ;
   private boolean[] P002O4_n252CliCod ;
   private String[] P002O4_A9808HreRacab ;
   private boolean[] P002O4_n9808HreRacab ;
   private java.util.Date[] P002O4_A4529HreFecTin ;
   private boolean[] P002O4_n4529HreFecTin ;
   private String[] P002O4_A396EmprCod ;
   private String[] P002O4_A9987HreAcPar ;
   private byte[] P002O4_A9986HreAcReo ;
   private int[] P002O4_A9985HreAcCod ;
   private java.math.BigDecimal[] P002O4_A9988HreAcKgm ;
   private boolean[] P002O4_n9988HreAcKgm ;
   private java.math.BigDecimal[] P002O4_A4542HreTotKgm ;
   private boolean[] P002O4_n4542HreTotKgm ;
   private int[] P002O4_A9991HreAcCli ;
   private boolean[] P002O4_n9991HreAcCli ;
   private String[] P002O4_A9992HreAcSer ;
   private boolean[] P002O4_n9992HreAcSer ;
   private String[] P002O4_A9993HreAcDsc ;
   private boolean[] P002O4_n9993HreAcDsc ;
   private String[] P002O4_A9994HreAcCol ;
   private boolean[] P002O4_n9994HreAcCol ;
   private int[] P002O4_A9995HreAcNumC ;
   private boolean[] P002O4_n9995HreAcNumC ;
   private String[] P002O4_A4540HreIntDsc ;
   private boolean[] P002O4_n4540HreIntDsc ;
   private byte[] P002O4_A4495HreNumCie ;
   private String[] P002O4_A4496HreMaqHdr ;
   private boolean[] P002O4_n4496HreMaqHdr ;
   private GXBaseCollection<app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT> Gxm2rootcol ;
   private app.formulaciontinte.SdtAnalisisCostesHistoricosRecetas_SDT Gxm1analisiscosteshistoricosrecetas_sdt ;
}

final  class analisiscosteshistoricosrecetas_dp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P002O2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV7Fec1 ,
                                          java.util.Date AV8Fec2 ,
                                          int AV19Clicod1 ,
                                          int AV20Clicod3 ,
                                          String AV13ARtcod1 ,
                                          String AV14ARtcod3 ,
                                          short AV23TipArtCod1 ,
                                          short AV24TipArtCod3 ,
                                          String AV15Barcolnom1 ,
                                          String AV16Barcolnom3 ,
                                          int AV17Barcolnum1 ,
                                          int AV18Barcolnum3 ,
                                          byte AV25Tipcolcod1 ,
                                          byte AV26Tipcolcod3 ,
                                          byte AV21Intcod1 ,
                                          byte AV22Intcod3 ,
                                          int AV10barcod ,
                                          byte AV11barcodreo ,
                                          String AV12barcodpar ,
                                          java.util.Date A4529HreFecTin ,
                                          int A252CliCod ,
                                          String A4517HreBarSer ,
                                          short A4519HreTipArt ,
                                          String A4521HreColNom ,
                                          int A4522HreColNum ,
                                          byte A4525HreTipCol ,
                                          byte A4539HreIntCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          String A9808HreRacab ,
                                          String AV6HreRacab ,
                                          String AV5Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[22];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T2.HreIntCod, T2.HreTipCol, T2.HreColNum, T2.HreColNom, T2.HreTipArt, T2.HreBarSer, T2.CliCod, T2.HreRacab, T2.HreFecTin," ;
      scmdbuf += " T1.EmprCod, T1.HreNumCie, T2.HreBarKgm, T2.HreTotKgm, T3.CliNom, T2.HreBarDsc, T2.HreTipArtD, T2.HreTipColN, T2.HreIntDsc, T2.HreDisCli, T2.HreDispCli, T1.HreVolPrd," ;
      scmdbuf += " T1.HreCosPD, T1.HreCosPA, T1.HreCosCol, T1.HreCosAnc, T1.HrecosAd, T1.HreCosAA, T1.HreMaqCod, T1.HreLinMaq FROM ((TXPHISREM T1 INNER JOIN TXPHISREH T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.HreBarCod = T1.HreBarCod AND T2.HreBarReo = T1.HreBarReo AND T2.HreBarPar = T1.HreBarPar AND T2.HreNumCie = T1.HreNumCie) LEFT JOIN TXPCLIENT" ;
      scmdbuf += " T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T2.HreRacab = ? or ? = 'T')");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV7Fec1)) )
      {
         addWhere(sWhereString, "(T2.HreFecTin >= ?)");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV8Fec2)) )
      {
         addWhere(sWhereString, "(T2.HreFecTin <= ?)");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( ! (0==AV19Clicod1) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( ! (0==AV20Clicod3) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13ARtcod1)==0) )
      {
         addWhere(sWhereString, "(T2.HreBarSer >= ?)");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV14ARtcod3)==0) )
      {
         addWhere(sWhereString, "(T2.HreBarSer <= ?)");
      }
      else
      {
         GXv_int12[8] = (byte)(1) ;
      }
      if ( ! (0==AV23TipArtCod1) )
      {
         addWhere(sWhereString, "(T2.HreTipArt >= ?)");
      }
      else
      {
         GXv_int12[9] = (byte)(1) ;
      }
      if ( ! (0==AV24TipArtCod3) )
      {
         addWhere(sWhereString, "(T2.HreTipArt <= ?)");
      }
      else
      {
         GXv_int12[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15Barcolnom1)==0) )
      {
         addWhere(sWhereString, "(T2.HreColNom >= ?)");
      }
      else
      {
         GXv_int12[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16Barcolnom3)==0) )
      {
         addWhere(sWhereString, "(T2.HreColNom <= ?)");
      }
      else
      {
         GXv_int12[12] = (byte)(1) ;
      }
      if ( ! (0==AV17Barcolnum1) )
      {
         addWhere(sWhereString, "(T2.HreColNum >= ?)");
      }
      else
      {
         GXv_int12[13] = (byte)(1) ;
      }
      if ( ! (0==AV18Barcolnum3) )
      {
         addWhere(sWhereString, "(T2.HreColNum <= ?)");
      }
      else
      {
         GXv_int12[14] = (byte)(1) ;
      }
      if ( ! (0==AV25Tipcolcod1) )
      {
         addWhere(sWhereString, "(T2.HreTipCol >= ?)");
      }
      else
      {
         GXv_int12[15] = (byte)(1) ;
      }
      if ( ! (0==AV26Tipcolcod3) )
      {
         addWhere(sWhereString, "(T2.HreTipCol <= ?)");
      }
      else
      {
         GXv_int12[16] = (byte)(1) ;
      }
      if ( ! (0==AV21Intcod1) )
      {
         addWhere(sWhereString, "(T2.HreIntCod >= ?)");
      }
      else
      {
         GXv_int12[17] = (byte)(1) ;
      }
      if ( ! (0==AV22Intcod3) )
      {
         addWhere(sWhereString, "(T2.HreIntCod <= ?)");
      }
      else
      {
         GXv_int12[18] = (byte)(1) ;
      }
      if ( ! (0==AV10barcod) )
      {
         addWhere(sWhereString, "(T1.HreBarCod = ?)");
      }
      else
      {
         GXv_int12[19] = (byte)(1) ;
      }
      if ( ! (0==AV11barcodreo) )
      {
         addWhere(sWhereString, "(T1.HreBarReo = ?)");
      }
      else
      {
         GXv_int12[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12barcodpar)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarPar = ?)");
      }
      else
      {
         GXv_int12[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_P002O3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV7Fec1 ,
                                          java.util.Date AV8Fec2 ,
                                          int AV19Clicod1 ,
                                          int AV20Clicod3 ,
                                          String AV13ARtcod1 ,
                                          String AV14ARtcod3 ,
                                          short AV23TipArtCod1 ,
                                          short AV24TipArtCod3 ,
                                          String AV15Barcolnom1 ,
                                          String AV16Barcolnom3 ,
                                          int AV17Barcolnum1 ,
                                          int AV18Barcolnum3 ,
                                          byte AV25Tipcolcod1 ,
                                          byte AV26Tipcolcod3 ,
                                          byte AV21Intcod1 ,
                                          byte AV22Intcod3 ,
                                          int AV10barcod ,
                                          byte AV11barcodreo ,
                                          String AV12barcodpar ,
                                          java.util.Date A4529HreFecTin ,
                                          int A252CliCod ,
                                          String A4517HreBarSer ,
                                          short A4519HreTipArt ,
                                          String A4521HreColNom ,
                                          int A4522HreColNum ,
                                          byte A4525HreTipCol ,
                                          byte A4539HreIntCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          String A9808HreRacab ,
                                          String AV6HreRacab ,
                                          String AV5Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[22];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T2.HreIntCod, T2.HreTipCol, T2.HreColNum, T2.HreColNom, T2.HreTipArt, T2.HreBarSer, T2.CliCod, T2.HreRacab, T2.HreFecTin," ;
      scmdbuf += " T1.EmprCod, T1.HreAgrPar, T1.HreAgrReo, T1.HreAgrCod, T1.HreAgrKgm, T2.HreTotKgm, T1.HreAgrCli, T1.HreAgrSer, T1.HreAgrDsc, T1.HreAgrCol, T1.HreAgrNumC, T2.HreIntDsc," ;
      scmdbuf += " T1.HreNumCie, T2.HreMaqHdr FROM (TXPHISRAG T1 INNER JOIN TXPHISREH T2 ON T2.EmprCod = T1.EmprCod AND T2.HreBarCod = T1.HreBarCod AND T2.HreBarReo = T1.HreBarReo" ;
      scmdbuf += " AND T2.HreBarPar = T1.HreBarPar AND T2.HreNumCie = T1.HreNumCie)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T2.HreRacab = ? or ? = 'T')");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV7Fec1)) )
      {
         addWhere(sWhereString, "(T2.HreFecTin >= ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV8Fec2)) )
      {
         addWhere(sWhereString, "(T2.HreFecTin <= ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! (0==AV19Clicod1) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! (0==AV20Clicod3) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13ARtcod1)==0) )
      {
         addWhere(sWhereString, "(T2.HreBarSer >= ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV14ARtcod3)==0) )
      {
         addWhere(sWhereString, "(T2.HreBarSer <= ?)");
      }
      else
      {
         GXv_int14[8] = (byte)(1) ;
      }
      if ( ! (0==AV23TipArtCod1) )
      {
         addWhere(sWhereString, "(T2.HreTipArt >= ?)");
      }
      else
      {
         GXv_int14[9] = (byte)(1) ;
      }
      if ( ! (0==AV24TipArtCod3) )
      {
         addWhere(sWhereString, "(T2.HreTipArt <= ?)");
      }
      else
      {
         GXv_int14[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15Barcolnom1)==0) )
      {
         addWhere(sWhereString, "(T2.HreColNom >= ?)");
      }
      else
      {
         GXv_int14[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16Barcolnom3)==0) )
      {
         addWhere(sWhereString, "(T2.HreColNom <= ?)");
      }
      else
      {
         GXv_int14[12] = (byte)(1) ;
      }
      if ( ! (0==AV17Barcolnum1) )
      {
         addWhere(sWhereString, "(T2.HreColNum >= ?)");
      }
      else
      {
         GXv_int14[13] = (byte)(1) ;
      }
      if ( ! (0==AV18Barcolnum3) )
      {
         addWhere(sWhereString, "(T2.HreColNum <= ?)");
      }
      else
      {
         GXv_int14[14] = (byte)(1) ;
      }
      if ( ! (0==AV25Tipcolcod1) )
      {
         addWhere(sWhereString, "(T2.HreTipCol >= ?)");
      }
      else
      {
         GXv_int14[15] = (byte)(1) ;
      }
      if ( ! (0==AV26Tipcolcod3) )
      {
         addWhere(sWhereString, "(T2.HreTipCol <= ?)");
      }
      else
      {
         GXv_int14[16] = (byte)(1) ;
      }
      if ( ! (0==AV21Intcod1) )
      {
         addWhere(sWhereString, "(T2.HreIntCod >= ?)");
      }
      else
      {
         GXv_int14[17] = (byte)(1) ;
      }
      if ( ! (0==AV22Intcod3) )
      {
         addWhere(sWhereString, "(T2.HreIntCod <= ?)");
      }
      else
      {
         GXv_int14[18] = (byte)(1) ;
      }
      if ( ! (0==AV10barcod) )
      {
         addWhere(sWhereString, "(T1.HreBarCod = ?)");
      }
      else
      {
         GXv_int14[19] = (byte)(1) ;
      }
      if ( ! (0==AV11barcodreo) )
      {
         addWhere(sWhereString, "(T1.HreBarReo = ?)");
      }
      else
      {
         GXv_int14[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12barcodpar)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarPar = ?)");
      }
      else
      {
         GXv_int14[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object15[0] = scmdbuf ;
      GXv_Object15[1] = GXv_int14 ;
      return GXv_Object15 ;
   }

   protected Object[] conditional_P002O4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          java.util.Date AV7Fec1 ,
                                          java.util.Date AV8Fec2 ,
                                          int AV19Clicod1 ,
                                          int AV20Clicod3 ,
                                          String AV13ARtcod1 ,
                                          String AV14ARtcod3 ,
                                          short AV23TipArtCod1 ,
                                          short AV24TipArtCod3 ,
                                          String AV15Barcolnom1 ,
                                          String AV16Barcolnom3 ,
                                          int AV17Barcolnum1 ,
                                          int AV18Barcolnum3 ,
                                          byte AV25Tipcolcod1 ,
                                          byte AV26Tipcolcod3 ,
                                          byte AV21Intcod1 ,
                                          byte AV22Intcod3 ,
                                          int AV10barcod ,
                                          byte AV11barcodreo ,
                                          String AV12barcodpar ,
                                          java.util.Date A4529HreFecTin ,
                                          int A252CliCod ,
                                          String A4517HreBarSer ,
                                          short A4519HreTipArt ,
                                          String A4521HreColNom ,
                                          int A4522HreColNum ,
                                          byte A4525HreTipCol ,
                                          byte A4539HreIntCod ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          String A9808HreRacab ,
                                          String AV6HreRacab ,
                                          String AV5Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[22];
      Object[] GXv_Object17 = new Object[2];
      scmdbuf = "SELECT T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T2.HreIntCod, T2.HreTipCol, T2.HreColNum, T2.HreColNom, T2.HreTipArt, T2.HreBarSer, T2.CliCod, T2.HreRacab, T2.HreFecTin," ;
      scmdbuf += " T1.EmprCod, T1.HreAcPar, T1.HreAcReo, T1.HreAcCod, T1.HreAcKgm, T2.HreTotKgm, T1.HreAcCli, T1.HreAcSer, T1.HreAcDsc, T1.HreAcCol, T1.HreAcNumC, T2.HreIntDsc, T1.HreNumCie," ;
      scmdbuf += " T2.HreMaqHdr FROM (TXPHISHRA T1 INNER JOIN TXPHISREH T2 ON T2.EmprCod = T1.EmprCod AND T2.HreBarCod = T1.HreBarCod AND T2.HreBarReo = T1.HreBarReo AND T2.HreBarPar" ;
      scmdbuf += " = T1.HreBarPar AND T2.HreNumCie = T1.HreNumCie)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T2.HreRacab = ? or ? = 'T')");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV7Fec1)) )
      {
         addWhere(sWhereString, "(T2.HreFecTin >= ?)");
      }
      else
      {
         GXv_int16[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV8Fec2)) )
      {
         addWhere(sWhereString, "(T2.HreFecTin <= ?)");
      }
      else
      {
         GXv_int16[4] = (byte)(1) ;
      }
      if ( ! (0==AV19Clicod1) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
      }
      if ( ! (0==AV20Clicod3) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int16[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV13ARtcod1)==0) )
      {
         addWhere(sWhereString, "(T2.HreBarSer >= ?)");
      }
      else
      {
         GXv_int16[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV14ARtcod3)==0) )
      {
         addWhere(sWhereString, "(T2.HreBarSer <= ?)");
      }
      else
      {
         GXv_int16[8] = (byte)(1) ;
      }
      if ( ! (0==AV23TipArtCod1) )
      {
         addWhere(sWhereString, "(T2.HreTipArt >= ?)");
      }
      else
      {
         GXv_int16[9] = (byte)(1) ;
      }
      if ( ! (0==AV24TipArtCod3) )
      {
         addWhere(sWhereString, "(T2.HreTipArt <= ?)");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV15Barcolnom1)==0) )
      {
         addWhere(sWhereString, "(T2.HreColNom >= ?)");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV16Barcolnom3)==0) )
      {
         addWhere(sWhereString, "(T2.HreColNom <= ?)");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
      }
      if ( ! (0==AV17Barcolnum1) )
      {
         addWhere(sWhereString, "(T2.HreColNum >= ?)");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      if ( ! (0==AV18Barcolnum3) )
      {
         addWhere(sWhereString, "(T2.HreColNum <= ?)");
      }
      else
      {
         GXv_int16[14] = (byte)(1) ;
      }
      if ( ! (0==AV25Tipcolcod1) )
      {
         addWhere(sWhereString, "(T2.HreTipCol >= ?)");
      }
      else
      {
         GXv_int16[15] = (byte)(1) ;
      }
      if ( ! (0==AV26Tipcolcod3) )
      {
         addWhere(sWhereString, "(T2.HreTipCol <= ?)");
      }
      else
      {
         GXv_int16[16] = (byte)(1) ;
      }
      if ( ! (0==AV21Intcod1) )
      {
         addWhere(sWhereString, "(T2.HreIntCod >= ?)");
      }
      else
      {
         GXv_int16[17] = (byte)(1) ;
      }
      if ( ! (0==AV22Intcod3) )
      {
         addWhere(sWhereString, "(T2.HreIntCod <= ?)");
      }
      else
      {
         GXv_int16[18] = (byte)(1) ;
      }
      if ( ! (0==AV10barcod) )
      {
         addWhere(sWhereString, "(T1.HreBarCod = ?)");
      }
      else
      {
         GXv_int16[19] = (byte)(1) ;
      }
      if ( ! (0==AV11barcodreo) )
      {
         addWhere(sWhereString, "(T1.HreBarReo = ?)");
      }
      else
      {
         GXv_int16[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV12barcodpar)==0) )
      {
         addWhere(sWhereString, "(T1.HreBarPar = ?)");
      }
      else
      {
         GXv_int16[21] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
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
                  return conditional_P002O2(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
            case 1 :
                  return conditional_P002O3(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
            case 2 :
                  return conditional_P002O4(context, remoteHandle, httpContext, (java.util.Date)dynConstraints[0] , (java.util.Date)dynConstraints[1] , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).shortValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).byteValue() , ((Number) dynConstraints[13]).byteValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).byteValue() , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).shortValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , ((Number) dynConstraints[26]).byteValue() , ((Number) dynConstraints[27]).intValue() , ((Number) dynConstraints[28]).byteValue() , (String)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002O2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002O3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P002O4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 3);
               ((byte[]) buf[22])[0] = rslt.getByte(14);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(17, 30);
               ((String[]) buf[28])[0] = rslt.getString(18, 26);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(19, 30);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(20, 26);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(21, 30);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getString(22, 8);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getString(23, 20);
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((int[]) buf[40])[0] = rslt.getInt(24);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(25,2);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(26,2);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(27,2);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(28,2);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(29,2);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[52])[0] = rslt.getBigDecimal(30,2);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getString(31, 6);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((short[]) buf[56])[0] = rslt.getShort(32);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 3);
               ((String[]) buf[22])[0] = rslt.getString(14, 1);
               ((byte[]) buf[23])[0] = rslt.getByte(15);
               ((int[]) buf[24])[0] = rslt.getInt(16);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((int[]) buf[28])[0] = rslt.getInt(19);
               ((String[]) buf[29])[0] = rslt.getString(20, 16);
               ((String[]) buf[30])[0] = rslt.getString(21, 26);
               ((String[]) buf[31])[0] = rslt.getString(22, 13);
               ((int[]) buf[32])[0] = rslt.getInt(23);
               ((String[]) buf[33])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(25);
               ((String[]) buf[36])[0] = rslt.getString(26, 6);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 13);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((int[]) buf[15])[0] = rslt.getInt(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 3);
               ((String[]) buf[22])[0] = rslt.getString(14, 1);
               ((byte[]) buf[23])[0] = rslt.getByte(15);
               ((int[]) buf[24])[0] = rslt.getInt(16);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(17,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((int[]) buf[29])[0] = rslt.getInt(19);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(20, 16);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(21, 26);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(22, 13);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(23);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(24, 30);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((byte[]) buf[41])[0] = rslt.getByte(25);
               ((String[]) buf[42])[0] = rslt.getString(26, 6);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[25]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 1);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[25]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 1);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[25]);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[26]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 16);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 16);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 13);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 13);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[40]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 1);
               }
               return;
      }
   }

}

