package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pnewope extends GXProcedure
{
   public pnewope( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pnewope.class ), "" );
   }

   public pnewope( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      pnewope.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pnewope.this.AV36EmprCod = aP0[0];
      this.aP0 = aP0;
      pnewope.this.AV15AlbProCod = aP1[0];
      this.aP1 = aP1;
      pnewope.this.AV16BarCod = aP2[0];
      this.aP2 = aP2;
      pnewope.this.AV17BarCodReo = aP3[0];
      this.aP3 = aP3;
      pnewope.this.AV18BarCodPar = aP4[0];
      this.aP4 = aP4;
      pnewope.this.AV35Opcion = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV38FlagValoHr = (byte)(0) ;
      GXv_int1[0] = AV38FlagValoHr ;
      new app.pexicon(remoteHandle, context).execute( AV36EmprCod, httpContext.getMessage( "VALOHR", ""), GXv_int1) ;
      pnewope.this.AV38FlagValoHr = GXv_int1[0] ;
      if ( ( GXutil.strcmp(AV35Opcion, httpContext.getMessage( "A", "")) == 0 ) && ( AV38FlagValoHr == 1 ) )
      {
         AV41EmprValo = "990" ;
         AV39GuiFasLin = (short)(0) ;
         AV40HayPrealb = httpContext.getMessage( "N", "") ;
         AV42AlbValo = (long)(AV16BarCod*10) ;
         /* Using cursor P00FN2 */
         pr_default.execute(0, new Object[] {AV41EmprValo, Long.valueOf(AV42AlbValo), Integer.valueOf(AV16BarCod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A130BarCodPar = P00FN2_A130BarCodPar[0] ;
            A132BarCodReo = P00FN2_A132BarCodReo[0] ;
            A129BarCod = P00FN2_A129BarCod[0] ;
            A30AlbProCod = P00FN2_A30AlbProCod[0] ;
            A396EmprCod = P00FN2_A396EmprCod[0] ;
            A1261BarAlbKgmE = P00FN2_A1261BarAlbKgmE[0] ;
            A1248GuiFasULin = P00FN2_A1248GuiFasULin[0] ;
            W396EmprCod = A396EmprCod ;
            W30AlbProCod = A30AlbProCod ;
            AV40HayPrealb = httpContext.getMessage( "S", "") ;
            /* Using cursor P00FN3 */
            pr_default.execute(1, new Object[] {AV41EmprValo, Long.valueOf(AV42AlbValo), Integer.valueOf(AV16BarCod)});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A30AlbProCod = P00FN3_A30AlbProCod[0] ;
               A396EmprCod = P00FN3_A396EmprCod[0] ;
               A14112GuiFasHorc = P00FN3_A14112GuiFasHorc[0] ;
               A14113GuiFasUsuc = P00FN3_A14113GuiFasUsuc[0] ;
               A14111GuiFasFecc = P00FN3_A14111GuiFasFecc[0] ;
               A12194FasPreUnd = P00FN3_A12194FasPreUnd[0] ;
               A12193FasUnd = P00FN3_A12193FasUnd[0] ;
               A8196GuiFasPB = P00FN3_A8196GuiFasPB[0] ;
               n8196GuiFasPB = P00FN3_n8196GuiFasPB[0] ;
               A8195GuiFasPBM = P00FN3_A8195GuiFasPBM[0] ;
               n8195GuiFasPBM = P00FN3_n8195GuiFasPBM[0] ;
               A8194GuiFasPBK = P00FN3_A8194GuiFasPBK[0] ;
               n8194GuiFasPBK = P00FN3_n8194GuiFasPBK[0] ;
               A7753GuiFasCCo = P00FN3_A7753GuiFasCCo[0] ;
               n7753GuiFasCCo = P00FN3_n7753GuiFasCCo[0] ;
               A7752GuiFasRec = P00FN3_A7752GuiFasRec[0] ;
               n7752GuiFasRec = P00FN3_n7752GuiFasRec[0] ;
               A7751GuiFasDto = P00FN3_A7751GuiFasDto[0] ;
               n7751GuiFasDto = P00FN3_n7751GuiFasDto[0] ;
               A7750GuiFasPre = P00FN3_A7750GuiFasPre[0] ;
               n7750GuiFasPre = P00FN3_n7750GuiFasPre[0] ;
               A7727ArtAdiCod = P00FN3_A7727ArtAdiCod[0] ;
               n7727ArtAdiCod = P00FN3_n7727ArtAdiCod[0] ;
               A7392FasFacMaqC = P00FN3_A7392FasFacMaqC[0] ;
               n7392FasFacMaqC = P00FN3_n7392FasFacMaqC[0] ;
               A5462F_TipPza = P00FN3_A5462F_TipPza[0] ;
               n5462F_TipPza = P00FN3_n5462F_TipPza[0] ;
               A4391FasPreDsM = P00FN3_A4391FasPreDsM[0] ;
               n4391FasPreDsM = P00FN3_n4391FasPreDsM[0] ;
               A4390FasPreDsK = P00FN3_A4390FasPreDsK[0] ;
               n4390FasPreDsK = P00FN3_n4390FasPreDsK[0] ;
               A3272FasCodF = P00FN3_A3272FasCodF[0] ;
               n3272FasCodF = P00FN3_n3272FasCodF[0] ;
               A1276FasMtr = P00FN3_A1276FasMtr[0] ;
               A1275FasKgm = P00FN3_A1275FasKgm[0] ;
               A1242GuiFasPMt = P00FN3_A1242GuiFasPMt[0] ;
               A1241GuiFasPKg = P00FN3_A1241GuiFasPKg[0] ;
               A457FasCod = P00FN3_A457FasCod[0] ;
               n457FasCod = P00FN3_n457FasCod[0] ;
               A1240GuiFasLin = P00FN3_A1240GuiFasLin[0] ;
               A130BarCodPar = P00FN3_A130BarCodPar[0] ;
               A132BarCodReo = P00FN3_A132BarCodReo[0] ;
               A129BarCod = P00FN3_A129BarCod[0] ;
               W396EmprCod = A396EmprCod ;
               W30AlbProCod = A30AlbProCod ;
               /*
                  INSERT RECORD ON TABLE TXPALBFAS

               */
               W396EmprCod = A396EmprCod ;
               W30AlbProCod = A30AlbProCod ;
               W1240GuiFasLin = A1240GuiFasLin ;
               A396EmprCod = AV36EmprCod ;
               A30AlbProCod = AV15AlbProCod ;
               AV39GuiFasLin = A1240GuiFasLin ;
               /* Using cursor P00FN4 */
               pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin), Boolean.valueOf(n457FasCod), A457FasCod, A1241GuiFasPKg, A1242GuiFasPMt, A1275FasKgm, A1276FasMtr, Boolean.valueOf(n3272FasCodF), A3272FasCodF, Boolean.valueOf(n4390FasPreDsK), A4390FasPreDsK, Boolean.valueOf(n4391FasPreDsM), A4391FasPreDsM, Boolean.valueOf(n5462F_TipPza), Short.valueOf(A5462F_TipPza), Boolean.valueOf(n7392FasFacMaqC), A7392FasFacMaqC, Boolean.valueOf(n7727ArtAdiCod), Short.valueOf(A7727ArtAdiCod), Boolean.valueOf(n7750GuiFasPre), A7750GuiFasPre, Boolean.valueOf(n7751GuiFasDto), A7751GuiFasDto, Boolean.valueOf(n7752GuiFasRec), A7752GuiFasRec, Boolean.valueOf(n7753GuiFasCCo), Short.valueOf(A7753GuiFasCCo), Boolean.valueOf(n8194GuiFasPBK), A8194GuiFasPBK, Boolean.valueOf(n8195GuiFasPBM), A8195GuiFasPBM, Boolean.valueOf(n8196GuiFasPB), A8196GuiFasPB, Integer.valueOf(A12193FasUnd), A12194FasPreUnd, A14111GuiFasFecc, A14113GuiFasUsuc, A14112GuiFasHorc});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
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
               A30AlbProCod = W30AlbProCod ;
               A1240GuiFasLin = W1240GuiFasLin ;
               /* End Insert */
               A396EmprCod = W396EmprCod ;
               A30AlbProCod = W30AlbProCod ;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            A1248GuiFasULin = AV39GuiFasLin ;
            /* Using cursor P00FN5 */
            pr_default.execute(3, new Object[] {Short.valueOf(A1248GuiFasULin), A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
            A396EmprCod = W396EmprCod ;
            A30AlbProCod = W30AlbProCod ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( GXutil.strcmp(AV40HayPrealb, httpContext.getMessage( "S", "")) == 0 )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( GXutil.strcmp(AV35Opcion, httpContext.getMessage( "P", "")) == 0 )
      {
         AV37EmprNew = "990" ;
      }
      else
      {
         AV37EmprNew = AV36EmprCod ;
      }
      /* Using cursor P00FN6 */
      pr_default.execute(4, new Object[] {AV36EmprCod, Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A361DisCod = P00FN6_A361DisCod[0] ;
         A130BarCodPar = P00FN6_A130BarCodPar[0] ;
         A132BarCodReo = P00FN6_A132BarCodReo[0] ;
         A129BarCod = P00FN6_A129BarCod[0] ;
         A396EmprCod = P00FN6_A396EmprCod[0] ;
         A2746BarCodTex = P00FN6_A2746BarCodTex[0] ;
         n2746BarCodTex = P00FN6_n2746BarCodTex[0] ;
         A212BarSer = P00FN6_A212BarSer[0] ;
         A252CliCod = P00FN6_A252CliCod[0] ;
         n252CliCod = P00FN6_n252CliCod[0] ;
         A966PartCod = P00FN6_A966PartCod[0] ;
         n966PartCod = P00FN6_n966PartCod[0] ;
         A1157TipConCod = P00FN6_A1157TipConCod[0] ;
         n1157TipConCod = P00FN6_n1157TipConCod[0] ;
         A2753BarNumTex2 = P00FN6_A2753BarNumTex2[0] ;
         n2753BarNumTex2 = P00FN6_n2753BarNumTex2[0] ;
         A2752BarNumTex1 = P00FN6_A2752BarNumTex1[0] ;
         A966PartCod = P00FN6_A966PartCod[0] ;
         n966PartCod = P00FN6_n966PartCod[0] ;
         A1157TipConCod = P00FN6_A1157TipConCod[0] ;
         n1157TipConCod = P00FN6_n1157TipConCod[0] ;
         AV26BarCodTex = A2746BarCodTex ;
         AV27FacDI = DecimalUtil.ZERO ;
         AV28DoI = "" ;
         AV25CliCod = A252CliCod ;
         AV31PartCod = A966PartCod ;
         AV32PartOpe = "" ;
         AV33TipCon = A1157TipConCod ;
         /* Execute user subroutine: 'OPEPDO' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(4);
            pr_default.close(4);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Using cursor P00FN7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n2746BarCodTex), A2746BarCodTex});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A2707NumTexCod = P00FN7_A2707NumTexCod[0] ;
            A2710NumTexFac = P00FN7_A2710NumTexFac[0] ;
            n2710NumTexFac = P00FN7_n2710NumTexFac[0] ;
            A2709NumTexDI = P00FN7_A2709NumTexDI[0] ;
            n2709NumTexDI = P00FN7_n2709NumTexDI[0] ;
            AV27FacDI = A2710NumTexFac ;
            AV28DoI = A2709NumTexDI ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
         if ( GXutil.strcmp(AV28DoI, httpContext.getMessage( "I", "")) == 0 )
         {
            AV29NumTex2 = DecimalUtil.doubleToDec(A2753BarNumTex2).multiply(AV27FacDI) ;
         }
         if ( GXutil.strcmp(AV28DoI, httpContext.getMessage( "D", "")) == 0 )
         {
            AV29NumTex2 = AV27FacDI.divide(DecimalUtil.doubleToDec(A2753BarNumTex2), 18, java.math.RoundingMode.DOWN) ;
         }
         AV30NmR = (short)(0) ;
         if ( ! (0==A2752BarNumTex1) )
         {
            AV30NmR = (short)(DecimalUtil.decToDouble(GXutil.roundDecimal( AV29NumTex2.divide(DecimalUtil.doubleToDec(A2752BarNumTex1), 18, java.math.RoundingMode.DOWN), 0))) ;
         }
         if ( ! (GXutil.strcmp("", AV32PartOpe)==0) )
         {
            /* Execute user subroutine: 'NEWOPE' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(4);
               pr_default.close(4);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         /* Using cursor P00FN8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A227BarUni = P00FN8_A227BarUni[0] ;
            A457FasCod = P00FN8_A457FasCod[0] ;
            n457FasCod = P00FN8_n457FasCod[0] ;
            A758ProCod = P00FN8_A758ProCod[0] ;
            A194BarOrdLin = P00FN8_A194BarOrdLin[0] ;
            AV32PartOpe = A457FasCod ;
            /* Execute user subroutine: 'NEWOPE' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(6);
               pr_default.close(4);
               pr_default.close(4);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            pr_default.readNext(6);
         }
         pr_default.close(6);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      /* Optimized UPDATE. */
      /* Using cursor P00FN9 */
      pr_default.execute(7, new Object[] {Short.valueOf(AV20LinFas), AV37EmprNew, Long.valueOf(AV15AlbProCod), Integer.valueOf(AV16BarCod), Byte.valueOf(AV17BarCodReo), AV18BarCodPar});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
      /* End optimized UPDATE. */
      cleanup();
   }

   public void S111( )
   {
      /* 'OPEPDO' Routine */
      returnInSub = false ;
      /* Using cursor P00FN10 */
      pr_default.execute(8, new Object[] {AV36EmprCod, AV31PartCod, Integer.valueOf(AV25CliCod)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A252CliCod = P00FN10_A252CliCod[0] ;
         n252CliCod = P00FN10_n252CliCod[0] ;
         A966PartCod = P00FN10_A966PartCod[0] ;
         n966PartCod = P00FN10_n966PartCod[0] ;
         A396EmprCod = P00FN10_A396EmprCod[0] ;
         A2745PartTipP = P00FN10_A2745PartTipP[0] ;
         n2745PartTipP = P00FN10_n2745PartTipP[0] ;
         A2747PartOpe = P00FN10_A2747PartOpe[0] ;
         n2747PartOpe = P00FN10_n2747PartOpe[0] ;
         AV32PartOpe = A2747PartOpe ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
   }

   public void S121( )
   {
      /* 'NEWOPE' Routine */
      returnInSub = false ;
      /* Using cursor P00FN11 */
      pr_default.execute(9, new Object[] {AV36EmprCod, Short.valueOf(AV33TipCon), Integer.valueOf(AV25CliCod), Short.valueOf(AV30NmR), AV32PartOpe});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A2738RecPrec = P00FN11_A2738RecPrec[0] ;
         n2738RecPrec = P00FN11_n2738RecPrec[0] ;
         A457FasCod = P00FN11_A457FasCod[0] ;
         n457FasCod = P00FN11_n457FasCod[0] ;
         A2737RecNmR = P00FN11_A2737RecNmR[0] ;
         n2737RecNmR = P00FN11_n2737RecNmR[0] ;
         A2730RecTipCo = P00FN11_A2730RecTipCo[0] ;
         A252CliCod = P00FN11_A252CliCod[0] ;
         n252CliCod = P00FN11_n252CliCod[0] ;
         A396EmprCod = P00FN11_A396EmprCod[0] ;
         A2736RecLin2 = P00FN11_A2736RecLin2[0] ;
         W396EmprCod = A396EmprCod ;
         if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, A2738RecPrec)==0) )
         {
            AV20LinFas = (short)(AV20LinFas+1) ;
            /*
               INSERT RECORD ON TABLE TXPALBFAS

            */
            W396EmprCod = A396EmprCod ;
            A396EmprCod = AV37EmprNew ;
            A30AlbProCod = AV15AlbProCod ;
            A1240GuiFasLin = AV20LinFas ;
            A1241GuiFasPKg = A2738RecPrec ;
            /* Using cursor P00FN12 */
            pr_default.execute(10, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A1240GuiFasLin), Boolean.valueOf(n457FasCod), A457FasCod, A1241GuiFasPKg});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBFAS");
            if ( (pr_default.getStatus(10) == 1) )
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
            /* End Insert */
         }
         A396EmprCod = W396EmprCod ;
         pr_default.readNext(9);
      }
      pr_default.close(9);
   }

   protected void cleanup( )
   {
      this.aP0[0] = pnewope.this.AV36EmprCod;
      this.aP1[0] = pnewope.this.AV15AlbProCod;
      this.aP2[0] = pnewope.this.AV16BarCod;
      this.aP3[0] = pnewope.this.AV17BarCodReo;
      this.aP4[0] = pnewope.this.AV18BarCodPar;
      this.aP5[0] = pnewope.this.AV35Opcion;
      Application.commitDataStores(context, remoteHandle, pr_default, "pnewope");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int1 = new byte[1] ;
      AV41EmprValo = "" ;
      AV40HayPrealb = "" ;
      scmdbuf = "" ;
      P00FN2_A130BarCodPar = new String[] {""} ;
      P00FN2_A132BarCodReo = new byte[1] ;
      P00FN2_A129BarCod = new int[1] ;
      P00FN2_A30AlbProCod = new long[1] ;
      P00FN2_A396EmprCod = new String[] {""} ;
      P00FN2_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FN2_A1248GuiFasULin = new short[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      W396EmprCod = "" ;
      P00FN3_A30AlbProCod = new long[1] ;
      P00FN3_A396EmprCod = new String[] {""} ;
      P00FN3_A14112GuiFasHorc = new java.util.Date[] {GXutil.nullDate()} ;
      P00FN3_A14113GuiFasUsuc = new String[] {""} ;
      P00FN3_A14111GuiFasFecc = new java.util.Date[] {GXutil.nullDate()} ;
      P00FN3_A12194FasPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FN3_A12193FasUnd = new int[1] ;
      P00FN3_A8196GuiFasPB = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FN3_n8196GuiFasPB = new boolean[] {false} ;
      P00FN3_A8195GuiFasPBM = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FN3_n8195GuiFasPBM = new boolean[] {false} ;
      P00FN3_A8194GuiFasPBK = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FN3_n8194GuiFasPBK = new boolean[] {false} ;
      P00FN3_A7753GuiFasCCo = new short[1] ;
      P00FN3_n7753GuiFasCCo = new boolean[] {false} ;
      P00FN3_A7752GuiFasRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FN3_n7752GuiFasRec = new boolean[] {false} ;
      P00FN3_A7751GuiFasDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FN3_n7751GuiFasDto = new boolean[] {false} ;
      P00FN3_A7750GuiFasPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FN3_n7750GuiFasPre = new boolean[] {false} ;
      P00FN3_A7727ArtAdiCod = new short[1] ;
      P00FN3_n7727ArtAdiCod = new boolean[] {false} ;
      P00FN3_A7392FasFacMaqC = new String[] {""} ;
      P00FN3_n7392FasFacMaqC = new boolean[] {false} ;
      P00FN3_A5462F_TipPza = new short[1] ;
      P00FN3_n5462F_TipPza = new boolean[] {false} ;
      P00FN3_A4391FasPreDsM = new String[] {""} ;
      P00FN3_n4391FasPreDsM = new boolean[] {false} ;
      P00FN3_A4390FasPreDsK = new String[] {""} ;
      P00FN3_n4390FasPreDsK = new boolean[] {false} ;
      P00FN3_A3272FasCodF = new String[] {""} ;
      P00FN3_n3272FasCodF = new boolean[] {false} ;
      P00FN3_A1276FasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FN3_A1275FasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FN3_A1242GuiFasPMt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FN3_A1241GuiFasPKg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FN3_A457FasCod = new String[] {""} ;
      P00FN3_n457FasCod = new boolean[] {false} ;
      P00FN3_A1240GuiFasLin = new short[1] ;
      P00FN3_A130BarCodPar = new String[] {""} ;
      P00FN3_A132BarCodReo = new byte[1] ;
      P00FN3_A129BarCod = new int[1] ;
      A14112GuiFasHorc = GXutil.resetTime( GXutil.nullDate() );
      A14113GuiFasUsuc = "" ;
      A14111GuiFasFecc = GXutil.nullDate() ;
      A12194FasPreUnd = DecimalUtil.ZERO ;
      A8196GuiFasPB = DecimalUtil.ZERO ;
      A8195GuiFasPBM = DecimalUtil.ZERO ;
      A8194GuiFasPBK = DecimalUtil.ZERO ;
      A7752GuiFasRec = DecimalUtil.ZERO ;
      A7751GuiFasDto = DecimalUtil.ZERO ;
      A7750GuiFasPre = DecimalUtil.ZERO ;
      A7392FasFacMaqC = "" ;
      A4391FasPreDsM = "" ;
      A4390FasPreDsK = "" ;
      A3272FasCodF = "" ;
      A1276FasMtr = DecimalUtil.ZERO ;
      A1275FasKgm = DecimalUtil.ZERO ;
      A1242GuiFasPMt = DecimalUtil.ZERO ;
      A1241GuiFasPKg = DecimalUtil.ZERO ;
      A457FasCod = "" ;
      Gx_emsg = "" ;
      AV37EmprNew = "" ;
      P00FN6_A361DisCod = new int[1] ;
      P00FN6_A130BarCodPar = new String[] {""} ;
      P00FN6_A132BarCodReo = new byte[1] ;
      P00FN6_A129BarCod = new int[1] ;
      P00FN6_A396EmprCod = new String[] {""} ;
      P00FN6_A2746BarCodTex = new String[] {""} ;
      P00FN6_n2746BarCodTex = new boolean[] {false} ;
      P00FN6_A212BarSer = new String[] {""} ;
      P00FN6_A252CliCod = new int[1] ;
      P00FN6_n252CliCod = new boolean[] {false} ;
      P00FN6_A966PartCod = new String[] {""} ;
      P00FN6_n966PartCod = new boolean[] {false} ;
      P00FN6_A1157TipConCod = new short[1] ;
      P00FN6_n1157TipConCod = new boolean[] {false} ;
      P00FN6_A2753BarNumTex2 = new short[1] ;
      P00FN6_n2753BarNumTex2 = new boolean[] {false} ;
      P00FN6_A2752BarNumTex1 = new byte[1] ;
      A2746BarCodTex = "" ;
      A212BarSer = "" ;
      A966PartCod = "" ;
      AV26BarCodTex = "" ;
      AV27FacDI = DecimalUtil.ZERO ;
      AV28DoI = "" ;
      AV31PartCod = "" ;
      AV32PartOpe = "" ;
      P00FN7_A396EmprCod = new String[] {""} ;
      P00FN7_A2707NumTexCod = new String[] {""} ;
      P00FN7_A2710NumTexFac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FN7_n2710NumTexFac = new boolean[] {false} ;
      P00FN7_A2709NumTexDI = new String[] {""} ;
      P00FN7_n2709NumTexDI = new boolean[] {false} ;
      A2707NumTexCod = "" ;
      A2710NumTexFac = DecimalUtil.ZERO ;
      A2709NumTexDI = "" ;
      AV29NumTex2 = DecimalUtil.ZERO ;
      P00FN8_A396EmprCod = new String[] {""} ;
      P00FN8_A129BarCod = new int[1] ;
      P00FN8_A132BarCodReo = new byte[1] ;
      P00FN8_A130BarCodPar = new String[] {""} ;
      P00FN8_A227BarUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FN8_A457FasCod = new String[] {""} ;
      P00FN8_n457FasCod = new boolean[] {false} ;
      P00FN8_A758ProCod = new String[] {""} ;
      P00FN8_A194BarOrdLin = new short[1] ;
      A227BarUni = DecimalUtil.ZERO ;
      A758ProCod = "" ;
      P00FN10_A252CliCod = new int[1] ;
      P00FN10_n252CliCod = new boolean[] {false} ;
      P00FN10_A966PartCod = new String[] {""} ;
      P00FN10_n966PartCod = new boolean[] {false} ;
      P00FN10_A396EmprCod = new String[] {""} ;
      P00FN10_A2745PartTipP = new String[] {""} ;
      P00FN10_n2745PartTipP = new boolean[] {false} ;
      P00FN10_A2747PartOpe = new String[] {""} ;
      P00FN10_n2747PartOpe = new boolean[] {false} ;
      A2745PartTipP = "" ;
      A2747PartOpe = "" ;
      P00FN11_A2738RecPrec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00FN11_n2738RecPrec = new boolean[] {false} ;
      P00FN11_A457FasCod = new String[] {""} ;
      P00FN11_n457FasCod = new boolean[] {false} ;
      P00FN11_A2737RecNmR = new short[1] ;
      P00FN11_n2737RecNmR = new boolean[] {false} ;
      P00FN11_A2730RecTipCo = new short[1] ;
      P00FN11_A252CliCod = new int[1] ;
      P00FN11_n252CliCod = new boolean[] {false} ;
      P00FN11_A396EmprCod = new String[] {""} ;
      P00FN11_A2736RecLin2 = new short[1] ;
      A2738RecPrec = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pnewope__default(),
         new Object[] {
             new Object[] {
            P00FN2_A130BarCodPar, P00FN2_A132BarCodReo, P00FN2_A129BarCod, P00FN2_A30AlbProCod, P00FN2_A396EmprCod, P00FN2_A1261BarAlbKgmE, P00FN2_A1248GuiFasULin
            }
            , new Object[] {
            P00FN3_A30AlbProCod, P00FN3_A396EmprCod, P00FN3_A14112GuiFasHorc, P00FN3_A14113GuiFasUsuc, P00FN3_A14111GuiFasFecc, P00FN3_A12194FasPreUnd, P00FN3_A12193FasUnd, P00FN3_A8196GuiFasPB, P00FN3_n8196GuiFasPB, P00FN3_A8195GuiFasPBM,
            P00FN3_n8195GuiFasPBM, P00FN3_A8194GuiFasPBK, P00FN3_n8194GuiFasPBK, P00FN3_A7753GuiFasCCo, P00FN3_n7753GuiFasCCo, P00FN3_A7752GuiFasRec, P00FN3_n7752GuiFasRec, P00FN3_A7751GuiFasDto, P00FN3_n7751GuiFasDto, P00FN3_A7750GuiFasPre,
            P00FN3_n7750GuiFasPre, P00FN3_A7727ArtAdiCod, P00FN3_n7727ArtAdiCod, P00FN3_A7392FasFacMaqC, P00FN3_n7392FasFacMaqC, P00FN3_A5462F_TipPza, P00FN3_n5462F_TipPza, P00FN3_A4391FasPreDsM, P00FN3_n4391FasPreDsM, P00FN3_A4390FasPreDsK,
            P00FN3_n4390FasPreDsK, P00FN3_A3272FasCodF, P00FN3_n3272FasCodF, P00FN3_A1276FasMtr, P00FN3_A1275FasKgm, P00FN3_A1242GuiFasPMt, P00FN3_A1241GuiFasPKg, P00FN3_A457FasCod, P00FN3_A1240GuiFasLin, P00FN3_A130BarCodPar,
            P00FN3_A132BarCodReo, P00FN3_A129BarCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00FN6_A361DisCod, P00FN6_A130BarCodPar, P00FN6_A132BarCodReo, P00FN6_A129BarCod, P00FN6_A396EmprCod, P00FN6_A2746BarCodTex, P00FN6_n2746BarCodTex, P00FN6_A212BarSer, P00FN6_A252CliCod, P00FN6_n252CliCod,
            P00FN6_A966PartCod, P00FN6_n966PartCod, P00FN6_A1157TipConCod, P00FN6_n1157TipConCod, P00FN6_A2753BarNumTex2, P00FN6_n2753BarNumTex2, P00FN6_A2752BarNumTex1
            }
            , new Object[] {
            P00FN7_A396EmprCod, P00FN7_A2707NumTexCod, P00FN7_A2710NumTexFac, P00FN7_n2710NumTexFac, P00FN7_A2709NumTexDI, P00FN7_n2709NumTexDI
            }
            , new Object[] {
            P00FN8_A396EmprCod, P00FN8_A129BarCod, P00FN8_A132BarCodReo, P00FN8_A130BarCodPar, P00FN8_A227BarUni, P00FN8_A457FasCod, P00FN8_A758ProCod, P00FN8_A194BarOrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            P00FN10_A252CliCod, P00FN10_A966PartCod, P00FN10_A396EmprCod, P00FN10_A2745PartTipP, P00FN10_n2745PartTipP, P00FN10_A2747PartOpe, P00FN10_n2747PartOpe
            }
            , new Object[] {
            P00FN11_A2738RecPrec, P00FN11_n2738RecPrec, P00FN11_A457FasCod, P00FN11_n457FasCod, P00FN11_A2737RecNmR, P00FN11_n2737RecNmR, P00FN11_A2730RecTipCo, P00FN11_A252CliCod, P00FN11_A396EmprCod, P00FN11_A2736RecLin2
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV17BarCodReo ;
   private byte AV38FlagValoHr ;
   private byte GXv_int1[] ;
   private byte A132BarCodReo ;
   private byte A2752BarNumTex1 ;
   private short AV39GuiFasLin ;
   private short A1248GuiFasULin ;
   private short A7753GuiFasCCo ;
   private short A7727ArtAdiCod ;
   private short A5462F_TipPza ;
   private short A1240GuiFasLin ;
   private short W1240GuiFasLin ;
   private short Gx_err ;
   private short A1157TipConCod ;
   private short A2753BarNumTex2 ;
   private short AV33TipCon ;
   private short AV30NmR ;
   private short A194BarOrdLin ;
   private short AV20LinFas ;
   private short A2737RecNmR ;
   private short A2730RecTipCo ;
   private short A2736RecLin2 ;
   private int AV16BarCod ;
   private int A129BarCod ;
   private int A12193FasUnd ;
   private int GX_INS194 ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int AV25CliCod ;
   private long AV15AlbProCod ;
   private long AV42AlbValo ;
   private long A30AlbProCod ;
   private long W30AlbProCod ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A12194FasPreUnd ;
   private java.math.BigDecimal A8196GuiFasPB ;
   private java.math.BigDecimal A8195GuiFasPBM ;
   private java.math.BigDecimal A8194GuiFasPBK ;
   private java.math.BigDecimal A7752GuiFasRec ;
   private java.math.BigDecimal A7751GuiFasDto ;
   private java.math.BigDecimal A7750GuiFasPre ;
   private java.math.BigDecimal A1276FasMtr ;
   private java.math.BigDecimal A1275FasKgm ;
   private java.math.BigDecimal A1242GuiFasPMt ;
   private java.math.BigDecimal A1241GuiFasPKg ;
   private java.math.BigDecimal AV27FacDI ;
   private java.math.BigDecimal A2710NumTexFac ;
   private java.math.BigDecimal AV29NumTex2 ;
   private java.math.BigDecimal A227BarUni ;
   private java.math.BigDecimal A2738RecPrec ;
   private String AV36EmprCod ;
   private String AV18BarCodPar ;
   private String AV35Opcion ;
   private String AV41EmprValo ;
   private String AV40HayPrealb ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String W396EmprCod ;
   private String A14113GuiFasUsuc ;
   private String A7392FasFacMaqC ;
   private String A4391FasPreDsM ;
   private String A4390FasPreDsK ;
   private String A3272FasCodF ;
   private String A457FasCod ;
   private String Gx_emsg ;
   private String AV37EmprNew ;
   private String A2746BarCodTex ;
   private String A212BarSer ;
   private String A966PartCod ;
   private String AV26BarCodTex ;
   private String AV28DoI ;
   private String AV31PartCod ;
   private String AV32PartOpe ;
   private String A2707NumTexCod ;
   private String A2709NumTexDI ;
   private String A758ProCod ;
   private String A2745PartTipP ;
   private String A2747PartOpe ;
   private java.util.Date A14112GuiFasHorc ;
   private java.util.Date A14111GuiFasFecc ;
   private boolean n8196GuiFasPB ;
   private boolean n8195GuiFasPBM ;
   private boolean n8194GuiFasPBK ;
   private boolean n7753GuiFasCCo ;
   private boolean n7752GuiFasRec ;
   private boolean n7751GuiFasDto ;
   private boolean n7750GuiFasPre ;
   private boolean n7727ArtAdiCod ;
   private boolean n7392FasFacMaqC ;
   private boolean n5462F_TipPza ;
   private boolean n4391FasPreDsM ;
   private boolean n4390FasPreDsK ;
   private boolean n3272FasCodF ;
   private boolean n457FasCod ;
   private boolean returnInSub ;
   private boolean n2746BarCodTex ;
   private boolean n252CliCod ;
   private boolean n966PartCod ;
   private boolean n1157TipConCod ;
   private boolean n2753BarNumTex2 ;
   private boolean n2710NumTexFac ;
   private boolean n2709NumTexDI ;
   private boolean n2745PartTipP ;
   private boolean n2747PartOpe ;
   private boolean n2738RecPrec ;
   private boolean n2737RecNmR ;
   private String[] aP5 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00FN2_A130BarCodPar ;
   private byte[] P00FN2_A132BarCodReo ;
   private int[] P00FN2_A129BarCod ;
   private long[] P00FN2_A30AlbProCod ;
   private String[] P00FN2_A396EmprCod ;
   private java.math.BigDecimal[] P00FN2_A1261BarAlbKgmE ;
   private short[] P00FN2_A1248GuiFasULin ;
   private long[] P00FN3_A30AlbProCod ;
   private String[] P00FN3_A396EmprCod ;
   private java.util.Date[] P00FN3_A14112GuiFasHorc ;
   private String[] P00FN3_A14113GuiFasUsuc ;
   private java.util.Date[] P00FN3_A14111GuiFasFecc ;
   private java.math.BigDecimal[] P00FN3_A12194FasPreUnd ;
   private int[] P00FN3_A12193FasUnd ;
   private java.math.BigDecimal[] P00FN3_A8196GuiFasPB ;
   private boolean[] P00FN3_n8196GuiFasPB ;
   private java.math.BigDecimal[] P00FN3_A8195GuiFasPBM ;
   private boolean[] P00FN3_n8195GuiFasPBM ;
   private java.math.BigDecimal[] P00FN3_A8194GuiFasPBK ;
   private boolean[] P00FN3_n8194GuiFasPBK ;
   private short[] P00FN3_A7753GuiFasCCo ;
   private boolean[] P00FN3_n7753GuiFasCCo ;
   private java.math.BigDecimal[] P00FN3_A7752GuiFasRec ;
   private boolean[] P00FN3_n7752GuiFasRec ;
   private java.math.BigDecimal[] P00FN3_A7751GuiFasDto ;
   private boolean[] P00FN3_n7751GuiFasDto ;
   private java.math.BigDecimal[] P00FN3_A7750GuiFasPre ;
   private boolean[] P00FN3_n7750GuiFasPre ;
   private short[] P00FN3_A7727ArtAdiCod ;
   private boolean[] P00FN3_n7727ArtAdiCod ;
   private String[] P00FN3_A7392FasFacMaqC ;
   private boolean[] P00FN3_n7392FasFacMaqC ;
   private short[] P00FN3_A5462F_TipPza ;
   private boolean[] P00FN3_n5462F_TipPza ;
   private String[] P00FN3_A4391FasPreDsM ;
   private boolean[] P00FN3_n4391FasPreDsM ;
   private String[] P00FN3_A4390FasPreDsK ;
   private boolean[] P00FN3_n4390FasPreDsK ;
   private String[] P00FN3_A3272FasCodF ;
   private boolean[] P00FN3_n3272FasCodF ;
   private java.math.BigDecimal[] P00FN3_A1276FasMtr ;
   private java.math.BigDecimal[] P00FN3_A1275FasKgm ;
   private java.math.BigDecimal[] P00FN3_A1242GuiFasPMt ;
   private java.math.BigDecimal[] P00FN3_A1241GuiFasPKg ;
   private String[] P00FN3_A457FasCod ;
   private boolean[] P00FN3_n457FasCod ;
   private short[] P00FN3_A1240GuiFasLin ;
   private String[] P00FN3_A130BarCodPar ;
   private byte[] P00FN3_A132BarCodReo ;
   private int[] P00FN3_A129BarCod ;
   private int[] P00FN6_A361DisCod ;
   private String[] P00FN6_A130BarCodPar ;
   private byte[] P00FN6_A132BarCodReo ;
   private int[] P00FN6_A129BarCod ;
   private String[] P00FN6_A396EmprCod ;
   private String[] P00FN6_A2746BarCodTex ;
   private boolean[] P00FN6_n2746BarCodTex ;
   private String[] P00FN6_A212BarSer ;
   private int[] P00FN6_A252CliCod ;
   private boolean[] P00FN6_n252CliCod ;
   private String[] P00FN6_A966PartCod ;
   private boolean[] P00FN6_n966PartCod ;
   private short[] P00FN6_A1157TipConCod ;
   private boolean[] P00FN6_n1157TipConCod ;
   private short[] P00FN6_A2753BarNumTex2 ;
   private boolean[] P00FN6_n2753BarNumTex2 ;
   private byte[] P00FN6_A2752BarNumTex1 ;
   private String[] P00FN7_A396EmprCod ;
   private String[] P00FN7_A2707NumTexCod ;
   private java.math.BigDecimal[] P00FN7_A2710NumTexFac ;
   private boolean[] P00FN7_n2710NumTexFac ;
   private String[] P00FN7_A2709NumTexDI ;
   private boolean[] P00FN7_n2709NumTexDI ;
   private String[] P00FN8_A396EmprCod ;
   private int[] P00FN8_A129BarCod ;
   private byte[] P00FN8_A132BarCodReo ;
   private String[] P00FN8_A130BarCodPar ;
   private java.math.BigDecimal[] P00FN8_A227BarUni ;
   private String[] P00FN8_A457FasCod ;
   private boolean[] P00FN8_n457FasCod ;
   private String[] P00FN8_A758ProCod ;
   private short[] P00FN8_A194BarOrdLin ;
   private int[] P00FN10_A252CliCod ;
   private boolean[] P00FN10_n252CliCod ;
   private String[] P00FN10_A966PartCod ;
   private boolean[] P00FN10_n966PartCod ;
   private String[] P00FN10_A396EmprCod ;
   private String[] P00FN10_A2745PartTipP ;
   private boolean[] P00FN10_n2745PartTipP ;
   private String[] P00FN10_A2747PartOpe ;
   private boolean[] P00FN10_n2747PartOpe ;
   private java.math.BigDecimal[] P00FN11_A2738RecPrec ;
   private boolean[] P00FN11_n2738RecPrec ;
   private String[] P00FN11_A457FasCod ;
   private boolean[] P00FN11_n457FasCod ;
   private short[] P00FN11_A2737RecNmR ;
   private boolean[] P00FN11_n2737RecNmR ;
   private short[] P00FN11_A2730RecTipCo ;
   private int[] P00FN11_A252CliCod ;
   private boolean[] P00FN11_n252CliCod ;
   private String[] P00FN11_A396EmprCod ;
   private short[] P00FN11_A2736RecLin2 ;
}

final  class pnewope__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00FN2", "SELECT BarCodPar, BarCodReo, BarCod, AlbProCod, EmprCod, BarAlbKgmE, GuiFasULin FROM TXPALBBAR WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = 0 and BarCodPar = ' ' ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00FN3", "SELECT AlbProCod, EmprCod, GuiFasHorc, GuiFasUsuc, GuiFasFecc, FasPreUnd, FasUnd, GuiFasPB, GuiFasPBM, GuiFasPBK, GuiFasCCo, GuiFasRec, GuiFasDto, GuiFasPre, ArtAdiCod, FasFacMaqC, F_TipPza, FasPreDsM, FasPreDsK, FasCodF, FasMtr, FasKgm, GuiFasPMt, GuiFasPKg, FasCod, GuiFasLin, BarCodPar, BarCodReo, BarCod FROM TXPALBFAS WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = 0 and BarCodPar = ' ' ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00FN4", "INSERT INTO TXPALBFAS(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin, FasCod, GuiFasPKg, GuiFasPMt, FasKgm, FasMtr, FasCodF, FasPreDsK, FasPreDsM, F_TipPza, FasFacMaqC, ArtAdiCod, GuiFasPre, GuiFasDto, GuiFasRec, GuiFasCCo, GuiFasPBK, GuiFasPBM, GuiFasPB, FasUnd, FasPreUnd, GuiFasFecc, GuiFasUsuc, GuiFasHorc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
         ,new UpdateCursor("P00FN5", "UPDATE TXPALBBAR SET GuiFasULin=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new ForEachCursor("P00FN6", "SELECT T1.DisCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarCodTex, T1.BarSer, T1.CliCod, T2.PartCod, T2.TipConCod, T1.BarNumTex2, T1.BarNumTex1 FROM (TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00FN7", "SELECT EmprCod, NumTexCod, NumTexFac, NumTexDI FROM TXPNUMTEX WHERE EmprCod = ? and NumTexCod = ? ORDER BY EmprCod, NumTexCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00FN8", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarUni, FasCod, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00FN9", "UPDATE TXPALBBAR SET GuiFasULin=?  WHERE EmprCod = ? and AlbProCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBBAR")
         ,new ForEachCursor("P00FN10", "SELECT CliCod, PartCod, EmprCod, PartTipP, PartOpe FROM TXPCPARTI WHERE EmprCod = ? and PartCod = ? and CliCod = ? ORDER BY EmprCod, PartCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00FN11", "SELECT RecPrec, FasCod, RecNmR, RecTipCo, CliCod, EmprCod, RecLin2 FROM TXPLRETIT WHERE (EmprCod = ? and RecTipCo = ? and CliCod = ?) AND (RecNmR = ?) AND (FasCod = ?) ORDER BY EmprCod, RecTipCo, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00FN12", "INSERT INTO TXPALBFAS(EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin, FasCod, GuiFasPKg, GuiFasPMt, FasKgm, FasMtr, FasCodF, FasPreDsK, FasPreDsM, F_TipPza, FasFacMaqC, ArtAdiCod, GuiFasPre, GuiFasDto, GuiFasRec, GuiFasCCo, GuiFasPBK, GuiFasPBM, GuiFasPB, FasUnd, FasPreUnd, GuiFasFecc, GuiFasUsuc, GuiFasHorc) VALUES(?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, ' ', ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBFAS")
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
               ((long[]) buf[3])[0] = rslt.getLong(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = GXutil.resetDate(rslt.getGXDateTime(3));
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDate(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,5);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,5);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(12,2);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[19])[0] = rslt.getBigDecimal(14,5);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(15);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(16, 6);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(17);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(18, 40);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(19, 40);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(20, 6);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(21,2);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(23,5);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(24,5);
               ((String[]) buf[37])[0] = rslt.getString(25, 8);
               ((short[]) buf[38])[0] = rslt.getShort(26);
               ((String[]) buf[39])[0] = rslt.getString(27, 1);
               ((byte[]) buf[40])[0] = rslt.getByte(28);
               ((int[]) buf[41])[0] = rslt.getInt(29);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 16);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(11);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((byte[]) buf[16])[0] = rslt.getByte(12);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 8);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               ((short[]) buf[9])[0] = rslt.getShort(7);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 8);
               }
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 5);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[9], 5);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[10], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[11], 2);
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[13], 6);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[15], 40);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[17], 40);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(15, ((Number) parms[19]).shortValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[21], 6);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(17, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(18, (java.math.BigDecimal)parms[25], 5);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(19, (java.math.BigDecimal)parms[27], 2);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(20, (java.math.BigDecimal)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(21, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(22, (java.math.BigDecimal)parms[33], 5);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(23, (java.math.BigDecimal)parms[35], 5);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(24, (java.math.BigDecimal)parms[37], 5);
               }
               stmt.setInt(25, ((Number) parms[38]).intValue());
               stmt.setBigDecimal(26, (java.math.BigDecimal)parms[39], 5);
               stmt.setDate(27, (java.util.Date)parms[40]);
               stmt.setString(28, (String)parms[41], 10);
               stmt.setDateTime(29, (java.util.Date)parms[42], true);
               return;
            case 3 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 4);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[7], 8);
               }
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[8], 5);
               return;
      }
   }

}

