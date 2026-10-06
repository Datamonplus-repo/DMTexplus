package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmodhis extends GXProcedure
{
   public pmodhis( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmodhis.class ), "" );
   }

   public pmodhis( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             int[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             int[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             int[] aP11 ,
                             String[] aP12 )
   {
      pmodhis.this.aP13 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
      return aP13[0];
   }

   public void execute( String[] aP0 ,
                        long[] aP1 ,
                        int[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        java.math.BigDecimal[] aP4 ,
                        int[] aP5 ,
                        java.math.BigDecimal[] aP6 ,
                        java.math.BigDecimal[] aP7 ,
                        int[] aP8 ,
                        String[] aP9 ,
                        String[] aP10 ,
                        int[] aP11 ,
                        String[] aP12 ,
                        String[] aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String[] aP0 ,
                             long[] aP1 ,
                             int[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             java.math.BigDecimal[] aP4 ,
                             int[] aP5 ,
                             java.math.BigDecimal[] aP6 ,
                             java.math.BigDecimal[] aP7 ,
                             int[] aP8 ,
                             String[] aP9 ,
                             String[] aP10 ,
                             int[] aP11 ,
                             String[] aP12 ,
                             String[] aP13 )
   {
      pmodhis.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmodhis.this.AV15HisEmpAlbD = aP1[0];
      this.aP1 = aP1;
      pmodhis.this.AV16AlbRecCod = aP2[0];
      this.aP2 = aP2;
      pmodhis.this.AV17Kilos = aP3[0];
      this.aP3 = aP3;
      pmodhis.this.AV18Metros = aP4[0];
      this.aP4 = aP4;
      pmodhis.this.AV19Piezas = aP5[0];
      this.aP5 = aP5;
      pmodhis.this.AV20KilAnt = aP6[0];
      this.aP6 = aP6;
      pmodhis.this.AV21MetAnt = aP7[0];
      this.aP7 = aP7;
      pmodhis.this.AV22PieAnt = aP8[0];
      this.aP8 = aP8;
      pmodhis.this.AV23HisEmpLTip = aP9[0];
      this.aP9 = aP9;
      pmodhis.this.AV24DisColNom = aP10[0];
      this.aP10 = aP10;
      pmodhis.this.AV25DisColNum = aP11[0];
      this.aP11 = aP11;
      pmodhis.this.AV26Modo = aP12[0];
      this.aP12 = aP12;
      pmodhis.this.AV27CodALb = aP13[0];
      this.aP13 = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P00CJ2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(AV15HisEmpAlbD)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A361DisCod = P00CJ2_A361DisCod[0] ;
         A392DisUniMed = P00CJ2_A392DisUniMed[0] ;
         AV33DisUniMed = A392DisUniMed ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV23HisEmpLTip, httpContext.getMessage( "B", "")) == 0 )
      {
         AV31DisColN = GXutil.str( AV25DisColNum, 6, 0) ;
      }
      /* Using cursor P00CJ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV16AlbRecCod), AV23HisEmpLTip, Long.valueOf(AV15HisEmpAlbD)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A2160HisEmpAlbD = P00CJ3_A2160HisEmpAlbD[0] ;
         n2160HisEmpAlbD = P00CJ3_n2160HisEmpAlbD[0] ;
         A2166HisEmpLTip = P00CJ3_A2166HisEmpLTip[0] ;
         n2166HisEmpLTip = P00CJ3_n2166HisEmpLTip[0] ;
         A44AlbRecCod = P00CJ3_A44AlbRecCod[0] ;
         A2165HisEmpLin = P00CJ3_A2165HisEmpLin[0] ;
         if ( GXutil.strcmp(AV26Modo, httpContext.getMessage( "INS", "")) == 0 )
         {
            AV26Modo = httpContext.getMessage( "UPD", "") ;
            AV22PieAnt = 0 ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      /* Using cursor P00CJ4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV16AlbRecCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A44AlbRecCod = P00CJ4_A44AlbRecCod[0] ;
         A2165HisEmpLin = P00CJ4_A2165HisEmpLin[0] ;
         AV30UltLin = A2165HisEmpLin ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV30UltLin = (short)(AV30UltLin+1) ;
      if ( GXutil.strcmp(AV26Modo, httpContext.getMessage( "INS", "")) == 0 )
      {
         /*
            INSERT RECORD ON TABLE TXPHISEMP

         */
         A44AlbRecCod = AV16AlbRecCod ;
         A2165HisEmpLin = AV30UltLin ;
         A2166HisEmpLTip = AV23HisEmpLTip ;
         n2166HisEmpLTip = false ;
         A2160HisEmpAlbD = AV15HisEmpAlbD ;
         n2160HisEmpAlbD = false ;
         A2161HisEmpFMov = GXutil.today( ) ;
         n2161HisEmpFMov = false ;
         if ( GXutil.strcmp(AV23HisEmpLTip, httpContext.getMessage( "B", "")) == 0 )
         {
            A2173HisEmpSd = GXutil.concat( AV24DisColNom, AV31DisColN, " / ") ;
            n2173HisEmpSd = false ;
         }
         else
         {
            if ( GXutil.strcmp(AV23HisEmpLTip, httpContext.getMessage( "D", "")) == 0 )
            {
               A2173HisEmpSd = httpContext.getMessage( "DEVOLUCION GENERO", "") ;
               n2173HisEmpSd = false ;
            }
            else
            {
               if ( GXutil.strcmp(AV23HisEmpLTip, httpContext.getMessage( "S", "")) == 0 )
               {
                  A2173HisEmpSd = GXutil.concat( httpContext.getMessage( "SALIDA", ""), AV27CodALb, "-") ;
                  n2173HisEmpSd = false ;
               }
            }
         }
         A2164HisEmpKu = AV17Kilos ;
         n2164HisEmpKu = false ;
         A2169HisEmpMu = AV18Metros ;
         n2169HisEmpMu = false ;
         A2172HisEmpPu = (short)(AV19Piezas) ;
         n2172HisEmpPu = false ;
         /* Using cursor P00CJ5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), Short.valueOf(A2165HisEmpLin), Boolean.valueOf(n2166HisEmpLTip), A2166HisEmpLTip, Boolean.valueOf(n2160HisEmpAlbD), Long.valueOf(A2160HisEmpAlbD), Boolean.valueOf(n2161HisEmpFMov), A2161HisEmpFMov, Boolean.valueOf(n2173HisEmpSd), A2173HisEmpSd, Boolean.valueOf(n2164HisEmpKu), A2164HisEmpKu, Boolean.valueOf(n2169HisEmpMu), A2169HisEmpMu, Boolean.valueOf(n2172HisEmpPu), Short.valueOf(A2172HisEmpPu)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISEMP");
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
         /* End Insert */
         n2183HisEmpULin = false ;
         /* Optimized UPDATE. */
         /* Using cursor P00CJ6 */
         pr_default.execute(4, new Object[] {Boolean.valueOf(n2183HisEmpULin), Short.valueOf(AV30UltLin), A396EmprCod, Integer.valueOf(AV16AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* End optimized UPDATE. */
      }
      if ( GXutil.strcmp(AV26Modo, httpContext.getMessage( "UPD", "")) == 0 )
      {
         n2172HisEmpPu = false ;
         n2169HisEmpMu = false ;
         n2164HisEmpKu = false ;
         /* Optimized UPDATE. */
         /* Using cursor P00CJ7 */
         pr_default.execute(5, new Object[] {Integer.valueOf(AV19Piezas), Integer.valueOf(AV22PieAnt), AV18Metros, AV21MetAnt, AV17Kilos, AV20KilAnt, A396EmprCod, Integer.valueOf(AV16AlbRecCod), AV23HisEmpLTip, Long.valueOf(AV15HisEmpAlbD)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISEMP");
         /* End optimized UPDATE. */
      }
      if ( GXutil.strcmp(AV26Modo, httpContext.getMessage( "DEL", "")) == 0 )
      {
         /* Using cursor P00CJ8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(AV16AlbRecCod), AV23HisEmpLTip, Long.valueOf(AV15HisEmpAlbD)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A2160HisEmpAlbD = P00CJ8_A2160HisEmpAlbD[0] ;
            n2160HisEmpAlbD = P00CJ8_n2160HisEmpAlbD[0] ;
            A2166HisEmpLTip = P00CJ8_A2166HisEmpLTip[0] ;
            n2166HisEmpLTip = P00CJ8_n2166HisEmpLTip[0] ;
            A44AlbRecCod = P00CJ8_A44AlbRecCod[0] ;
            A2164HisEmpKu = P00CJ8_A2164HisEmpKu[0] ;
            n2164HisEmpKu = P00CJ8_n2164HisEmpKu[0] ;
            A2169HisEmpMu = P00CJ8_A2169HisEmpMu[0] ;
            n2169HisEmpMu = P00CJ8_n2169HisEmpMu[0] ;
            A2172HisEmpPu = P00CJ8_A2172HisEmpPu[0] ;
            n2172HisEmpPu = P00CJ8_n2172HisEmpPu[0] ;
            A56AlbRUni = P00CJ8_A56AlbRUni[0] ;
            A2165HisEmpLin = P00CJ8_A2165HisEmpLin[0] ;
            A56AlbRUni = P00CJ8_A56AlbRUni[0] ;
            A2164HisEmpKu = A2164HisEmpKu.subtract(AV17Kilos) ;
            n2164HisEmpKu = false ;
            A2169HisEmpMu = A2169HisEmpMu.subtract(AV18Metros) ;
            n2169HisEmpMu = false ;
            A2172HisEmpPu = (short)(A2172HisEmpPu-AV19Piezas) ;
            n2172HisEmpPu = false ;
            if ( (GXutil.strcmp("", AV33DisUniMed)==0) )
            {
               AV33DisUniMed = A56AlbRUni ;
            }
            if ( GXutil.strcmp(AV33DisUniMed, httpContext.getMessage( "M", "")) == 0 )
            {
               if ( ( A2169HisEmpMu.doubleValue() == 0 ) && ( A2172HisEmpPu == 0 ) )
               {
                  /* Using cursor P00CJ9 */
                  pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), Short.valueOf(A2165HisEmpLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISEMP");
               }
            }
            if ( GXutil.strcmp(AV33DisUniMed, httpContext.getMessage( "K", "")) == 0 )
            {
               if ( ( A2164HisEmpKu.doubleValue() == 0 ) && ( A2172HisEmpPu == 0 ) )
               {
                  /* Using cursor P00CJ10 */
                  pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod), Short.valueOf(A2165HisEmpLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISEMP");
               }
            }
            /* Using cursor P00CJ11 */
            pr_default.execute(9, new Object[] {Boolean.valueOf(n2164HisEmpKu), A2164HisEmpKu, Boolean.valueOf(n2169HisEmpMu), A2169HisEmpMu, Boolean.valueOf(n2172HisEmpPu), Short.valueOf(A2172HisEmpPu), A396EmprCod, Integer.valueOf(A44AlbRecCod), Short.valueOf(A2165HisEmpLin)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHISEMP");
            pr_default.readNext(6);
         }
         pr_default.close(6);
      }
      /* Using cursor P00CJ12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(AV16AlbRecCod)});
      while ( (pr_default.getStatus(10) != 101) )
      {
         A44AlbRecCod = P00CJ12_A44AlbRecCod[0] ;
         A56AlbRUni = P00CJ12_A56AlbRUni[0] ;
         A60AlbRUniUti = P00CJ12_A60AlbRUniUti[0] ;
         A54AlbRPieUti = P00CJ12_A54AlbRPieUti[0] ;
         A47AlbREst = P00CJ12_A47AlbREst[0] ;
         A48AlbRFecUlt = P00CJ12_A48AlbRFecUlt[0] ;
         AV34AlbUni = A56AlbRUni ;
         AV35KgsE = DecimalUtil.doubleToDec(0) ;
         AV36KgsU = DecimalUtil.doubleToDec(0) ;
         AV37MtsE = DecimalUtil.doubleToDec(0) ;
         AV40MtsU = DecimalUtil.doubleToDec(0) ;
         AV38PzasE = (short)(0) ;
         AV39PzasU = (short)(0) ;
         /* Using cursor P00CJ13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         while ( (pr_default.getStatus(11) != 101) )
         {
            A2163HisEmpKe = P00CJ13_A2163HisEmpKe[0] ;
            n2163HisEmpKe = P00CJ13_n2163HisEmpKe[0] ;
            A2166HisEmpLTip = P00CJ13_A2166HisEmpLTip[0] ;
            n2166HisEmpLTip = P00CJ13_n2166HisEmpLTip[0] ;
            A2164HisEmpKu = P00CJ13_A2164HisEmpKu[0] ;
            n2164HisEmpKu = P00CJ13_n2164HisEmpKu[0] ;
            A2168HisEmpMe = P00CJ13_A2168HisEmpMe[0] ;
            n2168HisEmpMe = P00CJ13_n2168HisEmpMe[0] ;
            A2169HisEmpMu = P00CJ13_A2169HisEmpMu[0] ;
            n2169HisEmpMu = P00CJ13_n2169HisEmpMu[0] ;
            A2171HisEmpPe = P00CJ13_A2171HisEmpPe[0] ;
            n2171HisEmpPe = P00CJ13_n2171HisEmpPe[0] ;
            A2172HisEmpPu = P00CJ13_A2172HisEmpPu[0] ;
            n2172HisEmpPu = P00CJ13_n2172HisEmpPu[0] ;
            A2165HisEmpLin = P00CJ13_A2165HisEmpLin[0] ;
            if ( GXutil.strcmp(AV34AlbUni, httpContext.getMessage( "K", "")) == 0 )
            {
               AV35KgsE = AV35KgsE.add(A2163HisEmpKe) ;
               if ( ( GXutil.strcmp(A2166HisEmpLTip, httpContext.getMessage( "B", "")) == 0 ) || ( GXutil.strcmp(A2166HisEmpLTip, httpContext.getMessage( "D", "")) == 0 ) )
               {
                  AV36KgsU = AV36KgsU.add(A2164HisEmpKu) ;
               }
            }
            if ( GXutil.strcmp(AV34AlbUni, httpContext.getMessage( "M", "")) == 0 )
            {
               AV37MtsE = AV37MtsE.add(A2168HisEmpMe) ;
               if ( ( GXutil.strcmp(A2166HisEmpLTip, httpContext.getMessage( "B", "")) == 0 ) || ( GXutil.strcmp(A2166HisEmpLTip, httpContext.getMessage( "D", "")) == 0 ) )
               {
                  AV40MtsU = AV40MtsU.add(A2169HisEmpMu) ;
               }
            }
            AV38PzasE = (short)(AV38PzasE+A2171HisEmpPe) ;
            if ( ( GXutil.strcmp(A2166HisEmpLTip, httpContext.getMessage( "B", "")) == 0 ) || ( GXutil.strcmp(A2166HisEmpLTip, httpContext.getMessage( "D", "")) == 0 ) )
            {
               AV39PzasU = (short)(AV39PzasU+A2172HisEmpPu) ;
            }
            pr_default.readNext(11);
         }
         pr_default.close(11);
         if ( GXutil.strcmp(AV34AlbUni, httpContext.getMessage( "M", "")) == 0 )
         {
            AV41Stock = AV37MtsE.subtract(AV40MtsU) ;
            A60AlbRUniUti = AV40MtsU ;
         }
         if ( GXutil.strcmp(AV34AlbUni, httpContext.getMessage( "K", "")) == 0 )
         {
            AV41Stock = AV35KgsE.subtract(AV36KgsU) ;
            A60AlbRUniUti = AV36KgsU ;
         }
         A54AlbRPieUti = AV39PzasU ;
         A47AlbREst = (byte)(0) ;
         if ( AV41Stock.doubleValue() <= 0 )
         {
            A47AlbREst = (byte)(1) ;
         }
         A48AlbRFecUlt = GXutil.today( ) ;
         /* Using cursor P00CJ14 */
         pr_default.execute(12, new Object[] {A60AlbRUniUti, Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A48AlbRFecUlt, A396EmprCod, Integer.valueOf(A44AlbRecCod)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(10);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmodhis.this.A396EmprCod;
      this.aP1[0] = pmodhis.this.AV15HisEmpAlbD;
      this.aP2[0] = pmodhis.this.AV16AlbRecCod;
      this.aP3[0] = pmodhis.this.AV17Kilos;
      this.aP4[0] = pmodhis.this.AV18Metros;
      this.aP5[0] = pmodhis.this.AV19Piezas;
      this.aP6[0] = pmodhis.this.AV20KilAnt;
      this.aP7[0] = pmodhis.this.AV21MetAnt;
      this.aP8[0] = pmodhis.this.AV22PieAnt;
      this.aP9[0] = pmodhis.this.AV23HisEmpLTip;
      this.aP10[0] = pmodhis.this.AV24DisColNom;
      this.aP11[0] = pmodhis.this.AV25DisColNum;
      this.aP12[0] = pmodhis.this.AV26Modo;
      this.aP13[0] = pmodhis.this.AV27CodALb;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmodhis");
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
      P00CJ2_A396EmprCod = new String[] {""} ;
      P00CJ2_A361DisCod = new int[1] ;
      P00CJ2_A392DisUniMed = new String[] {""} ;
      A392DisUniMed = "" ;
      AV33DisUniMed = "" ;
      AV31DisColN = "" ;
      P00CJ3_A396EmprCod = new String[] {""} ;
      P00CJ3_A2160HisEmpAlbD = new long[1] ;
      P00CJ3_n2160HisEmpAlbD = new boolean[] {false} ;
      P00CJ3_A2166HisEmpLTip = new String[] {""} ;
      P00CJ3_n2166HisEmpLTip = new boolean[] {false} ;
      P00CJ3_A44AlbRecCod = new int[1] ;
      P00CJ3_A2165HisEmpLin = new short[1] ;
      A2166HisEmpLTip = "" ;
      P00CJ4_A396EmprCod = new String[] {""} ;
      P00CJ4_A44AlbRecCod = new int[1] ;
      P00CJ4_A2165HisEmpLin = new short[1] ;
      A2161HisEmpFMov = GXutil.nullDate() ;
      A2173HisEmpSd = "" ;
      A2164HisEmpKu = DecimalUtil.ZERO ;
      A2169HisEmpMu = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      P00CJ8_A396EmprCod = new String[] {""} ;
      P00CJ8_A2160HisEmpAlbD = new long[1] ;
      P00CJ8_n2160HisEmpAlbD = new boolean[] {false} ;
      P00CJ8_A2166HisEmpLTip = new String[] {""} ;
      P00CJ8_n2166HisEmpLTip = new boolean[] {false} ;
      P00CJ8_A44AlbRecCod = new int[1] ;
      P00CJ8_A2164HisEmpKu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CJ8_n2164HisEmpKu = new boolean[] {false} ;
      P00CJ8_A2169HisEmpMu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CJ8_n2169HisEmpMu = new boolean[] {false} ;
      P00CJ8_A2172HisEmpPu = new short[1] ;
      P00CJ8_n2172HisEmpPu = new boolean[] {false} ;
      P00CJ8_A56AlbRUni = new String[] {""} ;
      P00CJ8_A2165HisEmpLin = new short[1] ;
      A56AlbRUni = "" ;
      P00CJ12_A396EmprCod = new String[] {""} ;
      P00CJ12_A44AlbRecCod = new int[1] ;
      P00CJ12_A56AlbRUni = new String[] {""} ;
      P00CJ12_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CJ12_A54AlbRPieUti = new int[1] ;
      P00CJ12_A47AlbREst = new byte[1] ;
      P00CJ12_A48AlbRFecUlt = new java.util.Date[] {GXutil.nullDate()} ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A48AlbRFecUlt = GXutil.nullDate() ;
      AV34AlbUni = "" ;
      AV35KgsE = DecimalUtil.ZERO ;
      AV36KgsU = DecimalUtil.ZERO ;
      AV37MtsE = DecimalUtil.ZERO ;
      AV40MtsU = DecimalUtil.ZERO ;
      P00CJ13_A396EmprCod = new String[] {""} ;
      P00CJ13_A44AlbRecCod = new int[1] ;
      P00CJ13_A2163HisEmpKe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CJ13_n2163HisEmpKe = new boolean[] {false} ;
      P00CJ13_A2166HisEmpLTip = new String[] {""} ;
      P00CJ13_n2166HisEmpLTip = new boolean[] {false} ;
      P00CJ13_A2164HisEmpKu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CJ13_n2164HisEmpKu = new boolean[] {false} ;
      P00CJ13_A2168HisEmpMe = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CJ13_n2168HisEmpMe = new boolean[] {false} ;
      P00CJ13_A2169HisEmpMu = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P00CJ13_n2169HisEmpMu = new boolean[] {false} ;
      P00CJ13_A2171HisEmpPe = new short[1] ;
      P00CJ13_n2171HisEmpPe = new boolean[] {false} ;
      P00CJ13_A2172HisEmpPu = new short[1] ;
      P00CJ13_n2172HisEmpPu = new boolean[] {false} ;
      P00CJ13_A2165HisEmpLin = new short[1] ;
      A2163HisEmpKe = DecimalUtil.ZERO ;
      A2168HisEmpMe = DecimalUtil.ZERO ;
      AV41Stock = DecimalUtil.ZERO ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmodhis__default(),
         new Object[] {
             new Object[] {
            P00CJ2_A396EmprCod, P00CJ2_A361DisCod, P00CJ2_A392DisUniMed
            }
            , new Object[] {
            P00CJ3_A396EmprCod, P00CJ3_A2160HisEmpAlbD, P00CJ3_n2160HisEmpAlbD, P00CJ3_A2166HisEmpLTip, P00CJ3_n2166HisEmpLTip, P00CJ3_A44AlbRecCod, P00CJ3_A2165HisEmpLin
            }
            , new Object[] {
            P00CJ4_A396EmprCod, P00CJ4_A44AlbRecCod, P00CJ4_A2165HisEmpLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00CJ8_A396EmprCod, P00CJ8_A2160HisEmpAlbD, P00CJ8_n2160HisEmpAlbD, P00CJ8_A2166HisEmpLTip, P00CJ8_n2166HisEmpLTip, P00CJ8_A44AlbRecCod, P00CJ8_A2164HisEmpKu, P00CJ8_n2164HisEmpKu, P00CJ8_A2169HisEmpMu, P00CJ8_n2169HisEmpMu,
            P00CJ8_A2172HisEmpPu, P00CJ8_n2172HisEmpPu, P00CJ8_A56AlbRUni, P00CJ8_A2165HisEmpLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00CJ12_A396EmprCod, P00CJ12_A44AlbRecCod, P00CJ12_A56AlbRUni, P00CJ12_A60AlbRUniUti, P00CJ12_A54AlbRPieUti, P00CJ12_A47AlbREst, P00CJ12_A48AlbRFecUlt
            }
            , new Object[] {
            P00CJ13_A396EmprCod, P00CJ13_A44AlbRecCod, P00CJ13_A2163HisEmpKe, P00CJ13_n2163HisEmpKe, P00CJ13_A2166HisEmpLTip, P00CJ13_n2166HisEmpLTip, P00CJ13_A2164HisEmpKu, P00CJ13_n2164HisEmpKu, P00CJ13_A2168HisEmpMe, P00CJ13_n2168HisEmpMe,
            P00CJ13_A2169HisEmpMu, P00CJ13_n2169HisEmpMu, P00CJ13_A2171HisEmpPe, P00CJ13_n2171HisEmpPe, P00CJ13_A2172HisEmpPu, P00CJ13_n2172HisEmpPu, P00CJ13_A2165HisEmpLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A47AlbREst ;
   private short A2165HisEmpLin ;
   private short AV30UltLin ;
   private short A2172HisEmpPu ;
   private short Gx_err ;
   private short A2183HisEmpULin ;
   private short AV38PzasE ;
   private short AV39PzasU ;
   private short A2171HisEmpPe ;
   private int AV16AlbRecCod ;
   private int AV19Piezas ;
   private int AV22PieAnt ;
   private int AV25DisColNum ;
   private int A361DisCod ;
   private int A44AlbRecCod ;
   private int GX_INS298 ;
   private int A54AlbRPieUti ;
   private long AV15HisEmpAlbD ;
   private long A2160HisEmpAlbD ;
   private java.math.BigDecimal AV17Kilos ;
   private java.math.BigDecimal AV18Metros ;
   private java.math.BigDecimal AV20KilAnt ;
   private java.math.BigDecimal AV21MetAnt ;
   private java.math.BigDecimal A2164HisEmpKu ;
   private java.math.BigDecimal A2169HisEmpMu ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal AV35KgsE ;
   private java.math.BigDecimal AV36KgsU ;
   private java.math.BigDecimal AV37MtsE ;
   private java.math.BigDecimal AV40MtsU ;
   private java.math.BigDecimal A2163HisEmpKe ;
   private java.math.BigDecimal A2168HisEmpMe ;
   private java.math.BigDecimal AV41Stock ;
   private String A396EmprCod ;
   private String AV23HisEmpLTip ;
   private String AV24DisColNom ;
   private String AV26Modo ;
   private String AV27CodALb ;
   private String scmdbuf ;
   private String A392DisUniMed ;
   private String AV33DisUniMed ;
   private String AV31DisColN ;
   private String A2166HisEmpLTip ;
   private String A2173HisEmpSd ;
   private String Gx_emsg ;
   private String A56AlbRUni ;
   private String AV34AlbUni ;
   private java.util.Date A2161HisEmpFMov ;
   private java.util.Date A48AlbRFecUlt ;
   private boolean n2160HisEmpAlbD ;
   private boolean n2166HisEmpLTip ;
   private boolean n2161HisEmpFMov ;
   private boolean n2173HisEmpSd ;
   private boolean n2164HisEmpKu ;
   private boolean n2169HisEmpMu ;
   private boolean n2172HisEmpPu ;
   private boolean n2183HisEmpULin ;
   private boolean n2163HisEmpKe ;
   private boolean n2168HisEmpMe ;
   private boolean n2171HisEmpPe ;
   private String[] aP13 ;
   private String[] aP0 ;
   private long[] aP1 ;
   private int[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private java.math.BigDecimal[] aP4 ;
   private int[] aP5 ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP7 ;
   private int[] aP8 ;
   private String[] aP9 ;
   private String[] aP10 ;
   private int[] aP11 ;
   private String[] aP12 ;
   private IDataStoreProvider pr_default ;
   private String[] P00CJ2_A396EmprCod ;
   private int[] P00CJ2_A361DisCod ;
   private String[] P00CJ2_A392DisUniMed ;
   private String[] P00CJ3_A396EmprCod ;
   private long[] P00CJ3_A2160HisEmpAlbD ;
   private boolean[] P00CJ3_n2160HisEmpAlbD ;
   private String[] P00CJ3_A2166HisEmpLTip ;
   private boolean[] P00CJ3_n2166HisEmpLTip ;
   private int[] P00CJ3_A44AlbRecCod ;
   private short[] P00CJ3_A2165HisEmpLin ;
   private String[] P00CJ4_A396EmprCod ;
   private int[] P00CJ4_A44AlbRecCod ;
   private short[] P00CJ4_A2165HisEmpLin ;
   private String[] P00CJ8_A396EmprCod ;
   private long[] P00CJ8_A2160HisEmpAlbD ;
   private boolean[] P00CJ8_n2160HisEmpAlbD ;
   private String[] P00CJ8_A2166HisEmpLTip ;
   private boolean[] P00CJ8_n2166HisEmpLTip ;
   private int[] P00CJ8_A44AlbRecCod ;
   private java.math.BigDecimal[] P00CJ8_A2164HisEmpKu ;
   private boolean[] P00CJ8_n2164HisEmpKu ;
   private java.math.BigDecimal[] P00CJ8_A2169HisEmpMu ;
   private boolean[] P00CJ8_n2169HisEmpMu ;
   private short[] P00CJ8_A2172HisEmpPu ;
   private boolean[] P00CJ8_n2172HisEmpPu ;
   private String[] P00CJ8_A56AlbRUni ;
   private short[] P00CJ8_A2165HisEmpLin ;
   private String[] P00CJ12_A396EmprCod ;
   private int[] P00CJ12_A44AlbRecCod ;
   private String[] P00CJ12_A56AlbRUni ;
   private java.math.BigDecimal[] P00CJ12_A60AlbRUniUti ;
   private int[] P00CJ12_A54AlbRPieUti ;
   private byte[] P00CJ12_A47AlbREst ;
   private java.util.Date[] P00CJ12_A48AlbRFecUlt ;
   private String[] P00CJ13_A396EmprCod ;
   private int[] P00CJ13_A44AlbRecCod ;
   private java.math.BigDecimal[] P00CJ13_A2163HisEmpKe ;
   private boolean[] P00CJ13_n2163HisEmpKe ;
   private String[] P00CJ13_A2166HisEmpLTip ;
   private boolean[] P00CJ13_n2166HisEmpLTip ;
   private java.math.BigDecimal[] P00CJ13_A2164HisEmpKu ;
   private boolean[] P00CJ13_n2164HisEmpKu ;
   private java.math.BigDecimal[] P00CJ13_A2168HisEmpMe ;
   private boolean[] P00CJ13_n2168HisEmpMe ;
   private java.math.BigDecimal[] P00CJ13_A2169HisEmpMu ;
   private boolean[] P00CJ13_n2169HisEmpMu ;
   private short[] P00CJ13_A2171HisEmpPe ;
   private boolean[] P00CJ13_n2171HisEmpPe ;
   private short[] P00CJ13_A2172HisEmpPu ;
   private boolean[] P00CJ13_n2172HisEmpPu ;
   private short[] P00CJ13_A2165HisEmpLin ;
}

final  class pmodhis__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00CJ2", "SELECT EmprCod, DisCod, DisUniMed FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00CJ3", "SELECT EmprCod, HisEmpAlbD, HisEmpLTip, AlbRecCod, HisEmpLin FROM TXPHISEMP WHERE (EmprCod = ? and AlbRecCod = ?) AND (HisEmpLTip = ?) AND (HisEmpAlbD = ?) ORDER BY EmprCod, AlbRecCod, HisEmpLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00CJ4", "SELECT EmprCod, AlbRecCod, HisEmpLin FROM TXPHISEMP WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod, HisEmpLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00CJ5", "INSERT INTO TXPHISEMP(EmprCod, AlbRecCod, HisEmpLin, HisEmpLTip, HisEmpAlbD, HisEmpFMov, HisEmpSd, HisEmpKu, HisEmpMu, HisEmpPu, HisEmpKe, HisEmpMe, HisEmpPe) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISEMP")
         ,new UpdateCursor("P00CJ6", "UPDATE TXPALBREC SET HisEmpULin=?  WHERE EmprCod = ? and AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
         ,new UpdateCursor("P00CJ7", "UPDATE TXPHISEMP SET HisEmpPu=HisEmpPu + ? - ?, HisEmpMu=HisEmpMu + ? - ?, HisEmpKu=HisEmpKu + ? - ?  WHERE (EmprCod = ? and AlbRecCod = ?) AND (HisEmpLTip = ?) AND (HisEmpAlbD = ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISEMP")
         ,new ForEachCursor("P00CJ8", "SELECT T1.EmprCod, T1.HisEmpAlbD, T1.HisEmpLTip, T1.AlbRecCod, T1.HisEmpKu, T1.HisEmpMu, T1.HisEmpPu, T2.AlbRUni, T1.HisEmpLin FROM (TXPHISEMP T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod) WHERE (T1.EmprCod = ? and T1.AlbRecCod = ?) AND (T1.HisEmpLTip = ?) AND (T1.HisEmpAlbD = ?) ORDER BY T1.EmprCod, T1.AlbRecCod, T1.HisEmpLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00CJ9", "DELETE FROM TXPHISEMP  WHERE EmprCod = ? AND AlbRecCod = ? AND HisEmpLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISEMP")
         ,new UpdateCursor("P00CJ10", "DELETE FROM TXPHISEMP  WHERE EmprCod = ? AND AlbRecCod = ? AND HisEmpLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISEMP")
         ,new UpdateCursor("P00CJ11", "UPDATE TXPHISEMP SET HisEmpKu=?, HisEmpMu=?, HisEmpPu=?  WHERE EmprCod = ? AND AlbRecCod = ? AND HisEmpLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHISEMP")
         ,new ForEachCursor("P00CJ12", "SELECT EmprCod, AlbRecCod, AlbRUni, AlbRUniUti, AlbRPieUti, AlbREst, AlbRFecUlt FROM TXPALBREC WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00CJ13", "SELECT EmprCod, AlbRecCod, HisEmpKe, HisEmpLTip, HisEmpKu, HisEmpMe, HisEmpMu, HisEmpPe, HisEmpPu, HisEmpLin FROM TXPHISEMP WHERE EmprCod = ? and AlbRecCod = ? ORDER BY EmprCod, AlbRecCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P00CJ14", "UPDATE TXPALBREC SET AlbRUniUti=?, AlbRPieUti=?, AlbREst=?, AlbRFecUlt=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPALBREC")
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((short[]) buf[6])[0] = rslt.getShort(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 1);
               ((short[]) buf[13])[0] = rslt.getShort(9);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(6,2);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(7,2);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 1);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(5, ((Number) parms[6]).longValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[8]);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[10], 20);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(9, (java.math.BigDecimal)parms[14], 2);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[16]).shortValue());
               }
               return;
            case 4 :
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
               return;
            case 5 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 2);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setString(7, (String)parms[6], 3);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setLong(10, ((Number) parms[9]).longValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setShort(6, ((Number) parms[8]).shortValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
      }
   }

}

