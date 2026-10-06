package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class informeproductosconsumos extends GXProcedure
{
   public informeproductosconsumos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( informeproductosconsumos.class ), "" );
   }

   public informeproductosconsumos( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.util.Date[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             int[] aP8 ,
                             int[] aP9 ,
                             int[] aP10 ,
                             int[] aP11 ,
                             byte[] aP12 ,
                             byte[] aP13 ,
                             short[] aP14 ,
                             short[] aP15 ,
                             byte[] aP16 ,
                             byte[] aP17 ,
                             int[] aP18 ,
                             byte[] aP19 ,
                             String[] aP20 ,
                             byte[] aP21 ,
                             String[] aP22 )
   {
      informeproductosconsumos.this.aP23 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23);
      return aP23[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        java.util.Date[] aP2 ,
                        java.util.Date[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        int[] aP8 ,
                        int[] aP9 ,
                        int[] aP10 ,
                        int[] aP11 ,
                        byte[] aP12 ,
                        byte[] aP13 ,
                        short[] aP14 ,
                        short[] aP15 ,
                        byte[] aP16 ,
                        byte[] aP17 ,
                        int[] aP18 ,
                        byte[] aP19 ,
                        String[] aP20 ,
                        byte[] aP21 ,
                        String[] aP22 ,
                        String[] aP23 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             java.util.Date[] aP2 ,
                             java.util.Date[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             int[] aP8 ,
                             int[] aP9 ,
                             int[] aP10 ,
                             int[] aP11 ,
                             byte[] aP12 ,
                             byte[] aP13 ,
                             short[] aP14 ,
                             short[] aP15 ,
                             byte[] aP16 ,
                             byte[] aP17 ,
                             int[] aP18 ,
                             byte[] aP19 ,
                             String[] aP20 ,
                             byte[] aP21 ,
                             String[] aP22 ,
                             String[] aP23 )
   {
      informeproductosconsumos.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      informeproductosconsumos.this.AV40HreRacab = aP1[0];
      this.aP1 = aP1;
      informeproductosconsumos.this.AV32Fec1 = aP2[0];
      this.aP2 = aP2;
      informeproductosconsumos.this.AV33Fec2 = aP3[0];
      this.aP3 = aP3;
      informeproductosconsumos.this.AV13ARtcod1 = aP4[0];
      this.aP4 = aP4;
      informeproductosconsumos.this.AV15Artcod3 = aP5[0];
      this.aP5 = aP5;
      informeproductosconsumos.this.AV20Barcolnom1 = aP6[0];
      this.aP6 = aP6;
      informeproductosconsumos.this.AV22Barcolnom3 = aP7[0];
      this.aP7 = aP7;
      informeproductosconsumos.this.AV23Barcolnum1 = aP8[0];
      this.aP8 = aP8;
      informeproductosconsumos.this.AV25Barcolnum3 = aP9[0];
      this.aP9 = aP9;
      informeproductosconsumos.this.AV27Clicod1 = aP10[0];
      this.aP10 = aP10;
      informeproductosconsumos.this.AV29Clicod3 = aP11[0];
      this.aP11 = aP11;
      informeproductosconsumos.this.AV42Intcod1 = aP12[0];
      this.aP12 = aP12;
      informeproductosconsumos.this.AV44Intcod3 = aP13[0];
      this.aP13 = aP13;
      informeproductosconsumos.this.AV66TipArtCod1 = aP14[0];
      this.aP14 = aP14;
      informeproductosconsumos.this.AV68Tipartcod3 = aP15[0];
      this.aP15 = aP15;
      informeproductosconsumos.this.AV69Tipcolcod1 = aP16[0];
      this.aP16 = aP16;
      informeproductosconsumos.this.AV71Tipcolcod3 = aP17[0];
      this.aP17 = aP17;
      informeproductosconsumos.this.AV17barcod = aP18[0];
      this.aP18 = aP18;
      informeproductosconsumos.this.AV19barcodreo = aP19[0];
      this.aP19 = aP19;
      informeproductosconsumos.this.AV18barcodpar = aP20[0];
      this.aP20 = aP20;
      informeproductosconsumos.this.AV31ConsManuales = aP21[0];
      this.aP21 = aP21;
      informeproductosconsumos.this.aP22 = aP22;
      informeproductosconsumos.this.aP23 = aP23;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV62Tab_pc[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV59Tab_cc[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV64Tab_vc[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV63Tab_pp[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV61Tab_cp[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV65Tab_vp[GX_I-1] = DecimalUtil.doubleToDec(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      AV45j = (short)(0) ;
      AV41i = (short)(0) ;
      AV75z = (short)(1) ;
      AV58t = (short)(1) ;
      AV46l = 1 ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV60Tab_clave[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      /* Using cursor P08YE2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV32Fec1, AV40HreRacab, AV40HreRacab, Integer.valueOf(AV27Clicod1), Integer.valueOf(AV29Clicod3), AV13ARtcod1, AV15Artcod3, Short.valueOf(AV66TipArtCod1), Short.valueOf(AV68Tipartcod3), AV20Barcolnom1, AV22Barcolnom3, Integer.valueOf(AV23Barcolnum1), Integer.valueOf(AV25Barcolnum3), Byte.valueOf(AV69Tipcolcod1), Byte.valueOf(AV71Tipcolcod3), Byte.valueOf(AV42Intcod1), Byte.valueOf(AV44Intcod3), Integer.valueOf(AV17barcod), Integer.valueOf(AV17barcod), Byte.valueOf(AV19barcodreo), Byte.valueOf(AV19barcodreo), AV18barcodpar, AV18barcodpar, AV33Fec2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4494HreBarPar = P08YE2_A4494HreBarPar[0] ;
         A4493HreBarReo = P08YE2_A4493HreBarReo[0] ;
         A4492HreBarCod = P08YE2_A4492HreBarCod[0] ;
         A719PrdNum = P08YE2_A719PrdNum[0] ;
         n719PrdNum = P08YE2_n719PrdNum[0] ;
         A4539HreIntCod = P08YE2_A4539HreIntCod[0] ;
         n4539HreIntCod = P08YE2_n4539HreIntCod[0] ;
         A4525HreTipCol = P08YE2_A4525HreTipCol[0] ;
         n4525HreTipCol = P08YE2_n4525HreTipCol[0] ;
         A4522HreColNum = P08YE2_A4522HreColNum[0] ;
         n4522HreColNum = P08YE2_n4522HreColNum[0] ;
         A4521HreColNom = P08YE2_A4521HreColNom[0] ;
         n4521HreColNom = P08YE2_n4521HreColNom[0] ;
         A4519HreTipArt = P08YE2_A4519HreTipArt[0] ;
         n4519HreTipArt = P08YE2_n4519HreTipArt[0] ;
         A4517HreBarSer = P08YE2_A4517HreBarSer[0] ;
         n4517HreBarSer = P08YE2_n4517HreBarSer[0] ;
         A252CliCod = P08YE2_A252CliCod[0] ;
         n252CliCod = P08YE2_n252CliCod[0] ;
         A9808HreRacab = P08YE2_A9808HreRacab[0] ;
         n9808HreRacab = P08YE2_n9808HreRacab[0] ;
         A12453HreFecAct = P08YE2_A12453HreFecAct[0] ;
         n12453HreFecAct = P08YE2_n12453HreFecAct[0] ;
         A4565HreCanAny = P08YE2_A4565HreCanAny[0] ;
         n4565HreCanAny = P08YE2_n4565HreCanAny[0] ;
         A4563HrePrdCant = P08YE2_A4563HrePrdCant[0] ;
         n4563HrePrdCant = P08YE2_n4563HrePrdCant[0] ;
         A4967HrePrePrd = P08YE2_A4967HrePrePrd[0] ;
         n4967HrePrePrd = P08YE2_n4967HrePrePrd[0] ;
         A707PrdFacCon = P08YE2_A707PrdFacCon[0] ;
         A718PrdNom = P08YE2_A718PrdNom[0] ;
         A4557HreRecLin = P08YE2_A4557HreRecLin[0] ;
         A4550HreLinPro = P08YE2_A4550HreLinPro[0] ;
         A4545HreLinMaq = P08YE2_A4545HreLinMaq[0] ;
         A4495HreNumCie = P08YE2_A4495HreNumCie[0] ;
         A707PrdFacCon = P08YE2_A707PrdFacCon[0] ;
         A718PrdNom = P08YE2_A718PrdNom[0] ;
         A4539HreIntCod = P08YE2_A4539HreIntCod[0] ;
         n4539HreIntCod = P08YE2_n4539HreIntCod[0] ;
         A4525HreTipCol = P08YE2_A4525HreTipCol[0] ;
         n4525HreTipCol = P08YE2_n4525HreTipCol[0] ;
         A4522HreColNum = P08YE2_A4522HreColNum[0] ;
         n4522HreColNum = P08YE2_n4522HreColNum[0] ;
         A4521HreColNom = P08YE2_A4521HreColNom[0] ;
         n4521HreColNom = P08YE2_n4521HreColNom[0] ;
         A4519HreTipArt = P08YE2_A4519HreTipArt[0] ;
         n4519HreTipArt = P08YE2_n4519HreTipArt[0] ;
         A4517HreBarSer = P08YE2_A4517HreBarSer[0] ;
         n4517HreBarSer = P08YE2_n4517HreBarSer[0] ;
         A252CliCod = P08YE2_A252CliCod[0] ;
         n252CliCod = P08YE2_n252CliCod[0] ;
         A9808HreRacab = P08YE2_A9808HreRacab[0] ;
         n9808HreRacab = P08YE2_n9808HreRacab[0] ;
         AV51Ok_p = (byte)(0) ;
         if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "7") <= 0 ) )
         {
            AV41i = (short)(1) ;
            while ( AV41i <= 1000 )
            {
               if ( GXutil.strcmp(A719PrdNum, AV62Tab_pc[AV41i-1]) == 0 )
               {
                  AV59Tab_cc[AV41i-1] = AV59Tab_cc[AV41i-1].add(((A4563HrePrdCant.add(A4565HreCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))) ;
                  AV64Tab_vc[AV41i-1] = AV64Tab_vc[AV41i-1].add(((A4563HrePrdCant.add(A4565HreCanAny)).multiply(A707PrdFacCon).multiply(A4967HrePrePrd).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))) ;
                  AV51Ok_p = (byte)(1) ;
                  AV41i = (short)(1000) ;
                  if (true) break;
               }
               AV41i = (short)(AV41i+1) ;
            }
            if ( AV51Ok_p == 0 )
            {
               AV62Tab_pc[AV75z-1] = A719PrdNum ;
               AV59Tab_cc[AV75z-1] = (A4563HrePrdCant.add(A4565HreCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
               AV64Tab_vc[AV75z-1] = (A4563HrePrdCant.add(A4565HreCanAny)).multiply(A707PrdFacCon).multiply(A4967HrePrePrd).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
               AV75z = (short)(AV75z+1) ;
            }
         }
         if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "8") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "9") <= 0 ) )
         {
            AV45j = (short)(1) ;
            while ( AV45j <= 1000 )
            {
               if ( GXutil.strcmp(A719PrdNum, AV63Tab_pp[AV45j-1]) == 0 )
               {
                  AV61Tab_cp[AV45j-1] = AV61Tab_cp[AV45j-1].add(((A4563HrePrdCant.add(A4565HreCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))) ;
                  AV65Tab_vp[AV45j-1] = AV65Tab_vp[AV45j-1].add(((A4563HrePrdCant.add(A4565HreCanAny)).multiply(A707PrdFacCon).multiply(A4967HrePrePrd).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))) ;
                  AV51Ok_p = (byte)(1) ;
                  AV45j = (short)(1000) ;
                  if (true) break;
               }
               AV45j = (short)(AV45j+1) ;
            }
            if ( AV51Ok_p == 0 )
            {
               AV63Tab_pp[AV58t-1] = A719PrdNum ;
               AV61Tab_cp[AV58t-1] = (A4563HrePrdCant.add(A4565HreCanAny)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
               AV65Tab_vp[AV58t-1] = (A4563HrePrdCant.add(A4565HreCanAny)).multiply(A707PrdFacCon).multiply(A4967HrePrePrd).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
               AV58t = (short)(AV58t+1) ;
            }
         }
         AV39HreNumCie = A4495HreNumCie ;
         AV38HreLinMaq = A4545HreLinMaq ;
         AV35HreBarCod = A4492HreBarCod ;
         AV37HreBarReo = A4493HreBarReo ;
         AV36HreBarPar = A4494HreBarPar ;
         /* Execute user subroutine: 'ANYADIDAS' */
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
         Gx_msg = httpContext.getMessage( "Procesando... ", "") + GXutil.trim( A718PrdNom) ;
         System.out.println( Gx_msg );
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV52p = (short)(1) ;
      while ( AV52p <= 10000 )
      {
         if ( GXutil.strcmp(AV60Tab_clave[AV52p-1], " ") == 0 )
         {
            if (true) break;
         }
         AV35HreBarCod = (int)(GXutil.lval( GXutil.substring( AV60Tab_clave[AV52p-1], 1, 8))) ;
         AV37HreBarReo = (byte)(GXutil.lval( GXutil.substring( AV60Tab_clave[AV52p-1], 9, 1))) ;
         AV36HreBarPar = GXutil.substring( AV60Tab_clave[AV52p-1], 10, 1) ;
         AV39HreNumCie = (byte)(GXutil.lval( GXutil.substring( AV60Tab_clave[AV52p-1], 11, 2))) ;
         AV38HreLinMaq = (short)(GXutil.lval( GXutil.substring( AV60Tab_clave[AV52p-1], 13, 4))) ;
         /* Using cursor P08YE3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV35HreBarCod), Byte.valueOf(AV37HreBarReo), AV36HreBarPar, Byte.valueOf(AV39HreNumCie), Short.valueOf(AV38HreLinMaq)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A4508HreLinMAL = P08YE3_A4508HreLinMAL[0] ;
            A4495HreNumCie = P08YE3_A4495HreNumCie[0] ;
            A4494HreBarPar = P08YE3_A4494HreBarPar[0] ;
            A4493HreBarReo = P08YE3_A4493HreBarReo[0] ;
            A4492HreBarCod = P08YE3_A4492HreBarCod[0] ;
            A719PrdNum = P08YE3_A719PrdNum[0] ;
            n719PrdNum = P08YE3_n719PrdNum[0] ;
            A4511HrePrdCFin = P08YE3_A4511HrePrdCFin[0] ;
            n4511HrePrdCFin = P08YE3_n4511HrePrdCFin[0] ;
            A707PrdFacCon = P08YE3_A707PrdFacCon[0] ;
            A4509HreNumAny = P08YE3_A4509HreNumAny[0] ;
            A707PrdFacCon = P08YE3_A707PrdFacCon[0] ;
            GXv_char1[0] = A396EmprCod ;
            GXv_int2[0] = A4492HreBarCod ;
            GXv_int3[0] = A4493HreBarReo ;
            GXv_char4[0] = A4494HreBarPar ;
            GXv_int5[0] = A4495HreNumCie ;
            GXv_int6[0] = A4508HreLinMAL ;
            GXv_char7[0] = A719PrdNum ;
            GXv_decimal8[0] = AV56PrdPreAct ;
            new app.pprc246(remoteHandle, context).execute( GXv_char1, GXv_int2, GXv_int3, GXv_char4, GXv_int5, GXv_int6, GXv_char7, GXv_decimal8) ;
            informeproductosconsumos.this.A396EmprCod = GXv_char1[0] ;
            informeproductosconsumos.this.A4492HreBarCod = GXv_int2[0] ;
            informeproductosconsumos.this.A4493HreBarReo = GXv_int3[0] ;
            informeproductosconsumos.this.A4494HreBarPar = GXv_char4[0] ;
            informeproductosconsumos.this.A4495HreNumCie = GXv_int5[0] ;
            informeproductosconsumos.this.A4508HreLinMAL = GXv_int6[0] ;
            informeproductosconsumos.this.A719PrdNum = GXv_char7[0] ;
            informeproductosconsumos.this.AV56PrdPreAct = GXv_decimal8[0] ;
            AV51Ok_p = (byte)(0) ;
            if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "7") <= 0 ) )
            {
               AV41i = (short)(1) ;
               while ( AV41i <= 1000 )
               {
                  if ( GXutil.strcmp(A719PrdNum, AV62Tab_pc[AV41i-1]) == 0 )
                  {
                     AV59Tab_cc[AV41i-1] = AV59Tab_cc[AV41i-1].add(((A4511HrePrdCFin).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))) ;
                     AV64Tab_vc[AV41i-1] = AV64Tab_vc[AV41i-1].add(((A4511HrePrdCFin).multiply(A707PrdFacCon).multiply(AV56PrdPreAct).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))) ;
                     AV51Ok_p = (byte)(1) ;
                     AV41i = (short)(1000) ;
                     if (true) break;
                  }
                  AV41i = (short)(AV41i+1) ;
               }
               if ( AV51Ok_p == 0 )
               {
                  AV62Tab_pc[AV75z-1] = A719PrdNum ;
                  AV59Tab_cc[AV75z-1] = (A4511HrePrdCFin).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
                  AV64Tab_vc[AV75z-1] = (A4511HrePrdCFin).multiply(A707PrdFacCon).multiply(AV56PrdPreAct).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
                  AV75z = (short)(AV75z+1) ;
               }
            }
            if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "8") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "9") <= 0 ) )
            {
               AV45j = (short)(1) ;
               while ( AV45j <= 1000 )
               {
                  if ( GXutil.strcmp(A719PrdNum, AV63Tab_pp[AV45j-1]) == 0 )
                  {
                     AV61Tab_cp[AV45j-1] = AV61Tab_cp[AV45j-1].add(((A4511HrePrdCFin).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))) ;
                     AV65Tab_vp[AV45j-1] = AV65Tab_vp[AV45j-1].add(((A4511HrePrdCFin).multiply(A707PrdFacCon).multiply(AV56PrdPreAct).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN))) ;
                     AV51Ok_p = (byte)(1) ;
                     AV45j = (short)(1000) ;
                     if (true) break;
                  }
                  AV45j = (short)(AV45j+1) ;
               }
               if ( AV51Ok_p == 0 )
               {
                  AV63Tab_pp[AV58t-1] = A719PrdNum ;
                  AV61Tab_cp[AV58t-1] = (A4511HrePrdCFin).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
                  AV65Tab_vp[AV58t-1] = (A4511HrePrdCFin).multiply(A707PrdFacCon).multiply(AV56PrdPreAct).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
                  AV58t = (short)(AV58t+1) ;
               }
            }
            pr_default.readNext(1);
         }
         pr_default.close(1);
         AV52p = (short)(AV52p+1) ;
      }
      if ( AV31ConsManuales == 1 )
      {
         /* Using cursor P08YE4 */
         pr_default.execute(2, new Object[] {A396EmprCod, AV32Fec1, AV33Fec2});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A859CumCodCont = P08YE4_A859CumCodCont[0] ;
            A719PrdNum = P08YE4_A719PrdNum[0] ;
            n719PrdNum = P08YE4_n719PrdNum[0] ;
            A862CumConFec = P08YE4_A862CumConFec[0] ;
            A861CumConCbis = P08YE4_A861CumConCbis[0] ;
            A8639CumUnidad = P08YE4_A8639CumUnidad[0] ;
            A724PrdPreAct = P08YE4_A724PrdPreAct[0] ;
            A724PrdPreAct = P08YE4_A724PrdPreAct[0] ;
            A862CumConFec = P08YE4_A862CumConFec[0] ;
            AV51Ok_p = (byte)(0) ;
            if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "1") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "7") <= 0 ) )
            {
               AV41i = (short)(1) ;
               while ( AV41i <= 1000 )
               {
                  if ( GXutil.strcmp(A719PrdNum, AV62Tab_pc[AV41i-1]) == 0 )
                  {
                     AV59Tab_cc[AV41i-1] = AV59Tab_cc[AV41i-1].add((((A8639CumUnidad==1) ? A861CumConCbis : A861CumConCbis.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)))) ;
                     AV64Tab_vc[AV41i-1] = AV64Tab_vc[AV41i-1].add((((A8639CumUnidad==1) ? A861CumConCbis.multiply(A724PrdPreAct) : (A861CumConCbis.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A724PrdPreAct)))) ;
                     AV51Ok_p = (byte)(1) ;
                     AV41i = (short)(1000) ;
                     if (true) break;
                  }
                  AV41i = (short)(AV41i+1) ;
               }
               if ( AV51Ok_p == 0 )
               {
                  AV62Tab_pc[AV75z-1] = A719PrdNum ;
                  AV59Tab_cc[AV75z-1] = ((A8639CumUnidad==1) ? A861CumConCbis : A861CumConCbis.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
                  AV64Tab_vc[AV75z-1] = ((A8639CumUnidad==1) ? A861CumConCbis.multiply(A724PrdPreAct) : (A861CumConCbis.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A724PrdPreAct)) ;
                  AV75z = (short)(AV75z+1) ;
               }
            }
            if ( ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "8") >= 0 ) && ( GXutil.strcmp(GXutil.substring( A719PrdNum, 1, 1), "9") <= 0 ) )
            {
               AV45j = (short)(1) ;
               while ( AV45j <= 1000 )
               {
                  if ( GXutil.strcmp(A719PrdNum, AV63Tab_pp[AV45j-1]) == 0 )
                  {
                     AV61Tab_cp[AV45j-1] = AV61Tab_cp[AV45j-1].add((((A8639CumUnidad==1) ? A861CumConCbis : A861CumConCbis.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)))) ;
                     AV65Tab_vp[AV45j-1] = AV65Tab_vp[AV45j-1].add((((A8639CumUnidad==1) ? A861CumConCbis.multiply(A724PrdPreAct) : (A861CumConCbis.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A724PrdPreAct)))) ;
                     AV51Ok_p = (byte)(1) ;
                     AV45j = (short)(1000) ;
                     if (true) break;
                  }
                  AV45j = (short)(AV45j+1) ;
               }
               if ( AV51Ok_p == 0 )
               {
                  AV63Tab_pp[AV58t-1] = A719PrdNum ;
                  AV61Tab_cp[AV58t-1] = ((A8639CumUnidad==1) ? A861CumConCbis : A861CumConCbis.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)) ;
                  AV65Tab_vp[AV58t-1] = ((A8639CumUnidad==1) ? A861CumConCbis.multiply(A724PrdPreAct) : (A861CumConCbis.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN)).multiply(A724PrdPreAct)) ;
                  AV58t = (short)(AV58t+1) ;
               }
            }
            pr_default.readNext(2);
         }
         pr_default.close(2);
      }
      /* Execute user subroutine: 'OPENDOCUMENT' */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITECOLUMNTITLES' */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'WRITEDATA' */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: 'CLOSEDOCUMENT' */
      S161 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'ANYADIDAS' Routine */
      returnInSub = false ;
      AV52p = (short)(1) ;
      AV12Alta = (byte)(0) ;
      while ( AV52p <= 10000 )
      {
         if ( GXutil.strcmp(AV60Tab_clave[AV52p-1], " ") == 0 )
         {
            AV12Alta = (byte)(1) ;
            if (true) break;
         }
         if ( GXutil.strcmp(AV60Tab_clave[AV52p-1], GXutil.str( AV35HreBarCod, 8, 0)+GXutil.str( AV37HreBarReo, 1, 0)+GXutil.str( AV39HreNumCie, 2, 0)+GXutil.str( AV38HreLinMaq, 4, 0)) == 0 )
         {
            if (true) break;
         }
         AV52p = (short)(AV52p+1) ;
      }
      if ( AV12Alta == 1 )
      {
         if ( AV46l > 10000 )
         {
            Gx_msg = httpContext.getMessage( "Atencion.La tabla esta definida para 10000 Hdrs.", "") + GXutil.newLine( ) ;
            Gx_msg += httpContext.getMessage( "Se ha superado el tamaño, ", "") + GXutil.str( AV46l, 5, 0) + GXutil.newLine( ) ;
            Gx_msg += httpContext.getMessage( "Para aumentar el tamaño, consultar a Soporte", "") ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            AV60Tab_clave[AV46l-1] = GXutil.str( AV35HreBarCod, 8, 0) + GXutil.str( AV37HreBarReo, 1, 0) + GXutil.str( AV39HreNumCie, 2, 0) + GXutil.str( AV38HreLinMaq, 4, 0) ;
         }
         AV46l = (int)(AV46l+1) ;
      }
   }

   public void S121( )
   {
      /* 'WRITECOLUMNTITLES' Routine */
      returnInSub = false ;
      AV30Col = 1 ;
      AV57Row = 1 ;
      while ( AV30Col <= 6 )
      {
         AV10ExcelDocument.Cells((int)(AV57Row), (int)(AV30Col), 1, 1).setBold( (short)(1) );
         AV10ExcelDocument.Cells((int)(AV57Row), (int)(AV30Col), 1, 1).setColor( 11 );
         AV30Col = (long)(AV30Col+1) ;
      }
      AV10ExcelDocument.Cells(1, 1, 1, 1).setText( httpContext.getMessage( "Producto", "") );
      AV10ExcelDocument.Cells(1, 2, 1, 1).setText( httpContext.getMessage( "Nombre", "") );
      AV10ExcelDocument.Cells(1, 3, 1, 1).setText( httpContext.getMessage( "Familia", "") );
      AV10ExcelDocument.Cells(1, 4, 1, 1).setText( httpContext.getMessage( "Cantidad", "") );
      AV10ExcelDocument.Cells(1, 5, 1, 1).setText( httpContext.getMessage( "Valor", "") );
      AV10ExcelDocument.Cells(1, 6, 1, 1).setText( ((AV31ConsManuales==1) ? httpContext.getMessage( "Incluye Consumos Manuales", "") : " ") );
   }

   public void S131( )
   {
      /* 'WRITEDATA' Routine */
      returnInSub = false ;
      AV57Row = 2 ;
      AV72Valor = DecimalUtil.doubleToDec(0) ;
      AV73Valort = DecimalUtil.doubleToDec(0) ;
      AV41i = (short)(1) ;
      while ( AV41i <= 1000 )
      {
         if ( GXutil.strcmp(AV62Tab_pc[AV41i-1], " ") == 0 )
         {
            AV41i = (short)(1001) ;
            if (true) break;
         }
         AV54PrdNum = AV62Tab_pc[AV41i-1] ;
         AV53PrdNom = " " ;
         /* Using cursor P08YE5 */
         pr_default.execute(3, new Object[] {A396EmprCod, AV54PrdNum});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A6301TipPrdCod = P08YE5_A6301TipPrdCod[0] ;
            n6301TipPrdCod = P08YE5_n6301TipPrdCod[0] ;
            A719PrdNum = P08YE5_A719PrdNum[0] ;
            n719PrdNum = P08YE5_n719PrdNum[0] ;
            A718PrdNom = P08YE5_A718PrdNom[0] ;
            A6302TipPrdDsc = P08YE5_A6302TipPrdDsc[0] ;
            n6302TipPrdDsc = P08YE5_n6302TipPrdDsc[0] ;
            A6302TipPrdDsc = P08YE5_A6302TipPrdDsc[0] ;
            n6302TipPrdDsc = P08YE5_n6302TipPrdDsc[0] ;
            AV53PrdNom = A718PrdNom ;
            AV76TipPrdDsc = A6302TipPrdDsc ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         AV26CCStkCanS = AV59Tab_cc[AV41i-1] ;
         AV72Valor = AV64Tab_vc[AV41i-1] ;
         AV10ExcelDocument.Cells((int)(AV57Row), 1, 1, 1).setText( AV54PrdNum );
         AV10ExcelDocument.Cells((int)(AV57Row), 1, 1, 1).setText( AV54PrdNum );
         AV10ExcelDocument.Cells((int)(AV57Row), 2, 1, 1).setText( AV53PrdNom );
         AV10ExcelDocument.Cells((int)(AV57Row), 3, 1, 1).setText( AV76TipPrdDsc );
         AV10ExcelDocument.Cells((int)(AV57Row), 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV26CCStkCanS)) );
         AV10ExcelDocument.Cells((int)(AV57Row), 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV72Valor)) );
         AV57Row = (long)(AV57Row+1) ;
         AV73Valort = AV73Valort.add(AV72Valor) ;
         AV41i = (short)(AV41i+1) ;
      }
      AV57Row = (long)(AV57Row+2) ;
      AV10ExcelDocument.Cells((int)(AV57Row), 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV73Valort)) );
      if ( GXutil.strcmp(AV63Tab_pp[1-1], " ") != 0 )
      {
         AV73Valort = DecimalUtil.doubleToDec(0) ;
         AV57Row = (long)(AV57Row+2) ;
         AV41i = (short)(1) ;
         while ( AV41i <= 1000 )
         {
            if ( GXutil.strcmp(AV63Tab_pp[AV41i-1], " ") == 0 )
            {
               AV41i = (short)(1001) ;
               if (true) break;
            }
            AV54PrdNum = AV63Tab_pp[AV41i-1] ;
            AV53PrdNom = " " ;
            /* Using cursor P08YE6 */
            pr_default.execute(4, new Object[] {A396EmprCod, AV54PrdNum});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A6301TipPrdCod = P08YE6_A6301TipPrdCod[0] ;
               n6301TipPrdCod = P08YE6_n6301TipPrdCod[0] ;
               A719PrdNum = P08YE6_A719PrdNum[0] ;
               n719PrdNum = P08YE6_n719PrdNum[0] ;
               A718PrdNom = P08YE6_A718PrdNom[0] ;
               A6302TipPrdDsc = P08YE6_A6302TipPrdDsc[0] ;
               n6302TipPrdDsc = P08YE6_n6302TipPrdDsc[0] ;
               A6302TipPrdDsc = P08YE6_A6302TipPrdDsc[0] ;
               n6302TipPrdDsc = P08YE6_n6302TipPrdDsc[0] ;
               AV53PrdNom = A718PrdNom ;
               AV76TipPrdDsc = A6302TipPrdDsc ;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(4);
            AV26CCStkCanS = AV61Tab_cp[AV41i-1] ;
            AV72Valor = AV65Tab_vp[AV41i-1] ;
            AV10ExcelDocument.Cells((int)(AV57Row), 1, 1, 1).setText( AV54PrdNum );
            AV10ExcelDocument.Cells((int)(AV57Row), 2, 1, 1).setText( AV53PrdNom );
            AV10ExcelDocument.Cells((int)(AV57Row), 3, 1, 1).setText( AV76TipPrdDsc );
            AV10ExcelDocument.Cells((int)(AV57Row), 4, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV26CCStkCanS)) );
            AV10ExcelDocument.Cells((int)(AV57Row), 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV72Valor)) );
            AV57Row = (long)(AV57Row+1) ;
            AV73Valort = AV73Valort.add(AV72Valor) ;
            AV41i = (short)(AV41i+1) ;
         }
         AV57Row = (long)(AV57Row+2) ;
         AV10ExcelDocument.Cells((int)(AV57Row), 5, 1, 1).setNumber( (double)(DecimalUtil.decToDouble(AV73Valort)) );
      }
   }

   public void S141( )
   {
      /* 'OPENDOCUMENT' Routine */
      returnInSub = false ;
      AV8Random = (int)(GXutil.random( )*10000) ;
      AV9Filename = "InformeProductosConsumosExport-" + GXutil.trim( GXutil.str( AV8Random, 8, 0)) + ".xlsx" ;
      AV10ExcelDocument.Open(AV9Filename);
      /* Execute user subroutine: 'CHECKSTATUS' */
      S151 ();
      if (returnInSub) return;
      AV10ExcelDocument.Clear();
   }

   public void S161( )
   {
      /* 'CLOSEDOCUMENT' Routine */
      returnInSub = false ;
      AV10ExcelDocument.Save();
      /* Execute user subroutine: 'CHECKSTATUS' */
      S151 ();
      if (returnInSub) return;
      AV10ExcelDocument.Close();
   }

   public void S151( )
   {
      /* 'CHECKSTATUS' Routine */
      returnInSub = false ;
      if ( AV10ExcelDocument.getErrCode() != 0 )
      {
         AV9Filename = "" ;
         AV11ErrorMessage = AV10ExcelDocument.getErrDescription() ;
         AV10ExcelDocument.Close();
         returnInSub = true;
         if (true) return;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = informeproductosconsumos.this.A396EmprCod;
      this.aP1[0] = informeproductosconsumos.this.AV40HreRacab;
      this.aP2[0] = informeproductosconsumos.this.AV32Fec1;
      this.aP3[0] = informeproductosconsumos.this.AV33Fec2;
      this.aP4[0] = informeproductosconsumos.this.AV13ARtcod1;
      this.aP5[0] = informeproductosconsumos.this.AV15Artcod3;
      this.aP6[0] = informeproductosconsumos.this.AV20Barcolnom1;
      this.aP7[0] = informeproductosconsumos.this.AV22Barcolnom3;
      this.aP8[0] = informeproductosconsumos.this.AV23Barcolnum1;
      this.aP9[0] = informeproductosconsumos.this.AV25Barcolnum3;
      this.aP10[0] = informeproductosconsumos.this.AV27Clicod1;
      this.aP11[0] = informeproductosconsumos.this.AV29Clicod3;
      this.aP12[0] = informeproductosconsumos.this.AV42Intcod1;
      this.aP13[0] = informeproductosconsumos.this.AV44Intcod3;
      this.aP14[0] = informeproductosconsumos.this.AV66TipArtCod1;
      this.aP15[0] = informeproductosconsumos.this.AV68Tipartcod3;
      this.aP16[0] = informeproductosconsumos.this.AV69Tipcolcod1;
      this.aP17[0] = informeproductosconsumos.this.AV71Tipcolcod3;
      this.aP18[0] = informeproductosconsumos.this.AV17barcod;
      this.aP19[0] = informeproductosconsumos.this.AV19barcodreo;
      this.aP20[0] = informeproductosconsumos.this.AV18barcodpar;
      this.aP21[0] = informeproductosconsumos.this.AV31ConsManuales;
      this.aP22[0] = informeproductosconsumos.this.AV9Filename;
      this.aP23[0] = informeproductosconsumos.this.AV11ErrorMessage;
      CloseOpenCursors();
      AV10ExcelDocument.cleanup();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Filename = "" ;
      AV11ErrorMessage = "" ;
      AV62Tab_pc = new String[1000] ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV62Tab_pc[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV59Tab_cc = new java.math.BigDecimal[1000] ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV59Tab_cc[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV64Tab_vc = new java.math.BigDecimal[1000] ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV64Tab_vc[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV63Tab_pp = new String[1000] ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV63Tab_pp[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV61Tab_cp = new java.math.BigDecimal[1000] ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV61Tab_cp[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV65Tab_vp = new java.math.BigDecimal[1000] ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV65Tab_vp[GX_I-1] = DecimalUtil.ZERO ;
         GX_I = (int)(GX_I+1) ;
      }
      AV60Tab_clave = new String[10000] ;
      GX_I = 1 ;
      while ( GX_I <= 10000 )
      {
         AV60Tab_clave[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      scmdbuf = "" ;
      P08YE2_A396EmprCod = new String[] {""} ;
      P08YE2_A4494HreBarPar = new String[] {""} ;
      P08YE2_A4493HreBarReo = new byte[1] ;
      P08YE2_A4492HreBarCod = new int[1] ;
      P08YE2_A719PrdNum = new String[] {""} ;
      P08YE2_n719PrdNum = new boolean[] {false} ;
      P08YE2_A4539HreIntCod = new byte[1] ;
      P08YE2_n4539HreIntCod = new boolean[] {false} ;
      P08YE2_A4525HreTipCol = new byte[1] ;
      P08YE2_n4525HreTipCol = new boolean[] {false} ;
      P08YE2_A4522HreColNum = new int[1] ;
      P08YE2_n4522HreColNum = new boolean[] {false} ;
      P08YE2_A4521HreColNom = new String[] {""} ;
      P08YE2_n4521HreColNom = new boolean[] {false} ;
      P08YE2_A4519HreTipArt = new short[1] ;
      P08YE2_n4519HreTipArt = new boolean[] {false} ;
      P08YE2_A4517HreBarSer = new String[] {""} ;
      P08YE2_n4517HreBarSer = new boolean[] {false} ;
      P08YE2_A252CliCod = new int[1] ;
      P08YE2_n252CliCod = new boolean[] {false} ;
      P08YE2_A9808HreRacab = new String[] {""} ;
      P08YE2_n9808HreRacab = new boolean[] {false} ;
      P08YE2_A12453HreFecAct = new java.util.Date[] {GXutil.nullDate()} ;
      P08YE2_n12453HreFecAct = new boolean[] {false} ;
      P08YE2_A4565HreCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YE2_n4565HreCanAny = new boolean[] {false} ;
      P08YE2_A4563HrePrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YE2_n4563HrePrdCant = new boolean[] {false} ;
      P08YE2_A4967HrePrePrd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YE2_n4967HrePrePrd = new boolean[] {false} ;
      P08YE2_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YE2_A718PrdNom = new String[] {""} ;
      P08YE2_A4557HreRecLin = new short[1] ;
      P08YE2_A4550HreLinPro = new byte[1] ;
      P08YE2_A4545HreLinMaq = new short[1] ;
      P08YE2_A4495HreNumCie = new byte[1] ;
      A4494HreBarPar = "" ;
      A719PrdNum = "" ;
      A4521HreColNom = "" ;
      A4517HreBarSer = "" ;
      A9808HreRacab = "" ;
      A12453HreFecAct = GXutil.nullDate() ;
      A4565HreCanAny = DecimalUtil.ZERO ;
      A4563HrePrdCant = DecimalUtil.ZERO ;
      A4967HrePrePrd = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A718PrdNom = "" ;
      AV36HreBarPar = "" ;
      Gx_msg = "" ;
      P08YE3_A396EmprCod = new String[] {""} ;
      P08YE3_A4508HreLinMAL = new short[1] ;
      P08YE3_A4495HreNumCie = new byte[1] ;
      P08YE3_A4494HreBarPar = new String[] {""} ;
      P08YE3_A4493HreBarReo = new byte[1] ;
      P08YE3_A4492HreBarCod = new int[1] ;
      P08YE3_A719PrdNum = new String[] {""} ;
      P08YE3_n719PrdNum = new boolean[] {false} ;
      P08YE3_A4511HrePrdCFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YE3_n4511HrePrdCFin = new boolean[] {false} ;
      P08YE3_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YE3_A4509HreNumAny = new byte[1] ;
      A4511HrePrdCFin = DecimalUtil.ZERO ;
      GXv_char1 = new String[1] ;
      GXv_int2 = new int[1] ;
      GXv_int3 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new byte[1] ;
      GXv_int6 = new short[1] ;
      GXv_char7 = new String[1] ;
      AV56PrdPreAct = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      P08YE4_A859CumCodCont = new int[1] ;
      P08YE4_A396EmprCod = new String[] {""} ;
      P08YE4_A719PrdNum = new String[] {""} ;
      P08YE4_n719PrdNum = new boolean[] {false} ;
      P08YE4_A862CumConFec = new java.util.Date[] {GXutil.nullDate()} ;
      P08YE4_A861CumConCbis = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P08YE4_A8639CumUnidad = new byte[1] ;
      P08YE4_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A862CumConFec = GXutil.nullDate() ;
      A861CumConCbis = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      AV10ExcelDocument = new com.genexus.gxoffice.ExcelDoc();
      AV72Valor = DecimalUtil.ZERO ;
      AV73Valort = DecimalUtil.ZERO ;
      AV54PrdNum = "" ;
      AV53PrdNom = "" ;
      P08YE5_A6301TipPrdCod = new short[1] ;
      P08YE5_n6301TipPrdCod = new boolean[] {false} ;
      P08YE5_A396EmprCod = new String[] {""} ;
      P08YE5_A719PrdNum = new String[] {""} ;
      P08YE5_n719PrdNum = new boolean[] {false} ;
      P08YE5_A718PrdNom = new String[] {""} ;
      P08YE5_A6302TipPrdDsc = new String[] {""} ;
      P08YE5_n6302TipPrdDsc = new boolean[] {false} ;
      A6302TipPrdDsc = "" ;
      AV76TipPrdDsc = "" ;
      AV26CCStkCanS = DecimalUtil.ZERO ;
      P08YE6_A6301TipPrdCod = new short[1] ;
      P08YE6_n6301TipPrdCod = new boolean[] {false} ;
      P08YE6_A396EmprCod = new String[] {""} ;
      P08YE6_A719PrdNum = new String[] {""} ;
      P08YE6_n719PrdNum = new boolean[] {false} ;
      P08YE6_A718PrdNom = new String[] {""} ;
      P08YE6_A6302TipPrdDsc = new String[] {""} ;
      P08YE6_n6302TipPrdDsc = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.informeproductosconsumos__default(),
         new Object[] {
             new Object[] {
            P08YE2_A396EmprCod, P08YE2_A4494HreBarPar, P08YE2_A4493HreBarReo, P08YE2_A4492HreBarCod, P08YE2_A719PrdNum, P08YE2_n719PrdNum, P08YE2_A4539HreIntCod, P08YE2_n4539HreIntCod, P08YE2_A4525HreTipCol, P08YE2_n4525HreTipCol,
            P08YE2_A4522HreColNum, P08YE2_n4522HreColNum, P08YE2_A4521HreColNom, P08YE2_n4521HreColNom, P08YE2_A4519HreTipArt, P08YE2_n4519HreTipArt, P08YE2_A4517HreBarSer, P08YE2_n4517HreBarSer, P08YE2_A252CliCod, P08YE2_n252CliCod,
            P08YE2_A9808HreRacab, P08YE2_n9808HreRacab, P08YE2_A12453HreFecAct, P08YE2_n12453HreFecAct, P08YE2_A4565HreCanAny, P08YE2_n4565HreCanAny, P08YE2_A4563HrePrdCant, P08YE2_n4563HrePrdCant, P08YE2_A4967HrePrePrd, P08YE2_n4967HrePrePrd,
            P08YE2_A707PrdFacCon, P08YE2_A718PrdNom, P08YE2_A4557HreRecLin, P08YE2_A4550HreLinPro, P08YE2_A4545HreLinMaq, P08YE2_A4495HreNumCie
            }
            , new Object[] {
            P08YE3_A396EmprCod, P08YE3_A4508HreLinMAL, P08YE3_A4495HreNumCie, P08YE3_A4494HreBarPar, P08YE3_A4493HreBarReo, P08YE3_A4492HreBarCod, P08YE3_A719PrdNum, P08YE3_A4511HrePrdCFin, P08YE3_n4511HrePrdCFin, P08YE3_A707PrdFacCon,
            P08YE3_A4509HreNumAny
            }
            , new Object[] {
            P08YE4_A859CumCodCont, P08YE4_A396EmprCod, P08YE4_A719PrdNum, P08YE4_A862CumConFec, P08YE4_A861CumConCbis, P08YE4_A8639CumUnidad, P08YE4_A724PrdPreAct
            }
            , new Object[] {
            P08YE5_A6301TipPrdCod, P08YE5_n6301TipPrdCod, P08YE5_A396EmprCod, P08YE5_A719PrdNum, P08YE5_A718PrdNom, P08YE5_A6302TipPrdDsc, P08YE5_n6302TipPrdDsc
            }
            , new Object[] {
            P08YE6_A6301TipPrdCod, P08YE6_n6301TipPrdCod, P08YE6_A396EmprCod, P08YE6_A719PrdNum, P08YE6_A718PrdNom, P08YE6_A6302TipPrdDsc, P08YE6_n6302TipPrdDsc
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV42Intcod1 ;
   private byte AV44Intcod3 ;
   private byte AV69Tipcolcod1 ;
   private byte AV71Tipcolcod3 ;
   private byte AV19barcodreo ;
   private byte AV31ConsManuales ;
   private byte A4493HreBarReo ;
   private byte A4539HreIntCod ;
   private byte A4525HreTipCol ;
   private byte A4550HreLinPro ;
   private byte A4495HreNumCie ;
   private byte AV51Ok_p ;
   private byte AV39HreNumCie ;
   private byte AV37HreBarReo ;
   private byte A4509HreNumAny ;
   private byte GXv_int3[] ;
   private byte GXv_int5[] ;
   private byte A8639CumUnidad ;
   private byte AV12Alta ;
   private short AV66TipArtCod1 ;
   private short AV68Tipartcod3 ;
   private short AV45j ;
   private short AV41i ;
   private short AV75z ;
   private short AV58t ;
   private short A4519HreTipArt ;
   private short A4557HreRecLin ;
   private short A4545HreLinMaq ;
   private short AV38HreLinMaq ;
   private short AV52p ;
   private short A4508HreLinMAL ;
   private short GXv_int6[] ;
   private short A6301TipPrdCod ;
   private short Gx_err ;
   private int AV23Barcolnum1 ;
   private int AV25Barcolnum3 ;
   private int AV27Clicod1 ;
   private int AV29Clicod3 ;
   private int AV17barcod ;
   private int GX_I ;
   private int AV46l ;
   private int A4492HreBarCod ;
   private int A4522HreColNum ;
   private int A252CliCod ;
   private int AV35HreBarCod ;
   private int GXv_int2[] ;
   private int A859CumCodCont ;
   private int AV8Random ;
   private long AV30Col ;
   private long AV57Row ;
   private java.math.BigDecimal AV59Tab_cc[] ;
   private java.math.BigDecimal AV64Tab_vc[] ;
   private java.math.BigDecimal AV61Tab_cp[] ;
   private java.math.BigDecimal AV65Tab_vp[] ;
   private java.math.BigDecimal A4565HreCanAny ;
   private java.math.BigDecimal A4563HrePrdCant ;
   private java.math.BigDecimal A4967HrePrePrd ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A4511HrePrdCFin ;
   private java.math.BigDecimal AV56PrdPreAct ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal A861CumConCbis ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV72Valor ;
   private java.math.BigDecimal AV73Valort ;
   private java.math.BigDecimal AV26CCStkCanS ;
   private String A396EmprCod ;
   private String AV40HreRacab ;
   private String AV13ARtcod1 ;
   private String AV15Artcod3 ;
   private String AV20Barcolnom1 ;
   private String AV22Barcolnom3 ;
   private String AV18barcodpar ;
   private String AV62Tab_pc[] ;
   private String AV63Tab_pp[] ;
   private String AV60Tab_clave[] ;
   private String scmdbuf ;
   private String A4494HreBarPar ;
   private String A719PrdNum ;
   private String A4521HreColNom ;
   private String A4517HreBarSer ;
   private String A9808HreRacab ;
   private String A718PrdNom ;
   private String AV36HreBarPar ;
   private String Gx_msg ;
   private String GXv_char1[] ;
   private String GXv_char4[] ;
   private String GXv_char7[] ;
   private String AV54PrdNum ;
   private String AV53PrdNom ;
   private String A6302TipPrdDsc ;
   private String AV76TipPrdDsc ;
   private java.util.Date AV32Fec1 ;
   private java.util.Date AV33Fec2 ;
   private java.util.Date A12453HreFecAct ;
   private java.util.Date A862CumConFec ;
   private boolean n719PrdNum ;
   private boolean n4539HreIntCod ;
   private boolean n4525HreTipCol ;
   private boolean n4522HreColNum ;
   private boolean n4521HreColNom ;
   private boolean n4519HreTipArt ;
   private boolean n4517HreBarSer ;
   private boolean n252CliCod ;
   private boolean n9808HreRacab ;
   private boolean n12453HreFecAct ;
   private boolean n4565HreCanAny ;
   private boolean n4563HrePrdCant ;
   private boolean n4967HrePrePrd ;
   private boolean returnInSub ;
   private boolean n4511HrePrdCFin ;
   private boolean n6301TipPrdCod ;
   private boolean n6302TipPrdDsc ;
   private String AV9Filename ;
   private String AV11ErrorMessage ;
   private String[] aP23 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private java.util.Date[] aP2 ;
   private java.util.Date[] aP3 ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private int[] aP8 ;
   private int[] aP9 ;
   private int[] aP10 ;
   private int[] aP11 ;
   private byte[] aP12 ;
   private byte[] aP13 ;
   private short[] aP14 ;
   private short[] aP15 ;
   private byte[] aP16 ;
   private byte[] aP17 ;
   private int[] aP18 ;
   private byte[] aP19 ;
   private String[] aP20 ;
   private byte[] aP21 ;
   private String[] aP22 ;
   private IDataStoreProvider pr_default ;
   private String[] P08YE2_A396EmprCod ;
   private String[] P08YE2_A4494HreBarPar ;
   private byte[] P08YE2_A4493HreBarReo ;
   private int[] P08YE2_A4492HreBarCod ;
   private String[] P08YE2_A719PrdNum ;
   private boolean[] P08YE2_n719PrdNum ;
   private byte[] P08YE2_A4539HreIntCod ;
   private boolean[] P08YE2_n4539HreIntCod ;
   private byte[] P08YE2_A4525HreTipCol ;
   private boolean[] P08YE2_n4525HreTipCol ;
   private int[] P08YE2_A4522HreColNum ;
   private boolean[] P08YE2_n4522HreColNum ;
   private String[] P08YE2_A4521HreColNom ;
   private boolean[] P08YE2_n4521HreColNom ;
   private short[] P08YE2_A4519HreTipArt ;
   private boolean[] P08YE2_n4519HreTipArt ;
   private String[] P08YE2_A4517HreBarSer ;
   private boolean[] P08YE2_n4517HreBarSer ;
   private int[] P08YE2_A252CliCod ;
   private boolean[] P08YE2_n252CliCod ;
   private String[] P08YE2_A9808HreRacab ;
   private boolean[] P08YE2_n9808HreRacab ;
   private java.util.Date[] P08YE2_A12453HreFecAct ;
   private boolean[] P08YE2_n12453HreFecAct ;
   private java.math.BigDecimal[] P08YE2_A4565HreCanAny ;
   private boolean[] P08YE2_n4565HreCanAny ;
   private java.math.BigDecimal[] P08YE2_A4563HrePrdCant ;
   private boolean[] P08YE2_n4563HrePrdCant ;
   private java.math.BigDecimal[] P08YE2_A4967HrePrePrd ;
   private boolean[] P08YE2_n4967HrePrePrd ;
   private java.math.BigDecimal[] P08YE2_A707PrdFacCon ;
   private String[] P08YE2_A718PrdNom ;
   private short[] P08YE2_A4557HreRecLin ;
   private byte[] P08YE2_A4550HreLinPro ;
   private short[] P08YE2_A4545HreLinMaq ;
   private byte[] P08YE2_A4495HreNumCie ;
   private String[] P08YE3_A396EmprCod ;
   private short[] P08YE3_A4508HreLinMAL ;
   private byte[] P08YE3_A4495HreNumCie ;
   private String[] P08YE3_A4494HreBarPar ;
   private byte[] P08YE3_A4493HreBarReo ;
   private int[] P08YE3_A4492HreBarCod ;
   private String[] P08YE3_A719PrdNum ;
   private boolean[] P08YE3_n719PrdNum ;
   private java.math.BigDecimal[] P08YE3_A4511HrePrdCFin ;
   private boolean[] P08YE3_n4511HrePrdCFin ;
   private java.math.BigDecimal[] P08YE3_A707PrdFacCon ;
   private byte[] P08YE3_A4509HreNumAny ;
   private int[] P08YE4_A859CumCodCont ;
   private String[] P08YE4_A396EmprCod ;
   private String[] P08YE4_A719PrdNum ;
   private boolean[] P08YE4_n719PrdNum ;
   private java.util.Date[] P08YE4_A862CumConFec ;
   private java.math.BigDecimal[] P08YE4_A861CumConCbis ;
   private byte[] P08YE4_A8639CumUnidad ;
   private java.math.BigDecimal[] P08YE4_A724PrdPreAct ;
   private short[] P08YE5_A6301TipPrdCod ;
   private boolean[] P08YE5_n6301TipPrdCod ;
   private String[] P08YE5_A396EmprCod ;
   private String[] P08YE5_A719PrdNum ;
   private boolean[] P08YE5_n719PrdNum ;
   private String[] P08YE5_A718PrdNom ;
   private String[] P08YE5_A6302TipPrdDsc ;
   private boolean[] P08YE5_n6302TipPrdDsc ;
   private short[] P08YE6_A6301TipPrdCod ;
   private boolean[] P08YE6_n6301TipPrdCod ;
   private String[] P08YE6_A396EmprCod ;
   private String[] P08YE6_A719PrdNum ;
   private boolean[] P08YE6_n719PrdNum ;
   private String[] P08YE6_A718PrdNom ;
   private String[] P08YE6_A6302TipPrdDsc ;
   private boolean[] P08YE6_n6302TipPrdDsc ;
   private com.genexus.gxoffice.ExcelDoc AV10ExcelDocument ;
}

final  class informeproductosconsumos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P08YE2", "SELECT T1.EmprCod, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.PrdNum, T3.HreIntCod, T3.HreTipCol, T3.HreColNum, T3.HreColNom, T3.HreTipArt, T3.HreBarSer, T3.CliCod, T3.HreRacab, T1.HreFecAct, T1.HreCanAny, T1.HrePrdCant, T1.HrePrePrd, T2.PrdFacCon, T2.PrdNom, T1.HreRecLin, T1.HreLinPro, T1.HreLinMaq, T1.HreNumCie FROM ((TXPHISLRE T1 LEFT JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPHISREH T3 ON T3.EmprCod = T1.EmprCod AND T3.HreBarCod = T1.HreBarCod AND T3.HreBarReo = T1.HreBarReo AND T3.HreBarPar = T1.HreBarPar AND T3.HreNumCie = T1.HreNumCie) WHERE (T1.EmprCod = ? and T1.HreFecAct >= ?) AND (T3.HreRacab = ? or ? = 'T') AND (T3.CliCod >= ?) AND (T3.CliCod <= ?) AND (T3.HreBarSer >= ?) AND (T3.HreBarSer <= ?) AND (T3.HreTipArt >= ?) AND (T3.HreTipArt <= ?) AND (T3.HreColNom >= ?) AND (T3.HreColNom <= ?) AND (T3.HreColNum >= ?) AND (T3.HreColNum <= ?) AND (T3.HreTipCol >= ?) AND (T3.HreTipCol <= ?) AND (T3.HreIntCod >= ?) AND (T3.HreIntCod <= ?) AND (T1.PrdNum >= '100000' and T1.PrdNum <= '999999') AND (T1.HreBarCod = ? or (? = 0)) AND (T1.HreBarReo = ? or (? = 0)) AND (T1.HreBarPar = ? or (rtrim(?) IS NULL)) AND (T1.HreFecAct <= ?) ORDER BY T1.EmprCod, T1.HreFecAct, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.HreLinMaq, T1.HreLinPro, T1.HreRecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08YE3", "SELECT T1.EmprCod, T1.HreLinMAL, T1.HreNumCie, T1.HreBarPar, T1.HreBarReo, T1.HreBarCod, T1.PrdNum, T1.HrePrdCFin, T2.PrdFacCon, T1.HreNumAny FROM (TXPHISREA T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.HreBarCod = ? and T1.HreBarReo = ? and T1.HreBarPar = ? and T1.HreNumCie = ? and T1.HreLinMAL = ? ORDER BY T1.EmprCod, T1.HreBarCod, T1.HreBarReo, T1.HreBarPar, T1.HreNumCie, T1.HreLinMAL ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08YE4", "SELECT T1.CumCodCont, T1.EmprCod, T1.PrdNum, T3.CumConFec, T1.CumConCbis, T1.CumUnidad, T2.PrdPreAct FROM ((TXPLCUMCO T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPCCUMCO T3 ON T3.EmprCod = T1.EmprCod AND T3.CumCodCont = T1.CumCodCont) WHERE (T1.EmprCod = ? and T3.CumConFec >= ?) AND (T1.PrdNum >= '100000' and T1.PrdNum <= '999999') AND (T3.CumConFec <= ?) ORDER BY T1.EmprCod, T3.CumConFec ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P08YE5", "SELECT T1.TipPrdCod, T1.EmprCod, T1.PrdNum, T1.PrdNom, T2.TipPrdDsc FROM (TXPPRODUC T1 LEFT JOIN TXPTIPPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipPrdCod = T1.TipPrdCod) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P08YE6", "SELECT T1.TipPrdCod, T1.EmprCod, T1.PrdNum, T1.PrdNom, T2.TipPrdDsc FROM (TXPPRODUC T1 LEFT JOIN TXPTIPPRD T2 ON T2.EmprCod = T1.EmprCod AND T2.TipPrdCod = T1.TipPrdCod) WHERE T1.EmprCod = ? and T1.PrdNum = ? ORDER BY T1.EmprCod, T1.PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((int[]) buf[10])[0] = rslt.getInt(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(9, 13);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 16);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(12);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDate(14);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(15,3);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(16,3);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(17,5);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(18,4);
               ((String[]) buf[31])[0] = rslt.getString(19, 26);
               ((short[]) buf[32])[0] = rslt.getShort(20);
               ((byte[]) buf[33])[0] = rslt.getByte(21);
               ((short[]) buf[34])[0] = rslt.getShort(22);
               ((byte[]) buf[35])[0] = rslt.getByte(23);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,3);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,4);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,4);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((String[]) buf[5])[0] = rslt.getString(5, 40);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((String[]) buf[3])[0] = rslt.getString(3, 6);
               ((String[]) buf[4])[0] = rslt.getString(4, 26);
               ((String[]) buf[5])[0] = rslt.getString(5, 40);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setString(7, (String)parms[6], 16);
               stmt.setString(8, (String)parms[7], 16);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setString(11, (String)parms[10], 13);
               stmt.setString(12, (String)parms[11], 13);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setString(23, (String)parms[22], 1);
               stmt.setString(24, (String)parms[23], 1);
               stmt.setDate(25, (java.util.Date)parms[24]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

