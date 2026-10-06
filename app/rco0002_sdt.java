package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rco0002_sdt extends GXProcedure
{
   public rco0002_sdt( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rco0002_sdt.class ), "" );
   }

   public rco0002_sdt( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             short[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 )
   {
      rco0002_sdt.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        short[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             short[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             String[] aP5 )
   {
      rco0002_sdt.this.AV48EmprCod = aP0[0];
      this.aP0 = aP0;
      rco0002_sdt.this.AV10Anyo = aP1[0];
      this.aP1 = aP1;
      rco0002_sdt.this.AV30Mes = aP2[0];
      this.aP2 = aP2;
      rco0002_sdt.this.AV14ImpCod = aP3[0];
      this.aP3 = aP3;
      rco0002_sdt.this.AV40TotCom = aP4[0];
      this.aP4 = aP4;
      rco0002_sdt.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV15Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN078_", ""), (byte)(99), GXv_char2) ;
      rco0002_sdt.this.GXt_char1 = GXv_char2[0] ;
      AV15Lit0 = GXt_char1 ;
      GXt_char1 = AV16Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2192_", ""), (byte)(99), GXv_char2) ;
      rco0002_sdt.this.GXt_char1 = GXv_char2[0] ;
      AV16Lit1 = GXt_char1 ;
      GXt_char1 = AV22Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2239_", ""), (byte)(99), GXv_char2) ;
      rco0002_sdt.this.GXt_char1 = GXv_char2[0] ;
      AV22Lit2 = GXt_char1 ;
      GXt_char1 = AV23Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2347_", ""), (byte)(99), GXv_char2) ;
      rco0002_sdt.this.GXt_char1 = GXv_char2[0] ;
      AV23Lit3 = GXt_char1 ;
      GXt_char1 = AV24Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1040_", ""), (byte)(99), GXv_char2) ;
      rco0002_sdt.this.GXt_char1 = GXv_char2[0] ;
      AV24Lit4 = GXt_char1 ;
      GXt_char1 = AV25Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN198_", ""), (byte)(99), GXv_char2) ;
      rco0002_sdt.this.GXt_char1 = GXv_char2[0] ;
      AV25Lit5 = GXt_char1 ;
      GXt_char1 = AV26Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2358_", ""), (byte)(99), GXv_char2) ;
      rco0002_sdt.this.GXt_char1 = GXv_char2[0] ;
      AV26Lit6 = GXt_char1 ;
      GXt_char1 = AV27Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2007_", ""), (byte)(99), GXv_char2) ;
      rco0002_sdt.this.GXt_char1 = GXv_char2[0] ;
      AV27Lit7 = GXt_char1 ;
      GXt_char1 = AV28Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN1388_", ""), (byte)(99), GXv_char2) ;
      rco0002_sdt.this.GXt_char1 = GXv_char2[0] ;
      AV28Lit8 = GXt_char1 ;
      GXt_char1 = AV29Lit9 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2487_", ""), (byte)(99), GXv_char2) ;
      rco0002_sdt.this.GXt_char1 = GXv_char2[0] ;
      AV29Lit9 = GXt_char1 ;
      GXt_char1 = AV17Lit10 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2488_", ""), (byte)(99), GXv_char2) ;
      rco0002_sdt.this.GXt_char1 = GXv_char2[0] ;
      AV17Lit10 = GXt_char1 ;
      GXt_char1 = AV18Lit11 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2489_", ""), (byte)(99), GXv_char2) ;
      rco0002_sdt.this.GXt_char1 = GXv_char2[0] ;
      AV18Lit11 = GXt_char1 ;
      GXt_char1 = AV19Lit12 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN2490_", ""), (byte)(99), GXv_char2) ;
      rco0002_sdt.this.GXt_char1 = GXv_char2[0] ;
      AV19Lit12 = GXt_char1 ;
      GXt_char1 = AV20Lit13 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN112_", ""), (byte)(99), GXv_char2) ;
      rco0002_sdt.this.GXt_char1 = GXv_char2[0] ;
      AV20Lit13 = GXt_char1 ;
      GXt_char1 = AV21Lit14 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN113_", ""), (byte)(99), GXv_char2) ;
      rco0002_sdt.this.GXt_char1 = GXv_char2[0] ;
      AV21Lit14 = GXt_char1 ;
      GXv_char2[0] = AV48EmprCod ;
      GXv_int3[0] = AV10Anyo ;
      new app.pordprv(remoteHandle, context).execute( GXv_char2, GXv_int3) ;
      rco0002_sdt.this.AV48EmprCod = GXv_char2[0] ;
      rco0002_sdt.this.AV10Anyo = GXv_int3[0] ;
      /* Using cursor P09GH2 */
      pr_default.execute(0, new Object[] {AV48EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09GH2_A396EmprCod[0] ;
         A407EmprNom = P09GH2_A407EmprNom[0] ;
         n407EmprNom = P09GH2_n407EmprNom[0] ;
         AV31NomEmp = A407EmprNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      AV33Porcen = DecimalUtil.doubleToDec(0) ;
      AV32PorAcu = DecimalUtil.doubleToDec(0) ;
      AV34PorcGrp = DecimalUtil.doubleToDec(0) ;
      AV42TotGrp = DecimalUtil.doubleToDec(0) ;
      AV44TotInf = DecimalUtil.doubleToDec(0) ;
      AV13Flag = (byte)(1) ;
      AV39Sin_c = DecimalUtil.doubleToDec(0) ;
      AV52GXLvl35 = (byte)(0) ;
      /* Using cursor P09GH3 */
      pr_default.execute(1, new Object[] {AV48EmprCod, Short.valueOf(AV10Anyo)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A794PrvNom = P09GH3_A794PrvNom[0] ;
         n794PrvNom = P09GH3_n794PrvNom[0] ;
         A779PrvAny = P09GH3_A779PrvAny[0] ;
         A795PrvNum = P09GH3_A795PrvNum[0] ;
         A396EmprCod = P09GH3_A396EmprCod[0] ;
         A330DifEstCa1 = P09GH3_A330DifEstCa1[0] ;
         n330DifEstCa1 = P09GH3_n330DifEstCa1[0] ;
         A794PrvNom = P09GH3_A794PrvNom[0] ;
         n794PrvNom = P09GH3_n794PrvNom[0] ;
         AV52GXLvl35 = (byte)(1) ;
         AV11ComAcu = DecimalUtil.doubleToDec(0) ;
         /* Using cursor P09GH4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny), Byte.valueOf(AV30Mes)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A796PrvNumLin = P09GH4_A796PrvNumLin[0] ;
            A791PrvEstCm1 = P09GH4_A791PrvEstCm1[0] ;
            n791PrvEstCm1 = P09GH4_n791PrvEstCm1[0] ;
            A790PrvEstCm0 = P09GH4_A790PrvEstCm0[0] ;
            n790PrvEstCm0 = P09GH4_n790PrvEstCm0[0] ;
            AV11ComAcu = AV11ComAcu.add(A790PrvEstCm0).add(A791PrvEstCm1) ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         AV36PrvNum = A795PrvNum ;
         AV35PrvNom = A794PrvNom ;
         AV38Si_prov = (byte)(0) ;
         /* Using cursor P09GH5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum), Short.valueOf(A779PrvAny), Byte.valueOf(AV30Mes)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A796PrvNumLin = P09GH5_A796PrvNumLin[0] ;
            A790PrvEstCm0 = P09GH5_A790PrvEstCm0[0] ;
            n790PrvEstCm0 = P09GH5_n790PrvEstCm0[0] ;
            A791PrvEstCm1 = P09GH5_A791PrvEstCm1[0] ;
            n791PrvEstCm1 = P09GH5_n791PrvEstCm1[0] ;
            AV38Si_prov = (byte)(1) ;
            AV12ComPer = A791PrvEstCm1.add(A790PrvEstCm0) ;
            if ( AV40TotCom.doubleValue() != 0 )
            {
               AV33Porcen = GXutil.roundDecimal( AV11ComAcu.multiply(DecimalUtil.doubleToDec(100)).divide(AV40TotCom, 18, java.math.RoundingMode.DOWN), 1) ;
            }
            else
            {
               AV33Porcen = DecimalUtil.doubleToDec(0) ;
            }
            AV32PorAcu = AV32PorAcu.add(AV33Porcen) ;
            AV45TotPer = AV45TotPer.add(AV12ComPer) ;
            AV44TotInf = AV44TotInf.add(AV11ComAcu) ;
            if ( AV13Flag == 3 )
            {
               AV13Flag = (byte)(4) ;
            }
            AV8sdtpco0002 = (app.SdtSDTPCO0002)new app.SdtSDTPCO0002(remoteHandle, context);
            AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Codigo( GXutil.str( A795PrvNum, 6, 0) );
            AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Descripcion( A794PrvNom );
            AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Periodo( AV12ComPer );
            AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Acumulado( AV11ComAcu );
            AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Total( AV33Porcen );
            AV37sdtpco0002Collection.add(AV8sdtpco0002, 0);
            AV34PorcGrp = AV34PorcGrp.add(AV33Porcen) ;
            AV42TotGrp = AV42TotGrp.add(AV11ComAcu) ;
            AV43TotGrpPer = AV43TotGrpPer.add(AV12ComPer) ;
            if ( ( AV32PorAcu.doubleValue() >= 80 ) && ( AV13Flag == 1 ) )
            {
               AV8sdtpco0002 = (app.SdtSDTPCO0002)new app.SdtSDTPCO0002(remoteHandle, context);
               AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Codigo( "" );
               AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Descripcion( AV29Lit9 );
               AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Periodo( AV43TotGrpPer );
               AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Acumulado( AV42TotGrp );
               AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Total( AV34PorcGrp );
               AV37sdtpco0002Collection.add(AV8sdtpco0002, 0);
               AV34PorcGrp = DecimalUtil.doubleToDec(0) ;
               AV42TotGrp = DecimalUtil.doubleToDec(0) ;
               AV43TotGrpPer = DecimalUtil.doubleToDec(0) ;
               AV13Flag = (byte)(2) ;
            }
            if ( ( ( AV32PorAcu.doubleValue() >= 95 ) ) && ( AV13Flag == 2 ) && ( AV42TotGrp.doubleValue() != 0 ) )
            {
               AV8sdtpco0002 = (app.SdtSDTPCO0002)new app.SdtSDTPCO0002(remoteHandle, context);
               AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Codigo( "" );
               AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Descripcion( AV17Lit10 );
               AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Periodo( AV43TotGrpPer );
               AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Acumulado( AV42TotGrp );
               AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Total( AV34PorcGrp );
               AV37sdtpco0002Collection.add(AV8sdtpco0002, 0);
               AV34PorcGrp = DecimalUtil.doubleToDec(0) ;
               AV42TotGrp = DecimalUtil.doubleToDec(0) ;
               AV43TotGrpPer = DecimalUtil.doubleToDec(0) ;
               AV13Flag = (byte)(3) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         if ( AV38Si_prov == 0 )
         {
            AV8sdtpco0002 = (app.SdtSDTPCO0002)new app.SdtSDTPCO0002(remoteHandle, context);
            AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Codigo( GXutil.str( AV36PrvNum, 6, 0) );
            AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Descripcion( AV35PrvNom );
            AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Periodo( DecimalUtil.doubleToDec(0) );
            AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Acumulado( AV11ComAcu );
            AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Total( DecimalUtil.doubleToDec(0) );
            AV37sdtpco0002Collection.add(AV8sdtpco0002, 0);
            AV39Sin_c = AV39Sin_c.add(AV11ComAcu) ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      if ( AV52GXLvl35 == 0 )
      {
         AV8sdtpco0002 = (app.SdtSDTPCO0002)new app.SdtSDTPCO0002(remoteHandle, context);
         AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Codigo( httpContext.getMessage( "sin datos", "") );
         AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Descripcion( AV48EmprCod );
         AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Periodo( DecimalUtil.doubleToDec(AV10Anyo) );
         AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Acumulado( DecimalUtil.doubleToDec(AV30Mes) );
         AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Total( AV40TotCom );
         AV37sdtpco0002Collection.add(AV8sdtpco0002, 0);
      }
      if ( AV13Flag == 4 )
      {
         AV8sdtpco0002 = (app.SdtSDTPCO0002)new app.SdtSDTPCO0002(remoteHandle, context);
         AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Codigo( "" );
         AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Descripcion( AV18Lit11 );
         AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Periodo( AV43TotGrpPer );
         AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Acumulado( AV42TotGrp );
         AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Total( AV34PorcGrp );
         AV37sdtpco0002Collection.add(AV8sdtpco0002, 0);
      }
      if ( AV39Sin_c.doubleValue() > 0 )
      {
         AV44TotInf = AV44TotInf.add(AV39Sin_c) ;
      }
      AV8sdtpco0002 = (app.SdtSDTPCO0002)new app.SdtSDTPCO0002(remoteHandle, context);
      AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Codigo( "" );
      AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Descripcion( AV19Lit12 );
      AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Periodo( AV45TotPer );
      AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Acumulado( AV44TotInf );
      AV8sdtpco0002.setgxTv_SdtSDTPCO0002_Total( AV32PorAcu );
      AV37sdtpco0002Collection.add(AV8sdtpco0002, 0);
      if ( AV39Sin_c.doubleValue() > 0 )
      {
         AV44TotInf = AV44TotInf.add(AV39Sin_c) ;
      }
      AV47sdtpco0002Collectionstr = AV37sdtpco0002Collection.toJSonString(false) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = rco0002_sdt.this.AV48EmprCod;
      this.aP1[0] = rco0002_sdt.this.AV10Anyo;
      this.aP2[0] = rco0002_sdt.this.AV30Mes;
      this.aP3[0] = rco0002_sdt.this.AV14ImpCod;
      this.aP4[0] = rco0002_sdt.this.AV40TotCom;
      this.aP5[0] = rco0002_sdt.this.AV47sdtpco0002Collectionstr;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV47sdtpco0002Collectionstr = "" ;
      AV15Lit0 = "" ;
      AV16Lit1 = "" ;
      AV22Lit2 = "" ;
      AV23Lit3 = "" ;
      AV24Lit4 = "" ;
      AV25Lit5 = "" ;
      AV26Lit6 = "" ;
      AV27Lit7 = "" ;
      AV28Lit8 = "" ;
      AV29Lit9 = "" ;
      AV17Lit10 = "" ;
      AV18Lit11 = "" ;
      AV19Lit12 = "" ;
      AV20Lit13 = "" ;
      AV21Lit14 = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_int3 = new short[1] ;
      scmdbuf = "" ;
      P09GH2_A396EmprCod = new String[] {""} ;
      P09GH2_A407EmprNom = new String[] {""} ;
      P09GH2_n407EmprNom = new boolean[] {false} ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      AV31NomEmp = "" ;
      AV33Porcen = DecimalUtil.ZERO ;
      AV32PorAcu = DecimalUtil.ZERO ;
      AV34PorcGrp = DecimalUtil.ZERO ;
      AV42TotGrp = DecimalUtil.ZERO ;
      AV44TotInf = DecimalUtil.ZERO ;
      AV39Sin_c = DecimalUtil.ZERO ;
      P09GH3_A794PrvNom = new String[] {""} ;
      P09GH3_n794PrvNom = new boolean[] {false} ;
      P09GH3_A779PrvAny = new short[1] ;
      P09GH3_A795PrvNum = new int[1] ;
      P09GH3_A396EmprCod = new String[] {""} ;
      P09GH3_A330DifEstCa1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GH3_n330DifEstCa1 = new boolean[] {false} ;
      A794PrvNom = "" ;
      A330DifEstCa1 = DecimalUtil.ZERO ;
      AV11ComAcu = DecimalUtil.ZERO ;
      P09GH4_A396EmprCod = new String[] {""} ;
      P09GH4_A795PrvNum = new int[1] ;
      P09GH4_A779PrvAny = new short[1] ;
      P09GH4_A796PrvNumLin = new byte[1] ;
      P09GH4_A791PrvEstCm1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GH4_n791PrvEstCm1 = new boolean[] {false} ;
      P09GH4_A790PrvEstCm0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GH4_n790PrvEstCm0 = new boolean[] {false} ;
      A791PrvEstCm1 = DecimalUtil.ZERO ;
      A790PrvEstCm0 = DecimalUtil.ZERO ;
      AV35PrvNom = "" ;
      P09GH5_A396EmprCod = new String[] {""} ;
      P09GH5_A795PrvNum = new int[1] ;
      P09GH5_A779PrvAny = new short[1] ;
      P09GH5_A796PrvNumLin = new byte[1] ;
      P09GH5_A790PrvEstCm0 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GH5_n790PrvEstCm0 = new boolean[] {false} ;
      P09GH5_A791PrvEstCm1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09GH5_n791PrvEstCm1 = new boolean[] {false} ;
      AV12ComPer = DecimalUtil.ZERO ;
      AV45TotPer = DecimalUtil.ZERO ;
      AV8sdtpco0002 = new app.SdtSDTPCO0002(remoteHandle, context);
      AV37sdtpco0002Collection = new GXBaseCollection<app.SdtSDTPCO0002>(app.SdtSDTPCO0002.class, "SDTPCO0002", "TexplusNET", remoteHandle);
      AV43TotGrpPer = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.rco0002_sdt__default(),
         new Object[] {
             new Object[] {
            P09GH2_A396EmprCod, P09GH2_A407EmprNom, P09GH2_n407EmprNom
            }
            , new Object[] {
            P09GH3_A794PrvNom, P09GH3_n794PrvNom, P09GH3_A779PrvAny, P09GH3_A795PrvNum, P09GH3_A396EmprCod, P09GH3_A330DifEstCa1, P09GH3_n330DifEstCa1
            }
            , new Object[] {
            P09GH4_A396EmprCod, P09GH4_A795PrvNum, P09GH4_A779PrvAny, P09GH4_A796PrvNumLin, P09GH4_A791PrvEstCm1, P09GH4_n791PrvEstCm1, P09GH4_A790PrvEstCm0, P09GH4_n790PrvEstCm0
            }
            , new Object[] {
            P09GH5_A396EmprCod, P09GH5_A795PrvNum, P09GH5_A779PrvAny, P09GH5_A796PrvNumLin, P09GH5_A790PrvEstCm0, P09GH5_n790PrvEstCm0, P09GH5_A791PrvEstCm1, P09GH5_n791PrvEstCm1
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV30Mes ;
   private byte AV13Flag ;
   private byte AV52GXLvl35 ;
   private byte A796PrvNumLin ;
   private byte AV38Si_prov ;
   private short AV10Anyo ;
   private short GXv_int3[] ;
   private short A779PrvAny ;
   private short Gx_err ;
   private int A795PrvNum ;
   private int AV36PrvNum ;
   private java.math.BigDecimal AV40TotCom ;
   private java.math.BigDecimal AV33Porcen ;
   private java.math.BigDecimal AV32PorAcu ;
   private java.math.BigDecimal AV34PorcGrp ;
   private java.math.BigDecimal AV42TotGrp ;
   private java.math.BigDecimal AV44TotInf ;
   private java.math.BigDecimal AV39Sin_c ;
   private java.math.BigDecimal A330DifEstCa1 ;
   private java.math.BigDecimal AV11ComAcu ;
   private java.math.BigDecimal A791PrvEstCm1 ;
   private java.math.BigDecimal A790PrvEstCm0 ;
   private java.math.BigDecimal AV12ComPer ;
   private java.math.BigDecimal AV45TotPer ;
   private java.math.BigDecimal AV43TotGrpPer ;
   private String AV48EmprCod ;
   private String AV14ImpCod ;
   private String AV15Lit0 ;
   private String AV16Lit1 ;
   private String AV22Lit2 ;
   private String AV23Lit3 ;
   private String AV24Lit4 ;
   private String AV25Lit5 ;
   private String AV26Lit6 ;
   private String AV27Lit7 ;
   private String AV28Lit8 ;
   private String AV29Lit9 ;
   private String AV17Lit10 ;
   private String AV18Lit11 ;
   private String AV19Lit12 ;
   private String AV20Lit13 ;
   private String AV21Lit14 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String AV31NomEmp ;
   private String A794PrvNom ;
   private String AV35PrvNom ;
   private boolean n407EmprNom ;
   private boolean n794PrvNom ;
   private boolean n330DifEstCa1 ;
   private boolean n791PrvEstCm1 ;
   private boolean n790PrvEstCm0 ;
   private String AV47sdtpco0002Collectionstr ;
   private String[] aP5 ;
   private String[] aP0 ;
   private short[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09GH2_A396EmprCod ;
   private String[] P09GH2_A407EmprNom ;
   private boolean[] P09GH2_n407EmprNom ;
   private String[] P09GH3_A794PrvNom ;
   private boolean[] P09GH3_n794PrvNom ;
   private short[] P09GH3_A779PrvAny ;
   private int[] P09GH3_A795PrvNum ;
   private String[] P09GH3_A396EmprCod ;
   private java.math.BigDecimal[] P09GH3_A330DifEstCa1 ;
   private boolean[] P09GH3_n330DifEstCa1 ;
   private String[] P09GH4_A396EmprCod ;
   private int[] P09GH4_A795PrvNum ;
   private short[] P09GH4_A779PrvAny ;
   private byte[] P09GH4_A796PrvNumLin ;
   private java.math.BigDecimal[] P09GH4_A791PrvEstCm1 ;
   private boolean[] P09GH4_n791PrvEstCm1 ;
   private java.math.BigDecimal[] P09GH4_A790PrvEstCm0 ;
   private boolean[] P09GH4_n790PrvEstCm0 ;
   private String[] P09GH5_A396EmprCod ;
   private int[] P09GH5_A795PrvNum ;
   private short[] P09GH5_A779PrvAny ;
   private byte[] P09GH5_A796PrvNumLin ;
   private java.math.BigDecimal[] P09GH5_A790PrvEstCm0 ;
   private boolean[] P09GH5_n790PrvEstCm0 ;
   private java.math.BigDecimal[] P09GH5_A791PrvEstCm1 ;
   private boolean[] P09GH5_n791PrvEstCm1 ;
   private GXBaseCollection<app.SdtSDTPCO0002> AV37sdtpco0002Collection ;
   private app.SdtSDTPCO0002 AV8sdtpco0002 ;
}

final  class rco0002_sdt__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09GH2", "SELECT EmprCod, EmprNom FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09GH3", "SELECT T2.PrvNom, T1.PrvAny, T1.PrvNum, T1.EmprCod, T1.DifEstCa1 FROM (TXPCPRVES T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) WHERE (T1.EmprCod = ?) AND (T1.PrvAny = ?) ORDER BY T1.EmprCod, T1.DifEstCa1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09GH4", "SELECT EmprCod, PrvNum, PrvAny, PrvNumLin, PrvEstCm1, PrvEstCm0 FROM TXPLPRVES WHERE (EmprCod = ? and PrvNum = ? and PrvAny = ?) AND (PrvNumLin <= ?) ORDER BY EmprCod, PrvNum, PrvAny ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09GH5", "SELECT EmprCod, PrvNum, PrvAny, PrvNumLin, PrvEstCm0, PrvEstCm1 FROM TXPLPRVES WHERE EmprCod = ? and PrvNum = ? and PrvAny = ? and PrvNumLin = ? ORDER BY EmprCod, PrvNum, PrvAny, PrvNumLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
      }
   }

}

