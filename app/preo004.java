package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class preo004 extends GXProcedure
{
   public preo004( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( preo004.class ), "" );
   }

   public preo004( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 ,
                             java.util.Date[] aP8 ,
                             java.util.Date[] aP9 ,
                             java.util.Date[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             java.math.BigDecimal[] aP12 ,
                             String[] aP13 ,
                             short[] aP14 ,
                             short[] aP15 ,
                             java.math.BigDecimal[] aP16 ,
                             String[] aP17 ,
                             String[] aP18 ,
                             String[] aP19 ,
                             int[] aP20 ,
                             java.math.BigDecimal[] aP21 ,
                             java.math.BigDecimal[] aP22 ,
                             java.math.BigDecimal[] aP23 ,
                             java.math.BigDecimal[] aP24 ,
                             String[] aP25 ,
                             String[] aP26 ,
                             java.util.Date[] aP27 ,
                             String[] aP28 ,
                             String[] aP29 ,
                             String[] aP30 ,
                             String[] aP31 ,
                             java.util.Date[] aP32 ,
                             java.util.Date[] aP33 ,
                             String[] aP34 ,
                             String[] aP35 )
   {
      preo004.this.aP36 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36);
      return aP36[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 ,
                        byte[] aP7 ,
                        java.util.Date[] aP8 ,
                        java.util.Date[] aP9 ,
                        java.util.Date[] aP10 ,
                        java.math.BigDecimal[] aP11 ,
                        java.math.BigDecimal[] aP12 ,
                        String[] aP13 ,
                        short[] aP14 ,
                        short[] aP15 ,
                        java.math.BigDecimal[] aP16 ,
                        String[] aP17 ,
                        String[] aP18 ,
                        String[] aP19 ,
                        int[] aP20 ,
                        java.math.BigDecimal[] aP21 ,
                        java.math.BigDecimal[] aP22 ,
                        java.math.BigDecimal[] aP23 ,
                        java.math.BigDecimal[] aP24 ,
                        String[] aP25 ,
                        String[] aP26 ,
                        java.util.Date[] aP27 ,
                        String[] aP28 ,
                        String[] aP29 ,
                        String[] aP30 ,
                        String[] aP31 ,
                        java.util.Date[] aP32 ,
                        java.util.Date[] aP33 ,
                        String[] aP34 ,
                        String[] aP35 ,
                        String[] aP36 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17, aP18, aP19, aP20, aP21, aP22, aP23, aP24, aP25, aP26, aP27, aP28, aP29, aP30, aP31, aP32, aP33, aP34, aP35, aP36);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 ,
                             byte[] aP7 ,
                             java.util.Date[] aP8 ,
                             java.util.Date[] aP9 ,
                             java.util.Date[] aP10 ,
                             java.math.BigDecimal[] aP11 ,
                             java.math.BigDecimal[] aP12 ,
                             String[] aP13 ,
                             short[] aP14 ,
                             short[] aP15 ,
                             java.math.BigDecimal[] aP16 ,
                             String[] aP17 ,
                             String[] aP18 ,
                             String[] aP19 ,
                             int[] aP20 ,
                             java.math.BigDecimal[] aP21 ,
                             java.math.BigDecimal[] aP22 ,
                             java.math.BigDecimal[] aP23 ,
                             java.math.BigDecimal[] aP24 ,
                             String[] aP25 ,
                             String[] aP26 ,
                             java.util.Date[] aP27 ,
                             String[] aP28 ,
                             String[] aP29 ,
                             String[] aP30 ,
                             String[] aP31 ,
                             java.util.Date[] aP32 ,
                             java.util.Date[] aP33 ,
                             String[] aP34 ,
                             String[] aP35 ,
                             String[] aP36 )
   {
      preo004.this.AV15EmprCod = aP0[0];
      this.aP0 = aP0;
      preo004.this.AV16BarCod = aP1[0];
      this.aP1 = aP1;
      preo004.this.AV17BarCodReo = aP2[0];
      this.aP2 = aP2;
      preo004.this.AV18BarParPan = aP3[0];
      this.aP3 = aP3;
      preo004.this.AV19ProCod = aP4[0];
      this.aP4 = aP4;
      preo004.this.AV20BarOrdLin = aP5[0];
      this.aP5 = aP5;
      preo004.this.AV21FasCod = aP6[0];
      this.aP6 = aP6;
      preo004.this.AV22BarFasEst = aP7[0];
      this.aP7 = aP7;
      preo004.this.AV23BarFecTeo = aP8[0];
      this.aP8 = aP8;
      preo004.this.AV24BarFecRea = aP9[0];
      this.aP9 = aP9;
      preo004.this.AV39BarFecRIni = aP10[0];
      this.aP10 = aP10;
      preo004.this.AV25BarTieTeo = aP11[0];
      this.aP11 = aP11;
      preo004.this.AV26BarUni = aP12[0];
      this.aP12 = aP12;
      preo004.this.AV27BarLoc = aP13[0];
      this.aP13 = aP13;
      preo004.this.AV28BarHorIni = aP14[0];
      this.aP14 = aP14;
      preo004.this.AV29BarHorFin = aP15[0];
      this.aP15 = aP15;
      preo004.this.AV30BarTieRea = aP16[0];
      this.aP16 = aP16;
      preo004.this.AV31MaqCodBis = aP17[0];
      this.aP17 = aP17;
      preo004.this.AV32BarFasCon = aP18[0];
      this.aP18 = aP18;
      preo004.this.AV33BarFacTin = aP19[0];
      this.aP19 = aP19;
      preo004.this.AV40BarNumBot = aP20[0];
      this.aP20 = aP20;
      preo004.this.AV43BarFasKgm = aP21[0];
      this.aP21 = aP21;
      preo004.this.AV44BarFasKgt = aP22[0];
      this.aP22 = aP22;
      preo004.this.AV45BarfasMtr = aP23[0];
      this.aP23 = aP23;
      preo004.this.AV46BarFasMtt = aP24[0];
      this.aP24 = aP24;
      preo004.this.AV47BarFasCop = aP25[0];
      this.aP25 = aP25;
      preo004.this.AV48BarFasAcab = aP26[0];
      this.aP26 = aP26;
      preo004.this.AV49barFasFpl = aP27[0];
      this.aP27 = aP27;
      preo004.this.AV50barFasUsu = aP28[0];
      this.aP28 = aP28;
      preo004.this.AV51BarFasGral = aP29[0];
      this.aP29 = aP29;
      preo004.this.AV52barMaqPlan = aP30[0];
      this.aP30 = aP30;
      preo004.this.AV53BarFasFor = aP31[0];
      this.aP31 = aP31;
      preo004.this.AV61Barfasdti = aP32[0];
      this.aP32 = aP32;
      preo004.this.AV62BarFasDTF = aP33[0];
      this.aP33 = aP33;
      preo004.this.AV63BarHdro = aP34[0];
      this.aP34 = aP34;
      preo004.this.AV66BarObsf = aP35[0];
      this.aP35 = aP35;
      preo004.this.AV67BarObsb = aP36[0];
      this.aP36 = aP36;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV42F_fascer ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "FASCER", ""), GXv_int2) ;
      preo004.this.GXt_int1 = GXv_int2[0] ;
      AV42F_fascer = GXt_int1 ;
      GXt_int1 = AV59TAS ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TAS", ""), GXv_int2) ;
      preo004.this.GXt_int1 = GXv_int2[0] ;
      AV59TAS = GXt_int1 ;
      GXt_int1 = AV60HDRO ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "HDRORI", ""), GXv_int2) ;
      preo004.this.GXt_int1 = GXv_int2[0] ;
      AV60HDRO = GXt_int1 ;
      GXt_int1 = AV65Orient ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TORIEN", ""), GXv_int2) ;
      preo004.this.GXt_int1 = GXv_int2[0] ;
      AV65Orient = GXt_int1 ;
      GXt_int1 = AV70Etm ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "ETM", ""), GXv_int2) ;
      preo004.this.GXt_int1 = GXv_int2[0] ;
      AV70Etm = GXt_int1 ;
      GXt_int1 = AV68Tintatex ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TINTAT", ""), GXv_int2) ;
      preo004.this.GXt_int1 = GXv_int2[0] ;
      AV68Tintatex = GXt_int1 ;
      GXt_int1 = AV69Colorsol ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "COLORS", ""), GXv_int2) ;
      preo004.this.GXt_int1 = GXv_int2[0] ;
      AV69Colorsol = GXt_int1 ;
      /* Using cursor P04QZ2 */
      pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarParPan});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P04QZ2_A130BarCodPar[0] ;
         A132BarCodReo = P04QZ2_A132BarCodReo[0] ;
         A129BarCod = P04QZ2_A129BarCod[0] ;
         A396EmprCod = P04QZ2_A396EmprCod[0] ;
         A148BarEstReo = P04QZ2_A148BarEstReo[0] ;
         A212BarSer = P04QZ2_A212BarSer[0] ;
         AV37BarEstReo = A148BarEstReo ;
         AV38BarSer = A212BarSer ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      GXv_char3[0] = AV15EmprCod ;
      GXv_int4[0] = AV16BarCod ;
      GXv_int2[0] = AV17BarCodReo ;
      GXv_char5[0] = AV18BarParPan ;
      GXv_char6[0] = AV21FasCod ;
      GXv_date7[0] = AV54FecTeo ;
      GXv_decimal8[0] = AV57TieTeo ;
      GXv_decimal9[0] = AV56Decalaje ;
      GXv_decimal10[0] = AV55Resto ;
      new app.pcalcul(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int2, GXv_char5, GXv_char6, GXv_date7, GXv_decimal8, GXv_decimal9, GXv_decimal10) ;
      preo004.this.AV15EmprCod = GXv_char3[0] ;
      preo004.this.AV16BarCod = GXv_int4[0] ;
      preo004.this.AV17BarCodReo = GXv_int2[0] ;
      preo004.this.AV18BarParPan = GXv_char5[0] ;
      preo004.this.AV21FasCod = GXv_char6[0] ;
      preo004.this.AV54FecTeo = GXv_date7[0] ;
      preo004.this.AV57TieTeo = GXv_decimal8[0] ;
      preo004.this.AV56Decalaje = GXv_decimal9[0] ;
      preo004.this.AV55Resto = GXv_decimal10[0] ;
      /*
         INSERT RECORD ON TABLE TXPBARFAS

      */
      A396EmprCod = AV15EmprCod ;
      A129BarCod = AV16BarCod ;
      A132BarCodReo = AV17BarCodReo ;
      A130BarCodPar = AV18BarParPan ;
      A758ProCod = AV19ProCod ;
      A194BarOrdLin = AV20BarOrdLin ;
      A457FasCod = AV21FasCod ;
      A216BarTieTeo = AV57TieTeo ;
      A179BarLoc = AV27BarLoc ;
      A603MaqCodBis = AV31MaqCodBis ;
      A152BarFasCon = AV32BarFasCon ;
      A150BarFacTin = AV33BarFacTin ;
      A4022BarNumBot = AV40BarNumBot ;
      A4301BarFasCoP = AV47BarFasCop ;
      A4905BarFasAcab = AV48BarFasAcab ;
      A5047BarFasFPl = AV49barFasFpl ;
      n5047BarFasFPl = false ;
      A5048BarFasUsu = AV50barFasUsu ;
      n5048BarFasUsu = false ;
      A5369BarFasGral = AV51BarFasGral ;
      n5369BarFasGral = false ;
      A5896BarMaqPlan = AV52barMaqPlan ;
      n5896BarMaqPlan = false ;
      A4287BarFasFor = AV53BarFasFor ;
      A6012BarFasTip = GXutil.space( (short)(1)) ;
      n6012BarFasTip = false ;
      A9842BarObsF = AV66BarObsf ;
      n9842BarObsF = false ;
      A10032BarObsB = AV67BarObsb ;
      n10032BarObsB = false ;
      if ( ( ( AV37BarEstReo == 1 ) && ( AV42F_fascer == 1 ) ) || ( ( AV37BarEstReo == 0 ) && ( AV42F_fascer == 1 ) ) )
      {
         A153BarFasEst = AV22BarFasEst ;
         A162BarFecTeo = AV23BarFecTeo ;
         A160BarFecRea = AV24BarFecRea ;
         A3298BarFecRIni = AV39BarFecRIni ;
         A165BarHorIni = AV28BarHorIni ;
         A164BarHorFin = AV29BarHorFin ;
         A215BarTieRea = AV30BarTieRea ;
         A227BarUni = AV26BarUni ;
         A5719BarFasKgT = AV44BarFasKgt ;
         n5719BarFasKgT = false ;
         A5720BarFasMtT = AV46BarFasMtt ;
         n5720BarFasMtT = false ;
         A3837BarFasKgm = AV43BarFasKgm ;
         n3837BarFasKgm = false ;
         A3838BarFasMtr = AV45BarfasMtr ;
         n3838BarFasMtr = false ;
         if ( ( ( AV59TAS == 1 ) || ( AV60HDRO == 1 ) ) && ( AV37BarEstReo == 1 ) )
         {
            A6173BarFasSec = httpContext.getMessage( "OR", "") ;
            n6173BarFasSec = false ;
            A8594BarHdrO = AV63BarHdro ;
            n8594BarHdrO = false ;
            if ( ( AV22BarFasEst == 0 ) && ( AV37BarEstReo == 1 ) )
            {
               A6173BarFasSec = httpContext.getMessage( "OG", "") ;
               n6173BarFasSec = false ;
            }
         }
         A4442BarFasDTI = AV61Barfasdti ;
         n4442BarFasDTI = false ;
         A4443BarFasDTF = AV62BarFasDTF ;
         n4443BarFasDTF = false ;
         if ( AV65Orient == 1 )
         {
            A6012BarFasTip = GXutil.space( (short)(1)) ;
            n6012BarFasTip = false ;
            A8938BarfasPri2 = (short)(0) ;
            n8938BarfasPri2 = false ;
         }
         if ( AV68Tintatex == 1 )
         {
            if ( AV22BarFasEst == 1 )
            {
               A153BarFasEst = (byte)(2) ;
            }
         }
      }
      if ( ( AV37BarEstReo == 1 ) && ( AV42F_fascer == 0 ) )
      {
         A153BarFasEst = (byte)(0) ;
         A162BarFecTeo = GXutil.nullDate() ;
         A160BarFecRea = GXutil.nullDate() ;
         A3298BarFecRIni = GXutil.nullDate() ;
         A165BarHorIni = (short)(0) ;
         A164BarHorFin = (short)(0) ;
         A215BarTieRea = DecimalUtil.ZERO ;
         A227BarUni = DecimalUtil.ZERO ;
         A5719BarFasKgT = DecimalUtil.doubleToDec(0) ;
         n5719BarFasKgT = false ;
         A5720BarFasMtT = DecimalUtil.doubleToDec(0) ;
         n5720BarFasMtT = false ;
         A3837BarFasKgm = DecimalUtil.doubleToDec(0) ;
         n3837BarFasKgm = false ;
         A3838BarFasMtr = DecimalUtil.doubleToDec(0) ;
         n3838BarFasMtr = false ;
         A8594BarHdrO = "" ;
         n8594BarHdrO = false ;
         A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
         n4442BarFasDTI = false ;
         A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
         n4443BarFasDTF = false ;
         if ( AV65Orient == 1 )
         {
            A6012BarFasTip = httpContext.getMessage( "P", "") ;
            n6012BarFasTip = false ;
            A8938BarfasPri2 = (short)(800) ;
            n8938BarfasPri2 = false ;
         }
      }
      if ( ( AV70Etm == 1 ) && ( AV37BarEstReo == 1 ) )
      {
         A6012BarFasTip = httpContext.getMessage( "P", "") ;
         n6012BarFasTip = false ;
         A8938BarfasPri2 = (short)(800) ;
         n8938BarfasPri2 = false ;
      }
      /* Using cursor P04QZ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A152BarFasCon, Byte.valueOf(A153BarFasEst), A603MaqCodBis, A150BarFacTin, A162BarFecTeo, A160BarFecRea, A216BarTieTeo, A227BarUni, Short.valueOf(A165BarHorIni), Short.valueOf(A164BarHorFin), A215BarTieRea, A3298BarFecRIni, A179BarLoc, Boolean.valueOf(n3837BarFasKgm), A3837BarFasKgm, Boolean.valueOf(n3838BarFasMtr), A3838BarFasMtr, Integer.valueOf(A4022BarNumBot), A4287BarFasFor, A4301BarFasCoP, A4905BarFasAcab, Boolean.valueOf(n4442BarFasDTI), A4442BarFasDTI, Boolean.valueOf(n4443BarFasDTF), A4443BarFasDTF, A457FasCod, Boolean.valueOf(n5047BarFasFPl), A5047BarFasFPl, Boolean.valueOf(n5048BarFasUsu), A5048BarFasUsu, Boolean.valueOf(n5369BarFasGral), A5369BarFasGral, Boolean.valueOf(n5719BarFasKgT), A5719BarFasKgT, Boolean.valueOf(n5720BarFasMtT), A5720BarFasMtT, Boolean.valueOf(n5896BarMaqPlan), A5896BarMaqPlan, Boolean.valueOf(n6012BarFasTip), A6012BarFasTip, Boolean.valueOf(n6173BarFasSec), A6173BarFasSec, Boolean.valueOf(n8594BarHdrO), A8594BarHdrO, Boolean.valueOf(n8938BarfasPri2), Short.valueOf(A8938BarfasPri2), Boolean.valueOf(n9842BarObsF), A9842BarObsF, Boolean.valueOf(n10032BarObsB), A10032BarObsB});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
      if ( (pr_default.getStatus(1) == 1) )
      {
         Gx_err = (short)(1) ;
         Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
      }
      else
      {
         Gx_err = (short)(0) ;
         Gx_emsg = "" ;
      }
      /* End Insert */
      AV58Codreo_o = (byte)(AV17BarCodReo-1) ;
      if ( AV58Codreo_o < 0 )
      {
         AV58Codreo_o = (byte)(0) ;
      }
      /* Using cursor P04QZ4 */
      pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV58Codreo_o), AV18BarParPan, AV19ProCod, Short.valueOf(AV20BarOrdLin)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A6602FasStPl = P04QZ4_A6602FasStPl[0] ;
         A5375FasQuiRb = P04QZ4_A5375FasQuiRb[0] ;
         A5374FasQuiTp = P04QZ4_A5374FasQuiTp[0] ;
         A5373FasQuiNp = P04QZ4_A5373FasQuiNp[0] ;
         A194BarOrdLin = P04QZ4_A194BarOrdLin[0] ;
         A758ProCod = P04QZ4_A758ProCod[0] ;
         A130BarCodPar = P04QZ4_A130BarCodPar[0] ;
         A132BarCodReo = P04QZ4_A132BarCodReo[0] ;
         A129BarCod = P04QZ4_A129BarCod[0] ;
         A396EmprCod = P04QZ4_A396EmprCod[0] ;
         A14277FasQuiFabs = P04QZ4_A14277FasQuiFabs[0] ;
         A12125FasQuiAI = P04QZ4_A12125FasQuiAI[0] ;
         A12124FasQuiAs = P04QZ4_A12124FasQuiAs[0] ;
         A11506FasQuiAv = P04QZ4_A11506FasQuiAv[0] ;
         A9722FasQuiVel = P04QZ4_A9722FasQuiVel[0] ;
         A6665FasQuiObs = P04QZ4_A6665FasQuiObs[0] ;
         A6664FasQuiGrm = P04QZ4_A6664FasQuiGrm[0] ;
         A6663FasQuiAnc = P04QZ4_A6663FasQuiAnc[0] ;
         A6601FasOrdPl = P04QZ4_A6601FasOrdPl[0] ;
         A6600FasFecPl = P04QZ4_A6600FasFecPl[0] ;
         A6599FasMaqPl = P04QZ4_A6599FasMaqPl[0] ;
         A764ProForCod = P04QZ4_A764ProForCod[0] ;
         A5371FasQuiLin = P04QZ4_A5371FasQuiLin[0] ;
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W758ProCod = A758ProCod ;
         W194BarOrdLin = A194BarOrdLin ;
         /*
            INSERT RECORD ON TABLE TXPFASQUI

         */
         W396EmprCod = A396EmprCod ;
         W129BarCod = A129BarCod ;
         W132BarCodReo = A132BarCodReo ;
         W130BarCodPar = A130BarCodPar ;
         W758ProCod = A758ProCod ;
         W194BarOrdLin = A194BarOrdLin ;
         W5371FasQuiLin = A5371FasQuiLin ;
         W764ProForCod = A764ProForCod ;
         W5373FasQuiNp = A5373FasQuiNp ;
         W5374FasQuiTp = A5374FasQuiTp ;
         W5375FasQuiRb = A5375FasQuiRb ;
         W764ProForCod = A764ProForCod ;
         W5373FasQuiNp = A5373FasQuiNp ;
         W5374FasQuiTp = A5374FasQuiTp ;
         W5375FasQuiRb = A5375FasQuiRb ;
         W6599FasMaqPl = A6599FasMaqPl ;
         W6600FasFecPl = A6600FasFecPl ;
         W6601FasOrdPl = A6601FasOrdPl ;
         W6602FasStPl = A6602FasStPl ;
         W6665FasQuiObs = A6665FasQuiObs ;
         W6664FasQuiGrm = A6664FasQuiGrm ;
         W6663FasQuiAnc = A6663FasQuiAnc ;
         A396EmprCod = AV15EmprCod ;
         A129BarCod = AV16BarCod ;
         A132BarCodReo = AV17BarCodReo ;
         A130BarCodPar = AV18BarParPan ;
         A758ProCod = AV19ProCod ;
         A194BarOrdLin = AV20BarOrdLin ;
         A5373FasQuiNp = (short)(0) ;
         A5374FasQuiTp = (short)(0) ;
         A5375FasQuiRb = (short)(0) ;
         A6602FasStPl = (byte)(0) ;
         /* Using cursor P04QZ5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin), A764ProForCod, Short.valueOf(A5373FasQuiNp), Short.valueOf(A5374FasQuiTp), Short.valueOf(A5375FasQuiRb), A6599FasMaqPl, A6600FasFecPl, Byte.valueOf(A6601FasOrdPl), Byte.valueOf(A6602FasStPl), Short.valueOf(A6663FasQuiAnc), Short.valueOf(A6664FasQuiGrm), A6665FasQuiObs, A9722FasQuiVel, A11506FasQuiAv, A12124FasQuiAs, A12125FasQuiAI, A14277FasQuiFabs});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASQUI");
         if ( (pr_default.getStatus(3) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         A758ProCod = W758ProCod ;
         A194BarOrdLin = W194BarOrdLin ;
         A5371FasQuiLin = W5371FasQuiLin ;
         A764ProForCod = W764ProForCod ;
         A5373FasQuiNp = W5373FasQuiNp ;
         A5374FasQuiTp = W5374FasQuiTp ;
         A5375FasQuiRb = W5375FasQuiRb ;
         A764ProForCod = W764ProForCod ;
         A5373FasQuiNp = W5373FasQuiNp ;
         A5374FasQuiTp = W5374FasQuiTp ;
         A5375FasQuiRb = W5375FasQuiRb ;
         A6599FasMaqPl = W6599FasMaqPl ;
         A6600FasFecPl = W6600FasFecPl ;
         A6601FasOrdPl = W6601FasOrdPl ;
         A6602FasStPl = W6602FasStPl ;
         A6665FasQuiObs = W6665FasQuiObs ;
         A6664FasQuiGrm = W6664FasQuiGrm ;
         A6663FasQuiAnc = W6663FasQuiAnc ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A129BarCod = W129BarCod ;
         A132BarCodReo = W132BarCodReo ;
         A130BarCodPar = W130BarCodPar ;
         A758ProCod = W758ProCod ;
         A194BarOrdLin = W194BarOrdLin ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = preo004.this.AV15EmprCod;
      this.aP1[0] = preo004.this.AV16BarCod;
      this.aP2[0] = preo004.this.AV17BarCodReo;
      this.aP3[0] = preo004.this.AV18BarParPan;
      this.aP4[0] = preo004.this.AV19ProCod;
      this.aP5[0] = preo004.this.AV20BarOrdLin;
      this.aP6[0] = preo004.this.AV21FasCod;
      this.aP7[0] = preo004.this.AV22BarFasEst;
      this.aP8[0] = preo004.this.AV23BarFecTeo;
      this.aP9[0] = preo004.this.AV24BarFecRea;
      this.aP10[0] = preo004.this.AV39BarFecRIni;
      this.aP11[0] = preo004.this.AV25BarTieTeo;
      this.aP12[0] = preo004.this.AV26BarUni;
      this.aP13[0] = preo004.this.AV27BarLoc;
      this.aP14[0] = preo004.this.AV28BarHorIni;
      this.aP15[0] = preo004.this.AV29BarHorFin;
      this.aP16[0] = preo004.this.AV30BarTieRea;
      this.aP17[0] = preo004.this.AV31MaqCodBis;
      this.aP18[0] = preo004.this.AV32BarFasCon;
      this.aP19[0] = preo004.this.AV33BarFacTin;
      this.aP20[0] = preo004.this.AV40BarNumBot;
      this.aP21[0] = preo004.this.AV43BarFasKgm;
      this.aP22[0] = preo004.this.AV44BarFasKgt;
      this.aP23[0] = preo004.this.AV45BarfasMtr;
      this.aP24[0] = preo004.this.AV46BarFasMtt;
      this.aP25[0] = preo004.this.AV47BarFasCop;
      this.aP26[0] = preo004.this.AV48BarFasAcab;
      this.aP27[0] = preo004.this.AV49barFasFpl;
      this.aP28[0] = preo004.this.AV50barFasUsu;
      this.aP29[0] = preo004.this.AV51BarFasGral;
      this.aP30[0] = preo004.this.AV52barMaqPlan;
      this.aP31[0] = preo004.this.AV53BarFasFor;
      this.aP32[0] = preo004.this.AV61Barfasdti;
      this.aP33[0] = preo004.this.AV62BarFasDTF;
      this.aP34[0] = preo004.this.AV63BarHdro;
      this.aP35[0] = preo004.this.AV66BarObsf;
      this.aP36[0] = preo004.this.AV67BarObsb;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P04QZ2_A130BarCodPar = new String[] {""} ;
      P04QZ2_A132BarCodReo = new byte[1] ;
      P04QZ2_A129BarCod = new int[1] ;
      P04QZ2_A396EmprCod = new String[] {""} ;
      P04QZ2_A148BarEstReo = new byte[1] ;
      P04QZ2_A212BarSer = new String[] {""} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A212BarSer = "" ;
      AV38BarSer = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int2 = new byte[1] ;
      GXv_char5 = new String[1] ;
      GXv_char6 = new String[1] ;
      AV54FecTeo = GXutil.nullDate() ;
      GXv_date7 = new java.util.Date[1] ;
      AV57TieTeo = DecimalUtil.ZERO ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      AV56Decalaje = DecimalUtil.ZERO ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      AV55Resto = DecimalUtil.ZERO ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A179BarLoc = "" ;
      A603MaqCodBis = "" ;
      A152BarFasCon = "" ;
      A150BarFacTin = "" ;
      A4301BarFasCoP = "" ;
      A4905BarFasAcab = "" ;
      A5047BarFasFPl = GXutil.nullDate() ;
      A5048BarFasUsu = "" ;
      A5369BarFasGral = "" ;
      A5896BarMaqPlan = "" ;
      A4287BarFasFor = "" ;
      A6012BarFasTip = "" ;
      A9842BarObsF = "" ;
      A10032BarObsB = "" ;
      A162BarFecTeo = GXutil.nullDate() ;
      A160BarFecRea = GXutil.nullDate() ;
      A3298BarFecRIni = GXutil.nullDate() ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A227BarUni = DecimalUtil.ZERO ;
      A5719BarFasKgT = DecimalUtil.ZERO ;
      A5720BarFasMtT = DecimalUtil.ZERO ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A6173BarFasSec = "" ;
      A8594BarHdrO = "" ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      Gx_emsg = "" ;
      P04QZ4_A6602FasStPl = new byte[1] ;
      P04QZ4_A5375FasQuiRb = new short[1] ;
      P04QZ4_A5374FasQuiTp = new short[1] ;
      P04QZ4_A5373FasQuiNp = new short[1] ;
      P04QZ4_A194BarOrdLin = new short[1] ;
      P04QZ4_A758ProCod = new String[] {""} ;
      P04QZ4_A130BarCodPar = new String[] {""} ;
      P04QZ4_A132BarCodReo = new byte[1] ;
      P04QZ4_A129BarCod = new int[1] ;
      P04QZ4_A396EmprCod = new String[] {""} ;
      P04QZ4_A14277FasQuiFabs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QZ4_A12125FasQuiAI = new String[] {""} ;
      P04QZ4_A12124FasQuiAs = new String[] {""} ;
      P04QZ4_A11506FasQuiAv = new String[] {""} ;
      P04QZ4_A9722FasQuiVel = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P04QZ4_A6665FasQuiObs = new String[] {""} ;
      P04QZ4_A6664FasQuiGrm = new short[1] ;
      P04QZ4_A6663FasQuiAnc = new short[1] ;
      P04QZ4_A6601FasOrdPl = new byte[1] ;
      P04QZ4_A6600FasFecPl = new java.util.Date[] {GXutil.nullDate()} ;
      P04QZ4_A6599FasMaqPl = new String[] {""} ;
      P04QZ4_A764ProForCod = new String[] {""} ;
      P04QZ4_A5371FasQuiLin = new short[1] ;
      A14277FasQuiFabs = DecimalUtil.ZERO ;
      A12125FasQuiAI = "" ;
      A12124FasQuiAs = "" ;
      A11506FasQuiAv = "" ;
      A9722FasQuiVel = DecimalUtil.ZERO ;
      A6665FasQuiObs = "" ;
      A6600FasFecPl = GXutil.nullDate() ;
      A6599FasMaqPl = "" ;
      A764ProForCod = "" ;
      W396EmprCod = "" ;
      W130BarCodPar = "" ;
      W758ProCod = "" ;
      W764ProForCod = "" ;
      W6599FasMaqPl = "" ;
      W6600FasFecPl = GXutil.nullDate() ;
      W6665FasQuiObs = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.preo004__default(),
         new Object[] {
             new Object[] {
            P04QZ2_A130BarCodPar, P04QZ2_A132BarCodReo, P04QZ2_A129BarCod, P04QZ2_A396EmprCod, P04QZ2_A148BarEstReo, P04QZ2_A212BarSer
            }
            , new Object[] {
            }
            , new Object[] {
            P04QZ4_A6602FasStPl, P04QZ4_A5375FasQuiRb, P04QZ4_A5374FasQuiTp, P04QZ4_A5373FasQuiNp, P04QZ4_A194BarOrdLin, P04QZ4_A758ProCod, P04QZ4_A130BarCodPar, P04QZ4_A132BarCodReo, P04QZ4_A129BarCod, P04QZ4_A396EmprCod,
            P04QZ4_A14277FasQuiFabs, P04QZ4_A12125FasQuiAI, P04QZ4_A12124FasQuiAs, P04QZ4_A11506FasQuiAv, P04QZ4_A9722FasQuiVel, P04QZ4_A6665FasQuiObs, P04QZ4_A6664FasQuiGrm, P04QZ4_A6663FasQuiAnc, P04QZ4_A6601FasOrdPl, P04QZ4_A6600FasFecPl,
            P04QZ4_A6599FasMaqPl, P04QZ4_A764ProForCod, P04QZ4_A5371FasQuiLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte AV22BarFasEst ;
   private byte AV42F_fascer ;
   private byte AV59TAS ;
   private byte AV60HDRO ;
   private byte AV65Orient ;
   private byte AV70Etm ;
   private byte AV68Tintatex ;
   private byte AV69Colorsol ;
   private byte GXt_int1 ;
   private byte A132BarCodReo ;
   private byte A148BarEstReo ;
   private byte AV37BarEstReo ;
   private byte GXv_int2[] ;
   private byte A153BarFasEst ;
   private byte AV58Codreo_o ;
   private byte A6602FasStPl ;
   private byte A6601FasOrdPl ;
   private byte W132BarCodReo ;
   private byte W6601FasOrdPl ;
   private byte W6602FasStPl ;
   private short AV20BarOrdLin ;
   private short AV28BarHorIni ;
   private short AV29BarHorFin ;
   private short A194BarOrdLin ;
   private short A165BarHorIni ;
   private short A164BarHorFin ;
   private short A8938BarfasPri2 ;
   private short Gx_err ;
   private short A5375FasQuiRb ;
   private short A5374FasQuiTp ;
   private short A5373FasQuiNp ;
   private short A6664FasQuiGrm ;
   private short A6663FasQuiAnc ;
   private short A5371FasQuiLin ;
   private short W194BarOrdLin ;
   private short W5371FasQuiLin ;
   private short W5373FasQuiNp ;
   private short W5374FasQuiTp ;
   private short W5375FasQuiRb ;
   private short W6664FasQuiGrm ;
   private short W6663FasQuiAnc ;
   private int AV16BarCod ;
   private int AV40BarNumBot ;
   private int A129BarCod ;
   private int GXv_int4[] ;
   private int GX_INS15 ;
   private int A4022BarNumBot ;
   private int W129BarCod ;
   private int GX_INS779 ;
   private java.math.BigDecimal AV25BarTieTeo ;
   private java.math.BigDecimal AV26BarUni ;
   private java.math.BigDecimal AV30BarTieRea ;
   private java.math.BigDecimal AV43BarFasKgm ;
   private java.math.BigDecimal AV44BarFasKgt ;
   private java.math.BigDecimal AV45BarfasMtr ;
   private java.math.BigDecimal AV46BarFasMtt ;
   private java.math.BigDecimal AV57TieTeo ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal AV56Decalaje ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal AV55Resto ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A227BarUni ;
   private java.math.BigDecimal A5719BarFasKgT ;
   private java.math.BigDecimal A5720BarFasMtT ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal A14277FasQuiFabs ;
   private java.math.BigDecimal A9722FasQuiVel ;
   private String AV15EmprCod ;
   private String AV18BarParPan ;
   private String AV19ProCod ;
   private String AV21FasCod ;
   private String AV27BarLoc ;
   private String AV31MaqCodBis ;
   private String AV32BarFasCon ;
   private String AV33BarFacTin ;
   private String AV47BarFasCop ;
   private String AV48BarFasAcab ;
   private String AV50barFasUsu ;
   private String AV51BarFasGral ;
   private String AV52barMaqPlan ;
   private String AV53BarFasFor ;
   private String AV63BarHdro ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A212BarSer ;
   private String AV38BarSer ;
   private String GXv_char3[] ;
   private String GXv_char5[] ;
   private String GXv_char6[] ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String A179BarLoc ;
   private String A603MaqCodBis ;
   private String A152BarFasCon ;
   private String A150BarFacTin ;
   private String A4301BarFasCoP ;
   private String A4905BarFasAcab ;
   private String A5048BarFasUsu ;
   private String A5369BarFasGral ;
   private String A5896BarMaqPlan ;
   private String A4287BarFasFor ;
   private String A6012BarFasTip ;
   private String A6173BarFasSec ;
   private String A8594BarHdrO ;
   private String Gx_emsg ;
   private String A12125FasQuiAI ;
   private String A12124FasQuiAs ;
   private String A11506FasQuiAv ;
   private String A6599FasMaqPl ;
   private String A764ProForCod ;
   private String W396EmprCod ;
   private String W130BarCodPar ;
   private String W758ProCod ;
   private String W764ProForCod ;
   private String W6599FasMaqPl ;
   private java.util.Date AV61Barfasdti ;
   private java.util.Date AV62BarFasDTF ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date AV23BarFecTeo ;
   private java.util.Date AV24BarFecRea ;
   private java.util.Date AV39BarFecRIni ;
   private java.util.Date AV49barFasFpl ;
   private java.util.Date AV54FecTeo ;
   private java.util.Date GXv_date7[] ;
   private java.util.Date A5047BarFasFPl ;
   private java.util.Date A162BarFecTeo ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date A3298BarFecRIni ;
   private java.util.Date A6600FasFecPl ;
   private java.util.Date W6600FasFecPl ;
   private boolean n5047BarFasFPl ;
   private boolean n5048BarFasUsu ;
   private boolean n5369BarFasGral ;
   private boolean n5896BarMaqPlan ;
   private boolean n6012BarFasTip ;
   private boolean n9842BarObsF ;
   private boolean n10032BarObsB ;
   private boolean n5719BarFasKgT ;
   private boolean n5720BarFasMtT ;
   private boolean n3837BarFasKgm ;
   private boolean n3838BarFasMtr ;
   private boolean n6173BarFasSec ;
   private boolean n8594BarHdrO ;
   private boolean n4442BarFasDTI ;
   private boolean n4443BarFasDTF ;
   private boolean n8938BarfasPri2 ;
   private String AV66BarObsf ;
   private String AV67BarObsb ;
   private String A9842BarObsF ;
   private String A10032BarObsB ;
   private String A6665FasQuiObs ;
   private String W6665FasQuiObs ;
   private String[] aP36 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private String[] aP6 ;
   private byte[] aP7 ;
   private java.util.Date[] aP8 ;
   private java.util.Date[] aP9 ;
   private java.util.Date[] aP10 ;
   private java.math.BigDecimal[] aP11 ;
   private java.math.BigDecimal[] aP12 ;
   private String[] aP13 ;
   private short[] aP14 ;
   private short[] aP15 ;
   private java.math.BigDecimal[] aP16 ;
   private String[] aP17 ;
   private String[] aP18 ;
   private String[] aP19 ;
   private int[] aP20 ;
   private java.math.BigDecimal[] aP21 ;
   private java.math.BigDecimal[] aP22 ;
   private java.math.BigDecimal[] aP23 ;
   private java.math.BigDecimal[] aP24 ;
   private String[] aP25 ;
   private String[] aP26 ;
   private java.util.Date[] aP27 ;
   private String[] aP28 ;
   private String[] aP29 ;
   private String[] aP30 ;
   private String[] aP31 ;
   private java.util.Date[] aP32 ;
   private java.util.Date[] aP33 ;
   private String[] aP34 ;
   private String[] aP35 ;
   private IDataStoreProvider pr_default ;
   private String[] P04QZ2_A130BarCodPar ;
   private byte[] P04QZ2_A132BarCodReo ;
   private int[] P04QZ2_A129BarCod ;
   private String[] P04QZ2_A396EmprCod ;
   private byte[] P04QZ2_A148BarEstReo ;
   private String[] P04QZ2_A212BarSer ;
   private byte[] P04QZ4_A6602FasStPl ;
   private short[] P04QZ4_A5375FasQuiRb ;
   private short[] P04QZ4_A5374FasQuiTp ;
   private short[] P04QZ4_A5373FasQuiNp ;
   private short[] P04QZ4_A194BarOrdLin ;
   private String[] P04QZ4_A758ProCod ;
   private String[] P04QZ4_A130BarCodPar ;
   private byte[] P04QZ4_A132BarCodReo ;
   private int[] P04QZ4_A129BarCod ;
   private String[] P04QZ4_A396EmprCod ;
   private java.math.BigDecimal[] P04QZ4_A14277FasQuiFabs ;
   private String[] P04QZ4_A12125FasQuiAI ;
   private String[] P04QZ4_A12124FasQuiAs ;
   private String[] P04QZ4_A11506FasQuiAv ;
   private java.math.BigDecimal[] P04QZ4_A9722FasQuiVel ;
   private String[] P04QZ4_A6665FasQuiObs ;
   private short[] P04QZ4_A6664FasQuiGrm ;
   private short[] P04QZ4_A6663FasQuiAnc ;
   private byte[] P04QZ4_A6601FasOrdPl ;
   private java.util.Date[] P04QZ4_A6600FasFecPl ;
   private String[] P04QZ4_A6599FasMaqPl ;
   private String[] P04QZ4_A764ProForCod ;
   private short[] P04QZ4_A5371FasQuiLin ;
}

final  class preo004__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04QZ2", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarEstReo, BarSer FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04QZ3", "INSERT INTO TXPBARFAS(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasCon, BarFasEst, MaqCodBis, BarFacTin, BarFecTeo, BarFecRea, BarTieTeo, BarUni, BarHorIni, BarHorFin, BarTieRea, BarFecRIni, BarLoc, BarFasKgm, BarFasMtr, BarNumBot, BarFasFor, BarFasCoP, BarFasAcab, BarFasDTI, BarFasDTF, FasCod, BarFasFPl, BarFasUsu, BarFasGral, BarFasKgT, BarFasMtT, BarMaqPlan, BarFasTip, BarFasSec, BarHdrO, BarfasPri2, BarObsF, BarObsB, BarFasBot, BarNPzas, BarFasPzas, BarFasCara, BarUltNlot, BarFasInc, BarFasKPr, BarFasPPr, BarFasAgr, BarFasPrp, FasQuiUl, BarFasCR, BarfasMn, BarfasOP, BarHdMn, BarTieAut, BarFasNPl, Barfastpp, BarfasUnpL, BarfasRb, Dtb_UOrd, BarFasPri, BarFasSer, BarFasObs, BarFasTOb, BarFasBlq, TsSolTLcq, TsSolTFec, TsSolRLcq, TsSolRFec, TsSolObs, SolLvLnUl, SolAgLnUl, SolFrLnUl, SolSAcLnUl, SolSAlLnUl, SolPlLnUl, SolLzLnUl, SolAfLnUl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new ForEachCursor("P04QZ4", "SELECT FasStPl, FasQuiRb, FasQuiTp, FasQuiNp, BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, EmprCod, FasQuiFabs, FasQuiAI, FasQuiAs, FasQuiAv, FasQuiVel, FasQuiObs, FasQuiGrm, FasQuiAnc, FasOrdPl, FasFecPl, FasMaqPl, ProForCod, FasQuiLin FROM TXPFASQUI WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04QZ5", "INSERT INTO TXPFASQUI(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin, ProForCod, FasQuiNp, FasQuiTp, FasQuiRb, FasMaqPl, FasFecPl, FasOrdPl, FasStPl, FasQuiAnc, FasQuiGrm, FasQuiObs, FasQuiVel, FasQuiAv, FasQuiAs, FasQuiAI, FasQuiFabs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASQUI")
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
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[11])[0] = rslt.getString(12, 3);
               ((String[]) buf[12])[0] = rslt.getString(13, 3);
               ((String[]) buf[13])[0] = rslt.getString(14, 4);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,1);
               ((String[]) buf[15])[0] = rslt.getVarchar(16);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((short[]) buf[17])[0] = rslt.getShort(18);
               ((byte[]) buf[18])[0] = rslt.getByte(19);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(20);
               ((String[]) buf[20])[0] = rslt.getString(21, 6);
               ((String[]) buf[21])[0] = rslt.getString(22, 6);
               ((short[]) buf[22])[0] = rslt.getShort(23);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 1);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 6);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setDate(11, (java.util.Date)parms[10]);
               stmt.setDate(12, (java.util.Date)parms[11]);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 2);
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[13], 2);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[16], 2);
               stmt.setDate(18, (java.util.Date)parms[17]);
               stmt.setString(19, (String)parms[18], 10);
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(21, (java.math.BigDecimal)parms[22], 2);
               }
               stmt.setInt(22, ((Number) parms[23]).intValue());
               stmt.setString(23, (String)parms[24], 1);
               stmt.setString(24, (String)parms[25], 1);
               stmt.setString(25, (String)parms[26], 1);
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(26, (java.util.Date)parms[28], false);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(27, (java.util.Date)parms[30], false);
               }
               stmt.setString(28, (String)parms[31], 8);
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.DATE );
               }
               else
               {
                  stmt.setDate(29, (java.util.Date)parms[33]);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[35], 8);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[37], 1);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(32, (java.math.BigDecimal)parms[39], 2);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(33, (java.math.BigDecimal)parms[41], 2);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[43], 6);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(35, (String)parms[45], 1);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(36, (String)parms[47], 2);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(37, (String)parms[49], 11);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(38, ((Number) parms[51]).shortValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(39, (String)parms[53], 3000);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(40, (String)parms[55], 3000);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 6);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setString(12, (String)parms[11], 6);
               stmt.setDate(13, (java.util.Date)parms[12]);
               stmt.setByte(14, ((Number) parms[13]).byteValue());
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setShort(17, ((Number) parms[16]).shortValue());
               stmt.setVarchar(18, (String)parms[17], 400, false);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[18], 1);
               stmt.setString(20, (String)parms[19], 4);
               stmt.setString(21, (String)parms[20], 3);
               stmt.setString(22, (String)parms[21], 3);
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[22], 2);
               return;
      }
   }

}

