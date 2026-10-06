package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pprofs04 extends GXProcedure
{
   public pprofs04( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pprofs04.class ), "" );
   }

   public pprofs04( int remoteHandle ,
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
                             String[] aP7 )
   {
      pprofs04.this.aP8 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
      return aP8[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      pprofs04.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pprofs04.this.AV8BarCod = aP1[0];
      this.aP1 = aP1;
      pprofs04.this.AV9BarCodReo = aP2[0];
      this.aP2 = aP2;
      pprofs04.this.AV10BarCodPar = aP3[0];
      this.aP3 = aP3;
      pprofs04.this.AV11ProCod = aP4[0];
      this.aP4 = aP4;
      pprofs04.this.AV12BarOrdLin = aP5[0];
      this.aP5 = aP5;
      pprofs04.this.AV13Fascod = aP6[0];
      this.aP6 = aP6;
      pprofs04.this.AV14Usurcod = aP7[0];
      this.aP7 = aP7;
      pprofs04.this.AV15Station = aP8[0];
      this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV17Etm ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ETM", ""), GXv_int2) ;
      pprofs04.this.GXt_int1 = GXv_int2[0] ;
      AV17Etm = GXt_int1 ;
      /* Using cursor P04VK2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar, AV11ProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A129BarCod = P04VK2_A129BarCod[0] ;
         A132BarCodReo = P04VK2_A132BarCodReo[0] ;
         A130BarCodPar = P04VK2_A130BarCodPar[0] ;
         A758ProCod = P04VK2_A758ProCod[0] ;
         A194BarOrdLin = P04VK2_A194BarOrdLin[0] ;
         AV16Lastord = A194BarOrdLin ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Using cursor P04VK3 */
      pr_default.execute(1, new Object[] {A396EmprCod, AV13Fascod});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A602MaqCod = P04VK3_A602MaqCod[0] ;
         n602MaqCod = P04VK3_n602MaqCod[0] ;
         A456FasActTin = P04VK3_A456FasActTin[0] ;
         n456FasActTin = P04VK3_n456FasActTin[0] ;
         A458FasCon = P04VK3_A458FasCon[0] ;
         n458FasCon = P04VK3_n458FasCon[0] ;
         A4286FasForMul = P04VK3_A4286FasForMul[0] ;
         n4286FasForMul = P04VK3_n4286FasForMul[0] ;
         A4639FasCara = P04VK3_A4639FasCara[0] ;
         n4639FasCara = P04VK3_n4639FasCara[0] ;
         A4299FasConPla = P04VK3_A4299FasConPla[0] ;
         n4299FasConPla = P04VK3_n4299FasConPla[0] ;
         A4903FasAcab = P04VK3_A4903FasAcab[0] ;
         n4903FasAcab = P04VK3_n4903FasAcab[0] ;
         A5368FasGral = P04VK3_A5368FasGral[0] ;
         n5368FasGral = P04VK3_n5368FasGral[0] ;
         A457FasCod = P04VK3_A457FasCod[0] ;
         W396EmprCod = A396EmprCod ;
         W457FasCod = A457FasCod ;
         /*
            INSERT RECORD ON TABLE TXPBARFAS

         */
         W396EmprCod = A396EmprCod ;
         W457FasCod = A457FasCod ;
         A129BarCod = AV8BarCod ;
         A132BarCodReo = AV9BarCodReo ;
         A130BarCodPar = AV10BarCodPar ;
         A758ProCod = AV11ProCod ;
         A194BarOrdLin = AV12BarOrdLin ;
         A457FasCod = AV13Fascod ;
         A603MaqCodBis = A602MaqCod ;
         A150BarFacTin = A456FasActTin ;
         A152BarFasCon = A458FasCon ;
         A4287BarFasFor = A4286FasForMul ;
         A4637BarFasCara = A4639FasCara ;
         A4301BarFasCoP = A4299FasConPla ;
         A4905BarFasAcab = A4903FasAcab ;
         A4638BarUltNlot = 0 ;
         n4638BarUltNlot = false ;
         A4021BarFasBot = GXutil.space( (short)(1)) ;
         A4022BarNumBot = 0 ;
         A5369BarFasGral = A5368FasGral ;
         n5369BarFasGral = false ;
         A5047BarFasFPl = GXutil.nullDate() ;
         n5047BarFasFPl = false ;
         A5048BarFasUsu = AV14Usurcod ;
         n5048BarFasUsu = false ;
         A179BarLoc = "" ;
         A3836BarFasPri = (byte)(0) ;
         A5896BarMaqPlan = "" ;
         n5896BarMaqPlan = false ;
         A160BarFecRea = GXutil.nullDate() ;
         A227BarUni = DecimalUtil.doubleToDec(0) ;
         A165BarHorIni = (short)(0) ;
         A164BarHorFin = (short)(0) ;
         A215BarTieRea = DecimalUtil.doubleToDec(0) ;
         A3298BarFecRIni = GXutil.nullDate() ;
         A3837BarFasKgm = DecimalUtil.doubleToDec(0) ;
         n3837BarFasKgm = false ;
         A3838BarFasMtr = DecimalUtil.doubleToDec(0) ;
         n3838BarFasMtr = false ;
         A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
         n4442BarFasDTI = false ;
         A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
         n4443BarFasDTF = false ;
         A153BarFasEst = (byte)(0) ;
         A6173BarFasSec = httpContext.getMessage( "IN", "") ;
         n6173BarFasSec = false ;
         A6390BarfasMn = "" ;
         n6390BarfasMn = false ;
         A6391BarfasOP = (short)(0) ;
         n6391BarfasOP = false ;
         A6392BarHdMn = "" ;
         n6392BarHdMn = false ;
         A6430BarTieAut = (short)(0) ;
         A6555BarFasNPl = (byte)(0) ;
         A7914BarfasRb = DecimalUtil.doubleToDec(0) ;
         n7914BarfasRb = false ;
         A7913BarfasUnpL = DecimalUtil.doubleToDec(0) ;
         n7913BarfasUnpL = false ;
         A7912Barfastpp = DecimalUtil.doubleToDec(0) ;
         n7912Barfastpp = false ;
         A7933Dtb_UOrd = (short)(0) ;
         n7933Dtb_UOrd = false ;
         A3836BarFasPri = (byte)(80) ;
         A8938BarfasPri2 = (short)(80) ;
         n8938BarfasPri2 = false ;
         if ( AV17Etm == 1 )
         {
            A6012BarFasTip = httpContext.getMessage( "P", "") ;
            n6012BarFasTip = false ;
            A8938BarfasPri2 = (short)(800) ;
            n8938BarfasPri2 = false ;
         }
         else
         {
            A6012BarFasTip = " " ;
            n6012BarFasTip = false ;
         }
         A5372FasQuiUl = (short)(0) ;
         n5372FasQuiUl = false ;
         /* Using cursor P04VK4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), A152BarFasCon, Byte.valueOf(A153BarFasEst), A603MaqCodBis, A150BarFacTin, A160BarFecRea, A227BarUni, Short.valueOf(A165BarHorIni), Short.valueOf(A164BarHorFin), A215BarTieRea, A3298BarFecRIni, A179BarLoc, Boolean.valueOf(n3837BarFasKgm), A3837BarFasKgm, Boolean.valueOf(n3838BarFasMtr), A3838BarFasMtr, A4021BarFasBot, Integer.valueOf(A4022BarNumBot), A4287BarFasFor, A4301BarFasCoP, A4637BarFasCara, Boolean.valueOf(n4638BarUltNlot), Integer.valueOf(A4638BarUltNlot), A4905BarFasAcab, Boolean.valueOf(n4442BarFasDTI), A4442BarFasDTI, Boolean.valueOf(n4443BarFasDTF), A4443BarFasDTF, A457FasCod, Boolean.valueOf(n5047BarFasFPl), A5047BarFasFPl, Boolean.valueOf(n5048BarFasUsu), A5048BarFasUsu, Boolean.valueOf(n5369BarFasGral), A5369BarFasGral, Boolean.valueOf(n5372FasQuiUl), Short.valueOf(A5372FasQuiUl), Boolean.valueOf(n5896BarMaqPlan), A5896BarMaqPlan, Boolean.valueOf(n6012BarFasTip), A6012BarFasTip, Boolean.valueOf(n6173BarFasSec), A6173BarFasSec, Boolean.valueOf(n6390BarfasMn), A6390BarfasMn, Boolean.valueOf(n6391BarfasOP), Short.valueOf(A6391BarfasOP), Boolean.valueOf(n6392BarHdMn), A6392BarHdMn, Short.valueOf(A6430BarTieAut), Byte.valueOf(A6555BarFasNPl), Boolean.valueOf(n7912Barfastpp), A7912Barfastpp, Boolean.valueOf(n7913BarfasUnpL), A7913BarfasUnpL, Boolean.valueOf(n7914BarfasRb), A7914BarfasRb, Boolean.valueOf(n7933Dtb_UOrd), Short.valueOf(A7933Dtb_UOrd), Boolean.valueOf(n8938BarfasPri2), Short.valueOf(A8938BarfasPri2), Byte.valueOf(A3836BarFasPri)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARFAS");
         if ( (pr_default.getStatus(2) == 1) )
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
         A457FasCod = W457FasCod ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A457FasCod = W457FasCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV18FasQuiUl = (short)(5) ;
      /* Using cursor P04VK5 */
      pr_default.execute(3, new Object[] {A396EmprCod, AV13Fascod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A764ProForCod = P04VK5_A764ProForCod[0] ;
         A457FasCod = P04VK5_A457FasCod[0] ;
         A4650FasForLin = P04VK5_A4650FasForLin[0] ;
         W396EmprCod = A396EmprCod ;
         /*
            INSERT RECORD ON TABLE TXPFASQUI

         */
         W396EmprCod = A396EmprCod ;
         W764ProForCod = A764ProForCod ;
         A129BarCod = AV8BarCod ;
         A132BarCodReo = AV9BarCodReo ;
         A130BarCodPar = AV10BarCodPar ;
         A758ProCod = AV11ProCod ;
         A194BarOrdLin = AV12BarOrdLin ;
         A5371FasQuiLin = AV18FasQuiUl ;
         /* Using cursor P04VK6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A758ProCod, Short.valueOf(A194BarOrdLin), Short.valueOf(A5371FasQuiLin), A764ProForCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASQUI");
         if ( (pr_default.getStatus(4) == 1) )
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
         A764ProForCod = W764ProForCod ;
         /* End Insert */
         AV18FasQuiUl = (short)(AV18FasQuiUl+1) ;
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(3);
      }
      pr_default.close(3);
      /* Using cursor P04VK7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar, AV11ProCod, Short.valueOf(AV12BarOrdLin)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A194BarOrdLin = P04VK7_A194BarOrdLin[0] ;
         A758ProCod = P04VK7_A758ProCod[0] ;
         A130BarCodPar = P04VK7_A130BarCodPar[0] ;
         A132BarCodReo = P04VK7_A132BarCodReo[0] ;
         A129BarCod = P04VK7_A129BarCod[0] ;
         A5372FasQuiUl = P04VK7_A5372FasQuiUl[0] ;
         n5372FasQuiUl = P04VK7_n5372FasQuiUl[0] ;
         AV18FasQuiUl = (short)(A5372FasQuiUl+5) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(5);
      if ( AV12BarOrdLin > AV16Lastord )
      {
         n761ProFasLin = false ;
         /* Optimized UPDATE. */
         /* Using cursor P04VK8 */
         pr_default.execute(6, new Object[] {Boolean.valueOf(n761ProFasLin), Short.valueOf(AV12BarOrdLin), A396EmprCod, Integer.valueOf(AV8BarCod), Byte.valueOf(AV9BarCodReo), AV10BarCodPar, AV11ProCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARPRO");
         /* End optimized UPDATE. */
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pprofs04.this.A396EmprCod;
      this.aP1[0] = pprofs04.this.AV8BarCod;
      this.aP2[0] = pprofs04.this.AV9BarCodReo;
      this.aP3[0] = pprofs04.this.AV10BarCodPar;
      this.aP4[0] = pprofs04.this.AV11ProCod;
      this.aP5[0] = pprofs04.this.AV12BarOrdLin;
      this.aP6[0] = pprofs04.this.AV13Fascod;
      this.aP7[0] = pprofs04.this.AV14Usurcod;
      this.aP8[0] = pprofs04.this.AV15Station;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      scmdbuf = "" ;
      P04VK2_A396EmprCod = new String[] {""} ;
      P04VK2_A129BarCod = new int[1] ;
      P04VK2_A132BarCodReo = new byte[1] ;
      P04VK2_A130BarCodPar = new String[] {""} ;
      P04VK2_A758ProCod = new String[] {""} ;
      P04VK2_A194BarOrdLin = new short[1] ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      P04VK3_A396EmprCod = new String[] {""} ;
      P04VK3_A602MaqCod = new String[] {""} ;
      P04VK3_n602MaqCod = new boolean[] {false} ;
      P04VK3_A456FasActTin = new String[] {""} ;
      P04VK3_n456FasActTin = new boolean[] {false} ;
      P04VK3_A458FasCon = new String[] {""} ;
      P04VK3_n458FasCon = new boolean[] {false} ;
      P04VK3_A4286FasForMul = new String[] {""} ;
      P04VK3_n4286FasForMul = new boolean[] {false} ;
      P04VK3_A4639FasCara = new String[] {""} ;
      P04VK3_n4639FasCara = new boolean[] {false} ;
      P04VK3_A4299FasConPla = new String[] {""} ;
      P04VK3_n4299FasConPla = new boolean[] {false} ;
      P04VK3_A4903FasAcab = new String[] {""} ;
      P04VK3_n4903FasAcab = new boolean[] {false} ;
      P04VK3_A5368FasGral = new String[] {""} ;
      P04VK3_n5368FasGral = new boolean[] {false} ;
      P04VK3_A457FasCod = new String[] {""} ;
      A602MaqCod = "" ;
      A456FasActTin = "" ;
      A458FasCon = "" ;
      A4286FasForMul = "" ;
      A4639FasCara = "" ;
      A4299FasConPla = "" ;
      A4903FasAcab = "" ;
      A5368FasGral = "" ;
      A457FasCod = "" ;
      W396EmprCod = "" ;
      W457FasCod = "" ;
      A603MaqCodBis = "" ;
      A150BarFacTin = "" ;
      A152BarFasCon = "" ;
      A4287BarFasFor = "" ;
      A4637BarFasCara = "" ;
      A4301BarFasCoP = "" ;
      A4905BarFasAcab = "" ;
      A4021BarFasBot = "" ;
      A5369BarFasGral = "" ;
      A5047BarFasFPl = GXutil.nullDate() ;
      A5048BarFasUsu = "" ;
      A179BarLoc = "" ;
      A5896BarMaqPlan = "" ;
      A160BarFecRea = GXutil.nullDate() ;
      A227BarUni = DecimalUtil.ZERO ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A3298BarFecRIni = GXutil.nullDate() ;
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A6173BarFasSec = "" ;
      A6390BarfasMn = "" ;
      A6392BarHdMn = "" ;
      A7914BarfasRb = DecimalUtil.ZERO ;
      A7913BarfasUnpL = DecimalUtil.ZERO ;
      A7912Barfastpp = DecimalUtil.ZERO ;
      A6012BarFasTip = "" ;
      Gx_emsg = "" ;
      P04VK5_A396EmprCod = new String[] {""} ;
      P04VK5_A764ProForCod = new String[] {""} ;
      P04VK5_A457FasCod = new String[] {""} ;
      P04VK5_A4650FasForLin = new short[1] ;
      A764ProForCod = "" ;
      W764ProForCod = "" ;
      P04VK7_A396EmprCod = new String[] {""} ;
      P04VK7_A194BarOrdLin = new short[1] ;
      P04VK7_A758ProCod = new String[] {""} ;
      P04VK7_A130BarCodPar = new String[] {""} ;
      P04VK7_A132BarCodReo = new byte[1] ;
      P04VK7_A129BarCod = new int[1] ;
      P04VK7_A5372FasQuiUl = new short[1] ;
      P04VK7_n5372FasQuiUl = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pprofs04__default(),
         new Object[] {
             new Object[] {
            P04VK2_A396EmprCod, P04VK2_A129BarCod, P04VK2_A132BarCodReo, P04VK2_A130BarCodPar, P04VK2_A758ProCod, P04VK2_A194BarOrdLin
            }
            , new Object[] {
            P04VK3_A396EmprCod, P04VK3_A602MaqCod, P04VK3_n602MaqCod, P04VK3_A456FasActTin, P04VK3_n456FasActTin, P04VK3_A458FasCon, P04VK3_n458FasCon, P04VK3_A4286FasForMul, P04VK3_n4286FasForMul, P04VK3_A4639FasCara,
            P04VK3_n4639FasCara, P04VK3_A4299FasConPla, P04VK3_n4299FasConPla, P04VK3_A4903FasAcab, P04VK3_n4903FasAcab, P04VK3_A5368FasGral, P04VK3_n5368FasGral, P04VK3_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            P04VK5_A396EmprCod, P04VK5_A764ProForCod, P04VK5_A457FasCod, P04VK5_A4650FasForLin
            }
            , new Object[] {
            }
            , new Object[] {
            P04VK7_A396EmprCod, P04VK7_A194BarOrdLin, P04VK7_A758ProCod, P04VK7_A130BarCodPar, P04VK7_A132BarCodReo, P04VK7_A129BarCod, P04VK7_A5372FasQuiUl, P04VK7_n5372FasQuiUl
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9BarCodReo ;
   private byte AV17Etm ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte A132BarCodReo ;
   private byte A3836BarFasPri ;
   private byte A153BarFasEst ;
   private byte A6555BarFasNPl ;
   private short AV12BarOrdLin ;
   private short A194BarOrdLin ;
   private short AV16Lastord ;
   private short A165BarHorIni ;
   private short A164BarHorFin ;
   private short A6391BarfasOP ;
   private short A6430BarTieAut ;
   private short A7933Dtb_UOrd ;
   private short A8938BarfasPri2 ;
   private short A5372FasQuiUl ;
   private short Gx_err ;
   private short AV18FasQuiUl ;
   private short A4650FasForLin ;
   private short A5371FasQuiLin ;
   private short A761ProFasLin ;
   private int AV8BarCod ;
   private int A129BarCod ;
   private int GX_INS15 ;
   private int A4638BarUltNlot ;
   private int A4022BarNumBot ;
   private int GX_INS779 ;
   private java.math.BigDecimal A227BarUni ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private java.math.BigDecimal A7914BarfasRb ;
   private java.math.BigDecimal A7913BarfasUnpL ;
   private java.math.BigDecimal A7912Barfastpp ;
   private String A396EmprCod ;
   private String AV10BarCodPar ;
   private String AV11ProCod ;
   private String AV13Fascod ;
   private String AV14Usurcod ;
   private String AV15Station ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String A602MaqCod ;
   private String A456FasActTin ;
   private String A458FasCon ;
   private String A4286FasForMul ;
   private String A4639FasCara ;
   private String A4299FasConPla ;
   private String A4903FasAcab ;
   private String A5368FasGral ;
   private String A457FasCod ;
   private String W396EmprCod ;
   private String W457FasCod ;
   private String A603MaqCodBis ;
   private String A150BarFacTin ;
   private String A152BarFasCon ;
   private String A4287BarFasFor ;
   private String A4637BarFasCara ;
   private String A4301BarFasCoP ;
   private String A4905BarFasAcab ;
   private String A4021BarFasBot ;
   private String A5369BarFasGral ;
   private String A5048BarFasUsu ;
   private String A179BarLoc ;
   private String A5896BarMaqPlan ;
   private String A6173BarFasSec ;
   private String A6390BarfasMn ;
   private String A6392BarHdMn ;
   private String A6012BarFasTip ;
   private String Gx_emsg ;
   private String A764ProForCod ;
   private String W764ProForCod ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
   private java.util.Date A5047BarFasFPl ;
   private java.util.Date A160BarFecRea ;
   private java.util.Date A3298BarFecRIni ;
   private boolean n602MaqCod ;
   private boolean n456FasActTin ;
   private boolean n458FasCon ;
   private boolean n4286FasForMul ;
   private boolean n4639FasCara ;
   private boolean n4299FasConPla ;
   private boolean n4903FasAcab ;
   private boolean n5368FasGral ;
   private boolean n4638BarUltNlot ;
   private boolean n5369BarFasGral ;
   private boolean n5047BarFasFPl ;
   private boolean n5048BarFasUsu ;
   private boolean n5896BarMaqPlan ;
   private boolean n3837BarFasKgm ;
   private boolean n3838BarFasMtr ;
   private boolean n4442BarFasDTI ;
   private boolean n4443BarFasDTF ;
   private boolean n6173BarFasSec ;
   private boolean n6390BarfasMn ;
   private boolean n6391BarfasOP ;
   private boolean n6392BarHdMn ;
   private boolean n7914BarfasRb ;
   private boolean n7913BarfasUnpL ;
   private boolean n7912Barfastpp ;
   private boolean n7933Dtb_UOrd ;
   private boolean n8938BarfasPri2 ;
   private boolean n6012BarFasTip ;
   private boolean n5372FasQuiUl ;
   private boolean n761ProFasLin ;
   private String[] aP8 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P04VK2_A396EmprCod ;
   private int[] P04VK2_A129BarCod ;
   private byte[] P04VK2_A132BarCodReo ;
   private String[] P04VK2_A130BarCodPar ;
   private String[] P04VK2_A758ProCod ;
   private short[] P04VK2_A194BarOrdLin ;
   private String[] P04VK3_A396EmprCod ;
   private String[] P04VK3_A602MaqCod ;
   private boolean[] P04VK3_n602MaqCod ;
   private String[] P04VK3_A456FasActTin ;
   private boolean[] P04VK3_n456FasActTin ;
   private String[] P04VK3_A458FasCon ;
   private boolean[] P04VK3_n458FasCon ;
   private String[] P04VK3_A4286FasForMul ;
   private boolean[] P04VK3_n4286FasForMul ;
   private String[] P04VK3_A4639FasCara ;
   private boolean[] P04VK3_n4639FasCara ;
   private String[] P04VK3_A4299FasConPla ;
   private boolean[] P04VK3_n4299FasConPla ;
   private String[] P04VK3_A4903FasAcab ;
   private boolean[] P04VK3_n4903FasAcab ;
   private String[] P04VK3_A5368FasGral ;
   private boolean[] P04VK3_n5368FasGral ;
   private String[] P04VK3_A457FasCod ;
   private String[] P04VK5_A396EmprCod ;
   private String[] P04VK5_A764ProForCod ;
   private String[] P04VK5_A457FasCod ;
   private short[] P04VK5_A4650FasForLin ;
   private String[] P04VK7_A396EmprCod ;
   private short[] P04VK7_A194BarOrdLin ;
   private String[] P04VK7_A758ProCod ;
   private String[] P04VK7_A130BarCodPar ;
   private byte[] P04VK7_A132BarCodReo ;
   private int[] P04VK7_A129BarCod ;
   private short[] P04VK7_A5372FasQuiUl ;
   private boolean[] P04VK7_n5372FasQuiUl ;
}

final  class pprofs04__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04VK2", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P04VK3", "SELECT EmprCod, MaqCod, FasActTin, FasCon, FasForMul, FasCara, FasConPla, FasAcab, FasGral, FasCod FROM TXPFASPRO WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04VK4", "INSERT INTO TXPBARFAS(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, BarFasCon, BarFasEst, MaqCodBis, BarFacTin, BarFecRea, BarUni, BarHorIni, BarHorFin, BarTieRea, BarFecRIni, BarLoc, BarFasKgm, BarFasMtr, BarFasBot, BarNumBot, BarFasFor, BarFasCoP, BarFasCara, BarUltNlot, BarFasAcab, BarFasDTI, BarFasDTF, FasCod, BarFasFPl, BarFasUsu, BarFasGral, FasQuiUl, BarMaqPlan, BarFasTip, BarFasSec, BarfasMn, BarfasOP, BarHdMn, BarTieAut, BarFasNPl, Barfastpp, BarfasUnpL, BarfasRb, Dtb_UOrd, BarfasPri2, BarFasPri, BarFecTeo, BarTieTeo, BarNPzas, BarFasPzas, BarFasInc, BarFasKPr, BarFasPPr, BarFasAgr, BarFasPrp, BarFasKgT, BarFasMtT, BarFasCR, BarHdrO, BarObsF, BarObsB, BarFasSer, BarFasObs, BarFasTOb, BarFasBlq, TsSolTLcq, TsSolTFec, TsSolRLcq, TsSolRFec, TsSolObs, SolLvLnUl, SolAgLnUl, SolFrLnUl, SolSAcLnUl, SolSAlLnUl, SolPlLnUl, SolLzLnUl, SolAfLnUl) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARFAS")
         ,new ForEachCursor("P04VK5", "SELECT EmprCod, ProForCod, FasCod, FasForLin FROM TXPFASPR1 WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod, FasForLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P04VK6", "INSERT INTO TXPFASQUI(EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, FasQuiLin, ProForCod, FasQuiNp, FasQuiTp, FasQuiRb, FasMaqPl, FasFecPl, FasOrdPl, FasStPl, FasQuiAnc, FasQuiGrm, FasQuiObs, FasQuiVel, FasQuiAv, FasQuiAs, FasQuiAI, FasQuiFabs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', 0, ' ', ' ', ' ', 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPFASQUI")
         ,new ForEachCursor("P04VK7", "SELECT EmprCod, BarOrdLin, ProCod, BarCodPar, BarCodReo, BarCod, FasQuiUl FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P04VK8", "UPDATE TXPBARPRO SET ProFasLin=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and ProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARPRO")
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 2 :
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
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 2);
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[14], 2);
               stmt.setDate(16, (java.util.Date)parms[15]);
               stmt.setString(17, (String)parms[16], 10);
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[20], 2);
               }
               stmt.setString(20, (String)parms[21], 1);
               stmt.setInt(21, ((Number) parms[22]).intValue());
               stmt.setString(22, (String)parms[23], 1);
               stmt.setString(23, (String)parms[24], 1);
               stmt.setString(24, (String)parms[25], 1);
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(25, ((Number) parms[27]).intValue());
               }
               stmt.setString(26, (String)parms[28], 1);
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(27, (java.util.Date)parms[30], false);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(28, (java.util.Date)parms[32], false);
               }
               stmt.setString(29, (String)parms[33], 8);
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.DATE );
               }
               else
               {
                  stmt.setDate(30, (java.util.Date)parms[35]);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[37], 8);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[39], 1);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(33, ((Number) parms[41]).shortValue());
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
                  stmt.setString(37, (String)parms[49], 10);
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
                  stmt.setString(39, (String)parms[53], 10);
               }
               stmt.setShort(40, ((Number) parms[54]).shortValue());
               stmt.setByte(41, ((Number) parms[55]).byteValue());
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(42, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(43, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(44, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(45, ((Number) parms[63]).shortValue());
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(46, ((Number) parms[65]).shortValue());
               }
               stmt.setByte(47, ((Number) parms[66]).byteValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 6);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               stmt.setByte(4, ((Number) parms[4]).byteValue());
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 8);
               return;
      }
   }

}

